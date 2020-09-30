package stepdefs;

import io.cucumber.java.en.Then;
import services.HomePageService;

import static org.junit.Assert.assertTrue;

public class HomePageStepdefs {
    private final HomePageService homePageService;

    public HomePageStepdefs(HomePageService homePageService) {
        this.homePageService = homePageService;
    }

    @Then("the slider is displayed on the home page")
    public void theSliderIsDisplayedOnTheHomePage() {
        assertTrue(homePageService.isSliderDisplayed());
    }
}
