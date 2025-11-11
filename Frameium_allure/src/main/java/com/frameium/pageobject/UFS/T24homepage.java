package com.frameium.pageobject.UFS;

import com.frameium.genericfunctions.GenericFunctions;
import com.frameium.logger.LoggerHelper;
import com.frameium.resource.ResourceHelper;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Random;

public class T24homepage extends GenericFunctions {
    private final Logger log = LoggerHelper.getLogger(T24homepage.class);
    By Password = By.xpath("//*[@id='password']");
    By usernameeT24 = By.xpath("//*[@id='signOnName']");
    By loginbuttont24 = By.xpath("//*[@id='sign-in']");
    By authframe = By.xpath("//*[contains(@id,'banner')and contains(@name,'banner')]");
    By t24Page = By.xpath("//*[@id='pane_']/div[2]//descendant::input[@title='Command line for input text']");
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
    By dateinttrans = By.xpath("//*[@name='fieldName:DEBIT.VALUE.DATE']");
    By validatedeal = By.xpath("//*[contains(@title,'Validate a deal') and contains(@alt,'Validate a deal')]");
    By commitDeal = By.xpath("//*[contains(@title,'Commit the deal') and contains(@alt,'Commit the deal')]");
    By TxnComplete = By.xpath("//*[contains(@class,'message') and contains(text(),'Txn Complete')]");
    By iBview = By.xpath("//*[@id='pane_']/ul[10]/li/ul/li[20]/a");
    By generalenquiries = By.xpath("//*[text()='General Enquiries/Reports']");
    By accountNum = By.xpath("//label[text()='CustomerAcctNumber']//../../..//input[@type='text']");
    By processingdate = By.xpath("//label[text()='From Date']//../../..//input[@type='text']");
    By find = By.xpath("//*[@id='enqsel']/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table/tbody/tr/td[3]/div/table/tbody/tr/td/a");
    By balance = By.xpath("//table[@id='enquiryResponseData']//tbody/tr[last()]/td[8]");
    By DestinationAcntBsb = By.xpath("//*[contains(@id,'fieldName:DES.ACCT.BSB') and contains(@name,'fieldName:DES.ACCT.BSB')]");
    By Acceptoverrides = By.xpath("//*[text()='Accept Overrides']");
    By authrequired = By.xpath("//td[contains(text(),'Authorisation Required, Amount exceeds Limit - AUD 10000')]");
    WebElement successMsgObject;


    By Standingorder = By.xpath("//*[@alt='Standing Order']");
    By balancemainatananceSTO = By.xpath("//*[text()='Balance Maintenance STO ']");
    By MaintainMinimumbalance = By.xpath("//*[text()='Maintain Minimum Balance']");
    By MaintainMaximummumbalance = By.xpath("//*[text()='Maintain Maximum Balance']");
    By edit = By.xpath("//*[@id='goButton']/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr/td[1]/a/img");

    By balancemainatananceSTOFrame = By.xpath("//*[contains(@name,'FRAMETAB')]");
    By transactionnumber = By.xpath("(//*[(@id='dealtitle')]//following::*[@name='transactionId'])[1]");
    By Currency = By.xpath("//*[@name='fieldName:CURRENCY']");
    By StOAmount = By.xpath("//*[@id='fieldName:CURRENT.AMOUNT.BAL']");
    By businessday = By.xpath("//*[@id='rec:BusinessDay']");
    By nextdateSto = By.xpath("//*[@id='fqu:nextDate']");
    By frequencySTO = By.xpath("//*[@recurrencedropfieldname='fieldName:CURRENT.FREQUENCY']");

    By nextDayStocalendar = By.xpath("//*[@id='next_date']/p/img");

    By debitAccount = By.xpath("//*[@id='fieldName:CPTY.ACCT.NO']");

    By Payments = By.xpath("//*[text()='Payments']");
    By bpay = By.xpath("//*[text()='BPay']");
    By bpyaframe3 = By.xpath("//*[contains(@id,'FTENQUIRY')]");
    By bpayframe2 = By.xpath("//*[(@target='workarea')and contains(@id,'main')and contains(@name,'FTENQUIRY')]");
    By Bpayframe = By.xpath("//*[contains(@id,'workarea')and contains(@name,'FRAMETAB')]");

    By Bpaypayment = By.xpath("//*[text()='Periodic BPAY Payment']");


    By fieldMissing = By.xpath("//*[contains(@class,'captionError')and contains(text(),'INPUT MISSING')]");


    By txnComplete = By.xpath("//*[contains(@class,'message') and contains(text(),'Txn Complete')]");

    By notalloveerridesapprovedmsg = By.xpath("//*[contains(@class,'message') and contains(text(),'NOT ALL OVERRIDES APPROVED')]");
    ;

    By generalenquires = By.xpath("//*[text()='General Enquiries/Reports']");
    By ViewAccountEntries = By.xpath("//*[@href=\"javascript:doenq('ENQ UFS.STMT.ENT.BOOK.FINANCE');\"]");


    By accountentriesAccountnum = By.xpath("//label[text()='Account']//../../..//input[@type='text']");
    By accountentriesDate = By.xpath("//*[@id='value:2:1:1']");
    By date = By.xpath("//*[@id='enri_DEBIT.VALUE.DATE']");

    By acceptOverride = By.xpath("//*[@href='javascript:commitOverrides()']");

    By Overridemessage = By.xpath("//*[@class='overrideOn']");

    By t24Login = By.xpath("//*[@id='sign-in']");

    By operationsmenu = By.xpath("//*[contains(@alt,'Operations Menu')]");
    //	     @FindBy(xpath="//*[@href=\"javascript:commitOverrides()\"]")
//	    WebElement acceptoveride;
    By Acceptoveride = By.xpath("//*[@href='javascript:commitOverrides()']");
    //	    @FindBy(xpath="//*[@href=\"javascript:doenq('QUERY UFS.FT.10K.UNAUTH.TXN');\"]")
//	    WebElement unauthorisedfttransactions;
    By unauthorisedfttransactions = By.xpath("//*[@href=\"javascript:doenq('QUERY UFS.FT.10K.UNAUTH.TXN');\"]");

    //	    @FindBy(xpath="//*[contains(@id,'FRAMETAB')]")
//	    WebElement frametab;
    By frametab = By.xpath("//*[contains(@id,'FRAMETAB')]");

    //	    @FindBy(xpath="//*[@title='Sign off']")
//	    WebElement signoff;
    By signoff = By.xpath("//*[@title='Sign off']");
    //	    @FindBy(xpath="//*[contains(@id,'USER')and contains(@name,'USER')]")
//	    WebElement signoffFrame;
    By signoffFrame = By.xpath("//*[contains(@id,'USER')and contains(@name,'USER')]");
    //	    @FindBy(xpath="//*[contains(@id,'banner')and contains(@name,'banner')]")
//	    WebElement authframe;


    //	    @FindBy(xpath="//*[@class='today today_FUNDSTRANSFER today_FUNDSTRANSFER_BAASACTR']")
//		WebElement currentdate;

    By ibviewCalendar = By.xpath("//*[@id=\"selectiondisplay\"]/tbody/tr[2]/td[4]/a/img");
    By ibviewCurrentDate = By.xpath("//*[@class='today today_RMBETCIBTRANSLIST']");
    By ibviewCurrentDateRepayment = By.xpath("//*[@class='today today_UFSSTMTENTBOOKFINANCE']");

    By AccountEntriesViewCurrentDate = By.xpath("//*[@class='today today_UFSSTMTENTBOOKFINANCE']");

    //WebElement lastpage=driver.findElement

    By pageSearch = By.xpath("//*[@alt='Last Page']");
    //*[contains(@title,"Authorise") and contains(@src,"../plaf/images/default/enquiry/drilldown/txnauthorise.gif")]
    // authoriser
    By findAccount = By.xpath("//*[@href=\"javascript:docommand('COS AA.FIND.ARRANGEMENT.AR.UFS');\"]");
    By Findaccount = By.xpath("//*[text()='Find Account ']");
    By ownwer = By.xpath("//label[text()='Owner']//../../..//input[@type='text']");
    By Arrangementfield = By.xpath("//label[text()='Arrangement']//../../..//input[@type='text']");
    By findArrangement = By.xpath("//*[text()='Find']");
    By overview = By.xpath("//*[@alt='Overview']");
    By standingOrder = By.xpath("(//*[@class=\"enqdrilldowncell enqdrilldowncell_AAOVERVIEWSUBHEADINGSTO\"])[1]");
    //*[contains(@title,"Authorise") and contains(@src,"../plaf/images/default/enquiry/drilldown/txnauthorise.gif")]
    // authoriser
    By currentDatePeriodic = By.xpath("//*[@class=\"today today_STANDINGORDER today_STANDINGORDER_BAASINPUT\"]");
    By frequencyDrop = By.xpath("//*[@recurrencedropfieldname='fieldName:CURRENT.FREQUENCY']");
    By savePeriodic = By.xpath("//*[@title='Save']");
    By endDate = By.xpath("//*[@id='monthListfieldName:CURRENT.END.DATE']");
    By endDateSTO = By.xpath("//*[@id='monthListfqu:nextDate']");
    By periodicPaymentAmount = By.xpath("//*[@id='fieldName:CURRENT.AMOUNT.BAL']");
    By calenderPeriodicStart = By.xpath("//*[@calendardropfieldname=\"fieldName:START.DATE\"]");
    By calenderPeriodicEnd = By.xpath("//*[@calendardropfieldname=\"fieldName:CURRENT.END.DATE\"]");
    By DatePeriodic = By.xpath("//*[@id=\"calendar\"]/table/tbody/tr[5]/td[3]/a");
    By DateSTO = By.xpath("//*[@id='calendar']/table/tbody/tr[5]/td[4]/a");
    By STOTick = By.xpath("//*[@id=\"toolbar_icons\"]/table/tbody/tr/td[2]/a[1]");
    By acceptoverride = By.xpath("//*[text()='Accept Overrides']");
    By cancelOrder = By.xpath("(//*[@title=\"Cancel StandingOrder\"])[1]");
    By reversOrder = By.xpath("//*[@alt='Reverses a deal from the live file']");
    By DirectDebit = By.xpath("//*[text()='Direct Debit']");
    By futureFrequencyDD = By.xpath("//*[@recurrencedropfieldname='fieldName:FUTURE.FREQUENCY:1']");
    By customerno = By.xpath("//*[@id='fieldName:CUSTOMER.NO']");
    By DescriptionDD = By.xpath("//*[@id='fieldName:DESCRIPTION:1']");
    By DDTerminationDate = By.xpath("//*[@calendardropfieldname='fieldName:TERMINATION.DATE']");
    By CycleFrequency = By.xpath("//*[@recurrencedropfieldname='fieldName:CYCLE.FREQUENCY']");
    By DDstatus = By.xpath("//*[@id='fieldName:STATUS']");
    By DDAmount = By.xpath("//*[@id='fieldName:STAND.ALONE.AMT']");
    By DDFutureAmount = By.xpath("//*[@id='fieldName:FUTURE.AMOUNT:1']");
    By DDfutureEndDate = By.xpath("//*[@calendardropfieldname='fieldName:FUTURE.END.DATE:1']");
    By DDterminationDay = By.xpath("//*[@id='calendar']/table/tbody/tr[5]/td[5]");
    By DDterminationMonth = By.xpath("//*[@id='monthListfieldName:TERMINATION.DATE']");
    By FutureAmount = By.xpath("//*[@id='fieldName:FUTURE.AMOUNT:1']");
    By FutureEndDateMonth = By.xpath(("//*[@id='monthListfieldName:FUTURE.END.DATE:1']"));
    By FutureFreqCalandar = By.xpath("//*[@calendardropfieldname='fqu:nextDate']");
    By futureCalMonth = By.xpath("//*[@id='monthListfqu:nextDate']");
    By Productcreation = By.xpath("//*[@alt='Product Creation Menu']");

    By ProductCatalog = By.xpath("//*[text()='Product Catalogue ']");
    By callinvestment = By.xpath("//*[contains(@id,'treestop1_Catalog')]");
    public static By facilityaccounts = By.xpath("//*[contains(@id,'treestop5_Catalog')]");
    public static By funeralinvestments = By.xpath("//*[contains(@id,'treestop10_Catalog')]");
    public static By selfhelpinvestments = By.xpath("//*[contains(@id,'treestop12_Catalog')]");
    By simulate = By.xpath("(//*[text()='Simulate'])[2]");
    By NewAccountcustomernum = By.xpath("//*[@id='fieldName:CUSTOMER:1']");
    By EffectiveDate = By.xpath("//*[@id='fieldName:EFFECTIVE.DATE']");
    By tradeDate = By.xpath("//*[@id='disabled_TRADE.DATE']");
    By ArrangementNewCustomer = By.xpath("//*[@id='disabled_ARRANGEMENT']");
    By CustomernoNewValidate = By.xpath("(//*[@id='disabled_CUSTOMER:1'])[1]");
    By NewOffers = By.xpath("//*[text()='New Offers']");


    By arrangementoverviewNewLoan = By.xpath("(//*[@class='ENQ-H-ID ENQ-H-ID_AADETAILSARRANGEMENT'])[1]");
    By arrangementnewloan = By.xpath("//*[contains(@id,'r1_AcctDetails')]/td[2]");
    By ArrangementOverviewNewAccount = By.xpath("//*[contains(@id,'r1_AcctDetails')]/td[2]");
    By accountnumber = By.xpath("//*[contains(@id,'r1_AcctDetails')]/td[4]");
    By dateOverviewNewAccount = By.xpath("//*[contains(@id,'datadisplay_Activities')]/tbody/tr[1]/td[4]");
    By NewArrangementChurch = By.xpath("(//*[@alt='New Arrangement'])[1]");
    By NewArrangement = By.xpath("(//*[@alt='New Arrangement'])[2]");
    By NewArrangementAtcallInvestment = By.xpath("(//*[@alt='New Arrangement'])[1]");
    By NewArrangementHvolMinistersandStaff = By.xpath("(//*[@alt='New Arrangement'])[3]");
    public static By transactionmanagernew = By.xpath("(//*[@alt='New Arrangement'])[4]");
    public static By benefitfacilitynew = By.xpath("(//*[@alt='New Arrangement'])[5]");
    public static By givingdirect = By.xpath("(//*[@alt='New Arrangement'])[6]");
    public static By salesproceeds = By.xpath("(//*[@alt='New Arrangement'])[7]");
    public static By funeralinvestmentnew = By.xpath("(//*[@alt='New Arrangement'])[8]");
    public static By selfhelpsettlementchurchnew = By.xpath("(//*[@alt='New Arrangement'])[9]");
    public static By selfhelpsettlementindividualsnew = By.xpath("(//*[@alt='New Arrangement'])[10]");
    By productNewCustomer = By.xpath("(//*[@id='tab1']/tbody/tr[3]/td[3]/span)[1]");
    By productDeposit = By.xpath("//*[contains(@id,'datadisplay_Arrangement')]/tbody/tr[3]/td[2]");
    By productOverview = By.xpath("//*[contains(@id,'r3_AcctDetails')]/td[2]");
    By OverviewDate = By.xpath("//*[contains(@id,'r3_AcctDetails')]/td[4]");
    By overviewDteDeposit = By.xpath("//*[contains(@id,'datadisplay_Arrangement')]/tbody/tr[3]/td[4]");
    By overvieInterestrate = By.xpath("//*[contains(@id,'r2_Interest')]/td[3]");
    By DateDeposit = By.xpath("//*[contains(@id,'datadisplay_Arrangement')]/tbody/tr[3]/td[4]");
    By BeneficialOwnerDeposit = By.xpath("//*[contains(@id,'datadisplay_Arrangement')]/tbody/tr[5]/td[2]");
    By BeneficialOwner = By.xpath("//*[contains(@id,'r6_AcctDetails')]/td[2]");
    By overviewstatusDeposit = By.xpath("//*[contains(@id,'datadisplay_Arrangement')]/tbody/tr[5]/td[4]");
    By Overviewstatus = By.xpath("//*[contains(@id,'r5_AcctDetails')]/td[4]");
    By FixedTermNonchurch = By.xpath("//*[contains(@id,'treestop21_Catalog')]");
    By rolling31dayinvest = By.xpath("//*[contains(@id,'treestop25_Catalog')]");
    By unitingfixedtermInvestment = By.xpath("//*[contains(@id,'treestop28_Catalog')]");
    By unitingfixedtermInvestmentnew = By.xpath("(//*[@title='New Arrangement'])[37]");
    By selfhelpdetails = By.xpath("//*[text()='Self help details']");
    By schema = By.xpath("//input[(@id='fieldName:SCHEME.NUMBER')and(@class='dealbox dealbox_AAARRANGEMENTACTIVITY dealbox_AAARRANGEMENTACTIVITY_UFSAANEW')]");
    By anonympousno = By.xpath("//*[(@id='radio:tab3:UFS.ANONYMOUS')and(@value='NO')]");
    By FixedTermchurch = By.xpath("//*[contains(@id,'treestop19_Catalog')]");

    By fixedtermchurchnew = By.xpath("//*[contains(@id,'r19_Catalog')]/td[4]");
    By FTInonchurchAnnual = By.xpath("(//*[@title='New Arrangement'])[28]");
    By FTInonchurchMonthly = By.xpath("(//*[@title='New Arrangement'])[29]");
    By highervalues31daynew = By.xpath("(//*[@title='New Arrangement'])[34]");
    By rolling31dayinvestmentnew = By.xpath("(//*[@title='New Arrangement'])[35]");
    By FTISelfHelp = By.xpath("(//*[@title='New Arrangement'])[31]");
    By ChurchLoan = By.xpath("//*[contains(@id,'treestop30_Catalog')]");
    By housingloanbutton = By.xpath("//*[contains(@id,'treestop36_Catalog')]");
    By ministersandstaffloanbutton = By.xpath("//*[contains(@id,'treestop39_Catalog')]");
    By selfHelploanButton = By.xpath("//*[contains(@id,'treestop42_Catalog')]");

