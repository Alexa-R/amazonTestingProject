package services;

import pages.SignInMailPage;

public class SignInMailPageService {
    private final SignInMailPage signInMailPage;

    public SignInMailPageService(SignInMailPage signInMailPage) {
        this.signInMailPage = signInMailPage;
    }

    public void pasteMailInTextArea(String mail){
        signInMailPage.getMailTextArea().sendKeys(mail);
    }

    public void clickContinueButton(){
        signInMailPage.getContinueButton().click();
    }

    public boolean isRegistrationSectionDisplayed(){
       return signInMailPage.getRegistrationSection().isDisplayed();
    }
}
