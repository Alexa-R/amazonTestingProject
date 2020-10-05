package pages.elements.menus;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SortingMenu {
    private ElementsCollection parametersList = $$(By.id("//*[@class=\"a-nostyle a-list-link\"]/li"));

    public ElementsCollection getParametersList() {
        return parametersList;
    }
}
