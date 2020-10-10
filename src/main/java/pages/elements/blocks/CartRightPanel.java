package pages.elements.blocks;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CartRightPanel {
    private SelenideElement cartRightPanelBox = $(By.id("ewc-compact-body"));
    private SelenideElement closeRightPanel = $(By.xpath("//*[@id=\"attach-close_sideSheet-link\"]"));

    public SelenideElement getCartRightPanelBox() {
        return cartRightPanelBox;
    }

    public SelenideElement getCloseRightPanel() {
        return closeRightPanel;
    }
}
