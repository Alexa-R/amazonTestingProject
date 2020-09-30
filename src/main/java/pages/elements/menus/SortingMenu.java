package pages.elements.menus;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SortingMenu {
    private SelenideElement priceHighToLowParameter = $(By.xpath("//*[@id=\"s-result-sort-select_2\"]"));

    public SelenideElement getPriceHighToLowParameter() {
        return priceHighToLowParameter;
    }
}
