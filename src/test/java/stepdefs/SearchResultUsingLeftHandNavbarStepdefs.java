package stepdefs;

import io.cucumber.java.en.And;
import org.openqa.selenium.support.ui.WebDriverWait;
import services.SearchResultUsingLeftHandNavbarPageService;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class SearchResultUsingLeftHandNavbarStepdefs {
    private final SearchResultUsingLeftHandNavbarPageService searchResultUsingLeftHandNavbarPageService;

    public SearchResultUsingLeftHandNavbarStepdefs(SearchResultUsingLeftHandNavbarPageService searchResultUsingLeftHandNavbarPageService) {
        this.searchResultUsingLeftHandNavbarPageService = searchResultUsingLeftHandNavbarPageService;
    }

    @And("open the first ElectronicsProduct on the search result page using left hand navbar")
    public void firstElectronicsProductIsOpenedOnTheSearchResultPageUsingCategoryMenu() {
        WebDriverWait wait = new WebDriverWait(getWebDriver(),50);
        searchResultUsingLeftHandNavbarPageService.openFirstElectronicsProduct();
    }
}
