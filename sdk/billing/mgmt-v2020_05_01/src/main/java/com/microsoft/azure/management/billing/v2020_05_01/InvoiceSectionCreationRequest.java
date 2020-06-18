/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2020_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of the invoice section.
 */
public class InvoiceSectionCreationRequest {
    /**
     * The name of the invoice section.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * Get the name of the invoice section.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the name of the invoice section.
     *
     * @param displayName the displayName value to set
     * @return the InvoiceSectionCreationRequest object itself.
     */
    public InvoiceSectionCreationRequest withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

}
