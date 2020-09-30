package stepdefs;

import io.cucumber.java.en.Then;
import services.ProductCardUsingLeftHandNavbarPageService;

import static org.junit.Assert.assertTrue;

public class ProductCardUsingLeftHandNavbarStepdefs {
    private final ProductCardUsingLeftHandNavbarPageService productCardUsingLeftHandNavbarPageService;

    public ProductCardUsingLeftHandNavbarStepdefs(ProductCardUsingLeftHandNavbarPageService productCardUsingLeftHandNavbarPageService) {
        this.productCardUsingLeftHandNavbarPageService = productCardUsingLeftHandNavbarPageService;
    }

    @Then("title is visible on the product card page using left hand navbar")
    public void titleIsVisibleOnTheProductCardPageUsingCategoryMenu() {
        assertTrue(productCardUsingLeftHandNavbarPageService.isProductTitleDisplayed());
    }
}
