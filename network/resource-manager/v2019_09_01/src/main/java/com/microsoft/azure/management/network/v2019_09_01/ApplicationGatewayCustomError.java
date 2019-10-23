/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Customer error of an application gateway.
 */
public class ApplicationGatewayCustomError {
    /**
     * Status code of the application gateway customer error. Possible values
     * include: 'HttpStatus403', 'HttpStatus502'.
     */
    @JsonProperty(value = "statusCode")
    private ApplicationGatewayCustomErrorStatusCode statusCode;

    /**
     * Error page URL of the application gateway customer error.
     */
    @JsonProperty(value = "customErrorPageUrl")
    private String customErrorPageUrl;

    /**
     * Get status code of the application gateway customer error. Possible values include: 'HttpStatus403', 'HttpStatus502'.
     *
     * @return the statusCode value
     */
    public ApplicationGatewayCustomErrorStatusCode statusCode() {
        return this.statusCode;
    }

    /**
     * Set status code of the application gateway customer error. Possible values include: 'HttpStatus403', 'HttpStatus502'.
     *
     * @param statusCode the statusCode value to set
     * @return the ApplicationGatewayCustomError object itself.
     */
    public ApplicationGatewayCustomError withStatusCode(ApplicationGatewayCustomErrorStatusCode statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Get error page URL of the application gateway customer error.
     *
     * @return the customErrorPageUrl value
     */
    public String customErrorPageUrl() {
        return this.customErrorPageUrl;
    }

    /**
     * Set error page URL of the application gateway customer error.
     *
     * @param customErrorPageUrl the customErrorPageUrl value to set
     * @return the ApplicationGatewayCustomError object itself.
     */
    public ApplicationGatewayCustomError withCustomErrorPageUrl(String customErrorPageUrl) {
        this.customErrorPageUrl = customErrorPageUrl;
        return this;
    }

}
