package com.frameium.pageobject.UFS;

import com.google.common.io.Files;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class practice {
    public static void main(String args[]) throws InterruptedException, IOException {
        //WebDriverManager.chromedriver().driverVersion("130.0.0").setup();
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        WebElement search=driver.findElement(By.xpath("//*[@title='Search']"));
        search.sendKeys("hello", Keys.ENTER);
        //WebElement google=driver.findElement(By.xpath("//*[@title='Go to Google Home']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500);");
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        js.executeScript("window.scrollBy(-100,0);");
        WebElement googlee=driver.findElement(By.xpath("(//*[text()='Images'])[1]"));
        Thread.sleep(1000);
        js.executeScript("arguments[0].scrollIntoView(true);", googlee);

        TakesScreenshot ts=(TakesScreenshot)driver;
        File Screenshot=ts.getScreenshotAs(OutputType.FILE);
        File destination=new File("D:\\frameium\\Frameium_allure\\screen\\file.png");
        Files.copy(Screenshot,destination);
        WebElement element=driver.findElement(By.xpath("(//div[text()='Videos']//following::*)[11]"));
        Actions a1=new Actions(driver);
        a1.moveToElement(element);
        Thread.sleep(1000);
        driver.manage().window().maximize();
       // a1.click(element).perform();
        a1.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.dd_MM_HH_mm");
        String timestamp = LocalDateTime.now().format(formatter);

        File destination2=new File("D:\\frameium\\Frameium_allure\\screen\\file"+timestamp+".png");
        File Screenshot2=ts.getScreenshotAs(OutputType.FILE);
        Files.copy(Screenshot2,destination2);
       // reverse();

        //random();


    }


    public static void reverse() {
        int a = 4567;
        int reversed = 0;
        while (a != 0) {
            int digit = a % 10;
            reversed = reversed * 10 + digit;
            a = a / 10;
        }
        System.out.println(reversed);
      //  oddandeven();


    }

    public static void oddandeven() {

        int a = 56675574;
        char Arrray[] = String.valueOf(a).toCharArray();
        Map<String, Integer> map = new HashMap<>();
        map.put("odd", 0);
        map.put("even", 0);
        for (char ch : Arrray) {
            int digit = Character.getNumericValue(ch);
            if (digit % 2 == 0) {
                map.put("even", map.get("even") + 1);
            } else {
                map.put("odd", map.get("odd") + 1);

            }
        }
            System.out.println("Count of even numbers:" + map.get("even"));

            System.out.println("Count of odd numbers:" + map.get("odd"));



    }
    public static void random(){
        Random random = new Random();
        int randomint=random.nextInt();
        System.out.println(randomint);
        int randomIntBounded = random.nextInt(100);
        System.out.println("Random Integer (0-99): " + randomIntBounded);

    }


}