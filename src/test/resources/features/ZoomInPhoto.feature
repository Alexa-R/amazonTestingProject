Feature: Zoom in

  Background:
    Given site "https://www.amazon.com" is opened
    And open the left hand navbar on the page header
    And click on the category Electronics on the left hand navbar
    And click on the Accessories&Supplies in the list of subcategories of the Electronics category
    And open the first result on the search result page

  Scenario: Zoom in the product image
    When click on the main image on the product cart page
    And click on the active image on the picture window
    Then the zoom brings the image closer on the picture window