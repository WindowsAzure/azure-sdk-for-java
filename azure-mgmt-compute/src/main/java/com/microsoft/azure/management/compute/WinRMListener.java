/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes Protocol and thumbprint of Windows Remote Management listener.
 */
public class WinRMListener {
    /**
     * The Protocol used by the WinRM listener. Http and Https are supported.
     * Possible values include: 'Http', 'Https'.
     */
    @JsonProperty(value = "protocol")
    private ProtocolTypes protocol;

    /**
     * The Certificate URL in KMS for Https listeners. Should be null for Http
     * listeners.
     */
    @JsonProperty(value = "certificateUrl")
    private String certificateUrl;

    /**
     * Get the protocol value.
     *
     * @return the protocol value
     */
    public ProtocolTypes protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol value.
     *
     * @param protocol the protocol value to set
     * @return the WinRMListener object itself.
     */
    public WinRMListener withProtocol(ProtocolTypes protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the certificateUrl value.
     *
     * @return the certificateUrl value
     */
    public String certificateUrl() {
        return this.certificateUrl;
    }

    /**
     * Set the certificateUrl value.
     *
     * @param certificateUrl the certificateUrl value to set
     * @return the WinRMListener object itself.
     */
    public WinRMListener withCertificateUrl(String certificateUrl) {
        this.certificateUrl = certificateUrl;
        return this;
    }

}
