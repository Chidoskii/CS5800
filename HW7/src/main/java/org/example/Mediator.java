package org.example;

import java.util.ArrayList;

public interface Mediator {
    void registerUser(User user);
    void unregisterUser(User user);
    void sendMessage(Message message);
    void receiveMessage(User user);
    void blockMessages(ArrayList<User> user);
    void undoMessage(Message message);
    ArrayList<Message> getChatLog();
}
