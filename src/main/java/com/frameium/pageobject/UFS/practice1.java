package com.frameium.pageobject.UFS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice1 {

    public static  void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.co.in/");
driver.manage().window().maximize();
driver.navigate().refresh();
driver.navigate().to("https://www.google.co.in/search?q=mukesh+ambani&sca_esv=d0a9eaf1d562b5fc&source=hp&ei=VjsbZ9CVF6Li2roP2KvZ-Ac&iflsig=AL9hbdgAAAAAZxtJZttKOBYwWMZ5Cd8085hJ-aVDsVGh&gs_ssp=eJzj4tTP1TcwSS8uSjdg9OLNLc1OLc5QSMxNSszLBABsQwiT&oq=&gs_lp=Egdnd3Mtd2l6IgAqAggBMhAQLhgDGOUCGOoCGIwDGI8BMhAQLhgDGOUCGOoCGIwDGI8BMhAQLhgDGOUCGOoCGIwDGI8BMhAQABgDGOUCGOoCGIwDGI8BMhAQABgDGOUCGOoCGIwDGI8BMhAQABgDGOUCGOoCGIwDGI8BMhAQABgDGOUCGOoCGIwDGI8BMhAQABgDGOUCGOoCGIwDGI8BMhAQABgDGOUCGOoCGIwDGI8BMhAQABgDGOUCGOoCGIwDGI8BSO8MUABYAHABeACQAQCYAQCgAQCqAQC4AQHIAQCYAgGgAiOoAgqYAyOSBwExoAcA&sclient=gws-wiz");
        driver.navigate().back();
        WebElement googgle=driver.findElement(By.xpath("//*[@class='gLFyf']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].style.border='2.5px solid red'",googgle);
        driver.navigate().forward();
        WebElement googgleimg=driver.findElement(By.xpath("  (//*[@class='SJajHc NVbCr'])[1]"));
        js.executeScript("arguments[0].scrollIntoView(true);",googgleimg);
        driver.navigate().refresh();
        driver.manage().window().minimize();
        driver.manage().window().maximize();
        Actions act=new Actions(driver);
        Thread.sleep(1000);
        act.keyDown(Keys.ARROW_UP).keyUp(Keys.ARROW_UP).perform();

    }


}
