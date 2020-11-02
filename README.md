## 
##Test automation project
Web test automation project using IntelliJ IDEA Community, Java, 
Maven, JUnit, Selenium WebDriver, Page Object Model (POM), Allure.


## 
##Test Subject
I've picked www.amazon.com as a test subject for no particular reason. 
It's a large site and does have variety of features that we can play around with.

##
## Main classes/packages:
 * [СucumberRunnerTest.java](src/test/java/runner/CucumberRunnerTest.java) - a class that runs tests;
 * [pages](src/main/java/pages) - a package that stores classes with page descriptions;
 * [services](src/main/java/services) - a package containing classes that store methods for interacting with page elements;
 * [stepdefs](src/test/java/stepdefs) - a package containing classes with a description of test steps;
 * [features](src/test/resources/features) -  package containing test scripts.

##
## Tools
 * Selenium Webdriver
 * Selenide
 * Cucumber-JVM
 * Maven
 * JUnit
 * Allure

##
## Quick intro for developers
**Requirements**
* Java JDK 8

**Advised working environment**
* Eclipse / IntelliJ
* Maven

**Building with Maven**<br/>
The project can be built by executing the following command from project root folder:
<br/>mvn clean test

**Reporting**<br/>
The report can be built by executing the following command from project root folder:
<br/>mvn allure:serve

##
## Screenshots:

![Альтернативный текст](images/AllureReport.png)