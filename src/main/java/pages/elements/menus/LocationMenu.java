package pages.elements.menus;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LocationMenu {
    private SelenideElement countryBox = $(By.xpath("//*[@id=\"GLUXCountryListDropdown\"]"));
    private SelenideElement doneButton = $(By.xpath("//*[@name=\"glowDoneButton\"]"));

    public SelenideElement getCountryBox() {
        return countryBox;
    }

    public SelenideElement getDoneButton() {
        return doneButton;
    }
}
