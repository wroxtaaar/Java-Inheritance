package com.crio.messaging;


public class MessageController {

    public static void send(Message message) {
        // 1. Discard empty strings.
        if (message.getMessageContent().isEmpty()){
            try {
                throw new Exception("Cannot send empty string");
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        // 3. Store the Message Safely.
        save(message);
        
        // 4.Deliver the message.
        deliver(message);


    }

    private static void save(Message message) {
        // Write logic to store the message
        System.out.println(message + " stored successfully.");
    }

    private static void deliver(Message message) {
        // Logic to actually send the message to the user. It may happen through some queueing mechanism.
        // Out of syllabus for this exercise :')

        // # If the message is too large, don't deliver the message directly.
        // For now, drop the message, in future it can be sent as a link to a storage bucket.
        if(message.getMessageContentSize() > 100){
            try {
                throw new Exception("Message too large to send >" + message.getMessageContentSize() + " 100 bytes");
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        System.out.println(message + " delivered successfully.");
    }
    
}
