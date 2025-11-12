package com.frameium.pageobject.ODBM;

import com.frameium.genericfunctions.GenericFunctions;
import io.cucumber.java.sl.In;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.logging.Logger;

public class ODBMGodHear extends GenericFunctions {
    Logger log = Logger.getLogger(getClass().getName());
     WebDriver driver;
    GenericFunctions genericFunctions;
    WebDriverWait wait;
    JavascriptExecutor js;

    public ODBMGodHear(WebDriver driver) {
        this.driver = driver;
        genericFunctions = new GenericFunctions(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        js = (JavascriptExecutor) driver;
    }

    public void podCasts(String audioName) throws Exception {
        //try
            Thread.sleep(2000);
            WebElement podele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BreadWebElements.podcastbtn)));
            clickElement(podele);
            System.out.println("podcast button is clicked");
            log.info("podcast button clicked");
            Thread.sleep(5000);
            WebElement searchEle = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(BreadWebElements.episodeSearch)));
            passingInput(searchEle,audioName);
            log.info("Entered audio name in the field " + audioName);
            Thread.sleep(3000);
            try{
                WebElement voiceaydio = wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=" + "'" + audioName + "'" + "]"))));

                String text = voiceaydio.getText();

                if(text.equalsIgnoreCase(audioName)){
                    try {
                        mouseOver(voiceaydio);
                        scrollToElement(voiceaydio);
                        clickElement(voiceaydio);
                        Thread.sleep(3000);
                        log.info("clicked on the searched podcast" + audioName);
                    } catch (Exception e) {
                        voiceaydio.click();
                        mouseOver(voiceaydio);
                        clickElement(voiceaydio);
                        Thread.sleep(3000);
                        log.info("clicked on the searched podcast" + audioName);
                    }

                }
                else {
                    log.warning("podcast name mismatched " + "but found : " + voiceaydio.getText());
                }
            }
            catch (StaleElementReferenceException e){
                WebElement voiceaydio = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=" + "'" + audioName + "'" + "]")));
                String text = voiceaydio.getText();

                if(text.equalsIgnoreCase(audioName)){
                    voiceaydio.click();
                    Thread.sleep(3000);
                    log.info("clicked on the searched podcast" + audioName);
                }
                else {
                    log.warning("podcast name mismatched " + "but found : " + voiceaydio.getText());
                }
            }

        }
        //catch (TimeoutException e){
            //log.severe("due to timeout elements are waiting " + e.getMessage() );

        //catch (Exception e){
            //System.out.println(e.getMessage());




    public void audioPlayPause() throws Exception {
        try {
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(BreadWebElements.iframe)));
            WebElement playele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BreadWebElements.playBtn)));
            js.executeScript("arguments[0].click();", playele);
            //js.executeScript("arguments[0].play()", playele);
            //playele.click();
            log.info("Audio is playing....");
            Thread.sleep(5000);
            boolean isPlaying = (boolean) js.executeScript("return !arguments[0].paused;", playele);
            if (isPlaying) {
                System.out.println("audion is playing fine..");
            } else {
                System.out.println("audio is not playing...check");
            }
            js.executeScript("arguments[0].paused()", playele);
            System.out.println("audio is paused..");
            Thread.sleep(3000);
            boolean isPaused = (boolean) js.executeScript("return arguments[0].paused", playele);
            if (isPaused) {
                System.out.println("audio is paused successfully");
            } else {
                System.out.println("fail to pause audio");
            }
        } catch (Exception e) {
            System.out.println("play button not found" + e.getMessage());
            WebElement playele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BreadWebElements.playBtn)));
            playele.click();
        }
    }

    public boolean audioPlay() throws Exception {
        try {
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(BreadWebElements.iframe)));
            WebElement playele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BreadWebElements.playBtn)));
            WebElement audioCurrentTime = driver.findElement(By.xpath(BreadWebElements.audioCurrentTimeLocator));
            scrollToElement(playele);
            String Initialtime = audioCurrentTime.getText().trim();
            System.out.println("Initiating..." + Initialtime);

            js.executeScript("arguments[0].click();", playele);
            //js.executeScript("arguments[0].play()", playele);
            log.info("Audio is playing....");
            Thread.sleep(10000);
            WebElement updatedCurrenttime = driver.findElement(By.xpath(BreadWebElements.audioCurrentTimeLocator));
            String updatetime = updatedCurrenttime.getText().trim();
            System.out.println("updating..." + updatetime);

            boolean isPlaying = !Initialtime.equals(updatetime);
            if (isPlaying) {
                System.out.println("audion is playing fine..");
            } else {
                System.out.println("audio is not playing...check");
            }
            return isPlaying;

        } catch (Exception e) {
            System.out.println("play button not found" + e.getMessage());
            WebElement playele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BreadWebElements.playBtn)));
            playele.click();
        }
        return false;
    }

    public void forwardPlayClick() throws Exception {
            audioPlay();
        try {
            WebElement forwardele = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(BreadWebElements.forwardBtn)));
            for (int i = 0; i < 6; i++) {
                Thread.sleep(2000);
                //forwardele.click();
                js.executeScript("arguments[0].click(); ", forwardele);
                System.out.println("click using js " + (i + 1) + "times ");
                Thread.sleep(2500);    //wait 2 seconds between click.
            }
        } catch (Exception e) {
            System.out.println("forwardBtn is not found " + e.getMessage());

        }
    }

    public void rewindPlayClick() throws Exception {
        try {
            WebElement rewindele = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(BreadWebElements.rewindBtn)));
            for (int i = 0; i < 5; i++) {
                js.executeScript("arguments[0].click(); ", rewindele);
                System.out.println("Rewind button is clickable" + (i + 1) + "times ");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println("Rewind button is not found " + e.getMessage());

        }

    }

    public void speedPlay(int playback)throws Exception{
        try{
            WebElement speedele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BreadWebElements.speedBtn)));
            speedele.getAttribute("value");
            WebElement audioDuration = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(BreadWebElements.duration)));
            double playbackRate = (double) js.executeScript("return arguments[0].playbackRate;", audioDuration);
            if(playbackRate==playback){
                System.out.println("playspeed verification passed: " + playbackRate);
            }
            else {
                System.out.println("playbackspeed verification failed");
            }

        }
        catch (Exception e){
            System.out.println("element is not found " + e.getMessage());
        }

    }

    // Verify AudioIsPlaying</strong>
    public boolean verifyAudioIsPlaying()
    {
        WebElement playele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BreadWebElements.playBtn)));
        WebElement audioCurrentTime = driver.findElement(By.xpath(BreadWebElements.audioCurrentTimeLocator));
        String initialTime = audioCurrentTime.getText().trim();
        System.out.println("Initial time: " + initialTime);
        clickElement(playele);

        try {
            Thread.sleep(6000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement updatedAudioTime = driver.findElement(By.xpath(BreadWebElements.audioCurrentTimeLocator));
        String updatedTime = updatedAudioTime.getText().trim();
        System.out.println("Updated time: " + updatedTime);
        boolean isPlaying = !initialTime.equals(updatedTime);
        System.out.println("Is audio playing? " + isPlaying);
// Assert added here
        Assert.assertTrue(isPlaying, "Audio is not playing! Initial time and updated time are same.");
        return isPlaying;
    }

//Verify ForwardButton</strong>
    public void clickForwardButton()
    {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(BreadWebElements.iframe)));
        WebElement playele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BreadWebElements.playBtn)));
        clickElement(playele);
        WebElement btnForward = driver.findElement(By.xpath(BreadWebElements.forwardBtn));
        Assert.assertTrue(btnForward.isDisplayed(), "Forward button is not displayed");
