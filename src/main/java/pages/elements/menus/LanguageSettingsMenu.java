package pages.elements.menus;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class LanguageSettingsMenu {
    private ElementsCollection languagesList = $$(By.xpath("//*[@id=\"customer-preferences\"]//div[@class=\"a-row a-spacing-mini\"]"));
    private SelenideElement saveChangesButton = $(By.id("icp-btn-save"));

    public ElementsCollection getLanguagesList() {
        return languagesList;
    }

    public SelenideElement getSaveChangesButton() {
        return saveChangesButton;
    }
}
