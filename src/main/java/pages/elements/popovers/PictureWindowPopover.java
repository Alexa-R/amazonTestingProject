package pages.elements.popovers;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PictureWindowPopover {
    private SelenideElement activePicture = $(By.xpath("//*[@id=\"ivLargeImage\"]/img"));
    private SelenideElement zoomPicture = $(By.xpath("//*[@id=\"ivLargeImage\" and contains(@style, 'zoom-out')]"));

    public SelenideElement getActivePicture() {
        return activePicture;
    }

    public SelenideElement getZoomPicture() {
        return zoomPicture;
    }
}
