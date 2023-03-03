package it.develhope.WebSocket01.entities;

/**
 * @author Drumstyle92
 * DTO class that contains the payload for sending messages
 */
public class MessageDTO {

    /**
     * Type of message to send
     */
    private String type;

    /**
     * The content of the message
     */
    private String message;

    /**
     * @param type    the type
     * @param message the message
     * Parameterized constructor of the class
     */
    public MessageDTO(String type, String message) {
        this.type = type;
        this.message = message;
    }

    /**
     * @return the type
     * Method used for encapsulation
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type
     * Method used for encapsulation
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the message
     * Method used for encapsulation
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message
     * Method used for encapsulation
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
