package com.crio.messaging;

// Message class contains all message related variables/functions.
public class Message {
    private String messageId;
    private String senderId;
    private String receiverId;
    private String messageContent;

    // Some Common fields, can be extended to many more.
    private MessageStatus messageStatus;

    public Message(String senderId, String receiverId, String messageContent) {
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.messageContent = messageContent;
        this.messageStatus = MessageStatus.SENT;
    }

    public String getSenderId() {
        return senderId;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public int getMessageContentSize(){
        return messageContent.length();
    }


    @Override
    public String toString() {
        return "Message [messageContent=" + messageContent + ", messageId=" + messageId + ", messageStatus="
                + messageStatus + ", receiverId=" + receiverId + ", senderId=" + senderId + "]";
    }



}
