package com.frameium.runner;

import com.frameium.listener.RetryAnalyzer;
import com.frameium.stepdef.Hooks;
import cucumber.annotation.After;
import io.cucumber.java.Scenario;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import static com.frameium.genericfunctions.GenericFunctions.getConfigProperty;

@CucumberOptions(
	    features = {
	        "src/test/resources/Features/UFS/T24_Payments.feature",
	        "src/test/resources/Features/UFS/IBPayments.feature",
	       "src/test/resources/Features/UFS/T24_Loan.feature",
	       "src/test/resources/Features/UFS/T24_Deposit.feature",
	       "src/test/resources/Features/UFS/T24_Account.feature",
	        "src/test/resources/Features/UFS/EnvironmentHealthCheckup.feature"
	    },
	    glue = {"com.frameium.stepdef"},
	    tags = "@environmentalcheckup",
	    dryRun = false,
	    monochrome = true,
	    plugin = {
	        "pretty",
	        "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm",
	        "json:target/cucumber-reports/Cucumber.json",
	        "html:target/cucumber-reports/Cucumber.html",
	        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
	    },
	    publish = true
	)

                //,plugin = { "pretty", "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm","com.frameium.reportportal.attributes.CustomAttributeReporter","json:target/cucumber-reports/Cucumber.json","html:target/cucumber-reports/Cucumber.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }

