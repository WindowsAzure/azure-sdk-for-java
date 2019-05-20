// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.keyvault.keys;

import com.azure.core.implementation.Base64Url;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The key restore parameters.
 */
class KeyRestoreRequestParameters {
    /**
     * The backup blob associated with a key bundle.
     */
    @JsonProperty(value = "value", required = true)
    private Base64Url keyBackup;

    /**
     * Get the keyBundleBackup value.
     *
     * @return the keyBundleBackup value
     */
    public byte[] keyBackup() {
        if (this.keyBackup == null) {
            return null;
        }
        return this.keyBackup.decodedBytes();
    }

    /**
     * Set the keyBundleBackup value.
     *
     * @param keyBackup The keyBundleBackup value to set
     * @return the KeyRestoreParameters object itself.
     */
    public KeyRestoreRequestParameters keyBackup(byte[] keyBackup) {
        if (keyBackup == null) {
            this.keyBackup = null;
        } else {
            this.keyBackup = Base64Url.encode(keyBackup);
        }
        return this;
    }
}
