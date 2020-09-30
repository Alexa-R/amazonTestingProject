package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultUsingLeftHandNavbarPage {
    private SelenideElement firstItemElectronics = $(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[1]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span"));
    private ArrayList<SelenideElement> itemsElectronicsList = new ArrayList<SelenideElement>() {{
        add(firstItemElectronics);
    }};
    private final ElementsCollection itemsElectronicsCollection = $$(itemsElectronicsList);

    public ElementsCollection getItemsElectronicsCollection() {
        return itemsElectronicsCollection;
    }
}
