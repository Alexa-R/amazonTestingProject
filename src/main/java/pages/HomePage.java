package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import helper.Locators;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HomePage {
    private SelenideElement slider = $(Locators.get(this.getClass().getSimpleName() + ".slider"));

    public SelenideElement getSlider() {
        return slider;
    }
}