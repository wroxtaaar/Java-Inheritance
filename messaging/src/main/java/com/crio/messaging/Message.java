package com.crio.messaging;

// Message class contains all message related variables/functions.
public class Message {
    private String messageId;
    private String senderId;
    private String receiverId;
    private String messageContent;

    // Some Common fields, can be extended to many more.
    private MessageStatus messageStatus;

    public Message() {
        this.messageStatus = MessageStatus.SENT;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public MessageStatus getMessageStatus() {
        return messageStatus;
    }

    public void setMessageStatus(MessageStatus messageStatus) {
        this.messageStatus = messageStatus;
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
