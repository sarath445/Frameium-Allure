Feature: Account

Background:close
When close all the other opened windows


@firstday
Scenario:Account creation
When User opens the T24 Url
Then User should be able to login to T24
Then The user should be able to fill the commandline
And  Navigate to Product catalog
Then Click on At call investment church Account New Arrangement button
And Enter the customer number for creating At call Investment church in the customer field
Then Click on validate
And Select the account mandate record
And Click on commit the deal for creating account
Then Verify whether the transaction complete message is displayed after commiting
And switch back to main window
Then The user should be able to fill the commandline
Then navigate to find account option
And open the newly created account
Then Verify the newly created account

@firstday
Scenario:Account closure
When User opens the T24 Url
Then User should be able to login to T24
Then The user should be able to fill the commandline
And navigate to find account option
Then open the account for performing closure
And click on perform closure
Then Click on validate
And Click on commit
Then click on accept override
Then Verify whether the transaction complete message is displayed
And switch back to main window
Then The user should be able to fill the commandline
Then navigate to find account option
Then open the account for performing closure
And Verify whether the account status changed to Pending Closure
@aftercob
Scenario:Account Closure status
When User opens the T24 Url
Then User should be able to login to T24
Then The user should be able to fill the commandline
Then open the account that need to be closed
Then verify whether the account is closed