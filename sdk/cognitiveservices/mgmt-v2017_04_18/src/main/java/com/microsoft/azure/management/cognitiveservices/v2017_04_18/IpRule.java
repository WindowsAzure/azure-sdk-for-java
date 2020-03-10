/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cognitiveservices.v2017_04_18;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A rule governing the accessibility from a specific ip address or ip range.
 */
public class IpRule {
    /**
     * An IPv4 address range in CIDR notation, such as '124.56.78.91' (simple
     * IP address) or '124.56.78.0/24' (all addresses that start with
     * 124.56.78).
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Get an IPv4 address range in CIDR notation, such as '124.56.78.91' (simple IP address) or '124.56.78.0/24' (all addresses that start with 124.56.78).
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set an IPv4 address range in CIDR notation, such as '124.56.78.91' (simple IP address) or '124.56.78.0/24' (all addresses that start with 124.56.78).
     *
     * @param value the value value to set
     * @return the IpRule object itself.
     */
    public IpRule withValue(String value) {
        this.value = value;
        return this;
    }

}
