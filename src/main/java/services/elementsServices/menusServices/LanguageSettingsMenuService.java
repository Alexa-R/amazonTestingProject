package services.elementsServices.menusServices;

import pages.elements.menus.LanguageSettingsMenu;

public class LanguageSettingsMenuService {
    private final LanguageSettingsMenu languageSettingsMenu;

    public LanguageSettingsMenuService(LanguageSettingsMenu languageSettingsMenu) {
        this.languageSettingsMenu = languageSettingsMenu;
    }

    public void selectSpanishLanguage() {
        languageSettingsMenu.getSpanishLanguage().click();
    }

    public void clickSaveChangesButton() {
        languageSettingsMenu.getSaveChangesButton().click();
    }
}
