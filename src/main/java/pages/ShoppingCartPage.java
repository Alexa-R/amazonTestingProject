package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ShoppingCartPage {
    private SelenideElement quantityButton = $(By.id("a-autoid-0-announce"));
    private SelenideElement deleteLink = $(By.xpath("//*[contains(@name, 'submit.delete')]"));
    private SelenideElement isCartEmpty = $(By.xpath("//*[contains(@class, 'amazon-cart-is-empty')]"));

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
