package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultPage {
    private SelenideElement firstItem = $(By.xpath("//div[@data-index = \"1\" and contains(@data-asin, 'B')]//h2/a"));
    private SelenideElement firstItemPrice = $(By.xpath("//div[@data-index = \"1\" and contains(@data-asin, 'B')]//*[@class = \"a-price-whole\"]"));
    private SelenideElement secondItemPrice = $(By.xpath("//div[@data-index = \"2\" and contains(@data-asin, 'B')]//*[@class = \"a-price-whole\"]"));

    private SelenideElement sortingMenu = $(By.id("a-autoid-0-announce"));

    private SelenideElement avgCustomerReviewFirst = $(By.xpath("//div[@data-index = \"1\" and contains(@data-asin, 'B')]//span[@class =\"a-icon-alt\"]"));
    private SelenideElement avgReviewOnPopover = $(By.xpath("//*[contains(@id, 'a-popover-content')]/div/div/div/div[1]/span"));



    public SelenideElement getFirstItem() {
        return firstItem;
    }

    public SelenideElement getSortingMenu() {
        return sortingMenu;
    }

    public SelenideElement getAvgCustomerReviewFirst() {
        return avgCustomerReviewFirst;
    }

    public SelenideElement getFirstItemPrice() {
        return firstItemPrice;
    }

    public SelenideElement getSecondItemPrice() {
        return secondItemPrice;
    }

    public SelenideElement getAvgReviewOnPopover() {
        return avgReviewOnPopover;
    }
}
