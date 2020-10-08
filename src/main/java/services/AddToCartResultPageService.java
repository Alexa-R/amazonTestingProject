package services;

import com.codeborne.selenide.Condition;
import pages.AddToCartResultPage;

public class AddToCartResultPageService {
    private final AddToCartResultPage addToCartResultPage;

    public AddToCartResultPageService(AddToCartResultPage addToCartResultPage) {
        this.addToCartResultPage = addToCartResultPage;
    }

    public boolean isItemAdded() {
        return addToCartResultPage.getConfirmMessage().should(Condition.visible).isDisplayed();
    }

    public void clickCartButton() {
        addToCartResultPage.getCartButton().click();
    }
}
