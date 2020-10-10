package pages.elements.bars;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.elements.lists.ProductSubcategoriesList;

import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class LeftHandNavbar {
    private ElementsCollection productCategoriesList = $$(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li"));

    public ElementsCollection getProductCategoriesList() {
        return productCategoriesList;
    }
}
