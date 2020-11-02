package pages;

import com.codeborne.selenide.SelenideElement;
import helper.Locators;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProductCardPage {
    private SelenideElement productTitle = $(Locators.get(this.getClass().getSimpleName() + ".productTitle"));
    private SelenideElement addToCartButton = $(By.xpath("//*[@id=\"add-to-cart-button\" or @name=\"submit.addToCart\"]"));
    private SelenideElement landingPicture = $(Locators.get(this.getClass().getSimpleName() + ".landingPicture"));
    private SelenideElement video = $(By.xpath("//*[@id=\"altImages\"]/ul/li[contains(@class, 'video') and contains(@class, 'item')]"));
    private SelenideElement noButton = $(Locators.get(this.getClass().getSimpleName() + ".noButton"));

    public SelenideElement getProductTitle() {
        return productTitle;
    }

    public SelenideElement getAddToCartButton() {
        return addToCartButton;
    }

    public SelenideElement getLandingPicture() {
        return landingPicture;
    }

    public SelenideElement getVideo() {
        return video;
    }

    public SelenideElement getNoButton() {
        return noButton;
    }
}
