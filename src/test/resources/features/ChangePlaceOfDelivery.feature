Feature: Change delivery location

  Scenario: user successfully change delivery location on the page header
    Given site "https://www.amazon.com" is opened
    When click on Location Box on the page header
    And click on Countries Dropdown Box on Location Menu
    And select United States on Dropdown Countries List
    Then the name of selected country is displayed in the title of the dropdown box