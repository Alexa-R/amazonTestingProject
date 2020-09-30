package stepdefs.listsStepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import services.elementsServices.listsServices.ElectronicsSubcategoriesListService;

import static org.junit.Assert.assertEquals;

public class ElectronicsSubcategoryListStepdefs {
    private final ElectronicsSubcategoriesListService electronicsSubcategoriesListService;

    public ElectronicsSubcategoryListStepdefs(ElectronicsSubcategoriesListService electronicsSubcategoriesListService) {
        this.electronicsSubcategoriesListService = electronicsSubcategoriesListService;
    }

    @And("click on the Accessories&Supplies in the list of subcategories of the Electronics category")
    public void clickOnTheAccessoriesSuppliesInTheListOfSubcategoriesOfTheElectronicsCategory() {
        electronicsSubcategoriesListService.clickFirstSubcategory();
    }

    @Then("the name of the category {string} is displayed in the title of the subcategories list")
    public void theNameOfTheCategoryElectronicsIsDisplayedInTheTitleOfTheSubcategoriesList(String arg0) {
        assertEquals(arg0.toUpperCase(), electronicsSubcategoriesListService.getTitleNameOfSubcategoryList().toUpperCase());
    }
}
