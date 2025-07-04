package com.bootcamptoprod.service;

import com.bootcamptoprod.dto.ChatRequest;
import com.bootcamptoprod.dto.ChatResponse;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    private final ChatClient chatClient;

    /**
     * Constructor injection for ChatClient
     * ChatClient.Builder is auto-configured by Spring AI
     */
    public ChatService(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }

    /**
     * Processes user messages through OpenRouter AI models
     */
    public ChatResponse processMessage(ChatRequest chatRequest) {
        System.out.println("📨 Processing message: " + chatRequest.message());

        try {
            // Send the user's message to the AI model via OpenRouter
            String content = chatClient.prompt()
                    .user(chatRequest.message())  // Set the user's message
                    .call()                       // Make the API call
                    .content();                   // Extract the response content

            System.out.println("✅ AI response received successfully");
            return new ChatResponse(content);

        } catch (Exception e) {
            // Log the error for debugging while providing user-friendly response
            System.err.println("❌ Error processing message: " + e.getMessage());
            return new ChatResponse("Sorry, an error occurred while processing your message. Please try again.");
        }
    }
}
