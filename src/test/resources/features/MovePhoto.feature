Feature: Zoom in

  Background:
    Given site "https://www.amazon.com" is opened
    And search for "Apple MacBook Pro 15" in the search field on the page header
    And open the first result on the search result page using the search field

  Scenario: Zoom in the product image
    When click on the main image on the product cart page using the search field
    And click on the active image on the picture window
    And the zoom brings the image closer on the picture window