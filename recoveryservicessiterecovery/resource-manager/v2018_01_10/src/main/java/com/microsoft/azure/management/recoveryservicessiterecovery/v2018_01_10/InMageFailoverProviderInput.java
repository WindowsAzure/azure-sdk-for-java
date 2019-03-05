/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Provider specific input for InMage failover.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("InMage")
public class InMageFailoverProviderInput extends ProviderSpecificFailoverInput {
    /**
     * The recovery point type. Values from LatestTime, LatestTag or Custom. In
     * the case of custom, the recovery point provided by RecoveryPointId will
     * be used. In the other two cases, recovery point id will be ignored.
     * Possible values include: 'LatestTime', 'LatestTag', 'Custom'.
     */
    @JsonProperty(value = "recoveryPointType")
    private RecoveryPointType recoveryPointType;

    /**
     * The recovery point id to be passed to failover to a particular recovery
     * point. In case of latest recovery point, null should be passed.
     */
    @JsonProperty(value = "recoveryPointId")
    private String recoveryPointId;

    /**
     * Get the recovery point type. Values from LatestTime, LatestTag or Custom. In the case of custom, the recovery point provided by RecoveryPointId will be used. In the other two cases, recovery point id will be ignored. Possible values include: 'LatestTime', 'LatestTag', 'Custom'.
     *
     * @return the recoveryPointType value
     */
    public RecoveryPointType recoveryPointType() {
        return this.recoveryPointType;
    }

    /**
     * Set the recovery point type. Values from LatestTime, LatestTag or Custom. In the case of custom, the recovery point provided by RecoveryPointId will be used. In the other two cases, recovery point id will be ignored. Possible values include: 'LatestTime', 'LatestTag', 'Custom'.
     *
     * @param recoveryPointType the recoveryPointType value to set
     * @return the InMageFailoverProviderInput object itself.
     */
    public InMageFailoverProviderInput withRecoveryPointType(RecoveryPointType recoveryPointType) {
        this.recoveryPointType = recoveryPointType;
        return this;
    }

    /**
     * Get the recovery point id to be passed to failover to a particular recovery point. In case of latest recovery point, null should be passed.
     *
     * @return the recoveryPointId value
     */
    public String recoveryPointId() {
        return this.recoveryPointId;
    }

    /**
     * Set the recovery point id to be passed to failover to a particular recovery point. In case of latest recovery point, null should be passed.
     *
     * @param recoveryPointId the recoveryPointId value to set
     * @return the InMageFailoverProviderInput object itself.
     */
    public InMageFailoverProviderInput withRecoveryPointId(String recoveryPointId) {
        this.recoveryPointId = recoveryPointId;
        return this;
    }

}
