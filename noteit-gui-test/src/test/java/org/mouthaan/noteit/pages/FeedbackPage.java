package org.mouthaan.noteit.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class FeedbackPage {
    private SelenideElement firstName = $("#name");
    private SelenideElement email = $("#email");
    private SelenideElement feedback = $("#feedback");
    private SelenideElement sendFeedback = $(".btn");


    public void setFirstName(String firstName) {
        this.firstName.setValue(firstName);
    }

    public void setEmail(String email) {
        this.email.setValue(email);
    }

    public void setFeedback(String feedback) {
        this.feedback.setValue(feedback);
    }

    public void clickSendFeedback() {
        this.sendFeedback.click();
    }
}
