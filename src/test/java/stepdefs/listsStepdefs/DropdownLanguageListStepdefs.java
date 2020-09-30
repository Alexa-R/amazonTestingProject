package stepdefs.listsStepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import services.elementsServices.listsServices.DropdownLanguageListService;

public class DropdownLanguageListStepdefs {
    private final DropdownLanguageListService dropdownLanguageListService;

    public DropdownLanguageListStepdefs(DropdownLanguageListService dropdownLanguageListService) {
        this.dropdownLanguageListService = dropdownLanguageListService;
    }

    @And("select the Espanol - ES language from the dropdown language list")
    public void selectTheEspanolESLanguageFromTheDropdownLanguageList() {
        dropdownLanguageListService.selectSpanishInLanguageList();
    }

    @Then("the Espanol - ES is selected in the dropdown language list")
    public void theEspanolESIsSelectedInTheDropdownLanguageList() {
        dropdownLanguageListService.isSpanishInLanguageListSelected();
    }
}
