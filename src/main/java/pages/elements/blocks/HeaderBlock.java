package pages.elements.blocks;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.elements.boxes.DropdownCategoryBox;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HeaderBlock {
    private SelenideElement accountsAndLists = $(By.id("nav-link-accountList"));
    private SelenideElement searchField = $(By.id("twotabsearchtextbox"));
    private SelenideElement leftHandNavbarGamburgerMenu = $(By.id("nav-hamburger-menu"));
    private SelenideElement todaysDealsField = $(By.id("nav-xshop"));
    private SelenideElement logotype = $(By.id("nav-logo"));
    private SelenideElement dropdownCategoryBox = $(By.id("searchDropdownBox"));
    private SelenideElement returnsAndOrdersField = $(By.id("nav-orders"));
    private SelenideElement dropdownLanguageMenu = $(By.id("icp-nav-flyout"));

    public SelenideElement getAccountsAndLists() {
        return accountsAndLists;
    }

    public SelenideElement getSearchField() {
        return searchField;
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
