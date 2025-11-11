package com.frameium.pageobject.UFS;

import com.frameium.genericfunctions.GenericFunctions;
import com.frameium.logger.LoggerHelper;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.text.DecimalFormat;
import java.util.List;

public class AccountEntries extends GenericFunctions {
    By Password = By.xpath("//*[@id='password']");
    By usernameeT24 = By.xpath("//*[@id='signOnName']");
    By loginbuttont24 = By.xpath("//*[@id='sign-in']");
    By authframe = By.xpath("//*[contains(@id,'banner')and contains(@name,'banner')]");
    By t24Page = By.xpath("//*[@id='pane_']/div[2]//descendant::input");
    By t24Tick = By.xpath("//*[@id='cmdline_img']");
    By innerframe = By.xpath("//*[contains(@id,'LOSHOMEPAGE')]");
    By transactionProcessing = By.xpath("(//*[@id='imgError'])[24]");
    By PaymentSuitee = By.xpath("//*[@href=\"javascript:docommand('TAB UFS.PAYMENT.TAB.CSM.PU');\"]");
    By creaatepaymentframe = By.xpath("//*[contains(@id,'FRAMETAB')]");
    By createinnerframe = By.xpath("//*[contains(@target,'workarea')and contains(@name,'FRAMETAB')]");
    By createpayment = By.xpath("(//table/tbody/tr/td[1]/a/span/following::a/span)[1]");
    By Accounttransferframe = By.xpath("//*[contains(@id,'workarea')and contains(@name,'FRAMETAB')]");
    By Accounttransfer = By.xpath("//*[@class=\"enqDrillLink\" and contains(text(),'Account Transfer')]");
    By sourceAcntBSB = By.xpath("//*[contains(@id,'fieldName:SRC.ACCT.BSB')]");
    By sourceAcntnumber = By.xpath("//*[contains(@id,'fieldName:SRC.ACCT.NO') or contains(@name,'fieldName:SRC.ACCT.NO')]");
    By sourceAcntname = By.xpath("//*[contains(@id,'fieldName:SRC.ACCT.NAME') or contains(@name,'fieldName:SRC.ACCT.NAME')]");
    By Descriptiion = By.xpath("//*[@id='fieldName:SRC.PYMT.DESC']");
    By DestinationAcntno = By.xpath("//*[contains(@id,'fieldName:DES.ACCT.NO')]");
    By destinationName = By.xpath("//*[contains(@id,'fieldName:DES.ACCT.NAME')]");
    By destinationDescription = By.xpath("//*[@name='fieldName:DES.PYMT.DESC']");
    By signatory = By.xpath("//*[@name='fieldName:SIGNATORY:1']");
    By amountfield = By.xpath("//*[contains(@id,'fieldName:DEBIT.AMOUNT') ]");
    By calender = By.xpath("//*[@title='Calendar' and @class='dropdown_button dropdown_button_FUNDSTRANSFER dropdown_button_FUNDSTRANSFER_BAASACTR']");
    By currentdate = By.xpath("//*[@class='today today_FUNDSTRANSFER today_FUNDSTRANSFER_BAASACTR']");
    By validatedeal = By.xpath("//*[contains(@title,'Validate a deal') and contains(@alt,'Validate a deal')]");
    By commitDeal = By.xpath("//*[contains(@title,'Commit the deal') and contains(@alt,'Commit the deal')]");
    By TxnComplete = By.xpath("//*[contains(@class,'message') and contains(text(),'Txn Complete')]");
    By iBview = By.xpath("//*[@id='pane_']/ul[10]/li/ul/li[20]/a");
    By generalenquiries = By.xpath("//*[text()='General Enquiries/Reports']");
    By accountNum = By.xpath("//label[text()='CustomerAcctNumber']//../../..//input[@type='text']");
    By processingdate = By.xpath("//label[text()='From Date']//../../..//input[@type='text']");
    By find = By.xpath("//*[@id='enqsel']/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table/tbody/tr/td[3]/div/table/tbody/tr/td/a");
    private final Logger log = LoggerHelper.getLogger(AccountEntries.class);
    By pageSearch = By.xpath("//*[@alt='Last Page']");
    By nextpage = By.xpath("//a[@title='Next Page']");
    By ViewAccountEntries = By.xpath("//*[@href=\"javascript:doenq('ENQ UFS.STMT.ENT.BOOK.FINANCE');\"]");
    By accountentriesAccountnum = By.xpath("//label[text()='Account']//../../..//input[@type='text']");
    By accountentriesDate = By.xpath("//*[@id='value:2:1:1']");

