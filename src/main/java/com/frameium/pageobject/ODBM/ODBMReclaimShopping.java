package com.frameium.pageobject.ODBM;

import com.frameium.genericfunctions.GenericFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ODBMReclaimShopping extends GenericFunctions {
    static WebDriver driver;
    GenericFunctions genericFunctions;
    WebDriverWait wait;

    public ODBMReclaimShopping(WebDriver driver){
        this.driver = driver;
        genericFunctions = new GenericFunctions(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }

    public void reclaimShopping(String category)throws Exception{
        try {
            Thread.sleep(3000);
            WebElement shopele = driver.findElement(By.xpath(BreadWebElements.shopBtn));
            hoverOverElement(shopele);
            clickElement(shopele);
            hoverOverElement(shopele);
            List<WebElement> shopDrop = driver.findElements(By.xpath(BreadWebElements.shopDropdownElement));
            for(WebElement options : shopDrop){
                String text = options.getText();
                System.out.println("shopping category :" + text);
                if(text.equalsIgnoreCase(category)){
                    clickElement(options);
                    break;
                }
            }
        }
        catch (Exception e){
            System.out.println("element is not foundable" + e.getMessage());

        }
    }

    //By using Dropdown get options via List and entering with for-each loop.
    public void shirtSizeselection(String size)throws Exception{
        WebElement tShirtele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BreadWebElements.tShirt)));
        tShirtele.click();

        //select class for GetOptions
        Select dropdown = new Select(driver.findElement(By.xpath(BreadWebElements.sizeDropdown)));
        List<WebElement> sizesShirt = dropdown.getOptions();
        for (WebElement options : sizesShirt){
            String text = options.getText();
            System.out.println("selected size " + text);
            if(text.equalsIgnoreCase(size)){
                options.click();
                break;
            }

        }
    }

    public void addQuantity()throws Exception{
        try {
            WebElement plusele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(BreadWebElements.plusBtn)));
            WebElement quantityele = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(BreadWebElements.quantity)));
            int initialQuantity = Integer.parseInt(quantityele.getAttribute("value"));

            for (int i =0; i<5; i++){
                plusele.click();
                int expectedQuantity = initialQuantity + i + 1;
                wait.until(ExpectedConditions.attributeToBe(quantityele, "value", String.valueOf(expectedQuantity)));
                int updatedQuantity = Integer.parseInt(quantityele.getAttribute("value"));     //for getting the updated quantity.
                if(updatedQuantity==initialQuantity + i+1){
                    System.out.println("value " + (i+1));
                }
                else {
                    System.out.println("value " + (i+1));
                }
                System.out.println("click using js " + (i + 1) + "times ");
                Thread.sleep(2500);
            }
        }
        catch (Exception e){
            System.out.println("Elements not found" + e.getMessage());

        }
    }

    public boolean addTocart()throws Exception{
        try {
            WebElement cartele = driver.findElement(By.xpath(BreadWebElements.addTocartBtn));
            if(cartele.isEnabled()){
                clickElement(cartele);
                System.out.println("add to cart button is enable");
                return true;
            }
            else {
                System.out.println("add to cart options is disabled");
                return false;
            }
        }
        catch (Exception e){
            System.out.println("Exception error " +e.getMessage());
            return false;
        }
    }

    public boolean viewCart()throws Exception{
        try{
            WebElement viewCartele = driver.findElement(By.xpath(BreadWebElements.viewCartbtn));
            if(viewCartele.isEnabled()){
                clickElement(viewCartele);
                System.out.println("add to cart button is enable");
                return true;
            }
            else {
                System.out.println("add to cart options is disabled");
                return false;
            }
        }
        catch (Exception e){
            System.out.println("Exception error " +e.getMessage());
            return false;
        }
    }
    public void addView()throws Exception{
        Thread.sleep(2500);
        addTocart();
        viewCart();

    }


}
