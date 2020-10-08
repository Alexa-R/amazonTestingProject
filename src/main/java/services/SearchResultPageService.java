package services;

import com.codeborne.selenide.Condition;
import pages.SearchResultPage;

import java.util.Objects;

import static org.junit.Assert.assertTrue;

public class SearchResultPageService {
    private final SearchResultPage searchResultPage;

    public SearchResultPageService(SearchResultPage searchResultPage) {
        this.searchResultPage = searchResultPage;
    }

    public void openFirstProduct() {
        searchResultPage.getFirstItem().click();
    }

    public void clickOnSortMenu() {
        searchResultPage.getSortingMenu().click();
    }

    public boolean isFilterWorked(String filter){
        return searchResultPage.getFirstItem().getText().toUpperCase().contains(filter.toUpperCase());
    }

    public double isSortingWorked() {
        return Double.parseDouble(Objects.requireNonNull(searchResultPage.getFirstItemPrice().getValue())) - Double.parseDouble(searchResultPage.getSecondItemPrice().getValue());
    }
    public String getValueOfReview() {
        String reviewText = searchResultPage.getAvgReviewOnPopover().getText();
        String[] list = reviewText.split(" ");
        return list[0];
    }

    public void hoverAvgCustomerReview() {
        searchResultPage.getAvgCustomerReviewFirst().hover();
    }
}

