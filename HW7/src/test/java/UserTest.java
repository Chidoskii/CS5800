import org.example.ChatServer;
import org.example.Mediator;
import org.example.Message;
import org.example.User;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class UserTest {
    Mediator chatServer = new ChatServer();
    ArrayList<User> recipients = new ArrayList<>();
    User sam = new User("UncleSam");
    User bill = new User("BadActorBill");
    User clarice = new User("Clarice");
    User tiff = new User("Tiffany");

    @Test
    public void testSendMessage() {
        sam.setMediator(chatServer);
        recipients.add(bill);
        recipients.add(clarice);
        LocalDateTime trialTime = LocalDateTime.now();
        Message test = new Message(sam, recipients, trialTime, "only a test");
        sam.sendMessage(test);
        ArrayList<Message> expected = new ArrayList<>();
        expected.add(test);
        ArrayList<Message> actual = chatServer.getChatLog();
        assertEquals(expected, actual);
    }

    @Test
    public void receiveSendMessage() {
        sam.setMediator(chatServer);
        recipients.add(bill);
        recipients.add(clarice);
        LocalDateTime trialTime = LocalDateTime.now();
        Message test = new Message(sam, recipients, trialTime, "only a test");
        sam.sendMessage(test);
        ArrayList<Message> expected = new ArrayList<>();
        expected.add(test);
        ArrayList<Message> actual = chatServer.getChatLog();
        assertEquals(expected, actual);
    }

    @Test
    public void testUndoMessage() {
        sam.setMediator(chatServer);
        recipients.add(bill);
        recipients.add(clarice);
        LocalDateTime trialTime = LocalDateTime.now();
        Message test = new Message(sam, recipients, trialTime, "only a test");
        Message test2 = new Message(sam, recipients, trialTime, "undo this message");
        sam.sendMessage(test);
        sam.sendMessage(test2);
        ArrayList<Message> expected = new ArrayList<>();
        expected.add(test);
        sam.undoMessage(test2);
        ArrayList<Message> actual = chatServer.getChatLog();
        assertEquals(expected, actual);
    }
}
