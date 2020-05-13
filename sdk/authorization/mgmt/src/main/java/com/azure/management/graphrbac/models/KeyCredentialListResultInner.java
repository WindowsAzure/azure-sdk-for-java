// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The KeyCredentialListResult model. */
@Fluent
public final class KeyCredentialListResultInner {
    /*
     * A collection of KeyCredentials.
     */
    @JsonProperty(value = "value")
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
     * @return the KeyCredentialListResultInner object itself.
     */
    public KeyCredentialListResultInner withValue(List<KeyCredentialInner> value) {
        this.value = value;
        return this;
    }
}
