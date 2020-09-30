package services.elementsServices.barsServices;

import pages.elements.bars.LeftHandNavbar;

public class LeftHandNavbarService {
    private final LeftHandNavbar leftHandNavbar;

    public LeftHandNavbarService(LeftHandNavbar leftHandNavbar) {
        this.leftHandNavbar = leftHandNavbar;
    }

    public void clickElectronicsCategory() {
        leftHandNavbar.getCategoryItems().get(0).click();
    }
}
