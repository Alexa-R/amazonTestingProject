package pages;

import com.codeborne.selenide.SelenideElement;
import helper.Locators;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignInMailPage {
    private SelenideElement mailTextArea = $(Locators.get(this.getClass().getSimpleName() + ".mailTextArea"));
    private SelenideElement continueButton = $(Locators.get(this.getClass().getSimpleName() + ".continueButton"));
    private SelenideElement registrationSection = $(Locators.get(this.getClass().getSimpleName() + ".registrationSection"));

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
