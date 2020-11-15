package stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import helper.Logger;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class NavigationStepdefs {

    @After
    public void closeBrowser() {
        closeWebDriver();
        Logger.info("Browser is closed");
    }

    @Given("site {string} is opened")
    public void siteIsOpened(String url) {
        open(url);
        getWebDriver().manage().window().maximize();
        Logger.info("Site is opened");
    }
}
