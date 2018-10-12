package org.mouthaan.noteit.mail;

public interface FeedbackSender {
    void sendFeedback(String from, String name, String feedback);
}
