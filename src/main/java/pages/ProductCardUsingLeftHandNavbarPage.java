package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProductCardUsingLeftHandNavbarPage {
    private SelenideElement productTitle = $(By.xpath("//*[@id=\"productTitle\"]"));

    public SelenideElement getProductTitle() {
        return productTitle;
    }
}
