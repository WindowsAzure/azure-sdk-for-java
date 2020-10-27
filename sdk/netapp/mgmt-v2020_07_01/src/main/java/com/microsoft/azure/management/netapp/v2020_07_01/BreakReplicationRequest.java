/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Break replication request.
 */
public class BreakReplicationRequest {
    /**
     * If replication is in status transferring and you want to force break the
     * replication, set to true.
     */
    @JsonProperty(value = "forceBreakReplication")
    private Boolean forceBreakReplication;

    /**
     * Get if replication is in status transferring and you want to force break the replication, set to true.
     *
     * @return the forceBreakReplication value
     */
    public Boolean forceBreakReplication() {
        return this.forceBreakReplication;
    }

    /**
     * Set if replication is in status transferring and you want to force break the replication, set to true.
     *
     * @param forceBreakReplication the forceBreakReplication value to set
     * @return the BreakReplicationRequest object itself.
     */
    public BreakReplicationRequest withForceBreakReplication(Boolean forceBreakReplication) {
        this.forceBreakReplication = forceBreakReplication;
        return this;
    }

}
