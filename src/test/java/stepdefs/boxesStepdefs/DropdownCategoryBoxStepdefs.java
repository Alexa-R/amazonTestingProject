package stepdefs.boxesStepdefs;

import io.cucumber.java.en.Then;
import services.elementsServices.boxesServies.DropdownCategoryBoxService;

public class DropdownCategoryBoxStepdefs {
    private final DropdownCategoryBoxService dropdownCategoryBoxService;

    public DropdownCategoryBoxStepdefs(DropdownCategoryBoxService dropdownCategoryBoxService) {
        this.dropdownCategoryBoxService = dropdownCategoryBoxService;
    }

    @Then("click on the product category number 3 on the dropdown list")
    public void theDropdownListIsDisplayed() {
        dropdownCategoryBoxService.clickOnThirdCategory();
    }
}
