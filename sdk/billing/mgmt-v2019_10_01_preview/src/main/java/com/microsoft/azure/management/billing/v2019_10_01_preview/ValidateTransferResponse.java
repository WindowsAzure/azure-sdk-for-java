/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Transfer validation response.
 */
@JsonFlatten
public class ValidateTransferResponse {
    /**
     * The status of validation.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /**
     * The product id for which this result applies.
     */
    @JsonProperty(value = "properties.productId", access = JsonProperty.Access.WRITE_ONLY)
    private String productId;

    /**
     * Array of validation results.
     */
    @JsonProperty(value = "properties.results")
    private List<ValidationResultProperties> results;

    /**
     * Get the status of validation.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Get the product id for which this result applies.
     *
     * @return the productId value
     */
    public String productId() {
        return this.productId;
    }

    /**
     * Get array of validation results.
     *
     * @return the results value
     */
    public List<ValidationResultProperties> results() {
        return this.results;
    }

    /**
     * Set array of validation results.
     *
     * @param results the results value to set
     * @return the ValidateTransferResponse object itself.
     */
    public ValidateTransferResponse withResults(List<ValidationResultProperties> results) {
        this.results = results;
        return this;
    }

}
