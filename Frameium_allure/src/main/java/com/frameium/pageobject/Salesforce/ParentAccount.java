package com.frameium.pageobject.Salesforce;

import com.frameium.genericfunctions.GenericFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class ParentAccount extends GenericFunctions {
    private WebDriver driver;
    public ParentAccount(WebDriver driver) {

        this.driver = driver;
    }

    //private By DetailsBtn = By.xpath("//a[@data-tab-value='detailTab']");
    private By parentEditBtn = By.xpath("//button[@title='Edit Parent Account']");
    private By saveBtn = By.xpath("//button[@name='SaveEdit']");
    private By hierarchyBtn = By.xpath("//button[@title='View Account Hierarchy']");
    // private By clickDetails = By.xpath("//li[@title='Details']/a");
    //a[@class='slds-tabs_default__link' and @id='detailTab__item']
    //
    //   private By clickDetails = By.xpath("a[@class='slds-tabs_default__link' and @id='detailTab__item']");
    private By clickDetails = By.xpath(" (//li[@title='Related']/following-sibling::li[@title='Details'])[2]");

    public void detailsBtnClick() throws InterruptedException {
        //   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
        //  wait.until(ExpectedConditions.presenceOfElementLocated(clickDetails));
        Thread.sleep(3000);
        clickElement(driver.findElement(clickDetails));

    }

    public void editParent(String parentaccountname) throws InterruptedException {
        clickElement(parentEditBtn);
        driver.findElement(By.xpath("//input[@placeholder='Search Accounts...']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Search Accounts...']")).sendKeys(parentaccountname);

        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4000));
        // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Search Accounts...']/parent::*/parent::*/parent::*/following-sibling::*/ul/li/lightning-base-combobox-item/span/span/span")));
        Thread.sleep(3000);
        List<WebElement> searchResults = driver.findElements(By.xpath("//input[@placeholder='Search Accounts...']/parent::*/parent::*/parent::*/following-sibling::*/ul/li/lightning-base-combobox-item/span/span"));

        System.out.println("searchResults " + searchResults.size());

        for (WebElement result : searchResults) {

            String text = result.getText();
            System.out.println("text >> " + text);
            if (text.equals(parentaccountname)) {

                clickElement(result);
            }
        }
    }

    public void clickSave() throws InterruptedException {
        //Thread.sleep(2000);
        clickElement(saveBtn);
        Thread.sleep(2000);
    }

    public void verifyHierarchy(String parent, String child) {

//        String parent = "GetCloudy Pvt LTD";
//        String child = "GetCloudy Logistics";

        clickElement(hierarchyBtn);

        waitForByElement(By.xpath("//div[contains(@class,'windowViewMode-normal')]/div/div[2]/div[2]/div[3]/div/div/table/tbody"));

        WebElement table = driver.findElement(By.xpath("//div[contains(@class,'windowViewMode-normal')]/div/div[2]/div[2]/div[3]/div/div/table/tbody"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        for (int i = 1; i <= rows.size(); i++) {

            String rowText = driver.findElement(By.xpath("//div[contains(@class,'windowViewMode-normal')]/div/div[2]/div[2]/div[3]/div/div/table/tbody/tr[" + i + "]/th/div/div/a")).getText();
            System.out.println("rowText >>>>> ?  " + rowText);

            String level = driver.findElement(By.xpath("//div[contains(@class,'windowViewMode-normal')]/div/div[2]/div[2]/div[3]/div/div/table/tbody/tr[" + i + "]")).getAttribute("aria-level");
            System.out.println("level  >>> ??? " + level);

            if (rowText.equals(parent)) {

                String rowTextChild = driver.findElement(By.xpath("//div[contains(@class,'windowViewMode-normal')]/div/div[2]/div[2]/div[3]/div/div/table/tbody/tr[" + (i + 1) + "]/th/div/div/a")).getText();
                System.out.println("rowTextChild >>>>> ?  " + rowTextChild);

                String levelChild = driver.findElement(By.xpath("//div[contains(@class,'windowViewMode-normal')]/div/div[2]/div[2]/div[3]/div/div/table/tbody/tr[" + (i + 1) + "]")).getAttribute("aria-level");
                System.out.println("levelChild  >>> ??? " + levelChild);

                if (rowTextChild.equals(child)) {

                    int parentLevel = Integer.parseInt(level);
                    int childLevel = Integer.parseInt(levelChild);

                    Assert.assertTrue(parentLevel < childLevel, "No parent-child relation between these accounts");
                }
            }
        }
    }
}