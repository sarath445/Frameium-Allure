package com.frameium.stepdef.Ufs;

import com.frameium.genericfunctions.GenericFunctions;
import com.frameium.pageobject.Salesforce.Account;
import com.frameium.pageobject.Salesforce.Lead;
import com.frameium.pageobject.UFS.*;
import com.frameium.stepdef.Hooks;
import com.frameium.stepdef.TestSetUp;
import com.frameium.utilities.ExcelRead.ExcelReadNew;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Map;

public class IBPayments {
    private IBHomePage hm;

    Hooks hooks = new Hooks();
    private GenericFunctions genericFunctions;
    private Account acnt;
    private Lead lead;
    TestSetUp setUp;
    private WebDriver driver;
    String IBUsernameAuth = "";
    String IBpasswordAuth = "";
    String BatchpaymentfailureFilepath="D:\\frameium\\Frameium_allure\\src\\test\\resources\\uploadFiles\\batchpaymentfailure.aba";
    String BatchpaymentWrongBsbfilepath="D:\\frameium\\Frameium_allure\\src\\test\\resources\\uploadFiles\\batchPaymentsFailureWrongBSB.aba";
    @Before
    public void TestdataRead() {
        String root = System.getProperty("user.dir");
        String testdataFile = root + "\\src\\main\\resources\\configFiles\\booknew1.xlsx";
        ExcelReadNew ttmodule = new ExcelReadNew();
        Map<String, Map<String, String>> testDataList;
        testDataList = ttmodule.getTestDataList(testdataFile, "IB");
        IBUsernameAuth = testDataList.get("UsernameAuth").get("Value");
        IBpasswordAuth = testDataList.get("PasswordAuth").get("Value");
        DateUtilities Du = new DateUtilities();
        //String date= Du.DatepickRecurringDateromorrow();
         //String date= Du.DatepickCobChangeMonthDate2days();
        // String date= Du.dateafter5days();
       String date = Du.DatepickCobChangeMonthDate5days();
        String dateafter6days = Du.dateafter6days();
    }

    public IBPayments(TestSetUp setUp) throws MalformedURLException {
        this.setUp = setUp;
        genericFunctions = new GenericFunctions(setUp.baseTest.driver);
        lead = new Lead(setUp.baseTest.driver);
        acnt = new Account(setUp.baseTest.driver);
        // Assign the driver from setUp to the local driver variable
        // this.driver = setUp.baseTest.driver;

    }


    @When("User opens the IB URL")
    public void LoadIbUrl() throws InterruptedException {

        genericFunctions.getApplicationUrl("https://temenostibuat.unitingfinancial.com.au/banking/UFSCorporate");
        genericFunctions.waitForPageToLoad(2000);

        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
//
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");

    }

    @When("User opens the UAT IB URL")
    public void LoadIbUrlUat() throws InterruptedException {
        hooks.screenNew(hooks.scenario);
        genericFunctions.getApplicationUrl("https://temenostibuat.unitingfinancial.com.au/banking/UFSCorporate");
        genericFunctions.waitForPageToLoad(2000);

        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
//
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");

    }@When("User opens the SIT IB URL")
    public void LoadIbUrlSit() throws InterruptedException {

        genericFunctions.getApplicationUrl("https://temenostibsit.unitingfinancial.com.au/banking/UFSCorporate");
        genericFunctions.waitForPageToLoad(2000);

        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
//
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
       // hooks.screenNew(hooks.scenario);
    }












    @When("user login to IB")
    public void userLoginToIB() throws Exception {
        hm = new IBHomePage();
        hm.loginIBInternal("298010", "Temenos@123");
    }


    @Given("I login with username {string} and password {string} of IB")

    public void i_login_with_username_and_password_of_IB(String username, String password) throws Exception {
        hm = new IBHomePage();
        hm.loginIBInternal(username, password);
       Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");

    }
    @When("I login with username {string} and password {string} of UAT IB")

    public void i_login_with_username_and_password_of_IB_UAT(String username, String password) throws Exception {
        hm = new IBHomePage();
        hm.loginIBInternal(username, password);
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");

    }

    @When("close all the other opened windows before loading the url")
    public void closeAllTheOpenedWindows() throws InterruptedException {
        T24homepage Home = new T24homepage();
        Home.WindowClosee();

    }


    @And("click on Transfers and Pay button")
    public void clickOnTransfersAndPayButton() {
        hm = new IBHomePage();
        hm.TransferandpayButtonClick();

    }


    @And("click on Go to Accounts")
    public void clickOnGoToAccounts() throws Exception {

        hm = new IBHomePage();
       // hm.accountButton();
//        Hooks hooks = new Hooks();
//        hooks.takeScreenshot(hooks.scenario);
//        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        // Assert.fail();
    }

    @Then("click on transfer button")
    public void clickOnTransferButton() {

    }


    @Then("Enter the transaction details")
    public void enterTheTransactionDetails() throws Exception {
        hm = new IBHomePage();
        hm.transferInternal("67.34", "description");
    }
    @Then("Enter the transaction details in first user")
    public void enterTheTransactionDetailss() throws Exception {
        T24homepage th=new T24homepage();
        hm = new IBHomePage();
        String amount= th.getRandomNumberStringTwodigit()+"."+hm.getRandomNumberStringTwodigit();
        String des = th.getRandomNumberString("intrNw");
        hm.transferInternalJointowners(amount, des);
    }
    @Then("Enter the transaction details in second user")
    public void enterTheTransactionDetailssofseconduser() throws Exception {
        hm = new IBHomePage();
        hm.transferInternalJointowners2("67.34", "description");
    }


    @And("click on continue button")
    public void clickOnContinueButton() throws Exception {
        hm = new IBHomePage();
        hm.continueMessage();
    }

    @Then("confirm the internal transfer payment for user1")
    public void confirmTheInternalTransferPayment() throws IOException {
        hm = new IBHomePage();
        T24homepage hp = new T24homepage();
        String fAccount = hp.getPropertyy("StringfromaccountIntNow");
        String tAccount = hp.getPropertyy("StringToaccountIntNow");
        String expectedAmt = hp.getPropertyy("enteredIntTransAmtIb");
        String desc = hp.getPropertyy("enteredIntTransDesc");
        hm.ConfirmInternalTransferpayment(fAccount, tAccount, expectedAmt, desc);
    }
    @Then("confirm the internal transfer payment for user2")
    public void confirmTheInternalTransferPaymentseconduser() throws IOException {
        hm = new IBHomePage();
        T24homepage hp = new T24homepage();
        String fAccount = hp.getPropertyy("StringfromaccountIntNow2");
        String tAccount = hp.getPropertyy("StringToaccountIntNow2");
        String expectedAmt = hp.getPropertyy("enteredIntTransAmtIb2");
        String desc = hp.getPropertyy("enteredIntTransDesc2");
        hm.ConfirmInternalTransferpayment(fAccount, tAccount, expectedAmt, desc);
    }

    @And("Review the internal transfer")
    public void reviewTheInternalTransfer() throws Exception {
        hm = new IBHomePage();
        T24homepage hp = new T24homepage();
        String fAccount = hp.getPropertyy("StringfromaccountIntNow");
        String tAccount = hp.getPropertyy("StringToaccountIntNow");
        String expectedAmt = hp.getPropertyy("enteredIntTransAmtIb");
        String desc = hp.getPropertyy("enteredIntTransDesc");
        hm.reviewpaymentAndClose(fAccount, tAccount, expectedAmt, desc);

    }
    @And("Review the internal transfer of user1")
    public void reviewTheInternalTransferr() throws Exception {
        hm = new IBHomePage();
        T24homepage hp = new T24homepage();
        String fAccount = hp.getPropertyy("StringfromaccountIntNow");
        String tAccount = hp.getPropertyy("StringToaccountIntNow");
        String expectedAmt = hp.getPropertyy("enteredIntTransAmtIb");
        String desc = hp.getPropertyy("enteredIntTransDesc");
        hm.reviewpaymentAndClose(fAccount, tAccount, expectedAmt, desc);

    }
    @And("Review the internal transfer of user2")
    public void reviewTheInternalTransferruser2() throws Exception {
        hm = new IBHomePage();
        T24homepage hp = new T24homepage();
        String fAccount = hp.getPropertyy("StringfromaccountIntNow2");
        String tAccount = hp.getPropertyy("StringToaccountIntNow2");
        String expectedAmt = hp.getPropertyy("enteredIntTransAmtIb2");
        String desc = hp.getPropertyy("enteredIntTransDesc2");
        hm.reviewpaymentAndClose(fAccount, tAccount, expectedAmt, desc);

    }
    @Then("logout from Ib")
    public void signoffFromIb() throws Exception {
        hm = new IBHomePage();
        hm.logOutIB();
    }

    @And("Login to authorizer account of internal transfer")
    public void loginToAuthorizerAccountOfInternalTransfer() throws Exception {
        hm = new IBHomePage();
        hm.loginIBInternal(IBUsernameAuth, IBpasswordAuth);
    }

    @And("Login to authorizer account with username {string}and password {string}")
    public void loginToAuthorizerAccountWithUsernameAndPassword(String arg0, String arg1) throws Exception {
        hm = new IBHomePage();
        hm.loginIBInternal(IBUsernameAuth, IBpasswordAuth);
    }

    @Then("click on Authorization button")
    public void clickOnAuthorizationButton() throws Exception {
        hm = new IBHomePage();
        hm.AutorizationButtonClick();
    }

    @And("Authorize the internal transfer")
    public void authorizeTheInternalTransfer() throws Exception {
        T24homepage Home = new T24homepage();
        hm = new IBHomePage();
        //hm.authFunctionsInternalView();
        AuthorizationIB AIb = new AuthorizationIB();
        String fAccount = Home.getPropertyy("StringfromaccountIntNow");
        String Taccount = Home.getPropertyy("StringToaccountIntNow");
        String amount = Home.getPropertyy("enteredIntTransAmtIb");
        String Description = Home.getPropertyy("enteredIntTransDesc");
        hm.authFunctionsInternalView(amount);
        AIb.authorizationConfirmView(Taccount, fAccount, amount, Description);
    }
    @And("Authorize the internal transfer initiated by user1")
    public void authorizeTheInternalTransferr() throws Exception {
        T24homepage Home = new T24homepage();
        hm = new IBHomePage();
        //hm.authFunctionsInternalView();
        AuthorizationIB AIb = new AuthorizationIB();
        String fAccount = Home.getPropertyy("StringfromaccountIntNow");
        String Taccount = Home.getPropertyy("StringToaccountIntNow");
        String amount = Home.getPropertyy("enteredIntTransAmtIb");
        String Description = Home.getPropertyy("enteredIntTransDesc");
        hm.authFunctionsInternalView(amount);
        AIb.authorizationConfirmView(Taccount, fAccount, amount, Description);
    }
    @And("Authorize the internal transfer initiated by user2")
    public void authorizeTheInternalTransferruser2() throws Exception {
        T24homepage Home = new T24homepage();
        hm = new IBHomePage();
        //hm.authFunctionsInternalView();
        AuthorizationIB AIb = new AuthorizationIB();
        String fAccount = Home.getPropertyy("StringfromaccountIntNow2");
        String Taccount = Home.getPropertyy("StringToaccountIntNow2");
        String amount = Home.getPropertyy("enteredIntTransAmtIb2");
        String Description = Home.getPropertyy("enteredIntTransDesc2");
        hm.authFunctionsInternalView(amount);
        AIb.authorizationConfirmView(Taccount, fAccount, amount, Description);
    }

    @Then("Review authorization that the details are reflected correctly")
    public void reviewAuthorizationThatTheDetailsAreReflectedCorrectly() throws Exception {
        T24homepage Home = new T24homepage();
        hm = new IBHomePage();
        AuthorizationIB AIb = new AuthorizationIB();
        String fAccount = Home.getPropertyy("StringfromaccountIntNow");
        String Taccount = Home.getPropertyy("StringToaccountIntNow");
        String amount = Home.getPropertyy("enteredIntTransAmtIb");
        String Description = Home.getPropertyy("enteredIntTransDesc");
        AIb.authorizationConfirm(fAccount, Taccount, amount, Description);
        AIb.returnToAuth();

    }
    @Then("Review authorization that the details of transaction initiated by user1 is reflected correctly")
    public void reviewAuthorizationThatTheDetailsAreReflectedCorrectlyy() throws Exception {
        T24homepage Home = new T24homepage();
        hm = new IBHomePage();
        AuthorizationIB AIb = new AuthorizationIB();
        String fAccount = Home.getPropertyy("StringfromaccountIntNow");
        String Taccount = Home.getPropertyy("StringToaccountIntNow");
        String amount = Home.getPropertyy("enteredIntTransAmtIb");
        String Description = Home.getPropertyy("enteredIntTransDesc");
        AIb.authorizationConfirm(fAccount, Taccount, amount, Description);
        AIb.returnToAuth();

    }
    @Then("Review authorization that the details of transaction initiated by user2 is reflected correctly")
    public void reviewAuthorizationThatTheDetailsAreReflectedCorrectlyyuser2() throws Exception {
        T24homepage Home = new T24homepage();
        hm = new IBHomePage();
        AuthorizationIB AIb = new AuthorizationIB();
        String fAccount = Home.getPropertyy("StringfromaccountIntNow2");
        String Taccount = Home.getPropertyy("StringToaccountIntNow2");
        String amount = Home.getPropertyy("enteredIntTransAmtIb2");
        String Description = Home.getPropertyy("enteredIntTransDesc2");
        AIb.authorizationConfirm(fAccount, Taccount, amount, Description);
        AIb.returnToAuth();

    }

    @Then("Enter the account number of internal transfer-IB")
    public void enterTheAccountNumberOfInternalTransferIB() throws IOException {
        T24homepage Home = new T24homepage();
        String fAccount = Home.getPropertyy("StringfromaccountIntNow");
        String date=Home.datePickIBM();
        Home.enterAccountNumInIbviewofAccounttEntries(fAccount,date);

    }

    @Then("verify whether the narratives of internal trasfer-IB is reflected in the IB-view of account entries")
    public void verifyWhetherTheNarrativesOfInternalTrasferIBIsReflectedInTheIBViewOfAccountEntries() throws Exception {
        AccountEntries Acnt = new AccountEntries();
        T24homepage Home = new T24homepage();
        String amount = Home.getPropertyy("enteredIntTransAmtIb");
        String Description = Home.getPropertyy("enteredIntTransDesc");
        String balance = "";
        Acnt.narrativest24NowBpay(amount, Description);
    }

