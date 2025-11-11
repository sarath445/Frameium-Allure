package com.frameium.pageobject.SalesforceService;

import com.frameium.genericfunctions.GenericFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditKnowledgeArticle extends GenericFunctions {
    private WebDriver driver;


    private By editbtn = By.xpath("//button[text()='Edit']");
    private By enterAnswer = By.xpath("//body[contains(@aria-label,'Rich Text Area.')]");
    private By goToiFrame2 = By.xpath("(//iframe[@title='Rich Text Area'])[2]");

    public EditKnowledgeArticle(WebDriver driver){
        this.driver = driver;
    }

    public void clickEdit() throws InterruptedException {
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(editbtn));
        Thread.sleep(2000);
        //waitForByElement(editbtn);
        //clickElementUsingJavaScript(driver.findElement(editbtn));
        clickDynamicElement(editbtn);
    }
    public void inputAnswer(String answer)
    {
        enterKeys(enterAnswer,answer);
    }
    public void clickEditAnswer() throws InterruptedException {
        Thread.sleep(5000);
        scrollDownVertically();
        WebElement eleFrame2 = driver.findElement(goToiFrame2);
        driver.switchTo().frame(eleFrame2);
        clickElementUsingJavaScript(driver.findElement(enterAnswer));
        inputAnswer("\n" +
                "Click on reset password");
        driver.switchTo().defaultContent();
    }
}
