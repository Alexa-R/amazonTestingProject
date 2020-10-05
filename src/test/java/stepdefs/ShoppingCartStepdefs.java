package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import services.ShoppingCartPageService;

import static org.junit.Assert.assertTrue;

public class ShoppingCartStepdefs {
    private final ShoppingCartPageService shoppingCartPageService;

    public ShoppingCartStepdefs(ShoppingCartPageService shoppingCartPageService) {
        this.shoppingCartPageService = shoppingCartPageService;
    }

    @And("click on the Quantity dropdown box of the first item on the Shopping cart page")
    public void clickOnTheQuantityDropdownBoxOfTheFirstItemOnTheShoppingCartPage() {
        shoppingCartPageService.clickQuantityButton();
    }

    @When("click on the Delete link on the Shopping cart page")
    public void clickOnTheDeleteLinkOnTheShoppingCartPage() {
        shoppingCartPageService.clickOnDeleteLink();
    }

    @Then("the Shopping cart is empty")
    public void theShoppingCartIsEmpty() {
        assertTrue(shoppingCartPageService.isTitleContainsEmpty());
    }

    @Then("the Quantity dropdown box contains in the title {string}")
    public void theQuantityDropdownBoxContainsInTheTitle(String arg0) {
        shoppingCartPageService.isQuantityButtonContains().contains(arg0);
    }
}
