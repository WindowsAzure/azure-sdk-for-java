// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservices.models.JobsSummary;
import com.azure.resourcemanager.recoveryservices.models.MonitoringSummary;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Replication usages of a vault. */
@Fluent
public final class ReplicationUsageInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ReplicationUsageInner.class);

    /*
     * Summary of the replication monitoring data for this vault.
     */
    @JsonProperty(value = "monitoringSummary")
    private MonitoringSummary monitoringSummary;

    /*
     * Summary of the replication jobs data for this vault.
     */
    @JsonProperty(value = "jobsSummary")
    private JobsSummary jobsSummary;

    /*
     * Number of replication protected items for this vault.
     */
    @JsonProperty(value = "protectedItemCount")
    private Integer protectedItemCount;

    /*
     * Number of replication recovery plans for this vault.
     */
    @JsonProperty(value = "recoveryPlanCount")
    private Integer recoveryPlanCount;

    /*
     * Number of servers registered to this vault.
     */
    @JsonProperty(value = "registeredServersCount")
    private Integer registeredServersCount;

    /*
     * The authentication type of recovery service providers in the vault.
     */
    @JsonProperty(value = "recoveryServicesProviderAuthType")
    private Integer recoveryServicesProviderAuthType;

    /**
     * Get the monitoringSummary property: Summary of the replication monitoring data for this vault.
     *
     * @return the monitoringSummary value.
     */
    public MonitoringSummary monitoringSummary() {
        return this.monitoringSummary;
    }

    /**
     * Set the monitoringSummary property: Summary of the replication monitoring data for this vault.
     *
     * @param monitoringSummary the monitoringSummary value to set.
     * @return the ReplicationUsageInner object itself.
     */
    public ReplicationUsageInner withMonitoringSummary(MonitoringSummary monitoringSummary) {
        this.monitoringSummary = monitoringSummary;
        return this;
    }

    /**
     * Get the jobsSummary property: Summary of the replication jobs data for this vault.
     *
     * @return the jobsSummary value.
     */
    public JobsSummary jobsSummary() {
        return this.jobsSummary;
    }

    /**
     * Set the jobsSummary property: Summary of the replication jobs data for this vault.
     *
     * @param jobsSummary the jobsSummary value to set.
     * @return the ReplicationUsageInner object itself.
     */
    public ReplicationUsageInner withJobsSummary(JobsSummary jobsSummary) {
        this.jobsSummary = jobsSummary;
        return this;
    }

    /**
     * Get the protectedItemCount property: Number of replication protected items for this vault.
     *
     * @return the protectedItemCount value.
     */
    public Integer protectedItemCount() {
        return this.protectedItemCount;
    }

    /**
     * Set the protectedItemCount property: Number of replication protected items for this vault.
     *
     * @param protectedItemCount the protectedItemCount value to set.
     * @return the ReplicationUsageInner object itself.
     */
    public ReplicationUsageInner withProtectedItemCount(Integer protectedItemCount) {
        this.protectedItemCount = protectedItemCount;
        return this;
    }

    /**
     * Get the recoveryPlanCount property: Number of replication recovery plans for this vault.
     *
     * @return the recoveryPlanCount value.
     */
    public Integer recoveryPlanCount() {
        return this.recoveryPlanCount;
    }

    /**
     * Set the recoveryPlanCount property: Number of replication recovery plans for this vault.
     *
     * @param recoveryPlanCount the recoveryPlanCount value to set.
     * @return the ReplicationUsageInner object itself.
     */
    public ReplicationUsageInner withRecoveryPlanCount(Integer recoveryPlanCount) {
        this.recoveryPlanCount = recoveryPlanCount;
        return this;
    }

    /**
     * Get the registeredServersCount property: Number of servers registered to this vault.
     *
     * @return the registeredServersCount value.
     */
    public Integer registeredServersCount() {
        return this.registeredServersCount;
    }

    /**
     * Set the registeredServersCount property: Number of servers registered to this vault.
     *
     * @param registeredServersCount the registeredServersCount value to set.
     * @return the ReplicationUsageInner object itself.
     */
    public ReplicationUsageInner withRegisteredServersCount(Integer registeredServersCount) {
        this.registeredServersCount = registeredServersCount;
        return this;
    }

    /**
     * Get the recoveryServicesProviderAuthType property: The authentication type of recovery service providers in the
     * vault.
     *
     * @return the recoveryServicesProviderAuthType value.
     */
    public Integer recoveryServicesProviderAuthType() {
        return this.recoveryServicesProviderAuthType;
    }

    /**
     * Set the recoveryServicesProviderAuthType property: The authentication type of recovery service providers in the
     * vault.
     *
     * @param recoveryServicesProviderAuthType the recoveryServicesProviderAuthType value to set.
     * @return the ReplicationUsageInner object itself.
     */
    public ReplicationUsageInner withRecoveryServicesProviderAuthType(Integer recoveryServicesProviderAuthType) {
        this.recoveryServicesProviderAuthType = recoveryServicesProviderAuthType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (monitoringSummary() != null) {
            monitoringSummary().validate();
        }
        if (jobsSummary() != null) {
            jobsSummary().validate();
        }
    }
}
