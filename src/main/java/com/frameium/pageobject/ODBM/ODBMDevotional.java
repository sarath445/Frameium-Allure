package com.frameium.pageobject.ODBM;

import com.frameium.genericfunctions.GenericFunctions;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

//ineritting the generic class using extends keyword.
public class ODBMDevotional extends GenericFunctions{
    private static final Logger log = LoggerFactory.getLogger(ODBMDevotional.class);

//    @FindBy(xpath = "//input[@placeholder = 'Search Collections...']")     //encapsulated xpath cannot use for another class.
//    WebElement collectionele;
   // @FindBy(tagName = "img")

    WebDriver driver;
    GenericFunctions genericFunctions;
    WebDriverWait wait;
    Actions act;
    JavascriptExecutor js;

    //creating constructor
    public ODBMDevotional(WebDriver driver){
        this.driver = driver;
        genericFunctions = new GenericFunctions(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        act = new Actions(driver);
        js = (JavascriptExecutor) driver;
    }
    //List<WebElement> allimages = driver.findElements(By.tagName("img"));

    //validate and clicking category in the Devotionals menu
   public void dailyDevotionals(String category)throws Exception{
       WebElement devele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BreadWebElements.devotionalsElement)));
       scrollToElement(devele);
       hoverOverElement(devele);
       try{
           List<WebElement> devListele = driver.findElements(By.xpath(BreadWebElements.devotionalListElements));
           for(WebElement options : devListele){
               String text = options.getText().trim();
               System.out.println("submenu in the dropdown " + text);
               if(text.equalsIgnoreCase(category)){
                   wait.until(ExpectedConditions.elementToBeClickable(options));
                   js.executeScript("arguments[0].click();", options);
                   Thread.sleep(2500);

                   String parentWindow = driver.getWindowHandle();    //getting current window.
                   Set<String> windowHandles = driver.getWindowHandles(); // Get all window handles

                   for (String handle : windowHandles) {
                       if (!handle.equals(parentWindow)) {
                           driver.switchTo().window(handle); // Switch to new tab
                           System.out.println("Switched to new tab.");
                       }
                   }
                   break;
               }
           }
       }
       catch (Exception e){
           System.out.println("elements are not found " + e.getMessage());
       }

    }
    public boolean isImageDisplay(){
        WebElement imagele = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(BreadWebElements.imageElement)));
        return imagele.isDisplayed();
    }
    public boolean isImageLoad(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement imagele = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(BreadWebElements.imageElement)));
        return (Boolean) js.executeScript(
        "return arguments[0].complete && " +
                "typeof arguments[0].naturalWidth != 'undefined' && " +
                "arguments[0].naturalWidth > 0",    imagele);
    }

    public void fromDatePicking(String fromDate)throws Exception {
        WebElement fromele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BreadWebElements.fromDateElement)));

        Thread.sleep(2500);
        clickElement(fromele);
        //selecting year pick dropdowwn
        WebElement yearDrpDwnElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BreadWebElements.yearPickdrop)));
        yearDrpDwnElement.click();
        //select year
//        WebElement years = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(BreadWebElements.yearPick)));
//        years.getText();

        //String[] fulldate = date.split("-");

        //String fulldate = "15-June-2023";
        String[] userDate = fromDate.split("-");
        String year = userDate[2];
        String month = userDate[1];
        String date = userDate[0];

        // Select the year
        By selectYear = By.xpath("//div[@class='react-datepicker__year-option' and text()='" + year + "']");
        WebElement years = wait.until(ExpectedConditions.presenceOfElementLocated(selectYear));
        years.click();

        WebElement monthDrpDownElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BreadWebElements.monthDrop)));
        monthDrpDownElement.click();
        //write the word in captial letter
        //act.keyDown(Keys.SHIFT).sendKeys(years,"devotional").keyUp(Keys.SHIFT).perform();

        //select the month
        By selectMonth = By.xpath("//div[@class='react-datepicker__month-option' and text()='" + month + "']");
        WebElement months = wait.until(ExpectedConditions.presenceOfElementLocated(selectMonth));
        months.click();

        //select the day
        By selectDay = By.xpath("//div[@class='react-datepicker__month']//div[@class='react-datepicker__week']//div[text()='" + date + "']");
        WebElement days = wait.until(ExpectedConditions.elementToBeClickable(selectDay));
        js.executeScript("arguments[0].click();", days);

    }


//        //select month
//        By selectmonth = By.xpath("//div[@class='react-datepicker__month-option']");
//        WebElement months = wait.until(ExpectedConditions.visibilityOfElementLocated(selectmonth));
//        months.click();
//        String a = "5-06-2025";
//        String b[] = a.split("-");
//        b[0] = "5";







