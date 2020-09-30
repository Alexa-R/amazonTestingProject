package pages.elements.bars;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FilterBar {
    private SelenideElement computerRamCapacitySection32GB = $(By.xpath("//*[@id=\"p_n_feature_five_browse-bin/13580788011\"]/span/a/span"));
    private SelenideElement avgCustomerReviewFourStarsAndUp = $(By.xpath("//*[@id=\"p_72/1248879011\"]/span/a/section/i"));


    public SelenideElement getComputerRamCapacitySection32GB() {
        return computerRamCapacitySection32GB;
    }

    public SelenideElement getAvgCustomerReviewFourStarsAndUp() {
        return avgCustomerReviewFourStarsAndUp;
    }
}
