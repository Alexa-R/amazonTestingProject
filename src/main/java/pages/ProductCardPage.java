package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProductCardPage {
    private SelenideElement productTitle = $(By.id("productTitle"));
    private SelenideElement seeAllBuyingOptionsButton = $(By.id("buybox-see-all-buying-choices-announce"));
    // private SelenideElement addToCartButton = $(By.name("submit.add-to-cart or submit.addToCart"));
    private SelenideElement addToCartButton = $(By.xpath("//*[@id=\"add-to-cart-button\" or @name=\"submit.addToCart\"]"));
    //private SelenideElement addToCartOnBuingOptions = $(By.xpath("//*[@id=\"a-autoid-0\"]/span/input"));
    private SelenideElement landingPicture = $(By.id("landingImage"));
    private SelenideElement video = $(By.xpath("//*[@id=\"altImages\"]/ul/li[contains(@class, 'video') and contains(@class, 'item')]"));


    public SelenideElement getProductTitle() {
        return productTitle;
    }

    public SelenideElement getAddToCartButton() {
        return addToCartButton;
    }

    public SelenideElement getSeeAllBuyingOptionsButton() {
        return seeAllBuyingOptionsButton;
    }

   /* public SelenideElement getAddToCartOnBuingOptions() {
        return addToCartOnBuingOptions;
    }*/


    public SelenideElement getLandingPicture() {
        return landingPicture;
    }

    public SelenideElement getVideo() {
        return video;
    }
}
