// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The FeatureProperties model.
 */
@Fluent
public final class FeatureProperties {
    /*
     * The registration state of the feature for the subscription.
     */
    @JsonProperty(value = "state")
    private String state;

    /**
     * Get the state property: The registration state of the feature for the
     * subscription.
     * 
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the state property: The registration state of the feature for the
     * subscription.
     * 
     * @param state the state value to set.
     * @return the FeatureProperties object itself.
     */
    public FeatureProperties withState(String state) {
        this.state = state;
        return this;
    }
}
