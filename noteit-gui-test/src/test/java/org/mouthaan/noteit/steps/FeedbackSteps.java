package org.mouthaan.noteit.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.mouthaan.noteit.pages.FeedbackPage;

import static com.codeborne.selenide.Selenide.open;

public class FeedbackSteps {
    private FeedbackPage feedbackPage = new FeedbackPage();

    @Given("^that the user is on the Note It Feedback page$")
    public void thatTheUserIsOnTheNoteItFeedbackPage() {
        open("/feedback");
    }

    @When("^on the Feedback page a firstname \"([^\"]*)\" is entered$")
    public void onTheFeedbackPageAFirstnameIsEntered(String firstName) {
        feedbackPage.setFirstName(firstName);
    }

    @And("^on the Feedback page an email \"([^\"]*)\" is entered$")
    public void onTheFeedbackPageAnEmailIsEntered(String email) {
        feedbackPage.setEmail(email);
    }


    @And("^on the Feedback page a feedback \"([^\"]*)\" is entered$")
    public void onTheFeedbackPageAFeedbackIsEntered(String feedback) {
        feedbackPage.setFeedback(feedback);
    }

    @Then("^on the Feedback page click on the Send Feedback button$")
    public void onTheFeedbackPageClickOnTheSendFeedbackButton() {
        feedbackPage.clickSendFeedback();
    }
}
