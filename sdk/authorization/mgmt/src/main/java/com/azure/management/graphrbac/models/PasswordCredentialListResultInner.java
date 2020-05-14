// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PasswordCredentialListResult model. */
@Fluent
public final class PasswordCredentialListResultInner {
    /*
     * A collection of PasswordCredentials.
     */
    @JsonProperty(value = "value")
    private List<PasswordCredentialInner> value;

    /**
     * Get the value property: A collection of PasswordCredentials.
     *
     * @return the value value.
     */
    public List<PasswordCredentialInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A collection of PasswordCredentials.
     *
     * @param value the value value to set.
     * @return the PasswordCredentialListResultInner object itself.
     */
    public PasswordCredentialListResultInner withValue(List<PasswordCredentialInner> value) {
        this.value = value;
        return this;
    }
}