//        String year = "2023";
//        String month = "March";
//        String date =   "14";
//
//        //select month and year
//        while (true){
//            String currentMonth = driver.findElement(By.xpath(BreadWebElements.currentMonthElement)).getText();
//            String currentYear = driver.findElement(By.xpath(BreadWebElements.currentYear)).getText();
//            if(currentMonth.equalsIgnoreCase(month) && currentYear.equalsIgnoreCase(year)){
//                 break;
//            }
//            WebElement nextele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BreadWebElements.prevArrowElement)));
//            clickElement(nextele);          //click next if it matches the given date by user.
//        }
//
//        //select the date
//        List<WebElement> allDates = driver.findElements(By.xpath(BreadWebElements.dateTableElement));
//        for(WebElement options : allDates){
//            String dateText = options.getText();
//            if(dateText.equalsIgnoreCase(date)){
//                clickElement(options);
//                break;
//            }
//        }



//*[text()='22']



    public void toDatepicking(String toDates)throws Exception{
        WebElement toele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BreadWebElements.toDateElement)));
        clickElement(toele);
        WebElement yearDrpDwnElement =wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BreadWebElements.yearPickdrop)));
        yearDrpDwnElement.click();

        //String toDate = "23-October-2024";
        //use string array for storing different parts as index.
        String[] toDevotionaldate = toDates.split("-");
        String date = toDevotionaldate[0];
        String month = toDevotionaldate[1];
        String year = toDevotionaldate[2];

        //select toYear
        By toYear = By.xpath("//div[@class='react-datepicker__year-option' and text() = '"+year+ "']");
        WebElement toYearElement = wait.until(ExpectedConditions.elementToBeClickable(toYear));
        clickElement(toYearElement);

        WebElement monthDrpDownElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BreadWebElements.monthDrop)));
        monthDrpDownElement.click();

        //select toMonth
        By toMonth = By.xpath("//div[@class='react-datepicker__month-option' and text()='"+month+ "']");
        WebElement toMonthElement = wait.until(ExpectedConditions.elementToBeClickable(toMonth));
        clickElement(toMonthElement);

        By selectDay = By.xpath("//div[@class='react-datepicker__month']//div[@class='react-datepicker__week']//div[text()='" +date+ "']");
        WebElement days = wait.until(ExpectedConditions.elementToBeClickable(selectDay));
        js.executeScript("arguments[0].click();", days);
    }






//    public void requiredDates() {
//        WebElement startDate = driver.findElement(dateSelection1);
//        startDate.click();
//        WebElement startdatepick = driver.findElement(datestartpick);
//        startdatepick.click();
//        WebElement endDate = driver.findElement(dateSelection2);
//        endDate.click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
//        WebElement enddatepick = wait.until(ExpectedConditions.presenceOfElementLocated(dateendpick));
//        js.executeScript("arguments[0].click;", enddatepick);
//    }
        //enddatepick.click();}
