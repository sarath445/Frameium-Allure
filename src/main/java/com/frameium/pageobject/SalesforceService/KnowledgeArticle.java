package com.frameium.pageobject.SalesforceService;

import com.frameium.genericfunctions.GenericFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

public class KnowledgeArticle extends GenericFunctions {
    private By appLauncher = By.xpath("//button[@title='App Launcher']");
    private By viewAll = By.xpath("//button[text()='View All']");
    private By serviceConsole = By.xpath("//p[text()='Service Console']");
    private By showNavigationMenu = By.xpath("//button[@title='Show Navigation Menu']");
    private By clickKnowledge = By.xpath("//a[@data-itemid='Knowledge__kav']");
    private By clickNewBtn = By.xpath("//div[@title='New']");
    private By title = By.xpath("//label[text()='Title']");
    private By enterTitle = By.xpath("//input[@name='Title']");
    private By enterURL = By.xpath("//input[@name='UrlName']");
    private By goToiFrame1 = By.xpath("(//iframe[@title='Rich Text Area'])[1]");
    private By enterQuestion = By.xpath("(//body[contains(@aria-label,'Rich Text Area.')])[1]");
    private By goToiFrame2 = By.xpath("(//iframe[@title='Rich Text Area'])[2]");
    private By enterAnswer = By.xpath("//body[contains(@aria-label,'Rich Text Area.')]");
    private By saveBtn = By.xpath("//button[text()='Save']");
    private By verifyTitle = By.xpath("//span[text()='Title']/parent::div/parent::dt/following-sibling::dd/div/span/slot/lightning-formatted-text");
    private By updateAnswer = By.xpath("//body[contains(@aria-label,'Rich Text Area.')]");

    public KnowledgeArticle(WebDriver driver) {

        this.driver = driver;
    }

    public void appLauncherSearch() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(appLauncher));
        clickElementUsingJavaScript(driver.findElement(appLauncher));
        Thread.sleep(5000);
        waitForByElement(viewAll);
        wait.until(ExpectedConditions.presenceOfElementLocated(serviceConsole));
        waitForByElement(serviceConsole);
    }


    public void switchToKnowledge() throws InterruptedException, IOException {
        clickElement(showNavigationMenu);
        clickElement(clickKnowledge);
        Thread.sleep(3000);
    }

    public void clickNewBtn() {
        try {

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            WebElement newButton = wait.until(ExpectedConditions.elementToBeClickable(clickNewBtn));

            newButton.click();

            WebDriverWait newPageWait = new WebDriverWait(driver, Duration.ofSeconds(30));
            newPageWait.until(ExpectedConditions.visibilityOfElementLocated(title));

        } catch (NoSuchElementException e) {
            System.err.println("The 'New' button element not found: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An error occurred while clicking the 'New' button: " + e.getMessage());
        }
    }
    public void createKnowledge(String title, String url) throws InterruptedException {
        Title(title);
        Url(url);
        question();
        answer();
    }
    public void Title(String title) {
        clickElement(enterTitle);
        inputTitle(title);
    }

    public void Url(String url) throws InterruptedException {
        clickElement(enterURL);
        driver.findElement(enterURL).clear();
        Thread.sleep(3000);
        inputURL(url);
    }

    public void question() throws InterruptedException {
        Thread.sleep(5000);

        WebElement eleFrame1 = driver.findElement(goToiFrame1);
        driver.switchTo().frame(eleFrame1);
        clickElementUsingJavaScript(driver.findElement(enterQuestion));
        inputQuestion("How to reset password for the community site");
        driver.switchTo().defaultContent();
    }

    public void answer() throws InterruptedException {

        WebElement eleFrame2 = driver.findElement(goToiFrame2);
        driver.switchTo().frame(eleFrame2);
        clickElementUsingJavaScript(driver.findElement(enterAnswer));
        inputAnswer1("\n" +
                "To reset the password for a Community site in Salesforce, you typically follow these steps:\n" +
                "Access the Community Login Page: Go to the login page of your Community site. This is usually the URL of your Community site appended with \"/login\". For example, if your Community site URL is \"https://yourcommunity.force.com\"");
        driver.switchTo().defaultContent();
    }

    public void saveKnowledge() {
        clickElement(saveBtn);
    }

    public void inputTitle(String title)
    {
         enterKeys(enterTitle,title);
    }
    public void inputURL(String url)
    {
        enterKeys(enterURL,url);
    }
    public void inputQuestion(String question)
    {
        enterKeys(enterQuestion,question);
    }
    public void inputAnswer1(String answer)
    {
        enterKeys(enterAnswer,answer);
    }
    public void inputAnswer2(String answer)
    {
        enterKeys(updateAnswer,answer);
    }
    public String getActTitle(){
        waitForByElement(verifyTitle);
        return driver.findElement(verifyTitle).getText();
    }
}

