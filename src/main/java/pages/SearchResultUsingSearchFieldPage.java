package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultUsingSearchFieldPage {
    private SelenideElement firstItem = $(By.xpath("//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span"));
    private ArrayList<SelenideElement> itemsList = new ArrayList<SelenideElement>() {{
        add(firstItem);
    }};
    private ElementsCollection itemsCollection = $$(itemsList);

    private SelenideElement firstItemWithAd = $(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span"));
    private ArrayList<SelenideElement> itemsWithAdList = new ArrayList<SelenideElement>() {{
        add(firstItemWithAd);
    }};
    private ElementsCollection itemsWithAdCollection = $$(itemsWithAdList);

    private SelenideElement firstItemWithFilter = $(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[1]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span"));
    private ArrayList<SelenideElement> itemsWithFilterList = new ArrayList<SelenideElement>() {{
        add(firstItemWithFilter);
    }};
    private ElementsCollection itemsWithFilterCollection = $$(itemsWithFilterList);

    private SelenideElement sortingMenu = $(By.xpath("//*[@id=\"a-autoid-0-announce\"]"));

    private SelenideElement firstItemWithSorting = $(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[1]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span"));
    private ArrayList<SelenideElement> itemsWithSortingList = new ArrayList<SelenideElement>() {{
        add(firstItemWithFilter);
    }};
    private ElementsCollection itemsWithSortingCollection = $$(itemsWithSortingList);

    private SelenideElement firstItemWithAmazonChoice = $(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[1]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span"));
    private ArrayList<SelenideElement> itemsWithAmazonChoiceList = new ArrayList<SelenideElement>() {{
        add(firstItemWithAmazonChoice);
    }};
    private ElementsCollection itemsWithAmazonChoiceCollection = $$(itemsWithAmazonChoiceList);

    private SelenideElement avgCustomerReviewOfFirstItem = $(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[1]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[2]/div/span[1]/span/a/i[1]/span"));
    private SelenideElement avgCustomerReviewOfSecondItem = $(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[2]/div/span[1]/span/a/i[1]/span"));
    private ArrayList<SelenideElement> avgCustomerReviewList = new ArrayList<SelenideElement>() {{
        add(avgCustomerReviewOfFirstItem);
        add(avgCustomerReviewOfSecondItem);
    }};
    private ElementsCollection avgCustomerReviewCollection = $$(avgCustomerReviewList);

    private SelenideElement firstItemWithDoubleAd = $(By.xpath("//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[3]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span"));
    private ArrayList<SelenideElement> itemsWithDoubleAdList = new ArrayList<SelenideElement>() {{
        add(firstItemWithAd);
    }};
    private ElementsCollection itemsWithDoubleAdCollection = $$(itemsWithDoubleAdList);

    public ElementsCollection getItemsCollection() {
        return itemsCollection;
    }

    public ElementsCollection getItemsWithAdCollection() {
        return itemsWithAdCollection;
    }

    public ElementsCollection getItemsWithFilterCollection() {
        return itemsWithFilterCollection;
    }

    public SelenideElement getSortingMenu() {
        return sortingMenu;
    }

    public ElementsCollection getItemsWithSortingCollection() {
        return itemsWithSortingCollection;
    }

    public ElementsCollection getItemsWithAmazonChoiceCollection() {
        return itemsWithAmazonChoiceCollection;
    }

    public ElementsCollection getAvgCustomerReviewCollection() {
        return avgCustomerReviewCollection;
    }

    public ElementsCollection getItemsWithDoubleAdCollection() {
        return itemsWithDoubleAdCollection;
    }
}