// Capture current time
        String beforeClickTime = driver.findElement(By.xpath(BreadWebElements.audioCurrentTimeLocator)).getText().trim();
        System.out.println("Time before Forward click: " + beforeClickTime);
        btnForward.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e)
        {        e.printStackTrace();
        }
        String afterClickTime = driver.findElement(By.xpath(BreadWebElements.audioCurrentTimeLocator)).getText().trim();
        System.out.println("Time after Forward click: " + afterClickTime);
// Verify forward button moved the time forward
        Assert.assertTrue(compareTime(afterClickTime, beforeClickTime) > 0, "Forward button did not increase the audio time");
    }

//Verify RewindButton</strong>
    public void clickRewindButton()
    {
        WebElement btnRewind = driver.findElement(By.xpath(BreadWebElements.rewindBtn));
        Assert.assertTrue(btnRewind.isDisplayed(), "Rewind button is not displayed");
        String beforeClickTime = driver.findElement(By.xpath(BreadWebElements.audioCurrentTimeLocator)).getText().trim();
        System.out.println("Time before Rewind click: " + beforeClickTime);
        btnRewind.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e)
        {        e.printStackTrace();
        }
        String afterClickTime = driver.findElement(By.xpath(BreadWebElements.audioCurrentTimeLocator)).getText().trim();
        System.out.println("Time after Rewind click: " + afterClickTime);
// Verify rewind button moved the time backward
        Assert.assertTrue(compareTime(afterClickTime, beforeClickTime) < 0, "Rewind button did not decrease the audio time");
    }

    public int compareTime(String time1, String time2)
    {
        int seconds1 = convertToSeconds(time1);
        int seconds2 = convertToSeconds(time2);
        return Integer.compare(seconds1, seconds2);
    }

    public int convertToSeconds(String time)
    {
        String[] parts = time.split(":");
        int minutes = Integer.parseInt(parts[0]);
        int seconds = Integer.parseInt(parts[1]);
        return minutes * 60 + seconds;
    }

    public void graph(int source, int destination ){
        Actions act = new Actions(driver);
        WebElement graphele = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='highcharts-markers highcharts-series-0 highcharts-area-series highcharts-color-0 highcharts-tracker'])[4]/child::*[2]")));
        act.clickAndHold(graphele).moveByOffset(source, destination).release().build().perform();
        String graphText = graphele.getText().trim();
        mouseOver(graphele);

    }
}
