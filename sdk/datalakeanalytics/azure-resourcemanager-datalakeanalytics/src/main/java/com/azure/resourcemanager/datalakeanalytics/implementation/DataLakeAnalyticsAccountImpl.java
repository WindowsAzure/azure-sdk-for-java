// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.datalakeanalytics.fluent.models.ComputePolicyInner;
import com.azure.resourcemanager.datalakeanalytics.fluent.models.DataLakeAnalyticsAccountInner;
import com.azure.resourcemanager.datalakeanalytics.fluent.models.DataLakeStoreAccountInformationInner;
import com.azure.resourcemanager.datalakeanalytics.fluent.models.FirewallRuleInner;
import com.azure.resourcemanager.datalakeanalytics.fluent.models.StorageAccountInformationInner;
import com.azure.resourcemanager.datalakeanalytics.models.AddDataLakeStoreWithAccountParameters;
import com.azure.resourcemanager.datalakeanalytics.models.AddStorageAccountWithAccountParameters;
import com.azure.resourcemanager.datalakeanalytics.models.ComputePolicy;
import com.azure.resourcemanager.datalakeanalytics.models.CreateComputePolicyWithAccountParameters;
import com.azure.resourcemanager.datalakeanalytics.models.CreateDataLakeAnalyticsAccountParameters;
import com.azure.resourcemanager.datalakeanalytics.models.CreateFirewallRuleWithAccountParameters;
import com.azure.resourcemanager.datalakeanalytics.models.DataLakeAnalyticsAccount;
import com.azure.resourcemanager.datalakeanalytics.models.DataLakeAnalyticsAccountState;
import com.azure.resourcemanager.datalakeanalytics.models.DataLakeAnalyticsAccountStatus;
import com.azure.resourcemanager.datalakeanalytics.models.DataLakeStoreAccountInformation;
import com.azure.resourcemanager.datalakeanalytics.models.DebugDataAccessLevel;
import com.azure.resourcemanager.datalakeanalytics.models.FirewallAllowAzureIpsState;
import com.azure.resourcemanager.datalakeanalytics.models.FirewallRule;
import com.azure.resourcemanager.datalakeanalytics.models.FirewallState;
import com.azure.resourcemanager.datalakeanalytics.models.HiveMetastore;
import com.azure.resourcemanager.datalakeanalytics.models.StorageAccountInformation;
import com.azure.resourcemanager.datalakeanalytics.models.TierType;
import com.azure.resourcemanager.datalakeanalytics.models.UpdateComputePolicyWithAccountParameters;
import com.azure.resourcemanager.datalakeanalytics.models.UpdateDataLakeAnalyticsAccountParameters;
import com.azure.resourcemanager.datalakeanalytics.models.UpdateDataLakeStoreWithAccountParameters;
import com.azure.resourcemanager.datalakeanalytics.models.UpdateFirewallRuleWithAccountParameters;
import com.azure.resourcemanager.datalakeanalytics.models.UpdateStorageAccountWithAccountParameters;
import com.azure.resourcemanager.datalakeanalytics.models.VirtualNetworkRule;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