    @Then("Enter the future transaction details in IB")
    public void enterTheFutureTransactionDetailsInIB() throws Exception {
        hm = new IBHomePage();
        T24homepage home = new T24homepage();
        String desCription = home.getRandomNumberString("intrft");
        String amount = home.getRandomNumberStringTwodigit() + "." + home.getRandomNumberStringTwodigit();

        hm.transferInternalFuture(amount, desCription);
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);

        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }

    @Then("confirm the Internal transfer future payment")
    public void confirmTheInternalTransferFuturePayment() throws IOException {
        hm = new IBHomePage();
        T24homepage hp = new T24homepage();
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        String fAccount = hp.getPropertyy("StringfromaccountIntfuture");
        String tAccount = hp.getPropertyy("StringToaccountIntfuture");
        String expectedAmt = hp.getPropertyy("enteredIntTransAmtIbFuture");
        String desc = hp.getPropertyy("enteredIntTransDescFuture");
        hm.ConfirmInternalTransferpayment(fAccount, tAccount, expectedAmt, desc);
    }
    @Then("confirm the External transfer future payment")
    public void confirmTheExternalTransferFuturePayment() throws IOException {
        hm = new IBHomePage();
        T24homepage hp = new T24homepage();
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        String fAccount = hp.getPropertyy("StringfromaccountExternalfuture");
        String tAccount = hp.getPropertyy("StringToaccountExternalfuture");
        String expectedAmt = hp.getPropertyy("enteredExternalTransAmtIbFuture");
        String desc = hp.getPropertyy("enteredExternalTransDescFuture");
        hm.ConfirmInternalTransferpayment(fAccount, tAccount, expectedAmt, desc);
    }

    @And("Review the internal transfer future payment")
    public void reviewTheInternalTransferFuturePayment() throws Exception {
        Hooks hooks = new Hooks();
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        hooks.takeScreenshot(hooks.scenario);
        T24homepage hp = new T24homepage();
        String fAccount = hp.getPropertyy("StringfromaccountIntfuture");
        String tAccount = hp.getPropertyy("StringToaccountIntfuture");
        String expectedAmt = hp.getPropertyy("enteredIntTransAmtIbFuture");
        String desc = hp.getPropertyy("enteredIntTransDescFuture");
        hm.reviewpaymentAndClose(fAccount, tAccount, expectedAmt, desc);


    }
    @And("Review the External transfer future payment")
    public void reviewTheExternalTransferFuturePayment() throws Exception {
        Hooks hooks = new Hooks();
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        hooks.takeScreenshot(hooks.scenario);
        T24homepage hp = new T24homepage();
        String fAccount = hp.getPropertyy("StringfromaccountExternalfuture");
        String tAccount = hp.getPropertyy("StringToaccountExternalfuture");
        String expectedAmt = hp.getPropertyy("enteredExternalTransAmtIbFuture");
        String desc = hp.getPropertyy("enteredExternalTransDescFuture");
        hm.reviewpaymentAndClose(fAccount, tAccount, expectedAmt, desc);


    }

    @And("Authorize the internal transfer future")
    public void authorizeTheInternalTransferFuture() throws Exception {
        T24homepage hp = new T24homepage();
        hm = new IBHomePage();
        String expectedamount = hp.getPropertyy("enteredIntTransAmtIbFuture");
        hm.authFunctionsInternalView(expectedamount);
        AuthorizationIB AIb = new AuthorizationIB();
        String fAccount = hp.getPropertyy("StringfromaccountIntfuture");
        String Taccount = hp.getPropertyy("StringToaccountIntfuture");
        String amount = hp.getPropertyy("enteredIntTransAmtIbFuture");
        String Description = hp.getPropertyy("enteredIntTransDescFuture");
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        AIb.authorizationConfirmView(Taccount, fAccount, amount, Description);
    }
    @And("Authorize the External transfer future")
    public void authorizeTheExternalTransferFuture() throws Exception {
        T24homepage hp = new T24homepage();
        hm = new IBHomePage();

        String expectedAmt = hp.getPropertyy("enteredExternalTransAmtIbFuture");
        hm.authFunctionsInternalView(expectedAmt);
        AuthorizationIB AIb = new AuthorizationIB();
        String fAccount = hp.getPropertyy("StringfromaccountExternalfuture");
        String tAccount = hp.getPropertyy("StringToaccountExternalfuture");
        String desc = hp.getPropertyy("enteredExternalTransDescFuture");
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        AIb.authorizationConfirmView(tAccount,fAccount,expectedAmt, desc);
    }

    @Then("Review authorization that the details of internal transfer future is reflected correctly")
    public void reviewAuthorizationThatTheDetailsOfInternalTransferFutureIsReflectedCorrectly() throws Exception {
        T24homepage hp = new T24homepage();
        hm = new IBHomePage();
        AuthorizationIB AIb = new AuthorizationIB();
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        String fAccount = hp.getPropertyy("StringfromaccountIntfuture");
        String Taccount = hp.getPropertyy("StringToaccountIntfuture");
        String amount = hp.getPropertyy("enteredIntTransAmtIbFuture");
        String Description = hp.getPropertyy("enteredIntTransDescFuture");
        AIb.authorizationConfirm(fAccount, Taccount, amount, Description);
        AIb.returnToAuth();
    }
    @Then("Review authorization that the details of External transfer future is reflected correctly")
    public void reviewAuthorizationThatTheDetailsOfExternalTransferFutureIsReflectedCorrectly() throws Exception {
        T24homepage hp = new T24homepage();
        hm = new IBHomePage();
        AuthorizationIB AIb = new AuthorizationIB();
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        String expectedAmt = hp.getPropertyy("enteredExternalTransAmtIbFuture");
        String fAccount = hp.getPropertyy("StringfromaccountExternalfuture");
        String tAccount = hp.getPropertyy("StringToaccountExternalfuture");
        String desc = hp.getPropertyy("enteredExternalTransDescFuture");
        AIb.authorizationConfirm(fAccount, tAccount, expectedAmt, desc);
        AIb.returnToAuth();
    }


    @Then("verify the narratives of internal trasfer-IB future")
    public void verifyTheNarrativesOfInternalTrasferIBFuture() throws Exception {
        T24homepage Home = new T24homepage();
        String amount = Home.getPropertyy("enteredIntTransAmtIbFuture");
        String Description = Home.getPropertyy("enteredIntTransDescFuture");
        String balance = "";
        AccountEntries Acnt = new AccountEntries();
        Acnt.narrativest24NowBpay(amount, Description);
    }

    @Then("Enter the Internal Recurring transaction details in IB")
    public void enterTheInternalRecurringTransactionDetailsInIB() throws InterruptedException, IOException {
        T24homepage Home = new T24homepage();
        hm = new IBHomePage();
        String amount = Home.getRandomNumberStringTwodigit() + "." + Home.getRandomNumberStringTwodigit();
        String Description = Home.getRandomNumberString("IntRec");
        hm.inttransrecurring(amount, Description, "Daily");
    }

    @Then("confirm the internal trasfer IB recurring")
    public void confirmTeInternalTrasferRecurring() throws IOException {
        hm = new IBHomePage();
        T24homepage hp = new T24homepage();
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        String fAccount = hp.getPropertyy("StringfromaccountIntRecur");
        String tAccount = hp.getPropertyy("StringToaccountIntRecur");
        String expectedAmt = hp.getPropertyy("enteredIntTransAmtIbRecur");
        String desc = hp.getPropertyy("enteredIntTransDescRecur");
        hm.ConfirmInternalTransferpayment(fAccount, tAccount, expectedAmt, desc);
    }

    @And("Review the internal transfer Recurring payment")
    public void reviewTheInternalTransferRecurringPayment() throws Exception {
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        T24homepage hp = new T24homepage();
        String fAccount = hp.getPropertyy("StringfromaccountIntRecur");
        String tAccount = hp.getPropertyy("StringToaccountIntRecur");
        String expectedAmt = hp.getPropertyy("enteredIntTransAmtIbRecur");
        String desc = hp.getPropertyy("enteredIntTransDescRecur");
        hm.reviewpaymentAndClose(fAccount, tAccount, expectedAmt, desc);



    }

    @And("Authorize the internal transfer Recurring")
    public void authorizeTheInternalTransferRecurring() throws Exception {
        T24homepage hp = new T24homepage();
        hm = new IBHomePage();
        String expectedamount = hp.getPropertyy("enteredIntTransAmtIbRecur");
        hm.authFunctionsInternalView(expectedamount);
        AuthorizationIB AIb = new AuthorizationIB();
        String fAccount = hp.getPropertyy("StringfromaccountIntRecur");
        String Taccount = hp.getPropertyy("StringToaccountIntRecur");
        String amount = hp.getPropertyy("enteredIntTransAmtIbRecur");
        String Description = hp.getPropertyy("enteredIntTransDescRecur");
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        AIb.authorizationConfirmView(Taccount, fAccount, amount, Description);
    }

    @Then("Review authorization that the details of internal transfer Recurring is reflected correctly")
    public void reviewAuthorizationThatTheDetailsOfInternalTransferRecurringIsReflectedCorrectly() throws Exception {
        T24homepage hp = new T24homepage();
        hm = new IBHomePage();
        AuthorizationIB AIb = new AuthorizationIB();
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        String fAccount = hp.getPropertyy("StringfromaccountIntRecur");
        String Taccount = hp.getPropertyy("StringToaccountIntRecur");
        String amount = hp.getPropertyy("enteredIntTransAmtIbRecur");
        String Description = hp.getPropertyy("enteredIntTransDescRecur");
        AIb.authorizationConfirm(fAccount, Taccount, amount, Description);
        AIb.returnToAuth();


    }

    @Then("Enter the account number of internal transfer-IB future")
    public void enterTheAccountNumberOfInternalTransferIBFuture() throws IOException {
        T24homepage Home = new T24homepage();
        String fAccount = Home.getPropertyy("StringfromaccountIntfuture");
        Home.enterAccountNumInIbviewofAccounttEntries(fAccount,"");

    }

    @Then("Enter the account number of internal transfer-IB Recurring")
    public void enterTheAccountNumberOfInternalTransferIBRecurring() throws IOException {
        T24homepage Home = new T24homepage();
        String fAccount = Home.getPropertyy("StringfromaccountIntRecur");
        Home.enterAccountNumInIbviewofAccounttEntries(fAccount,"");
    }

    @Then("verify the narratives of internal trasfer-IB Recurring")
    public void verifyTheNarrativesOfInternalTrasferIBRecurring() throws Exception {
        T24homepage Home = new T24homepage();
        String amount = Home.getPropertyy("enteredIntTransAmtIbRecur");
        String Description = Home.getPropertyy("enteredIntTransDescRecur");
        String balance = "";
        AccountEntries Acnt = new AccountEntries();
        Acnt.narrativest24NowBpay(amount, Description);


    }

    @And("Enter the details for external transfer now")
    public void enterTheDetailsForExternalTransferNow() throws Exception {
        T24homepage Home = new T24homepage();
        hm = new IBHomePage();
        String amount = Home.getRandomNumberStringTwodigit() + "." + Home.getRandomNumberStringTwodigit();
        String description1 = Home.getRandomNumberString("MY");
        String description2 = Home.getRandomNumberString("their");
        hm.externalTransaction(amount, description1, description2);


    }

    @Then("Confirm the external transfer IB now")
    public void confirmTheExternalTransferIBnow() throws IOException {
        hm = new IBHomePage();
        T24homepage home = new T24homepage();
        String fAccount = home.getPropertyy("externaltransnowfromaccount");
        String tAccount = home.getPropertyy("externaltransnowtoaccount");
        String expectedAmt = home.getPropertyy("externaltransnowAmount");
        String desc = home.getPropertyy("externaltransnowMYdesc");

      //  hm.recuringDetailsVerify(expectedStartDate, "Daily", externaltransrecurringEndDate);
        hm.ConfirmExternalTransferpayment(fAccount, tAccount, expectedAmt, desc);


    }
    @Then("Confirm the external transfer IB")
    public void confirmTheExternalTransferIB() throws IOException {
        hm = new IBHomePage();
        T24homepage home = new T24homepage();
        String fAccount = home.getPropertyy("savedexternaltransrecurringfromaccountNewContact");
        String tAccount = home.getPropertyy("savedexternaltransrecurringtoaccountNewContact");
        String expectedAmt = home.getPropertyy("savedexternaltransrecurringAmountNewContact");
        String desc = home.getPropertyy("savedexternaltransrecurringMYdescNewContact");
        String expectedStartDate = home.getPropertyy("savedexternaltransrecurringStartDateNewContact");
        String externaltransrecurringEndDate = home.getPropertyy("savedexternaltransrecurringEndDateNewContact");
        hm.recuringDetailsVerify(expectedStartDate, "Daily", externaltransrecurringEndDate);
        hm.ConfirmExternalTransferpayment(fAccount, tAccount, expectedAmt, desc);


    }

    @And("Review the external transfer now payment")
    public void reviewTheExternalTransferNowPayment() throws Exception {

        hm = new IBHomePage();
        T24homepage home = new T24homepage();
        String fAccount = home.getPropertyy("externaltransnowfromaccount");
        String tAccount = home.getPropertyy("externaltransnowtoaccount");
        String expectedAmt = home.getPropertyy("externaltransnowAmount");
        String desc = home.getPropertyy("externaltransnowMYdesc");

        hm.reviewpaymentAndClose(fAccount, tAccount, expectedAmt, desc);

    }

    @And("Authorize the External transfer now")
    public void authorizeTheExternalTransferNow() throws Exception {
        T24homepage hp = new T24homepage();
        hm = new IBHomePage();
        String expectedamount = hp.getPropertyy("externaltransnowAmount");
        hm.authFunctionsInternalView(expectedamount);
        AuthorizationIB AIb = new AuthorizationIB();
        String fAccount = hp.getPropertyy("externaltransnowfromaccount");
        String Taccount = hp.getPropertyy("externaltransnowtoaccount");
        String amount = hp.getPropertyy("externaltransnowAmount");
        String Description = hp.getPropertyy("externaltransnowMYdesc");
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        AIb.authorizationConfirmView(Taccount, fAccount, amount, Description);
    }

    @Then("Review authorization that the details of external transfer is reflected correctly")
    public void reviewAuthorizationThatTheDetailsOfExternalTransferIsReflectedCorrectly() throws Exception {
        T24homepage hp = new T24homepage();
        hm = new IBHomePage();
        AuthorizationIB AIb = new AuthorizationIB();
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        String fAccount = hp.getPropertyy("externaltransnowfromaccount");
        String Taccount = hp.getPropertyy("externaltransnowtoaccount");
        String amount = hp.getPropertyy("externaltransnowAmount");
        String Description = hp.getPropertyy("externaltransnowMYdesc");
        AIb.authorizationConfirm(fAccount, Taccount, amount, Description);
        AIb.returnToAuth();
    }

    @Then("Enter the account number of external transfer-IB now")
    public void enterTheAccountNumberOfExternalTransferIBNow() throws IOException {
        T24homepage Home = new T24homepage();
        String fAccount = Home.getPropertyy("externaltransnowfromaccount");
        Home.enterAccountNumInIbviewofAccounttEntries(fAccount,"");
    }

    @Then("Enter the account number of external transfer-IB Recurring")
    public void enterTheAccountNumberOfExternalTransferRecurring() throws IOException {
        T24homepage Home = new T24homepage();
        String fAccount = Home.getPropertyy("externaltransrecurringfromaccount");
        String expectedStartDate = Home.getPropertyy("externaltransrecurringStartDate");
        Home.enterdateInIbview(expectedStartDate);
        Home.enterAccountNumInIBviewofAccounttEntries(fAccount);

    }

    @Then("verify the narratives of external trasfer-IB now")
    public void verifyTheNarrativesOfExternalTrasferIBNow() throws Exception {
        T24homepage Home = new T24homepage();
        String amount = Home.getPropertyy("externaltransnowAmount");
        String Description = Home.getPropertyy("externaltransnowMYdesc");
        String balance = "";
        AccountEntries Acnt = new AccountEntries();
        Acnt.narrativest24NowBpay(amount, Description);

    }

    @And("Enter the details for external transfer recurring")
    public void enterTheDetailsForExternalTransferRecurring() throws Exception {
        T24homepage Home = new T24homepage();
        hm = new IBHomePage();
        String amount = Home.getRandomNumberStringTwodigit() + "." + Home.getRandomNumberStringTwodigit();
        String description1 = Home.getRandomNumberString("MY");
        String description2 = Home.getRandomNumberString("their");
        hm.externalRecurringTransfer1(amount, description1, description2);
    }
    @And("Enter the details for external transfer saved recurring")
    public void enterTheDetailsForExternalTransfersavedRecurring() throws Exception {
        T24homepage Home = new T24homepage();
        hm = new IBHomePage();
        String amount = Home.getRandomNumberStringTwodigit() + "." + Home.getRandomNumberStringTwodigit();
        String description1 = Home.getRandomNumberString("MY");
        String description2 = Home.getRandomNumberString("their");
        hm.externalRecurringTransfer1(amount, description1, description2);
    }

    @And("Authorize the External transfer recurring")
    public void authorizeTheExternalTransferRecurring() throws Exception {
        T24homepage home = new T24homepage();
        hm = new IBHomePage();
        String expectedAmt = home.getPropertyy("externaltransrecurringAmount");
        hm.authFunctionsInternalView(expectedAmt);
        AuthorizationIB AIb = new AuthorizationIB();

        String fAccount = home.getPropertyy("externaltransrecurringfromaccount");
        String Taccount = home.getPropertyy("externaltransrecurringtoaccount");
        String amount = home.getPropertyy("externaltransrecurringAmount");
        String Description = home.getPropertyy("externaltransrecurringMYdesc");
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        String expectedStartDate = home.getPropertyy("externaltransrecurringStartDate");
        String externaltransrecurringEndDate = home.getPropertyy("externaltransrecurringEndDate");
        hm.recuringDetailsAutorize(expectedStartDate, "Daily", externaltransrecurringEndDate);
        AIb.authorizationConfirmView(Taccount, fAccount, amount, Description);
    }
    @And("Authorize the External transfer recurring saved")
    public void authorizeTheSavedExternalTransferRecurring() throws Exception {
        T24homepage home = new T24homepage();
        hm = new IBHomePage();
        String expectedAmt = home.getPropertyy("savedexternaltransrecurringAmountNewContact");
        hm.authFunctionsInternalView(expectedAmt);
        AuthorizationIB AIb = new AuthorizationIB();

        String fAccount = home.getPropertyy("savedexternaltransrecurringfromaccountNewContact");
        String tAccount = home.getPropertyy("savedexternaltransrecurringtoaccountNewContact");
        //String expectedAmt = home.getPropertyy("savedexternaltransrecurringAmountNewContact");
        String desc = home.getPropertyy("savedexternaltransrecurringMYdescNewContact");
        String expectedStartDate = home.getPropertyy("savedexternaltransrecurringStartDateNewContact");
        String externaltransrecurringEndDate = home.getPropertyy("savedexternaltransrecurringEndDateNewContact");
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        hm.recuringDetailsAutorize(expectedStartDate, "Daily", externaltransrecurringEndDate);
        AIb.authorizationConfirmView(tAccount, fAccount, expectedAmt, desc);
    }


    @Then("Review authorization that the details of external transfer recurring is reflected correctly")
    public void reviewAuthorizationThatTheDetailsOfExternalTransferRecurringIsReflectedCorrectly() throws Exception {
        T24homepage home = new T24homepage();
        hm = new IBHomePage();
        AuthorizationIB AIb = new AuthorizationIB();
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        String fAccount = home.getPropertyy("savedexternaltransrecurringfromaccountNewContact");
        String tAccount = home.getPropertyy("savedexternaltransrecurringtoaccountNewContact");
        String expectedAmt = home.getPropertyy("savedexternaltransrecurringAmountNewContact");
        String desc = home.getPropertyy("savedexternaltransrecurringMYdescNewContact");
        String expectedStartDate = home.getPropertyy("savedexternaltransrecurringStartDateNewContact");
        String externaltransrecurringEndDate = home.getPropertyy("savedexternaltransrecurringEndDateNewContact");
        AIb.authorizationConfirm(fAccount, tAccount, expectedAmt, desc);
        AIb.returnToAuth();


    }

    @And("Review the external transfer recurring payment")
    public void reviewTheExternalTransferRecurringPayment() throws Exception {
        hm = new IBHomePage();
        T24homepage home = new T24homepage();
        String fAccount = home.getPropertyy("savedexternaltransrecurringfromaccountNewContact");
        String tAccount = home.getPropertyy("savedexternaltransrecurringtoaccountNewContact");
        String expectedAmt = home.getPropertyy("savedexternaltransrecurringAmountNewContact");
        String desc = home.getPropertyy("savedexternaltransrecurringMYdescNewContact");
        String expectedStartDate = home.getPropertyy("savedexternaltransrecurringStartDateNewContact");
        String externaltransrecurringEndDate = home.getPropertyy("savedexternaltransrecurringEndDateNewContact");

        hm.recuringDetailsVerifyReviewPayment(expectedStartDate, "Daily", externaltransrecurringEndDate);
        hm.reviewpaymentAndClose(fAccount, tAccount, expectedAmt, desc);

    }

    @Then("verify the narratives of external trasfer recurring")
    public void verifyTheNarrativesOfExternalTrasferRecurring() throws Exception {
        T24homepage Home = new T24homepage();
        String amount = Home.getPropertyy("externaltransrecurringAmount");
        String Description = Home.getPropertyy("externaltransrecurringMYdesc");
        String balance = "";
        AccountEntries Acnt = new AccountEntries();
        Acnt.narrativest24NowBpay(amount, Description);

    }

    @Then("Enter the external future transaction details in IB")
    public void enterTheExternalFutureTransactionDetailsInIB() throws Exception {
        hm = new IBHomePage();
        T24homepage home = new T24homepage();
        String desCription = home.getRandomNumberString("intrft");
        String amount = home.getRandomNumberStringTwodigit() + "." + home.getRandomNumberStringTwodigit();

        hm.transferExternalFutureSaved(amount, desCription);
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);

        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");


    }

    @Then("Enter the account number of external transfer-IB future")
    public void enterTheAccountNumberOfExternalTransferIBFuture() throws IOException {
        T24homepage Home = new T24homepage();
        String fAccount = Home.getPropertyy("StringfromaccountExternalfuture");
        String expectedStartDate = Home.getPropertyy("StartdatetExternalfuture");
        Home.enterdateInIbview(expectedStartDate);
        Home.enterAccountNumInIBviewofAccounttEntries(fAccount);

    }

    @Then("verify the narratives of external trasfer IB future")
    public void verifyTheNarrativesOfExternalTrasferIBFuture() throws Exception {
        T24homepage Home = new T24homepage();
        String expectedAmt = Home.getPropertyy("enteredExternalTransAmtIbFuture");
        String desc = Home.getPropertyy("enteredExternalTransDescFuture");
        String balance = "";
        AccountEntries Acnt = new AccountEntries();
        Acnt.narrativest24NowBpay(expectedAmt, desc);

    }

    @And("Enter the details for external transfer new contact now")
    public void enterTheDetailsForExternalTransferNewContactNow() throws Exception {
        T24homepage Home = new T24homepage();
        hm = new IBHomePage();
        String amount = Home.getRandomNumberStringTwodigit() + "." + Home.getRandomNumberStringTwodigit();
        String description1 = Home.getRandomNumberString("MY");
        String description2 = Home.getRandomNumberString("their");
        hm.externalTransactionNewContactNow(amount, description1, description2);
    }

    @And("Review the external transfer new contact now payment")
    public void reviewTheExternalTransferNewContactNowPayment() throws Exception {
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        T24homepage hp = new T24homepage();
        String fAccount = hp.getPropertyy("externaltransnowfromaccountNewContact");
        String tAccount = hp.getPropertyy("externaltransnowtoaccountNewContact");
        String expectedAmt = hp.getPropertyy("externaltransnowAmountNewContact");
        String desc = hp.getPropertyy("externaltransnowMYdescNewContact");
        hm.reviewpaymentAndClose(fAccount, tAccount, expectedAmt, desc);

    }

    @And("Authorize the External transfer new contact now")
    public void authorizeTheExternalTransferNewContactNow() throws Exception {
        T24homepage hp = new T24homepage();
        hm = new IBHomePage();


        AuthorizationIB AIb = new AuthorizationIB();
        String fAccount = hp.getPropertyy("externaltransnowfromaccountNewContact");
        String tAccount = hp.getPropertyy("externaltransnowtoaccountNewContact");
        String amount = hp.getPropertyy("externaltransnowAmountNewContact");
        String Description = hp.getPropertyy("externaltransnowMYdescNewContact");
        hm.authFunctionsInternalView(amount);
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        AIb.authorizationConfirmView(tAccount, fAccount, amount, Description);


    }
    @Then("Confirm the external transfer IB new Contact")
    public void confirmTheExternalTransferIBNewContactnow() throws IOException {
        hm = new IBHomePage();
        T24homepage hp = new T24homepage();
        String fAccount = hp.getPropertyy("externaltransnowfromaccountNewContact");
        String tAccount = hp.getPropertyy("externaltransnowtoaccountNewContact");
        String expectedAmt = hp.getPropertyy("externaltransnowAmountNewContact");
        String desc = hp.getPropertyy("externaltransnowMYdescNewContact");
        hm.ConfirmExternalTransferpayment(fAccount, tAccount, expectedAmt, desc);


    }
    @Then("Confirm the external transfer IB new Contact future")
    public void confirmTheExternalTransferIBNewContactFuture() throws IOException {
        hm = new IBHomePage();
        T24homepage home = new T24homepage();
        String fAccount = home.getPropertyy("StringfromaccountExternalfutureNewContact");
        String tAccount = home.getPropertyy("StringToaccountExternalfutureNewContact");
        String expectedAmt = home.getPropertyy("enteredExternalTransAmtIbFutureNewContact");
        String desc = home.getPropertyy("enteredExternalTransDescFutureNewContact");
        String expectedStartDate = home.getPropertyy("StartdatetExternalfutureNewContact");
        String externaltransrecurringEndDate = home.getPropertyy("externaltransrecurringEndDateNewAccount");
        hm.ConfirmExternalTransferpayment(fAccount, tAccount, expectedAmt, desc);


    }
    @Then("Confirm the external transfer IB new Contact Recurring")
    public void confirmTheExternalTransferIBNewContact() throws IOException {
        hm = new IBHomePage();
        T24homepage home = new T24homepage();
        String fAccount = home.getPropertyy("externaltransrecurringfromaccountNewContact");
        String tAccount = home.getPropertyy("externaltransrecurringtoaccountNewContact");
        String expectedAmt = home.getPropertyy("externaltransrecurringAmountNewContact");
        String desc = home.getPropertyy("externaltransrecurringMYdescNewContact");
        String expectedStartDate = home.getPropertyy("externaltransrecurringStartDateNewContact");
        String externaltransrecurringEndDate = home.getPropertyy("externaltransrecurringEndDateNewContact");
        hm.ConfirmExternalTransferpayment(fAccount, tAccount, expectedAmt, desc);







    }
    @Then("Review authorization that Taccountthe details of external transfer new contact now is reflected correctly")
    public void reviewAuthorizationThatTheDetailsOfExternalTransferNewContactIsReflectedCorrectly() throws Exception {
        T24homepage hp = new T24homepage();
        hm = new IBHomePage();
        AuthorizationIB AIb = new AuthorizationIB();
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        String fAccount = hp.getPropertyy("externaltransnowfromaccountNewContact");
        String tAccount = hp.getPropertyy("externaltransnowtoaccountNewContact");
        String expectedAmt = hp.getPropertyy("externaltransnowAmountNewContact");
        String desc = hp.getPropertyy("externaltransnowMYdescNewContact");

        AIb.authorizationConfirm(fAccount,tAccount, expectedAmt, desc);
        AIb.returnToAuth();

    }


    @Then("Review authorization that Taccountthe details of external transfer contact is reflected correctly")
    public void reviewAuthorizationThatTheDetailsOfExternalTransferNewContactIsReflectedCorrectlyy() throws Exception {
        T24homepage hp = new T24homepage();
        hm = new IBHomePage();
        AuthorizationIB AIb = new AuthorizationIB();
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        String fAccount = hp.getPropertyy("StringfromaccountIntfuture");
        String  Taccount= hp.getPropertyy("StringToaccountIntfuture");
        String amount = hp.getPropertyy("enteredIntTransAmtIbFuture");
        String Description = hp.getPropertyy("enteredIntTransDescFuture");

        AIb.authorizationConfirm(fAccount, Taccount, amount, Description);
        AIb.returnToAuth();

    }


    @And("Enter the details for external transfer new contact Recurring")
    public void enterTheDetailsForExternalTransferNewContactRecurring() throws Exception {
        T24homepage Home = new T24homepage();
        hm = new IBHomePage();
        String amount = Home.getRandomNumberStringTwodigit() + "." + Home.getRandomNumberStringTwodigit();
        String description1 = Home.getRandomNumberString("MY");
        String description2 = Home.getRandomNumberString("their");
        hm.externalRecurringTransferNewContact(amount, description1, description2);

    }

    @And("Review the external transfer new contact Recurring payment")
    public void reviewTheExternalTransferNewContactRecurringPayment() throws Exception {
        hm = new IBHomePage();
        T24homepage home = new T24homepage();
        String fAccount = home.getPropertyy("externaltransrecurringfromaccountNewContact");
        String tAccount = home.getPropertyy("externaltransrecurringtoaccountNewContact");
        String expectedAmt = home.getPropertyy("externaltransrecurringAmountNewContact");
        String desc = home.getPropertyy("externaltransrecurringMYdescNewContact");
        String expectedStartDate = home.getPropertyy("externaltransrecurringStartDateNewContact");
        String externaltransrecurringEndDate = home.getPropertyy("externaltransrecurringEndDateNewContact");
        hm.recuringDetailsVerifyReviewPayment(expectedStartDate, "Daily", externaltransrecurringEndDate);
        hm.reviewpaymentAndClose(fAccount, tAccount, expectedAmt, desc);


    }

    @And("Authorize the External transfer new contact Recurring")
    public void authorizeTheExternalTransferNewContactRecurring() throws Exception {
        T24homepage home = new T24homepage();
        hm = new IBHomePage();
        String expectedAmt = home.getPropertyy("externaltransrecurringAmountNewContact");
        hm.authFunctionsInternalView(expectedAmt);
        AuthorizationIB AIb = new AuthorizationIB();
        String fAccount = home.getPropertyy("externaltransrecurringfromaccountNewContact");
        String tAccount = home.getPropertyy("externaltransrecurringtoaccountNewContact");

        String desc = home.getPropertyy("externaltransrecurringMYdescNewContact");
        String expectedStartDate = home.getPropertyy("externaltransrecurringStartDateNewContact");
        String externaltransrecurringEndDate = home.getPropertyy("externaltransrecurringEndDateNewContact");
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");

        hm.recuringDetailsAutorize(expectedStartDate, "Daily", externaltransrecurringEndDate);
        AIb.authorizationConfirmView(tAccount, fAccount, expectedAmt, desc);
    }

    @Then("Review authorization that the details of external transfer new contact recurring is reflected correctly")
    public void reviewAuthorizationThatTheDetailsOfExternalTransferNewContactRecurringIsReflectedCorrectly() throws Exception {
        T24homepage home = new T24homepage();
        hm = new IBHomePage();
        AuthorizationIB AIb = new AuthorizationIB();
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        String fAccount = home.getPropertyy("externaltransrecurringfromaccountNewContact");
        String tAccount = home.getPropertyy("externaltransrecurringtoaccountNewContact");
        String expectedAmt = home.getPropertyy("externaltransrecurringAmountNewContact");
        String desc = home.getPropertyy("externaltransrecurringMYdescNewContact");
        String expectedStartDate = home.getPropertyy("externaltransrecurringStartDateNewContact");
        String externaltransrecurringEndDate = home.getPropertyy("externaltransrecurringEndDateNewContact");
        AIb.authorizationConfirm(fAccount, tAccount, expectedAmt, desc);
        AIb.returnToAuth();


    }

    @Then("Enter the account number of external transfer IB now new contact")
    public void enterTheAccountNumberOfExternalTransferIBNowNewContact() throws IOException {
        T24homepage Home = new T24homepage();
        String fAccount = Home.getPropertyy("externaltransnowfromaccountNewContact");
        String expectedStartDate = Home.getPropertyy("StartdatetExternalfuture");
        Home.enterdateInIbview(expectedStartDate);
        Home.enterAccountNumInIBviewofAccounttEntries(fAccount);
    }

    @Then("verify the narratives of external trasfer IB now new contact")
    public void verifyTheNarrativesOfExternalTrasferIBNowNewContact() {


    }

    @Then("Enter the account number of external transfer IB recurring new contact")
    public void enterTheAccountNumberOfExternalTransferIBRecurringNewContact() throws IOException {
        T24homepage Home = new T24homepage();
        String fAccount = Home.getPropertyy("externaltransrecurringfromaccountNewAccount");
        String expectedStartDate = Home.getPropertyy("externaltransrecurringStartDateNewAccount");
        Home.enterdateInIbview(expectedStartDate);
        Home.enterAccountNumInIBviewofAccounttEntries(fAccount);
    }

    @Then("verify the narratives of external trasfer IB recurring new contact")
    public void verifyTheNarrativesOfExternalTrasferIBRecurringNewContact() throws Exception {

        T24homepage Home = new T24homepage();
        String amount = Home.getPropertyy("externaltransrecurringAmountNewAccount");
        String Description = Home.getPropertyy("externaltransrecurringMYdescNewAccount");
        String balance = "";
        AccountEntries Acnt = new AccountEntries();
        Acnt.narrativest24NowBpay(amount, Description);
    }

    @And("Enter the details for external transfer new contact future")
    public void enterTheDetailsForExternalTransferNewContactFuture() throws Exception {
        T24homepage Home = new T24homepage();
        hm = new IBHomePage();
        String amount = Home.getRandomNumberStringTwodigit() + "." + Home.getRandomNumberStringTwodigit();
        String description1 = Home.getRandomNumberString("MY");
        String description2 = Home.getRandomNumberString("their");
        hm.transferExternalFutureNewContact(amount, description1, description2);
    }


    @And("Review the external transfer new contact future payment")
    public void reviewTheExternalTransferNewContactFuturePayment() throws Exception {
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        T24homepage home = new T24homepage();
        String fAccount = home.getPropertyy("StringfromaccountExternalfutureNewContact");
        String tAccount = home.getPropertyy("StringToaccountExternalfutureNewContact");
        String expectedAmt = home.getPropertyy("enteredExternalTransAmtIbFutureNewContact");
        String desc = home.getPropertyy("enteredExternalTransDescFutureNewContact");
        hm.reviewpaymentAndClose(fAccount, tAccount, expectedAmt, desc);
    }

    @And("Authorize the External transfer new contact future")
    public void authorizeTheExternalTransferNewContactFuture() throws Exception {

        T24homepage home = new T24homepage();
        hm = new IBHomePage();
        String amount = home.getPropertyy("enteredExternalTransAmtIbFutureNewContact");
        hm.authFunctionsInternalView(amount);
        AuthorizationIB AIb = new AuthorizationIB();
        String fAccount = home.getPropertyy("StringfromaccountExternalfutureNewContact");
        String Taccount = home.getPropertyy("StringToaccountExternalfutureNewContact");

        String Description = home.getPropertyy("enteredExternalTransDescFutureNewContact");
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        AIb.authorizationConfirmView(Taccount, fAccount, amount, Description);
    }

    @Then("Review authorization that the details of external transfer new contact future is reflected correctly")
    public void reviewAuthorizationThatTheDetailsOfExternalTransferNewContactFutureIsReflectedCorrectly() throws Exception {
        T24homepage home = new T24homepage();
        hm = new IBHomePage();
        AuthorizationIB AIb = new AuthorizationIB();
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        String fAccount = home.getPropertyy("StringfromaccountExternalfutureNewContact");
        String Taccount = home.getPropertyy("StringToaccountExternalfutureNewContact");
        String amount = home.getPropertyy("enteredExternalTransAmtIbFutureNewContact");
        String Description = home.getPropertyy("enteredExternalTransDescFutureNewContact");
        AIb.authorizationConfirm(fAccount, Taccount, amount, Description);
        AIb.returnToAuth();


    }

    @Then("Enter the account number of external transfer IB future new contact")
    public void enterTheAccountNumberOfExternalTransferIBFutureNewContact() throws IOException {
        T24homepage Home = new T24homepage();
        String fAccount = Home.getPropertyy("externaltransrecurringfromaccountNewAccount");
        String expectedStartDate = Home.getPropertyy("externaltransrecurringStartDateNewAccount");
        Home.enterdateInIbview(expectedStartDate);
        Home.enterAccountNumInIBviewofAccounttEntries(fAccount);
    }

    @Then("verify the narratives of external trasfer IB future new contact")
    public void verifyTheNarrativesOfExternalTrasferIBFutureNewContact() throws Exception {
        T24homepage Home = new T24homepage();
        String amount = Home.getPropertyy("externaltransrecurringAmountNewAccount");
        String Description = Home.getPropertyy("externaltransrecurringMYdescNewAccount");
        String balance = "";
        AccountEntries Acnt = new AccountEntries();
        Acnt.narrativest24NowBpay(amount, Description);
    }

    @Then("Click on Bpay")
    public void clickOnBpay() throws Exception {
        hm = new IBHomePage();
        hm.bpayClick();

    }

    @Then("Enter the Bpay details")
    public void enterTheBpayDetails() throws Exception {
        T24homepage th=new T24homepage();
        hm = new IBHomePage();
String amount=th.getRandomNumberStringTwodigit()+"."+th.getRandomNumberStringTwodigit();
        hm.bPay(amount, "fAccount", "tAccount", "billercode");


    }

    @And("confirm Bpay saved payment")
    public void confirmBpaySavedPayment() throws IOException {
        hm = new IBHomePage();
        T24homepage th = new T24homepage();
        String Fromaccount = th.getPropertyy("Bpaysavednowfromaccount");
        String Toaccount = th.getPropertyy("BpaysavednowToaccount");
        String Amount = th.getPropertyy("BpaysavednowAmount");
        String Billercode = th.getPropertyy("BillercodevalueBpaysavednow");
        hm.confirmdetailsBpay(Fromaccount, Toaccount, Amount, Billercode);
//        String bpayfuturedate=th.getPropertyy("bpayfuturedate");
//        hm.bpayfuturedateVerify(bpayfuturedate);
    }

    @And("confirm Bpay saved payment future")
    public void confirmBpaySavedPaymentfuture() throws IOException {
        hm = new IBHomePage();
        T24homepage th = new T24homepage();
        String Fromaccount = th.getPropertyy("Bpaysavedfuturfromaccount");
        String Toaccount = th.getPropertyy("BpaysavedfutureToaccount");
        String Amount = th.getPropertyy("BpaysavedfutureAmount");
        String Billercode = th.getPropertyy("BillercodevalueBpaysavedfuture");
        String bpayfuturedate = th.getPropertyy("bpayfuturedate");
        //hm.bpayfuturedateVerifyy(bpayfuturedate, "Daily");
        hm.confirmdetailsBpay(Fromaccount, Toaccount, Amount, Billercode);

    }


    @And("Review the BPAY saved contact future")
    public void reviewTheBPAYSavedContactfuture() throws Exception {
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        T24homepage home = new T24homepage();
        String fAccount = home.getPropertyy("Bpaysavedfuturfromaccount");
        String tAccount = home.getPropertyy("BpaysavedfutureToaccount");
        String expectedAmt = home.getPropertyy("BpaysavedfutureAmount");
        String Billercode = home.getPropertyy("BillercodevalueBpaysavedfuture");
        String desc = home.getPropertyy("enteredExternalTransDescFutureNewContact");
        String bpayfuturedate = home.getPropertyy("bpayfuturedate");
       // hm.bpayfuturedateVerify(bpayfuturedate, "Daily");
        hm.closeMessageBpayFuture(fAccount, tAccount, expectedAmt, bpayfuturedate);

    }

    @And("confirm Bpay saved payment recurring")
    public void confirmBpaySavedPaymentrecurring() throws IOException {
        hm = new IBHomePage();
        T24homepage th = new T24homepage();

        String Fromaccount = th.getPropertyy("Bpaysavedrecurringfromaccount");
        String Toaccount = th.getPropertyy("BpaysavedrecurringToaccount");
        String Amount = th.getPropertyy("BpaysavedrecurringAmount");
        String Billercode = th.getPropertyy("BillercodevalueBpaysavedrecurring");
        String bpayfuturedate = th.getPropertyy("bpayrecurringdate");
        // hm.bpayfuturedateVerify(bpayfuturedate);
        hm.confirmdetailsBpay(Fromaccount, Toaccount, Amount, Billercode);
    }

    @And("Review the BPAY saved contact now")
    public void reviewTheBPAYSavedContactnow() throws Exception {
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        T24homepage th = new T24homepage();
        String Fromaccount = th.getPropertyy("Bpaysavednowfromaccount");
        String Toaccount = th.getPropertyy("BpaysavednowToaccount");
        String Amount = th.getPropertyy("BpaysavednowAmount");
       // String Billercode = th.getPropertyy("BillercodevalueBpaysavednow");
       // String desc = home.getPropertyy("enteredExternalTransDescFutureNewContact");
        //String bpayfuturedate = home.getPropertyy("bpayrecurringdate");

        hm.closeMessageBpay(Fromaccount, Toaccount, Amount);

    }


    @And("Review the BPAY saved contact recurring")
    public void reviewTheBPAYSavedContactrecurring() throws Exception {
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        T24homepage home = new T24homepage();


        String fAccount = home.getPropertyy("Bpaysavedrecurringfromaccount");
        String tAccount = home.getPropertyy("BpaysavedrecurringToaccount");
        String expectedAmt = home.getPropertyy("BpaysavedrecurringAmount");
        String Billercode = home.getPropertyy("BillercodevalueBpaysavednow");
        //  String desc=home.getPropertyy("enteredExternalTransDescFutureNewContact");
        // String bpayfuturedate=home.getPropertyy("bpayfuturedate");
        hm.closeMessageBpayRecurring(fAccount, tAccount, expectedAmt);

    }


    @AfterStep()
    public void afterStep(Scenario scenario) {
        Hooks hooks = new Hooks();
        if (scenario.isFailed()) {

            // Hooks hooks = new Hooks();
            // hooks.takeScreenshot(hooks.scenario);

            //setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
            //Hooks hooks = new Hooks();
            String screenshotPath = "D:\\frameium\\Frameium_allure\\target\\screenshots\\" + "screen" + ".png";
            GenericFunctions.takeScreenshot(screenshotPath);
            GenericFunctions.attachScreenshotToAllure(screenshotPath);
        }


    }

    @Then("open the url")
    public void openTheUrl() {
        genericFunctions.getApplicationUrl("https://www.google.co.in/");
        //Assert.fail();
    }


    @Then("Authorize the Bpay transfer now")
    public void authorizeTheBpayTransferNow() throws Exception {
        T24homepage home = new T24homepage();
        hm = new IBHomePage();
        String expectedAmt = home.getPropertyy("BpaysavednowAmount");
        hm.authFunctionsInternalView(expectedAmt);
        AuthorizationIB AIb = new AuthorizationIB();

        String fAccount = home.getPropertyy("Bpaysavednowfromaccount");
        String Taccount = home.getPropertyy("BpaysavednowToaccount");
        // String amount=home.getPropertyy("externaltransrecurringAmountNewAccount");
        //String Description=home.getPropertyy("externaltransrecurringMYdescNewAccount");
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        String expectedStartDate = home.getPropertyy("externaltransrecurringStartDateNewAccount");
        String externaltransrecurringEndDate = home.getPropertyy("externaltransrecurringEndDateNewAccount");
        // hm.recuringDetailsAutorize(expectedStartDate,"Daily",externaltransrecurringEndDate);
        AIb.authorizationConfirmViewBpay(Taccount, fAccount, expectedAmt, "");
    }


    @Then("Authorize the Bpay transfer recurring")
    public void authorizeTheBpayTransferrecurring() throws Exception {
        T24homepage home = new T24homepage();
        hm = new IBHomePage();
        String tAccount = home.getPropertyy("BpaysavedrecurringToaccount");
        String Billercode = home.getPropertyy("BillercodevalueBpaysavednow");
        String expectedAmt = home.getPropertyy("BpaysavedrecurringAmount");
        hm.authFunctionsInternalView(expectedAmt);
        AuthorizationIB AIb = new AuthorizationIB();
        String fAccount = home.getPropertyy("Bpaysavedrecurringfromaccount");
        // String Taccount=home.getPropertyy("BpaysavednowToaccount");
        // String amount=home.getPropertyy("externaltransrecurringAmountNewAccount");
        //String Description=home.getPropertyy("externaltransrecurringMYdescNewAccount");
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        String expectedStartDate = home.getPropertyy("externaltransrecurringStartDateNewAccount");
        String externaltransrecurringEndDate = home.getPropertyy("externaltransrecurringEndDateNewAccount");
        // hm.recuringDetailsAutorize(expectedStartDate,"Daily",externaltransrecurringEndDate);
        AIb.authorizationConfirmViewBpay(tAccount, fAccount, expectedAmt, "");
    }

    @Then("Review authorization that the details of BPAY now is reflected correctly")
    public void reviewAuthorizationThatTheDetailsOfBPAYNowIsReflectedCorrectly() throws Exception {
        T24homepage home = new T24homepage();
        hm = new IBHomePage();
        AuthorizationIB AIb = new AuthorizationIB();
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        String tAccount = home.getPropertyy("BpaysavedrecurringToaccount");
        String Billercode = home.getPropertyy("BillercodevalueBpaynewContactnow");
        String expectedAmt = home.getPropertyy("BpaynewContactAmount");


        String fAccount = home.getPropertyy("BpaynewContactnowfromaccount");
        AIb.authorizationConfirmBpay(fAccount, tAccount, expectedAmt, "");
        AIb.returnToAuth();

    }
    @Then("Review authorization that the details of BPAY saved now is reflected correctly")
    public void reviewAuthorizationThatTheDetailsOfBPAYSavedNowIsReflectedCorrectly() throws Exception {
        T24homepage home = new T24homepage();
        hm = new IBHomePage();
        AuthorizationIB AIb = new AuthorizationIB();
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        String expectedAmt = home.getPropertyy("BpaysavednowAmount");
        String fAccount = home.getPropertyy("Bpaysavednowfromaccount");
        String Taccount = home.getPropertyy("BpaysavednowToaccount");



        AIb.authorizationConfirmBpay(fAccount, Taccount, expectedAmt, "");
        AIb.returnToAuth();

    }

    @Then("Review authorization that the details of BPAY future is reflected correctly")
    public void reviewAuthorizationThatTheDetailsOfBPAYfutureIsReflectedCorrectly() throws Exception {

        T24homepage th = new T24homepage();
        hm = new IBHomePage();
        AuthorizationIB AIb = new AuthorizationIB();
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        String Fromaccount = th.getPropertyy("Bpaysavedfuturfromaccount");
        String Toaccount = th.getPropertyy("BpaysavedfutureToaccount");
        String amount = th.getPropertyy("BpaysavedfutureAmount");
        AIb.authorizationConfirmBpay(Fromaccount,Toaccount, amount, "");
        AIb.returnToAuth();

    }
    @Then("Review authorization that the details of BPAY future new contact is reflected correctly")
    public void reviewAuthorizationThatTheDetailsOfBPAYNewContactfutureIsReflectedCorrectly() throws Exception {

        T24homepage th = new T24homepage();
        hm = new IBHomePage();
        AuthorizationIB AIb = new AuthorizationIB();
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        String Fromaccount = th.getPropertyy("BpaynewContactfuturfromaccount");
        String Toaccount = th.getPropertyy("BpaynewContactfutureToaccount");
        String expectedAmt = th.getPropertyy("BpaynewContactfutureAmount");
        AIb.authorizationConfirmBpay(Fromaccount,Toaccount, expectedAmt, "");
        AIb.returnToAuth();

    }

    @Then("Review authorization that the details of BPAY saved contact recurring is reflected correctly")
    public void reviewAuthorizationThatTheDetailsOfBPAYrecurringIsReflectedCorrectly() throws Exception {

        T24homepage th = new T24homepage();
        hm = new IBHomePage();
        AuthorizationIB AIb = new AuthorizationIB();
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);


        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");

        String Fromaccount = th.getPropertyy("Bpaysavedrecurringfromaccount");
        String Toaccount = th.getPropertyy("BpaysavedrecurringToaccount");
        String Amount = th.getPropertyy("BpaysavedrecurringAmount");
        String Billercode = th.getPropertyy("BillercodevalueBpaysavedrecurring");
        String bpayfuturedate = th.getPropertyy("bpayrecurringdate");
        AIb.authorizationConfirmBpay(Fromaccount, Toaccount, Amount, "");
        String startdate = th.getPropertyy("bpaySavedStartdaterecurringdate");
        String enddate = th.getPropertyy("bpaySavedrecurringenddate");
        hm.recurringdateConfirmPaymentVerify(startdate, enddate);
        AIb.returnToAuth();

    }
    @Then("Review authorization that the details of BPAY recurring is reflected correctly")
    public void reviewAuthorizationThatTheDetailsOfBPAYRecurringIsReflectedCorrectly() throws Exception {

        T24homepage th = new T24homepage();
        hm = new IBHomePage();
        AuthorizationIB AIb = new AuthorizationIB();
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);


        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        String Fromaccount = th.getPropertyy("BpaynewContactrecurringfromaccount");
        String Toaccount = th.getPropertyy("BpaysavedrecurringToaccount");
        String Amount = th.getPropertyy("BpaynewContactRecurringAmount");
        String Billercode = th.getPropertyy("BillercodevalueBpaynewContactRecurring");
        String bpayfuturedate = th.getPropertyy("bpayrecurringdate");


        String startdate = th.getPropertyy("BpaynewContactrecurringStartDate");
        String enddate = th.getPropertyy("BpaynewContactrecurringendDate");
        AIb.authorizationConfirmBpay(Fromaccount, Toaccount, Amount, "");


        hm.recurringdateConfirmPaymentVerify(startdate, enddate);
        AIb.returnToAuth();

    }

    @Then("Enter the Bpay future details")
    public void enterTheBpayFutureDetails() throws Exception {
        hm = new IBHomePage();

        hm.bPayFuture("1.45", "fAccount", "tAccount", "billercode");

    }

    @Then("Authorize the Bpay transfer future")
    public void authorizeTheBpayTransferFuture() throws Exception {
        T24homepage home = new T24homepage();
        hm = new IBHomePage();


        String expectedAmt = home.getPropertyy("BpaysavedfutureAmount");
        hm.authFunctionsInternalView(expectedAmt);
        AuthorizationIB AIb = new AuthorizationIB();
        String fAccount = home.getPropertyy("Bpaysavedfuturfromaccount");
        String Taccount = home.getPropertyy("BpaysavedfutureToaccount");
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
//        //String expectedStartDate=home.getPropertyy("externaltransrecurringStartDateNewAccount");
//       // String externaltransrecurringEndDate=home.getPropertyy("externaltransrecurringEndDateNewAccount");
        // hm.recuringDetailsAutorize(expectedStartDate,"Daily",externaltransrecurringEndDate);
        AIb.authorizationConfirmViewBpay(Taccount, fAccount, expectedAmt, "");
    }

    @Then("Enter the Bpay recurring details")
    public void enterTheBpayRecurringDetails() throws Exception {
        hm = new IBHomePage();

        hm.bPayFutureRecurring("1.45", "fAccount", "tAccount", "billercode");

    }

    @Then("Enter the Bpay new contact details")
    public void enterTheBpayNewContactDetails() throws Exception {
        T24homepage tm=new T24homepage();
        hm = new IBHomePage();
String amount=tm.getRandomNumberStringTwodigit()+"."+tm.getRandomNumberStringTwodigit();
        hm.bPayneecontact(amount, "fAccount", "tAccount", "97410", "10078227700006", "test1", "1.3");
    }

    @And("confirm Bpay new contact payment")
    public void confirmBpayNewContactPayment() throws IOException {
        hm = new IBHomePage();
        T24homepage th = new T24homepage();

        T24homepage hp = new T24homepage();

        String Fromaccount = th.getPropertyy("BpaynewContactnowfromaccount");
        String Toaccount = th.getPropertyy("BpaysavedrecurringToaccount");
        String Amount = th.getPropertyy("BpaynewContactAmount");
        String Billercode = th.getPropertyy("BillercodevalueBpaynewContactnow");
        String bpayfuturedate = th.getPropertyy("bpayrecurringdate");
        // hm.bpayfuturedateVerify(bpayfuturedate);
        hm.confirmdetailsBpay(Fromaccount, Toaccount, Amount, Billercode);

    }

    @And("Review the BPAY new contact now")
    public void reviewTheBPAYNewContactNow() throws Exception {
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        T24homepage th = new T24homepage();


        String Fromaccount = th.getPropertyy("BpaynewContactnowfromaccount");
        String Toaccount = th.getPropertyy("BpaysavedrecurringToaccount");
        String Amount = th.getPropertyy("BpaynewContactAmount");
        String Billercode = th.getPropertyy("BillercodevalueBpaynewContactnow");
        String bpayfuturedate = th.getPropertyy("bpayrecurringdate");
        //  String desc=home.getPropertyy("enteredExternalTransDescFutureNewContact");
        // String bpayfuturedate=home.getPropertyy("bpayfuturedate");
        hm.closeMessageBpayRecurring(Fromaccount, Toaccount, Amount);

    }

    @Then("Authorize the Bpay transfer new contact now")
    public void authorizeTheBpayTransferNewContactNow() throws Exception {
        T24homepage home = new T24homepage();
        hm = new IBHomePage();
        String tAccount = home.getPropertyy("BpaysavedrecurringToaccount");
        String Billercode = home.getPropertyy("BillercodevalueBpaynewContactnow");
        String expectedAmt = home.getPropertyy("BpaynewContactAmount");
        hm.authFunctionsInternalView(expectedAmt);
        AuthorizationIB AIb = new AuthorizationIB();
        String fAccount = home.getPropertyy("BpaynewContactnowfromaccount");
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        String expectedStartDate = home.getPropertyy("externaltransrecurringStartDateNewAccount");
        String externaltransrecurringEndDate = home.getPropertyy("externaltransrecurringEndDateNewAccount");
        // hm.recuringDetailsAutorize(expectedStartDate,"Daily",externaltransrecurringEndDate);
        AIb.authorizationConfirmViewBpay(tAccount, fAccount, expectedAmt, "");


    }

    @Then("Enter the Bpay new contact recurring details")
    public void enterTheBpayNewContactRecurringDetails() throws Exception {
        hm = new IBHomePage();
        hm.bPayneecontactRecurring("1.45", "fAccount", "tAccount", "97410", "10078227700006", "test1", "1.3");
    }

    @And("confirm Bpay new contact recurring payment")
    public void confirmBpayNewContactRecurringPayment() throws Exception {
        hm = new IBHomePage();
        T24homepage th = new T24homepage();
        T24homepage hp = new T24homepage();
        String Fromaccount = th.getPropertyy("BpaynewContactrecurringfromaccount");
        String Toaccount = th.getPropertyy("BpaysavedrecurringToaccount");
        String Amount = th.getPropertyy("BpaynewContactRecurringAmount");
        String Billercode = th.getPropertyy("BillercodevalueBpaynewContactRecurring");
        String bpayfuturedate = th.getPropertyy("bpayrecurringdate");
        // hm.bpayfuturedateVerify(bpayfuturedate);

        String startdate = th.getPropertyy("BpaynewContactrecurringStartDate");
        String enddate = th.getPropertyy("BpaynewContactrecurringendDate");
        hm.recurringdateConfirmPaymentVerify(startdate, enddate);
        hm.confirmdetailsBpay(Fromaccount, Toaccount, Amount, Billercode);


    }

    @Then("Authorize the Bpay transfer new contact recurring")
    public void authorizeTheBpayTransferNewContactRecurring() throws Exception {
        T24homepage home = new T24homepage();
        hm = new IBHomePage();


        String tAccount = home.getPropertyy("BpaysavedrecurringToaccount");
        String Billercode = home.getPropertyy("BillercodevalueBpaynewContactRecurring");
        String expectedAmt = home.getPropertyy("BpaynewContactRecurringAmount");
        hm.authFunctionsInternalView(expectedAmt);
        AuthorizationIB AIb = new AuthorizationIB();
        String fAccount = home.getPropertyy("BpaynewContactrecurringfromaccount");
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        String expectedStartDate = home.getPropertyy("externaltransrecurringStartDateNewAccount");
        String externaltransrecurringEndDate = home.getPropertyy("externaltransrecurringEndDateNewAccount");
        // hm.recuringDetailsAutorize(expectedStartDate,"Daily",externaltransrecurringEndDate);
        String startdate = home.getPropertyy("BpaynewContactrecurringStartDate");
        String enddate = home.getPropertyy("BpaynewContactrecurringendDate");
        hm.recurringdateConfirmPaymentVerify(startdate, enddate);

        AIb.authorizationConfirmViewBpay(tAccount, fAccount, expectedAmt, "");

    }

    @And("Review the BPAY new contact recurring")
    public void reviewTheBPAYNewContactRecurring() throws Exception {
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        T24homepage th = new T24homepage();
        String Fromaccount = th.getPropertyy("BpaynewContactrecurringfromaccount");
        String Toaccount = th.getPropertyy("BpaysavedrecurringToaccount");
        String Amount = th.getPropertyy("BpaynewContactRecurringAmount");
        String Billercode = th.getPropertyy("BillercodevalueBpaynewContactRecurring");
        String bpayfuturedate = th.getPropertyy("bpayrecurringdate");
        //  String desc=home.getPropertyy("enteredExternalTransDescFutureNewContact");
        // String bpayfuturedate=home.getPropertyy("bpayfuturedate");

        String startdate = th.getPropertyy("BpaynewContactrecurringStartDate");
        String enddate = th.getPropertyy("BpaynewContactrecurringendDate");
        hm.recurringdateConfirmPaymentVerify(startdate, enddate);

        hm.closeMessageBpayRecurring(Fromaccount, Toaccount, Amount);


    }

    @Then("Enter the Bpay new contact future details")
    public void enterTheBpayNewContactFutureDetails() throws Exception {
        T24homepage th = new T24homepage();
        IBHomePage home = new IBHomePage();
        String amount = th.getRandomNumberStringTwodigit() + "." + th.getRandomNumberStringTwodigit();
        hm.bPayFutureNewContact(amount, "", "", "97410", "10078227700006", "newtest1");

    }

    @And("confirm Bpay new contact future payment")
    public void confirmBpayNewContactFuturePayment() throws Exception {
        hm = new IBHomePage();
        T24homepage th = new T24homepage();

        String Fromaccount = th.getPropertyy("BpaynewContactfuturfromaccount");
        String Toaccount = th.getPropertyy("BpaynewContactfutureToaccount");
        String Amount = th.getPropertyy("BpaynewContactfutureAmount");
        String Billercode = th.getPropertyy("BillercodevalueBpaynewContactfuture");
        String bpayfuturedate = th.getPropertyy("bpayfuturedatenewcontact");
        hm.bpayfuturedateVerifyy(bpayfuturedate, "Daily");
        hm.confirmdetailsBpay(Fromaccount, Toaccount, Amount, Billercode);


    }

    @And("Review the BPAY new contact future")
    public void reviewTheBPAYNewContactFuture() throws Exception {
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        T24homepage th = new T24homepage();
        IBHomePage IB = new IBHomePage();
        String Fromaccount = th.getPropertyy("BpaynewContactfuturfromaccount");
        String Toaccount = th.getPropertyy("BpaynewContactfutureToaccount");
        String Amount = th.getPropertyy("BpaynewContactfutureAmount");
        String Billercode = th.getPropertyy("BillercodevalueBpaynewContactfuture");
        String bpayfuturedate = th.getPropertyy("bpayfuturedatenewcontact");
        IB.bpayfuturedateVerifyy(bpayfuturedate, "Daily");

        hm.closeMessageBpayRecurring(Fromaccount, Toaccount, Amount);

    }

    @Then("Authorize the Bpay transfer new contact future")
    public void authorizeTheBpayTransferNewContactFuture() throws Exception {
        T24homepage home = new T24homepage();
        hm = new IBHomePage();
        String tAccount = home.getPropertyy("BpaynewContactfutureToaccount");
        String Billercode = home.getPropertyy("BillercodevalueBpaynewContactRecurring");
        String expectedAmt = home.getPropertyy("BpaynewContactfutureAmount");
        hm.authFunctionsInternalView(expectedAmt);
        AuthorizationIB AIb = new AuthorizationIB();
        String fAccount = home.getPropertyy("BpaynewContactfuturfromaccount");
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        String expectedStartDate = home.getPropertyy("externaltransrecurringStartDateNewAccount");
        String externaltransrecurringEndDate = home.getPropertyy("externaltransrecurringEndDateNewAccount");
        AIb.authorizationConfirmViewBpay(tAccount, fAccount, expectedAmt, "");

    }

    @When("Click on inbox")
    public void clickOnInbox() throws Exception {
        hm = new IBHomePage();
        hm.InboxMessageClick();
        hm.getMessageCount();
    }

    @When("read the message")
    public void readTheMessage() throws Exception {
        hm = new IBHomePage();
        hm.readMsg();
    }

    @Then("check whether the message count decreased")
    public void checkWhetherTheMessageCountDecrased() throws Exception {
        hm = new IBHomePage();
        hm.compareMsgCount();

    }

    @When("User opens the IBM URL")
    public void userOpensTheIBMURL() throws Exception {
        genericFunctions.getApplicationUrl("https://temenosibmanageruat.unitingfinancial.com.au/IBManager");
        genericFunctions.waitForPageToLoad(2000);

        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
//
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");

    }
    @When("User opens the UAT IBM URL")
    public void userOpensTheUatIBMURL() throws Exception {
        genericFunctions.getApplicationUrl("https://temenosibmanageruat.unitingfinancial.com.au/IBManager");
        genericFunctions.waitForPageToLoad(2000);

        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
//
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");

    }
    @When("User opens the SIT IBM  URL")
    public void userOpensTheUatIBMURLSit() throws Exception {
        genericFunctions.getApplicationUrl("https://temenosibmanagersit.unitingfinancial.com.au/IBManager");
        genericFunctions.waitForPageToLoad(2000);

        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
//
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");

    }
    @When("User opens the SIT IBM URL")
    public void userOpensTheSitIBMURL() throws Exception {
        genericFunctions.getApplicationUrl("https://temenosibmanageruat.unitingfinancial.com.au/IBManager");
        genericFunctions.waitForPageToLoad(2000);

        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
//
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");

    }

    @When("Login to IBM")
    public void loginToIBM() throws Exception {
        hm = new IBHomePage();
        hm.ibManagerLogin("Haril", "Temenos@123");

    }

    @When("Login to SIT IBM")
    public void loginToIBMUat() throws Exception {
        hm = new IBHomePage();
        hm.ibManagerLogin("ljohnson", "Temenos@123");

    }
    @When("Login to UAT IBM")
    public void loginToIBMUat_() throws Exception {
        hm = new IBHomePage();
        hm.ibManagerLogin("Haril", "Temenos@123");

    }

    @When("we send the Normal message")
    public void sendTheSecureMessage() throws Exception {
        hm = new IBHomePage();
        hm.secureMailNewToAllNormal("normal", "UFS");

    }

    @When("We send the urgent message")
    public void weSendTheUrgentMessage() throws Exception {
        hm = new IBHomePage();

        hm.secureMailNewToAllUrgent("Greetings", "UFS");
    }

    @Then("check whether the urgent message is displayed on the inbox")
    public void checkWhetherTheurgentMessageIsDisplayedOnTheInbox() throws Exception {
        hm = new IBHomePage();
        T24homepage th = new T24homepage();

        String messagecontent = th.getPropertyy("urgentmsg");
        String subject = th.getPropertyy("subjecturgentmsg");
        hm.newTourgentAll(subject, messagecontent);
    }

    @Then("check whether the normal message is displayed on the inbox")
    public void checkWhetherTheNormalMessageIsDisplayedOnTheInbox() throws Exception {

        hm = new IBHomePage();
        T24homepage th = new T24homepage();
        String messagecontent = th.getPropertyy("Normalmsg");
        String subject = th.getPropertyy("subjectNormalmsg");
        hm.newTourgentAll(subject, messagecontent);
    }

    @Then("verify whether the urgent message is displayed in the landing page")
    public void verifyWhetherTheUrgentMessageIsDisplayedInTheLandingPage() throws Exception {
        hm = new IBHomePage();
        T24homepage th = new T24homepage();
        String messageSubject = th.getPropertyy("urgentmsg");

    }

    @When("Login to IB for changing password")
    public void loginToIBForChangingPassword() throws Exception {
        T24homepage Th = new T24homepage();
        String username = "962623";
        String password = "Temenos@123";
        String password2 = "Temenos@1234";
        String passwordnew = Th.getPropertyy("password");
//        passwordnew="Temenos@123";
        hm = new IBHomePage();
        hm.loginIBInternalPasswordchange(username, passwordnew);
        Thread.sleep(500);
        boolean a = hm.validpaswordcheck();
        if (a == true) {
            if (passwordnew.equals(password)) {
                passwordnew = password2;
            } else {
                passwordnew = password;
            }
            Th.setProperty("password", passwordnew);
            hm.loginIBInternalPasswordchange(username, passwordnew);
        }
    }

    @When("click on pasword change")
    public void clickOnPaswordChange() {
        IBHomePage hm = new IBHomePage();
        hm.securityClick();

    }

    @When("change the password")
    public void changeThePassword() throws Exception {
        IBHomePage hm = new IBHomePage();
        T24homepage Th = new T24homepage();
        String passwordnew = Th.getPropertyy("password");

        hm.paaswordChange("Temenos@123", "Temenos@1234", passwordnew);

    }

    @When("Click on add contact")
    public void clickOnAddContact() throws Exception {
        IBHomePage hm = new IBHomePage();
        hm.AddContactClick();
    }

    @When("add the new contact details")
    public void enterTheNewContactDetails() throws Exception {
        IBHomePage hm = new IBHomePage();
        T24homepage Th = new T24homepage();
        String nickname = Th.getRandomNumberString("james");
        hm.transfernewcontactdetails("634634", "100052076", "title1", nickname);
    }

    @Then("confirm whether the details are correct")
    public void confirmWhetherTheDetailsAreCorrect() throws Exception {
        IBHomePage hm = new IBHomePage();
        T24homepage Th = new T24homepage();
        String expectedBSB = Th.getPropertyy("Bsbaddcontact");
        String expectedAccountnum = Th.getPropertyy("expectedAccountaddcontact");
        String expectedAccountname = Th.getPropertyy("expectedAccountnameaddcontact");
        String expectednicknameaddcontact = Th.getPropertyy("expectednicknameaddcontact");
        hm.ConfirmdetailsAddcontact(expectedBSB, expectedAccountnum, expectedAccountname, expectednicknameaddcontact);

    }

    @When("edit the newly added contact details")
    public void editTheNewlyAddedContactDetails() throws Exception {
        IBHomePage hm = new IBHomePage();
        T24homepage Th = new T24homepage();
        String expectednicknameaddcontact = Th.getPropertyy("expectednicknameaddcontact");
        String editedname = Th.getRandomNumberString("newname");
        hm.editdetailsAddContact(expectednicknameaddcontact, editedname);
        Th.setProperty("editedname", editedname);

    }

    @When("delete the newly added contact")
    public void deleteTheNewlyAddedContact() throws Exception {
        IBHomePage hm = new IBHomePage();
        T24homepage Th = new T24homepage();
        String expectednicknameaddcontact = Th.getPropertyy("expectednicknameaddcontact");
        String editedname = Th.getPropertyy("editedname");
        hm.deletecontact(editedname);
    }

    @When("add the new contact details of Bpay")
    public void addTheNewContactDetailsOfBpay() throws Exception {
        IBHomePage hm = new IBHomePage();
        T24homepage Th = new T24homepage();
        String nickname = Th.getRandomNumberString("james");
        hm.transfernewcontactdetailsBpay2("97410", "10078227700006", "energyAustralia", "new");

    }

    @Then("confirm whether the newly added BPAY details are correct")
    public void confirmWhetherTheNewlyAddedBPAYDetailsAreCorrect() throws Exception {
        IBHomePage hm = new IBHomePage();
        T24homepage Th = new T24homepage();
        String expectedbillerCode = Th.getPropertyy("expectedbillerCodeBpay");
        String expectedbiilerCrnCode = Th.getPropertyy("expectedbiilerCrnCode");
        String expectednicknameaddcontact = Th.getPropertyy("expectednicknameaddcontactBpay");
        String expectedBillername=Th.getPropertyy("expectedbillername");


        hm.ConfirmdetailsAddcontactBpay(expectedbillerCode, expectedbiilerCrnCode, expectedBillername, expectednicknameaddcontact);
    }

    @When("edit the newly added BPAY contact details")
    public void editTheNewlyAddedBPAYContactDetails()throws Exception {
        IBHomePage hm = new IBHomePage();
        T24homepage Th = new T24homepage();
        String expectednicknameaddcontact = Th.getPropertyy("expectednicknameaddcontactBpay");
        String editedname = Th.getRandomNumberString("newname");
        hm.editdetailsAddContact(expectednicknameaddcontact, editedname);
        Th.setProperty("editedname", editedname);


    }

    @When("delete the newly added BPAY contact")
    public void deleteTheNewlyAddedBPAYContact()throws Exception {
        IBHomePage hm = new IBHomePage();
        T24homepage Th = new T24homepage();
        String expectednicknameaddcontact = Th.getPropertyy("expectednicknameaddcontactBpay");

        String editedname = Th.getPropertyy("editedname");
        hm.deletecontact(editedname);
    }

    @Then("check whether the session history is showing the correct details")
    public void checkWhetherTheSessionHistoryIsShowingTheCorrectDetails() throws Exception {
        IBHomePage hm = new IBHomePage();
        hm.sessionHistory();

    }

    @Then("create new batch template")
    public void createNewBatchTemplate() throws Exception {
        IBHomePage hm = new IBHomePage();
        T24homepage th = new T24homepage();
        hm.savedBatchTemplatesEdit("1.2", "des", "TH");
        String destination = "Templ" + th.getRandomNumberString("");
        String destinationnew = "Tempnew" + th.getRandomNumberString("");
        hm.newContactBatchTemplate("1.2", destination, "TH", "ACNTname", "100052026", "634634", "nickname");
        hm.batchEdit("1.5", destination, "TH", destinationnew, "DES2", "1.8");
        th.setProperty("batchpaytmpltdescription", destinationnew);
    }

    @Then("Delete the newly created batch template")
    public void deleteTheNewlyCreatedBatchTemplate() throws Exception {
        IBHomePage hm = new IBHomePage();
        T24homepage th = new T24homepage();
        String destination = th.getPropertyy("batchpaytmpltdescription");
        hm.batchTemplateDelete("", destination);

    }

    @Then("compose message")
    public void composeMessage() throws Exception {
        IBHomePage hm = new IBHomePage();
        hm.composeMessage("Greetings");
    }

    @Then("Click on Batch")
    public void clickOnBatch() {
        IBHomePage hm = new IBHomePage();
        hm.batchClick();
    }

    @And("Enter the details of batchpayment file")
    public void enterTheDetailsOfBatchpaymentFile() throws Exception {
        IBHomePage hm = new IBHomePage();
        String path = "D:\\frameium\\Frameium_allure\\src\\test\\resources\\uploadFiles\\DebitBatchFile.aba";
        hm.savedBatchDebitFile("1.5", "Des", "420284", path);
    }
    @And("Enter the details of Credit batchpayment file")
    public void enterTheDetailsOfCreditBatchpaymentFile() throws Exception {
        IBHomePage hm = new IBHomePage();
        String path = "D:\\frameium\\Frameium_allure\\src\\test\\resources\\uploadFiles\\creditbatchpayment.txt";
        hm.batchPaymentsFile("1.5", "Des", path);
    }

    @Then("Review the batch payment template")
    public void reviewTheBatchPaymentTemplate() {
        IBHomePage hm = new IBHomePage();
        T24homepage Th=new T24homepage();
        String Description="";
        String DebitbtchdestinationAcnt= Th.getProperty("DebitbtchdestinationAcnt");
        String DebitbtchTmplatepostingDate= Th.getProperty("DebitbtchTmplatepostingDate");
        String DebitbtchTmplTotalamount= Th.getProperty("DebitbtchTmplTotalamount");
        hm.reviewBatchPayment();
        hm.reviewBatchPaymentDetails(DebitbtchTmplatepostingDate,DebitbtchTmplTotalamount,DebitbtchdestinationAcnt,Description);





    }
    @Then("Review the batch payment file")
    public void reviewTheBatchPaymentTemplatefile() {
        IBHomePage hm = new IBHomePage();
        T24homepage Th = new T24homepage();
        String Description = "";
        String DebitbtchdestinationAcnt = Th.getProperty("DebitbtchdestinationAcnt");
        String DebitbtchTmplatepostingDate = Th.getProperty("DebitbtchTmplatepostingDate");
        String DebitbtchTmplTotalamount = Th.getProperty("DebitbtchTmplTotalamount");
        hm.reviewBatchPayment();
        hm.reviewBatchPaymentDetails(DebitbtchTmplatepostingDate, DebitbtchTmplTotalamount, DebitbtchdestinationAcnt, Description);
    }
        @Then("Review the credit batch payment ")
    public void reviewTheBatchPaymentTemplatee() {
        IBHomePage hm = new IBHomePage();
        T24homepage Th = new T24homepage();
        String Description = "";
        String DebitbtchdestinationAcnt = Th.getProperty("DebitbtchdestinationAcnt");
        String DebitbtchTmplatepostingDate = Th.getProperty("DebitbtchTmplatepostingDate");
        String DebitbtchTmplTotalamount = Th.getProperty("DebitbtchTmplTotalamount");
        hm.reviewBatchPayment();
        hm.reviewBatchPaymentDetails(DebitbtchTmplatepostingDate, DebitbtchTmplTotalamount, DebitbtchdestinationAcnt, Description);
    }

    @And("open the batch payment that need to be authorised")
    public void openTheBatchPaymentThatNeedToBeAuthorised() throws Exception {
        IBHomePage hm = new IBHomePage();
        T24homepage TH = new T24homepage();

        String amount = TH.getPropertyy("CreditbatchbatchpaymentfileAmount");
        String description = TH.getPropertyy("Creditbatchbatchpaymentfiledescription");
        hm.authFunctionsInternalView(amount);


    }
    @And("open the batch payment using file that need to be authorised")
    public void openTheBatchPaymentThatNeedToBeAuthorisedd() throws Exception {
        IBHomePage hm = new IBHomePage();
        T24homepage TH = new T24homepage();

        String amount = TH.getPropertyy("debitbatchbatchpaymentfileAmount");
        String description = TH.getPropertyy("debitbatchbatchpaymentfiledescription");
        hm.authFunctionsInternalView(amount);


    }

    @Then("authorise the batch payment")
    public void authoriseTheBatchPayment() throws Exception {
        IBHomePage hm = new IBHomePage();
        T24homepage TH = new T24homepage();
        String amount = TH.getPropertyy("debitbatchbatchpaymentfileAmount");
        String description = TH.getPropertyy("debitbatchbatchpaymentfiledescription");
        hm.authorizationConfirmDebitBatchViewTemplatee("100022427", description, amount);

    }
    @Then("authorise the credit batch payment file")
    public void authoriseTheCreditBatchPaymentfile() throws Exception {
        IBHomePage hm = new IBHomePage();
        T24homepage TH = new T24homepage();
        String amount = TH.getPropertyy("CreditbatchbatchpaymentfileAmount");
        String description = TH.getPropertyy("Creditbatchbatchpaymentfiledescription");
        String sourceAccount = TH.getPropertyy("SourceAccntCreditBatchpaymentsfile");
        hm.authorizationConfirmCredtBatchViewTemplate(sourceAccount, description, amount);

    }
    @Then("review authorization that the details of debitbatchpaymentsfile")
    public void reviewAuthorizationThatTheDetailsOfdebitbatchpaymentsfile() throws Exception {
        IBHomePage hm = new IBHomePage();
        T24homepage TH = new T24homepage();
        String amount = TH.getPropertyy("debitbatchbatchpaymentfileAmount");
        String description = TH.getPropertyy("debitbatchbatchpaymentfiledescription");
        String toaccount = TH.getPropertyy("destAccntDebitBatchpaymentsfile");
        hm.reviewAuthorizationBatchTemplate(amount, description, toaccount);
        AuthorizationIB AIb = new AuthorizationIB();
        AIb.returnToAuth();
    }
    @Then("review authorization that the details of creditbatchpaymentsfile")
    public void reviewAuthorizationThatTheDetailsOfCreditbatchpaymentsfile() throws Exception {
        IBHomePage hm = new IBHomePage();
        T24homepage TH = new T24homepage();
        String amount = TH.getPropertyy("CreditbatchbatchpaymentfileAmount");
        String description = TH.getPropertyy("Creditbatchbatchpaymentfiledescription");
        String Sourceaccount = TH.getPropertyy("SourceAccntCreditBatchpaymentsfile");
        hm.reviewAuthorizationCreditBatchTemplate(amount, description, Sourceaccount);
        AuthorizationIB AIb = new AuthorizationIB();
        AIb.returnToAuth();
    }

    @Then("Enter the account number of debitbatchpaymentsfile")
    public void enterTheAccountNumberOfdebitbatchpaymentsfile() throws Exception {
        T24homepage Home = new T24homepage();
        String fAccount = Home.getPropertyy("destAccntDebitBatchpaymentsfile");
        Home.enterAccountNumInIbviewofAccounttEntries(fAccount,"");
        //String expectedStartDate=Home.getPropertyy("externaltransrecurringStartDateNewAccount");
        String expectedStartDate = "25/09/2024";
        Home.enterdateInIbview(expectedStartDate);

    }
    @Then("Enter the account number of creditbatchpaymentsfile")
    public void enterTheAccountNumberOfCreditbatchpaymentsfile() throws Exception {
        T24homepage Home = new T24homepage();
        String fAccount = Home.getPropertyy("SourceAccntCreditBatchpaymentsfile");
        Home.enterAccountNumInIbviewofAccounttEntries(fAccount,"");

        String expectedStartDate=Home.getPropertyy("DateAccntCreditBatchpaymentsfile");
        expectedStartDate=Home.datePickIBM();
        Home.enterdateInIbview(expectedStartDate);

    }

    @Then("verify the narratives of debitbatchpaymentsfile")
    public void verifyTheNarrativesOfdebitbatchpaymentsfile() throws Exception {
        T24homepage Home = new T24homepage();
        String amount = Home.getPropertyy("debitbatchbatchpaymentfileAmount");
        String Description = Home.getPropertyy("debitbatchbatchpaymentfiledescription");
        AccountEntries Acnt = new AccountEntries();
        Acnt.narrativest24NowBatchcredit(amount, Description);
    }
    @Then("verify the narratives of creditbatchpaymentsfile")
    public void verifyTheNarrativesOfCreditbatchpaymentsfile() throws Exception {
        T24homepage Home = new T24homepage();
        T24homepage TH=new T24homepage();
        String amount = TH.getPropertyy("CreditbatchbatchpaymentfileAmount");
        String description = TH.getPropertyy("Creditbatchbatchpaymentfiledescription");

        AccountEntries Acnt = new AccountEntries();
        Acnt.narrativest24NowBatchDebit(amount, description);
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }

    @And("Enter the details of Credit batchpayment")
    public void enterTheDetailsOfCreditBatchpayment() throws  Exception{

        IBHomePage hm = new IBHomePage();
        T24homepage TH=new T24homepage();
       String Description=TH.getRandomNumberString("Crbatch");
        String Description2=TH.getRandomNumberString("Crbatch2");

           String Amount1=TH.getRandomNumberStringTwodigit()+"."+ TH.getRandomNumberStringTwodigit();
        String Amount2=TH.getRandomNumberStringTwodigit()+"."+ TH.getRandomNumberStringTwodigit();
        hm.creditBatchNewContact(Amount1,Description,Amount2,Description2,"TH");


    }
    @And("Enter the details of Debit batchpayment")
    public void enterTheDetailsOfCreditBatchpaymentt() throws  Exception{
        IBHomePage hm = new IBHomePage();
        T24homepage TH=new T24homepage();
        String Description=TH.getRandomNumberString("Debbatch");
        String Description2=TH.getRandomNumberString("Debbatch2");
        String Amount1=TH.getRandomNumberStringTwodigit()+"."+ TH.getRandomNumberStringTwodigit();
        String Amount2=TH.getRandomNumberStringTwodigit()+"."+ TH.getRandomNumberStringTwodigit();
        hm.batchPaymentsDebitNewSaved(Amount1,Description,Amount2,Description2,"420284");


    }
    @And("Enter the details of Debit batchpayment template")
    public void EnterTheDetailsOfCreditBatchpayment() throws  Exception{
        IBHomePage hm = new IBHomePage();
        T24homepage TH=new T24homepage();
        String Description=TH.getRandomNumberString("Crbatch");
        String Description2=TH.getRandomNumberString("Crbatch2");
        String Amount1=TH.getRandomNumberStringTwodigit()+"."+ TH.getRandomNumberStringTwodigit();
        String Amount2=TH.getRandomNumberStringTwodigit()+"."+ TH.getRandomNumberStringTwodigit();
        String becid="420284";
        hm.savedBatchTemplates(Amount1,Description,becid);
    }
    @And("Enter the details of Credit batchpayment template")
    public void EnterTheDetailsOfCreditBatchpaymentTemplate() throws  Exception{
        IBHomePage hm = new IBHomePage();
        T24homepage TH=new T24homepage();
        String Description=TH.getRandomNumberString("Creditbatch");
        //String Description2=TH.getRandomNumberString("Crbatch2");
        String Amount1=TH.getRandomNumberStringTwodigit()+"."+ TH.getRandomNumberStringTwodigit();
        String Amount2=TH.getRandomNumberStringTwodigit()+"."+ TH.getRandomNumberStringTwodigit();
        String becid="420284";
        hm.creditBatchTemplates(Amount1,Description,becid);
    }


    @Then("verify the details and click on Pay now button credit")
    public void verifyTheDetailsAndClickOnPayNowButton()throws Exception {
        IBHomePage hm = new IBHomePage();
        T24homepage TH=new T24homepage();
        String amount = TH.getPropertyy("TotalamountCreditbatch");
        String batchCreditSourceAccount = TH.getPropertyy("batchCreditSourceAccount");
        String Description = TH.getPropertyy("batchCreditDescription");
        String postingdate = TH.getPropertyy("BatchCreditpostingdate");
        // hm.BatchpaymentVerify(batchdebitDestinationAccount,postingdate,Description,amount);
        hm.BatchpaymentVerifyCredit(batchCreditSourceAccount,postingdate,Description,amount);

    }

    @Then("verify the details and click on Pay now button")
    public void verifyTheDetailsAndClickOnPayNowButtondbttmplt()throws Exception {
        IBHomePage hm = new IBHomePage();
        T24homepage TH=new T24homepage();

        String amount = TH.getPropertyy("DebitbtchTmplTotalamount");
        String batchdebitDestinationAccount = TH.getPropertyy("DebitbtTmpltechdestinationAcnt");
        String Description = TH.getPropertyy("DebitbtchTmplDescription");
        String postingdate = TH.getPropertyy("DebitbtchTmplatepostingDate");
       // hm.BatchpaymentVerify(batchdebitDestinationAccount,postingdate,Description,amount);
        hm.BatchpaymentVerifyCredit(batchdebitDestinationAccount,postingdate,Description,amount);

    }

    @Then("verify the details of credit batch payment template and click on Pay now button")
    public void verifyTheDetailsAndClickOnPayNowButtondbttmplate()throws Exception {
        IBHomePage hm = new IBHomePage();
        T24homepage TH=new T24homepage();
        String source = TH.getPropertyy("batchCreditSourceAccount");
        String amount = TH.getPropertyy("DebitbtchTmplTotalamount");
        String batchdebitDestinationAccount = TH.getPropertyy("DebitbtTmpltechdestinationAcnt");
        String Description = TH.getPropertyy("DebitbtchTmplDescription");
        String postingdate = TH.getPropertyy("DebitbtchTmplatepostingDate");
        // hm.BatchpaymentVerify(batchdebitDestinationAccount,postingdate,Description,amount);
       // hm.creditBatchTemplates(amount,batchdebitDestinationAccount,"");

    }





    @Then("verify the details of credit batch and Click on Pay now button")
    public void verifyTheDetailsofcreditbatchAndClickOnPayNowButton()throws Exception {
        IBHomePage hm = new IBHomePage();
        T24homepage TH=new T24homepage();

        String sorce = TH.getPropertyy("SourceAccntCreditBatchpaymentsfile");
        String amount = TH.getPropertyy("CreditbatchbatchpaymentfileAmount");
        String batchdebitDestinationAccount = TH.getPropertyy("Creditbatchbatchpaymentfiledescription");
        String Description = TH.getPropertyy("Creditbatchbatchpaymentfiledescription");
        String postingdate = "";
        // hm.BatchpaymentVerify(batchdebitDestinationAccount,postingdate,Description,amount);
        hm.CreditBatchReviewpaymentVerify(sorce,postingdate,Description,amount);

    }

    @Then("verify the details of credit batch and click on Pay now button")
    public void verifyTheDetailsofdebittbatchAndClickOnPayNowButtondebit()throws Exception {
        IBHomePage hm = new IBHomePage();
        T24homepage TH=new T24homepage();

        String amount = TH.getPropertyy("DebitbtchTmplTotalamount");
        String batchdebitDestinationAccount = TH.getPropertyy("DebitbtTmpltechdestinationAcnt");
        String Description = TH.getPropertyy("DebitbtchTmplDescription");
        String postingdate = TH.getPropertyy("DebitbtchTmplatepostingDate");
        // hm.BatchpaymentVerify(batchdebitDestinationAccount,postingdate,Description,amount);
        hm.BatchReviewpaymentVerify(batchdebitDestinationAccount,postingdate,Description,amount);

    }
    @Then("verify the details of debit batch payment and click on Pay now button")
    public void verifyTheDetailsOFDebitbatchAndClickOnPayNowButton()throws Exception {
        IBHomePage hm = new IBHomePage();
        T24homepage TH=new T24homepage();



        String amount = TH.getPropertyy("DebitbtchpaymentTotalamount");
        String batchdebitDestinationAccount = TH.getPropertyy("DebitbtchpaymentDestinationAcnt");
        String Description = TH.getPropertyy("DebitbtchpaymentDescription");
        String postingdate = TH.getPropertyy("DebitbtchPaypostingDate");
        // hm.BatchpaymentVerify(batchdebitDestinationAccount,postingdate,Description,amount);
        hm.BatchReviewpaymentVerify(batchdebitDestinationAccount,postingdate,Description,amount);

    }
    @And("open the credit batch payment that need to be authorised")
    public void openTheCreditBatchPaymentThatNeedToBeAuthorised() throws Exception {
        IBHomePage hm = new IBHomePage();
        T24homepage TH = new T24homepage();
        String amount = TH.getPropertyy("TotalamountCreditbatch");
        String batchCreditSourceAccount = TH.getPropertyy("batchCreditSourceAccount");
        String Description = TH.getPropertyy("batchCreditDescription");
        String postingdate = TH.getPropertyy("BatchCreditpostingdate");
        hm.authFunctionsInternalView(amount);


    }
    @And("open the debit batch payment that need to be authorised")
    public void openThedebitBatchPaymentThatNeedToBeAuthorised() throws Exception {
        IBHomePage hm = new IBHomePage();
        T24homepage TH = new T24homepage();
        String amount = TH.getPropertyy("DebitbtchpaymentTotalamount");
        String batchdebitDestinationAccount = TH.getPropertyy("DebitbtchpaymentDestinationAcnt");
        String Description = TH.getPropertyy("DebitbtchpaymentDescription");
        String postingdate = TH.getPropertyy("DebitbtchPaypostingDate");
        hm.authFunctionsInternalView(amount);


    }
    @Then("authorise the credit batch payment")
    public void authoriseTheCreditBatchPayment() throws Exception{
        IBHomePage hm = new IBHomePage();
        T24homepage TH = new T24homepage();
        String amount = TH.getPropertyy("TotalamountCreditbatch");
        String description = TH.getPropertyy("batchCreditDescription");
        String sourceAccount = TH.getPropertyy("batchCreditSourceAccount");
        hm.authorizationConfirmCredtBatchViewTemplate(sourceAccount, description, amount);
    }

    @Then("authorise the debit batch payment")
    public void authoriseThedebitBatchPayment() throws Exception{
        IBHomePage hm = new IBHomePage();
        T24homepage TH = new T24homepage();
        String amount = TH.getPropertyy("DebitbtchpaymentTotalamount");
        String batchdebitDestinationAccount = TH.getPropertyy("DebitbtchpaymentDestinationAcnt");
        String Description = TH.getPropertyy("DebitbtchpaymentDescription");
        String postingdate = TH.getPropertyy("DebitbtchPaypostingDate");

        hm.authorizationConfirmDebitBatchViewTemplatee(batchdebitDestinationAccount, Description, amount);
    }


    @Then("authorise the debit batch template payment")
    public void authoriseThedebitBatchtemplatePayment() throws Exception{
        IBHomePage hm = new IBHomePage();
        T24homepage TH = new T24homepage();
        String amount = TH.getPropertyy("DebitbtchTmplTotalamount");
        String batchCreditDestinationAccount = TH.getPropertyy("DebitbtTmpltechdestinationAcnt");
        String Description = TH.getPropertyy("DebitbtchTmplDescription");
        String postingdate = TH.getPropertyy("DebitbtchTmplatepostingDate");
        hm.authorizationConfirmDebitBatchViewTemplatee(batchCreditDestinationAccount, Description, amount);
    }
    @Then("authorise the Credit batch template payment")
    public void authoriseThecreditBatchtemplatePayment() throws Exception{
        IBHomePage hm = new IBHomePage();
        T24homepage TH = new T24homepage();
        String amount = TH.getPropertyy("CreditBatchtemplateTotalamount");
        String batchCreditsourceAccount = TH.getPropertyy("CreditBatchtemplateSourceAccnt");
        String Description =  TH.getPropertyy("CreditBatchtemplateDescription");
        String batchCreditDestinationAccount = "";

        String postingdate = "";
        hm.authorizationConfirmCredtBatchViewTemplate(batchCreditDestinationAccount, Description, amount);
    }
    @Then("authorise the failure debit batch payment")
    public void authoriseThedebitBatchePaymentfailure() throws Exception{
        IBHomePage hm = new IBHomePage();
        T24homepage TH = new T24homepage();
        String amount = "";
        String batchCreditDestinationAccount ="";
        String Description = "";
        String postingdate ="";
        hm.authorizationConfirmDebitBatchViewTemplatee(batchCreditDestinationAccount, Description, amount);
    }
    @Then("authorise the wrong BSB batch payment")
    public void authoriseThedebitBatchePaymentWrongBsb() throws Exception{
        IBHomePage hm = new IBHomePage();
        T24homepage TH = new T24homepage();
        String amount = "";
        String batchCreditDestinationAccount ="";
        String Description = "";
        String postingdate ="";
        hm.authorizationConfirmDebitBatchViewTemplatee(batchCreditDestinationAccount, Description, amount);
    }

    @Then("review authorization that the details of creditbatchpayment")
    public void reviewAuthorizationThatTheDetailsOfCreditbatchpayment()throws Exception {
        IBHomePage hm = new IBHomePage();
        T24homepage TH = new T24homepage();
        String amount = TH.getPropertyy("TotalamountCreditbatch");
        String description = TH.getPropertyy("batchCreditDescription");
        String Sourceaccount = TH.getPropertyy("batchCreditSourceAccount");
        hm.reviewAuthorizationBatchTemplate(amount, description, Sourceaccount);
        AuthorizationIB AIb = new AuthorizationIB();
        AIb.returnToAuth();

    }
    @Then("review authorization that the details of debit batch payment")
    public void reviewAuthorizationThatTheDetailsOfdebitbatchpayment()throws Exception {
        IBHomePage hm = new IBHomePage();
        T24homepage TH = new T24homepage();
        String amount = TH.getPropertyy("DebitbtchpaymentTotalamount");
        String batchdebitDestinationAccount = TH.getPropertyy("DebitbtchpaymentDestinationAcnt");
        String Description = TH.getPropertyy("DebitbtchpaymentDescription");
        String postingdate = TH.getPropertyy("DebitbtchPaypostingDate");
        hm.reviewAuthorizationBatchTemplate(amount, Description, batchdebitDestinationAccount);
        AuthorizationIB AIb = new AuthorizationIB();
        AIb.returnToAuth();

    }

    @Then("review authorization details of debitbatchpayment template")
    public void reviewAuthorizationThatTheDetailsOfdebitbatchpaymenttemplate()throws Exception {
        IBHomePage hm = new IBHomePage();
        T24homepage TH = new T24homepage();
        String amount = TH.getPropertyy("DebitbtchTmplTotalamount");
        String batchCreditDestinationAccount = TH.getPropertyy("DebitbtTmpltechdestinationAcnt");
        String Description = TH.getPropertyy("DebitbtchTmplDescription");
        String postingdate = TH.getPropertyy("DebitbtchTmplatepostingDate");
        hm.reviewAuthorizationBatchTemplate(amount, Description, batchCreditDestinationAccount);
        AuthorizationIB AIb = new AuthorizationIB();
        AIb.returnToAuth();

    }
    @Then("review authorization details of Creditbatchpayment template")
    public void reviewAuthorizationThatTheDetailsOfcreditbatchpaymenttemplate()throws Exception {
        IBHomePage hm = new IBHomePage();
        T24homepage TH = new T24homepage();
        String amount = TH.getPropertyy("CreditBatchtemplateTotalamount");

        String batchCreditsourceAccount = TH.getPropertyy("CreditBatchtemplateSourceAccnt");
        String Description =  TH.getPropertyy("CreditBatchtemplateDescription");
        hm.reviewAuthorizationCreditBatchTemplate(amount, Description, batchCreditsourceAccount);
        AuthorizationIB AIb = new AuthorizationIB();
        AIb.returnToAuth();

    }
    @Then("review authorization details of debit failure batchpayment")
    public void reviewAuthorizationThatTheDetailsOfdebitbatchpaymentfailure()throws Exception {
        IBHomePage hm = new IBHomePage();
        T24homepage TH = new T24homepage();
        String amount = "";
        String batchCreditDestinationAccount ="";
        String Description = "";
        String postingdate = "";
        hm.reviewAuthorizationBatchTemplate(amount, Description, batchCreditDestinationAccount);
        AuthorizationIB AIb = new AuthorizationIB();
        AIb.returnToAuth();

    }
    @Then("review authorization details of wrong BSB batchpayment")
    public void reviewAuthorizationThatTheDetailsOfdebitbatchpaymentWrongBsb()throws Exception {
        IBHomePage hm = new IBHomePage();
        T24homepage TH = new T24homepage();
        String amount = "";
        String batchCreditDestinationAccount = "";
        String Description = "";
        String postingdate = "";
        hm.reviewAuthorizationBatchTemplate(amount, Description, batchCreditDestinationAccount);
        AuthorizationIB AIb = new AuthorizationIB();
        AIb.returnToAuth();
    }


        @Then("Enter the account number of creditbatchpayment")
    public void enterTheAccountNumberOfCreditbatchpayment()throws Exception {
        T24homepage Home = new T24homepage();
        String fAccount = Home.getPropertyy("batchCreditSourceAccount");
        String expectedStartDate = Home.getPropertyy("BatchCreditpostingdate");
        Home.enterAccountNumInIbviewofAccounttEntries(fAccount,"");
        Home.enterdateInIbview(expectedStartDate);

    }
    @Then("Enter the account number of debit batch payment")
    public void enterTheAccountNumberOfdebitbatchpayment()throws Exception {
        T24homepage TH = new T24homepage();
        String amount = TH.getPropertyy("DebitbtchpaymentTotalamount");
        String batchdebitDestinationAccount = TH.getPropertyy("DebitbtchpaymentDestinationAcnt");
        String Description = TH.getPropertyy("DebitbtchpaymentDescription");
        String postingdate = TH.getPropertyy("DebitbtchPaypostingDate");
        String fAccount = TH.getPropertyy("batchCreditSourceAccount");
        TH.enterAccountNumInIbviewofAccounttEntries(batchdebitDestinationAccount,"");
        //String expectedStartDate=Home.getPropertyy("externaltransrecurringStartDateNewAccount");
       // String expectedStartDate = "27/09/2024";
        postingdate="16/10/2024";
        TH.enterdateInIbview(postingdate);

    }
    @Then("Enter the account number of Credit batch payment template")
    public void enterTheAccountNumberOfdebitbatchpaymentTemplate()throws Exception {
        T24homepage TH = new T24homepage();
        String postingdate =  TH.datePickIBM();
        String fAccount = TH.getPropertyy("CreditBatchtemplateSourceAccnt");
        TH.enterAccountNumInIbviewofAccounttEntries(fAccount,"");
        //String expectedStartDate=Home.getPropertyy("externaltransrecurringStartDateNewAccount");

        //postingdate="15/10/2024";
        TH.enterdateInIbview(postingdate);

    }
    @Then("Enter the account number of debit batch payment template")
    public void enterTheAccountNumberOfcreditbatchpaymentTemplate()throws Exception {
        T24homepage TH = new T24homepage();
        String postingdate = TH.getPropertyy("DebitbtchTmplatepostingDate");
        String fAccount = TH.getPropertyy("DebitbtTmpltechdestinationAcnt");
        TH.enterAccountNumInIbviewofAccounttEntries(fAccount,"");
        //String expectedStartDate=Home.getPropertyy("externaltransrecurringStartDateNewAccount");
        String expectedStartDate = "27/09/2024";
        //postingdate="15/10/2024";
        TH.enterdateInIbview(postingdate);

    }
    @Then("Enter the account number of user1")
    public void enterTheAccountNumberOfuser1()throws Exception {
        T24homepage hp = new T24homepage();
        String fAccount = hp.getPropertyy("StringfromaccountIntNow");
        String tAccount = hp.getPropertyy("StringToaccountIntNow");
        String expectedAmt = hp.getPropertyy("enteredIntTransAmtIb");
        String desc = hp.getPropertyy("enteredIntTransDesc");
        String date = hp.getPropertyy("StringDateIntNow");
        hp.enterAccountNumInIbviewofAccounttEntries(fAccount,"");
        //String expectedStartDate=Home.getPropertyy("externaltransrecurringStartDateNewAccount");
        String expectedStartDate = "27/09/2024";
        //postingdate="15/10/2024";
        hp.enterdateInIbview(date);

    }
    @Then("Enter the account number of user2")
    public void enterTheAccountNumberOfuser2()throws Exception {
        T24homepage Home = new T24homepage();
        IBHomePage hm=new IBHomePage();
        String fAccount = Home.getPropertyy("StringfromaccountIntNow2");
        String Taccount = Home.getPropertyy("StringToaccountIntNow2");
        String amount = Home.getPropertyy("enteredIntTransAmtIb2");
        String Description = Home.getPropertyy("enteredIntTransDesc2");
        Home.enterAccountNumInIbviewofAccounttEntries(fAccount,"");
        String date = Home.getPropertyy("StringDateIntNow");
        //String expectedStartDate=Home.getPropertyy("externaltransrecurringStartDateNewAccount");
        String expectedStartDate = "27/09/2024";
        //postingdate="15/10/2024";
        Home.enterdateInIbview(date);

    }



    @Then("verify the narratives of creditbatchpaymentt")
        public void verifyTheNarrativesOfCreditabilities() throws Exception{
        T24homepage TH =new T24homepage();
        String amount = TH.getPropertyy("TotalamountCreditbatch");
        String batchCreditSourceAccount = TH.getPropertyy("batchCreditSourceAccount");
        String Description = TH.getPropertyy("batchCreditDescription");
        String postingdate = TH.getPropertyy("BatchCreditpostingdate");
        AccountEntries Acnt = new AccountEntries();
        Acnt.narrativest24NowCreditBatchnew(amount,Description,batchCreditSourceAccount,postingdate);
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }
    @Then("verify the narratives of debit batch paymentt")
    public void verifyTheNarrativesOfdebitbatchPayment() throws Exception{
        T24homepage TH =new T24homepage();
        String amount = TH.getPropertyy("DebitbtchpaymentTotalamount");
        String batchdebitDestinationAccount = TH.getPropertyy("DebitbtchpaymentDestinationAcnt");
        String Description = TH.getPropertyy("DebitbtchpaymentDescription");
        String postingdate = TH.getPropertyy("DebitbtchPaypostingDate");



        //   hm.BatchpaymentVerify(batchCreditSourceAccount,postingdate,Description,amount);

        AccountEntries Acnt = new AccountEntries();
        Acnt.narrativest24credit(amount,Description);
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }
    @Then("verify the narratives of debit batch payment template")
    public void verifyTheNarrativesOfdebitbatchpayment() throws Exception{
        T24homepage TH =new T24homepage();
        String amount = TH.getPropertyy("DebitbtchTmplTotalamount");
        String batchCreditDestinationAccount = TH.getPropertyy("DebitbtTmpltechdestinationAcnt");
        String Description = TH.getPropertyy("DebitbtchTmplDescription");
        String postingdate = TH.getPropertyy("DebitbtchTmplatepostingDate");
        //   hm.BatchpaymentVerify(batchCreditSourceAccount,postingdate,Description,amount);

        AccountEntries Acnt = new AccountEntries();
        Acnt.narrativest24credit(amount,Description);
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }
    @Then("verify the narratives of Credit batch payment template")
    public void verifyTheNarrativesOfcreditbatchpayment() throws Exception{
        T24homepage TH =new T24homepage();
        String amount = TH.getPropertyy("CreditBatchtemplateTotalamount");
        String batchCreditsourceAccount = TH.getPropertyy("CreditBatchtemplateSourceAccnt");
        String Description =  TH.getPropertyy("CreditBatchtemplateDescription");
        String postingdate =TH.datePickIBM();
        //   hm.BatchpaymentVerify(batchCreditSourceAccount,postingdate,Description,amount);

        AccountEntries Acnt = new AccountEntries();
        Acnt.narrativest24NowCreditBatchnew(amount,Description,batchCreditsourceAccount,postingdate);
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }
    @Then("verify the narratives of debit payment user1")
    public void verifyTheNarrativesOfuser1() throws Exception{
        T24homepage hp =new T24homepage();
        String fAccount = hp.getPropertyy("StringfromaccountIntNow");
        String tAccount = hp.getPropertyy("StringToaccountIntNow");
        String expectedAmt = hp.getPropertyy("enteredIntTransAmtIb");
        String desc = hp.getPropertyy("enteredIntTransDesc");
        String date = hp.getPropertyy("StringDateIntNow");
        //   hm.BatchpaymentVerify(batchCreditSourceAccount,postingdate,Description,amount);

        AccountEntries Acnt = new AccountEntries();
        Acnt.narrativest24NowBatchDebit(expectedAmt,desc);
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }


    @Then("check the sessionHistory of the account")
    public void checkTheSessionHistoryOfTheAccount()throws Exception {
        IBHomePage HM=new IBHomePage();
        HM.sessionHistoryIB();

    }


    @And("open the debit batch payment template that need to be authorised")
    public void openTheDebitBatchPaymentTemplateThatNeedToBeAuthorised()throws Exception {
        IBHomePage hm = new IBHomePage();
        T24homepage TH = new T24homepage();

        String amount = TH.getPropertyy("DebitbtchTmplTotalamount");
        String batchdebitDestinationAccount = TH.getPropertyy("DebitbtTmpltechdestinationAcnt");
        String Description = TH.getPropertyy("DebitbtchTmplDescription");
        String postingdate = TH.getPropertyy("DebitbtchTmplatepostingDate");


        hm.authFunctionsInternalView(amount);
    }
    @And("open the credit batch payment template that need to be authorised")
    public void openThecreditBatchPaymentTemplateThatNeedToBeAuthorised()throws Exception {
        IBHomePage hm = new IBHomePage();
        T24homepage TH = new T24homepage();


        String amount = TH.getPropertyy("CreditBatchtemplateTotalamount");

        hm.authFunctionsInternalView(amount);
    }

    @And("open the debit failure batch payment that need to be authorised")
    public void openTheDebitBatchPaymentFailureThatNeedToBeAuthorised()throws Exception {
        IBHomePage hm = new IBHomePage();
        T24homepage TH = new T24homepage();

        String amount = ".";
        String batchCreditDestinationAccount ="";
        String Description = "";
        String postingdate = "";
        hm.authFunctionsInternalView(amount);
    }
    @And("open the debit Wrong BSB batch payment that need to be authorised")
    public void openTheDebitBatchPaymentWrongBSBThatNeedToBeAuthorised()throws Exception {
        IBHomePage hm = new IBHomePage();
        T24homepage TH = new T24homepage();
        String amount = ".";
        String batchCreditDestinationAccount ="";
        String Description = "";
        String postingdate = "";
        hm.authFunctionsInternalView(amount);
    }


    @Then("retrieve the client")
    public void retrieveTheClient() throws Exception {
        IBHomePage hm = new IBHomePage ();
        hm.retrieveClient("237675");
    }

    @And("get client numbers having single signon")
    public void getClientNumbersHavingSingleSignon() {
        IBHomePage hm = new IBHomePage();
        hm.clientnumberIBM();


    }

    @Then("print values of client number")
    public void printValuesOfClientNumber() {
        System.out.println("Values are");
        String a=IBHomePage.singlesignonmap.get(1);
        System.out.println(a);
        String b=IBHomePage.singlesignonmap.get(2);
        System.out.println(b);
        String c=IBHomePage.singlesignonmap.get(3);
        System.out.println(c);


    }

    @Then("check the total investment facilities in the customer overview screen")
    public void checkTheTotalInvestmentFacilitiesInTheCustomerOverviewScreen() throws  Exception {
        IBHomePage hm = new IBHomePage();
        T24homepage TM=new T24homepage();
       int a= hm.investfacilitiesCount(IBHomePage.singlesignonmap.get("Clientnumber0ne"));
        String no1=String.valueOf(a);
       TM.switchWindow();
        TM.commandline();
       int b= hm.investfacilitiesCount(IBHomePage.singlesignonmap.get("Clientnumber2"));
        String no2=String.valueOf(b);
        TM.switchWindow();
        TM.commandline();
        int c=hm.investfacilitiesCount(IBHomePage.singlesignonmap.get("Clientnumber3"));
        String no3=String.valueOf(c);

        IBHomePage.singlesignonmap.put("Clientnumber0neCount", no1);
        IBHomePage.singlesignonmap.put("ClientnumberTwoCount", no2);
        IBHomePage.singlesignonmap.put("ClientnumberThreeCount", no3);

    }

    @Then("check the single sign on dropdwown")
    public void checkTheSingleSignOnDropdwown() {
        IBHomePage hm = new IBHomePage();
        hm.singleSignonDrpdown(IBHomePage.singlesignonmap.get("Clientnumber0ne"),IBHomePage.singlesignonmap.get("Clientnumber2"),IBHomePage.singlesignonmap.get("Clientnumber3"));

    }

    @Then("select the account from single sign on dropdown and check the investment facilities")
     public void selectTheAccountFromSingleSignOnDropdownAndCheckTheInvestmentFacilities()throws Exception
            {
       IBHomePage hm = new IBHomePage();
       hm.accountSelection(IBHomePage.singlesignonmap.get("Clientnumber0ne"),IBHomePage.singlesignonmap.get("Clientnumber0neCount"),IBHomePage.singlesignonmap.get("Clientnumber2"),IBHomePage.singlesignonmap.get("ClientnumberTwoCount"),IBHomePage.singlesignonmap.get("Clientnumber3"),IBHomePage.singlesignonmap.get("ClientnumberThreeCount"));
    }

    @Then("enter the batch payment details and upload the file which will create failed batch payment")
    public void enterTheBatchPaymentDetailsAndUploadTheFileWhichWillCreateFailedBatchPayment()throws Exception {
        IBHomePage hm = new IBHomePage();
        String path="D:\\frameium\\Frameium_allure\\src\\test\\resources\\uploadFiles\\batchpaymentfailure.aba";
        hm.batchPaymentsFailureForAccount(BatchpaymentfailureFilepath,"420284");



    }

    @Then("review batch payment and return to authorization")
    public void reviewBatchPaymentAndReturnToAuthorization()throws Exception {
        IBHomePage hm = new IBHomePage();
        hm.reviewBatchPaymentFailure();


    }

    @Then("review batch payment having wrong BSB and return to authorization")
    public void reviewBatchPaymentWrongBsbAndReturnToAuthorization()throws Exception {
        IBHomePage hm = new IBHomePage();
        hm.reviewBatchPaymentFailure();


    }


    @Then("Enter the details of batchpayment with Wrong BSB")
    public void enterTheDetailsOfBatchpaymentWithWrongBSB() throws Exception{
        IBHomePage hm = new IBHomePage();
        hm.batchPaymentsFailure_WrongBSB(BatchpaymentWrongBsbfilepath,"420284");

    }

    @Then("check the IBManager reporting table")
    public void checkTheIBManagerReportingTable() throws Exception {
        IBHomePage hm = new IBHomePage();
        hm.ibManagerReporting();
        hm.ibmReportingTable();

    }

    @Then("Logout of IBM")
    public void logoutOfIBM() throws Exception{
        IBHomePage hm = new IBHomePage();
        hm.logoutIBM();
    }

    @Then("check the inbox whether the batch failed due to wrong BSB")
    public void checkTheInboxWhetherTheBatchFailedDueToWrongBSB()throws Exception {
        IBHomePage hm = new IBHomePage();
        hm.inboxForbsb("","");
    }


    @Then("check the audit log whether the debit batch payment initiated in subIb {string} scheduled is reflected for")
    public void checkTheAuditLogWhetherTheDebitBatchPaymentInitiatedInSubIbScheduledIsReflectedFor(String arg0) throws Exception{
        IBHomePage hm = new IBHomePage();
        T24homepage TH =new T24homepage();
        String amount = TH.getPropertyy("DebitbtchpaymentTotalamount");
        String batchdebitDestinationAccount = TH.getPropertyy("DebitbtchpaymentDestinationAcnt");
        String Description = TH.getPropertyy("DebitbtchpaymentDescription");
        String postingdate = TH.getPropertyy("DebitbtchPaypostingDate");

        hm.auditlogIBMDebit(arg0,Description,batchdebitDestinationAccount);
    }

    @Then("verify whether the transaction details are displayed in the inbox")
    public void verifyWhetherTheTransactionDetailsAreDisplayedInTheInbox()throws Exception {
        IBHomePage hm = new IBHomePage();
        T24homepage hp=new T24homepage();

        String fAccount = hp.getPropertyy("StringfromaccountIntNow");
        String tAccount = hp.getPropertyy("StringToaccountIntNow");
        String expectedAmt = hp.getPropertyy("enteredIntTransAmtIb");
        String desc = hp.getPropertyy("enteredIntTransDesc");
        String date = hp.getPropertyy("StringDateIntNow");

        hm.inboxVerification("Many To Sign Payment Details",expectedAmt,date);
    }

    @Then("verify the narratives of debit payment user2")
    public void verifyTheNarrativesOfDebitPaymentUser() throws Exception{
        T24homepage Home =new T24homepage();
        String fAccount = Home.getPropertyy("StringfromaccountIntNow2");
        String Taccount = Home.getPropertyy("StringToaccountIntNow2");
        String amount = Home.getPropertyy("enteredIntTransAmtIb2");
        String Description = Home.getPropertyy("enteredIntTransDesc2");
        //   hm.BatchpaymentVerify(batchCreditSourceAccount,postingdate,Description,amount);

        AccountEntries Acnt = new AccountEntries();
        Acnt.narrativest24NowBatchDebit(amount,Description);
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }

    @Then("open a customer and get the investment details of that customer")
    public void openACustomerAndGetTheInvestmentDetailsOfThatCustomer()throws Exception{
IBHomePage HM=new IBHomePage();
T24homepage th=new T24homepage();
        String totalinvestments=HM.getInvestmentdetails("10002801");
        th.setProperty("investmentdetails",totalinvestments);
    }



    @Then("Verify whether all investment details displayed in the home page")
    public void verifyWhetherAllInvestmentDetailsDisplayedInTheHomePage() throws Exception{
IBHomePage hm=new IBHomePage();
T24homepage th=new T24homepage();
        String a=hm.verifyInvestmentDetailsReflected();
       String size= th.getPropertyy("investmentdetails");
       Assert.assertTrue(size.equals(a));


    }


    @Then("confirm the internal transfer payment")
    public void confirmTheInternalTransferPaymentt()throws Exception {
        hm = new IBHomePage();
        T24homepage hp = new T24homepage();
        String fAccount = hp.getPropertyy("StringfromaccountIntNow");
        String tAccount = hp.getPropertyy("StringToaccountIntNow");
        String expectedAmt = hp.getPropertyy("enteredIntTransAmtIb");
        String desc = hp.getPropertyy("enteredIntTransDesc");
        hm.ConfirmInternalTransferpayment(fAccount, tAccount, expectedAmt, desc);
    }

    @Then("Enter the account number of External Transfer IB saved now")
    public void enterTheAccountNumberOfExternalTransferIBSavedNow()throws Exception {
        T24homepage Home = new T24homepage();
        String fAccount = Home.getPropertyy("externaltransnowfromaccount");
        Home.enterAccountNumInIbviewofAccounttEntries(fAccount,"");
    }

    @Then("verify the narratives of External Transfer IB saved now")
    public void verifyTheNarrativesOfExternalTransferIBSavedNow()throws Exception {
        T24homepage hp= new T24homepage();
        String amount = hp.getPropertyy("externaltransnowAmount");
        String Description = hp.getPropertyy("externaltransnowMYdesc");
        String balance = "";
        AccountEntries Acnt = new AccountEntries();
        Acnt.narrativest24Debit(amount, Description);
    }

    @Then("Enter the account number of Transfer IB new contact now")
    public void enterTheAccountNumberOfTransferIBNewContactNow()throws Exception {
        T24homepage Home = new T24homepage();
        String fAccount = Home.getPropertyy("externaltransnowfromaccountNewContact");
        String expectedStartDate = Home.getPropertyy("externaltransnowDateNewContact");
        Home.enterdateInIbview(expectedStartDate);
        Home.enterAccountNumInIBviewofAccounttEntries(fAccount);
    }

    @Then("verify the narratives of Transfer IB new contact now")
    public void verifyTheNarrativesOfTransferIBNewContactNow()throws Exception {
        T24homepage hp = new T24homepage();
        String amount = hp.getPropertyy("externaltransnowAmountNewContact");
        String Description = hp.getPropertyy("externaltransnowMYdescNewContact");
        String balance = "";
        AccountEntries Acnt = new AccountEntries();
        Acnt.narrativest24Debit(amount, Description);

    }

    @Then("Enter the account number of Bpay now saved contact")
    public void enterTheAccountNumberOfBpayNowSavedContact()throws Exception{
        T24homepage home = new T24homepage();
        String fAccount = home.getPropertyy("Bpaysavednowfromaccount");
        String expectedStartDate = home.getPropertyy("BpaysavednowDate");

        home.enterdateInIbview(expectedStartDate);
        home.enterAccountNumInIBviewofAccounttEntries(fAccount);
    }

    @Then("verify the narratives of Bpay now saved contact")
    public void verifyTheNarrativesOfBpayNowSavedContact() throws Exception{
        T24homepage hp = new T24homepage();
        String expectedAmt = hp.getPropertyy("BpaysavednowAmount");

        String balance = "";
        AccountEntries Acnt = new AccountEntries();
        Acnt.narrativest24Bpay(expectedAmt, "","");

    }

    @Then("Enter the account number of Bpay now new contact")
    public void enterTheAccountNumberOfBpayNowNewContact() throws Exception {
        T24homepage home = new T24homepage();
        String fAccount = home.getPropertyy("Bpaysavednowfromaccount");
        String expectedStartDate = home.getPropertyy("BpaysavednowDate");
        home.enterdateInIbview(expectedStartDate);
        home.enterAccountNumInIBviewofAccounttEntries(fAccount);
    }

    @Then("verify the narratives of Bpay now new contact")
    public void verifyTheNarrativesOfBpayNowNewContact()throws Exception{
        T24homepage hp = new T24homepage();
        String expectedAmt = hp.getPropertyy("BpaynewContactAmount");

        String balance = "";
        AccountEntries Acnt = new AccountEntries();
        Acnt.narrativest24Bpay(expectedAmt, "","");
    }

    @Then("check click on Reporting")
    public void checkClickOnReporting() throws Exception{
        IBHomePage IB=new IBHomePage();
        IB.ibManagerReporting();
    }
    @Then("check click on Reporting and select all batches")
    public void checkClickOnReportingselectallbatches() throws Exception{
        IBHomePage IB=new IBHomePage();
        IB.ibManagerReportingAllBatch();
    }

    @Then("Verify the IBM reporting that the Batch payment status is not posted")
    public void verifyTheIBMReportingThatTheBatchPaymentStatusIsNotPosted()throws  Exception {
        IBHomePage IB=new IBHomePage();
        IB.ibmReportingTable();

    }
    @Then("Verify the IBM reporting that the Batch payment status is posted")
    public void verifyTheIBMReportingThatTheBatchPaymentStatusIsPosted()throws  Exception {
        IBHomePage IB=new IBHomePage();
        IB.ibmReportingTablePosted();

    }


    @When("I login with username{string}and password{string}of UAT IB")
    public void iLoginWithUsernameAndPasswordOfUATIB(String username, String password)throws Exception {
        hm = new IBHomePage();
        hm.loginIBInternal(username, password);
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");

    }
    @When("I login with username and password of UAT IB")
    public void iLoginWithUsernameAndPasswordOfUATIB()throws Exception {
        hm = new IBHomePage();
        hm.loginIBInternal("285419","Temenos@123");
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");

    }
    @When("I login with username{string}and password{string}of SIT IB")
    public void iLoginWith_UsernameAndPasswordOfUATIB(String username, String password)throws Exception {
        hm = new IBHomePage();
        hm.loginIBInternal(username, password);
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");

    }
   @When("login with username and password of SIT IB")
    public void iLoginWith_UsernameAndPasswordOfUATIB()throws Exception {
        hm = new IBHomePage();
        hm.loginIBInternal("285419","Temenos@123");
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");

    }



    @Then("verify whether the IB details are displayed")
    public void verifyWhetherTheIBDetailsAreDisplayed() {
        hm = new IBHomePage();
        hm.ibverify();
        hooks.screenNew(hooks.scenario);



    }



    @Then("Check the client maintenance SIT")
    public void checkTheClientMaintenance() {
        hm = new IBHomePage();
        hm.clientMaintenanceClick();
        hooks.screenNew1(hooks.scenario);

    }
    @Then("Check the client maintenance UAT")
    public void checkTheClientMaintenanceUAT() {
        hm = new IBHomePage();
        hm.clientMaintenanceClick();
        hooks.screenNew2(hooks.scenario);

    }
    }


