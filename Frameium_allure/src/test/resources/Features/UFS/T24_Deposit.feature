
Feature:Deposit
Background:close
When close all the other opened windows

@firstday
Scenario:Deposit Creation
When User opens the T24 Url
Then User should be able to login to T24
Then The user should be able to fill the commandline
And  Navigate to Product catalog
Then click on fixed Term non church
And fill the customer number in customer field
Then Click on validate
Then Enter the commitment amount
And provide the rollover period
Then Enter the payout details
Then Click on validate
And Click on commit for deposit creation
Then click on accept override
Then Verify whether the transaction complete message is displayed
And switch back to main window
Then The user should be able to fill the commandline
And navigate to find deposit option
Then open the newly created deposit
Then Verify the newly created deposit
And switch back to main window
Then The user should be able to fill the commandline
Then The user should be able to navigate to Account transfer button
And Enter the details in the account transfer fields for deposit funding
Then Click on validate
And Click on commit
Then Verify whether the transaction complete message is displayed after commiting



@firstday
Scenario:Deposit Closure
When User opens the T24 Url
Then User should be able to login to T24
Then The user should be able to fill the commandline
And navigate to find deposit for deposit closure
Then open the newly created deposit
And Click on Redeem Deposit
Then from the newly opened window select the reason for account closure
Then Click on validate
And Enter the deposit payout details
Then Click on validate
And Click on commit
Then click on accept override
Then Verify whether the transaction complete message is displayed after redeem deposit
And verify simulation status becomes Completed - Successfully
And switch back to main window
Then The user should be able to fill the commandline
And navigate to find deposit for deposit closure
Then open the newly created deposit
And click on redemptionstatement
Then perform the deposit redemption
Then Click on validate
And Enter the deposit payout details
Then Click on validate
And Click on commit
Then click on accept override
Then Verify whether the transaction complete message is displayed
And switch back to main window
Then The user should be able to fill the commandline
And navigate to find deposit for deposit closure
Then open the deposit for closure
And verify the deposit closure


@aftercob
Scenario:Deposit Closure status
When User opens the T24 Url
Then User should be able to login to T24
Then The user should be able to fill the commandline
Then open the Deposit that need to be closed
Then verify whether the Deposit is closed

@firstday
Scenario:Deposit partial withdrawal
When User opens the T24 Url
Then User should be able to login to T24
Then The user should be able to fill the commandline
And navigate to find deposit option for partial wthdrawal
Then open the deposit
And click on Partial withdrawal
Then Enter the partial withdrawal amount
Then Click on validate
And Click on commit
Then click on accept override
Then Verify whether the transaction complete message is displayed
And verify simulation status becomes Completed - Successfully
Then switch back to main window
Then The user should be able to fill the commandline
And navigate to find deposit option for partial wthdrawal
Then open the deposit
And Click on the withdrawal statement
Then Proceed to partial withdrawal
Then Click on validate
And Click on commit
Then click on accept override
Then Verify whether the transaction complete message is displayed
Then switch back to main window
Then The user should be able to fill the commandline
  And The user should be able to click on general enquiries buttom
And click on the IB-view of account entries
Then Enter the account number of deposit in the IB view of account entries
And Enter the date in ibview format
And click on find button
Then Check the narratives of Partial Withdrawal