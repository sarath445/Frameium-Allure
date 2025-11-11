package com.frameium.baseclass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.frameium.genericfunctions.GenericFunctions;
import com.frameium.logger.LoggerHelper;
import io.appium.java_client.android.AndroidDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class TestBase extends GenericFunctions {

	public static ExtentReports extent;
	public static ExtentTest test;
	private Logger log = LoggerHelper.getLogger(TestBase.class);
	

	/*******************************************Android device Setup*****************************************************************************/

	public static AndroidDriver deviceConnection() throws MalformedURLException {

		// start the web server
//		AppiumDriverLocalService appiumlocalservice = new AppiumServiceBuilder().usingAnyFreePort().build();
//		appiumlocalservice.start();

		File rootPath = new File(System.getProperty("user.dir"));
		File app = new File(rootPath, "pCloudy Appium Demo.apk");

		if (androiddriver == null) {
			String AndroidDriver = null;
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("deviceName", getProperty("deviceName"));
			capabilities.setCapability("platformName", getProperty("platformName"));
			capabilities.setCapability("platformVersion", getProperty("platformVersion"));
			capabilities.setCapability("automationName", getProperty("automationName"));
			capabilities.setCapability("appPackage", getProperty("appPackage"));
			capabilities.setCapability("appActivity", getProperty("appActivity"));
			//capabilities.setCapability("fullReset", true);
			capabilities.setCapability("app", app.getAbsolutePath());
			androiddriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
			//androiddriver = new AndroidDriver(appiumlocalservice, capabilities);
		}

		else if (androiddriver != null) {
			androiddriver.quit();
			String AndroidDriver = null;
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("deviceName", getProperty("deviceName"));
			capabilities.setCapability("platformName", getProperty("platformName"));
			capabilities.setCapability("platformVersion", getProperty("platformVersion"));
			capabilities.setCapability("automationName", getProperty("automationName"));
			capabilities.setCapability("appPackage", getProperty("appPackage"));
			capabilities.setCapability("appActivity", getProperty("appActivity"));
			//capabilities.setCapability("fullReset", true);
			capabilities.setCapability("app", app.getAbsolutePath());
			androiddriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		}

		return androiddriver;
	}
	
	public AndroidDriver initiateDriver(String deviceName,String realDeviceName, String platformVersion, String platformName, String appPackage, String appActivity) throws MalformedURLException
    {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        GenericFunctions ag = new GenericFunctions();
        
        
        if(deviceName == ag.getProperty("emulator"))
        {
        capabilities.setCapability("deviceName",ag.getProperty("emulator"));
        capabilities.setCapability("platformVersion",ag.getProperty(platformVersion));
        capabilities.setCapability("platformName",ag.getProperty(platformName));
        capabilities.setCapability("appPackage",ag.getProperty(appPackage));
        capabilities.setCapability("appActivity",ag.getProperty(appActivity));
        androiddriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        }
        else if(realDeviceName == ag.getProperty("realDevice"))
        {
            capabilities.setCapability("deviceName",ag.getProperty("realDevice"));
            capabilities.setCapability("platformVersion",ag.getProperty(platformVersion));
            capabilities.setCapability("platformName",ag.getProperty(platformName));
            capabilities.setCapability("appPackage",ag.getProperty(appPackage));
            capabilities.setCapability("appActivity",ag.getProperty(appActivity));
            androiddriver = new AndroidDriver(new URL("http://172.168.26.20:4725/wd/hub"), capabilities);  
        }
        return androiddriver;
    }
	 
	 
	 @Parameters({"Pixel 4 API 30","realDeviceName","platformVersion","platformName","appPackage","appActivity"})
	 public void setAndroidDriver() throws MalformedURLException {
         
		 androiddriver = initiateDriver("deviceName","realDeviceName","platformVersion","platformName","appPackage","appActivity");
     }

}