//    public boolean targetedDateSelection(){
//        String targetMonth = "March";
//           String targetYear = "2027";
//    while (true) {
//        String displayedMonth = driver.findElement(month).getText();
//        System.out.println(displayedMonth);
//         String displayedYear = driver.findElement(year).getText();
//         if(targetMonth.equals(displayedMonth) && targetYear.equals(displayedYear)) {
//             break;
//         }
//         else{
//         driver.findElement(next).click();
//         }
//         driver.findElement(day).click();
//         wait.until(ExpectedConditions.elementToBeClickable(day)).click();
//
//    }
//        return false;
//    }
    public void vfyAfterPickCalendar()throws Exception{
         //locating and storing images in a list.
        List<String> imageSources = new ArrayList<>();    //creating List with data type as String
        while (true) {
            List<WebElement> images = driver.findElements(By.xpath(BreadWebElements.devotionalImages));
            for (WebElement options : images) {
                if (options.isDisplayed()) {
                    String SRC = options.getAttribute("src");
                    imageSources.add(SRC);
                    System.out.println("image found with src " + SRC);

                } else {
                    System.out.println("images not displayed");
                }

                WebElement nextButtonElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BreadWebElements.nextDevotionalsBtn)));
                String classAttr = nextButtonElement.getAttribute("class");
                //get attributes named disabled are not equal to null or contains disabled it will break from loop and then click next button.
                if (nextButtonElement.getAttribute("disabled") != null || classAttr.contains("disabled")) {
                    System.out.println("reached the lastpage");
                    break;
                }
                clickElement(nextButtonElement);
                Thread.sleep(2500);

            }
            System.out.println("all images are " + imageSources.size());
        }

    }

    public void exploreOption()throws Exception{
        WebElement explorele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BreadWebElements.exploreBtn)));
        clickElement(explorele);
    }

    //Getting the Text message for verification
    public String getTextmsg(){
        WebElement textele = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(BreadWebElements.collectionTitle)));
        return textele.getText();
    }

    public void collectionsSearch(String collectionText)throws Exception{
        WebElement collectionele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BreadWebElements.collectionSearch)));
        genericFunctions.passingInputEnter(collectionele, collectionText);

    }

    //Verification of images to be displayed and loaded properly.
    public boolean isImageloaded(WebElement image){
        return (boolean) js.executeScript("return arguments[0].complete && arguments[0].naturalWidth > 0", image);

    }
    public void allImagesverify(){
        List<WebElement> allimages = driver.findElements(By.xpath("//div[@data-elementor-type='loop-item']//img"));
        try{
            for(WebElement image : allimages){
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", image);

                Assert.assertTrue(image.isDisplayed(), "image is not seen");
                Assert.assertTrue(isImageloaded(image), "image is not loaded");
            }
        }
        catch (Exception e){
              e.printStackTrace();
        }
    }
    //verification and clicking on Instagram button
    public void instaCheck()throws Exception{
        try{
            WebElement instaEle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BreadWebElements.instaBtn)));
            scrollElementScroll(instaEle);
            Thread.sleep(2000);
            hoverOverElement(instaEle);
            instaEle.click();
            //window handling and navigate to other tab
            String parentWindow = driver.getWindowHandle();
            Set<String> windowHandles = driver.getWindowHandles();
            for(String handle:windowHandles){
                if(!handle.equals(parentWindow)){
                    driver.switchTo().window(handle);
                    System.out.println("switched to new tab..");
                }
            }
        }
        catch (Exception e){
            System.out.println("element is not found " + e.getMessage());
        }
    }

    //implement this method using switch case method.
    public void socialMediaCheck(String category)throws Exception{
        WebElement instaEle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BreadWebElements.instaBtn)));
        WebElement facebookele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BreadWebElements.facebookBtn)));
        WebElement twitterele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BreadWebElements.twitterBtn)));
        WebElement pinterestEle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BreadWebElements.pinInterest)));

        try{
            switch (category){
                case "instagram":
                    scrollElementScroll(instaEle);
                    hoverOverElement(instaEle);
                    instaEle.click();
                    break;

                case "facebook":
                    scrollElementScroll(facebookele);
                    hoverOverElement(facebookele);
                    facebookele.click();
                    break;

                case "twitter":
                    scrollElementScroll(twitterele);
                    hoverOverElement(twitterele);
                    twitterele.click();
                    break;

                case "pinInterest":
                    scrollElementScroll(pinterestEle);
                    hoverOverElement(pinterestEle);
                    pinterestEle.click();
                    break;
                default:
                    throw new IllegalArgumentException("unknown button" + category);
            }
        }
        catch (Exception e){
            System.out.println("buttons are not found" + e.getMessage());
        }

    }

    public void buttonAndUrlCheck(){
        List<WebElement> icons = driver.findElements(By.xpath("//div[@class='elementor-social-icons-wrapper elementor-grid']/span/a"));
        for(WebElement icon:icons){
            Assert.assertTrue(icon.isDisplayed(), "buttons are disabled");
            String url = icon.getAttribute("href");
            Assert.assertNotNull(url, "url is not null");
            Assert.assertFalse(url.trim().isEmpty(),"url is empty");
        }
    }

