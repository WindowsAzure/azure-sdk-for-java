/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_12_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Additional information on Azure Workload for SQL specific backup item.
 */
public class AzureVmWorkloadProtectedItemExtendedInfo {
    /**
     * The oldest backup copy available for this backup item.
     */
    @JsonProperty(value = "oldestRecoveryPoint")
    private DateTime oldestRecoveryPoint;

    /**
     * Number of backup copies available for this backup item.
     */
    @JsonProperty(value = "recoveryPointCount")
    private Integer recoveryPointCount;

    /**
     * Indicates consistency of policy object and policy applied to this backup
     * item.
     */
    @JsonProperty(value = "policyState")
    private String policyState;

    /**
     * Get the oldest backup copy available for this backup item.
     *
     * @return the oldestRecoveryPoint value
     */
    public DateTime oldestRecoveryPoint() {
        return this.oldestRecoveryPoint;
    }

    /**
     * Set the oldest backup copy available for this backup item.
     *
     * @param oldestRecoveryPoint the oldestRecoveryPoint value to set
     * @return the AzureVmWorkloadProtectedItemExtendedInfo object itself.
     */
    public AzureVmWorkloadProtectedItemExtendedInfo withOldestRecoveryPoint(DateTime oldestRecoveryPoint) {
        this.oldestRecoveryPoint = oldestRecoveryPoint;
        return this;
    }

    /**
     * Get number of backup copies available for this backup item.
     *
     * @return the recoveryPointCount value
     */
    public Integer recoveryPointCount() {
        return this.recoveryPointCount;
    }

    /**
     * Set number of backup copies available for this backup item.
     *
     * @param recoveryPointCount the recoveryPointCount value to set
     * @return the AzureVmWorkloadProtectedItemExtendedInfo object itself.
     */
    public AzureVmWorkloadProtectedItemExtendedInfo withRecoveryPointCount(Integer recoveryPointCount) {
        this.recoveryPointCount = recoveryPointCount;
        return this;
    }

    /**
     * Get indicates consistency of policy object and policy applied to this backup item.
     *
     * @return the policyState value
     */
    public String policyState() {
        return this.policyState;
    }

    /**
     * Set indicates consistency of policy object and policy applied to this backup item.
     *
     * @param policyState the policyState value to set
     * @return the AzureVmWorkloadProtectedItemExtendedInfo object itself.
     */
    public AzureVmWorkloadProtectedItemExtendedInfo withPolicyState(String policyState) {
        this.policyState = policyState;
        return this;
    }

}
