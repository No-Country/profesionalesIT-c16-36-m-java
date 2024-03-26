package com.nocountry.professionalIT.controller;

import com.nocountry.professionalIT.entities.MessageEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

/**
 * Represents a chat controller.
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-02-26
 */
@Controller
@RequiredArgsConstructor
public class ChatController {


    private final SimpMessagingTemplate simpMessagingTemplate;

    /**
     * Receives a private message from a client and sends it to the specified recipient.
     *
     * @param message The private message received from the client.
     * @return The private message entity received.
     */
    public MessageEntity recMessage(@Payload MessageEntity message){
        simpMessagingTemplate.convertAndSendToUser(message.getReceiverId(),"/private",message);
        System.out.println(message.toString());
        return message;
    }
}
