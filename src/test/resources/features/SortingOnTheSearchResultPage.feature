Feature: Sorting on the search result page

  Background:
    Given site "https://www.amazon.com" is opened
    When open the left hand navbar on the page header
    And click on the category Electronics on the left hand navbar
    And click on the Accessories&Supplies in the list of subcategories of the Electronics category

  Scenario: Sort products by Price: High to Low
    When click on the sorting menu on the search result page
    And click on the Price: High to Low parameter on the sorting menu
    Then the first element is displayed according to the sorting on the search result page