package services.elementsServices.barsServices;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.elements.bars.LeftHandNavbar;

import java.util.concurrent.locks.Condition;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class LeftHandNavbarService {
    private final LeftHandNavbar leftHandNavbar;

    public LeftHandNavbarService(LeftHandNavbar leftHandNavbar) {
        this.leftHandNavbar = leftHandNavbar;
    }

    public void clickFirstCategory() {
        WebDriverWait explicitWait = new WebDriverWait(getWebDriver(), 10);
        leftHandNavbar.getProductCategoriesList().get(6).hover().click();
    }
}
