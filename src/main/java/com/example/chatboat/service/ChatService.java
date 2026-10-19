package com.example.chatboat.service;

import org.springframework.ai.chat.client.ChatClient;

import org.springframework.ai.ollama.api.OllamaChatOptions;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class ChatService {

    private final ChatClient chatClient;

    public ChatService(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    public Flux<String> ask(String message, double temperature) {

        OllamaChatOptions.Builder option = OllamaChatOptions.builder()
                .temperature(temperature)
                .numPredict(200);


        return chatClient.prompt()
                .system("""
                        You are a Java programming tutor.
                        Explain concepts in simple English.
                        Give a short definition and one example.
                        """)
                .user(message)
                .options(option)
                .stream()
                .content();
    }
}