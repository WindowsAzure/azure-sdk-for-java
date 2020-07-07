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

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation.RecoveryPointInner;

/**
 * Workload specific recovery point, specifically encapsulates full/diff
 * recovery point.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType", defaultImpl = AzureWorkloadRecoveryPoint.class)
@JsonTypeName("AzureWorkloadRecoveryPoint")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureWorkloadPointInTimeRecoveryPoint", value = AzureWorkloadPointInTimeRecoveryPoint.class),
    @JsonSubTypes.Type(name = "AzureWorkloadSAPHanaRecoveryPoint", value = AzureWorkloadSAPHanaRecoveryPoint.class),
    @JsonSubTypes.Type(name = "AzureWorkloadSQLRecoveryPoint", value = AzureWorkloadSQLRecoveryPoint.class)
})
public class AzureWorkloadRecoveryPoint extends RecoveryPointInner {
    /**
     * UTC time at which recovery point was created.
     */
    @JsonProperty(value = "recoveryPointTimeInUTC", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime recoveryPointTimeInUTC;

    /**
     * Type of restore point. Possible values include: 'Invalid', 'Full',
     * 'Log', 'Differential'.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private RestorePointType type;

    /**
     * Get uTC time at which recovery point was created.
     *
     * @return the recoveryPointTimeInUTC value
     */
    public DateTime recoveryPointTimeInUTC() {
        return this.recoveryPointTimeInUTC;
    }

    /**
     * Get type of restore point. Possible values include: 'Invalid', 'Full', 'Log', 'Differential'.
     *
     * @return the type value
     */
    public RestorePointType type() {
        return this.type;
    }

}
