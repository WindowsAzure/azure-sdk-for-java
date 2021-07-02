// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.security.keyvault.keys.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The get random bytes request object. */
@Fluent
public final class GetRandomBytesRequest {
    /*
     * The requested number of random bytes.
     */
    @JsonProperty(value = "count", required = true)
    private int count;

    /**
     * Get the count property: The requested number of random bytes.
     *
     * @return the count value.
     */
    public int getCount() {
        return this.count;
    }

    /**
     * Set the count property: The requested number of random bytes.
     *
     * @param count the count value to set.
     * @return the GetRandomBytesRequest object itself.
     */
    public GetRandomBytesRequest setCount(int count) {
        this.count = count;

        return this;
    }
}
