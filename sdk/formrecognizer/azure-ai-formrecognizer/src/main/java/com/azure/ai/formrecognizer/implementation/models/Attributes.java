// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Optional model attributes. */
@Fluent
public final class Attributes {
    /*
     * Is this model composed? (default: false).
     */
    @JsonProperty(value = "isComposed")
    private Boolean isComposed;

    /**
     * Get the isComposed property: Is this model composed? (default: false).
     *
     * @return the isComposed value.
     */
    public Boolean isComposed() {
        return this.isComposed;
    }

    /**
     * Set the isComposed property: Is this model composed? (default: false).
     *
     * @param isComposed the isComposed value to set.
     * @return the Attributes object itself.
     */
    public Attributes setIsComposed(Boolean isComposed) {
        this.isComposed = isComposed;
        return this;
    }
}
