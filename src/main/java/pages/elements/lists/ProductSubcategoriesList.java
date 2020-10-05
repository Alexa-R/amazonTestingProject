package pages.elements.lists;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FirstCategorySubList {
    private ElementsCollection FirstCategorySubListCollection = $$(By.xpath("//*[@id=\"hmenu-content\"]/ul[5]/li"));
    private SelenideElement titleOfSubcategoriesList = $(By.xpath("//*[@id=\"hmenu-content\"]/ul[5]/li[2]/div"));

    public ElementsCollection getFirstCategorySubListCollection() {
        return FirstCategorySubListCollection;
    }

    public SelenideElement getTitleOfSubcategoriesList() {
        return titleOfSubcategoriesList;
    }
}
