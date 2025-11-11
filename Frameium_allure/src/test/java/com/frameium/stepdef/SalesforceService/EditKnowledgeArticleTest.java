package com.frameium.stepdef.SalesforceService;
import com.frameium.genericfunctions.GenericFunctions;
import com.frameium.pageobject.SalesforceService.EditKnowledgeArticle;
import com.frameium.pageobject.SalesforceService.KnowledgeArticle;
import com.frameium.stepdef.Hooks;
import com.frameium.stepdef.TestSetUp;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class EditKnowledgeArticleTest {
    private EditKnowledgeArticle editka;
    private KnowledgeArticle ka;
    private WebDriver driver;
    TestSetUp setUp;
    private GenericFunctions genericFunctions;
    Hooks hooks = new Hooks();
    public EditKnowledgeArticleTest(TestSetUp setUp) throws MalformedURLException {
        this.setUp = setUp;
        genericFunctions = new GenericFunctions(setUp.baseTest.driver);
        editka = new EditKnowledgeArticle(setUp.baseTest.driver);
        ka = new KnowledgeArticle(setUp.baseTest.driver);
        // Assign the driver from setUp to the local driver variable
        this.driver = setUp.baseTest.driver;
    }

    @Given("user is on created knowledge article screen")
    public void user_is_on_created_knowledge_article_screen() {

    }
    @When("I click on edit")
    public void i_click_on_edit() throws InterruptedException {
        editka.clickEdit();
    }
    @When("I am  able to edit answer field")
    public void i_am_able_to_edit_answer_field() throws InterruptedException {
        editka.clickEdit();
        editka.clickEditAnswer();
        hooks.takeScreenshot(hooks.scenario);
    }
    @Then("I click on save")
    public void i_click_on_save() {
        ka.saveKnowledge();
    }
}