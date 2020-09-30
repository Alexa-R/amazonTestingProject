package pages.elements.boxes;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DropdownCategoryBox {
    private SelenideElement dropdownCategoryOption3 = $(By.xpath("//*[@id=\"searchDropdownBox\"]/option[3]"));

    public SelenideElement getDropdownCategoryOption3() {
        return dropdownCategoryOption3;
    }
}
