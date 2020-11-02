package pages.elements.bars;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import helper.Locators;
import org.openqa.selenium.By;
import pages.elements.lists.ProductSubcategoriesList;

import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class LeftHandNavbar {
    private ElementsCollection productCategoriesList = $$(Locators.get(this.getClass().getSimpleName() + ".productCategoriesList"));

    public ElementsCollection getProductCategoriesList() {
        return productCategoriesList;
    }
}
