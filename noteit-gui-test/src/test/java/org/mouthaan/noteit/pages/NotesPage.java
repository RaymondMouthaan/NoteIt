package org.mouthaan.noteit.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class NotesPage {
    private SelenideElement p = $("body > app-root > div > app-notes > p");

    public void checkBody(String value) {
        p.shouldHave(Condition.text(value));
    }
}
