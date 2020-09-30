package stepdefs.popoverStepdefs;

import io.cucumber.java.en.Then;
import services.elementsServices.popoversServices.ReviewPopoverServices;

import static org.junit.Assert.assertTrue;

public class ReviewPopoverStepdefs {
    private final ReviewPopoverServices reviewPopoverServices;

    public ReviewPopoverStepdefs(ReviewPopoverServices reviewPopoverServices) {
        this.reviewPopoverServices = reviewPopoverServices;
    }

    @Then("average user review value is greater than {int} and less than {int}")
    public void averageUserReviewValueIsGreaterThanAndLessThan(int arg0, int arg1) {
        assertTrue(Double.parseDouble(reviewPopoverServices.getValueOfReview()) > arg0
                && Double.parseDouble(reviewPopoverServices.getValueOfReview()) <= arg1);
    }
}
