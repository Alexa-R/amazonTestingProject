package pages.elements.boxes;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DropdownQuantityBox {
    private SelenideElement dropdownQuantityListTwo = $(By.xpath("//*[@id=\"dropdown1_2\"]"));

    public SelenideElement getDropdownQuantityListTwo() {
        return dropdownQuantityListTwo;
    }
}

