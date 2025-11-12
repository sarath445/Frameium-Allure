Feature: Shopping
  @Clo
  Scenario:
    Then User opens Url "https://www.odbm.org/"
    Given user hovering to Our Ministry title and click "Reclaim Today" option
    When user mouse hovering to Shop and click the "clothing" option from the dropdown
    Then user should select the size of the costumes "XL" in the dropdown

  @Cl2
  Scenario:
    Then User opens Url "https://www.odbm.org/"
    Given user hovering to Our Ministry title and click "Reclaim Today" option
    When user mouse hovering to Shop and click the "clothing" option from the dropdown
    Then user should select the size of the costumes "XL" in the dropdown
    And user adding some quantity of items to the cart

  @Cl3
  Scenario:
    Then User opens Url "https://www.odbm.org/"
    Given user hovering to Our Ministry title and click "Reclaim Today" option
    When user mouse hovering to Shop and click the "clothing" option from the dropdown
    Then user should select the size of the costumes "XL" in the dropdown
    And user is able to add to cart and view the added items


