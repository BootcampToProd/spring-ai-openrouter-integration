package com.bootcamptoprod.controller;

import com.bootcamptoprod.dto.ChatRequest;
import com.bootcamptoprod.dto.ChatResponse;
import com.bootcamptoprod.service.ChatService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    /**
     * Handles POST requests to /api/chat/message
     * Processes user messages and returns AI responses
     */
    @PostMapping("/message")
    public ResponseEntity<ChatResponse> sendMessage(@RequestBody ChatRequest chatRequest) {
        System.out.println("🔄 Received chat request from client");

        // Process the message through our service
        ChatResponse chatResponse = chatService.processMessage(chatRequest);

        System.out.println("📬 Sending response back to client");
        return ResponseEntity.ok(chatResponse);
    }
}