    By PersonalLoan = By.xpath("//*[contains(@id,'r40_Catalog')]/td[4]");
    By SelfhelploanLoannewArrangement = By.xpath("//*[contains(@id,'r42_Catalog')]/td[4]");
    By housingloanNewArrangement = By.xpath("//*[contains(@id,'r36_Catalog')]/td[4]");
    By RetirementhousingloanNewArrangement = By.xpath("//*[contains(@id,'r37_Catalog')]/td[4]");
    By carloan = By.xpath("//*[contains(@id,'r39_Catalog')]/td[4]");


    By churchloanArrangement = By.xpath("//*[contains(@id,'r31_Catalog')]/td[4]");
    By commercialLoan = By.xpath("(//*[text()='Commercial Loans'])[3]/child::a");
    By churchloann = By.xpath("//*[contains(@id,'treestop30_Catalog')]");
    By commercialloanArrangement = By.xpath("//*[contains(@id,'r34_Catalog')]/td[4]");
    //*[contains(@id,'r31_Catalog')]/td[4]/a/img
    By churchlloanArrangement = By.xpath("//*[contains(@id,'r31_Catalog')]/td[4]/a/img");
    By Limit = By.xpath("//*[@href='#legend_Limit']");
    By limitfield = By.xpath("//*[@id='fieldName:LIMIT.REFERENCE']");
    By limitserial = By.xpath("//*[@id='fieldName:LIMIT.SERIAL']");
    By loanInterest = By.xpath("//*[@href='#legend_Loan Interest']");
    By marginField = By.xpath("(//*[@id='fieldName:MARGIN.TYPE:1:1'])[1]");
    By statusarranmentnewaccount = By.xpath("//*[contains(@id,'r5_AcctDetails')]/td[4]");

    By marginOper = By.xpath("(//*[@id='fieldName:MARGIN.OPER:1:1'])[1]");
    By operand = By.xpath("(//*[@id='fieldName:MARGIN.OPER:1:1'])[2]");
    By marginRate = By.xpath("(//*[@id='fieldName:MARGIN.RATE:1:1'])[2]");
    By marginRateloan = By.xpath("(//*[@id='fieldName:MARGIN.RATE:1:1'])[1]");
    By Account = By.xpath("//*[@href='#legend_Account']");

    By unusedLimitFee = By.xpath("//a[text()='Unused Limit fee']");
    By Linefee = By.xpath("//a[text()='Line Fee']");
    By Rate = By.xpath("(//*[(@id='fieldName:CHARGE.RATE:1')and(@name='fieldName:CHARGE.RATE:1')and(@tabname='tab1')])[1]");
    By rateLinefee = By.xpath("(//*[(@id='fieldName:CHARGE.RATE:1')and(@tabname='tab1')])[2]");
    By scheduletab = By.xpath("//*[contains(@id,'r1_AdditionalDetailsEnquir')]/td[7]");
    By scehhedule = By.xpath("//*[@href='#legend_Schedule']");
    By plus = By.xpath("//*[@id='tab1']/tbody/tr[2]/td[1]/a/img");
    By type = By.xpath("//*[@name='fieldName:PAYMENT.TYPE:1']");
    By type2 = By.xpath("//*[@id='fieldName:PAYMENT.TYPE:2']");
    By freqDrop = By.xpath("//*[(@onkeypress='dropRecurrence(event);')and(@recurrencedropfieldname='fieldName:PAYMENT.FREQ:1')]");
    By everydays = By.xpath("//*[@id='D:days']");
    By freq2 = By.xpath("//*[(@onkeypress='dropRecurrence(event);')and(@recurrencedropfieldname='fieldName:PAYMENT.FREQ:2')]");
    By daily = By.xpath("//*[@id='frequency:D']");
    By additional2 = By.xpath("//*[contains(@id,'r1_ConditionsSubHeading')]/td[3]");
    By additional = By.xpath("//*[text()='Additional']");
    By refresh = By.xpath("//*[contains(@id,'r23_Charge')]/td[5]");
    By refreshLinefee = By.xpath("//*[contains(@id,'r25_Charge')]/td[5]");
    //*[@enquiryfield='EB.MANDATE'])[1]
    By unuLimFee = By.xpath("//*[contains(@id,'r24_Charge')]/td[3]");

    By linefee = By.xpath("//*[contains(@id,'r26_Charge')]/td[3]");

    By bills = By.xpath("//*[contains(@id,'r1_AdditionalDetailsEnqui')]/td[3]");
    By recordDrpdwn = By.xpath("(//*[@enquiryfield='EB.MANDATE'])[1]");
    By bill = By.xpath("//*[contains(@id,'r2_Due')]/td[3]");
    By recordFieldname = By.xpath("//*[@id='fieldName:MANDATE.RECORD:1']");
    //By record=By.xpath("(//*[@mvapplication='EB.MANDATE'])[1]");
    By record = By.xpath("//*[@id='fieldName:MANDATE.RECORD:1']");

    By fixedfloating = By.xpath("//*[text()='Fixed/Floating/Linked']");
    By periodic = By.xpath("//*[text()='Periodic']");
    By period = By.xpath("//*[@id='fieldName:PERIODIC.PERIOD:1']");
    By commitment = By.xpath("//*[@href='#legend_Commitment']");
    By Amount = By.xpath("//*[@id='fieldName:AMOUNT']");
    By ddBaasOrder = By.xpath("//*[@class=iddisplay iddisplay_DDDDI iddisplay_DDDDI_STANDALONEBAAS']");
    By DDbaasInput = By.xpath("//*[@class='iddisplay iddisplay_DDDDI iddisplay_DDDDI_STANDALONEBAAS']");
    By stndngorderBaasInput = By.xpath("//*[@class='iddisplay iddisplay_STANDINGORDER iddisplay_STANDINGORDER_BAASINPUT']");
    By settlement = By.xpath("//*[@href='#legend_Settlement']");
    By payout = By.xpath("//*[@id='fieldName:PAYOUT.ACCOUNT:1:1']");
    By accountCreditactivity = By.xpath("//*[@id='fieldName:PAYOUT.ACTIVITY:1:1']");
    By activittyy = By.xpath("//*[(@class='dropdown_button dropdown_button_AAARRANGEMENTACTIVITY dropdown_button_AAARRANGEMENTACTIVITY_UFSAANEW')and(@mvapplication='AA.ACTIVITY')and(@dropfield='fieldName:PAYIN.ACTIVITY:1:1')]");
    By advancedpayout = By.xpath("//*[text()='Advanced - Pay Out']");
    By rollover = By.xpath("//*[@href='#legend_Rollover']");
    By renewalperiod = By.xpath("//*[@id='fieldName:CHANGE.PERIOD']");
    By rate = By.xpath("//*[@id='fieldName:PERIODIC.RATE:1']");
    By depositrate = By.xpath("//*[@href='#legend_Deposit Interest']");
    By finddeposit = By.xpath("//*[text()='Find Deposit ']");
    By txtouterFrame = By.xpath("//*[contains(@id,'FRAMETAB')]");
    By txtouterFrame1 = By.xpath("//*[contains(@id,'workarea')]");
    By txtouterFrame2 = By.xpath("//*[contains(@id,'NAME')]");
    By Term = By.xpath("//*[@id='fieldName:TERM']");
    By findloan = By.xpath("//*[text()='Find Loan ']");
    By authorised = By.xpath("//*[text()='Authorised']");
    By closed = By.xpath("//*[text()='Matured / Closed']");
    By unauthorised = By.xpath("//*[text()='Unauthorised']");
    By authLoanDropdown = By.xpath("//*[contains(@id,'drillbox:1_1_Pending')]");
    By authapprovetick = By.xpath("//*[@alt='Select Drilldown']");
    By authorisedeal = By.xpath("//*[@alt='Authorises a deal']");
    By AuthSignoff = By.xpath("//*[contains(@id,'banner')]");
    By fromDateibview = By.xpath("//label[text()='From Date']//../../..//input[@type='text']");
    By performclosure = By.xpath("//*[contains(@id,'r1_SettlePayoff')]/td[2]");
    By payoutClosure = By.xpath("//*[text()='Advanced - Pay Out']");
    By activeClosure = By.xpath("(//*[@name='fieldName:PAYOUT.SETTLEMENT:1'])[2]");
    By activeDeposit = By.xpath("//*[@name='fieldName:PAYOUT.SETTLEMENT:1']");
    By depositclosureActive = By.xpath("//*[@id='fieldName:PAYOUT.ACCOUNT:1:1']");
    By payoutAccount = By.xpath("(//*[@id='fieldName:PAYOUT.ACCOUNT:1:1'])[2]");
    //By fromDateibview=By.xpath("//*[@id='selectiondisplay']/tbody/tr[2]/td[3]");
    By MultipleChequeDeposit = By.xpath("//*[@alt='Multiple Cheque Deposit']");
    By DepositMultipleCheques = By.xpath("//*[text()='Deposit Multiple Cheque ']");
    By creditInvestmentnumber = By.xpath("//*[@id='fieldName:CREDIT.ACCT.NO']");
    By chequeDepositAmount = By.xpath("//*[@id='fieldName:L.CHQ.AMT:1']");
    By chequeDepositAmountTwo = By.xpath("//*[@id='fieldName:L.CHQ.AMT:2']");
    By chequeTotal = By.xpath("//*[@id='fieldName:DEBIT.AMOUNT']");
    By chequeno = By.xpath("//*[@id='fieldName:L.CHQ.NO:1']");
    By Bsbno = By.xpath("//*[@name='fieldName:L.CHQ.BSB:1']");
    By expandCheque = By.xpath("//*[@alt='Expand Sub Value']");
    By chequeno2 = By.xpath("//*[@id='fieldName:L.CHQ.NO:2']");
    By Bsb2 = By.xpath("//*[@id='fieldName:L.CHQ.BSB:2']");
    By partialwithdrawal = By.xpath("//*[contains(@id,'r1_PartialWithdrawal')]/td[2]");
    By partialwithdrawalamount = By.xpath("//*[@id='fieldName:TXN.AMOUNT']");
    By withdrawalDetails = By.xpath("//*[@alt='Withdrawal Details']");
    By withDrawalstatement = By.xpath("(//*[@title='Withdrawal Statement'])[1]");
    By Withdrawaldate = By.xpath("//*[@id='enri_EFFECTIVE.DATE']");
    By repayingdate = By.xpath("//*[@id='enri_DEBIT.VALUE.DATE']");
    By withdrawalFrame = By.xpath("//*[contains(@id,'WithdrawalList')]");
    By provceedWithdrawal = By.xpath("//*[@title='Proceed Withdrawal']");
    By proceedWithdrawelFrame = By.xpath("//*[contains(@id,'WithdrawalStatementDrill')]");
    By proceedWithdrawDate = By.xpath("//*[@id='datadisplay']/tbody/tr[9]/td[1]");
    By proceedWithdrawAmount = By.xpath("//*[@id='datadisplay']/tbody/tr[9]/td[2]");
    By versionFrame = By.xpath("//frame[contains(@id,'Version')]");
    By redeemDeposit = By.xpath("(//*[@title='Run'])[1]");
    By closurereason = By.xpath("//*[@name='fieldName:CLOSURE.REASON']");
    By redemptionstatement = By.xpath("//*[@alt='View Statement']");
    By redemptionlistFrame = By.xpath("//*[contains(@id,'RedeemList')]");
    By redeemDepositlist = By.xpath("//a[@title='Redeem Deposit']");
    By redeemstatementFrame = By.xpath("//*[contains(@id,'RedeemStatementDrill')]");
    By simulationmsg = By.xpath("//*[text()='Completed - Successfully']");
    By simulationmsgLoan = By.xpath("//*[text()='Executed - Successfully']");
    By payments = By.xpath("//*[text()='Payments']");
    By Repayment = By.xpath("//*[text()='Repayment']");
    By calendarRepay = By.xpath("//*[@calendardropfieldname='fieldName:DEBIT.VALUE.DATE']");
    By currentdateRepay = By.xpath("//*[@class='today today_FUNDSTRANSFER today_FUNDSTRANSFER_RMBAAACRP']");
    By currentdatedesbursement = By.xpath("//*[@class='today today_FUNDSTRANSFER today_FUNDSTRANSFER_RMBAAACDIUFS']");
    By Schedule = By.xpath("//*[contains(@id,'r1_AdditionalDetailsEnquiry')]/td[7]");
    By ScheduleDeposit = By.xpath("//*[@id=\"topPart\"]/div[10]");

    By methodd = By.xpath("//*[@id='fieldName:PAYMENT.METHOD:1']");
    By maturityDate = By.xpath("//*[contains(@id,'r9_AccountDates')]/td[2]");
    By accountnum = By.xpath("(//*[@class='ENQ-H-ID ENQ-H-ID_AADETAILSARRANGEMENT'])[2]");
    By txncontactidrepayment = By.xpath("(//*[@id='tab1']/tbody/tr[11]/td[3]/span)[1]");
    By effectivedaterepaymententries = By.xpath("(//*[@id='tab1']/tbody/tr[3]/td[3]/span)[1]");
    By totalAmountdue = By.xpath("//*[contains(@id,'r3_FinancialSummary')]/td[2]");
    By outstandingamount = By.xpath("//*[contains(@id,'r2_Limit')]/td[5]");
    By totalamountoutstandiung = By.xpath("//*[contains(@id,'r2_Limit')]/td[5]");
    By amountrepaymententries = By.xpath("(//*[@id='tab1']/tbody/tr[16]/td[3]/span)[1]");
    By arrangemententriesrepayment = By.xpath("(//*[@id='tab1']/tbody/tr[1]/td[3]/span)[1]");
    By repaymentdateentries = By.xpath("(//*[@id='tab1']/tbody/tr[3]/td[3]/span)[1]");
    By desbursement = By.xpath("//*[text()='Disbursement']");
    By requestpayoff = By.xpath("//*[contains(@id,'r1_RequestPayoff')]/td[2]");
    By payoffStatement = By.xpath("//*[contains(@id,'r1_PayoffStatement')]/td[3]");
    By payoffStatementAmount = By.xpath("//*[contains(@id,'r2_PayoffTotal')]/td[3]");
    By loanPayoff = By.xpath("//*[text()='Loan Payoff']");
    By currentDateloanpayyoff = By.xpath("//*[@class='today today_FUNDSTRANSFER today_FUNDSTRANSFER_RMBACPOAA']");
    By adjustbalances = By.xpath("//*[@id='r28']/td[3]");
    By newBalanceAmount = By.xpath("//*[@id='fieldName:NEW.BAL.AMT:1:1']");
    By newActivity = By.xpath("//*[text()='New Activity']");
    By accountnumOverview = By.xpath("//*[contains(@id,'r1_Arrangement')]/td[4]");
    By Autorisationrequired = By.xpath("//*[@id='OVE1']");
    By closedloan = By.xpath("//*[text()='Matured / Closed']");
    By closeddeposit = By.xpath("//*[text()='Matured / Closed']");
    By closedaccount = By.xpath("//*[text()='Matured / Closed']");
    By newaccounrarrangement = By.xpath("//*[contains(@id,'r1_AcctDetails')]/td[2]");
    By periodicpaymentDate = By.xpath("//*[@id='enri_START.DATE']");
    By dddate = By.xpath("//*[@id='enri_FUTURE.FREQUENCY:1']");


    By clientcreationmenu = By.xpath("//*[@alt='Client Creation Menu']");
    By newindividualcustomer = By.xpath("//*[text()='New Individual Customer ']");
    By newCorporatecustomer = By.xpath("//*[text()='New Corporate Customer ']");
    By clientname = By.xpath("//*[@id='fieldName:NAME.GIVEN']");
    By synodCorporateClientname = By.xpath("//*[@id='fieldName:ORG.NAME']");
    By shortname = By.xpath("//*[@id='fieldName:SHORT.NAME:1']");
    By dateofbirth = By.xpath("//*[@id='fieldName:DATE.OF.BIRTH']");
    By monthclient = By.xpath("//*[@name='monthListfieldName:DATE.OF.BIRTH']");
    By calandarclient = By.xpath("//*[@calendardropfieldname='fieldName:DATE.OF.BIRTH']");
    By yearClient = By.xpath("//*[@name='yearListfieldName:DATE.OF.BIRTH']");
    By customerstatus = By.xpath("//*[@id='fieldName:CUSTOMER.STATUS']");
    By residence = By.xpath("//*[@name='fieldName:RESIDENCE']");
    By gendermale = By.xpath("//*[@name='radio:mainTab:GENDER' and @value='MALE' ]");
    By sector = By.xpath("//*[@id='fieldName:SECTOR']");
    By accountofficer = By.xpath("//*[@id='fieldName:ACCOUNT.OFFICER']");
    By addressType = By.xpath("//*[@name='fieldName:ADD.TYPE:1']");
    By addresstype = By.xpath("(//*[@dropfield='fieldName:ADD.TYPE:1'])[1]");
    By address1 = By.xpath("//*[@id='fieldName:ADD.LINE.1:1']");
    By clientcity = By.xpath("//*[@id='fieldName:ADD.LOCALITY:1']");
    By state = By.xpath("//*[@id='fieldName:ADD.STATE:1']");
    By postcode = By.xpath("//*[@id='fieldName:ADD.POSTCODE:1']");
    By clientnumber = By.xpath("//*[@name='txtCLNO']");
    By retrieve = By.xpath("//*[@value='Retrieve']");
    By title = By.xpath("//*[@id='fieldName:NAME.TITLE']");
    By usernameIBM = By.xpath("//*[@name='txtUsername']");
    By passwordIbm = By.xpath("//*[@id='txtPassword']");
    By OkIbm = By.xpath("//*[@id='cmdLogin']");
    By registerclient = By.xpath("//*[@id='btnRegisterClient']");
    By register = By.xpath("//*[@id='cmdSave']");

