package pages.elements.blocks;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FooterBlock {
    private SelenideElement footerBox = $(By.xpath("//*[@id=\"navFooter\"]"));
    private SelenideElement dropdownLanguageMenu = $(By.xpath("//*[@id=\"icp-touch-link-language\"]/span[1]"));

    public SelenideElement getFooterBox() {
        return footerBox;
    }

    public SelenideElement getDropdownLanguageMenu() {
        return dropdownLanguageMenu;
    }
}
