Feature: Video player

  Background:
    Given site "https://www.amazon.com" is opened
    And search for "Super Mario 3D All-Stars - Nintendo Switch" in the search field on the page header
    And open the first result on the search result page
    And click on the Video on the product cart page
    And run the video on the Video Window

  Scenario: run the video on the Video Window
    Then the video on the Video Window is played

  Scenario: pause the video on the Video Window
    When pause the video on the Video Window
    Then the video on the Video Window is not played

  Scenario: the video duration is more than 5 seconds
    Then the video duration is more than 5 seconds