    By succesmsg = By.xpath("//*[@id='lblMsg']");
    By enableaccess = By.xpath("//*[@id='cmdRegdEnable']");
    By resetpassword = By.xpath("//*[@id='cmdRegdResetPwd']");
    By clientnumberfield = By.xpath("//*[@id='txtCustomerNo']");
    By temporarypassword = By.xpath("//*[@id='lblPwdPassword']");
    By Retrieve = By.xpath("//*[@id='cmdRetrieve']");
    By subsriberid = By.xpath("//*[@id='txtUsername']");
    By clientMaintanance = By.xpath("//*[@id='btnClientMaintenance']");
    By Subscriberidfieldname = By.xpath("//*[@id='txtCLNO']");
    By oldpassword = By.xpath("//*[@name='C1__WORKINGELEMENTS[1].CONTACTDETAILSGROUP[1].SECURITYDETAILS[1].PASSWORD']");
    By newpassword = By.xpath("//*[@name='C1__WORKINGELEMENTS[1].CONTACTDETAILSGROUP[1].SECURITYDETAILS[1].NEWPASSWORD']");
    By confirmpassword = By.xpath("//*[@name='C1__WORKINGELEMENTS[1].CONTACTDETAILSGROUP[1].SECURITYDETAILS[1].CONFIRMPASSWORD']");
    By continuebutton = By.xpath("//button[text()='Continue']");
    By successmsgPwdrst = By.xpath("//*[contains(@id,'C1__HEAD_A')]");
    By Accountlinktable = By.xpath("//*[span='Account Link Table']");
    By frequencydropdown = By.xpath("//*[@frequencydropfieldname='fieldName:FREQUENCY']");
    By accounttomaintain = By.xpath("//*[@id='fieldName:ACCOUNT.TO:1']");
    By amounttomaintain = By.xpath("//*[@id='fieldName:MINIMUM.AMT:1']");
    By fromaccount = By.xpath("//*[@id='fieldName:ACCOUNT.FROM:1']");
    By sweepmaintenance = By.xpath("//*[@alt='Sweep Maintainance']");
    By sweepmaintenancesweep = By.xpath("//*[text()='Setup Maintenance Sweep ']");
    By description = By.xpath("//*[@id='fieldName:DESCRIPTION']");
    By businessdayfreq = By.xpath("//*[@id='fqu:BusinessDay']");
    By dailyfreq = By.xpath("//*[@id='fqu:frequency:D']");
    By save = By.xpath("//*[@alt='Save']");
    By Billtype = By.xpath("//*[@name='fieldName:BILL.TYPE:1']");
    By Billtype2 = By.xpath("//*[@name='fieldName:BILL.TYPE:2']");
    By method = By.xpath("//*[@id='fieldName:PAYMENT.METHOD:1']");
    By method2 = By.xpath("//*[@id='fieldName:PAYMENT.METHOD:2']");
    By property1 = By.xpath("//*[@name='fieldName:PROPERTY:1:1']");
    By propertyadd = By.xpath("//*[@id='fieldName:PROPERTY:1:2']");
    By property2 = By.xpath("//*[@name='fieldName:PROPERTY:2:1']");
    By surplussweep = By.xpath("//*[text()='Setup Surplus Sweep ']");
    By surplusfromAcnt = By.xpath("//*[@id='fieldName:ACCOUNT.TO:1']");
    By ThresholdAmount = By.xpath("//*[@id='fieldName:MAXIMUM.AMT:1']");
    By toaccount = By.xpath("[@id='fieldName:ACCOUNT.FROM:1']");
    By surplustwowayToAcnt = By.xpath("//*[@id='fieldName:ACCOUNT.TO:1']");
    By amounttomaintainTwoway = By.xpath("//*[@id='fieldName:MINIMUM.AMT:1']");
    By Thresholdamounttoway = By.xpath("//*[@id='fieldName:MAXIMUM.AMT:1']");
    By fromAcntTwoway = By.xpath("//*[@id='fieldName:ACCOUNT.FROM:1']");
    By reversweep = By.xpath("//*[@title='Reverse']");
    By reverstandingOrder = By.xpath("//*[@alt='Cancel StandingOrder']");
    By confirmreverse = By.xpath("//*[@alt='Reverses a deal from the live file']");
    //*[@alt='Cancel StandingOrder']
    By cancelStandingOrder = By.xpath("//*[@alt='Cancel StandingOrder']");
    //*[@id='fqu:frequency:D']
    By surplustwowaySweep = By.xpath("//*[text()='Setup Two Way Sweep ']");
    By sweeptype = By.xpath("//*[text()='Maintain Min Balance']");
    By TransferOutSurplus = By.xpath("//*[text()='Transfer Out Surplus']");
    By sweepfromaccpont = By.xpath("//*[contains(@id,'r1_Sweep')]/td[2]");
    By sweeptoaccount = By.xpath("//*[contains(@id,'r1_Sweep')]/td[3]");
    By minamt = By.xpath("//*[contains(@id,'r1_Sweep')]/td[4]");
    By maxamt = By.xpath("//*[contains(@id,'r1_Sweep')]/td[5]");
    By freqsweep = By.xpath("//*[contains(@id,'r1_Sweep')]/td[6]");
    By balanceAvailable = By.xpath("//*[contains(@id,'r2_Balances')]/td[5]");
    By calandersweep = By.xpath("(//*[@calendardropfieldname='fqu:nextDate'])[1]");
    //*[@calendardropfieldname="fqu:nextDate"]
    By currentdateBalMaintenance = By.xpath("//*[@class='today today_ACACCOUNTLINK today_ACACCOUNTLINK_UFS']");
    By currentdateSweep = By.xpath("//*[@class='today today_ACACCOUNTLINK today_ACACCOUNTLINK_SURPUFS']");
    By currentdateTwowaySweep = By.xpath("//*[@class='today today_ACACCOUNTLINK today_ACACCOUNTLINK_TWOWAYUFS']");
    By clearselection = By.xpath("//*[text()='Clear Selection']");
    By SweepType = By.xpath("//*[contains(@id,'r1_Sweep')]/td[1]");
    By endyearDt = By.xpath("//*[@id='yearListfieldName:CURRENT.END.DATE']");
    By endyearDD = By.xpath("//*[@id='yearListfieldName:TERMINATION.DATE']");
    By futureFreqyearDD = By.xpath("//*[@id='yearListfqu:nextDate']");
    //By futureTerYear=By.xpath("//*[@id='yearListfieldName:FUTURE.END.DATE:1']");

    By futureTerYear = By.xpath("//*[@id='yearListfieldName:FUTURE.END.DATE:1']");
    By STOfutureTerYear = By.xpath("//*[@id='yearListfqu:nextDate']");
    By periodicfutureTerYear = By.xpath("//*[@id='yearListfieldName:CURRENT.END.DATE']");
    //By STOfutureTerYear =By.xpath("//*[@id='yearListfqu:nextDate']");
    //*[contains(@id,'treestart5_Catalog')]

    By facilityAccounts = By.xpath("//*[contains(@id,'treestop5_Catalog')]");

    By transactionmanager = By.xpath("//*[contains(@id,'r5_Catalog')]/td[4]");

    By beneficiaryId = By.xpath("//*[@id='fieldName:LINK.ACCT']");
    By Sourceaccountno = By.xpath("//*[@id='fieldName:SRC.ACCT.NO']");
    By arrangement = By.xpath("//*[@id='disabled_ARRANGEMENT']");
    By nextpage = By.xpath("//a[@title='Next Page']");

    By frequencyrecurringPay = By.xpath("(//span[text()='Frequency']//following::span[contains(@id,'C1__QUE')])[1]");
    By lessbalance = By.xpath("//*[contains(text(),'Entered value is lesser than minimum negotiation value')]");

    By txtibManagerReporting = By.xpath("//*[@id='btnRepoting']");
    By txtibMreportType = By.xpath("//*[@id='ddlType']");
    By txtibMStartDate = By.xpath("//*[@id='txtStartDate']");
    By txtibMEndDate = By.xpath("//*[@id='txtEndDate']");
    By txtibMRetrieve = By.xpath("//*[@id='cmdRetrieve']");
    By txtibMstartDate = By.xpath("//*[@id='BatchList1_txtStartDate']");
    By txtibMclient = By.xpath("//*[@id='BatchList1_txtClientNumber']");

    By txtibMendDate = By.xpath("//*[@id='BatchList1_txtEndDate']");
    By txtStatus = By.xpath("//*[@id='BatchList1_drpBatchStatus']");
    By btnRetrieve = By.xpath("//*[@id='BatchList1_btnSearchAll']");
    By btnPlus = By.xpath("//*[@id='BatchList1_gvBatchList']/tbody/tr[2]/td[1]/img");
    By btnLogoutIBM = By.xpath("//*[@id='cmdLogout']");
    By loanpayoffaprove = By.xpath("//*[@alt='Select Drilldown']");
    By authorisedeall = By.xpath("//*[@alt='Authorises a deal']");
    By dropdowncobcheckdate = By.xpath("//A[@title='Dropdown List']");
    By RegistrerClient=By.xpath("//*[@title='Register Client']");
    By retrieveClientNumber=By.xpath("//*[@id='txtCLNO']");
    By retrivebtn=By.xpath("//*[@value='Retrieve']");
    By regristeredmsg=By.xpath("//*[text()='This member is already registered.']");
    public static String Accountbalance;
    public static String TransactionID;
    public static String transAmount;
    public static String INTtransCreditDescription;
    public static String IntTransCreditAcntBalance;
    public static String TransDebitdesciption;
    public static String transferdate;

    public void T24Login(String username, String password) throws Exception {
        log.info("--- Point on username ------");
        WebElement usernamee = findElement(usernameeT24);
        actions(usernamee);
        usernamee.clear();
        usernamee.sendKeys(username);
        log.info("entered username");
        WebElement passwordT24 = findElement(Password);
        actions(passwordT24);
        passwordT24.clear();
        passwordT24.clear();
        passwordT24.sendKeys(password);
        log.info("entered username");
        WebElement loginButtonT24 = findElement(loginbuttont24);

        actions(loginButtonT24);
        log.info("Clicked login button");

    }

    public void T24EnterCredentials(String username, String password) throws Exception {
        log.info("--- Point on username ------");
        WebElement usernamee = findElement(usernameeT24);
        actions(usernamee);
        usernamee.clear();
        usernamee.sendKeys(username);
        log.info("entered username");
        WebElement passwordT24 = findElement(Password);
        actions(passwordT24);
        passwordT24.clear();
        passwordT24.clear();
        passwordT24.sendKeys(password);


    }

    public void clickLogin() throws Exception {
        WebElement loginButtonT24 = findElement(loginbuttont24);
        actions(loginButtonT24);
        log.info("Clicked login button");
        Thread.sleep(2000);
    }
        public void verifylogin(){
        List<WebElement>msg = findElements(By.xpath("//*[text()='Please check your Login Credential and/or access rights']"));
        //*[text()='Please check your Login Credential and/or access rights']
        if(msg.size()>0){
            Assert.fail("login not success");

        }
        WebElement Authframe = findElement(authframe);

}
    public void zoomout(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='0.8';");
    }


    public void commandline() throws Exception {
        WebElement Authframe = findElement(authframe);
        switchToFrame(Authframe);
        WebElement T24PageCommand = findElement(t24Page);
        log.info("Sign in successful");
        T24PageCommand.clear();
        T24PageCommand.sendKeys("COS UFS.RB.ORIGINATION");
        WebElement T24Tickcommandline = findElement(t24Tick);
        //T24Tickcommandline.click();
        actions(T24Tickcommandline);
        switchwindows();
        windowMaximize();

    }
    public void commandlinedates() throws Exception {
        WebElement Authframe = findElement(authframe);
        switchToFrame(Authframe);
        WebElement T24PageCommand = findElement(t24Page);
        log.info("Sign in successful");
        T24PageCommand.clear();
        T24PageCommand.sendKeys("DATES,");
    }
        public void clickTick() throws Exception {
        WebElement T24Tickcommandline = findElement(t24Tick);
        //T24Tickcommandline.click();
        actions(T24Tickcommandline);
        switchwindows();
        windowMaximize();

    }

    public void AccounttransferClick() throws Exception {
        Thread.sleep(500);
        switchToDefault();
        WebElement innerFrame = findElement(innerframe);
        switchToFrame(innerFrame);
        WebElement transactionprocessing = findElement(transactionProcessing);
        log.info("Click on transactionprocessing button....");
        log.info("Click on transactionprocessing button....");
        actions(transactionprocessing);
        //transactionprocessing.click();
        log.info("click on payment suite");
        WebElement paymentSuite = findElement(PaymentSuitee);
        paymentSuite.click();
        switchToDefault();
        WebElement creaatepaymentFrame = findElement(creaatepaymentframe);
        switchToFrame(creaatepaymentFrame);
        WebElement createinnerFrame = findElement(createinnerframe);
        switchToFrame(createinnerFrame);
        WebElement createPayment = findElement(createpayment);
        log.info("clicked on Create payment");
        createPayment.click();
        log.info("click on createpayment ");
        switchToDefault();
        switchToFrame(creaatepaymentFrame);
        WebElement AccountTransferFrame = findElement(Accounttransferframe);
        switchToFrame(AccountTransferFrame);
        WebElement AccountTransfer = findElement(Accounttransfer);
        log.info("clicked on AccountTransfer");
        AccountTransfer.click();
    }

    public void setProperty(String key, String value) throws IOException {
        String filePath = ResourceHelper.getResourcePath("src/main/resources/configFiles/DataSheet");
        FileOutputStream out = new FileOutputStream(filePath, true);
        FileInputStream in = new FileInputStream(filePath);
        //Properties props = new Properties();
        Properties props = new Properties();
        props.load(in);
        in.close();
        props.setProperty(key, value);
        props.store(out, null);
        out.close();
    }

