/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network;


/**
 * Backend Address of application gateway.
 */
public class ApplicationGatewayBackendAddress {
    /**
     * Dns name.
     */
    private String fqdn;

    /**
     * Ip address.
     */
    private String ipAddress;

    /**
     * Get the fqdn value.
     *
     * @return the fqdn value
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Set the fqdn value.
     *
     * @param fqdn the fqdn value to set
     * @return the ApplicationGatewayBackendAddress object itself.
     */
    public ApplicationGatewayBackendAddress withFqdn(String fqdn) {
        this.fqdn = fqdn;
        return this;
    }

    /**
     * Get the ipAddress value.
     *
     * @return the ipAddress value
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the ipAddress value.
     *
     * @param ipAddress the ipAddress value to set
     * @return the ApplicationGatewayBackendAddress object itself.
     */
    public ApplicationGatewayBackendAddress withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

}
