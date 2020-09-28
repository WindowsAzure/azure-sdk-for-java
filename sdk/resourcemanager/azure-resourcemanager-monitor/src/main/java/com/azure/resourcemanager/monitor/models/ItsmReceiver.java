// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An Itsm receiver. */
@Fluent
public final class ItsmReceiver {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ItsmReceiver.class);

    /*
     * The name of the Itsm receiver. Names must be unique across all receivers
     * within an action group.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * OMS LA instance identifier.
     */
    @JsonProperty(value = "workspaceId", required = true)
    private String workspaceId;

    /*
     * Unique identification of ITSM connection among multiple defined in above
     * workspace.
     */
    @JsonProperty(value = "connectionId", required = true)
    private String connectionId;

    /*
     * JSON blob for the configurations of the ITSM action.
     * CreateMultipleWorkItems option will be part of this blob as well.
     */
    @JsonProperty(value = "ticketConfiguration", required = true)
    private String ticketConfiguration;

    /*
     * Region in which workspace resides. Supported
     * values:'centralindia','japaneast','southeastasia','australiasoutheast','uksouth','westcentralus','canadacentral','eastus','westeurope'
     */
    @JsonProperty(value = "region", required = true)
    private String region;

    /**
     * Get the name property: The name of the Itsm receiver. Names must be unique across all receivers within an action
     * group.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the Itsm receiver. Names must be unique across all receivers within an action
     * group.
     *
     * @param name the name value to set.
     * @return the ItsmReceiver object itself.
     */
    public ItsmReceiver withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the workspaceId property: OMS LA instance identifier.
     *
     * @return the workspaceId value.
     */
    public String workspaceId() {
        return this.workspaceId;
    }

    /**
     * Set the workspaceId property: OMS LA instance identifier.
     *
     * @param workspaceId the workspaceId value to set.
     * @return the ItsmReceiver object itself.
     */
    public ItsmReceiver withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * Get the connectionId property: Unique identification of ITSM connection among multiple defined in above
     * workspace.
     *
     * @return the connectionId value.
     */
    public String connectionId() {
        return this.connectionId;
    }

    /**
     * Set the connectionId property: Unique identification of ITSM connection among multiple defined in above
     * workspace.
     *
     * @param connectionId the connectionId value to set.
     * @return the ItsmReceiver object itself.
     */
    public ItsmReceiver withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Get the ticketConfiguration property: JSON blob for the configurations of the ITSM action.
     * CreateMultipleWorkItems option will be part of this blob as well.
     *
     * @return the ticketConfiguration value.
     */
    public String ticketConfiguration() {
        return this.ticketConfiguration;
    }

    /**
     * Set the ticketConfiguration property: JSON blob for the configurations of the ITSM action.
     * CreateMultipleWorkItems option will be part of this blob as well.
     *
     * @param ticketConfiguration the ticketConfiguration value to set.
     * @return the ItsmReceiver object itself.
     */
    public ItsmReceiver withTicketConfiguration(String ticketConfiguration) {
        this.ticketConfiguration = ticketConfiguration;
        return this;
    }

    /**
     * Get the region property: Region in which workspace resides. Supported
     * values:'centralindia','japaneast','southeastasia','australiasoutheast','uksouth','westcentralus','canadacentral','eastus','westeurope'.
     *
     * @return the region value.
     */
    public String region() {
        return this.region;
    }

    /**
     * Set the region property: Region in which workspace resides. Supported
     * values:'centralindia','japaneast','southeastasia','australiasoutheast','uksouth','westcentralus','canadacentral','eastus','westeurope'.
     *
     * @param region the region value to set.
     * @return the ItsmReceiver object itself.
     */
    public ItsmReceiver withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model ItsmReceiver"));
        }
        if (workspaceId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property workspaceId in model ItsmReceiver"));
        }
        if (connectionId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property connectionId in model ItsmReceiver"));
        }
        if (ticketConfiguration() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property ticketConfiguration in model ItsmReceiver"));
        }
        if (region() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property region in model ItsmReceiver"));
        }
    }
}
