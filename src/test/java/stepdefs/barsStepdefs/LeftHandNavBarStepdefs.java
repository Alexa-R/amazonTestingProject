package stepdefs.barsStepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import services.elementsServices.barsServices.LeftHandNavbarService;

import static org.junit.Assert.assertEquals;

public class LeftHandNavBarStepdefs {
    private final LeftHandNavbarService leftHandNavbarService;

    public LeftHandNavBarStepdefs(LeftHandNavbarService leftHandNavbarService) {
        this.leftHandNavbarService = leftHandNavbarService;
    }

    @And("click on the category Electronics on the left hand navbar")
    public void clickOnTheCategoryElectronicsTheLeftHandNavbar() {
        leftHandNavbarService.clickFirstCategory();
    }

}
