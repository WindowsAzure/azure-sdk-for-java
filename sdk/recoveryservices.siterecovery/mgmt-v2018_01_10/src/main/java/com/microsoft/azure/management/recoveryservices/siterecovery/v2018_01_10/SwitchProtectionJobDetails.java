/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * This class represents details for switch protection job.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType", defaultImpl = SwitchProtectionJobDetails.class)
@JsonTypeName("SwitchProtectionJobDetails")
public class SwitchProtectionJobDetails extends JobDetails {
    /**
     * ARM Id of the new replication protected item.
     */
    @JsonProperty(value = "newReplicationProtectedItemId")
    private String newReplicationProtectedItemId;

    /**
     * Get aRM Id of the new replication protected item.
     *
     * @return the newReplicationProtectedItemId value
     */
    public String newReplicationProtectedItemId() {
        return this.newReplicationProtectedItemId;
    }

    /**
     * Set aRM Id of the new replication protected item.
     *
     * @param newReplicationProtectedItemId the newReplicationProtectedItemId value to set
     * @return the SwitchProtectionJobDetails object itself.
     */
    public SwitchProtectionJobDetails withNewReplicationProtectedItemId(String newReplicationProtectedItemId) {
        this.newReplicationProtectedItemId = newReplicationProtectedItemId;
        return this;
    }

}
