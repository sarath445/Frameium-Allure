package com.frameium.pageobject.SalesforceService;

import com.frameium.genericfunctions.GenericFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class Case extends GenericFunctions {

    private By appLauncher = By.xpath("//div[@class='slds-icon-waffle']");
//    private By appLauncher = By.xpath("//button[@title='App Launcher']");
    private By viewAll = By.xpath("//button[text()='View All' and @aria-label='View All Applications']");
    private By serviceConsole = By.xpath("//p[text()='Service Console']");
    private By navigationMenu = By.xpath("//button[@title='Show Navigation Menu']");
    private By caseBtn = By.xpath("//div[@id='navMenuList']/div/ul/li/div/a/span[2]/span[text()='Cases']");
    private By newButton = By.xpath("//*[@id='brandBand_1']/div/div/div/div/div[1]/div[1]/div[2]/ul/li[1]/a");
    private By accountName = By.xpath("//input[@placeholder='Search Accounts...']");
//    private By accName = By.xpath("//div[@class='slds-listbox slds-listbox_vertical slds-dropdown slds-dropdown_fluid slds-dropdown_left slds-dropdown_length-with-icon-7']/ul/li");
    private By accName = By.xpath("//div[@role='listbox']/ul/li");

    private By contactName = By.xpath("//input[@placeholder='Search Contacts...']");
    private By cntctName = By.xpath("//div[@class='slds-listbox slds-listbox_vertical slds-dropdown slds-dropdown_fluid slds-dropdown_left slds-dropdown_length-with-icon-7']/ul/li/lightning-base-combobox-item/span[2]/span");
    private By priority = By.xpath("//label[text()='Priority']/parent::div//div/lightning-base-combobox/div/div/div/button");
    private By priority1 = By.xpath("//lightning-base-combobox-item[@data-value='Medium']");
    private By caseOrigin = By.xpath("//button[contains(@aria-label,'Case Origin')]");
    private By caseOrigin1 = By.xpath("//lightning-base-combobox-item[@data-value='Web']");
    private By caseReason = By.xpath("//button[contains(@aria-label,'Case Reason')]");
    private By caseReason1 = By.xpath("//lightning-base-combobox-item[@data-value='Installation']");
    private By type = By.xpath("//button[contains(@aria-label,'Type')]");
    private By type1 = By.xpath("//lightning-base-combobox-item[@data-value='Mechanical']");
    private By subjectField = By.xpath("//input[@name='Subject']");
    private By descriptionField = By.xpath("//label[text()='Description']/parent::lightning-textarea/div/textarea");
    private By sub = By.xpath("(//div[@class='slds-grid slds-gutters_small mdp cols-2 forcePageBlockSectionRow'])[3]/div/div/div[2]/span/span");
    private By saveBtn = By.xpath("//button[@name='SaveEdit']");

    private By editCaseOwner = By.xpath("//button[@title='Edit Case Owner']");
    private By removeOwner = By.xpath("//a[@class='deleteAction']/span[@class='deleteIcon']");
    //private By changeUser = By.xpath("//div[@class='entityMenu slds-p-left--xxx-small uiMenu']");
    private By changeUser = By.xpath("//a[@aria-label='Case Owner—Current Selection: Users, Pick an object']");
    private By selectQueues = By.xpath("//span[@title='Queues']");
    private By searchOwner = By.xpath("//input[@title='Search Queues']");
    private By selectOwner = By.xpath("//div[@title='Platinum Support']");
    private By saveButton = By.xpath("//button[@title='Save']");
    private By verifyOwner = By.xpath("//span[@class='uiOutputText forceOutputLookup']");


    private WebDriver driver;

    public Case(WebDriver driver) {

        this.driver = driver;
    }
    public void appLauncherSearch() throws InterruptedException {
        clickElementUsingJavaScript(driver.findElement(appLauncher));
        Thread.sleep(5000);
        clickElement(viewAll);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement service = wait.until(ExpectedConditions.presenceOfElementLocated(serviceConsole));
        clickElement(service);
    }
    public void goToCasePage() {
        clickElement(navigationMenu);
        waitForByElement(caseBtn);
        clickElement(caseBtn);
    }

    public void clickNew() {
        try {
            // Wait for the "New" button to be clickable
            Thread.sleep(2000);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            WebElement newButtonElement = wait.until(ExpectedConditions.elementToBeClickable(newButton));

            // Click the "New" button
            newButtonElement.click();

            WebDriverWait newPageWait = new WebDriverWait(driver, Duration.ofSeconds(30));
            newPageWait.until(ExpectedConditions.visibilityOfElementLocated(priority));

        } catch (NoSuchElementException e) {
            System.err.println("The 'New' button element not found: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An error occurred while clicking the 'New' button: " + e.getMessage());
        }
    }

    public void createCase(String contact, String account) throws InterruptedException{
        Thread.sleep(2000);
        selectPriority();
        selectCaseOrigin();
        selectType();
        selectCaseReason();
        enterContactName(contact);
        enterAccountName(account);
        enterSubject("Solar panel installation failed");
        enterDescription("Customer requires more details about the product specifications");

    }

    public void enterAccountName(String account) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.presenceOfElementLocated(accountName));

       //driver.findElement(accountName).click();
        clickElementUsingJavaScript(driver.findElement(accountName));
        driver.findElement(accountName).sendKeys(account);
        wait.until(ExpectedConditions.presenceOfElementLocated(accName));
        Thread.sleep(2000);
        List<WebElement> searchResults = driver.findElements(accName);

        for (WebElement result : searchResults) {

            String text = result.getText();
            System.out.println("text >> " + text);
            if (text.equals(account)) {
                result.click();
            }
        }
    }

    public void enterContactName(String contact) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.presenceOfElementLocated(contactName));
        waitForByElement(contactName);
        driver.findElement(contactName).sendKeys(contact);
        wait.until(ExpectedConditions.presenceOfElementLocated(cntctName));
        Thread.sleep(2000);
        List<WebElement> searchResults = driver.findElements(cntctName);
        //List<String> names = new ArrayList<>();
        for (WebElement result : searchResults) {
            String text = result.getText();
            System.out.println("text >> " + text);
            // names.add(text);
            if (text.equals(contact)) {
                result.click();
                break;
            }
        }
    }

    public void selectPriority() {
        WebElement priorityField = driver.findElement(priority);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", priorityField);

        WebElement priorityField1 = driver.findElement(priority1);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", priorityField1);
    }

    public void selectCaseOrigin() {
        WebElement caseOriginField = driver.findElement(caseOrigin);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", caseOriginField);

        WebElement caseOriginField1 = driver.findElement(caseOrigin1);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", caseOriginField1);
    }

    public void selectType() {
        WebElement typeField = driver.findElement(type);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", typeField);

        WebElement typeField1 = driver.findElement(type1);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", typeField1);
    }

    public void selectCaseReason() {
        WebElement caseReasonField = driver.findElement(caseReason);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", caseReasonField);

        WebElement caseReasonField1 = driver.findElement(caseReason1);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", caseReasonField1);
    }

    public void enterSubject(String subject) throws InterruptedException {
        waitForByElement(subjectField);
        enterKeys(subjectField,subject);
        Thread.sleep(2000);
    }

    public void enterDescription(String description) throws InterruptedException {
        Thread.sleep(2000);
     //   waitForByElement(descriptionField);
        enterKeys(descriptionField,description);
    }

    public void clickSaveBtn() throws InterruptedException {
        clickElement(saveBtn);

    }
    public String getActualSubject() {

        waitForByElement(sub);
        return driver.findElement(sub).getText();
    }

    public void clickToRemove() {
        int i = 0;  // XPath indexing starts from 1
        boolean found = false;

        while (!found) {
            try {
                By deleteIconAtIndex = By.xpath("(//a[@class='deleteAction']/span[@class='deleteIcon'])[" + i + "]");
                WebElement element = driver.findElement(deleteIconAtIndex);
                if (element.isDisplayed() && element.isEnabled()) {
                    clickElementUsingJavaScript(element);
                    found = true;
                    System.out.println("Clicked element at index: " + i);
                    return;
                } else {
                    System.out.println("Element not interactable at index: " + i);
                }
            } catch (NoSuchElementException e) {
                System.out.println("No element found at index: " + i);
                break;
            } catch (Exception e) {
                System.out.println("Exception at index: " + i + ", " + e.getMessage());
            }
            i++;
        }
        if (!found) {
            System.out.println("No clickable element found.");
        }
    }

