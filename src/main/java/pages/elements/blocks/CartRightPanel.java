package pages.elements.blocks;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CartRightPanel {
    private SelenideElement cartRightPanelBox = $(By.xpath("//*[@id=\"ewc-compact-body\"]/div"));

    public SelenideElement getCartRightPanelBox() {
        return cartRightPanelBox;
    }
}
