package com.chatsandbox.chatbot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document( collection = "ChatBotResponse")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatBotResponse {

    @Id
    private String responseId;
    private LocalDateTime timestamp;
    private String Content;

}
