package com.frameium.pageobject.ODBM;

import com.frameium.genericfunctions.GenericFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ODBMReclaimConnect extends GenericFunctions {
    static WebDriver driver;
    GenericFunctions genericFunctions;
    WebDriverWait wait;

    //creating constructor for initializing driver and object values.
    public ODBMReclaimConnect(WebDriver driver){
        this.driver = driver;
        genericFunctions = new GenericFunctions(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }

    public void connectWithGodReclaim(String category)throws Exception{
        try {
            WebElement connetele = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(BreadWebElements.connectWithGodElement)));
            hoverOverElement(connetele);
            clickElement(connetele);
            hoverOverElement(connetele);
            List<WebElement> connectDrop = driver.findElements(By.xpath(BreadWebElements.connectWithGodDropdownelements));
            System.out.println("list of connects " + connectDrop);
            for(WebElement options : connectDrop){
                String text = options.getText().trim();
                if(text.equalsIgnoreCase(category)){
                    System.out.println("connecting category " + text);
                    clickElement(options);
                    break;
                }
            }
        }
        catch (Exception e){
            System.out.println("exception error " + e.getMessage());
        }
    }


    //2 String type methods and a boolean type methods for checking conditions by return the values.
    public String getPrayertext(){
        WebElement textele = driver.findElement(By.xpath(BreadWebElements.prayerText));
        return textele.getText();   //return the text values of the prayer.
    }
    public String getPrayerpara(){
        WebElement paraele = driver.findElement(By.xpath(BreadWebElements.prayerPara));
        return paraele.getText();
    }
    public boolean vfyPrayermessage(String expectedtext, String expectedpara){
        return getPrayertext().equalsIgnoreCase(expectedtext) && getPrayerpara().equalsIgnoreCase(expectedpara);
    }


    }


