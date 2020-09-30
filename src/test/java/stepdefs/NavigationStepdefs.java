package stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class NavigationStepdefs {

    @After
    public void closeBrowser() {
        closeWebDriver();
    }

    @Given("site {string} is opened")
    public void siteIsOpened(String url) {
        open(url);
        getWebDriver().manage().window().maximize();
        getWebDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}