public final class DataLakeAnalyticsAccountImpl
    implements DataLakeAnalyticsAccount, DataLakeAnalyticsAccount.Definition, DataLakeAnalyticsAccount.Update {
    private DataLakeAnalyticsAccountInner innerObject;

    private final com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public UUID accountId() {
        return this.innerModel().accountId();
    }

    public DataLakeAnalyticsAccountStatus provisioningState() {
        return this.innerModel().provisioningState();
    }

    public DataLakeAnalyticsAccountState state() {
        return this.innerModel().state();
    }

    public OffsetDateTime creationTime() {
        return this.innerModel().creationTime();
    }

    public OffsetDateTime lastModifiedTime() {
        return this.innerModel().lastModifiedTime();
    }

    public String endpoint() {
        return this.innerModel().endpoint();
    }

    public String defaultDataLakeStoreAccount() {
        return this.innerModel().defaultDataLakeStoreAccount();
    }

    public List<DataLakeStoreAccountInformation> dataLakeStoreAccounts() {
        List<DataLakeStoreAccountInformationInner> inner = this.innerModel().dataLakeStoreAccounts();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new DataLakeStoreAccountInformationImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<DataLakeStoreAccountInformation> publicDataLakeStoreAccounts() {
        List<DataLakeStoreAccountInformationInner> inner = this.innerModel().publicDataLakeStoreAccounts();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new DataLakeStoreAccountInformationImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<StorageAccountInformation> storageAccounts() {
        List<StorageAccountInformationInner> inner = this.innerModel().storageAccounts();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new StorageAccountInformationImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<ComputePolicy> computePolicies() {
        List<ComputePolicyInner> inner = this.innerModel().computePolicies();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new ComputePolicyImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<HiveMetastore> hiveMetastores() {
        List<HiveMetastore> inner = this.innerModel().hiveMetastores();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String hierarchicalQueueState() {
        return this.innerModel().hierarchicalQueueState();
    }

    public List<VirtualNetworkRule> virtualNetworkRules() {
        List<VirtualNetworkRule> inner = this.innerModel().virtualNetworkRules();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<FirewallRule> firewallRules() {
        List<FirewallRuleInner> inner = this.innerModel().firewallRules();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new FirewallRuleImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public FirewallState firewallState() {
        return this.innerModel().firewallState();
    }

    public FirewallAllowAzureIpsState firewallAllowAzureIps() {
        return this.innerModel().firewallAllowAzureIps();
    }

    public TierType newTier() {
        return this.innerModel().newTier();
    }

    public TierType currentTier() {
        return this.innerModel().currentTier();
    }

    public Integer maxJobCount() {
        return this.innerModel().maxJobCount();
    }

    public Integer maxQueuedJobCountPerUser() {
        return this.innerModel().maxQueuedJobCountPerUser();
    }

    public Integer systemMaxJobCount() {
        return this.innerModel().systemMaxJobCount();
    }

    public Integer maxDegreeOfParallelism() {
        return this.innerModel().maxDegreeOfParallelism();
    }

    public Integer systemMaxDegreeOfParallelism() {
        return this.innerModel().systemMaxDegreeOfParallelism();
    }

    public Integer maxDegreeOfParallelismPerJob() {
        return this.innerModel().maxDegreeOfParallelismPerJob();
    }

    public Integer minPriorityPerJob() {
        return this.innerModel().minPriorityPerJob();
    }

    public Integer queryStoreRetention() {
        return this.innerModel().queryStoreRetention();
    }

    public DebugDataAccessLevel debugDataAccessLevel() {
        return this.innerModel().debugDataAccessLevel();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public DataLakeAnalyticsAccountInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private CreateDataLakeAnalyticsAccountParameters createParameters;

    private UpdateDataLakeAnalyticsAccountParameters updateParameters;

    public DataLakeAnalyticsAccountImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public DataLakeAnalyticsAccount create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAccounts()
                .create(resourceGroupName, accountName, createParameters, Context.NONE);
        return this;
    }

    public DataLakeAnalyticsAccount create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAccounts()
                .create(resourceGroupName, accountName, createParameters, context);
        return this;
    }

    DataLakeAnalyticsAccountImpl(
        String name, com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager serviceManager) {
        this.innerObject = new DataLakeAnalyticsAccountInner();
        this.serviceManager = serviceManager;
        this.accountName = name;
        this.createParameters = new CreateDataLakeAnalyticsAccountParameters();
    }

    public DataLakeAnalyticsAccountImpl update() {
        this.updateParameters = new UpdateDataLakeAnalyticsAccountParameters();
        return this;
    }

    public DataLakeAnalyticsAccount apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAccounts()
                .update(resourceGroupName, accountName, updateParameters, Context.NONE);
        return this;
    }

    public DataLakeAnalyticsAccount apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAccounts()
                .update(resourceGroupName, accountName, updateParameters, context);
        return this;
    }

    DataLakeAnalyticsAccountImpl(
        DataLakeAnalyticsAccountInner innerObject,
        com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "accounts");
    }

    public DataLakeAnalyticsAccount refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAccounts()
                .getByResourceGroupWithResponse(resourceGroupName, accountName, Context.NONE)
                .getValue();
        return this;
    }

    public DataLakeAnalyticsAccount refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAccounts()
                .getByResourceGroupWithResponse(resourceGroupName, accountName, context)
                .getValue();
        return this;
    }

    public DataLakeAnalyticsAccountImpl withRegion(Region location) {
        this.createParameters.withLocation(location.toString());
        return this;
    }

    public DataLakeAnalyticsAccountImpl withRegion(String location) {
        this.createParameters.withLocation(location);
        return this;
    }

    public DataLakeAnalyticsAccountImpl withDefaultDataLakeStoreAccount(String defaultDataLakeStoreAccount) {
        this.createParameters.withDefaultDataLakeStoreAccount(defaultDataLakeStoreAccount);
        return this;
    }

    public DataLakeAnalyticsAccountImpl withDataLakeStoreAccounts(
        List<AddDataLakeStoreWithAccountParameters> dataLakeStoreAccounts) {
        this.createParameters.withDataLakeStoreAccounts(dataLakeStoreAccounts);
        return this;
    }

    public DataLakeAnalyticsAccountImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.createParameters.withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public DataLakeAnalyticsAccountImpl withStorageAccounts(
        List<AddStorageAccountWithAccountParameters> storageAccounts) {
        this.createParameters.withStorageAccounts(storageAccounts);
        return this;
    }

    public DataLakeAnalyticsAccountImpl withComputePolicies(
        List<CreateComputePolicyWithAccountParameters> computePolicies) {
        this.createParameters.withComputePolicies(computePolicies);
        return this;
    }

    public DataLakeAnalyticsAccountImpl withFirewallRules(List<CreateFirewallRuleWithAccountParameters> firewallRules) {
        this.createParameters.withFirewallRules(firewallRules);
        return this;
    }

    public DataLakeAnalyticsAccountImpl withFirewallState(FirewallState firewallState) {
        if (isInCreateMode()) {
            this.createParameters.withFirewallState(firewallState);
            return this;
        } else {
            this.updateParameters.withFirewallState(firewallState);
            return this;
        }
    }

    public DataLakeAnalyticsAccountImpl withFirewallAllowAzureIps(FirewallAllowAzureIpsState firewallAllowAzureIps) {
        if (isInCreateMode()) {
            this.createParameters.withFirewallAllowAzureIps(firewallAllowAzureIps);
            return this;
        } else {
            this.updateParameters.withFirewallAllowAzureIps(firewallAllowAzureIps);
            return this;
        }
    }

    public DataLakeAnalyticsAccountImpl withNewTier(TierType newTier) {
        if (isInCreateMode()) {
            this.createParameters.withNewTier(newTier);
            return this;
        } else {
            this.updateParameters.withNewTier(newTier);
            return this;
        }
    }

    public DataLakeAnalyticsAccountImpl withMaxJobCount(Integer maxJobCount) {
        if (isInCreateMode()) {
            this.createParameters.withMaxJobCount(maxJobCount);
            return this;
        } else {
            this.updateParameters.withMaxJobCount(maxJobCount);
            return this;
        }
    }

    public DataLakeAnalyticsAccountImpl withMaxDegreeOfParallelism(Integer maxDegreeOfParallelism) {
        if (isInCreateMode()) {
            this.createParameters.withMaxDegreeOfParallelism(maxDegreeOfParallelism);
            return this;
        } else {
            this.updateParameters.withMaxDegreeOfParallelism(maxDegreeOfParallelism);
            return this;
        }
    }

    public DataLakeAnalyticsAccountImpl withMaxDegreeOfParallelismPerJob(Integer maxDegreeOfParallelismPerJob) {
        if (isInCreateMode()) {
            this.createParameters.withMaxDegreeOfParallelismPerJob(maxDegreeOfParallelismPerJob);
            return this;
        } else {
            this.updateParameters.withMaxDegreeOfParallelismPerJob(maxDegreeOfParallelismPerJob);
            return this;
        }
    }

    public DataLakeAnalyticsAccountImpl withMinPriorityPerJob(Integer minPriorityPerJob) {
        if (isInCreateMode()) {
            this.createParameters.withMinPriorityPerJob(minPriorityPerJob);
            return this;
        } else {
            this.updateParameters.withMinPriorityPerJob(minPriorityPerJob);
            return this;
        }
    }

    public DataLakeAnalyticsAccountImpl withQueryStoreRetention(Integer queryStoreRetention) {
        if (isInCreateMode()) {
            this.createParameters.withQueryStoreRetention(queryStoreRetention);
            return this;
        } else {
            this.updateParameters.withQueryStoreRetention(queryStoreRetention);
            return this;
        }
    }

    public DataLakeAnalyticsAccountImpl withDataLakeStoreAccountsForUpdate(
        List<UpdateDataLakeStoreWithAccountParameters> dataLakeStoreAccounts) {
        this.updateParameters.withDataLakeStoreAccounts(dataLakeStoreAccounts);
        return this;
    }

    public DataLakeAnalyticsAccountImpl withStorageAccountsForUpdate(
        List<UpdateStorageAccountWithAccountParameters> storageAccounts) {
        this.updateParameters.withStorageAccounts(storageAccounts);
        return this;
    }

    public DataLakeAnalyticsAccountImpl withComputePoliciesForUpdate(
        List<UpdateComputePolicyWithAccountParameters> computePolicies) {
        this.updateParameters.withComputePolicies(computePolicies);
        return this;
    }

    public DataLakeAnalyticsAccountImpl withFirewallRulesForUpdate(
        List<UpdateFirewallRuleWithAccountParameters> firewallRules) {
        this.updateParameters.withFirewallRules(firewallRules);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
