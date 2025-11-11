package com.frameium.pageobject.SalesforceService;

import com.frameium.genericfunctions.GenericFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class KnowledgeArticleArchival extends GenericFunctions {
    private By globalSearch = By.xpath("//button[@class='slds-button slds-button_neutral search-button slds-truncate']");
    private By inputField = By.xpath("//input[@placeholder='Search...']");

    private By clickArchiveBtn = By.xpath("//button[@name='ArchiveKnowledgeArticleVersion']");
    private By confirmArchBtn = By.xpath("//span[text()='Archive']/parent::*");
    private By verifyStatus = By.xpath("//p[@title='Publication Status']/following-sibling::p/slot/lightning-formatted-text");

    public KnowledgeArticleArchival(WebDriver driver) {

        this.driver = driver;
    }


//    public void searchForKnowledgeArt(){
//        waitForByElement(globalSearch);
//        clickElementUsingJS(globalSearch);
//
//    }

    public void navigateBackToKnowledge(){
        driver.navigate().back();
    }
    public void clickArchive() throws InterruptedException {
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.presenceOfElementLocated(clickArchiveBtn));
        clickDynamicElement(clickArchiveBtn);

        Thread.sleep(3000);
        clickElement(confirmArchBtn);

    }
    public String checkPublicationStatus() throws InterruptedException {

        Thread.sleep(3000);
        //waitForByElement(verifyStatus);
        return driver.findElement(verifyStatus).getText();
    }
}

