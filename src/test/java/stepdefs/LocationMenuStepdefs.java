package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import services.elementsServices.menusServices.LocationMenuService;

import static org.junit.Assert.assertTrue;

public class LocationMenuStepdefs {
    private final LocationMenuService locationMenuService;

    public LocationMenuStepdefs(LocationMenuService locationMenuService) {
        this.locationMenuService = locationMenuService;
    }

    @And("click on Countries Dropdown Box on Location Menu")
    public void clickOnCountriesDropdownBoxOnLocationMenu() {
        locationMenuService.clickOnCountryList();
    }

    @Then("the name of selected country is displayed in the title of the dropdown box")
    public void theNameOfSelectedCountryIsDisplayedInTheTitleOfTheDropdownBox() {
        assertTrue(locationMenuService.getCountryBoxText().contains("United States"));
    }

    @And("click Done on Location Menu")
    public void clickDoneOnLocationMenu() {
        locationMenuService.clickOnDoneButton();
    }
}
