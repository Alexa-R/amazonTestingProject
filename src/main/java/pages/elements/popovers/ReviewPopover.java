package pages.elements.popovers;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ReviewPopover {
    private SelenideElement reviewTitle = $(By.xpath(" //*[contains(@id, 'a-popover-content')]/div/div/div/div[1]/span"));

    public SelenideElement getReviewTitle() {
        return reviewTitle;
    }
}
