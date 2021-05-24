// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Recovery point specific to PointInTime in SAPHana. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("AzureWorkloadSAPHanaPointInTimeRecoveryPoint")
@Immutable
public final class AzureWorkloadSapHanaPointInTimeRecoveryPointAutoGenerated
    extends AzureWorkloadPointInTimeRecoveryPointAutoGenerated {
    @JsonIgnore
    private final ClientLogger logger =
        new ClientLogger(AzureWorkloadSapHanaPointInTimeRecoveryPointAutoGenerated.class);

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSapHanaPointInTimeRecoveryPointAutoGenerated withTimeRanges(List<PointInTimeRange> timeRanges) {
        super.withTimeRanges(timeRanges);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSapHanaPointInTimeRecoveryPointAutoGenerated withRecoveryPointTierDetails(
        List<RecoveryPointTierInformation> recoveryPointTierDetails) {
        super.withRecoveryPointTierDetails(recoveryPointTierDetails);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSapHanaPointInTimeRecoveryPointAutoGenerated withRecoveryPointMoveReadinessInfo(
        Map<String, RecoveryPointMoveReadinessInfo> recoveryPointMoveReadinessInfo) {
        super.withRecoveryPointMoveReadinessInfo(recoveryPointMoveReadinessInfo);
        return this;
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
