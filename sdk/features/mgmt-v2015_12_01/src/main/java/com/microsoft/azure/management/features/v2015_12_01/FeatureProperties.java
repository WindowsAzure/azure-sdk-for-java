/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.features.v2015_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about feature.
 */
public class FeatureProperties {
    /**
     * The registration state of the feature for the subscription.
     */
    @JsonProperty(value = "state")
    private String state;

    /**
     * Get the registration state of the feature for the subscription.
     *
     * @return the state value
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the registration state of the feature for the subscription.
     *
     * @param state the state value to set
     * @return the FeatureProperties object itself.
     */
    public FeatureProperties withState(String state) {
        this.state = state;
        return this;
    }

}
