package com.crio.messaging;

public class Main {
    public static void main(String[] args) {
        // Call the android/iOS Controller code to send a message.
        // In real world, these functions will be called from your REST API server methods.
        // Don't worry about them for now - let's live in a simple world :)


        // Ankur sends a message to Abhinaya
		Message message1 = new Message("SENDER_Ankur","RECEIVER_Abhinaya","Hello, Have you checked out https://blog.crio.do?");
        MessageController.send(message1);

        // Aman sends a message to Abhiskek
        Message message2 = new Message("SENDER_Aman","RECEIVER_Abhiskek","Hello, Hello, Enjoying Learn By Doing");
        MessageController.send(message2);
	}
}
