Feature: Displaying an image on the product pages

  Background:
    Given site "https://www.amazon.com" is opened
    And search for "Apple MacBook Pro 15" in the search field on the page header
    And open the first result on the search result page using the search field

  Scenario: The displayed picture on the product card page using the search field is an image
    Then the landing picture on the product card page using the search field is the image