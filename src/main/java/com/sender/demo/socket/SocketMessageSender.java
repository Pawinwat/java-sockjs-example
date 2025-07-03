package com.sender.demo.socket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;
@Component
public class SocketMessageSender {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    public void sendMessage(String destination, String message) {
        System.out.println(destination);
        messagingTemplate.convertAndSend(destination, message);
    }
}
