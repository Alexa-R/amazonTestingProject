package services.elementsServices.blocksServices;

import pages.elements.blocks.FooterBlock;

public class FooterBlockService {
    private final FooterBlock footerBlock;

    public FooterBlockService(FooterBlock footerBlock) {
        this.footerBlock = footerBlock;
    }

    public void scrollToFooter(){
        footerBlock.getFooterBox().scrollTo();
    }

    public void clickOnDropdownLanguageMenu(){
        footerBlock.getDropdownLanguageMenu().click();
    }

    public boolean getTextDropdownLanguageMenu(String language){
       return footerBlock.getDropdownLanguageMenu().getText().toUpperCase().contains(language.toUpperCase());
    }
}
