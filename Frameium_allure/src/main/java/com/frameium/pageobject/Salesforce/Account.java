package com.frameium.pageobject.Salesforce;

import com.frameium.genericfunctions.GenericFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Account extends GenericFunctions {
    private By accountsButton = By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[6]");
    private By newBtn = By.xpath("//li[@data-target-selection-name='sfdc:StandardButton.Account.New']");
    private By accountNameField = By.xpath("//input[@name='Name']");
    private By saveBtn = By.xpath("//button[@name='SaveEdit']");
    private WebDriver driver;
    public Account(WebDriver driver) {

        this.driver = driver;
    }

    public void accountsBtnClick() {

        clickElement(accountsButton);
    }
    public void newAccountCreation(String acntName) throws InterruptedException {
        Thread.sleep(10000);
        clickElement(newBtn);
        enterKeys(accountNameField, acntName);
        clickElement(saveBtn);
    }

}
