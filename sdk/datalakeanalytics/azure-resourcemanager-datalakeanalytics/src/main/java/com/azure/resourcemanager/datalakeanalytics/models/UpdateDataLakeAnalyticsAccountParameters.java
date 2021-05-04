// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The parameters that can be used to update an existing Data Lake Analytics account. */
@JsonFlatten
@Fluent
public class UpdateDataLakeAnalyticsAccountParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UpdateDataLakeAnalyticsAccountParameters.class);

    /*
     * The resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * The list of Data Lake Store accounts associated with this account.
     */
    @JsonProperty(value = "properties.dataLakeStoreAccounts")
    private List<UpdateDataLakeStoreWithAccountParameters> dataLakeStoreAccounts;

    /*
     * The list of Azure Blob storage accounts associated with this account.
     */
    @JsonProperty(value = "properties.storageAccounts")
    private List<UpdateStorageAccountWithAccountParameters> storageAccounts;

    /*
     * The list of compute policies associated with this account.
     */
    @JsonProperty(value = "properties.computePolicies")
    private List<UpdateComputePolicyWithAccountParameters> computePolicies;

    /*
     * The list of firewall rules associated with this account.
     */
    @JsonProperty(value = "properties.firewallRules")
    private List<UpdateFirewallRuleWithAccountParameters> firewallRules;

    /*
     * The current state of the IP address firewall for this account. Disabling
     * the firewall does not remove existing rules, they will just be ignored
     * until the firewall is re-enabled.
     */
    @JsonProperty(value = "properties.firewallState")
    private FirewallState firewallState;

    /*
     * The current state of allowing or disallowing IPs originating within
     * Azure through the firewall. If the firewall is disabled, this is not
     * enforced.
     */
    @JsonProperty(value = "properties.firewallAllowAzureIps")
    private FirewallAllowAzureIpsState firewallAllowAzureIps;

    /*
     * The commitment tier to use for next month.
     */
    @JsonProperty(value = "properties.newTier")
    private TierType newTier;

    /*
     * The maximum supported jobs running under the account at the same time.
     */
    @JsonProperty(value = "properties.maxJobCount")
    private Integer maxJobCount;

    /*
     * The maximum supported degree of parallelism for this account.
     */
    @JsonProperty(value = "properties.maxDegreeOfParallelism")
    private Integer maxDegreeOfParallelism;

    /*
     * The maximum supported degree of parallelism per job for this account.
     */
    @JsonProperty(value = "properties.maxDegreeOfParallelismPerJob")
    private Integer maxDegreeOfParallelismPerJob;

    /*
     * The minimum supported priority per job for this account.
     */
    @JsonProperty(value = "properties.minPriorityPerJob")
    private Integer minPriorityPerJob;

    /*
     * The number of days that job metadata is retained.
     */
    @JsonProperty(value = "properties.queryStoreRetention")
    private Integer queryStoreRetention;

    /**
     * Get the tags property: The resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The resource tags.
     *
     * @param tags the tags value to set.
     * @return the UpdateDataLakeAnalyticsAccountParameters object itself.
     */
    public UpdateDataLakeAnalyticsAccountParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the dataLakeStoreAccounts property: The list of Data Lake Store accounts associated with this account.
     *
     * @return the dataLakeStoreAccounts value.
     */
    public List<UpdateDataLakeStoreWithAccountParameters> dataLakeStoreAccounts() {
        return this.dataLakeStoreAccounts;
    }

    /**
     * Set the dataLakeStoreAccounts property: The list of Data Lake Store accounts associated with this account.
     *
     * @param dataLakeStoreAccounts the dataLakeStoreAccounts value to set.
     * @return the UpdateDataLakeAnalyticsAccountParameters object itself.
     */
    public UpdateDataLakeAnalyticsAccountParameters withDataLakeStoreAccounts(
        List<UpdateDataLakeStoreWithAccountParameters> dataLakeStoreAccounts) {
        this.dataLakeStoreAccounts = dataLakeStoreAccounts;
        return this;
    }

    /**
     * Get the storageAccounts property: The list of Azure Blob storage accounts associated with this account.
     *
     * @return the storageAccounts value.
     */
    public List<UpdateStorageAccountWithAccountParameters> storageAccounts() {
        return this.storageAccounts;
    }

    /**
     * Set the storageAccounts property: The list of Azure Blob storage accounts associated with this account.
     *
     * @param storageAccounts the storageAccounts value to set.
     * @return the UpdateDataLakeAnalyticsAccountParameters object itself.
     */
    public UpdateDataLakeAnalyticsAccountParameters withStorageAccounts(
        List<UpdateStorageAccountWithAccountParameters> storageAccounts) {
        this.storageAccounts = storageAccounts;
        return this;
    }

    /**
     * Get the computePolicies property: The list of compute policies associated with this account.
     *
     * @return the computePolicies value.
     */
    public List<UpdateComputePolicyWithAccountParameters> computePolicies() {
        return this.computePolicies;
    }

    /**
     * Set the computePolicies property: The list of compute policies associated with this account.
     *
     * @param computePolicies the computePolicies value to set.
     * @return the UpdateDataLakeAnalyticsAccountParameters object itself.
     */
    public UpdateDataLakeAnalyticsAccountParameters withComputePolicies(
        List<UpdateComputePolicyWithAccountParameters> computePolicies) {
        this.computePolicies = computePolicies;
        return this;
    }

    /**
     * Get the firewallRules property: The list of firewall rules associated with this account.
     *
     * @return the firewallRules value.
     */
    public List<UpdateFirewallRuleWithAccountParameters> firewallRules() {
        return this.firewallRules;
    }

    /**
     * Set the firewallRules property: The list of firewall rules associated with this account.
     *
     * @param firewallRules the firewallRules value to set.
     * @return the UpdateDataLakeAnalyticsAccountParameters object itself.
     */
    public UpdateDataLakeAnalyticsAccountParameters withFirewallRules(
        List<UpdateFirewallRuleWithAccountParameters> firewallRules) {
        this.firewallRules = firewallRules;
        return this;
    }

    /**
     * Get the firewallState property: The current state of the IP address firewall for this account. Disabling the
     * firewall does not remove existing rules, they will just be ignored until the firewall is re-enabled.
     *
     * @return the firewallState value.
     */
    public FirewallState firewallState() {
        return this.firewallState;
    }

    /**
     * Set the firewallState property: The current state of the IP address firewall for this account. Disabling the
     * firewall does not remove existing rules, they will just be ignored until the firewall is re-enabled.
     *
     * @param firewallState the firewallState value to set.
     * @return the UpdateDataLakeAnalyticsAccountParameters object itself.
     */
    public UpdateDataLakeAnalyticsAccountParameters withFirewallState(FirewallState firewallState) {
        this.firewallState = firewallState;
        return this;
    }

    /**
     * Get the firewallAllowAzureIps property: The current state of allowing or disallowing IPs originating within Azure
     * through the firewall. If the firewall is disabled, this is not enforced.
     *
     * @return the firewallAllowAzureIps value.
     */
    public FirewallAllowAzureIpsState firewallAllowAzureIps() {
        return this.firewallAllowAzureIps;
    }

    /**
     * Set the firewallAllowAzureIps property: The current state of allowing or disallowing IPs originating within Azure
     * through the firewall. If the firewall is disabled, this is not enforced.
     *
     * @param firewallAllowAzureIps the firewallAllowAzureIps value to set.
     * @return the UpdateDataLakeAnalyticsAccountParameters object itself.
     */
    public UpdateDataLakeAnalyticsAccountParameters withFirewallAllowAzureIps(
        FirewallAllowAzureIpsState firewallAllowAzureIps) {
        this.firewallAllowAzureIps = firewallAllowAzureIps;
        return this;
    }

    /**
     * Get the newTier property: The commitment tier to use for next month.
     *
     * @return the newTier value.
     */
    public TierType newTier() {
        return this.newTier;
    }

    /**
     * Set the newTier property: The commitment tier to use for next month.
     *
     * @param newTier the newTier value to set.
     * @return the UpdateDataLakeAnalyticsAccountParameters object itself.
     */
    public UpdateDataLakeAnalyticsAccountParameters withNewTier(TierType newTier) {
        this.newTier = newTier;
        return this;
    }

    /**
     * Get the maxJobCount property: The maximum supported jobs running under the account at the same time.
     *
     * @return the maxJobCount value.
     */
    public Integer maxJobCount() {
        return this.maxJobCount;
    }

    /**
     * Set the maxJobCount property: The maximum supported jobs running under the account at the same time.
     *
     * @param maxJobCount the maxJobCount value to set.
     * @return the UpdateDataLakeAnalyticsAccountParameters object itself.
     */
    public UpdateDataLakeAnalyticsAccountParameters withMaxJobCount(Integer maxJobCount) {
        this.maxJobCount = maxJobCount;
        return this;
    }

    /**
     * Get the maxDegreeOfParallelism property: The maximum supported degree of parallelism for this account.
     *
     * @return the maxDegreeOfParallelism value.
     */
    public Integer maxDegreeOfParallelism() {
        return this.maxDegreeOfParallelism;
    }

    /**
     * Set the maxDegreeOfParallelism property: The maximum supported degree of parallelism for this account.
     *
     * @param maxDegreeOfParallelism the maxDegreeOfParallelism value to set.
     * @return the UpdateDataLakeAnalyticsAccountParameters object itself.
     */
    public UpdateDataLakeAnalyticsAccountParameters withMaxDegreeOfParallelism(Integer maxDegreeOfParallelism) {
        this.maxDegreeOfParallelism = maxDegreeOfParallelism;
        return this;
    }

    /**
     * Get the maxDegreeOfParallelismPerJob property: The maximum supported degree of parallelism per job for this
     * account.
     *
     * @return the maxDegreeOfParallelismPerJob value.
     */
    public Integer maxDegreeOfParallelismPerJob() {
        return this.maxDegreeOfParallelismPerJob;
    }

    /**
     * Set the maxDegreeOfParallelismPerJob property: The maximum supported degree of parallelism per job for this
     * account.
     *
     * @param maxDegreeOfParallelismPerJob the maxDegreeOfParallelismPerJob value to set.
     * @return the UpdateDataLakeAnalyticsAccountParameters object itself.
     */
    public UpdateDataLakeAnalyticsAccountParameters withMaxDegreeOfParallelismPerJob(
        Integer maxDegreeOfParallelismPerJob) {
        this.maxDegreeOfParallelismPerJob = maxDegreeOfParallelismPerJob;
        return this;
    }

    /**
     * Get the minPriorityPerJob property: The minimum supported priority per job for this account.
     *
     * @return the minPriorityPerJob value.
     */
    public Integer minPriorityPerJob() {
        return this.minPriorityPerJob;
    }

    /**
     * Set the minPriorityPerJob property: The minimum supported priority per job for this account.
     *
     * @param minPriorityPerJob the minPriorityPerJob value to set.
     * @return the UpdateDataLakeAnalyticsAccountParameters object itself.
     */
    public UpdateDataLakeAnalyticsAccountParameters withMinPriorityPerJob(Integer minPriorityPerJob) {
        this.minPriorityPerJob = minPriorityPerJob;
        return this;
    }

    /**
     * Get the queryStoreRetention property: The number of days that job metadata is retained.
     *
     * @return the queryStoreRetention value.
     */
    public Integer queryStoreRetention() {
        return this.queryStoreRetention;
    }

    /**
     * Set the queryStoreRetention property: The number of days that job metadata is retained.
     *
     * @param queryStoreRetention the queryStoreRetention value to set.
     * @return the UpdateDataLakeAnalyticsAccountParameters object itself.
     */
    public UpdateDataLakeAnalyticsAccountParameters withQueryStoreRetention(Integer queryStoreRetention) {
        this.queryStoreRetention = queryStoreRetention;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dataLakeStoreAccounts() != null) {
            dataLakeStoreAccounts().forEach(e -> e.validate());
        }
        if (storageAccounts() != null) {
            storageAccounts().forEach(e -> e.validate());
        }
        if (computePolicies() != null) {
            computePolicies().forEach(e -> e.validate());
        }
        if (firewallRules() != null) {
            firewallRules().forEach(e -> e.validate());
        }
    }
}
