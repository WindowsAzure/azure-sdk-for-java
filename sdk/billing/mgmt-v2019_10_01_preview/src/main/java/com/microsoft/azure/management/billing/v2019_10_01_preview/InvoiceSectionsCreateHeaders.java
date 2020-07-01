/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for Create operation.
 */
public class InvoiceSectionsCreateHeaders {
    /**
     * Location URI to poll for result.
     */
    @JsonProperty(value = "Location")
    private String location;

    /**
     * Recommended time to wait before making another request to check the
     * status of the operation. The time is specified in seconds.
     */
    @JsonProperty(value = "Retry-After")
    private Integer retryAfter;

    /**
     * Get location URI to poll for result.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set location URI to poll for result.
     *
     * @param location the location value to set
     * @return the InvoiceSectionsCreateHeaders object itself.
     */
    public InvoiceSectionsCreateHeaders withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get recommended time to wait before making another request to check the status of the operation. The time is specified in seconds.
     *
     * @return the retryAfter value
     */
    public Integer retryAfter() {
        return this.retryAfter;
    }

    /**
     * Set recommended time to wait before making another request to check the status of the operation. The time is specified in seconds.
     *
     * @param retryAfter the retryAfter value to set
     * @return the InvoiceSectionsCreateHeaders object itself.
     */
    public InvoiceSectionsCreateHeaders withRetryAfter(Integer retryAfter) {
        this.retryAfter = retryAfter;
        return this;
    }

}
