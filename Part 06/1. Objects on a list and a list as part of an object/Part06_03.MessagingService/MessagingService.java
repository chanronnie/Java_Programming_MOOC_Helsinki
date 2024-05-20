/*
============== Java Programming I ==============
Part 6
Section 1 - Objetcs within objects
Ex 3 - Message


Implement the MessagingService class.
=================================================
*/

import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> messages;
    
    public MessagingService() {
        this.messages = new ArrayList<>();
    }
    
    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            this.messages.add(message);
        }
    }
    
    public ArrayList<Message> getMessages() {
        return this.messages;
    }
}
