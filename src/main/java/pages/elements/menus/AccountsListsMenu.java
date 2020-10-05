package pages.elements.menus;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AccountsListsMenu {
    private SelenideElement signInButton = $(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a"));
    private SelenideElement signOutText = $(By.xpath("//*[@id=\"nav-item-signout\"]/span"));

    public SelenideElement getSignInButton() {
        return signInButton;
    }

    public SelenideElement getSignOutText() {
        return signOutText;
    }
}
