package com.frameium.stepdef.ODBM;

import com.frameium.genericfunctions.GenericFunctions;
import com.frameium.pageobject.ODBM.ODBMEmail;
import com.frameium.pageobject.ODBM.ODBMGodHear;
import com.frameium.stepdef.Hooks;
import com.frameium.stepdef.TestSetUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;

public class OurMinistryGodHearTest {
    Hooks hooks = new Hooks();
    TestSetUp setUp;
    GenericFunctions genericFunctions;
    WebDriver driver;
    ODBMGodHear god;
    int NameLength = 6;
    private String subscriberName;
    ODBMEmail mail;

    public OurMinistryGodHearTest(TestSetUp setUp){
        this.setUp = setUp;
        this.driver = setUp.baseTest.driver;
        genericFunctions = new GenericFunctions(setUp.baseTest.getDriver());
        god = new ODBMGodHear(setUp.baseTest.driver);
        mail = new ODBMEmail(setUp.baseTest.driver);
        hooks = new Hooks();
    }

    @When("user validate and click the Podcast then enter any episode")
    public void userValidateAndClickThePodcastThenEnterAnyEpisode() throws Exception {
       // Thread.sleep(5000);
        god.podCasts("Raising teens");
      //  Thread.sleep(2000);

    }

    @Then("user validating the audio file whether it is able to play and pause")
    public void userValidatingTheAudioFileWhetherItIsAbleToPlayAndPause()throws Exception {
        god.audioPlayPause();
    }

    @Then("user should validate the clicking forward button at multiple times")
    public void userShouldValidateTheClickingTheForwardButtonAtMultipleTimes()throws Exception {
        Thread.sleep(5000);
        god.forwardPlayClick();
    }

    @And("user should validate the clicking rewind button at multiple times")
    public void userShouldValidateTheClickingRewindButtonAtMultipleTimes() throws Exception{
        Thread.sleep(2000);
        god.rewindPlayClick();
    }

    @And("user verify the playback speed {string} of the audio file")
    public void userVerifyThePlaybackSpeedOfTheAudioFile(int speed) throws Exception {
        god.speedPlay(speed);
    }

    @Then("user verifying the audio is playing by checking initial and updated time")
    public void userVerifyingTheAudioIsPlayingByCheckingInitialAndUpdatedTime() throws Exception{
        god.audioPlay();
    }

    @Then("user click the Forward button with fifteen seconds")
    public void userClickTheForwardButtonWithSeconds() throws Exception{
        god.clickForwardButton();
    }

    @And("also user verify the Rewind button with fifteen seconds of duration")
    public void alsoUserVerifyTheRewindButtonWithSecondsOfDuration() throws Exception {
        god.clickRewindButton();
    }


    @When("user validate and click the Podcast then enter any episode {string} option")
    public void userValidateAndClickThePodcastThenEnterAnyEpisodeOption(String episodes) throws Exception {
        god.podCasts(episodes);
    }



}
