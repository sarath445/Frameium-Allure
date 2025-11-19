package com.frameium.pageobject.ODBM;

import com.frameium.genericfunctions.GenericFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import static com.frameium.pageobject.ODBM.BreadWebElements.ministries;

public class OurMinistryReclaimToday extends GenericFunctions {
      WebDriver driver;
     GenericFunctions genericFunctions;
     WebDriverWait wait;

     //creating constructor.
    public OurMinistryReclaimToday(WebDriver driver){
        this.driver = driver;
        genericFunctions = new GenericFunctions(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }

    public void selectOurministry(String ministry) {
        Actions act = new Actions(driver);
        WebElement breadminis = driver.findElement(By.xpath(ministries));
        act.moveToElement(breadminis).build().perform();

        List<WebElement> searchResults = driver.findElements(By.xpath(BreadWebElements.ourMinistry));

        for (WebElement result : searchResults) {

            String text = result.getText();

            System.out.println("text >> " + text);

            if (text.equalsIgnoreCase(ministry)) {
                result.click();
                String parentWindow = driver.getWindowHandle();    //getting current window.
                Set<String> windowHandles = driver.getWindowHandles(); // Get all window handles

                for (String handle : windowHandles) {
                    if (!handle.equals(parentWindow)) {
                        driver.switchTo().window(handle); // Switch to new tab
                        System.out.println("Switched to new tab.");
                    }
                }

                break;

            }

        }
    }

    public void passingInputEnters(String searchtitle) throws Exception {
        Thread.sleep(5000);
        WebElement searchEle = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(BreadWebElements.searchReclaim)));
        genericFunctions.passingInputEnter(searchEle, searchtitle);

    }
    public boolean setToggle(boolean enable)throws Exception{
        try{
            WebElement togglele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BreadWebElements.toggleBtnss)));
            return toggleBtn(togglele, enable);
        }
        catch (Exception e){
            System.out.println("toggle button is vanished");
            return false;
        }

    }

    public void authorSelection(String nameOfAuthor)throws Exception{
        try{
            WebElement formSubmit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BreadWebElements.submitform)));
            WebElement imagele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BreadWebElements.articleImage)));
            List<WebElement> authorResult = driver.findElements(By.xpath(BreadWebElements.authorNames));
            for (WebElement options : authorResult){
                String text = options.getText();
                if(text.equalsIgnoreCase(nameOfAuthor)){
                    options.click();
                }
            }
            submitGodhears(formSubmit);
            Thread.sleep(2000);
            imagele.click();

        }
        catch (Exception e){
            System.out.println("authornames are not found" + e.getMessage());
        }
    }

    public boolean moreOptions()throws Exception{
        try{
            WebElement morele = driver.findElement(By.xpath(BreadWebElements.moreOption));
            if(morele.isEnabled()){
                clickElement(morele);
                System.out.println("more option is enable");
                return true;
            }
            else {
                System.out.println("more option is disabled");
                return false;
            }
        }
        catch (Exception e){
            System.out.println("Exception error " +e.getMessage());
            return false;

        }
    }

    public void moreWords()throws Exception{
        try {
            List<WebElement> wordsMore = driver.findElements(By.xpath(BreadWebElements.moreWordss));
            for(WebElement options : wordsMore){
                String text = options.getText();
                System.out.println("list of words are:" + text);
            }
        }
        catch (Exception e){
            System.out.println("words are not found" + e.getMessage());
        }

    }

}
