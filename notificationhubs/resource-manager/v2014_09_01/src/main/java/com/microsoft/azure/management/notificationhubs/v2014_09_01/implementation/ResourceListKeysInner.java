/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.notificationhubs.v2014_09_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Namespace/NotificationHub Connection String.
 */
public class ResourceListKeysInner {
    /**
     * Gets or sets the primaryConnectionString of the created Namespace
     * AuthorizationRule.
     */
    @JsonProperty(value = "primaryConnectionString")
    private String primaryConnectionString;

    /**
     * Gets or sets the secondaryConnectionString of the created Namespace
     * AuthorizationRule.
     */
    @JsonProperty(value = "secondaryConnectionString")
    private String secondaryConnectionString;

    /**
     * Get gets or sets the primaryConnectionString of the created Namespace AuthorizationRule.
     *
     * @return the primaryConnectionString value
     */
    public String primaryConnectionString() {
        return this.primaryConnectionString;
    }

    /**
     * Set gets or sets the primaryConnectionString of the created Namespace AuthorizationRule.
     *
     * @param primaryConnectionString the primaryConnectionString value to set
     * @return the ResourceListKeysInner object itself.
     */
    public ResourceListKeysInner withPrimaryConnectionString(String primaryConnectionString) {
        this.primaryConnectionString = primaryConnectionString;
        return this;
    }

    /**
     * Get gets or sets the secondaryConnectionString of the created Namespace AuthorizationRule.
     *
     * @return the secondaryConnectionString value
     */
    public String secondaryConnectionString() {
        return this.secondaryConnectionString;
    }

    /**
     * Set gets or sets the secondaryConnectionString of the created Namespace AuthorizationRule.
     *
     * @param secondaryConnectionString the secondaryConnectionString value to set
     * @return the ResourceListKeysInner object itself.
     */
    public ResourceListKeysInner withSecondaryConnectionString(String secondaryConnectionString) {
        this.secondaryConnectionString = secondaryConnectionString;
        return this;
    }

}