    public void debitNarratives(String description, String amount, String transactiondate, String balance) throws InterruptedException {
        String bal = balance;
        String s = bal.replace(",", "");
        Double balance1 = Double.parseDouble(s);
//        String amo="";
//
//            amo = amount.replace(",", "");

        Double amount1 = Double.parseDouble(amount);
        Double newbalance = balance1 - amount1;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String balances = decimalFormat.format(newbalance);
        System.out.println(balances);
        for (int i = 1; i <= 30; i++) {
            if (i == 20) {
                WebElement next = findElement(nextpage);
                next.click();
                i = 1;
                Thread.sleep(2000);
            }
String a="";
            WebElement descriptio;
            Thread.sleep(80);
            try {
                descriptio = findElementVisiblity(By.xpath("(//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[4])"));
                 a=descriptio.getText();



            } catch (StaleElementReferenceException exc) {
                 descriptio = findElementVisiblity(By.xpath("(//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[4])"));
                a=descriptio.getText();
                exc.printStackTrace();
            }
          /// WebElement descriptio = findElement(By.xpath("(//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[4])"));
           // String a=descriptio.getText();
            if (a.contains(description)) {
                scrollIntoView(descriptio);
                WebElement date = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[6]"));
                String Date=date.getText();
               WebElement actualAmountt = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[7]"));
                String actualAmount=actualAmountt.getText();
               if(actualAmount.contains(",")){
                    actualAmount= actualAmount .replaceAll(",","");
                }

                WebElement newBalancee = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[8]"));
                String newBalance=newBalancee.getText();
               WebElement credit_debit = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[9]"));
                String b=credit_debit.getText();
              // log.info("checking debit" );
                String newBalance1 = newBalance.replace(",", "");
                Assert.assertTrue(actualAmount.contains(amount) && b.contains("Debit"));
                highlightUsingJs(credit_debit);
                highlightUsingJs(newBalancee);
                highlightUsingJs(actualAmountt);
                highlightUsingJs(descriptio);
                WebElement transactcode = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[2]"));
                WebElement bankaccountnumber = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[1]"));
                WebElement valuedate = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[5]"));
                WebElement postingdate = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[6]"));
                WebElement creditordebit = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[9]"));
                WebElement transactiondeccription = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[3]"));
                highlightUsingJs(transactcode);
                highlightUsingJs(transactiondeccription);
                highlightUsingJs(postingdate);
                highlightUsingJs(bankaccountnumber);
                highlightUsingJs(valuedate);
                highlightUsingJs(transactiondeccription);
                highlightUsingJs(creditordebit);








                {
                    System.out.print(transactiondate + "  ");
                    System.out.print(actualAmount + " ");
                    System.out.print(b);
                    System.out.println("test pass  ");
                    System.out.println(actualAmount);
                    System.out.println(Date);
                    System.out.println(a);
                }
                break;
            }

        }

    }


