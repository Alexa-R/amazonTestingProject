Feature: Sorting on the search result page

  Background:
    Given site "https://www.amazon.com" is opened
      And search for "Apple MacBook Pro 15" in the search field on the page header

  Scenario: Sort products by Price: High to Low
    When click on the sorting menu on the search result page
    And click on the Price: High to Low parameter on the sorting menu
    Then the first element is displayed according to the sorting on the search result page