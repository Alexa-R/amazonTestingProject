package pages.elements.lists;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DropdownLanguageList {
    private SelenideElement spanishLanguage = $(By.xpath("//*[@id=\"nav-flyout-icp\"]/div[2]/a[1]/span"));
    private SelenideElement spanishLanguageSelected = $(By.xpath("//*[@id=\"nav-flyout-icp\"]/div[2]/span[2]/span"));

    public SelenideElement getSpanishLanguage() {
        return spanishLanguage;
    }

    public SelenideElement getSpanishLanguageSelected() {
        return spanishLanguageSelected;
    }
}
