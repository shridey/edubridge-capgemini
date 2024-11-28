package com.spring.lab7;

import org.springframework.beans.factory.annotation.Value;

public class Message {

	@Value(value="01")
private int messageId;
    
    @Value(value="hello")
private String message;
public int getMessageId() {
    return messageId;
}
public void setMessageId(int messageId) {
    this.messageId = messageId;
}
public String getMessage() {
    return message;
}
public void setMessage(String message) {
    this.message = message;
}
@Override
public String toString() {
    return "Message [messageId=" + messageId + ", message=" + message + "]";
}
public void display() {
    System.out.println("message id ="+messageId);
    System.out.println("message ="+message);
}
}
