package stepdefs.popoverStepdefs;

import io.cucumber.java.en.And;
import services.elementsServices.popoversServices.PictureWindowPopoverService;

import static org.junit.Assert.assertTrue;

public class PictureWindowStepdefs {
    private final PictureWindowPopoverService pictureWindowPopoverService;

    public PictureWindowStepdefs(PictureWindowPopoverService pictureWindowPopoverService) {
        this.pictureWindowPopoverService = pictureWindowPopoverService;
    }

    @And("click on the active image on the picture window")
    public void clickOnTheActiveImageOnThePictureWindow() {
        pictureWindowPopoverService.clickOnTheActivePicture();
    }

    @And("the zoom brings the image closer on the picture window")
    public void theZoomBringsTheImageCloserOnThePictureWindow() {
        assertTrue(pictureWindowPopoverService.isZoomIn());
    }
}
