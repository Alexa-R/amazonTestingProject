package services;

import pages.ProductCardUsingLeftHandNavbarPage;

public class ProductCardUsingLeftHandNavbarPageService {
    private final ProductCardUsingLeftHandNavbarPage productCardUsingLeftHandNavbarPage;

    public ProductCardUsingLeftHandNavbarPageService(ProductCardUsingLeftHandNavbarPage productCardUsingLeftHandNavbarPage) {
        this.productCardUsingLeftHandNavbarPage = productCardUsingLeftHandNavbarPage;
    }

    public boolean isProductTitleDisplayed() {
        return productCardUsingLeftHandNavbarPage.getProductTitle().isDisplayed();
    }

}
