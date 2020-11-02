package pages;

import com.codeborne.selenide.SelenideElement;
import helper.Locators;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignInPasswordPage {
    private SelenideElement passwordTextArea = $(Locators.get(this.getClass().getSimpleName() + ".passwordTextArea"));
    private SelenideElement signInButton = $(Locators.get(this.getClass().getSimpleName() + ".signInButton"));
    private SelenideElement passwordErrorBox = $(By.xpath("//*[@id=\"auth-error-message-box\" or @id=\"auth-warning-message-box\"]"));

    public SelenideElement getPasswordTextArea() {
        return passwordTextArea;
    }

    public SelenideElement getSignInButton() {
        return signInButton;
    }

    public SelenideElement getPasswordErrorBox() {
        return passwordErrorBox;
    }
}
