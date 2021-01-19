/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Header configuration of the Actions set in Application Gateway.
 */
public class ApplicationGatewayHeaderConfiguration {
    /**
     * Header name of the header configuration.
     */
    @JsonProperty(value = "headerName")
    private String headerName;

    /**
     * Header value of the header configuration.
     */
    @JsonProperty(value = "headerValue")
    private String headerValue;

    /**
     * Get header name of the header configuration.
     *
     * @return the headerName value
     */
    public String headerName() {
        return this.headerName;
    }

    /**
     * Set header name of the header configuration.
     *
     * @param headerName the headerName value to set
     * @return the ApplicationGatewayHeaderConfiguration object itself.
     */
    public ApplicationGatewayHeaderConfiguration withHeaderName(String headerName) {
        this.headerName = headerName;
        return this;
    }

    /**
     * Get header value of the header configuration.
     *
     * @return the headerValue value
     */
    public String headerValue() {
        return this.headerValue;
    }

    /**
     * Set header value of the header configuration.
     *
     * @param headerValue the headerValue value to set
     * @return the ApplicationGatewayHeaderConfiguration object itself.
     */
    public ApplicationGatewayHeaderConfiguration withHeaderValue(String headerValue) {
        this.headerValue = headerValue;
        return this;
    }

}
