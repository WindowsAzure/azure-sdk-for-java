/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This class returns information about the partition that the user-induced
 * operation acted upon.
 */
public class SelectedPartition {
    /**
     * The name of the service the partition belongs to.
     */
    @JsonProperty(value = "ServiceName")
    private String serviceName;

    /**
     * An internal ID used by Service Fabric to uniquely identify a partition.
     * This is a randomly generated GUID when the service was created. The
     * partition ID is unique and does not change for the lifetime of the
     * service. If the same service was deleted and recreated the IDs of its
     * partitions would be different.
     */
    @JsonProperty(value = "PartitionId")
    private UUID partitionId;

    /**
     * Get the name of the service the partition belongs to.
     *
     * @return the serviceName value
     */
    public String serviceName() {
        return this.serviceName;
    }

    /**
     * Set the name of the service the partition belongs to.
     *
     * @param serviceName the serviceName value to set
     * @return the SelectedPartition object itself.
     */
    public SelectedPartition withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Get an internal ID used by Service Fabric to uniquely identify a partition. This is a randomly generated GUID when the service was created. The partition ID is unique and does not change for the lifetime of the service. If the same service was deleted and recreated the IDs of its partitions would be different.
     *
     * @return the partitionId value
     */
    public UUID partitionId() {
        return this.partitionId;
    }

    /**
     * Set an internal ID used by Service Fabric to uniquely identify a partition. This is a randomly generated GUID when the service was created. The partition ID is unique and does not change for the lifetime of the service. If the same service was deleted and recreated the IDs of its partitions would be different.
     *
     * @param partitionId the partitionId value to set
     * @return the SelectedPartition object itself.
     */
    public SelectedPartition withPartitionId(UUID partitionId) {
        this.partitionId = partitionId;
        return this;
    }

}
