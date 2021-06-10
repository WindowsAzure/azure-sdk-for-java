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

/** IaaS VM workload-specific backup policy. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "backupManagementType")
@JsonTypeName("AzureIaasVM")
@Fluent
public final class AzureIaaSvmProtectionPolicy extends ProtectionPolicy {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureIaaSvmProtectionPolicy.class);

    /*
     * The instantRPDetails property.
     */
    @JsonProperty(value = "instantRPDetails")
    private InstantRPAdditionalDetails instantRPDetails;

    /*
     * Backup schedule specified as part of backup policy.
     */
    @JsonProperty(value = "schedulePolicy")
    private SchedulePolicy schedulePolicy;

    /*
     * Retention policy with the details on backup copy retention ranges.
     */
    @JsonProperty(value = "retentionPolicy")
    private RetentionPolicy retentionPolicy;

    /*
     * Instant RP retention policy range in days
     */
    @JsonProperty(value = "instantRpRetentionRangeInDays")
    private Integer instantRpRetentionRangeInDays;

    /*
     * TimeZone optional input as string. For example: TimeZone = "Pacific
     * Standard Time".
     */
    @JsonProperty(value = "timeZone")
    private String timeZone;

    /**
     * Get the instantRPDetails property: The instantRPDetails property.
     *
     * @return the instantRPDetails value.
     */
    public InstantRPAdditionalDetails instantRPDetails() {
        return this.instantRPDetails;
    }

    /**
     * Set the instantRPDetails property: The instantRPDetails property.
     *
     * @param instantRPDetails the instantRPDetails value to set.
     * @return the AzureIaaSvmProtectionPolicy object itself.
     */
    public AzureIaaSvmProtectionPolicy withInstantRPDetails(InstantRPAdditionalDetails instantRPDetails) {
        this.instantRPDetails = instantRPDetails;
        return this;
    }

    /**
     * Get the schedulePolicy property: Backup schedule specified as part of backup policy.
     *
     * @return the schedulePolicy value.
     */
    public SchedulePolicy schedulePolicy() {
        return this.schedulePolicy;
    }

    /**
     * Set the schedulePolicy property: Backup schedule specified as part of backup policy.
     *
     * @param schedulePolicy the schedulePolicy value to set.
     * @return the AzureIaaSvmProtectionPolicy object itself.
     */
    public AzureIaaSvmProtectionPolicy withSchedulePolicy(SchedulePolicy schedulePolicy) {
        this.schedulePolicy = schedulePolicy;
        return this;
    }

    /**
     * Get the retentionPolicy property: Retention policy with the details on backup copy retention ranges.
     *
     * @return the retentionPolicy value.
     */
    public RetentionPolicy retentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     * Set the retentionPolicy property: Retention policy with the details on backup copy retention ranges.
     *
     * @param retentionPolicy the retentionPolicy value to set.
     * @return the AzureIaaSvmProtectionPolicy object itself.
     */
    public AzureIaaSvmProtectionPolicy withRetentionPolicy(RetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }

    /**
     * Get the instantRpRetentionRangeInDays property: Instant RP retention policy range in days.
     *
     * @return the instantRpRetentionRangeInDays value.
     */
    public Integer instantRpRetentionRangeInDays() {
        return this.instantRpRetentionRangeInDays;
    }

    /**
     * Set the instantRpRetentionRangeInDays property: Instant RP retention policy range in days.
     *
     * @param instantRpRetentionRangeInDays the instantRpRetentionRangeInDays value to set.
     * @return the AzureIaaSvmProtectionPolicy object itself.
     */
    public AzureIaaSvmProtectionPolicy withInstantRpRetentionRangeInDays(Integer instantRpRetentionRangeInDays) {
        this.instantRpRetentionRangeInDays = instantRpRetentionRangeInDays;
        return this;
    }

    /**
     * Get the timeZone property: TimeZone optional input as string. For example: TimeZone = "Pacific Standard Time".
     *
     * @return the timeZone value.
     */
    public String timeZone() {
        return this.timeZone;
    }

    /**
     * Set the timeZone property: TimeZone optional input as string. For example: TimeZone = "Pacific Standard Time".
     *
     * @param timeZone the timeZone value to set.
     * @return the AzureIaaSvmProtectionPolicy object itself.
     */
    public AzureIaaSvmProtectionPolicy withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSvmProtectionPolicy withProtectedItemsCount(Integer protectedItemsCount) {
        super.withProtectedItemsCount(protectedItemsCount);
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
        if (instantRPDetails() != null) {
            instantRPDetails().validate();
        }
        if (schedulePolicy() != null) {
            schedulePolicy().validate();
        }
        if (retentionPolicy() != null) {
            retentionPolicy().validate();
        }
    }
}
