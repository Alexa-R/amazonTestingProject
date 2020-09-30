package services;

import com.codeborne.selenide.SelenideElement;
import pages.HomePage;

public class HomePageService {
    private final HomePage homePage;

    public HomePageService(HomePage homePage) {
        this.homePage = homePage;
    }

    public boolean isSliderDisplayed() {
        return homePage.getSlider().isDisplayed();
    }
}
