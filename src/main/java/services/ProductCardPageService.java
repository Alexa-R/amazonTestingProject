package services;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ProductCardPage;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class ProductCardPageService {
    private final ProductCardPage productCardPage;

    public ProductCardPageService(ProductCardPage productCardPage) {
        this.productCardPage = productCardPage;
    }

    public boolean isProductTitleDisplayed() {
        return productCardPage.getProductTitle().isDisplayed();
    }

    public void clickNoButton() {
        if (productCardPage.getNoButton().isDisplayed()) {
            productCardPage.getNoButton().click();
        }
    }

    public void clickAddToCartButton() {
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
