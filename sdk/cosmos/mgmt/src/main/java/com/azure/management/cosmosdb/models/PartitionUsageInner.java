// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.cosmosdb.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PartitionUsage model. */
@Immutable
public final class PartitionUsageInner extends UsageInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PartitionUsageInner.class);

    /*
     * The partition id (GUID identifier) of the usages.
     */
    @JsonProperty(value = "partitionId", access = JsonProperty.Access.WRITE_ONLY)
    private String partitionId;

    /*
     * The partition key range id (integer identifier) of the usages.
     */
    @JsonProperty(value = "partitionKeyRangeId", access = JsonProperty.Access.WRITE_ONLY)
    private String partitionKeyRangeId;

    /**
     * Get the partitionId property: The partition id (GUID identifier) of the usages.
     *
     * @return the partitionId value.
     */
    public String partitionId() {
        return this.partitionId;
    }

    /**
     * Get the partitionKeyRangeId property: The partition key range id (integer identifier) of the usages.
     *
     * @return the partitionKeyRangeId value.
     */
    public String partitionKeyRangeId() {
        return this.partitionKeyRangeId;
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
