package com.adaptiverecognition.cloud;

/**
 * 
 */
public class HandlerException extends Exception {
    private final int statusCode;

    /**
     * 
     * @param statusCode
     * @param message
     */
    public HandlerException(int statusCode, String message) {
        super(message);
        this.statusCode = statusCode;
    }

    /**
     * 
     * @return
     */
    public int getStatusCode() {
        return this.statusCode;
    }
}
