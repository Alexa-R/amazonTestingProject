package stepdefs.menusStepdefs;

import io.cucumber.java.en.And;
import services.elementsServices.menusServices.SortingMenuService;

public class SortingMenuStepdefs {
    private final SortingMenuService sortingMenuService;

    public SortingMenuStepdefs(SortingMenuService sortingMenuService) {
        this.sortingMenuService = sortingMenuService;
    }

    @And("click on the Price: High to Low parameter on the sorting menu")
    public void clickOnThePriceHighToLowParameterOnTheSortingMenu() {
        sortingMenuService.selectPriceHighToLowParameter();
    }
}
