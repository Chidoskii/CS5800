package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Message {
    private User sender;
    private ArrayList<User> recipients;
    private LocalDateTime timestamp;
    private String messageContent;

    public Message(String messageContent) {
        this.messageContent = messageContent;
    }

    public Message(User sender, ArrayList<User> recipients, LocalDateTime timestamp, String messageContent) {
        this.sender = sender;
        this.recipients = recipients;
        this.timestamp = timestamp;
        this.messageContent = messageContent;
    }
    public User getSender() {
        return sender;
    }
    public ArrayList<User> getRecipients() {
        return recipients;
    }
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    public String getMessageContent() {
        return messageContent;
    }

    @Override
    public String toString() {
        return "Message{" + messageContent + "}" +
                ", sender=" + sender +
                ", recipients=" + recipients +
                ", timestamp=" + timestamp +
                '}';
    }
}
