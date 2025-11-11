package com.frameium.stepdef.Salesforce;

import com.frameium.genericfunctions.GenericFunctions;
import com.frameium.pageobject.Salesforce.Quote;
import com.frameium.stepdef.Hooks;
import com.frameium.stepdef.TestSetUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class QuoteTest extends GenericFunctions {
    Hooks hooks = new Hooks();
    private Quote quote;
    String expectedOpportunityName = "GetCloudy Logistics-";
    String expectedStatus = "Draft";
    String expectedErrorMessage = "Quote Quote for GetCloudy Logistics_v1 is already synced with this opportunity. An opportunity can be synced with only one quote. If you continue, Quote for GetCloudy Logistics_v1 won’t sync.\n" +
            "\n" +
            "If you continue, you’ll replace all opportunity products with the quote line items.\n" +
            "\n" +
            "After a quote is synced, opportunity products and quote line items are updated automatically.";
    TestSetUp setUp;
    private GenericFunctions genericFunctions;
    private WebDriver driver;

    public QuoteTest(TestSetUp setUp) throws MalformedURLException {
        this.setUp = setUp;
        genericFunctions = new GenericFunctions(setUp.baseTest.driver);
        quote = new Quote(setUp.baseTest.driver);
        // Assign the driver from setUp to the local driver variable
        this.driver = setUp.baseTest.driver;

    }

    @When("I click on Quotes and then click New Quote")
    public void i_click_on_quotes_and_then_click_new_quote() throws InterruptedException {
        quote.clickNewQuote();
    }

    @Then("I should verify that the selected opportunity name is displayed on the New Quote screen")
    public void i_should_verify_that_the_selected_opportunity_name_is_displayed_on_the_new_quote_screen() {
        hooks.takeScreenshot(hooks.scenario);
        String actualOpportunityName = quote.getActualOpportunityName();
        // Check if the actual text matches the expected text
        if (actualOpportunityName.equals(expectedOpportunityName)) {
            logToExtentReport("Pass", "Opportunity name " + expectedOpportunityName + " is displayed on the New Quote screen.");
            System.out.println("Opportunity name " + expectedOpportunityName + " is displayed on the New Quote screen.");
        } else {
            logToExtentReport("Fail", "Expected opportunity name: " + expectedOpportunityName + ", but found: " + actualOpportunityName);
            throw new AssertionError("Expected opportunity name: " + expectedOpportunityName + ", but found: " + actualOpportunityName);
        }

    }

    @Then("I should verify that the status is set to Draft")
    public void i_should_verify_that_the_status_is_set_to_draft() {

        String actualStatus = quote.getActualStatus();
        // Check if the actual text matches the expected text
        if (actualStatus.equals(expectedStatus)) {
            logToExtentReport("Pass", "Status is set to " + expectedStatus + ".");
            System.out.println("Status is set to " + expectedStatus + ".");
        } else {
            logToExtentReport("Fail", "Expected status: " + expectedStatus + ", but found: " + actualStatus);
            throw new AssertionError("Expected status: " + expectedStatus + ", but found: " + actualStatus);
        }
    }

    @Then("I create a new quote from the opportunity screen")
    public void i_create_a_new_quote_from_the_opportunity_screen() throws InterruptedException {
        quote.quoteInformationFill("Quote for GetCloudy Logistics_v1", "26-June-2025");
        logToExtentReport("Log", "Filled quote information: 'Quote for GetCloudy Logistics_v1', '26-June-2025'");
        Thread.sleep(2000);
        hooks.takeScreenshot(hooks.scenario);
        quote.saveQuote();
    }

    @Then("I create multiple quotes from the opportunity screen")
    public void i_create_multiple_quotes_from_the_opportunity_screen() throws InterruptedException {
        Thread.sleep(3000);
        quote.clickNewQuote2();
        quote.quoteInformationFill("Quote for GetCloudy Logistics_v2", "20-July-2025");
        logToExtentReport("Log", "Filled quote information: 'Quote for GetCloudy Logistics_v2', '20-July-2025'");
        Thread.sleep(2000);
        hooks.takeScreenshot(hooks.scenario);
        quote.saveQuote();
    }

    //    Scenario: To sync and verify a quote
    @Given("I am on the opportunity page of the created quotes")
    public void i_am_on_the_opportunity_page_of_the_created_quotes() {

    }

    @When("I select a particular quote and click on the Sync button")
    public void i_select_a_particular_quote_and_click_on_the_button() throws InterruptedException {
        quote.clickSync("Quote for GetCloudy Logistics_v1");
        Thread.sleep(2000);
        hooks.takeScreenshot(hooks.scenario);

    }

    @And("I confirm the sync action in the confirmation dialog")
    public void i_confirm_the_sync_action_in_the_confirmation_dialog() throws InterruptedException {
        quote.confirmClick();
    }

    @Then("the syncing checkbox should be ticked under quote")
    public void the_syncing_checkbox_should_be_ticked_under_quote() throws InterruptedException {
        Thread.sleep(1000);
        boolean isCheckboxTicked = quote.isSyncingCheckboxTicked();
        if (isCheckboxTicked) {
            System.out.println("Sync Checkbox is ticked");
            logToExtentReport("Pass", "The syncing checkbox is ticked under quote.");
        } else {
            logToExtentReport("Fail", "The syncing checkbox is not ticked under quote.");
            throw new AssertionError("The syncing checkbox is not ticked under quote.");
        }
        Thread.sleep(1000);
        hooks.takeScreenshot(hooks.scenario);
        quote.goBackToPreviousPage();
    }

    //  Scenario: Attempt to sync another quote and capture sync error
    @When("I click on another quote and click on the Sync button")
    public void i_click_on_another_quote_and_click_on_the_sync_button() throws InterruptedException {
        quote.clickSyncOption("Quote for GetCloudy Logistics_v2");
    }

    @Then("a sync error message should be displayed and verified")
    public void i_should_capture_and_verify_the_sync_error_message() throws InterruptedException {
        Quote quote = new Quote(driver);
        String errorMessage = quote.captureSyncErrorMessage();
        // Verify the error message
        if (!errorMessage.contains(expectedErrorMessage)) {
            logToExtentReport("Fail", "The sync error message is incorrect. Expected: " + expectedErrorMessage + ", but got: " + errorMessage);
            System.out.println("The sync error message is incorrect. Expected: " + expectedErrorMessage + ", but got: " + errorMessage);
            throw new AssertionError("The sync error message is incorrect. Expected: " + expectedErrorMessage + ", but got: " + errorMessage);
        } else {
            logToExtentReport("Pass", "The sync error message is correct. Message: " + errorMessage);
            System.out.println("The sync error message is correct. Message: " + errorMessage);
        }
        Thread.sleep(2000);
        hooks.takeScreenshot(hooks.scenario);
        quote.cancelSync();
    }


}
