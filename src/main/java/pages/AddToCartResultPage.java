package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AddToCartResultPage {
   // private SelenideElement isTitleContainsAddedRightPanel = $(By.xpath("//*[@id=\"attachDisplayAddBaseAlert\"]/div/h4"));
    private SelenideElement cartButton = $(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input"));
    private SelenideElement confirmMessage = $(By.xpath("//*[(contains(@id, 'confirm-text') and contains(@class, 'success')) or (@id = \"attachDisplayAddBaseAlert\" and contains(@class, \"success\"))]"));
  //  private SelenideElement cartButtonOnPage = $(By.id("hlb-ptc-btn-native"));

//    public SelenideElement getIsTitleContainsAddedRightPanel() {
//        return isTitleContainsAddedRightPanel;
//    }

    public SelenideElement getCartButton() {
        return cartButton;
    }

    public SelenideElement getConfirmMessage() {
        return confirmMessage;
    }

 /*   public SelenideElement getCartButtonOnPage() {
        return cartButtonOnPage;
    }*/
}

