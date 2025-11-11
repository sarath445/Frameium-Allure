package com.frameium.pageobject.SalesforceService;

import com.frameium.genericfunctions.GenericFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CaseAutoAssignment extends GenericFunctions {

    private WebDriver driver;

    private By ownerName = By.xpath("//span[text()='Case Owner']/parent::div[@class='test-id__field-label-container slds-form-element__label']/following-sibling::div/span/a");
    private By assigncheckbox = By.xpath("//span[text()='Assign using active assignment rule']");
    private By sendcheckbox = By.xpath("//span[text()='Send notification email to contact']");
    private By saveBtn = By.xpath("//button[@name='SaveEdit']");


    public CaseAutoAssignment(WebDriver driver) {

        this.driver = driver;
    }

    public void tickCheckbox(){
        clickElement(assigncheckbox);
        clickElement(sendcheckbox);
  //      clickSaveBtn();
    }

    public void clickSaveBtn(){
        clickElement(saveBtn);
    }

    public String getActualOwnerName() {
        waitForByElement(ownerName);
        return driver.findElement(ownerName).getText();
    }
}
