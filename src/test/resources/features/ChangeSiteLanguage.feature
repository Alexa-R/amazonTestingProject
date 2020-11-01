Feature: Change site language

  Background:
    Given site "https://www.amazon.com" is opened

  Scenario: Change the site language in the site header
    When hover over the dropdown language menu on the site header
    And select the Espanol - ES language from the dropdown language list
    And hover over the dropdown language menu on the site header
    Then the Espanol - ES is selected in the dropdown language list

  Scenario: Change site language in the site footer
    When scroll to page footer
    And click on the dropdown language menu on the site footer
    And select the Deutsch language from the Language Settings menu
    And click on Save Changes button on the Language Settings menu
    And scroll to page footer
    Then the "Deutsch" is displayed in the language menu on the site footer