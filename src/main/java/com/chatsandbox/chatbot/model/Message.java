package com.chatsandbox.chatbot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "message")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {

    private String messageId;
    private String userId;
    private LocalDateTime timestamp;
    private String content;

}
