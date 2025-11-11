package com.frameium.pageobject.SalesforceService;

import com.frameium.genericfunctions.GenericFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CaseResolution extends GenericFunctions {
    private WebDriver driver;
    private By globalSearch = By.xpath("//button[@class='slds-button slds-button_neutral search-button slds-truncate']");
    private By inputField = By.xpath("//input[@class='slds-input']");
    private By searchResult = By.xpath("//div[@class='slds-text-link--reset slds-grid slds-grid--vertical-align-center slds-truncate instant-result-item slds-p-left_small two-fields instant-result-item-record-suggestion']");
    private By searchArticle = By.xpath("(//input[@title='Search Knowledge...'])[3]");
    private By findArticle = By.xpath("//div[@class='listContent']/ul[@role='presentation']/li");
    private By verifyArticle = By.xpath("//lightning-formatted-text[@slot='primaryField' and text()='Password Reset']");
    private By statusClick = By.xpath("//button[@title='Edit Status']");
    private By statusDropdown = By.xpath("//a[@role='combobox' and text()='New']");
    private By statusSelect = By.xpath("//a[@title='Closed']");
    private  By saveBtn = By.xpath("//button[@title='Save']");
    private SkillBasedRouting skill;
    public CaseResolution(WebDriver driver){
        this.driver = driver;
        skill = new SkillBasedRouting(driver);
    }

    public void navigateToOpenCase(String elementText) throws InterruptedException {
        searchForCase();
        searchWithCaseId(elementText);
    }

    public void searchForCase(){
        waitForByElement(globalSearch);
        clickElementUsingJS(globalSearch);

    }

    public void searchWithCaseId(String elementText) throws InterruptedException {
        dynamicElementPassInput(inputField,elementText);
        WebElement clickCase = driver.findElement(By.xpath("//span[@title='" +elementText+ "']"));
        Thread.sleep(2000);
        clickElementUsingJavaScript(clickCase);
    }

    public void enterKeyword(String keyword, String article) throws InterruptedException {

//        Thread.sleep(2000);
////        WebElement search = driver.findElement(searchArticle);
//        waitForByElement(searchArticle);
//        clickElementUsingJavaScript(driver.findElement(searchArticle));
//        driver.findElement(searchArticle).sendKeys(keyword);
////        dynamicElementPassInput("//input[@title='Search Knowledge...']",keyword);

        dynamicElementPassInput(searchArticle,keyword);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(findArticle));
        Thread.sleep(2000);
        List<WebElement> searchResults = driver.findElements(findArticle);

        for (WebElement result : searchResults) {

            String text = result.getText();
            System.out.println(" text >> " + text);
            System.out.println("article >> " + article);
            if (text.equals(article)) {
                Thread.sleep(2000);
                clickElementUsingJavaScript(result);
                break;
            }
        }
    }

    public String verifyKnowledgeOpened() throws InterruptedException {
        Thread.sleep(2000);
        String exptName = getActualArticleName();
//        System.out.println(">>>>>*******>>>>>>>>" +exptName);
        Thread.sleep(2000);
        driver.navigate().back();
        return exptName;
    }

    public void updateStatus() throws InterruptedException {
        //waitForByElement(statusClick);
        scrollToElement(driver.findElement(statusClick));
        clickElementUsingJavaScript(driver.findElement(statusClick));
        //waitForByElement(statusDropdown);
        clickDynamicElement(statusDropdown);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(statusSelect));
        clickDynamicElement(statusSelect);

    }

    public void clickSave() throws InterruptedException {
        clickDynamicElement(saveBtn);
    }

    public String getActualArticleName(){
        //waitForByElement(verifyArticle);
        return driver.findElement(verifyArticle).getText();
    }

}
