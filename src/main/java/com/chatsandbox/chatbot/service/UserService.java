package com.chatsandbox.chatbot.service;

import com.chatsandbox.chatbot.model.User;
import com.chatsandbox.chatbot.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> getUserById(ObjectId userId) {

        return userRepository.findById(userId);
    }

}