    public void narrativest24NowBpay(String amnt1,String descr1) throws Exception  {
        this.driver=driver;
        for(int i=1;i<=30;i++)
        {
            if(i==20) {
                clickElement(nextpage);

                Thread.sleep(2000);

                i=1;
            }
            String actualAmount="";
            try {
                 actualAmount = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[7]")).getText();
            }
            catch (StaleElementReferenceException exc) {
                actualAmount = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[7]")).getText();
                exc.printStackTrace();
            }
            if (actualAmount.contains(amnt1))
            {

                System.out.println(actualAmount);
                String dbt=findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[9]")).getText();
                System.out.println(dbt);
                String actualBalance=findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[8]")).getText();
                String a=findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[4]")).getText();

                Assert.assertTrue(actualAmount.contains(amnt1)&& dbt.contains("Debit")&&a.contains(descr1)) ;

                System.out.println("Debit in narratives is passed");
                break;
            }

        }}
    public void narrativest24Bpay(String amnt1,String Billername,String billercrn) throws Exception  {
        this.driver=driver;
        for(int i=1;i<=30;i++)
        {
            if(i==20) {
                clickElement(nextpage);

                Thread.sleep(2000);

                i=1;
            }
            String actualAmount="";
            try {
                actualAmount = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[7]")).getText();
            }
            catch (StaleElementReferenceException exc) {
                actualAmount = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[7]")).getText();
                exc.printStackTrace();
            }
            if (actualAmount.contains(amnt1))
            {

                System.out.println(actualAmount);
                String dbt=findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[9]")).getText();
                System.out.println(dbt);
                String actualBalance=findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[8]")).getText();
                String a=findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[4]")).getText();
                String TransactDescription=findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[4]")).getText();

                Assert.assertTrue(actualAmount.contains(amnt1)&& dbt.contains("Debit")&&TransactDescription.contains("BPAY Bill Payment")) ;

                System.out.println("Debit in narratives is passed");
                break;
            }

        }}



    public void narrativest24NowBatchcredit(String amnt1,String descr1) throws Exception  {
        this.driver=driver;
        for(int i=1;i<=30;i++)
        {
            if(i==20) {
                clickElement(nextpage);

                Thread.sleep(2000);

                i=1;
            }
            String Actualdescription="";
            try {


             Actualdescription = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[4]")).getText();
        }
          catch(Exception exc){
              Actualdescription = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[4]")).getText();
              exc.printStackTrace();
          }
            if (Actualdescription.contains(descr1))
            {
                String actualAmount= findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[7]")).getText();

              //  System.out.println(actualAmount);
                String dbt=findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[9]")).getText();
                System.out.println(dbt);
                String actualBalance=findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[8]")).getText();
                String a=findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[4]")).getText();

                Assert.assertTrue(actualAmount.contains(amnt1)&& dbt.contains("Credit")&&a.contains(descr1)) ;

                System.out.println("Credit narratives is passed");
                break;
            }

        }}
    public void narrativest24credit(String amnt1,String descr1) throws Exception  {
        this.driver=driver;
        for(int i=1;i<=30;i++) {
            if (i == 20) {
                clickElement(nextpage);

                Thread.sleep(2000);

                i = 1;
            }
            String Actualdescription="";
            try {

            Actualdescription = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[4]")).getText();
        }
            catch(Exception Exe){
                Actualdescription = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[4]")).getText();
                Exe.printStackTrace();
            }

            if (Actualdescription.contains(descr1))
            {
                String actualAmount= findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[7]")).getText();

                //  System.out.println(actualAmount);
                String dbt=findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[9]")).getText();
                System.out.println(dbt);
                String actualBalance=findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[8]")).getText();
                String a=findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[4]")).getText();
                amnt1=amnt1.replace("$","");
                Assert.assertTrue(actualAmount.contains(amnt1)&& dbt.contains("Credit")&&a.contains(descr1)) ;

                System.out.println("Credit narratives is passed");
                break;
            }

        }}




