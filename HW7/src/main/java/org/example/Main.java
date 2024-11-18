package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Mediator chatServer = new ChatServer();
        User sam = new User("UncleSam");
        User bill = new User("BadActorBill");
        User clarice = new User("Clarice");
        User tiff = new User("Tiffany");
        ArrayList<User> listOfUsers = new ArrayList<>();
        ArrayList<User> blockList = new ArrayList<>();
        ArrayList<String> listOfUserNames = new ArrayList<>();
        listOfUsers.add(sam);
        listOfUsers.add(bill);
        listOfUsers.add(clarice);
        listOfUsers.add(tiff);
        System.out.println("---------- Current User List ---------");
        for (User u : listOfUsers) {
            listOfUserNames.add(u.getUsername());
        }
        System.out.println(listOfUserNames);
        System.out.println();

        sam.setMediator(chatServer);
        bill.setMediator(chatServer);
        clarice.setMediator(chatServer);
        tiff.setMediator(chatServer);

        listOfUsers.clear();
        listOfUsers.add(bill);
        listOfUsers.add(clarice);
        listOfUsers.add(tiff);
        LocalDateTime trialTime = LocalDateTime.now();
        Message samsMessage = new Message(sam, listOfUsers, trialTime, "Hey Guys, this is Sam.");
        Message samMessage2 = new Message(sam, listOfUsers, trialTime, "Another message from Sam");
        sam.sendMessage(samsMessage);
        sam.sendMessage(samMessage2);
        System.out.println("---------- Messages Sent by Sam ---------");

        bill.receiveMessage(bill);
        Message receivedMessage = bill.getLastMessage();
        System.out.println("Bill's Messages");
        System.out.println(receivedMessage.getMessageContent());
        System.out.println();
        System.out.println(bill.getMyMessages());

        sam.undoMessage(samsMessage);
        tiff.receiveMessage(tiff);
        receivedMessage = tiff.getLastMessage();
        System.out.println("Tiff's Messages");
        System.out.println(receivedMessage.getMessageContent());
        System.out.println();

        blockList.add(sam);
        clarice.blockMessages(blockList);
        clarice.receiveMessage(clarice);
        receivedMessage = clarice.getLastMessage();
        System.out.println("Clarice's Messages (Sam is blocked)");
        System.out.println(receivedMessage.getMessageContent());
        System.out.println();

        System.out.println("---------- Undo Messages Sent by Sam ---------");
        sam.sendMessage(samsMessage);

        sam.undoMessage(samsMessage);
        bill.receiveMessage(bill);
        receivedMessage = bill.getLastMessage();
        System.out.println("Bill's Messages");
        System.out.println(receivedMessage.getMessageContent());



    }
}