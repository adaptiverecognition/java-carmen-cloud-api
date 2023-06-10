/**
 * Cloud API Java reference implementation.

 * License: Apache License 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * This file is part of the Adaptive Recognition Hungary Kft. 
 * Vehicle API and Transportation&Cargo API Java reference implementation.
 * 
 * This software is free to use in either commercial or non-commercial applications.
 * 
 * This software is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied.
 * 
 * Adaptive Recognition Hungary Kft.
 * H-1023 Budapest, Alkotas u. 41. Hungary
 * Web: https://adaptiverecognition.com/contact-us/
 * 
 */
package com.adaptiverecognition.cloud;

/**
 * ARCloudException is a simple exception class that contains an HTTP status
 * code and a message.
 * 
 * @author laszlo.toth@arip.hu
 */
public class ARCloudException extends Exception {

    private final int statusCode;

    /**
     * Default constructor
     *
     * @param statusCode HTTP status code
     * @param message    message
     */
    public ARCloudException(int statusCode, String message) {
        this(statusCode, message, null);
    }

    /**
     * Another constructor, the cause can be specified
     *
     * @param statusCode HTTP status code
     * @param message    message
     * @param cause      cause
     */
    public ARCloudException(int statusCode, String message, Throwable cause) {
        super(message, cause);
        this.statusCode = statusCode;
    }

    /**
     * Get the value of HTTP status code
     *
     * @return the value of HTTP status code
     */
    public int getStatusCode() {
        return this.statusCode;
    }

    @Override
    public String toString() {
        return super.toString() + " [" + this.statusCode + "]";
    }
}
