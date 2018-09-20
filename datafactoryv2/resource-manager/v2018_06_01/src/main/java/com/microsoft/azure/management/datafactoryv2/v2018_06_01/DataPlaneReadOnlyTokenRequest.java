/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Get Data Plane read only token request definition.
 */
public class DataPlaneReadOnlyTokenRequest {
    /**
     * Start time for the token. If not specified the current time will be
     * used.
     */
    @JsonProperty(value = "startTime")
    private String startTime;

    /**
     * Expiration time for the token. Maximum duration for the token is eight
     * hours and by default the token will expire in eight hours.
     */
    @JsonProperty(value = "expireTime")
    private String expireTime;

    /**
     * Get start time for the token. If not specified the current time will be used.
     *
     * @return the startTime value
     */
    public String startTime() {
        return this.startTime;
    }

    /**
     * Set start time for the token. If not specified the current time will be used.
     *
     * @param startTime the startTime value to set
     * @return the DataPlaneReadOnlyTokenRequest object itself.
     */
    public DataPlaneReadOnlyTokenRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get expiration time for the token. Maximum duration for the token is eight hours and by default the token will expire in eight hours.
     *
     * @return the expireTime value
     */
    public String expireTime() {
        return this.expireTime;
    }

    /**
     * Set expiration time for the token. Maximum duration for the token is eight hours and by default the token will expire in eight hours.
     *
     * @param expireTime the expireTime value to set
     * @return the DataPlaneReadOnlyTokenRequest object itself.
     */
    public DataPlaneReadOnlyTokenRequest withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

}
