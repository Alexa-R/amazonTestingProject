package stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import services.ProductCardPageService;

import static org.junit.Assert.assertTrue;

public class ProductCardStepdefs {
    private final ProductCardPageService productCardPageService;

    public ProductCardStepdefs(ProductCardPageService productCardPageService) {
        this.productCardPageService = productCardPageService;
    }

    @Then("title is visible on the product card page")
    public void titleIsVisibleOnTheProductCardPageUsingCategoryMenu() {
        assertTrue(productCardPageService.isProductTitleDisplayed());
    }

    @Then("title is visible on the product card page")
    public void titleIsVisibleOnTheProductCardPage() {
        productCardPageService.isProductTitleDisplayed();
    }

    @When("click on the button Add to cart on the product cart page")
    public void clickOnTheButtonAddToCartOnTheProductcartPageUsingTheSearchField() {
        productCardPageService.clickAddToCartButton();
    }

    @Then("the landing picture on the product card page is the image")
    public void theLandingPictureOnTheProductCardPageUsingTheSearchFieldIsTheImage() {
        assertTrue(productCardPageService.isLandingPictureImage());
    }

    @When("click on the Video on the product cart page")
    public void clickOnTheVideoOnTheProductCartPageUsingTheSearchField() {
        productCardPageService.clickVideo();
    }

    @When("click on the main image on the product cart page")
    public void clickOnTheMainImage() {
        productCardPageService.clickOnLandingPicture();
    }
}
