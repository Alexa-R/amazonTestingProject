package stepdefs;

import io.cucumber.java.en.And;
import services.elementsServices.listsServices.DropdownCountriesListService;

public class DropdownCountriesListStepdefs {
    private final DropdownCountriesListService dropdownCountriesListService;

    public DropdownCountriesListStepdefs(DropdownCountriesListService dropdownCountriesListService) {
        this.dropdownCountriesListService = dropdownCountriesListService;
    }

    @And("select United States on Dropdown Countries List")
    public void selectUnitedStatesOnDropdownCountriesList() {
        dropdownCountriesListService.selectUnitedStates();
    }
}
