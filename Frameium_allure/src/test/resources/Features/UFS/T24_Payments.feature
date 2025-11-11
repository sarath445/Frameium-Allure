

Feature:Payment
Background:close
  When close all the other opened windows


@firstday1
    Scenario: Internal transfer
    When User opens the T24 Url
    Then User should be able to login to T24
    Then The user should be able to fill the commandline
    And user should be able to see the the balance of the account before performing internal transfer
    Then The user should be able to navigate to Account transfer button
    And Enter the details in the account transfer fields
    Then Click on validate
    And Click on commit
    Then Verify whether the transaction complete message is displayed after commiting
    And Navigate to account entries
    Then Enter the account number and click on find button
    And Verify whether the transaction is reflected in the accountentries


  @firstday1
     Scenario:Internal Transfer narrative
     When User opens the T24 Url
     Then User should be able to login to T24
     Then The user should be able to fill the commandline
     And The user should be able to click on general enquiries buttom
     And click on the IB-view of account entries
   Then Enter the account number
     And click on find button
     And The details of internal transfer should be reflected in the narratives

  @firstday1
     Scenario:External transfer
     When User opens the T24 Url
     Then User should be able to login to T24
     Then The user should be able to fill the commandline
     And user should be able to see the the balance of the account before performing External transfer
     Then The user should be able to navigate to Account transfer button
     And Enter the details in the account external  transfer fields
     Then Click on validate
     And Click on commit
     Then Verify whether the transaction complete message is displayed after commiting
     And Navigate to account entries
     Then Enter the account number of external transfer and click on find button
     And Verify whether the external transaction is reflected in the accountentries

  @firstday1
     Scenario:External Transfer narrative
     When User opens the T24 Url
     Then User should be able to login to T24
     Then The user should be able to fill the commandline
     And The user should be able to click on general enquiries buttom
     And click on the IB-view of account entries
     Then Enter the external account number in IbView of account entries
     And click on find button
     And The details of External transfer should be reflected in the narratives

  @firstday1
     Scenario:Internal transfer over limit
       When User opens the T24 Url
       Then User should be able to login to T24
       Then The user should be able to fill the commandline
       And user should be able to see the the balance of the account before performing internal transfer over limit
       Then The user should be able to navigate to Account transfer button
       And Enter the details in the account transfer for internal transfer overlimit
       Then Click on validate
       And Click on commit
       Then check whether the override Authorisation Required message is appearing and click on acceptoverride
       Then Verify whether the transaction complete message is displayed after commiting
       And The User clicks on signoff
       Then Login to authoriser account
       Then The user should be able to fill the commandline
       And Navigate to unauthorised transactions
       Then Authorize the transaction
       Then Verify whether the transaction complete message is displayed after commiting
       And Navigate to account entries
       Then Enter the account number of internal transaction overlimit and click on find button
       And Verify whether the internal transfer over limit transaction is reflected in the accountentries

  @firstday1
       Scenario:Internal Transfer overlimit narrative
       When User opens the T24 Url
       Then User should be able to login to T24
      Then The user should be able to fill the commandline
       And The user should be able to click on general enquiries buttom
       And click on the IB-view of account entries
       Then Enter the account number of internal transfer overlimit in ibview of account entries
       And click on find button
       And The details of internal transfer overlimit should be reflected in the narratives

  @firstday1
  Scenario: External transfer over limit
    When User opens the T24 Url
    Then User should be able to login to T24
    Then The user should be able to fill the commandline
    And user should be able to see the the balance of the account before performing internal transfer
    Then The user should be able to navigate to Account transfer button
    And Enter the details in the account transfer for External transfer overlimit
    Then Click on validate
    And Click on commit
    Then check whether the override Authorisation Required message is appearing and click on acceptoverride
    Then Verify whether the transaction complete message is displayed after commiting
    And The User clicks on signoff
    Then Login to authoriser account
    Then The user should be able to fill the commandline
    And Navigate to unauthorised transactions
    Then Authorize the transaction
    Then Verify whether the transaction complete message is displayed after commiting
    And Navigate to account entries
    Then Enter the external overlimit account number and click on find button
    And Verify whether the external overlimit transaction is reflected in the accountentries

  @firstday
  Scenario:External Transfer overlimit narrative
    When User opens the T24 Url
    Then User should be able to login to T24
    Then The user should be able to fill the commandline
      And The user should be able to click on general enquiries buttom
    And click on the IB-view of account entries
    Then Enter the account number of external transfer overlimit
    And click on find button
    And The details of External transfer overlimit should be reflected in the narratives

  @firstday
  Scenario:Balance Maintanance sweep transfer
  When User opens the T24 Url
  Then User should be able to login to T24
  Then The user should be able to fill the commandline
    And navigate to find account option
  Then open the account that balance maintenance sweep transfer need to be applied
  And reverse sweep transfer if any Sweep transfer is there and switch back to main menu
  Then navigate to operations menu
  And click on sweep maintainance
  Then click on  setup maintenance sweep
  And Enter the details for balance maintenance sweep
  Then Click on validate
  And Click on commit
  Then Verify whether the transaction complete message is displayed after commiting
  And navigate to find account option
  Then open the account that balance maintenance sweep transfer need to be applied
  And verify that balance maintenance sweep transfer is reflected in the overview page

  @aftercob
    Scenario:Balance Maintanance sweep transfer Narrative
    When User opens the T24 Url
    Then User should be able to login to T24
    Then The user should be able to fill the commandline
    And navigate to find account option
    Then open the account that applied balance maintenance sweep transfer
    And verify that the Balance Maintenance sweep is reflected on the account










  @firstday
   Scenario:Surplus sweep transfer
    When User opens the T24 Url
    Then User should be able to login to T24
    Then The user should be able to fill the commandline
    And navigate to find account option
    Then open the account that surplus sweep transfer need to be applied
    And reverse sweep transfer if any Sweep transfer is there and switch back to main menu
    Then navigate to operations menu
    And click on sweep maintainance
    Then click on setup surplus sweep
    And Enter the details for surplus sweep
    Then Click on validate
    And Click on commit
    Then Verify whether the transaction complete message is displayed after commiting
    And navigate to find account option
    Then open the account that surplus sweep transfer need to be applied
    And verify that Surplus sweep transfer is reflected in the overview page

  @aftercob
  Scenario:Surplus sweep transfer Narrative
    When User opens the T24 Url
    Then User should be able to login to T24
    Then The user should be able to fill the commandline
    And navigate to find account option
    Then open the account that applied Surplussweep transfer
    And verify that the Surplussweep is reflected on the account


  @firstday
  Scenario:Two way sweep transfer Surplus
    When User opens the T24 Url
    Then User should be able to login to T24
    Then The user should be able to fill the commandline
    And navigate to find account option
    Then open the account that Two way sweep transfer-surplus need to be applied
    And reverse sweep transfer if any Sweep transfer is there and switch back to main menu
    Then navigate to operations menu
    And click on sweep maintainance
    Then click on Setup Two Way Sweep
    And Enter the details Two way sweep surplus
    Then Click on validate
    And Click on commit
    Then Verify whether the transaction complete message is displayed after commiting
    And navigate to find account option
    Then open the account that Two way sweep transfer-surplus need to be applied
    And verify that Two way sweep transfer-surplus is reflected in the overview page


  @aftercob
  Scenario:Two way sweep transfer Surplus Narrative
    When User opens the T24 Url
    Then User should be able to login to T24
    Then The user should be able to fill the commandline
    And navigate to find account option
    Then open the account that applied Two way sweep transfer Surplus transfer
    And verify that the Two way sweep transfer Surplus is reflected on the account

  @firstday
  Scenario:Two way sweep transfer Balance maintenance
    When User opens the T24 Url
    Then User should be able to login to T24
    Then The user should be able to fill the commandline
    And navigate to find account option
    Then open the account that Two way sweep transfer-BalanceMaintenance need to be applied
    And reverse sweep transfer if any Sweep transfer is there and switch back to main menu
    Then navigate to operations menu
    And click on sweep maintainance
    Then click on Setup Two Way Sweep
    And Enter the details Two way sweep BalanceMaintenance
    Then Click on validate
    And Click on commit
    Then Verify whether the transaction complete message is displayed after commiting
    And navigate to find account option
    Then open the account that Two way sweep transfer-BalanceMaintenance need to be applied
    And verify that Two way sweep transfer-BalanceMaintenance is reflected in the overview page

  @aftercob
  Scenario:Two way sweep transfer Balance maintenance Narrative
    When User opens the T24 Url
    Then User should be able to login to T24
    Then The user should be able to fill the commandline
    And navigate to find account option
    Then open the account that applied Two way sweep transfer Balance maintenance transfer
    And verify that the Two way sweep transfer Balance maintenance is reflected on the account

