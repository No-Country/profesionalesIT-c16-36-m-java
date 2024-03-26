package com.nocountry.professionalIT.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * This class is the configuration of the WebSocket.
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-02-26
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    /**
     * Registers the WebSocket endpoint and enables SockJS fallback options.
     *
     * @param registry The StompEndpointRegistry to register WebSocket endpoints.
     */
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws").setAllowedOriginPatterns("*").withSockJS();
    }

    /**
     * Configures the message broker options for WebSocket communication.
     *
     * @param registry The MessageBrokerRegistry to configure message broker options.
     */
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        // Set prefix for messages bound for application controllers
        registry.setApplicationDestinationPrefixes("/app");
        // Enable a simple message broker for clients to subscribe and receive messages
        registry.enableSimpleBroker("/user");
        // Set prefix for user-specific destinations
        registry.setUserDestinationPrefix("/user");
    }

}
