// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.azure.management.appservice.ProxyOnlyResource;

/**
 * The Identifier model.
 */
@JsonFlatten
@Fluent
public class IdentifierInner extends ProxyOnlyResource {
    /*
     * String representation of the identity.
     */
    @JsonProperty(value = "properties.id")
    private String value;

    /**
     * Get the value property: String representation of the identity.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: String representation of the identity.
     * 
     * @param value the value value to set.
     * @return the IdentifierInner object itself.
     */
    public IdentifierInner withValue(String value) {
        this.value = value;
        return this;
    }
}
