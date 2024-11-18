import org.example.ChatServer;
import org.example.Mediator;
import org.example.Message;
import org.example.User;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ChatServerTest {
    ChatServer server = new ChatServer();
    Mediator chatServer = new ChatServer();

    @Test
    public void testRegisterUser(){
        User bill = new User("Bill");
        ArrayList<User> expected = new ArrayList<>();
        expected.add(bill);
        ArrayList<User> actual = new ArrayList<>();
        server.registerUser(bill);
        actual = server.getRegisteredUsers();
        assertEquals(expected, actual);
    }

    @Test
    public void testUnregisterUser(){
        User bill = new User("Bill");
        ArrayList<User> expected = new ArrayList<>();
        ArrayList<User> actual = new ArrayList<>();
        server.registerUser(bill);
        actual = server.getRegisteredUsers();
        server.unregisterUser(bill);
        actual = server.getRegisteredUsers();
        assertEquals(expected, actual);
    }

    @Test
    public void testSendMessage(){
        User bill = new User("Bill");
        ArrayList<User> recipients = new ArrayList<>();
        recipients.add(bill);
        User sally = new User("Sally");
        LocalDateTime trialTime = LocalDateTime.now();
        Message expected = new Message(sally, recipients, trialTime, "only a test");
        server.sendMessage(expected);
        Message actual = server.getLastMessage();
        assertEquals(expected, actual);
    }

    @Test
    public void testReceiveMessage(){
        User bill = new User("Bill");
        bill.setMediator(chatServer);
        ArrayList<User> recipients = new ArrayList<>();
        recipients.add(bill);
        User sally = new User("Sally");
        LocalDateTime trialTime = LocalDateTime.now();
        Message expected = new Message(sally, recipients, trialTime, "only a test");
        chatServer.sendMessage(expected);
        bill.receiveMessage(bill);
        Message actual = bill.getLastMessage();
        assertEquals(expected, actual);
    }

    @Test
    public void testBlockMessage(){
        User bill = new User("Bill");
        ArrayList<User> recipients = new ArrayList<>();
        ArrayList<User> blockList = new ArrayList<>();
        recipients.add(bill);
        User sally = new User("Sally");
        blockList.add(sally);
        LocalDateTime trialTime = LocalDateTime.now();
        Message expected = new Message(bill, recipients, trialTime, "only a test");
        Message msg = new Message(sally, recipients, trialTime, "I am blocked");
        server.sendMessage(expected);
        server.sendMessage(msg);
        server.blockMessages(blockList);
        Message actual = server.getLastMessage();
        assertEquals(expected, actual);
    }
}