//    String color= driver.findElement(By.xpath("//a[text()='New User Register Here']")).getCssValue("color");
//    System.out.println(color);

    //verification and validation of button and corresponding their URL
    public void buttonsChecks(){
        WebElement instaEle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BreadWebElements.instaBtn)));
        WebElement facebookele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BreadWebElements.facebookBtn)));
        WebElement twitterele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BreadWebElements.twitterBtn)));
        WebElement pinterestEle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BreadWebElements.pinInterest)));
        Assert.assertTrue(instaEle.isDisplayed(), "isntabtn is not available");
        Assert.assertTrue(instaEle.getAttribute("href").contains("instagram.com"));
        Assert.assertTrue(facebookele.isEnabled(), "facebook is not enable");
        Assert.assertTrue(facebookele.getAttribute("href").contains("facebook.com"));
        Assert.assertTrue(twitterele.isDisplayed(), "twitter is not enable");
        Assert.assertTrue(twitterele.getAttribute("href").contains("twitter.com"));
        Assert.assertTrue(pinterestEle.isEnabled(), "pinInterest is not enable");
        Assert.assertTrue(pinterestEle.getAttribute("hreg").contains("pinterest.com/"));
    }



    public String redirectedTab(){
        String parentWindow = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for(String handle:windowHandles){
            if(!handle.equals(parentWindow)){
                driver.switchTo().window(handle);
                System.out.println("switched to new tab....");
                break;
            }
        }
        return driver.getCurrentUrl();            //after navigated to the new tab, then getting the current url
    }

    public void vfyRedirectPage(){
        String actualUrl = driver.getCurrentUrl();
    }


    //getting data from the table and extract a required text from the table.
    public void getTabledata()throws Exception{
        //storing the table in a list and sortify all the data
        try{
            List<WebElement> rows = driver.findElements(By.xpath("//table[@id='marketWatchTable1']/tbody/tr"));   //storing all rows of webelement in a list
            for(WebElement row : rows){
                List<WebElement> cells = row.findElements(By.tagName("td"));    //storing all cell data of webelements in a list.
                for(WebElement cell: cells){
                    System.out.println("the data in the table are :" + cell.getText());
                }
            }
             //extracting a required data for the user.
            WebElement text = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@id='marketWatchTable1']/tbody/tr[3]/td[1]")));
            String tableText = text.getText();
            System.out.println("required text " + tableText);
        }
        catch (Exception e){
            System.out.println("element not found" + e.getMessage());
        }

    }

    public void dataValidation1() {
        List<String> expectedValues = List.of("SARCO\n" +            "2030", "SAUDI ARAMCO\n" +            "2222", "PETRO RABIGH\n" +            "2380");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//table[@id=\"marketWatchTable1\"]")));

        List<WebElement> rows = driver.findElements(By.tagName("tr"));  //listing all the values in each rows.
        List<String> actualValues = new ArrayList<>();  //creating list of string type
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                actualValues.add(cell.getText());       //adding the text and stores in the List as String type.
            }    }
        for (String expected : expectedValues) {
            if (actualValues.contains(expected)) {
                System.out.println("PASS: Found expected value -> " + expected);
            } else {
                System.out.println("FAIL: Expected value not found -> " + expected);
            }
        }
    }

//    public void IndustryGroupDropdownVerification(List<String>expectedoptions) {
//        // Click to expand dropdown
//         WebElement dropdown = driver.findElement(industrygrp);
//         dropdown.click();
//         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//         wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(industryoptions));
//         WebElement industrydrp = driver.findElement(industryoptions);
//         Select select = new Select(industrydrp);
//         List<WebElement> optionElements = select.getOptions();
//
//         List<String> actualOptions = new ArrayList<>();
//         for (WebElement option : optionElements) {
//         actualOptions.add(option.getText());    }
//         System.out.println("Actual Industry Group Options:");
//         actualOptions.forEach(System.out::println);
//         //Validate all expected options are present
//         for (String expected : expectedoptions) {
//         if (actualOptions.stream().anyMatch(opt -> opt.equalsIgnoreCase(expected.trim()))) {
//         System.out.println(expected + " is present in the dropdown.");
//         } else {
//         System.out.println(expected + " is NOT present in the dropdown.");
//         Assert.fail(expected + " is missing from the dropdown.");        }



//    public void listingClick(){
//        clickObject(listing);
//    }public void ListingMenus() {
//        List<WebElement> listings = driver.findElements(Becomeissuer);
//        System.out.println("menus are: ");
//        for (WebElement webElement : listings) {
//            String text = webElement.getText().trim();
//            if (!text.isEmpty()) {
//                System.out.println("menus are: " + text);
//            } else {
//                System.out.println("elements were not found");
//            }
//
//
//        }
//    }










//            for (int i = 9; i <= 54; i++) { // skipping header row (0)
//        WebElement row = rows.get(i);
//        System.out.println( row.getText());
//
//
//
//        List<WebElement> cells = row.findElements(By.tagName("td"))
//    };


//        public void marketSummary() {
//            List<WebElement> summarymarket = driver.findElements(summary);
//            WebElement element = null;
//            for (int i = 0; i < summarymarket.size(); i++) {
//                element = summarymarket.get(i);
//            }
//            if (element.isDisplayed()) {
//                System.out.println("values are: ");
//                List<String> text = Arrays.asList(element.getText().split("\\r?\\n"));
//                System.out.println(text);
//                List<String> expectedValues = Arrays.asList("Main Market, 10,982.52, 1.39%,Parallel Market, 27,175.85, 0.47%,Sukuk and Bonds, 913.26, -0.01%");        //String expectedValue = "Expected Value " + text;
//                if (text.equals(expectedValues)) {
//                    System.out.println("Text matches expected value.");
//                } else {
//                    System.out.println("Text does NOT match expected value.");
//                }
//            } else {
//                System.out.println("Element " + i + " is NOT displayed.");
//            }
//        }}
}






