#  @beforeCOBScenarios
#    Scenario:Account creation
#    When User opens the T24 Url
#    Then User should be able to login to T24
#    Then The user should be able to fill the commandline
#    And  Navigate to Product catalog
#    Then Click on At call investment church Account New Arrangement button
#    And Enter the customer number for creating At call Investment church in the customer field
#    Then Click on validate
#    And Select the account mandate record
#    And Click on commit the deal for creating account
#    Then Verify whether the transaction complete message is displayed after commiting
#    And switch back to main window
#    Then The user should be able to fill the commandline
#    Then navigate to find account option
#    And open the newly created account
#    Then Verify the newly created account
#
#  @beforeCOBScenarios
#    Scenario:Account closure
#    When User opens the T24 Url
#    Then User should be able to login to T24
#    Then The user should be able to fill the commandline
#    And navigate to find account option
#    Then open the account for performing closure
#    And click on perform closure
#    Then Click on validate
#    And Click on commit
#    Then click on accept override
#    Then Verify whether the transaction complete message is displayed
#    And switch back to main window
#    Then The user should be able to fill the commandline
#    Then navigate to find account option
#    Then open the account for performing closure
#    And Verify whether the account status changed to Pending Closure
#  @accountclosure
#  Scenario:Account Closure status
#    When User opens the T24 Url
#    Then User should be able to login to T24
#    Then The user should be able to fill the commandline
#    Then open the account that need to be closed
#    Then verify whether the account is closed
#  @beforeCOBScenariosdemo
#Scenario:Deposit Creation
#  When User opens the T24 Url
#  Then User should be able to login to T24
#  Then The user should be able to fill the commandline
#  And  Navigate to Product catalog
#  Then click on fixed Term non church
#  And fill the customer number in customer field
#  Then Click on validate
#  Then Enter the commitment amount
#  And provide the rollover period
#  Then Enter the payout details
#  Then Click on validate
#  And Click on commit for deposit creation
#  Then click on accept override
#  Then Verify whether the transaction complete message is displayed
#  And switch back to main window
#  Then The user should be able to fill the commandline
#  And navigate to find deposit option
#  Then open the newly created deposit
#  Then Verify the newly created deposit
#  And switch back to main window
#  Then The user should be able to fill the commandline
#  Then The user should be able to navigate to Account transfer button
#  And Enter the details in the account transfer fields for deposit funding
#  Then Click on validate
#  And Click on commit
#  Then Verify whether the transaction complete message is displayed after commiting
#
#
#  @beforeCOBScenariosdemo1
#  Scenario:Deposit Closure
#    When User opens the T24 Url
#    Then User should be able to login to T24
#    Then The user should be able to fill the commandline
#    And navigate to find deposit for deposit closure
#    Then open the newly created deposit
#    And Click on Redeem Deposit
#    Then from the newly opened window select the reason for account closure
#    Then Click on validate
#    And Enter the deposit payout details
#    Then Click on validate
#    And Click on commit
#    Then click on accept override
#    Then Verify whether the transaction complete message is displayed after redeem deposit
#    And verify simulation status becomes Completed - Successfully
#    And switch back to main window
#    Then The user should be able to fill the commandline
#    And navigate to find deposit for deposit closure
#    Then open the newly created deposit
#    And click on redemptionstatement
#    Then perform the deposit redemption
#    Then Click on validate
#    And Enter the deposit payout details
#    Then Click on validate
#    And Click on commit
#    Then click on accept override
#    Then Verify whether the transaction complete message is displayed
#    And switch back to main window
#    Then The user should be able to fill the commandline
#    And navigate to find deposit for deposit closure
#    Then open the deposit for closure
#    And verify the deposit closure
#
#  @Depositclosure
#  Scenario:Deposit Closure status
#    When User opens the T24 Url
#    Then User should be able to login to T24
#    Then The user should be able to fill the commandline
#    Then open the Deposit that need to be closed
#    Then verify whether the Deposit is closed

