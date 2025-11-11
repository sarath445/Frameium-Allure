package com.frameium.stepdef.SalesforceService;

import com.frameium.genericfunctions.GenericFunctions;
import com.frameium.pageobject.SalesforceService.Case;
import com.frameium.pageobject.SalesforceService.SkillBasedRouting;
import com.frameium.stepdef.Hooks;
import com.frameium.stepdef.TestSetUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.net.MalformedURLException;

public class SkillBasedRoutingTest {

    String expectedOwner = "Georgian Thomas";

    private WebDriver driver;
    Hooks hooks = new Hooks();
    private SkillBasedRouting skill;
    private Case cs;
    TestSetUp setUp;
    private GenericFunctions genericFunctions;
    public SkillBasedRoutingTest(TestSetUp setUp) throws MalformedURLException {
        this.setUp = setUp;
        genericFunctions = new GenericFunctions(setUp.baseTest.driver);
        skill=new SkillBasedRouting(setUp.baseTest.driver);
        cs=new Case(setUp.baseTest.driver);
        // Assign the driver from setUp to the local driver variable
        this.driver = setUp.baseTest.driver;
    }


    @Then("I will go to the case page and create a new case  with {string}, {string}, {string} and {string}")
    public void i_will_go_to_the_case_page_and_create_a_new_case_with_and(String contactname, String accountname, String type, String reason) throws InterruptedException {
        skill.createNewCase(contactname,accountname,type,reason);
    }

    @And("I will change the owner name to {string}")
    public void i_will_change_the_owner_name_to(String ownername) throws InterruptedException {
        skill.removeOwner();
        skill.changeOwnername(ownername);
        hooks.takeScreenshot(hooks.scenario);
    }

    @And("I will go to the omnichannel to made the status available")
    public void i_will_go_to_the_omnichannel_to_made_the_status_available() throws InterruptedException {
        skill.omnichannelSetup();
        hooks.takeScreenshot(hooks.scenario);

    }

    @Then("I change the owner and select the queue {string} that is configured for routing based on skills")
    public void i_change_the_owner_and_select_the_queue_that_is_configured_for_routing_based_on_skills(String queuename) throws InterruptedException {
        skill.selectQueue(queuename);
        Thread.sleep(3000);
        hooks.takeScreenshot(hooks.scenario);

    }

    @Then("I Verify that case is routed to right skilled agent based on type {string} and reason {string}")
    public void i_verify_that_case_is_routed_to_right_skilled_agent(String type, String reason) throws InterruptedException {
        String actualOwner = skill.verifyOwnerName(type,reason);
        System.out.println(">>>>>>>>>>  owner >>>>>>>>>>>>>>" +actualOwner);

        try {
            // Assert that the actual owner matches the expected owner
            Assert.assertEquals(actualOwner, expectedOwner, "Owner name is not as expected");
            genericFunctions.logToExtentReport("Pass", "Owner verification successful. Expected and actual names match.");
        } catch (AssertionError e) {
            genericFunctions.logToExtentReport("Fail", "Owner verification failed. Expected: " + expectedOwner + ", but found: " + actualOwner);
            throw e;
        }

    }
}
