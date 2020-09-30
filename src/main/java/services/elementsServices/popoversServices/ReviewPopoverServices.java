package services.elementsServices.popoversServices;

import pages.elements.popovers.ReviewPopover;

public class ReviewPopoverServices {
    private final ReviewPopover reviewPopover;

    public ReviewPopoverServices(ReviewPopover reviewPopover) {
        this.reviewPopover = reviewPopover;
    }

    public String getValueOfReview() {
        String reviewText = reviewPopover.getReviewTitle().getText();
        String[] list = reviewText.split(" ");
        return list[0];
    }
}

