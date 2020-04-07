// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SKUCapability model.
 */
@Immutable
public final class SKUCapability {
    /*
     * The name of capability, The capability information in the specified SKU,
     * including file encryption, network ACLs, change notification, etc.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * A string value to indicate states of given capability. Possibly 'true'
     * or 'false'.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private String value;

    /**
     * Get the name property: The name of capability, The capability
     * information in the specified SKU, including file encryption, network
     * ACLs, change notification, etc.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the value property: A string value to indicate states of given
     * capability. Possibly 'true' or 'false'.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }
}
