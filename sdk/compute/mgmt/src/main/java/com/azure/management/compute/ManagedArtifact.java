// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ManagedArtifact model. */
@Fluent
public final class ManagedArtifact {
    /*
     * The managed artifact id.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Get the id property: The managed artifact id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The managed artifact id.
     *
     * @param id the id value to set.
     * @return the ManagedArtifact object itself.
     */
    public ManagedArtifact withId(String id) {
        this.id = id;
        return this;
    }
}
