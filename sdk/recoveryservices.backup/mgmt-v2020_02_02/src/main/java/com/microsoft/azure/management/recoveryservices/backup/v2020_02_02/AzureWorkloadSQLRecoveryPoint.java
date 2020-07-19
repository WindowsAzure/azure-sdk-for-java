/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * SQL specific recoverypoint, specifically encapsulates full/diff
 * recoverypoint along with extended info.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType", defaultImpl = AzureWorkloadSQLRecoveryPoint.class)
@JsonTypeName("AzureWorkloadSQLRecoveryPoint")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureWorkloadSQLPointInTimeRecoveryPoint", value = AzureWorkloadSQLPointInTimeRecoveryPoint.class)
})
public class AzureWorkloadSQLRecoveryPoint extends AzureWorkloadRecoveryPoint {
    /**
     * Extended Info that provides data directory details. Will be populated in
     * two cases:
     * When a specific recovery point is accessed using GetRecoveryPoint
     * Or when ListRecoveryPoints is called for Log RP only with ExtendedInfo
     * query filter.
     */
    @JsonProperty(value = "extendedInfo")
    private AzureWorkloadSQLRecoveryPointExtendedInfo extendedInfo;

    /**
     * Get extended Info that provides data directory details. Will be populated in two cases:
     When a specific recovery point is accessed using GetRecoveryPoint
     Or when ListRecoveryPoints is called for Log RP only with ExtendedInfo query filter.
     *
     * @return the extendedInfo value
     */
    public AzureWorkloadSQLRecoveryPointExtendedInfo extendedInfo() {
        return this.extendedInfo;
    }

    /**
     * Set extended Info that provides data directory details. Will be populated in two cases:
     When a specific recovery point is accessed using GetRecoveryPoint
     Or when ListRecoveryPoints is called for Log RP only with ExtendedInfo query filter.
     *
     * @param extendedInfo the extendedInfo value to set
     * @return the AzureWorkloadSQLRecoveryPoint object itself.
     */
    public AzureWorkloadSQLRecoveryPoint withExtendedInfo(AzureWorkloadSQLRecoveryPointExtendedInfo extendedInfo) {
        this.extendedInfo = extendedInfo;
        return this;
    }

}
