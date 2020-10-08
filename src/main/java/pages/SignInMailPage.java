package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignInMailPage {
    private SelenideElement mailTextArea = $(By.id("ap_email"));
    private SelenideElement continueButton = $(By.id("continue"));
    private SelenideElement registrationSection = $(By.id("authportal-main-section"));

    public SelenideElement getMailTextArea() {
        return mailTextArea;
    }

    public SelenideElement getContinueButton() {
        return continueButton;
    }

    public SelenideElement getRegistrationSection() {
        return registrationSection;
    }
}
