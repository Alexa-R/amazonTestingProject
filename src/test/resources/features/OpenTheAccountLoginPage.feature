Feature: Opening the account login page

  Background:
    Given site "https://www.amazon.com" is opened

  Scenario: Opening the account login page after clicking on the Returns&Orders area,
  provided that the user is not logged in
    When click on the Returns&Orders area on the header
    Then Login page is opened

  Scenario: Opening the account login page after clicking on the Sign in button on Account&Lists menu,
  provided that the user is not logged in
    When hover over the Account&Lists on the page header
    And click on the Sign in button on the Account and Lists menu
    Then Login page is opened