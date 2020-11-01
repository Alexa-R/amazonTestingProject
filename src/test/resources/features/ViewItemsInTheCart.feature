Feature: View items in the cart

  Background:
    Given site "https://www.amazon.com" is opened
    And click on Location Box on the page header
    And click on Countries Dropdown Box on Location Menu
    And select United States on Dropdown Countries List
    And click Done on Location Menu
    And search for "Apple MacBook Pro 15" in the search field on the page header
    And open the first result on the search result page
    And click on the button Add to cart on the product cart page


  Scenario: Displaying the Cart right panel after adding an item to the cart
    Then is the Cart right panel displayed