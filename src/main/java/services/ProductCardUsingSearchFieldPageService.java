package services;

import pages.ProductCardUsingSearchFieldPage;

public class ProductCardUsingSearchFieldPageService {
    private final ProductCardUsingSearchFieldPage productCardUsingSearchFieldPage;

    public ProductCardUsingSearchFieldPageService(ProductCardUsingSearchFieldPage productCardUsingSearchFieldPage) {
        this.productCardUsingSearchFieldPage = productCardUsingSearchFieldPage;
    }

    public boolean isProductTitleDisplayed() {
        return productCardUsingSearchFieldPage.getProductTitle().isDisplayed();
    }

    public void clickOnAddToCartButton() {
        if (productCardUsingSearchFieldPage.getAddToCartButton().isDisplayed()) {
            productCardUsingSearchFieldPage.getAddToCartButton().click();
        } else {
            productCardUsingSearchFieldPage.getSeeAllBuyingOptionsButton().click();
            productCardUsingSearchFieldPage.getAddToCartOnBuingOptions().click();
        }
    }

    public boolean isLandingPictureImage() {
        return productCardUsingSearchFieldPage.getLandingPicture().isImage();
    }

    public void clickOnLandingPicture() {
        productCardUsingSearchFieldPage.getLandingPicture().click();
    }

    public void clickVideo() {
        productCardUsingSearchFieldPage.getVideo().click();
    }

}
