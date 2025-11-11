

Feature:IBPayments
  Background:close
    When close all the other opened windows before loading the url

Scenario:Internal transfer IB
  When User opens the IB URL
  When user login to IB

@firstday1
  Scenario Outline: Perform Internal Transfer IB Now
  When User opens the IB URL
  Given I login with username "<username>" and password "<password>" of IB
  And click on Go to Accounts
  And click on Transfers and Pay button
  Then click on transfer button
  Then Enter the transaction details
  Then confirm the internal transfer payment
  And Review the internal transfer
  Then logout from Ib
  And Login to authorizer account with username "<username2>"and password "<password2>"
  And click on Go to Accounts
  And click on Transfers and Pay button
 Then click on Authorization button
 And Authorize the internal transfer
 Then Review authorization that the details are reflected correctly
  Then logout from Ib
 When User opens the T24 Url
 Then User should be able to login to T24
  Then The user should be able to fill the commandline
  And The user should be able to click on general enquiries buttom
  And click on the IB-view of account entries
  Then Enter the account number of internal transfer-IB
  And click on find button
  Then verify whether the narratives of internal trasfer-IB is reflected in the IB-view of account entries




    Examples:
      | username             | password |
      | 298010               | Temenos@123|


  @firstday1
    Scenario Outline: Perform Internal Transfer IB future
    When User opens the IB URL
    Given I login with username "<username>" and password "<password>" of IB
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then click on transfer button
    Then Enter the future transaction details in IB
    And click on continue button
    Then confirm the Internal transfer future payment
    And Review the internal transfer future payment
    Then logout from Ib
    And Login to authorizer account with username "<username2>"and password "<password2>"
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then click on Authorization button
    And Authorize the internal transfer future
    Then Review authorization that the details of internal transfer future is reflected correctly

    Examples:
      | username             | password |
      | 298010               | Temenos@123|



  @secondday
  Scenario: Internal Transfer IB future Narratives
  When User opens the T24 Url
  Then User should be able to login to T24
  Then The user should be able to fill the commandline
  And The user should be able to click on general enquiries buttom
  And click on the IB-view of account entries
  Then Enter the account number of internal transfer-IB future
  And click on find button
  Then verify the narratives of internal trasfer-IB future


  @firstday1
  Scenario Outline: Perform Internal Transfer IB Recurring
    When User opens the IB URL
    Given I login with username "<username>" and password "<password>" of IB
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then click on transfer button
    Then Enter the Internal Recurring transaction details in IB
    And click on continue button
    Then confirm the internal trasfer IB recurring
    And Review the internal transfer Recurring payment
    Then logout from Ib
    And Login to authorizer account with username "<username2>"and password "<password2>"
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then click on Authorization button
    And Authorize the internal transfer Recurring
    Then Review authorization that the details of internal transfer Recurring is reflected correctly


    Examples:
      | username             | password |
      | 298010               | Temenos@123|
  @secondday
  Scenario: Internal Transfer IB Recurring Narratives
    When User opens the T24 Url
    Then User should be able to login to T24
    Then The user should be able to fill the commandline
    And The user should be able to click on general enquiries buttom
    And click on the IB-view of account entries
    Then Enter the account number of internal transfer-IB Recurring
    And click on find button
    Then verify the narratives of internal trasfer-IB Recurring




  @firstday1
    Scenario Outline: Perform External Transfer IB saved now
    When User opens the IB URL
    Given I login with username "<username>" and password "<password>" of IB
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then click on transfer button
    And Enter the details for external transfer now
    Then Confirm the external transfer IB now
    And Review the external transfer now payment
    Then logout from Ib
    And Login to authorizer account with username "<username2>"and password "<password2>"
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then click on Authorization button
    And Authorize the External transfer now
    Then Review authorization that the details of external transfer is reflected correctly
    When User opens the T24 Url
    Then User should be able to login to T24
    Then The user should be able to fill the commandline
    And The user should be able to click on general enquiries buttom
    And click on the IB-view of account entries
    Then Enter the account number of External Transfer IB saved now
    And click on find button
    Then verify the narratives of External Transfer IB saved now








    Examples:
      | username             | password |
      | 298010               | Temenos@123|


 @secondday
    Scenario: External Transfer saved Narratives
    When User opens the T24 Url
    Then User should be able to login to T24
    Then The user should be able to fill the commandline
    And The user should be able to click on general enquiries buttom
    And click on the IB-view of account entries
    Then Enter the account number of external transfer-IB now
    And click on find button
    Then verify the narratives of external trasfer-IB now

  @firstday1
  Scenario Outline: External Transfer saved IB Recurring
    When User opens the IB URL
    Given I login with username "<username>" and password "<password>" of IB
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then click on transfer button
    And Enter the details for external transfer saved recurring
    Then Confirm the external transfer IB
    And Review the external transfer recurring payment
    Then logout from Ib
    And Login to authorizer account with username "<username2>"and password "<password2>"
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then click on Authorization button
    And Authorize the External transfer recurring saved
    Then Review authorization that the details of external transfer recurring is reflected correctly
    Examples:
      | username             | password |
      | 298010               | Temenos@123|
  @secondday
  Scenario: External Transfer IB saved recurring Narratives
    When User opens the T24 Url
    Then User should be able to login to T24
    Then The user should be able to fill the commandline
    And The user should be able to click on general enquiries buttom
    And click on the IB-view of account entries
    Then Enter the account number of external transfer-IB Recurring
    And click on find button
    Then verify the narratives of external trasfer recurring

  @firstday1
    Scenario Outline:External Transfer saved IB future
    When User opens the IB URL
    Given I login with username "<username>" and password "<password>" of IB
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then click on transfer button
    Then Enter the external future transaction details in IB
    And click on continue button
    Then confirm the External transfer future payment
    And Review the External transfer future payment
    Then logout from Ib
    And Login to authorizer account with username "<username2>"and password "<password2>"
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then click on Authorization button
    And Authorize the External transfer future
    Then Review authorization that the details of External transfer future is reflected correctly
  Examples:
    | username             | password |
    | 298010               | Temenos@123|


  @secondday
    Scenario: External Transfer IB saved future Narratives
    When User opens the T24 Url
    Then User should be able to login to T24
    Then The user should be able to fill the commandline
    And The user should be able to click on general enquiries buttom
    And click on the IB-view of account entries
    Then Enter the account number of external transfer-IB future
    And click on find button
    Then verify the narratives of external trasfer IB future

  @firstday1
  Scenario Outline: Perform External Transfer IB new contact now
    When User opens the IB URL
    Given I login with username "<username>" and password "<password>" of IB
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then click on transfer button
    And Enter the details for external transfer new contact now
    Then Confirm the external transfer IB new Contact
    And Review the external transfer new contact now payment
    Then logout from Ib
    And Login to authorizer account with username "<username2>"and password "<password2>"
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then click on Authorization button
    And Authorize the External transfer new contact now
    Then Review authorization that Taccountthe details of external transfer new contact now is reflected correctly
    Then logout from Ib
    When User opens the T24 Url
    Then User should be able to login to T24
    Then The user should be able to fill the commandline
    And The user should be able to click on general enquiries buttom
    And click on the IB-view of account entries
    Then Enter the account number of Transfer IB new contact now
    And click on find button
    Then verify the narratives of Transfer IB new contact now


    Examples:
      | username             | password |
      | 298010               | Temenos@123|

  @secondday
    Scenario: External Transfer IB new contact now Narratives
    When User opens the T24 Url
    Then User should be able to login to T24
    Then The user should be able to fill the commandline
    And The user should be able to click on general enquiries buttom
    And click on the IB-view of account entries
    Then Enter the account number of external transfer IB now new contact
    And click on find button
    Then verify the narratives of external trasfer IB now new contact

  @firstday1
  Scenario Outline: Perform External Transfer IB new contact Recurring
    When User opens the IB URL
    Given I login with username "<username>" and password "<password>" of IB
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then click on transfer button
    And Enter the details for external transfer new contact Recurring
    Then Confirm the external transfer IB new Contact Recurring
    And Review the external transfer new contact Recurring payment
    Then logout from Ib
    And Login to authorizer account with username "<username2>"and password "<password2>"
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then click on Authorization button
    And Authorize the External transfer new contact Recurring
    Then Review authorization that the details of external transfer new contact recurring is reflected correctly
    Examples:
      | username             | password |
      | 298010               | Temenos@123|
    @secondday
  Scenario: External Transfer IB new contact recurring Narratives
    When User opens the T24 Url
    Then User should be able to login to T24
    Then The user should be able to fill the commandline
    And The user should be able to click on general enquiries buttom
    And click on the IB-view of account entries
    Then Enter the account number of external transfer IB recurring new contact
    And click on find button
    Then verify the narratives of external trasfer IB recurring new contact

  @firstday1
  Scenario Outline: Perform External Transfer IB new contact future
    When User opens the IB URL
    Given I login with username "<username>" and password "<password>" of IB
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then click on transfer button
    And Enter the details for external transfer new contact future
    Then Confirm the external transfer IB new Contact future
    And Review the external transfer new contact future payment
    Then logout from Ib
    And Login to authorizer account with username "<username2>"and password "<password2>"
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then click on Authorization button
    And Authorize the External transfer new contact future
    Then Review authorization that the details of external transfer new contact future is reflected correctly
    Examples:
      | username             | password |
      | 298010               | Temenos@123|


  @sercondday
  Scenario: External Transfer IB new contact future Narratives
    When User opens the T24 Url
    Then User should be able to login to T24
    Then The user should be able to fill the commandline
    And The user should be able to click on general enquiries buttom
    And click on the IB-view of account entries
    Then Enter the account number of external transfer IB future new contact
    And click on find button
    Then verify the narratives of external trasfer IB future new contact


  @firstday1
    Scenario Outline:Bpay now saved contact
      When User opens the IB URL
      Given I login with username "<username>" and password "<password>" of IB
      And click on Go to Accounts
      And click on Transfers and Pay button
      Then click on transfer button
      Then Click on Bpay
      Then Enter the Bpay details
      And confirm Bpay saved payment
      And Review the BPAY saved contact now
      Then logout from Ib
      And Login to authorizer account with username "<username2>"and password "<password2>"
      And click on Go to Accounts
      And click on Transfers and Pay button
      Then click on Authorization button
      Then Authorize the Bpay transfer now
      Then Review authorization that the details of BPAY saved now is reflected correctly
      When User opens the T24 Url
      Then User should be able to login to T24
      Then The user should be able to fill the commandline
      And The user should be able to click on general enquiries buttom
      And click on the IB-view of account entries
      Then Enter the account number of Bpay now saved contact
      And click on find button
      Then verify the narratives of Bpay now saved contact
      Examples:
        | username             | password |
        | 298010               | Temenos@123|

  @secondday
  Scenario: Bpay now Narratives
    When User opens the T24 Url
    Then User should be able to login to T24
    Then The user should be able to fill the commandline
    And The user should be able to click on general enquiries buttom
    And click on the IB-view of account entries
    Then Enter the account number of external transfer IB future new contact
    And click on find button
    Then verify the narratives of external trasfer IB future new contact
  @firstday1
  Scenario Outline:Bpay future saved contact
    When User opens the IB URL
    Given I login with username "<username>" and password "<password>" of IB
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then click on transfer button
    Then Click on Bpay
    Then Enter the Bpay future details
    And confirm Bpay saved payment future
    And Review the BPAY saved contact future
    Then logout from Ib
    And Login to authorizer account with username "<username2>"and password "<password2>"
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then click on Authorization button
    Then Authorize the Bpay transfer future
    Then Review authorization that the details of BPAY future is reflected correctly



    Examples:
      | username             | password |
      | 298010               | Temenos@123|

 @secondday
  Scenario: Bpay future Narratives
    When User opens the T24 Url
    Then User should be able to login to T24
    Then The user should be able to fill the commandline
    And The user should be able to click on general enquiries buttom
    And click on the IB-view of account entries
    Then Enter the account number of external transfer IB future new contact
    And click on find button
    Then verify the narratives of external trasfer IB future new contact


  @firstday1
  Scenario Outline:Bpay recurrring saved contact
    When User opens the IB URL
    Given I login with username "<username>" and password "<password>" of IB
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then click on transfer button
    Then Click on Bpay
    Then Enter the Bpay recurring details
    And confirm Bpay saved payment recurring
    And Review the BPAY saved contact recurring
    Then logout from Ib
    And Login to authorizer account with username "<username2>"and password "<password2>"
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then click on Authorization button
    Then Authorize the Bpay transfer recurring
    Then Review authorization that the details of BPAY saved contact recurring is reflected correctly

    Examples:
      | username             | password |
      | 298010               | Temenos@123|


  @firstday1
  Scenario Outline:Bpay now new contact
    When User opens the IB URL
    Given I login with username "<username>" and password "<password>" of IB
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then click on transfer button
    Then Click on Bpay
    Then Enter the Bpay new contact details
    And confirm Bpay new contact payment
    And Review the BPAY new contact now
    Then logout from Ib
    And Login to authorizer account with username "<username2>"and password "<password2>"
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then click on Authorization button
    Then Authorize the Bpay transfer new contact now
    Then Review authorization that the details of BPAY now is reflected correctly
    When User opens the T24 Url
    Then User should be able to login to T24
    Then The user should be able to fill the commandline
    And The user should be able to click on general enquiries buttom
    And click on the IB-view of account entries
    Then Enter the account number of Bpay now new contact
    And click on find button
    Then verify the narratives of Bpay now new contact

    Examples:
      | username             | password |
      | 298010               | Temenos@123|


  @firstday1
    Scenario Outline:Bpay recurring new contact
    When User opens the IB URL
    Given I login with username "<username>" and password "<password>" of IB
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then click on transfer button
    Then Click on Bpay
    Then Enter the Bpay new contact recurring details
    And confirm Bpay new contact recurring payment
    And Review the BPAY new contact recurring
    Then logout from Ib
    And Login to authorizer account with username "<username2>"and password "<password2>"
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then click on Authorization button
    Then Authorize the Bpay transfer new contact recurring
    Then Review authorization that the details of BPAY recurring is reflected correctly

    Examples:
      | username             | password |
      | 298010               | Temenos@123|

  @firstday1
    Scenario Outline:Bpay future new contact
    When User opens the IB URL
    Given I login with username "<username>" and password "<password>" of IB
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then click on transfer button
    Then Click on Bpay
    Then Enter the Bpay new contact future details
    And confirm Bpay new contact future payment
    And Review the BPAY new contact future
    Then logout from Ib
    And Login to authorizer account with username "<username2>"and password "<password2>"
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then click on Authorization button
    Then Authorize the Bpay transfer new contact future
    Then Review authorization that the details of BPAY future new contact is reflected correctly
    Examples:
      | username             | password |
      | 298010               | Temenos@123|


  @firstday1
