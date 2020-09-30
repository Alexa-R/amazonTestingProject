package services;

import pages.SearchResultUsingSearchFieldPage;

public class SearchResultUsingSearchFieldPageService {
    private final SearchResultUsingSearchFieldPage searchResultUsingSearchFieldPage;

    public SearchResultUsingSearchFieldPageService(SearchResultUsingSearchFieldPage searchResultUsingSearchFieldPage) {
        this.searchResultUsingSearchFieldPage = searchResultUsingSearchFieldPage;
    }

    public void openFirstProduct() {
        if (searchResultUsingSearchFieldPage.getItemsWithAmazonChoiceCollection().get(0).isDisplayed()) {
            searchResultUsingSearchFieldPage.getItemsWithAmazonChoiceCollection().get(0).click();
        } else if (searchResultUsingSearchFieldPage.getItemsCollection().get(0).isDisplayed()) {
            searchResultUsingSearchFieldPage.getItemsCollection().get(0).click();
        } else if (searchResultUsingSearchFieldPage.getItemsWithAdCollection().get(0).isDisplayed()) {
            searchResultUsingSearchFieldPage.getItemsWithAdCollection().get(0).click();
        } else {
            searchResultUsingSearchFieldPage.getItemsWithDoubleAdCollection().get(0).click();
        }
    }

    public boolean isItemWithFilterDisplayed() {
        return searchResultUsingSearchFieldPage.getItemsWithFilterCollection().get(0).isDisplayed();
    }

    public void clickOnSortingMenu() {
        searchResultUsingSearchFieldPage.getSortingMenu().click();
    }

    public boolean isItemWithSortingDisplayed() {
        return searchResultUsingSearchFieldPage.getItemsWithSortingCollection().get(0).isDisplayed();
    }

    public void hoverOverAvgCustomerReviewOfFirstItem() {
        if (searchResultUsingSearchFieldPage.getAvgCustomerReviewCollection().get(0).isDisplayed()) {
            searchResultUsingSearchFieldPage.getAvgCustomerReviewCollection().get(0).hover();
        } else {
            searchResultUsingSearchFieldPage.getAvgCustomerReviewCollection().get(1).hover();
        }
    }
}
