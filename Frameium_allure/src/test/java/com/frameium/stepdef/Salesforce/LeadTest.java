package com.frameium.stepdef.Salesforce;

import com.frameium.genericfunctions.GenericFunctions;
import com.frameium.pageobject.Salesforce.Lead;
import com.frameium.pageobject.Salesforce.Login;
import com.frameium.stepdef.Hooks;
import com.frameium.stepdef.TestSetUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.net.MalformedURLException;

public class LeadTest extends GenericFunctions {

    private Lead lead;

    private Login salesforce;

    private String expectedTitle = "John Thomas | Lead | Salesforce";

    private String exptdName = "Mx. John Thomas";

    private String updateValue = "10";


    private String accountTitle = "GetCloudy Logistics";

    private String contactTitle = "John Thomas";

    private String opportunityTitle = "GetCloudy Logistics-";

    private String leadName = "John Thomas";

    Hooks hooks = new Hooks();
    private WebDriver driver;
    TestSetUp setUp;
    private GenericFunctions genericFunctions;
    public LeadTest(TestSetUp setUp) throws MalformedURLException {
        this.setUp = setUp;
        genericFunctions = new GenericFunctions(setUp.baseTest.driver);
        salesforce=new Login(setUp.baseTest.driver);
        lead=new Lead(setUp.baseTest.driver);
        // Assign the driver from setUp to the local driver variable
        this.driver = setUp.baseTest.driver;
    }

    //  Scenario Outline: creation of a new lead

    @Given("I login with username {string} and password {string} of salesforce")

    public void i_login_with_username_and_password_of_salesforce(String username, String password) throws InterruptedException {

        salesforce.login(username, password);

    }

    @Given("I am on the salesforce home page")

    public void salesforce_home_page() {
    }

    @When("I navigate to the app launcher and go to sales page")

    public void i_navigate_to_the_app_launcher_and_go_to_sales_page() throws InterruptedException {
        lead.appLauncherSearch();

    }

    @Then("I go to the leads page")

    public void i_go_to_the_leads_page() {

        lead.leadslogin();

    }

    @And("I click on new button")

    public void i_click_on_new_button() throws InterruptedException {

        lead.clickNew();

        Thread.sleep(5000);

        //  hooks.takeScreenshot(hooks.scenario);

    }

    @Then("I will create a new lead and verify it")

    public void i_will_create_a_new_lead_and_save_it() throws InterruptedException {

        String actlName = lead.createAndVerifyLead();

        System.out.println("the actual name is ...................." + actlName);

        if (actlName.equals(exptdName)) {

            logToExtentReport("Pass", "Lead is created successfully. The actual name is " + actlName);

        } else {

            logToExtentReport("Fail", "Lead is not created. The actual name is " + actlName + " but expected name is " + exptdName);

        }

        Assert.assertEquals(actlName, exptdName, "Lead is not created");

        Thread.sleep(4000);

        // hooks.takeScreenshot(hooks.scenario);

    }

    // Scenario Outline: Creation of a new Task from Lead

    @Given("I am on the created Lead's detail page")

    public void i_am_on_the_created_lead_s_detail_page() {

    }

    @When("I click on the New Task button")

    public void i_click_on_the_new_task_button() {
        lead.clickNewTask();

    }

    @Then("the Task creation form should be displayed with Lead data pre-filled")

    public void the_task_creation_form_should_be_displayed_with_lead_data_pre_filled() throws InterruptedException {

        Thread.sleep(3000);

        boolean isLeadNameDisplayed = lead.isLeadNameDisplayed(leadName);

        if (isLeadNameDisplayed) {

            Assert.assertTrue(isLeadNameDisplayed, "Lead Name is present on the page.");

        } else {

            Assert.fail("Lead Name is not present on the page.");

        }

        hooks.takeScreenshot(hooks.scenario);

    }


    @And("I fill in the task details with {string} and {string} and save it")

