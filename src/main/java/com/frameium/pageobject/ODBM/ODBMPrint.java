package com.frameium.pageobject.ODBM;

import com.frameium.genericfunctions.GenericFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ODBMPrint extends GenericFunctions{
    static WebDriver driver;
    GenericFunctions genericFunctions;
    WebDriverWait wait;

    public ODBMPrint(WebDriver driver){
        this.driver = driver;
        genericFunctions = new GenericFunctions(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(50));
    }

    public void startPrintsubscribe()throws Exception{
        try{
            WebElement printele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BreadWebElements.printNBtn)));
            clickElement(printele);
        }
        catch (Exception e){
            System.out.println("Element not found " + e.getMessage());
        }

    }
    public void startMonthlysubscrib()throws Exception{
        Thread.sleep(2500);
        WebElement monthlyele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BreadWebElements.monthlySubscribeBtn)));
        clickElement(monthlyele);
    }

    public String giveMontlyandOnce()throws Exception{
        Thread.sleep(2500);
        try{
            WebElement monthlygivele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BreadWebElements.giveMonthlyBtn)));
            WebElement oncele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BreadWebElements.giveOnce)));
            WebElement textele = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(BreadWebElements.onceText)));
            WebElement textele2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(BreadWebElements.monthlyText)));

            clickElement(oncele);
            Thread.sleep(3000);
            String text =  textele.getText();
            System.out.println("text verification for give once " + text);
            clickElement(monthlygivele);
            String text2 = textele2.getText();
            System.out.println("text verification for give monthly " + text2);
            return text + text2;
        }
        catch (Exception e){
            System.out.println("elements are not found " + e.getMessage());
            return null;
        }
    }

    //verification of all the offers.
    public void vfyAlloffers()throws Exception{
        List<WebElement> offerList = driver.findElements(By.xpath(BreadWebElements.offersElements));
        Set<String> uniqueTexts = new HashSet<>();
        for(WebElement options : offerList) {
            String text = options.getText().trim();
            uniqueTexts.add(text);
        }
        if(uniqueTexts.size()==offerList.size()){
            System.out.println("All elements have unique text values");
        }
        else {
            System.out.println("some elementes have duplicate text values");
        }

    }

    public void verifyTexts(){
        List<WebElement> textele = driver.findElements(By.xpath("//ul[@class='flex flex-col space-y-6']/li/a"));



    }




}
