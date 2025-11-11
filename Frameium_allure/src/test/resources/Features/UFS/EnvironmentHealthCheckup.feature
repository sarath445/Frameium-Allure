Feature:Environmental

  Background:close
    When close all the other opened windows
  @environmentalcheckup1
  Scenario:T24 Date sync check SIT
    When User opens the SIT T24 Url
    Then User should be able to login to T24
    Then The user should be able to fill the commandline for checking Dates
    Then check whether the date is in Sync
    Then switch back to main window

  @environmentalcheckup1
  Scenario:T24 health check SIT
    When User opens the SIT T24 Url
    Then User should be able to login to T24
    Then The user should be able to fill the commandline
    Then check whether T24 is up and running
  @environmentalcheckup1
  Scenario:IBM health checkup SIT
    When User opens the SIT IBM  URL
    When Login to SIT IBM
    Then click on register client
    Then retrieve the client numberr
    Then Check the client maintenance SIT
  @environmentalcheckup
  Scenario:IB Health checkup SIT
    When User opens the SIT IB URL
    When login with username and password of SIT IB
   # And click on Go to Accounts
    Then verify whether the IB details are displayed
    Then logout from Ib

  @environmentalcheckup1
  Scenario:T24 Date sync check UAT
  When User opens the UAT T24 Url
  Then User should be able to login to UAT T24
 Then The user should be able to fill the commandline for Checking Dates
  Then check whether the date is in Sync
   Then switch back to main window
  @environmentalcheckup1
  Scenario:T24 health check UAT
    When User opens the UAT T24 Url
    Then User should be able to login to UAT T24
    Then The user should be able to fill the commandline
    Then check whether T24 is up and running

  @environmentalcheckup1
  Scenario:IBM health checkup UAT
  When User opens the UAT IBM URL
    When Login to UAT IBM
    Then click on register client
    Then retrieve the client number
    Then Check the client maintenance UAT



  @environmentalcheckup`1
  Scenario:IB Health checkup UAT
    When User opens the UAT IB URL
   When I login with username and password of UAT IB
    And click on Go to Accounts
    Then verify whether the IB details are displayed
    Then logout from Ib

