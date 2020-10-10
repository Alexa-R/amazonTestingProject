package services;

import pages.ProductCardPage;

public class ProductCardPageService {
    private final ProductCardPage productCardPage;

    public ProductCardPageService(ProductCardPage productCardPage) {
        this.productCardPage = productCardPage;
    }

    public boolean isProductTitleDisplayed() {
        return productCardPage.getProductTitle().isDisplayed();
    }

    public void clickAddToCartButton() {
        if (productCardPage.getSeeAllBuyingOptionsButton().isDisplayed()) {
            productCardPage.getSeeAllBuyingOptionsButton().click();
        }
        productCardPage.getAddToCartButton().click();
    }

    public boolean isLandingPictureImage() {
        return productCardPage.getLandingPicture().isImage();
    }

    public void clickOnLandingPicture() {
        productCardPage.getLandingPicture().click();
    }

    public void clickVideo() {
        productCardPage.getVideo().click();
    }
}
