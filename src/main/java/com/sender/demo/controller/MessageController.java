package com.sender.demo.controller;

import com.sender.demo.socket.SocketMessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MessageController {

    @Autowired
    private SocketMessageSender sender;

    @PostMapping("/send/{staffId}")
    public String sendMessage(@PathVariable String staffId,@RequestBody String message,  @RequestParam String user) {
        String jsonBody = String.format(
                "{ \"room\": \"%s\", \"user\": \"%s\", \"content\": \"%s\" }",
                staffId, user, message
        );
        sender.sendMessage("/topic/messages", jsonBody); // Send to /topic/messages
        return "Message sent: " + jsonBody;
    }


}
