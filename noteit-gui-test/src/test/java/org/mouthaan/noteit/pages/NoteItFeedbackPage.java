package org.mouthaan.noteit.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class NoteItFeedbackPage {
    private SelenideElement firstName = $("#name");
    private SelenideElement email = $("#email");
    private SelenideElement feedback = $("#feedback");
    private SelenideElement btnSendFeedback = $(".btn");


    public void enterFirstName(String firstName) {
        this.firstName.setValue(firstName);
    }

    public void enterEmail(String email) {
        this.email.setValue(email);
    }

    public void enterFeedback(String feedback) {
        this.feedback.setValue(feedback);
    }

    public void clickBtnSendFeedback() {
        this.btnSendFeedback.click();
    }
}
