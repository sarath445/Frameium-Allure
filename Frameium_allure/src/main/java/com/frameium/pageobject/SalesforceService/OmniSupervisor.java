package com.frameium.pageobject.SalesforceService;

import com.frameium.genericfunctions.GenericFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OmniSupervisor extends GenericFunctions {
    private By appLauncher = By.cssSelector(".slds-icon-waffle");
    private By viewAll = By.xpath("//button[text()='View All']");
    private By serviceConsole = By.xpath("//p[text()='Service Console']");
    private By clickOmnichannel = By.xpath("//span[text()='Omni-Channel (Offline)']");
    private By changeOmniChannelStatusBtn = By.xpath("//div[contains(@class,'slds-is-open') and @role='dialog']/div[2]/div/div[2]/div[1]/div/button");
    private By setAvailable = By.xpath("//li[@title='Online Status']");
    private By minimizeBtn = By.xpath("//div[contains(@class,'slds-is-open') and @role='dialog']/div/div[2]/span/button");
    private By showNavigationMenu = By.xpath("//button[@title='Show Navigation Menu']");
    private By clickOmniSup = By.xpath("//span[text()='Omni Supervisor']");
    private By gotoAssignedWork = By.xpath("//a[@data-label='Assigned Work']");
    private By verifyQueue = By.xpath("//tr[@class='rowOdd omniWorksByQueueRow']/th/a");
    private By gotoQueue = By.xpath("//a[text()='AutoRouting']");
    private By verifyCaseDetails = By.xpath("//div[contains(text(),'Medium | New |')]/preceding-sibling::span");

    public OmniSupervisor(WebDriver driver) {

        this.driver = driver;
    }

    public void appLauncherSearch() throws InterruptedException {
        clickElement(appLauncher);
        Thread.sleep(5000);
        clickElement(viewAll);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement service = wait.until(ExpectedConditions.presenceOfElementLocated(serviceConsole));
        clickElement(service);
    }

    public void setOmnichannelAvailable() throws InterruptedException {
        Thread.sleep(2000);
        clickElement(clickOmnichannel);
        clickElementUsingJavaScript(driver.findElement(changeOmniChannelStatusBtn));
        clickElement(setAvailable);
        Thread.sleep(3000);
        clickElement(minimizeBtn);
    }

    public void switchToOmniSupervisor() throws InterruptedException {
        Thread.sleep(2000);
        clickElement(showNavigationMenu);
        clickElement(clickOmniSup);
    }

    public void navigatetoAssignedWork() throws InterruptedException {
        Thread.sleep(3000);
        clickElement(gotoAssignedWork);
    }

    public String verifyAutoRoutingQueue() {
        waitForByElement(verifyQueue);
        return driver.findElement(verifyQueue).getText();
    }

      public void navigateToQueue() {
          clickElement(gotoQueue);

      }
    public String checkCaseDetails() throws InterruptedException {

        waitForByElement(verifyCaseDetails);
        return driver.findElement(verifyCaseDetails).getText();
    }


  }


