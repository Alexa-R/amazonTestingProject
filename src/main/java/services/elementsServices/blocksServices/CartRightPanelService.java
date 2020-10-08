package services.elementsServices.blocksServices;

import pages.elements.blocks.CartRightPanel;


public class CartRightPanelService {
    private final CartRightPanel cartRightPanel;

    public CartRightPanelService(CartRightPanel cartRightPanel) {
        this.cartRightPanel = cartRightPanel;
    }

    public boolean isCartRightPanelBoxDisplayed() {
        if (cartRightPanel.getCloseRightPanel().isDisplayed()) {
            cartRightPanel.getCloseRightPanel().click();
        }
        return cartRightPanel.getCartRightPanelBox().isDisplayed();
    }
}
