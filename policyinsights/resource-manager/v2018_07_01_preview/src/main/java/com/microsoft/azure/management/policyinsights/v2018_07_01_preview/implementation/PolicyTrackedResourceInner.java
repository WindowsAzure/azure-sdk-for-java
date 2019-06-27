/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights.v2018_07_01_preview.implementation;

import com.microsoft.azure.management.policyinsights.v2018_07_01_preview.PolicyDetails;
import com.microsoft.azure.management.policyinsights.v2018_07_01_preview.TrackedResourceModificationDetails;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Policy tracked resource record.
 */
public class PolicyTrackedResourceInner {
    /**
     * The ID of the policy tracked resource.
     */
    @JsonProperty(value = "trackedResourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String trackedResourceId;

    /**
     * The details of the policy that require the tracked resource.
     */
    @JsonProperty(value = "policyDetails", access = JsonProperty.Access.WRITE_ONLY)
    private PolicyDetails policyDetails;

    /**
     * The details of the policy triggered deployment that created the tracked
     * resource.
     */
    @JsonProperty(value = "createdBy", access = JsonProperty.Access.WRITE_ONLY)
    private TrackedResourceModificationDetails createdBy;

    /**
     * The details of the policy triggered deployment that modified the tracked
     * resource.
     */
    @JsonProperty(value = "lastModifiedBy", access = JsonProperty.Access.WRITE_ONLY)
    private TrackedResourceModificationDetails lastModifiedBy;

    /**
     * Timestamp of the last update to the tracked resource.
     */
    @JsonProperty(value = "lastUpdateUtc", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastUpdateUtc;

    /**
     * Get the ID of the policy tracked resource.
     *
     * @return the trackedResourceId value
     */
    public String trackedResourceId() {
        return this.trackedResourceId;
    }

    /**
     * Get the details of the policy that require the tracked resource.
     *
     * @return the policyDetails value
     */
    public PolicyDetails policyDetails() {
        return this.policyDetails;
    }

    /**
     * Get the details of the policy triggered deployment that created the tracked resource.
     *
     * @return the createdBy value
     */
    public TrackedResourceModificationDetails createdBy() {
        return this.createdBy;
    }

    /**
     * Get the details of the policy triggered deployment that modified the tracked resource.
     *
     * @return the lastModifiedBy value
     */
    public TrackedResourceModificationDetails lastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * Get timestamp of the last update to the tracked resource.
     *
     * @return the lastUpdateUtc value
     */
    public DateTime lastUpdateUtc() {
        return this.lastUpdateUtc;
    }

}
