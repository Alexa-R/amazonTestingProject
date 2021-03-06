Feature: Manipulation of the item in the cart

  Background:
    Given site "https://www.amazon.com" is opened
    And click on Location Box on the page header
    And click on Countries Dropdown Box on Location Menu
    And select United States on Dropdown Countries List
    And click Done on Location Menu
    And search for "Apple MacBook Pro 15" in the search field on the page header
    And open the first result on the search result page
    And click on the button Add to cart on the product cart page
    And click on the Cart button on the Add cart result page

  Scenario: Increase the quantity of item
    When click on the Quantity dropdown box of the first item on the Shopping cart page
    And select choose an amount equal to two in the dropdown quantity list
    Then the Quantity dropdown box contains in the title "2"

  Scenario: Remove item from cart
    When click on the Delete link on the Shopping cart page
    Then the Shopping cart is empty

