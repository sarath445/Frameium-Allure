package com.frameium.pageobject.UFS;

import com.aventstack.extentreports.Status;
import com.frameium.genericfunctions.GenericFunctions;
import com.frameium.logger.LoggerHelper;
import org.apache.log4j.Logger;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.*;

import static org.testng.Assert.assertEquals;
import static org.testng.internal.Utils.log;

public class IBHomePage extends GenericFunctions {

    By inboxinitiationmsg = By.xpath("//*[@id='C1__QUE_9131B365DC0282A8306361_R1']");
    By txtUsername = By.xpath("(//*[contains(@id,'i0')])[2]");
    By txtPassword = By.xpath("(//*[contains(@id,'i0')])[2]");
    By txtPhoneNumber = By.xpath("//*[@id='idDiv_SAOTCS_Proofs']/div[1]/div");
    By txtNextButton = By.xpath("//*[@id='idSIButton9']");
    By txtPhone = By.xpath("//*[@id='idSIButton9']");
    By txtNextButtonPassword = By.xpath("//*[@id='idSIButton9']");
    By txtYesButton = By.xpath("//*[@id='idSIButton9']");
    By txtVerify = By.xpath("//*[@id='idSubmit_SAOTCC_Continue']");

    By txtUsernameIB = By.xpath("//input[@id='C1__USER_NAME']");
    By txtPasswordIB = By.xpath("//*[@id='C1__QUE_21AA8B8279AB849B5250']");
    By txtloginButton = By.xpath("//*[@id='C1__BUT_A951E61CB653E2BE42929']");
    By txtAccountButton = By.xpath("//button[@value='Go to Accounts']");
    By txttransferButton = By.xpath("//*[@id='ITM_TransferPay']/a");
    By txtIBbalance = By.xpath("(//span[@class='Grid_Accountdetails tooltipUxp'])[9]");
    By txtInvestment = By.xpath("//*[@id='ITM_Accounts']/a");

    By txtIbbalance60 = By.xpath("(//span[@class='Grid_Accountdetails tooltipUxp'])[3]");

    By txtIbbalance802 = By.xpath("(//span[@class='Grid_Accountdetails tooltipUxp'])[3]");

    By txtIbbalance4 = By.xpath("//*[@id='C13__QUE_B98A13A114FA087C32582']");

    By link_tranaction = By.xpath("(//span[text()='Transactions'])[1]");

    By drp_tranaction = By.xpath("//*[@id='C1__QUE_F572981281C315F61223333']");

    By drp_dateRange = By.xpath("//*[@id='C1__QUE_3B23E03AEED6622F531284']");

    By btn_Search = By.xpath("//*[@id='C1__BUT_4423BA3AEA505C9932504']");

    //By btn_calendar = By.xpath("//*[@id='C1__p4_START_DATE']/div/div/img");
    //(//*[@alt="Calendar"])[1]
    By btn_calendar = By.xpath("(//*[@alt='Calendar'])[1]");
    //(//*[@alt="Calendar"])[2]
    By btn_Endcalendar = By.xpath("(//*[@alt='Calendar'])[2]");

    //By btn_Endcalendar = By.xpath("//*[@id='C1__p4_END_DATE']/div/div/img");

    By btn_today = By.xpath("//a[@class='ui-state-default ui-state-highlight']");


    By Search = By.xpath("//*[@id='C1__BUT_D5D56AC103266333451343']");


    By nxtPage = By.xpath("//a[@aria-label='Next page']");

    By btn_goToContact = By.xpath("//*[@id='BUT_E9553CBEE9D994071810131']/span");
    By btn_addContact = By.xpath("//*[@id='C1__BUT_760B584AEFA6F9CF89381']");
    By drp_paymentType = By.xpath("//*[@id='C1__QUE_FE50288965D3E908722428']");

    //*[@id="C1__QUE_FE50288965D3E908722428"]
    By txt_bSB = By.xpath("//*[@id='C1__QUE_827F64A8625A533580055']");
    By txt_billerCode = By.xpath("//*[@id='C1__QUE_111378B239E4F5C7587354']");

    By txt_NameEdit = By.xpath("//*[@id='C1__QUE_111378B239E4F5C7688549']");
    By txt_nickNameEdit = By.xpath("//*[@id='C1__QUE_A1581DE1B7AFD6B9356922']");

    By txt_confirmEdit = By.xpath("//*[@id='C1__BUT_13A2B1830AB160FC25995']");
    By txt_confirmEdit1 = By.xpath("//*[@id='C1__BUT_2CC5183D4E1CC00084255']");

    By txt_returnEdit = By.xpath("	//*[@id='C1__BUT_2CC5183D4E1CC000169765']");
    By contacts = By.xpath("(//span[text()='Contacts'])[1]");

    By txt_AccountNumber = By.xpath("//*[@id='C1__QUE_827F64A8625A533580054']");
    By txt_AccountName = By.xpath("//*[@id='C1__QUE_26DDCC1E1D82836A1676519']");

    By txt_biilerCrnCode = By.xpath("//*[@id='C1__QUE_111378B239E4F5C7587356']");
    By txt_biilerName = By.xpath("//*[@id='C1__QUE_76259CB21CAFB723348862']");

    By btn_continue = By.xpath("//*[@id='C1__BUT_27856426A56528BF2293066']");

    By btn_gotoAccount = By.xpath("//*[@id='C1__BUT_4460EA5C365F6A49155041']");
    By billername = By.xpath("(//*[text()='Biller Name']/following::*)[3]");

    By txt_userAccount = By.xpath("//*[@id='C3__QUE_B98A13A114FA087C32581']");
    By drp_userAccount = By.xpath("//*[@id='QUE_A97A225C708C1E9F291992']");
    By txt_userAccount1 = By.xpath("//*[@id='C8__row_QUE_B98A13A114FA087C32581']");
    By txt_userAccount2 = By.xpath("//*[@id='C9__row_QUE_B98A13A114FA087C32581']");
    By txt_userAccount3 = By.xpath("//*[@id='C10__row_QUE_B98A13A114FA087C32581']");
    By txt_userAccount4 = By.xpath("//*[@id='C6__row_QUE_B98A13A114FA087C32581']");
    By txt_userAccount5 = By.xpath("//*[@id='C13__row_QUE_B98A13A114FA087C32581']");
    By txt_userAccount6 = By.xpath("//*[@id='C7__row_QUE_B98A13A114FA087C32581']");
    By txt_userAccount7 = By.xpath("//*[@id='C8__QUE_9133748334BF25F7405136']");
    By txt_inbox = By.xpath("//*[@id='BUT_54FA2383E897E37F329341']/span");
    By txt_inbox_User_view = By.xpath("//*[@id='C1__BUT_158BD9B48FC22906290774_R1']");
    By txt_inbox_User_view1 = By.xpath("//*[@id='C1__BUT_158BD9B48FC22906290774_R2']");
    //*[@id='C1__BUT_158BD9B48FC22906290774_R2']
    By txt_inbox_User_viewMsg = By.xpath("//*[@id='C1__QUE_9131B365DC0282A8306361_R1']");

    By txt_inbox_User_viewMsg1 = By.xpath("//*[@id='C1__QUE_9131B365DC0282A8306361_R1']");

    By txt_userAccount8 = By.xpath("//*[@id='C16__QUE_9133748334BF25F7405136']");

    By txt_NickName = By.xpath("//*[@name='C1__LOCALPAYEE[1].NEWPAYEENICKNAME']");
    By txtdropDownExternal = By.xpath("(//*[contains(@id,'C1__QUE_FE87')])[1]");
    By toaccountnamefield = By.xpath("//*[@id='C1__QUE_5DFE13BF59422EAF6967']");
    By toaccountBSBfield = By.xpath("//*[@id='C1__QUE_5DFE13BF59422EAF6969']");
    By toaccountAccountNumfield = By.xpath("//*[@id='C1__QUE_5DFE13BF59422EAF6968']");

    By FuturteDateField = By.xpath("//*[@id='C1__QUE_5DFE13BF59422EAF8899']");
    By toaccount = By.xpath("//option[contains(text(),'806043')])[1]");
    By toaccountdropdown = By.xpath("//*[@name='C1__SENDMONEY[1].SAVEDPAYEELIST']");
    By txtpayAnyone = By.xpath("//span[text()='Pay anyone']");
    By newcontactButton = By.xpath("//*[text()='A New Contact']/preceding-sibling::*");

    By txtselectValueExternal = By.xpath("(//*[contains(@id,'C1__QUE_5DFE1')])[4]");
    By txtexternalAmount = By.xpath("//*[@name='C1__MAKEPAYMENT[1].TRANSACTIONAMOUNT']");
    By txtmyDescription = By.xpath("//*[@name='C1__MAKEPAYMENT[1].PAYMENTREFERENCE']");
    By txttheirDescription = By.xpath("//input[@id='C1__QUE_34095685F494875F305308']");
    //By txtcontinueButton = By.xpath("//*[@value='Continue']");

    By txtcontinueButton = By.xpath("//*[@id='C1__BUT_5DFE13BF59422EAF6991']");

    By accountNum = By.xpath("//*[contains(@name,'value:1:1:1')]");
    By txt_amountEFT = By.xpath("//span[text()='Amount']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_')]");
    By txt_theirDesEFT = By.xpath("//span[text()='Their Description']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_')]");
    By txtReturnToAuth = By.xpath("//button[@title='Return to authorisations']");
    By nextpage = By.xpath("//a[@title='Next Page']");
    By nextpageMsg = By.xpath("//*[@aria-label='Next page']");
    By next_page = By.xpath("//*[@id='C1__ANCHOR_TABLE_8FC336E4FF60A39A_FormTable_87_PAG_BOTTOM_2']");

    By txtTacoount = By
            .xpath("//span[text()='To']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_BA')]");
    By txtVerifyamount = By
            .xpath("//span[text()='Amount']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE')]");
    By txtVerifyDescription = By.xpath(
            "/html/body/form[1]/div[5]/div[2]/div[1]/div[22]/div[2]/div/span");
    By txtVerifyNow = By.xpath(
            "//span[text()='When']//ancestor::*[@class='row row-margin  ']//span[@class='form-control RADIO_LABEL']");
    By txtVerifyFuture = By.xpath(
            "//span[text()='Transfer Date']//ancestor::*[@class='row row-margin  ']//span[@class='form-control']");
    By txtVerifyFrequency = By
            .xpath("//span[text()='Frequency']//ancestor::*[@class='row row-margin  ']//span[@class='form-control']");
    By txtVerifyRecurringSdate = By.xpath(
            "//span[text()='Start Date']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE')]");
    By txtVerifyRecurringEdate = By
            .xpath("//span[text()='End Date']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE')]");

    // label[text()='End Date']//ancestor::*[@class='row row-margin
    // ']//span[contains(@id,'C1__QUE')]
    // label[text()='Frequency']//ancestor::*[@class='row row-margin
    // ']//span[@class='form-control']
    By txt_toAccountEFT = By.xpath("//span[text()='To']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_')]");

    By txt_toAccountEFT1 = By.xpath("//span[text()='To Contact']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_')]");


    By txt_billercode = By.xpath("//span[text()='Biller Code']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_')]");
    By txt_nickname = By.xpath("//span[text()='Nickname']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_')]");
    By toaccountbpayReviewpament = By.xpath("(//*[text()='To Contact']//following::div[contains(@id,'C1__p4_QUE_D')])[1]");

    By txtVerifyClosefaccount = By
            .xpath("//span[text()='From']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE')]");
    By txtVerifyCloseTaccount = By
            .xpath("//span[text()='To']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE')]");
    By txtVerifyCloseAmount = By
            .xpath("//span[text()='Amount']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE')]");
    By txtVerifyCloseNow = By
            .xpath("//span[text()='When']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE')]");
    By txtVerifyCloseDes = By.xpath(
            "//span[text()='Description']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_5')]");
    By txtVerifyCloseStartDate = By.xpath(
            "//span[text()='Start Date']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE')]");
    By txtVerifyCloseEndDate = By
            .xpath("//span[text()='End Date']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE')]");
    By txtVerifyCloseFrequency = By.xpath(
            "//span[text()='Frequency']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE')]");
    // label[text()='Start Date']//ancestor::*[@class='row row-margin
    // ']//span[contains(@id,'C1__QUE')]
    By txtconfirmButton = By.xpath("//*[@value='Confirm']");
    By txtCloseButton = By.xpath("//*[@value='Close']");
    By txtCloseFutureDateVerify = By.xpath(
            "(//span[text()='When'])[2]//following::span[text()='Now']");
    // label[text()='Transfer Date']//ancestor::*[@class='row row-margin
    // ']//span[contains(@id,'C1__QUE')]
    By txt_accountNum = By.xpath("//*[contains(@name,'value:1:1:1')]");
    By txt_myDes = By.xpath("//span[text()='My Description']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_')]");

    By txt_find = By.xpath("//*[@id='enqsel']/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table/tbody/tr/td[3]/div/table/tbody/tr/td/a");
    By txtexternalAtFutureButton = By.xpath("(//*[@name='C1__MAKEPAYMENT[1].WHENTOPAY'])[2]");
    By txtexternalAtFutureAmount = By.xpath("//*[@name='C1__MAKEPAYMENT[1].TRANSACTIONAMOUNT']");
    By txtCalendar = By.xpath("//img[@class='ui-datepicker-trigger']");
    By txt_Calendar = By.xpath("//input[@name='C1__MAKEPAYMENT[1].FUTUREDATE']");
    By txtMonth = By.xpath("//*[@id='ui-datepicker-div']/div/div/select[1]");
    By txt_approve = By.xpath("//button[@value='Approve']");

    By txt_returnToAuth = By.xpath("//button[@value='Return to authorisations']");
    By txt_date = By.xpath("(//input[@type='text'])[4]");
    By txt_authMessage = By.xpath("//div[text()='You have successfully approved this transaction. Other account holders still remain to finalise this process']");
    By txt_authMessage1 = By.xpath("//div[text()='The transaction has been successfully approved and processed']");
    //div[text()='The transaction has been successfully approved and processed']
    By txt_authFrom = By.xpath("//span[text()='From Account']//ancestor::*[@class='row row-margin  ']//span[@class='form-control']");
    By txt_authTo = By.xpath("//span[text()='To Account']//ancestor::*[@class='row row-margin  ']//span[@class='form-control']");
    By txt_viewAuthTo = By.xpath("//span[text()='To Account']//ancestor::*[@class='row row-margin form-row  ']//span[@class='form-control']");
    By txt_viewAuthFrom = By.xpath("//span[text()='From Account']//ancestor::*[@class='row row-margin form-row  ']//span[@class='form-control']");
    By txt_viewAmount = By.xpath("//span[text()='Amount']//ancestor::*[@class='row row-margin form-row  ']//span[@class='form-control']");
    By txt_viewDescription = By.xpath("//span[text()='Description']//ancestor::*[@class='row row-margin form-row  ']//span[@class='form-control']");
    By txt_viewuthTransDate = By.xpath("//span[text()='Transfer Date']//ancestor::*[@class='row row-margin form-row  ']//span[@class='form-control']");


    //span[text()='From Account']//ancestor::*[@class='row row-margin form-row  ']//span[@class='form-control']
    By txt_authAmount = By.xpath("//span[text()='Amount']//ancestor::*[@class='row row-margin  ']//span[@class='form-control']");
    By txt_authDes = By.xpath("//span[text()='Description']//ancestor::*[@class='row row-margin  ']//span[@class='form-control']");
    By txt_authTransDate = By.xpath("//span[text()='Transfer Date']//ancestor::*[@class='row row-margin  ']//span[@class='form-control']");
    By txt_viewAuthTransDate = By.xpath("//span[text()='Transfer Date']//ancestor::*[@class='row row-margin form-row  ']//span[@class='form-control']");

    By txt_authStartDate = By.xpath("//span[text()='Start Date']//ancestor::*[@class='row row-margin  ']//span[@class='form-control']");
    By txt_viewAuthStartDate = By.xpath("//span[text()='Start Date']//ancestor::*[@class='row row-margin form-row  ']//span[@class='form-control']");
    By txt_authEndDate = By.xpath("//span[text()='End Date']//ancestor::*[@class='row row-margin  ']//span[@class='form-control']");
    By txt_viewAuthEndDate = By.xpath("//span[text()='End Date']//ancestor::*[@class='row row-margin form-row  ']//span[@class='form-control']");
    By txt_authFrequency = By.xpath("//span[text()='Frequency']//ancestor::*[@class='row row-margin  ']//span[@class='form-control']");
    By txt_viewAuthFrequency = By.xpath("//span[text()='Frequency']//ancestor::*[@class='row row-margin form-row  ']//span[@class='form-control']");
    By txt_authWhen = By.xpath("//span[text()='When']//ancestor::*[@class='row row-margin  ']//span[@class='form-control']");
    By btn_viewApprove = By.xpath("//*[@id='C1__BUT_BF846DFC132B5620181416']");
    By authorizationapprovemsg = By.xpath("//*[text()='The transaction has been successfully approved and processed']");
    By amountbatchpaymentreviewauth = By.xpath("(//span[text()='Amount']//following::div)[2]");
    By toaccountbatchpaymentreviewauth = By.xpath("(//span[text()='To Account']//following::div)[2]");
    By Description = By.xpath("(//span[text()='Description']//following::div)[2]");
    //By txtDate = By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[2]/a");
    By fromaccountReviewpaymentbatch = By.xpath("((//span[text()='From Account'])[2]/following::span[contains(@id,'C1__QUE_E54E6FE')])[1]");
    By txtDate = By.xpath("(//a[@class='ui-state-default'])[28]");
    By DescriptionAuth = By.xpath("(((//span[text()='Description'])[2])//following::*)[2]");
    By txtRecurringButton = By.xpath("(//*[(@name='C1__MAKEPAYMENT[1].WHENTOPAY')])[3]");
    By txtDropdownRecuringExternal = By.xpath("(//*[contains(@id,'C1__QUE_FE870B35')])[1]");
    By txtDropdown2RecuringExternal = By.xpath("(//*[contains(@id,'C1__QUE_5DFE13BF5')])[4]");
    By txtExternalAmount = By.xpath("//*[@name='C1__MAKEPAYMENT[1].TRANSACTIONAMOUNT']");
    By txtRecurringCalaendar1 = By.xpath("(//*[contains(@id,'C1__p1_PAYMENT')]/following::img)[1]");
    By txtRecurringDate = By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[7]/a");
    By txtExternalfrequency = By.xpath("//select[@name='C1__STANDINGORDER[1].FREQUENCY']");
    By txtrecurringExternalCalaendar2 = By.xpath("(//*[contains(@id,'C1__p4_PAYMENT')]/following::img)[1]");
    By txtlogOut = By.xpath("//*[@id='ITM_LOGOUT']/a");
    By txtusernameSecond = By.xpath("//*[@id='C1__USER_NAME']");
    By txtpasswordSecond = By.xpath("//*[@id='C1__QUE_21AA8B8279AB849B5250']");
    By txtloginButtonAuth = By.xpath("//*[@id='C1__BUT_A951E61CB653E2BE42929']");
    By txtAuthApprove = By.xpath("//*[@id='C1__BUT_991F13D11F52DF60911126']");
    By txtAuth = By.xpath("//*[@id='BUT_06DAC4E323901C91145835']/span");


    By txtreturnAuthApprove = By.xpath("//*[@id='C1__BUT_E54E6FE46A5BD5E9163693']");
    By txtt24Username = By.xpath("//*[@id='signOnName']");
    By txtt24Password = By.xpath("//*[@id='password']");
    By txtt24Login = By.xpath("//*[@id='sign-in']");
    By txtAuthorization = By.xpath("(//*[contains(@id,'BUT_06DAC')])[3]");
    By txtT24page = By.xpath("//*[@id='pane_']/div[2]//descendant::input");
    By txtT24Tick = By.xpath("//*[@id='cmdline_img']");
    By txtInnerFrame = By.xpath("//*[contains(@id,'LOSHOMEPAGE')]");
    By txtgeneralEnquiry = By.xpath("//*[@id='pane_']/ul[10]/li/span");
    By txtIbView = By.xpath("//*[@id='pane_']/ul[10]/li/ul/li[20]/a");
    By txtIbRecurring = By.xpath("(//*[@name='C1__MAKEPAYMENT[1].WHENTOPAY'])[3]");
    By txtConfirmationVerify = By.xpath("//*[text()='Please check your details below and confirm if they are correct.']");
    By txt_closeMessage = By.xpath("//div[text()='Your payment has been created and is awaiting approval before being processed']");
    //*[text()='Your payment has been created and is awaiting approval before being processed']
    By txt_closeDesc = By.xpath("/html/body/form[1]/div[5]/div[2]/div[1]/div[1]/div[25]/div[2]");
    By txtCloseVerify = By.xpath("//div[text()='Your payment has been created and is awaiting approval before being processed']");
    By txtCloseVerifyy = By.xpath("//*[text()='Your payment has been created and is awaiting approval before being processed']");

    By txtibviewframe = By.xpath("//*[contains(@id,'FRAMETAB')]");
    // By txtAccountNum=By.xpath("(//*[contains(@class,'oper')]/following::td)[1]");
    // *[@id="value:2:1:1"]
    // By txtAccountNum=By.xpath("//*[contains(@name,'value:1:1:1')and
    // contains(@class,'enqseldata enqseldata_RMBETCIBTRANSLIST')]");
    By txtAccountNum = By.xpath("//label[text()='CustomerAcctNumber']//../../..//input[@type='text']");

    By t24Date = By.xpath("//*[@id='value:2:1:1']");

    By txtscheduled = By.xpath("//*[@id='BUT_F572981281C315F61188390']/span");
    By txtscheduledEdit = By.xpath("//*[@id='C1__BUT_3292993CBD222564645590_R1']");


    By txteditedAmount = By.xpath("//*[@id='C1__QUE_E4A10E769E2AAC9020248']");


    By btn_Confirm = By.xpath("//*[@id='C1__BUT_E4A10E769E2AAC9020257']");

    By btn_Confirm1 = By.xpath("//*[@id='C1__BUT_8AC4F200506A107C573240']");

    By btn_Continue = By.xpath("//*[@id='C1__BUT_EF50701D5C17A62E91958']");


    // By txtAccountNum=By.xpath("//*[contains(@name,'value:2:1:1')and
    // contains(@class,'enqseldata enqseldata_RMBETCIBTRANSLIST')]");
    By txtFind = By.xpath(
            "//*[@id='enqsel']/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table/tbody/tr/td[3]/div/table/tbody/tr/td/a");
    By txtSecureMail = By.xpath("//input[@title='Secure Mail']");
    By txtSubID = By.xpath("//*[@id='txtFilUName']");
    By txtIbmDateFrom = By.xpath("//*[@id='txtFilSDate']");
    By txtIbmDateTo = By.xpath("//*[@id='txtFilToDate']");
    By txtRetrieve = By.xpath("//*[@id='btnRetrieve']");
    By txtNew = By.xpath("//*[@id='btnNewMessage']");
    By txtNewSubID = By.xpath("//*[@id='txtClientLookup']");
    By txtNewSendFrom = By.xpath("//*[@id='txtSendFrom']");
    By txtNewSubject = By.xpath("//*[@id='txtSendSubject']");
    By txtNewSubIDRetrieve = By.xpath("//*[@id='btnSendRetrieve']");
    By txtErrorNew = By.xpath("//*[text()='Unable to retrieve client details']");

    By txtNewToAllFrom = By.xpath("//*[@id='txtSendFrom']");
    By txtNewToAllSubject = By.xpath("//*[@id='txtSendSubject']");
    By txtNewToAllPriority = By.xpath("//*[@id='ddlImportance']");
    By txtNewToAllDescription = By.xpath("//*[@id='txtSendMessage']");
    By txtNewToAllSave = By.xpath("//*[@id='btnSendSave']");
    By txtBatch = By.xpath("//*[@id='BUT_1CF89CC9FD71094A150014']");
    By batchtemplate = By.xpath("(//span[text()='Batch Templates'])[1]");
    By txtNewBatch = By.xpath("//button[@value='New Batch']");
    By txt_NewBatch = By.xpath("//button[@title='New Batch Template']");
    By txtDebitBatch = By.xpath("//*[@id='C1__QUE_6B3CB4F685016B6C632180_0']");
    By txtDestinationAct = By.xpath("(//*[contains(@id,'C1__FS_QUE_6B3CB4F6')])");
    By txtdropdown = By.xpath("//*[@id='C1__QUE_2DE655DEC0957ACA205460']");
    By txtCredropdown = By.xpath("(//*[contains(@id,'C1__QUE')])[4]");

    By txtNewTemplate = By.xpath("//*[@id='C1__BUT_42C99E86FC2B987B4483']");
    By txt_NewTemplate = By.xpath("//button[@value='New Batch Template']");
    By txtdropdownValue = By.xpath("(//option[@value='1'])[1]");
    By txtFiledescription = By.xpath("//input[@value='PAY FE010917']");
    By txtFileAmount = By.xpath("(//span[@class='form-control'])[1]");

    By txtNewButton = By.xpath("(//*[contains(@id,'C1__QUE_DAE236C092955')])[1]");
    By txtOrganization = By.xpath(
            "//label[text()='Organisation Name']//ancestor::*[@class='row row-margin form-row  ']//input[@type='text']");
    By txtBatchDescription = By.xpath(
            "//label[text()='Description']//ancestor::*[@class='row row-margin form-row  ']//input[@type='text']");
    By txtToAccount = By.xpath("//*[@id='C1__QUE_E4B62FE30F30B98D98268']");

    By drp_ToAccount = By.xpath("//select[@id='C1__QUE_E4B62FE30F30B98D98268']");
    By txt_raw1 = By.xpath("//*[@id='C1__QUE_60CA8231C0CE5CF6124596_R1']");
    By txt_raw2 = By.xpath("//*[@id='C1__QUE_60CA8231C0CE5CF6124597_R1']");
    By txt_raw3 = By.xpath("//*[@id='C1__QUE_2DE655DEC0957ACA631443_R1']");
    By txt_rAw3 = By.xpath("//*[@id='C1__QUE_60CA8231C0CE5CF6124598_R1']");


    By txt_raw4 = By.xpath("//*[@id='C1__QUE_60CA8231C0CE5CF6124599_R1']");
    By txt_raw5 = By.xpath("//*[@id='C1__QUE_60CA8231C0CE5CF6124600_R1']");


    By txt_rwa2_coloumn1 = By.xpath("//*[@id='C1__QUE_60CA8231C0CE5CF6124596_R2']");
    By txt_rwa2_coloumn2 = By.xpath("//*[@id='C1__QUE_60CA8231C0CE5CF6124597_R2']");
    By txt_rwa2_coloumn3 = By.xpath("//*[@id='C1__QUE_2DE655DEC0957ACA631443_R2']");
    By txt_rwA2_coloumn3 = By.xpath("//*[@id='C1__QUE_60CA8231C0CE5CF6124598_R2']");


    By txt_rwa2_coloumn4 = By.xpath("//*[@id='C1__QUE_60CA8231C0CE5CF6124599_R2']");
    By txt_rwa2_coloumn5 = By.xpath("//*[@id='C1__QUE_60CA8231C0CE5CF6124600_R2']");


    By txt_auth_raw1_coloumn1 = By.xpath("//*[@id='C1__QUE_A39BB2132C2E2E2D725990_R1']");
    By txt_auth_raw1_coloumn2 = By.xpath("//*[@id='C1__QUE_A39BB2132C2E2E2D725993_R1']");
    By txt_auth_raw1_coloumn3 = By.xpath("//*[@id='C1__QUE_A39BB2132C2E2E2D725991_R1']");
    By txt_auth_raw1_coloumn4 = By.xpath("//*[@id='C1__QUE_A39BB2132C2E2E2D725994_R1']");
    By txt_auth_raw1_coloumn5 = By.xpath("//*[@id='C1__QUE_A39BB2132C2E2E2D725992_R1']");


    By txt_auth_raw2_coloumn1 = By.xpath("//*[@id='C1__QUE_A39BB2132C2E2E2D725990_R2']");
    By txt_auth_raw2_coloumn2 = By.xpath("//*[@id='C1__QUE_A39BB2132C2E2E2D725993_R2']");
    By txt_auth_raw2_coloumn3 = By.xpath("//*[@id='C1__QUE_A39BB2132C2E2E2D725991_R2']");
    By txt_auth_raw2_coloumn4 = By.xpath("//*[@id='C1__QUE_A39BB2132C2E2E2D725994_R2']");
    By txt_auth_raw2_coloumn5 = By.xpath("//*[@id='C1__QUE_A39BB2132C2E2E2D725992_R2']");


    By txt_description = By.xpath("(//*[contains(@id,'C1__QUE_DAE236C092955')])[1]");
    By txtTheirDescriptionBatch = By.xpath("//*[@aria-label='Their Description']");
    By txtAmountBatch = By.xpath("//*[@id='C1__QUE_CFC8AE856BB3A22C355830']");
    By txtCalendarBatch = By.xpath("//input[@id='C1__QUE_381758ECF486CF6B125713']");
    // *[@id="C1__p4_QUE_381758ECF486CF6B125713"]/div/div/img
    By txtBecID = By.xpath("//input[@name='C1__DIRECTDEBIT[1].BECID']");
    By txtTemplate = By.xpath("(//input[@type='radio'])[4]");
    By txtBatchCalendar = By.xpath("(//*[contains(@id,'C1__p4_QUE')])[5]");

    By txt_BatchOrganization = By.xpath("//input[@name='C1__BATCHPAYMENTS[1].BATCH[1].BATCHFORMDETAILS[1].BATCHNAME']");
    By txt_DesBatch = By.xpath("//input[@name='C1__BATCHPAYMENTS[1].BATCH[1].BATCHFORMDETAILS[1].MYDESCRIPTION']");
    By txt_total = By.xpath("/html/body/form[1]/div[4]/div[2]/div[5]/div[2]/div[1]/div[1]/div[1]/div/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[2]/div/div[6]/div/div[1]/div[1]/div[3]/div/div[3]/div[10]/div[2]/div/span");
    By totalamount = By.xpath("(//*[text()='Total']/following::*)[3]");
    By txtSelectTemplate = By.xpath("//*[@id='C1__QUE_DAE236C092955A11331334']");
    By txtContinue = By.xpath("//button[@value='Continue']");
    By txtaddNewcontact = By.xpath("//button[@value='Add Contact']");
    By txtpayNow = By.xpath("(//*[contains(@id,'C1__BUT_1301B65C55D1F1C')])[2]");
    By txtVerification = By.xpath("//*[@id='C1__p1_HEAD_D8A358C23C14C6B9259024']/div");
    By txtReturntoBatch = By.xpath("(//*[contains(@id,'C1__BUT_D8A')])[2]");
    By txtNewcontctBatch = By.xpath("//*[@id='C1__QUE_E4B62FE30F30B98D98190_1']");
    By txtacctNameBatch = By.xpath("(//*[contains(@id,'C1__QUE_E4B62')])[9]");
    By txtacctNumberBatch = By.xpath("//input[@name='C1__BATCHPAYMENTS[1].BATCH[1].BATCHFORMDETAILS[1].NEWCONTACT[1].ACCOUNTNUMBER']");
    By txtBSBBatch = By.xpath("(//*[contains(@id,'C1__QUE_CFC8')])[1]");
    By txtAmountBatch1 = By.xpath("(//*[contains(@id,'C1__QUE_CFC8AE856BB3')])[3]");
    By txtTheirDescriptionBatch1 = By.xpath("(//input[@class='form-control  '])[9]");
    By txtTheirDescriptionCreditBatch1 = By.xpath("//*[@id='C1__QUE_E4B62FE30F30B98D139363']");
    // input[@name='C1__BATCHPAYMENTS[1].BATCH[1].BATCHFORMDETAILS[1].THEIRDESCRIPTION']
    By txtBatchTotal = By.xpath(
            "//span[text()='Total Amount']//ancestor::*[@class='row row-margin form-row  ']//span[contains(@id,'C1__QUE_')]");
    By txtCredit = By.xpath("(//*[contains(@id,'C1__QUE')])[2]");
    By txtDebit = By.xpath("//input[@value='T']");
    By txtSourceAccount = By.xpath("(//select[@name='C1__BATCHPAYMENTS[1].BATCH[1].BATCHFORMDETAILS[1].FROMACCOUNT'])[1]");
    By txtOrganizationName = By.xpath("(//*[contains(@id,'C1__QUE')])[20]");
    By txtDescriptionCredit = By.xpath("(//*[contains(@id,'C1__QUE')])[22]");
    By txtLastLogin = By.xpath("(//*[contains(@id,'p1_HEAD')])[6]");
    By txtCustomerID = By
            .xpath("//*[contains(@name,'value:1:1:1')and contains(@class,'enqseldata enqseldata_UFSCUSTSCV')]");
    By txtDetails = By.xpath("//a[@title='Single Customer View']");
    // By txtAccount1=By.xpath("//*[contains(@id,'r1_AccountEnquiry')]/td[1]");
    By txtAccount1 = By.xpath("//*[contains(@id,'datadisplay_AccountEnquiry')]/tbody/tr[1]/td[3]");
    By txtAccount2 = By.xpath("//*[contains(@id,'r3_AccountEnquiry')]/td[3]");
    By txtamt1 = By.xpath("//*[contains(@id,'r1_AccountEnquiry')]/td[9]");
    By txtamt2 = By.xpath("//*[contains(@id,'r2_AccountEnquiry')]/td[9]");
    By txtaccountIB1 = By.xpath("(//*[contains(@id,'C3__BUT_B')])[1]");
    By txtaccountIB2 = By.xpath("(//*[contains(@id,'C4__BUT_B')])[1]");
    By txtouterFrame = By.xpath("//*[contains(@id,'FRAMETAB')]");
    By txtouterFrame1 = By.xpath("//*[contains(@id,'workarea')]");
    By txtouterFrame2 = By.xpath("//*[contains(@id,'NAME')]");
    By txtIBToUsername = By.xpath("//*[@id='lstUserId']");
    By txtBpayFuture = By.xpath("(//*[contains(@id,'C1__QUE_5DFE')])[6]");
    By txtBpay = By.xpath("//*[@id='BUT_F572981281C315F61188378']/span");
    By txtbPayFrom = By.xpath("(//*[contains(@id,'C1__QUE')])[4]");
    By txtbPayTo = By.xpath("(//*[contains(@id,'C1__QUE_CCC6881DFB')])[6]");
    By txtbPayAmount = By.xpath("//*[@name='C1__MAKEPAYMENT[1].TRANSACTIONAMOUNT']");

    By billercode = By.xpath("(//*[text()='Biller Code']/following::div[contains(@id,'C1__p4_QUE_CCC')])[1]");

    By billernamee = By.xpath("(//*[text()='Biller Name']/following::div[contains(@id,'C1__p4_QUE_CCC')])[1]");

    By billercodefield = By.xpath("//*[text()='Biller Code']/following::*[@name='C1__PAYABILL[1].BILLERCODE']");

    By billercrnfield = By.xpath("(//*[text()='Biller Crn Code']//following::*[@type='text'])[1]");

    By nicknamefield = By.xpath("//*[@name='C1__PAYABILL[1].NEWPAYEENICKNAME']");

    By txtbCalendar = By.xpath("//*[@id='C1__p4_QUE_5DFE13BF59422EAF8899']/div/div/img");
    By txtRecurringStart = By.xpath("//*[@id='C1__p4_PAYMENT_START']/div/div/img");
    By txtbMonth = By.xpath("//*[@id='ui-datepicker-div']/div/div/select[1]");
    By txtbDate = By.xpath("//table/tbody/tr[5]/td[3]");
    By txtbFrequency = By.xpath("//*[@id='C1__QUE_5DFE13BF59422EAF9019']");
    By txtbrecurring = By.xpath("(//*[contains(@id,'C1__PAYMENT')]/following::img)[2]");
    By txtbrecurringEnd = By.xpath("//*[@id='C1__p4_PAYMENT_END']/div/div/img");
    By txtBnewContact = By.xpath("(//*[contains(@id,'C1__QUE')])[2]");
    By txtBillerCode = By.xpath("//input[@id='C1__QUE_CCC6881DFBB8F0EF301472']");
    By txtBpaynewContactToAccount = By.xpath("//span[contains(@id,'C1__QUE_CCC6881DFBB8F0EF')]");

    By txtBpaynewContactfromAccount = By.xpath("//select[@name='C1__PAYABILL[1].FROMACCOUNTFORPAYABILL']");

    By txtBillerCrnCode = By.xpath("(//*[contains(@id,'C1__QUE')])[14]");
    By txtBNickName = By.xpath("//input[@name='C1__PAYABILL[1].NEWPAYEENICKNAME']");
    By txtBAmount = By.xpath("//input[@name='C1__MAKEPAYMENT[1].TRANSACTIONAMOUNT']");
    By txtbCalendar1 = By.xpath("(//*[@title='Calendar'])[1]");


    By txtbillerName = By.xpath("//*[@id='C1__QUE_CCC6881DFBB8F0EF301476']");

    By txtCreditTotal = By.xpath("(//span[@class='form-control'])[1]");

    By txtAtFuture = By.xpath("(//input[@type='radio'])[4]");
    By txtAtRecurring = By.xpath("//*[@id='C1__QUE_5DFE13BF59422EAF9864_2']");
    // By txtUpload=By.xpath("//input[@type='file']");
    By txtUpload = By.xpath("(//*[contains(@id,'C1__QUE')])[18]");
    By txt_Upload = By.xpath("//button[text()='Upload']");
    By txt_fileOrgName = By.xpath("//input[@name='C1__BATCHPAYMENTS[1].BATCH[1].BATCHFORMDETAILS[1].BATCHNAME']");
    By txt_fileDescription = By.xpath("//input[@name='C1__BATCHPAYMENTS[1].BATCH[1].BATCHFORMDETAILS[1].MYDESCRIPTION']");
    By txtFile = By.xpath("(//input[@type='radio'])[5]");
    By txtrecurringButton = By.xpath("(//*[@name='C1__MAKEPAYMENT[1].WHENTOPAY'])[3]");
    By txtdropDown = By.xpath("//*[@id='C1__QUE_7CB2575C8ECFCDB124839']");
    By txtselectValue = By.xpath("(//*[contains(@id,'C1__QUE_7CB2575')])[1]");
    By txtdropDown1 = By.xpath("//*[contains(@name,'C1__SENDMONEY[1].SAVEDPAYEELIST')]");
    By txtDropDown1 = By.xpath("//*[@id='C1__QUE_FE870B3563952CC32548626']");
    By todropdown = By.xpath("//*[@name='C1__MOVEMONEY[1].TOACCOUNTFORMOVEMONEY']");

    By txtselectValue3 = By.xpath("(//*[contains(@id,'C1__QUE_5DFE13')])[1]");
    By txttransferAmount = By.xpath("//input[@name='C1__MOVEMONEY[1].CREDITAMOUNT']");
    By txtdescription = By.xpath("//*[@name='C1__MAKEPAYMENT[1].PAYMENTREFERENCE']");
    By txtrecurringCalaendar1 = By.xpath("(//*[contains(@id,'C1__p1_PAYMENT')]/following::img)[1]");
    By txtrecurringStartDate = By.xpath("//*[@id='C1__PAYMENT_START']");
    //*[text()='Start Date']/following::input[@id='C1__PAYMENT_START']
    By txt_recurringEndDate = By.xpath("//*[@id='C1__PAYMENT_END']");
    By recurringButton = By.xpath("(//*[@name='C1__MAKEPAYMENT[1].WHENTOPAY'])[3]");

    By txtmonth = By.xpath("//*[@id='ui-datepicker-div']/div/div/select[1]");
    By txtcalendarDate1 = By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[7]/a");
    By txtfrequency = By.xpath("//select[@name='C1__STANDINGORDER[1].FREQUENCY']");
    By txtrecurringCalaendar = By.xpath("(//*[contains(@id,'C1__PAYMENT')]/following::img)[2]");
    By txtrecurringDate = By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[6]/a");
    By txtrecurringEndDate = By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[2]/a");
    By txtbatch = By.xpath("(//*[contains(@id,'BUT_1CF89CC9')])[3]/span");
    By txtbatchTemplate = By.xpath("(//*[contains(@id,'C1__BUT_42C99E')])[2]/span");
    By txtnewBatchTemplate = By.xpath("(//*[contains(@id,'C1__p4_BUT_5FCD668C4')])/div");
    By txtorganizationName = By.xpath("(//*[contains(@id,'C1__QUE_5FCD668C4')])[1]");
    By txttemplateDescription = By.xpath("(//*[contains(@id,'C1__QUE_5FCD668C4')])[3]");
    By txtregularPayment = By.xpath("(//*[contains(@id,'C1__QUE_5FCD668C4')])[11]");
    By txttheirDescriptionTemplate = By.xpath("(//*[contains(@id,'C1__QUE_DC7B8')])[1]");
    By txtaddContact = By.xpath("(//*[contains(@id,'C1__BUT_5FCD668C')])");
    By txttemplateTo = By.xpath("(//*[contains(@id,'C1__QUE_5FCD668C4')])[9]");
    By txtsaveButton = By.xpath("(//*[contains(@id,'C1__BUT_5FCD668C')])[3]");
    By txtreturnTO = By.xpath("(//*[contains(@id,'C1__BUT_1877EB2809')])[2]");
    By txtnewBatchTemplateButton = By.xpath("(//*[contains(@id,'C1__BUT_5FCD668C40CF0')])");
    By txtDropdown = By.xpath("//table/tbody/tr[1]/td[5]");
    By txtselectValue1 = By.xpath("(//*[contains(@id,'C1__QUE_7CB2575')])[1]");
    By txtdropdown1 = By.xpath("(//*[contains(@id,'C1__QUE_5DFE')])[1]");
    By txt_selectValue3 = By.xpath("(//*[contains(@id,'C1__QUE_5DFE13')])[1]");
    By txt_transferAmount = By.xpath("(//*[contains(@id,'C1__QUE_B3E6')])[2]");

    By txtmessageIB = By.xpath("//*[@id='ITM_Message']/a");
    By txtmessageView = By.xpath("//table/tbody/tr[1]/td[5]");
    By txtibManagerUsername = By.xpath("//input[@name='txtUsername']");
    By txtibManagerPassword = By.xpath("//input[@name='txtPassword']");
    By txtibManagerlogin = By.xpath("(//*[contains(@id,'cmdL')])");

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


    By txtsecureMail = By.xpath("((//*[contains(@id,'btnClientMain')])/following::input)[1]");
    By txtsubID = By.xpath("//*[@id='txtFilUName']");
    By txtibmDateFrom = By.xpath("//*[@id='txtFilSDate']");
    By txtibmDateTo = By.xpath("//*[@id='txtFilToDate']");
    By txtretreive = By.xpath("//*[@id='btnRetrieve']");
    By txtibmNewToAll = By.xpath("(//input[@type='submit'])[3]");
    By txtibMdrp = By.xpath("//*[@id='ddlTemplate']");

    By txtibmNewAllFrom = By.xpath("//*[@id='txtSendFrom']");
    By txtibmNewAllSubject = By.xpath("//*[@id='txtSendSubject']");
    By txtibmNewAllDescription = By.xpath("//*[@id='txtSendMessage']");
    By txtibmNewAllSave = By.xpath("//*[@id='btnSendSave']");
    By txtUrgentToAll = By.xpath("//*[@id='ddlImportance']");
    By txt_ibmAudit = By.xpath("//input[@title='Session History']");
    By txt_ibmSubId = By.xpath("//input[@name='txtUserName']");
    By txt_fromDate = By.xpath("//input[@name='txtStartDate']");
    By txt_toDate = By.xpath("//input[@name='txtEndDate']");

    By txt_error = By.xpath("//*[@id='lblMsgMsg']");

    By txt_ibmRetrieve = By.xpath("//input[@name='cmdRetrieve']");
    By txt_ibmView = By.xpath("(//a[text()='View'])[1]");
    By txt_ibmView_raw = By.xpath("//*[@id='dgvEvent']/tbody/tr[2]/td[3]");
    By txt_ibmView_raw_debit = By.xpath("//*[@id='dgvEvent']/tbody/tr[3]/td[2]");


    By txtnewContactOption = By.xpath("(//input[@type='radio'])[2]");
    By txt_organizationName = By.xpath("(//*[contains(@id,'C1__QUE_5FCD668C4')])[1]");
    By txt_templateDescription = By.xpath("(//*[contains(@id,'C1__QUE_5FCD668C4')])[3]");
    By txt_editTemplate = By.xpath("//*[@id='C1__BUT_6A71B67257D7679F188096_R1']");
    By txt_editAmount = By.xpath("//*[@id='C1__QUE_955E7729869411C986857']");
    By txt_editDescription1 = By.xpath("//*[@id='C1__QUE_955E7729869411C986858']");
    By btn_updateContact = By.xpath("//*[@id='C1__BUT_955E7729869411C986860']");

    By txttotal = By.xpath("//*[@id='C1__QUE_1877EB280953D48A233440']");


    By txt_toAccountName = By.xpath("(//*[contains(@id,'C1__QUE_5FCD6')])[11]");
    By txt_toAccountNum = By.xpath("(//*[contains(@id,'C1__QUE')])[9]");
    By txt_toaccountnumber = By.xpath("//*[@name='C1__BATCHPAYMENTS[1].TEMPLATE[1].TEMPLATEFORMDETAILS[1].CONTACTLISTS']");
    By txt_regularTempAmt = By.xpath("(//input[@type='text'])[3]");
    By txt_regularTempDes = By.xpath("(//input[@type='text'])[4]");
    By txt_toAccountNumber = By.xpath("(//*[contains(@id,'C1__QUE_5FCD6')])[13]");
    By txt_bsbNumber = By.xpath("(//*[contains(@id,'C1__QUE_5FCD6')])[15]");
    By txt_saveContact = By.xpath("(//*[contains(@id,'C1__QUE_5FCD6')])[17]");
    By txt_nickName = By.xpath("//input[@name='C1__BATCHPAYMENTS[1].TEMPLATE[1].TEMPLATEFORMDETAILS[1].NEWCONTACT[1].NICKNAME']");
    By txt_regularPaymentNew = By.xpath("(//*[contains(@id,'C1__QUE_5FCD6')])[19]");
    By txt_descriptionNew = By.xpath("//*[@name='C1__BATCHPAYMENTS[1].TEMPLATE[1].TEMPLATEFORMDETAILS[1].THEIRDESCRIPTION']");
    By txt_addContactNew = By.xpath("//button[text()='Add Contact']");
    By txt_saveButton = By.xpath("//button[text()='Save']");
    By txt_totalAmount1 = By.xpath("//*[@id='C1__QUE_5FCD668C40CF0678249217']");
    By txt_returnTO = By.xpath("(//*[contains(@id,'C1__BUT_1877EB2809')])[2]");
    By txt_NxtPage = By.xpath("//a[@aria-label='Next page']");
    By continuee = By.xpath("//button[text()='Continue']");
    By txt_delete = By.xpath("//*[@id=\"C1__QUE_8FC336E4FF60A39A242761_R1\"]");
    By deleteConfirm = By.xpath("//*[text()='Are you sure you want to delete this batch template?']");
    By txt_batchEdit = By.xpath("(//*[contains(@id,'C1__BUT_8FC336E4FF60A')])[2]");
    By txt_newBatchTemplate = By.xpath("(//*[contains(@id,'C1__p4_BUT_5FCD668C4')])/div)");
    By txt_newContactEdit = By.xpath("(//*[contains(@id,'C1__BUT_6A71B6')])[1]");
    By txt_editContact = By.xpath("(//*[contains(@id,'C1__QUE_955E7')])[1]");
    By txt_editDescription = By.xpath("(//*[contains(@id,'C1__QUE_955E7')])[3]");
    By txtupdateButton = By.xpath("(//*[contains(@id,'C1__BUT_955E7')])[2]");
    By txtwebtableDes = By.xpath("//table/tbody/tr[1]/td[4]");
    By txt_batchTemplate = By.xpath("(//*[contains(@id,'C1__BUT_42C99E')])[2]/span");
    By txt_deleteButton = By.xpath("(//*[contains(@id,'C1__p0_TBL_8FC336E4FF60A3')])");
    By txt_compose = By.xpath("//*[@id='BUT_F572981281C315F61188444']");
    By txt_dropdownMessage = By.xpath("(//*[contains(@id,'C1__QUE_F97758496')])[1]");
    By txt_subject = By.xpath("(//*[contains(@id,'C1__QUE_97B68FD1D')])[1]");
    By txt_messageDescription = By.xpath("(//*[contains(@id,'C1__QUE_962E38F5F4')])[1]");
    By txt_messageContinue = By.xpath("(//*[contains(@id,'C1__BUT_962E38F5F4E')])");
    By txt_messageSent = By.xpath("((//*[contains(@id,'BUT_F572981281C315')])/span)[12]");
    By txt_manage = By.xpath("//*[@id='ITM_Manage']/a");
    By txt_session = By.xpath("(//*[contains(@id,'BUT_43FFE78993BAE')])[1]");
    By txt_sessionCheck = By.xpath("(//*[contains(@id,'C1__BUT_72DC4973')])[4]");

    By txt_sessionCheck1 = By.xpath("//*[@id='p1_HEAD_2C6929C1E459C57F104500']/div/span[1]");
    By txt_returnToBatch = By.xpath("//button[@value='Return to batch payments']");
    By txt_dropdownIT = By.xpath("(//select[@name='C1__MOVEMONEY[1].FROMACCOUNTFORMOVEMONEY'])[1]");
    By txt_selectValue = By.xpath("//*[@id='C1__QUE_7CB2575C8ECFCDB124839']");


    By txt_selectValue1 = By.xpath("//*[@id='C1__QUE_5DFE13BF59422EAF6956']");

    By txt_dropDown1 = By.xpath("(//*[contains(@id,'C1__QUE_5DFE')])[1]");
    By txt_selectValue3IT = By.xpath("//select[@name='C1__MOVEMONEY[1].TOACCOUNTFORMOVEMONEY']");
    By txt_transferAmountIT = By.xpath("(//*[(@name='C1__MOVEMONEY[1].DEBITAMOUNT')])[2]");
    By transferamountexternal = By.xpath("//*[@name='C1__MAKEPAYMENT[1].TRANSACTIONAMOUNT']");
    By txt_descriptionIT = By.xpath("//*[@name='C1__MAKEPAYMENT[1].PAYMENTREFERENCE']");

    By txt_fromAccount = By
            .xpath("//span[text()='From']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_BA')]");

    By txt_faccountEFT = By.xpath("//span[text()='From']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_')]");
    By toaccountt = By.xpath("//*[@id='C1__QUE_D3FDAD0255A1888D127461']");
    By vrfy_Payment = By.xpath("//span[text()='Payment Type']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_')]");
    By vrfy_BSB = By.xpath("//span[text()='BSB']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_')]");
    By vrfy_paymentType = By.xpath("//span[text()='Payment Type']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_')]");
    By vrfy_BillerCode = By.xpath("//span[text()='Biller Code']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_')]");
    By vrfy_BillerName = By.xpath("//span[text()='Biller Name']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_')]");
    By vrfy_CustomerNumber = By.xpath("//span[text()='Customer Reference Number']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_')]");


    By vrfy_Accountnumber = By.xpath("//span[text()='Account number']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_')]");
    By vrfy_Accountname = By.xpath("//span[text()='Account name']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_')]");
    By vrfy_AccountName = By.xpath("//span[text()='Account Name']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_')]");
    By vrfy_ContactNickname = By.xpath("//span[text()='Contact Nickname']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_')]");
    By btn_confirm = By.xpath("//*[@id='C1__BUT_6C0E95F095B0AD39207427']");
    By Msg_confirm = By.xpath("//*[@id='C1__p1_HEAD_6C0E95F095B0AD39207599']/div");
    By Msg_confirm1 = By.xpath("//*[@id='C1__BUT_13A2B1830AB160FC233412']");


    By btn_return = By.xpath("//*[@id='C1__BUT_6C0E95F095B0AD39209218']");
    By btn_nextPage = By.xpath("//a[@aria-label='Next page']");
    By btn_deleteConfirm = By.xpath("//*[@id='C1__BUT_13A2B1830AB160FC233412']");
    By btn_deleteReturn = By.xpath("//*[@id='C1__BUT_13A2B1830AB160FC613027']");
    //*[@id='C1__BUT_13A2B1830AB160FC613027']
    By futurebutton = By.xpath("(//*[@name='C1__MAKEPAYMENT[1].WHENTOPAY'])[2]");
    By txt_atFutureButton = By.xpath("//*[contains(@id,'C1__FS_QUE_5D')]/div[2]");
    By txt_dropDownFuture = By.xpath("//*[@id='C1__QUE_7CB2575C8ECFCDB124839']");
    By txt_selectValueFuture = By.xpath("(//*[contains(@id,'C1__QUE_7CB2575')])[1]");
    By txt_dropDownFuture1 = By.xpath("(//*[contains(@id,'C1__QUE_5DFE')])[1]");
    By txt_transferAmountFuture = By.xpath("(//*[(@name='C1__MOVEMONEY[1].DEBITAMOUNT')and(@aria-label='Amount')])[2]");
    By txt_descriptionFuture = By.xpath("//*[@name='C1__MAKEPAYMENT[1].PAYMENTREFERENCE']");
    By txt_CalrndarFuture = By.xpath("//*[contains(@id,'C1__p4_QUE_5D')]/div/div/img");
    By txt_selectValue3Future = By.xpath("//*[@name='C1__MOVEMONEY[1].TOACCOUNTFORMOVEMONEY']");

    By txt_destinationAccount = By.xpath(
            "//span[text()='Destination Account']//ancestor::*[@class='row row-margin form-row  ']//span[contains(@id,'C1__QUE_')]");
    By txt_sourceAccount = By.xpath(
            "//span[text()='Source Account']//ancestor::*[@class='row row-margin form-row  ']//span[contains(@id,'C1__QUE_')]");
    By txt_postingDate = By.xpath(
            "//span[text()='Posting Date']//ancestor::*[@class='row row-margin form-row  ']//span[contains(@id,'C1__QUE_')]");
    By txt_template = By.xpath(
            "//span[text()='Selected Template']//ancestor::*[@class='row row-margin form-row  ']//span[contains(@id,'C1__QUE_')]");
    By txt_Organization = By.xpath(
            "//span[text()='Organisation Name']//ancestor::*[@class='row row-margin form-row  ']//span[contains(@id,'C1__QUE_')]");
    By txt_totalAmount = By.xpath(
            "//span[text()='Total Amount']//ancestor::*[@class='row row-margin form-row  ']//span[contains(@id,'C1__QUE_')]");
    By txt_Description = By.xpath(
            "//span[text()='Description']//ancestor::*[@class='row row-margin form-row  ']//span[contains(@id,'C1__QUE_')]");
    By txt_bPay = By.xpath("//*[@id='BUT_F572981281C315F61188378']/span");
    By txt_bPayselectValue3 = By.xpath("(//*[contains(@id,'C1__QUE_CCC6881DFBB')])[4]");
    By drp_bPay = By.xpath("//select[@name='C1__PAYABILL[1].FROMACCOUNTFORPAYABILL']");
    By drp_bPayTo = By.xpath("//select[@name='C1__PAYABILL[1].SAVEDBPAYBILLERS']");
    By txt_Toaccount = By.xpath("//select[@id='C1__QUE_CCC6881DFBB8F0EF389551']");

    By txt_Billername = By.xpath("//*[@id='C1__QUE_BE48D4A30E55AF8A214372']");

    By txt_BillernameNewContact = By.xpath("//*[@id='C1__QUE_CCC6881DFBB8F0EF301476']");

    By txt_bPayselectValue2 = By.xpath("(//*[contains(@id,'C1__QUE_CCC6881DFB')])[6]");
    By txt_confirmButtonBpay = By.xpath("//*[@value='Confirm']");
    By txt_closeButtonBpay = By.xpath("//*[@value='Close']");

    //*[@id="C1__QUE_BE48D4A30E55AF8A214372"]
    By txt_bPayAmount = By.xpath("(//*[contains(@id,'C1__QUE_5DFE13BF')])[3]");
    By txt_continueButton = By.xpath("(//*[contains(@id,'C1__BUT_5DFE13BF')])");
    By txt_errorBpay = By.xpath("(//*[contains(@id,'C1__p1_HEAD_57')])/div");
    By txt_confirmButton = By.xpath("//*[@value='Confirm']");
    By txt_closeButton = By.xpath("//*[@value='Close']");

    By txt_payAnyone = By.xpath("(//*[contains(@id,'C1__BUT_8B85')])[2]");
    By txt_aNewContactExternal = By.xpath("//*[@id='C1__QUE_5DFE13BF59422EAF6958_1']");
    By txt_dropDownExternal = By.xpath("(//*[contains(@id,'C1__QUE_FE87')])[1]");
    By txt_accountName = By.xpath("(//*[contains(@id,'C1__QUE_5DFE13BF5')])[6]");
    By txt_BSB = By.xpath("(//*[contains(@id,'C1__QUE_5DFE13BF5')])[8]");
    By txt_accountNumber = By.xpath("(//*[contains(@id,'C1__QUE_5DFE13BF5')])[10]");
    By txt_checkBox = By.xpath("(//*[contains(@id,'C1__QUE_5DFE13BF5')])[14]");
    By txt_newExternalAmount = By.xpath("//input[@name='C1__MAKEPAYMENT[1].TRANSACTIONAMOUNT']");
    By txt_newExternalDescription = By.xpath("//*[@id='C1__QUE_5DFE13BF59422EAF6980']");
    By txt_newExternalTheirDescription = By.xpath("//*[@id='C1__QUE_34095685F494875F305308']");
    By txt_externalNewAtFutureButton = By.xpath("(//*[@name='C1__MAKEPAYMENT[1].WHENTOPAY'])[2]");
    By txt_calendar = By.xpath("(//img[@title='Calendar'])[1]");
    By txt_newExternalfrequency = By.xpath("(//*[contains(@id,'C1__QUE_5DFE13B')])[24]");
    By txt_month = By.xpath("//*[@id='ui-datepicker-div']/div/div/select[1]");
    By txt_recurringExternalCalaendar2 = By.xpath("(//img[@title='Calendar'])[2]");
    By txt_recurringDate = By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[5]/a");
    By txt_Date = By.xpath("//input[@name='C1__MAKEPAYMENT[1].FUTUREDATE']");

    // By txt_Date1 = By.xpath("C1__STANDINGORDER[1].PAYMENTSTARTS");
    By txt_Date1 = By.xpath("//input[@name='C1__STANDINGORDER[1].PAYMENTSTARTS']");
    By txt_newRecurringButton = By.xpath("(//*[@name='C1__MAKEPAYMENT[1].WHENTOPAY'])[3]");
    By txt_endDate = By.xpath("//input[@id='C1__PAYMENT_END']");
    By txt_description1 = By.xpath("//*[contains(@id,'C1__QUE_E4B62FE30F30B98')]");
    // By txt_description = By.xpath("(//*[contains(@id,'C1__QUE_5DFE13BF')])[7]");

    By clk_transferAuth = By.xpath("(//*[contains(@id,'BUT_06DAC')])[3]");
    By clk_returnAuthApprove = By.xpath("//button[@value='Return to authorisations']");

    By clk_authApprove = By.xpath("//button[@value='Approve']");
    By clk_logout = By.xpath("//*[@id='ITM_LOGOUT']/a");
    By clk_messageIB = By.xpath("//*[@id='ITM_Message']/a");
    By clk_View = By.xpath("//table/tbody/tr[1]/td[5]");
    By txt_messageIB = By.xpath("//*[@id='ITM_Message']/a");
    By txt_month1 = By.xpath("//*[@id='ui-datepicker-div']/div/div/select[1]");


    By Security = By.xpath("//a[contains(@id,'ITM_4B34FA')and(text()='Security')]");
    By Manage = By.xpath("//a[(text()='Manage')]");
    By Currentpassword = By.xpath("//input[@type='password'and(@aria-label='Current Passcode')]");
    By NewPassword = By.xpath("//input[@type='password'and(@aria-label='New Passcode')]");
    By confirmpasswrd = By.xpath("//input[@type='password'and(@aria-label='Confirm Passcode')]");
    By save = By.xpath("//button[text()='Save']");
    By paswrdchangecmltemsg = By.xpath("//*[text()='Change passcode']");
    By paswrdchangemsg = By.xpath("//*[text()='Your passcode has been updated']");
    By Batch = By.xpath("(//span[text()='Batch'])[1]");

    By MessageBtn = By.xpath("//*[text()='Message']");
    By InboxBtn = By.xpath("//span[text()='Inbox']");
    By unreadMsgs = By.xpath("//a[(@class='tooltipUxp  nowrap')and contains(@id,'BUT_54FA')]");
    By manage = By.xpath("//a[text()='Manage']");
    By SecurityPwdChange = By.xpath("//*[(@id='BUT_F572981281C315F61188414')]/span");
    By currentPassword = By.xpath("//*[(@type='password')and(@aria-label='Current Passcode')]");
    By sessionhistory = By.xpath("//*[@id='BUT_43FFE78993BAE094584868']");
    By homepage = By.xpath("//*[@alt='Go to Home Page']");
    By customerid = By.xpath("//label[text()='Customer ID']//../../..//input[@type='text']");
    By find = By.xpath("//*[@alt='Run Selection']");
    By customerview = By.xpath("//a[@title='Single Customer View']");
    By accountordeposit = By.xpath("//*[text()='Account/Deposits']");
    By loans = By.xpath("//*[text()='Loans']");
    By customerHomeFrame = By.xpath("//*[contains(@id,'CUSTOMER')]");
    By creaatepaymentframe = By.xpath("//*[contains(@id,'FRAMETAB')]");
    //By createinnerframe=By.xpath(txtouterFrame1);

    By clientmaaintenance = By.xpath("//*[@id='btnClientMaintenance']");
    By subIdField = By.xpath("//*[@name='txtCLNO']");
    By retrieve = By.xpath("//*[@name='cmdRetrieve']");
    By NameIBM = By.xpath("//*[@id='txtMemName']");

    By recurringStartdate = By.xpath("//*[contains(@id,'C1__QUE_5DFE13BF59422EAF7002')]");
    By recurringStartdateReviewPayment = By.xpath("//*[@id='C1__QUE_04865C6E877FB900667986']");
    By recurringEnddateReviewPayment = By.xpath("//*[@id='C1__QUE_04865C6E877FB900667988']");
    By recurrinfrequeReviewPayment = By.xpath("//*[@id='C1__QUE_04865C6E877FB900667987']");
    By recurringEnddate = By.xpath("//*[@id='C1__QUE_5DFE13BF59422EAF7004']");
    By recurrinfreque = By.xpath("//*[@id='C1__QUE_5DFE13BF59422EAF7003']");
    By recurrinfrequeAutorization = By.xpath("//*[@id='C1__QUE_E10AF29768D5F8C5181494']");
    By recurringStartdateAutorization = By.xpath("//*[@id='C1__QUE_B3263CA315B8641A595888']");
    By recurringEnddateAutorization = By.xpath("//*[@id='C1__QUE_B3263CA315B8641A436903']");
    By futuredateconfirmpay = By.xpath("//span[text()='Transfer Date']//following::*[@class='form-control']");
    By startdateRecurring = By.xpath("(//span[text()='Start Date']/following::span[contains(@id,'C1__QUE')])[1]");
    By enddateRecurring = By.xpath("(//span[text()='End Date']//following::span[contains(@id,'C1__QUE')])[1]");
    By frequencyrecurringPay = By.xpath("(//span[text()='Frequency']//following::span[contains(@id,'C1__QUE')])[1]");
    By securesuccessmsg = By.xpath("//*[text()='Secure mail sent successfully.']");
    By returntomsg = By.xpath("//*[text()='Return to Message List']");
    By Mainmenu = By.xpath("//a[text()='Main Menu']");

    By sourceacntBatch = By.xpath("(//*[text()='Source Account']/following::div[contains(@id,'C1__p4_QUE')])[1]");
    By DestinationacntBatch = By.xpath("(//*[text()='Destination Account']/following::div)[1]");
    By postingdateBatch = By.xpath("(//*[text()='Posting Date']/following::div[contains(@id,'C1__p4_QUE_1301')])[1]");
    By postingdatereviewbath = By.xpath("(//*[text()='Posting Date']//following::div[contains(@id,'C1__')and(@class='col-xs-12 col-sm-8  ')])[1]");
    By DescriptionBatch = By.xpath("(//*[text()='Description']/following::div[contains(@id,'C1__p4_QUE_1301')])[1]");
    By DescriptionBatchreview = By.xpath("(//*[text()='Description']/following::span[contains(@id,'C1')])[2]");
    By AmountBatch = By.xpath("(//*[text()='Total Amount']/following::div[contains(@id,'C1__p4_QUE_1301')])[1]");
    By AmountReviewBatch = By.xpath("(//*[text()='Total Amount']/following::span[contains(@id,'C1__QUE_D8A')])[1]");
    By paynow = By.xpath("//button[text()='Pay now']");
    By dateBatchPay = By.xpath("(//*[text()='Posting Date']//following::input[@name='C1__BATCHPAYMENTS[1].BATCH[1].BATCHFORMDETAILS[1].POSTINGDATE'])[1]");
    By returntobatchpayments = By.xpath("//button[text()='Return to batch payments']");


    By clientnum2 = By.xpath("//*[@id='gvManagedEntities']/tbody/tr[1]/td[5]");
    By clientnum3 = By.xpath("//*[@id='gvManagedEntities']/tbody/tr[2]/td[5]");
    public static String dateMsg;
    private final Logger log = LoggerHelper.getLogger(IBHomePage.class);
    public static int msgcount = 0;

    public void loginIBInternal(String username, String password) throws Exception {


        Thread.sleep(500);
        WebElement UsernameIB = findElement(txtUsernameIB);
        int repeat = 0;
        while (repeat <= 15) {

            try {

                WebElement UsernameIB1 = findElement(txtUsernameIB);
                //UsernameIB1.click();
                actions(UsernameIB1);

                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeat++;
        }
        int rep = 0;
        while (rep <= 20) {

            try {

                WebElement UsernameIB1 = findElement(txtUsernameIB);
                UsernameIB1.clear();
                UsernameIB1.clear();
                //UsernameIB1.clear();


                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            rep++;
        }


        UsernameIB.sendKeys(username);

        int rept = 0;
        while (rept <= 20) {

            try {

                WebElement TxtPasswordIB1 = findElement(txtPasswordIB);
                //TxtPasswordIB1.click();
                actions(TxtPasswordIB1);

                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            rept++;
        }
        WebElement TxtPasswordIB1 = findElement(txtPasswordIB);
        //TxtPasswordIB1.click();
        actions(TxtPasswordIB1);
        int reptt = 0;
        while (reptt <= 20) {

            try {

                WebElement TxtPasswordIB2 = findElement(txtPasswordIB);
                TxtPasswordIB2.clear();


                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            reptt++;
        }


        WebElement TxtPasswordIB = findElement(txtPasswordIB);
        TxtPasswordIB.sendKeys(password);

        WebElement TxtloginButton = findElement(txtloginButton);
        highlightUsingJs(TxtloginButton);
        actions(TxtloginButton);
        Thread.sleep(1000);


        /*
         * WebElement loginButton = findElement(txtloginButton); loginButton.click();
         */
//
//        log.info("Click on login....");
//        tb.logExtentReport("Click on login....");


    }

    public void loginIBInternalPasswordchange(String username, String password) throws Exception {


        Thread.sleep(500);
        WebElement UsernameIB = findElement(txtUsernameIB);
        int repeat = 0;
        while (repeat <= 15) {

            try {

                WebElement UsernameIB1 = findElement(txtUsernameIB);
                //UsernameIB1.click();
                actions(UsernameIB1);

                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeat++;
        }
        int rep = 0;
        while (rep <= 20) {

            try {

                WebElement UsernameIB1 = findElement(txtUsernameIB);
                UsernameIB1.clear();
                UsernameIB1.clear();
                //UsernameIB1.clear();


                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            rep++;
        }


        UsernameIB.sendKeys(username);

        int rept = 0;
        while (rept <= 20) {

            try {

                WebElement TxtPasswordIB1 = findElement(txtPasswordIB);
                //TxtPasswordIB1.click();
                actions(TxtPasswordIB1);

                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            rept++;
        }
        WebElement TxtPasswordIB1 = findElement(txtPasswordIB);
        //TxtPasswordIB1.click();
        actions(TxtPasswordIB1);
        int reptt = 0;
        while (reptt <= 20) {

            try {

                WebElement TxtPasswordIB2 = findElement(txtPasswordIB);
                TxtPasswordIB2.clear();


                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            reptt++;
        }


        WebElement TxtPasswordIB = findElement(txtPasswordIB);
        TxtPasswordIB.sendKeys(password);

        WebElement TxtloginButton = findElement(txtloginButton);
        actions(TxtloginButton);
        Thread.sleep(1000);


        /*
         * WebElement loginButton = findElement(txtloginButton); loginButton.click();
         */
//
//        log.info("Click on login....");
//        tb.logExtentReport("Click on login....");

//List<WebElement> errormsg=findElements(By.xpath("//*[contains(text(),'The User Id or Passcode, you entered is incorrect')]")).getText();
//        int a=errormsg.size();
//        if(a>0){
//        loginIBInternalPasswordchange("","");


    }

    public boolean validpaswordcheck() throws InterruptedException {
        Thread.sleep(1000);
        List<WebElement> errormsg = findElements(By.xpath("//*[contains(text(),'The User Id or Passcode, you entered is incorrect')]"));
        int a = errormsg.size();
        boolean c = false;
        if (a > 0) {
            c = true;
        }
        return c;

    }


    public void securityClick() {
        WebElement Manage = findElement(manage);
        Manage.click();
        WebElement securityPwdChange = findElement(SecurityPwdChange);
        securityPwdChange.click();


    }

    public void paaswordChange(String Password1, String Password2, String originalpassword) throws IOException {
        String passwordnew;
        if (originalpassword.equals(Password1)) {
            passwordnew = Password2;

        } else {
            passwordnew = Password1;
        }
        WebElement CurrentPassword = findElement(currentPassword);
        CurrentPassword.sendKeys(originalpassword);
        WebElement newPassword = findElement(NewPassword);
        newPassword.sendKeys(passwordnew);
        WebElement confirmPassword = findElement(confirmpasswrd);
        confirmPassword.sendKeys(passwordnew);

        WebElement Save = findElement(save);
        Save.click();
        T24homepage hm = new T24homepage();
        hm.setProperty("password", passwordnew);

        WebElement Paswrdchangecmltemsg = findElement(paswrdchangecmltemsg);
        String Paswrdchangeemsg = findElement(paswrdchangemsg).getText();

        boolean b = Paswrdchangecmltemsg.isDisplayed();
        Assert.assertTrue(b & Paswrdchangeemsg.contains("Your passcode has been updated"));

    }


    //retry mechanism to avoid staleElementReferenceException.
    public void TransferandpayButtonClick() {
        int Rept = 0;
        while (Rept <= 15) {

            try {
                clickElement(txttransferButton);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            Rept++;
        }
    }

    public void batchClick() {
        WebElement BatchButton = findElement(Batch);
        BatchButton.click();
    }


    //clickEle
    public void accountButton() throws Exception {
        Thread.sleep(1000);
        WebElement gotoAccounTt = findElementClickable(txtAccountButton);
        WebElement gotoAccounT = findElementClickable(txtAccountButton);
        //mouseOver(gotoAccounT);
        Thread.sleep(1000);
        int Rep = 0;
        while (Rep <= 45) {

            try {
                WebElement gotoAccounTtt = findElementClickable(txtAccountButton);
                WebElement gotoAccount = findElementClickable(txtAccountButton);

                clickElementUsingJavaScript(gotoAccount);
                // actions(gotoAccount);


                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            Rep++;
        }
        System.out.println("--- Point on Account ------");


    }

    public void auditlogIBMDebit(String subID, String description, String account) throws Exception {
        clickElement(txt_ibmAudit);
        //Thread.sleep(2000);
        String today = datePickIBM();

        clickElement(txt_fromDate);


        clickElement(txt_fromDate);

        clearElement(txt_fromDate);

        enterKeys(txt_fromDate, today);

        DateUtilities Du = new DateUtilities();
        String tomo = Du.dateafter2days();
        clickElement(txt_toDate);

        WebElement toDate1 = findElement(txt_toDate);

        toDate1.clear();

        enterKeys(txt_toDate, tomo);

        clickElement(txt_ibmSubId);


        WebElement ibmSubId1 = findElement(txt_ibmSubId);
        ibmSubId1.clear();

        enterKeys(txt_ibmSubId, subID);

        clickElement(txt_ibmRetrieve);

        clickElement(txt_ibmView);

        WebElement ibmView_raw = findElement(txt_ibmView_raw);
        String ibmTime = ibmView_raw.getText();
        WebElement ibmView_raw_debit = findElement(txt_ibmView_raw_debit);
        String actualResult = ibmView_raw_debit.getText();
        //account.substring()
        if (actualResult.contains(description))
        //&&actualResult
        //.contains(account))
        {
            //tb.logExtentReport("Debit batch details successfully displayed on IB manager session history");
        } else {
            Assert.fail("Debit batch details are not successfully displayed on IB manager session history");
        }


    }

    public void secureMailNewToAllNormal(String subject, String fromname) throws Exception {
        WebElement secureMail = findElement(txtsecureMail);
        secureMail.click();
        WebElement ibmNewToAll = findElement(txtibmNewToAll);
        ibmNewToAll.click();
        WebElement drpdown = findElementClickable(txtibMdrp);
        selectUsingIndex(drpdown, 0);
        WebElement ibmNewAllFrom = findElement(txtibmNewAllFrom);
        ibmNewAllFrom.sendKeys(fromname);
        WebElement ibmNewAllSubject = findElement(txtibmNewAllSubject);
        ibmNewAllSubject.click();
        String b = getRandomNumberString("");
        WebElement ibmNewAllSubject1 = findElement(txtibmNewAllSubject);
        ibmNewAllSubject1.sendKeys(subject + b);
        String subjectmsg = ibmNewAllSubject1.getAttribute("value");
        WebElement ibmNewAllDescription = findElement(txtibmNewAllDescription);
        ibmNewAllDescription.click();
        WebElement ibmNewAllDescription1 = findElement(txtibmNewAllDescription);
        String a = getRandomNumberString("");
        ibmNewAllDescription1.sendKeys("This test for regression testing" + a);
        String msgg = ibmNewAllDescription1.getAttribute("value");
        WebElement ibmNewAllSave = findElement(txtibmNewAllSave);
        ibmNewAllSave.click();
        WebElement Securesuccessmsg = findElement(securesuccessmsg);
        String successmsg = Securesuccessmsg.getText();
        WebElement Returntomsg = findElement(returntomsg);
        String returnmsg = Returntomsg.getText();
        Assert.assertTrue(successmsg.contains("Secure mail sent successfully") & returnmsg.contains("Return to Message List"));
        //WebElement mainmenu = findElement(Mainmenu);
        //mainmenu.click();
        Returntomsg.click();
        T24homepage HM = new T24homepage();
        HM.setProperty("subjectNormalmsg", subjectmsg);
        HM.setProperty("Normalmsg", msgg);
    }


    public void secureMailNewToAllUrgent(String subject, String fromname) throws Exception {

        WebElement ibmNewToAll = findElement(txtibmNewToAll);
        ibmNewToAll.click();

        WebElement ibmNewAllFrom = findElement(txtibmNewAllFrom);
        ibmNewAllFrom.sendKeys(fromname);

        WebElement ibmNewAllSubject = findElement(txtibmNewAllSubject);
        ibmNewAllSubject.click();
        String a = getRandomNumberString("");
        String b = getRandomNumberString("");
        WebElement ibmNewAllSubject1 = findElement(txtibmNewAllSubject);
        ibmNewAllSubject1.sendKeys(subject + a);
        String subjectmsg = ibmNewAllSubject1.getAttribute("value");
        WebElement UrgentToAll = findElement(txtUrgentToAll);
        Select sl = new Select(UrgentToAll);
        sl.selectByIndex(1);

        WebElement ibmNewAllDescription = findElement(txtibmNewAllDescription);
        ibmNewAllDescription.click();

        WebElement ibmNewAllDescription1 = findElement(txtibmNewAllDescription);
        ibmNewAllDescription1.sendKeys("This test for regression testing" + b);
        String msg = ibmNewAllDescription1.getAttribute("value");
        clickElement(txtibmNewAllSave);
        WebElement Securesuccessmsg = findElement(securesuccessmsg);
        String successmsg = Securesuccessmsg.getText();
        WebElement Returntomsg = findElement(returntomsg);
        String returnmsg = Returntomsg.getText();
        Assert.assertTrue(successmsg.contains("Secure mail sent successfully") & returnmsg.contains("Return to Message List"));
        T24homepage HM = new T24homepage();
        HM.setProperty("subjecturgentmsg", subjectmsg);
        HM.setProperty("urgentmsg", msg);
    }

    public void newToNormalAllIB(String message) throws Exception {

        WebElement messageIB = findElement(txt_messageIB);
        messageIB.click();

        for (int i = 1; i <= 20; i++) {
            String msg = findElement(By.xpath("//*[@id='C1__QUE_AB556F61CCADE6CD53311_R" + i + "']")).getText();
            //String expectedMsg="Regression Automation Test";
            if (msg.contains(message)) {
                System.out.println(" Normal message displayed successfully");


            }
            break;
        }


    }

    public void newTourgentAll(String message, String messagecontentt) throws Exception {

        WebElement messageIB = findElement(txt_messageIB);
        messageIB.click();

        for (int i = 1; i <= 20; i++) {
            String msg = findElement(By.xpath("//*[@id='C1__TBL_AB556F61CCADE6CD53309']/tbody/tr[" + i + "]/td[2]")).getText();
            //String msg=findElement(By.xpath("//*[@id='C1__QUE_AB556F61CCADE6CD53311_R"+i+"']")).getText();
            //String expectedMsg="Regression Automation Test";
            if (msg.contains(message)) {
                System.out.println(" Normal message displayed successfully");
                findElement(By.xpath("//*[@id='C1__TBL_AB556F61CCADE6CD53309']/tbody/tr[" + i + "]/td[5]")).click();
                String messagecontent = findElement(By.xpath("(//*[text()='Message']/following::span[@class='form-control'])[5]")).getText();
                Assert.assertTrue(messagecontent.contains(messagecontentt));
                break;
            }
        }


    }

    public void urgentmessagecheck(String message) {
        for (int i = 1; i <= 20; i++) {
            String msg = findElement(By.xpath("//table[contains(@id,'C1__TBL_4460EA5C')]/tbody/tr[" + i + "]/td[1]")).getText();
            Assert.assertTrue(msg.contains(message));

        }
    }


    public void InboxMessageClick() {
        WebElement MessageBTN = findElement(MessageBtn);
        MessageBTN.click();
        //mouseOver( MessageBTN);
        WebElement InboxBTN = findElement(InboxBtn);
        InboxBTN.click();

    }

    public void getMessageCount() {
        WebElement unreadMSGS = findElement(unreadMsgs);
        String unreadMSG = unreadMSGS.getText();

        System.out.println(unreadMSG);
        String numbers;
        numbers = unreadMSG.replaceAll("[^0-9]", "");

        System.out.println(numbers);
        int Msgcount = Integer.parseInt(numbers);
        msgcount = Msgcount;

    }

    public void readMsg() throws InterruptedException {


        for (int i = 1; i <= 30; i++) {
            if (i == 20) {
                WebElement next = findElement(nextpageMsg);
                next.click();
                i = 1;
                Thread.sleep(100);
                scrollUpVertically();
                Thread.sleep(500);
            }

            WebElement date = findElement(By.xpath("//table[contains(@id,'C1__TBL_AB')]//tbody/tr[" + i + "]/td[4]"));
            scrollIntoView(date);
            String Date = date.getText();
            dateMsg = Date;
            int len = Date.length();
            if (len == 0) {
                WebElement read = findElement(By.xpath("//table[contains(@id,'C1__TBL_AB')]//tbody/tr[" + i + "]/td[5]"));
                read.click();
                break;

            }
        }

    }


    public void ibManagerLogin(String user, String password) throws Exception {

        clickElement(txtibManagerUsername);


        clearElement(txtibManagerUsername);

        enterKeys(txtibManagerUsername, user);

        clickElement(txtibManagerPassword);
        //Thread.sleep(1000);
        clearElement(txtibManagerPassword);

        enterKeys(txtibManagerPassword, password);

        clickElement(txtibManagerlogin);

        //Thread.sleep(4000);


    }

    public void compareMsgCount() {
        WebElement unreadMSGS = findElement(unreadMsgs);
        String unreadMSG = unreadMSGS.getText();

        System.out.println(unreadMSG);
        String countmsg;
        countmsg = unreadMSG.replaceAll("[^0-9]", "");
        int Msgcount = Integer.parseInt(countmsg);
        int updatedCount = msgcount - 1;
        assertEquals(Msgcount, updatedCount);
        System.out.print("passed");
    }

    public void countMsg() throws InterruptedException {
        WebElement MessageBTN = findElement(MessageBtn);
        MessageBTN.click();
        //mouseOver( MessageBTN);
        WebElement InboxBTN = findElement(InboxBtn);
        InboxBTN.click();
        WebElement unreadMSGS = findElement(unreadMsgs);
        String unreadMSG = unreadMSGS.getText();

        System.out.println(unreadMSG);
        String numbers;
        numbers = unreadMSG.replaceAll("[^0-9]", "");

        System.out.println(numbers);
        int Msgcount = Integer.parseInt(numbers);
        msgcount = Msgcount;

    }

    public static String StringFromaccountIntNow;
    public static String enteredIntTransAmtIb;
    public static String enteredIntTransDesc;
    public static String StringToAccountIntNow;

    public void transferInternal(String amount1, String description1) throws Exception {

        clickElement(txt_selectValue);
        WebElement selectValue = findElement(txt_selectValue);
        String toAccount = "";
        String fromAccount = selectUsingIndex(selectValue, 1);
        String StringfromaccountIntNow = fromAccount.substring(19,28);
        //String StringfromaccountIntNow = fromAccount.substring(18, 28);
        String StringToaccountIntNow = "";
        int re = 0;
        while (re <= 500) {
            try {
                WebElement selectValue3 = findElementClickable(txt_selectValue3Future);
                selectValue3.click();
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            re++;
        }
        Thread.sleep(500);
        int repp = 0;
        while (repp <= 20) {
            try {
                WebElement selectValue3 = findElementClickable(txt_selectValue3Future);
                toAccount = selectUsingIndex(selectValue3, 1);
                StringToaccountIntNow = toAccount.substring(19, 28);
                // StringToaccountIntNow = toAccount.substring(18, 28);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repp++;
        }
        String enteredAmt = "";
        Thread.sleep(500);
        int repeat = 0;
        while (repeat <= 500) {

            try {
                WebElement Txt_transferAmountIT2 = findElementClickable(txt_transferAmountIT);
                Txt_transferAmountIT2.click();
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeat++;
        }
        Thread.sleep(500);

        amount1 = getRandomNumberStringTwodigit() + "." + getRandomNumberStringTwodigit();
        int rep = 0;
        while (rep <= 8) {

            try {
                WebElement Txt_transferAmountIT2 = findElementClickable(txt_transferAmountIT);
                //Txt_transferAmountIT2.click();
                Txt_transferAmountIT2.sendKeys(amount1);
                enteredAmt = Txt_transferAmountIT2.getAttribute("value");
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            rep++;
        }
        Thread.sleep(500);
        //WebElement transferAmount4 = findElementClickable(txt_transferAmountIT);
        //String enteredAmt = transferAmount4.getAttribute("value");
        WebElement Txt_descriptionIT = findElementClickable(txt_descriptionIT);
        Txt_descriptionIT.click();
        // actions(Txt_descriptionIT);
        String des = getRandomNumberString("intrNw");
        Txt_descriptionIT.sendKeys(des);
        Thread.sleep(500);
        String enteredDes = Txt_descriptionIT.getAttribute("value");


        WebElement SourceAccountt = findElementClickable(txt_selectValue);
        Select select = new Select(SourceAccountt);
        WebElement firstoption = select.getOptions().get(0);
        if (firstoption.isSelected()) {
            WebElement sourceAccountt = findElementClickable(txt_selectValue);
            Select selectt = new Select(sourceAccountt);
            selectt.selectByIndex(1);
        }


        continueMessage();
        T24homepage hp = new T24homepage();
        StringFromaccountIntNow = StringfromaccountIntNow;
        enteredIntTransAmtIb = enteredAmt;
        enteredIntTransDesc = enteredDes;
        StringToAccountIntNow = StringToaccountIntNow;


        hp.setProperty("StringfromaccountIntNow", StringfromaccountIntNow);
        hp.setProperty("StringToaccountIntNow", StringToaccountIntNow);
        hp.setProperty("enteredIntTransAmtIb", enteredAmt);
        hp.setProperty("enteredIntTransDesc", enteredDes);

    }

    public void transferInternalJointowners(String amount1, String description1) throws Exception {

        clickElement(txt_selectValue);
        WebElement selectValue = findElement(txt_selectValue);
        String toAccount = "";
        String fromAccount = selectUsingIndex(selectValue, 1);
        String StringfromaccountIntNow = fromAccount.substring(19, 28);
        //String StringfromaccountIntNow = fromAccount.substring(18, 28);
        String StringToaccountIntNow = "";
        int re = 0;
        while (re <= 500) {
            try {
                WebElement selectValue3 = findElementClickable(txt_selectValue3Future);
                selectValue3.click();
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            re++;
        }
        Thread.sleep(500);
        int repp = 0;
        while (repp <= 20) {
            try {
                WebElement selectValue3 = findElementClickable(txt_selectValue3Future);
                toAccount = selectUsingIndex(selectValue3, 1);
                StringToaccountIntNow = toAccount.substring(19, 28);
                // StringToaccountIntNow = toAccount.substring(18, 28);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repp++;
        }


        String targetWord = " - Available";
        int lengthToExtract = 9; // Specify the number of characters to extract

        String result = getTextBeforeWord(toAccount, targetWord, lengthToExtract);
        String source = getTextBeforeWord(fromAccount, targetWord, lengthToExtract);
        System.out.println("Extracted text: " + result);
        String enteredAmt = "";
        Thread.sleep(500);
        int repeat = 0;
        while (repeat <= 500) {

            try {
                WebElement Txt_transferAmountIT2 = findElementClickable(txt_transferAmountIT);
                Txt_transferAmountIT2.click();
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeat++;
        }
        Thread.sleep(500);

        amount1 = getRandomNumberStringTwodigit() + "." + getRandomNumberStringTwodigit();
        int rep = 0;
        while (rep <= 8) {

            try {
                WebElement Txt_transferAmountIT2 = findElementClickable(txt_transferAmountIT);
                //Txt_transferAmountIT2.click();
                Txt_transferAmountIT2.sendKeys(amount1);
                enteredAmt = Txt_transferAmountIT2.getAttribute("value");
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            rep++;
        }
        Thread.sleep(500);
        //WebElement transferAmount4 = findElementClickable(txt_transferAmountIT);
        //String enteredAmt = transferAmount4.getAttribute("value");
        WebElement Txt_descriptionIT = findElementClickable(txt_descriptionIT);
        Txt_descriptionIT.click();
        // actions(Txt_descriptionIT);
        // String des = getRandomNumberString("intrNw");
        Txt_descriptionIT.sendKeys(description1);
        Thread.sleep(500);
        String enteredDes = Txt_descriptionIT.getAttribute("value");
        WebElement FROMAccountt = findElementClickable(txt_selectValue);
        Select selectt = new Select(FROMAccountt);
        WebElement firstoption = selectt.getOptions().get(0);
        if (firstoption.isSelected()) {
            WebElement FROMAccount = findElementClickable(txt_selectValue);
            Select Sele = new Select(FROMAccount);
            Sele.selectByIndex(1);
        }
        continueMessage();
        T24homepage hp = new T24homepage();
        StringFromaccountIntNow = StringfromaccountIntNow;
        enteredIntTransAmtIb = enteredAmt;
        enteredIntTransDesc = enteredDes;
        StringToAccountIntNow = StringToaccountIntNow;

        DateUtilities du = new DateUtilities();
        String date = du.Datepicktoday();
        hp.setProperty("StringDateIntNow", date);
        hp.setProperty("StringfromaccountIntNow", source);
        hp.setProperty("StringToaccountIntNow", result);
        hp.setProperty("enteredIntTransAmtIb", enteredAmt);
        hp.setProperty("enteredIntTransDesc", enteredDes);

    }

    public void transferInternalJointowners2(String amount1, String description1) throws Exception {

        clickElement(txt_selectValue);
        WebElement selectValue = findElement(txt_selectValue);
        String toAccount = "";
        String fromAccount = selectUsingIndex(selectValue, 1);
        String StringfromaccountIntNow = fromAccount.substring(19, 28);
        //String StringfromaccountIntNow = fromAccount.substring(18, 28);
        String StringToaccountIntNow = "";
        int re = 0;
        while (re <= 500) {
            try {
                WebElement selectValue3 = findElementClickable(txt_selectValue3Future);
                selectValue3.click();
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            re++;
        }
        Thread.sleep(500);
        int repp = 0;
        while (repp <= 20) {
            try {
                WebElement selectValue3 = findElementClickable(txt_selectValue3Future);
                toAccount = selectUsingIndex(selectValue3, 1);
                StringToaccountIntNow = toAccount.substring(19, 28);
                // StringToaccountIntNow = toAccount.substring(18, 28);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repp++;
        }


        String targetWord = " - Available";
        int lengthToExtract = 9; // Specify the number of characters to extract

        String result = getTextBeforeWord(toAccount, targetWord, lengthToExtract);
        String source = getTextBeforeWord(fromAccount, targetWord, lengthToExtract);
        System.out.println("Extracted text: " + result);
        String enteredAmt = "";
        Thread.sleep(500);
        int repeat = 0;
        while (repeat <= 500) {

            try {
                WebElement Txt_transferAmountIT2 = findElementClickable(txt_transferAmountIT);
                Txt_transferAmountIT2.click();
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeat++;
        }
        Thread.sleep(500);

        amount1 = getRandomNumberStringTwodigit() + "." + getRandomNumberStringTwodigit();
        int rep = 0;
        while (rep <= 8) {

            try {
                WebElement Txt_transferAmountIT2 = findElementClickable(txt_transferAmountIT);
                //Txt_transferAmountIT2.click();
                Txt_transferAmountIT2.sendKeys(amount1);
                enteredAmt = Txt_transferAmountIT2.getAttribute("value");
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            rep++;
        }
        Thread.sleep(500);
        //WebElement transferAmount4 = findElementClickable(txt_transferAmountIT);
        //String enteredAmt = transferAmount4.getAttribute("value");
        WebElement Txt_descriptionIT = findElementClickable(txt_descriptionIT);
        Txt_descriptionIT.click();
        // actions(Txt_descriptionIT);
        String des = getRandomNumberString("intrNw");
        Txt_descriptionIT.sendKeys(des);
        Thread.sleep(500);
        String enteredDes = Txt_descriptionIT.getAttribute("value");

        continueMessage();
        T24homepage hp = new T24homepage();
        StringFromaccountIntNow = StringfromaccountIntNow;
        enteredIntTransAmtIb = enteredAmt;
        enteredIntTransDesc = enteredDes;
        StringToAccountIntNow = StringToaccountIntNow;

        DateUtilities du = new DateUtilities();
        String date = du.Datepicktoday();
        hp.setProperty("StringDateIntNow2", date);
        hp.setProperty("StringfromaccountIntNow2", source);
        hp.setProperty("StringToaccountIntNow2", result);
        hp.setProperty("enteredIntTransAmtIb2", enteredAmt);
        hp.setProperty("enteredIntTransDesc2", enteredDes);

    }

    public static String getTextBeforeWord(String text, String word, int length) {
        int index = text.indexOf(word);
        if (index != -1) {
            int start = Math.max(0, index - length); // Ensure start is not negative
            return text.substring(start, index);
        }
        return ""; // Return empty if the word is not found
    }

    public void transferInternalFuture(String amount1, String description) throws Exception {
        clickElement(txt_selectValue);
        WebElement selectValue = findElement(txt_selectValue);
        String toAccount = "";
        String fromAccount = selectUsingIndex(selectValue, 1);
        String StringfromaccountIntfuture = fromAccount.substring(19, 28);
        String StringToaccountIntfuture = "";
        int re = 0;
        while (re <= 500) {
            try {
                WebElement selectValue3 = findElementClickable(txt_selectValue3Future);
                selectValue3.click();
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            re++;
        }
        Thread.sleep(500);
        int repp = 0;
        while (repp <= 20) {
            try {
                WebElement selectValue3 = findElementClickable(txt_selectValue3Future);
                toAccount = selectUsingIndex(selectValue3, 1);
                StringToaccountIntfuture = toAccount.substring(19, 28);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repp++;
        }
        String enteredAmt = "";
        Thread.sleep(500);
        int repeat = 0;
        while (repeat <= 500) {

            try {
                WebElement Txt_transferAmountIT2 = findElementClickable(txt_transferAmountIT);
                Txt_transferAmountIT2.click();
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeat++;
        }
        Thread.sleep(500);

        // amount1 = getRandomNumberStringTwodigit() + "." + getRandomNumberStringTwodigit();
        int rep = 0;
        while (rep <= 8) {

            try {
                WebElement Txt_transferAmountIT2 = findElementClickable(txt_transferAmountIT);
                //Txt_transferAmountIT2.click();
                Txt_transferAmountIT2.sendKeys(amount1);
                enteredAmt = Txt_transferAmountIT2.getAttribute("value");
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            rep++;
        }
        Thread.sleep(500);
        //WebElement transferAmount4 = findElementClickable(txt_transferAmountIT);
        //String enteredAmt = transferAmount4.getAttribute("value");
        WebElement Txt_descriptionIT = findElementClickable(txt_descriptionIT);
        Txt_descriptionIT.click();
        // actions(Txt_descriptionIT);
        //String des = getRandomNumberString("intrft");
        Txt_descriptionIT.sendKeys(description);
        Thread.sleep(500);
        String enteredDes = Txt_descriptionIT.getAttribute("value");
        WebElement atFutureButton = clickElement(txt_atFutureButton);
        atFutureButton.click();
        WebElement calendar = findElement(txtCalendar);
        calendar.click();
        WebElement month = findElement(txtbMonth);
        Select sel = new Select(month);
        DateUtilities du = new DateUtilities();
        String startMnth = datenumtoName(DateUtilities.monthafterdays);
        sel.selectByVisibleText(startMnth);
        int i = Integer.parseInt(DateUtilities.date2);
        WebElement date = findElement(By.xpath("//a[text()=" + i + "]"));
        date.click();
        //continueMessage();

        WebElement FROMAccountt = findElementClickable(txt_selectValue);
        Select select = new Select(FROMAccountt);
        WebElement firstoption = select.getOptions().get(0);
        if (firstoption.isSelected()) {
            WebElement FROMAccount = findElementClickable(txt_selectValue);
            Select selectt = new Select(FROMAccount);
            selectt.selectByIndex(1);
        }


        T24homepage hp = new T24homepage();
        hp.setProperty("StringfromaccountIntfuture", StringfromaccountIntfuture);
        hp.setProperty("StringToaccountIntfuture", StringToaccountIntfuture);
        hp.setProperty("enteredIntTransAmtIbFuture", enteredAmt);
        hp.setProperty("enteredIntTransDescFuture", enteredDes);

    }

    public void transferExternalFuture(String amount1, String description) throws Exception {
//        WebElement payAnyone = findElementClickable(txtpayAnyone);
//        payAnyone.click();
//        clickElement(txtpayAnyone);
        WebElement TxtpayAnyone = findElementClickable(txtpayAnyone);
        actions(TxtpayAnyone);
        WebElement dropDownExternal = findElementClickable(txtdropDownExternal);
        actions(dropDownExternal);

        //*[@name="C1__SENDMONEY[1].SAVEDPAYEELIST"]
        String fromaccountExternal = selectUsingIndex(dropDownExternal, 1);
        String fromAccountexternalFuture = fromaccountExternal.substring(33, 42);
        Thread.sleep(1000);
        String toAccount = "";
        //  String fromAccount = selectUsingIndex(selectValue, 1);
        // String StringfromaccountIntfuture = fromAccount.substring(33, 42);
        String StringToaccountExtfuture = "";
        int re = 0;
        while (re <= 500) {
            try {
                WebElement selectValue3 = findElementClickable(toaccountdropdown);
                selectValue3.click();
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            re++;
        }
        Thread.sleep(500);
        int repp = 0;
        while (repp <= 20) {
            try {


                // WebElement Toaccount = findElementClickable(toaccount);
                //Toaccount.click();

//                toAccount = selectUsingIndex(selectValue3, 1);
//                StringToaccountIntfuture = toAccount.substring(33, 43);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repp++;
        }

        WebElement selectValue3 = findElementClickable(toaccountdropdown);
        Select select = new Select(selectValue3);
        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            if (option.getText().contains("806043")) {
                StringToaccountExtfuture = option.getText();
                select.selectByVisibleText(option.getText());
                break;
            }
        }


        String enteredAmt = "";
        Thread.sleep(500);
        int repeat = 0;
        while (repeat <= 500) {

            try {
                WebElement Txt_transferAmountIT2 = findElementClickable(transferamountexternal);
                Txt_transferAmountIT2.click();
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeat++;
        }
        Thread.sleep(500);

        // amount1 = getRandomNumberStringTwodigit() + "." + getRandomNumberStringTwodigit();
        int rep = 0;
        while (rep <= 8) {

            try {
                WebElement Txt_transferAmountIT2 = findElementClickable(transferamountexternal);
                //Txt_transferAmountIT2.click();
                Txt_transferAmountIT2.sendKeys(amount1);
                enteredAmt = Txt_transferAmountIT2.getAttribute("value");
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            rep++;
        }
        Thread.sleep(500);
        //WebElement transferAmount4 = findElementClickable(txt_transferAmountIT);
        //String enteredAmt = transferAmount4.getAttribute("value");
        WebElement Txt_descriptionIT = findElementClickable(txt_descriptionIT);
        Txt_descriptionIT.click();
        // actions(Txt_descriptionIT);
        //String des = getRandomNumberString("intrft");
        Txt_descriptionIT.sendKeys(description);
        Thread.sleep(500);
        String enteredDes = Txt_descriptionIT.getAttribute("value");


        Thread.sleep(1000);
        int repeatt = 0;
        while (repeatt <= 15) {
            try {
                WebElement theirDescription = findElement(txttheirDescription);
                actions(theirDescription);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeatt++;
        }

        Thread.sleep(1000);
        WebElement theirDescription1 = findElement(txttheirDescription);
        String des1 = getRandomNumberString("intrft");
        theirDescription1.sendKeys(des1);

        WebElement theirDescription2 = findElement(txttheirDescription);
        String tDescription = theirDescription2.getAttribute("value");


        WebElement atFutureButton = clickElement(futurebutton);
        atFutureButton.click();
        WebElement calendar = findElement(txtCalendar);
        calendar.click();
        WebElement month = findElement(txtbMonth);
        Select sel = new Select(month);
        DateUtilities du = new DateUtilities();
        String startMnth = datenumtoName(DateUtilities.monthafterdays);
        sel.selectByVisibleText(startMnth);
        int i = Integer.parseInt(DateUtilities.date2);
        WebElement date = findElement(By.xpath("//a[text()=" + i + "]"));
        date.click();
        //continueMessage();
        WebElement futurteDateField = findElement(FuturteDateField);
        String futuredate = futurteDateField.getAttribute("value");
        T24homepage hp = new T24homepage();
        hp.setProperty("StartdatetExternalfuture", futuredate);
        hp.setProperty("StringfromaccountExternalfuture", fromAccountexternalFuture);
        hp.setProperty("StringToaccountExternalfuture", StringToaccountExtfuture);
        hp.setProperty("enteredExternalTransAmtIbFuture", enteredAmt);
        hp.setProperty("enteredExternalTransDescFuture", enteredDes);

    }


    public void transferExternalFutureSaved(String amount1, String description) throws Exception {
//        WebElement payAnyone = findElementClickable(txtpayAnyone);
//        payAnyone.click();
//        clickElement(txtpayAnyone);
        WebElement TxtpayAnyone = findElementClickable(txtpayAnyone);
        actions(TxtpayAnyone);
        WebElement dropDownExternal = findElementClickable(txtdropDownExternal);
        actions(dropDownExternal);

        //*[@name="C1__SENDMONEY[1].SAVEDPAYEELIST"]
        String fromaccountExternal = selectUsingIndex(dropDownExternal, 1);
        String fromAccountexternalFuture = fromaccountExternal.substring(19, 28);
        Thread.sleep(1000);
        String toAccount = "";
        //  String fromAccount = selectUsingIndex(selectValue, 1);
        // String StringfromaccountIntfuture = fromAccount.substring(33, 42);
        String StringToaccountExtfuture = "";
        int re = 0;
        while (re <= 500) {
            try {
                WebElement selectValue3 = findElementClickable(toaccountdropdown);
                selectValue3.click();
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            re++;
        }
        Thread.sleep(500);
        int repp = 0;
        while (repp <= 20) {
            try {


                // WebElement Toaccount = findElementClickable(toaccount);
                //Toaccount.click();

//                toAccount = selectUsingIndex(selectValue3, 1);
//                StringToaccountIntfuture = toAccount.substring(33, 43);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repp++;
        }

        WebElement selectValue3 = findElementClickable(toaccountdropdown);
        Select select = new Select(selectValue3);
        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            if (option.getText().contains("806043")) {
                StringToaccountExtfuture = option.getText();
                select.selectByVisibleText(option.getText());
                break;
            }
        }


        String enteredAmt = "";
        Thread.sleep(500);
        int repeat = 0;
        while (repeat <= 500) {

            try {
                WebElement Txt_transferAmountIT2 = findElementClickable(transferamountexternal);
                Txt_transferAmountIT2.click();
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeat++;
        }
        Thread.sleep(500);

        // amount1 = getRandomNumberStringTwodigit() + "." + getRandomNumberStringTwodigit();
        int rep = 0;
        while (rep <= 8) {

            try {
                WebElement Txt_transferAmountIT2 = findElementClickable(transferamountexternal);
                //Txt_transferAmountIT2.click();
                Txt_transferAmountIT2.sendKeys(amount1);
                enteredAmt = Txt_transferAmountIT2.getAttribute("value");
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            rep++;
        }
        Thread.sleep(500);
        //WebElement transferAmount4 = findElementClickable(txt_transferAmountIT);
        //String enteredAmt = transferAmount4.getAttribute("value");
        WebElement Txt_descriptionIT = findElementClickable(txt_descriptionIT);
        Txt_descriptionIT.click();
        // actions(Txt_descriptionIT);
        //String des = getRandomNumberString("intrft");
        Txt_descriptionIT.sendKeys(description);
        Thread.sleep(500);
        String enteredDes = Txt_descriptionIT.getAttribute("value");


        Thread.sleep(1000);
        int repeatt = 0;
        while (repeatt <= 15) {
            try {
                WebElement theirDescription = findElement(txttheirDescription);
                actions(theirDescription);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeatt++;
        }

        Thread.sleep(1000);
        WebElement theirDescription1 = findElement(txttheirDescription);
        String des1 = getRandomNumberString("intrft");
        theirDescription1.sendKeys(des1);

        WebElement theirDescription2 = findElement(txttheirDescription);
        String tDescription = theirDescription2.getAttribute("value");


        WebElement atFutureButton = clickElement(futurebutton);
        atFutureButton.click();
        WebElement calendar = findElement(txtCalendar);
        calendar.click();
        WebElement month = findElement(txtbMonth);
        Select sel = new Select(month);
        DateUtilities du = new DateUtilities();
        String startMnth = datenumtoName(DateUtilities.monthafterdays);
        sel.selectByVisibleText(startMnth);
        int i = Integer.parseInt(DateUtilities.date2);
        WebElement date = findElement(By.xpath("//a[text()=" + i + "]"));
        date.click();
        //continueMessage();
        WebElement futurteDateField = findElement(FuturteDateField);
        String futuredate = futurteDateField.getAttribute("value");

        WebElement FROMAccountt = findElementClickable(txtdropDownExternal);
        Select selectt = new Select(FROMAccountt);
        WebElement firstoption = selectt.getOptions().get(0);
        if (firstoption.isSelected()) {
            WebElement FROMAccount = findElementClickable(txtdropDownExternal);
            Select Selectt = new Select(FROMAccount);
            Selectt.selectByIndex(1);
        }


        T24homepage hp = new T24homepage();
        hp.setProperty("StartdatetExternalfuture", futuredate);
        hp.setProperty("StringfromaccountExternalfuture", fromAccountexternalFuture);
        hp.setProperty("StringToaccountExternalfuture", StringToaccountExtfuture);
        hp.setProperty("enteredExternalTransAmtIbFuture", enteredAmt);
        hp.setProperty("enteredExternalTransDescFuture", enteredDes);

    }


    public void transferExternalFutureNewContact(String amount1, String description, String description2) throws Exception {
        WebElement TxtpayAnyone = findElementClickable(txtpayAnyone);
        actions(TxtpayAnyone);
        WebElement NewcontactButton = findElementClickable(newcontactButton);
        NewcontactButton.click();
        WebElement dropDownExternal = findElementClickable(txtdropDownExternal);
        actions(dropDownExternal);
        String fromaccountExternal = selectUsingIndex(dropDownExternal, 1);
        String fromAccountexternalFuture = fromaccountExternal.substring(19, 28);
        Thread.sleep(1000);
        String toAccount = "";
        String StringToaccountExtfuture = "";
        WebElement Toaccountnamefield = findElementClickable(toaccountnamefield);
        Toaccountnamefield.sendKeys("ext");
        WebElement ToaccountBSBfield = findElementClickable(toaccountBSBfield);
        ToaccountBSBfield.sendKeys("806043");
        Thread.sleep(1000);
        int rep = 0;
        while (rep <= 20) {

            try {
                WebElement ToaccountAccountNumfield = findElementClickable(toaccountAccountNumfield);
                ToaccountAccountNumfield.click();

                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            rep++;
        }
        WebElement ToAccountAccountNumfield = findElementClickable(toaccountAccountNumfield);
        ToAccountAccountNumfield.sendKeys("200052076");
        String ToaccountExtfuture = ToAccountAccountNumfield.getAttribute("value");

        int repeat = 0;
        while (repeat <= 500) {

            try {
                WebElement Txt_transferAmountIT2 = findElementClickable(transferamountexternal);
                Txt_transferAmountIT2.click();
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeat++;
        }
        Thread.sleep(500);
        String enteredAmt = "";
        // amount1 = getRandomNumberStringTwodigit() + "." + getRandomNumberStringTwodigit();
        int rept = 0;
        while (rept <= 8) {

            try {
                WebElement Txt_transferAmountIT2 = findElementClickable(transferamountexternal);
                //Txt_transferAmountIT2.click();
                Txt_transferAmountIT2.sendKeys(amount1);
                enteredAmt = Txt_transferAmountIT2.getAttribute("value");
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            rept++;
        }
        Thread.sleep(500);

        WebElement Txt_descriptionIT = findElementClickable(txt_descriptionIT);
        Txt_descriptionIT.click();
        Txt_descriptionIT.sendKeys(description);
        Thread.sleep(500);
        String enteredDes = Txt_descriptionIT.getAttribute("value");
        Thread.sleep(1000);
        int repeatt = 0;
        while (repeatt <= 15) {
            try {
                WebElement theirDescription = findElement(txttheirDescription);
                actions(theirDescription);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeatt++;
        }

        Thread.sleep(1000);
        WebElement theirDescription1 = findElement(txttheirDescription);
        String des1 = getRandomNumberString("intrft");
        theirDescription1.sendKeys(des1);
        WebElement theirDescription2 = findElement(txttheirDescription);
        String tDescription = theirDescription2.getAttribute("value");
        WebElement atFutureButton = clickElement(futurebutton);
        atFutureButton.click();
        WebElement calendar = findElement(txtCalendar);
        calendar.click();
        WebElement month = findElement(txtbMonth);
        Select sel = new Select(month);
        DateUtilities du = new DateUtilities();
        String startMnth = datenumtoName(DateUtilities.monthafterdays);
        sel.selectByVisibleText(startMnth);
        int i = Integer.parseInt(DateUtilities.date2);
        WebElement date = findElement(By.xpath("//a[text()=" + i + "]"));
        date.click();
        WebElement futurteDateField = findElement(FuturteDateField);
        String futuredate = futurteDateField.getAttribute("value");

        WebElement FROMAccountt = findElementClickable(txtdropDownExternal);
        Select selectt = new Select(FROMAccountt);
        WebElement firstoption = selectt.getOptions().get(0);
        if (firstoption.isSelected()) {
            WebElement FROMAccount = findElementClickable(txtdropDownExternal);
            Select Sele = new Select(FROMAccount);
            Sele.selectByIndex(1);
        }
        WebElement continueButton = findElementClickable(txtcontinueButton);
        continueButton.click();
        T24homepage hp = new T24homepage();
        hp.setProperty("StartdatetExternalfutureNewContact", futuredate);
        hp.setProperty("StringfromaccountExternalfutureNewContact", fromAccountexternalFuture);
        hp.setProperty("StringToaccountExternalfutureNewContact", ToaccountExtfuture);
        hp.setProperty("enteredExternalTransAmtIbFutureNewContact", enteredAmt);
        hp.setProperty("enteredExternalTransDescFutureNewContact", enteredDes);

    }


    public void ConfirmInternalTransferpayment(String fAccount, String tAccount, String expectedAmt, String desc) {
        T24homepage hp = new T24homepage();
        clickElement(txtConfirmationVerify);
        WebElement verifyConfirm = findElement(txtConfirmationVerify);
        String a = verifyConfirm.getText();
        String b = "Please check your details below and confirm if they are correct.";
        if (a.equals(b)) {
            log.info("Confirmation message is displayed successfully");
            //  tb.logExtentReport("Confirmation message is displayed successfully");
        } else {

            log.info("Confirmation message is not displayed successfully");
            Assert.fail();
            //tb.logExtentReport("Confirmation message is not displayed successfully");
        }
        String typeT = "";
        try {
            confirmationMessage(fAccount, tAccount, expectedAmt, desc);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public void reviewpaymentAndClose(String fAccount, String tAccount, String expectedAmt, String desc) throws Exception {
        T24homepage hp = new T24homepage();
        closeMessage(fAccount, tAccount, expectedAmt, desc);
    }


    public void closeMessage(String fAccount, String tAccount, String expectedAmt, String expectedDes)
            throws Exception {

        String expectedResult = "Your payment has been created and is awaiting approval before being processed";
        WebElement verification = findElement(txtCloseVerifyy);
        String verifyClose = verification.getText();
        if (verifyClose.equals(expectedResult)) {
            // tb.logExtentReport("Success message is successfully displayed in close page");
            log.info("Success message is successfully displayed in close page");
        } else {
            //tb.logExtentReport("Success message is not successfully displayed in close page");
            log.info("Success message is not successfully displayed in close page");
        }

        WebElement FAccount = findElement(txtVerifyClosefaccount);
        String actaualFaccount = FAccount.getText();

        Assert.assertTrue(actaualFaccount.contains(fAccount));
        log.info("From account is successfully displayed for close ...");
        // tb.logExtentReport("From account is successfully displayed for close ...");

        WebElement toAccount = findElement(txtVerifyCloseTaccount);
        String actualToAccount = toAccount.getText();
        if (actualToAccount.contains(tAccount)) {
            log.info("To account is successfully displayed for close ...");
            //tb.logExtentReport("To account is successfully displayed for close....");
        } else {
            Assert.fail("To account is not successfully displayed for close");
            log.info("To account is not successfully displayed for close ...");
            //tb.logExtentReport("To account is not successfully displayed for close....");
        }
        WebElement closeAmount = findElement(txtVerifyCloseAmount);
        String actualAmount = closeAmount.getText();
        if (actualAmount.contains(expectedAmt)) {
            log.info("Entered Amount is successfully displayed for close ...");
            // tb.logExtentReport("Enterd Amount is successfully displayed for close ....");
        } else {
            Assert.fail("Entered Amount is not successfully displayed for close ...");
            log.info("Enterd Amount is not successfully displayed for close ...");
            //tb.logExtentReport("Enterd Amount is not successfully displayed for close ..");
        }
        String expectedTrans = "";
        if (expectedTrans == "Now") {
            WebElement closeNow = findElement(txtCloseFutureDateVerify);
            String actualText = closeNow.getText();
            if (actualText.equals(actualAmount)) {
                log.info("Now text is successfully displayed for close ...");
                //tb.logExtentReport("End Date is not successfully displayed for confirmation");
            }
        }
        WebElement closeDes = findElement(txt_closeDesc);
        String actualDes = closeDes.getText();
        if (expectedDes.contains(actualDes)) {
            log.info("Description is  successfully displayed for close ...");
            //tb.logExtentReport("Description is  successfully displayed for close ");
        } else {
            log.info("Description is  successfully displayed for close ...");
            Assert.fail();
        }

        clickElement(txtCloseButton);


        log.info("Clicked on close button...");
    }


    public void closeMessageBpay(String fAccount, String tAccount, String expectedAmt)
            throws Exception {

        String expectedResult = "Your payment has been created and is awaiting approval before being processed";
        WebElement verification = findElement(txtCloseVerifyy);
        String verifyClose = verification.getText();
        if (verifyClose.equals(expectedResult)) {
            // tb.logExtentReport("Success message is successfully displayed in close page");
            log.info("Success message is successfully displayed in close page");
        } else {
            //tb.logExtentReport("Success message is not successfully displayed in close page");
            log.info("Success message is not successfully displayed in close page");
        }

        WebElement FAccount = findElement(txtVerifyClosefaccount);
        String actaualFaccount = FAccount.getText();
        Assert.assertTrue(actaualFaccount.contains(fAccount));
        log.info("From account is successfully displayed for close ...");
        // tb.logExtentReport("From account is successfully displayed for close ...");

        WebElement toAccount = findElement(toaccountbpayReviewpament);
        String actualToAccount = toAccount.getText();
        if (tAccount.contains(actualToAccount)) {
            log.info("To account is successfully displayed for close ...");

            //tb.logExtentReport("To account is successfully displayed for close....");
        } else {
            log(String.valueOf(Status.FAIL));
            //Assert.fail("To account is not successfully displayed for close");
            log.info("To account is not successfully displayed for close ...");
            //tb.logExtentReport("To account is not successfully displayed for close....");
        }
        WebElement closeAmount = findElement(txtVerifyCloseAmount);
        String actualAmount = closeAmount.getText();
        if (actualAmount.contains(expectedAmt)) {
            log.info("Entered Amount is successfully displayed for close ...");
            // tb.logExtentReport("Enterd Amount is successfully displayed for close ....");
        } else {
            log(String.valueOf(Status.FAIL));
            Assert.fail("Entered Amount is not successfully displayed for close ...");
            log.info("Entered Amount is not successfully displayed for close ...");
            //tb.logExtentReport("Enterd Amount is not successfully displayed for close ..");
        }
        String expectedTrans = "";

        WebElement closeNow = findElement(txtCloseFutureDateVerify);
        String actualText = closeNow.getText();
        if (actualText.equals("Now")) {
            log.info("Now text is successfully displayed for close ...");
            //tb.logExtentReport("End Date is not successfully displayed for confirmation");
        }


        clickElement(txtCloseButton);


        log.info("Clicked on close button...");
    }

    public void closeMessageBpayRecurring(String fAccount, String tAccount, String expectedAmt)
            throws Exception {

        String expectedResult = "Your payment has been created and is awaiting approval before being processed";
        WebElement verification = findElement(txtCloseVerifyy);
        String verifyClose = verification.getText();
        if (verifyClose.equals(expectedResult)) {
            // tb.logExtentReport("Success message is successfully displayed in close page");
            log.info("Success message is successfully displayed in close page");
        } else {
            //tb.logExtentReport("Success message is not successfully displayed in close page");
            log.info("Success message is not successfully displayed in close page");
        }

        WebElement FAccount = findElement(txtVerifyClosefaccount);
        String actaualFaccount = FAccount.getText();
        Assert.assertTrue(actaualFaccount.contains(fAccount));
        log.info("From account is successfully displayed for close ...");
        // tb.logExtentReport("From account is successfully displayed for close ...");

        WebElement toAccount = findElement(toaccountbpayReviewpament);
        String actualToAccount = toAccount.getText();
        if (tAccount.contains(actualToAccount)) {
            log.info("To account is successfully displayed for close ...");

            //tb.logExtentReport("To account is successfully displayed for close....");
        } else {
            log(String.valueOf(Status.FAIL));
            //Assert.fail("To account is not successfully displayed for close");
            log.info("To account is not successfully displayed for close ...");
            //tb.logExtentReport("To account is not successfully displayed for close....");
        }
        WebElement closeAmount = findElement(txtVerifyCloseAmount);
        String actualAmount = closeAmount.getText();
        if (actualAmount.contains(expectedAmt)) {
            log.info("Entered Amount is successfully displayed for close ...");
            // tb.logExtentReport("Enterd Amount is successfully displayed for close ....");
        } else {
            log(String.valueOf(Status.FAIL));
            Assert.fail("Entered Amount is not successfully displayed for close ...");
            log.info("Entered Amount is not successfully displayed for close ...");
            //tb.logExtentReport("Enterd Amount is not successfully displayed for close ..");
        }
        String expectedTrans = "";
        clickElement(txtCloseButton);
        log.info("Clicked on close button...");
    }

    public void closeMessageBpayFuture(String fAccount, String tAccount, String expectedAmt, String date)
            throws Exception {

        String expectedResult = "Your payment has been created and is awaiting approval before being processed";
        WebElement verification = findElement(txtCloseVerifyy);
        String verifyClose = verification.getText();
        if (verifyClose.equals(expectedResult)) {
            // tb.logExtentReport("Success message is successfully displayed in close page");
            log.info("Success message is successfully displayed in close page");
        } else {
            //tb.logExtentReport("Success message is not successfully displayed in close page");
            log.info("Success message is not successfully displayed in close page");
        }

        WebElement FAccount = findElement(txtVerifyClosefaccount);
        String actaualFaccount = FAccount.getText();
        Assert.assertTrue(actaualFaccount.contains(fAccount));
        log.info("From account is successfully displayed for close ...");
        // tb.logExtentReport("From account is successfully displayed for close ...");

        WebElement toAccount = findElement(toaccountbpayReviewpament);
        String actualToAccount = toAccount.getText();
        if (tAccount.contains(actualToAccount)) {
            log.info("To account is successfully displayed for close ...");

            //tb.logExtentReport("To account is successfully displayed for close....");
        } else {
            log(String.valueOf(Status.FAIL));
            //Assert.fail("To account is not successfully displayed for close");
            log.info("To account is not successfully displayed for close ...");
            //tb.logExtentReport("To account is not successfully displayed for close....");
        }
        WebElement closeAmount = findElement(txtVerifyCloseAmount);
        String actualAmount = closeAmount.getText();
        if (actualAmount.contains(expectedAmt)) {
            log.info("Entered Amount is successfully displayed for close ...");
            // tb.logExtentReport("Enterd Amount is successfully displayed for close ....");
        } else {
            log(String.valueOf(Status.FAIL));
            Assert.fail("Entered Amount is not successfully displayed for close ...");
            log.info("Entered Amount is not successfully displayed for close ...");
            //tb.logExtentReport("Enterd Amount is not successfully displayed for close ..");
        }
        String expectedTrans = "";


        clickElement(txtCloseButton);


        log.info("Clicked on close button...");
    }

    public void confirmationMessage(String fAccount, String tAccount, String expectedAmt, String expectedDes) throws Exception {
        //addArrayList = new ArrayList();
        WebElement AccountcontinueButton = findElement(txt_fromAccount);
//      AccountcontinueButton.click();
        String actualfAccount = AccountcontinueButton.getText();
        if (actualfAccount.contains(fAccount)) {
            log.info("From account is successfully displayed for confirmation");
            // tb.logExtentReport("From account is successfully displayed for confirmation");
        } else {
            Assert.fail();
            log.info("From account is not successfully displayed for confirmation");
            // tb.logExtentReport("From account is not successfully displayed for confirmation");
        }
        WebElement tAccountVerification = findElement(txtTacoount);
        String actualTaccount = tAccountVerification.getText();
        if (actualTaccount.contains(tAccount)) {
            log.info("To account is successfully displayed for confirmation");
        } else {
            Assert.fail();
            log.info("To account is not successfully displayed for confirmation");
            //tb.logExtentReport("To account is not successfully displayed for confirmation");
        }
        WebElement verifyAmount = findElement(txtVerifyamount);
        String actualAmount = verifyAmount.getText();
        if (actualAmount.contains(expectedAmt)) {
            log.info("Amount is successfully displayed for confirmation");
        } else {
            log.info("Amount is not successfully displayed for confirmation");
            Assert.fail();
            // tb.logExtentReport("Amount is not successfully displayed for confirmation");
        }
        WebElement VerifyDescription = findElement(txtVerifyDescription);
        String actualDescription = VerifyDescription.getText();
        if (actualDescription.contains(expectedDes)) {
            log.info("Description is successfully displayed for confirmation");
        } else {
            Assert.fail();
            log.info("Description is not successfully displayed for confirmation");
            //tb.logExtentReport("Description is not successfully displayed for confirmation");
        }
        String expectedTrans = "";
        //WebElement VerifyNow = findElement(txtVerifyNow);
        // String a = VerifyNow.getText();
        // if (a.contains("Now")) {
        //WebElement VerifyNow = findElement(txtVerifyNow);
        // String actualText = VerifyNow.getText();
        //log.info("Now text is successfully displayed for confirmation");
        //tb.logExtentReport("Now text is successfully displayed for confirmation");
        //  } else {
//
//            log.info("Now text is not displayed for confirmation");
//            Assert.fail();
//
//        }
        WebElement confirm = findElement(txtconfirmButton);
        confirm.click();


    }

    public void continueMessage() throws Exception {

        WebElement button = findElementClickable(txtcontinueButton);
        // scrollIntoView(button);
        button.click();
        //actions(button);
        log.info("Clicked on Continue button...");
        WebElement verifyConfirm = findElement(txtConfirmationVerify);
        String a = verifyConfirm.getText();
        String b = "Please check your details below and confirm if they are correct.";
        if (a.equals(b)) {
            log.info("PASS:Confirmation message is displayed successfully");

        } else {
            log.info("Confirmation message is not displayed successfully");

        }

    }

    public void AutorizationButtonClick() throws Exception {
        WebElement TxtAuthorization = findElementClickable(txtAuthorization);
        clickElementUsingJavaScript(TxtAuthorization);
        // actions(TxtAuthorization);
    }

    public void logOutIB() throws Exception {
        Thread.sleep(1000);
        WebElement TxtlogOut = findElementClickable(txtlogOut);
        int repeat = 0;
        while (repeat <= 15) {
            try {
                WebElement TxtlogOutt = findElementClickable(txtlogOut);
                actions(TxtlogOutt);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeat++;
        }

        log.info("logged out...");
    }

    public void authFunctionsInternalView(String expectedamount) throws Exception {
        T24homepage thm = new T24homepage();
        //String expectedamount= thm.getPropertyy("enteredIntTransAmtIb");
        Thread.sleep(1000);
        this.driver = driver;
        for (int i = 1; i <= 20; i++) {
            String actualAmount = findElement(By.xpath("//table/tbody/tr[" + i + "]/td[3]")).getText();
            System.out.println(actualAmount + " is actual result");
            System.out.println(expectedamount + "is expected result");
            if (actualAmount.contains(expectedamount)) {
                System.out.println("********Authorisation completed and the iteration value is :" + i);
                WebElement a = findElement(By.xpath(" //*[@id='C1__BUT_AA2928C2FD53379E166650_R" + i + "']"));
                actions(a);
                break;
            }

        }
    }

    public void authorizationConfirmDebitBatchViewTemplate(String account, String description, String amount) throws Exception {
        WebElement authFrom = findElement(txt_viewAuthFrom);
        String authfrom = authFrom.getText();
        if (authfrom.contains(account)) {

            log.info("From account successfully displayed on authorization confirm page");
            // tb.logExtentReport("From account successfully displayed on authorization confirm page");

        } else {


            //tb.test.log(Status.FAIL, "From account successfully not displayed on authorization page");
            Assert.fail("From account successfully not displayed on authorization page");
        }


        WebElement authTo = findElement(txt_viewAuthTo);
        String authto = authTo.getText();
        if (authto.contains(description)) {
            log.info("To account successfully displayed on authorization confirm page");
        } else { //tb.test.log(Status.FAIL,
            //"To account is not displayed successfully on authorization page");
            Assert.fail("To account successfully not displayed on authorization page");
        }
        WebElement authAmount = findElement(txt_viewAmount);
        String authamount = authAmount.getText();
        //authAmt=enteredAmt;
        //String expectedAmt=transactionNowFutRec.get(2);
        if (authamount.contains(amount)) {
            log.info("Amount successfully displayed on authorization confirm page");
            // tb.logExtentReport("Amount account successfully displayed on authorization confirm page");
        } else {
            //tb.test.log(Status.FAIL, "Amount is not displayed successfully on authorization page");
            Assert.fail("Amount successfully not displayed on authorization page");
        }
        WebElement authDes = findElement(txt_viewDescription);
        String authdes = authDes.getText();
        if (authdes.contains(description)) {
            log.info("Description successfully displayed on authorization confirm page");
            // tb.logExtentReport("Description account successfully displayed on authorization confirm page");
        } else {
            // tb.test.log(Status.FAIL, "Description is not displayed successfully on authorization page");
            Assert.fail("Description successfully not displayed on authorization page");
        }


//	   if(isElementPresnt("//*[@id='C1__QUE_06DAC4E323901C91636364_R1']")) {
//       // tb.logExtentReport("The data for Pending Authorisers are displayed successfully");


        WebElement viewApprove = findElement(btn_viewApprove);
        viewApprove.click();

    }

    public void authorizationConfirmDebitBatchViewTemplatee(String account, String description, String amount) throws Exception {
        WebElement authFrom = findElement(txt_viewAuthFrom);
        String authfrom = authFrom.getText();
        if (authfrom.contains(description)) {

            log.info("From account successfully displayed on authorization confirm page");
            // tb.logExtentReport("From account successfully displayed on authorization confirm page");

        } else {


            //tb.test.log(Status.FAIL, "From account successfully not displayed on authorization page");
            Assert.fail("From account successfully not displayed on authorization page");
        }


        WebElement authTo = findElement(txt_viewAuthTo);
        String authto = authTo.getText();
        if (authto.contains(account)) {
            log.info("To account successfully displayed on authorization confirm page");
        } else { //tb.test.log(Status.FAIL,
            //"To account is not displayed successfully on authorization page");
            Assert.fail("To account successfully not displayed on authorization page");
        }
        WebElement authAmount = findElement(txt_viewAmount);
        String authamount = authAmount.getText();
        //authAmt=enteredAmt;
        //String expectedAmt=transactionNowFutRec.get(2);
        amount = authamount.replaceAll("$", "");
        if (authamount.contains(amount)) {
            log.info("Amount successfully displayed on authorization confirm page");
            // tb.logExtentReport("Amount account successfully displayed on authorization confirm page");
        } else {
            //tb.test.log(Status.FAIL, "Amount is not displayed successfully on authorization page");
            Assert.fail("Amount successfully not displayed on authorization page");
        }
        WebElement authDes = findElement(txt_viewDescription);
        String authdes = authDes.getText();
        if (authdes.contains(description)) {
            log.info("Description successfully displayed on authorization confirm page");
            // tb.logExtentReport("Description account successfully displayed on authorization confirm page");
        } else {
            // tb.test.log(Status.FAIL, "Description is not displayed successfully on authorization page");
            Assert.fail("Description successfully not displayed on authorization page");
        }


//	   if(isElementPresnt("//*[@id='C1__QUE_06DAC4E323901C91636364_R1']")) {
//       // tb.logExtentReport("The data for Pending Authorisers are displayed successfully");


        WebElement viewApprove = findElement(btn_viewApprove);
        viewApprove.click();

    }

    public void authorizationConfirmCredtBatchViewTemplate(String account, String description, String amount) throws Exception {
        WebElement authFrom = findElement(txt_viewAuthFrom);
        String authfrom = authFrom.getText();
        if (authfrom.contains(account)) {

            log.info("From account successfully displayed on authorization confirm page");
            // tb.logExtentReport("From account successfully displayed on authorization confirm page");

        } else {


            //tb.test.log(Status.FAIL, "From account successfully not displayed on authorization page");
            Assert.fail("From account successfully not displayed on authorization page");
        }


        WebElement authTo = findElement(txt_viewAuthTo);
        String
                authto = authTo.getText();
        if (description.contains(authto)) {
            log.info("To account successfully displayed on authorization confirm page");
        } else { //tb.test.log(Status.FAIL,
            //"To account is not displayed successfully on authorization page");
            Assert.fail("To account successfully not displayed on authorization page");
        }
        WebElement authAmount = findElement(txt_viewAmount);
        String authamount = authAmount.getText();
        //authAmt=enteredAmt;
        //String expectedAmt=transactionNowFutRec.get(2);
        amount = amount.replace("$", "");
        if (authamount.contains(amount)) {
            log.info("Amount successfully displayed on authorization confirm page");
            // tb.logExtentReport("Amount account successfully displayed on authorization confirm page");
        } else {
            //tb.test.log(Status.FAIL, "Amount is not displayed successfully on authorization page");
            Assert.fail("Amount successfully not displayed on authorization page");
        }
        WebElement authDes = findElement(txt_viewDescription);
        String authdes = authDes.getText();
        if (description.contains(authdes)) {
            log.info("Description successfully displayed on authorization confirm page");
            // tb.logExtentReport("Description account successfully displayed on authorization confirm page");
        } else {
            // tb.test.log(Status.FAIL, "Description is not displayed successfully on authorization page");
            Assert.fail("Description successfully not displayed on authorization page");
        }


//	   if(isElementPresnt("//*[@id='C1__QUE_06DAC4E323901C91636364_R1']")) {
//       // tb.logExtentReport("The data for Pending Authorisers are displayed successfully");


        WebElement viewApprove = findElement(btn_viewApprove);
        viewApprove.click();

    }

    public void reviewAuthorizationBatchTemplate(String amount, String description, String toaccount) {
        //*[text()='The transaction has been successfully approved and processed']
        WebElement Authorizationapprovemsg = findElement(authorizationapprovemsg);
        String authapprovedmsg = Authorizationapprovemsg.getText();
        WebElement Amountbatchpaymentreviewauth = findElement(amountbatchpaymentreviewauth);
        String totalamount = Amountbatchpaymentreviewauth.getText();
        WebElement Toaccountbatchpaymentreviewauth = findElement(toaccountbatchpaymentreviewauth);
        String Toaccount = Toaccountbatchpaymentreviewauth.getText();
        String DescriptionReview = findElement(Description).getText();
        Assert.assertTrue(authapprovedmsg.contains("The transaction has been successfully approved and processed") & totalamount.contains(amount) & DescriptionReview.contains(description) & Toaccount.contains(toaccount));

    }

    public void reviewAuthorizationBatchCredit(String amount, String description, String toaccount) {
        //*[text()='The transaction has been successfully approved and processed']
        WebElement Authorizationapprovemsg = findElement(authorizationapprovemsg);
        String authapprovedmsg = Authorizationapprovemsg.getText();
        WebElement Amountbatchpaymentreviewauth = findElement(amountbatchpaymentreviewauth);
        String totalamount = Amountbatchpaymentreviewauth.getText();
        WebElement Toaccountbatchpaymentreviewauth = findElement(toaccountbatchpaymentreviewauth);
        String Toaccount = Toaccountbatchpaymentreviewauth.getText();
        String DescriptionReview = findElement(Description).getText();
        Assert.assertTrue(authapprovedmsg.contains("The transaction has been successfully approved and processed") & totalamount.contains(amount) & DescriptionReview.contains(description) & Toaccount.contains(description));

    }

    public void reviewAuthorizationCreditBatchTemplate(String amount, String description, String fromaccount) {
        //*[text()='The transaction has been successfully approved and processed']
        WebElement Authorizationapprovemsg = findElement(authorizationapprovemsg);
        String authapprovedmsg = Authorizationapprovemsg.getText();
        WebElement Amountbatchpaymentreviewauth = findElement(amountbatchpaymentreviewauth);
        String totalamount = Amountbatchpaymentreviewauth.getText();
        WebElement FromaccountReviewpaymentbatch = findElement(fromaccountReviewpaymentbatch);

        String Fromaccount = FromaccountReviewpaymentbatch.getText();
        String DescriptionReview = findElement(DescriptionAuth).getText();
        Assert.assertTrue(authapprovedmsg.contains("The transaction has been successfully approved and processed") & totalamount.contains(amount) & DescriptionReview.contains(description) & Fromaccount.contains(fromaccount));

    }

    public void authFunctionsInternalViewBatchTemplate(String expectedamount, String description) throws Exception {
        T24homepage thm = new T24homepage();
        //String expectedamount= thm.getPropertyy("enteredIntTransAmtIb");
        Thread.sleep(1000);
        this.driver = driver;
        for (int i = 1; i <= 20; i++) {
            String actualAmount = findElement(By.xpath("//table/tbody/tr[" + i + "]/td[3]")).getText();
            String Description = findElement(By.xpath("//table/tbody/tr[" + i + "]/td[1]")).getText();
            System.out.println(actualAmount + " is actual result");
            System.out.println(expectedamount + "is expected result");
            if (actualAmount.contains(expectedamount) & Description.contains(description)) {
                System.out.println("********Authorisation completed and the iteration value is :" + i);
                WebElement a = findElement(By.xpath(" //*[@id='C1__BUT_AA2928C2FD53379E166650_R" + i + "']"));
                actions(a);
                break;
            }

        }
    }


    public void inttransrecurring(String amount1, String description1, String freqValue) throws InterruptedException, IOException {
        WebElement recurringButton = findElementClickable(txtrecurringButton);
        scrollIntoView(recurringButton);
        Thread.sleep(200);
        ;
        recurringButton.click();
        Thread.sleep(1000);
        ;
        log.info("Clicked on Recurring button ...");
        //tb.logExtentReport("Click on Recurring button ....");
        WebElement dropDown = findElementClickable(txtdropDown);
        dropDown.click();
        WebElement selectValue = findElement(txtselectValue);
        Select slt = new Select(selectValue);
        List<WebElement> accountsRes = slt.getOptions();
        //recurringdataList.add(0,accountsRes.get(2).getText());

        String fromAccount = selectUsingIndex(selectValue, 1);
        String fromaccountIntRecurring = fromAccount.substring(19, 28);

        //slt.selectByIndex(2);
        Thread.sleep(500);
        WebElement dropDownR1 = findElementClickable(txtdropDown);
        fromAccount = dropDownR1.getText();
        //recurringdataList.add(fromAccount);
        WebElement dropDown1 = findElementClickable(todropdown);
        dropDown1.click();

        WebElement selectValue3 = findElementClickable(txtselectValue3);
        // Select sle = new Select(selectValue3);
        //accountsRes = sle.getOptions();
        //recurringdataList.add(1,accountsRes.get(1).getText());
        // sle.selectByIndex(1);
        // Thread.sleep(1000);

        //   WebElement dropDownR2 = findElementClickable(txtdropDown1);
        String toAccount = selectUsingIndex(selectValue3, 1);
        Thread.sleep(1000);
        toAccount = toAccount.substring(19, 28);
        //toAccount=toAccount.substring(19,28);
        //  recurringdataList.add(toAccount);
        WebElement transferAmount = findElementClickable(txt_transferAmountFuture);
        transferAmount.click();
        //Thread.sleep(5000);
        WebElement transferAmount1 = findElementClickable(txt_transferAmountFuture);
        transferAmount1.sendKeys(amount1);
        //Thread.sleep(2000);
        WebElement transferAmount2 = findElement(txt_transferAmountFuture);
        String enteredAmt = transferAmount2.getAttribute("value");
        // recurringdataList.add(2,enteredAmt);
        log.info("Entered amount in recurring ...");
        // tb.logExtentReport("Click on amount in recurring....");
        WebElement description = findElement(txtdescription);
        description.click();
        //Thread.sleep(2000);
        WebElement description2 = findElement(txtdescription);
        description2.sendKeys(description1);
        //Thread.sleep(2000);
        WebElement description3 = findElement(txtdescription);
        String enteredDes = description3.getAttribute("value");
        // recurringdataList.add(3,enteredDes);
        log.info("Entered Description in recurring ...");
        //tb.logExtentReport("Click on Description  in recurring....");
        WebElement recurringCalaendar1 = findElement(txtrecurringCalaendar1);
        recurringCalaendar1.click();
        WebElement month = findElement(txtmonth);
        Select se = new Select(month);
        //   String strtmonth=DateUtilities.monthafterdays;
        String startMnth = datenumtoName(DateUtilities.monthafterdays);
        se.selectByVisibleText(startMnth);
        int i = Integer.parseInt(DateUtilities.date2);
        WebElement calendarDate1 = findElement(By.xpath("//a[text()=" + i + "]"));
        calendarDate1.click();
        WebElement recurringCalaendarStartDate = findElement(txtrecurringStartDate);
        String startDate = recurringCalaendarStartDate.getAttribute("value");
        //recurringdataList.add(4,startDate);
        System.out.println("Start date is " + startDate);
        WebElement frequency = findElementClickable(txtfrequency);
        frequency.click();
        //Thread.sleep(2000);
        WebElement frequency1 = findElement(txtfrequency);
        Select slc = new Select(frequency1);
        Thread.sleep(1000);
        accountsRes = slc.getOptions();
        slc.selectByVisibleText(freqValue);
        Thread.sleep(1000);
        WebElement frequency2 = findElement(txtfrequency);
        //   freqValue=frequency2.getText();

        WebElement recurringCalaendar = findElement(txtrecurringCalaendar);
        recurringCalaendar.click();
        WebElement month2 = findElement(txtmonth);
        month2.click();
        WebElement month3 = findElement(txtmonth);
        Select sele = new Select(month3);
        String endMnth = datenumtoName(DateUtilities.monthafter5days);
        sele.selectByVisibleText(endMnth);
        int j = Integer.parseInt(DateUtilities.date5);
        WebElement recurringEndDate = findElement(By.xpath("//a[text()=" + j + "]"));
        //WebElement recurringDate =findElementClickable(txtrecurringEndDate);
        recurringEndDate.click();

        WebElement recurringEndDate1 = findElement(txt_recurringEndDate);
        String endDate = recurringEndDate1.getAttribute("value");

        Thread.sleep(1000);
        System.out.println("End date is " + endDate);
        //continueMessage(driver);
        //  confirmationMessage(fromAccount, toAccount, enteredAmt,enteredDes, freqValue, startDate, endDate);
        //  closeMessage(fromAccount, toAccount, enteredAmt,enteredDes, freqValue, startDate, endDate);

        WebElement FROMAccountt = findElementClickable(txtselectValue);
        Select select = new Select(FROMAccountt);
        WebElement firstoption = select.getOptions().get(0);
        if (firstoption.isSelected()) {
            WebElement FROMAccount = findElementClickable(txtselectValue);
            Select selectt = new Select(FROMAccount);
            selectt.selectByIndex(1);
        }


        T24homepage hp = new T24homepage();
        hp.setProperty("StringfromaccountIntRecur", fromaccountIntRecurring);
        hp.setProperty("StringToaccountIntRecur", toAccount);
        hp.setProperty("enteredIntTransAmtIbRecur", enteredAmt);
        hp.setProperty("enteredIntTransDescRecur", enteredDes);


    }


    public void externalTransaction(String amount1, String description1, String description2)
            throws Exception {

        clickElement(txtpayAnyone);
        WebElement TxtpayAnyone = findElementClickable(txtpayAnyone);
        //actions(TxtpayAnyone);
        WebElement dropDownExternal = findElementClickable(txtdropDownExternal);
        actions(dropDownExternal);
        String fromaccountExternal = selectUsingIndex(dropDownExternal, 1);
        String fromAccountexternalNow = fromaccountExternal.substring(19, 28);
        Thread.sleep(1000);
        WebElement dropDownExternal1 = findElementClickable(txtdropDownExternal);
        Thread.sleep(1000);
        int repeat = 0;
        while (repeat <= 20) {

            try {
                WebElement dropDownExternal2 = findElementClickable(txtdropDownExternal);
                actions(dropDownExternal2);

                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeat++;
        }
        //dropDownExternal1.click();
        WebElement dropDownExternal3 = findElementClickable(txtdropDownExternal);
        fromaccountExternal = dropDownExternal3.getText();

        WebElement selectValueExternal = findElementClickable(txtselectValueExternal);
        //Thread.sleep(500);
        Select select=new Select(selectValueExternal);
        List<WebElement> options = select.getOptions();
        String toAccount="";
        // Loop through the options and select one that does not contain "634634"
        List<WebElement> optionss = select.getOptions();
        for (WebElement option : optionss) {
            if (option.getText().contains("806043")) {
                toAccount = option.getText();
                select.selectByVisibleText(option.getText());
                break;
            }

        }




        //String toAccount = selectUsingIndex(selectValueExternal, 7);
        Thread.sleep(1000);
        WebElement selectValueExternall = findElementClickable(txtselectValueExternal);
        // nowExternalDataList.add(1,toAccount);

        //WebElement selectValueExternal1 = findElementClickable(txtselectValueExternal);
        int rep = 0;
        while (rep <= 6) {

            try {
                WebElement Txt_transferAmountIT2 = findElementClickable(txtexternalAmount);
                Txt_transferAmountIT2.click();
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            rep++;
        }
        Thread.sleep(2000);
        // clickElement(txtexternalAmount);

        // Thread.sleep(3000);
        int rept = 0;
        while (rept <= 6) {

            try {
                WebElement Txt_transferAmountIT2 = findElementClickable(txtexternalAmount);

                Txt_transferAmountIT2.sendKeys(amount1);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            rept++;
        }

        WebElement externalAmount2 = findElement(txtexternalAmount);

        String amount = externalAmount2.getAttribute("value");

        WebElement TxtMyDescription = findElement(txtmyDescription);
        actions(TxtMyDescription);
        repeat = 0;
        while (repeat <= 3) {
            try {
                WebElement TxtmyDescription = findElement(txtmyDescription);

                TxtmyDescription.sendKeys(description1);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeat++;
        }
        WebElement myDescription2 = findElement(txtmyDescription);
        String description = myDescription2.getAttribute("value");
        clickElement(txttheirDescription);
        repeat = 0;
        while (repeat <= 3) {

            try {
                WebElement TxttheirDescription = findElement(txttheirDescription);

                TxttheirDescription.sendKeys(description2);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeat++;
        }
        Thread.sleep(1000);
        WebElement theirDescription1 = findElement(txttheirDescription);
        String tDescription = theirDescription1.getAttribute("value");


        WebElement FROMAccountt = findElementClickable(txtdropDownExternal);
        Select select1 = new Select(FROMAccountt);
        WebElement firstoption = select1.getOptions().get(0);
        if (firstoption.isSelected()) {
            WebElement FROMAccount = findElementClickable(txtdropDownExternal);
            Select selectt = new Select(FROMAccount);
            selectt.selectByIndex(1);
        }


        WebElement TxtcontinueButton = findElement(txtcontinueButton);
        actions(TxtcontinueButton);
        log.info("Clicked on Continue button...");
        String startDate = "";
        String endDate = "";

        T24homepage hm = new T24homepage();
        hm.setProperty("externaltransnowfromaccount", fromAccountexternalNow);
        hm.setProperty("externaltransnowtoaccount", toAccount);
        hm.setProperty("externaltransnowAmount", amount);
        hm.setProperty("externaltransnowMYdesc", description);
        hm.setProperty("externaltransnowTheirdesc", tDescription);


        //contonueMsgEFT(fromaccountExternal,toAccount,amount,description,tDescription,typeOfTransaction,startDate,endDate);
        // closeMsgEFT(fromaccountExternal,toAccount,amount,description,tDescription,typeOfTransaction,startDate,endDate);

        //LP.closeButton();

    }


    public void externalTransactionNewContactNow(String amount1, String description1, String description2)
            throws Exception {
        clickElement(txtpayAnyone);
        WebElement TxtpayAnyone = findElementClickable(txtpayAnyone);
        actions(TxtpayAnyone);
        WebElement NewcontactButton = findElementClickable(newcontactButton);
        NewcontactButton.click();

        WebElement dropDownExternal = findElementClickable(txtdropDownExternal);
        actions(dropDownExternal);
        String fromaccountExternal = selectUsingIndex(dropDownExternal, 1);
        String fromAccountexternalNow = fromaccountExternal.substring(19, 28);
        Thread.sleep(1000);


        WebElement Toaccountnamefield = findElementClickable(toaccountnamefield);
        Toaccountnamefield.sendKeys("ext");
        WebElement ToaccountBSBfield = findElementClickable(toaccountBSBfield);
        ToaccountBSBfield.sendKeys("806043");
        Thread.sleep(1000);
        //WebElement ToaccountAccountNumfield = findElementClickable(toaccountAccountNumfield);
        // ToaccountAccountNumfield.click();


        int repeat = 0;
        while (repeat <= 20) {

            try {
                WebElement ToaccountAccountNumfield = findElementClickable(toaccountAccountNumfield);
                ToaccountAccountNumfield.click();

                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeat++;
        }
        WebElement ToAccountAccountNumfield = findElementClickable(toaccountAccountNumfield);
        ToAccountAccountNumfield.sendKeys("200052076");


        String toAccountnumber = ToAccountAccountNumfield.getAttribute("value");

        int rep = 0;
        while (rep <= 6) {

            try {
                WebElement Txt_transferAmountIT2 = findElementClickable(txtexternalAmount);
                Txt_transferAmountIT2.click();
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            rep++;
        }
        Thread.sleep(2000);
        int rept = 0;
        while (rept <= 6) {

            try {
                WebElement Txt_transferAmountIT2 = findElementClickable(txtexternalAmount);

                Txt_transferAmountIT2.sendKeys(amount1);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            rept++;
        }
        WebElement externalAmount2 = findElement(txtexternalAmount);

        String amount = externalAmount2.getAttribute("value");

        WebElement TxtMyDescription = findElement(txtmyDescription);
        actions(TxtMyDescription);
        int repeatt = 0;
        while (repeatt <= 3) {
            try {
                WebElement TxtmyDescription = findElement(txtmyDescription);

                TxtmyDescription.sendKeys(description1);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeatt++;
        }
        WebElement myDescription2 = findElement(txtmyDescription);
        String description = myDescription2.getAttribute("value");
        clickElement(txttheirDescription);
        repeat = 0;
        while (repeat <= 3) {

            try {
                WebElement TxttheirDescription = findElement(txttheirDescription);

                TxttheirDescription.sendKeys(description2);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeat++;
        }
        Thread.sleep(1000);
        WebElement theirDescription1 = findElement(txttheirDescription);
        String tDescription = theirDescription1.getAttribute("value");


        WebElement FROMAccountt = findElementClickable(txtdropDownExternal);
        Select selectt = new Select(FROMAccountt);
        WebElement firstoption = selectt.getOptions().get(0);
        if (firstoption.isSelected()) {
            WebElement FROMAccount = findElementClickable(txtdropDownExternal);
            Select Sele = new Select(FROMAccount);
            Sele.selectByIndex(1);
        }


        WebElement TxtcontinueButton = findElement(txtcontinueButton);


        actions(TxtcontinueButton);
        log.info("Clicked on Continue button...");

        String endDate = "";


        T24homepage hm = new T24homepage();
        String startDate = hm.datePickIBM();
        hm.setProperty("externaltransnowDateNewContact", startDate);
        hm.setProperty("externaltransnowfromaccountNewContact", fromAccountexternalNow);
        hm.setProperty("externaltransnowtoaccountNewContact", toAccountnumber);
        hm.setProperty("externaltransnowAmountNewContact", amount);
        hm.setProperty("externaltransnowMYdescNewContact", description);
        hm.setProperty("externaltransnowTheirdescNewContact", tDescription);


    }

    public void externalRecurringTransferNewContact(String amount1, String des1, String des) throws Exception {
        WebElement payAnyone = findElementClickable(txtpayAnyone);
        payAnyone.click();
        WebElement NewcontactButton = findElementClickable(newcontactButton);
        NewcontactButton.click();
        WebElement recurringButton = findElementClickable(txtRecurringButton);
        //findElement
        recurringButton.click();
        log.info("Clicked on Recurring button ...");
        //tb.logExtentReport("Click on Recurring button ....");
        //	Thread.sleep(2000);

        int repeat = 0;
        while (repeat <= 15) {

            try {
                WebElement dropdownRecuringExtern = findElement(txtDropdownRecuringExternal);
                //	dropdownRecuringExtern.click();
                actions(dropdownRecuringExtern);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeat++;
        }
        Thread.sleep(1000);


        WebElement dropdownRecuringExternal = findElement(txtDropdownRecuringExternal);
        Select sl = new Select(dropdownRecuringExternal);
        List<WebElement> rslt = sl.getOptions();
        String fromAccount = selectUsingIndex(dropdownRecuringExternal, 1);
        String fromaccountExtSavedRecurring = fromAccount.substring(19, 28);
        fromaccountExtSavedRecurring = fromaccountExtSavedRecurring.replace(" ", "");
        WebElement dropdownRecuringExternal1 = findElement(txtDropdownRecuringExternal);
        String fromAccountt = dropdownRecuringExternal1.getAttribute("value");
//    WebElement dropdown2RecuringExternal2 = findElementClickable(txtDropdown2RecuringExternal);
//    dropdown2RecuringExternal2.click();
//    int rep = 0;
//		while(rep<=15)
//    {
//        try {
//            WebElement dropdown2RecuringExternal3 = findElement(txtDropdown2RecuringExternal);
//            actions(dropdown2RecuringExternal3);
//
//            break;
//        } catch (StaleElementReferenceException exc) {
//            exc.printStackTrace();
//        }
//        rep++;
//    }
        Thread.sleep(1000);
//    WebElement dropdown2RecuringExternal = findElement(txtDropdown2RecuringExternal);
//    Select exSl = new Select(dropdown2RecuringExternal);
        //List<WebElement> rslt1 = exSl.getOptions();
        //exSl.selectByIndex(7);
        WebElement Toaccountnamefield = findElementClickable(toaccountnamefield);
        Toaccountnamefield.click();
        Toaccountnamefield.sendKeys("ext");
        WebElement ToaccountBSBfield = findElementClickable(toaccountBSBfield);
        ToaccountBSBfield.sendKeys("806043");
        Thread.sleep(1000);
        //WebElement ToaccountAccountNumfield = findElementClickable(toaccountAccountNumfield);
        // ToaccountAccountNumfield.click();


        int rep = 0;
        while (rep <= 20) {

            try {
                WebElement ToaccountAccountNumfield = findElementClickable(toaccountAccountNumfield);
                ToaccountAccountNumfield.click();

                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            rep++;
        }
        WebElement ToAccountAccountNumfield = findElementClickable(toaccountAccountNumfield);
        ToAccountAccountNumfield.sendKeys("200052076");


        String toAccountnumber = ToAccountAccountNumfield.getAttribute("value");


        //toAccount= toAccount.substring(32,43);
        WebElement externalAmount = findElement(txtExternalAmount);
        externalAmount.click();
        WebElement externalAmountt = findElementClickable(txtExternalAmount);
        int rept = 0;
        while (rept <= 15) {
            try {
                WebElement externalAmounT = findElementClickable(txtExternalAmount);
                actions(externalAmounT);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            rept++;
        }
        WebElement externalAmounntt = findElementClickable(txtExternalAmount);
        WebElement externalAmount1 = findElementClickable(txtExternalAmount);
        int repett = 0;
        while (repett <= 15) {
            try {
                WebElement externalAmounttt = findElementClickable(txtExternalAmount);
                actions(externalAmounttt);
                //externalAmounttt.click();
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repett++;
        }

        WebElement externalAmount13 = findElementClickable(txtExternalAmount);
        externalAmount13.sendKeys(amount1);
        WebElement externalAmount2 = findElement(txtExternalAmount);
        String amount = externalAmount2.getAttribute("value");
        //	String ExternalRecurringDataList.add(2,amount);
        log.info("Entered amount in recurring ...");
        //tb.logExtentReport("Click on amount in recurring....");
        Thread.sleep(1000);
        int repet = 0;
        while (repet <= 15) {
            try {
                WebElement myDescription = findElementClickable(txtmyDescription);
                actions(myDescription);
                //myDescription.click();
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repet++;
        }
        WebElement myDescription3 = findElement(txtmyDescription);
        myDescription3.clear();
        WebElement myDescription1 = findElement(txtmyDescription);
        myDescription1.sendKeys(des1);
        WebElement myDescription2 = findElement(txtmyDescription);
        String description = myDescription2.getAttribute("value");
        Thread.sleep(1000);
        int repeatt = 0;
        while (repeatt <= 15) {
            try {
                WebElement theirDescription = findElement(txttheirDescription);
                actions(theirDescription);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeatt++;
        }

        Thread.sleep(1000);
        WebElement theirDescription1 = findElement(txttheirDescription);
        theirDescription1.sendKeys(des1);

        WebElement theirDescription2 = findElement(txttheirDescription);
        String tDescription = theirDescription2.getAttribute("value");
        log.info("Entered Description in recurring ...");
        String typeOfTransaction = "";
        WebElement recurringCalaendar1 = findElement(txtRecurringCalaendar1);
        recurringCalaendar1.click();
        WebElement month = findElement(txtMonth);
        month.click();
        Select sel = new Select(month);
        String startMnth = datenumtoName(DateUtilities.monthafterdays);
        sel.selectByVisibleText(startMnth);
        int i = Integer.parseInt(DateUtilities.date2);
        WebElement calendarDate1 = findElement(By.xpath("//a[text()=" + i + "]"));
        calendarDate1.click();
        WebElement recurringCalaendarStartDate = findElement(txtrecurringStartDate);
        String startDate = recurringCalaendarStartDate.getAttribute("value");
        WebElement Externalfrequency = findElement(txtExternalfrequency);
        Select slt = new Select(Externalfrequency);
        rslt = slt.getOptions();
        Thread.sleep(500);
        Select slt1 = new Select(Externalfrequency);
        slt1.selectByIndex(1);
        WebElement Externalfrequency1 = findElementClickable(txtExternalfrequency);
        String freq = Externalfrequency1.getAttribute("value");
        WebElement recurringExternalCalaendar2 = findElement(txtrecurringExternalCalaendar2);
        recurringExternalCalaendar2.click();
        WebElement month1 = findElement(txtMonth);
        Select select = new Select(month1);
        String endmonth = datenumtoName(DateUtilities.Monthrecurringend);
        select.selectByVisibleText(endmonth);
        int j = Integer.parseInt(DateUtilities.dateend);
        WebElement calendarDate2 = findElement(By.xpath("//a[text()=" + j + "]"));
        calendarDate2.click();

        //select.selectByIndex(10);
//        WebElement recurringDate1 = findElement(txtDate);
//		recurringDate1.click();
        WebElement recurringEndDate2 = findElement(txt_recurringEndDate);
        String endDate = recurringEndDate2.getAttribute("value");
        Thread.sleep(1000);

        WebElement FROMAccountt = findElementClickable(txtDropdownRecuringExternal);
        Select selectt = new Select(FROMAccountt);
        WebElement firstoption = selectt.getOptions().get(0);
        if (firstoption.isSelected()) {
            WebElement FROMAccount = findElementClickable(txtDropdownRecuringExternal);
            Select Sele = new Select(FROMAccount);
            Sele.selectByIndex(1);
        }


        WebElement continueButton = findElementClickable(txtcontinueButton);
        continueButton.click();
        T24homepage hm = new T24homepage();
        hm.setProperty("externaltransrecurringfromaccountNewContact", fromaccountExtSavedRecurring);
        hm.setProperty("externaltransrecurringtoaccountNewContact", toAccountnumber);
        hm.setProperty("externaltransrecurringAmountNewContact", amount);
        hm.setProperty("externaltransrecurringMYdescNewContact", description);
        hm.setProperty("externaltransrecurringTheirdescNewContact", tDescription);
        hm.setProperty("externaltransrecurringStartDateNewContact", startDate);
        hm.setProperty("externaltransrecurringEndDateNewContact", endDate);

    }


    public void externalRecurringTransfer1(String amount1, String des1, String des) throws Exception {
        WebElement payAnyone = findElementClickable(txtpayAnyone);
        payAnyone.click();
        WebElement recurringButton = findElement(txtRecurringButton);
        //findElement
        recurringButton.click();
        log.info("Clicked on Recurring button ...");
        //tb.logExtentReport("Click on Recurring button ....");
        //	Thread.sleep(2000);

        int repeat = 0;
        while (repeat <= 15) {

            try {
                WebElement dropdownRecuringExtern = findElement(txtDropdownRecuringExternal);
                //	dropdownRecuringExtern.click();
                actions(dropdownRecuringExtern);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeat++;
        }
        Thread.sleep(1000);


        WebElement dropdownRecuringExternal = findElement(txtDropdownRecuringExternal);
        Select sl = new Select(dropdownRecuringExternal);
        List<WebElement> rslt = sl.getOptions();
        String fromAccount = selectUsingIndex(dropdownRecuringExternal, 1);
        String fromaccountExtSavedRecurring = fromAccount.substring(19, 28);
        fromaccountExtSavedRecurring = fromaccountExtSavedRecurring.replace(" ", "");
        WebElement dropdownRecuringExternal1 = findElement(txtDropdownRecuringExternal);
        String fromAccountt = dropdownRecuringExternal1.getAttribute("value");

        Thread.sleep(1000);

        //WebElement selectValue3 = findElementClickable(txtselectValue3);
        // Select sle = new Select(selectValue3);

        WebElement dropDownR2 = findElement(txtdropDown1);


        Select select=new Select(dropDownR2);

        String toAccount="";
        // Loop through the options and select one that does not contain "634634"
        List<WebElement> optionss = select.getOptions();
        for (WebElement option : optionss) {
            if (option.getText().contains("806043")) {
                toAccount = option.getText();
                select.selectByVisibleText(option.getText());
                break;
            }



        }




        //String toAccount = selectUsingIndex(dropDownR2, 1);
        Thread.sleep(1000);
        WebElement dropDownTo = findElementClickable(txtdropDown1);
        dropDownTo.click();
        toAccount = "";
        //  toAccount = toAccount.substring(33, 43);
        WebElement externalAmount = findElement(txtExternalAmount);
        externalAmount.click();
        WebElement externalAmountt = findElementClickable(txtExternalAmount);
        int rept = 0;
        while (rept <= 15) {
            try {
                WebElement externalAmounT = findElementClickable(txtExternalAmount);
                actions(externalAmounT);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            rept++;
        }
        WebElement externalAmounntt = findElementClickable(txtExternalAmount);
        WebElement externalAmount1 = findElementClickable(txtExternalAmount);
        int repett = 0;
        while (repett <= 15) {
            try {
                WebElement externalAmounttt = findElementClickable(txtExternalAmount);
                actions(externalAmounttt);
                //externalAmounttt.click();
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repett++;
        }

        WebElement externalAmount13 = findElementClickable(txtExternalAmount);
        externalAmount13.sendKeys(amount1);
        WebElement externalAmount2 = findElement(txtExternalAmount);
        String amount = externalAmount2.getAttribute("value");
        //	String ExternalRecurringDataList.add(2,amount);
        log.info("Entered amount in recurring ...");
        //tb.logExtentReport("Click on amount in recurring....");
        Thread.sleep(1000);
        int repet = 0;
        while (repet <= 15) {
            try {
                WebElement myDescription = findElementClickable(txtmyDescription);
                actions(myDescription);
                //myDescription.click();
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repet++;
        }
        WebElement myDescription3 = findElement(txtmyDescription);
        myDescription3.clear();
        WebElement myDescription1 = findElement(txtmyDescription);
        myDescription1.sendKeys(des1);
        WebElement myDescription2 = findElement(txtmyDescription);
        String description = myDescription2.getAttribute("value");
        Thread.sleep(1000);
        int repeatt = 0;
        while (repeatt <= 15) {
            try {
                WebElement theirDescription = findElement(txttheirDescription);
                actions(theirDescription);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeatt++;
        }

        Thread.sleep(1000);
        WebElement theirDescription1 = findElement(txttheirDescription);
        theirDescription1.sendKeys(des1);

        WebElement theirDescription2 = findElement(txttheirDescription);
        String tDescription = theirDescription2.getAttribute("value");
        log.info("Entered Description in recurring ...");
        String typeOfTransaction = "";
        WebElement recurringCalaendar1 = findElement(txtRecurringCalaendar1);
        recurringCalaendar1.click();
        WebElement month = findElement(txtMonth);
        month.click();
        Select sel = new Select(month);
        String startMnth = datenumtoName(DateUtilities.monthafterdays);
        sel.selectByVisibleText(startMnth);
        int i = Integer.parseInt(DateUtilities.date2);
        WebElement calendarDate1 = findElement(By.xpath("//a[text()=" + i + "]"));
        calendarDate1.click();
        Thread.sleep(1000);
        WebElement recurringCalaendarStartDate = findElement(txtrecurringStartDate);
        String startDate = recurringCalaendarStartDate.getAttribute("value");
        WebElement Externalfrequency = findElement(txtExternalfrequency);
        Select slt = new Select(Externalfrequency);
        rslt = slt.getOptions();
        Thread.sleep(500);
        Select slt1 = new Select(Externalfrequency);
        slt1.selectByIndex(1);
        WebElement Externalfrequency1 = findElementClickable(txtExternalfrequency);
        String freq = Externalfrequency1.getAttribute("value");
        WebElement recurringExternalCalaendar2 = findElement(txtrecurringExternalCalaendar2);
        recurringExternalCalaendar2.click();
        WebElement month1 = findElement(txtMonth);
        Select select1 = new Select(month1);
        String endmonth = datenumtoName(DateUtilities.Monthrecurringend);
        select1.selectByVisibleText(endmonth);
        int j = Integer.parseInt(DateUtilities.dateend);
        WebElement calendarDate2 = findElement(By.xpath("//a[text()=" + j + "]"));
        calendarDate2.click();

        //select.selectByIndex(10);
//        WebElement recurringDate1 = findElement(txtDate);
//		recurringDate1.click();
        WebElement recurringEndDate2 = findElement(txt_recurringEndDate);
        String endDate = recurringEndDate2.getAttribute("value");
        Thread.sleep(1000);

        WebElement FROMAccountt = findElementClickable(txtDropdownRecuringExternal);
        Select selectt = new Select(FROMAccountt);
        WebElement firstoption = selectt.getOptions().get(0);
        if (firstoption.isSelected()) {
            WebElement FROMAccount = findElementClickable(txtDropdownRecuringExternal);
            Select Selectt = new Select(FROMAccount);
            Selectt.selectByIndex(1);
        }


        WebElement continueButton = findElementClickable(txtcontinueButton);
        continueButton.click();
        T24homepage hm = new T24homepage();
        hm.setProperty("savedexternaltransrecurringfromaccountNewContact", fromaccountExtSavedRecurring);
        hm.setProperty("savedexternaltransrecurringtoaccountNewContact", toAccount);
        hm.setProperty("savedexternaltransrecurringAmountNewContact", amount);
        hm.setProperty("savedexternaltransrecurringMYdescNewContact", description);
        hm.setProperty("savedexternaltransrecurringTheirdescNewContact", tDescription);
        hm.setProperty("savedexternaltransrecurringStartDateNewContact", startDate);
        hm.setProperty("savedexternaltransrecurringEndDateNewContact", endDate);


    }


    public void externalfutureTransfer1Newcontact(String amount1, String des1, String des) throws Exception {
        WebElement payAnyone = findElementClickable(txtpayAnyone);
        payAnyone.click();
        WebElement NewcontactButton = findElementClickable(newcontactButton);
        NewcontactButton.click();
        WebElement recurringButton = findElementClickable(txtRecurringButton);
        //findElement
        actions(recurringButton);
        recurringButton.click();
        log.info("Clicked on Recurring button ...");
        //tb.logExtentReport("Click on Recurring button ....");
        //	Thread.sleep(2000);

        int repeat = 0;
        while (repeat <= 15) {

            try {
                WebElement dropdownRecuringExtern = findElementClickable(txtDropdownRecuringExternal);
                //	dropdownRecuringExtern.click();
                actions(dropdownRecuringExtern);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeat++;
        }
        Thread.sleep(1000);


        WebElement dropdownRecuringExternal = findElement(txtDropdownRecuringExternal);
        Select sl = new Select(dropdownRecuringExternal);
        List<WebElement> rslt = sl.getOptions();
        String fromAccount = selectUsingIndex(dropdownRecuringExternal, 1);
        String fromaccountExtSavedRecurring = fromAccount.substring(19,28);
        String fromaccountExtnewcontactRecurring = fromaccountExtSavedRecurring.replace(" ", "");
        WebElement dropdownRecuringExternal1 = findElement(txtDropdownRecuringExternal);
        String fromAccountt = dropdownRecuringExternal1.getAttribute("value");
        WebElement Toaccountnamefield = findElementClickable(toaccountnamefield);
        Toaccountnamefield.sendKeys("ext");
        WebElement ToaccountBSBfield = findElementClickable(toaccountBSBfield);
        ToaccountBSBfield.sendKeys("806043");
        Thread.sleep(1000);

        int repeatt = 0;
        while (repeatt <= 20) {

            try {
                WebElement ToaccountAccountNumfield = findElementClickable(toaccountAccountNumfield);
                ToaccountAccountNumfield.click();

                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeatt++;
        }
        WebElement ToAccountAccountNumfield = findElementClickable(toaccountAccountNumfield);
        ToAccountAccountNumfield.sendKeys("200052076");


        String toAccountnumber = ToAccountAccountNumfield.getAttribute("value");


        //toAccount= toAccount.substring(32,43);
        WebElement externalAmount = findElement(txtExternalAmount);
        externalAmount.click();
        WebElement externalAmountt = findElementClickable(txtExternalAmount);
        int rept = 0;
        while (rept <= 15) {
            try {
                WebElement externalAmounT = findElementClickable(txtExternalAmount);
                actions(externalAmounT);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            rept++;
        }
        WebElement externalAmounntt = findElementClickable(txtExternalAmount);
        WebElement externalAmount1 = findElementClickable(txtExternalAmount);
        int repett = 0;
        while (repett <= 15) {
            try {
                WebElement externalAmounttt = findElementClickable(txtExternalAmount);
                actions(externalAmounttt);
                //externalAmounttt.click();
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repett++;
        }

        WebElement externalAmount13 = findElementClickable(txtExternalAmount);
        externalAmount13.sendKeys(amount1);
        WebElement externalAmount2 = findElement(txtExternalAmount);
        String amount = externalAmount2.getAttribute("value");
        //	String ExternalRecurringDataList.add(2,amount);
        log.info("Entered amount in recurring ...");
        //tb.logExtentReport("Click on amount in recurring....");
        Thread.sleep(1000);
        int repet = 0;
        while (repet <= 15) {
            try {
                WebElement myDescription = findElementClickable(txtmyDescription);
                actions(myDescription);
                //myDescription.click();
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repet++;
        }
        WebElement myDescription3 = findElement(txtmyDescription);
        myDescription3.clear();
        WebElement myDescription1 = findElement(txtmyDescription);
        myDescription1.sendKeys(des1);
        WebElement myDescription2 = findElement(txtmyDescription);
        String description = myDescription2.getAttribute("value");
        Thread.sleep(1000);
        int Repeatt = 0;
        while (Repeatt <= 15) {
            try {
                WebElement theirDescription = findElement(txttheirDescription);
                actions(theirDescription);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            Repeatt++;
        }

        Thread.sleep(1000);
        WebElement theirDescription1 = findElement(txttheirDescription);
        theirDescription1.sendKeys(des1);

        WebElement theirDescription2 = findElement(txttheirDescription);
        String tDescription = theirDescription2.getAttribute("value");
        log.info("Entered Description in recurring ...");
        String typeOfTransaction = "";
        WebElement recurringCalaendar1 = findElement(txtRecurringCalaendar1);
        recurringCalaendar1.click();
        WebElement month = findElement(txtMonth);
        month.click();
        Select sel = new Select(month);
        String startMnth = datenumtoName(DateUtilities.monthafterdays);
        sel.selectByVisibleText(startMnth);
        int i = Integer.parseInt(DateUtilities.date2);
        WebElement calendarDate1 = findElement(By.xpath("//a[text()=" + i + "]"));
        calendarDate1.click();
        WebElement recurringCalaendarStartDate = findElement(txtrecurringStartDate);
        String startDate = recurringCalaendarStartDate.getAttribute("value");
        WebElement Externalfrequency = findElement(txtExternalfrequency);
        Select slt = new Select(Externalfrequency);
        rslt = slt.getOptions();
        Thread.sleep(500);
        Select slt1 = new Select(Externalfrequency);
        slt1.selectByIndex(1);
        WebElement Externalfrequency1 = findElementClickable(txtExternalfrequency);
        String freq = Externalfrequency1.getAttribute("value");
        WebElement recurringExternalCalaendar2 = findElement(txtrecurringExternalCalaendar2);
        recurringExternalCalaendar2.click();
        WebElement month1 = findElement(txtMonth);
        Select select = new Select(month1);
        String endmonth = datenumtoName(DateUtilities.Monthrecurringend);
        select.selectByVisibleText(endmonth);
        int j = Integer.parseInt(DateUtilities.dateend);
        WebElement calendarDate2 = findElement(By.xpath("//a[text()=" + j + "]"));
        calendarDate2.click();

        //select.selectByIndex(10);
//        WebElement recurringDate1 = findElement(txtDate);
//		recurringDate1.click();
        WebElement recurringEndDate2 = findElement(txt_recurringEndDate);
        String endDate = recurringEndDate2.getAttribute("value");
        Thread.sleep(1000);
        WebElement continueButton = findElementClickable(txtcontinueButton);
        continueButton.click();
        T24homepage hm = new T24homepage();
        hm.setProperty("externaltransrecurringfromaccountNewAccount", fromaccountExtnewcontactRecurring);
        hm.setProperty("externaltransrecurringtoaccountNewAccount", toAccountnumber);
        hm.setProperty("externaltransrecurringAmountNewAccount", amount);
        hm.setProperty("externaltransrecurringMYdescNewAccount", description);
        hm.setProperty("externaltransrecurringTheirdescNewAccount", tDescription);
        hm.setProperty("externaltransrecurringStartDateNewAccount", startDate);
        hm.setProperty("externaltransrecurringEndDateNewAccount", endDate);


    }


    public void contonueMsgEFT(String fAccount, String taccount, String amt, String des, String theirDes, String expectedTrans, String sDate, String eDate) throws Exception {

        log.info("Clicked on Continue button ...");
        WebElement verifyConfirm = findElement(txtConfirmationVerify);

        String actText = verifyConfirm.getText();
        String b = "Please check your details below and confirm if they are correct.";
        if (actText.equals(b)) {
            log.info("Confirmation message is displayed successfully");
            //tb.logExtentReport("Confirmation message is displayed successfully");
        } else {
            log.info("Confirmation message is not displayed successfully");
            // tb.logExtentReport("Confirmation message is not displayed successfully");
        }

        WebElement faccount = findElement(txt_faccountEFT);
        String actualfAccount = faccount.getText();
        if (fAccount.contains(actualfAccount)) {
            log.info("From account is successfully displayed for confirmation");
            // tb.logExtentReport("From account is successfully displayed for confirmation");
            //addArrayList.add(actualfAccount);
        } else {
            log.info("From ccount is not successfully displayed for confirmation");
            //tb.logExtentReport("From account is not successfully displayed for confirmation");
        }
        WebElement tAccountVerification = findElement(txt_toAccountEFT);
        String actualTaccount = tAccountVerification.getText();

        if (taccount.contains(actualTaccount)) {
            log.info("To account is successfully displayed for confirmation");
            // tb.logExtentReport("To account is successfully displayed for confirmation");
            //addArrayList.add(actualTaccount);
        } else {
            log.info("To account is not successfully displayed for confirmation");
            // tb.logExtentReport("To account is not successfully displayed for confirmation");
        }
        WebElement verifyAmount = findElement(txt_amountEFT);
        String actualAmount = verifyAmount.getText();
        if (actualAmount.contains(amt)) {
            log.info("Amount is successfully displayed for confirmation");
            //tb.logExtentReport("Amount is successfully displayed for confirmation");
            //addArrayList.add(actualAmount);
        } else {
            log.info("Amount is not successfully displayed for confirmation");
            // tb.logExtentReport("Amount is not successfully displayed for confirmation");
        }
        WebElement VerifyDescription = findElement(txt_myDes);
        String actualDescription = VerifyDescription.getText();
        if (des.contains(actualDescription)) {
            log.info("Description is successfully displayed for confirmation");

        } else {
            log.info("Description is not successfully displayed for confirmation");
            //tb.logExtentReport("Description is not successfully displayed for confirmation");
        }

        WebElement VerifyTheirDescription = findElement(txt_myDes);
        String actualDescription1 = VerifyTheirDescription.getText();
        if (des.contains(actualDescription1)) {
            log.info(" Their description is successfully displayed for confirmation");
            // tb.logExtentReport("Their description is successfully displayed for confirmation");
            //  addArrayList.add(actualDescription1);
        } else {
            log.info("Their description is not successfully displayed for confirmation");
            //tb.logExtentReport("Their description is not successfully displayed for confirmation");
        }

        if (expectedTrans == "Now") {
            WebElement VerifyNow = findElement(txtVerifyNow);
            String actualText = VerifyNow.getText();
            log.info("Now text is successfully displayed for confirmation");
            //  tb.logExtentReport("Now text is successfully displayed for confirmation");
            //addArrayList.add(actualText);
        }

        //if(isElementPresent("//span[text()='Transfer Date']//ancestor::*[@class='row row-margin  ']//span[@class='form-control']")) {
        WebElement verifyFuture = findElement(txtVerifyFuture);
        String startdate = verifyFuture.getText();
        boolean b1 = verifyFuture.isDisplayed();
        if (b1 == true) {
            if (startdate.equals(sDate)) {
                log.info("Future date is successfully displayed for confirmation");
                // tb.logExtentReport("Future date is successfully displayed for confirmation");

            }


        }
    }


    public void closeMsgEFT(String fAccount, String taccount, String amt, String des, String theirDes, String expectedTrans, String sDate, String eDate) throws Exception {

        log.info("Clicked on Continue button ...");
        WebElement verifyConfirm = findElement(txt_closeMessage);
        String a = verifyConfirm.getText();
        String b = "Your payment has been created and is awaiting approval before being processed";
        if (a.equals(b)) {
            log.info("Confirmation message is successfully displayed in close page");
            //tb.logExtentReport("Confirmation message is successfully displayed in close page");
        } else {
            log.info("Confirmation message is not successfully displayed in close page");
            // tb.logExtentReport("Confirmation message is not successfully displayed in close page");
        }

        WebElement faccount = findElement(txt_faccountEFT);
        String actualfAccount = faccount.getText();
        if (fAccount.contains(actualfAccount)) {
            log.info("From account is successfully displayed for confirmation");
            //tb.logExtentReport("From account is successfully displayed for confirmation");

        } else {
            log.info("From ccount is not successfully displayed for confirmation");
            //tb.logExtentReport("From account is not successfully displayed for confirmation");
        }
        WebElement tAccountVerification = findElement(txt_toAccountEFT);
        String actualTaccount = tAccountVerification.getText();
        if (taccount.contains(actualTaccount)) {
            log.info("To account is successfully displayed for confirmation");
            //tb.logExtentReport("To account is successfully displayed for confirmation");
        } else {
            log.info("To account is not successfully displayed for confirmation");
            // tb.logExtentReport("To account is not successfully displayed for confirmation");
        }
        WebElement verifyAmount = findElement(txt_amountEFT);
        String actualAmount = verifyAmount.getText();
        if (actualAmount.contains(amt)) {
            log.info("Amount is successfully displayed for confirmation");
            // tb.logExtentReport("Amount is successfully displayed for confirmation");
        } else {
            log.info("Amount is not successfully displayed for confirmation");
            //tb.logExtentReport("Amount is not successfully displayed for confirmation");
        }
        WebElement VerifyDescription = findElement(txt_myDes);
        String actualDescription = VerifyDescription.getText();
        if (des.contains(actualDescription)) {
            log.info("Description is successfully displayed for confirmation");
            // tb.logExtentReport("Description is successfully displayed for confirmation");
        } else {
            log.info("Description is not successfully displayed for confirmation");
            //tb.logExtentReport("Description is not successfully displayed for confirmation");
        }

        WebElement VerifyTheirDescription = findElement(txt_myDes);
        String actualDescription1 = VerifyTheirDescription.getText();
        if (des.contains(actualDescription1)) {
            log.info(" Their description is successfully displayed for confirmation");
            //tb.logExtentReport("Their description is successfully displayed for confirmation");
        } else {
            log.info("Their description is not successfully displayed for confirmation");
            // tb.logExtentReport("Their description is not successfully displayed for confirmation");
        }

        if (expectedTrans == "Now") {
            WebElement VerifyNow = findElement(txtVerifyNow);
            String actualText = VerifyNow.getText();
            log.info("Now text is successfully displayed for confirmation");
            // tb.logExtentReport("Now text is successfully displayed for confirmation");
        }

        clickElement(txtCloseButton);

        log.info("Clicked on close button...");
    }


    public void recuringDetailsVerify(String date, String frequency, String enddate) {
        WebElement RecurringStartdate = findElement(recurringStartdate);
        String Startdate = RecurringStartdate.getText();
        WebElement RecurringEnddate = findElement(recurringEnddate);
        String Enddate = RecurringEnddate.getText();
        WebElement Frequency = findElement(recurrinfreque);
        String FrequencyRec = Frequency.getText();
        Assert.assertTrue(Startdate.contains(date) && Enddate.contains(enddate) && FrequencyRec.contains(frequency));


    }


    public void recuringDetailsAutorize(String date, String frequency, String enddate) {
        WebElement RecurringStartdate = findElement(recurringStartdateAutorization);
        String Startdate = RecurringStartdate.getText();
        WebElement RecurringEnddate = findElement(recurringEnddateAutorization);
        String Enddate = RecurringEnddate.getText();
        WebElement Frequency = findElement(recurrinfrequeAutorization);
        String FrequencyRec = Frequency.getText();
        Assert.assertTrue(Startdate.contains(date) && Enddate.contains(enddate) && FrequencyRec.contains(frequency));


    }

    public void recuringDetailsVerifyReviewPayment(String date, String frequency, String enddate) {
        WebElement RecurringStartdate = findElement(recurringStartdateReviewPayment);
        String Startdate = RecurringStartdate.getText();
        WebElement RecurringEnddate = findElement(recurringEnddateReviewPayment);
        String Enddate = RecurringEnddate.getText();
        WebElement Frequency = findElement(recurrinfrequeReviewPayment);
        String FrequencyRec = Frequency.getText();
        Assert.assertTrue(Startdate.contains(date) && Enddate.contains(enddate) && FrequencyRec.contains(frequency));


    }


    public void ConfirmExternalTransferpayment(String fAccount, String tAccount, String expectedAmt, String desc) {
        T24homepage hp = new T24homepage();
        //clickElement(txtConfirmationVerify);
        WebElement verifyConfirm = findElement(txtConfirmationVerify);
        String a = verifyConfirm.getText();
        String b = "Please check your details below and confirm if they are correct.";
        if (a.equals(b)) {
            log.info("Confirmation message is displayed successfully");
            //  tb.logExtentReport("Confirmation message is displayed successfully");
        } else {

            log.info("Confirmation message is not displayed successfully");
            Assert.fail();
            //tb.logExtentReport("Confirmation message is not displayed successfully");
        }
        String typeT = "";
        try {
            confirmationMessage(fAccount, tAccount, expectedAmt, desc);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void bpayClick() throws Exception {
        clickElement(txt_bPay);
    }


    public void bPay(String amt, String fAccount, String tAccount, String billercodee) throws Exception {
        {
            //ArrayList<String>  nowBpayDataList=new ArrayList<String>();
            // clickElement(txt_bPay);
            clickElement(txt_bPayselectValue3);
            WebElement bPayselectValue3 = findElement(txt_bPayselectValue3);
            bPayselectValue3.click();
            String fromAccount1 = selectUsingIndex(bPayselectValue3, 1);
            fromAccount1 = fromAccount1.substring(19, 28);
            System.out.println(fromAccount1);
            //String faccount= bPayselectValue3.getAttribute("value");
            Thread.sleep(1000);
            log.info("Clicked on the To Account number dropdown ...");
            //tb.logExtentReport("Click on dropdown....");
            int repet = 0;
            while (repet <= 15) {
                try {
                    WebElement bPayselectValue2 = findElementClickable(txt_bPayselectValue2);
                    bPayselectValue2.click();
                    break;
                } catch (StaleElementReferenceException exc) {
                    exc.printStackTrace();
                }
                repet++;
            }
            String toAccount = "";
            int rep = 0;
            while (rep <= 15) {

                try {
                    WebElement bPayselectValue2 = findElement(txt_bPayselectValue2);
                    toAccount = selectUsingIndex(bPayselectValue2, 1);
                    break;
                } catch (StaleElementReferenceException exc) {
                    exc.printStackTrace();
                }
                rep++;
            }
            WebElement BPayselectValue2 = findElement(txt_bPayselectValue2);
//           String taccount= BPayselectValue2.getText();

            //String taccount=selectUsingIndex(BPayselectValue2,1);
            WebElement Billercode = findElement(billercode);
            String Billercodevalue = Billercode.getText();
            Thread.sleep(1000);
            WebElement Billername = findElement(billername);
            String billernamee = Billername.getText();
            int rept = 0;
            while (rept <= 15) {

                try {
                    WebElement TxtbPayAmount = findElement(txtbPayAmount);
                    TxtbPayAmount.click();
                    break;
                } catch (StaleElementReferenceException exc) {
                    exc.printStackTrace();
                }
                rept++;
            }

            WebElement TxtbPayAmount = findElement(txtbPayAmount);
            TxtbPayAmount.sendKeys(amt);
            WebElement bPayAmount1 = findElement(txtbPayAmount);
            String amount1 = bPayAmount1.getAttribute("value");
            //tb.logExtentReport("entered the amount....");
            String typeOfTransaction = null;

            WebElement FROMAccountt = findElementClickable(txt_bPayselectValue3);
            Select selectt = new Select(FROMAccountt);
            WebElement firstoption = selectt.getOptions().get(0);
            if (firstoption.isSelected()) {
                WebElement FROMAccount = findElementClickable(txt_bPayselectValue3);
                Select Sele = new Select(FROMAccount);
                Sele.selectByIndex(1);
            }


            clickElement(txtContinue);
            // contonueMsgBpay(fromAccount1,toAccount1,amount1,typeOfTransaction,billernamee,startDate,endDate);
            // closeMsgBpay(fromAccount1,toAccount1,amount1,typeOfTransaction,startDate,endDate);
            // clickElement(txtCloseButton);
            T24homepage hp = new T24homepage();
            String Date = hp.datePickIBM();
            hp.setProperty("BpaysavednowDate", Date);
            hp.setProperty("Bpaysavednowfromaccount", fromAccount1);
            hp.setProperty("BpaysavednowToaccount", toAccount);
            hp.setProperty("BpaysavednowAmount", amount1);
            hp.setProperty("BillercodevalueBpaysavednow", Billercodevalue);


        }
    }


    public void bPayneecontact(String amt, String fAccount, String tAccount, String billercodee, String billercrn, String nickname, String amount) throws Exception {
        {

            WebElement NewcontactButton = findElementClickable(newcontactButton);
            NewcontactButton.click();
            //clickElement(txt_bPayselectValue3);


            WebElement bPayselectValue3 = findElementClickable(txt_bPayselectValue3);
            bPayselectValue3.click();

            // WebElement bPayselectValuee =findElement(txt_bPayselectValue3);
            // String fromAccount1=selectUsingIndex(bPayselectValuee,1);
            //System.out.println(fromAccount1);
            String fromAccount1 = "";
            int rept = 0;
            while (rept <= 15) {

                try {
                    WebElement bPayselectValuee = findElementClickable(txt_bPayselectValue3);
                    fromAccount1 = selectUsingIndex(bPayselectValuee, 1);
                    fromAccount1=fromAccount1.substring(19,28);
                    break;
                } catch (StaleElementReferenceException exc) {
                    exc.printStackTrace();
                }
                rept++;
            }

            Thread.sleep(500);
            WebElement Billercode = findElementClickable(billercodefield);
            Billercode.click();
            Billercode.sendKeys(billercodee);
            Thread.sleep(500);
            int repeat = 0;
            while (repeat <= 15) {
                try {
                    WebElement Billercrnfield = findElementClickable(billercrnfield);
                    Billercrnfield.click();

                    break;
                } catch (Exception exc) {
                    exc.printStackTrace();
                }
                repeat++;
            }
            int repeatt = 0;
            while (repeatt <= 15) {
                try {
                    WebElement Billercrnfield = findElementClickable(billercrnfield);

                    Billercrnfield.sendKeys(billercrn);
                    break;
                } catch (Exception exc) {
                    exc.printStackTrace();
                }
                repeatt++;
            }
            Thread.sleep(500);
            WebElement Nickname = findElementClickable(nicknamefield);
            Nickname.click();
            Thread.sleep(500);
            Nickname.sendKeys(nickname);
            Thread.sleep(1000);
            WebElement Billername = findElement(billername);
            String billernamee = Billername.getText();
            Thread.sleep(500);

            repeatt = 0;
            while (repeatt <= 15) {

                try {
                    WebElement amountt = findElementClickable(txtbPayAmount);
                    amountt.click();
                    break;
                } catch (StaleElementReferenceException exc) {
                    exc.printStackTrace();
                }
                repeatt++;
            }
            String amount1 = "";
            int reptt = 0;
            while (reptt <= 15) {

                try {
                    WebElement amountt = findElementClickable(txtbPayAmount);
                    amountt.click();
                    amountt.sendKeys(amount);
                    amount1 = amountt.getAttribute("value");
                    break;
                } catch (StaleElementReferenceException exc) {
                    exc.printStackTrace();
                }
                reptt++;
            }

            // WebElement TxtbPayAmount=findElement(txtbPayAmount);
            // TxtbPayAmount.sendKeys(amt);
//            WebElement bPayAmount1=findElement(txtbPayAmount);
//            String amount1=bPayAmount1.getAttribute("value");
            //tb.logExtentReport("entered the amount....");
            String typeOfTransaction = null;
            WebElement FROMAccountt = findElementClickable(txt_bPayselectValue3);
            Select selectt = new Select(FROMAccountt);
            WebElement firstoption = selectt.getOptions().get(0);
            if (firstoption.isSelected()) {
                WebElement FROMAccount = findElementClickable(txt_bPayselectValue3);
                Select Sele = new Select(FROMAccount);
                Sele.selectByIndex(1);
            }
            clickElement(txtContinue);
            // contonueMsgBpay(fromAccount1,toAccount1,amount1,typeOfTransaction,billernamee,startDate,endDate);
            // closeMsgBpay(fromAccount1,toAccount1,amount1,typeOfTransaction,startDate,endDate);
            // clickElement(txtCloseButton);
            T24homepage hp = new T24homepage();
            String date = hp.datePickIBM();
            hp.setProperty("BpaynewContactnowdate", date);
            hp.setProperty("BpaynewContactnowfromaccount", fromAccount1);
            // hp.setProperty("BpaysavednowToaccount",toAccount);
            hp.setProperty("BpaynewContactAmount", amount);
            hp.setProperty("BillercodevalueBpaynewContactnow", billercodee);


        }
    }


    public void ibManagerReporting(WebDriver driver) throws Exception {
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

    public String ibmReportingTable(WebDriver driver) {
        String status = "Not Posted";
        String message = null;
        for (int i = 2; i <= 10; i++) {
            String statusText = driver.findElement(By.xpath("(//*[@id='BatchList1_gvBatchList_ctl02_gvBatchDetails']/tbody/tr[" + i + "]/td[7])[2]")).getText();
            Assert.assertTrue(statusText.contains(status));
            {
                message = driver.findElement(By.xpath("(//*[@id='BatchList1_gvBatchList_ctl02_gvBatchDetails']/tbody/tr[" + i + "]/td[8])[2]")).getText();
                System.out.println(message);
                break;
            }

        }

        return message;
    }


    public void bPayneecontactfuture(String amt, String fAccount, String tAccount, String billercodee, String billercrn, String nickname, String amount) throws Exception {
        {

            WebElement NewcontactButton = findElementClickable(newcontactButton);
            NewcontactButton.click();
            //clickElement(txt_bPayselectValue3);


            WebElement bPayselectValue3 = findElementClickable(txt_bPayselectValue3);
            bPayselectValue3.click();

            // WebElement bPayselectValuee =findElement(txt_bPayselectValue3);
            // String fromAccount1=selectUsingIndex(bPayselectValuee,1);
            //System.out.println(fromAccount1);
            String fromAccount1 = "";
            int rept = 0;
            while (rept <= 15) {

                try {
                    WebElement bPayselectValuee = findElementClickable(txt_bPayselectValue3);
                    fromAccount1 = selectUsingIndex(bPayselectValuee, 1);
                    break;
                } catch (StaleElementReferenceException exc) {
                    exc.printStackTrace();
                }
                rept++;
            }

            Thread.sleep(500);
            WebElement Billercode = findElementClickable(billercodefield);
            Billercode.click();
            Billercode.sendKeys(billercodee);
            Thread.sleep(500);
            int repeat = 0;
            while (repeat <= 15) {
                try {
                    WebElement Billercrnfield = findElementClickable(billercrnfield);
                    Billercrnfield.click();

                    break;
                } catch (Exception exc) {
                    exc.printStackTrace();
                }
                repeat++;
            }
            int repeatt = 0;
            while (repeatt <= 15) {
                try {
                    WebElement Billercrnfield = findElementClickable(billercrnfield);

                    Billercrnfield.sendKeys(billercrn);
                    break;
                } catch (Exception exc) {
                    exc.printStackTrace();
                }
                repeatt++;
            }
            Thread.sleep(500);
            WebElement Nickname = findElementClickable(nicknamefield);
            Nickname.click();
            Thread.sleep(500);
            Nickname.sendKeys(nickname);
            Thread.sleep(1000);
            WebElement Billername = findElement(billername);
            String billernamee = Billername.getText();
            Thread.sleep(500);

            repeatt = 0;
            while (repeatt <= 15) {

                try {
                    WebElement amountt = findElementClickable(txtbPayAmount);
                    amountt.click();
                    break;
                } catch (StaleElementReferenceException exc) {
                    exc.printStackTrace();
                }
                repeatt++;
            }
            String amount1 = "";
            int reptt = 0;
            while (reptt <= 15) {

                try {
                    WebElement amountt = findElementClickable(txtbPayAmount);
                    amountt.click();
                    amountt.sendKeys(amount);
                    amount1 = amountt.getAttribute("value");
                    break;
                } catch (StaleElementReferenceException exc) {
                    exc.printStackTrace();
                }
                reptt++;
            }

            // WebElement TxtbPayAmount=findElement(txtbPayAmount);
            // TxtbPayAmount.sendKeys(amt);
//            WebElement bPayAmount1=findElement(txtbPayAmount);
//            String amount1=bPayAmount1.getAttribute("value");
            //tb.logExtentReport("entered the amount....");
            String typeOfTransaction = null;
            clickElement(txtContinue);
            // contonueMsgBpay(fromAccount1,toAccount1,amount1,typeOfTransaction,billernamee,startDate,endDate);
            // closeMsgBpay(fromAccount1,toAccount1,amount1,typeOfTransaction,startDate,endDate);
            // clickElement(txtCloseButton);
            T24homepage hp = new T24homepage();

            hp.setProperty("BpaynewContactnowfromaccount", fromAccount1);
            // hp.setProperty("BpaysavednowToaccount",toAccount);
            hp.setProperty("BpaynewContactAmount", amount);
            hp.setProperty("BillercodevalueBpaynewContactnow", billercodee);


        }
    }


    public void bPayneecontactRecurring(String amt, String fAccount, String tAccount, String billercodee, String billercrn, String nickname, String amount) throws Exception {
        {

            WebElement NewcontactButton = findElementClickable(newcontactButton);
            NewcontactButton.click();
            //clickElement(txt_bPayselectValue3);


            WebElement bPayselectValue3 = findElementClickable(txt_bPayselectValue3);
            bPayselectValue3.click();

            // WebElement bPayselectValuee =findElement(txt_bPayselectValue3);
            // String fromAccount1=selectUsingIndex(bPayselectValuee,1);
            //System.out.println(fromAccount1);
            String fromAccount1 = "";
            int rept = 0;
            while (rept <= 15) {

                try {
                    WebElement bPayselectValuee = findElementClickable(txt_bPayselectValue3);
                    fromAccount1 = selectUsingIndex(bPayselectValuee, 1);
                    fromAccount1=fromAccount1.substring(19,28);
                    break;
                } catch (StaleElementReferenceException exc) {
                    exc.printStackTrace();
                }
                rept++;
            }

            Thread.sleep(500);
            WebElement Billercode = findElementClickable(billercodefield);
            Billercode.click();
            Billercode.sendKeys(billercodee);
            Thread.sleep(500);
            int repeat = 0;
            while (repeat <= 15) {
                try {
                    WebElement Billercrnfield = findElementClickable(billercrnfield);
                    Billercrnfield.click();

                    break;
                } catch (Exception exc) {
                    exc.printStackTrace();
                }
                repeat++;
            }
            int repeatt = 0;
            while (repeatt <= 15) {
                try {
                    WebElement Billercrnfield = findElementClickable(billercrnfield);

                    Billercrnfield.sendKeys(billercrn);
                    break;
                } catch (Exception exc) {
                    exc.printStackTrace();
                }
                repeatt++;
            }
            Thread.sleep(500);
            WebElement Nickname = findElementClickable(nicknamefield);
            Nickname.click();
            Thread.sleep(500);
            Nickname.sendKeys(nickname);
            Thread.sleep(1000);
            WebElement Billername = findElement(billername);
            String billernamee = Billername.getText();
            Thread.sleep(500);

            repeatt = 0;
            while (repeatt <= 15) {

                try {
                    WebElement amountt = findElementClickable(txtbPayAmount);
                    amountt.click();
                    break;
                } catch (StaleElementReferenceException exc) {
                    exc.printStackTrace();
                }
                repeatt++;
            }
            String amount1 = "";
            int reptt = 0;
            while (reptt <= 15) {

                try {
                    WebElement amountt = findElementClickable(txtbPayAmount);
                    amountt.click();
                    amountt.sendKeys(amount);
                    amount1 = amountt.getAttribute("value");
                    break;
                } catch (StaleElementReferenceException exc) {
                    exc.printStackTrace();
                }
                reptt++;
            }

            // WebElement TxtbPayAmount=findElement(txtbPayAmount);
            // TxtbPayAmount.sendKeys(amt);
//            WebElement bPayAmount1=findElement(txtbPayAmount);
//            String amount1=bPayAmount1.getAttribute("value");
            //tb.logExtentReport("entered the amount....");
            String typeOfTransaction = null;

            WebElement RecurringButton = findElement(recurringButton);
            RecurringButton.click();
            WebElement recurringCalaendar1 = findElement(txtRecurringCalaendar1);
            recurringCalaendar1.click();
            WebElement month = findElement(txtMonth);
            month.click();
            Select sel = new Select(month);
            String startMnth = datenumtoName(DateUtilities.monthafterdays);
            sel.selectByVisibleText(startMnth);
            int i = Integer.parseInt(DateUtilities.date2);
            WebElement calendarDate1 = findElement(By.xpath("//a[text()=" + i + "]"));
            calendarDate1.click();
            WebElement recurringCalaendarStartDate = findElement(txtrecurringStartDate);
            String startDate = recurringCalaendarStartDate.getAttribute("value");
            WebElement Externalfrequency = findElement(txtExternalfrequency);
            Select slt = new Select(Externalfrequency);
            List<WebElement> rslt = slt.getOptions();
            Thread.sleep(500);
            Select slt1 = new Select(Externalfrequency);
            slt1.selectByIndex(1);
            WebElement Externalfrequency1 = findElementClickable(txtExternalfrequency);
            String freq = Externalfrequency1.getAttribute("value");
            WebElement recurringExternalCalaendar2 = findElement(txtrecurringExternalCalaendar2);
            recurringExternalCalaendar2.click();
            WebElement month1 = findElement(txtMonth);
            Select select = new Select(month1);
            String endmonth = datenumtoName(DateUtilities.Monthrecurringend);
            select.selectByVisibleText(endmonth);
            int j = Integer.parseInt(DateUtilities.dateend);
            WebElement calendarDate2 = findElement(By.xpath("//a[text()=" + j + "]"));
            calendarDate2.click();
            WebElement Txt_recurringEndDate = findElement(txt_recurringEndDate);
            String enddate = Txt_recurringEndDate.getText();

            WebElement FROMAccountt = findElementClickable(txt_bPayselectValue3);
            Select selectt = new Select(FROMAccountt);
            WebElement firstoption = selectt.getOptions().get(0);
            if (firstoption.isSelected()) {
                WebElement FROMAccount = findElementClickable(txt_bPayselectValue3);
                Select Sele = new Select(FROMAccount);
                Sele.selectByIndex(1);
            }

            clickElement(txtContinue);
            // contonueMsgBpay(fromAccount1,toAccount1,amount1,typeOfTransaction,billernamee,startDate,endDate);
            // closeMsgBpay(fromAccount1,toAccount1,amount1,typeOfTransaction,startDate,endDate);
            // clickElement(txtCloseButton);
            T24homepage hp = new T24homepage();
            hp.setProperty("BpaynewContactrecurringStartDate", startDate);
            hp.setProperty("BpaynewContactrecurringendDate", enddate);
            hp.setProperty("BpaynewContactrecurringfromaccount", fromAccount1);
            // hp.setProperty("BpaysavednowToaccount",toAccount);
            hp.setProperty("BpaynewContactRecurringAmount", amount);
            hp.setProperty("BillercodevalueBpaynewContactRecurring", billercodee);


        }
    }


    public void bPayFutureRecurring(String amt, String fAccount, String tAccount, String billercodee) throws Exception {
        {
            //ArrayList<String>  nowBpayDataList=new ArrayList<String>();
            // clickElement(txt_bPay);
            clickElement(txt_bPayselectValue3);
            WebElement bPayselectValue3 = findElement(txt_bPayselectValue3);
            bPayselectValue3.click();
            String fromAccount1 = selectUsingIndex(bPayselectValue3, 1);
            fromAccount1=fromAccount1.substring(19,28);
            System.out.println(fromAccount1);
            //String faccount= bPayselectValue3.getAttribute("value");
            Thread.sleep(1000);
            log.info("Clicked on the To Account number dropdown ...");
            //tb.logExtentReport("Click on dropdown....");
            int repet = 0;
            while (repet <= 15) {
                try {
                    WebElement bPayselectValue2 = findElementClickable(txt_bPayselectValue2);
                    bPayselectValue2.click();
                    break;
                } catch (StaleElementReferenceException exc) {
                    exc.printStackTrace();
                }
                repet++;
            }
            String toAccount = "";
            int rep = 0;
            while (rep <= 15) {

                try {
                    WebElement bPayselectValue2 = findElement(txt_bPayselectValue2);
                    toAccount = selectUsingIndex(bPayselectValue2, 1);
                    break;
                } catch (StaleElementReferenceException exc) {
                    exc.printStackTrace();
                }
                rep++;
            }
            WebElement BPayselectValue2 = findElement(txt_bPayselectValue2);
            WebElement Billercode = findElement(billercode);
            String Billercodevalue = Billercode.getText();
            Thread.sleep(1000);
            WebElement Billername = findElement(billername);
            String billernamee = Billername.getText();
            int rept = 0;
            while (rept <= 15) {
                try {
                    WebElement TxtbPayAmount = findElement(txtbPayAmount);
                    TxtbPayAmount.click();
                    break;
                } catch (StaleElementReferenceException exc) {
                    exc.printStackTrace();
                }
                rept++;
            }
            WebElement TxtbPayAmount = findElement(txtbPayAmount);
            TxtbPayAmount.sendKeys(amt);
            WebElement bPayAmount1 = findElement(txtbPayAmount);
            String amount1 = bPayAmount1.getAttribute("value");
            //tb.logExtentReport("entered the amount....");
            String typeOfTransaction = null;

            WebElement RecurringButton = findElement(recurringButton);
            RecurringButton.click();
            WebElement recurringCalaendar1 = findElement(txtRecurringCalaendar1);
            recurringCalaendar1.click();
            WebElement month = findElement(txtMonth);
            month.click();
            Select sel = new Select(month);
            String startMnth = datenumtoName(DateUtilities.monthafterdays);
            sel.selectByVisibleText(startMnth);
            int i = Integer.parseInt(DateUtilities.date2);
            WebElement calendarDate1 = findElement(By.xpath("//a[text()=" + i + "]"));
            calendarDate1.click();
            WebElement recurringCalaendarStartDate = findElement(txtrecurringStartDate);
            String startDate = recurringCalaendarStartDate.getAttribute("value");
            WebElement Externalfrequency = findElement(txtExternalfrequency);
            Select slt = new Select(Externalfrequency);
            List<WebElement> rslt = slt.getOptions();
            Thread.sleep(500);
            Select slt1 = new Select(Externalfrequency);
            slt1.selectByIndex(1);
            WebElement Externalfrequency1 = findElementClickable(txtExternalfrequency);
            String freq = Externalfrequency1.getAttribute("value");
            WebElement recurringExternalCalaendar2 = findElement(txtrecurringExternalCalaendar2);
            recurringExternalCalaendar2.click();
            WebElement month1 = findElement(txtMonth);
            Select select = new Select(month1);
            String endmonth = datenumtoName(DateUtilities.Monthrecurringend);
            select.selectByVisibleText(endmonth);
            int j = Integer.parseInt(DateUtilities.dateend);
            WebElement calendarDate2 = findElement(By.xpath("//a[text()=" + j + "]"));
            calendarDate2.click();

            //select.selectByIndex(10);
//        WebElement recurringDate1 = findElement(txtDate);
//		recurringDate1.click();
            WebElement recurringEndDate2 = findElement(txt_recurringEndDate);
            String endDate = recurringEndDate2.getAttribute("value");


            clickElement(txtContinue);
            T24homepage hp = new T24homepage();
            hp.setProperty("bpaySavedStartdaterecurringdate", startDate);
            hp.setProperty("bpaySavedrecurringenddate", endDate);
            hp.setProperty("Bpaysavedrecurringfromaccount", fromAccount1);
            hp.setProperty("BpaysavedrecurringToaccount", toAccount);
            hp.setProperty("BpaysavedrecurringAmount", amount1);
            hp.setProperty("BillercodevalueBpaysavedrecurring", Billercodevalue);


        }
    }


    public void bPayFuture(String amt, String fAccount, String tAccount, String billercodee) throws Exception {
        {
            //ArrayList<String>  nowBpayDataList=new ArrayList<String>();
            // clickElement(txt_bPay);
            clickElement(txt_bPayselectValue3);
            WebElement bPayselectValue3 = findElement(txt_bPayselectValue3);
            bPayselectValue3.click();
            String fromAccount1 = selectUsingIndex(bPayselectValue3, 1);
            fromAccount1=fromAccount1.substring(19,28);
            System.out.println(fromAccount1);
            //String faccount= bPayselectValue3.getAttribute("value");
            Thread.sleep(1000);
            log.info("Clicked on the To Account number dropdown ...");
            //tb.logExtentReport("Click on dropdown....");
            int repet = 0;
            while (repet <= 15) {
                try {
                    WebElement bPayselectValue2 = findElementClickable(txt_bPayselectValue2);
                    bPayselectValue2.click();
                    break;
                } catch (StaleElementReferenceException exc) {
                    exc.printStackTrace();
                }
                repet++;
            }
            String toAccount = "";
            int rep = 0;
            while (rep <= 15) {

                try {
                    WebElement bPayselectValue2 = findElement(txt_bPayselectValue2);
                    toAccount = selectUsingIndex(bPayselectValue2, 1);
                    break;
                } catch (StaleElementReferenceException exc) {
                    exc.printStackTrace();
                }
                rep++;
            }
            WebElement BPayselectValue2 = findElement(txt_bPayselectValue2);
            WebElement Billercode = findElement(billercode);
            String Billercodevalue = Billercode.getText();
            Thread.sleep(1000);
            WebElement Billername = findElement(billername);
            String billernamee = Billername.getText();
            int rept = 0;
            while (rept <= 15) {
                try {
                    WebElement TxtbPayAmount = findElement(txtbPayAmount);
                    TxtbPayAmount.click();
                    break;
                } catch (StaleElementReferenceException exc) {
                    exc.printStackTrace();
                }
                rept++;
            }
            WebElement TxtbPayAmount = findElement(txtbPayAmount);
            TxtbPayAmount.sendKeys(amt);
            WebElement bPayAmount1 = findElement(txtbPayAmount);
            String amount1 = bPayAmount1.getAttribute("value");
            //tb.logExtentReport("entered the amount....");
            String typeOfTransaction = null;

            WebElement atFutureButton = clickElement(futurebutton);
            atFutureButton.click();
            WebElement calendar = findElement(txtCalendar);
            calendar.click();
            WebElement month = findElement(txtbMonth);
            Select sel = new Select(month);
            DateUtilities du = new DateUtilities();
            String startMnth = datenumtoName(DateUtilities.monthafterdays);
            sel.selectByVisibleText(startMnth);
            int i = Integer.parseInt(DateUtilities.date2);
            Thread.sleep(500);
            WebElement date = findElement(By.xpath("//a[text()=" + i + "]"));
            Thread.sleep(500);
            actions(date);
            //continueMessage();
            WebElement futurteDateField = findElement(FuturteDateField);
            String futuredate = futurteDateField.getAttribute("value");

            WebElement FROMAccountt = findElementClickable(txt_bPayselectValue3);
            Select selectt = new Select(FROMAccountt);
            WebElement firstoption = selectt.getOptions().get(0);
            if (firstoption.isSelected()) {
                WebElement FROMAccount = findElementClickable(txt_bPayselectValue3);
                Select Sele = new Select(FROMAccount);
                Sele.selectByIndex(1);
            }
            clickElement(txtContinue);
            T24homepage hp = new T24homepage();
            hp.setProperty("bpayfuturedate", futuredate);
            hp.setProperty("Bpaysavedfuturfromaccount", fromAccount1);
            hp.setProperty("BpaysavedfutureToaccount", toAccount);
            hp.setProperty("BpaysavedfutureAmount", amount1);
            hp.setProperty("BillercodevalueBpaysavedfuture", Billercodevalue);


        }
    }


    public void bPayFutureNewContact(String amt, String fAccount, String tAccount, String billercodee, String billercrn, String nickname) throws Exception {
        {
            WebElement NewcontactButton = findElementClickable(newcontactButton);
            NewcontactButton.click();
            Thread.sleep(1000);
            WebElement bPayselectValue3 = findElementClickable(txt_bPayselectValue3);
            bPayselectValue3.click();
            String fromAccount1 = selectUsingIndex(bPayselectValue3, 1);
            fromAccount1=fromAccount1.substring(19,28);
            System.out.println(fromAccount1);
            //String faccount= bPayselectValue3.getAttribute("value");
            Thread.sleep(1000);
            log.info("Clicked on the To Account number dropdown ...");
            //tb.logExtentReport("Click on dropdown....");
//            int repet=0;
//            while(repet<=15) {
//                try {
//                    WebElement bPayselectValue2=findElementClickable(txt_bPayselectValue2);
//                    bPayselectValue2.click();
//                    break;
//                }catch(StaleElementReferenceException exc) {
//                    exc.printStackTrace();
//                }
//                repet++;
//            }
            Thread.sleep(500);
            WebElement Billercode = findElementClickable(billercodefield);
            Billercode.click();
            Billercode.sendKeys(billercodee);
            Thread.sleep(500);
            int repeat = 0;
            while (repeat <= 15) {
                try {
                    WebElement Billercrnfield = findElementClickable(billercrnfield);
                    Billercrnfield.click();

                    break;
                } catch (Exception exc) {
                    exc.printStackTrace();
                }
                repeat++;
            }
            int repeatt = 0;
            while (repeatt <= 15) {
                try {
                    WebElement Billercrnfield = findElementClickable(billercrnfield);

                    Billercrnfield.sendKeys(billercrn);
                    break;
                } catch (Exception exc) {
                    exc.printStackTrace();
                }
                repeatt++;
            }
            Thread.sleep(500);
            WebElement Nickname = findElementClickable(nicknamefield);
            Nickname.click();
            Thread.sleep(500);
            Nickname.sendKeys(nickname);
            Thread.sleep(1000);
            WebElement Billername = findElement(billername);
            String billernamee = Billername.getText();
            Thread.sleep(500);

            int rept = 0;
            while (rept <= 15) {
                try {
                    WebElement TxtbPayAmount = findElementClickable(txtbPayAmount);
                    actions(TxtbPayAmount);
                    //TxtbPayAmount.click();
                    break;
                } catch (StaleElementReferenceException exc) {
                    exc.printStackTrace();
                }
                rept++;
            }
            Thread.sleep(500);


            rept = 0;
            while (rept <= 15) {
                try {

                    WebElement TxtbPayAmount = findElementClickable(txtbPayAmount);
                    TxtbPayAmount.sendKeys(amt);
                    break;
                } catch (StaleElementReferenceException exc) {
                    exc.printStackTrace();
                }
                rept++;
            }


//
//            WebElement TxtbPayAmount=findElement(txtbPayAmount);
//            TxtbPayAmount.sendKeys(amt);
            WebElement bPayAmount1 = findElement(txtbPayAmount);
            String amount1 = bPayAmount1.getAttribute("value");
            //tb.logExtentReport("entered the amount....");
            String typeOfTransaction = null;

            WebElement atFutureButton = clickElement(futurebutton);
            atFutureButton.click();
            WebElement calendar = findElement(txtCalendar);
            calendar.click();
            WebElement month = findElement(txtbMonth);
            Select sel = new Select(month);
            DateUtilities du = new DateUtilities();
            String startMnth = datenumtoName(DateUtilities.monthafterdays);
            sel.selectByVisibleText(startMnth);
            int i = Integer.parseInt(DateUtilities.date2);
            Thread.sleep(500);
            WebElement date = findElement(By.xpath("//a[text()=" + i + "]"));
            Thread.sleep(500);
            actions(date);
            //continueMessage();
            WebElement futurteDateField = findElement(FuturteDateField);
            String futuredate = futurteDateField.getAttribute("value");
            WebElement FROMAccountt = findElementClickable(txt_bPayselectValue3);
            Select selectt = new Select(FROMAccountt);
            WebElement firstoption = selectt.getOptions().get(0);
            if (firstoption.isSelected()) {
                WebElement FROMAccount = findElementClickable(txt_bPayselectValue3);
                Select Sele = new Select(FROMAccount);
                Sele.selectByIndex(1);
            }

            clickElement(txtContinue);
            T24homepage hp = new T24homepage();
            hp.setProperty("bpayfuturedatenewcontact", futuredate);
            hp.setProperty("BpaynewContactfuturfromaccount", fromAccount1);
            //hp.setProperty("BpaynewContactfutureToaccount",toAccount);
            hp.setProperty("BpaynewContactfutureAmount", amount1);
            hp.setProperty("BillercodevalueBpaynewContactfuture", billercodee);


        }
    }


    public void bpayfuturedateVerify(String expecteddate, String Frequency) {

        WebElement futuredateconfirmBpay = findElement(futuredateconfirmpay);
        String actualdate = futuredateconfirmBpay.getText();
        WebElement FrequencyrecurringPay = findElement(frequencyrecurringPay);
        String frequency = FrequencyrecurringPay.getText();

        Assert.assertTrue(actualdate.contains(expecteddate) & frequency.contains(Frequency));


    }

    public void bpayfuturedateVerifyy(String expecteddate, String Frequency) {

        WebElement futuredateconfirmBpay = findElement(futuredateconfirmpay);
        String actualdate = futuredateconfirmBpay.getText();
        ;

        Assert.assertTrue(actualdate.contains(expecteddate));


    }

    public void recurringdateConfirmPaymentVerify(String Startdate, String Enddate) {
        WebElement StartdateRecurring = findElement(startdateRecurring);
        String startdate = StartdateRecurring.getText();
        WebElement EnddateRecurring = findElement(enddateRecurring);
        String enddate = EnddateRecurring.getText();
        Assert.assertTrue(startdate.contains(Startdate) & enddate.contains(Enddate));

    }


    public void confirmdetailsBpay(String fAccount, String taccount, String Amount, String billercode) {
        WebElement verifyConfirm = findElement(txtConfirmationVerify);
        String actText = verifyConfirm.getText();
        String b = "Please check your details below and confirm if they are correct.";
        if (actText.equals(b)) {
            log.info("Confirmation message is displayed successfully");

        } else {
            log.info("Confirmation message is not displayed successfully");
        }
        WebElement faccount = findElement(txt_faccountEFT);
        String actualfAccount = faccount.getText();
        if (actualfAccount.contains(fAccount)) {
            log.info("From account is successfully displayed for confirmation");
        } else {
            log.info("From account is not successfully displayed for confirmation");
            Assert.fail();
        }

        WebElement Taccount = findElement(toaccountt);
        String toaccount = Taccount.getText();
        SoftAssert asser = new SoftAssert();
        asser.assertTrue(taccount.contains(toaccount));
        {
            //log.info("To account is successfully displayed for confirmation");
//        } else {
//            log.info("To Account is not successfully displayed for confirmation");
            //Assert.fail();
        }
        WebElement tAccountVerification = findElement(txt_billercode);
        String actualBillercode = tAccountVerification.getText();
        if (actualBillercode.contains(billercode)) {
            log.info("Biller code is successfully displayed in Bpay confirmation page");

        } else {
            Assert.fail();
            log.info("Biller code is not successfully displayed in Bpay confirmation page");

        }
//        WebElement bpayNickName = findElement(txt_nickname);
//        String actualbpayNickName = bpayNickName.getText();


        WebElement verifyAmount = findElement(txt_amountEFT);
        String actualAmount = verifyAmount.getText();
        if (actualAmount.contains(Amount)) {
            log.info("Amount is successfully displayed for confirmation");

        } else {
            log.info("Amount is not successfully displayed for confirmation");
            Assert.fail();
        }
        clickElement(txtconfirmButton);


        //asser.assertAll();
    }

    public void AddContactClick() throws Exception {

        WebElement goToContact = findElementClickable(btn_goToContact);

        actions(goToContact);
        WebElement addContact = findElementClickable(btn_addContact);
        //addContact.click();
        actions(addContact);

    }

    public void transfernewcontactdetails(String bsb, String accountNum, String name, String nickname) throws Exception {
        WebElement selectValue = findElement(drp_paymentType);
        selectUsingIndex(selectValue, 1);
        WebElement selectValue1 = findElement(drp_paymentType);
        String expectedPayment = selectValue1.getText();
        Thread.sleep(5000);
        int rep = 0;
        while (rep <= 7) {

            try {
                WebElement bSB = findElementClickable(txt_bSB);
                actions(bSB);
                //	bSB.click();
                break;
            } catch (Exception exc) {
                exc.printStackTrace();
            }
            rep++;
        }
        Thread.sleep(1000);
        String expectedBSB = "";
        int repeatt = 0;
        while (repeatt <= 7) {

            try {
                WebElement bSB = findElementClickable(txt_bSB);
                bSB.sendKeys(bsb);
                expectedBSB = bSB.getAttribute("value");
                break;

            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeatt++;
        }
        Thread.sleep(3000);
        //clickElement(txt_AccountNumber);

        //Thread.sleep(6000);
        int repp = 0;
        while (repp <= 8) {

            try {

                WebElement AccountNum = findElementClickable(txt_AccountNumber);
                actions(AccountNum);

                break;
            } catch (Exception exc) {
                exc.printStackTrace();
            }
            repp++;
        }
        Thread.sleep(3000);
        int repeat = 0;
        while (repeat <= 9) {
            try {
                WebElement AccountNumb = findElementClickable(txt_AccountNumber);
                AccountNumb.clear();
                AccountNumb.sendKeys(accountNum);
                break;
            } catch (Exception exc) {
                exc.printStackTrace();
            }
            repeat++;
        }

        Thread.sleep(3000);
        WebElement AccountNumber2 = findElement(txt_AccountNumber);
        String expectedAccount = AccountNumber2.getAttribute("value");
        clickElement(txt_AccountName);
        enterKeys(txt_AccountName, name);
        WebElement AccountName = findElement(txt_AccountName);
        String expectedAccountname = AccountName.getAttribute("value");
        //actions()
        WebElement nickName = findElement(txt_NickName);
        actions(nickName);
        //clickElement(txt_NickName);
        enterKeys(txt_NickName, nickname);
        WebElement nickName1 = findElement(txt_NickName);
        String expectedNickname = nickName1.getAttribute("value");
        WebElement btn_continuee = findElement(btn_continue);
        actions(btn_continuee);
        T24homepage Th = new T24homepage();
        Th.setProperty("Bsbaddcontact", expectedBSB);
        Th.setProperty("expectedAccountaddcontact", expectedAccount);
        Th.setProperty("expectedAccountnameaddcontact", expectedAccountname);
        Th.setProperty("expectednicknameaddcontact", expectedNickname);

    }


    public void ConfirmdetailsAddcontact(String expectedBSB, String expectedAccount, String expectedAccountname, String expectedNickname) {
        WebElement BSB = findElement(vrfy_BSB);

        String actualBSB = BSB.getText();

        assertEquals(actualBSB, expectedBSB);

        WebElement Accountnumber = findElement(vrfy_Accountnumber);

        String actualAccount = Accountnumber.getText();

        assertEquals(actualAccount, expectedAccount);

        WebElement Accountname = findElement(vrfy_Accountname);

        String actualAccountname = Accountname.getText();

        assertEquals(actualAccountname, expectedAccountname);

        WebElement ContactNickname = findElement(vrfy_ContactNickname);

        String actualContactNickname = ContactNickname.getText();

        assertEquals(actualContactNickname, expectedNickname);

        WebElement confirm = findElement(btn_confirm);

        confirm.click();
        WebElement message = findElement(Msg_confirm);

        String actualMsg = message.getText();

        String expectedMsg = "Your new Contact has been created.";

        assertEquals(actualMsg, expectedMsg);

        clickElement(btn_return);


    }


    public void ConfirmdetailsAddcontactBpay(String expectedbillerCode, String billercrncode, String expectedBillername, String expectedNickname) {

        WebElement BillerCode = findElement(vrfy_BillerCode);
        String actualBillerCode = BillerCode.getText();

        if (actualBillerCode.contains(expectedbillerCode)) {
            //tb.logExtentReport("PASS:-BillerCode is displayed on Bpay confirmation page");
        } else {
            Assert.fail("FAIL:-BillerCode is not displayed on Bpay confirmation page");
        }


        WebElement BillerName = findElement(vrfy_BillerName);
        String actualBillerName = BillerName.getText();
        assertEquals(actualBillerName, expectedBillername);


        WebElement CustomerNumber = findElement(vrfy_CustomerNumber);
        String ActualCustomerNumber = BillerName.getText();
        assertEquals(ActualCustomerNumber, expectedBillername);


        WebElement ContactNickname = findElement(vrfy_ContactNickname);
        String actualContactNickname = ContactNickname.getText();
        assertEquals(actualContactNickname, expectedNickname);


        clickElement(btn_confirm);
        clickElement(btn_return);

    }


    public void editdetailsAddContact(String expectedNickname, String test) throws Exception {
        for (int i = 1; i <= 30; i++) {
            if (i == 20) {
                WebElement btn_nextPagee = findElement(btn_nextPage);

                actions(btn_nextPagee);
                Thread.sleep(1000);
                i = 1;
            }
            String actualNickname = findElement(By.xpath("//table/tbody/tr[" + i + "]/td[3]")).getText();
            if (actualNickname.equals(expectedNickname)) {
                findElement(By.xpath("(//input[@alt='Edit'])[" + i + "]")).click();
                // tb.logExtentReport("PASS: Details successfully displayed in Manage Contacts");
                System.out.println("PASS: Details successfully displayed in Manage Contacts");
                break;
            }

        }
        clickElement(txt_NameEdit);
        WebElement editNamee = findElement(txt_NameEdit);
        editNamee.clear();
        enterKeys(txt_NameEdit, test);
        WebElement editName = findElement(txt_NameEdit);
        String expectedEditname = editName.getAttribute("value");
        clickElement(txt_confirmEdit);
        WebElement Accountname = findElement(vrfy_AccountName);
        String actualAccountname = Accountname.getText();
        assertEquals(actualAccountname, expectedEditname);
        clickElement(txt_confirmEdit1);
        clickElement(txt_returnEdit);
    }


    public void deletecontact(String name) throws Exception {
        WebElement Contacts = findElement(contacts);
        Contacts.click();
        waitForPageToLoad(1000);
        //Thread.sleep(1000);
        for (int i = 1; i <= 30; i++) {
            if (i == 21) {
                WebElement btn_NextPage = findElement(btn_nextPage);
                //clickElement(btn_lastPage);
                actions(btn_NextPage);
                Thread.sleep(1000);

                i = 1;
            }

            WebElement actualName = findElement(By.xpath("//table[contains(@id,'C1__TBL_D31A')]/tbody/tr[" + i + "]/td[1]"));
            String actualname = actualName.getText();
            if (actualname.equals(name)) {
                findElement(By.xpath("(//input[@alt='Delete'])[" + i + "]")).click();


                WebElement msgConfirm = findElement(Msg_confirm1);
                msgConfirm.click();
                //clickElement(Msg_confirm1,8000);
                // Thread.sleep(35000);
                String Actualmsg = driver.findElement(By.xpath("//*[@id='C1__p1_HEAD_13A2B1830AB160FC613017']/div")).getText();
                String msg = "Your Contact has been Deleted.";
                Assert.assertTrue(Actualmsg.equals(msg));
                // tb.logExtentReport("Successfull message displayed for deletion");

                //driver.findElement(By.xpath("//*[@id='C1__BUT_13A2B1830AB160FC613027']")).click();

                clickElement(btn_deleteReturn);

                System.out.println("Successfull deleted contact details");
                break;
            }

        }


    }

    public void transfernewcontactdetailsBpay(String billercode, String BillerCrnCode, String name, String nickname) throws Exception {
        WebElement selectValue = findElement(drp_paymentType);
        selectUsingIndex(selectValue, 2);
        WebElement selectValue1 = findElementClickable(drp_paymentType);

        String expectedPayment = selectValue1.getText();
        Thread.sleep(5000);
        Thread.sleep(5000);
        //  Thread.sleep(5000);
        int Repeat = 0;
        while (Repeat <= 15) {

            try {
                WebElement Txt_billerCode = findElementClickable(txt_billerCode);
                Txt_billerCode.click();

                //actions(Txt_billerCode);
                //clickElement(txt_billerCode);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            Repeat++;
        }
        Thread.sleep(2000);

        WebElement Txt_billerCode = findElementClickable(txt_billerCode);
        Txt_billerCode.sendKeys(billercode);

        // enterKeys(txt_billerCode, billercode);
        Thread.sleep(5000);
        // WebElement billerCode1 = findElementClickable(txt_billerCode);

        //String expectedbillerCode=billerCode1.getAttribute("value");
        Thread.sleep(500);
        int RepeatT = 0;
        while (RepeatT <= 20) {

            try {
                WebElement Txt_biilerCrnCode = findElementClickable(txt_biilerCrnCode);
                Txt_biilerCrnCode.click();
                // actions(Txt_biilerCrnCode);
                //	clickElement(txt_biilerCrnCode);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            RepeatT++;
        }


        Thread.sleep(2000);

        WebElement biilerCrnCode2 = findElementClickable(txt_biilerCrnCode);
        int Rep = 0;
        while (Rep <= 7) {

            try {
                WebElement biilerCrnCode = findElementClickable(txt_biilerCrnCode);
                biilerCrnCode.clear();
                biilerCrnCode.sendKeys(BillerCrnCode);
                //enterKeys(txt_biilerCrnCode, BillerCrnCode);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            Rep++;
        }
        Thread.sleep(5000);
        //enterKeys(txt_biilerCrnCode, BillerCrnCode);

        String expectedbiilerCrnCode = biilerCrnCode2.getAttribute("value");

        WebElement biilerName = findElement(txt_biilerName);

        String expectedBillername = biilerName.getText();
        int Repete = 0;
        while (Repete <= 7) {

            try {
                clickElement(txt_NickName);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            Repete++;
        }

        //clickElement(txt_NickName);

        enterKeys(txt_NickName, nickname);

        WebElement nickName1 = findElement(txt_NickName);

        String expectedNickname = nickName1.getAttribute("value");

        WebElement billerCode1 = findElementClickable(txt_billerCode);

        String expectedbillerCode = billerCode1.getAttribute("value");
        clickElement(btn_continue);
        T24homepage Th = new T24homepage();
        Th.setProperty("expectedbillerCode", expectedbillerCode);
        Th.setProperty("expectedbiilerCrnCode", expectedbiilerCrnCode);
        Th.setProperty("expectedBillername", expectedBillername);
        Th.setProperty("expectednicknameaddcontact", expectedNickname);

    }

    public void transfernewcontactdetailsBpay2(String billercode, String BillerCrnCode, String name, String nickname) throws Exception {
        WebElement selectValue = findElementClickable(drp_paymentType);
        selectUsingIndex(selectValue, 2);
        Thread.sleep(5000);
        WebElement Txt_billerCodee = findElementClickable(txt_billerCode);

        try {
            WebElement Txt_billerCode = findElementClickable(txt_billerCode);
            Txt_billerCode.click();

        } catch (Exception exc) {
            WebElement Txt_billerCode = findElementClickable(txt_billerCode);
            Txt_billerCode.click();
            exc.printStackTrace();
        }

        Thread.sleep(2000);

        WebElement Txt_billerCode = findElementClickable(txt_billerCode);
        Txt_billerCode.sendKeys(billercode);
        // enterKeys(txt_billerCode, billercode);
        Thread.sleep(2000);

        WebElement billerCode2 = findElementClickable(txt_billerCode);
        String expectedbillerCode = billerCode2.getAttribute("value");
        Thread.sleep(2000);
        WebElement biilerCrnCode1 = findElementClickable(txt_biilerCrnCode);


        WebElement Txt_biilerCrnCode = findElementClickable(txt_biilerCrnCode);
        Txt_biilerCrnCode.click();
//                Thread.sleep(1000);
        //	clickElement(txt_biilerCrnCode);


        Thread.sleep(1000);

        WebElement biilerCrnCode2 = findElementClickable(txt_biilerCrnCode);
        Thread.sleep(1000);


//                WebElement biilerCrnCode = findElementClickable(txt_biilerCrnCode);
//                biilerCrnCode.sendKeys(BillerCrnCode);


        Thread.sleep(2000);


        String expectedbiilerCrnCode = biilerCrnCode2.getAttribute("value");

        WebElement biilerName = findElementClickable(txt_biilerName);

        String expectedBillername = biilerName.getText();


        try {
            WebElement Txt_NickName = findElementClickable(txt_NickName);
            Txt_NickName.click();

        } catch (Exception exc) {
            WebElement Txt_NickName = findElementClickable(txt_NickName);
            Txt_NickName.click();
            exc.printStackTrace();
        }

        WebElement biilerCrnCode = findElementClickable(txt_biilerCrnCode);
        biilerCrnCode.sendKeys(BillerCrnCode);

        WebElement Txt_NickNamee = findElementClickable(txt_NickName);
        Txt_NickNamee.sendKeys(nickname);
        // enterKeys(txt_NickName, nickname);
        Thread.sleep(2000);
        WebElement nickName1 = findElementClickable(txt_NickName);

        String expectedNickname = nickName1.getAttribute("value");
        Thread.sleep(1000);
        WebElement Billername = findElement(billername);
        String billernamee = Billername.getText();
        WebElement Btn_continue = findElementClickable(btn_continue);
        Btn_continue.click();
        T24homepage Th = new T24homepage();
        Th.setProperty("expectedbillername", billernamee);
        Th.setProperty("expectedbillerCodeBpay", expectedbillerCode);
        Th.setProperty("expectedbiilerCrnCode", BillerCrnCode);
        Th.setProperty("expectednicknameaddcontactBpay", expectedNickname);


    }

    public void sessionHistoryIB() throws Exception {
        // gotoAccount.click();


        clickElement(txt_manage);


        clickElement(txt_session);


        // tb.logExtentReport("Clicked on Session button ");
        log.info("Session button clicked");

        clickElement(txt_sessionCheck);


        String session1 = findElement(By.xpath("//*[@id='C1__BUT_72DC497369011F2F319589_R1']")).getText();

        String session2 = findElement(By.xpath("//*[@id='C1__QUE_72DC497369011F2F318997_R1_1']")).getText();
        System.out.println(session2);
        System.out.println(session2.substring(11, 16) + "%%%%%%%%%");
        if (session1.equals(session2)) {
            System.out.println("Last login time displayed successfully");
            // tb.logExtentReport("Last login time displayed successfully");

        }

        String session = findElement(By.xpath("//*[@id='p1_HEAD_2C6929C1E459C57F104500']/div/span[1]")).getText();
        System.out.println(session.substring(59, 64) + "^^^^^^^^^^^^^^^");
        String a = session2.substring(11, 16);
        String b = session.substring(59, 64);

        //Assert.assertEquals(a,b);
        String sessionTime = timeformatOutput();
        T24homepage tm = new T24homepage();
        tm.setProperty("sessionhistory", sessionTime);
    }

    public String timeformatOutput() throws Exception {
        String session2 = findElement(By.xpath("//*[@id='C1__QUE_72DC497369011F2F318997_R1_1']")).getText();
        String resOutput = timeFormat(session2);
        return resOutput;
    }

    public static String timeFormat(String time) {

        //Input date in String format
        String input = time;
        //Date/time pattern of input date
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        //Date/time pattern of desired output date
        DateFormat outputformat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss aa");
        Date date = null;
        String output = null;
        try {
            //Conversion of input String to date
            date = df.parse(input);
            //old date format to new date format
            output = outputformat.format(date);
            System.out.println(output);
        } catch (ParseException pe) {
            pe.printStackTrace();
        }
        return output;
    }

    public void auditlogIBM(String subID, String SessionTime, WebDriver driver) throws Exception {
        clickElement(txt_ibmAudit);

        clickElement(txt_ibmSubId);

        enterKeys(txt_ibmSubId, subID);

        clickElement(txt_ibmRetrieve);

        clickElement(txt_ibmView);

        WebElement ibmView_raw = findElement(txt_ibmView_raw);

        String ibmTime = ibmView_raw.getText();

        StringBuffer sb = new StringBuffer(SessionTime);

        sb = sb.delete(0, 11);

        //System.out.println(sb);

        @SuppressWarnings("unused")

        String str = sb.toString();

        System.out.println(str);

        System.out.println(ibmTime);

        String loginTime = str.toUpperCase();

        System.out.println(loginTime);

        Assert.assertTrue(loginTime.contains(ibmTime));

        //tb.logExtentReport("Login time is displayed successfully");
    }


    public void newContactBatchTemplate(String amt, String des, String organization, String actName, String accountNum,
                                        String bsbNum, String nickname) throws Exception {
        WebElement newBatchTemplate = findElement(txt_NewTemplate);
        newBatchTemplate.click();
        WebElement newContactOption = findElement(txtnewContactOption);
        newContactOption.click();
        //Thread.sleep(2000);
        WebElement organizationName = findElementClickable(txt_organizationName);
        organizationName.click();
        //Thread.sleep(1000);
        WebElement organizationName1 = findElementClickable(txt_organizationName);
        organizationName1.sendKeys(organization);
        WebElement templateDescription = findElementClickable(txt_templateDescription);
        templateDescription.click();
        WebElement templateDescription1 = findElementClickable(txt_templateDescription);
        templateDescription1.sendKeys(des);
        ;
        WebElement toAccountName = findElementClickable(txt_toAccountName);
        toAccountName.click();
        WebElement toAccountName1 = findElementClickable(txt_toAccountName);
        toAccountName1.sendKeys(actName);

        WebElement toAccountNumber = findElementClickable(txt_toAccountNumber);
        toAccountNumber.click();

        //Thread.sleep(3000);

        WebElement toAccountNumber1 = findElementClickable(txt_toAccountNumber);
        toAccountNumber1.sendKeys(accountNum);
        /*
         * JavascriptExecutor jsxecutor = (JavascriptExecutor)driver;
         * jsxecutor.executeScript("arguments[0].value='1023454'",toAccountNumber1);
         */


        int reppt = 0;
        while (reppt <= 20) {
            try {
                WebElement bsbNumber = findElementClickable(txt_bsbNumber);
                bsbNumber.click();
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            reppt++;
        }


        //Thread.sleep(1000);
        //WebElement bsbNumber2 = findElement(txt_bsbNumber);
        //bsbNumber2.clear();
        WebElement bsbNumber1 = findElementClickable(txt_bsbNumber);
        bsbNumber1.sendKeys(bsbNum);
        WebElement saveContact = findElementClickable(txt_saveContact);
        saveContact.click();
        //tb.logExtentReport("Batch Templates for new contacts successfully");
        WebElement nickName = findElementClickable(txt_nickName);
        nickName.click();
        //Thread.sleep(3000);
        int repeat = 0;
        while (repeat <= 7) {

            try {
                WebElement nickName1 = findElementClickable(txt_nickName);
                nickName1.sendKeys(nickname);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeat++;
        }
//		WebElement nickName1 =findElement(txt_nickName);
//		nickName1.sendKeys(nickname);

        WebElement regularPaymentNew = findElementClickable(txt_regularPaymentNew);
        regularPaymentNew.click();
        regularPaymentNew.clear();
        //Thread.sleep(3000);

        WebElement regularPaymentNew1 = findElementClickable(txt_regularPaymentNew);
        regularPaymentNew1.sendKeys(amt);

        // Thread.sleep(3000);
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,100)");

        WebElement descriptionNew = findElementClickable(txt_descriptionNew);
        descriptionNew.click();
        //Thread.sleep(3000);
        WebElement descriptionNew2 = findElement(txt_descriptionNew);
        descriptionNew2.clear();
        WebElement descriptionNew1 = findElementClickable(txt_descriptionNew);
        descriptionNew1.sendKeys(des);
        /*
         * JavascriptExecutor jcutor = (JavascriptExecutor)driver;
         * jcutor.executeScript("arguments[0].value='Pay 152'",descriptionNew1);
         */

        WebElement addContactNew = findElementClickable(txt_addContactNew);
        addContactNew.click();
        //Thread.sleep(3000);
        WebElement Txt_saveButton = findElementClickable(txt_saveButton);
        scrollIntoView(Txt_saveButton);
        //clickElement(txt_saveButton,3000);
        Txt_saveButton.click();

        int rep = 0;
        while (rep <= 7) {

            try {
                WebElement Txt_returnTO = findElementClickable(txt_returnTO);
                scrollIntoView(Txt_returnTO);
                Txt_returnTO.click();
                // actions(Txt_returnTO);
                //clickElement(txt_returnTO);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            rep++;
        }
        //clickElement(txt_returnTO);


        Thread.sleep(2000);

    }


    public void savedBatchTemplatesEdit(String amt, String Des, String organization)
            throws Exception {

        WebElement TxtBatch = findElementClickable(txtBatch);
        actions(TxtBatch);
        //clickElement(txtBatch);
        WebElement Batchtemplate = findElementClickable(batchtemplate);
        Batchtemplate.click();
        WebElement TxtNewTemplate = findElementClickable(txt_NewTemplate);
        scrollIntoView(TxtNewTemplate);
        TxtNewTemplate.click();
        // actions(TxtNewTemplate);
        //clickElement(txtNewTemplate);
//button[text()='New Batch Template']

        //clickElement(txt_NewTemplate);

        //clickElement(txt_organizationName);
        WebElement Txt_organizationName = findElement(txt_organizationName);
        actions(Txt_organizationName);
        //Thread.sleep(2000);

        enterKeys(txt_organizationName, organization);

        //Thread.sleep(2000);

        clickElement(txt_templateDescription);


        enterKeys(txt_templateDescription, Des);


        addNewcontactTemplate(amt, Des);
        addNewcontactTemplate(amt, Des);

        WebElement totalAmount = findElement(txt_totalAmount1);
        totalAmount.getText();

        //Thread.sleep(1000);
        WebElement Txt_saveButton = findElementClickable(txt_saveButton);
        scrollIntoView(Txt_saveButton);
        Txt_saveButton.click();
        //actions(Txt_saveButton);
        //clickElement(txt_saveButton);

        //Thread.sleep(2000);

        //tb.logExtentReport("Batch Templates saved successfully");
        WebElement Txt_returnTO = findElementClickable(txt_returnTO);
        Txt_returnTO.click();
        // clickElement(txt_returnTO);

    }

    public void batchEdit(String amt, String des, String organization, String des1, String des2, String amt2) throws Exception {

        waitForPageToLoad(2000);
        for (int i = 1; i <= 50; i++) {
            if (i == 21) {


                WebElement Txt_NxtPage = findElementClickable(txt_NxtPage);
                // actions(Txt_NxtPage);
                Txt_NxtPage.click();
                i = 1;
                Thread.sleep(100);
            }

            Thread.sleep(100);


            //WebElement desc = findElementVisiblity(By.xpath("//table[contains(@id,'C1__TBL_8FC')]/tbody/tr[" + i + "]/td[1]"));
            String actualDes = "";
            try {
                WebElement desc = findElementVisiblity(By.xpath("//table[contains(@id,'C1__TBL_8FC')]/tbody/tr[" + i + "]/td[1]"));

                // ToAccount.click();
                actualDes = desc.getText();
                // break;
            } catch (StaleElementReferenceException exc) {
                // exc.printStackTrace();
                WebElement desc = findElementVisiblity(By.xpath("//table[contains(@id,'C1__TBL_8FC')]/tbody/tr[" + i + "]/td[1]"));
                actualDes = desc.getText();
            }

            if (des.equals(actualDes)) {

                //element(By.xpath("(//input[@title='Edit Template'])["+i+"]")).click();
                findElement(By.xpath("(//input[@alt='Edit'])[" + i + "]")).click();
                break;
                //batchEdit.click();
            }

        }

        WebElement organizationName = findElement(txt_organizationName);
        organizationName.click();
        WebElement organizationName2 = findElement(txt_organizationName);
        organizationName2.clear();
        WebElement organizationName1 = findElement(txt_organizationName);
        organizationName1.sendKeys(organization);
        //Thread.sleep(2000);
        WebElement templateDescription = findElement(txt_templateDescription);
        templateDescription.click();
        WebElement templateDescription2 = findElement(txt_templateDescription);
        templateDescription2.clear();
        WebElement templateDescription1 = findElement(txt_templateDescription);
        templateDescription1.sendKeys(des1);
        WebElement editTemplate = findElement(txt_editTemplate);
        editTemplate.click();
        Thread.sleep(1000);
        WebElement editTemplate1 = findElement(txt_editAmount);
        editTemplate1.clear();
        Thread.sleep(1000);
        WebElement editTemplate2 = findElement(txt_editAmount);
        editTemplate2.sendKeys(amt2);
        WebElement editDescription1 = findElement(txt_editDescription1);
        editDescription1.click();
        Thread.sleep(1000);
        WebElement editDescription2 = findElement(txt_editDescription1);
        editDescription2.clear();
        Thread.sleep(1000);
        WebElement editDescription3 = findElement(txt_editDescription1);
        editDescription3.sendKeys(des2);
        clickElement(btn_updateContact);


        //addNewcontactTemplate1(amt, des1);
        //addNewcontactTemplate1(amt, des1);
        // WebElement saveButton =
        clickElement(txt_saveButton);


        WebElement total = findElement(txttotal);
        String Total = total.getText();

        //tb.logExtentReport("Batch Templates saved successfully");
        WebElement returnTO = findElement(txt_returnTO);
        returnTO.click();


    }

    public void batchTemplateDelete(String amt, String des) throws Exception {


        for (int i = 1; i <= 50; i++) {
            if (i == 21) {


                WebElement Txt_NxtPage = findElementClickable(txt_NxtPage);
                actions(Txt_NxtPage);
                i = 1;

            }

            Thread.sleep(100);
            String actualDes = "";
            try {
                WebElement desc = findElementVisiblity(By.xpath("//table[contains(@id,'C1__TBL_8FC')]/tbody/tr[" + i + "]/td[1]"));

                // ToAccount.click();
                actualDes = desc.getText();
                // break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
                WebElement desc = findElementVisiblity(By.xpath("//table[contains(@id,'C1__TBL_8FC')]/tbody/tr[" + i + "]/td[1]"));
                actualDes = desc.getText();
            }
            if (des.equals(actualDes)) {

                //element(By.xpath("(//input[@title='Edit Template'])["+i+"]")).click();
                findElement(By.xpath("(//input[@alt='Delete'])[" + i + "]")).click();
                break;
                //batchEdit.click();
            }

        }

        WebElement DeleteConfirm = findElementClickable(deleteConfirm);
        String a = DeleteConfirm.getText();
        Assert.assertTrue(a.contains("Are you sure you want to delete this batch template?"));
        WebElement Continuee = findElementClickable(continuee);
        Continuee.click();
    }


    public void addNewcontactTemplate(String amount, String description) throws Exception {

        WebElement toAccount = findElementClickable(txt_toAccountNum);
        int repeat = 0;
        while (repeat <= 15) {

            try {
                WebElement ToAccount = findElementClickable(txt_toaccountnumber);
                ToAccount.click();
                //  actions(ToAccount);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeat++;
        }
//		Select sl = new Select(toAccount);
//		sl.selectByIndex(1);
        int repp = 0;
        while (repp <= 15) {

            try {
                WebElement toAccountt = findElementClickable(txt_toaccountnumber);
                Select sl = new Select(toAccountt);
                sl.selectByIndex(4);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repp++;
        }

        int repe = 0;
        while (repe <= 15) {

            try {
                WebElement Txt_regularTempAmtt = findElement(txt_regularTempAmt);
                //Txt_regularTempAmtt.click();
                actions(Txt_regularTempAmtt);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repe++;
        }
        clearElement(txt_regularTempAmt);
        enterKeys(txt_regularTempAmt, amount);

        WebElement Txt_regularTempDes = findElementClickable(txt_regularTempDes);

        actions(Txt_regularTempDes);

        clearElement(txt_regularTempDes);

        //Thread.sleep(1000);

        enterKeys(txt_regularTempDes, description);

        Thread.sleep(2000);
        WebElement Txt_addContactNew = findElementClickable(txt_addContactNew);
        //	clickElement(txt_addContactNew);
        actions(Txt_addContactNew);


    }

    public void composeMessage(String subjt) throws Exception {
        // gotoAccount.click();
        // ;
        WebElement messageIB = findElementClickable(txtmessageIB);
        messageIB.click();

        WebElement compose = findElement(txt_compose);
        compose.click();

        WebElement dropdownMessage = findElement(txt_dropdownMessage);
        //Select sl = new Select(dropdownMessage);
        int repeat = 0;
        while (repeat <= 25) {
            try {
                Select sl = new Select(dropdownMessage);

                sl.selectByIndex(1);


                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeat++;
        }

        //sl.selectByIndex(1);
        Thread.sleep(2000);
        WebElement subject = findElementClickable(txt_subject);
        clickElement(subject);
        WebElement subject1 = findElementClickable(txt_subject);
        subject1.clear();
        Thread.sleep(2000);

        int repeattt = 0;
        while (repeattt <= 25) {
            try {
                WebElement subject2 = findElementClickable(txt_subject);
                subject2.sendKeys(subjt);

                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeattt++;
        }


//		WebElement subject2 = findElementClickable(txt_subject);
//		subject2.sendKeys(subjt);
        Thread.sleep(1000);

        WebElement messageDescription = findElement(txt_messageDescription);
        clickElement(messageDescription);
        Thread.sleep(1000);
        messageDescription.clear();
        messageDescription.clear();
        messageDescription.clear();
        Thread.sleep(1000);
        WebElement messageDescription1 = findElement(txt_messageDescription);
        //	scrollIntoView(messageDescription1);
        messageDescription1.click();
        messageDescription1.click();
        messageDescription1.click();
        Thread.sleep(1000);
        messageDescription1.sendKeys("Need more details to send");

        Thread.sleep(2000);

        WebElement messageContinue = findElementClickable(txt_messageContinue);
        scrollIntoView(messageContinue);
        mouseOver(messageContinue);
        actions(messageContinue);
        Thread.sleep(1000);

        WebElement messageSent = findElementClickable(txt_messageSent);
        //messageSent.click();
        actions(messageSent);
        for (int i = 1; i <= 3; i++) {
            String actualMsg = findElement(By.xpath("//table/tbody/tr[" + i + "]/td[2]")).getText();
            System.out.println(actualMsg + "Actual subject displayed");
            if (subjt.contains(actualMsg)) {
                System.out.println("Message successfully displayed in sent box*****************");
                break;
            } else {
                System.out.println("FAIL:Message is not displayed successfully in sent box");
                //tb.test.log(Status.FAIL, "Frequency is not successfully displayed for confirmation message");
                Assert.fail();
            }

        }
        // tb.logExtentReport("Compose message done successfully....");
        // return sub;

    }

    public void savedBatchDebitFile(String amt, String Des, String becIDDebit, String path) throws Exception {
        WebElement batch = findElement(txtBatch);
        batch.click();

        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,1000)");
        clickElement(txtNewBatch);
        Thread.sleep(400);
        int repeat = 0;
        while (repeat <= 15) {


            try {
                WebElement TxtDebitBatch = findElement(txtDebitBatch);
                actions(TxtDebitBatch);
                //TxtDebitBatch.click();
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeat++;
        }
        //clickElement(txtDebitBatch);

        Thread.sleep(2000);

        //clickElement(txtdropdown);

        WebElement dropdown = findElementClickable(txtdropdown);
        Thread.sleep(1000);
        String destinationAcoount1 = "";
        actions(dropdown);
        WebElement Dropdown = findElementClickable(txtdropdown);
        String destAccntDebitBatchpaymentsfile;
        repeat = 0;
        while (repeat <= 15) {


            try {
                destinationAcoount1 = selectUsingIndex(Dropdown, 1);
                Thread.sleep(1000);
                //TxtDebitBatch.click();
                break;
            } catch (Exception exc) {
                destinationAcoount1 = selectUsingIndex(Dropdown, 1);
                Thread.sleep(1000);
                exc.printStackTrace();
            }
            repeat++;
        }
        WebElement Dropdownn = findElementClickable(txtdropdown);
        Thread.sleep(1000);
        //  String destinationAcoount1=selectUsingIndex(dropdown, 1);

        destAccntDebitBatchpaymentsfile = destinationAcoount1.substring(19, 28);
        WebElement dropdownn = findElementClickable(txtdropdown);
        //dropdownn.click();
        Thread.sleep(2000);
        WebElement Becid = findElementClickable(txtBecID);
        Becid.click();
        //clickElement(txtBecID);
        Thread.sleep(1000);
        WebElement BecId = findElementClickable(txtBecID);
        BecId.sendKeys(becIDDebit);
        // enterKeys(txtBecID, becIDDebit);
        Thread.sleep(1000);
        WebElement TxtBatchCalendar = findElementClickable(txtBatchCalendar);
        TxtBatchCalendar.click();
        // clickElement(txtBatchCalendar);


        WebElement batchCalendar1 = findElement(txtBatchCalendar);
        String calendarText = batchCalendar1.getAttribute("value");
        WebElement TxtFile = findElement(txtFile);
        TxtFile.click();
        //  clickElement(txtFile);

        Thread.sleep(1000);

        //clickElement(txtUpload);

        WebElement upload = findElement(txtUpload);


        // actions(upload);

        Thread.sleep(3000);
        upload.sendKeys(path);


        Thread.sleep(4000);
        //enterKeys(txtUpload,path);
        WebElement uploadButton = findElementClickable(txt_Upload);
        clickElementUsingJavaScript(uploadButton);

        //actions(uploadButton);
        //clickElement(txt_Upload);


        boolean b = findElement(By.xpath("(//input[@type='text'])[3]")).isDisplayed();
        if (b == true) {

            // tb.logExtentReport("PASS:-File is uploaded successfiully");
        } else {
            // tb.logExtentReport("FAIL:-File is not uploaded successfiully");
        }


        WebElement Filedescription = findElement(txtFiledescription);
        Filedescription.clear();
        String description = "PAY FE0" + getRandomNumberStringTwodigit() + getRandomNumberStringTwodigit();
        Filedescription.sendKeys(description);
        String fileDescription = Filedescription.getAttribute("value");
        //batchPaymentsDebitFile.add(1,fileDescription);
        WebElement FileAmount = findElement(txtFileAmount);
        String fileAmount = FileAmount.getText();
        //batchPaymentsDebitFile.add(2,fileAmount);
        WebElement FROMAccountt = findElementClickable(txtdropdown);
        Select selectt = new Select(FROMAccountt);
        WebElement firstoption = selectt.getOptions().get(0);
        if (firstoption.isSelected()) {
            WebElement FROMAccount = findElementClickable(txtdropdown);
            Select Sele = new Select(FROMAccount);
            Sele.selectByIndex(1);
        }


        clickElement(txtContinue);

        WebElement TxtpayNow = findElement(txtpayNow);
        TxtpayNow.click();


        WebElement actualText = findElement(txtVerification);
        String actualVerification = actualText.getText();
        String expectedVerification = "Your batch payment has been created and is awaiting approval before being processed";
        if (actualVerification.equals(expectedVerification)) {
            log.info("File uploaded successfully");
            //tb.logExtentReport("File uploaded successfully");
        }
        T24homepage TH = new T24homepage();
        TH.setProperty("debitbatchbatchpaymentfiledescription", fileDescription);
        TH.setProperty("debitbatchbatchpaymentfileAmount", fileAmount);
        TH.setProperty("destAccntDebitBatchpaymentsfile", destAccntDebitBatchpaymentsfile);

    }

    public void batchPaymentsFile(String amount1, String description, String path) throws Exception {

        WebElement batch = findElement(txtBatch);
        batch.click();

//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,1000)");

        WebElement newBatch = findElement(txtNewBatch);
        actions(newBatch);
        //newBatch.click();
        Thread.sleep(500);
        WebElement creditBatch = findElementClickable(txtCredit);
        //creditBatch.click();
        actions(creditBatch);
        // WebElement destinationAccount=element(txtdropdown);
        WebElement sourceAccount = findElementClickable(txtSourceAccount);
//		int repeat=0;
//		while(repeat<=15) {
//
//		try {
//			WebElement sourceAccount1 = findElementClickable(txtSourceAccount);
//			sourceAccount1.click();
//			break;
//		}catch(StaleElementReferenceException exc) {
//			exc.printStackTrace();
//		}
//		repeat++;
//		}
        Thread.sleep(300);
        //WebElement sourceAccount1 = findElementClickable(txtSourceAccount);
        String sourceAccountFile = "";
        int rep = 0;
        while (rep <= 15) {

            try {
                WebElement sourceAccount1 = findElementClickable(txtSourceAccount);
                Select sl = new Select(sourceAccount1);
                List<WebElement> accountsRes = sl.getOptions();
                sourceAccountFile = accountsRes.get(1).getText();
                sl.selectByIndex(1);
                break;
            } catch (StaleElementReferenceException exc) {
                WebElement sourceAccount1 = findElementClickable(txtSourceAccount);
                Select sl = new Select(sourceAccount1);
                sl.selectByIndex(1);
                exc.printStackTrace();
            }
            rep++;
        }
        WebElement sourceAccountt = findElementClickable(txtSourceAccount);

        String source = sourceAccountFile.substring(19, 28);

//		Select sl = new Select(sourceAccount);
//		List<WebElement> accountsRes = sl.getOptions();
//		sourceAccountFile=accountsRes.get(1).getText();
//		sl.selectByIndex(1);
        Thread.sleep(600);
        // WebElement becID=element(txtBecID);
        // becID.sendKeys("420288");
        WebElement SourceAccountt = findElementClickable(txtSourceAccount);
        Thread.sleep(500);
        WebElement batchCalendar = findElementClickable(txtCalendarBatch);
        Thread.sleep(1000);
        WebElement BatchCalendar = findElementClickable(txtCalendarBatch);
        actions(BatchCalendar);
        //batchCalendar.click();
        Thread.sleep(300);
        int rept = 0;
        while (rept <= 15) {

            try {
                WebElement batchFile = findElementClickable(txtFile);
                clickElementUsingJavaScript(batchFile);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            rept++;
        }
        Thread.sleep(500);
//		WebElement batchFile =findElement(txtFile);
//		batchFile.click();

        WebElement upload = findElement(txtUpload);
        //Actions action = new Actions(driver);
        //action.moveToElement(upload).click();
        //actions(upload);
        //Thread.sleep(5000);
        WebElement upload1 = findElement(txtUpload);
//		 StringSelection s = new StringSelection(path);
//		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
//		 robotClass();
//
        //upload1.sendKeys("C:\\UFS\\90_EFT - ME 28 Februaury 2021 - Synod-Credit-internal.txt");
        upload1.sendKeys(path);
        Thread.sleep(500);
        WebElement uploadFile = findElement(txt_Upload);
        clickElementUsingJavaScript(uploadFile);

        boolean b = findElement(By.xpath("(//input[@type='text'])[3]")).isDisplayed();


        WebElement fileOrgName = findElement(txt_fileOrgName);
        String fileOrganization = fileOrgName.getAttribute("value");
        String fileOrg = fileOrganization.substring(0, 19);
        WebElement filedescription = findElement(txt_fileDescription);
        String FileDescription = filedescription.getAttribute("value");
        Assert.assertTrue(FileDescription.contains("PAY"));
        filedescription.clear();
        String descript = "batch" + getRandomNumberStringTwodigit() + getRandomNumberStringTwodigit();
        filedescription.sendKeys(descript);
        FileDescription = filedescription.getAttribute("value");

        String fileDes = FileDescription.substring(0, 3);
        WebElement FileAmount = findElement(txtFileAmount);
        String fileAmount = FileAmount.getText();

        WebElement FROMAccountt = findElementClickable(txtSourceAccount);
        Select selectt = new Select(FROMAccountt);
        WebElement firstoption = selectt.getOptions().get(0);
        if (firstoption.isSelected()) {
            WebElement FROMAccount = findElementClickable(txtSourceAccount);
            Select Sele = new Select(FROMAccount);
            Sele.selectByIndex(1);
        }


        WebElement batchContinue = findElement(txtContinue);
        actions(batchContinue);
        //batchContinue.click();

        String calendarText = "";
        String templateText = "";
        continueMessageBatchCredit(sourceAccountFile, calendarText, templateText, fileOrg, fileDes, fileAmount);


        payNowMessageCredit(sourceAccountFile, calendarText, templateText, fileOrg, fileDes, fileAmount);
        //WebElement batchPayNow = findElement(txtpayNow);
        //batchPayNow.click();
        //;
        WebElement actualText = findElement(txtVerification);
        String actualVerification = actualText.getText();
        String expectedVerification = "Your batch payment has been created and is awaiting approval before being processed";
        if (actualVerification.equals(expectedVerification)) {
            log.info("File uploaded successfully");
            T24homepage TH = new T24homepage();
            String date = TH.datePickIBM();
            //tb.logExtentReport("File uploaded successfully");
            TH.setProperty("Creditbatchbatchpaymentfiledescription", FileDescription);
            TH.setProperty("CreditbatchbatchpaymentfileAmount", fileAmount);
            TH.setProperty("SourceAccntCreditBatchpaymentsfile", source);
            TH.setProperty("DateAccntCreditBatchpaymentsfile", date);

        }
    }

    public void creditBatchTemplates(String amount, String description, String value) throws Exception {

        WebElement batch = findElementClickable(txtBatch);
        //batch.click();
        WebElement newBatch = findElementClickable(txtNewBatch);
        newBatch.click();
        WebElement creditBatch = findElementClickable(txtCredit);
        scrollIntoView(creditBatch);
        creditBatch.click();
        int Repeat = 0;
        while (Repeat <= 5) {

            try {
                WebElement sourceAccount = findElementClickable(txtSourceAccount);
                System.out.println(sourceAccount.getAttribute("value"));
                System.out.println(sourceAccount.getText());
                sourceAccount.click();

                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            Repeat++;
        }
        Thread.sleep(200);
        String sourceAccountTemp = "";
        int Rep = 0;
        while (Rep <= 10) {

            try {

                WebElement sourceAccount = findElementClickable(txtSourceAccount);
                Select sl = new Select(sourceAccount);
                List<WebElement> accountsRes = sl.getOptions();
                sourceAccountTemp = accountsRes.get(1).getText();

                sl.selectByIndex(1);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            Rep++;
        }
        Thread.sleep(2000);
        String source = sourceAccountTemp.substring(19, 28);
        WebElement template = findElementClickable(txtTemplate);
        scrollIntoView(template);
        template.click();
        //Thread.sleep(1000);
        int Repeatt = 0;
        while (Repeatt <= 5) {
            try {
                WebElement selectTemplate = findElementClickable(txtSelectTemplate);
                selectTemplate.click();
                ;
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            Repeatt++;
        }
        int Rept = 0;
        while (Rept <= 5) {
            try {
                WebElement selectTemplate = findElementClickable(txtSelectTemplate);
                Select sle = new Select(selectTemplate);
                sle.selectByIndex(1);

                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            Rept++;
        }
        WebElement organization = findElement(txtOrganization);
        String orgTemp = organization.getAttribute("value");
        T24homepage Th = new T24homepage();
        String Description2 = Th.getRandomNumberString("Crbatch2");

        Thread.sleep(2000);
        addNewContactCreditSaved1(amount, Description2);
        WebElement batchDescription = findElement(txtBatchDescription);
        batchDescription.clear();
        batchDescription.sendKeys(description);
        String descriptionTemp = batchDescription.getAttribute("value");
        WebElement creditBatch1 = findElement(txtCredit);
        //creditBatch1.click();
        Thread.sleep(1000);
        addNewContactCreditSaved1(amount, description);
        WebElement total = findElement(txtCreditTotal);
        String totalTemp = total.getText();
        String calendarText = "";
        String templateText = "";

        WebElement sourceAccount = findElementClickable(txtSourceAccount);
        Select select = new Select(sourceAccount);
        WebElement firstoption = select.getOptions().get(0);
        if (firstoption.isSelected()) {
            Select selectt = new Select(sourceAccount);
            selectt.selectByIndex(1);
        }

        WebElement Totalamount = findElement(totalamount);
        String totalAmnt = Totalamount.getText();

        WebElement batchContinue = findElementClickable(txtContinue);
        scrollIntoView(batchContinue);
        clickElementUsingJavaScript(batchContinue);


        Th.setProperty("CreditBatchtemplateTotalamount", totalAmnt);
        Th.setProperty("CreditBatchtemplateSourceAccnt", source);
        Th.setProperty("CreditBatchtemplateDescription", description);


        continueMessageBatchCredit(sourceAccountTemp, calendarText, templateText, orgTemp, descriptionTemp, totalTemp);

        payNowMessageCredit(sourceAccountTemp, calendarText, templateText, orgTemp, descriptionTemp, totalTemp);


        WebElement actualText = findElement(txtVerification);
        String actualVerification = actualText.getText();
        String expectedVerification = "Your batch payment has been created and is awaiting approval before being processed";
        if (actualVerification.equals(expectedVerification)) {
            log.info("Credit Batch_Template New Contact is done");
            // tb.logExtentReport("Credit Batch_Template New Contact saved is done");
        }
    }


    public void addNewContactCreditSaved1(String amount, String description) throws Exception {
        WebElement ToAccount = findElementClickable(txtToAccount);
        ToAccount.click();
        WebElement toAccount = findElementClickable(txtToAccount);
        Select s2 = new Select(toAccount);
        List<WebElement> accountsRes = s2.getOptions();
        String source1 = accountsRes.get(1).getText();
        s2.selectByIndex(1);
        WebElement AmountBatchh = findElementClickable(txtAmountBatch);
        int Repeat = 0;
        while (Repeat <= 5) {

            try {
                WebElement AmountBatch = findElementClickable(txtAmountBatch);
                actions(AmountBatch);
                //AmountBatch.click();

                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            Repeat++;
        }
        Thread.sleep(500);

        WebElement AmounntBatchh = findElementClickable(txtAmountBatch);
        int RepT = 0;
        while (RepT <= 15) {

            try {

                WebElement AmountBatc = findElementClickable(txtAmountBatch);
                //AmountBatc.clear();
                AmountBatc.sendKeys(amount);
                String amountBatchCredit1 = AmountBatc.getAttribute("value");

                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            RepT++;
        }

        Thread.sleep(100);
        int repeat = 0;
        while (repeat <= 5) {

            try {
                WebElement theirDescriptionBatch = findElementClickable(txtTheirDescriptionBatch);
                scrollIntoView(theirDescriptionBatch);
                actions(theirDescriptionBatch);


                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeat++;
        }

        int repeatt = 0;
        while (repeatt <= 3) {

            try {
                WebElement theirDescriptionBatch1 = findElementClickable(txtTheirDescriptionBatch);
                actions(theirDescriptionBatch1);
                //theirDescriptionBatch1.click();
                theirDescriptionBatch1.sendKeys(description);
                String theirDescriptionCredit1 = theirDescriptionBatch1.getAttribute("value");
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeatt++;
        }


        //theirDescriptionCredit1=theirDescriptionBatch1.getAttribute("value");
        WebElement addContactBatch = findElementClickable(txtaddNewcontact);
        Thread.sleep(1000);
        actions(addContactBatch);
        //addContactBatch.click();

    }


    public void savedBatchTemplates(String amt, String Des, String becid) throws Exception {

        clickElement(txtBatch);
        //Thread.sleep(2000);
        clickElement(txtNewBatch);

        //	Thread.sleep(2000);

        clickElement(txtDebitBatch);

        Thread.sleep(2000);
        int repeat = 0;
        while (repeat <= 15) {

            try {
                WebElement destinationAccountt = findElementClickable(txtdropdown);
                destinationAccountt.click();
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeat++;
        }
        String destinationAccount3 = "";
        int rep = 0;
        while (rep <= 15) {

            try {
                WebElement destinationAccount = findElementClickable(txtdropdown);
                destinationAccount3 = selectUsingIndex(destinationAccount, 1);
                // String desAccount = destinationAccount.getText();
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            rep++;
        }
        Thread.sleep(500);


        String destAccntBatchSavedTemplate = destinationAccount3.substring(19, 28);
        Thread.sleep(100);
        WebElement destinationAccount = findElementClickable(txtdropdown);
        Thread.sleep(2000);
        // destinationAccount.click();
        WebElement TextBecID = findElementClickable(txtBecID);
        Thread.sleep(500);
        WebElement TxtBecID = findElementClickable(txtBecID);
        int rept = 0;
        while (rept <= 15) {

            try {
                WebElement TxtBecId = findElementClickable(txtBecID);
                TxtBecId.click();
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            rep++;
        }
//		enterKeys(txtBecID,becid);
        int reptt = 0;
        while (reptt <= 15) {

            try {
                WebElement TxtBecId = findElementClickable(txtBecID);
                TxtBecId.sendKeys(becid);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            reptt++;
        }
        clickElement(txtBatchCalendar);
        WebElement batchCalendar1 = findElement(txtBatchCalendar);
        String calendarText = batchCalendar1.getAttribute("value");
        clickElement(txtTemplate);
        WebElement selectTemplate = findElementClickable(txtSelectTemplate);
        int repett = 0;
        while (repett <= 15) {
            try {
                WebElement SelectTemplate = findElementClickable(txtSelectTemplate);
                SelectTemplate.click();
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            reptt++;
        }
        String templateText = "";

        int repeett = 0;
        while (repeett <= 15) {

            try {
                templateText = selectUsingIndex(selectTemplate, 1);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            reptt++;
        }
        Thread.sleep(500);
        WebElement organization = findElement(txt_BatchOrganization);
        String orgName = organization.getText();
        Thread.sleep(500);
        WebElement descriptionBatch = findElement(txt_DesBatch);
        Thread.sleep(500);
        //scrollIntoView(descriptionBatch);
        String a = getRandomNumberString("Dbtbchpay");
        int re = 0;
        while (re <= 15) {
            try {
                WebElement descriptionBatch1 = findElement(txt_DesBatch);
                actions(descriptionBatch1);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            re++;
        }
        Thread.sleep(500);
        WebElement descriptionBatch2 = findElementClickable(txt_DesBatch);
        descriptionBatch2.clear();
        WebElement descriptionBatch3 = findElement(txt_DesBatch);
        descriptionBatch3.sendKeys(a);
        String desTemplate = descriptionBatch3.getAttribute("value");
        addNewContact(amt, Des);
        addNewContact2(amt, Des);
        Thread.sleep(1000);

        By debitbtchdestinationAcnt = By.xpath("(//*[@name='C1__BATCHPAYMENTS[1].BATCH[1].BATCHFORMDETAILS[1].FROMACCOUNT'])[2]");
        String DebitbtchdestinationAcnt = findElement(debitbtchdestinationAcnt).getText();

        By postingdatercalender = By.xpath("(//*[@name='C1__BATCHPAYMENTS[1].BATCH[1].BATCHFORMDETAILS[1].POSTINGDATE'])[1]");
        String postingDate = findElement(postingdatercalender).getText();
        By Totalamount = By.xpath("(//span[text()='Total'])[1]/following::div[1]");
        String totalAmount = findElement(Totalamount).getText();

        WebElement FROMAccountt = findElementClickable(txtdropdown);
        Select selectt = new Select(FROMAccountt);
        WebElement firstoption = selectt.getOptions().get(0);
        if (firstoption.isSelected()) {
            WebElement FROMAccount = findElementClickable(txtdropdown);
            Select Sele = new Select(FROMAccount);
            Sele.selectByIndex(1);
        }
        int repeeti = 0;
        while (repeeti <= 35) {
            try {
                clickElement(txtContinue);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeeti++;
        }
        WebElement total = findElement(txt_total);
        String totalAmount4 = total.getText();
        //batchPaymentsDebitTemplateList.add(2,totalAmount4);
        WebElement raw1 = findElement(txt_raw1);
        String Debitraw1column1 = raw1.getText();
        WebElement raw2 = findElement(txt_raw2);
        String Debitraw1column2 = raw2.getText();
        WebElement raw3 = findElement(txt_raw3);
        String Debitraw1column3 = raw3.getText();
        WebElement raw4 = findElement(txt_raw4);
        String Debitraw1column4 = raw4.getText();
        WebElement raw5 = findElement(txt_raw5);
        String Debitraw1column5 = raw5.getText();
        WebElement coloumn1 = findElement(txt_rwa2_coloumn1);
        String Debitraw2column1 = coloumn1.getText();
        WebElement coloumn2 = findElement(txt_rwa2_coloumn2);
        String Debitraw2column2 = coloumn2.getText();
        WebElement coloumn3 = findElement(txt_rwa2_coloumn3);
        String Debitraw2column3 = coloumn3.getText();
        WebElement coloumn4 = findElement(txt_rwa2_coloumn4);
        String Debitraw2column4 = coloumn4.getText();
        WebElement coloumn5 = findElement(txt_rwa2_coloumn5);
        String Debitraw2column5 = coloumn5.getText();

        T24homepage Th = new T24homepage();
        Th.setProperty("DebitbtTmpltechdestinationAcnt", destAccntBatchSavedTemplate);
        Th.setProperty("DebitbtchTmplatepostingDate", postingDate);
        Th.setProperty("DebitbtchTmplTotalamount", totalAmount);
        Th.setProperty("DebitbtchTmplDescription", desTemplate);

        continueMessageBatch(destinationAccount3, calendarText, templateText, orgName, desTemplate, totalAmount4);
        payNowMessage(destinationAccount3, calendarText, templateText, orgName, desTemplate, totalAmount4);
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

    public void reviewBatchPaymentFailure() throws Exception {


        WebElement Returntobatchpayments = findElement(returntobatchpayments);
        actions(Returntobatchpayments);
    }

    public void batchPaymentsFailure_WrongBSB(String path, String becid) throws Exception {
        WebElement transferButton = findElement(txttransferButton);
        transferButton.click();

        WebElement batch = findElementClickable(txtBatch);
        batch.click();

        WebElement newBatch = findElementClickable(txtNewBatch);
        newBatch.click();

        WebElement debitBatch = findElementClickable(txtDebit);
        debitBatch.click();
        String destinationAcoount1 = "";

        int repeaT = 0;
        while (repeaT <= 16) {

            try {
                WebElement destinationAccount = findElementClickable(txtdropdown);
                destinationAccount.click();
                Thread.sleep(200);
                Select sl = new Select(destinationAccount);
                List<WebElement> accountsRes = sl.getOptions();
                destinationAcoount1 = accountsRes.get(1).getText();
                //batchPaymentsDebitFile.add(0,accountsRes.get(2).getText());
                sl.selectByIndex(1);


                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeaT++;
        }


        Thread.sleep(200);


        WebElement destinationAccount1 = findElementClickable(txtdropdown);
        String desAccount = destinationAccount1.getText();
        Thread.sleep(500);
        WebElement becID = findElementClickable(txtBecID);
        Thread.sleep(200);
        WebElement BecID = findElementClickable(txtBecID);
        BecID.sendKeys(becid);

        WebElement batchCalendar = findElement(txtBatchCalendar);
        batchCalendar.click();

        WebElement batchCalendar1 = findElement(txtBatchCalendar);
        String calendarText = batchCalendar1.getAttribute("value");
        WebElement batchFile = findElement(txtFile);
        batchFile.click();
        //Thread.sleep(3000);
        WebElement upload = findElement(txtUpload);

        WebElement upload1 = findElement(txtUpload);

        upload1.sendKeys(path);


        clickElement(txt_Upload);


//        boolean b = findElement(By.xpath("(//input[@type='text'])[3]")).isDisplayed();
//        if (b == true) {
//
//           System.out.println(
//                   ""
//           );
//        }
//
//        else {
//            tb.logExtentReport("FAIL:-File is not uploaded successfiully");
//        }

        WebElement FROMAccountt = findElementClickable(txtdropdown);
        Select selectt = new Select(FROMAccountt);
        WebElement firstoption = selectt.getOptions().get(0);
        if (firstoption.isSelected()) {
            WebElement FROMAccount = findElementClickable(txtdropdown);
            Select Sele = new Select(FROMAccount);
            Sele.selectByIndex(1);
        }
        WebElement batchContinue = findElement(txtContinue);
        batchContinue.click();

        WebElement batchPayNow = findElement(txtpayNow);
        batchPayNow.click();

        WebElement actualText = findElement(txtVerification);
        String actualVerification = actualText.getText();
        String expectedVerification = "Your batch payment has been created and is awaiting approval before being processed";
        if (actualVerification.equals(expectedVerification)) {
            log.info("File uploaded successfully");
            //tb.logExtentReport("File uploaded successfully");
        }

    }

    public void reviewBatchPaymentDetails(String postinggdate, String amount, String Destinationaccountt, String Description) {

        By Postingdate = By.xpath("(//*[text()='Posting Date']/following::*)[2]");
        WebElement postingdate = findElement(Postingdate);
        String postingdatee = postingdate.getText();
        By Amount = By.xpath("(//*[text()='Total Amount']/following::*)[2]");
        String Amountt = findElement(Amount).getText();
        By Destinationaccount = By.xpath("(//*[text()='Destination Account']/following::*)[2]");
        String destinationaccount = findElement(Destinationaccount).getText();
        By description = By.xpath("(//*[text()='Description']/following::*)[2]");
        String desCription = findElement(description).getText();


    }

    public void payNowMessage(String dAccount, String calendar, String template, String org, String description,
                              String totalAmt) throws Exception {
        WebElement actualText = findElement(txtVerification);
        String actualVerification = actualText.getText();
        String expectedVerification = "Your batch payment has been created and is awaiting approval before being processed";
        if (actualVerification.equals(expectedVerification)) {
            System.out.println("Batch payment for saved done");
            log.info("Batch Payment for saved template is done");

        }

        WebElement fAccount = findElement(txt_destinationAccount);
        String actualfAccount = fAccount.getText();
        if (dAccount.contains(actualfAccount)) {
            log.info("Batch Template payment:-Verified destination account from Pay now confirmation page");
            // tb.logExtentReport("Batch Template payment:-Verified destination account from Pay now confirmation page");
        }
        WebElement pDate = findElement(txt_postingDate);
        String postingDate = pDate.getText();

        WebElement organization = findElement(txt_Organization);
        String actualOrganization = organization.getText();
        if (actualOrganization.equals(org)) {
            log.info("Batch Template payment:-Verified the organization from Pay now confirmation page");
            //tb.logExtentReport("Batch Template payment:-Verified the organization from Pay now confirmation page");
        }

        WebElement totalamount = findElement(txt_totalAmount);
        String totalAmount = totalamount.getText();
        if (totalAmount.equals(totalAmt)) {
            log.info("Batch Template payment:-Verified the Amount from Pay now confirmation page");
            //tb.logExtentReport("Batch Template payment:-Verified the Amount from Pay now confirmation page");
        }
        WebElement descriptionBatch = findElement(txt_Description);
        String actualDes = descriptionBatch.getText();
        if (actualDes.equals(description)) {
            log.info("Batch Template payment:-Verified the description from Pay now confirmation page");
            //tb.logExtentReport("Batch Template payment:-Verified the description from Pay now confirmation page");
        }


    }

    public void continueMessageBatch(String dAccount, String calendar, String template, String org, String description,
                                     String totalAmt) throws Exception {
        clickElement(txtpayNow);


        WebElement fAccount = findElement(txt_destinationAccount);
        String actualfAccount = fAccount.getText();
        if (dAccount.contains(actualfAccount)) {
            log.info("Batch Template payment:-Verified destination account from Pay now confirmation page");
            //tb.logExtentReport("Batch Template payment:-Verified destination account from Pay now confirmation page");
        } else if (template == "Pay 100") {
            WebElement templateBatch = findElement(txt_template);
            String Actualtemplate = templateBatch.getText();
            if (Actualtemplate.equals(template)) {
                log.info("Batch Template payment:-Verified the template from Pay now confirmation page");
                //tb.logExtentReport("Batch Template payment:-Verified the template from Pay now confirmation page");
            }
        }
        WebElement organization = findElement(txt_Organization);
        String actualOrganization = organization.getText();
        if (org.contains(actualOrganization)) {

            log.info("Batch Template payment:-Verified the organization from Pay now confirmation page");
            //tb.logExtentReport("Batch Template payment:-Verified the organization from Pay now confirmation page");
        }
        WebElement totalamount = findElement(txt_totalAmount);
        String totalAmount = totalamount.getText();
        if (totalAmount.equals(totalAmt)) {
            log.info("Batch Template payment:-Verified the Amount from Pay now confirmation page");
            //tb.logExtentReport("Batch Template payment:-Verified the Amount from Pay now confirmation page");
        }
        WebElement descriptionBatch = findElement(txt_Description);
        String actualDes = descriptionBatch.getText();
        if (actualDes.contains(description)) {
            log.info("Batch Template payment:-Verified the description from Pay now confirmation page");
            //tb.logExtentReport("Batch Template payment:-Verified the description from Pay now confirmation page");
        }

    }


    public void addNewContact2(String amount, String description) throws Exception {
        clickElement(txtToAccount);
        int repet = 0;
        while (repet <= 15) {
            try {
                WebElement toAccount = findElementClickable(txtToAccount);
                toAccount.click();
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repet++;
        }
        int repeatt = 0;
        while (repeatt <= 15) {
            try {
                WebElement toAccount = findElementClickable(txtToAccount);

                String debitToaccountDebit = selectUsingIndex(toAccount, 1);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeatt++;
        }
        Thread.sleep(1000);
        int rep = 0;
        while (rep <= 5) {
            try {
                WebElement TxtAmountBatch = findElementClickable(txtAmountBatch);
                TxtAmountBatch.click();
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            rep++;
        }
        Thread.sleep(1000);
        int rept = 0;
        while (rept <= 5) {
            try {
                WebElement amountt = findElement(txtAmountBatch);
                amountt.clear();
                amountt.sendKeys(amount);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            rept++;
        }
        WebElement AmountBatch3 = findElement(txtAmountBatch);
        String debitAmount = AmountBatch3.getAttribute("value");
        clickElement(txtTheirDescriptionBatch);
        enterKeys(txtTheirDescriptionBatch, description);
        WebElement theirDescriptionBatch1 = findElement(txtTheirDescriptionBatch);
        String theirDebitDes = theirDescriptionBatch1.getAttribute("value");
        int reppt = 0;
        while (reppt <= 5) {
            try {
                clickElement(txtaddNewcontact);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            reppt++;
        }
    }


    public void addNewContact(String amount, String description) throws Exception {
        clickElement(txtToAccount);
        int repet = 0;
        while (repet <= 15) {

            try {
                WebElement toAccount = findElementClickable(txtToAccount);
                actions(toAccount);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repet++;
        }
        int repeatt = 0;
        while (repeatt <= 15) {

            try {
                WebElement toAccount = findElementClickable(txtToAccount);

                String debitToaccountDebit = selectUsingIndex(toAccount, 1);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeatt++;
        }
        Thread.sleep(1000);
        int rep = 0;
        while (rep <= 5) {

            try {
                WebElement TxtAmountBatch = findElementClickable(txtAmountBatch);
                TxtAmountBatch.click();
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            rep++;
        }
        Thread.sleep(1000);
        int rept = 0;
        while (rept <= 5) {

            try {
                enterKeys(txtAmountBatch, amount);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            rept++;
        }
        WebElement AmountBatch3 = findElement(txtAmountBatch);
        String debitAmount = AmountBatch3.getAttribute("value");
        clickElement(txtTheirDescriptionBatch);
        enterKeys(txtTheirDescriptionBatch, description);
        WebElement theirDescriptionBatch1 = findElement(txtTheirDescriptionBatch);
        String theirDebitDes = theirDescriptionBatch1.getAttribute("value");
        int reppt = 0;
        while (reppt <= 5) {

            try {
                clickElement(txtaddNewcontact);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            reppt++;
        }

    }

    public void batchPaymentsDebitNewSaved(String amount1, String description1, String amount2, String description2, String becid)
            throws Exception {


        clickElement(txtBatch);

        clickElement(txtNewBatch);

        clickElement(txtDebitBatch);


        clickElement(txtdropdown);

        Thread.sleep(1000);
        String desAccount = "";
        int repet = 0;
        while (repet <= 25) {

            try {
                WebElement destinationAccount = findElementClickable(txtdropdown);
                destinationAccount.click();
                desAccount = selectUsingIndex(destinationAccount, 1);

                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repet++;
        }
        Thread.sleep(1000);

        String destAccntDebitBatchnewSaved = desAccount.substring(19, 28);

        Thread.sleep(1000);

        WebElement destinationAccount1 = findElementClickable(txtBecID);

        WebElement TxtbecID = findElementClickable(txtBecID);
        Thread.sleep(500);
        int rep = 0;
        while (rep <= 15) {

            try {
                WebElement txtbecID = findElementClickable(txtBecID);
                txtbecID.click();
                break;
            } catch (Exception exc) {
                Thread.sleep(3000);
                WebElement txtbecID = findElementClickable(txtBecID);
                txtbecID.click();
                exc.printStackTrace();
            }
            repet++;
        }
        Thread.sleep(500);

        int repett = 0;
        while (repett <= 15) {

            try {
                WebElement txtbecID = findElementClickable(txtBecID);
                txtbecID.sendKeys(becid);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repett++;
        }


        WebElement becID2 = findElement(txtBecID);

        String bec = becID2.getAttribute("value");

        clickElement(txtCalendarBatch);

        String templateText = "";
        WebElement batchCalendar1 = findElement(txtCalendarBatch);

        String calendarText = batchCalendar1.getAttribute("value");

        WebElement organization1 = findElementClickable(txtOrganization);
        organization1.click();
        organization1.sendKeys("TH");
        String orgName = organization1.getAttribute("value");
        clickElement(txtBatchDescription);
        WebElement batchDescription = findElement(txtBatchDescription);
        batchDescription.sendKeys(description1);
        WebElement batchDescription1 = findElement(txtBatchDescription);
        String descriptionBatch = batchDescription1.getAttribute("value");
        addNewContact(amount1, description1);
        addnewContact(amount2, description2);
        T24homepage TH = new T24homepage();
        By totalamount = By.xpath("(//*[text()='Total']/following::div)[1]");
        By postingdate = By.xpath("(//*[@name='C1__BATCHPAYMENTS[1].BATCH[1].BATCHFORMDETAILS[1].POSTINGDATE'])[1]");
        WebElement totalAmnt = findElement(totalamount);
        WebElement Postingdate = findElement(postingdate);
        String PostingDate = Postingdate.getAttribute("value");
        String TotallAmnt = totalAmnt.getText();
        TH.setProperty("DebitbtchpaymentTotalamount", TotallAmnt);
        TH.setProperty("DebitbtchpaymentDescription", description1);
        TH.setProperty("DebitbtchpaymentDestinationAcnt", destAccntDebitBatchnewSaved);
        TH.setProperty("DebitbtchPaypostingDate", PostingDate);
        WebElement FROMAccountt = findElementClickable(txtdropdown);
        Select selectt = new Select(FROMAccountt);
        WebElement firstoption = selectt.getOptions().get(0);
        if (firstoption.isSelected()) {
            WebElement FROMAccount = findElementClickable(txtdropdown);
            Select Sele = new Select(FROMAccount);
            Sele.selectByIndex(1);
        }


        clickElement(txtContinue);

        WebElement total = findElement(txt_total);
        String totalAmount1 = total.getText();


        continueMessageBatch(desAccount, calendarText, templateText, orgName, descriptionBatch, totalAmount1);

        payNowMessage(desAccount, calendarText, templateText, orgName, descriptionBatch, totalAmount1);


    }

    public void addnewContact(String amount, String description) throws Exception {
        WebElement toAccount = findElement(txtToAccount);

        String debittoaccount = selectUsingIndex(toAccount, 6);


        Thread.sleep(2000);

        clickElement(txtAmountBatch);

        enterKeys(txtAmountBatch, amount);

        WebElement AmountBatch2 = findElement(txtAmountBatch);

        String debitamount = AmountBatch2.getAttribute("value");


        WebElement theirDescriptionBatch = findElement(txtTheirDescriptionBatch);

        clickElement(txtTheirDescriptionBatch);

        Thread.sleep(2000);

        enterKeys(txtTheirDescriptionBatch, description);

        String theirDebitdes = theirDescriptionBatch.getAttribute("value");


        clickElement(txtaddNewcontact);


    }

    public void creditBatchNewContact(String Amt1, String Descr1, String Amt2, String Descr2, String org) throws Exception {

        clickElement(txtBatch);
        clickElement(txtNewBatch);
        clickElement(txtCredit);
        WebElement NecContact = findElementClickable(txtNewcontctBatch);
        int Repeatt = 0;
        while (Repeatt <= 5) {
            try {
                WebElement NewContact = findElementClickable(txtNewcontctBatch);
                NewContact.click();
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            Repeatt++;
        }
        WebElement NewContact = findElementClickable(txtNewcontctBatch);
        NewContact.click();

        Thread.sleep(1000);
        int Repeat = 0;
        while (Repeat <= 5) {
            try {
                WebElement sourceAccount = findElementClickable(txtSourceAccount);
                sourceAccount.click();
                //actions(sourceAccount);

                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            Repeat++;
        }
        String sourceaccount = "";
        int Rep = 0;
        while (Rep <= 5) {

            try {
                WebElement sourceAccount = findElement(txtSourceAccount);
                sourceaccount = selectUsingIndex(sourceAccount, 1);
                sourceaccount=sourceaccount.substring(19,28);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            Rep++;
        }
        //String source = sourceaccount.substring(19, 28);
        WebElement sourceAccount = findElement(txtSourceAccount);


        //Thread.sleep(1000);
        //sourceaccount = sourceaccount.substring(19, 28);
        clickElement(txtOrganization);


        int Reptt = 0;
        while (Reptt <= 5) {

            try {
                WebElement organization = findElementClickable(txtOrganization);
                actions(organization);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            Reptt++;
        }
        Thread.sleep(1000);
        int Reptet = 0;
        while (Reptet <= 5) {

            try {
                WebElement organization = findElementClickable(txtOrganization);

                organization.sendKeys(org);
                Thread.sleep(500);

                String orgName = organization.getAttribute("value");
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            Reptet++;
        }


        clickElement(txtDescriptionCredit);

        //	Thread.sleep(1000);
        int rep = 0;
        while (rep <= 5) {

            try {
                WebElement batchDescription1 = findElementClickable(txtDescriptionCredit);
                batchDescription1.click();
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            rep++;
        }
        Thread.sleep(500);
        int rept = 0;
        while (rept <= 5) {

            try {
                WebElement batchDescription1 = findElementClickable(txtDescriptionCredit);
                enterKeys(batchDescription1, Descr1);
                String batchCreditDes = batchDescription1.getAttribute("value");
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            rept++;
        }


        addAccountNewCredit1(Amt1);

        WebElement TxtNewcontctBatcht = findElementClickable(txtNewcontctBatch);
        actions(TxtNewcontctBatcht);
        Thread.sleep(500);
        int reptt = 0;
        while (reptt <= 10) {

            try {

                WebElement TxtNewcontctBatch = findElementClickable(txtNewcontctBatch);
                clickElementUsingJavaScript(TxtNewcontctBatch);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            reptt++;
        }

        addAccountNewCredit2(Amt1);

        WebElement total = findElement(txtCreditTotal);
        String CreditAmount1 = total.getText();
        WebElement DateBatchPay = findElementClickable(dateBatchPay);
        String date = DateBatchPay.getAttribute("value");
        //Thread.sleep(2000);

        WebElement FROMAccountt = findElementClickable(txtSourceAccount);
        Select selectt = new Select(FROMAccountt);
        WebElement firstoption = selectt.getOptions().get(0);
        if (firstoption.isSelected()) {
            WebElement FROMAccount = findElementClickable(txtSourceAccount);
            Select Sele = new Select(FROMAccount);
            Sele.selectByIndex(1);
        }


        clickElement(txtContinue);
        T24homepage Th = new T24homepage();
        Th.setProperty("TotalamountCreditbatch", CreditAmount1);
        Th.setProperty("batchCreditSourceAccount", sourceaccount);
        Th.setProperty("batchCreditDescription", Descr1);
        Th.setProperty("BatchCreditpostingdate", date);
    }


    public void addAccountNewCredit2(String amount) throws Exception {
        /*
         * WebElement toAccount=element(txtToAccount); Select s2=new
         * Select(toAccount); s2.selectByIndex(2); ;
         */
        WebElement batchAcctName = findElementClickable(txtacctNameBatch);
        batchAcctName.click();
        //Thread.sleep(4000);
        WebElement batchAcctName1 = findElementClickable(txtacctNameBatch);
        batchAcctName1.sendKeys("Sini");

        WebElement batchAcctNum = findElementClickable(txtacctNumberBatch);
        batchAcctNum.click();

        //WebElement batchAcctNum1 = findElement(txtacctNumberBatch);
        //batchAcctNum1.clear();
        WebElement batchAcctNum2 = findElementClickable(txtacctNumberBatch);
        batchAcctNum2.sendKeys("167543211");
        // WebElement batchAcctNum2=element(txtacctNumberBatch);
        // batchAcctNum2.sendKeys("112345671");
        WebElement batchBSBNum = findElementClickable(txtBSBBatch);
        batchBSBNum.click();
        //WebElement batchBSBNum2 = findElement(txtBSBBatch);
        //batchBSBNum2.clear();
        WebElement batchBSBNum1 = findElementClickable(txtBSBBatch);
        batchBSBNum1.sendKeys("806043");
        WebElement AmountBatch = findElementClickable(txtAmountBatch1);
        AmountBatch.click();
        Thread.sleep(1000);
        WebElement AmountBatch1 = findElementClickable(txtAmountBatch1);
        AmountBatch1.sendKeys(amount);
        WebElement theirDescriptionBatch1 = findElementClickable(txtTheirDescriptionCreditBatch1);
        // JavascriptExecutor je = (JavascriptExecutor) driver;
        theirDescriptionBatch1.click();

        //WebElement theirDescriptionBatch2 = findElement(txtTheirDescriptionCreditBatch1);
        //theirDescriptionBatch2.clear();

        WebElement theirDescriptionBatch3 = findElementClickable(txtTheirDescriptionCreditBatch1);
        theirDescriptionBatch3.sendKeys("Automation Test 2");
        // je.executeScript("arguments[0].value=description",theirDescriptionBatch);
        // theirDescriptionBatch.sendKeys(description);

        WebElement addContactBatch = findElementClickable(txtaddNewcontact);
        addContactBatch.click();
    }


    public void payNowMessageCredit(String dAccount, String calendar, String template, String org, String description,
                                    String totalAmt) throws Exception {


        WebElement actualText = findElement(txtVerification);
        String actualVerification = actualText.getText();
        String expectedVerification = "Your batch payment has been created and is awaiting approval before being processed";
        if (actualVerification.equals(expectedVerification)) {
            System.out.println("Batch payment for saved done");
            log.info("Batch Payment for saved template is done");
            //tb.logExtentReport("Batch Payment for saved template is done");
        }

        WebElement fAccount = findElement(txt_sourceAccount);
        String actualfAccount = fAccount.getText();
        if (dAccount.contains(actualfAccount)) {
            log.info("Batch Template payment:-Verified destination account from Pay now confirmation page");
            // tb.logExtentReport("Batch Template payment:-Verified destination account from Pay now confirmation page");
        }
        WebElement pDate = findElement(txt_postingDate);
        String postingDate = pDate.getText();

        WebElement organization = findElement(txt_Organization);
        String actualOrganization = organization.getText();
        if (actualOrganization.equals(org)) {
            log.info("Batch Template payment:-Verified the organization from Pay now confirmation page");
            //tb.logExtentReport("Batch Template payment:-Verified the organization from Pay now confirmation page");
        }

        WebElement totalamount = findElement(txt_totalAmount);
        String totalAmount = totalamount.getText();
        if (totalAmount.equals(totalAmt)) {
            log.info("Batch Template payment:-Verified the Amount from Pay now confirmation page");
            // tb.logExtentReport("Batch Template payment:-Verified the Amount from Pay now confirmation page");
        }
        WebElement descriptionBatch = findElement(txt_Description);
        String actualDes = descriptionBatch.getText();
        if (actualDes.equals(description)) {
            log.info("Batch Template payment:-Verified the description from Pay now confirmation page");
            //tb.logExtentReport("Batch Template payment:-Verified the description from Pay now confirmation page");
        }


    }

    public void addAccountNewCredit1(String amount) throws Exception {

        clickElement(txtacctNameBatch);

        //Thread.sleep(1000);

        WebElement batchAcctName1 = findElementClickable(txtacctNameBatch);
        batchAcctName1.click();
        enterKeys(batchAcctName1, "Ruskin");
        Thread.sleep(1000);
        WebElement TxtacctNumberBatch = findElementClickable(txtacctNumberBatch);
        int Repeat = 0;
        while (Repeat <= 5) {

            try {
                actions(TxtacctNumberBatch);
                //clickElement(txtacctNumberBatch);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            Repeat++;
        }
        Thread.sleep(1000);
        //clickElement(txtacctNumberBatch);

        //Thread.sleep(3000);

        WebElement batchAcctNum2 = findElementClickable(txtacctNumberBatch);
        enterKeys(txtacctNumberBatch, "12345678");
        Thread.sleep(1000);
        WebElement TxtBSBBatch = findElementClickable(txtBSBBatch);
        actions(TxtBSBBatch);

        //clickElement(txtBSBBatch);


        //Thread.sleep(4000);

        WebElement batchBSBNum1 = findElementClickable(txtBSBBatch);

        enterKeys(batchBSBNum1, "806043");

        clickElement(txtAmountBatch1);

        //Thread.sleep(2000);

        WebElement AmountBatch1 = findElementClickable(txtAmountBatch1);
        int Rep = 0;
        while (Rep <= 5) {

            try {
                WebElement AmountBatch = findElementClickable(txtAmountBatch1);
                AmountBatch.click();
                //clickElement(txtAmountBatch1);

                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            Rep++;
        }
        Thread.sleep(1000);
        int Rept = 0;
        while (Rept <= 5) {

            try {
                WebElement AmountBatchh = findElementClickable(txtAmountBatch1);
                AmountBatchh.sendKeys(amount);
                //enterKeys(AmountBatch1,amount);

                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            Rept++;
        }
        //enterKeys(AmountBatch1,amount);

        clickElement(txtTheirDescriptionCreditBatch1);

        //Thread.sleep(2000);

        WebElement theirDescriptionBatch2 = findElementClickable(txtTheirDescriptionCreditBatch1);

        enterKeys(txtTheirDescriptionCreditBatch1, "Automation Test 1");


        clickElement(txtaddNewcontact);

        //Thread.sleep(2000);

    }


    public void continueMessageBatchCredit(String dAccount, String calendar, String template, String org, String description,
                                           String totalAmt) throws Exception {

        clickElement(txtpayNow);
        //Thread.sleep(4000);

        WebElement fAccount = findElement(txt_sourceAccount);
        String actualfAccount = fAccount.getText();
        if (dAccount.contains(actualfAccount)) {
            log.info("Verified destination account from Pay now confirmation page");
            //tb.logExtentReport("Verified destination account from Pay now confirmation page");
        }
        /*
         * WebElement pDate=element(txt_postingDate); String
         * postingDate=pDate.getText(); if(calendar.equals(postingDate)) { log.
         * info("Batch Template payment:-Verified Posting date from Pay now confirmation page"
         * );
         * tb.logExtentReport("Batch Template payment:-Verified Posting date from Pay now confirmation page"
         * ); }
         */

        else if (template == "Pay 100") {
            WebElement templateBatch = findElement(txt_template);
            String Actualtemplate = templateBatch.getText();
            if (Actualtemplate.equals(template)) {
                log.info("Batch Template payment:-Verified the template from Pay now confirmation page");
                // tb.logExtentReport("Batch Template payment:-Verified the template from Pay now confirmation page");
            }
        }
        WebElement organization = findElement(txt_Organization);
        String actualOrganization = organization.getText();
        if (actualOrganization.contains(org)) {

            log.info("Verified the organization from Pay now confirmation page");
            //tb.logExtentReport("Verified the organization from Pay now confirmation page");
        }
        WebElement totalamount = findElement(txt_totalAmount);
        String totalAmount = totalamount.getText();
        if (totalAmount.equals(totalAmt)) {
            log.info("Verified the Amount from Pay now confirmation page");
            //tb.logExtentReport("Verified the Amount from Pay now confirmation page");
        }
        WebElement descriptionBatch = findElement(txt_Description);
        String actualDes = descriptionBatch.getText();
        if (actualDes.contains(description)) {
            log.info("Verified the description from Pay now confirmation page");
            //tb.logExtentReport("Verified the description from Pay now confirmation page");
        }

    }


    public void authFunctionsInternalView(String expectedAmount1, String expectedDescription1, WebDriver driver) throws Exception {
        Thread.sleep(1000);
        this.driver = driver;
        for (int i = 1; i <= 20; i++) {
            String actualAmount =
                    findElement(By.xpath("//table/tbody/tr[" + i + "]/td[3]")).getText();
            System.out.println(actualAmount + " is actual result");
            System.out.println(expectedAmount1 + "is expected result");

            if (actualAmount.contains(expectedAmount1)) {

                WebElement a = findElement(By.xpath(" //*[@id='C1__BUT_AA2928C2FD53379E166650_R" + i + "']"));
                actions(a);
                break;
            }

        }


    }

    public void BatchpaymentVerifyCredit(String Destacnt, String postingdate, String description, String amount) {
        WebElement SourceAccnt = findElement(sourceacntBatch);
        String sourceAccnt = SourceAccnt.getText();
        WebElement PostingdateBatch = findElement(postingdateBatch);
        String postingdateBatchh = PostingdateBatch.getText();
        WebElement descriptionBatch = findElement(DescriptionBatch);
        String DescriptionBatchh = descriptionBatch.getText();
        WebElement amountBatch = findElement(AmountBatch);
        String AmountBatch = amountBatch.getText();

        Assert.assertTrue(sourceAccnt.contains(Destacnt) & postingdateBatchh.contains(postingdate) & DescriptionBatchh.contains(description) & AmountBatch.contains(amount));

        WebElement Paynow = findElement(paynow);
        Paynow.click();
    }

    public void BatchpaymentVerify(String Destacnt, String postingdate, String description, String amount) {
        WebElement DestacntBatch = findElement(DestinationacntBatch);
        String DestinationAccnt = DestacntBatch.getText();
        WebElement PostingdateBatch = findElement(postingdateBatch);
        String postingdateBatchh = PostingdateBatch.getText();
        WebElement descriptionBatch = findElement(DescriptionBatch);
        String DescriptionBatchh = descriptionBatch.getText();
        WebElement amountBatch = findElement(AmountBatch);
        String AmountBatch = amountBatch.getText();

        Assert.assertTrue(DestinationAccnt.contains(Destacnt) & postingdateBatchh.contains(postingdate) & DescriptionBatchh.contains(description) & AmountBatch.contains(amount));

        WebElement Paynow = findElement(paynow);
        Paynow.click();
    }

    public void CreditBatchReviewpaymentVerify(String SourceAcnt, String postingdate, String description, String amount) throws Exception {
        WebElement SourceAccnt = findElement(sourceacntBatch);
        String sourceAccnt = SourceAccnt.getText();
        WebElement PostingdateBatch = findElement(postingdatereviewbath);
        String postingdateBatchh = PostingdateBatch.getText();
        WebElement descriptionBatch = findElement(DescriptionBatchreview);
        String DescriptionBatchh = descriptionBatch.getText();
        WebElement amountBatch = findElement(AmountReviewBatch);
        String AmountBatch = amountBatch.getText();
        amount = amount.replace("$", "");
        Assert.assertTrue(sourceAccnt.contains(SourceAcnt) & postingdateBatchh.contains(postingdate) & DescriptionBatchh.contains(description) & AmountBatch.contains(amount));
        WebElement Returntobatchpayments = findElement(returntobatchpayments);
        actions(Returntobatchpayments);
        //  Returntobatchpayments.click();
    }

    public void BatchReviewpaymentVerify(String Destacnt, String postingdate, String description, String amount) throws Exception {
        WebElement DestinationAcnt = findElement(DestinationacntBatch);
        String destacntt = DestinationAcnt.getText();
        WebElement PostingdateBatch = findElement(postingdatereviewbath);
        String postingdateBatchh = PostingdateBatch.getText();
        WebElement descriptionBatch = findElement(DescriptionBatchreview);
        String DescriptionBatchh = descriptionBatch.getText();
        WebElement amountBatch = findElement(AmountReviewBatch);
        String AmountBatch = amountBatch.getText();
        amount = amount.replace("$", "");
        Assert.assertTrue(destacntt.contains(Destacnt) & postingdateBatchh.contains(postingdate) & DescriptionBatchh.contains(description) & AmountBatch.contains(amount));
        WebElement Returntobatchpayments = findElement(returntobatchpayments);
        actions(Returntobatchpayments);
        //  Returntobatchpayments.click();
    }


    public void sessionHistory() throws Exception {
        // gotoAccount.click();


        clickElement(txt_manage);
        clickElement(txt_session);


        //tb.logExtentReport("Clicked on Session button ");
        log.info("Session button clicked");

        clickElement(txt_sessionCheck);


        String session1 = findElement(By.xpath("//*[@id='C1__BUT_72DC497369011F2F319589_R1']")).getText();

        String session2 = findElement(By.xpath("//*[@id='C1__QUE_72DC497369011F2F318997_R1_1']")).getText();
        System.out.println(session2);
        System.out.println(session2.substring(11, 16) + "%%%%%%%%%");
        if (session1.equals(session2)) {
            System.out.println("Last login time displayed successfully");
            // tb.logExtentReport("Last login time displayed successfully");

        }

        String session = findElement(By.xpath("//*[@id='p1_HEAD_2C6929C1E459C57F104500']/div/span[1]")).getText();
        System.out.println(session.substring(59, 64) + "^^^^^^^^^^^^^^^");
        String a = session2.substring(11, 16);
        String b = session.substring(59, 64);

        //Assert.assertEquals(a,b);


    }

    public static HashMap<String, String> singlesignonmap;

    public void clientnumberIBM() {
        singlesignonmap = new HashMap<>();

        WebElement nameIBM = findElement(NameIBM);
        String Name = nameIBM.getText();
        String clientnumberone = Name.replace("Short.Name", "");
        singlesignonmap.put("Clientnumber0ne", clientnumberone);
        WebElement Clientnumtwo = findElement(clientnum2);
        scrollIntoView(Clientnumtwo);
        String clientnumbertwoo = findElement(clientnum2).getText();
        singlesignonmap.put("Clientnumber2", clientnumbertwoo);
        String clientnumberthree = findElement(clientnum3).getText();
        singlesignonmap.put("Clientnumber3", clientnumberthree);

    }

    public int investfacilitiesCount(String customerid) throws Exception {
        //HomePageT24 hm = new HomePageT24(driver);
        //hm.commandline();
        //firstAcnttrnsactionnos;
        WebElement outerFrame = findElement(txtouterFrame);
        switchToDefault();
        switchToFrame(outerFrame);
        WebElement outerFrame1 = findElement(txtouterFrame2);
        switchToFrame(outerFrame1);
        WebElement outerFrame2 = findElement(txtouterFrame1);
        switchToFrame(outerFrame2);
        WebElement customerID = findElement(txtCustomerID);
        customerID.click();
        WebElement customerID1 = findElement(txtCustomerID);
        customerID1.clear();
        WebElement customerID2 = findElement(txtCustomerID);
        customerID2.sendKeys(customerid);
        WebElement find = findElement(txtFind);
        find.click();
        Thread.sleep(1000);
        WebElement details = findElementClickable(txtDetails);
        clickElementUsingJavaScript(details);
        // details.click();
        //actionsDouble(details);
        //actions(details);

        Thread.sleep(500);
        T24homepage th = new T24homepage();
        th.switchwindows();
        //switchToWindow(1);
        String title1 = getTitle();
        System.out.println(title1);
        th.windowMaximize();
        windowMaximize();
        waitForByElement(By.xpath("//*[text()='Account Overview']"));
        int size = findElements(By.xpath("//*[text()='Account Overview']")).size();
        int size2 = findElements(By.xpath("//*[text()='Deposit Overview']")).size();
        int totaltranasctions = size + size2;
        int firstAcnttrnsactionnos = totaltranasctions;

        // IBHomePage.singlesignonmap.put("firstAcnttrnsactionnos",firstAcnttrnsactionnos);
        return firstAcnttrnsactionnos;


    }


    public void retrieveClient(String subId) throws Exception {

        WebElement ClientMaintenance = findElement(clientmaaintenance);
        ClientMaintenance.click();
        WebElement SubIdField = findElement(subIdField);
        SubIdField.click();
        SubIdField.sendKeys(subId);
        Thread.sleep(1000);
        WebElement Retrieve = findElement(retrieve);
        int repeat = 0;
        while (repeat <= 35) {

            try {
                Thread.sleep(500);
                WebElement Retrieve1 = findElementClickable(retrieve);
                doubleClick(Retrieve);
                // Retrieve1.click();


                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeat++;
        }
    }

    public void accountSelection(String accountnumber1, String accountcount1, String accountnumber2, String accountcount2, String accountnumber3, String accountcount3) throws Exception {
        int acntcount1 = Integer.parseInt(accountcount1);
        int acntcount2 = Integer.parseInt(accountcount2);
        int acntcount3 = Integer.parseInt(accountcount3);


        WebElement UserAccount = findElementClickable(drp_userAccount);
        Select sl = new Select(UserAccount);
        sl.selectByValue(accountnumber1);
        Thread.sleep(500);
        int size1 = findElements(By.xpath("//*[text()='Recent transactions']")).size();
        assertEquals(acntcount1, size1);
        WebElement UserAccount2 = findElementClickable(drp_userAccount);
        actions(UserAccount2);
        //UserAccount2.click();
        Thread.sleep(1000);
        int rep = 0;
        while (rep <= 20) {

            try {
                Thread.sleep(500);
                sl.selectByValue(accountnumber2);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            rep++;
        }

        //sl.selectByValue(accountnumber2);
        Thread.sleep(8000);
        int size2 = findElements(By.xpath("//*[text()='Recent transactions']")).size();
        assertEquals(acntcount2, size2);
        WebElement UserAccount1 = findElementClickable(drp_userAccount);
        //UserAccount1.click();
        int reptt = 0;
        while (reptt <= 20) {

            try {

                doubleClick(UserAccount1);
                UserAccount1.click();

                Thread.sleep(500);

                String accountnum3 = "'" + accountnumber3 + "'";

                By accnt3 = By.xpath("//*[contains(text(),'Org')and contains(text()," + accountnum3 + ")]");
                WebElement accountno3 = findElement(accnt3);
                accountno3.click();
                //scrollIntoViewAndClick(accountno3);
//			Select s2=new Select(UserAccount);
//			s2.selectByIndex(3);
                //sl.selectByValue(accountnumber3);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            reptt++;
        }
        Thread.sleep(5000);
        int size3 = findElements(By.xpath("//*[text()='Recent transactions']")).size();
        //	assertEquals(accountcount3, size3);
    }


    public void singleSignonDrpdown(String user1, String user2, String user3) {

        WebElement UserAccount = findElement(drp_userAccount);
        UserAccount.click();
        By singlesignonBox = By.xpath("//*[@aria-label='EntityCustomer']");

        List<String> values = new ArrayList<String>();
        List<String> texts = new ArrayList<String>();
        List<WebElement> options = UserAccount.findElements(drp_userAccount);
        for (WebElement option : options) {
            //values.add(option.getAttribute("value"));
            texts.add(option.getText());
            System.out.println(texts);


            String delim = "-";

            StringBuilder sb = new StringBuilder();

            int i = 0;
            while (i < texts.size() - 1) {
                sb.append(texts.get(i));
                sb.append(delim);
                i++;
            }
            sb.append(texts.get(i));

            String res = sb.toString();


            Assert.assertTrue(res.contains(user1) && res.contains(user2) && res.contains(user3));

        }
    }

    public void batchPaymentsFailureForAccount(String path, String becid) throws Exception {
        int repeat = 0;
        while (repeat <= 3) {
            try {
                WebElement batch = findElement(txtBatch);
                actions(batch);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeat++;
        }
        WebElement newBatch = findElement(txtNewBatch);
        actions(newBatch);
        //newBatch.click();
        int repet = 0;
        while (repet <= 20) {

            try {
                WebElement debitBatch = findElementClickable(txtDebit);
                actions(debitBatch);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repet++;
        }
        int repeaT = 0;
        while (repeaT <= 15) {

            try {
                WebElement destinationAccount = findElementClickable(txtdropdown);
                actions(destinationAccount);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeaT++;
        }
        String destinationAcoount1 = "";
        Thread.sleep(500);
        int rep = 0;
        while (rep <= 15) {

            try {
                WebElement destinationAccount = findElement(txtdropdown);

                Select sl = new Select(destinationAccount);
                List<WebElement> accountsRes = sl.getOptions();
                destinationAcoount1 = accountsRes.get(1).getText();
                //batchPaymentsDebitFile.add(0,accountsRes.get(2).getText());

                sl.selectByIndex(1);

                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            rep++;
        }
        Thread.sleep(1000);
        WebElement destinationAccount1 = findElementClickable(txtdropdown);
        destinationAccount1.click();
        WebElement destinationAccount2 = findElement(txtdropdown);
        String desAccount = destinationAccount2.getText();
        int Repeat = 0;
        while (Repeat <= 5) {

            try {
                WebElement becID = findElementClickable(txtBecID);
                actions(becID);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            Repeat++;
        }
        Thread.sleep(500);
        //WebElement becID = findElementClickable(txtBecID);
        int Rep = 0;
        while (Rep <= 5) {

            try {
                WebElement becID = findElementClickable(txtBecID);
                becID.clear();
                becID.sendKeys(becid);
                break;
            } catch (StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            Rep++;
        }
        WebElement batchCalendar = findElementClickable(txtBatchCalendar);
        actions(batchCalendar);
        WebElement batchCalendar1 = findElementClickable(txtBatchCalendar);
        String calendarText = batchCalendar1.getAttribute("value");
        clickElement(txtFile);
        WebElement upload = findElementClickable(txtUpload);
        upload.sendKeys(path);
        WebElement uploadFile = findElement(txt_Upload);
        actions(uploadFile);
        boolean b = findElement(By.xpath("(//input[@type='text'])[3]")).isDisplayed();
        if (b == true) {

            //tb.logExtentReport("PASS:-File is uploaded successfiully");
        } else {
            //tb.logExtentReport("FAIL:-File is not uploaded successfiully");
        }

        WebElement FROMAccountt = findElementClickable(txtdropdown);
        Select selectt = new Select(FROMAccountt);
        WebElement firstoption = selectt.getOptions().get(0);
        if (firstoption.isSelected()) {
            WebElement FROMAccount = findElementClickable(txtdropdown);
            Select Sele = new Select(FROMAccount);
            Sele.selectByIndex(1);
        }
        WebElement batchContinue = findElementClickable(txtContinue);
        scrollIntoView(batchContinue);
        Thread.sleep(500);
        //batchContinue.click();
        scrollIntoView(batchContinue);
        clickElementUsingJavaScript(batchContinue);
        WebElement batchPayNow = findElementClickable(txtpayNow);
        //batchPayNow.click();
        actions(batchPayNow);
        WebElement actualText = findElement(txtVerification);
        String actualVerification = actualText.getText();
        String expectedVerification = "Your batch payment has been created and is awaiting approval before being processed";
        if (actualVerification.equals(expectedVerification)) {
            log.info("File uploaded successfully");
            //tb.logExtentReport("File uploaded successfully");
        }

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

    public void ibManagerReportingAllBatch() throws Exception {
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
        s2.selectByIndex(0);
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

    public String ibmReportingTable() {
        String status = "Not Posted";
        String message = null;
        for (int i = 2; i <= 10; i++) {
            String statusText = findElement(By.xpath("(//*[@id='BatchList1_gvBatchList_ctl02_gvBatchDetails']/tbody/tr[" + i + "]/td[7])[2]")).getText();
            Assert.assertTrue(statusText.contains(status));
            {
                message = findElement(By.xpath("(//*[@id='BatchList1_gvBatchList_ctl02_gvBatchDetails']/tbody/tr[" + i + "]/td[8])[2]")).getText();
                System.out.println(message);
                break;
            }

        }

        return message;
    }

    public String ibmReportingTablePosted() {
        String status = "Open";
        String message = null;
        for (int i = 2; i <= 10; i++) {
            String statusText = findElement(By.xpath("(//*[@id='BatchList1_gvBatchList_ctl02_gvBatchDetails']/tbody/tr[" + i + "]/td[7])[2]")).getText();
            Assert.assertTrue(statusText.contains(status));
            {
                message = findElement(By.xpath("(//*[@id='BatchList1_gvBatchList_ctl02_gvBatchDetails']/tbody/tr[" + i + "]/td[8])[2]")).getText();
                System.out.println(message);
                break;
            }

        }

        return message;
    }

    public void logoutIBM() throws Exception {
        WebElement logoutIBM = findElement(btnLogoutIBM);
        logoutIBM.click();

    }

    public void inboxForbsb(String amt, String expectedMsg1) throws Exception {

        WebElement messageIB = findElement(txtmessageIB);
        messageIB.click();
        ;
        for (int i = 1; i <= 10; i++) {
            String actualResult = findElement(By.xpath("//*[@id='C1__QUE_AB556F61CCADE6CD53311_R" + i + "']"))
                    .getText();
            String expectedResult = "Batch Processing Result";
            if (actualResult.equals(expectedResult)) {
                element(By.xpath("//*[@id='C1__BUT_158BD9B48FC22906290774_R" + i + "']")).click();
                ;
                String expectedMsg = "completed with the following errors:";
                //String expectedMsg1 = " FAILED -  T24-001:ID IN FILE MISSING, INPUT MISSING:destinationAccountBsb";
                String actualMsg = findElement(By.xpath("//*[@id='C1__QUE_9131B365DC0282A8306361_R1']"))
                        .getText();
                if (actualMsg.contains(expectedMsg)) {
                    log.info("Batch payment failed due to wrong input");
                    // tb.logExtentReport("Batch payment failed due to wrong input");
                    System.out.println("Batch payment failed due to wrong input");

                }

            }

            break;


        }


    }

    public void inboxVerification(String Subject, String amount, String Date) {
        for (int i = 1; i < 21; i++) {
            WebElement a = findElement(By.xpath("//table[contains(@id,'C1__TBL_AB556F61CCADE6CD53309')]//tbody//tr[" + i + "]//td[2]"));

            String subject = a.getText();
            if (subject.contains(Subject)) {
                WebElement b = findElement(By.xpath("//table[contains(@id,'C1__TBL_AB556F61CCADE6CD53309')]//tbody//tr[" + i + "]//td[5]"));
                b.click();
            }
            WebElement inboxmsg = findElement(By.xpath("//*[@id='C1__QUE_9131B365DC0282A8306361_R1']"));
            String msg = inboxmsg.getText();
            Assert.assertTrue(msg.contains(amount) & msg.contains(Date));
            break;
        }

    }

    public String getInvestmentdetails(String customerid) throws Exception {

        WebElement outerFrame = findElement(txtouterFrame);
        switchToDefault();
        switchToFrame(outerFrame);
        //Thread.sleep(2000);
        WebElement outerFrame1 = findElement(txtouterFrame2);
        switchToFrame(outerFrame1);
        WebElement outerFrame2 = findElement(txtouterFrame1);
        switchToFrame(outerFrame2);

        //windowMaximize();
        WebElement customerID = findElement(txtCustomerID);
        customerID.click();

        WebElement customerID1 = findElement(txtCustomerID);
        customerID1.clear();

        WebElement customerID2 = findElement(txtCustomerID);
        customerID2.sendKeys(customerid);

        WebElement find = findElement(txtFind);
        //find.click();
        actions(find);
        WebElement details = findElement(txtDetails);
        clickElementUsingJavaScript(details);
        Thread.sleep(100);
        switchwindows();
        String title1 = getTitle();
        System.out.println(title1);
        windowMaximize();
        WebElement account1 = findElement(txtAccount1);
        String exAccount1 = account1.getText();
        System.out.println(exAccount1);
        WebElement account2 = findElement(txtAccount2);
        String exAccount2 = account2.getText();
        WebElement amt1 = findElement(txtamt1);
        String exAmt1 = amt1.getText();
        WebElement amt2 = findElement(txtamt2);
        String exAmt2 = amt2.getText();
        int size = findElements(By.xpath("//*[text()='Account Overview']")).size();
        int size2 = findElements(By.xpath("//*[text()='Deposit Overview']")).size();
        int totaltranasctions = size + size2;

        String total = String.valueOf(totaltranasctions);

        System.out.println("size==" + size);
        return total;
    }


    public String verifyInvestmentDetailsReflected() {
        WebElement account1 = findElement(txtAccount1);
//    String exAccount1 = account1.getText();
        //  System.out.println(exAccount1);
//    WebElement account2 = findElement(txtAccount2);
//    String exAccount2 = account2.getText();
//    WebElement amt1 = findElement(txtamt1);
//    String exAmt1 = amt1.getText();
//    WebElement amt2 = findElement(txtamt2);
//    String exAmt2 = amt2.getText();
        int size1 = findElements(By.xpath("//*[text()='Recent transactions']")).size();
        String total = String.valueOf(size1);
        return total;
    }

    public void ibverify() {
        WebElement investmentandfcilities = findElement(By.xpath("(//span[text()='Investments, Facilities and Loans'])[1]"));
        String investmentfacilities = investmentandfcilities.getText();
        WebElement transactions = findElement(By.xpath("(//span[text()='Transactions'])[1]"));
        String Transactions = transactions.getText();
        WebElement estatements = findElement(By.xpath("(//span[text()='eStatements'])[1]"));
        String Estatements = estatements.getText();
        WebElement transferandpay = findElement(By.xpath("(//a[text()='Transfer & Pay'])[1]"));
        WebElement manage = findElement(By.xpath("(//a[text()='Manage'])[1]"));
        WebElement message = findElement(By.xpath("//*[text()='Message']"));
        WebElement Welcomemsg = findElement(By.xpath("//span[contains(text(),' Welcome to Uniting Online')]"));
        WebElement Myinvestments = findElement(By.xpath("(//*[contains(text(),'My Investments')])[1]"));
        List<WebElement> recenttransactions = findElements(By.xpath("//*[contains(text(),'Recent transactions')]"));
        Assert.assertTrue(recenttransactions.size() > 0);


        highlightUsingJs(transferandpay);
        highlightUsingJs(manage);
        highlightUsingJs(message);
        highlightUsingJs(message);


    }
    public void clientMaintenanceClick(){
        WebElement Returntomainmenu= findElement(By.xpath("//*[@id='cmdReturn']"));
        Returntomainmenu.click();
        WebElement clientmaintenanceButton= findElement(By.xpath("//*[@title='Client Maintenance']"));
        clientmaintenanceButton.click();
        WebElement Custnum= findElement(By.xpath("//*[@name='txtCustomerNo']"));
        Custnum.sendKeys("10007175");
        WebElement retrieve= findElement(By.xpath("//*[@name='cmdRetrieve']"));
        retrieve.click();
        WebElement quicklinks= findElement(By.xpath("//*[contains(text(),'Quick Links')]"));
        WebElement clientdetails= findElement(By.xpath("//*[contains(text(),'Client Details')]"));
        WebElement memberdetails= findElement(By.xpath("//*[contains(text(),'Member Details')]"));

    }
    public static void copytoWord2() {
        String folderPath = "D:\\frameium\\Frameium_allure\\ExtentReportsnew";  // Path to the folder containing PNG images

        // Create a new Word document
        XWPFDocument doc = new XWPFDocument();

        // Add a title to the document
        XWPFParagraph title = doc.createParagraph();
        title.createRun().setText("Environmental health checkup ");

        // Get all PNG files from the folder
        File folder = new File(folderPath);
        File[] imageFiles = folder.listFiles((dir, name) -> name.toLowerCase().endsWith(".png"));

        if (imageFiles != null && imageFiles.length > 0) {
            // Sort the image files by last modified date in ascending order (oldest first)
            Arrays.sort(imageFiles, (f1, f2) -> Long.compare(f1.lastModified(), f2.lastModified()));

            // Iterate through each PNG image file and insert it into the Word document
            for (File imageFile : imageFiles) {
                try {
                    // Create a new paragraph for each image
                    XWPFParagraph paragraph = doc.createParagraph();
                    XWPFRun run = paragraph.createRun();
                    String name = imageFile.getName();
                    name = name.replaceAll(".png", "");
                    run.setText("" + name); // Add text description for each image

                    // Read the image to get its original dimensions
                    BufferedImage bufferedImage = ImageIO.read(imageFile);
                    int originalWidth = bufferedImage.getWidth();
                    int originalHeight = bufferedImage.getHeight();

                    // Set desired maximum width for the image
                    int maxWidth = 500;
                    int newWidth = maxWidth;
                    int newHeight = (int) ((double) originalHeight / originalWidth * maxWidth);

                    // Resize the image (optional step if you're reducing the size)
                    BufferedImage resizedImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
                    Graphics2D g2d = resizedImage.createGraphics();
                    g2d.drawImage(bufferedImage, 0, 0, newWidth, newHeight, null);
                    g2d.dispose(); // Release the graphics context

                    // Flush the original image after resizing to release memory
                    bufferedImage.flush();

                    // Now write the resized image to the Word document
                    try (FileInputStream imageStream = new FileInputStream(imageFile)) {
                        run.addPicture(imageStream, XWPFDocument.PICTURE_TYPE_PNG, imageFile.getName(),
                                Units.toEMU(newWidth), Units.toEMU(newHeight));  // Resize image based on aspect ratio
                    } catch (Exception e) {
                        System.err.println("Error inserting image into Word document: " + imageFile.getName());
                        e.printStackTrace();
                    }
                } catch (IOException e) {
                    System.err.println("Error reading image: " + imageFile.getName());
                    e.printStackTrace();
                }
            }

            // Save the Word document
            String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
            String outputFileName = "images_report_" + timestamp + ".docx"; // Ensure the file extension is .docx

            try (FileOutputStream outStream = new FileOutputStream(outputFileName)) {
                doc.write(outStream);
                System.out.println("Word document created successfully with images.");
            } catch (IOException e) {
                System.err.println("Error saving Word document.");
                e.printStackTrace();
            }
        } else {
            System.out.println("No PNG images found in the specified folder.");
        }
    }
    public static void copytoWord() {
        {
            String folderPath = "D:\\frameium\\Frameium_allure\\ExtentReportsnew";  // Path to the folder containing PNG images

            // Create a new Word document
            XWPFDocument doc = new XWPFDocument();

            // Add a title to the document
            XWPFParagraph title = doc.createParagraph();
            title.createRun().setText("Environmental health checkup ");

            // Get all PNG files from the folder
            File folder = new File(folderPath);
            File[] imageFiles = folder.listFiles((dir, name) -> name.toLowerCase().endsWith(".png"));

            if (imageFiles != null && imageFiles.length > 0) {
                // Iterate through each PNG image file and insert it into the Word document
                for (File imageFile : imageFiles) {
                    try {
                        // Create a new paragraph for each image
                        XWPFParagraph paragraph = doc.createParagraph();
                        XWPFRun run = paragraph.createRun();
                        String name=imageFile.getName();
                        name=name.replaceAll(".png","");
                        run.setText("" +name); // Add text description for each image

                        // Read the image to get its original dimensions
                        BufferedImage bufferedImage = ImageIO.read(imageFile);
                        int originalWidth = bufferedImage.getWidth();
                        int originalHeight = bufferedImage.getHeight();

                        // Set desired maximum width for the image
                        int maxWidth = 500;
                        int newWidth = maxWidth;
                        int newHeight = (int) ((double) originalHeight / originalWidth * maxWidth);

                        // Resize the image (optional step if you're reducing the size)
                        BufferedImage resizedImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
                        Graphics2D g2d = resizedImage.createGraphics();
                        g2d.drawImage(bufferedImage, 0, 0, newWidth, newHeight, null);
                        g2d.dispose(); // Release the graphics context

                        // Flush the original image after resizing to release memory
                        bufferedImage.flush();

                        // Now write the resized image to the Word document
                        try (FileInputStream imageStream = new FileInputStream(imageFile)) {
                            run.addPicture(imageStream, XWPFDocument.PICTURE_TYPE_PNG, imageFile.getName(),
                                    Units.toEMU(newWidth), Units.toEMU(newHeight));  // Resize image based on aspect ratio
                        } catch (Exception e) {
                            System.err.println("Error inserting image into Word document: " + imageFile.getName());
                            e.printStackTrace();
                        }
                    } catch (IOException e) {
                        System.err.println("Error reading image: " + imageFile.getName());
                        e.printStackTrace();
                    }
                }

                // Save the Word document
                String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
                String outputFileName = "images_report_" + timestamp + ".docx"; // Ensure the file extension is .docx

                try (FileOutputStream outStream = new FileOutputStream(outputFileName)) {
                    doc.write(outStream);
                    System.out.println("Word document created successfully with images.");
                } catch (IOException e) {
                    System.err.println("Error saving Word document.");
                    e.printStackTrace();
                }
            } else {
                System.out.println("No PNG images found in the specified folder.");
            }
        }}}



