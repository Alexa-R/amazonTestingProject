package pages.elements.boxes;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import helper.Locators;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DropdownCategoryBox {
    private ElementsCollection dropdownCategoriesList = $$(Locators.get(this.getClass().getSimpleName() + ".dropdownCategoriesList"));

    public ElementsCollection getDropdownCategoriesList() {
        return dropdownCategoriesList;
    }
}
