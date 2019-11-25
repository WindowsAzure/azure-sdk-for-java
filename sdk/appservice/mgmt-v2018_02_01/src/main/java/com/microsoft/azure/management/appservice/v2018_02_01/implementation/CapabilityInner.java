/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the capabilities/features allowed for a specific SKU.
 */
public class CapabilityInner {
    /**
     * Name of the SKU capability.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Value of the SKU capability.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Reason of the SKU capability.
     */
    @JsonProperty(value = "reason")
    private String reason;

    /**
     * Get name of the SKU capability.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the SKU capability.
     *
     * @param name the name value to set
     * @return the CapabilityInner object itself.
     */
    public CapabilityInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get value of the SKU capability.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set value of the SKU capability.
     *
     * @param value the value value to set
     * @return the CapabilityInner object itself.
     */
    public CapabilityInner withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get reason of the SKU capability.
     *
     * @return the reason value
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set reason of the SKU capability.
     *
     * @param reason the reason value to set
     * @return the CapabilityInner object itself.
     */
    public CapabilityInner withReason(String reason) {
        this.reason = reason;
        return this;
    }

}
