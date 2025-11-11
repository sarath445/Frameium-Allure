package com.frameium.stepdef.Salesforce;

import com.frameium.genericfunctions.GenericFunctions;
import com.frameium.pageobject.Salesforce.Opportunity;
import com.frameium.stepdef.Hooks;
import com.frameium.stepdef.TestSetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.util.List;

public class OpportunityTest extends GenericFunctions {
    private Opportunity opportunity;
    Hooks hooks = new Hooks();
    private double valueAmount;
    private double valueTotalAmount;
    TestSetUp setUp;
    private GenericFunctions genericFunctions;
    private WebDriver driver;
    public OpportunityTest(TestSetUp setUp) throws MalformedURLException {
        this.setUp = setUp;
        genericFunctions = new GenericFunctions(setUp.baseTest.driver);
        opportunity=new Opportunity(setUp.baseTest.driver);
        // Assign the driver from setUp to the local driver variable
        this.driver = setUp.baseTest.driver;
    }
    //  Scenario: Choosing a Price Book from Opportunity Products

    @Given("I am on the specific opportunity page")
    public void i_am_on_the_specific_opportunity_page() throws InterruptedException {
        Thread.sleep(3000);
    }
    @When("I click on Products and select the Choose Price Book option")
    public void i_click_on_products_and_select_the_choose_price_book_option() throws InterruptedException {
        opportunity.choosePriceBook();
    }


    @Then("the Standard price book should be chosen successfully and saved")
    public void the_price_book_should_be_chosen_successfully() throws InterruptedException {

        Thread.sleep(1000);
        boolean isDisplayed =  opportunity.isStandardPriceBookDisplayed();
        if (isDisplayed) {
            logToExtentReport("Pass", "The Standard price book option is selected on the page.");
            System.out.println("The Standard price book option is selected on the page");
        } else {
            logToExtentReport("Fail", "The Standard price book option is not selected on the page.");
        }
        Assert.assertTrue(isDisplayed, "The Standard price book option is not selected on the page");
        opportunity.selectPriceBook();
        hooks.takeScreenshot(hooks.scenario);
    }


    //  Scenario: To add products to the selected price book from Opportunity Products

    @When("I click on Products and select the Add Products option")
    public void i_click_on_products_and_select_the_add_products_option() throws InterruptedException {
        opportunity.addProducts();
    }

    @When("I select desired products and click next")
    public void i_select_desired_products_and_click_next(List<String> products) {
        opportunity.selectProducts(products);
        hooks.takeScreenshot(hooks.scenario);
        opportunity.clickNext();

    }

    @When("I enter the quantity of selected products")
    public void i_enter_the_quantity_of_selected_products() throws InterruptedException {

        opportunity.enterProductQuantity();

        hooks.takeScreenshot(hooks.scenario);
        opportunity.clickSaveSelectedProducts();
    }

    @Then("the products are added with required quantity from opportunity successfully")
    public void the_products_are_added_with_required_quantity_from_opportunity_successfully() throws InterruptedException {

        Thread.sleep(1000);
        boolean isDisplayed = opportunity.isProductsLinkDisplayed();
        if (isDisplayed) {
            logToExtentReport("Pass", "Products link with 'Products' title and '(2)' is present on the page.");
            System.out.println("Products link with 'Products' title and '(2)' is present on the page.");
        } else {
            logToExtentReport("Fail", "Products link with 'Products' title and '(2)' is not present on the page.");
        }
        Assert.assertTrue(isDisplayed, "Products link with 'Products' title and '(2)' is not present on the page.");
        hooks.takeScreenshot(hooks.scenario);
    }

    //   Scenario:Calculation and comparison of price from products screen and amount field
    @Given("I am on the opportunity page of the created lead")
    public void i_am_on_the_opportunity_page_of_the_created_lead() {
    }

    @When("I go to the details field in the value proposition stage")
    public void i_go_to_the_details_field_in_the_value_proposition_stage() {
        opportunity.goToValuePropositionStage();
    }

    @Then("I should get the total amount from the opportunity screen amount field")
    public void i_should_get_the_total_amount_from_the_opportunity_screen_amount_field() throws InterruptedException {
        Thread.sleep(500);
        valueAmount = opportunity.valueComparison();
        hooks.takeScreenshot(hooks.scenario);

    }

    @Then("I should verify that the amount field is the sum of all added products from the products screen")
    public void i_should_verify_that_the_amount_field_is_the_sum_of_all_added_products_from_the_products_screen() throws InterruptedException {
        Thread.sleep(500);
        opportunity.clickViewAll();
        hooks.takeScreenshot(hooks.scenario);
        valueTotalAmount=  opportunity.calculateTotalAmount();
    }

    @Then("I should compare both the price from the products screen and the amount field")
    public void i_should_compare_both_the_price_from_the_products_screen_and_the_amount_field() throws InterruptedException {
        Thread.sleep(500);
        try {
            Assert.assertEquals(valueTotalAmount, valueAmount, "The total amount (" + valueTotalAmount + ") is not equal to the amount from the opportunity screen (" + valueAmount + ")");
            logToExtentReport("Pass", "The total amount (" + valueTotalAmount + ") is equal to the amount from the opportunity screen (" + valueAmount + ")");
            System.out.println("The total amount (" + valueTotalAmount + ") is equal to the amount from the opportunity screen (" + valueAmount + ")");
        } catch (AssertionError e) {
            logToExtentReport("Fail", "The total amount (" + valueTotalAmount + ") is not equal to the amount from the opportunity screen (" + valueAmount + ")");
            throw e;
        }
    }

}
