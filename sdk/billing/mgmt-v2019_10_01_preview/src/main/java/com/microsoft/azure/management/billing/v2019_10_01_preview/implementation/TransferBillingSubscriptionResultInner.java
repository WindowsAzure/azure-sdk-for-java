/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Result of the transfer billing subscription operation.
 */
@JsonFlatten
public class TransferBillingSubscriptionResultInner {
    /**
     * The destination billing subscription id.
     */
    @JsonProperty(value = "properties.billingSubscriptionName")
    private String billingSubscriptionName;

    /**
     * Get the destination billing subscription id.
     *
     * @return the billingSubscriptionName value
     */
    public String billingSubscriptionName() {
        return this.billingSubscriptionName;
    }

    /**
     * Set the destination billing subscription id.
     *
     * @param billingSubscriptionName the billingSubscriptionName value to set
     * @return the TransferBillingSubscriptionResultInner object itself.
     */
    public TransferBillingSubscriptionResultInner withBillingSubscriptionName(String billingSubscriptionName) {
        this.billingSubscriptionName = billingSubscriptionName;
        return this;
    }

}
