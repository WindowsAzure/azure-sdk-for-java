/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.timeseriesinsights.v2017_11_15.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The response of the List access policies operation.
 */
public class AccessPolicyListResponseInner {
    /**
     * Result of the List access policies operation.
     */
    @JsonProperty(value = "value")
    private List<AccessPolicyResourceInner> value;

    /**
     * Get result of the List access policies operation.
     *
     * @return the value value
     */
    public List<AccessPolicyResourceInner> value() {
        return this.value;
    }

    /**
     * Set result of the List access policies operation.
     *
     * @param value the value value to set
     * @return the AccessPolicyListResponseInner object itself.
     */
    public AccessPolicyListResponseInner withValue(List<AccessPolicyResourceInner> value) {
        this.value = value;
        return this;
    }

}
