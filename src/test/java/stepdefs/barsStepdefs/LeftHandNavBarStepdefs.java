package stepdefs.barsStepdefs;

import io.cucumber.java.en.And;
import services.elementsServices.barsServices.LeftHandNavbarService;

public class LeftHandNavBarStepdefs {
    private final LeftHandNavbarService leftHandNavbarService;

    public LeftHandNavBarStepdefs(LeftHandNavbarService leftHandNavbarService) {
        this.leftHandNavbarService = leftHandNavbarService;
    }

    @And("click on the category Electronics the left hand navbar")
    public void clickOnTheCategoryElectronicsTheLeftHandNavbar() {
        leftHandNavbarService.clickElectronicsCategory();
    }
}
