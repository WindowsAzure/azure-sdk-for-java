/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_07_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2019_07_01.SecurityGroupNetworkInterface;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The information about security rules applied to the specified VM.
 */
public class SecurityGroupViewResultInner {
    /**
     * List of network interfaces on the specified VM.
     */
    @JsonProperty(value = "networkInterfaces")
    private List<SecurityGroupNetworkInterface> networkInterfaces;

    /**
     * Get list of network interfaces on the specified VM.
     *
     * @return the networkInterfaces value
     */
    public List<SecurityGroupNetworkInterface> networkInterfaces() {
        return this.networkInterfaces;
    }

    /**
     * Set list of network interfaces on the specified VM.
     *
     * @param networkInterfaces the networkInterfaces value to set
     * @return the SecurityGroupViewResultInner object itself.
     */
    public SecurityGroupViewResultInner withNetworkInterfaces(List<SecurityGroupNetworkInterface> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
        return this;
    }

}
