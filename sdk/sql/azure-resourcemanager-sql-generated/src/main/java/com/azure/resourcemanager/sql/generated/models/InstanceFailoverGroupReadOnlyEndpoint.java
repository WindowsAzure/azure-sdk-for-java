// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Read-only endpoint of the failover group instance. */
@Fluent
public final class InstanceFailoverGroupReadOnlyEndpoint {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(InstanceFailoverGroupReadOnlyEndpoint.class);

    /*
     * Failover policy of the read-only endpoint for the failover group.
     */
    @JsonProperty(value = "failoverPolicy")
    private ReadOnlyEndpointFailoverPolicy failoverPolicy;

    /**
     * Get the failoverPolicy property: Failover policy of the read-only endpoint for the failover group.
     *
     * @return the failoverPolicy value.
     */
    public ReadOnlyEndpointFailoverPolicy failoverPolicy() {
        return this.failoverPolicy;
    }

    /**
     * Set the failoverPolicy property: Failover policy of the read-only endpoint for the failover group.
     *
     * @param failoverPolicy the failoverPolicy value to set.
     * @return the InstanceFailoverGroupReadOnlyEndpoint object itself.
     */
    public InstanceFailoverGroupReadOnlyEndpoint withFailoverPolicy(ReadOnlyEndpointFailoverPolicy failoverPolicy) {
        this.failoverPolicy = failoverPolicy;
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
