package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AddToCartResultPage {
    private SelenideElement isTitleContainsAddedRightPanel = $(By.xpath("//*[@id=\"attachDisplayAddBaseAlert\"]/div/h4"));
    private SelenideElement cartButtonRightPanel = $(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input"));
    private SelenideElement isTitleContainsAddedOnPage = $(By.xpath("//*[@id=\"huc-v2-order-row-confirm-text\"]/h1"));
    private SelenideElement cartButtonOnPage = $(By.xpath("//*[@id=\"hlb-ptc-btn-native\"]"));

    public SelenideElement getIsTitleContainsAddedRightPanel() {
        return isTitleContainsAddedRightPanel;
    }

    public SelenideElement getCartButtonRightPanel() {
        return cartButtonRightPanel;
    }

    public SelenideElement getIsTitleContainsAddedOnPage() {
        return isTitleContainsAddedOnPage;
    }

    public SelenideElement getCartButtonOnPage() {
        return cartButtonOnPage;
    }
}

