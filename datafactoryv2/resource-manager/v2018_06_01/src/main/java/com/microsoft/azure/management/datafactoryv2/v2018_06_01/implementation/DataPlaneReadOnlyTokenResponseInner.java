/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Get Data Plane read only token response definition.
 */
public class DataPlaneReadOnlyTokenResponseInner {
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
     * Data Plane read only access token.
     */
    @JsonProperty(value = "accessToken")
    private String accessToken;

    /**
     * Data Plane service base URL.
     */
    @JsonProperty(value = "dataPlaneUrl")
    private String dataPlaneUrl;

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
     * @return the DataPlaneReadOnlyTokenResponseInner object itself.
     */
    public DataPlaneReadOnlyTokenResponseInner withStartTime(String startTime) {
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
     * @return the DataPlaneReadOnlyTokenResponseInner object itself.
     */
    public DataPlaneReadOnlyTokenResponseInner withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * Get data Plane read only access token.
     *
     * @return the accessToken value
     */
    public String accessToken() {
        return this.accessToken;
    }

    /**
     * Set data Plane read only access token.
     *
     * @param accessToken the accessToken value to set
     * @return the DataPlaneReadOnlyTokenResponseInner object itself.
     */
    public DataPlaneReadOnlyTokenResponseInner withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Get data Plane service base URL.
     *
     * @return the dataPlaneUrl value
     */
    public String dataPlaneUrl() {
        return this.dataPlaneUrl;
    }

    /**
     * Set data Plane service base URL.
     *
     * @param dataPlaneUrl the dataPlaneUrl value to set
     * @return the DataPlaneReadOnlyTokenResponseInner object itself.
     */
    public DataPlaneReadOnlyTokenResponseInner withDataPlaneUrl(String dataPlaneUrl) {
        this.dataPlaneUrl = dataPlaneUrl;
        return this;
    }

}
