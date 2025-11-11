package com.frameium.pageobject.SalesforceService;

import com.frameium.genericfunctions.GenericFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AcceptCase extends GenericFunctions {

    private By selectonmi = By.xpath("//div[@class='oneUtilityBar slds-utility-bar_container oneUtilityBarContent']/ul/li[1]/div/div/button");
    private By expcaseid = By.xpath("//div[contains(@class,'slds-is-open') and @role='dialog']/div[2]/div/div[2]/div[2]/div/section/div/ul/li/div/div/div[4]/span[3]");
    private By minimizeBtn = By.xpath("//div[contains(@class,'slds-is-open') and @role='dialog']/div/div[2]/span/button");
    private By detailsBtn = By.xpath("//li[@title='Details']");

    private WebDriver driver;
    private SkillBasedRouting sbroute;

    public AcceptCase(WebDriver driver) {

        this.driver = driver;
        sbroute = new SkillBasedRouting(driver);
    }

    public void navigateToDetails(){
        clickElement(detailsBtn);
    }

    public String verifyCaseId(){
        String actId = sbroute.getCaseNumber();
        return actId;
    }
    public String getExpectedCaseId() {
        waitForByElement(expcaseid);
        String actcaseid = verifyCaseId();
        String expCaseId = "//div[contains(@class,'slds-is-open') and @role='dialog']/div[2]/div/div[2]/div[2]/div/section/div/ul/li/div/div/div[4]/span[3]";
        List<WebElement> elements = driver.findElements(By.xpath(expCaseId));
        String exp = null;
        for (WebElement element : elements) {
            String text = element.getText();
            System.out.println(element.getText());
            if (text.equals(actcaseid)) {
                exp = text;
            }
        }
        return exp;
    }
    public void selectOmniChannel(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement omni = wait.until(ExpectedConditions.presenceOfElementLocated(selectonmi));
        clickElement(omni);
    }

    public void acptTheCase() throws InterruptedException {
        String actcaseid = verifyCaseId();
        String expCasePath = "//div[contains(@class,'slds-is-open') and @role='dialog']/div[2]/div/div[2]/div[2]/div/section/div/ul/li/div/div/div[4]/span[3]";
        List<WebElement> listItems = driver.findElements(By.xpath(expCasePath));
        String buttonXPath = "//div[contains(@class,'slds-is-open') and @role='dialog']/div[2]/div/div[2]/div[2]/div/section/div/ul/li/div/div[2]/button";
        List<WebElement> buttons = driver.findElements(By.xpath(buttonXPath));
        if (listItems.size() != buttons.size()) {
            System.out.println("Mismatch in the number of list items and buttons.");
            return;
        }
        for (int i = 1; i <= listItems.size(); i++) {
            String expCasePath1 = "(//div[contains(@class,'slds-is-open') and @role='dialog']/div[2]/div/div[2]/div[2]/div/section/div/ul/li/div/div/div[4]/span[3])[" + i + "]";
            WebElement listItem1 = driver.findElement(By.xpath(expCasePath1));
            String buttonXPath1 = "(//div[contains(@class,'slds-is-open') and @role='dialog']/div[2]/div/div[2]/div[2]/div/section/div/ul/li/div/div[2]/button)[" + i + "]";
            WebElement button1 = driver.findElement(By.xpath(buttonXPath1));
            String text = listItem1.getText();
            if (text.equals(actcaseid)) {

                clickElementUsingJavaScript(button1);
                System.out.println("Case with ID :" +text+ " is accepted");
                break;
            }
        }
        clickElement(minimizeBtn);
    }
}