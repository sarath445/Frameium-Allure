package com.frameium.pageobject.Bromcom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BromcomHome {
    static WebDriver driver;
    int brokenLinks = 0;
    int goodLinks = 0;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://bromcom.com/");
        driver.manage().window().maximize();
        BromcomHome obj1 = new BromcomHome();
        obj1.brokenLinks();


    }
    public void brokenLinks(){
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("total links"+ links.size());

        for (WebElement link : links) {

            String url = link.getAttribute("href");

            if (url == null || url.isEmpty() || url.startsWith("javascript")) {
                System.out.println("Skipping invalid link: " + url);
                continue;
            }

            try {
                HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
                conn.setRequestMethod("HEAD");
                conn.connect();

                int responseCode = conn.getResponseCode();

                if (responseCode >= 400) {
                    //System.out.println("❌ Broken Link: " + url + " | Code: " + responseCode);
                    System.out.println("Broken links " + url);
                    brokenLinks++;
                } else {
                    //System.out.println("✔ Valid Link: " + url + " | Code: " + responseCode);
                    System.out.println(" not a Broken links " + url);
                    goodLinks++;
                }

            } catch (Exception e) {
                System.out.println("❌ Exception for: " + url);
            }

        }
        System.out.println("total no.of brokenLinks in the url" + brokenLinks);
        System.out.println(("total no.of goodlinks in the url " + goodLinks));
    }



}
