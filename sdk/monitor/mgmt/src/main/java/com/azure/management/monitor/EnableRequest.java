// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The EnableRequest model.
 */
@Fluent
public final class EnableRequest {
    /*
     * The name of the receiver to resubscribe.
     */
    @JsonProperty(value = "receiverName", required = true)
    private String receiverName;

    /**
     * Get the receiverName property: The name of the receiver to resubscribe.
     * 
     * @return the receiverName value.
     */
    public String receiverName() {
        return this.receiverName;
    }

    /**
     * Set the receiverName property: The name of the receiver to resubscribe.
     * 
     * @param receiverName the receiverName value to set.
     * @return the EnableRequest object itself.
     */
    public EnableRequest withReceiverName(String receiverName) {
        this.receiverName = receiverName;
        return this;
    }
}
