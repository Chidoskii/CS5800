package org.example;

import java.util.ArrayList;

public class ChatServer implements Mediator {
    private static ChatServer instance;
    private static final ArrayList<User> registeredUsers = new ArrayList<>();
    private ChatHistory chatHistory = new ChatHistory();

    public static ChatServer getInstance() {
        if (instance == null) {
            instance = new ChatServer();
        }
        return instance;
    }

    public void registerUser(User user) {
        registeredUsers.add(user);
    }

    public ArrayList<User> getRegisteredUsers() {
        return registeredUsers;
    }

    public void unregisterUser(User user) {
        registeredUsers.remove(user);
    }

    public void sendMessage(Message message) {
        chatHistory.saveMessage(message);
    }

    @Override
    public void receiveMessage(User user) {
        ArrayList<Message> chatMessages = chatHistory.getChatLog();
        ArrayList<Message> myChatMessages = new ArrayList<>();
        ArrayList<User> recipients;
        for (Message msg : chatMessages) {
            recipients = msg.getRecipients();
            if (recipients.contains(user)) {
                myChatMessages.add(msg);
            }
        }
        user.setMyMessages(myChatMessages);
    }

    public void blockMessages(ArrayList<User> users) {
        ArrayList<Message> chatMessages = chatHistory.getChatLog();
        ArrayList<Message> blockedChatMessages = new ArrayList<>();
        for (Message message : chatMessages) {
            for (User user : users) {
                if (user == message.getSender()) {
                    blockedChatMessages.add(message);
                }
            }
        }
        chatMessages.removeAll(blockedChatMessages);
        chatHistory.setChatLog(chatMessages);
    }
    public Message getLastMessage() {
        return chatHistory.getPreviousMessage();
    }

    public ArrayList<Message> getChatLog() {
        return chatHistory.getChatLog();
    }

    public void undoMessage(Message message) {
        ArrayList<Message> chatMessages = chatHistory.getChatLog();
        ArrayList<Message> undoChatMessages = new ArrayList<>();
        for (Message msg: chatMessages) {
            if (msg == message) {
                undoChatMessages.add(msg);
            }
        }
        chatMessages.removeAll(undoChatMessages);
        chatHistory.setChatLog(chatMessages);
    }
}
