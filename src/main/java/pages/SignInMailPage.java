package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignInMailPage {
    private SelenideElement mailTextArea = $(By.xpath("//*[@id=\"ap_email\"]"));
    private SelenideElement continueButton = $(By.xpath("//*[@id=\"continue\"]"));
    private SelenideElement registrationSection = $(By.xpath("//*[@id=\"authportal-main-section\"]/div[2]/div/div[1]/form/div/div/div"));

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
