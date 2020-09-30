Feature: Add item to cart

  Background:
    Given site "https://www.amazon.com" is opened
    And search for "Apple MacBook Pro 15" in the search field on the page header
    And open the first result on the search result page using the search field

  Scenario: user successfully adds a product to the cart
    When click on the button Add to cart on the product cart page using the search field
    Then the message that the item has been "Added" is displayed

