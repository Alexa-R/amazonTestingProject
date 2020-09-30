package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProductCardUsingSearchFieldPage {
    private SelenideElement productTitle = $(By.xpath("//*[@id=\"productTitle\"]"));
    private SelenideElement seeAllBuyingOptionsButton = $(By.xpath("//*[@id=\"buybox-see-all-buying-choices-announce\"]"));
    private SelenideElement addToCartButton = $(By.xpath("//*[@id=\"add-to-cart-button\"]"));
    private SelenideElement addToCartOnBuingOptions = $(By.xpath("//*[@id=\"a-autoid-0\"]/span/input"));
    private SelenideElement landingPicture = $(By.xpath("//*[@id=\"landingImage\"]"));
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

    public SelenideElement getAddToCartOnBuingOptions() {
        return addToCartOnBuingOptions;
    }

    public SelenideElement getLandingPicture() {
        return landingPicture;
    }

    public SelenideElement getVideo() {
        return video;
    }
}
