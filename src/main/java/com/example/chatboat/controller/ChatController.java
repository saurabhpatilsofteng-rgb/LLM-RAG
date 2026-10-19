package com.example.chatboat.controller;


import com.example.chatboat.service.ChatService;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/chat")
public class ChatController {


    private final ChatService chatService;

    public ChatController(ChatService chatService){
        this.chatService = chatService;
    }

    @GetMapping
    public Flux<String> chat(
            @RequestParam String message,
            @RequestParam(defaultValue = "0.2")
            double temperature) {

        if (temperature < 0.0 || temperature > 1.0) {
            throw new IllegalArgumentException(
                    "Temperature must be between 0.0 and 1.0");
        }

        return chatService.ask(message, temperature);
    }
}
