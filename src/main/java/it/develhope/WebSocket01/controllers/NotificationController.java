package it.develhope.WebSocket01.controllers;

import it.develhope.WebSocket01.entities.MessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Drumstyle92
 * Controller class that with CRUD manages calls between clients and web server with web socket
 */
@RestController
public class NotificationController {

    /**
     * The automated instance of this class which through
     * its methods simplifies us sending messages with web socket and STOMP
     */
    @Autowired
    SimpMessagingTemplate simpMessagingTemplate;

    /**
     * @param message Parameter where based on the payload we can modify the body and send it
     * Post method that creates a message to be sent to the client or server by modifying the payload in the body
     */
    @PostMapping("/broadcast-message")
    public void postMessege(@RequestBody MessageDTO message){

        simpMessagingTemplate.convertAndSend("/broadcast", message);

    }
}
