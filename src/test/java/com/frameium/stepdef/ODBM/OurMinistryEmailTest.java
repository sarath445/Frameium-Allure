package com.frameium.stepdef.ODBM;

import com.frameium.genericfunctions.GenericFunctions;
import com.frameium.pageobject.ODBM.ODBMEmail;
import com.frameium.pageobject.ODBM.ODBMLanguage;
import com.frameium.pageobject.ODBM.ODBMPrint;
import com.frameium.stepdef.Hooks;
import com.frameium.stepdef.TestSetUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class OurMinistryEmailTest {
    Hooks hooks = new Hooks();
    TestSetUp setUp;
    GenericFunctions genericFunctions;
    WebDriver driver;
    ODBMEmail mail;
    int NameLength = 6;
    private String subscriberdetails;
    private String generatedMail;
    ODBMPrint print;
    ODBMLanguage language;

    public OurMinistryEmailTest(TestSetUp setUp){
        this.driver = setUp.baseTest.driver;
        this.setUp = setUp;
        genericFunctions = new GenericFunctions(setUp.baseTest.driver);
        mail = new ODBMEmail(setUp.baseTest.driver);
        print = new ODBMPrint(setUp.baseTest.driver);
        language = new ODBMLanguage(setUp.baseTest.driver);
    }

    @When("user entering random firstnames {string} format with first name length {int}, lastname length {int}, and email type {string}")
    public void userEnteringRandomFirstnamesFormatWithFirstNameLengthLastnameLengthAndEmailType(String formatfirst, int Namelength, int lastLength, String mailType)throws Exception {
        this.NameLength = Namelength;
        subscriberdetails = mail.emailSubscription(formatfirst,Namelength,lastLength,mailType);
        System.out.println("subscriber details " + subscriberdetails);
    }

    @When("user click on the email subscriber")
    public void userClickOnTheEmailSubscriber() {
        mail.startEmailsubscribe();
    }

    @Then("user entering random firstnames {string} format with first name length {int}")
    public void userEnteringRandomFirstnamesFormatWithFirstNameLength(String formatfirst, int Namelength, int lastLength,String mailType) throws Exception{
        this.NameLength = Namelength;
        subscriberdetails = mail.emailSubscription(formatfirst, Namelength, lastLength,mailType);
        System.out.println("subscriber name " + subscriberdetails);
    }

    @And("user click subscribe the details")
    public void userClickSubscribeTheDetails() throws Exception {
        mail.suscribeAction();
    }

    @Then("user verify the successful message")
    public void userVerifyTheSuccessfulMessage() {
        String Actualsuccessfulmsg = mail.getSubscribermsg();

    }

    @Then("user verify the successful message {string}")
    public void userVerifyTheSuccessfulMessage(String expectedMsg) {
        String Actualsuccessfulmsg = mail.getSubscribermsg();
        System.out.println("Actual message " + Actualsuccessfulmsg);
        Assert.assertEquals(expectedMsg, Actualsuccessfulmsg, "subscriber message doesn't match");
    }


    @When("User click on the print subscriber")
    public void user_click_on_the_print_subscriber() throws Exception {
        print.startPrintsubscribe();
    }

    @Then("user validate and click the start monthly subscription")
    public void userValidateAndClickTheStartMonthlySubscription() throws Exception {
        print.startMonthlysubscrib();
    }

    @And("user verify all the offers in the page")
    public void userVerifyAllTheOffersInThePage() throws Exception{
        Thread.sleep(2000);
        print.vfyAlloffers();
    }

    @When("user proceeding with the language selection of {string}")
    public void userProceedingWithTheLanguageSelectionOf(String languages)throws Exception {
        Thread.sleep(2000);
        language.languageSelection(languages);
    }

    @When("user proceeding with the multiple language selection of {string}")
    public void userProceedingWithTheMultipleLanguageSelectionOf(String languages) throws Exception {
        Thread.sleep(3000);
        language.languageSelection(languages);
     //   hooks.closeDriver();
    }

    @Then("user should verify the current domain while redirecting {string}")
    public void userShouldVerifyTheCurrentDomainWhileRedirecting(String expectedDomain) throws Exception {
        Assert.assertTrue(language.isDomainChangeTo(expectedDomain), "domain url is not matching");
    }

    @Then("user select the daily bread category as based on the language")
    public void userSelectTheDailyBreadCategoryAsBasedOnTheLanguage()throws Exception{
        language.categoryselection();
    }


//    @When("user proceeding with language selection")
//    public void userProceedingWithLanguageSelection() throws Exception{
//        Thread.sleep(2000);
//        language.languageSelection();
//    }
}

