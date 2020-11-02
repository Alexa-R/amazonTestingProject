package pages.elements.menus;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import helper.Locators;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SortingMenu {
    private ElementsCollection parametersList = $$(Locators.get(this.getClass().getSimpleName() + ".parametersList"));

    public ElementsCollection getParametersList() {
        return parametersList;
    }
}
