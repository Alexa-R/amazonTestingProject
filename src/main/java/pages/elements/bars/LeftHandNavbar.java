package pages.elements.bars;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class LeftHandNavbar {
    private SelenideElement electronicsCategory = $(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[6]/a"));
    private ArrayList<SelenideElement> categories = new ArrayList<SelenideElement>() {{
        add(electronicsCategory);
    }};
    private ElementsCollection CategoryItems = $$(categories);


    public ElementsCollection getCategoryItems() {
        return CategoryItems;
    }
}
