package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProductCardPage {
    private SelenideElement productTitle = $(By.id("productTitle"));
    private SelenideElement seeAllBuyingOptionsButton = $(By.id("buybox-see-all-buying-choices-announce"));
    private SelenideElement addToCartButton = $(By.xpath("//*[@id=\"add-to-cart-button\" or @name=\"submit.addToCart\"]"));
    private SelenideElement landingPicture = $(By.id("landingImage"));
    private SelenideElement video = $(By.xpath("//*[@id=\"altImages\"]/ul/li[contains(@class, 'video') and contains(@class, 'item')]"));
    private SelenideElement noButton = $(By.xpath("//*[@id=\"attachSiNoCoverage\"]"));

    public SelenideElement getProductTitle() {
        return productTitle;
    }

    public SelenideElement getAddToCartButton() {
        return addToCartButton;
    }

    public SelenideElement getSeeAllBuyingOptionsButton() {
        return seeAllBuyingOptionsButton;
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
