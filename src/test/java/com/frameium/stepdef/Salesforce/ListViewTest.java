package com.frameium.stepdef.Salesforce;

import com.frameium.genericfunctions.GenericFunctions;
import com.frameium.pageobject.Salesforce.ListView;
import com.frameium.stepdef.Hooks;
import com.frameium.stepdef.TestSetUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.net.MalformedURLException;

public class ListViewTest extends GenericFunctions {
    private ListView listview;
    Hooks hooks = new Hooks();
    TestSetUp setUp;
    private GenericFunctions genericFunctions;
    private WebDriver driver;
    public ListViewTest(TestSetUp setUp) throws MalformedURLException {
        this.setUp = setUp;
        genericFunctions = new GenericFunctions(setUp.baseTest.driver);
        listview=new ListView(setUp.baseTest.driver);
        // Assign the driver from setUp to the local driver variable
        this.driver = setUp.baseTest.driver;

    }
    @Then("I will go to the opportunity page")
    public void i_will_go_to_the_opportunity_page() {
        listview.goToOpportunities();
    }

    @And("I will create a new listview with {string} and new filter")
    public void i_will_create_a_new_listview_with_and_new_filter(String listviewname) throws InterruptedException {
        listview.createListView(listviewname);
        hooks.takeScreenshot(hooks.scenario);
        listview.createFilter();
        listview.clickSave();
    }

    @Then("Verify that the created listview contains the opportunity {string}")
    public void verify_that_the_created_listview_contains_the_opportunity(String opportunityName) throws InterruptedException {
        Thread.sleep(2000);
        try {
            boolean isOpportunityPresent = listview.opportunityVerify(opportunityName);
            if (isOpportunityPresent) {
                logToExtentReport("Pass", "Opportunity Name '" + opportunityName + "' is found in the list view.");
            } else {
                logToExtentReport("Fail", "Opportunity Name '" + opportunityName + "' is not found in the list view.");
                Assert.fail("Opportunity Name '" + opportunityName + "' is not found in the list view.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            logToExtentReport("Fail", "An exception occurred during verification: " + e.getMessage());
            Assert.fail("An exception occurred during verification: " + e.getMessage());

        }
        hooks.takeScreenshot(hooks.scenario);
    }
}