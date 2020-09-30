package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import services.SignInPasswordPageService;

import static org.junit.Assert.assertTrue;

public class SignInPasswordStepdefs {
    private final SignInPasswordPageService signInPasswordPageService;

    public SignInPasswordStepdefs(SignInPasswordPageService signInPasswordPageService) {
        this.signInPasswordPageService = signInPasswordPageService;
    }

    @And("enter the wrong password {string} in the text field on the password sign in page")
    public void pasteNotValidatePasswordInTextAreaOnThePasswordSignInPage(String password) {
        signInPasswordPageService.pastePasswordInTextArea("12345");
    }

    @And("click on Sign in on the password sign in page")
    public void clickSignInThePasswordSignInPage() {
        signInPasswordPageService.clickSignIn();
    }


    @Then("a field with a message about an incorrectly entered password is displayed")
    public void displayingAMessageAboutEnteringAnIncorrectPassword() {
        assertTrue(signInPasswordPageService.displayedPasswordErrorBox());
    }
}
