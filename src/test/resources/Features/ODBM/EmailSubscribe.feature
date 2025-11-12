Feature: Email subscription
  @Em
  Scenario: Email subscription of an user
    Given User opens Url "https://www.odbm.org/"
    When user click on the email subscriber
    Then user entering random firstnames "first last" format with first name length 6, lastname length 3, and email type "domainOrg"
    And user click subscribe the details
    Then user verify the successful message "Thank you for joining the Our Daily Bread video devotional email list!  You will start receiving the video daily devotionals in your inbox shortly."

