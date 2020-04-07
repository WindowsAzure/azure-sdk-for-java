// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The QuarantinePolicy model.
 */
@Fluent
public final class QuarantinePolicy {
    /*
     * The value that indicates whether the policy is enabled or not.
     */
    @JsonProperty(value = "status")
    private PolicyStatus status;

    /**
     * Get the status property: The value that indicates whether the policy is
     * enabled or not.
     * 
     * @return the status value.
     */
    public PolicyStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The value that indicates whether the policy is
     * enabled or not.
     * 
     * @param status the status value to set.
     * @return the QuarantinePolicy object itself.
     */
    public QuarantinePolicy withStatus(PolicyStatus status) {
        this.status = status;
        return this;
    }
}
