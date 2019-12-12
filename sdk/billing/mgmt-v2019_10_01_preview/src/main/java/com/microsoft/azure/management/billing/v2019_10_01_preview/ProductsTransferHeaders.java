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
 * Defines headers for Transfer operation.
 */
public class ProductsTransferHeaders {
    /**
     * Location URI to poll for result.
     */
    @JsonProperty(value = "Location")
    private String location;

    /**
     * Recommends the retryable time after receiving this.
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
     * @return the ProductsTransferHeaders object itself.
     */
    public ProductsTransferHeaders withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get recommends the retryable time after receiving this.
     *
     * @return the retryAfter value
     */
    public Integer retryAfter() {
        return this.retryAfter;
    }

    /**
     * Set recommends the retryable time after receiving this.
     *
     * @param retryAfter the retryAfter value to set
     * @return the ProductsTransferHeaders object itself.
     */
    public ProductsTransferHeaders withRetryAfter(Integer retryAfter) {
        this.retryAfter = retryAfter;
        return this;
    }

}
