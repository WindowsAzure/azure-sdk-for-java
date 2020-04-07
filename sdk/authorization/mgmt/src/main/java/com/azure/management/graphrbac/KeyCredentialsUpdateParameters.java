// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac;

import com.azure.core.annotation.Fluent;
import com.azure.management.graphrbac.models.KeyCredentialInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The KeyCredentialsUpdateParameters model.
 */
@Fluent
public final class KeyCredentialsUpdateParameters {
    /*
     * A collection of KeyCredentials.
     */
    @JsonProperty(value = "value", required = true)
    private List<KeyCredentialInner> value;

    /**
     * Get the value property: A collection of KeyCredentials.
     * 
     * @return the value value.
     */
    public List<KeyCredentialInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A collection of KeyCredentials.
     * 
     * @param value the value value to set.
     * @return the KeyCredentialsUpdateParameters object itself.
     */
    public KeyCredentialsUpdateParameters withValue(List<KeyCredentialInner> value) {
        this.value = value;
        return this;
    }
}
