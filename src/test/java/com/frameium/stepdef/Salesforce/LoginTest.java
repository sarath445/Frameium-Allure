package com.frameium.stepdef.Salesforce;

import com.frameium.genericfunctions.GenericFunctions;
import com.frameium.pageobject.Salesforce.Login;
import com.frameium.stepdef.Hooks;
import com.frameium.stepdef.TestSetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.net.MalformedURLException;

public class LoginTest extends GenericFunctions{

	private Login salesforce;
	private String expectedTitle = "Home | Salesforce";
	Hooks hooks = new Hooks();
	private WebDriver driver;
	TestSetUp setUp;
	private GenericFunctions genericFunctions;
	public LoginTest(TestSetUp setUp) throws MalformedURLException {
		this.setUp = setUp;
		genericFunctions = new GenericFunctions(setUp.baseTest.driver);
		salesforce=new Login(setUp.baseTest.driver);
		// Assign the driver from setUp to the local driver variable
		this.driver = setUp.baseTest.driver;
	}


	@Given("I am on the Salesforce login page")
	public void i_am_on_the_salesforce_login_page() {
	}

	@When("I enter my username {string} and password {string}")
	public void i_enter_my_username_and_password(String username, String password) throws InterruptedException {
		salesforce.enterCredentials(username, password);
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		salesforce.clickLogin();

	}

	@Then("I should be logged in to Salesforce successfully")
	public void i_should_be_logged_in_to_salesforce_successfully() {
		String actualTitle = salesforce.getActualTitle();
		System.out.println(actualTitle);
		try {
			Assert.assertEquals(actualTitle, expectedTitle, "Login to Salesforce was not successful.");
			logToExtentReport("Pass", "Expected title: " + expectedTitle + " matches actual title: " + actualTitle + ". Login to Salesforce was successful.");
		} catch (AssertionError e) {
			logToExtentReport("Fail", "Expected title: " + expectedTitle + ", but found: " + actualTitle);
			throw e;
		}		hooks.takeScreenshot(hooks.scenario);
	}
}
