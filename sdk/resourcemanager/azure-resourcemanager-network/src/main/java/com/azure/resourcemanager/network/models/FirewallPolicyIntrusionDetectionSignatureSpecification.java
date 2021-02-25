// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Intrusion detection signatures specification states. */
@Fluent
public final class FirewallPolicyIntrusionDetectionSignatureSpecification {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(FirewallPolicyIntrusionDetectionSignatureSpecification.class);

    /*
     * Signature id.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The signature state.
     */
    @JsonProperty(value = "mode")
    private FirewallPolicyIntrusionDetectionStateType mode;

    /**
     * Get the id property: Signature id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Signature id.
     *
     * @param id the id value to set.
     * @return the FirewallPolicyIntrusionDetectionSignatureSpecification object itself.
     */
    public FirewallPolicyIntrusionDetectionSignatureSpecification withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the mode property: The signature state.
     *
     * @return the mode value.
     */
    public FirewallPolicyIntrusionDetectionStateType mode() {
        return this.mode;
    }

    /**
     * Set the mode property: The signature state.
     *
     * @param mode the mode value to set.
     * @return the FirewallPolicyIntrusionDetectionSignatureSpecification object itself.
     */
    public FirewallPolicyIntrusionDetectionSignatureSpecification withMode(
        FirewallPolicyIntrusionDetectionStateType mode) {
        this.mode = mode;
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
