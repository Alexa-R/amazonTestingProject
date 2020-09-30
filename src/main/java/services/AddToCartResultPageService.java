package services;

import pages.AddToCartResultPage;

public class AddToCartResultPageService {
    private final AddToCartResultPage addToCartResultPage;

    public AddToCartResultPageService(AddToCartResultPage addToCartResultPage) {
        this.addToCartResultPage = addToCartResultPage;
    }

    public boolean isTitleContainsAddedDisplayed(String added) {
        if (addToCartResultPage.getIsTitleContainsAddedRightPanel().isDisplayed()) {
            return addToCartResultPage.getIsTitleContainsAddedRightPanel().getText().contains(added);
        } else {
            return addToCartResultPage.getIsTitleContainsAddedOnPage().getText().contains(added);
        }
    }

    public void clickCartButton() {
        if (addToCartResultPage.getCartButtonRightPanel().isDisplayed()) {
            addToCartResultPage.getCartButtonRightPanel().click();
        } else {
            addToCartResultPage.getCartButtonOnPage().click();
        }
    }
}
