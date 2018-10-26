package org.mouthaan.noteit.steps;

import cucumber.api.PendingException;
import cucumber.api.java8.En;
import org.mouthaan.noteit.pages.NotesPage;

import static com.codeborne.selenide.Selenide.open;

public class NotesSteps implements En {
    NotesPage notesPage = new NotesPage();

    public NotesSteps() {
        Given("^that the user is on the Note It Notes page$", () -> {
            open("/notes");
        });
        Then("^on the Notes page \"([^\"]*)\" must be displayed$", (String text) -> {
            // Write code here that turns the phrase above into concrete actions
            notesPage.checkBody(text);
        });

    }
}
