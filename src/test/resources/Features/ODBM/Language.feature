Feature: language selection
  @ln
  Scenario: validating language selection
    Given User opens Url "https://www.odbm.org/"
    When user proceeding with the language selection of "French"


   @ln1
  Scenario Outline: validating changing of website
    Given User opens Url "https://www.odbm.org/"
     When user proceeding with the multiple language selection of "<language>"
    Then user should verify the current domain while redirecting "<expectedDomain>"
     Examples:
       | language  | expectedDomain                  |
       | Malayalam | https://malayalam-odb.org/      |
       | French    | https://notrepainquotidien.org/ |
       | Russian   | https://russian-odb.org/        |


  @ln2
  Scenario: validating the language selection and selecting category
    Given User opens Url "https://www.odbm.org/"
    When user proceeding with the language selection of "Tamil"
    Then user select the daily bread category as based on the language

