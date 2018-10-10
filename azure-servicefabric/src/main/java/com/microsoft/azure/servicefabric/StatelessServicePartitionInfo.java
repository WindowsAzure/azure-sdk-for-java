/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.servicefabric.implementation.ServicePartitionInfoInner;

/**
 * Information about a partition of a stateless Service Fabric service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ServiceKind")
@JsonTypeName("Stateless")
public class StatelessServicePartitionInfo extends ServicePartitionInfoInner {
    /**
     * Number of instances of this partition.
     */
    @JsonProperty(value = "InstanceCount")
    private Long instanceCount;

    /**
     * Get number of instances of this partition.
     *
     * @return the instanceCount value
     */
    public Long instanceCount() {
        return this.instanceCount;
    }

    /**
     * Set number of instances of this partition.
     *
     * @param instanceCount the instanceCount value to set
     * @return the StatelessServicePartitionInfo object itself.
     */
    public StatelessServicePartitionInfo withInstanceCount(Long instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

}
