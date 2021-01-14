/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The session state detail for a target.
 */
public class BastionSessionStateInner {
    /**
     * A unique id for the session.
     */
    @JsonProperty(value = "sessionId", access = JsonProperty.Access.WRITE_ONLY)
    private String sessionId;

    /**
     * Used for extra information.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * The state of the session. Disconnected/Failed/NotFound.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private String state;

    /**
     * Get a unique id for the session.
     *
     * @return the sessionId value
     */
    public String sessionId() {
        return this.sessionId;
    }

    /**
     * Get used for extra information.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the state of the session. Disconnected/Failed/NotFound.
     *
     * @return the state value
     */
    public String state() {
        return this.state;
    }

}
