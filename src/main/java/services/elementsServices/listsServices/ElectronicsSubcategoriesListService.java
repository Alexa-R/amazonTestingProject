package services.elementsServices.listsServices;

import pages.elements.lists.ElectronicsSubcategoriesList;

public class ElectronicsSubcategoriesListService {
    private final ElectronicsSubcategoriesList electronicsSubcategoriesList;

    public ElectronicsSubcategoriesListService(ElectronicsSubcategoriesList electronicsSubcategoriesList) {
        this.electronicsSubcategoriesList = electronicsSubcategoriesList;
    }

    public void clickFirstSubcategory(){
       electronicsSubcategoriesList.getElectronicsSubcategoryItems().get(0).click();
    }
    public String getTitleNameOfSubcategoryList(){
        return electronicsSubcategoriesList.getTitleOfSubcategoriesList().getText();
    }
}
