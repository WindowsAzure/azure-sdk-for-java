// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** AzureWorkload SQL -specific restore. Specifically for PointInTime/Log restore. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("AzureWorkloadSQLPointInTimeRestoreRequest")
@Fluent
public final class AzureWorkloadSqlPointInTimeRestoreRequest extends AzureWorkloadSqlRestoreRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureWorkloadSqlPointInTimeRestoreRequest.class);

    /*
     * PointInTime value
     */
    @JsonProperty(value = "pointInTime")
    private OffsetDateTime pointInTime;

    /**
     * Get the pointInTime property: PointInTime value.
     *
     * @return the pointInTime value.
     */
    public OffsetDateTime pointInTime() {
        return this.pointInTime;
    }

    /**
     * Set the pointInTime property: PointInTime value.
     *
     * @param pointInTime the pointInTime value to set.
     * @return the AzureWorkloadSqlPointInTimeRestoreRequest object itself.
     */
    public AzureWorkloadSqlPointInTimeRestoreRequest withPointInTime(OffsetDateTime pointInTime) {
        this.pointInTime = pointInTime;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSqlPointInTimeRestoreRequest withShouldUseAlternateTargetLocation(
        Boolean shouldUseAlternateTargetLocation) {
        super.withShouldUseAlternateTargetLocation(shouldUseAlternateTargetLocation);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSqlPointInTimeRestoreRequest withIsNonRecoverable(Boolean isNonRecoverable) {
        super.withIsNonRecoverable(isNonRecoverable);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSqlPointInTimeRestoreRequest withAlternateDirectoryPaths(
        List<SqlDataDirectoryMapping> alternateDirectoryPaths) {
        super.withAlternateDirectoryPaths(alternateDirectoryPaths);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSqlPointInTimeRestoreRequest withRecoveryType(RecoveryType recoveryType) {
        super.withRecoveryType(recoveryType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSqlPointInTimeRestoreRequest withSourceResourceId(String sourceResourceId) {
        super.withSourceResourceId(sourceResourceId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSqlPointInTimeRestoreRequest withPropertyBag(Map<String, String> propertyBag) {
        super.withPropertyBag(propertyBag);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSqlPointInTimeRestoreRequest withTargetInfo(TargetRestoreInfo targetInfo) {
        super.withTargetInfo(targetInfo);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSqlPointInTimeRestoreRequest withRecoveryMode(RecoveryMode recoveryMode) {
        super.withRecoveryMode(recoveryMode);
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
