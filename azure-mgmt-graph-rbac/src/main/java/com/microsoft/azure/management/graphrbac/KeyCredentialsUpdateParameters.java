/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.graphrbac;

import java.util.List;
import com.microsoft.azure.management.graphrbac.implementation.KeyCredentialInner;

/**
 * Request parameters for  KeyCredentials update operation.
 */
public class KeyCredentialsUpdateParameters {
    /**
     * KeyCredential list.
     */
    private List<KeyCredentialInner> value;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public List<KeyCredentialInner> value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the KeyCredentialsUpdateParameters object itself.
     */
    public KeyCredentialsUpdateParameters withValue(List<KeyCredentialInner> value) {
        this.value = value;
        return this;
    }

}
