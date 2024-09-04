package com.example.chat.service;

import com.example.chat.model.ChatMessage;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    public ChatMessage processMessage(ChatMessage chatMessage) {
        // You can add any processing logic here
        return chatMessage;
    }

    public ChatMessage addUser(ChatMessage chatMessage) {
        chatMessage.setContent(chatMessage.getSender() + " joined the chat");
        chatMessage.setType(ChatMessage.MessageType.JOIN);
        return chatMessage;
    }
}