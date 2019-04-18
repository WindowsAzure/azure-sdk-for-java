/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Request parameters to transfer billing subscription.
 */
@JsonFlatten
public class TransferBillingSubscriptionRequest {
    /**
     * The destination invoiceSectionName.
     */
    @JsonProperty(value = "properties.destinationInvoiceSectionId")
    private String destinationInvoiceSectionId;

    /**
     * Get the destination invoiceSectionName.
     *
     * @return the destinationInvoiceSectionId value
     */
    public String destinationInvoiceSectionId() {
        return this.destinationInvoiceSectionId;
    }

    /**
     * Set the destination invoiceSectionName.
     *
     * @param destinationInvoiceSectionId the destinationInvoiceSectionId value to set
     * @return the TransferBillingSubscriptionRequest object itself.
     */
    public TransferBillingSubscriptionRequest withDestinationInvoiceSectionId(String destinationInvoiceSectionId) {
        this.destinationInvoiceSectionId = destinationInvoiceSectionId;
        return this;
    }

}
