/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_11_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The virtual network connection reset shared key.
 */
public class ConnectionResetSharedKeyInner {
    /**
     * The virtual network connection reset shared key length, should between 1
     * and 128.
     */
    @JsonProperty(value = "keyLength", required = true)
    private int keyLength;

    /**
     * Get the virtual network connection reset shared key length, should between 1 and 128.
     *
     * @return the keyLength value
     */
    public int keyLength() {
        return this.keyLength;
    }

    /**
     * Set the virtual network connection reset shared key length, should between 1 and 128.
     *
     * @param keyLength the keyLength value to set
     * @return the ConnectionResetSharedKeyInner object itself.
     */
    public ConnectionResetSharedKeyInner withKeyLength(int keyLength) {
        this.keyLength = keyLength;
        return this;
    }

}
