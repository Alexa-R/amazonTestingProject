package services.elementsServices.listsServices;

import pages.elements.lists.ProductSubcategoriesList;

public class ProductSubcategoriesListService {
    private final ProductSubcategoriesList productSubcategoriesList;

    public ProductSubcategoriesListService(ProductSubcategoriesList productSubcategoriesList) {
        this.productSubcategoriesList = productSubcategoriesList;
    }

    public void clickFirstSubcategory() {
        productSubcategoriesList.getProductSubcategoriesList().get(2).click();
    }

    public String getTitleNameOfSubcategoryList() {
        return productSubcategoriesList.getProductSubcategoriesList().get(1).getText();
    }
}
