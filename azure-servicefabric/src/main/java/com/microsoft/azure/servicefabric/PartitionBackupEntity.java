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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Identifies the Service Fabric stateful partition which is being backed up.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "EntityKind")
@JsonTypeName("Partition")
public class PartitionBackupEntity extends BackupEntity {
    /**
     * The full name of the service with 'fabric:' URI scheme.
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
     * Get the full name of the service with 'fabric:' URI scheme.
     *
     * @return the serviceName value
     */
    public String serviceName() {
        return this.serviceName;
    }

    /**
     * Set the full name of the service with 'fabric:' URI scheme.
     *
     * @param serviceName the serviceName value to set
     * @return the PartitionBackupEntity object itself.
     */
    public PartitionBackupEntity withServiceName(String serviceName) {
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
     * @return the PartitionBackupEntity object itself.
     */
    public PartitionBackupEntity withPartitionId(UUID partitionId) {
        this.partitionId = partitionId;
        return this;
    }

}