    public String getPropertyy(String key) throws IOException {
        String filePath = ResourceHelper.getResourcePath("src/main/resources/configFiles/DataSheet");
        InputStream is = null;
        String value = null;
        Properties prop = new Properties();

        try {
            is = new FileInputStream(filePath);
            prop.load(is);
            value = prop.getProperty(key);
            System.out.println(value);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
            }
            return value;
        }
    }


    public String getRandomNumberString(String prefix) {
        Random rnd = new Random();
        return prefix + String.valueOf(rnd.nextInt((9999 - 1000)) + 1000);
    }

    public String getRandomNumberStringTwodigit() {
        Random rnd = new Random();
        return String.valueOf(rnd.nextInt((99 - 10)) + 10);
    }

    public void sourceAcountDetails(String accountnumber, String SourceDesciption) throws InterruptedException, IOException {
        WebElement sourceacntBSB = findElement(sourceAcntBSB);
        sourceacntBSB.click();
        WebElement sourceAcntNumber1 = findElement(sourceAcntnumber);
        sourceAcntNumber1.clear();
        WebElement sourceAcntNumber = findElement(sourceAcntnumber);
        log.info("entering source account number");
        log.info("entering source account number");
        sourceAcntNumber.sendKeys(accountnumber);
        highlightUsingJs(sourceAcntNumber);
        WebElement SourceAccoutName = findElement(sourceAcntname);
        SourceAccoutName.click();
        T24homepage home = new T24homepage();
        String InternTransDebitdesciption = "";
        String IntTransDebitdesciption = home.getRandomNumberString(SourceDesciption);
        WebElement Description = findElementClickable(Descriptiion);
        TransDebitdesciption = IntTransDebitdesciption;
        Description.click();
        Description.sendKeys(IntTransDebitdesciption);
        setProperty("InternalTransDebitDescription", IntTransDebitdesciption);
    }


    public void DestinationAcountDetails(String accountnumber, String destinationDesciption, String amount) throws IOException {
//		WebElement destinationAcntBsb=driver.findElement(DestinationAcntBsb);
//		destinationAcntBsb.sendKeys(bsb);
        WebElement destinationAcntNo = findElement(DestinationAcntno);

        log.info("Entering destination account number");
        destinationAcntNo.sendKeys(accountnumber);
        WebElement DestinationName = findElement(destinationName);
        DestinationName.click();
        WebElement destinationAcntNum = findElement(DestinationAcntno);
        highlightUsingJs(destinationAcntNum);
        WebElement DestinationDescription = findElementClickable(destinationDescription);
        DestinationDescription.click();
        String destinationDesciptionn = getRandomNumberString(destinationDesciption);
        DestinationDescription.sendKeys(destinationDesciptionn);
        INTtransCreditDescription = destinationDesciptionn;
        WebElement Signatory = findElement(signatory);
        WebElement Amountfield = findElement(amountfield);
        Amountfield.click();
        log.info("Entering amount");
        transAmount = amount;
        setProperty("internaltransferAmount", amount);

        Amountfield.sendKeys(amount);
        clickElementUsingJavaScript(Amountfield);
        WebElement Calender = findElement(calender);
        Calender.click();
        WebElement Currentdate = findElement(currentdate);
        Currentdate.click();
        WebElement datefield = findElement(dateinttrans);
        String date = datefield.getAttribute("value");
        T24homepage t24 = new T24homepage();
        t24.setProperty("inttransdate", date);
        setProperty("InternalTranscreditDescription", INTtransCreditDescription);
        transferdate = date;
    }

    public void externalDestinationAcountDetails(String bsb, String accountnumber, String destinationname2, String destinationDesciption, String signator, String amount) throws IOException {
        WebElement destinationAcntBsb = findElement(DestinationAcntBsb);
        destinationAcntBsb.sendKeys(bsb);

        WebElement destinationAcntNo = findElement(DestinationAcntno);
        log.info("Entering destination account number");
        log.info("Entering destination account number");
        destinationAcntNo.sendKeys(accountnumber);
        WebElement DestinationName = findElement(destinationName);
        DestinationName.click();
        WebElement DestinationName1 = findElement(destinationName);
        DestinationName1.clear();
        WebElement DestinationName2 = findElement(destinationName);
        DestinationName2.sendKeys(destinationname2);
        WebElement DestinationDescription = findElement(destinationDescription);
        DestinationDescription.click();
        DestinationDescription.sendKeys(destinationDesciption);
        WebElement Signatory = findElement(signatory);
        Signatory.sendKeys(signator);
        WebElement Amountfield = findElement(amountfield);
        Amountfield.click();
        log.info("Entering amount");
        Amountfield.sendKeys(amount);

        setProperty("ExttransAmount", amount);
        WebElement Calender = findElement(calender);
        Calender.click();
        WebElement Currentdate = findElement(currentdate);
        Currentdate.click();
        WebElement datefield = findElement(dateinttrans);
        String date = datefield.getAttribute("value");
        T24homepage t24 = new T24homepage();
        transferdate = date;
        t24.setProperty("exttransdate", date);
        transAmount = Amountfield.getAttribute("value");
    }

    public void validate() throws Exception {
        WebElement Validatedeal = findElement(validatedeal);
        log.info("click on validate deal");
        actions(Validatedeal);
    }

    public void AccountCreate(String customernumber) throws InterruptedException {

        switchToDefault();
        WebElement frametab = findElement(creaatepaymentframe);
        switchToFrame(frametab);
        WebElement callInvestment = findElement(callinvestment);
        callInvestment.click();
        // String mainWindow=driver.getWindowHandle();
        WebElement Newarrangement = findElement(NewArrangement);
        Newarrangement.click();
        // driver.switchTo().frame(0);
        // System.out.println(currentWnidow);

//					    for(String winHandle : driver.getWindowHandles()){
//						driver.switchTo().window(winHandle);

        switchToWindow(1);


        //System.out.println(winHandle);

        // driver.switchTo().frame(0);
        //driver.manage().window().maximize();
        windowMaximize();

        //Thread.sleep(1000);
        WebElement customernu = findElement(NewAccountcustomernum);
        customernu.click();
        WebElement customerno = findElement(NewAccountcustomernum);
        customerno.sendKeys(customernumber);
    }

    public void acceptoverrideFortransferover10k() {
        WebElement Acceptoverride = findElement(Acceptoverrides);


    }


    public void commitDeal() throws Exception {
        WebElement CommitDeal = findElement(commitDeal);


        log.info("click on CommitDeal");
        mouseOver(CommitDeal);
        //CommitDeal.click();
        //WebElement CommitDeall=findElement(CommitDeal);
        WebElement CommitDeall = findElement(commitDeal);
        highlightUsingJs(CommitDeal);
        WebElement CommitDeal1 = findElement(commitDeal);
        clickElementUsingJavaScript(CommitDeal1);
        //actions(CommitDeall);

    }

    public void verifyInternalTransaction() {
        WebElement txnComplete = findElement(TxnComplete);
        highlightUsingJs(txnComplete);
        Assert.assertTrue(txnComplete.isDisplayed());
        System.out.println("transaction success");
        log.info("Internal transfer  success..");

    }

    public void redeemDepositclick() {

        WebElement redeemdeposit = findElement(redeemDeposit);
        redeemdeposit.click();
        log.info("Click on redeem deposit....");

    }

    public void withdrawalDetails(String date, String amount) throws InterruptedException {
        WebElement withdrawelFRAME = findElement(withdrawalFrame);
        switchToFrame(withdrawelFRAME);

        //this.driver = driver;
        for (int i = 3; i <= 30; i++) {
            String a = findElement(By.xpath("//*[@id='datadisplay']/tbody/tr[" + i + "]/td[1]")).getText();
            if (a.contains(date)) {
                String b = findElement(By.xpath("//*[@id='datadisplay']//tbody/tr[" + i + "]/td[3]")).getText();
                if (b.contains(amount)) {
                    WebElement c = findElement(By.xpath("//*[@id='datadisplay']//tbody/tr[" + i + "]/td[4]"));
                    c.click();
                    break;
                }

            }
        }


    }


    public void verifyTxnCompleteMsgisdisplayed() {
        WebElement txnComplete = findElement(TxnComplete);
        Assert.assertTrue(txnComplete.isDisplayed());
        System.out.println("transaction success");
        log.info("Internal transfer  success..");

    }

    public String getrepaymenetDate() {
        WebElement withdraweldate = findElement(repayingdate);
        String date = withdraweldate.getText();
        return date;
    }

    public void ClosureReason() {
        WebElement closureReason = findElement(closurereason);
        closureReason.click();
        WebElement Closurereason = findElement(closurereason);
        Select sel = new Select(Closurereason);
        sel.selectByIndex(1);
    }

    public void verifyDepositClosure(String date, String arrangement) {
        WebElement Maturitydate = findElement(maturityDate);
        String maturitydate = Maturitydate.getText();
        String arrangementOverview = findElement(arrangementoverviewNewLoan).getText();
        String statusOverview = findElement(overviewstatusDeposit).getText();
        Assert.assertTrue(maturitydate.contains(date) && statusOverview.contains("Pending Closure") && arrangementOverview.contains(arrangement));
        {
            log.info("depositclosureverified");
           WebElement statusOvervieww = findElement(overviewstatusDeposit);
           highlightUsingJs(statusOvervieww);
            WebElement arrangementOvervieww = findElement(arrangementoverviewNewLoan);
            highlightUsingJs(arrangementOvervieww);

        }
    }

    //*[text()='Completed - Successfully']

    public void simulationStatus() {

        WebElement Simulationmsg = findElementSimulationVisiblity(simulationmsg);
        String a = Simulationmsg.getText();
        Assert.assertTrue(a.contains("Completed - Successfully"));
    }

    public void simulationStatusloan() {
        WebElement Simulationmsg = findElementSimulationVisiblity(simulationmsgLoan);
        String a = Simulationmsg.getText();
        Assert.assertTrue(a.contains("Executed - Successfully"));
    }

    public void commercialLoansclick() throws InterruptedException {
        // String mainWindow=driver.getWindowHandle();
        switchToDefault();
        WebElement frametab = findElement(creaatepaymentframe);
        switchToFrame(frametab);
        WebElement commercialloan = findElement(commercialLoan);
        commercialloan.click();

        WebElement commercialloanArrangment = findElement(commercialloanArrangement);
        commercialloanArrangment.click();

        log.info("click on commercial loans....");
        switchwindows();
        windowMaximize();
    }

    public void redemptionStatementClick() {
        WebElement Redemptionstatement = findElement(redemptionstatement);
        Redemptionstatement.click();
    }

    public void limit() {
        WebElement limit = findElement(Limit);
        limit.click();
        WebElement limitField = findElement(limitfield);
        limitField.clear();
        WebElement limitSerial = findElement(limitserial);
        limitSerial.clear();
    }

    public void loanInterest(String marginoperand, String margintypee, String marginratee) {
        WebElement Loaninterest = findElement(loanInterest);
        Loaninterest.click();
        WebElement Fixedfloating = findElement(fixedfloating);
        Fixedfloating.click();
        WebElement marginoper = findElement(marginOper);
        marginoper.click();
        Select sel1 = new Select(marginoper);
        //sel1.selectByIndex(2);
        sel1.selectByValue(marginoperand);
        WebElement margintype = findElement(marginField);
        margintype.click();
        Select sel = new Select(margintype);
        sel.selectByIndex(3);

        // sel.selectByIndex(margintypee);
        WebElement marginrate = findElement(marginRateloan);
        marginrate.sendKeys(marginratee);
    }

    public void commitmentLoan(String amount1, String term1) {

        WebElement Commitment = findElement(commitment);
        Commitment.click();

        log.info("click commitment....");
        WebElement amount = findElement(Amount);
        amount.sendKeys(amount1);
        WebElement term = findElement(Term);
        term.sendKeys(term1);
    }

    public void authApprove() {
        WebElement authaprove = findElement(authLoanDropdown);
        authaprove.click();
        Select sel = new Select(authaprove);
        sel.selectByIndex(0);
        WebElement authaprovetick = findElement(authapprovetick);
        authaprovetick.click();


    }

    public void authorisedeal() {
        WebElement Authorisedeal = findElement(authorisedeal);
        Authorisedeal.click();
        WebElement txnComplete = findElement(TxnComplete);

        Assert.assertTrue(txnComplete.isDisplayed());
        System.out.println("Authorise loansuccess");
        log.info("Authorise  loan  success..");


    }

    public void redemptionList(String date) {
        //this.driver = driver;
        WebElement redemptionFRAME = findElement(redemptionlistFrame);
        switchToFrame(redemptionFRAME);
        for (int i = 1; i <= 30; i++) {
            String a = findElement(By.xpath("//*[@id='datadisplay']/tbody/tr[" + i + "]/td[1]")).getText();
            if (a.contains(date)) {

                WebElement c = findElement(By.xpath("//*[@id='datadisplay']//tbody/tr[" + i + "]/td[2]"));
                c.click();

                break;
            }

        }

        switchToDefault();
        WebElement redemptionStatementFRAME = findElement(redeemstatementFrame);
        switchToFrame(redemptionStatementFRAME);
        WebElement redemptionDeposit = findElement(redeemDepositlist);
        redemptionDeposit.click();
        switchToDefault();
        WebElement versionFRAME = findElement(versionFrame);
        switchToFrame(versionFRAME);

    }

    public void statusClosureCheck(String Arrangement) {
        WebElement Newaccounrarrangement = findElement(newaccounrarrangement);
        String a = Newaccounrarrangement.getText();
        WebElement StatusOverview = findElement(Overviewstatus);
        String e = StatusOverview.getText();
        Assert.assertTrue(a.contains(Arrangement) && e.contains("Pending Closure"));
        log.info("account closure success....");
       highlightUsingJs(Newaccounrarrangement);
        highlightUsingJs(StatusOverview);

    }


    public void generalEnquiriesClick() {
        WebElement innerFrame = findElement(innerframe);
        switchToFrame(innerFrame);
        WebElement generalenq = findElement(generalenquiries);
        generalenq.click();
    }

    public void Ibviewclick() {
        //WebElement innerFrame = findElement(innerframe);
      //  switchToFrame(innerFrame);

              //  WebElement generalenq = findElement(generalenquiries);
               // generalenq.click();
                WebElement Ibvieww = findElement(iBview);
                Ibvieww.click();
            }






    public void balanceCheck(String AccountNumber) throws InterruptedException {
        WebElement innerFrame = findElement(innerframe);
        switchToFrame(innerFrame);
        WebElement generalenq = findElement(generalenquiries);
        generalenq.click();
        log.info("click on General enqiries");
        WebElement Ibview1 = findElement(iBview);
        List<WebElement> wb = findElements(iBview);
        for (WebElement we : wb) {
            if (we.isDisplayed() && we.isEnabled()) {
                WebElement Ibview2 = findElement(iBview);
                Ibview2.click();
                log.info("click on ibview.");
            } else {
                WebElement Generalenquiries = findElement(generalenquiries);
                Generalenquiries.click();
                WebElement Ibview = findElement(iBview);
                log.info("click on Ibview");
                log.info("click on Ibview");
                Ibview.click();
                log.info("click on ibview....");
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
            Thread.sleep(500);
            log.info("click on find");
            pageNext();
            Thread.sleep(1000);
        }
    }

    public void creditAccount(String AccountNumber, String date) throws InterruptedException {
        Thread.sleep(500);
        WebElement AccountNum3 = findElementClickable(accountNum);
        AccountNum3.clear();
        log.info("Entered credit account number");
        WebElement AccountNum1 = findElementClickable(accountNum);
        AccountNum1.sendKeys(AccountNumber);

//        WebElement Processingdate=findElement(processingdate);
//        Processingdate.click();
//        WebElement Processingdate1=findElement(processingdate);
//        Processingdate1.clear();
//        String Date=Datepicknarrative(date);
//        WebElement Processingdate2=findElement(processingdate);
//        Processingdate2.sendKeys(Date);
        log.info("click on find");
        WebElement Find = findElementClickable(find);
        Find.click();
        Thread.sleep(1000);
        pageNext();
        Thread.sleep(1000);
    }

    public void creditAccountNarrative(String AccountNumber, String date) throws InterruptedException {
        WebElement AccountNum3 = findElement(accountNum);
        AccountNum3.clear();
        log.info("Entered credit account number");
        WebElement AccountNum1 = findElement(accountNum);
        AccountNum1.sendKeys(AccountNumber);
        log.info("click on find");
        WebElement Find = findElement(find);
        Find.click();
        Thread.sleep(1000);
        WebElement Processingdate = findElementClickable(processingdate);
        Processingdate.click();
        WebElement Processingdate1 = findElementClickable(processingdate);
        Processingdate1.clear();
        WebElement Processingdatee = findElementClickable(processingdate);
        Processingdatee.sendKeys(date);
    }

    public String transactionTransfId() {
        WebElement txnComplete = findElement(TxnComplete);
        String txncompletemsg = txnComplete.getText();

        String transactionid = txncompletemsg.substring(14, 26);
        TransactionID = transactionid;
        return transactionid;
    }

    public void pageNext() throws InterruptedException {
        Thread.sleep(1000);
        waitForPageToLoad(15);
        List<WebElement> elements = findElements(pageSearch);

        if (elements.size() > 0) {
            WebElement pagesearch1 = findElementClickable(pageSearch);
            clickElementUsingJavaScript(pagesearch1);
            // pagesearch1.click();
        } else {
            log.info("continue");
        }
    }

    public String getBalance() {
        WebElement Find = findElement(balance);
        String Balance = Find.getText();
        Accountbalance = Balance;
        return Balance;
    }

    public void enterAccountNumInIbviewofAccounttEntries(String accountnum, String date) {
        switchToDefault();
        WebElement creaatepaymentFrame = findElement(creaatepaymentframe);
        switchToFrame(creaatepaymentFrame);
        WebElement AccountNum = findElement(accountNum);
        AccountNum.clear();
        AccountNum.sendKeys(accountnum);
        WebElement Processingdate = findElement(processingdate);
        Processingdate.click();
        WebElement Processingdate1 = findElement(processingdate);
        Processingdate1.clear();
        Processingdate.sendKeys(date);

    }


    public void enterAccountNumInIBviewofAccounttEntries(String accountnum) {
        switchToDefault();
        WebElement creaatepaymentFrame = findElement(creaatepaymentframe);
        switchToFrame(creaatepaymentFrame);
        WebElement AccountNum = findElement(accountNum);
        AccountNum.clear();
        AccountNum.sendKeys(accountnum);
        WebElement Processingdate = findElement(processingdate);
        Processingdate.click();
//        WebElement Processingdate1 = findElement(processingdate);
//        Processingdate1.clear();
    }

    public void enterdateInIbview(String date) {
        DateUtilities Du = new DateUtilities();
        String Date = Du.DatepickNarrativeFormat(date);
        EnterDateinIbviewFormat(Date);


    }

    public void ibManagerReporting() throws Exception {
        WebElement reporting = findElement(txtibManagerReporting);
        reporting.click();
        WebElement reportType = findElement(txtibMreportType);
        Select sl = new Select(reportType);
        sl.selectByIndex(5);
        String today = datePickIBM();
        WebElement ibmDatefrom = findElement(txtibMstartDate);
        ibmDatefrom.click();
        WebElement ibmDatefrom1 = findElement(txtibMstartDate);
        ibmDatefrom1.clear();
        WebElement ibmDatefrom2 = findElement(txtibMstartDate);
        ibmDatefrom2.sendKeys(today);
        WebElement client = findElement(txtibMclient);
        actions(client);
        WebElement ibmDateto = findElement(txtibMendDate);
        actions(ibmDateto);
        WebElement ibmDateto1 = findElement(txtibMendDate);
        ibmDateto1.clear();
        WebElement ibmDateto2 = findElement(txtibMendDate);
        ibmDateto2.sendKeys(today);
        WebElement IbmDateto2 = findElement(txtibMendDate);
        IbmDateto2.click();
        WebElement status = findElement(txtStatus);
        Select s2 = new Select(status);
        s2.selectByIndex(4);
        WebElement allRetrieve = findElement(btnRetrieve);
        doubleClick(allRetrieve);
        WebElement plus = findElement(btnPlus);
        actions(plus);


    }

    public String datePickIBM() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();

        String date = dtf.format(now); // ---->> 29/03/2022
        // System.out.println(date);
        return date;
    }

    public void EnterDateinIbviewFormat(String date) {
        switchToDefault();
        WebElement creaatepaymentFrame = findElement(creaatepaymentframe);
        switchToFrame(creaatepaymentFrame);
        WebElement FromDateibView = findElement(fromDateibview);
        FromDateibView.click();
        FromDateibView.clear();
        WebElement FromDateIbview = findElement(fromDateibview);
        FromDateIbview.sendKeys(date);

    }

    public void findClick() {
        WebElement Find = findElement(find);
        Find.click();
    }


    public void accountEntries() throws InterruptedException {
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
        }
    }

    public void enterAcntNumbeAccountEntries(String AccountNumber, String date) {
        switchToDefault();
        WebElement creaatepaymentFrame = findElement(creaatepaymentframe);
        switchToFrame(creaatepaymentFrame);
        WebElement AccountNum = findElement(accountentriesAccountnum);
        AccountNum.clear();
        AccountNum.sendKeys(AccountNumber);

        log.info("enter account number");

        // WebElement IbviewCalendar=driver.findElement(ibviewCalendar);


        // IbviewCalendar.click();


        WebElement Processingdate = findElement(accountentriesDate);
        Processingdate.click();
        WebElement Processingdate1 = findElementClickable(accountentriesDate);
        Processingdate1.clear();
        // String Date = Datepicknarrative(date);
        WebElement Processingdate2 = findElementClickable(accountentriesDate);
        Processingdate2.sendKeys(date);
        // WebElement AccountentriesCurrentDate=driver.findElement(AccountEntriesViewCurrentDate);
        // AccountentriesCurrentDate.click();
        // accountNum.sendKeys(" 100057985");
        WebElement Find = findElement(find);
        Find.click();
        log.info("click find");
        switchToDefault();
        WebElement paymentframe = findElement(creaatepaymentframe);
        switchToFrame(paymentframe);

    }

    public void signOff() throws InterruptedException {
        switchToDefault();

        List<WebElement> wb = findElements(signoffFrame);
        for (WebElement we : wb) {
            if (we.isDisplayed() && we.isEnabled()) {
                WebElement Signofframe = findElement(signoffFrame);
                switchToFrame(Signofframe);
                WebElement Signoff1 = findElement(signoff);
                Signoff1.click();
                //Thread.sleep(3000);

                log.info("Click on Signoff....");

            } else {
                List<WebElement> wb1 = findElements(authframe);
                for (WebElement we1 : wb1) {
                    if (we1.isDisplayed() && we1.isEnabled()) {
                        WebElement Authframe = findElement(authframe);
                        switchToFrame(Authframe);
                        WebElement Signoff1 = findElement(signoff);
                        Signoff1.click();

                        log.info("Click on Signoff....");
                    }
                }
            }
        }

        List<WebElement> wb1 = findElements(authframe);
        for (WebElement we1 : wb1) {
            if (we1.isDisplayed() && we1.isEnabled()) {
                WebElement Authframe = findElement(authframe);
                switchToFrame(Authframe);
                WebElement Signoff1 = findElement(signoff);
                Signoff1.click();
                //TestBase tb=new TestBase();
                //tb.logExtentReport("Click on Signoff....");


            }

        }
        Thread.sleep(5000);


    }

    public String Datepicknarrative(String date1) {

        String date = date1;
        String[] arr = date.split("/");
        String dateToday = arr[0];// ----->>29
        int day = Integer.parseInt(dateToday);
        String a = String.format("%02d", day);
        String monthAndYear = arr[2] + arr[1];
        String Date = monthAndYear + a;
        System.out.println(Date);
        return Date;
    }

    public void authoriserAuth() throws InterruptedException {


        WebElement innerFrame2 = findElement(innerframe);
        switchToFrame(innerFrame2);

        WebElement Operationsmenu1 = findElement(operationsmenu);

        Operationsmenu1.click();
        WebElement Unauthorisedfttransactions1 = findElement(unauthorisedfttransactions);
        Unauthorisedfttransactions1.click();
        switchToDefault();
        WebElement Frametab1 = findElement(frametab);
        switchToFrame(Frametab1);


    }

    public void authorization(String trsanscacId) throws Exception {

        //this.driver = driver;

        for (int i = 1; i <= 50; i++) {
            try {
                String a = findElement(By.xpath("//table[@id='datadisplay']/tbody/tr[" + i + "]/td[1]")).getText();


                if (trsanscacId.contains(a)) {
                    WebElement authorise = findElement(By.xpath("//table[@id='datadisplay']/tbody/tr[" + i + "]/td[10]"));
                    // Thread.sleep(2000);
                    authorise.click();
                    WebElement authoriseeconfirm = findElement(By.xpath("//*[@alt='Authorises a deal']"));
                    // authoriseeconfirm.click();
                    actions(authoriseeconfirm);
                    // Thread.sleep(2000);
                    break;
                }
            } catch (NoSuchElementException | TimeoutException e) {
                // Handle exceptions appropriately
                System.out.println("Element not found or timed out: " + e.getMessage());
            }
        }

    }


    public void checkAccountEntries(String transactionid, String amount, String date) {

        for (int i = 1; i <= 50; i++) {

            WebElement transid = findElement(By.xpath("//*[@id='datadisplay']/tbody/tr[" + i + "]/td[2]"));
            String a = transid.getText();
            if (a.contains(transactionid)) {
                WebElement amountt = findElement(By.xpath("//*[@id='datadisplay']/tbody/tr[" + i + "]/td[5]"));
                String b = amountt.getText();
                DecimalFormat formatter = new DecimalFormat("#,###.##");
                //int Amount=Integer.parseInt(amount);
                Double Amount = Double.valueOf(amount);
                String formattedamount = formatter.format(Amount);
                String formattedamountt = String.valueOf(formattedamount);
                scrollIntoView(amountt);
                Assert.assertTrue(b.contains(formattedamountt));
                highlightUsingJs(transid);
                highlightUsingJs(amountt);
                WebElement fiel1d1 = findElement(By.xpath("//*[@id='datadisplay']/tbody/tr[" + i + "]/td[1]"));
                WebElement fiel1d2 = findElement(By.xpath("//*[@id='datadisplay']/tbody/tr[" + i + "]/td[3]"));
                WebElement fiel1d3 = findElement(By.xpath("//*[@id='datadisplay']/tbody/tr[" + i + "]/td[4]"));
                WebElement fiel1d6 = findElement(By.xpath("//*[@id='datadisplay']/tbody/tr[" + i + "]/td[6]"));
                WebElement fiel1d7 = findElement(By.xpath("//*[@id='datadisplay']/tbody/tr[" + i + "]/td[7]"));
                highlightUsingJs(fiel1d1);
                highlightUsingJs(fiel1d2);
                highlightUsingJs(fiel1d3);
                highlightUsingJs(fiel1d6);
                highlightUsingJs(fiel1d7);

                break;

            }

        }
    }

    public void findAccount() throws InterruptedException {

        switchToDefault();
        WebElement innerFrame2 = findElement(innerframe);
        switchToFrame(innerFrame2);


        List<WebElement> wb = findElements(findAccount);
        for (WebElement we : wb) {
            if (we.isDisplayed() && we.isEnabled()) {
                we.click();
            } else {


                WebElement Operationsmenu1 = findElement(operationsmenu);

                Operationsmenu1.click();

                WebElement findaccount = findElement(findAccount);
                findaccount.click();
                log.info("click on find account");
            }

            log.info("click on find account");
        }
    }

    public void findccountArrangement(String Arrangement) {
        switchToDefault();
        WebElement creaatePaymentframe = findElement(creaatepaymentframe);
        switchToFrame(creaatePaymentframe);


        WebElement ArrangementField = findElement(Arrangementfield);
        ArrangementField.clear();
        WebElement ArrangementFiield = findElement(Arrangementfield);
        ArrangementFiield.sendKeys(Arrangement);

        WebElement findarrangement = findElement(findArrangement);
        findarrangement.click();

    }

    public void openAccountArrangement(String Arrangement) {
        switchToDefault();
        WebElement creaatePaymentframe = findElement(creaatepaymentframe);
        switchToFrame(creaatePaymentframe);
        WebElement ArrangementField = findElement(Arrangementfield);
        ArrangementField.clear();
        WebElement ArrangementFiield = findElement(Arrangementfield);
        ArrangementFiield.sendKeys(Arrangement);

        WebElement findarrangement = findElement(findArrangement);
        findarrangement.click();
        overview();
        switchToWindow(1);
        windowMaximize();
    }

    public void reversesweepclick() throws InterruptedException {
        waitForPageToLoad(20000);
        Thread.sleep(10000);

        String a = pagesource();
        // System.out.println(a);
        if (a.contains("Reverse")) {
            WebElement revresesweep = findElement(reversweep);
            revresesweep.click();
            switchwindows();
            WebElement Confirmreverse = findElement(confirmreverse);
            Confirmreverse.click();
        }
//        List<WebElement> wb = findElements(reversweep);
//        for (WebElement we : wb) {
//            if (we.isDisplayed() && we.isEnabled()) {
//
//                scrollIntoViewAndClick(we);
//
//                Thread.sleep(1000);
//                switchwindows();
//
//                WebElement Confirmreverse = findElement(confirmreverse);
//                Confirmreverse.click();
//
//            }
//        }
    }

    public void overview() {
        WebElement overView = findElement(overview);
        overView.click();
    }

    public void sweepmaintenanceClick() {


        WebElement Sweepmaintenance = findElement(sweepmaintenance);
        Sweepmaintenance.click();

        WebElement Sweepmaintenancesweep = findElement(sweepmaintenancesweep);
        Sweepmaintenancesweep.click();
    }

    public void performClosureClick() throws InterruptedException {


        WebElement performClosure = findElement(performclosure);
        //performClosure.click();
        scrollIntoViewAndClick(performClosure);

        log.info("click performclosure");

    }

    public void accountClosure(String activeClosuree, String PayoutAcntNum) throws Exception {
        switchwindows();
        validate();
        WebElement advancedPayout = findElement(payoutClosure);
        advancedPayout.click();
        WebElement activeclosure = findElement(activeClosure);
        activeclosure.click();
        Thread.sleep(1000);
        WebElement Activeclosure = findElement(activeClosure);
        Select sel = new Select(Activeclosure);
        sel.selectByVisibleText("Yes");
        WebElement PayOutAccount = findElement(payoutAccount);
        PayOutAccount.click();
        WebElement PayoutAccount = findElement(payoutAccount);
        PayoutAccount.clear();
        PayoutAccount.sendKeys(PayoutAcntNum);
        log.info("entered payout account");

    }

    public void acceptOverridee() throws InterruptedException {

        List<WebElement> elements = findElements(Acceptoveride);

        if (elements.size() > 0) {

            WebElement acceptoveride = findElement(Acceptoveride);
            acceptoveride.click();

        }
    }

    public void acceptOverrideeover10k() throws InterruptedException {

        WebElement Authrequired = findElementVisiblity(authrequired);
        Assert.assertTrue(Authrequired.isDisplayed());

        WebElement acceptoveride = findElementClickable(Acceptoveride);

        acceptoveride.click();
    }

    public void sweepmaintenancesweepClick() {
        WebElement Sweepmaintenancesweep = findElement(sweepmaintenancesweep);
        Sweepmaintenancesweep.click();

    }

    public void SurplussweepClick() {
        WebElement Surplussweep = findElement(surplussweep);
        Surplussweep.click();
    }

    public void surplustwowaySweepClick() {
        WebElement SurplustwowaySweep = findElement(surplustwowaySweep);
        SurplustwowaySweep.click();
    }

    public void twowaysweepdata(String descriptionn, String accounttomaintainn, String amount, String thresholdamount, String fromaccountt) {
        switchToDefault();
        WebElement frametab = findElement(creaatepaymentframe);
        switchToFrame(frametab);
        WebElement accountlinktable = findElement(Accountlinktable);
        accountlinktable.click();
        WebElement Description = findElement(description);
        Description.sendKeys(descriptionn);
        WebElement Frequencydropdown = findElement(frequencydropdown);
        Frequencydropdown.click();
        WebElement Dailyfreq = findElement(dailyfreq);
        Dailyfreq.click();
        WebElement Businessdayfreq = findElement(businessdayfreq);
        Businessdayfreq.click();
        WebElement Calandersweep = findElement(calandersweep);
        Calandersweep.click();
        WebElement CurrentdateSweep = findElement(currentdateTwowaySweep);
        CurrentdateSweep.click();
        WebElement Save = findElement(save);
        Save.click();
        WebElement Accounttomaintain = findElement(accounttomaintain);
        Accounttomaintain.sendKeys(accounttomaintainn);
        WebElement Amounttomaintain = findElement(amounttomaintain);
        Amounttomaintain.sendKeys(amount);
        WebElement thresholdAmount = findElement(ThresholdAmount);
        thresholdAmount.sendKeys(thresholdamount);
        WebElement Fromaccount = findElement(fromaccount);
        Fromaccount.sendKeys(fromaccountt);
    }


    public void sweepmaintenancesweepdata(String descriptionn, String accounttomaintainn, String amount, String fromaccountt) {
        switchToDefault();
        WebElement frametab = findElement(creaatepaymentframe);
        switchToFrame(frametab);
        WebElement accountlinktable = findElement(Accountlinktable);
        accountlinktable.click();
        WebElement Description = findElement(description);
        Description.sendKeys(descriptionn);

        WebElement Frequencydropdown = findElement(frequencydropdown);
        Frequencydropdown.click();
        WebElement Dailyfreq = findElement(dailyfreq);
        Dailyfreq.click();
        WebElement Businessdayfreq = findElement(businessdayfreq);
        Businessdayfreq.click();
        WebElement Calandersweep = findElement(calandersweep);
        Calandersweep.click();
        WebElement CurrentdateSweep = findElement(currentdateBalMaintenance);
        CurrentdateSweep.click();
        WebElement Save = findElement(save);
        Save.click();
        WebElement Accounttomaintain = findElement(accounttomaintain);
        Accounttomaintain.sendKeys(accounttomaintainn);
        WebElement Amounttomaintain = findElement(amounttomaintain);
        Amounttomaintain.sendKeys(amount);
        WebElement Fromaccount = findElement(fromaccount);
        Fromaccount.sendKeys(fromaccountt);
    }

    public void surplussweepdata(String descriptionn, String accounttomaintainn, String amount, String fromaccountt) {
        switchToDefault();
        WebElement frametab = findElement(creaatepaymentframe);
        switchToFrame(frametab);
        WebElement accountlinktable = findElement(Accountlinktable);
        accountlinktable.click();
        WebElement Description = findElement(description);
        Description.sendKeys(descriptionn);

        WebElement Frequencydropdown = findElement(frequencydropdown);
        Frequencydropdown.click();
        WebElement Dailyfreq = findElement(dailyfreq);
        Dailyfreq.click();
        WebElement Businessdayfreq = findElement(businessdayfreq);
        Businessdayfreq.click();
        WebElement Calandersweep = findElement(calandersweep);
        Calandersweep.click();
        WebElement CurrentdateSweep = findElement(currentdateSweep);
        CurrentdateSweep.click();
        WebElement Save = findElement(save);
        Save.click();
        WebElement Accounttomaintain = findElement(accounttomaintain);
        Accounttomaintain.sendKeys(accounttomaintainn);
        WebElement Amounttomaintain = findElement(ThresholdAmount);
        Amounttomaintain.sendKeys(amount);
        WebElement Fromaccount = findElement(fromaccount);
        Fromaccount.sendKeys(fromaccountt);
    }


    public void verifysweepAccount(String toaccount, String fromaccount, String amount) {
        WebElement Sweeptype = findElement(sweeptype);
        String SweepType = Sweeptype.getText();
        WebElement Sweepfromaccount = findElement(sweepfromaccpont);
        String sweepfromAccount = Sweepfromaccount.getText();

        WebElement Sweeptoaccount = findElement(sweeptoaccount);
        String SweeptoAccount = Sweeptoaccount.getText();
        WebElement Minamt = findElement(minamt);
        String minumumAmount = Minamt.getText();
        String minamount = minumumAmount.replace(",", "");
        WebElement Freqsweep = findElement(freqsweep);
        String frequencySweep = Freqsweep.getText();
        Assert.assertTrue(SweepType.contains("Maintain Min Balance") && sweepfromAccount.contains(fromaccount) && SweeptoAccount.contains(toaccount) && minamount.contains(amount) && frequencySweep.contains("Every working day"));
highlightUsingJs(Sweepfromaccount);
        highlightUsingJs(Sweeptoaccount);
        highlightUsingJs(Minamt);
        highlightUsingJs(Freqsweep);
        highlightUsingJs(Sweeptype);



    }

    public void verifySurplussweepAccount(String toaccount, String fromaccount, String amount) {
        WebElement Sweeptype = findElement(TransferOutSurplus);
        String SweepType = Sweeptype.getText();
        WebElement Sweepfromaccount = findElement(sweepfromaccpont);
        String sweepfromAccount = Sweepfromaccount.getText();
        WebElement Sweeptoaccount = findElement(sweeptoaccount);
        String SweeptoAccount = Sweeptoaccount.getText();
        WebElement Maxamt = findElement(maxamt);
        String MaximumAmount = Maxamt.getText();
        String maxamount = MaximumAmount.replace(",", "");
        WebElement Freqsweep = findElement(freqsweep);
        String frequencySweep = Freqsweep.getText();
        Assert.assertTrue(SweepType.contains("Transfer Out Surplus") && sweepfromAccount.contains(fromaccount) && SweeptoAccount.contains(toaccount) && maxamount.contains(amount) && frequencySweep.contains("Every working day"));
    highlightUsingJs(Sweepfromaccount);
        highlightUsingJs(Sweeptoaccount);
        highlightUsingJs(Freqsweep);

    }

    public String getAccountbalance() {
        WebElement BalanceAvailable = findElement(balanceAvailable);
        String balance = BalanceAvailable.getText();
        return balance;
    }

    public void standingOrder() throws Exception {

        WebElement standingorder = findElement(standingOrder);
        standingorder.click();
        WebElement standingorder1 = findElement(standingOrder);
        standingorder1.click();
        log.info("clicked standingorder");

    }

    public String sweepBalanceMaintenanceAmount(String balance) {
        String balanacee = balance.replace(",", "");
        Double avbalance = Double.parseDouble(balanacee);
        Double amount = avbalance + 50;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String sweepamount = decimalFormat.format(amount);
        return sweepamount;
    }

    public String surplusSweepAmount(String balance) {
        String balanacee = balance.replace(",", "");
        Double avbalance = Double.parseDouble(balanacee);
        Double amount = avbalance - 50;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String sweepamount = decimalFormat.format(amount);
        return sweepamount;
    }

    public void operationsmenuClick() {

        switchToDefault();
        WebElement innerFrame2 = findElement(innerframe);
        switchToFrame(innerFrame2);
        List<WebElement> wb = findElements(operationsmenu);
        int a = wb.size();
        if (a > 0) {
            WebElement Operationsmenu1 = findElement(operationsmenu);

            Operationsmenu1.click();
        }
    }

    public void productCatalog() throws Exception {

        switchToDefault();
        WebElement innerFrame = findElement(innerframe);
        switchToFrame(innerFrame);

        WebElement ProductCreation = findElement(Productcreation);
        actions(ProductCreation);

        WebElement Productcatalog = findElement(ProductCatalog);

        actions(Productcatalog);

        log.info("click on product catalog.");
    }

    public void FixedTermNonChurchclick() throws InterruptedException {
        //String mainWindow=getWindowHandle();
        switchToDefault();
        WebElement frametab = findElement(creaatepaymentframe);
        switchToFrame(frametab);
        WebElement FixedTermnonChurch = findElement(FixedTermNonchurch);
        FixedTermnonChurch.click();
        WebElement FTINonchurchannual = findElement(FTInonchurchAnnual);
        FTINonchurchannual.click();
        switchwindows();
        windowMaximize();

    }

    public void arrangmentCustomerNoFill(String customernumber) {
        WebElement customernu = findElement(NewAccountcustomernum);
        customernu.click();
        WebElement customerno = findElement(NewAccountcustomernum);
        customerno.sendKeys(customernumber);
        log.info("entered customer number");
    }

    public void AtcallinvestmentClick() throws InterruptedException {
        switchToDefault();
        WebElement frametab = findElement(creaatepaymentframe);
        switchToFrame(frametab);
        WebElement callInvestment = findElement(callinvestment);
        callInvestment.click();
        WebElement Newarrangement = findElement(NewArrangementAtcallInvestment);
        Newarrangement.click();
        switchToWindow(1);
        windowMaximize();
    }

    public void customenoFill(String customernumber) {
        WebElement customernu = findElement(NewAccountcustomernum);
        customernu.click();
        WebElement customerno = findElement(NewAccountcustomernum);
        customerno.sendKeys(customernumber);

    }

    public String arrangementNoNewcustomer() {
        WebElement Arrangement = findElement(ArrangementNewCustomer);
        String Arranmementno = Arrangement.getText();
        return Arranmementno;
    }

    public String tradeDateNewCustomer() {
        WebElement effectivedate = findElement(tradeDate);
        String tradedate = effectivedate.getText();
        return tradedate;
    }

    public String productNameNew() {
        WebElement prodctname = findElement(productNewCustomer);
        String productnamee = prodctname.getText();
        return productnamee;

    }

    public void account(String recordd) throws InterruptedException {
        WebElement account = findElement(Account);
        account.click();
        Thread.sleep(2000);
        WebElement Additional = findElement(additional);
        Additional.click();
        WebElement Record = findElement(record);
        Record.click();
        WebElement RecordFieldName = findElement(recordFieldname);
        RecordFieldName.clear();
        RecordFieldName.sendKeys(recordd);
//					    Select sel=new Select(RecordFieldName);
//         				sel.selectByIndex(1);
    }

    public void WindowClosee() throws InterruptedException {
        Thread.sleep(1000);
        String oiginalHandle = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals((oiginalHandle))) {
                driver.switchTo().window(handle);
                driver.close();
            }
        }
        Thread.sleep(500);
        driver.switchTo().window(oiginalHandle);

    }

    public String costumerNumNew() {
        WebElement customerNo = findElement(CustomernoNewValidate);
        String customerNum = customerNo.getText();
        return customerNum;
    }

    public String accountNumNew() {
        WebElement accountNo = findElement(accountnumOverview);
        String accountNum = accountNo.getText();
        String accountnumber = accountNum.substring(0, 9);
        return accountnumber;
    }

    public void reviewBatchPayment() {
        By batchPayInitiatedMsg = By.xpath("//*[text()='Your batch payment has been created and is awaiting approval before being processed']");
        By authorisationstatus = By.xpath("((//span[text()='Status'])[1]/following::span)[2]");
        WebElement batchpaymsg = findElementVisiblity(batchPayInitiatedMsg);
        String a = batchpaymsg.getText();
        Assert.assertTrue(a.contains("Your batch payment has been created and is awaiting approval before being processed"));
        WebElement Authorisationstatus = findElement(authorisationstatus);
        String authmsg = Authorisationstatus.getText();
        Assert.assertTrue(authmsg.contains("Waiting Authorisation"));
    }


    public void verifyCreateNewDeposit(String arrangement, String tradedate, String customernumber, String productname, String intrstRate) throws InterruptedException {
        // driver.manage().window().maximize();
        WebElement arrangentoverview = findElement(arrangementoverviewNewLoan);
        String a = arrangentoverview.getText();
        //System.out.println(a);
        WebElement pdctoverview = findElement(productDeposit);
        String b = pdctoverview.getText();
        //System.out.println(b);
        WebElement Dateoverview = findElement(DateDeposit);
        String c = Dateoverview.getText();
        //System.out.println(c);
        WebElement beneficialOrder = findElement(BeneficialOwnerDeposit);
        String d = beneficialOrder.getText();
        //System.out.println(d);
        WebElement StatusOverview = findElement(overviewstatusDeposit);
        String e = StatusOverview.getText();
        //System.out.println(e);
        WebElement overviewINterestRate = findElement(overvieInterestrate);
        String x = overviewINterestRate.getText();
        if (a.contains(arrangement) && c.contains(tradedate) && d.contains(customernumber) && b.contains(productname) && x.contains(intrstRate) && e.contains("Not Funded")) {
            log.info("create a new Deposit verified");

            log.info("create a new Deposit verified....");

        }
    }

    public void verifyCreateNewAccount(String arrangement, String tradedate, String customernumber, String productname) throws InterruptedException {


        WebElement arrangentoverview = findElement(ArrangementOverviewNewAccount);
        String a = arrangentoverview.getText();

        WebElement pdctoverview = findElement(productOverview);
        String b = pdctoverview.getText();

        WebElement Dateoverview = findElement(OverviewDate);
        String c = Dateoverview.getText();

        WebElement beneficialOrder = findElement(BeneficialOwner);
        String d = beneficialOrder.getText();

        WebElement StatusOverview = findElement(Overviewstatus);
        String e = StatusOverview.getText();

        Assert.assertTrue(a.contains(arrangement) && c.contains(tradedate) && b.contains(productname) && e.contains("Authorised"));
        {
            log.info("create a new Account verified");

            log.info("create a new Account verified....");
        }


    }

    public void overviewAccountcreation(String Arrangement) throws InterruptedException {
        switchToDefault();

        WebElement creaatePaymentframe = findElement(creaatepaymentframe);
        switchToFrame(creaatePaymentframe);
//
        //WebElement oWnername=driver.findElement(ownwer);
        //oWnername.clear();

        WebElement ArrangementField = findElement(Arrangementfield);
        ArrangementField.clear();


        WebElement ArrangementFiield = findElement(Arrangementfield);
        ArrangementFiield.sendKeys(Arrangement);

        WebElement findarrangement = findElement(findArrangement);
        findarrangement.click();
        WebElement overView = findElement(overview);
        overView.click();
        switchwindows();
    }

    public void overviewAccount(String Arrangement) throws InterruptedException {
        switchToDefault();
        WebElement creaatePaymentframe = findElement(creaatepaymentframe);
        switchToFrame(creaatePaymentframe);
        WebElement ArrangementField = findElement(Arrangementfield);
        ArrangementField.clear();
        WebElement ArrangementFiield = findElement(Arrangementfield);
        ArrangementFiield.sendKeys(Arrangement);
        WebElement findarrangement = findElement(findArrangement);
        findarrangement.click();
        WebElement overView = findElement(overview);
        overView.click();
        switchwindows();
        windowMaximize();

    }

    public String DDbaasInput() {
        WebElement baasInput = findElement(DDbaasInput);
        String a = baasInput.getText();
        return a;
    }

    public void directDebitDestination(String SourceDescription, String bsb, String accountnumber, String destinationname2, String destinationDesciption, String amount) throws InterruptedException {

        WebElement Description = findElement(Descriptiion);
        Description.click();
        Description.sendKeys(SourceDescription);
        WebElement destinationAcntBsb = findElement(DestinationAcntBsb);
        destinationAcntBsb.sendKeys(bsb);

        WebElement destinationAcntNo = findElement(DestinationAcntno);
        log.info("Entering destination account number");

        destinationAcntNo.sendKeys(accountnumber);
        WebElement DestinationName = findElement(destinationName);
        DestinationName.click();
        WebElement DestinationName1 = findElement(destinationName);
        DestinationName1.clear();
        WebElement DestinationName2 = findElement(destinationName);
        DestinationName2.sendKeys(destinationname2);
        WebElement DestinationDescription = findElement(destinationDescription);
        DestinationDescription.click();
        DestinationDescription.sendKeys(destinationDesciption);

        WebElement Amountfield = findElement(DDAmount);
        Amountfield.click();
        log.info("Entering amount");

        log.info("Entering amount");

        Amountfield.sendKeys(amount);
        // Thread.sleep(500);


    }

    public void DirectDebitTransaction(String descriptionn, String futureamount, String signatoryy) throws InterruptedException {
        WebElement description = findElement(DescriptionDD);
        description.sendKeys(descriptionn);
        WebElement cycleFrequency = findElement(CycleFrequency);
        cycleFrequency.click();
        WebElement SavePeriodic = findElement(savePeriodic);
        SavePeriodic.click();
        WebElement terminationDate = findElement(DDTerminationDate);
        terminationDate.click();
        String terminationmonth = directDebitTerminationMonth();
        WebElement month = findElement(DDterminationMonth);
        //month.click();
        Select sel = new Select(month);
        sel.selectByVisibleText(terminationmonth);
        //Thread.sleep(1000);
        WebElement terminationDay = findElement(DDterminationDay);
        terminationDay.click();
        //Thread.sleep(500);
        WebElement FutureFrequency = findElement(futureFrequencyDD);
        FutureFrequency.click();


        WebElement FuturefreqCalandar = findElement(FutureFreqCalandar);
        FuturefreqCalandar.click();
        String futureFreqMonth = directDebitfuturefreqMonth();

        WebElement Month = findElement(futureCalMonth);
        Select Sel = new Select(Month);
        Sel.selectByVisibleText(futureFreqMonth);

        WebElement futureDate = findElement(DDterminationDay);
        futureDate.click();

        WebElement SavePeriodic1 = findElement(savePeriodic);
        SavePeriodic1.click();
        WebElement Futureamount = findElement(FutureAmount);
        Futureamount.sendKeys(futureamount);

        WebElement FutureEndDate = findElement(DDfutureEndDate);
        FutureEndDate.click();

        String futureterminationmonth = directDebitftreTerminationMonth();
        WebElement month1 = findElement(FutureEndDateMonth);
        month1.click();
        Select sel1 = new Select(month1);
        sel1.selectByVisibleText(futureterminationmonth);
        WebElement terminationDay1 = findElement(DDterminationDay);
        terminationDay1.click();
        //	Thread.sleep(500);
        WebElement Signatory = findElement(signatory);
        Signatory.sendKeys(signatoryy);


    }

    public String directDebitTerminationMonth() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        String date = dtf.format(now); //---->> 29/03/2022
        String[] arr = date.split("/");
        String dateToday = arr[0];// ----->>29
        String currentmonth = arr[1];
        String currentyear = arr[2];
        int currentMonth = Integer.parseInt(currentmonth);
        int endmonth = currentMonth + 1;
        arr[1] = String.format("%02d", endmonth);
        String Endmonth = null;
        if (arr[1].contains("13")) {
            Endmonth = "January";
            int currentYear = Integer.parseInt(currentyear);
            int endyear = currentYear + 1;
            String endYear = String.valueOf(endyear);

            WebElement endyearr = findElement(endyearDD);
            endyearr.click();
            Select sel = new Select(endyearr);
            sel.selectByVisibleText(endYear);


        }
        if (arr[1].contains("02")) {
            Endmonth = "February";
        }

        if (arr[1].contains("03")) {
            Endmonth = "March";
        }

        if (arr[1].contains("04")) {
            Endmonth = "April";
        }
        if (arr[1].contains("05")) {
            Endmonth = "May";
        }

        if (arr[1].contains("06")) {
            Endmonth = "June";
        }

        if (arr[1].contains("07")) {
            Endmonth = "July";
        }

        if (arr[1].contains("08")) {
            Endmonth = "August";
        }

        if (arr[1].contains("09")) {
            Endmonth = "September";
        }

        if (arr[1].contains("10")) {
            Endmonth = "October";
        }
        if (arr[1].contains("11")) {
            Endmonth = "November";
        }
        if (arr[1].contains("12")) {
            Endmonth = "December";
        }


        return Endmonth;


    }

    public String directDebitfuturefreqMonth() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        String date = dtf.format(now); //---->> 29/03/2022
        String[] arr = date.split("/");
        String dateToday = arr[0];// ----->>29
        String currentmonth = arr[1];
        String currentyear = arr[2];
        int currentMonth = Integer.parseInt(currentmonth);
        int endmonth = currentMonth + 2;
        arr[1] = String.format("%02d", endmonth);
        String Endmonth = null;
        if (arr[1].contains("13")) {
            Endmonth = "January";
            int currentYear = Integer.parseInt(currentyear);
            int endyear = currentYear + 1;
            String endYear = String.valueOf(endyear);

            WebElement endyearr = findElement(futureFreqyearDD);
            endyearr.click();
            Select sel = new Select(endyearr);
            sel.selectByVisibleText(endYear);


        }
        if (arr[1].contains("14")) {
            Endmonth = "February";
            int currentYear = Integer.parseInt(currentyear);
            int endyear = currentYear + 1;
            String endYear = String.valueOf(endyear);

            WebElement endyearr = findElement(futureFreqyearDD);
            endyearr.click();
            Select sel = new Select(endyearr);
            sel.selectByVisibleText(endYear);


        }


        if (arr[1].contains("02")) {
            Endmonth = "February";
        }

        if (arr[1].contains("03")) {
            Endmonth = "March";
        }

        if (arr[1].contains("04")) {
            Endmonth = "April";
        }
        if (arr[1].contains("05")) {
            Endmonth = "May";
        }

        if (arr[1].contains("06")) {
            Endmonth = "June";
        }

        if (arr[1].contains("07")) {
            Endmonth = "July";
        }

        if (arr[1].contains("08")) {
            Endmonth = "August";
        }

        if (arr[1].contains("09")) {
            Endmonth = "September";
        }

        if (arr[1].contains("10")) {
            Endmonth = "October";
        }
        if (arr[1].contains("11")) {
            Endmonth = "November";
        }
        if (arr[1].contains("12")) {
            Endmonth = "December";
        }


        return Endmonth;


    }

    public String directDebitftreTerminationMonth() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();

        String date = dtf.format(now); //---->> 29/03/2022
        String[] arr = date.split("/");
        String dateToday = arr[0];// ----->>29
        String currentmonth = arr[1];
        String currentyear = arr[2];
        int currentMonth = Integer.parseInt(currentmonth);
        int endmonth = currentMonth + 2;
        arr[1] = String.format("%02d", endmonth);
        String Endmonth = null;
        if (arr[1].contains("13")) {
            Endmonth = "January";
            int currentYear = Integer.parseInt(currentyear);
            int endyear = currentYear + 1;
            String endYear = String.valueOf(endyear);

            WebElement endyearr = findElement(futureTerYear);
            endyearr.click();
            Select sel = new Select(endyearr);
            sel.selectByVisibleText(endYear);


        }


        if (arr[1].contains("13")) {
            Endmonth = "January";
            int currentYear = Integer.parseInt(currentyear);
            int endyear = currentYear + 1;
            String endYear = String.valueOf(endyear);

            WebElement endyearr = findElement(futureTerYear);
            endyearr.click();
            Select sel = new Select(endyearr);
            sel.selectByVisibleText(endYear);


        }

        if (arr[1].contains("14")) {
            Endmonth = "February";
            int currentYear = Integer.parseInt(currentyear);
            int endyear = currentYear + 1;
            String endYear = String.valueOf(endyear);

            WebElement endyearr = findElement(futureTerYear);
            endyearr.click();
            Select sel = new Select(endyearr);
            sel.selectByVisibleText(endYear);


        }
        if (arr[1].contains("02")) {
            Endmonth = "February";
        }

        if (arr[1].contains("03")) {
            Endmonth = "March";
        }

        if (arr[1].contains("04")) {
            Endmonth = "April";
        }
        if (arr[1].contains("05")) {
            Endmonth = "May";
        }

        if (arr[1].contains("06")) {
            Endmonth = "June";
        }

        if (arr[1].contains("07")) {
            Endmonth = "July";
        }

        if (arr[1].contains("08")) {
            Endmonth = "August";
        }

        if (arr[1].contains("09")) {
            Endmonth = "September";
        }

        if (arr[1].contains("10")) {
            Endmonth = "October";
        }
        if (arr[1].contains("11")) {
            Endmonth = "November";
        }
        if (arr[1].contains("12")) {
            Endmonth = "December";
        }


        return Endmonth;


    }

    public void directDebit() throws InterruptedException {
        WebElement directdebit = findElementClickable(DirectDebit);
        scrollIntoView(directdebit);
        directdebit.click();

        log.info("clickedDirectDebit");

    }

    public void verifyTwoWaysweepAccount(String toaccount, String fromaccount, String Maxamount, String Minimumamount) {
        WebElement Sweeptype = findElement(SweepType);
        String SweepTypee = Sweeptype.getText();
        WebElement Sweepfromaccount = findElement(sweepfromaccpont);
        String sweepfromAccount = Sweepfromaccount.getText();

        WebElement Sweeptoaccount = findElement(sweeptoaccount);
        String SweeptoAccount = Sweeptoaccount.getText();
        WebElement Minamt = findElement(minamt);
        String MinimumAmount = Minamt.getText();
        String minamount = MinimumAmount.replace(",", "");
        WebElement Maxamt = findElement(maxamt);
        String MaximumAmount = Maxamt.getText();
        String maxamount = MaximumAmount.replace(",", "");
        WebElement Freqsweep = findElement(freqsweep);
        String frequencySweep = Freqsweep.getText();
        Assert.assertTrue(SweepTypee.contains("Two Way Sweep") && sweepfromAccount.contains(fromaccount) && SweeptoAccount.contains(toaccount) && maxamount.contains(Maxamount) && minamount.contains(Minimumamount) && frequencySweep.contains("Every working day"));
highlightUsingJs(Minamt);
        highlightUsingJs(Sweeptoaccount);
        highlightUsingJs(Sweepfromaccount);

    }

    public void verifybalancemaintenancesweepOverview(String surplusamount) {
        WebElement BalanceAvailable = findElement(balanceAvailable);
        String availablebalance = BalanceAvailable.getText();
        String avbalance = availablebalance.replace(",", "");
        Assert.assertTrue(avbalance.contains(surplusamount));


    }

    public void verifySurplussweepOverview(String surplusamount) {
        WebElement BalanceAvailable = findElement(balanceAvailable);
        String availablebalance = BalanceAvailable.getText();
        String avbalance = availablebalance.replace(",", "");
        Assert.assertTrue(avbalance.contains(surplusamount));

    }

    public void commitment(String amount1) {

        WebElement Commitment = findElement(commitment);
        Commitment.click();
        WebElement amount = findElement(Amount);
        amount.sendKeys(amount1);

    }

    public void rollover(String period) throws Exception {
        WebElement Rollover = findElement(rollover);
        Rollover.click();

        clickElement(rollover);


        WebElement Renewalperiod = findElement(renewalperiod);
        Renewalperiod.sendKeys(period);
    }

    public void advancedPayout(String accountnum) {
        WebElement Advancepayout = findElement(advancedpayout);
        Advancepayout.click();
        WebElement activedeposit = findElement(activeDeposit);
        activedeposit.click();
        WebElement Activedeposite = findElement(activeDeposit);
        Select sel = new Select(Activedeposite);
        sel.selectByVisibleText("Yes");
        WebElement PayOutAccount = findElement(depositclosureActive);
        PayOutAccount.click();
        WebElement PayoutAccount1 = findElement(depositclosureActive);
        PayoutAccount1.clear();
        WebElement PayoutAccount = findElement(depositclosureActive);
        PayoutAccount.sendKeys(accountnum);
    }

    public void setttlement(String payOut) {
        WebElement Settlement = findElement(settlement);
        Settlement.click();
        WebElement Advancepayout = findElement(advancedpayout);
        Advancepayout.click();
        WebElement Payout = findElement(payout);
        Payout.sendKeys(payOut);
    }

    public void findLoan() throws InterruptedException {
        switchToDefault();
        //Thread.sleep(1000);
        WebElement innerFrame2 = findElement(innerframe);
        switchToFrame(innerFrame2);

        WebElement Operationsmenu1 = findElement(operationsmenu);
        Operationsmenu1.click();
        Thread.sleep(1000);
        WebElement findLoan = findElement(findloan);
        findLoan.click();
        Thread.sleep(200);
        switchToDefault();
        WebElement creaatePaymentframe = findElement(creaatepaymentframe);
        switchToFrame(creaatePaymentframe);
        WebElement Unauthorised = findElement(unauthorised);
        Unauthorised.click();
//				Thread.sleep(1000);
        WebElement Unauthorised1 = findElement(unauthorised);
        Unauthorised1.click();
    }

    public void findAuthorisedLoan() throws Exception {
        switchToDefault();
        //Thread.sleep(1000);
        WebElement innerFrame2 = findElement(innerframe);
        switchToFrame(innerFrame2);

        WebElement Operationsmenu1 = findElement(operationsmenu);
        Operationsmenu1.click();
        Thread.sleep(1000);
        WebElement findLoan = findElement(findloan);
        findLoan.click();
        Thread.sleep(200);
        switchToDefault();
        WebElement creaatePaymentframe = findElement(creaatepaymentframe);
        switchToFrame(creaatePaymentframe);
        WebElement Authorised1 = findElement(authorised);
        //Authorised1.click();
        actions(Authorised1);

    }

    public void findClosedLoan() throws Exception {
        switchToDefault();
        //Thread.sleep(1000);
        WebElement innerFrame2 = findElement(innerframe);
        switchToFrame(innerFrame2);

        WebElement Operationsmenu1 = findElement(operationsmenu);
        Operationsmenu1.click();
        Thread.sleep(1000);
        WebElement findLoan = findElement(findloan);
        findLoan.click();
        Thread.sleep(200);
        switchToDefault();
        WebElement creaatePaymentframe = findElement(creaatepaymentframe);
        switchToFrame(creaatePaymentframe);
        WebElement Authorised1 = findElement(closed);
        //Authorised1.click();
        actions(Authorised1);

    }

    public void findClosedAccount(String arrangement) throws Exception {
        switchToDefault();
        //Thread.sleep(1000);
        WebElement innerFrame2 = findElement(innerframe);
        switchToFrame(innerFrame2);

        WebElement Operationsmenu1 = findElement(operationsmenu);

        Operationsmenu1.click();

        WebElement findaccount = findElement(findAccount);
        findaccount.click();
        Thread.sleep(200);
        switchToDefault();
        WebElement creaatePaymentframe = findElement(creaatepaymentframe);
        switchToFrame(creaatePaymentframe);
        WebElement Authorised1 = findElement(closed);
        //Authorised1.click();
        actions(Authorised1);
        WebElement ArrangementField = findElement(Arrangementfield);
        ArrangementField.clear();
        WebElement ArrangementFiield = findElement(Arrangementfield);
        ArrangementFiield.sendKeys(arrangement);
        //	ArrangementFiield.sendKeys("AA19158684FQ");
        //"AA19158ZG389
        WebElement findarrangement = findElement(findArrangement);
        findarrangement.click();
        overview();
        switchwindows();
        maximize();


    }

    public void desbusementClick() {
        WebElement Desbursement = findElement(desbursement);
        Desbursement.click();

        log.info("Click on desbursement....");
    }

    public void disbursementdDetails(String accountnumber, String amount, String SourceDesciption, String destinationDesciption) {
        WebElement Desbursement = findElement(desbursement);
        Desbursement.click();

        log.info("Click on desbursement....");
        WebElement destinationAcntNo = findElement(DestinationAcntno);
        log.info("Entering destination account number");


        destinationAcntNo.sendKeys(accountnumber);
        WebElement DestinationName = findElement(destinationName);
        DestinationName.click();
        WebElement Description = findElement(Descriptiion);
        Description.click();
        Description.sendKeys(SourceDesciption);

        WebElement DestinationDescription = findElement(destinationDescription);
        DestinationDescription.click();
        DestinationDescription.sendKeys(destinationDesciption);
//					 WebElement Signatory=driver.findElement(signatory);
//					 Signatory.sendKeys(signator);
        WebElement Amountfield = findElement(amountfield);
        Amountfield.click();
        log.info("Entering amount");
        log.info("Entering amount");

        Amountfield.sendKeys(amount);
        WebElement Calender = findElement(calendarRepay);
        Calender.click();
        WebElement Currentdate = findElement(currentdatedesbursement);
        Currentdate.click();

    }

    public void requestPayoffclick() throws InterruptedException {
        Thread.sleep(1000);
        WebElement RequestPayoff = findElement(requestpayoff);
        RequestPayoff.click();
    }

    public void payoffStatementClick() {
        WebElement PayoffStatement = findElement(payoffStatement);
        PayoffStatement.click();

        log.info("Click on Payyoff statement....");
    }

    public String getPayoffStatementAmount() {
        WebElement PayoffStatementAmount = findElement(payoffStatementAmount);
        String Payoffamount = PayoffStatementAmount.getText();
        return Payoffamount;
    }

    public void loanpayoffClick() {
        WebElement LoanPayoff = findElement(loanPayoff);
        LoanPayoff.click();

        log.info("click on loan payoff");
    }

    public void loanPayOffDetails(String accountnumber, String SourceDesciption, String destinationDesciption, String signator, String amount) {
        WebElement sourceAcntNumber = findElement(sourceAcntnumber);
        log.info("enetering source account number");

        sourceAcntNumber.sendKeys(accountnumber);
        WebElement SourceAccoutName = findElement(sourceAcntname);
        SourceAccoutName.click();
        WebElement Description = findElement(Descriptiion);
        Description.click();
        Description.sendKeys(SourceDesciption);
        WebElement DestinationDescription = findElement(destinationDescription);
        DestinationDescription.click();
        DestinationDescription.sendKeys(destinationDesciption);
        WebElement Signatory = findElement(signatory);
        Signatory.clear();
        //Signatory.sendKeys(signator);
        WebElement Amountfield = findElement(amountfield);
        Amountfield.click();
        log.info("Entering amount");
        Amountfield.sendKeys(amount);
        WebElement Calender = findElement(calendarRepay);
        Calender.click();
        WebElement Currentdate = findElement(currentDateloanpayyoff);
        Currentdate.click();


    }

    public void verifyLoanClosure(String arrangement) {
        String statusOverview = findElement(overviewstatusDeposit).getText();
        String arrangementOverview = findElement(arrangementoverviewNewLoan).getText();
        Assert.assertTrue(statusOverview.contains("Pending Closure") && arrangementOverview.contains(arrangement));
        log.info("Loan closure verified");


    }
    public void verifyLoanCurrentStatus(String arrangement) {
        String statusOverview = findElement(overviewstatusDeposit).getText();
        String arrangementOverview = findElement(arrangementoverviewNewLoan).getText();
        Assert.assertTrue(statusOverview.contains("Current") && arrangementOverview.contains(arrangement));
        log.info("Loan status verified");


    }

    public void verifyDepositClosureStatus(String arrangement) {
        WebElement Maturitydate = findElement(maturityDate);
        String maturitydate = Maturitydate.getText();
        String arrangementOverview = findElement(arrangementoverviewNewLoan).getText();

        String statusOverview = findElement(overviewstatusDeposit).getText();
        Assert.assertTrue(statusOverview.contains("Closed") && arrangementOverview.contains(arrangement));
        {
            log.info("depositclosureverified");
            //TestBase tb = new TestBase();
            //tb.logExtentReport("verified deposit closure status....");

        }
    }

    public void AccountClosureStatus(String arrangement) {
        // WebElement Maturitydate=driver.findElement(maturityDate);
        //String maturitydate= Maturitydate.getText();
        String arrangementOverview = findElement(arrangementnewloan).getText();
        String statusOverview = findElement(statusarranmentnewaccount).getText();
        Assert.assertTrue(statusOverview.contains("Closed") && arrangementOverview.contains(arrangement));
        {
            log.info("Accountclosureverified");
            //TestBase tb=new TestBase();
            //  tb.logExtentReport("verified account closure status....");

        }
    }

    public void partialwithdrawal(String amount) {
        WebElement PartialwithdrawalAmount = findElement(partialwithdrawalamount);
        PartialwithdrawalAmount.sendKeys(amount);
    }

    public void withdrawalStatementclick() {
        WebElement withdrawelStatement = findElement(withDrawalstatement);
        withdrawelStatement.click();

        log.info("Click on withdrawal statement....");

    }

    public void withdrawalNarrative(String date, String amount) {
        //this.driver = driver;
        WebElement withdrawelFRAME = findElement(withdrawalFrame);
        switchToFrame(withdrawelFRAME);
        for (int i = 3; i <= 30; i++) {
            String a = findElement(By.xpath("//*[@id='datadisplay']/tbody/tr[" + i + "]/td[1]")).getText();
            if (a.contains(date)) {
                String b = findElement(By.xpath("//*[@id='datadisplay']//tbody/tr[" + i + "]/td[3]")).getText();
                if (b.contains(amount)) {
                    WebElement c = findElement(By.xpath("//*[@id='datadisplay']//tbody/tr[" + i + "]/td[4]"));
                    c.click();
                    clickElementUsingJavaScript(c);
                    break;
                }

            }
        }
    }

    public void debitNarrativesPartialWithdrawal(String description, String amount, String transactiondate) {

        for (int i = 1; i <= 30; i++) {
            if (i == 20) {
                WebElement next = findElement(nextpage);
                next.click();
                i = 1;
            }
            String a = findElement(By.xpath("(//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[7])")).getText();
            if (a.contains(amount)) {

                String Date = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[6]")).getText();
                String actualAmount = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[7]")).getText();
                String d = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[4]")).getText();
                String b = findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[9]")).getText();
                log.info("checking debit");
                Assert.assertTrue(actualAmount.contains(amount) && b.contains("Debit") && d.contains("Partial Withdrawal"));
                {
                    WebElement credit_debit= findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[9]"));
                    WebElement newBalancee= findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[8]"));
                    WebElement actualAmountt= findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[7]"));
                    WebElement Description= findElement(By.xpath("//table[@id='enquiryResponseData']//tbody/tr[" + i + "]/td[4]"));

                    highlightUsingJs(credit_debit);
                    highlightUsingJs(newBalancee);
                    highlightUsingJs(actualAmountt);
                    highlightUsingJs(Description);
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
                    System.out.print(transactiondate + "  ");
                    System.out.print(actualAmount + " ");
                    System.out.print(b);
                    log.info("Debit narrative verified...");
                    break;
                }

            }
        }

    }

    public void proceedWithdrawal(String date, String amount) {
        switchToDefault();
        WebElement proceedWithdrawelframe = findElement(proceedWithdrawelFrame);
        switchToFrame(proceedWithdrawelframe);
        WebElement proceedWithdate = findElement(proceedWithdrawDate);
        String Date = proceedWithdate.getText();
        WebElement proceedWithdrawamount = findElement(proceedWithdrawAmount);
        String Amount = proceedWithdrawamount.getText();
        if (Date.contains(date) && Amount.contains(amount)) {
            WebElement proceedWithdrawel = findElement(provceedWithdrawal);
            proceedWithdrawel.click();
            switchToDefault();
            WebElement Versionframe = findElement(versionFrame);
            switchToFrame(Versionframe);

        }
    }

    public void partialwithdrawalClick() throws InterruptedException {
        Thread.sleep(1000);
        WebElement Partialwithdrawal = findElement(partialwithdrawal);
        Partialwithdrawal.click();

        log.info("Click on partial withdrawal....");
    }

    public void openLoan(String Arrangement) throws InterruptedException {
        WebElement ArrangementField = findElement(Arrangementfield);
        ArrangementField.clear();
        WebElement ArrangementFiield = findElement(Arrangementfield);
        ArrangementFiield.sendKeys(Arrangement);
        WebElement findarrangement = findElement(findArrangement);
        findarrangement.click();
        overview();
        switchwindows();
        windowMaximize();
    }

    public void openLoanForrepayment(String Arrangement) throws InterruptedException {
        WebElement ArrangementField = findElement(Arrangementfield);
        ArrangementField.clear();
        WebElement ArrangementFiield = findElement(Arrangementfield);
        ArrangementFiield.sendKeys(Arrangement);
        WebElement findarrangement = findElement(findArrangement);
        findarrangement.click();
        Thread.sleep(500);
    }

    public void loanfind(String status) throws Exception {
        //this.driver = driver;
        for (int i = 1; i <= 120; i++) {
            String a = findElement(By.xpath("//*[contains(@id,'datadisplay_workarea')]/tbody/tr[" + i + "]/td[6]")).getText();
            if (a.contains(status)) {
                WebElement view = findElementClickable(By.xpath("//*[contains(@id,'datadisplay_workarea')]/tbody/tr[" + i + "]/td[7]"));
                scrollIntoView(view);
                actions(view);
                //clickElementUsingJavaScript(view);
                //view.click();
                break;
            }

        }
    }

    public void findClosedLoan(String Arrangement) throws InterruptedException {
        switchToDefault();

        WebElement innerFrame2 = findElement(innerframe);
        switchToFrame(innerFrame2);

        WebElement Operationsmenu1 = findElement(operationsmenu);
        Operationsmenu1.click();

        WebElement findLoan = findElement(findloan);
        findLoan.click();

        switchToDefault();
        WebElement creaatePaymentframe = findElement(creaatepaymentframe);
        switchToFrame(creaatePaymentframe);
        WebElement closedLoan = findElement(closedloan);
        closedLoan.click();

        WebElement closedLoan1 = findElement(closedloan);
        closedLoan1.click();

        WebElement ArrangementField = findElement(Arrangementfield);
        ArrangementField.clear();


        WebElement ArrangementFiield = findElement(Arrangementfield);
        ArrangementFiield.sendKeys(Arrangement);

        WebElement findarrangement = findElement(findArrangement);
        findarrangement.click();

    }

    public void repaymentsclick() {
        WebElement rePayments = findElement(Repayment);
        rePayments.click();
        log.info("Click on loan repayment....");
    }

    public void repaymentsdetails(String accountnumber, String SourceDesciption, String destinationDesciption, String signator, String amount) throws Exception {
        Thread.sleep(1000);
        WebElement sourceacntBSB = findElementClickable(sourceAcntBSB);
        WebElement sourceAcntNumber = findElementClickable(sourceAcntnumber);
        sourceAcntNumber.click();
        WebElement SourceAcntNumber = findElementClickable(sourceAcntnumber);
        log.info("entering source account number");
        SourceAcntNumber.clear();
        SourceAcntNumber.sendKeys(accountnumber);
        validate();
        WebElement SourceAccoutName = findElement(sourceAcntname);
        SourceAccoutName.click();
        WebElement Description = findElementClickable(Descriptiion);
        Description.click();
        Description.sendKeys(SourceDesciption);
        WebElement DestinationDescription = findElementClickable(destinationDescription);
        DestinationDescription.click();
        DestinationDescription.sendKeys(destinationDesciption);
        WebElement Signatory = findElementClickable(signatory);
        Signatory.sendKeys(signator);
        WebElement Amountfield = findElement(amountfield);
        Amountfield.click();
        log.info("Entering amount");
        Amountfield.sendKeys(amount);
        WebElement Calender = findElement(calendarRepay);
        Calender.click();
        WebElement Currentdate = findElement(currentdateRepay);
        Currentdate.click();
    }

    public String getAccountnumber() {
        WebElement accountno = findElement(accountnum);
        String accountnumber = accountno.getText();
        String accountNumber = accountnumber.substring(0, 9);
        return accountNumber;
    }

    public String getArrangement() {
        WebElement accountno = findElement(arrangementoverviewNewLoan);
        String Arrangement = accountno.getText();
        return Arrangement;
    }


    public void verifyCreateNewLoan(String arrangement, String tradedate, String customernumber, String productname) throws InterruptedException {
        WebElement arrangentoverview = findElement(arrangementoverviewNewLoan);
        String a = arrangentoverview.getText();
        System.out.println(a);
        WebElement pdctoverview = findElement(productDeposit);
        String b = pdctoverview.getText();
        System.out.println(b);
        WebElement Dateoverview = findElement(overviewDteDeposit);
        String c = Dateoverview.getText();
        System.out.println(c);
        WebElement beneficialOrder = findElement(BeneficialOwnerDeposit);
        String d = beneficialOrder.getText();
        System.out.println(d);
        WebElement StatusOverview = findElement(overviewstatusDeposit);
        String e = StatusOverview.getText();
        System.out.println(e);
        Assert.assertTrue(a.contains(arrangement) && c.contains(tradedate) && b.contains(productname) && e.contains("Not Disbursed"));
        {
            log.info("create a new loan verified....");
        }
    }

    public void findDeposit(String Arrangement) throws InterruptedException {
        switchToDefault();

        WebElement innerFrame2 = findElement(innerframe);
        switchToFrame(innerFrame2);

        List<WebElement> wb = findElements(finddeposit);
        for (WebElement we : wb) {
            if (we.isDisplayed() && we.isEnabled()) {
                we.click();
            } else {
                WebElement Operationsmenu1 = findElement(operationsmenu);
                Operationsmenu1.click();
                WebElement findDeposit1 = findElement(finddeposit);
                findDeposit1.click();

                log.info("Click on find deposit....");

            }

            switchToDefault();
            WebElement creaatePaymentframe = findElement(creaatepaymentframe);
            switchToFrame(creaatePaymentframe);

            WebElement ArrangementField = findElement(Arrangementfield);
            ArrangementField.clear();


            WebElement ArrangementFiield = findElement(Arrangementfield);
            ArrangementFiield.sendKeys(Arrangement);
            WebElement findarrangement = findElement(findArrangement);
            findarrangement.click();
        }
    }

    public void verifyPartialWithdrawel(String arrangement, String date, String amount) {

        String arrangementOverview = findElement(arrangementoverviewNewLoan).getText();


        for (int i = 1; i < 10; i++) {
            String b = findElement(By.xpath("//*[contains(@id,'datadisplay_Log')]/tbody/tr[" + i + "]/td[4]")).getText();
            if (i == 10) {
                WebElement next = findElement(nextpage);
                next.click();
                i = 1;
            }
            if (b.contains(amount)) {

                String a = findElement(By.xpath("//*[contains(@id,'datadisplay_Log')]/tbody/tr[" + i + "]/td[1]")).getText();
                /// String b = findElement(By.xpath("//*[contains(@id,'datadisplay_Log')]/tbody/tr[" + i + "]/td[4]")).getText();

                Assert.assertTrue(arrangementOverview.contains(arrangement) && a.contains(date) && b.contains(amount));
                log.info("Partial withdrawel verified");

                log.info("Partial withdrawel verified....");
            }
            break;
        }

    }


    public void acceptoverrideonBalanaceLessthanZero() throws InterruptedException {
        waitForPageToLoad(1000);
        List<WebElement> nobalance = findElements(lessbalance);
        if (nobalance.size() > 0) {
            WebElement acceptoveride = findElement(acceptoverride);
            acceptoveride.click();
        }

    }

    public void destinationDetailsPeriodicExternal(String SourceDesciption, String bsb, String accountnumber, String destinationname2, String destinationDesciption, String amount) {

        WebElement Description = findElement(Descriptiion);
        Description.click();
        Description.sendKeys(SourceDesciption);
        WebElement destinationAcntBsb = findElement(DestinationAcntBsb);
        destinationAcntBsb.clear();
        destinationAcntBsb.sendKeys(bsb);

        WebElement destinationAcntNo = findElement(DestinationAcntno);
        log.info("Entering destination account number");
        //TestBase tb=new TestBase();
        //tb.logExtentReport("Entering destination account number");

        destinationAcntNo.sendKeys(accountnumber);
        WebElement DestinationName = findElement(destinationName);
        DestinationName.click();
        WebElement DestinationName1 = findElement(destinationName);
        DestinationName1.clear();
        WebElement DestinationName2 = findElement(destinationName);
        DestinationName2.sendKeys(destinationname2);
        WebElement DestinationDescription = findElement(destinationDescription);
        DestinationDescription.click();
        DestinationDescription.sendKeys(destinationDesciption);

        WebElement Amountfield = findElement(periodicPaymentAmount);
        Amountfield.click();
        log.info("Entering amount");

        //tb.logExtentReport("Entering amount");

        Amountfield.sendKeys(amount);
        WebElement frequency = findElement(frequencyDrop);
        frequency.click();
        WebElement save = findElement(savePeriodic);
        save.click();
        WebElement CalenderStart = findElement(calenderPeriodicStart);
        CalenderStart.click();
        WebElement Currentdate = findElement(currentDatePeriodic);
        Currentdate.click();
        WebElement CalenderEnd = findElement(calenderPeriodicEnd);
        CalenderEnd.click();
        WebElement month = findElement(endDate);
        month.click();

        String Month = PeriodicPayftreTerminationMonth();
        WebElement month1 = findElement(endDate);
        month1.click();
        Select sel = new Select(month1);
        //String nextmonth=periodicNextMonth();
        sel.selectByVisibleText(Month);

        WebElement datePeriodic = findElement(DatePeriodic);
        datePeriodic.click();
    }

    public void destinationDetailsPeriodic(String SourceDesciption, String accountnumber, String destinationDesciption, String amount) {

        WebElement Description = findElement(Descriptiion);
        Description.click();
        Description.sendKeys(SourceDesciption);
//			WebElement destinationAcntBsb=findElement(DestinationAcntBsb);
//			destinationAcntBsb.sendKeys(bsb);

        WebElement destinationAcntNo = findElement(DestinationAcntno);
        log.info("Entering destination account number");
//        TestBase tb=new TestBase();
//        tb.logExtentReport("Entering destination account number");

        destinationAcntNo.sendKeys(accountnumber);
        WebElement DestinationName = findElement(destinationName);
        DestinationName.click();
        WebElement DestinationName1 = findElement(destinationName);
        // DestinationName1.clear();
        WebElement DestinationName2 = findElement(destinationName);
        //  DestinationName2.sendKeys(destinationname2);
        WebElement DestinationDescription = findElement(destinationDescription);
        DestinationDescription.click();
        DestinationDescription.sendKeys(destinationDesciption);

        WebElement Amountfield = findElement(periodicPaymentAmount);
        Amountfield.click();
        log.info("Entering amount");

        // tb.logExtentReport("Entering amount");

        Amountfield.sendKeys(amount);
        WebElement frequency = findElement(frequencyDrop);
        frequency.click();
        WebElement save = findElement(savePeriodic);
        save.click();
        WebElement CalenderStart = findElement(calenderPeriodicStart);
        CalenderStart.click();
        WebElement Currentdate = findElement(currentDatePeriodic);
        Currentdate.click();
        WebElement CalenderEnd = findElement(calenderPeriodicEnd);
        CalenderEnd.click();
        WebElement month = findElement(endDate);
        month.click();

        String Month = PeriodicPayftreTerminationMonth();
        WebElement month1 = findElement(endDate);
        month1.click();
        Select sel = new Select(month1);
        //String nextmonth=periodicNextMonth();
        sel.selectByVisibleText(Month);

        WebElement datePeriodic = findElement(DatePeriodic);
        datePeriodic.click();
    }


    public String PeriodicPayftreTerminationMonth() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();

        String date = dtf.format(now); //---->> 29/03/2022
        String[] arr = date.split("/");
        String dateToday = arr[0];// ----->>29
        String currentmonth = arr[1];
        String currentyear = arr[2];
        int currentMonth = Integer.parseInt(currentmonth);
        int endmonth = currentMonth + 2;
        arr[1] = String.format("%02d", endmonth);
        String Endmonth = null;
        if (arr[1].contains("13")) {
            Endmonth = "January";
            int currentYear = Integer.parseInt(currentyear);
            int endyear = currentYear + 1;
            String endYear = String.valueOf(endyear);

            WebElement endyearr = findElement(periodicfutureTerYear);
            endyearr.click();
            Select sel = new Select(endyearr);
            sel.selectByVisibleText(endYear);


        }


        if (arr[1].contains("13")) {
            Endmonth = "January";
            int currentYear = Integer.parseInt(currentyear);
            int endyear = currentYear + 1;
            String endYear = String.valueOf(endyear);

            WebElement endyearr = findElement(periodicfutureTerYear);
            endyearr.click();
            Select sel = new Select(endyearr);
            sel.selectByVisibleText(endYear);


        }

        if (arr[1].contains("14")) {
            Endmonth = "February";
            int currentYear = Integer.parseInt(currentyear);
            int endyear = currentYear + 1;
            String endYear = String.valueOf(endyear);

            WebElement endyearr = findElement(periodicfutureTerYear);
            endyearr.click();
            Select sel = new Select(endyearr);
            sel.selectByVisibleText(endYear);


        }
        if (arr[1].contains("02")) {
            Endmonth = "February";
        }

        if (arr[1].contains("03")) {
            Endmonth = "March";
        }

        if (arr[1].contains("04")) {
            Endmonth = "April";
        }
        if (arr[1].contains("05")) {
            Endmonth = "May";
        }

        if (arr[1].contains("06")) {
            Endmonth = "June";
        }

        if (arr[1].contains("07")) {
            Endmonth = "July";
        }

        if (arr[1].contains("08")) {
            Endmonth = "August";
        }

        if (arr[1].contains("09")) {
            Endmonth = "September";
        }

        if (arr[1].contains("10")) {
            Endmonth = "October";
        }
        if (arr[1].contains("11")) {
            Endmonth = "November";
        }
        if (arr[1].contains("12")) {
            Endmonth = "December";
        }


        return Endmonth;


    }


    public void loanPayoffapprove() throws InterruptedException {
        WebElement Loanpayoffaprove = findElement(loanpayoffaprove);
        Loanpayoffaprove.click();
        switchwindows();
        windowMaximize();
        WebElement Authorisedeal = findElement(authorisedeall);
        Authorisedeal.click();
        WebElement TxnComplete = findElement(txnComplete);
        TxnComplete.getText();

    }

    public void verifyLoanClosureStatus(String arrangement) {
        WebElement Maturitydate = findElement(maturityDate);
        String maturitydate = Maturitydate.getText();
        String arrangementOverview = findElement(arrangementoverviewNewLoan).getText();

        String statusOverview = findElement(overviewstatusDeposit).getText();

        Assert.assertTrue(arrangementOverview.contains(arrangement) && statusOverview.contains("Closed"));
        {
            log.info("Loan closure verified");
            //  TestBase tb=new TestBase();
            //tb.logExtentReport("Loan closure verified....");

        }
    }


    public void findclosedDeposit(String Arrangement) throws InterruptedException {
        switchToDefault();
        //Thread.sleep(1000);
        WebElement innerFrame2 = findElement(innerframe);
        switchToFrame(innerFrame2);
//              WebElement findDeposit=findElement(finddeposit);
//				boolean b=findDeposit.isDisplayed();
//				if(b==true)
        List<WebElement> wb = findElements(finddeposit);
        for (WebElement we : wb) {
            if (we.isDisplayed() && we.isEnabled()) {
                we.click();
            } else {
                WebElement Operationsmenu1 = findElement(operationsmenu);
                Operationsmenu1.click();

                WebElement findDeposit1 = findElement(finddeposit);
                findDeposit1.click();
                // TestBase tb=new TestBase();
                //tb.logExtentReport("Click on find deposit....");
                //Thread.sleep(200);
            }
//				WebElement Operationsmenu1=driver.findElement(operationsmenu);
//				Operationsmenu1.click();
//				Thread.sleep(1000);
//				WebElement findDeposit=driver.findElement(finddeposit);
//				findDeposit.click();
//				Thread.sleep(200);
            switchToDefault();
            WebElement creaatePaymentframe = findElement(creaatepaymentframe);
            switchToFrame(creaatePaymentframe);

            WebElement closedLoan = findElement(closeddeposit);
            closedLoan.click();
            //Thread.sleep(1000);
            WebElement closedLoan1 = findElement(closeddeposit);
            closedLoan1.click();

            WebElement ArrangementField = findElement(Arrangementfield);
            ArrangementField.clear();

            WebElement ArrangementFiield = findElement(Arrangementfield);
            ArrangementFiield.sendKeys(Arrangement);

            WebElement findarrangement = findElement(findArrangement);
            findarrangement.click();
            overview();
            switchwindows();
            windowMaximize();
        }


    }


    public void cobDateCheck() {

        WebElement Dropdowncobcheckdate = findElement(dropdowncobcheckdate);
        Dropdowncobcheckdate.click();
        //String sourcecode=getPageSourcecode();
        //System.out.println(sourcecode);
//*[@id='dropDownTable:transactionId']//tbody//tr[2]//td[2]
        
        WebElement today=findElement(By.xpath("//*[@id='dropDownTable:transactionId']//tbody//tr[2]//td[2]"));
        String datetoday=today.getText();
        String date=datePickIBM();
       // Assert.assertTrue(date.contains(date));
        highlightUsingJs(today);

        WebElement todayCOB=findElement(By.xpath("//*[@id='dropDownTable:transactionId']//tbody//tr[3]//td[2]"));
        scrollIntoView(todayCOB);
        String datetodayCOB=today.getText();
        String dateCOB=datePickIBM();
        highlightUsingJs(todayCOB);
       //Assert.assertTrue(datetodayCOB.contains(dateCOB));
        //highlightUsingJs(todayCOB);

       // zoomout();

        //hooks.takeScreenshot(hooks.scenario);

        }
    public void cobDateCheckk() {

       // WebElement Dropdowncobcheckdate = findElement(dropdowncobcheckdate);
      //  Dropdowncobcheckdate.click();
        //String sourcecode=getPageSourcecode();
        //System.out.println(sourcecode);
//*[@id='dropDownTable:transactionId']//tbody//tr[2]//td[2]

        WebElement today=findElement(By.xpath("//*[@id='dropDownTable:transactionId']//tbody//tr[2]//td[2]"));
        String datetoday=today.getText();
        String date=datePickIBM();
        // Assert.assertTrue(date.contains(date));
        //highlightUsingJs(today);

        WebElement todayCOB=findElement(By.xpath("//*[@id='dropDownTable:transactionId']//tbody//tr[3]//td[2]"));
       // scrollIntoView(todayCOB);
        String datetodayCOB=today.getText();
        String dateCOB=datePickIBM();
        //highlightUsingJs(todayCOB);
        Assert.assertTrue(datetodayCOB.contains(dateCOB));
        //highlightUsingJs(todayCOB);

        // zoomout();

        //hooks.takeScreenshot(hooks.scenario);

    }


public void RegisterclientClick(){
    WebElement Registrerclient = findElementClickable(RegistrerClient);
    Registrerclient.click();

}
public void RetrieveClient(String username){
    WebElement RetrieveClientNumber = findElementClickable(retrieveClientNumber);
    RetrieveClientNumber.sendKeys(username);
    WebElement Retrivebtn = findElementClickable(retrivebtn);
    Retrivebtn.click();
    WebElement Regristeredmsg = findElement(regristeredmsg);
    String msg=Regristeredmsg.getText();
    Assert.assertTrue(msg.contains("This member is already registered"));
    highlightUsingJs(Regristeredmsg);
}
public void ceckT24(){
    //label[text()='Customer ID']
    WebElement cust=findElement(By.xpath(" //label[text()='Customer ID']"));
}
}






