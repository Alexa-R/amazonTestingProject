Feature: Sign in to account

  Scenario: User cannot log into account due to incorrectly entered password
    Given site "https://www.amazon.com" is opened
    When hover over the Account&Lists on the page header
    And click on the Sign in button on the Account and Lists menu
    And enter "mechta2015@list.ru" in the text field on the mail sign in page
    And click on Continue on the mail sign in page
    And enter the wrong password "12345" in the text field on the password sign in page
    And click on Sign in on the password sign in page
    Then a field with a message about an incorrectly entered password is displayed