package services.elementsServices.barsServices;

import pages.elements.bars.LeftHandNavbar;

public class LeftHandNavbarService {
    private final LeftHandNavbar leftHandNavbar;

    public LeftHandNavbarService(LeftHandNavbar leftHandNavbar) {
        this.leftHandNavbar = leftHandNavbar;
    }

    public void clickFirstCategory() {
        leftHandNavbar.getProductCategoriesList().get(5).click();
    }

}
