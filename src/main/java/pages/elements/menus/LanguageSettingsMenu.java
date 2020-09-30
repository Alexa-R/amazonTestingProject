package pages.elements.menus;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LanguageSettingsMenu {
    private SelenideElement spanishLanguage = $(By.xpath("//*[@id=\"customer-preferences\"]/div/div/div/div[1]/div[2]/div/label/span"));
    private SelenideElement saveChangesButton = $(By.xpath("//*[@id=\"icp-btn-save\"]/span/input"));


    public SelenideElement getSpanishLanguage() {
        return spanishLanguage;
    }

    public SelenideElement getSaveChangesButton() {
        return saveChangesButton;
    }
}
