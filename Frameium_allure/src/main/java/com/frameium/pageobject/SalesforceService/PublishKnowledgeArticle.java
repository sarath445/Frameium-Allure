package com.frameium.pageobject.SalesforceService;

import com.frameium.genericfunctions.GenericFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PublishKnowledgeArticle extends GenericFunctions {
    private WebDriver driver;

    private By publishClick = By.xpath("//button[text()='Publish']");
    private By publishBtn = By.xpath("//span[text()='Publish']");
    private By publishMsg = By.xpath("//span[contains(text(),'published')]");

    private By status = By.xpath("//p[text()='Publication Status']/parent::div/child::p[2]/slot/lightning-formatted-text");
    private By artNum = By.xpath("//p[@title='Article Number']/following-sibling::p/slot/lightning-formatted-text");


    public PublishKnowledgeArticle(WebDriver driver){
        this.driver = driver;

    }

    public void clickPublish() throws InterruptedException {
        waitForByElement(publishClick);
        //clickElement(publishClick);
        clickDynamicElement(publishClick);
    }


    public void clickPublishBtn(){
        clickElement(publishBtn);
    }
    public String verifyPublishMsg() throws InterruptedException {
        Thread.sleep(3000);
        waitForByElement(publishMsg);
        return driver.findElement(publishMsg).getText();
    }

    public String verifyStatus(){
        waitForByElement(status);
        return driver.findElement(status).getText();

    }

    public String articleId(){
        waitForByElement(artNum);
        return driver.findElement(artNum).getText();
    }

}