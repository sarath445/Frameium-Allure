package com.frameium.stepdef.SalesforceService;

import com.frameium.genericfunctions.GenericFunctions;
import com.frameium.pageobject.SalesforceService.Case;
import com.frameium.stepdef.Hooks;
import com.frameium.stepdef.TestSetUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.net.MalformedURLException;

public class CaseTest  {

    private Case cases;
    private WebDriver driver;
    Hooks hooks = new Hooks();
    String exptdSubject = "Solar panel installation failed";
    String exptdOwner = "Platinum Support";

    TestSetUp setUp;

    private GenericFunctions genericFunctions;

    public CaseTest(TestSetUp setUp) throws MalformedURLException {
        this.setUp = setUp;
        genericFunctions = new GenericFunctions(setUp.baseTest.driver);
        cases=new Case(setUp.baseTest.driver);
        this.driver = setUp.baseTest.driver;
    }

    // New case creation

    @When("I navigate to the app launcher and go to service console page")
    public void i_navigate_to_the_app_launcher_and_go_to_service_console_page() throws InterruptedException {

        cases.appLauncherSearch();
    }

    @Then("I go to the case page")
    public void i_go_to_the_case_page() throws InterruptedException {
        cases.goToCasePage();
    }
    @And("I click on new case button")
    public void i_click_on_new_case_button() throws InterruptedException {
        cases.clickNew();
        hooks.takeScreenshot(hooks.scenario);
    }
    @Then("I will create a new case with {string} and {string} and verify it")
    public void i_will_create_a_new_case_and_verify_it(String contactname, String accountname) throws InterruptedException {
        cases.createCase(contactname,accountname);
        hooks.takeScreenshot(hooks.scenario);
        cases.clickSaveBtn();
        String actlSubject = cases.getActualSubject();
        System.out.println("The expected subject is >>>>> " + exptdSubject);
        System.out.println("The actual subject is >>>>> " + actlSubject);
        try {
            Assert.assertEquals(actlSubject, exptdSubject, "Subject is not as expected");
            genericFunctions.logToExtentReport("Pass", "Subject verification successful. Expected and actual names match.");
        } catch (AssertionError e) {
            genericFunctions.logToExtentReport("Fail", "Subject verification failed. Expected: " + exptdSubject + ", but found: " + actlSubject);
            throw e;
        }

    }

    //  Edit case owner

    @When("I click on Edit Case Owner")
    public void i_click_on_edit_case_owner() throws InterruptedException {
        cases.clickEditOwner();
    }
    @And("I remove Owner")
    public void i_remove_owner() throws InterruptedException {
        cases.deleteOwner();
    }
    @And("I click Users")
    public void i_click_users() throws InterruptedException {
        cases.clickUsers();
        hooks.takeScreenshot(hooks.scenario);

    }
    @And("I select Queues from dropdown")
    public void i_select_queues() throws InterruptedException {
        cases.changeToQueues();
        hooks.takeScreenshot(hooks.scenario);
    }
    @When("I search for Owner {string}")
    public void i_search_for_owner(String ownerName) throws InterruptedException {
        cases.clickSearch(ownerName);

    }
    @And("I click on Owner from dropdown and save it")
    public void i_click_on_owner() throws InterruptedException {
        cases.selectOwnerFromDropdown();
        hooks.takeScreenshot(hooks.scenario);
    }

    @Then("I verify Case Owner")
    public void i_verify_case_owner() throws InterruptedException {
        String actlOwner = cases.checkOwner();
        System.out.println(">>>>>>>>>>>>>>>>>" +actlOwner);
//        Assert.assertEquals(actlOwner,exptdOwner,"Owner name not match");

        try {
            Assert.assertEquals(actlOwner,exptdOwner,"Owner name not match.Case assignment failed");
            genericFunctions.logToExtentReport("Pass", "Owner name matches and Case assignment passed");
        } catch (AssertionError e) {
            genericFunctions.logToExtentReport("Fail", "Owner name verification failed. Expected: " + exptdOwner + ", but found: " + actlOwner);
            throw e;
        }
    }


}