Scenario Outline:Secure and Urgent message
  When User opens the IBM URL
  When Login to IBM
  When we send the Normal message
  When We send the urgent message
  When User opens the IB URL
  Given I login with username "<username>" and password "<password>" of IB
  Then verify whether the urgent message is displayed in the landing page
  And click on Go to Accounts
  Then check whether the urgent message is displayed on the inbox
  Then check whether the normal message is displayed on the inbox

  Examples:
    | username             | password |
    | 298010               | Temenos@123|

  @firstday1
Scenario Outline:password change
  When User opens the IB URL
  When Login to IB for changing password
  And click on Go to Accounts
When click on pasword change
  When change the password
  Examples:
    | username             | password |
    | 298010               | Temenos@|


  @firstday1
  Scenario Outline: Checking inbox message count
  When User opens the IB URL
  Given I login with username "<username>" and password "<password>" of IB
  And click on Go to Accounts
  When Click on inbox
  When read the message
  Then check whether the message count decreased





  Examples:
    | username             | password |
    | 298010               | Temenos@123|


  @firstday1
    Scenario Outline:Adding new contacts-transfer
      When User opens the IB URL
      Given I login with username "<username>" and password "<password>" of IB
      And click on Go to Accounts
      When Click on add contact
      When add the new contact details
      Then confirm whether the details are correct
      When edit the newly added contact details
      When delete the newly added contact
      Examples:
        | username             | password |
        | 298010               | Temenos@123|

  @firstday
  Scenario Outline:Adding Editing and Deleting new contacts-BPAY
    When User opens the IB URL
    Given I login with username "<username>" and password "<password>" of IB
    And click on Go to Accounts
    When Click on add contact
    When add the new contact details of Bpay
    Then confirm whether the newly added BPAY details are correct
    When edit the newly added BPAY contact details
    When delete the newly added BPAY contact
    Examples:
      | username             | password |
      | 298010               | Temenos@123|


  @firstday1
    Scenario Outline:Session history IB
    When User opens the IB URL
    Given I login with username "<username>" and password "<password>" of IB
    And click on Go to Accounts
    Then check whether the session history is showing the correct details
  Examples:
    | username             | password |
    | 298010               | Temenos@123|


  @firstday1
