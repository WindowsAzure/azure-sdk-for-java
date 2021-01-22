// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The shared keys for a workspace. */
@Fluent
public final class SharedKeysInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SharedKeysInner.class);

    /*
     * The primary shared key of a workspace.
     */
    @JsonProperty(value = "primarySharedKey")
    private String primarySharedKey;

    /*
     * The secondary shared key of a workspace.
     */
    @JsonProperty(value = "secondarySharedKey")
    private String secondarySharedKey;

    /**
     * Get the primarySharedKey property: The primary shared key of a workspace.
     *
     * @return the primarySharedKey value.
     */
    public String primarySharedKey() {
        return this.primarySharedKey;
    }

    /**
     * Set the primarySharedKey property: The primary shared key of a workspace.
     *
     * @param primarySharedKey the primarySharedKey value to set.
     * @return the SharedKeysInner object itself.
     */
    public SharedKeysInner withPrimarySharedKey(String primarySharedKey) {
        this.primarySharedKey = primarySharedKey;
        return this;
    }

    /**
     * Get the secondarySharedKey property: The secondary shared key of a workspace.
     *
     * @return the secondarySharedKey value.
     */
    public String secondarySharedKey() {
        return this.secondarySharedKey;
    }

    /**
     * Set the secondarySharedKey property: The secondary shared key of a workspace.
     *
     * @param secondarySharedKey the secondarySharedKey value to set.
     * @return the SharedKeysInner object itself.
     */
    public SharedKeysInner withSecondarySharedKey(String secondarySharedKey) {
        this.secondarySharedKey = secondarySharedKey;
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
