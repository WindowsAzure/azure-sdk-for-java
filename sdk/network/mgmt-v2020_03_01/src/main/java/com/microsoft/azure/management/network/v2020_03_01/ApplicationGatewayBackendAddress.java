/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Backend address of an application gateway.
 */
public class ApplicationGatewayBackendAddress {
    /**
     * Fully qualified domain name (FQDN).
     */
    @JsonProperty(value = "fqdn")
    private String fqdn;

    /**
     * IP address.
     */
    @JsonProperty(value = "ipAddress")
    private String ipAddress;

    /**
     * Get fully qualified domain name (FQDN).
     *
     * @return the fqdn value
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Set fully qualified domain name (FQDN).
     *
     * @param fqdn the fqdn value to set
     * @return the ApplicationGatewayBackendAddress object itself.
     */
    public ApplicationGatewayBackendAddress withFqdn(String fqdn) {
        this.fqdn = fqdn;
        return this;
    }

    /**
     * Get iP address.
     *
     * @return the ipAddress value
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set iP address.
     *
     * @param ipAddress the ipAddress value to set
     * @return the ApplicationGatewayBackendAddress object itself.
     */
    public ApplicationGatewayBackendAddress withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

}
