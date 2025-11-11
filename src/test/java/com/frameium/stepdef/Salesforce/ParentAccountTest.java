package com.frameium.stepdef.Salesforce;

import com.frameium.genericfunctions.GenericFunctions;
import com.frameium.pageobject.Salesforce.Account;
import com.frameium.pageobject.Salesforce.Lead;
import com.frameium.pageobject.Salesforce.ParentAccount;
import com.frameium.stepdef.Hooks;
import com.frameium.stepdef.TestSetUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.net.MalformedURLException;
import java.time.Duration;

import static com.frameium.genericfunctions.GenericFunctions.driver;
import org.testng.Assert;

public class ParentAccountTest extends GenericFunctions {

    private ParentAccount account;
    private String expectedTitle = "Account Hierarchy | Salesforce";
    Hooks hooks = new Hooks();
    TestSetUp setUp;
    private GenericFunctions genericFunctions;
    private WebDriver driver;
    public ParentAccountTest(TestSetUp setUp) throws MalformedURLException {
        this.setUp = setUp;
        genericFunctions = new GenericFunctions(setUp.baseTest.driver);
        account=new ParentAccount(setUp.baseTest.driver);
        // Assign the driver from setUp to the local driver variable
        this.driver = setUp.baseTest.driver;

    }
    @Given("I am on the account page of the created lead")
    public void i_am_on_the_account_page_of_the_created_lead() {
    }

    @When("I click on the details button")
    public void  i_click_on_the_details_button() throws InterruptedException {
        account.detailsBtnClick();
    }

    @And("I link an existing parent account named {string} to the business account")
    public void i_link_an_existing_parent_account_to_the_business_account(String parentaccount) throws InterruptedException {

        account.editParent(parentaccount);
        hooks.takeScreenshot(hooks.scenario);
        account.clickSave();
    }

    @Then("I should verify the parent-child relation of {string} and {string}")
    public void i_should_verify_the_parent_child_relation_of_created_accounts(String parentaccount, String childaccount){
        try {
            account.verifyHierarchy(parentaccount, childaccount);
            logToExtentReport("Pass", "Parent-child relation between " + parentaccount + " and " + childaccount + " verified successfully.");
        } catch (AssertionError e) {
            logToExtentReport("Fail", "Failed to verify parent-child relation between " + parentaccount + " and " + childaccount);
            throw e;
        }        hooks.takeScreenshot(hooks.scenario);


    }
}