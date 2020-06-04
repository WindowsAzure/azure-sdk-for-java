// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.sql.SyncAgentState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The SyncAgent model. */
@JsonFlatten
@Fluent
public class SyncAgentInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SyncAgentInner.class);

    /*
     * Name of the sync agent.
     */
    @JsonProperty(value = "properties.name", access = JsonProperty.Access.WRITE_ONLY)
    private String namePropertiesName;

    /*
     * ARM resource id of the sync database in the sync agent.
     */
    @JsonProperty(value = "properties.syncDatabaseId")
    private String syncDatabaseId;

    /*
     * Last alive time of the sync agent.
     */
    @JsonProperty(value = "properties.lastAliveTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastAliveTime;

    /*
     * State of the sync agent.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private SyncAgentState state;

    /*
     * If the sync agent version is up to date.
     */
    @JsonProperty(value = "properties.isUpToDate", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isUpToDate;

    /*
     * Expiration time of the sync agent version.
     */
    @JsonProperty(value = "properties.expiryTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime expiryTime;

    /*
     * Version of the sync agent.
     */
    @JsonProperty(value = "properties.version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /**
     * Get the namePropertiesName property: Name of the sync agent.
     *
     * @return the namePropertiesName value.
     */
    public String namePropertiesName() {
        return this.namePropertiesName;
    }

    /**
     * Get the syncDatabaseId property: ARM resource id of the sync database in the sync agent.
     *
     * @return the syncDatabaseId value.
     */
    public String syncDatabaseId() {
        return this.syncDatabaseId;
    }

    /**
     * Set the syncDatabaseId property: ARM resource id of the sync database in the sync agent.
     *
     * @param syncDatabaseId the syncDatabaseId value to set.
     * @return the SyncAgentInner object itself.
     */
    public SyncAgentInner withSyncDatabaseId(String syncDatabaseId) {
        this.syncDatabaseId = syncDatabaseId;
        return this;
    }

    /**
     * Get the lastAliveTime property: Last alive time of the sync agent.
     *
     * @return the lastAliveTime value.
     */
    public OffsetDateTime lastAliveTime() {
        return this.lastAliveTime;
    }

    /**
     * Get the state property: State of the sync agent.
     *
     * @return the state value.
     */
    public SyncAgentState state() {
        return this.state;
    }

    /**
     * Get the isUpToDate property: If the sync agent version is up to date.
     *
     * @return the isUpToDate value.
     */
    public Boolean isUpToDate() {
        return this.isUpToDate;
    }

    /**
     * Get the expiryTime property: Expiration time of the sync agent version.
     *
     * @return the expiryTime value.
     */
    public OffsetDateTime expiryTime() {
        return this.expiryTime;
    }

    /**
     * Get the version property: Version of the sync agent.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
