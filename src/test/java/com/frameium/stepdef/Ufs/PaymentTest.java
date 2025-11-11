package com.frameium.stepdef.Ufs;

import com.frameium.genericfunctions.GenericFunctions;
import com.frameium.pageobject.Salesforce.Account;
import com.frameium.pageobject.Salesforce.Lead;
import com.frameium.pageobject.UFS.AccountEntries;
import com.frameium.pageobject.UFS.Narratives;
import com.frameium.pageobject.UFS.T24homepage;
import com.frameium.stepdef.Hooks;
import com.frameium.stepdef.TestSetUp;
import com.frameium.utilities.Date.DateUtilities;
import com.frameium.utilities.ExcelRead.ExcelReadNew;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Map;


public class PaymentTest {
    private Account acnt;
    private T24homepage Home;
    private AccountEntries AccountEntris;
   // public String exptdTitle = "GetCloudy Pvt LTD | Account | Salesforce";
    Hooks hooks = new Hooks();
    TestSetUp setUp;
    private GenericFunctions genericFunctions;
    private Lead lead;
    private WebDriver driver;

    //creating constructor.
    public PaymentTest(TestSetUp setUp) throws MalformedURLException {
        this.setUp = setUp;
        genericFunctions = new GenericFunctions(setUp.baseTest.driver);
        lead = new Lead(setUp.baseTest.driver);
        acnt = new Account(setUp.baseTest.driver);
        // Assign the driver from setUp to the local driver variable
       // this.driver = setUp.baseTest.driver;

    }
    String T24_URL;
    String T24username1;
    String T24username1SIT;
    String T24PasswordSIT;
    String T24Password;
    String T24Password2;
    String T24Username2;
    String DateeToday;
    String interntransfbalance;
    String internalTransferAmount;
    //String internalTransferAmountOver10k;
    String InternaltransferAccountNum;
    String InternTransDebittdesciption;
    String InternTransCreditdesciption;
    String IntTransDestAccountNum;
    String EXternaltransferAccountNum;
    String EXternalTransferAmount;
    String externTransDebittdesciption;
    String ExtTransDestAccountNum;
    String ExternTransCreditdesciption;
    String ExternalTransBSB;
    String ExternaltransName;
    String interntransfCreditAcntbalance;
    String Transaction_ID;
   String internalTransferAmountOverLimit;
    String InternaltransferAccountNumOverLimit;
    String InternTransDebitdesciptionOverlimit;
    String InternTransCreditdesciptionOverLimit;
    String IntTransDestAccountNumOverLimit;

    String ExternaltransferAccountNumOverLimit;
    String ExternTransDebitdesciptionOverlimit;
    String ExternTransCreditdesciptionOverLimit;
    String ExtTransDestAccountNumOverLimit;






    String BalanceMaintenanceAccountNum;
   String SweepmaintbalFromAccount;
    String SweepmaintbalSweepAmount;
    String SweepmaintbalDescription;
    String surplussweepAccntToMaintain;
    String surplussweeptoaccnt;
    String surplussweepAmntToMaintain;
    String surplussweepDescription;
    String accountbalance;
    String sweepamount;
    String surplussweepamount;
    String TwoWaySweepAcntToMaintain;
    String TwoWaySweepDescription;
    String TwoWaySweepAmountToMaintain;
    String TwoWaySweepThresholdAmount;
    String TwoWaySweepFromAcnt;

