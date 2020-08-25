/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_02_01.implementation;

import com.microsoft.azure.management.netapp.v2020_02_01.BackupPolicy;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.netapp.v2020_02_01.BackupPolicyPatch;
import java.util.List;
import com.microsoft.azure.management.netapp.v2020_02_01.VolumeBackups;
import java.util.Map;
import rx.functions.Func1;

class BackupPolicyImpl extends CreatableUpdatableImpl<BackupPolicy, BackupPolicyInner, BackupPolicyImpl> implements BackupPolicy, BackupPolicy.Definition, BackupPolicy.Update {
    private final NetAppManager manager;
    private String resourceGroupName;
    private String accountName;
    private String backupPolicyName;
    private BackupPolicyPatch updateParameter;

    BackupPolicyImpl(String name, NetAppManager manager) {
        super(name, new BackupPolicyInner());
        this.manager = manager;
        // Set resource name
        this.backupPolicyName = name;
        //
        this.updateParameter = new BackupPolicyPatch();
    }

    BackupPolicyImpl(BackupPolicyInner inner, NetAppManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.backupPolicyName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "netAppAccounts");
        this.backupPolicyName = IdParsingUtils.getValueFromIdByName(inner.id(), "backupPolicies");
        //
        this.updateParameter = new BackupPolicyPatch();
    }

    @Override
    public NetAppManager manager() {
        return this.manager;
    }

    @Override
    public Observable<BackupPolicy> createResourceAsync() {
        BackupPoliciesInner client = this.manager().inner().backupPolicies();
        return client.createAsync(this.resourceGroupName, this.accountName, this.backupPolicyName, this.inner())
            .map(new Func1<BackupPolicyInner, BackupPolicyInner>() {
               @Override
               public BackupPolicyInner call(BackupPolicyInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<BackupPolicy> updateResourceAsync() {
        BackupPoliciesInner client = this.manager().inner().backupPolicies();
        return client.updateAsync(this.resourceGroupName, this.accountName, this.backupPolicyName, this.updateParameter)
            .map(new Func1<BackupPolicyInner, BackupPolicyInner>() {
               @Override
               public BackupPolicyInner call(BackupPolicyInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<BackupPolicyInner> getInnerAsync() {
        BackupPoliciesInner client = this.manager().inner().backupPolicies();
        return client.getAsync(this.resourceGroupName, this.accountName, this.backupPolicyName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new BackupPolicyPatch();
    }

    @Override
    public Integer dailyBackupsToKeep() {
        return this.inner().dailyBackupsToKeep();
    }

    @Override
    public Boolean enabled() {
        return this.inner().enabled();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public Integer monthlyBackupsToKeep() {
        return this.inner().monthlyBackupsToKeep();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String name1() {
        return this.inner().name1();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public List<VolumeBackups> volumeBackups() {
        return this.inner().volumeBackups();
    }

    @Override
    public Integer volumesAssigned() {
        return this.inner().volumesAssigned();
    }

    @Override
    public Integer weeklyBackupsToKeep() {
        return this.inner().weeklyBackupsToKeep();
    }

    @Override
    public Integer yearlyBackupsToKeep() {
        return this.inner().yearlyBackupsToKeep();
    }

    @Override
    public BackupPolicyImpl withExistingNetAppAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    @Override
    public BackupPolicyImpl withTags(Map<String, String> tags) {
        this.inner().withTags(tags);
        return this;
    }

    @Override
    public BackupPolicyImpl withLocation(String location) {
        if (isInCreateMode()) {
            this.inner().withLocation(location);
        } else {
            this.updateParameter.withLocation(location);
        }
        return this;
    }

    @Override
    public BackupPolicyImpl withDailyBackupsToKeep(Integer dailyBackupsToKeep) {
        if (isInCreateMode()) {
            this.inner().withDailyBackupsToKeep(dailyBackupsToKeep);
        } else {
            this.updateParameter.withDailyBackupsToKeep(dailyBackupsToKeep);
        }
        return this;
    }

    @Override
    public BackupPolicyImpl withEnabled(Boolean enabled) {
        if (isInCreateMode()) {
            this.inner().withEnabled(enabled);
        } else {
            this.updateParameter.withEnabled(enabled);
        }
        return this;
    }

    @Override
    public BackupPolicyImpl withMonthlyBackupsToKeep(Integer monthlyBackupsToKeep) {
        if (isInCreateMode()) {
            this.inner().withMonthlyBackupsToKeep(monthlyBackupsToKeep);
        } else {
            this.updateParameter.withMonthlyBackupsToKeep(monthlyBackupsToKeep);
        }
        return this;
    }

    @Override
    public BackupPolicyImpl withVolumeBackups(List<VolumeBackups> volumeBackups) {
        if (isInCreateMode()) {
            this.inner().withVolumeBackups(volumeBackups);
        } else {
            this.updateParameter.withVolumeBackups(volumeBackups);
        }
        return this;
    }

    @Override
    public BackupPolicyImpl withVolumesAssigned(Integer volumesAssigned) {
        if (isInCreateMode()) {
            this.inner().withVolumesAssigned(volumesAssigned);
        } else {
            this.updateParameter.withVolumesAssigned(volumesAssigned);
        }
        return this;
    }

    @Override
    public BackupPolicyImpl withWeeklyBackupsToKeep(Integer weeklyBackupsToKeep) {
        if (isInCreateMode()) {
            this.inner().withWeeklyBackupsToKeep(weeklyBackupsToKeep);
        } else {
            this.updateParameter.withWeeklyBackupsToKeep(weeklyBackupsToKeep);
        }
        return this;
    }

    @Override
    public BackupPolicyImpl withYearlyBackupsToKeep(Integer yearlyBackupsToKeep) {
        if (isInCreateMode()) {
            this.inner().withYearlyBackupsToKeep(yearlyBackupsToKeep);
        } else {
            this.updateParameter.withYearlyBackupsToKeep(yearlyBackupsToKeep);
        }
        return this;
    }

}
