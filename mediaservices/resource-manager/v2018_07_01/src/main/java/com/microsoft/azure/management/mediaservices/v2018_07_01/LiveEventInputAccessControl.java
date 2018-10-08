/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The IP access control for Live Event Input.
 */
public class LiveEventInputAccessControl {
    /**
     * The IP access control properties.
     */
    @JsonProperty(value = "ip")
    private IPAccessControl ip;

    /**
     * Get the IP access control properties.
     *
     * @return the ip value
     */
    public IPAccessControl ip() {
        return this.ip;
    }

    /**
     * Set the IP access control properties.
     *
     * @param ip the ip value to set
     * @return the LiveEventInputAccessControl object itself.
     */
    public LiveEventInputAccessControl withIp(IPAccessControl ip) {
        this.ip = ip;
        return this;
    }

}
