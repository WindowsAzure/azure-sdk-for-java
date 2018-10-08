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
 * StreamingEndpoint access control definition.
 */
public class StreamingEndpointAccessControl {
    /**
     * The access control of Akamai.
     */
    @JsonProperty(value = "akamai")
    private AkamaiAccessControl akamai;

    /**
     * The IP access control of the StreamingEndpoint.
     */
    @JsonProperty(value = "ip")
    private IPAccessControl ip;

    /**
     * Get the access control of Akamai.
     *
     * @return the akamai value
     */
    public AkamaiAccessControl akamai() {
        return this.akamai;
    }

    /**
     * Set the access control of Akamai.
     *
     * @param akamai the akamai value to set
     * @return the StreamingEndpointAccessControl object itself.
     */
    public StreamingEndpointAccessControl withAkamai(AkamaiAccessControl akamai) {
        this.akamai = akamai;
        return this;
    }

    /**
     * Get the IP access control of the StreamingEndpoint.
     *
     * @return the ip value
     */
    public IPAccessControl ip() {
        return this.ip;
    }

    /**
     * Set the IP access control of the StreamingEndpoint.
     *
     * @param ip the ip value to set
     * @return the StreamingEndpointAccessControl object itself.
     */
    public StreamingEndpointAccessControl withIp(IPAccessControl ip) {
        this.ip = ip;
        return this;
    }

}
