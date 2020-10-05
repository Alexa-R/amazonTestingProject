package services;

import pages.ShoppingCartPage;

public class ShoppingCartPageService {
    private final ShoppingCartPage shoppingCartPage;

    public ShoppingCartPageService(ShoppingCartPage shoppingCartPage) {
        this.shoppingCartPage = shoppingCartPage;
    }

    public void clickQuantityButton() {
        shoppingCartPage.getQuantityButton().click();
    }

    public void clickOnDeleteLink() {
        shoppingCartPage.getDeleteLink().click();
    }

    public String isQuantityButtonContains() {
        return shoppingCartPage.getQuantityButton().getText();
    }

    public boolean isTitleContainsEmpty() {
        return shoppingCartPage.getIsCartEmpty().isDisplayed();
    }
}
