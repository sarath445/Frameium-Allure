package com.frameium.pageobject.Salesforce;

import com.frameium.genericfunctions.GenericFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login extends GenericFunctions {

	private By usernameLocator = By.id("username");
	private By passwordLocator = By.id("password");
	private By loginButtonLocator = By.id("Login");
	private String expectedTitle = "Home | Salesforce";
	private WebDriver driver;
	public Login(WebDriver driver) {
		this.driver = driver;
	}

	public void login(String username, String password) throws InterruptedException {
		enterCredentials(username, password);
		clickLogin();
	}

	public void enterCredentials(String username, String password) throws InterruptedException {
		enterKeys(usernameLocator, username);
		enterKeys(passwordLocator, password);
	}

	public void clickLogin() {
		clickElement(loginButtonLocator);

	}

    public String getActualTitle() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
		wait.until(ExpectedConditions.titleContains(expectedTitle));
		return driver.getTitle();
    }
}
