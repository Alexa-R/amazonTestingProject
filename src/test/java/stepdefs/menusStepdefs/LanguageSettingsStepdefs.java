package stepdefs.menusStepdefs;

import io.cucumber.java.en.And;
import services.elementsServices.menusServices.LanguageSettingsMenuService;

public class LanguageSettingsStepdefs {
    private final LanguageSettingsMenuService languageSettingsMenuService;

    public LanguageSettingsStepdefs(LanguageSettingsMenuService languageSettingsMenuService) {
        this.languageSettingsMenuService = languageSettingsMenuService;
    }

    @And("select the Espanol - ES language from the Language Settings menu")
    public void selectTheEspanolESLanguageFromTheLanguageSettingsMenu() {
        languageSettingsMenuService.selectSpanishLanguage();
    }

    @And("click on Save Changes button on the Language Settings menu")
    public void clickOnSaveChangesButtonOnTheLanguageSettingsMenu() {
        languageSettingsMenuService.clickSaveChangesButton();
    }
}
