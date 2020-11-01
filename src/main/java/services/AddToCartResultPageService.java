package services;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AddToCartResultPage;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class AddToCartResultPageService {
    private final AddToCartResultPage addToCartResultPage;

    public AddToCartResultPageService(AddToCartResultPage addToCartResultPage) {
        this.addToCartResultPage = addToCartResultPage;
    }

    public boolean isItemAdded() {
        return addToCartResultPage.getConfirmMessage().should(Condition.visible).isDisplayed();
    }

    public void clickCartButton() {
        addToCartResultPage.getCartButton().click();
    }
}
