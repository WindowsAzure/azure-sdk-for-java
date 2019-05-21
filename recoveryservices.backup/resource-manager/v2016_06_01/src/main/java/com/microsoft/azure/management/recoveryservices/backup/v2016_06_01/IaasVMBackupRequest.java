/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * This is an Azure VM (also known as IaaS VM) workload-specific backup
 * request.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("IaasVMBackupRequest")
public class IaasVMBackupRequest extends BackupRequest {
    /**
     * The backup copy will expire after the time specified. The time is in UTC
     * format.
     */
    @JsonProperty(value = "recoveryPointExpiryTimeInUTC")
    private DateTime recoveryPointExpiryTimeInUTC;

    /**
     * Get the backup copy will expire after the time specified. The time is in UTC format.
     *
     * @return the recoveryPointExpiryTimeInUTC value
     */
    public DateTime recoveryPointExpiryTimeInUTC() {
        return this.recoveryPointExpiryTimeInUTC;
    }

    /**
     * Set the backup copy will expire after the time specified. The time is in UTC format.
     *
     * @param recoveryPointExpiryTimeInUTC the recoveryPointExpiryTimeInUTC value to set
     * @return the IaasVMBackupRequest object itself.
     */
    public IaasVMBackupRequest withRecoveryPointExpiryTimeInUTC(DateTime recoveryPointExpiryTimeInUTC) {
        this.recoveryPointExpiryTimeInUTC = recoveryPointExpiryTimeInUTC;
        return this;
    }

}
