// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ConnectionResetSharedKey model. */
@Fluent
public final class ConnectionResetSharedKeyInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectionResetSharedKeyInner.class);

    /*
     * The virtual network connection reset shared key length, should between 1
     * and 128.
     */
    @JsonProperty(value = "keyLength", required = true)
    private int keyLength;

    /**
     * Get the keyLength property: The virtual network connection reset shared key length, should between 1 and 128.
     *
     * @return the keyLength value.
     */
    public int keyLength() {
        return this.keyLength;
    }

    /**
     * Set the keyLength property: The virtual network connection reset shared key length, should between 1 and 128.
     *
     * @param keyLength the keyLength value to set.
     * @return the ConnectionResetSharedKeyInner object itself.
     */
    public ConnectionResetSharedKeyInner withKeyLength(int keyLength) {
        this.keyLength = keyLength;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
