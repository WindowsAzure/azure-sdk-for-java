// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The ConnectionMonitorResultProperties model. */
@Immutable
public final class ConnectionMonitorResultProperties extends ConnectionMonitorParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectionMonitorResultProperties.class);

    /*
     * The provisioning state of the connection monitor.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The date and time when the connection monitor was started.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startTime;

    /*
     * The monitoring status of the connection monitor.
     */
    @JsonProperty(value = "monitoringStatus", access = JsonProperty.Access.WRITE_ONLY)
    private String monitoringStatus;

    /*
     * Type of connection monitor.
     */
    @JsonProperty(value = "connectionMonitorType", access = JsonProperty.Access.WRITE_ONLY)
    private ConnectionMonitorType connectionMonitorType;

    /**
     * Get the provisioningState property: The provisioning state of the connection monitor.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the startTime property: The date and time when the connection monitor was started.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the monitoringStatus property: The monitoring status of the connection monitor.
     *
     * @return the monitoringStatus value.
     */
    public String monitoringStatus() {
        return this.monitoringStatus;
    }

    /**
     * Get the connectionMonitorType property: Type of connection monitor.
     *
     * @return the connectionMonitorType value.
     */
    public ConnectionMonitorType connectionMonitorType() {
        return this.connectionMonitorType;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
