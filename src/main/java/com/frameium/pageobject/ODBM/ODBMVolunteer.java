package com.frameium.pageobject.ODBM;

import com.frameium.genericfunctions.GenericFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class ODBMVolunteer extends GenericFunctions {
    WebDriver driver;
    GenericFunctions genericFunctions;
    WebDriverWait wait;
    JavascriptExecutor js;

    //creating and initializing constructor.
    public ODBMVolunteer(WebDriver driver){         //passing the dependency injection to pass the webdriver via the constructor.
        this.driver = driver;
        genericFunctions = new GenericFunctions(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(500));
        js = (JavascriptExecutor) driver;

    }

    public void volunteerOdbm()throws Exception{
        try{
            WebElement volele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BreadWebElements.volunteerBtn)));
            WebElement appele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BreadWebElements.volunteerApplication)));
            Thread.sleep(5000);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", volele);
            //js.executeScript("arguments[0].scrollIntoView(true);", volele);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", volele);
            //volele.click();
            Thread.sleep(3000);
            js.executeScript("arguments[0].scrollIntoView(true);", appele);
            appele.click();
        }
        catch (Exception e){
            WebElement volele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BreadWebElements.volunteerBtn)));
            WebElement appele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BreadWebElements.volunteerApplication)));
            Thread.sleep(5000);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", volele);
            //js.executeScript("arguments[0].scrollIntoView(true);", volele);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", volele);
            //volele.click();
            Thread.sleep(3000);
            js.executeScript("arguments[0].scrollIntoView(true);", appele);
            appele.click();
        }

    }

    public void redirectedTab(){
        String parentWindow = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for(String handle : windowHandles){
            if(!handle.equals(parentWindow)){
                driver.switchTo().window(handle);
                System.out.println("switched to new tab..");
                break;

            }
        }

    }
}
