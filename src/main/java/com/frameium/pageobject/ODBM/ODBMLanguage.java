package com.frameium.pageobject.ODBM;

import com.frameium.genericfunctions.GenericFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ODBMLanguage extends GenericFunctions{
     WebDriver driver;
    GenericFunctions genericFunctions;
    WebDriverWait wait;

    public ODBMLanguage(WebDriver driver){
        this.driver = driver;
        genericFunctions = new GenericFunctions(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(50));
    }

    //Listing all storing all the language elements from webelement into text
    public void languageSelection(String language)throws Exception{
        Thread.sleep(5000);
        //scrollTillPageLast();
        WebElement languageDropdown = wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("//button[@id='affiliateLinksMenuButton']")));
        languageDropdown.click();
//        WebElement languageEle = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(BreadWebElements.languageElement)));
//        scrollToElement(languageEle);
//        clickElement(languageEle);
        List<WebElement> languageList = driver.findElements(By.xpath(BreadWebElements.multipleLanguageElements));  //listing the webelements of the language
        for(WebElement options : languageList){
            String text = options.getText().trim();
            System.out.println("languages are " + text);
            if(text.equalsIgnoreCase(language)){
                clickElement(options);
                break;
            }
        }
    }

    public String verifyChangeUrl()throws Exception{
        Thread.sleep(3000);
        return driver.getCurrentUrl();
    }

    //checking the condition of the url if it is true or false.
    public boolean isDomainChangeTo(String expectedDomainStart)throws Exception{
        Thread.sleep(2500);
        String currentUrl = driver.getCurrentUrl();
        return currentUrl.startsWith(expectedDomainStart);
    }

    public void categoryselection()throws Exception{
        Thread.sleep(2500);
        //handling stale element exception by element/page refreshing.
        WebElement dailyele = wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(By.xpath(BreadWebElements.dailybreadElements))));
        scrollToElement(dailyele);
        mouseOver(dailyele);
        //driver.navigate().refresh();    //another method

        WebElement dailydropele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BreadWebElements.dailyBreadDropElements)));
        clickElement(dailydropele);


    }




}
