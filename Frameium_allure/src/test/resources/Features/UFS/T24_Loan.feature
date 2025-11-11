Feature: Lending operations
  Background:close
    When close all the other opened windows

@firstday
Scenario:Loan Creation
When User opens the T24 Url
Then User should be able to login to T24
Then The user should be able to fill the commandline
And Navigate to Product catalog
Then click on commercial loan New Arrangement
And fill the customer number in customer field
Then Click on validate
And Provide the loan interest details
Then enter the commitment amount and term
And Select the account mandate record
Then Click on validate after entering loan details
And Click on commit
Then Verify whether the transaction complete message is displayed
And switch back to main window
And The User clicks on signoff
When close all the other opened windows
Then Login to authoriser account
Then The user should be able to fill the commandline
And user should be able to navigate to find unauthorised loan
Then open the newly created loan
And authorise the loan
Then Verify whether the transaction complete message is displayed
And switch back to main window
And The User clicks on signoff
Then User should be able to login to T24
Then The user should be able to fill the commandline
And user should be able to navigate to find loan
Then open the newly created loan
Then verify the newly created loan
Then switch back to main window
When close all the other opened windows
Then The user should be able to fill the commandline
And user should be able to navigate to find loan
Then open the Newly created loan
And Click on desbursement
Then Enter the desbursement details for loan
Then Click on validate
And Click on commit
Then click on accept override
Then Verify whether the transaction complete message is displayed
Then switch back to main window
When close all the other opened windows
And The User clicks on signoff
Then Login to authoriser account
Then The user should be able to fill the commandline
And user should be able to navigate to find loan
Then open the Newly created loan
And Authorise the desbusement for the loan
Then switch back to main window
Then The user should be able to fill the commandline
And user should be able to navigate to find loan
Then open the Newly created loan
Then Verify whether the status of the loan is current


@firstday2
Scenario:Loan Closure
  When close all the other opened windows
When User opens the T24 Url
Then User should be able to login to T24
Then The user should be able to fill the commandline
And user should be able to navigate to find loan
Then open the loan that need to be closed
And Click on request payoff
Then from the newly opened window select the reason for loan closure
Then Click on validate
And Click on commit
Then click on accept override
And verify simulation status becomes Executed - Successfully
Then switch back to main window
  When close all the other opened windows
Then The user should be able to fill the commandline
And user should be able to navigate to find loan
Then open the loan that need to be closed
Then click on the payoff statement from overfiew screen of loan
Then switch back to main window
Then The user should be able to fill the commandline
And user should be able to navigate to find loan
Then open the loan that need to be closed
And click on loan payoff
Then Enter the loan payoff details
Then Click on validate
And Click on commit
Then click on accept override
Then Verify whether the transaction complete message is displayed
Then switch back to main window
And The User clicks on signoff
When close all the other opened windows
Then Login to authoriser account
Then The user should be able to fill the commandline
And user should be able to navigate to find loan
Then open the loan that need to be closed
Then authorise loanpayoff
Then switch back to main window
Then The user should be able to fill the commandline
And user should be able to navigate to find loan
Then open the loan that need to be closed
And verify whether the loan status is moved to pending closure

@aftercob
Scenario:Loan Closure status
When User opens the T24 Url
Then User should be able to login to T24
Then The user should be able to fill the commandline
And user should be able to navigate to find closed loan
Then open the loan that need to be closed
Then verify whether the loan is closed

  @firstday
  Scenario:Loan repayment
    When User opens the T24 Url
    Then User should be able to login to T24
    Then The user should be able to fill the commandline
    And user should be able to navigate to find loan
    And open the account that need to perform the loan repayment
    Then click on repayment button
    And enter the repayment details
    Then Click on validate
    And Click on commit
    Then click on accept override
    Then Verify whether the transaction complete message is displayed
    Then switch back to main window
    Then The user should be able to fill the commandline
    And The user should be able to click on general enquiries buttom
    And click on the IB-view of account entries
    Then Enter the account number of Loan repayment in the IB-view of account entries
    Then Click on find Button
    Then verify the narratives of loan repayment