package pages;

import com.codeborne.selenide.SelenideElement;
import helper.Locators;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AddToCartResultPage {
    private SelenideElement cartButton = $(Locators.get(this.getClass().getSimpleName() + ".cartButton"));
    private SelenideElement confirmMessage = $(By.xpath("//*[(contains(@id, 'confirm-text') and contains(@class, 'success')) or (@id = \"attachDisplayAddBaseAlert\" and contains(@class, \"success\"))]"));

    public SelenideElement getCartButton() {
        return cartButton;
    }

    public SelenideElement getConfirmMessage() {
        return confirmMessage;
    }
}

