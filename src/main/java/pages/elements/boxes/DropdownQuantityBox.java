package pages.elements.boxes;

import com.codeborne.selenide.SelenideElement;
import helper.Locators;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DropdownQuantityBox {
    private SelenideElement dropdownQuantityListTwo = $(Locators.get(this.getClass().getSimpleName() + ".dropdownQuantityListTwo"));

    public SelenideElement getDropdownQuantityListTwo() {
        return dropdownQuantityListTwo;
    }
}

