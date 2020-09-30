package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignInPasswordPage {
    private SelenideElement passwordTextArea = $(By.xpath("//*[@id=\"ap_password\"]"));
    private SelenideElement signInButton = $(By.xpath("//*[@id=\"signInSubmit\"]"));
    private SelenideElement passwordErrorBox = $(By.xpath("//*[@id=\"auth-error-message-box\"]/div"));

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
