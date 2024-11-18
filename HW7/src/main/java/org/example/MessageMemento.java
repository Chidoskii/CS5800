package org.example;

import java.time.LocalDateTime;

public class MessageMemento {
    private User sender;
    private LocalDateTime timestamp;
    private String messageContent;

    public MessageMemento(User sender, LocalDateTime timestamp, String messageContent) {
        this.sender = sender;
        this.timestamp = timestamp;
        this.messageContent = messageContent;
    }

    public MessageMemento createMessageMemento(Message message) {
        return new MessageMemento(message.getSender(), message.getTimestamp(), message.getMessageContent());
    }
}
