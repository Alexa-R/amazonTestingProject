Feature: View items in the cart

  Background:
    Given site "https://www.amazon.com" is opened
    And search for "Apple MacBook Pro 15" in the search field on the page header
    And open the first result on the search result page using the search field
    And click on the button Add to cart on the product cart page using the search field

  Scenario: Displaying the Cart right panel after adding an item to the cart
    Then is the Cart right panel displayed