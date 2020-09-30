package services.elementsServices.boxesServies;

import pages.elements.boxes.DropdownQuantityBox;

public class DropdownQuantityBoxServices {
    private final DropdownQuantityBox dropdownQuantityBox;

    public DropdownQuantityBoxServices(DropdownQuantityBox dropdownQuantityBox) {
        this.dropdownQuantityBox = dropdownQuantityBox;
    }

    public void selectTwoInTheDropdownQuantityList() {
        dropdownQuantityBox.getDropdownQuantityListTwo().click();
    }
}
