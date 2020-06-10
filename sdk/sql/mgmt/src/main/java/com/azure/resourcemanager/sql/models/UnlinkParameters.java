// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The UnlinkParameters model. */
@Fluent
public final class UnlinkParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UnlinkParameters.class);

    /*
     * Determines whether link will be terminated in a forced or a friendly
     * way.
     */
    @JsonProperty(value = "forcedTermination")
    private Boolean forcedTermination;

    /**
     * Get the forcedTermination property: Determines whether link will be terminated in a forced or a friendly way.
     *
     * @return the forcedTermination value.
     */
    public Boolean forcedTermination() {
        return this.forcedTermination;
    }

    /**
     * Set the forcedTermination property: Determines whether link will be terminated in a forced or a friendly way.
     *
     * @param forcedTermination the forcedTermination value to set.
     * @return the UnlinkParameters object itself.
     */
    public UnlinkParameters withForcedTermination(Boolean forcedTermination) {
        this.forcedTermination = forcedTermination;
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
