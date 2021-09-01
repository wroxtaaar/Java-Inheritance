package com.crio.messaging;

public class Main {
    public static void main(String[] args) {
        // Call the android/iOS Controller code to send a message.
        // In real world, these functions will be called from your REST API server methods.
        // Don't worry about them for now - let's live in a simple world :)


        // Ankur sends a message to Abhinaya
		// Ankur sends a text message to Abhinaya
		Message message1 = new Message();
        message1.setSenderId("SENDER_Ankur");
        message1.setReceiverId("RECEIVER_Abhinaya");
        message1.setMessageContent("Hello, Have you checked out https://blog.crio.do?");
        AndroidHandler.send(message1);


        // Aman sends a message to Abhiskek
        Message message2 = new Message();
        message2.setSenderId("SENDER_Aman");
        message2.setReceiverId("RECEIVER_Abhiskek");
        message2.setMessageContent("Hello, Hello, Enjoying Learn By Doing!");

        AndroidHandler.send(message2);
	}
}
