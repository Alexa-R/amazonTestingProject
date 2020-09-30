package pages.elements.blocks;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HeaderBlock {
    private SelenideElement accountsAndLists = $(By.xpath("//*[@id=\"nav-link-accountList\"]/div/span"));
    private SelenideElement searchField = $(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
    private SelenideElement searchButton = $(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input"));
    private SelenideElement leftHandNavbarGamburgerMenu = $(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i"));
    private SelenideElement todaysDealsField = $(By.xpath("//*[@id=\"nav-xshop\"]/a[1]"));
    private SelenideElement logotype = $(By.xpath("//*[@id=\"nav-logo\"]/a/span[1]"));
    private SelenideElement dropdownCategoryBox = $(By.xpath("//*[@id=\"searchDropdownBox\"]"));
    private SelenideElement returnsAndOrdersField = $(By.xpath("//*[@id=\"nav-orders\"]"));
    private SelenideElement dropdownLanguageMenu = $(By.xpath("//*[@id=\"icp-nav-flyout\"]/span"));

    public SelenideElement getAccountsAndLists() {
        return accountsAndLists;
    }

    public SelenideElement getSearchField() {
        return searchField;
    }

    public SelenideElement getSearchButton() {
        return searchButton;
    }

    public SelenideElement getLeftHandNavbarGamburgerMenu() {
        return leftHandNavbarGamburgerMenu;
    }

    public SelenideElement getTodaysDealsField() {
        return todaysDealsField;
    }

    public SelenideElement getLogotype() {
        return logotype;
    }

    public SelenideElement getDropdownCategoryBox() {
        return dropdownCategoryBox;
    }

    public SelenideElement getReturnsAndOrdersField() {
        return returnsAndOrdersField;
    }

    public SelenideElement getDropdownLanguageMenu() {
        return dropdownLanguageMenu;
    }
}
