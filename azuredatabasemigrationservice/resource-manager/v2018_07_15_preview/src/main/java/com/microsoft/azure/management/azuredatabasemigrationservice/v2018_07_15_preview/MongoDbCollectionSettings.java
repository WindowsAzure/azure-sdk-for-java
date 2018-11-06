/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes how an individual MongoDB collection should be migrated.
 */
public class MongoDbCollectionSettings {
    /**
     * Whether the migrator is allowed to drop the target collection in the
     * course of performing a migration. The default is true.
     */
    @JsonProperty(value = "canDelete")
    private Boolean canDelete;

    /**
     * The shardKey property.
     */
    @JsonProperty(value = "shardKey")
    private MongoDbShardKeySetting shardKey;

    /**
     * The RUs that should be configured on a CosmosDB target, or null to use
     * the default. This has no effect on non-CosmosDB targets.
     */
    @JsonProperty(value = "targetRUs")
    private Integer targetRUs;

    /**
     * Get whether the migrator is allowed to drop the target collection in the course of performing a migration. The default is true.
     *
     * @return the canDelete value
     */
    public Boolean canDelete() {
        return this.canDelete;
    }

    /**
     * Set whether the migrator is allowed to drop the target collection in the course of performing a migration. The default is true.
     *
     * @param canDelete the canDelete value to set
     * @return the MongoDbCollectionSettings object itself.
     */
    public MongoDbCollectionSettings withCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }

    /**
     * Get the shardKey value.
     *
     * @return the shardKey value
     */
    public MongoDbShardKeySetting shardKey() {
        return this.shardKey;
    }

    /**
     * Set the shardKey value.
     *
     * @param shardKey the shardKey value to set
     * @return the MongoDbCollectionSettings object itself.
     */
    public MongoDbCollectionSettings withShardKey(MongoDbShardKeySetting shardKey) {
        this.shardKey = shardKey;
        return this;
    }

    /**
     * Get the RUs that should be configured on a CosmosDB target, or null to use the default. This has no effect on non-CosmosDB targets.
     *
     * @return the targetRUs value
     */
    public Integer targetRUs() {
        return this.targetRUs;
    }

    /**
     * Set the RUs that should be configured on a CosmosDB target, or null to use the default. This has no effect on non-CosmosDB targets.
     *
     * @param targetRUs the targetRUs value to set
     * @return the MongoDbCollectionSettings object itself.
     */
    public MongoDbCollectionSettings withTargetRUs(Integer targetRUs) {
        this.targetRUs = targetRUs;
        return this;
    }

}
