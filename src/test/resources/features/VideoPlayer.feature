Feature: Video player

  Background:
    Given site "https://www.amazon.com/Super-Mario-3D-All-Stars-Nintendo-Switch/dp/B08G3MN6KP/ref=lp_16225016011_1_1?s=videogames-intl-ship&ie=UTF8&qid=1601976280&sr=1-1" is opened
    And click on the Video on the product cart page
    And run the video on the Video Window

  Scenario: run the video on the Video Window
    Then the video on the Video Window is played

  Scenario: pause the video on the Video Window
    When pause the video on the Video Window
    Then the video on the Video Window is not played

  Scenario: the video duration is more than 5 seconds
    Then the video duration is more than 5 seconds