public class TestRunnerUFSS extends Hooks {

    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void setUpClass() {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
    @SuppressWarnings("unused")
    @Test(groups = "cucumber", description = "Runs Cucumber Scenarios", dataProvider = "scenarios",retryAnalyzer = RetryAnalyzer.class)
    public void runScenario(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) {
        // the 'featureWrapper' parameter solely exists to display the feature
        // file in a test report
        testNGCucumberRunner.runScenario(pickleWrapper.getPickle());
    }

    /**
     * Returns two dimensional array of {@link PickleWrapper}s with their
     * associated {@link FeatureWrapper}s.
     *
     * @return a two dimensional array of scenarios features.
     */
    @DataProvider
    public Object[][] scenarios() {
        if (testNGCucumberRunner == null) {
            return new Object[0][0];
        }
        return testNGCucumberRunner.provideScenarios();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        if (testNGCucumberRunner == null) {
            return;
        }
        testNGCucumberRunner.finish();
    }


    String platform  = "";
    @BeforeSuite
    public void cleanUpForJenkins() throws IOException {
       String pathofAllureReportGenerate= System.getProperty("user.dir")+"\\allure-report-generate";
        String pathofAllureReportresults= System.getProperty("user.dir")+"\\allure-results";
        String pathofExtentesults= System.getProperty("user.dir")+"\\ExtentReportsnew";
       clearDirectory(new File(pathofAllureReportGenerate));
        clearDirectory(new File(pathofAllureReportresults));
        clearDirectory(new File(pathofExtentesults));
        System.out.println("Directory cleared successfully.");
        copyfile();
        platform = getConfigProperty("run.machine");
        if(platform.equalsIgnoreCase("jenkins")){
            // Delete TestReport folder before running tests
            String destination = System.getProperty("user.dir")+ "\\test-output\\TestReport";
            System.out.println("destination "+ destination);
            File file = new File(destination);
            deleteFilesAndFolders(file);
        }
    }
    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            Hooks hooks = new Hooks();
         takeScreenshot(scenario);
         setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        }
    }



    public static void clearDirectory(File directory) throws IOException {
        if (directory.exists() && directory.isDirectory()) {
            // Get all files and directories in the folder
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        // Recursively clear subdirectories
                        clearDirectory(file);
                    }
                    // Delete files and empty directories
                    Files.delete(file.toPath());
                }
            }
        } else {
            throw new IllegalArgumentException("The provided path is not a directory or does not exist.");
        }
    }



    @AfterSuite
    public void zipTestReportForJenkins(){

        if(platform.equalsIgnoreCase("jenkins")) {

            String sourceFolderPath = System.getProperty("user.dir") + "\\test-output\\TestReport";

            File sourceParentZip = new File(System.getProperty("user.dir") + "\\TestReport");
            sourceParentZip.mkdir();

            SimpleDateFormat startDateTime = new SimpleDateFormat("MM-d-yyyy_HH-mm-ss");
            System.out.println(startDateTime);
            Date date = Calendar.getInstance().getTime();
            DateFormat dateFormat = new SimpleDateFormat("MM_d-yyyy_HH_mm_ss");
            String strDate = dateFormat.format(date);

            String zipFilePath = System.getProperty("user.dir") + "\\TestReport\\ExtentReport_" + strDate + ".zip";
            System.out.println("zipFilePath >>> "+ zipFilePath);


            try {
                zipFolder(sourceFolderPath, zipFilePath);
                System.out.println("Folder zipped successfully.");
            } catch (Exception e) {
                System.out.println("Error zipping folder: " + e.getMessage());
            }
        }

    }

    public static void deleteFiles(File dirPath) {

        try {
            File filesList[] = dirPath.listFiles();

            if(filesList.length > 0){
                for(File file : filesList) {
                    if(file.isFile() && !file.getName().equals(".ingore")) {
                        file.delete();
                    } else {
                        deleteFiles(file);
                    }
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }


    public static void zipFolder(String sourceFolderPath, String zipFilePath) throws IOException {
        FileOutputStream fos = new FileOutputStream(zipFilePath);
        ZipOutputStream zos = new ZipOutputStream(fos);
        File sourceFolder = new File(sourceFolderPath);
        zipFile(sourceFolder, sourceFolder.getName(), zos);
        zos.close();
        fos.close();
    }

    public static void deleteFilesAndFolders(File file) {
        if (file.isDirectory()) {
            // If the file is a directory, list all its contents and recursively delete them
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    deleteFilesAndFolders(f);
                }
            }
        }
        // Delete the file or empty directory
        file.delete();
        System.out.println("Deleted: " + file.getAbsolutePath());
    }

    private static void zipFile(File fileToZip, String fileName, ZipOutputStream zos) throws IOException {

        try {
            if (fileToZip.isHidden()) {
                return;
            }
            if (fileToZip.isDirectory()) {
                if (fileName.endsWith("/")) {
                    zos.putNextEntry(new ZipEntry(fileName));
                    zos.closeEntry();
                } else {
                    zos.putNextEntry(new ZipEntry(fileName + "/"));
                    zos.closeEntry();
                }
                File[] children = fileToZip.listFiles();
                if (children != null) {
                    for (File childFile : children) {
                        zipFile(childFile, fileName + "/" + childFile.getName(), zos);
                    }
                }
                return;
            }
            FileInputStream fis = new FileInputStream(fileToZip);
            ZipEntry zipEntry = new ZipEntry(fileName);
            zos.putNextEntry(zipEntry);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) >= 0) {
                zos.write(buffer, 0, length);
            }
            fis.close();

        }catch (Exception e) {
            System.out.println("Error zipping folder: " + e.getMessage());
        }


    }


    public  static void copyfile() {
        // Specify the source and destination file paths
        String root=System.getProperty("user.dir");
        String sourcePath = root+"Environment properties\\environment.properties";
        String destinationPath = root+"allure-results\\environment.properties";

        File sourceFile = new File(sourcePath);
        File destinationFile = new File(destinationPath);

        try {

            // Copy the file using Files.copy
            Files.copy(sourceFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file: " + e.getMessage());
        }

        String sourcePath1 = "root+Environment properties\\TREND.properties";
        String destinationPath1 = root+"allure-results\\TREND.properties";

      File sourceFile1 = new File(sourcePath1);
      File destinationFile2 = new File(destinationPath1);

        try {

            // Copy the file using Files.copy
            Files.copy(sourceFile1.toPath(), destinationFile2.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file: " + e.getMessage());
        }






}
}


