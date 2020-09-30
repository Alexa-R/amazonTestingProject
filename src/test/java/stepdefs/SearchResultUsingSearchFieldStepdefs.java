package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import services.SearchResultUsingSearchFieldPageService;

import static org.junit.Assert.assertTrue;

public class SearchResultUsingSearchFieldStepdefs {
    private final SearchResultUsingSearchFieldPageService searchResultUsingSearchFieldPageService;

    public SearchResultUsingSearchFieldStepdefs(SearchResultUsingSearchFieldPageService searchResultUsingSearchFieldPageService) {
        this.searchResultUsingSearchFieldPageService = searchResultUsingSearchFieldPageService;
    }

    @And("open the first result on the search result page using the search field")
    public void openTheFirstResultOnTheSearchResultPageUsingTheSearchField() {
        searchResultUsingSearchFieldPageService.openFirstProduct();
    }

    @Then("the first element is displayed according to the filter on the search result page using the search field")
    public void theFirstElementIsDisplayedAccordingToTheFilterOnTheSearchResultPage() {
        assertTrue(searchResultUsingSearchFieldPageService.isItemWithFilterDisplayed());
    }

    @When("click on the sorting menu on the search result page using the search field")
    public void clickOnTheSortingMenuOnTheSearchResultPageUsingTheSearchField() {
        searchResultUsingSearchFieldPageService.clickOnSortingMenu();
    }

    @Then("the first element is displayed according to the sorting on the search result page using the search field")
    public void theFirstElementIsDisplayedAccordingToTheSortingOnTheSearchResultPageUsingTheSearchField() {
        assertTrue(searchResultUsingSearchFieldPageService.isItemWithSortingDisplayed());
    }

    @And("hover over average user review on the on the search result page using the search field")
    public void hoverOverAverageUserReviewOnTheOnTheSearchResultPageUsingTheSearchField() {
        searchResultUsingSearchFieldPageService.hoverOverAvgCustomerReviewOfFirstItem();
    }
}
