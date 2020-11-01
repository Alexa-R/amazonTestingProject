Feature: Add item to cart

  Background:
    Given site "https://www.amazon.com" is opened
    And click on Location Box on the page header
    And click on Countries Dropdown Box on Location Menu
    And select United States on Dropdown Countries List
    And click Done on Location Menu
    And search for "Apple MacBook Pro 15" in the search field on the page header
    And open the first result on the search result page


  Scenario: user successfully adds a product to the cart
    When click on the button Add to cart on the product cart page
    Then the message that the item has been added is displayed

