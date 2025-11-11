package com.frameium.pageobject.UFS;

import com.frameium.genericfunctions.GenericFunctions;
import com.frameium.logger.LoggerHelper;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class AuthorizationIB extends GenericFunctions {



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
    By btn_calendar=By.xpath("(//*[@alt='Calendar'])[1]");
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


    By txt_AccountNumber = By.xpath("//*[@id='C1__QUE_827F64A8625A533580054']");
    By txt_AccountName= By.xpath("//*[@id='C1__QUE_26DDCC1E1D82836A1676519']");

    By txt_biilerCrnCode= By.xpath("//*[@id='C1__QUE_111378B239E4F5C7587356']");
    By txt_biilerName= By.xpath("//*[@id='C1__QUE_76259CB21CAFB723348862']");

    By btn_continue= By.xpath("//*[@id='C1__BUT_27856426A56528BF2293066']");

    By btn_gotoAccount= By.xpath("//*[@id='C1__BUT_4460EA5C365F6A49155041']");



    By txt_userAccount= By.xpath("//*[@id='C3__QUE_B98A13A114FA087C32581']");
    By drp_userAccount= By.xpath("//*[@id='QUE_A97A225C708C1E9F291992']");
    By txt_userAccount1= By.xpath("//*[@id='C8__row_QUE_B98A13A114FA087C32581']");
    By txt_userAccount2= By.xpath("//*[@id='C9__row_QUE_B98A13A114FA087C32581']");
    By txt_userAccount3= By.xpath("//*[@id='C10__row_QUE_B98A13A114FA087C32581']");
    By txt_userAccount4= By.xpath("//*[@id='C6__row_QUE_B98A13A114FA087C32581']");
    By txt_userAccount5= By.xpath("//*[@id='C13__row_QUE_B98A13A114FA087C32581']");
    By txt_userAccount6= By.xpath("//*[@id='C7__row_QUE_B98A13A114FA087C32581']");
    By txt_userAccount7= By.xpath("//*[@id='C8__QUE_9133748334BF25F7405136']");
    By txt_inbox= By.xpath("//*[@id='BUT_54FA2383E897E37F329341']/span");
    By txt_inbox_User_view= By.xpath("//*[@id='C1__BUT_158BD9B48FC22906290774_R1']");
    By txt_inbox_User_view1= By.xpath("//*[@id='C1__BUT_158BD9B48FC22906290774_R2']");
    //*[@id='C1__BUT_158BD9B48FC22906290774_R2']
    By txt_inbox_User_viewMsg= By.xpath("//*[@id='C1__QUE_9131B365DC0282A8306361_R1']");

    By txt_inbox_User_viewMsg1= By.xpath("//*[@id='C1__QUE_9131B365DC0282A8306361_R1']");

    By txt_userAccount8= By.xpath("//*[@id='C16__QUE_9133748334BF25F7405136']");

    By txt_NickName= By.xpath("//*[@name='C1__LOCALPAYEE[1].NEWPAYEENICKNAME']");
    By txtdropDownExternal = By.xpath("(//*[contains(@id,'C1__QUE_FE87')])[1]");
    By txtpayAnyone = By.xpath("//span[text()='Pay anyone']");
    By txtselectValueExternal = By.xpath("(//*[contains(@id,'C1__QUE_5DFE1')])[4]");
    By txtexternalAmount = By.xpath("//*[@name='C1__MAKEPAYMENT[1].TRANSACTIONAMOUNT']");
    By txtmyDescription = By.xpath("//*[@name='C1__MAKEPAYMENT[1].PAYMENTREFERENCE']");
    By txttheirDescription = By.xpath("//input[@id='C1__QUE_34095685F494875F305308']");
    //By txtcontinueButton = By.xpath("//*[@value='Continue']");

    By txtcontinueButton = By.xpath("//*[@id='C1__BUT_5DFE13BF59422EAF6991']");

    By accountNum=By.xpath("//*[contains(@name,'value:1:1:1')]");
    By txt_amountEFT=By.xpath("//span[text()='Amount']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_')]");
    By txt_theirDesEFT=By.xpath("//span[text()='Their Description']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_')]");
    By txtReturnToAuth = By.xpath("//button[@title='Return to authorisations']");
    By nextpage=By.xpath("//a[@title='Next Page']");
    By nextpageMsg=By.xpath("//*[@aria-label='Next page']");
    By next_page=By.xpath("//*[@id='C1__ANCHOR_TABLE_8FC336E4FF60A39A_FormTable_87_PAG_BOTTOM_2']");

    By txtTacoount = By
            .xpath("//span[text()='To']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_BA')]");
    By txtVerifyamount = By
            .xpath("//span[text()='Amount']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE')]");
    By txtVerifyDescription = By.xpath(
            "//span[text()='Description']//ancestor::*[@class='row row-margin  ']//span[@class='form-control']");
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
    By txt_toAccountEFT=By.xpath("//span[text()='To']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_')]");

    By txt_toAccountEFT1=By.xpath("//span[text()='To Contact']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_')]");


    By txt_billercode=By.xpath("//span[text()='Biller Code']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_')]");
    By txt_nickname=By.xpath("//span[text()='Nickname']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_')]");
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
            "//label[text()='Transfer Date']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE')]");
    // label[text()='Transfer Date']//ancestor::*[@class='row row-margin
    // ']//span[contains(@id,'C1__QUE')]
    By txt_accountNum=By.xpath("//*[contains(@name,'value:1:1:1')]");
    By txt_myDes=By.xpath("//span[text()='My Description']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_')]");

    By txt_find=By.xpath("//*[@id='enqsel']/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table/tbody/tr/td[3]/div/table/tbody/tr/td/a");
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
    By txt_authTo= By.xpath("//span[text()='To Account']//ancestor::*[@class='row row-margin  ']//span[@class='form-control']");
    By txt_viewAuthTo= By.xpath("//span[text()='To Account']//ancestor::*[@class='row row-margin form-row  ']//span[@class='form-control']");
    By txt_viewAuthFrom= By.xpath("//span[text()='From Account']//ancestor::*[@class='row row-margin form-row  ']//span[@class='form-control']");
    By txt_viewAmount= By.xpath("//span[text()='Amount']//ancestor::*[@class='row row-margin form-row  ']//span[@class='form-control']");
    By txt_viewDescription= By.xpath("//span[text()='Description']//ancestor::*[@class='row row-margin form-row  ']//span[@class='form-control']");
    By txt_viewuthTransDate= By.xpath("//span[text()='Transfer Date']//ancestor::*[@class='row row-margin form-row  ']//span[@class='form-control']");




    //span[text()='From Account']//ancestor::*[@class='row row-margin form-row  ']//span[@class='form-control']
    By txt_authAmount= By.xpath("//span[text()='Amount']//ancestor::*[@class='row row-margin  ']//span[@class='form-control']");
    By txt_authDes= By.xpath("//span[text()='Description']//ancestor::*[@class='row row-margin  ']//span[@class='form-control']");
    By txt_authTransDate= By.xpath("//span[text()='Transfer Date']//ancestor::*[@class='row row-margin  ']//span[@class='form-control']");
    By txt_viewAuthTransDate= By.xpath("//span[text()='Transfer Date']//ancestor::*[@class='row row-margin form-row  ']//span[@class='form-control']");

    By txt_authStartDate= By.xpath("//span[text()='Start Date']//ancestor::*[@class='row row-margin  ']//span[@class='form-control']");
    By txt_viewAuthStartDate= By.xpath("//span[text()='Start Date']//ancestor::*[@class='row row-margin form-row  ']//span[@class='form-control']");
    By txt_authEndDate= By.xpath("//span[text()='End Date']//ancestor::*[@class='row row-margin  ']//span[@class='form-control']");
    By txt_viewAuthEndDate= By.xpath("//span[text()='End Date']//ancestor::*[@class='row row-margin form-row  ']//span[@class='form-control']");
    By txt_authFrequency= By.xpath("//span[text()='Frequency']//ancestor::*[@class='row row-margin  ']//span[@class='form-control']");
    By txt_viewAuthFrequency= By.xpath("//span[text()='Frequency']//ancestor::*[@class='row row-margin form-row  ']//span[@class='form-control']");
    By txt_authWhen= By.xpath("//span[text()='When']//ancestor::*[@class='row row-margin  ']//span[@class='form-control']");
    By btn_viewApprove = By.xpath("//*[@id='C1__BUT_BF846DFC132B5620181416']");



    //By txtDate = By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[2]/a");

    By txtDate = By.xpath("(//a[@class='ui-state-default'])[28]");

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

    By txtCloseVerify = By.xpath("//div[text()='Your payment has been created and is awaiting approval before being processed']");
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

    @FindBy(xpath="(//table/tbody/tr[2]/td[9]/div/fieldset/div)[3]")
    WebElement scheduledEdit;



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


    By txt_rwa2_coloumn4= By.xpath("//*[@id='C1__QUE_60CA8231C0CE5CF6124599_R2']");
    By txt_rwa2_coloumn5= By.xpath("//*[@id='C1__QUE_60CA8231C0CE5CF6124600_R2']");



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
    By txtBSBBatch1 = By.xpath("(//*[contains(@id,'C1__QUE_CFC8AE856BB3')])[3]");
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
    By txtdropDown1 = By.xpath("//*[@id='C1__QUE_5DFE13BF59422EAF6956']");
    By txtDropDown1 = By.xpath("//*[@id='C1__QUE_FE870B3563952CC32548626']");

    By txtselectValue3 = By.xpath("(//*[contains(@id,'C1__QUE_5DFE13')])[1]");
    By txttransferAmount = By.xpath("//input[@name='C1__MOVEMONEY[1].CREDITAMOUNT']");
    By txtdescription = By.xpath("//*[@name='C1__MAKEPAYMENT[1].PAYMENTREFERENCE']");
    By txtrecurringCalaendar1 = By.xpath("(//*[contains(@id,'C1__p1_PAYMENT')]/following::img)[1]");
    By txtrecurringStartDate = By.xpath("//*[@id='C1__PAYMENT_START']");
    By txt_recurringEndDate = By.xpath("//*[@id='C1__PAYMENT_END']");


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
    By btn_updateContact= By.xpath("//*[@id='C1__BUT_955E7729869411C986860']");

    By txttotal= By.xpath("//*[@id='C1__QUE_1877EB280953D48A233440']");


    By txt_toAccountName = By.xpath("(//*[contains(@id,'C1__QUE_5FCD6')])[11]");
    By txt_toAccountNum = By.xpath("(//*[contains(@id,'C1__QUE')])[9]");
    By txt_regularTempAmt = By.xpath("(//input[@type='text'])[3]");
    By txt_regularTempDes = By.xpath("(//input[@type='text'])[4]");
    By txt_toAccountNumber = By.xpath("(//*[contains(@id,'C1__QUE_5FCD6')])[13]");
    By txt_bsbNumber = By.xpath("(//*[contains(@id,'C1__QUE_5FCD6')])[15]");
    By txt_saveContact = By.xpath("(//*[contains(@id,'C1__QUE_5FCD6')])[17]");
    By txt_nickName = By.xpath("//input[@name='C1__BATCHPAYMENTS[1].TEMPLATE[1].TEMPLATEFORMDETAILS[1].NEWCONTACT[1].NICKNAME']");
    By txt_regularPaymentNew = By.xpath("(//*[contains(@id,'C1__QUE_5FCD6')])[19]");
    By txt_descriptionNew = By.xpath("//*[@name='C1__BATCHPAYMENTS[1].TEMPLATE[1].TEMPLATEFORMDETAILS[1].THEIRDESCRIPTION']");
    By txt_addContactNew = By.xpath("(//*[contains(@id,'C1__BUT_5FCD668C')])[1]");
    By txt_saveButton = By.xpath("(//*[contains(@id,'C1__BUT_5FCD668C')])[3]");
    By txt_totalAmount1 = By.xpath("//*[@id='C1__QUE_5FCD668C40CF0678249217']");
    By txt_returnTO = By.xpath("(//*[contains(@id,'C1__BUT_1877EB2809')])[2]");
    By txt_NxtPage = By.xpath("//a[@aria-label='Next page']");

    By txt_delete = By.xpath("//*[@id=\"C1__QUE_8FC336E4FF60A39A242761_R1\"]");

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

    By txt_descriptionIT = By.xpath("//*[@name='C1__MAKEPAYMENT[1].PAYMENTREFERENCE']");

    By txt_fromAccount = By
            .xpath("//span[text()='From']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_BA')]");

    By txt_faccountEFT = By.xpath("//span[text()='From']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_')]");

    By vrfy_Payment = By.xpath("//span[text()='Payment Type']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_')]");
    By vrfy_BSB = By.xpath("//span[text()='BSB']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_')]");
    By vrfy_paymentType = By.xpath("//span[text()='Payment Type']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_')]");
    By vrfy_BillerCode = By.xpath("//span[text()='Biller Code']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_')]");
    By vrfy_BillerName = By.xpath("//span[text()='Biller Name']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_')]");
    By vrfy_CustomerNumber = By.xpath("//span[text()='Customer Reference Number']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_')]");



    By vrfy_Accountnumber = By.xpath("//span[text()='Account number']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_')]");
    By vrfy_Accountname = By.xpath("//span[text()='Account name']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_')]");
    By vrfy_ContactNickname = By.xpath("//span[text()='Contact Nickname']//ancestor::*[@class='row row-margin  ']//span[contains(@id,'C1__QUE_')]");
    By btn_confirm = By.xpath("//*[@id='C1__BUT_6C0E95F095B0AD39207427']");
    By Msg_confirm = By.xpath("//*[@id='C1__p1_HEAD_6C0E95F095B0AD39207599']/div");
    By Msg_confirm1 = By.xpath("//*[@id='C1__BUT_13A2B1830AB160FC233412']");


    By btn_return = By.xpath("//*[@id='C1__BUT_6C0E95F095B0AD39209218']");
    By btn_nextPage= By.xpath("//a[@aria-label='Next page']");
    By btn_deleteConfirm= By.xpath("//*[@id='C1__BUT_13A2B1830AB160FC233412']");
    By btn_deleteReturn= By.xpath("//*[@id='C1__BUT_13A2B1830AB160FC613027']");
    //*[@id='C1__BUT_13A2B1830AB160FC613027']

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




    By Security=By.xpath("//a[contains(@id,'ITM_4B34FA')and(text()='Security')]");
    By Manage=By.xpath("//a[(text()='Manage')]");
    By Currentpassword=By.xpath("//input[@type='password'and(@aria-label='Current Passcode')]");
    By NewPassword=By.xpath("//input[@type='password'and(@aria-label='New Passcode')]");
    By confirmpasswrd=By.xpath("//input[@type='password'and(@aria-label='Confirm Passcode')]");
    By save=By.xpath("//button[text()='Save']");
    By paswrdchangecmltemsg=By.xpath("//*[text()='Change passcode']");


    By MessageBtn=By.xpath("//*[text()='Message']");
    By InboxBtn=By.xpath("//span[text()='Inbox']");
    By unreadMsgs=By.xpath("//a[(@class='tooltipUxp  nowrap')and contains(@id,'BUT_54FA')]");
    By manage=By.xpath("//a[text()='Manage']");
    By SecurityPwdChange=By.xpath("//*[(@id='BUT_F572981281C315F61188414')]/span");
    By currentPassword=By.xpath("//*[(@type='password')and(@aria-label='Current Passcode')]");
    By sessionhistory=By.xpath("//*[@id='BUT_43FFE78993BAE094584868']");
    By homepage=By.xpath("//*[@alt='Go to Home Page']");
    By customerid=By.xpath("//label[text()='Customer ID']//../../..//input[@type='text']");
    By find=By.xpath("//*[@alt='Run Selection']");
    By customerview=By.xpath("//a[@title='Single Customer View']");
    By accountordeposit=By.xpath("//*[text()='Account/Deposits']");
    By loans=By.xpath("//*[text()='Loans']");
    By customerHomeFrame=By.xpath("//*[contains(@id,'CUSTOMER')]");
    By creaatepaymentframe=By.xpath("//*[contains(@id,'FRAMETAB')]");
    //By createinnerframe=By.xpath(txtouterFrame1);
    By clientmaaintenance=By.xpath("//*[@id='btnClientMaintenance']");
    By subIdField=By.xpath("//*[@name='txtCLNO']");
    By retrieve=By.xpath("//*[@name='cmdRetrieve']");
    By NameIBM=By.xpath("//*[@id='txtMemName']");
    By clientnum2=By.xpath("//*[@id='gvManagedEntities']/tbody/tr[1]/td[5]");
    By clientnum3=By.xpath("//*[@id='gvManagedEntities']/tbody/tr[2]/td[5]");

    //*[@aria-label="New Passcode"]
    // By NewPassword=By.xpath("//*[@aria-label='New Passcode']");
    By ReadMsg=By.xpath("//table[contains(@id,'C1__TBL_AB')]//tbody/tr[1]/td[4]");
    By ReadMsg1=By.xpath("//table[contains(@id,'C1__TBL_AB')]//tbody/tr[2]/td[4]");











    private final Logger log = LoggerHelper.getLogger(IBHomePage.class);


    public void authorizationConfirmView(String Taccount,String Faccount,String Amount,String description) throws IOException {
        T24homepage hm=new T24homepage();
        WebElement authFrom = findElement(txt_viewAuthFrom);
        String authfrom=authFrom.getText();
        if(authfrom.contains(Faccount)) {
            log.info("From account successfully displayed on authorization confirm page");
            //tb.logExtentReport("From account successfully displayed on authorization confirm page");
        }
        else {
            Assert.fail("From account successfully not displayed on authorization page");
        }
        WebElement authTo = findElement(txt_viewAuthTo);
        String authto=authTo.getText();
        if (authto.contains(Taccount)) {
            log.info("To account successfully displayed on authorization confirm page");
           // tb.logExtentReport("To account successfully displayed on authorization confirm page");
        }
        else {
            Assert.fail("To account successfully not displayed on authorization page");
        }

        WebElement authAmount = findElement(txt_viewAmount);
        String authamount=authAmount.getText();
        //authAmt=enteredAmt;

        if (authamount.contains(Amount)) {
            log.info("Amount successfully displayed on authorization confirm page");
           // tb.logExtentReport("Amount account successfully displayed on authorization confirm page");
        }
        else {
            //tb.test.log(Status.FAIL, "Amount is not displayed successfully on authorization page");
            Assert.fail("Amount successfully not displayed on authorization page");
        }
        WebElement authDes = findElement(txt_viewDescription);
        String authdes=authDes.getText();
        if (description.contains(authdes)) {
            log.info("Description successfully displayed on authorization confirm page");
           // tb.logExtentReport("Description account successfully displayed on authorization confirm page");
        }
        else {
            //tb.test.log(Status.FAIL, "Description is not displayed successfully on authorization page");
            Assert.fail("Description successfully not displayed on authorization page");
        }
        WebElement Btn_viewApprove = findElement(btn_viewApprove);

        Btn_viewApprove.click();
    }



    public void authorizationConfirmViewBpay(String Taccount,String Faccount,String Amount,String description) throws IOException {
        T24homepage hm=new T24homepage();
        WebElement authFrom = findElement(txt_viewAuthFrom);
        String authfrom=authFrom.getText();
        if(authfrom.contains(Faccount)) {
            log.info("From account successfully displayed on authorization confirm page");
            //tb.logExtentReport("From account successfully displayed on authorization confirm page");
        }
        else {
            Assert.fail("From account successfully not displayed on authorization page");
        }
//        WebElement authTo = findElement(txt_viewAuthTo);
//        String authto=authTo.getText();
//        if (authto.contains(Taccount)) {
//            log.info("To account successfully displayed on authorization confirm page");
//            // tb.logExtentReport("To account successfully displayed on authorization confirm page");
//        }
//        else {
//            Assert.fail("To account successfully not displayed on authorization page");
//        }

        WebElement authAmount = findElement(txt_viewAmount);
        String authamount=authAmount.getText();
        //authAmt=enteredAmt;

        if (authamount.contains(Amount)) {
            log.info("Amount successfully displayed on authorization confirm page");
            // tb.logExtentReport("Amount account successfully displayed on authorization confirm page");
        }
        else {
            //tb.test.log(Status.FAIL, "Amount is not displayed successfully on authorization page");
            Assert.fail("Amount successfully not displayed on authorization page");
        }

        WebElement Btn_viewApprove = findElement(btn_viewApprove);

        Btn_viewApprove.click();
    }















    public void authorizationConfirm(String Faccount,String Taccount,String Amount,String description) throws Exception {
        WebElement authFrom = findElement(txt_authFrom);
        String authfrom = authFrom.getText();
        if (authfrom.contains(Faccount)) {
            log.info("From account successfully displayed on authorization confirm page");
            //tb.logExtentReport("From account successfully displayed on authorization confirm page");
        } else {
            // tb.test.log(Status.FAIL, "From account successfully not displayed on authorization page");
            Assert.fail("From account not displayed on authorization page");
        }
        WebElement authTo = findElement(txt_authTo);
        String authto = authTo.getText();

        if (authto.contains(Taccount)) {
            log.info("To account successfully displayed on authorization confirm page");
            //  tb.logExtentReport("To account successfully displayed on authorization confirm page");
        } else {
            //tb.test.log(Status.FAIL, "To account is not displayed successfully on authorization page");
            Assert.fail("To account not displayed on authorization page");
        }
        WebElement authAmount = findElement(txt_authAmount);
        String authamount = authAmount.getText();
        if (authamount.contains(Amount)) {
            log.info("Amount successfully displayed on authorization confirm page");
            // tb.logExtentReport("Amount account successfully displayed on authorization confirm page");
        } else {
            // tb.test.log(Status.FAIL, "Amount is not displayed successfully on authorization page");
            Assert.fail("Amount successfully not displayed on authorization page");
        }
        WebElement authDes = findElement(txt_authDes);
        String authdes = authDes.getText();
        if (description.contains(authdes)) {
            log.info("Description successfully displayed on authorization confirm page");
            //tb.logExtentReport("Description account successfully displayed on authorization confirm page");
        } else {
            //tb.test.log(Status.FAIL, "Description is not displayed successfully on authorization page");
            Assert.fail("Description successfully not displayed on authorization page");
        }

    }

    public void authorizationConfirmBpay(String Faccount,String Taccount,String Amount,String description) throws Exception {
        WebElement authFrom = findElement(txt_authFrom);
        String authfrom = authFrom.getText();
        if (authfrom.contains(Faccount)) {
            log.info("From account successfully displayed on authorization confirm page");
            //tb.logExtentReport("From account successfully displayed on authorization confirm page");
        } else {
            // tb.test.log(Status.FAIL, "From account successfully not displayed on authorization page");
            Assert.fail("From account not displayed on authorization page");
        }
        WebElement authTo = findElement(txt_authTo);
        String authto = authTo.getText();
        authto=authto.replace("BROKI","");
//        if (authto.contains(Taccount)) {
//            log.info("To account successfully displayed on authorization confirm page");
//            //  tb.logExtentReport("To account successfully displayed on authorization confirm page");
//        } else {
//            //tb.test.log(Status.FAIL, "To account is not displayed successfully on authorization page");
//            Assert.fail("To account not displayed on authorization page");
//        }
        WebElement authAmount = findElement(txt_authAmount);
        String authamount = authAmount.getText();
        if (authamount.contains(Amount)) {
            log.info("Amount successfully displayed on authorization confirm page");
            // tb.logExtentReport("Amount account successfully displayed on authorization confirm page");
        } else {
            // tb.test.log(Status.FAIL, "Amount is not displayed successfully on authorization page");
            Assert.fail("Amount successfully not displayed on authorization page");
        }
        //WebElement authDes = findElement(txt_authDes);
      //  String authdes = authDes.getText();
//        if (description.contains(authdes)) {
//            log.info("Description successfully displayed on authorization confirm page");
//            //tb.logExtentReport("Description account successfully displayed on authorization confirm page");
//        } else {
//            //tb.test.log(Status.FAIL, "Description is not displayed successfully on authorization page");
//            Assert.fail("Description successfully not displayed on authorization page");
//        }

    }















    public void returnToAuth() throws Exception {
        /*
         * WebElement returnAuthApprove1= findElement(txt_returnToAuth);
         * returnAuthApprove1.click();
         */
        Thread.sleep(1000);
        int repeat=0;
        while(repeat<=7) {

            try {
                WebElement Txt_returnToAuth= findElementClickable(txt_returnToAuth);
               //Txt_returnToAuth.click();
                clickElementUsingJavaScript(Txt_returnToAuth);
               // actions(Txt_returnToAuth);
                //clickElement(txt_returnToAuth);
                break;
            }catch(StaleElementReferenceException exc) {
                exc.printStackTrace();
            }
            repeat++;
        }
        Thread.sleep(500);
        //  clickElement(txt_returnToAuth);
        log.info("Authorisation done for internal transaction...");
        //tb.logExtentReport("Authorisation done for now transaction..");

    }



}











