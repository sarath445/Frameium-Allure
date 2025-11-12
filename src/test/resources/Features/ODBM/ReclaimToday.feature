Feature: Search the author
  @Re

   Scenario: Searching Author in Reclaim today

      Given user hovering to Our Ministry title and click "Reclaim Today" option
      When user entering the feelings "Freedom" and hit enterkeys
      And user click on the Advanced search toggle button and verify
      Then user select the author name "Hannah shou" in the dropdown

  @Mo
    Scenario: More option is clickable
       Then User opens Url "https://www.odbm.org/"
       Given user hovering to Our Ministry title and click "Reclaim Today" option
       When user click on the more option and verify whether it is enabled or disabled
       Then user need to verify the more words based on the feelings




