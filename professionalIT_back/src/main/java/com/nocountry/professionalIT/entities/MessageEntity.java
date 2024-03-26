package com.nocountry.professionalIT.entities;

import com.nocountry.professionalIT.enums.Status;
import lombok.*;
/**
 * Represents a message entity.
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-02-26
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MessageEntity {
    /**
     * ID of the sender.
     */
    private String senderId;

    /**
     * ID of the receiver.
     */
    private String receiverId;

    /**
     * Message content.
     */
    private String message;

    /**
     * Date of the message.
     */
    private String date;

    /**
     * Status of the message.
     */
    private Status status;
}
