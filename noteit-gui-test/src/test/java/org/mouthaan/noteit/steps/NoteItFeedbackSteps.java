package org.mouthaan.noteit.steps;

import cucumber.api.java.en.When;
import org.mouthaan.noteit.pages.NoteItFeedbackPage;

public class NoteItFeedbackSteps {
    NoteItFeedbackPage noteItFeedbackPage = new NoteItFeedbackPage();

    @When("^on the Feedback page a name is entered$")
    public void onTheFeedbackPageANameIsEntered() {
        noteItFeedbackPage.enterFirstName("Hiltsje");
    }
}
