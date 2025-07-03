package com.sender.demo.model;

public class ChatMessage {
    private String room;
    private String user;
    private String content;

    // Default constructor (required for JSON deserialization)
    public ChatMessage() {}

    // Getters and setters
    public String getRoom() {
        return room;
    }
    public void setRoom(String room) {
        this.room = room;
    }

    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}