#  @beforeCOBScenarios
#    Scenario:Loan Creation
#    When User opens the T24 Url
#    Then User should be able to login to T24
#    Then The user should be able to fill the commandline
#    And Navigate to Product catalog
#    Then click on commercial loan New Arrangement
#    And fill the customer number in customer field
#    Then Click on validate
#    And Provide the loan interest details
#    Then enter the commitment amount and term
#    And Select the account mandate record
#    Then Click on validate after entering loan details
#    And Click on commit
#    Then Verify whether the transaction complete message is displayed
#    And switch back to main window
#    And The User clicks on signoff
#    When close all the other opened windows
#    Then Login to authoriser account
#    Then The user should be able to fill the commandline
#    And user should be able to navigate to find unauthorised loan
#    Then open the newly created loan
#    And authorise the loan
#    Then Verify whether the transaction complete message is displayed
#    And switch back to main window
#    And The User clicks on signoff
#    Then User should be able to login to T24
#    Then The user should be able to fill the commandline
#    And user should be able to navigate to find loan
#    Then open the newly created loan
#    Then verify the newly created loan
#    Then switch back to main window
#    When close all the other opened windows
#    Then The user should be able to fill the commandline
#    And user should be able to navigate to find loan
#    Then open the Newly created loan
#    And Click on desbursement
#    Then Enter the desbursement details for loan
#    Then Click on validate
#    And Click on commit
#    Then click on accept override
#    Then Verify whether the transaction complete message is displayed
#    Then switch back to main window
#    When close all the other opened windows
#    And The User clicks on signoff
#    Then Login to authoriser account
#    Then The user should be able to fill the commandline
#    And user should be able to navigate to find loan
#    Then open the Newly created loan
#    And Authorise the desbusement for the loan
#    Then switch back to main window
#    Then The user should be able to fill the commandline
#    And user should be able to navigate to find loan
#    Then open the Newly created loan
#    Then Verify whether the status of the loan is current


