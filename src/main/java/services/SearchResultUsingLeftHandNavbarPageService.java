package services;

import pages.SearchResultUsingLeftHandNavbarPage;

public class SearchResultUsingLeftHandNavbarPageService {
    private final SearchResultUsingLeftHandNavbarPage searchResultUsingLeftHandNavbarPage;

    public SearchResultUsingLeftHandNavbarPageService(SearchResultUsingLeftHandNavbarPage searchResultUsingLeftHandNavbarPage) {
        this.searchResultUsingLeftHandNavbarPage = searchResultUsingLeftHandNavbarPage;
    }

    public void openFirstElectronicsProduct() {
        searchResultUsingLeftHandNavbarPage.getItemsElectronicsCollection().get(0).click();
    }
}
