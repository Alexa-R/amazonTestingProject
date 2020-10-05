package pages.elements.blocks;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FooterBlock {
    private SelenideElement footerBox = $(By.id("navFooter"));
    private SelenideElement dropdownLanguageMenu = $(By.id("icp-touch-link-language"));

    public SelenideElement getFooterBox() {
        return footerBox;
    }

    public SelenideElement getDropdownLanguageMenu() {
        return dropdownLanguageMenu;
    }
}
