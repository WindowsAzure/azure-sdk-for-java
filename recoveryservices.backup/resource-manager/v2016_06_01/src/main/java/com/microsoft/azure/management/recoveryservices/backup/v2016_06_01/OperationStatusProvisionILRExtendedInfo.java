/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Extended information about the Item Level Recovery (ILR) provision action,
 * operation status.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("OperationStatusProvisionILRExtendedInfo")
public class OperationStatusProvisionILRExtendedInfo extends OperationStatusExtendedInfo {
    /**
     * Target details for the file or folder restore.
     */
    @JsonProperty(value = "recoveryTarget")
    private InstantItemRecoveryTarget recoveryTarget;

    /**
     * Get target details for the file or folder restore.
     *
     * @return the recoveryTarget value
     */
    public InstantItemRecoveryTarget recoveryTarget() {
        return this.recoveryTarget;
    }

    /**
     * Set target details for the file or folder restore.
     *
     * @param recoveryTarget the recoveryTarget value to set
     * @return the OperationStatusProvisionILRExtendedInfo object itself.
     */
    public OperationStatusProvisionILRExtendedInfo withRecoveryTarget(InstantItemRecoveryTarget recoveryTarget) {
        this.recoveryTarget = recoveryTarget;
        return this;
    }

}
