// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.cosmosdb;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Location model. */
@Fluent
public final class Location {
    /*
     * The unique identifier of the region within the database account.
     * Example: &lt;accountName&gt;-&lt;locationName&gt;.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The name of the region.
     */
    @JsonProperty(value = "locationName")
    private String locationName;

    /*
     * The connection endpoint for the specific region. Example:
     * https://&lt;accountName&gt;-&lt;locationName&gt;.documents.azure.com:443/
     */
    @JsonProperty(value = "documentEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String documentEndpoint;

    /*
     * The status of the Cosmos DB account at the time the operation was
     * called. The status can be one of following. 'Creating' – the Cosmos DB
     * account is being created. When an account is in Creating state, only
     * properties that are specified as input for the Create Cosmos DB account
     * operation are returned. 'Succeeded' – the Cosmos DB account is active
     * for use. 'Updating' – the Cosmos DB account is being updated. 'Deleting'
     * – the Cosmos DB account is being deleted. 'Failed' – the Cosmos DB
     * account failed creation. 'Offline' - the Cosmos DB account is not
     * active.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The failover priority of the region. A failover priority of 0 indicates
     * a write region. The maximum value for a failover priority = (total
     * number of regions - 1). Failover priority values must be unique for each
     * of the regions in which the database account exists.
     */
    @JsonProperty(value = "failoverPriority")
    private Integer failoverPriority;

    /*
     * Flag to indicate whether or not this region is an AvailabilityZone
     * region
     */
    @JsonProperty(value = "isZoneRedundant")
    private Boolean isZoneRedundant;

    /**
     * Get the id property: The unique identifier of the region within the database account. Example:
     * &amp;lt;accountName&amp;gt;-&amp;lt;locationName&amp;gt;.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the locationName property: The name of the region.
     *
     * @return the locationName value.
     */
    public String locationName() {
        return this.locationName;
    }

    /**
     * Set the locationName property: The name of the region.
     *
     * @param locationName the locationName value to set.
     * @return the Location object itself.
     */
    public Location withLocationName(String locationName) {
        this.locationName = locationName;
        return this;
    }

    /**
     * Get the documentEndpoint property: The connection endpoint for the specific region. Example:
     * https://&amp;lt;accountName&amp;gt;-&amp;lt;locationName&amp;gt;.documents.azure.com:443/.
     *
     * @return the documentEndpoint value.
     */
    public String documentEndpoint() {
        return this.documentEndpoint;
    }

    /**
     * Get the provisioningState property: The status of the Cosmos DB account at the time the operation was called. The
     * status can be one of following. 'Creating' – the Cosmos DB account is being created. When an account is in
     * Creating state, only properties that are specified as input for the Create Cosmos DB account operation are
     * returned. 'Succeeded' – the Cosmos DB account is active for use. 'Updating' – the Cosmos DB account is being
     * updated. 'Deleting' – the Cosmos DB account is being deleted. 'Failed' – the Cosmos DB account failed creation.
     * 'Offline' - the Cosmos DB account is not active.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the failoverPriority property: The failover priority of the region. A failover priority of 0 indicates a
     * write region. The maximum value for a failover priority = (total number of regions - 1). Failover priority values
     * must be unique for each of the regions in which the database account exists.
     *
     * @return the failoverPriority value.
     */
    public Integer failoverPriority() {
        return this.failoverPriority;
    }

    /**
     * Set the failoverPriority property: The failover priority of the region. A failover priority of 0 indicates a
     * write region. The maximum value for a failover priority = (total number of regions - 1). Failover priority values
     * must be unique for each of the regions in which the database account exists.
     *
     * @param failoverPriority the failoverPriority value to set.
     * @return the Location object itself.
     */
    public Location withFailoverPriority(Integer failoverPriority) {
        this.failoverPriority = failoverPriority;
        return this;
    }

    /**
     * Get the isZoneRedundant property: Flag to indicate whether or not this region is an AvailabilityZone region.
     *
     * @return the isZoneRedundant value.
     */
    public Boolean isZoneRedundant() {
        return this.isZoneRedundant;
    }

    /**
     * Set the isZoneRedundant property: Flag to indicate whether or not this region is an AvailabilityZone region.
     *
     * @param isZoneRedundant the isZoneRedundant value to set.
     * @return the Location object itself.
     */
    public Location withIsZoneRedundant(Boolean isZoneRedundant) {
        this.isZoneRedundant = isZoneRedundant;
        return this;
    }
}
