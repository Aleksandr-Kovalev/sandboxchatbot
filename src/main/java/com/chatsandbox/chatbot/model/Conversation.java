package com.chatsandbox.chatbot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "Conversation")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Conversation {

    @Id
    private String conversationId;
    private String userId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private List<Message> conversation;
}
