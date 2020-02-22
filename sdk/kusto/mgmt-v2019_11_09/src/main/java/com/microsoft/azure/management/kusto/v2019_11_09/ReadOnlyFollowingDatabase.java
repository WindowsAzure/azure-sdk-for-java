/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2019_11_09;

import org.joda.time.Period;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.kusto.v2019_11_09.implementation.DatabaseInner;

/**
 * Class representing a read only following database.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind", defaultImpl = ReadOnlyFollowingDatabase.class)
@JsonTypeName("ReadOnlyFollowing")
@JsonFlatten
public class ReadOnlyFollowingDatabase extends DatabaseInner {
    /**
     * The provisioned state of the resource. Possible values include:
     * 'Running', 'Creating', 'Deleting', 'Succeeded', 'Failed', 'Moving'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The time the data should be kept before it stops being accessible to
     * queries in TimeSpan.
     */
    @JsonProperty(value = "properties.softDeletePeriod", access = JsonProperty.Access.WRITE_ONLY)
    private Period softDeletePeriod;

    /**
     * The time the data should be kept in cache for fast queries in TimeSpan.
     */
    @JsonProperty(value = "properties.hotCachePeriod")
    private Period hotCachePeriod;

    /**
     * The statistics of the database.
     */
    @JsonProperty(value = "properties.statistics")
    private DatabaseStatistics statistics;

    /**
     * The name of the leader cluster.
     */
    @JsonProperty(value = "properties.leaderClusterResourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String leaderClusterResourceId;

    /**
     * The name of the attached database configuration cluster.
     */
    @JsonProperty(value = "properties.attachedDatabaseConfigurationName", access = JsonProperty.Access.WRITE_ONLY)
    private String attachedDatabaseConfigurationName;

    /**
     * The principals modification kind of the database. Possible values
     * include: 'Union', 'Replace', 'None'.
     */
    @JsonProperty(value = "properties.principalsModificationKind", access = JsonProperty.Access.WRITE_ONLY)
    private PrincipalsModificationKind principalsModificationKind;

    /**
     * Get the provisioned state of the resource. Possible values include: 'Running', 'Creating', 'Deleting', 'Succeeded', 'Failed', 'Moving'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the time the data should be kept before it stops being accessible to queries in TimeSpan.
     *
     * @return the softDeletePeriod value
     */
    public Period softDeletePeriod() {
        return this.softDeletePeriod;
    }

    /**
     * Get the time the data should be kept in cache for fast queries in TimeSpan.
     *
     * @return the hotCachePeriod value
     */
    public Period hotCachePeriod() {
        return this.hotCachePeriod;
    }

    /**
     * Set the time the data should be kept in cache for fast queries in TimeSpan.
     *
     * @param hotCachePeriod the hotCachePeriod value to set
     * @return the ReadOnlyFollowingDatabase object itself.
     */
    public ReadOnlyFollowingDatabase withHotCachePeriod(Period hotCachePeriod) {
        this.hotCachePeriod = hotCachePeriod;
        return this;
    }

    /**
     * Get the statistics of the database.
     *
     * @return the statistics value
     */
    public DatabaseStatistics statistics() {
        return this.statistics;
    }

    /**
     * Set the statistics of the database.
     *
     * @param statistics the statistics value to set
     * @return the ReadOnlyFollowingDatabase object itself.
     */
    public ReadOnlyFollowingDatabase withStatistics(DatabaseStatistics statistics) {
        this.statistics = statistics;
        return this;
    }

    /**
     * Get the name of the leader cluster.
     *
     * @return the leaderClusterResourceId value
     */
    public String leaderClusterResourceId() {
        return this.leaderClusterResourceId;
    }

    /**
     * Get the name of the attached database configuration cluster.
     *
     * @return the attachedDatabaseConfigurationName value
     */
    public String attachedDatabaseConfigurationName() {
        return this.attachedDatabaseConfigurationName;
    }

    /**
     * Get the principals modification kind of the database. Possible values include: 'Union', 'Replace', 'None'.
     *
     * @return the principalsModificationKind value
     */
    public PrincipalsModificationKind principalsModificationKind() {
        return this.principalsModificationKind;
    }

}
