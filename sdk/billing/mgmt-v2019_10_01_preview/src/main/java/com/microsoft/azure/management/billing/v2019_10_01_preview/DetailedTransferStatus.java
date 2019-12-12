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
 * Detailed transfer status.
 */
public class DetailedTransferStatus {
    /**
     * Type of product being transferred. Possible values include:
     * 'AzureSubscription', 'AzureReservation'.
     */
    @JsonProperty(value = "productType", access = JsonProperty.Access.WRITE_ONLY)
    private ProductType productType;

    /**
     * Id of product being transferred.
     */
    @JsonProperty(value = "productId", access = JsonProperty.Access.WRITE_ONLY)
    private String productId;

    /**
     * Transfer status. Possible values include: 'NotStarted', 'InProgress',
     * 'Completed', 'Failed'.
     */
    @JsonProperty(value = "transferStatus", access = JsonProperty.Access.WRITE_ONLY)
    private ProductTransferStatus transferStatus;

    /**
     * Error details for transfer execution.
     */
    @JsonProperty(value = "errorDetails")
    private Error errorDetails;

    /**
     * Get type of product being transferred. Possible values include: 'AzureSubscription', 'AzureReservation'.
     *
     * @return the productType value
     */
    public ProductType productType() {
        return this.productType;
    }

    /**
     * Get id of product being transferred.
     *
     * @return the productId value
     */
    public String productId() {
        return this.productId;
    }

    /**
     * Get transfer status. Possible values include: 'NotStarted', 'InProgress', 'Completed', 'Failed'.
     *
     * @return the transferStatus value
     */
    public ProductTransferStatus transferStatus() {
        return this.transferStatus;
    }

    /**
     * Get error details for transfer execution.
     *
     * @return the errorDetails value
     */
    public Error errorDetails() {
        return this.errorDetails;
    }

    /**
     * Set error details for transfer execution.
     *
     * @param errorDetails the errorDetails value to set
     * @return the DetailedTransferStatus object itself.
     */
    public DetailedTransferStatus withErrorDetails(Error errorDetails) {
        this.errorDetails = errorDetails;
        return this;
    }

}
