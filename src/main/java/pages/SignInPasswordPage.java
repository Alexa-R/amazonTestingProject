package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignInPasswordPage {
    private SelenideElement passwordTextArea = $(By.id("ap_password"));
    private SelenideElement signInButton = $(By.id("signInSubmit"));
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
