package pages.elements.popovers;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class VideoWindowPopover {
    private SelenideElement videoPlayer = $(By.xpath("//video[contains(@id, 'detailpage-imageblock-player')]"));
    private SelenideElement playIcon = $(By.xpath("//*[contains(@id, 'detailpage-imageblock-player')]/button/span[2]"));

    public SelenideElement getVideoPlayer() {
        return videoPlayer;
    }

    public SelenideElement getPlayIcon() {
        return playIcon;
    }
}
