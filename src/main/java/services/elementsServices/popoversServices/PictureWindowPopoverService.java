package services.elementsServices.popoversServices;


import pages.elements.popovers.PictureWindowPopover;

public class PictureWindowPopoverService {
    private final PictureWindowPopover pictureWindowPopover;

    public PictureWindowPopoverService(PictureWindowPopover pictureWindowPopover) {
        this.pictureWindowPopover = pictureWindowPopover;
    }

    public void clickOnTheActivePicture() {
        pictureWindowPopover.getActivePicture().click();
    }

    public boolean isZoomIn() {
        return pictureWindowPopover.getZoomPicture().isDisplayed();
    }
}
