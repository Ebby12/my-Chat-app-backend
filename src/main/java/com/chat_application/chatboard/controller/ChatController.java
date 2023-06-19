package com.chat_application.chatboard.controller;
//This suggests that the file contains class(es) related to handling and controlling
// the flow of requests and responses in an application, typically part of the
// MVC (Model-View-Controller) architecture.

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.chat_application.chatboard.model.Message;

@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
@Controller   //the first landing point where the url lands
public class ChatController {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/message")  //is an annotation that maps incoming messages with a
    // destination of "/message" to the receiveMessage method.
    @SendTo("/chatroom")
    // is an annotation that specifies the destination to which the return value of the
    // receiveMessage method should be sent.
    public Message receiveMessage(@Payload Message message){
        return message;
    }

// is a method that receives a WebSocket message payload of type Message
    // and returns the same message.
}



