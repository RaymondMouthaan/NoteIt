package org.mouthaan.noteit.steps;

import cucumber.api.java.en.Given;
import org.mouthaan.noteit.pages.NoteItFeedbackPage;

import static com.codeborne.selenide.Selenide.open;

public class NoteItSteps {
    NoteItFeedbackPage noteItFeedbackPage = new NoteItFeedbackPage();

    @Given("^that the user has opened Note It$")
    public void thatTheUserHasOpenedNoteIt() throws Throwable {
        open("/feedback");
    }
}
