package org.example;

import java.util.ArrayList;

public class ChatHistory {
    private ArrayList<Message> chatLog = new ArrayList<>();

    public void setChatLog(ArrayList<Message> chatLog) {
        this.chatLog = chatLog;
    }

    public ArrayList<Message> getChatLog() {
        return chatLog;
    }
    public void saveMessage(Message message) {
        chatLog.add(message);
    }
    public Message getPreviousMessage() {
        return chatLog.get(chatLog.size() - 1);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