    String TwoWaySweepAcntToMaintainTWO;
    String TwoWaySweepDescriptionTWO;
    String TwoWaySweepAmountToMaintainTWO;
    String TwoWaySweepThresholdAmountTWO;
    String TwoWaySweepFromAcntTWO;
    String AccountCreationCustomerNum;
    String Arrangement;
    String tradedate;
    String productname;
    String Customernumnew;
    String DepositCreationCustomerNum;
    String DepositCreationCommitAmount;
    String accountnumnew;
    String DepositFundingAmount;
    String DepositClosureAdvancedPayOut;
    String LoanCreationMarginoper;
    String LoanCreationMarginType;
    String LoanCreationMarginRate;
    String LoanCreationCommitentAmount;
    String LoanCreationCommitentTerm;
    String LoanCreationCustomerNo;
    String DirectDebitArrangement;
    String DirectDebitDestAccountNum;
    String DDAccountNum;
    String  DirectDebitBsb;
    String  DDTerminationMonth;
    String Ddfuturemonth;
    String  DDFutureterminationMonth;
    String DDFutureSignatory;
    String DirectDebitName;
    String DirectDebitDescription;
    String DirectDebitDescriptionCredit;
    String DirectDebitAmount;
    String LoanClosureDesbursementAccntNum;
    String LoanClosureDesbursementAmount;
    String LoanDesbursementDebitDescription;
    String LoanDesbursementCreditDescription;
    String Payoffamount;
    String LoanPayOffAccountNum;
    String LoanPayOffDebitDescription;
    String LoanPayOffCreditDescription;
    String LoanPayOffSignatory;
    String DepositPartialWthdrwArngment;
    String DepositPartialWthdrwAmount;
    String LoanRepaymentSrcAccountNum;
    String LoanRepaymentSrctDescription ;
    String LoanRepaymentDestDescription;
    String LoanrepaymentSignatory ;
    String LoanRepaymentAmount;
    String ExternalTransferAmountOver10k;
    String  ExternTransBsb10k;
    String  ExternTransDestAccountName10k;
    String IntPeriodicPayAccountNum;
    String externaltrtsansBSB;
    String externaltrtsansAccntno;
    String externaltrtsansAccntname;
    String ExttPeriodicDebitDescription;
    String externaltrtsansDestAccntno;
    String ExtPeriodicPayAccountNum;
    @Before
    public void TestdataRead() {
        String root = System.getProperty ("user.dir");
        String testdataFile = root+"\\src\\main\\resources\\configFiles\\booknew1_.xlsx";
        ExcelReadNew ttmodule = new ExcelReadNew();
        Map<String, Map<String, String>> testDataList;
        testDataList = ttmodule.getTestDataList(testdataFile, "T24");
        T24username1=testDataList.get("Username").get("Value");
        T24Username2 = testDataList.get("Username2").get("Value");
        T24Password = testDataList.get("PassWord").get("Value");
        T24_URL=testDataList.get("T24_URL_UAT").get("Value");
        T24Password2=testDataList.get("PassWord2").get("Value");
        InternaltransferAccountNum=testDataList.get("IntTransSourceAccountNum").get("Value");
        internalTransferAmount=testDataList.get("IntTransAmount").get("Value");
        InternTransDebittdesciption=testDataList.get("InternTransDebitdesciption").get("Value");
        IntTransDestAccountNum=testDataList.get("IntTransDestAccountNum").get("Value");
        InternTransCreditdesciption=testDataList.get("InternTransCreditdesciption").get("Value");
        DateUtilities datee=new DateUtilities();
        DateeToday= DateUtilities.DatePick();
        EXternaltransferAccountNum=testDataList.get("ExtTransSourceAccountNum").get("Value");
        EXternalTransferAmount=testDataList.get("ExternTransAmount").get("Value");
        externTransDebittdesciption=testDataList.get("ExtternTransDebitdesciption").get("Value");
        ExtTransDestAccountNum=testDataList.get("ExtTransDestAccountNum").get("Value");
        ExternTransCreditdesciption=testDataList.get("ExternTransCreditdesciption").get("Value");
        ExternalTransBSB=testDataList.get("ExternTransBsb").get("Value");
        ExternaltransName=testDataList.get("ExternTransDestAccountName").get("Value");
        internalTransferAmountOverLimit=testDataList.get("IntTransAmount10k").get("Value");
        InternaltransferAccountNumOverLimit=testDataList.get("IntTransSourceAccountNum10k").get("Value");
        InternTransDebitdesciptionOverlimit=testDataList.get("InternTransDebitdesciption10k").get("Value");
        InternTransCreditdesciptionOverLimit=testDataList.get("InternTransCreditdesciption10k").get("Value");
        IntTransDestAccountNumOverLimit=testDataList.get("IntTransDestAccountNum10k").get("Value");


         ExternaltransferAccountNumOverLimit=testDataList.get("ExtTransSourceAccountNum10k").get("Value");
        ExternTransDebitdesciptionOverlimit=testDataList.get("ExtternTransDebitdesciption10k").get("Value");
         ExternTransCreditdesciptionOverLimit=testDataList.get("ExternTransCreditdesciption10k").get("Value");
         ExtTransDestAccountNumOverLimit=testDataList.get("ExtTransDestAccountNum10k").get("Value");
        ExternTransDestAccountName10k=testDataList.get("ExternTransDestAccountName10k").get("Value");
        ExternTransBsb10k=testDataList.get("ExternTransBsb10k").get("Value");
         ExternalTransferAmountOver10k=testDataList.get("IntTransAmount10k").get("Value");




        BalanceMaintenanceAccountNum=testDataList.get("SweepmaintbalAcntToMaintain").get("Value");
        SweepmaintbalFromAccount=testDataList.get("SweepmaintbalFromAccount").get("Value");
        SweepmaintbalSweepAmount= testDataList.get("SweepmaintbalFromAccount").get("Value");
        SweepmaintbalDescription=testDataList.get("SweepmaintbalDescription").get("Value");

        surplussweepAccntToMaintain=testDataList.get("surplussweepAccntToMaintain").get("Value");
        surplussweeptoaccnt=testDataList.get("surplussweeptoaccnt").get("Value");
        surplussweepAmntToMaintain=testDataList.get("surplussweepAmntToMaintain").get("Value");
        surplussweepDescription=testDataList.get("surplussweepDescription").get("Value");
        TwoWaySweepAcntToMaintain=testDataList.get("TwoWaySweepAcntToMaintain").get("Value");
         TwoWaySweepDescription=testDataList.get("TwoWaySweepDescription").get("Value");;
         TwoWaySweepAmountToMaintain=testDataList.get("TwoWaySweepAmountToMaintain").get("Value");;
        TwoWaySweepThresholdAmount=testDataList.get("TwoWaySweepThresholdAmount").get("Value");;
        TwoWaySweepFromAcnt=testDataList.get("TwoWaySweepFromAcnt").get("Value");

        TwoWaySweepAcntToMaintainTWO=testDataList.get("TwoWaySweepAcntToMaintainTWO").get("Value");
        TwoWaySweepDescriptionTWO=testDataList.get("TwoWaySweepDescriptionTWO").get("Value");
        TwoWaySweepAmountToMaintainTWO=testDataList.get("TwoWaySweepAmountToMaintainTWO").get("Value");
        TwoWaySweepThresholdAmountTWO=testDataList.get("TwoWaySweepThresholdAmountTWO").get("Value");
        TwoWaySweepFromAcntTWO=testDataList.get("TwoWaySweepFromAcntTWO").get("Value");
        AccountCreationCustomerNum=testDataList.get("AccountCreationCustomerNum").get("Value");
        DepositCreationCustomerNum=testDataList.get("DepositCreationCustomerNum").get("Value");
        DepositCreationCommitAmount = testDataList.get("DepositCreationCommitAmount").get("Value");
        DepositFundingAmount=testDataList.get("DepositFundingAmount").get("Value");
        DepositClosureAdvancedPayOut= testDataList.get("DepositClosureAdvancedPayOut").get("Value");
        LoanCreationMarginoper=testDataList.get("LoanCreationMarginoper").get("Value");
        LoanCreationMarginType=testDataList.get("LoanCreationMarginType").get("Value");
        LoanCreationMarginRate=testDataList.get("LoanCreationMarginRate").get("Value");
         LoanCreationCommitentAmount = testDataList.get("LoanCreationCommitentAmount").get("Value");
         LoanCreationCommitentTerm = testDataList.get("LoanCreationCommitentTerm").get("Value");
        LoanCreationCustomerNo = testDataList.get("LoanCreationCustomerNo").get("Value");
        DirectDebitArrangement=testDataList.get("DirectDebitArrangement").get("Value");
         DirectDebitArrangement= testDataList.get("DirectDebitArrangement").get("Value");
         DirectDebitDestAccountNum = testDataList.get("DirectDebitDestAccountNum").get("Value");
         DDAccountNum=testDataList.get("DDAccountNum").get("Value");
          DirectDebitBsb=testDataList.get("DirectDebitBsb").get("Value");
          DDTerminationMonth=testDataList.get("DDTerminationMonth").get("Value");
         Ddfuturemonth=testDataList.get("Ddfuturemonth").get("Value");
          DDFutureterminationMonth=testDataList.get("DDFutureterminationMonth").get("Value");
         DDFutureSignatory=testDataList.get("DDFutureSignatory").get("Value");
         DirectDebitName=testDataList.get("DirectDebitName").get("Value");

         DirectDebitDescription = testDataList.get("DirectDebitDescription").get("Value");
         DirectDebitDescriptionCredit=testDataList.get("DirectDebitDescriptionCredit").get("Value");
         DirectDebitAmount = testDataList.get("DirectDebitAmount").get("Value");
        LoanClosureDesbursementAccntNum = testDataList.get("LoanClosureDesbursementAccntNum").get("Value");
        LoanClosureDesbursementAmount = testDataList.get("LoanClosureDesbursementAmount").get("Value");
        LoanDesbursementDebitDescription = testDataList.get("LoanDesbursementDebitDescription").get("Value");
        LoanDesbursementCreditDescription= testDataList.get("LoanDesbursementCreditDescription").get("Value");
         LoanPayOffAccountNum= testDataList.get("LoanPayOffAccountNum").get("Value");
         LoanPayOffDebitDescription = testDataList.get("LoanPayOffDebitDescription").get("Value");
         LoanPayOffCreditDescription = testDataList.get("LoanPayOffCreditDescription").get("Value");
         LoanPayOffSignatory = testDataList.get("LoanPayOffSignatory").get("Value");
        DepositPartialWthdrwArngment = testDataList.get("DepositPartialWthdrwArngment").get("Value");
         LoanRepaymentSrcAccountNum = testDataList.get("LoanRepaymentSrcAccountNum").get("Value");
         LoanRepaymentSrctDescription  = testDataList.get("LoanRepaymentSrctDescription").get("Value");
         LoanRepaymentDestDescription = testDataList.get("LoanRepaymentDestDescription").get("Value");
         LoanrepaymentSignatory = testDataList.get("LoanrepaymentSignatory").get("Value");
         LoanRepaymentAmount = testDataList.get("LoanRepaymentAmount").get("Value");
         IntPeriodicPayAccountNum=testDataList.get("IntPeriodicPayAccountNum").get("Value");
         Home = new T24homepage();
         //String a= Home.directDebitftreTerminationMonth();
         String a="";
         externaltrtsansBSB=testDataList.get("ExtPeriodicBSB").get("Value");;
         externaltrtsansAccntno=testDataList.get("ExtPeriodicPayAccountNum").get("Value");
         externaltrtsansAccntname=testDataList.get("ExtPeriodicDestAccountName").get("Value");
         ExttPeriodicDebitDescription=testDataList.get("ExttPeriodicDebitDescription").get("Value");
         externaltrtsansDestAccntno=testDataList.get("ExtTransDestAccountNum").get("Value");
        IntPeriodicPayAccountNum=testDataList.get("IntPeriodicPayAccountNum").get("Value");
        ExtPeriodicPayAccountNum=testDataList.get("ExtPeriodicPayAccountNum").get("Value");
        T24username1SIT=testDataList.get("T24username1SIT").get("Value");
        T24PasswordSIT=testDataList.get("T24PasswordSIT").get("Value");;


    }


    @When("User opens the UAT T24 Url")
    public void user_opens_url_() throws Exception {
        genericFunctions.getApplicationUrl(T24_URL);
        genericFunctions.waitForPageToLoad(2000);
        //hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        T24homepage T24=new T24homepage();
       // hooks.screenNew(hooks.scenario);

         }

    @When("User opens the T24 Url")
    public void user_opens_url() throws Exception {
        genericFunctions.getApplicationUrl(T24_URL);
        genericFunctions.waitForPageToLoad(2000);
        //hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        T24homepage T24=new T24homepage();
        hooks.takeScreenshot(hooks.scenario);

    }



