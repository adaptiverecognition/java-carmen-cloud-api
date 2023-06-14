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
 * CarmenCloudException is a simple exception class that contains an HTTP status
 * code and a message.
 *
 * @author laszlo.toth@arip.hu
 */
public class CarmenCloudException extends Exception {

    private final int statusCode;

    /**
     * <p>
     * Default constructor
     * </p>
     *
     * @param statusCode HTTP status code
     * @param message    message
     */
    public CarmenCloudException(int statusCode, String message) {
        this(statusCode, message, null);
    }

    /**
     * <p>
     * Another constructor, the cause can be specified
     * </p>
     *
     * @param statusCode HTTP status code
     * @param message    message
     * @param cause      cause
     */
    public CarmenCloudException(int statusCode, String message, Throwable cause) {
        super(message, cause);
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * Get the value of HTTP status code
     * </p>
     *
     * @return the value of HTTP status code
     */
    public int getStatusCode() {
        return this.statusCode;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return super.toString() + " [" + this.statusCode + "]";
    }
}
