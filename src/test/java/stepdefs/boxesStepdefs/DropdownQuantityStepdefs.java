package stepdefs.boxesStepdefs;

import io.cucumber.java.en.And;
import services.elementsServices.boxesServies.DropdownQuantityBoxServices;


public class DropdownQuantityStepdefs {
    private final DropdownQuantityBoxServices dropdownQuantityBoxServices;

    public DropdownQuantityStepdefs(DropdownQuantityBoxServices dropdownQuantityBoxServices) {
        this.dropdownQuantityBoxServices = dropdownQuantityBoxServices;
    }

    @And("select choose an amount equal to two in the dropdown quantity list")
    public void selectChooseAnAmountEqualToTwoInTheDropdownQuantityList() {
        dropdownQuantityBoxServices.selectTwoInTheDropdownQuantityList();
    }
}