/*******************/
    public void clickEditOwner() throws InterruptedException {
        Thread.sleep(2000);
        waitForByElement(editCaseOwner);
        clickElementUsingJavaScript(driver.findElement(editCaseOwner));

    }

    public void deleteOwner() throws InterruptedException {
        Thread.sleep(2000);
 //       clickElementUsingJavaScript(driver.findElement(removeOwner));
        //clickToRemove();
        clickDynamicElement(removeOwner);
    }
    public void clickUsers() {
        waitForByElement(changeUser);
        clickElementUsingJavaScript(driver.findElement(changeUser));
    }

    public void changeToQueues() {
        clickElement(selectQueues);
    }
    public void clickSearch(String owner) throws InterruptedException {
        clickElementUsingJavaScript(driver.findElement(searchOwner));
        Thread.sleep(2000);
        enterOwnerName(owner);
    }
    public void selectOwnerFromDropdown()
    {
        waitForByElement(selectOwner);
        clickElementUsingJavaScript(driver.findElement(selectOwner));
        clickElementUsingJavaScript(driver.findElement(saveButton));
    }
    public String checkOwner() throws InterruptedException {

        waitForByElement(verifyOwner);
        scrollToElement(driver.findElement(verifyOwner));
        return driver.findElement(verifyOwner).getText();
    }
    public void enterOwnerName(String owner) throws InterruptedException {
        waitForByElement(searchOwner);
        enterKeys(searchOwner, owner);
        Thread.sleep(2000);
    }

}


