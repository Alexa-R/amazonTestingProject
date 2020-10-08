package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import services.SearchResultPageService;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.junit.Assert.assertTrue;

public class SearchResultStepdefs {
    private final SearchResultPageService searchResultPageService;

    public SearchResultStepdefs(SearchResultPageService searchResultPageService) {
        this.searchResultPageService = searchResultPageService;
    }

    @And("open the first result on the search result page")
    public void openTheFirstResultOnTheSearchResultPageUsingTheSearchField() {
        searchResultPageService.openFirstProduct();
    }

    @Then("the first element contains {string} in description on the search result page")
    public void theFirstElementIsDisplayedAccordingToTheFilterOnTheSearchResultPage(String arg0) {
        assertTrue(searchResultPageService.isFilterWorked(arg0));
    }

    @When("click on the sorting menu on the search result page")
    public void clickOnTheSortingMenuOnTheSearchResultPageUsingTheSearchField() {
        searchResultPageService.clickOnSortMenu();
    }

    @Then("the first element is displayed according to the sorting on the search result page")
    public void theFirstElementIsDisplayedAccordingToTheSortingOnTheSearchResultPageUsingTheSearchField() {
        assertTrue(searchResultPageService.isSortingWorked() > 0);
    }

    @And("hover over average user review on the on the search result page")
    public void hoverOverAverageUserReviewOnTheOnTheSearchResultPageUsingTheSearchField() {
        searchResultPageService.hoverAvgCustomerReview();
    }

    @Then("average user review value is greater than {int} and less than {int}")
    public void averageUserReviewValueIsGreaterThanAndLessThan(int arg0, int arg1) {
        assertTrue(Double.parseDouble(searchResultPageService.getValueOfReview()) > arg0
                && Double.parseDouble(searchResultPageService.getValueOfReview()) <= arg1);
    }
}