    public void narrativest24NowBatchDebit(String amnt1,String descr1) throws Exception  {
        this.driver=driver;
        for(int i=1;i<=30;i++)
        {
            if(i==20) {
                WebElement Nextpage = findElementClickable(nextpage);
                Nextpage.click();
                Thread.sleep(2000);

                i=1;
            }
            String Actualdescription="";
            try {
                Actualdescription = findElementVisiblity(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[4]")).getText();
            }

            catch(Exception exe){
                Actualdescription = findElementVisiblity(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[4]")).getText();
                exe.printStackTrace();
            }

            if (Actualdescription.contains(descr1))
            {
                WebElement Actualamount = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[7]"));
                String actualAmount=Actualamount.getText();
                //  System.out.println(actualAmount);
                String dbt=findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[9]")).getText();
                System.out.println(dbt);
                String actualBalance=findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[8]")).getText();
                String a=findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[4]")).getText();
                Assert.assertTrue(actualAmount.contains(amnt1)&& dbt.contains("Debit")&&a.contains(descr1)) ;
                WebElement transactiondeccription = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[3]"));
                WebElement transactnarrative = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[4]"));
                WebElement transactcode = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[2]"));
                WebElement bankaccountnumber = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[1]"));
                WebElement valuedate = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[5]"));
                WebElement postingdate = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[6]"));
                WebElement balance = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[8]"));
                WebElement creditordebit = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[9]"));
                highlightUsingJs(transactcode);
                highlightUsingJs(Actualamount);
                highlightUsingJs(transactnarrative);
                highlightUsingJs(balance);
                highlightUsingJs(postingdate);
                highlightUsingJs(bankaccountnumber);
                highlightUsingJs(valuedate);
                highlightUsingJs(transactiondeccription);
                highlightUsingJs(creditordebit);
                System.out.println("Debit narratives is passed");
                break;
            }

        }}

    public void narrativest24Debit(String amnt1,String descr1) throws Exception  {
       // this.driver=driver;
        for(int i=1;i<=30;i++)
        {
            if(i==20) {
                WebElement Nextpage = findElementClickable(nextpage);
                Nextpage.click();
                Thread.sleep(2000);

                i=1;
            }
            String Actualdescription="";
            try {
                Actualdescription = findElementVisiblity(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[4]")).getText();
            }

            catch(Exception exe){
                Actualdescription = findElementVisiblity(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[4]")).getText();
                exe.printStackTrace();
            }

            if (Actualdescription.contains(descr1))
            {
                WebElement Actualamount = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[7]"));
                String actualAmount=Actualamount.getText();
                //  System.out.println(actualAmount);
                String dbt=findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[9]")).getText();
                System.out.println(dbt);
                String actualBalance=findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[8]")).getText();
                String a=findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[4]")).getText();
                Assert.assertTrue(actualAmount.contains(amnt1)&& dbt.contains("Debit")&&a.contains(descr1)) ;
                WebElement transactiondeccription = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[3]"));
                WebElement transactnarrative = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[4]"));
                WebElement transactcode = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[2]"));
                WebElement bankaccountnumber = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[1]"));
                WebElement valuedate = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[5]"));
                WebElement postingdate = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[6]"));
                WebElement balance = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[8]"));
                WebElement creditordebit = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[9]"));
                highlightUsingJs(transactcode);
                highlightUsingJs(Actualamount);
                highlightUsingJs(transactnarrative);
                highlightUsingJs(balance);
                highlightUsingJs(postingdate);
                highlightUsingJs(bankaccountnumber);
                highlightUsingJs(valuedate);
                highlightUsingJs(transactiondeccription);
                highlightUsingJs(creditordebit);
                System.out.println("Debit narratives is passed");
                break;
            }

        }}


    public void narrativest24NowCreditBatchnew(String amnt1,String descr1,String accntnumber,String Postingdate) throws Exception  {
        this.driver=driver;
        for(int i=1;i<=30;i++)
        {
            if(i==20) {
                clickElement(nextpage);

                Thread.sleep(2000);

                i=1;
            }
            String Actualdescription= findElementVisiblity(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[4]")).getText();
            if (Actualdescription.contains(descr1))
            {
                WebElement Actualamount = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[7]"));
                String actualAmount=Actualamount.getText();
                //  System.out.println(actualAmount);
                String dbt=findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[9]")).getText();
                System.out.println(dbt);
                WebElement bankaccountnumber = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[1]"));
                String BnkAccntNumber=bankaccountnumber.getText();
                String actualBalance=findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[8]")).getText();
                String a=findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[4]")).getText();
                WebElement transactiondeccription = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[3]"));
               String TransDesc=transactiondeccription.getText();
                WebElement transactcode = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[2]"));
                String transactioncode=transactcode.getText();
                amnt1=amnt1.replace("$","");

              //  Assert.assertTrue(actualAmount.contains(amnt1)&& dbt.contains("Debit")&&a.contains(descr1)&&BnkAccntNumber.contains(accntnumber)&&TransDesc.contains("Batch Payments")&&transactioncode.contains("249")) ;
                WebElement transactnarrative = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[4]"));
                WebElement valuedate = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[5]"));
                WebElement postingdate = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[6]"));
                WebElement balance = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[8]"));
                WebElement creditordebit = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[9]"));
                highlightUsingJs(transactcode);
                highlightUsingJs(Actualamount);
                highlightUsingJs(transactnarrative);
                highlightUsingJs(balance);
                highlightUsingJs(postingdate);
                highlightUsingJs(bankaccountnumber);
                highlightUsingJs(valuedate);
                highlightUsingJs(transactiondeccription);
                highlightUsingJs(creditordebit);
                System.out.println("Debit narratives is passed");
                break;
            }

        }}





    public void balanceCheck(String AccountNumber) throws InterruptedException {
        //switchToDefault();
        WebElement innerFrame = findElement(innerframe);
        switchToFrame(innerFrame);
        WebElement generalenq = findElement(generalenquiries);
        generalenq.click();
        log.info("click on General enquiries");
        WebElement Ibview1 = findElement(iBview);

        List<WebElement> wb = findElements(iBview);
        for (WebElement we : wb) {
            if (we.isDisplayed() && we.isEnabled()) {
                WebElement Ibview2 = findElement(iBview);
                Ibview2.click();

            } else {
                WebElement Generalenquiries = findElement(generalenquiries);
                Generalenquiries.click();
                WebElement Ibview = findElement(iBview);
                log.info("click on Ibview");
                Ibview.click();

            }
            switchToDefault();
            WebElement creaatepaymentFrame = findElement(creaatepaymentframe);
            switchToFrame(creaatepaymentFrame);
            WebElement AccountNum = findElement(accountNum);
            AccountNum.clear();
            AccountNum.sendKeys(AccountNumber);
            WebElement Processingdate = findElement(processingdate);
            Processingdate.click();
            WebElement Processingdate1 = findElement(processingdate);
            Processingdate1.clear();
            WebElement Find = findElement(find);
            Find.click();

            pageNext();


        }
    }

    public void pageNext() {

        //WebElement pagesearch=driver.findElement(pageSearch);
        List<WebElement> elements = findElements(pageSearch);

        if (elements.size() > 0) {
            WebElement pagesearch1 = findElement(pageSearch);
            pagesearch1.click();
        } else {
            log.info("continue");
        }
    }

    public void  accountEntries(String AccountNumber, String date) throws InterruptedException {
        //Thread.sleep(1000);
        switchToDefault();
        WebElement innerFrame = findElement(innerframe);
        switchToFrame(innerFrame);
        log.info("click on General enquiries");
        List<WebElement> wb = findElements(ViewAccountEntries);
        for (WebElement we : wb) {
            if (we.isDisplayed() && we.isEnabled()) {
                we.click();
                log.info("click on View AccountEntries");
            } else {
                WebElement Generalenquiries = findElement(generalenquiries);
                Generalenquiries.click();
                log.info("click on General enquiries");
                WebElement ViewaccountEntries = findElement(ViewAccountEntries);
                ViewaccountEntries.click();
            }
            switchToDefault();
            WebElement creaatepaymentFrame = findElement(creaatepaymentframe);
            switchToFrame(creaatepaymentFrame);
            WebElement AccountNum = findElement(accountentriesAccountnum);
            AccountNum.clear();
            AccountNum.sendKeys(AccountNumber);
            log.info("enter account number");
            WebElement Processingdate = findElement(accountentriesDate);
            Processingdate.click();
            WebElement Processingdate1 = findElement(accountentriesDate);
            Processingdate1.clear();
            String Date = Datepicknarrative("date");
            WebElement Processingdate2 = findElement(accountentriesDate);
            Processingdate2.sendKeys("Date");
            // WebElement AccountentriesCurrentDate=driver.findElement(AccountEntriesViewCurrentDate);
            // AccountentriesCurrentDate.click();
            // accountNum.sendKeys(" 100057985");
            WebElement Find = findElement(find);
            Find.click();
            log.info("click find");
        }
    }
    public String Datepicknarrative(String date1) {

        String date=date1;
        String[] arr = date.split("/");
        String dateToday = arr[0];// ----->>29
        int day=Integer.parseInt(dateToday);
        String a= String.format("%02d",day);
        String monthAndYear = arr[2]+arr[1];
        String Date = monthAndYear+a;
        System.out.println(Date);
        return Date;
    }

    public void creditAccount(String AccountNumber,String date) throws InterruptedException {
        WebElement AccountNum3=findElement(accountNum);
        AccountNum3.clear();
        log.info("Entered credit account number");

        log.info("Entered credit  account number");
        WebElement AccountNum1=findElement(accountNum);
        AccountNum1.sendKeys(AccountNumber);

        WebElement Processingdate=findElement(processingdate);
        Processingdate.click();
        WebElement Processingdate1=findElement(processingdate);
        Processingdate1.clear();
        String Date=Datepicknarrative(date);
        WebElement Processingdate2=findElement(processingdate);
        Processingdate2.sendKeys(Date);
        log.info("click on find");
        WebElement Find=findElement(find);
        Find.click();
        Thread.sleep(1000);
        pageNext();
    }


    public void creditNarratives(String descriptio,String amountt,String transactiondat,String balance) throws InterruptedException {

        //this.driver = driver;


        String bal=balance;
        String s=bal.replace(",", "");
        Double balance1=Double.parseDouble(s);
        String amo=amountt.replace(",","");
        Double amount1=Double.parseDouble(amo);
        Double newbalance=balance1+amount1;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String balances=decimalFormat.format(newbalance);
        System.out.println(balances);
        for(int i=1;i<=30;i++)
        {
            if(i==20) {
                try {
                    WebElement next=findElementClickable(nextpage);
                    next.click();
                    i=1;
                } catch (StaleElementReferenceException exc) {
                    Thread.sleep(500);
                    WebElement next=findElementClickable(nextpage);
                    next.click();
                    i=1;
                    exc.printStackTrace();
                }

            }
            String a="";
            WebElement description;
            Thread.sleep(80);
            try {

                description = findElement(By.xpath("(//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[4])"));
                a=description.getText();



            } catch (StaleElementReferenceException exc) {
                description = findElement(By.xpath("(//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[4])"));
                a=description.getText();
                exc.printStackTrace();
            }
            /// WebElement descriptio = findElement(By.xpath("(//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[4])"));
            // String a=descriptio.getText();
            if (a.contains(descriptio)) {
                scrollIntoView(description);
                WebElement date = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[6]"));
                String Date=date.getText();
                WebElement actualAmountt = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[7]"));
                String actualAmount=actualAmountt.getText();
                if(actualAmount.contains(",")){
                    actualAmount= actualAmount .replaceAll(",","");
                }

                WebElement newBalancee = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[8]"));
                String newBalance=newBalancee.getText();
                WebElement credit_debit = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[9]"));
                String b=credit_debit.getText();
                // log.info("checking debit" );
                String newBalance1 = newBalance.replace(",", "");

                double newbalancee=Double.parseDouble(newBalance1);
                double debitamount=Double.parseDouble(amountt);
                String balancewithoutcomma = balance.replace(",", "");
                double oldBalancee=Double.parseDouble(balancewithoutcomma);
                double newBalncee=oldBalancee+debitamount;
               // double number = Double.parseDouble(newbalancee);
                String Newbalance = String.format("%.2f", newBalncee);
               //String Newbalance= String.valueOf(newBalncee);
                Assert.assertTrue(actualAmount.contains(amountt)&& b.contains("Credit")&&Newbalance.contains(balances)); {log.info("checking credit" );
                highlightUsingJs(credit_debit);
                highlightUsingJs(newBalancee);
                highlightUsingJs(actualAmountt);
                highlightUsingJs(description);

                    System.out.print(transactiondat+"  ");

                    WebElement transactcode = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[2]"));
                    WebElement bankaccountnumber = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[1]"));
                    WebElement valuedate = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[5]"));
                    WebElement postingdate = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[6]"));
                    WebElement transactiondeccription = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr["+i+"]/td[3]"));
                    highlightUsingJs(transactcode);
                    highlightUsingJs(transactiondeccription);
                    highlightUsingJs(postingdate);
                    highlightUsingJs(bankaccountnumber);
                    highlightUsingJs(valuedate);
                    highlightUsingJs(transactiondeccription);
                System.out.print(actualAmount+" ");
                System.out.print(b);

                System.out.println("  test pass  ");

                log.info("credit narrative verified.");

                break;
            }

//				System.out.print("failed");
//				TestBase tb=new TestBase();
//				tb.logExtentReport("failed");
            }

        }



}


    public void creditNarrativesLoanRepayment(String descriptio,String amountt,String transactiondate) throws InterruptedException {

        //this.driver = driver;


        //String s=bal.replace(",", "");
        // Double balance1=Double.parseDouble(s);
        String amo = amountt.replace(",", "");
        Double amount1 = Double.parseDouble(amo);
        // Double newbalance=balance1+amount1;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        //String balances=decimalFormat.format(newbalance);
        //System.out.println(balances);
        for (int i = 1; i <= 30; i++) {
            if (i == 20) {
                try {
                    WebElement next = findElementClickable(nextpage);
                    next.click();
                    i = 1;
                } catch (StaleElementReferenceException exc) {
                    Thread.sleep(500);
                    WebElement next = findElementClickable(nextpage);
                    next.click();
                    i = 1;
                    exc.printStackTrace();
                }

            }
            String a = "";
            WebElement actualAmountt;
            Thread.sleep(80);
            try {

               actualAmountt = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[7]"));
                a = actualAmountt.getText();


            } catch (StaleElementReferenceException exc) {

                actualAmountt = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[7]"));
                a = actualAmountt.getText();
                exc.printStackTrace();
            }
            /// WebElement descriptio = findElement(By.xpath("(//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[4])"));
            // String a=descriptio.getText();
            if (a.contains(amountt)) {
                scrollIntoView(actualAmountt);
                WebElement date = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[6]"));
                String Date = date.getText();
                WebElement ActualAmountt = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[7]"));
                String actualAmount = ActualAmountt.getText();
                if (actualAmount.contains(",")) {
                    actualAmount = actualAmount.replaceAll(",", "");
                }
                WebElement description = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[4]"));

                WebElement newBalancee = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[8]"));
////                String newBalance=newBalancee.getText();
                WebElement credit_debit = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[9]"));
                String b = credit_debit.getText();
                // log.info("checking debit" );
                // String newBalance1 = newBalance.replace(",", "");

                // double newbalancee=Double.parseDouble(newBalance1);
                double debitamount = Double.parseDouble(amountt);
                // String balancewithoutcomma = balance.replace(",", "");
                // double oldBalancee=Double.parseDouble(balancewithoutcomma);
                // double newBalncee=oldBalancee+debitamount;
                // double number = Double.parseDouble(newbalancee);
                //String Newbalance = String.format("%.2f", newBalncee);
                //String Newbalance= String.valueOf(newBalncee);
                Assert.assertTrue(actualAmount.contains(amountt) && b.contains("Credit"));
                {
                    log.info("checking credit");
                    highlightUsingJs(credit_debit);
                    highlightUsingJs(newBalancee);
                    highlightUsingJs(actualAmountt);
                    highlightUsingJs(description);

                    //System.out.print(transactiondat+"  ");

                    WebElement transactcode = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[2]"));
                    WebElement bankaccountnumber = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[1]"));
                    WebElement valuedate = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[5]"));
                    WebElement postingdate = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[6]"));
                    WebElement transactiondeccription = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[3]"));
                    highlightUsingJs(transactcode);
                    highlightUsingJs(transactiondeccription);
                    highlightUsingJs(postingdate);
                    highlightUsingJs(bankaccountnumber);
                    highlightUsingJs(valuedate);
                    highlightUsingJs(transactiondeccription);
                    System.out.print(actualAmount + " ");
                    System.out.print(b);

                    System.out.println("  test pass  ");

                    log.info("credit narrative verified.");

                    break;
                }


            }
        }


    }}


