/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.graphrbac;

import java.util.List;
import com.microsoft.azure.graphrbac.implementation.KeyCredentialInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request parameters for a KeyCredentials update operation.
 */
public class KeyCredentialsUpdateParameters {
    /**
     * A collection of KeyCredentials.
     */
    @JsonProperty(value = "value", required = true)
    private List<KeyCredentialInner> value;

    /**
     * Get a collection of KeyCredentials.
     *
     * @return the value value
     */
    public List<KeyCredentialInner> value() {
        return this.value;
    }

    /**
     * Set a collection of KeyCredentials.
     *
     * @param value the value value to set
     * @return the KeyCredentialsUpdateParameters object itself.
     */
    public KeyCredentialsUpdateParameters withValue(List<KeyCredentialInner> value) {
        this.value = value;
        return this;
    }

}
