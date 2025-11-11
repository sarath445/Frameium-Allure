package com.frameium.stepdef.SalesforceService;

import com.frameium.genericfunctions.GenericFunctions;
import com.frameium.pageobject.SalesforceService.KnowledgeArticle;
import com.frameium.stepdef.Hooks;
import com.frameium.stepdef.TestSetUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.IOException;
import java.net.MalformedURLException;

public class KnowledgeArticleTest  {

    private KnowledgeArticle knowledge;
    private WebDriver driver;
    private String exptdTitle = "Password Reset";
    private String exptdVer = "2";
    TestSetUp setUp;
    private GenericFunctions genericFunctions;
    Hooks hooks = new Hooks();
    public KnowledgeArticleTest(TestSetUp setUp) throws MalformedURLException {
        this.setUp = setUp;
        genericFunctions = new GenericFunctions(setUp.baseTest.driver);
        knowledge = new KnowledgeArticle(setUp.baseTest.driver);
        // Assign the driver from setUp to the local driver variable
        this.driver = setUp.baseTest.driver;
    }

    @Then("I go to the Knowledge page")
    public void i_go_to_the_knowledge_page() throws InterruptedException, IOException {
        knowledge.switchToKnowledge();
    }

    @And("I click on New button")
    public void i_click_on_new_button() {
        knowledge.clickNewBtn();
        hooks.takeScreenshot(hooks.scenario);
    }

    @Then("I will create a new Knowledge article with {string} and {string}")
    public void i_will_create_a_new_knowledge_article_and_verify_it(String title, String url) throws InterruptedException {
        knowledge.createKnowledge(title,url);
        hooks.takeScreenshot(hooks.scenario);
        knowledge.saveKnowledge();
        }

    @Then("I verify the created knowledge with {string}")
    public void iVerifyTheCreatedKnowledgeWith(String title) {
        String actTitle = knowledge.getActTitle();
        System.out.println(">>>>>>>>>>>>>>>>>" + actTitle);
        try {
            Assert.assertEquals(actTitle, title, "Title name does not match");
            genericFunctions.logToExtentReport("Pass", "Title verification successful. Expected and actual titles match.");
        } catch (AssertionError e) {
            genericFunctions.logToExtentReport("Fail", "Title verification failed. Expected: " + title + ", but found: " + actTitle);
            throw e;
        }
    }
}
