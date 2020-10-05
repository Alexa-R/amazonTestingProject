package pages.elements.boxes;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DropdownCategoryBox {
    private ElementsCollection dropdownCategoriesList = $$(By.xpath("//*[@id=\"searchDropdownBox\"]/option"));

    public ElementsCollection getDropdownCategoriesList() {
        return dropdownCategoriesList;
    }
}
