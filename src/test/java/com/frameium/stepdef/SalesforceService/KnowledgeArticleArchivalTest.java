package com.frameium.stepdef.SalesforceService;

import com.frameium.genericfunctions.GenericFunctions;
import com.frameium.pageobject.SalesforceService.KnowledgeArticle;
import com.frameium.pageobject.SalesforceService.KnowledgeArticleArchival;
import com.frameium.stepdef.Hooks;
import com.frameium.stepdef.TestSetUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.net.MalformedURLException;

public class KnowledgeArticleArchivalTest {

    private final KnowledgeArticleArchival knowledgeArch;
    private KnowledgeArticle knowledge;
    private WebDriver driver;
    private String exptdStatus = "Archived";


    TestSetUp setUp;

    private GenericFunctions genericFunctions;
    Hooks hooks = new Hooks();
    public KnowledgeArticleArchivalTest(TestSetUp setUp) throws MalformedURLException {
        this.setUp = setUp;
        genericFunctions = new GenericFunctions(setUp.baseTest.driver);
        knowledgeArch = new KnowledgeArticleArchival(setUp.baseTest.driver);
        // Assign the driver from setUp to the local driver variable
        this.driver = setUp.baseTest.driver;
    }

    @Then("I go to the published article")
    public void i_go_to_the_published_article() {
        knowledgeArch.navigateBackToKnowledge();

    }

    @And("I click on Archive button")
    public void i_click_on_archive_button() throws InterruptedException {
        knowledgeArch.clickArchive();
        hooks.takeScreenshot(hooks.scenario);
    }


    @Then("I verify publication status")
    public void i_verify_publication_status() throws InterruptedException {
       // knowledgeArch.checkPublicationStatus();
        String actlStatus = knowledgeArch.checkPublicationStatus();
        System.out.println(">>>>>>>>>>>>>>>>>" +actlStatus);
//        Assert.assertEquals(actlOwner,exptdOwner,"Owner name not match");

        try {
            Assert.assertEquals(actlStatus,exptdStatus,"Publication status doesn't match and Archival failed");
            genericFunctions.logToExtentReport("Pass", "Publication status matches and Archival passed");
        } catch (AssertionError e) {
            genericFunctions.logToExtentReport("Fail", "Publication status verification failed. Expected: " + exptdStatus + ", but found: " + actlStatus);
            throw e;
        }
    }
    }



