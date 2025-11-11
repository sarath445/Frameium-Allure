package com.frameium.stepdef.SalesforceService;

import com.frameium.genericfunctions.GenericFunctions;
import com.frameium.pageobject.SalesforceService.KnowledgeArticleVersioning;
import com.frameium.stepdef.Hooks;
import com.frameium.stepdef.TestSetUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.net.MalformedURLException;

public class KnowledgeArticleVersioningTest {

    private KnowledgeArticleVersioning knowledgeVer;
    private WebDriver driver;
    private String exptdVer = "2";
    TestSetUp setUp;
    private GenericFunctions genericFunctions;
    Hooks hooks = new Hooks();
    public KnowledgeArticleVersioningTest(TestSetUp setUp) throws MalformedURLException {
        this.setUp = setUp;
        genericFunctions = new GenericFunctions(setUp.baseTest.driver);
        knowledgeVer = new KnowledgeArticleVersioning(setUp.baseTest.driver);
        // Assign the driver from setUp to the local driver variable
        this.driver = setUp.baseTest.driver;
    }

    @When("I click Edit button and navigate to the edit page")
    public void i_click_edit_button_and_navigate_to_the_edit_page() throws InterruptedException {
        knowledgeVer.clickEditBtn();
    }

    @And("I make some changes and save it")
    public void i_make_some_changes_and_save_it() throws InterruptedException {
        knowledgeVer.makeChanges();
        hooks.takeScreenshot(hooks.scenario);
        knowledgeVer.clickSaveBtn();

    }

    @Then("I publish and verify the incremented version number")
    public void i_verify_the_incremented_version_number() throws InterruptedException {
        String actlVer = knowledgeVer.verifyVersion();
        System.out.println(">>>>>>>>>>>>>>>>>" + actlVer);
        try {
            Assert.assertEquals(actlVer, exptdVer, "Version does not match");
            genericFunctions.logToExtentReport("Pass", "Version verification successful. Expected and actual versions match.");
        } catch (AssertionError e) {
            genericFunctions.logToExtentReport("Fail", "Version verification failed. Expected: " + exptdVer + ", but found: " + actlVer);
            throw e;
        }

    }
}