#  @beforeCOBScenariosdemoloan1
#    Scenario:Loan Closure
#    When User opens the T24 Url
    #Then User should be able to login to T24
   # Then The user should be able to fill the commandline
    #And user should be able to navigate to find loan
  # Then open the loan that need to be closed
#    And Click on desbursement
#    Then Enter the desbursement details for loan
#    Then Click on validate
#    And Click on commit
#    Then click on accept override
#    Then Verify whether the transaction complete message is displayed
#    Then switch back to main window
#    And The User clicks on signoff
#    Then Login to authoriser account
#    Then The user should be able to fill the commandline
#    And user should be able to navigate to find loan
#    Then open the loan that need to be closed
#    And Authorise the desbusement for the loan
#    Then switch back to main window
#    And The User clicks on signoff
#    When close all the other opened windows
#    Then User should be able to login to T24
#    Then The user should be able to fill the commandline
#    And user should be able to navigate to find loan
#    Then open the loan that need to be closed
#    And Click on request payoff
#    Then from the newly opened window select the reason for loan closure
#    Then Click on validate
#    And Click on commit
#    Then click on accept override
#    And verify simulation status becomes Executed - Successfully
#    Then switch back to main window
#    Then The user should be able to fill the commandline
#    And user should be able to navigate to find loan
#    Then open the loan that need to be closed
#    Then click on the payoff statement from overfiew screen of loan
#    Then switch back to main window
#    Then The user should be able to fill the commandline
#    And user should be able to navigate to find loan
#    Then open the loan that need to be closed
#    And click on loan payoff
#    Then Enter the loan payoff details
#    Then Click on validate
#    And Click on commit
#    Then click on accept override
#    Then Verify whether the transaction complete message is displayed
#    Then switch back to main window
#    And The User clicks on signoff
#    When close all the other opened windows
#    Then Login to authoriser account
#    Then The user should be able to fill the commandline
#    And user should be able to navigate to find loan
#    Then open the loan that need to be closed
#   Then authorise loanpayoff
#    Then switch back to main window
#    Then The user should be able to fill the commandline
#    And user should be able to navigate to find loan
#    Then open the loan that need to be closed
#    And verify whether the loan status is moved to pending closure

