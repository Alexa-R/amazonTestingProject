package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import services.AddToCartResultPageService;

import java.util.concurrent.locks.Condition;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.junit.Assert.assertTrue;

public class AddToCartResultPageStepdefs {
    private final AddToCartResultPageService addToCartResultPageService;

    public AddToCartResultPageStepdefs(AddToCartResultPageService addToCartResultPageService) {
        this.addToCartResultPageService = addToCartResultPageService;
    }

    @And("click on the Cart button on the Add cart result page")
    public void clickOnTheCartButtonOnTheAddCartResultPage() {
        addToCartResultPageService.clickCartButton();
    }

    @Then("the message that the item has been added is displayed")
    public void theMessageThatTheItemHasBeenIsDisplayed() {
        assertTrue(addToCartResultPageService.isItemAdded());
    }
}
