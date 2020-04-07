// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac;

import com.azure.core.annotation.Fluent;
import com.azure.management.graphrbac.models.PasswordCredentialInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The PasswordCredentialsUpdateParameters model.
 */
@Fluent
public final class PasswordCredentialsUpdateParameters {
    /*
     * A collection of PasswordCredentials.
     */
    @JsonProperty(value = "value", required = true)
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
     * @return the PasswordCredentialsUpdateParameters object itself.
     */
    public PasswordCredentialsUpdateParameters withValue(List<PasswordCredentialInner> value) {
        this.value = value;
        return this;
    }
}