Scenario Outline:Batch template-Create/edit/delete
  When User opens the IB URL
  Given I login with username "<username>" and password "<password>" of IB
  And click on Go to Accounts
  And click on Transfers and Pay button
  Then create new batch template
  Then Delete the newly created batch template
  Examples:
    | username| password |
     |298010   |Temenos@123|
  @firstday1
  Scenario Outline:Compose message
    When User opens the IB URL
    Given I login with username "<username>" and password "<password>" of IB
    And click on Go to Accounts
    Then compose message

    Examples:
      | username             | password |
      | 298010               | Temenos@123|
  @firstday
    Scenario Outline:debit batch payment file
      When User opens the IB URL
      Given I login with username "<username>" and password "<password>" of IB
      And click on Go to Accounts
      And click on Transfers and Pay button
      Then Click on Batch
      And Enter the details of batchpayment file
      Then Review the batch payment file
      Then logout from Ib
      And Login to authorizer account with username "<username2>"and password "<password2>"
      And click on Go to Accounts
      And click on Transfers and Pay button
      Then click on Authorization button
      And open the batch payment using file that need to be authorised
      Then authorise the batch payment
      Then review authorization that the details of debitbatchpaymentsfile
      When User opens the T24 Url
      Then User should be able to login to T24
      Then The user should be able to fill the commandline
      And The user should be able to click on general enquiries buttom
      And click on the IB-view of account entries
      Then Enter the account number of debitbatchpaymentsfile
      And click on find button
      Then verify the narratives of debitbatchpaymentsfile


      Examples:
        | username             | password |
        | 298010               | Temenos@123|
  @firstday1
  Scenario Outline:credit batch payment file
    When User opens the IB URL
    Given I login with username "<username>" and password "<password>" of IB
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then Click on Batch
    And Enter the details of Credit batchpayment file
    #Then Review the batch payment file
    Then verify the details of credit batch and Click on Pay now button
    Then logout from Ib
    And Login to authorizer account with username "<username2>"and password "<password2>"
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then click on Authorization button
    And open the batch payment that need to be authorised
    Then authorise the credit batch payment file
    Then review authorization that the details of creditbatchpaymentsfile
    When User opens the T24 Url
    Then User should be able to login to T24
    Then The user should be able to fill the commandline
    And The user should be able to click on general enquiries buttom
    And click on the IB-view of account entries
    Then Enter the account number of creditbatchpaymentsfile
    And click on find button
    Then verify the narratives of creditbatchpaymentsfile


    Examples:
      | username             | password |
      | 298010               | Temenos@123|


  @firstday
  Scenario Outline:Debit batch payment
    When User opens the IB URL
    Given I login with username "<username>" and password "<password>" of IB
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then Click on Batch
    And Enter the details of Debit batchpayment
    Then verify the details of debit batch payment and click on Pay now button
    Then logout from Ib
    And Login to authorizer account with username "<username2>"and password "<password2>"
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then click on Authorization button
    And open the debit batch payment that need to be authorised
    Then authorise the debit batch payment
    Then review authorization that the details of debit batch payment
    When User opens the T24 Url
    Then User should be able to login to T24
    Then The user should be able to fill the commandline
    And The user should be able to click on general enquiries buttom
    And click on the IB-view of account entries
    Then Enter the account number of debit batch payment
    And click on find button
    And verify the narratives of debit batch paymentt
    When User opens the IBM URL
    When Login to IBM
    Then check the audit log whether the debit batch payment initiated in subIb "<username>" scheduled is reflected for


    Examples:
      | username             | password |
      | 298010               | Temenos@123|


  @firstday
    Scenario Outline:Credit batch payment origi
    When User opens the IB URL
    Given I login with username "<username>" and password "<password>" of IB
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then Click on Batch
    And Enter the details of Credit batchpayment
    Then verify the details and click on Pay now button credit
    Then logout from Ib
    And Login to authorizer account with username "<username2>"and password "<password2>"
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then click on Authorization button
    And open the credit batch payment that need to be authorised
     Then authorise the credit batch payment
    Then review authorization that the details of creditbatchpayment
    Then logout from Ib
    When User opens the T24 Url
    Then User should be able to login to T24
    Then The user should be able to fill the commandline
    And The user should be able to click on general enquiries buttom
    And click on the IB-view of account entries
    Then Enter the account number of creditbatchpayment
    And click on find button
   Then verify the narratives of creditbatchpaymentt
    When User opens the IBM URL
    When Login to IBM
    Then check click on Reporting and select all batches
    Then Verify the IBM reporting that the Batch payment status is posted
    Examples:
      | username             | password |
      | 298010               | Temenos@123|


  @firstday
    Scenario Outline:Debit batch payment Template
    When User opens the IB URL
     Given I login with username "<username>" and password "<password>" of IB
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then Click on Batch
    And Enter the details of Debit batchpayment template
    Then verify the details and click on Pay now button
    Then logout from Ib
    And Login to authorizer account with username "<username2>"and password "<password2>"
    And click on Go to Accounts
    And click on Transfers and Pay button
   Then click on Authorization button
    And open the debit batch payment template that need to be authorised
    Then authorise the debit batch template payment
    Then review authorization details of debitbatchpayment template
    Then logout from Ib
    When User opens the T24 Url
    Then User should be able to login to T24
    Then The user should be able to fill the commandline
    And The user should be able to click on general enquiries buttom
    And click on the IB-view of account entries
    Then Enter the account number of debit batch payment template
    And click on find button
    Then verify the narratives of debit batch payment template


    Examples:
      | username             | password |
      | 298010               | Temenos@123|


  @firstday
    Scenario Outline:Single sign on

      When User opens the IBM URL
      When Login to IBM
      Then retrieve the client
      And get client numbers having single signon
      #Then print values of client number
      When User opens the T24 Url
      Then User should be able to login to T24
      Then The user should be able to fill the commandline
      Then check the total investment facilities in the customer overview screen
      When User opens the IB URL
      Given I login with username "<username>" and password "<password>" of IB
      And click on Go to Accounts
      Then check the single sign on dropdwown
      Then select the account from single sign on dropdown and check the investment facilities
      Examples:
        | username             | password |
        | 237675               | Temenos@123|
  @firstday
  Scenario Outline:Batchpaymentfailure
    When User opens the IB URL
    Given I login with username "<username>" and password "<password>" of IB
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then Click on Batch
    Then enter the batch payment details and upload the file which will create failed batch payment
    Then review batch payment and return to authorization
    Then logout from Ib
    And Login to authorizer account with username "<username2>"and password "<password2>"
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then click on Authorization button
    And open the debit failure batch payment that need to be authorised
    Then authorise the failure debit batch payment
    Then review authorization details of debit failure batchpayment
    Then logout from Ib
    When User opens the IBM URL
    When Login to IBM
    Then check click on Reporting
    Then Verify the IBM reporting that the Batch payment status is not posted

    Examples:
      | username             | password |
      | 298010               | Temenos@123|

  @firstday
  Scenario Outline:Batchpaymentfailure
    When User opens the IB URL
    Given I login with username "<username>" and password "<password>" of IB
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then Click on Batch
    Then Enter the details of batchpayment with Wrong BSB
    Then review batch payment having wrong BSB and return to authorization
    Then logout from Ib
    And Login to authorizer account with username "<username2>"and password "<password2>"
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then click on Authorization button
    And open the debit Wrong BSB batch payment that need to be authorised
    Then authorise the wrong BSB batch payment
    Then review authorization details of wrong BSB batchpayment
    Then logout from Ib
    When User opens the IBM URL
    When Login to IBM
    Then check the IBManager reporting table
    Then Logout of IBM
    When User opens the IB URL
    Given I login with username "<username>" and password "<password>" of IB
    And click on Go to Accounts
    Then check the inbox whether the batch failed due to wrong BSB

    Examples:
      | username             | password |
      | 298010               | Temenos@123|

  @firstday
