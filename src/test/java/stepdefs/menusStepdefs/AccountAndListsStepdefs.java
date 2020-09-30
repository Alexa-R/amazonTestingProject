package stepdefs.menusStepdefs;

import io.cucumber.java.en.And;
import services.elementsServices.menusServices.AccountsListsMenuService;

public class AccountAndListsStepdefs {
    private final AccountsListsMenuService accountsListsMenuService;

    public AccountAndListsStepdefs(AccountsListsMenuService accountsListsMenuService) {
        this.accountsListsMenuService = accountsListsMenuService;
    }

    @And("click on the Sign in button on the Account and Lists menu")
    public void clickOnSignIn() {
        accountsListsMenuService.clickOnSignInButton();
    }
}
