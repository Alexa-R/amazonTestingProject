package services.elementsServices.listsServices;

import pages.elements.lists.DropdownLanguageList;

public class DropdownLanguageListService {
    private final DropdownLanguageList dropdownLanguageList;

    public DropdownLanguageListService(DropdownLanguageList dropdownLanguageListService) {
        this.dropdownLanguageList = dropdownLanguageListService;
    }

    public void selectSpanishInLanguageList() {
        dropdownLanguageList.getLanguagesCollection().get(0).click();
    }

    public boolean isSpanishInLanguageListSelected(){
        return dropdownLanguageList.getLanguagesCollection().get(0).isSelected();
    }
}