Scenario Outline:Joint account holders
  When User opens the IB URL
  Given I login with username "<username1>" and password "<password1>" of IB
  And click on Go to Accounts
  And click on Transfers and Pay button
  Then click on transfer button
  Then Enter the transaction details in first user
  Then confirm the internal transfer payment for user1
  And Review the internal transfer of user1
  When Click on inbox
  Then verify whether the transaction details are displayed in the inbox
  Then logout from Ib
  Given I login with username "<username2>" and password "<password2>" of IB
  And click on Go to Accounts
  And click on Transfers and Pay button
  Then click on Authorization button
  And Authorize the internal transfer initiated by user1
  Then Review authorization that the details of transaction initiated by user1 is reflected correctly
  And click on Transfers and Pay button
  Then click on transfer button
  Then Enter the transaction details in second user
  Then confirm the internal transfer payment for user2
  And Review the internal transfer of user2
  Then logout from Ib
  Given I login with username "<username1>" and password "<password1>" of IB
  And click on Go to Accounts
  And click on Transfers and Pay button
  Then click on transfer button
  Then click on Authorization button
  And Authorize the internal transfer initiated by user2
  Then Review authorization that the details of transaction initiated by user2 is reflected correctly
  Then logout from Ib
  When User opens the T24 Url
  Then User should be able to login to T24
  Then The user should be able to fill the commandline
  And The user should be able to click on general enquiries buttom
  And click on the IB-view of account entries
  Then Enter the account number of user1
  And click on find button
  Then verify the narratives of debit payment user1
  Then Enter the account number of user2
  And click on find button
  Then verify the narratives of debit payment user2
  Examples:
    | username1     | password1  |username2      |password2   |
    | 124710        | Temenos@123| 21894          |Temenos@123 |

  @firstday
  Scenario Outline: checking Investment facilities are displayed
    When User opens the T24 Url
    Then User should be able to login to T24
    Then The user should be able to fill the commandline
    Then open a customer and get the investment details of that customer
    When User opens the IB URL
    Given I login with username "<username>" and password "<password>" of IB
    And click on Go to Accounts
    Then Verify whether all investment details displayed in the home page
    Examples:
  | username             | password |
  | 3006658               | Temenos@123|



  @firstday1
  Scenario Outline:Credit batch payment Template
    When User opens the IB URL
    Given I login with username "<username>" and password "<password>" of IB
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then Click on Batch
    And Enter the details of Credit batchpayment template
    Then verify the details of credit batch payment template and click on Pay now button
    Then logout from Ib
    And Login to authorizer account with username "<username2>"and password "<password2>"
    And click on Go to Accounts
    And click on Transfers and Pay button
    Then click on Authorization button
    And open the credit batch payment template that need to be authorised
    Then authorise the Credit batch template payment
   Then review authorization details of Creditbatchpayment template
    Then logout from Ib
    When User opens the T24 Url
    Then User should be able to login to T24
    Then The user should be able to fill the commandline
    And The user should be able to click on general enquiries buttom
    And click on the IB-view of account entries
    Then Enter the account number of Credit batch payment template
    And click on find button
    Then verify the narratives of Credit batch payment template

    Examples:
      | username             | password |
      | 298010               | Temenos@123|
