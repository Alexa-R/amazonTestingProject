package stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import services.ProductCardUsingSearchFieldPageService;

import static org.junit.Assert.assertTrue;

public class ProductCardUsingSearchFieldStepdefs {
    private final ProductCardUsingSearchFieldPageService productCardUsingSearchFieldPageService;

    public ProductCardUsingSearchFieldStepdefs(ProductCardUsingSearchFieldPageService productCardUsingSearchFieldPageService) {
        this.productCardUsingSearchFieldPageService = productCardUsingSearchFieldPageService;
    }

    @Then("title is visible on the product card page using the search field")
    public void titleIsVisibleOnTheProductCardPage() {
        productCardUsingSearchFieldPageService.isProductTitleDisplayed();
    }

    @When("click on the button Add to cart on the product cart page using the search field")
    public void clickOnTheButtonAddToCartOnTheProductcartPageUsingTheSearchField() {
        productCardUsingSearchFieldPageService.clickOnAddToCartButton();
    }

    @Then("the landing picture on the product card page using the search field is the image")
    public void theLandingPictureOnTheProductCardPageUsingTheSearchFieldIsTheImage() {
        assertTrue(productCardUsingSearchFieldPageService.isLandingPictureImage());
    }

    @When("click on the Video on the product cart page using the search field")
    public void clickOnTheVideoOnTheProductCartPageUsingTheSearchField() {
        productCardUsingSearchFieldPageService.clickVideo();
    }

    @When("click on the main image on the product cart page using the search field")
    public void clickOnTheMainImage() {
        productCardUsingSearchFieldPageService.clickOnLandingPicture();
    }
}
