package com.frameium.pageobject.Salesforce;

import com.frameium.genericfunctions.GenericFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class Quote extends GenericFunctions {

    //   private By quotesDropdown = By.xpath("//flexipage-component2[@data-component-id='force_relatedListContainer']/slot/lst-related-list-container/div/div[6]/lst-related-list-single-container/laf-progressive-container/slot/lst-related-list-single-app-builder-mapper/article/lst-related-list-view-manager/lst-common-list-internal/lst-list-view-manager-header/div/div/div[3]/div/ul/li/div/div/div");
    private By newQuoteClick = By.xpath("");
    private By quoteName = By.xpath("//input[@name='Name']");
    private By clickDate = By.xpath("//input[@name='ExpirationDate']");
    //  private By selectYear = By.cssSelector("select.slds-select");

    private By clickYear = By.xpath("//div[@class='slds-select_container']//select");
    private By selectMonth = By.xpath("//h2[contains(@class, 'slds-align-middle')]");
    private By previousMonthButton = By.xpath("//button[@title='Previous Month']");
    private By nextMonthButton = By.xpath("//button[@title='Next Month']");
    private By clickSaveNewQuote = By.xpath("//button[@class='slds-button slds-button_brand' and @name='SaveEdit' and text()='Save']");
    private By sync = By.xpath("//a[@role='menuitem' and not(@aria-disabled='true')]/span[contains(@class, 'slds-truncate') and text()='Start Sync']");
    private By confirm = By.xpath("//button[@title='Continue']");
    private By cancelSyncButton = By.xpath("//button[@class='slds-button slds-button--neutral uiButton' and @title='Cancel']");
    private By syncCheckBox = By.xpath("//p[text()='Syncing']/parent::*/p/slot/lightning-input/lightning-primitive-input-checkbox/div/span/input[@name='IsSyncing']");
    private By syncDropdownMenu = By.xpath("(//flexipage-component2[@data-component-id='force_highlightsPanel']/slot/records-lwc-highlights-panel/records-lwc-record-layout/forcegenerated-highlightspanel_quote___012000000000000aaa___compact___view___recordlayout2/records-highlights2/div/div[1]/div[3]//button[contains(@class, 'slds-button_icon-border-filled') and contains(@class, 'slds-button_last')]/lightning-primitive-icon/following-sibling::span)[2]");
    private WebDriver driver;
    public Quote(WebDriver driver) {
        this.driver = driver;
    }
    JavascriptExecutor js = (JavascriptExecutor) driver;

    public void clickNewQuote() throws InterruptedException {
        Thread.sleep(3000);
        //Scroll till page last
        while (!(Boolean) js.executeScript("return document.documentElement.scrollHeight <= document.documentElement.scrollTop + window.innerHeight")) {
            js.executeScript("window.scrollTo(0, document.documentElement.scrollHeight)");
            Thread.sleep(2000);
        }
        clickElementUsingJS(By.xpath("//span[@class='slds-assistive-text' and text()='Show actions for this object']"));
        clickElementUsingJS(By.xpath("//a[@data-target-selection-name='sfdc:StandardButton.Quote.NewQuote' and @title='New Quote']/div[@class='forceActionLink' and @title='New Quote']"));
    }

    public void quoteInformationFill(String quoteN, String quoteD) throws InterruptedException {
        enterKeys(quoteName, quoteN);
        enterDateCalendar(quoteD);
    }

    private void enterDateCalendar(String quoteD) throws InterruptedException {
        // Split the date string to extract day, month, and year
        String[] parts = quoteD.split("-");
        String day = parts[0];
        String month = parts[1];
        String year = parts[2];

        // Click on the date input field to open the date picker
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        WebElement dateEnter = wait.until(ExpectedConditions.presenceOfElementLocated(clickDate));
        dateEnter.click();
        Thread.sleep(1000);

        // Click on the year dropdown to open the dropdown menu
        WebElement yearDropdown = wait.until(ExpectedConditions.elementToBeClickable(clickYear));
        yearDropdown.click();

        // Select the year
        By selectYear = By.xpath("//div[@class='slds-select_container']//select[@class='slds-select']/option[@value='" + year + "']");
        WebElement yearDropdownOption = wait.until(ExpectedConditions.presenceOfElementLocated(selectYear));
        yearDropdownOption.click();

        // Select the month
        Thread.sleep(1000);
        WebElement monthDropdown = driver.findElement(selectMonth);
        String currentMonth = monthDropdown.getText();
        while (!currentMonth.equalsIgnoreCase(month)) {
            // Check if we need to navigate to the previous or next month
            int currentMonthIndex = getMonthIndex(currentMonth);
            int targetMonthIndex = getMonthIndex(month);

            if (currentMonthIndex > targetMonthIndex) {
                driver.findElement(previousMonthButton).click();
            } else {
                driver.findElement(nextMonthButton).click();
            }

            currentMonth = monthDropdown.getText();
        }

        // Select the day
        Thread.sleep(3000);


        int monthNumber = getMonthInNum(month);
        String monthNum = monthNumber < 10 ? "0" + monthNumber : String.valueOf(monthNumber);
        String fDate = year + "-" + monthNum + "-" + day;
        System.out.println("fDate " + fDate);

        driver.findElement(By.xpath("//table[contains(@class,'datepicker')]/tbody/tr/td[@data-value='" + fDate + "']")).click();

    }

    private int getMonthInNum(String month) {
        // Create a mapping of month names to their corresponding numbers
        Map<String, String> monthMap = new HashMap<>();
        monthMap.put("January", "01");
        monthMap.put("February", "02");
        monthMap.put("March", "03");
        monthMap.put("April", "04");
        monthMap.put("May", "05");
        monthMap.put("June", "06");
        monthMap.put("July", "07");
        monthMap.put("August", "08");
        monthMap.put("September", "09");
        monthMap.put("October", "10");
        monthMap.put("November", "11");
        monthMap.put("December", "12");

        // Return the month number corresponding to the given month name
        return Integer.parseInt(monthMap.get(month));
    }


    private int getMonthIndex(String monthName) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        for (int i = 0; i < months.length; i++) {
            if (months[i].equalsIgnoreCase(monthName)) {
                return i;
            }
        }
        return -1;
    }

    public void saveQuote() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
        WebElement save = wait.until(ExpectedConditions.presenceOfElementLocated(clickSaveNewQuote));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", save);
    }

    public void clickNewQuote2() {
        clickElementUsingJS(By.xpath("//a[@title='Show one more action' and contains(@class, 'slds-button--icon-border-filled')]/lightning-icon/span[//span[contains(@class, 'slds-assistive-text') and text()='Show more actions']]"));
        clickElementUsingJS(By.xpath("//a[@data-target-selection-name='sfdc:StandardButton.Quote.NewQuote' and @title='New Quote']/div[@class='forceActionLink' and @title='New Quote']"));
    }

    public void clickSync(String quoteTitle) throws InterruptedException {
        //  goBackToPreviousPage();
        scrollTillPageLast();
        goToParticularQuote(quoteTitle);
        Thread.sleep(2000);
        clickSyncFromDropdown();
    }

    public void goBackToPreviousPage() {
        driver.navigate().back();
    }

    private void clickSyncFromDropdown() throws InterruptedException {
        clickElementUsingJavaScript(driver.findElement(By.xpath("//flexipage-component2[@data-component-id='force_highlightsPanel']/slot/records-lwc-highlights-panel/records-lwc-record-layout/forcegenerated-highlightspanel_quote___012000000000000aaa___compact___view___recordlayout2/records-highlights2/div/div[1]/div[3]//button[contains(@class, 'slds-button_icon-border-filled') and contains(@class, 'slds-button_last')]/lightning-primitive-icon/following-sibling::span")));
        Thread.sleep(1000);
        clickElement(driver.findElement(sync));
    }

    private void goToParticularQuote(String quoteTitle) {
        clickElementUsingJS(By.xpath("//a[@class='displayLabel slds-truncate' and @title='" + quoteTitle + "']"));
    }

    public void confirmClick() throws InterruptedException {
        Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(confirm));
        clickElementUsingJavaScript(driver.findElement(confirm));
    }

    public String captureSyncErrorMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
        WebElement syncErrorElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'modal-body') and contains(@class, 'scrollable')]")));
        return syncErrorElement.getText();
    }

    public void cancelSync() {
        clickElementUsingJavaScript(driver.findElement(cancelSyncButton));
    }

    public void clickSyncOption(String quoteTitles) throws InterruptedException {
        scrollTillPageLast();
        goToParticularQuote(quoteTitles);
        Thread.sleep(2000);
        clickSyncFromDropdownMenu();
    }

    private void clickSyncFromDropdownMenu() throws InterruptedException {
        clickElementUsingJavaScript(driver.findElement(syncDropdownMenu));
        Thread.sleep(1000);
        clickElement(driver.findElement(sync));
    }

    public boolean isSyncingCheckboxTicked() {
        WebElement checkbox = driver.findElement(syncCheckBox);
        return checkbox.isSelected();
    }

    public String getActualOpportunityName() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        WebElement opportunityNameElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//records-record-layout-item[@field-label='Opportunity Name']//lightning-formatted-text")));
        return opportunityNameElement.getText();
    }

    public String getActualStatus() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        WebElement statusElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()='Status']/following-sibling::div//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value']")));
        return statusElement.getText();
    }
}
