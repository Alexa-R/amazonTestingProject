package services;

import pages.SignInPasswordPage;

public class SignInPasswordPageService {
    private final SignInPasswordPage signInPasswordPage;

    public SignInPasswordPageService(SignInPasswordPage signInPasswordPage) {
        this.signInPasswordPage = signInPasswordPage;
    }

    public void pastePasswordInTextArea(String password){
        signInPasswordPage.getPasswordTextArea().sendKeys(password);
    }

    public void clickSignIn(){
        signInPasswordPage.getSignInButton().click();
    }

    public boolean displayedPasswordErrorBox(){
        return signInPasswordPage.getPasswordErrorBox().isDisplayed();
    }

}
