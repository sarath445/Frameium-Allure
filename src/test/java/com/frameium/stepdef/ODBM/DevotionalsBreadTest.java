package com.frameium.stepdef.ODBM;

import com.frameium.genericfunctions.GenericFunctions;
import com.frameium.logger.LoggerHelper;
import com.frameium.pageobject.ODBM.ODBMDevotional;
import com.frameium.stepdef.Hooks;
import com.frameium.stepdef.TestSetUp;
import io.cucumber.java.en.*;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DevotionalsBreadTest {
    private Logger log = LoggerHelper.getLogger(GenericFunctions.class);
    Hooks hooks= new Hooks();
    TestSetUp setUp;
    WebDriver driver;
    GenericFunctions genericFunctions;
    ODBMDevotional devotional;

    public DevotionalsBreadTest(TestSetUp setUp){
        this.driver = setUp.baseTest.driver;
        this.setUp = setUp;
        genericFunctions = new GenericFunctions(setUp.baseTest.driver);
        devotional = new ODBMDevotional(setUp.baseTest.driver);
    }

    @When("User mouseover to Daily devotionals and click the {string} option")
    public void userMouseoverToDailyDevotionalsAndClickTheOption(String category) throws Exception {
        devotional.dailyDevotionals(category);
        setUp.baseTest.takeScreenshot();
    }

    @Then("it navigates to new page and validates the image as displayed and load properly")
    public void itNavigatesToNewPageAndValidatesTheImageAsDisplayedAndLoadProperly() {
        Assert.assertTrue(devotional.isImageDisplay(), "image is not displayed");
        Assert.assertTrue(devotional.isImageLoad(), "image is not loading properly");
    }

    @And("user able to pick date from calendar with given {string}")
    public void userAbleToPickDateFromCalendarWithGiven(String fromDates)throws Exception {
        devotional.fromDatePicking(fromDates);

    }
    @And("user able to pick toDate from calendar with given {string}")
    public void userAbleToPickToDateFromCalendarWithGiven(String toDates) throws Exception{
        devotional.toDatepicking(toDates);

    }

    @Then("user verify the devotional contents after selecting dates")
    public void userVerifyTheDevotionalContentsAfterSelectingDates()throws Exception {
        devotional.vfyAfterPickCalendar();
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }

    @Then("User click on the Explore option")
    public void userClickOnTheExploreOption()throws Exception {
        devotional.exploreOption();
    }

    @And("verify the text title of the screen {string}")
    public void verifyTheTextTitleOfTheScreen(String expectedText) {
        String actualText = devotional.getTextmsg();
        log.info("expected text " + expectedText);
        log.info("actual text " + actualText);
        Assert.assertEquals(actualText,expectedText, "headertext is not match");    //verification and validation by using Assertions
    }

    @Then("user search for a collection in the search field {string}")
    public void userSearchForACollectionInTheSearchField(String collectionName) throws Exception {
        devotional.collectionsSearch(collectionName);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }

    @And("user verify the images under the collections")
    public void userVerifyTheImagesUnderTheCollections(){
        devotional.allImagesverify();
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }

    @Then("User scroll and click on the instagram button which is on the Devotional")
    public void userScrollAndClickOnTheInstagramButtonWhichIsOnTheDevotional() throws Exception {
        devotional.instaCheck();
        setUp.baseTest.onDemandTakeScreenshot(">>>>>>");
    }


    @Then("User scroll and click on the social media button {string} option")
    public void userScrollAndClickOnTheSocialMediaButtonOption(String category) throws Exception {
        devotional.socialMediaCheck(category);

    }

//    @And("user is redirect to the social media page")
//    public void userIsRedirectToTheSocialMediaPage() {
//        devotional.redirectedTab();
//    }


    @And("user is redirect to the social media page with url containing {string}")
    public void userIsRedirectToTheSocialMediaPageWithUrlContaining(String expectedUrlPart) {
        String actualUrl = devotional.redirectedTab();
        Assert.assertTrue(actualUrl.contains(expectedUrlPart), "url is seems to be mismatched");
    }


}
