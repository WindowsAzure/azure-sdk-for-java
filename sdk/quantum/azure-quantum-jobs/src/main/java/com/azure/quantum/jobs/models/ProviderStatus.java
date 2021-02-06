// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.quantum.jobs.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Providers status. */
@Immutable
public final class ProviderStatus {
    /*
     * Provider id.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Provider availability.
     */
    @JsonProperty(value = "currentAvailability", access = JsonProperty.Access.WRITE_ONLY)
    private ProviderAvailability currentAvailability;

    /*
     * The targets property.
     */
    @JsonProperty(value = "targets", access = JsonProperty.Access.WRITE_ONLY)
    private List<TargetStatus> targets;

    /**
     * Get the id property: Provider id.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the currentAvailability property: Provider availability.
     *
     * @return the currentAvailability value.
     */
    public ProviderAvailability getCurrentAvailability() {
        return this.currentAvailability;
    }

    /**
     * Get the targets property: The targets property.
     *
     * @return the targets value.
     */
    public List<TargetStatus> getTargets() {
        return this.targets;
    }
}
