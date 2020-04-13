/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A region in which the Azure Cosmos DB database account is deployed.
 */
public class Location {
    /**
     * The unique identifier of the region within the database account.
     * Example: &amp;lt;accountName&amp;gt;-&amp;lt;locationName&amp;gt;.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The name of the region.
     */
    @JsonProperty(value = "locationName")
    private String locationName;

    /**
     * The connection endpoint for the specific region. Example:
     * https://&amp;lt;accountName&amp;gt;-&amp;lt;locationName&amp;gt;.documents.azure.com:443/.
     */
    @JsonProperty(value = "documentEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String documentEndpoint;

    /**
     * The provisioningState property.
     */
    @JsonProperty(value = "provisioningState")
    private String provisioningState;

    /**
     * The failover priority of the region. A failover priority of 0 indicates
     * a write region. The maximum value for a failover priority = (total
     * number of regions - 1). Failover priority values must be unique for each
     * of the regions in which the database account exists.
     */
    @JsonProperty(value = "failoverPriority")
    private Integer failoverPriority;

    /**
     * Flag to indicate whether or not this region is an AvailabilityZone
     * region.
     */
    @JsonProperty(value = "isZoneRedundant")
    private Boolean isZoneRedundant;

    /**
     * Get the unique identifier of the region within the database account. Example: &amp;lt;accountName&amp;gt;-&amp;lt;locationName&amp;gt;.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name of the region.
     *
     * @return the locationName value
     */
    public String locationName() {
        return this.locationName;
    }

    /**
     * Set the name of the region.
     *
     * @param locationName the locationName value to set
     * @return the Location object itself.
     */
    public Location withLocationName(String locationName) {
        this.locationName = locationName;
        return this;
    }

    /**
     * Get the connection endpoint for the specific region. Example: https://&amp;lt;accountName&amp;gt;-&amp;lt;locationName&amp;gt;.documents.azure.com:443/.
     *
     * @return the documentEndpoint value
     */
    public String documentEndpoint() {
        return this.documentEndpoint;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     * @return the Location object itself.
     */
    public Location withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the failover priority of the region. A failover priority of 0 indicates a write region. The maximum value for a failover priority = (total number of regions - 1). Failover priority values must be unique for each of the regions in which the database account exists.
     *
     * @return the failoverPriority value
     */
    public Integer failoverPriority() {
        return this.failoverPriority;
    }

    /**
     * Set the failover priority of the region. A failover priority of 0 indicates a write region. The maximum value for a failover priority = (total number of regions - 1). Failover priority values must be unique for each of the regions in which the database account exists.
     *
     * @param failoverPriority the failoverPriority value to set
     * @return the Location object itself.
     */
    public Location withFailoverPriority(Integer failoverPriority) {
        this.failoverPriority = failoverPriority;
        return this;
    }

    /**
     * Get flag to indicate whether or not this region is an AvailabilityZone region.
     *
     * @return the isZoneRedundant value
     */
    public Boolean isZoneRedundant() {
        return this.isZoneRedundant;
    }

    /**
     * Set flag to indicate whether or not this region is an AvailabilityZone region.
     *
     * @param isZoneRedundant the isZoneRedundant value to set
     * @return the Location object itself.
     */
    public Location withIsZoneRedundant(Boolean isZoneRedundant) {
        this.isZoneRedundant = isZoneRedundant;
        return this;
    }

}
