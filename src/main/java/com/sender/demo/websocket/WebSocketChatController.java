package com.sender.demo.websocket;

import com.sender.demo.model.ChatMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketChatController {
    private static final Logger logger = LoggerFactory.getLogger(WebSocketChatController.class);

    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public ChatMessage broadcast(ChatMessage message) {
        logger.info("WebSocket received from [{}] in [{}]: {}", message.getUser(), message.getRoom(), message.getContent());
        return message;
    }
}