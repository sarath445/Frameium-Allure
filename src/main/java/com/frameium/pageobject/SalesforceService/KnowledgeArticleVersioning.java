package com.frameium.pageobject.SalesforceService;

import com.frameium.genericfunctions.GenericFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class KnowledgeArticleVersioning extends GenericFunctions {

    private By goToiFrame2 = By.xpath("(//iframe[@title='Rich Text Area'])[2]");
    private By editasDraftBtn = By.xpath("//button[text()='Edit as Draft']");
    private By confirmEditBtn = By.xpath("//button[@title='Edit as Draft']");
    private By updateAnswer = By.xpath("//body[contains(@aria-label,'Rich Text Area.')]");
    private By verifyVer = By.xpath("(//p[@title='Version Number']/parent::*/p[2]/slot/lightning-formatted-number)[2]");
    private By saveBtn = By.xpath("//button[text()='Save']");
    private By publishBtn = By.xpath("//button[text()='Publish']");
    private By clickPublish = By.xpath("//span[text()='Publish']");

    public KnowledgeArticleVersioning(WebDriver driver) {

        this.driver = driver;
    }

    public void clickEditBtn() throws InterruptedException {
        Thread.sleep(3000);
        clickElementUsingJavaScript(driver.findElement(editasDraftBtn));

        Thread.sleep(3000);
        clickElementUsingJavaScript(driver.findElement(confirmEditBtn));
    }

    public void makeChanges() throws InterruptedException {
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(goToiFrame2));
        WebElement eleFrame2 = driver.findElement(goToiFrame2);
        driver.switchTo().frame(eleFrame2);
        clickElementUsingJavaScript(driver.findElement(updateAnswer));
        inputAnswer2("\nUpdate Answer field : Versioning the article to V2. Adding guidance to enter OTP to company portal\n" +
                "As per the new  security procedure, after password reset user has to follow additional steps by logging into the company portal for registering the OTP received in their registered contact number.");

        driver.switchTo().defaultContent();

    }
    public void clickSaveBtn() throws InterruptedException {
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(saveBtn));
        clickElementUsingJavaScript(driver.findElement(saveBtn));

        Thread.sleep(3000);
        waitForByElement(publishBtn);
        clickElementUsingJavaScript(driver.findElement(publishBtn));
        clickElement(clickPublish);
    }

    public String verifyVersion() throws InterruptedException {
        Thread.sleep(5000);
        isDisplayedBy(verifyVer);
        String versionNum =  driver.findElement(verifyVer).getText();
        System.out.println ( "versionNum : " + versionNum);
        return versionNum;
    }
    public void inputAnswer2(String answer)
    {
        enterKeys(updateAnswer,answer);
    }

}
