// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.models.ReplicationRole;
import com.azure.resourcemanager.synapse.models.ReplicationState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Represents a Sql pool replication link. */
@JsonFlatten
@Immutable
public class ReplicationLinkInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ReplicationLinkInner.class);

    /*
     * Location of the workspace that contains this firewall rule.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /*
     * Legacy value indicating whether termination is allowed.  Currently
     * always returns true.
     */
    @JsonProperty(value = "properties.isTerminationAllowed", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isTerminationAllowed;

    /*
     * Replication mode of this replication link.
     */
    @JsonProperty(value = "properties.replicationMode", access = JsonProperty.Access.WRITE_ONLY)
    private String replicationMode;

    /*
     * The name of the workspace hosting the partner Sql pool.
     */
    @JsonProperty(value = "properties.partnerServer", access = JsonProperty.Access.WRITE_ONLY)
    private String partnerServer;

    /*
     * The name of the partner Sql pool.
     */
    @JsonProperty(value = "properties.partnerDatabase", access = JsonProperty.Access.WRITE_ONLY)
    private String partnerDatabase;

    /*
     * The Azure Region of the partner Sql pool.
     */
    @JsonProperty(value = "properties.partnerLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String partnerLocation;

    /*
     * The role of the Sql pool in the replication link.
     */
    @JsonProperty(value = "properties.role", access = JsonProperty.Access.WRITE_ONLY)
    private ReplicationRole role;

    /*
     * The role of the partner Sql pool in the replication link.
     */
    @JsonProperty(value = "properties.partnerRole", access = JsonProperty.Access.WRITE_ONLY)
    private ReplicationRole partnerRole;

    /*
     * The start time for the replication link.
     */
    @JsonProperty(value = "properties.startTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startTime;

    /*
     * The percentage of seeding complete for the replication link.
     */
    @JsonProperty(value = "properties.percentComplete", access = JsonProperty.Access.WRITE_ONLY)
    private Integer percentComplete;

    /*
     * The replication state for the replication link.
     */
    @JsonProperty(value = "properties.replicationState", access = JsonProperty.Access.WRITE_ONLY)
    private ReplicationState replicationState;

    /**
     * Get the location property: Location of the workspace that contains this firewall rule.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the isTerminationAllowed property: Legacy value indicating whether termination is allowed. Currently always
     * returns true.
     *
     * @return the isTerminationAllowed value.
     */
    public Boolean isTerminationAllowed() {
        return this.isTerminationAllowed;
    }

    /**
     * Get the replicationMode property: Replication mode of this replication link.
     *
     * @return the replicationMode value.
     */
    public String replicationMode() {
        return this.replicationMode;
    }

    /**
     * Get the partnerServer property: The name of the workspace hosting the partner Sql pool.
     *
     * @return the partnerServer value.
     */
    public String partnerServer() {
        return this.partnerServer;
    }

    /**
     * Get the partnerDatabase property: The name of the partner Sql pool.
     *
     * @return the partnerDatabase value.
     */
    public String partnerDatabase() {
        return this.partnerDatabase;
    }

    /**
     * Get the partnerLocation property: The Azure Region of the partner Sql pool.
     *
     * @return the partnerLocation value.
     */
    public String partnerLocation() {
        return this.partnerLocation;
    }

    /**
     * Get the role property: The role of the Sql pool in the replication link.
     *
     * @return the role value.
     */
    public ReplicationRole role() {
        return this.role;
    }

    /**
     * Get the partnerRole property: The role of the partner Sql pool in the replication link.
     *
     * @return the partnerRole value.
     */
    public ReplicationRole partnerRole() {
        return this.partnerRole;
    }

    /**
     * Get the startTime property: The start time for the replication link.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the percentComplete property: The percentage of seeding complete for the replication link.
     *
     * @return the percentComplete value.
     */
    public Integer percentComplete() {
        return this.percentComplete;
    }

    /**
     * Get the replicationState property: The replication state for the replication link.
     *
     * @return the replicationState value.
     */
    public ReplicationState replicationState() {
        return this.replicationState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
