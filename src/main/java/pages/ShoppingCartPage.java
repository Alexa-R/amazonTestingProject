package pages;

import com.codeborne.selenide.SelenideElement;
import helper.Locators;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ShoppingCartPage {
    private SelenideElement quantityButton = $(Locators.get(this.getClass().getSimpleName() + ".quantityButton"));
    private SelenideElement deleteLink = $(Locators.get(this.getClass().getSimpleName() + ".deleteLink"));
    private SelenideElement isCartEmpty = $(Locators.get(this.getClass().getSimpleName() + ".isCartEmpty"));

    public SelenideElement getQuantityButton() {
        return quantityButton;
    }

    public SelenideElement getDeleteLink() {
        return deleteLink;
    }

    public SelenideElement getIsCartEmpty() {
        return isCartEmpty;
    }
}
