package pages.elements.lists;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ElectronicsSubcategoriesList {
    private ElementsCollection electronicsSubcategoryItems = $$(By.xpath("//*[@id=\"hmenu-content\"]/ul[5]/li[3]/a"));
    private SelenideElement titleOfSubcategoriesList = $(By.xpath("//*[@id=\"hmenu-content\"]/ul[5]/li[2]/div"));

    public ElementsCollection getElectronicsSubcategoryItems() {
        return electronicsSubcategoryItems;
    }

    public SelenideElement getTitleOfSubcategoriesList() {
        return titleOfSubcategoriesList;
    }
}
