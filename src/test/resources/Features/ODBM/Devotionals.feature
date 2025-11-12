Feature: Validate Devotionals
  @Dv
  Scenario: validating and clicking the All devotionals
    Given User opens Url "https://www.odbm.org/"
    When User mouseover to Daily devotionals and click the "All Daily Devotionals" option
    #Then it navigates to new page and validates the image as displayed and load properly

  @Dv2
  Scenario Outline: validating the date picking from the calendar
    Given User opens Url "https://www.odbm.org/"
    When User mouseover to Daily devotionals and click the "All Daily Devotionals" option
    #Then it navigates to new page and validates the image as displayed and load properly
    And user able to pick date from calendar with given "<date>"
    And user able to pick toDate from calendar with given "<ToDate>"

    Examples:
      | date              | ToDate          |  |
      | 15-June-2023      | 23-October-2024 |  |
      | 26-September-2022 | 17-March-2024   |  |


    @Dv3
    Scenario Outline: validating the date picking from the calendar
      Given User opens Url "https://www.odbm.org/"
      When User mouseover to Daily devotionals and click the "All Daily Devotionals" option
    #Then it navigates to new page and validates the image as displayed and load properly
      And user able to pick date from calendar with given "<date>"
      And user able to pick toDate from calendar with given "<ToDate>"
      Then user verify the devotional contents after selecting dates

      Examples:
        | date              | ToDate          |  |
        | 15-June-2023      | 23-October-2024 |  |
        | 26-September-2022 | 17-March-2024   |  |


    @Dv4
    Scenario: validating the header text on the screen
      Given User opens Url "https://www.odbm.org/"
      When User mouseover to Daily devotionals and click the "My Utmost for his highest" option
      Then User click on the Explore option
      And verify the text title of the screen "Devotional Collections"

    @Dv5
    Scenario: validating the header text on the screen
      Given User opens Url "https://www.odbm.org/"
      When User mouseover to Daily devotionals and click the "My Utmost for his highest" option
      Then User click on the Explore option
      And verify the text title of the screen "Devotional Collections"
      Then user search for a collection in the search field "purpose"

  @Dv6
  Scenario: validating the images on the screen
    Given User opens Url "https://www.odbm.org/"
    When User mouseover to Daily devotionals and click the "My Utmost for his highest" option
    Then User click on the Explore option
    And verify the text title of the screen "Devotional Collections"
    Then user search for a collection in the search field "purpose"
    And user verify the images under the collections

  @Dv7
  Scenario: verification of clicking the instagram option in Devotionals
    Given User opens Url "https://www.odbm.org/"
    When User mouseover to Daily devotionals and click the "My Utmost for his highest" option
    Then User scroll and click on the instagram button which is on the Devotional

  @Dv8
    Scenario: validating the social media button by using switch
    Given User opens Url "https://www.odbm.org/"
    When User mouseover to Daily devotionals and click the "My Utmost for his highest" option
    Then User scroll and click on the social media button "facebook" option
    And user is redirect to the social media page with url containing "facebook"
