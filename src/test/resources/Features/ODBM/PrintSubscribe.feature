Feature: Print subscription

  @pn
  Scenario: Print subscription of an user
    Given User opens Url "https://www.odbm.org/"
    When User click on the print subscriber

  @pn1
  Scenario: validate and select the monthly subscription
    Given User opens Url "https://www.odbm.org/"
    When User click on the print subscriber
    Then user validate and click the start monthly subscription

  @pn2
  Scenario: validate and frequently select give monthly and once
    Given User opens Url "https://www.odbm.org/"
    When User click on the print subscriber
    Then user validate and click the start monthly subscription
    And user verify all the offers in the page

