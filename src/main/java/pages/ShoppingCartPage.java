package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ShoppingCartPage {
    private SelenideElement quantityButton = $(By.xpath("//*[@id=\"a-autoid-0-announce\"]"));
    private SelenideElement deleteLink = $(By.xpath("//*[contains(@id, 'sc-item')]/div[4]/div/div[1]/div/div/div[2]/div[1]/span[2]/span/input"));
    private SelenideElement cartIsEmptyTitle = $(By.xpath("//*[@id=\"sc-active-cart\"]/div/div[2]/div[1]"));

    public SelenideElement getQuantityButton() {
        return quantityButton;
    }

    public SelenideElement getDeleteLink() {
        return deleteLink;
    }

    public SelenideElement getCartIsEmptyTitle() {
        return cartIsEmptyTitle;
    }
}
