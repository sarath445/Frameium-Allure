package com.frameium.stepdef.SalesforceService;

import com.frameium.genericfunctions.GenericFunctions;
import com.frameium.pageobject.SalesforceService.PublishKnowledgeArticle;
import com.frameium.stepdef.Hooks;
import com.frameium.stepdef.TestSetUp;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.net.MalformedURLException;

public class PublishKnowledgeArticleTest {

    private PublishKnowledgeArticle pka;
    private WebDriver driver;
    private String expPublishMsg = "Success! \"Password Reset\" has been published.";
    private String expStatus = "Published";
    TestSetUp setUp;
    private GenericFunctions genericFunctions;
    Hooks hooks = new Hooks();
    public PublishKnowledgeArticleTest(TestSetUp setUp) throws MalformedURLException {
        this.setUp = setUp;
        genericFunctions = new GenericFunctions(setUp.baseTest.driver);
        pka = new PublishKnowledgeArticle(setUp.baseTest.driver);
        this.driver = setUp.baseTest.driver;
    }

    @When("I click on publish")
    public void i_click_on_publish() throws InterruptedException {
        pka.clickPublish();
        hooks.takeScreenshot(hooks.scenario);
    }

    @And("I Click on publish button")
    public void i_click_on_publish_button() {
        pka.clickPublishBtn();
        hooks.takeScreenshot(hooks.scenario);
    }
    @Then("I verify the Publish message")
    public void i_verify_the_publish_message() throws InterruptedException {
        String actPublishMsg = pka.verifyPublishMsg();
        System.out.println("The actual Message is >>>>>>" + actPublishMsg);
        try {
            Assert.assertEquals(actPublishMsg, expPublishMsg, "Publish message is not as expected");
            genericFunctions.logToExtentReport("Pass", "Publish message verification successful. Expected and actual messages match.");
        } catch (AssertionError e) {
            genericFunctions.logToExtentReport("Fail", "Publish message verification failed. Expected: " + expPublishMsg + ", but found: " + actPublishMsg);
            throw e;
        }
    }

    @And("I verify Publication Status")
    public void i_verify_Publication_Status() throws InterruptedException {
        Thread.sleep(2000);
        String actStatus = pka.verifyStatus();
        System.out.println("The actual status is>>>>>>>>"+actStatus);
        try {
            Assert.assertEquals(actStatus, expStatus, "Status of the knowledge article is not as expected");
            genericFunctions.logToExtentReport("Pass", "Status verification successful. Expected and actual statuses match.");
        } catch (AssertionError e) {
            genericFunctions.logToExtentReport("Fail", "Status verification failed. Expected: " + expStatus + ", but found: " + actStatus);
            throw e;
        }
    }

}