#  @loanclosestatus
#  Scenario:Loan Closure status
#    When User opens the T24 Url
#    Then User should be able to login to T24
#    Then The user should be able to fill the commandline
#    And user should be able to navigate to find closed loan
#    Then open the loan that need to be closed
#    Then verify whether the loan is closed

#     @beforeCOBScenariosdemo1
#      Scenario:Deposit partial withdrawal
#      When User opens the T24 Url
#      Then User should be able to login to T24
#      Then The user should be able to fill the commandline
#      And navigate to find deposit option for partial wthdrawal
#      Then open the deposit
#      And click on Partial withdrawal
#      Then Enter the partial withdrawal amount
#      Then Click on validate
#      And Click on commit
#      Then click on accept override
#      Then Verify whether the transaction complete message is displayed
#      And verify simulation status becomes Completed - Successfully
#      Then switch back to main window
#      Then The user should be able to fill the commandline
#      And navigate to find deposit option for partial wthdrawal
#      Then open the deposit
#      And Click on the withdrawal statement
#      Then Proceed to partial withdrawal
#      Then Click on validate
#      And Click on commit
#      Then click on accept override
#      Then Verify whether the transaction complete message is displayed
#      Then switch back to main window
#      Then The user should be able to fill the commandline
#      And click on the IB-view of account entries
#      Then Enter the account number of deposit in the IB view of account entries
#      And Enter the date in ibview format
#      And click on find button
#      Then Check the narratives of Partial Withdrawal
#


      @firstday
      Scenario:Direct Debit
      When User opens the T24 Url
      Then User should be able to login to T24
      Then The user should be able to fill the commandline
      And navigate to find account option
      Then open the account for posting Direct Debit
      And click on Direct Debit
      Then Enter the details of direct debit
      Then Click on validate
      And Click on commit
      And Click on commit
      Then Verify whether the transaction complete message is displayed after committing DD


  @aftercob1
  Scenario:Direct Debit Narrative
    When User opens the T24 Url
    Then User should be able to login to T24
    Then The user should be able to fill the commandline
    And The user should be able to click on general enquiries buttom
    And click on the IB-view of account entries
    Then Enter the account number of Direct Debit
    And Enter the date in ibview format
    Then Click on find Button
    And verify the narratives of Direct Debit

#  @beforeCOBScenariosde
#  Scenario:Loan repayment
#  When User opens the T24 Url
#  Then User should be able to login to T24
#  Then The user should be able to fill the commandline
#  And user should be able to navigate to find loan
#  And open the account that need to perform the loan repayment
#  Then click on repayment button
#  And enter the repayment details
#  Then Click on validate
#  And Click on commit
#  Then click on accept override
#  Then Verify whether the transaction complete message is displayed
#  Then switch back to main window
#  Then The user should be able to fill the commandline
#  And The user should be able to click on general enquiries buttom
#  And click on the IB-view of account entries
#  Then Enter the account number of Loan repayment in the IB-view of account entries
#    Then Click on find Button
#  Then verify the narratives of loan repayment
  @firstday
    Scenario: Periodic payment internal
    When User opens the T24 Url
    Then User should be able to login to T24
    Then The user should be able to fill the commandline
    And navigate to find account option
    Then open the account that Periodic payment need to be applied
    And click on standing order
    Then Enter the details of periodic payment
    Then Click on validate
    And Click on commit
    Then Verify whether the transaction complete message is displayed after commiting

     @firstday
    Scenario: Periodic payment External
    When User opens the T24 Url
    Then User should be able to login to T24
    Then The user should be able to fill the commandline
    And navigate to find account option
    Then open the account that external Periodic payment need to be applied
    And click on standing order
    Then Enter the details of external periodic payment
    Then Click on validate
    And Click on commit
    Then Verify whether the transaction complete message is displayed after commiting
































































