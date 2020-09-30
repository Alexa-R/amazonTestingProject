package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HomePage {
    private SelenideElement slider = $(By.xpath("//*[@id=\"gw-desktop-herotator\"]/div/div/div"));

    public SelenideElement getSlider() {
        return slider;
    }
}