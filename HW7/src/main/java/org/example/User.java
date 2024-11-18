package org.example;

import java.util.ArrayList;

public class User implements Component{
    private final String username;
    private Mediator mediator;
    private ArrayList<Message> myMessages = new ArrayList<>();
    private final Message emptyMessage = new Message("You have no messages");

    public User(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }

    public void setMyMessages(ArrayList<Message> myMessages) {
        this.myMessages = myMessages;
    }

    public ArrayList<Message> getMyMessages() {
        return myMessages;
    }

    public void sendMessage(Message message) {
        mediator.sendMessage(message);
    }
    public void receiveMessage(User user) {
        mediator.receiveMessage(this);
    }
    public void blockMessages(ArrayList<User> users) {
        mediator.blockMessages(users);
    }
    public void undoMessage(Message message) {
        mediator.undoMessage(message);
    }
    public Message getLastMessage() {
        return myMessages.isEmpty() ? emptyMessage : myMessages.get(myMessages.size() - 1);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String toString() {
        return getUsername();
    }
}
