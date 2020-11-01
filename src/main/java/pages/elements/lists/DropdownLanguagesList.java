package pages.elements.lists;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DropdownLanguagesList {
    private ElementsCollection languagesCollection = $$(By.xpath("//*[@id=\"nav-flyout-icp\"]/div[2]/a"));

    public ElementsCollection getLanguagesCollection() {
        return languagesCollection;
    }
}
