package pages.elements.bars;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FilterBar {
    private SelenideElement computerRamCapacitySection32GB = $(By.xpath("//span[text() = '32 GB']"));
    private SelenideElement reviewFourStarsAndUp = $(By.xpath("//*[contains(@class, 'star-medium-4')]"));

    public SelenideElement getComputerRamCapacitySection32GB() {
        return computerRamCapacitySection32GB;
    }

    public SelenideElement getReviewFourStarsAndUp() {
        return reviewFourStarsAndUp;
    }
}
