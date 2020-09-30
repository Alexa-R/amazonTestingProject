package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import services.SignInMailPageService;

import static org.junit.Assert.assertTrue;

public class SignInMailStepdefs {

    private final SignInMailPageService signInMailPageService;

    public SignInMailStepdefs(SignInMailPageService signInMailPageService) {
        this.signInMailPageService = signInMailPageService;
    }

    @And("enter {string} in the text field on the mail sign in page")
    public void pasteMailInTextAreaOnTheSignInPage(String mail) {
        signInMailPageService.pasteMailInTextArea("mechta2015@list.ru");
    }

    @And("click on Continue on the mail sign in page")
    public void clickContinueOnTheMailSignInPage() {
        signInMailPageService.clickContinueButton();
    }

    @Then("Login page is opened")
    public void loginPageIsOpened() {
       assertTrue(signInMailPageService.isRegistrationSectionDisplayed());
    }
}
