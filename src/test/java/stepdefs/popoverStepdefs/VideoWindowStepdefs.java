package stepdefs.popoverStepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import services.elementsServices.popoversServices.VideoWindowPopoverService;

import static org.junit.Assert.*;

public class VideoWindowStepdefs {
    private final VideoWindowPopoverService videoWindowPopoverService;

    public VideoWindowStepdefs(VideoWindowPopoverService videoWindowPopoverService) {
        this.videoWindowPopoverService = videoWindowPopoverService;
    }

    @And("run the video on the Video Window")
    public void runTheVideoOnTheVideoWindow() {
        videoWindowPopoverService.playVideo();
    }

    @Then("the video on the Video Window is played")
    public void theVideoOnTheVideoWindowIsPlayed() {
        assertFalse(videoWindowPopoverService.isPlayIconDisplayed());
    }

    @And("pause the video on the Video Window")
    public void pauseTheVideoOnTheVideoWindow() {
        videoWindowPopoverService.pauseVideo();
    }

    @Then("the video on the Video Window is not played")
    public void theVideoOnTheVideoWindowIsNotPlayed() {
        assertTrue(videoWindowPopoverService.isPlayIconDisplayed());
    }

    @Then("the video duration is more than {int} seconds")
    public void theVideoDurationIsMoreThanSeconds(int arg0) {
        assertTrue(videoWindowPopoverService.getDurationOfTheVideo() > 5.0);
    }
}