    public void i_fill_in_the_task_details_with_and_and_save_it(String call, String date) throws InterruptedException {


        lead.fillTaskDetails(call, date);

        Thread.sleep(4000);

        hooks.takeScreenshot(hooks.scenario);

    }

    @Then("the task should be created successfully")

    public void the_task_should_be_created_successfully() {

        lead.saveNewTask();

    }

    //  Scenario: Lead Progression
    @When("I click on the Details and change the lead status to {string}")

    public void i_click_on_the_details_and_change_the_lead_status_to_working_contacted(String leadStatus) {
        lead.changeLeadStatus(leadStatus);
    }

    @Then("the working-contacted lead status window should be opened")
    public void the_working_contacted_lead_status_window_should_be_opened() {
        if (lead.isWorkingContactedLeadStatusWindowOpened()) {
            logToExtentReport("Pass", "The Working - Contacted lead status window is displayed.");
            System.out.println("The Working - Contacted lead status window is displayed.");
        } else {
            logToExtentReport("Fail", "The Working - Contacted lead status window is not opened.");
            // If the element is not displayed, throw an AssertionError
            throw new AssertionError("The Working - Contacted lead status window is not opened.");
        }
    }

    @And("I update the details in that page and click save")
    public void i_update_the_details_in_that_page_and_click_save() {
        try {
            lead.updateLeadDetails(updateValue);
            logToExtentReport("Pass", "Lead details updated successfully with value: " + updateValue);
            hooks.takeScreenshot(hooks.scenario);
        } catch (Exception e) {
            logToExtentReport("Fail", "Failed to update lead details with value: 10. Error: " + e.getMessage());
            throw e;
        }

    }

    @Then("I click on the converted and select converted status button")

    public void i_click_on_the_converted_and_select_converted_status_button() throws InterruptedException {

        lead.convertedButtonClick();

        lead.selectConvertedStatusBtnClick();

        Thread.sleep(4000);

        hooks.takeScreenshot(hooks.scenario);

    }

    //   Scenario: Lead status conversion

    @Given("I am on the lead's detail conversion screen")

    public void i_am_on_the_lead_s_detail_conversion_screen() {

    }

    @When("I click on the Convert button")

    public void i_click_on_the_convert_button() throws InterruptedException {

        Thread.sleep(4000);

        lead.convertBtnClick();

        Thread.sleep(2000);

        hooks.takeScreenshot(hooks.scenario);
    }

    @Then("the lead should be converted and accounts, contacts, and opportunities should be automatically created")

    public void i_should_see_the_lead_converted_message() throws InterruptedException {

        Thread.sleep(8000);

        if (lead.isElementPresentWithTitle(accountTitle)) {

            logToExtentReport("Pass", "Account with title containing '" + accountTitle + "' is present.");

            System.out.println("Account with title containing '" + accountTitle + "' is present.");

        } else {

            logToExtentReport("Fail", "Account with title containing '" + accountTitle + "' is not found.");

            throw new AssertionError("Account with title containing '" + accountTitle + "' is not found.");

        }

        if (lead.isElementPresentWithTitle(contactTitle)) {

            logToExtentReport("Pass", "Contact with title containing '" + contactTitle + "' is present.");

            System.out.println("Contact with title containing '" + contactTitle + "' is present.");

        } else {

            logToExtentReport("Fail", "Contact with title containing '" + contactTitle + "' is not found.");

            throw new AssertionError("Contact with title containing '" + contactTitle + "' is not found.");

        }

        if (lead.isElementPresentWithTitle(opportunityTitle)) {

            logToExtentReport("Pass", "Opportunity with title containing '" + opportunityTitle + "' is present.");

            System.out.println("Opportunity with title containing '" + opportunityTitle + "' is present.");

        } else {

            logToExtentReport("Fail", "Opportunity with title containing '" + opportunityTitle + "' is not found.");

            throw new AssertionError("Opportunity with title containing '" + opportunityTitle + "' is not found.");

        }

    }

    @And("close the lead converted window")

    public void closeWindow() {

        lead.closeLeadConvertedWindow();

    }

}