package pages.elements.lists;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import helper.Locators;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DropdownLanguagesList {
    private ElementsCollection languagesCollection = $$(Locators.get(this.getClass().getSimpleName() + ".languagesCollection"));

    public ElementsCollection getLanguagesCollection() {
        return languagesCollection;
    }
}