    @When("User opens the SIT T24 Url")
    public void user_opens_SIT_url() throws Exception {
        genericFunctions.getApplicationUrl("https://www.google.co.in");
        genericFunctions.waitForPageToLoad(2000);
        //hooks.takeScreenshot(hooks.scenario);
       // Hooks.screenNew(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }

    @And("The user should be able to click on general enquiries buttom")
    public void generalEnquiriesClick(){
        Home = new T24homepage();
        Home.generalEnquiriesClick();

    }
    @And("click on the IB-view of account entries")
    public void IB_view_of_Account_Entries_Click(){
        Home = new T24homepage();
        Home.Ibviewclick();
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }

    @Then("Enter the account number of external transfer and click on find button")
        public void enterAccountNumInviewAccounytEntries() throws IOException {
        Home = new T24homepage();
        String date=Home.getPropertyy("exttransdate");
        Home.enterAcntNumbeAccountEntries(EXternaltransferAccountNum,date);

        }
    @Then("Enter the account number of internal transfer overlimit in ibview of account entries")
    public void enterAccountNumoverlimitInIbviewofAccounytEntries() throws IOException {
        Home = new T24homepage();
        String date=Home.getPropertyy("internaltransoverlimitdate");
        Home.enterAccountNumInIbviewofAccounttEntries(InternaltransferAccountNumOverLimit,date);

    }
    @Then("Enter the account number")
    public void enterAccountNumInIbviewofAccounytEntries() throws IOException {
        Home = new T24homepage();
        String date=Home.getPropertyy("inttransdate");
        Home.enterAccountNumInIbviewofAccounttEntries(InternaltransferAccountNum,date);
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }
    @Then("Enter the account number of external transfer overlimit")
    public void enterExtAccountNumoverlimitInIbviewofAccounytEntries() throws IOException {
        Home = new T24homepage();
        String date=Home.getPropertyy("ExternaltransOver10kDate");
        Home.enterAccountNumInIbviewofAccounttEntries(ExternaltransferAccountNumOverLimit,date);

    }
    @Then("Enter the external account number in IbView of account entries")
    public void enterexternalAccountNumInIbviewofAccounytEntries(){
        Home = new T24homepage();
        Home.enterAccountNumInIbviewofAccounttEntries(EXternaltransferAccountNum,"");
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }
    @Then("Enter the account number of Direct Debit")
    public void enterAccountNumofDirectDebitInIbviewofAccounytEntries(){
        Home = new T24homepage();
        Home.enterAccountNumInIbviewofAccounttEntries(DDAccountNum,"");

    }


    @Then("User should be able to login to T24")
    public void Login_should_be_successful() throws Exception {
        Home = new T24homepage();

        Home.T24EnterCredentials( "SONY.INP","Temenos@123");
        hooks.takeScreenshot(hooks.scenario);
        Home.clickLogin();
        hooks.screenNew(hooks.scenario);
       // Home.verifylogin();
        String Titel= genericFunctions.getTitle();
        hooks.takeScreenshot(hooks.scenario);
        hooks.screenNew(hooks.scenario);
       // hooks.takeScreenshot(hooks.scenario);

        }
    @Then("User should be able to login to UAT T24")
    public void UAT_Login_should_be_successful() throws Exception {
        Home = new T24homepage();

        Home.T24EnterCredentials("SONY.INP", "Temenos@123");
        hooks.screenNew(hooks.scenario);
        Home.clickLogin();
        String Titel= genericFunctions.getTitle();
        hooks.screenNew(hooks.scenario);
        // hooks.takeScreenshot(hooks.scenario);

    }


    @Then("User should be able to login to SIT T24")
    public void Login_should_be_successful_SIT() throws Exception {
        Home = new T24homepage();
        Home.T24EnterCredentials(T24username1SIT, T24PasswordSIT);
        Hooks.screenNew(hooks.scenario);
        String Titel= genericFunctions.getTitle();
        Home.clickLogin();

       // Hooks.screenNew(hooks.scenario);
        //hooks.takeScreenshot(hooks.scenario);

    }

    @Then("The user should be able to fill the commandline")
    public void fill_in_the_commandline() throws Exception {

        Home = new T24homepage();
        try {
            Home.commandline();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Then("The user should be able to fill the commandline for Checking Dates")
    public void fill_in_the_commandlineDate() throws Exception {

        Home = new T24homepage();
        try {

            Home.commandlinedates();
            hooks.screenNew(hooks.scenario);
            Home.clickTick();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Then("The user should be able to fill the commandline for checking Dates")
    public void fill_in_the_commandlineDates() throws Exception {

        Home = new T24homepage();
        try {

            Home.commandlinedates();
            hooks.takeScreenshot(hooks.scenario);
            Home.clickTick();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Then("The user should be able to navigate to Account transfer button")
    public void Accounttransfer_click() throws Exception {
        Home = new T24homepage();
        Home.AccounttransferClick();

    }
    @And("user should be able to see the the balance of the account before performing internal transfer")
    public void balanceCheckAccount() throws InterruptedException, IOException {
        Home = new T24homepage();
        Home.balanceCheck(InternaltransferAccountNum);

        interntransfbalance=Home.getBalance();
        hooks.takeScreenshot(hooks.scenario);
        Home.creditAccount(IntTransDestAccountNum,DateeToday);
        interntransfCreditAcntbalance=Home.getBalance();
        Home.setProperty("interntransfdebitAcntbalance",interntransfbalance);
        Home.setProperty("interntransfCreditAcntbalance",interntransfCreditAcntbalance);
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");

    }



    @And("user should be able to see the the balance of the account before performing internal transfer over limit")
    public void balanceCheckAccountt() throws InterruptedException, IOException {
        Home = new T24homepage();
        Home.balanceCheck(InternaltransferAccountNumOverLimit);
        interntransfbalance=Home.getBalance();
        Home.creditAccount(IntTransDestAccountNumOverLimit,DateeToday);
        interntransfCreditAcntbalance=Home.getBalance();
        Home.setProperty("interntransfdebitAcntbalanceoverlimit",interntransfbalance);
        Home.setProperty("interntransfCreditAcntbalanceoverlimit",interntransfCreditAcntbalance);

    }

    @And("Enter the details in the account transfer fields")
    public void fill_thedetails_for_Internal_Transfer_payment() throws InterruptedException, IOException {
        Home = new T24homepage();
        Home.sourceAcountDetails(InternaltransferAccountNum, InternTransDebittdesciption);
        Home.DestinationAcountDetails(IntTransDestAccountNum, InternTransCreditdesciption, internalTransferAmount);
        hooks.takeScreenshot(hooks.scenario);
    }

    @And("Enter the details in the account transfer fields for deposit funding")
    public void     fill_thedetails_for_deposit_funding() throws InterruptedException, IOException {
        Home = new T24homepage();
        Home.sourceAcountDetails(InternaltransferAccountNum, InternTransDebittdesciption);
        Home.DestinationAcountDetails(accountnumnew, InternTransCreditdesciption, DepositFundingAmount);
    }
    @And("Enter the details in the account external  transfer fields")
    public void fill_thedetails_for_External_Transfer_payment() throws InterruptedException, IOException {
        Home = new T24homepage();
        Home.sourceAcountDetails(EXternaltransferAccountNum, externTransDebittdesciption);
        Home.setProperty("ExternTransDebittdesciption", Home.TransDebitdesciption);
        Home.externalDestinationAcountDetails(ExternalTransBSB,ExtTransDestAccountNum,ExternaltransName,externTransDebittdesciption,"",EXternalTransferAmount);
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        
    }
    @Then("Click on validate")
    public void validateButton_Click() throws Exception {
        Home = new T24homepage();
        Home.validate();
    }
    @Then("Click on validate after entering loan details")
    public void validateButtonLoan_Click() throws Exception {
        Home = new T24homepage();
        Home.validate();
         Arrangement=Home.arrangementNoNewcustomer();
         tradedate=Home.tradeDateNewCustomer();
         //customernumber=Home.costumerNumNew();
         productname=Home.productNameNew();

    }


    @And("Click on commit")
        public void commitButtonClick() throws Exception {
        Home = new T24homepage();


        Home.commitDeal();

        
            }

    @Then("check whether the override Authorisation Required message is appearing and click on acceptoverride")
    public void checkWhetherTheOverrideAuthorisationRequiredMessageIsAppearingAndClickOnAcceptoverride() throws InterruptedException {
        Home = new T24homepage();
        hooks.takeScreenshot(hooks.scenario);
        Home.acceptOverrideeover10k();
        Home.acceptoverrideonBalanaceLessthanZero();
    }

    @Then("Click on accept overrides")
    public void acceptoverride() throws InterruptedException {
        Home = new T24homepage();
        Home.acceptOverridee();
        Thread.sleep(1000);



    }


        @Then("Verify whether the transaction complete message is displayed after commiting")
       public void txnCompleteMsg_Verify(){
            Home = new T24homepage();
       Home.verifyInternalTransaction();
       //Home.transactionTransfId();

       Transaction_ID=Home.transactionTransfId();
            hooks.takeScreenshot(hooks.scenario);
            setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
       }


@And("click on find button")
public void findButtonClick(){
    Home = new T24homepage();
    Home.findClick();
}


    @And("Navigate to account entries")
    public void navigateToAccountEntries() throws InterruptedException {
        Home = new T24homepage();
        Home.accountEntries();

    }
    @Then("Enter the account number and click on find button")
        public void EnterAccountNumInAccountEnties() throws IOException {
        Home = new T24homepage();
        Home = new T24homepage();
        String date=Home.getPropertyy("inttransdate");
        Home.enterAcntNumbeAccountEntries(InternaltransferAccountNum,date);

        }
    @Then("Enter the external overlimit account number and click on find button")
    public void EnterExternaloverlimitAccountNumInAccountEnties() throws IOException {
        Home = new T24homepage();
        Home = new T24homepage();

        String date=Home.getPropertyy("ExternaltransOver10kDate");
        Home.enterAcntNumbeAccountEntries(ExternaltransferAccountNumOverLimit,date);

    }

    @Then("Enter the account number of internal transaction overlimit and click on find button")
    public void EnterAccountNumOverlimitInAccountEnties() throws IOException {
        Home = new T24homepage();
        Home = new T24homepage();
        String date=Home.getPropertyy("internaltransoverlimitdate");
        Home.enterAcntNumbeAccountEntries(InternaltransferAccountNumOverLimit,date);

    }
    @And("Verify whether the transaction is reflected in the accountentries")
        public void verificationOfAccountEntries() throws IOException {
        Home = new T24homepage();
        String date=Home.getPropertyy("inttransdate");

        Home.checkAccountEntries(T24homepage.TransactionID,internalTransferAmount,date);
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        }
    @And("Verify whether the external overlimit transaction is reflected in the accountentries")
    public void verificationOfExternaloverlimitAccountEntries() throws IOException {
        Home = new T24homepage();
        String date=Home.getPropertyy("ExternaltransOver10kDate");

       String amount= Home.getPropertyy("ExternaltransOver10kAmount");
        Home.setProperty("ExternaltransOver10kAmount",T24homepage.transAmount);
        Home.checkAccountEntries(T24homepage.TransactionID,amount,date);
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }


    @And("Verify whether the external transaction is reflected in the accountentries")
    public void verificationOfAccountEntriesExternal() throws IOException {
        Home = new T24homepage();
        String date=Home.getPropertyy("exttransdate");

        Home.checkAccountEntries(T24homepage.TransactionID,EXternalTransferAmount,date);
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }




    @And("The details of internal transfer should be reflected in the narratives")
        public void transfernarrative() throws IOException, InterruptedException {
        Home = new T24homepage();
        AccountEntris=new AccountEntries();
        String debitaccountbalance= Home.getPropertyy("interntransfdebitAcntbalance");
        String description=Home.getPropertyy("InternalTransDebitDescription");
        String Creditdescription=Home.getPropertyy("InternalTranscreditDescription");
        String amount=Home.getPropertyy("internaltransferAmount");
        String interntransfCreditAcntbalance=Home.getPropertyy("interntransfCreditAcntbalance");
        AccountEntris.debitNarratives(description,internalTransferAmount,DateeToday,debitaccountbalance);
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        Home.creditAccountNarrative(IntTransDestAccountNum,"");

        AccountEntris.creditNarratives(Creditdescription,internalTransferAmount,DateeToday,interntransfCreditAcntbalance);
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }
    @And("The details of internal transfer overlimit should be reflected in the narratives")
    public void transfernarrativeOverLimit() throws IOException, InterruptedException {
        Home = new T24homepage();
        AccountEntris=new AccountEntries();
        String date=Home.getPropertyy("internaltransoverlimitdate");
        String description=Home.getPropertyy("internaltransDebitDescOver10k");
        String Creditdescription=Home.getPropertyy("internaltransCreditDescOver10k");
       // String amount=Home.getPropertyy("internaltransferAmount");
        String interntransfdebitAcntbalance=Home.getPropertyy("interntransfdebitAcntbalanceoverlimit");
        String interntransfCreditAcntbalance=Home.getPropertyy("interntransfCreditAcntbalanceoverlimit");

       AccountEntris.debitNarratives(description,internalTransferAmountOverLimit,DateeToday,interntransfdebitAcntbalance);
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
       Home.creditAccountNarrative(IntTransDestAccountNumOverLimit,date);
        AccountEntris.creditNarratives(Creditdescription,internalTransferAmountOverLimit,DateeToday,interntransfCreditAcntbalance);
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }
    @And("The details of External transfer overlimit should be reflected in the narratives")
    public void ExtransfernarrativeOverLimit() throws IOException, InterruptedException {
        Home = new T24homepage();
        AccountEntris=new AccountEntries();
        String date=Home.getPropertyy("ExternaltransOver10kDate");
        String description=Home.getPropertyy("ExternaltransDebitDescOver10k");
        //String Creditdescription=Home.getPropertyy("internaltransCreditDescOver10k");
        // String amount=Home.getPropertyy("internaltransferAmount");
        String interntransfdebitAcntbalance=Home.getPropertyy("interntransfdebitAcntbalanceoverlimit");
        String interntransfCreditAcntbalance=Home.getPropertyy("interntransfCreditAcntbalanceoverlimit");

        AccountEntris.debitNarratives(description,internalTransferAmountOverLimit,DateeToday,interntransfdebitAcntbalance);
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
//        Home.creditAccountNarrative(IntTransDestAccountNumOverLimit,date);
//        AccountEntris.creditNarratives(Creditdescription,internalTransferAmountOverLimit,DateeToday,interntransfCreditAcntbalance);


    }
    @And("The details of External transfer should be reflected in the narratives")
    public void externalTransfernarrative() throws IOException, InterruptedException {
        Home = new T24homepage();
        AccountEntris = new AccountEntries();
        String description = Home.getPropertyy("ExternTransDebittdesciption");
        String amount = Home.getPropertyy("ExternaltransferAmount");
        String ExterntransfAcntbalance = Home.getPropertyy("ExterntransfAcntbalance");

        AccountEntris.debitNarratives(description,EXternalTransferAmount, DateeToday,ExterntransfAcntbalance);
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }


    @And("user should be able to see the the balance of the account before performing External transfer")
    public void balanceCheckAccountExternalTransfer() throws InterruptedException, IOException {
        Home = new T24homepage();
        Home.balanceCheck(EXternaltransferAccountNum);
        String exttransferacountBalance=Home.getBalance();
        Home.setProperty("ExterntransfAcntbalance",exttransferacountBalance);


    }
    @Then("Login to authoriser account")
        public void authorizer_Login_T24() throws Exception {
       genericFunctions.getApplicationUrl(T24_URL);
        Home = new T24homepage();
        Home.T24Login(T24Username2,"Temenos@1234");
        }

    @And("Navigate to unauthorised transactions")
    public void navigateToUnauthorisedTransactionsClick() throws Exception {
        Home = new T24homepage();
        Home.authoriserAuth();
       //Home.authorization(Transaction_ID);
    }
    @Then("Authorize the transaction")
    public void authoriseTransaction() throws Exception {
        Home = new T24homepage();
        Home.authorization(Transaction_ID);
    }
    @And("Enter the details in the account transfer for internal transfer overlimit")
    public void fill_thedetails_for_Internal_Transfer_payment_overlimit() throws InterruptedException, IOException {
        Home = new T24homepage();
        Home.sourceAcountDetails(InternaltransferAccountNumOverLimit, InternTransDebitdesciptionOverlimit);
        Home.DestinationAcountDetails(IntTransDestAccountNumOverLimit, InternTransCreditdesciptionOverLimit,internalTransferAmountOverLimit);
        Home.setProperty("internaltransDebitDescOver10k",Home.TransDebitdesciption);
        Home.setProperty("internaltransCreditDescOver10k",Home.INTtransCreditDescription);
        Home.setProperty("internaltransoverlimitdate",T24homepage.transferdate);
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");

    }

    @And("The User clicks on signoff")
    public void signoff() throws InterruptedException {
        genericFunctions.getApplicationUrl(T24_URL);
    Home = new T24homepage();
    Home.signOff();
}

    @And("navigate to find account option")
    public void findAccount() throws InterruptedException {
        Home = new T24homepage();
        Home.findAccount();

    }

    @Then("open the account that balance maintenance sweep transfer need to be applied")
    public void openAccounttoBalanceMaintenanceSweep() throws Exception {
        Home = new T24homepage();
        Home.findccountArrangement(BalanceMaintenanceAccountNum);
        Home.overview();
        Home.switchToWindow(1);
        GenericFunctions gen=new GenericFunctions();
        gen.windowMaximize();
        accountbalance=Home.getAccountbalance();

    }

    @Then("open the account that applied balance maintenance sweep transfer")
    public void openBalanceMaintenanceSweepAccount() throws Exception {
        Home = new T24homepage();
        Home.findccountArrangement(BalanceMaintenanceAccountNum);
        Home.overview();
        Home.switchToWindow(1);
        GenericFunctions gen=new GenericFunctions();
        gen.windowMaximize();
        accountbalance=Home.getAccountbalance();

    }
    @And("reverse sweep transfer if any Sweep transfer is there and switch back to main menu")
    public void reverseSweepTransfer() throws Exception {
        Home = new T24homepage();

        Home.reversesweepclick();
        GenericFunctions gen=new GenericFunctions();
        gen.switchWindowParent();
       Home.commandline();

    }
    @Then("navigate to operations menu")
    public void operationsMenuClick(){
        Home = new T24homepage();
        Home.operationsmenuClick();
    }
    @And("click on sweep maintainance")
    public void SweepMaintenance(){
        Home = new T24homepage();
        Home.sweepmaintenanceClick();
    }
    @Then("click on  setup maintenance sweep")
    public void setupMaintenanceSweep(){
        Home = new T24homepage();
        Home.sweepmaintenancesweepClick();

    }
    @Then("click on setup surplus sweep")
    public void setupSurplusSweep(){
        Home = new T24homepage();
        Home.SurplussweepClick();

    }
    @And("Enter the details for balance maintenance sweep")
    public void enterBalanceMaintenanceSweepDetails(){
        Home = new T24homepage();

        sweepamount=Home.sweepBalanceMaintenanceAmount(accountbalance);
        Home.sweepmaintenancesweepdata(SweepmaintbalDescription,BalanceMaintenanceAccountNum,sweepamount,SweepmaintbalFromAccount);

    }
    @And("verify that balance maintenance sweep transfer is reflected in the overview page")
    public void  verifySweepTransfer() throws IOException {
        Home = new T24homepage();
        Home.verifysweepAccount(BalanceMaintenanceAccountNum,SweepmaintbalFromAccount,sweepamount);
        Home.setProperty("sweepbalancemaintenenaceAmount",sweepamount);
        Home.setProperty("sweepBalanceMaintenanceDate",DateeToday);
        Home.setProperty("accountblnceBalanceMaintenance",SweepmaintbalFromAccount);
        Home.setProperty("SweepmaintbalAcntToMaintain",BalanceMaintenanceAccountNum);
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }

    @And("verify that Surplus sweep transfer is reflected in the overview page")
    public void  verifySurplusSweepTransfer() throws IOException {
        Home = new T24homepage();
        Home.verifySurplussweepAccount(surplussweeptoaccnt,surplussweepAccntToMaintain,surplussweepamount);
        Home.setProperty("SurplusSweepDate",DateeToday);
        Home.setProperty("surplussweepAmount",surplussweepamount);
        Home.setProperty("SurplusAcntToMaintain",surplussweepAccntToMaintain);
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }
    @Then("open the account that surplus sweep transfer need to be applied")
    public void surplussweepOverview(){
        Home = new T24homepage();
        Home.findccountArrangement(surplussweepAccntToMaintain);
        Home.overview();
        Home.switchToWindow(1);
        GenericFunctions gen=new GenericFunctions();
        gen.windowMaximize();
        accountbalance=Home.getAccountbalance();
    }
    @And("Enter the details for surplus sweep")
    public void enterBalanceSurplusSweepDetails(){
        Home = new T24homepage();

       surplussweepamount= Home.surplusSweepAmount(accountbalance);
        Home.surplussweepdata(surplussweepDescription,surplussweepAccntToMaintain,surplussweepamount,surplussweeptoaccnt);

    }



    @Then("open the account that Two way sweep transfer-BalanceMaintenance need to be applied")
    public void openTheAccountThatTwoWaysSweepTransferBalanceMaintenanceNeedToBeApplied() {
        Home = new T24homepage();
        Home.findccountArrangement(TwoWaySweepAcntToMaintain);
        Home.overview();
        Home.switchToWindow(1);
        GenericFunctions gen=new GenericFunctions();
        gen.windowMaximize();
        accountbalance=Home.getAccountbalance();

    }

    @Then("open the account that Two way sweep transfer-surplus need to be applied")
    public void openTheAccountThatTwoWaysSweepTransferSurplusNeedToBeApplied() {
        Home = new T24homepage();
        Home.findccountArrangement(TwoWaySweepAcntToMaintainTWO);
        Home.overview();
        Home.switchToWindow(1);
        GenericFunctions gen=new GenericFunctions();
        gen.windowMaximize();
        accountbalance=Home.getAccountbalance();

    }

   @Then("click on Setup Two Way Sweep")
    public void clickOnSetupTwoWaySweep() {
       Home = new T24homepage();
       Home.surplustwowaySweepClick();
     //  Home.twowaysweepdata(TwoWaySweepDescription,TwoWaySweepAcntToMaintain,TwoWaySweepAmountToMaintain,TwoWaySweepThresholdAmount,TwoWaySweepFromAcnt);

    }
    @Then("open the account for performing closure")
    public void openTheAaccountForPerformingClosure() {
        Home = new T24homepage();
         Arrangement=Home.getProperty("AccountcreationArrangement");
        Home.findccountArrangement(Arrangement);
        Home.overview();
        Home.switchToWindow(1);
        GenericFunctions gen = new GenericFunctions();
        gen.windowMaximize();

    }

    @And("Enter the details Two way sweep surplus")
    public void enterTheDetailsTwoWaySweepSurplus() {
        Home = new T24homepage();
        sweepamount=Home.surplusSweepAmount(accountbalance);
        Home.twowaysweepdata(TwoWaySweepDescriptionTWO,TwoWaySweepAcntToMaintainTWO,sweepamount,sweepamount,TwoWaySweepFromAcntTWO);
    }
    @And("Enter the details Two way sweep BalanceMaintenance")
    public void enterTheDetailsTwoWaySweepBalanceMaintenance() {
        Home = new T24homepage();
        sweepamount=Home.sweepBalanceMaintenanceAmount(accountbalance);
;        Home.twowaysweepdata(TwoWaySweepDescription,TwoWaySweepAcntToMaintain,sweepamount,sweepamount,TwoWaySweepFromAcnt);
    }



    @And("verify that Two way sweep transfer-surplus is reflected in the overview page")
    public void verifyThatTwoWaySweepTransferSurplusIsReflectedInTheOverviewPage() throws IOException {
        Home = new T24homepage();
        Home.verifyTwoWaysweepAccount(TwoWaySweepAcntToMaintainTWO,TwoWaySweepFromAcntTWO,sweepamount,sweepamount);
        Home.setProperty("sweepamountTwowaySurplus",sweepamount);
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }

    @And("verify that Two way sweep transfer-BalanceMaintenance is reflected in the overview page")
    public void verifyThatTwoWaySweepTransferBalanceMaintenanceIsReflectedInTheOverviewPage() throws IOException {
        Home = new T24homepage();
        Home.verifyTwoWaysweepAccount(TwoWaySweepAcntToMaintain,TwoWaySweepFromAcnt,sweepamount,sweepamount);
        Home.setProperty("TwowaysweepbalancemaintenenaceAmount",sweepamount);
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }

    @And("Navigate to Product catalog")
    public void navigateToProductCatalog() throws Exception {
        Home = new T24homepage();
        Home.productCatalog();

    }
    @Then("Click on At call investment church Account New Arrangement button")
    public void clickOnAtCallInvestmentChurchAccountNewArrangementButton() throws InterruptedException {
        Home = new T24homepage();
        Home.AtcallinvestmentClick();


    }


    @And("Enter the customer number for creating At call Investment church in the customer field")
    public void enterTheCustomerNumberInTheCustomerFieldOfAtcallIn() {
        Home = new T24homepage();
        Home.customenoFill(AccountCreationCustomerNum);
    }

    @And("switch back to main window")
    public void switchBackToMainWindow() throws InterruptedException {
        Home = new T24homepage();
        Home.switchWindow();

    }

    @And("open the newly created account")
    public void openTheNewlyCreatedAccount() throws InterruptedException {
        Home = new T24homepage();
        Home.overviewAccountcreation(Arrangement);
    }


    @And("Click on commit the deal for creating account")
    public void clickOnCommitTheDealForCreatingAccount() throws Exception {
        Home = new T24homepage();
    Arrangement=Home.arrangementNoNewcustomer();
    tradedate=Home.tradeDateNewCustomer();
    productname=Home.productNameNew();
    Customernumnew=Home.costumerNumNew();
        Home.commitDeal();
        Home.setProperty("AccountcreationArrangement",Arrangement);



    }

    @Then("Verify the newly created account")
    public void verifyTheNewlyCreatedAccount() throws InterruptedException {
        Home = new T24homepage();
        Home.verifyCreateNewAccount(Arrangement,tradedate,Customernumnew,productname);
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }
    @Then("Verify the newly created deposit")
    public void verifyTheNewlyCreatedDeposit() throws InterruptedException {
        Home = new T24homepage();
        Home.verifyCreateNewDeposit(Arrangement,tradedate,Customernumnew,productname,"");
        accountnumnew= Home.accountNumNew();
    }

    @And("Select the account mandate record")
    public void selectTheAccountMandateRecord() throws InterruptedException {
        Home = new T24homepage();
        Home.account("10000037.20190607-1");

    }

    @When("close all the other opened windows")
    public void closeAllTheOpenedWindows() throws InterruptedException {
        Home = new T24homepage();
        Home. WindowClosee();
    }

    @And("click on perform closure")
    public void clickOnPerformClosure() throws Exception {
        Home = new T24homepage();
        Home.performClosureClick();
        Home.accountClosure("","100052026");

    }

    @Then("click on accept override")
    public void clickOnAcceptOverride() throws InterruptedException {
        Home = new T24homepage();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        Home.acceptOverridee();

    }

    @Then("Verify whether the transaction complete message is displayed after committing DD")
    public void verifyWhetherTheTransactionCompleteMessageIsDisplayedDD() throws IOException {
        Home = new T24homepage();
        Home.verifyTxnCompleteMsgisdisplayed();
        DateUtilities date=new DateUtilities();
        Home.setProperty("DDdate",date.DatepickTomorrowDate());
        Home.setProperty("DDAmount",DirectDebitAmount);
        Home.setProperty("DDDescription",DirectDebitDescription);
        Home.setProperty("DDaccountNum",DDAccountNum);
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }
    @Then("Verify whether the transaction complete message is displayed")
    public void verifyWhetherTheTransactionCompleteMessageIsDisplayed() throws IOException {
        Home = new T24homepage();
        Home.verifyTxnCompleteMsgisdisplayed();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
        DateUtilities date=new DateUtilities();


    }

    @And("Verify whether the account status changed to Pending Closure")
    public void verifyWhetherTheAccountStatusChangedToPendingClosure() throws Exception {
        Home = new T24homepage();
        Home.statusClosureCheck(Arrangement);
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }

    @And("verify that the Balance Maintenance sweep is reflected on the account")
    public void verifyThatTheBalanceMaintenanceSweepIsReflectedOnTheAccount() throws IOException {
        Home = new T24homepage();
        String sweepamount=Home.getPropertyy("sweepbalancemaintenenaceAmount");
        Home.verifybalancemaintenancesweepOverview(sweepamount);
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }


    @Then("open the account that applied Surplussweep transfer")
    public void openTheAccountThatAppliedSurplussweepTransfer() {
        Home = new T24homepage();
        Home.findccountArrangement(surplussweepAccntToMaintain);
        Home.overview();
        Home.switchToWindow(1);
        GenericFunctions gen=new GenericFunctions();
        gen.windowMaximize();

    }

    @And("verify that the Surplussweep is reflected on the account")
    public void verifyThatTheSurplussweepIsReflectedOnTheAccount() throws IOException {
        Home = new T24homepage();
        sweepamount=Home.getPropertyy("surplussweepAmount");
        Home.verifySurplussweepOverview(sweepamount);
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }

    @Then("open the account that applied Two way sweep transfer Surplus transfer")
    public void openTheAccountThatAppliedTwoWaySweepTransferSurplusTransfer() {
        Home = new T24homepage();
        Home.findccountArrangement(TwoWaySweepAcntToMaintainTWO);
        Home.overview();
        Home.switchToWindow(1);
        GenericFunctions gen=new GenericFunctions();
        gen.windowMaximize();

    }

    @And("verify that the Two way sweep transfer Surplus is reflected on the account")
    public void verifyThatTheTwoWaySweepTransferSurplusIsReflectedOnTheAccount() throws IOException {
        Home = new T24homepage();
        sweepamount=Home.getPropertyy("sweepamountTwowaySurplus");
        Home.verifySurplussweepOverview(sweepamount);
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }

    @Then("open the account that applied Two way sweep transfer Balance maintenance transfer")
    public void openTheAccountThatAppliedTwoWaySweepTransferBalanceMaintenanceTransfer() {
        Home = new T24homepage();
        Home.findccountArrangement(TwoWaySweepAcntToMaintain);
        Home.overview();
        Home.switchToWindow(1);
        GenericFunctions gen=new GenericFunctions();
        gen.windowMaximize();


    }

    @And("verify that the Two way sweep transfer Balance maintenance is reflected on the account")
    public void verifyThatTheTwoWaySweepTransferBalanceMaintenanceIsReflectedOnTheAccount() throws IOException {
        Home = new T24homepage();
        String sweepamount=Home.getPropertyy("TwowaysweepbalancemaintenenaceAmount");
        Home.verifybalancemaintenancesweepOverview(sweepamount);
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }

    @Then("click on fixed Term non church")
    public void clickOnFixedTermNonChurch() throws InterruptedException {
        Home = new T24homepage();
        Home.FixedTermNonChurchclick();


    }

    @And("fill the customer number in customer field")
    public void fillTheCustomerNumberInCustomerField() {
        Home = new T24homepage();
        Home.customenoFill(DepositCreationCustomerNum);
    }

    @Then("Enter the commitment amount")
    public void enterTheCommitmentAmount() {
        Home = new T24homepage();
        Home.commitment(DepositCreationCommitAmount);


    }

    @And("provide the rollover period")
    public void provideTheRolloverPeriod() throws Exception {
        Home = new T24homepage();
        Home.rollover("1Y");


    }

    @Then("Enter the payout details")
    public void enterThePayoutDetails() {
        Home = new T24homepage();
        Home.setttlement("100052026");

    }

    @And("navigate to find deposit option for partial wthdrawal")
    public void navigateToFindDepositOption() throws InterruptedException {
        Home = new T24homepage();
        Home.findDeposit(DepositPartialWthdrwArngment);


    }
    @And("navigate to find deposit for deposit closure")
    public void navigateToFindDepositOptionForDepositClosure() throws InterruptedException, IOException {
        Home = new T24homepage();
        String depositArrangementClosure=Home.getPropertyy("DeposicreationArrangement");
        Home.findDeposit(depositArrangementClosure);

    }


    @And("Click on commit for deposit creation")
    public void clickOnCommitForDepositCreation() throws Exception {
        Arrangement=Home.arrangementNoNewcustomer();
        tradedate=Home.tradeDateNewCustomer();
        productname=Home.productNameNew();
        Customernumnew=Home.costumerNumNew();
        Home.commitDeal();
        Home.setProperty("DeposicreationArrangement",Arrangement);

    }

    @Then("open the newly created deposit")
    public void openTheNewlyCreatedDeposit() {
        Home = new T24homepage();
        Home.overview();
        Home.switchToWindow(1);
        GenericFunctions gen = new GenericFunctions();
        gen.windowMaximize();
    }
    @Then("open the deposit")
    public void openTheDeposit() {
        Home = new T24homepage();
        Home.overview();
        Home.switchToWindow(1);
        GenericFunctions gen = new GenericFunctions();
        gen.windowMaximize();
       accountnumnew=Home.accountNumNew();
    }

    @Then("open the deposit for closure")
    public void openTheDeposited() {
        Home = new T24homepage();
        Home.overview();
        Home.switchToWindow(1);
        GenericFunctions gen = new GenericFunctions();
        gen.windowMaximize();
    }
    @And("Click on Redeem Deposit")
    public void clickOnRedeemDeposit() {
        Home = new T24homepage();
        Home.redeemDepositclick();
    }

    @Then("from the newly opened window select the reason for account closure")
    public void fromTheNewlyOpenedWindowSelectTheReasonForAccountClosure() throws InterruptedException {
        Home = new T24homepage();
        Home.switchwindows();
        Home.ClosureReason();
    }
    @Then("from the newly opened window select the reason for loan closure")
    public void fromTheNewlyOpenedWindowSelectTheReasonForLoanClosure() throws InterruptedException {
        Home = new T24homepage();
        Home.switchwindows();
        Home.ClosureReason();
    }

    @And("Enter the deposit payout details")
    public void enterThePayoutDetailsDeposit() {
        Home = new T24homepage();
        Home.advancedPayout(DepositClosureAdvancedPayOut);
    }

    @Then("Verify whether the transaction complete message is displayed after redeem deposit")
    public void verifyWhetherTheTransactionCompleteMessageIsDisplayedAfterRedeemDeposit() throws InterruptedException {
        Home = new T24homepage();
        Home.verifyTxnCompleteMsgisdisplayed();



    }

    @And("click on redemptionstatement")
    public void clickOnRedemptionstatement() {
        Home = new T24homepage();
        Home.redemptionStatementClick();
    }

    @Then("perform the deposit redemption")
    public void performTheDepositRedemption() throws InterruptedException {
        Home = new T24homepage();
        Home.switchwindows();
        Home.windowMaximize();
        Home.redemptionList(DateeToday);
        Home.ClosureReason();




    }

    @And("verify the deposit closure")
    public void verifyTheDepositClosure() throws IOException {
        Home = new T24homepage();
        String depositArrangementClosure=Home.getPropertyy("DeposicreationArrangement");
        Home.verifyDepositClosure(DateeToday,depositArrangementClosure);
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }

    @And("verify simulation status becomes Completed - Successfully")
    public void verifySimulationStatusBecomesCompletedSuccessfully() throws InterruptedException {
        Home = new T24homepage();
        Home.switchwindows();
        Home.windowMaximize();
        Home.simulationStatus();


    }
    @And("verify simulation status becomes Executed - Successfully")
    public void verifySimulationStatusBecomesExecutedSuccessfully() throws InterruptedException {
        Home = new T24homepage();
        Thread.sleep(1000);
        Home.switchwindows();
        Home.windowMaximize();
        Home.simulationStatusloan();


    }

    @Then("click on commercial loan New Arrangement")
    public void clickOnCommercialLoanNewArrangement() throws InterruptedException {
        Home = new T24homepage();
        Home.commercialLoansclick();


    }

    @And("Provide the loan interest details")
    public void provideTheLoanInterestDetails() {
        Home = new T24homepage();
        Home.loanInterest(LoanCreationMarginoper,LoanCreationMarginType,LoanCreationMarginRate);
        Home.limit();

    }

    @Then("enter the commitment amount and term")
    public void enterTheCommitmentAmountAndTerm() {
        Home = new T24homepage();
        Home.commitmentLoan(LoanCreationCommitentAmount,LoanCreationCommitentTerm);
    }

    @And("user should be able to navigate to find loan")
    public void userShouldBeAbleToNavigateToFindLoan() throws Exception {
        Home = new T24homepage();
        Home.findAuthorisedLoan();

    }
    @And("user should be able to navigate to find closed loan")
    public void userShouldBeAbleToNavigateToFindClosedLoan() throws Exception {
        Home = new T24homepage();
        Home.findClosedLoan();

    }
    @And("user should be able to navigate to find closed account")
    public void userShouldBeAbleToNavigateToFindClosedaccount() throws Exception {
        Home = new T24homepage();
        Home.findClosedLoan();

    }
    @And("user should be able to navigate to find unauthorised loan")
    public void userShouldBeAbleToNavigateToFindUnauthorisedLoan() throws InterruptedException {
        Home = new T24homepage();
        Home.findLoan();

    }


    @Then("open the newly created loan")
    public void openTheNewlyCreatedLoan() throws InterruptedException, IOException {
        Home = new T24homepage();
        Home.openLoan(Arrangement);

    }



    @Then("verify the newly created loan")
    public void verifyTheNewlyCreatedLoan() throws InterruptedException, IOException {
        Home = new T24homepage();
        Home.verifyCreateNewLoan(Arrangement,tradedate,"",productname);
        Home.setProperty("LoanCreationArrangement",Arrangement);
    }

    @And("authorise the loan")
    public void authoriseTheLoan() throws InterruptedException {
        Home = new T24homepage();
        Home.authApprove();
        Home.switchwindows();
        Home.authorisedeal();




    }

    @Then("open the account for posting Direct Debit")
    public void openTheAccountForPostingDirectDebit() throws InterruptedException {
        Home = new T24homepage();
        Home.overviewAccount(DirectDebitArrangement);

    }

    @And("click on Direct Debit")
    public void clickOnDirectDebit() throws InterruptedException {
        Home = new T24homepage();
        Home.directDebit();
    }

    @Then("Enter the details of direct debit")
    public void enterTheDetailsOfDirectDebit() throws InterruptedException {
        Home = new T24homepage();
        String DDDescriptiondDebit=Home.getRandomNumberString(DirectDebitDescription);
        Home.directDebitDestination(DDDescriptiondDebit,DirectDebitBsb,DDAccountNum,DirectDebitName,DDDescriptiondDebit,DirectDebitAmount);
        Home.DirectDebitTransaction(DDDescriptiondDebit,DirectDebitAmount,DDFutureSignatory);
    }

    @And("Enter the date in ibview format")
    public void enterTheDateInIbviewFormat() throws IOException {
        Home = new T24homepage();
        DateUtilities date=new DateUtilities();
        String DDdate=Home.getPropertyy("DDdate");
        String Date=date.DatepickNarrativeFormat(DDdate);
        Home.EnterDateinIbviewFormat(Date);

    }
    @Then("verify the narratives of creditbatchpayment")
    public void verifyTheNarrativesOfCreditabilities() throws Exception{
        T24homepage Home = new T24homepage();
        T24homepage TH=new T24homepage();
        String amount = TH.getPropertyy("TotalamountCreditbatch");
        String description = TH.getPropertyy("batchCreditDescription");

        AccountEntries Acnt = new AccountEntries();
        Acnt.narrativest24NowBatchDebit(amount, description);
        Hooks hooks = new Hooks();
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }

    @Then("Click on find Button")
    public void clickOnFindButton() {
        Home = new T24homepage();
        Home.findClick();
    }


    @And("verify the narratives of Direct Debit")
    public void verifyTheNarrativesOfDirectDebit() throws IOException {
        Narratives narratives=new Narratives();
        Home = new T24homepage();
        String description=Home.getPropertyy("DDDescription");
        String amount=Home.getPropertyy("DDAmount");
        String transactiondate=Home.getPropertyy("DDdate");
        narratives.debitNarrativesDirectDebit(description,amount,transactiondate);
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }

    @Then("open the loan that need to be closed")
    public void openTheLoanThatNeedToBeClosed() throws IOException, InterruptedException {
        Home = new T24homepage();
       Arrangement=Home.getPropertyy("LoanCreationArrangement");
        Home.openLoan(Arrangement);
    }
    @Then("open the Newly created loan")
    public void openThenewlycreatedLoan() throws IOException, InterruptedException {
        Home = new T24homepage();
        Arrangement=Home.getPropertyy("LoanCreationArrangement");
        Home.openLoan(Arrangement);
    }
    @Then("open the account that need to be closed")
    public void openTheaccountThatNeedToBeClosed() throws Exception {
        Home = new T24homepage();
        Arrangement=Home.getPropertyy("AccountcreationArrangement");
        Home.findClosedAccount(Arrangement);
    }
    @Then("open the Deposit that need to be closed")
    public void openTheDepositThatNeedToBeClosed() throws Exception {
        Home = new T24homepage();
        Arrangement=Home.getPropertyy("DeposicreationArrangement");
        Home.findclosedDeposit(Arrangement);
    }

    @And("Click on desbursement")
    public void clickOnDesbursement() {
        Home = new T24homepage();
        Home.desbusementClick();

    }

    @Then("Enter the desbursement details for loan")
    public void enterTheDesbursementDetailsForLoan() {

        Home.disbursementdDetails(LoanClosureDesbursementAccntNum,LoanClosureDesbursementAmount,LoanDesbursementDebitDescription,LoanDesbursementCreditDescription);
    }

    @And("Authorise the desbusement for the loan")
    public void authoriseTheDesbusementForTheLoan() throws InterruptedException {
        Home = new T24homepage();

        Home.authApprove();
        Home.switchwindows();
        Home.authorisedeal();
        Home.windowMaximize();



    }

    @And("Click on request payoff")
    public void clickOnRequestPayoff() throws InterruptedException {
        Home = new T24homepage();
        Home.requestPayoffclick();
    }

    @Then("click on the payoff statement from overfiew screen of loan")
    public void clickOnThePayoffStatementFromOverfiewScreenOfLoan() throws Exception {
        Home = new T24homepage();
        Home.payoffStatementClick();
        Home.switchwindows();
        Payoffamount= Home.getPayoffStatementAmount();


    }

    @And("click on loan payoff")
    public void clickOnLoanPayoff() {
        Home = new T24homepage();
        Home.loanpayoffClick();

    }

    @Then("Enter the loan payoff details")
    public void enterTheLoanPayoffDetails() {
        Home = new T24homepage();
        Home.loanPayOffDetails(LoanPayOffAccountNum, LoanPayOffDebitDescription, LoanPayOffCreditDescription, LoanPayOffSignatory, Payoffamount);


    }
    @And("verify whether the loan status is moved to pending closure")
    public void verifyWhetherTheLoanStatusIsMovedToPendingClosure() {
        Home = new T24homepage();
        Home.verifyLoanClosure(Arrangement);
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");

    }

    @And("click on Partial withdrawal")
    public void clickOnPartialWithdrawal() throws InterruptedException {
        Home = new T24homepage();
        Home.partialwithdrawalClick();
        Home.switchwindows();

    }

    @Then("Enter the partial withdrawal amount")
    public void enterThePartialWithdrawalAmount() throws IOException {
        Home = new T24homepage();
        String a= Home.getRandomNumberStringTwodigit();
        String b=Home.getRandomNumberStringTwodigit();
        String amount=a+"."+b;
        DepositPartialWthdrwAmount=amount;
        Home.partialwithdrawal(amount);
        Home.setProperty("partialwithdrawalamount",amount);

    }

    @And("Click on the withdrawal statement")
    public void clickOnTheWithdrawalStatement() {
        Home = new T24homepage();
        Home.withdrawalStatementclick();
    }

    @Then("Proceed to partial withdrawal")
    public void proceedToPartialWithdrawal() throws InterruptedException, IOException {
        Home = new T24homepage();
        Home.switchwindows();
        Home.windowMaximize();
       // DateeToday=Home.datePickIBM();
        String Amount=Home.getPropertyy("partialwithdrawalamount");
        Home.withdrawalNarrative("",Amount);
        Home.proceedWithdrawal("",Amount);


    }

    @And("verify whether the Deposit partial withdrawal is reflected in the overview Screen")
    public void verifyWhetherTheDepositPartialWithdrawalIsReflectedInTheOverviewScreen() {
        Home = new T24homepage();
        Home.verifyPartialWithdrawel(DepositPartialWthdrwArngment,DateeToday,DepositPartialWthdrwAmount);
    }

    @Then("Enter the account number of deposit in the IB view of account entries")
    public void enterTheAccountNumberOfDepositInTheIBViewOfAccountEntries() {
        Home = new T24homepage();
        Home.enterAccountNumInIbviewofAccounttEntries(accountnumnew,"");
    }

    @Then("Check the narratives of Partial Withdrawal")
    public void checkTheNarrativesOfPartialWithdrawal() {
        Home = new T24homepage();
        Home.debitNarrativesPartialWithdrawal("",DepositPartialWthdrwAmount,DateeToday);
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }




    @And("open the account that need to perform the loan repayment")
    public void openTheAccountThatNeedToPerformTheLoanRepayment() throws Exception {
        Home = new T24homepage();
        Home.openLoanForrepayment("");
        Home.loanfind("Current");
        Home.switchwindows();
        Home.maximize();
         accountnumnew=Home.getAccountnumber();
         Arrangement=Home.getArrangement();
        Home.setProperty("loanrepayaccountnum",accountnumnew);
    }

    @Then("click on repayment button")
    public void clickOnRepaymentButton() {
        Home = new T24homepage();
        Home.repaymentsclick();
    }

    @And("enter the repayment details")
    public void enterTheRepaymentDetails() throws Exception {
        Home = new T24homepage();
        LoanRepaymentDestDescription=Home.getRandomNumberString("desc")+Home.getRandomNumberStringTwodigit();
        LoanRepaymentAmount=Home.getRandomNumberStringTwodigit()+"."+Home.getRandomNumberStringTwodigit();
        Home.repaymentsdetails(LoanRepaymentSrcAccountNum, LoanRepaymentSrctDescription, LoanRepaymentDestDescription,LoanrepaymentSignatory, LoanRepaymentAmount);
        Home.setProperty("LoanrepayDesc",LoanRepaymentDestDescription);
        Home.setProperty("LoanrepayAmount",LoanRepaymentAmount);
        String date=Home.datePickIBM();
        Home.setProperty("loanrepayDate",date);
    }

    @Then("Enter the account number of Loan repayment in the IB-view of account entries")
    public void enterTheAccountNumberOfLoanRepaymentInTheIBViewOfAccountEntries() throws IOException {
        Home = new T24homepage();
        String accountnum=   Home.getPropertyy("loanrepayaccountnum");
             String loanrepayDate=   Home.getPropertyy("loanrepayDate");
        Home.enterAccountNumInIbviewofAccounttEntries(accountnum,loanrepayDate);

    }


    @cucumber.annotation.en.And("click on Go to Accounts")
    public void clickOnGoToAccounts() {
    }

    @And("navigate to find deposit option")
    public void navigateToFindDepositOptionnewDeposit() throws InterruptedException, IOException {
        Home = new T24homepage();
        String arrangement=Home.getPropertyy("DeposicreationArrangement");
        Home.findDeposit(arrangement);
    }

    @And("Enter the details in the account transfer for External transfer overlimit")
    public void enterTheDetailsInTheAccountTransferForExternalTransferOverlimit() throws IOException, InterruptedException {
        Home = new T24homepage();
        Home.sourceAcountDetails(ExternaltransferAccountNumOverLimit, ExternTransDebitdesciptionOverlimit);
        Home.externalDestinationAcountDetails(ExternTransBsb10k,ExternaltransferAccountNumOverLimit,ExternTransDestAccountName10k,ExternTransCreditdesciptionOverLimit,"",ExternalTransferAmountOver10k);
        Home.setProperty("ExternaltransDebitDescOver10k",Home.TransDebitdesciption);
        Home.setProperty("ExternaltransOver10kAmount",T24homepage.transAmount);
        Home.setProperty("ExternaltransOver10kDate",T24homepage.transferdate);
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");



    }

    @And("Verify whether the internal transfer over limit transaction is reflected in the accountentries")
    public void verifyWhetherTheInternalTransferOverLimittransactionIsReflectedInTheAccountentries() throws IOException {
        Home = new T24homepage();
        String date=Home.getPropertyy("internaltransoverlimitdate");

        Home.checkAccountEntries(T24homepage.TransactionID,internalTransferAmountOverLimit,date);
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }
    @Then("open the account that Periodic payment need to be applied")
    public void openAccounttoPeriodicPayment() throws Exception {
        Home = new T24homepage();
        Home.openAccountArrangement(IntPeriodicPayAccountNum);

        accountbalance=Home.getAccountbalance();

    }
    @Then("open the account that external Periodic payment need to be applied")
    public void openAccounttoexternalPeriodicPayment() throws Exception {
        Home = new T24homepage();
        Home.openAccountArrangement(ExtPeriodicPayAccountNum);
        accountbalance=Home.getAccountbalance();

    }

    @And("click on standing order")
    public void clickOnStandingOrder() throws Exception {
        Home = new T24homepage();
        Home.standingOrder();



    }

    @Then("Enter the details of periodic payment")
    public void enterTheDetailsOfPeriodicPayment() {
        String sourcedescription=Home.getRandomNumberString("intPay");
        String Destinationdescription=Home.getRandomNumberString("dstDesc");
        String amount=Home.getRandomNumberStringTwodigit()+"."+Home.getRandomNumberStringTwodigit();
        Home.destinationDetailsPeriodic(sourcedescription,"100000392",Destinationdescription,amount);

    }
    @Then("Enter the details of external periodic payment")
    public void enterTheDetailsOfExternalPeriodicPayment() {
        String sourcedescription=Home.getRandomNumberString("intPay");
        String Destinationdescription=Home.getRandomNumberString("dstDesc");
        String amount=Home.getRandomNumberStringTwodigit()+"."+Home.getRandomNumberStringTwodigit();
       // Home.destinationDetailsPeriodic(sourcedescription,"300000392",Destinationdescription,amount);
        Home.destinationDetailsPeriodicExternal(sourcedescription,externaltrtsansBSB,externaltrtsansDestAccntno,externaltrtsansAccntname,Destinationdescription,amount);



    }
    @Then("authorise loanpayoff")
    public void authoriseLoanpayoff() throws InterruptedException {
        T24homepage hm=new T24homepage();
        hm.loanPayoffapprove();
    }

    @Then("verify whether the loan is closed")
    public void verifyWhetherTheLoanIsClosed() throws IOException {
        T24homepage hm=new T24homepage();
        Arrangement=Home.getPropertyy("LoanCreationArrangement");
        hm.verifyLoanClosure(Arrangement);
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }
    @Then("verify whether the account is closed")
    public void verifyWhetherTheAccountIsClosed() throws IOException {
        T24homepage hm=new T24homepage();
        Arrangement=Home.getPropertyy("AccountcreationArrangement");
        hm.AccountClosureStatus(Arrangement);

    }
    @Then("verify whether the Deposit is closed")
    public void verifyWhetherTheDepositIsClosed() throws IOException {
        T24homepage hm=new T24homepage();
        Arrangement=Home.getPropertyy("DeposicreationArrangement");
        hm.verifyDepositClosureStatus(Arrangement);
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }

    @Then("verify the narratives of loan repayment")
    public void verifyTheNarrativesOfLoanRepayment() throws IOException, InterruptedException {
        T24homepage hm=new T24homepage();
        AccountEntries acnt=new AccountEntries();



        String LoanrepayDesc=Home.getPropertyy("LoanrepayDesc");
        String LoanrepayAmount=Home.getPropertyy("LoanrepayAmount");
        String date=Home.getPropertyy("loanrepayDate");
        acnt.creditNarrativesLoanRepayment(LoanrepayDesc,LoanrepayAmount,date);
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");

    }


    @Then("Verify whether the status of the loan is current")
    public void verifyWhetherTheStatusOfTheLoanIsCurrent() throws IOException {
        T24homepage hm=new T24homepage();
        Arrangement=hm.getPropertyy("LoanCreationArrangement");
        hm.verifyLoanCurrentStatus(Arrangement);
        hooks.takeScreenshot(hooks.scenario);
        setUp.baseTest.onDemandTakeScreenshot("<<<<< >>>>>");
    }


    @Then("click on register client")
    public void clickOnRegisterClient() {
        T24homepage hm=new T24homepage();
        hm.RegisterclientClick();
    }

    @Then("retrieve the client number")
    public void retrieveTheClientnumber() {
        T24homepage hm=new T24homepage();
        hm.RetrieveClient("10007175");
        hooks.screenNew(hooks.scenario);

    }
    @Then("retrieve the client numberr")
    public void retrieveTheClientnumberr() {
        T24homepage hm=new T24homepage();
        hm.RetrieveClient("10007175");
        hooks.screenNew(hooks.scenario);

    }

    @Then("check whether T24 is up and running")
    public void checkWhetherTIsUpAndRunning() {
        T24homepage hm=new T24homepage();
        hm.ceckT24();
        hooks.screenNew(hooks.scenario);
    }


    @cucumber.annotation.en.When("enter the name of")
    public void enterTheNameOf() {

    }
}




