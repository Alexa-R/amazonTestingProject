package services.elementsServices.listsServices;

import pages.elements.lists.DropdownLanguageList;

public class DropdownLanguageListService {
    private final DropdownLanguageList dropdownLanguageList;

    public DropdownLanguageListService(DropdownLanguageList dropdownLanguageListService) {
        this.dropdownLanguageList = dropdownLanguageListService;
    }

    public void selectSpanishInLanguageList() {
        dropdownLanguageList.getSpanishLanguage().click();
    }

    public boolean isSpanishInLanguageListSelected(){
        return dropdownLanguageList.getSpanishLanguageSelected().isSelected();
    }
}
