// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.netapp.NetAppFilesManager;
import com.azure.resourcemanager.netapp.fluent.models.BackupPolicyInner;
import com.azure.resourcemanager.netapp.models.BackupPolicy;
import com.azure.resourcemanager.netapp.models.BackupPolicyPatch;
import com.azure.resourcemanager.netapp.models.VolumeBackups;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class BackupPolicyImpl implements BackupPolicy, BackupPolicy.Definition, BackupPolicy.Update {
    private BackupPolicyInner innerObject;

    private final NetAppFilesManager serviceManager;

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

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Integer dailyBackupsToKeep() {
        return this.innerModel().dailyBackupsToKeep();
    }

    public Integer weeklyBackupsToKeep() {
        return this.innerModel().weeklyBackupsToKeep();
    }

    public Integer monthlyBackupsToKeep() {
        return this.innerModel().monthlyBackupsToKeep();
    }

    public Integer yearlyBackupsToKeep() {
        return this.innerModel().yearlyBackupsToKeep();
    }

    public Integer volumesAssigned() {
        return this.innerModel().volumesAssigned();
    }

    public Boolean enabled() {
        return this.innerModel().enabled();
    }

    public List<VolumeBackups> volumeBackups() {
        List<VolumeBackups> inner = this.innerModel().volumeBackups();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public BackupPolicyInner innerModel() {
        return this.innerObject;
    }

    private NetAppFilesManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String backupPolicyName;

    private BackupPolicyPatch updateBody;

    public BackupPolicyImpl withExistingNetAppAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public BackupPolicy create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBackupPolicies()
                .create(resourceGroupName, accountName, backupPolicyName, this.innerModel(), Context.NONE);
        return this;
    }

    public BackupPolicy create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBackupPolicies()
                .create(resourceGroupName, accountName, backupPolicyName, this.innerModel(), context);
        return this;
    }

    BackupPolicyImpl(String name, NetAppFilesManager serviceManager) {
        this.innerObject = new BackupPolicyInner();
        this.serviceManager = serviceManager;
        this.backupPolicyName = name;
    }

    public BackupPolicyImpl update() {
        this.updateBody = new BackupPolicyPatch();
        return this;
    }

    public BackupPolicy apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBackupPolicies()
                .updateWithResponse(resourceGroupName, accountName, backupPolicyName, updateBody, Context.NONE)
                .getValue();
        return this;
    }

    public BackupPolicy apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBackupPolicies()
                .updateWithResponse(resourceGroupName, accountName, backupPolicyName, updateBody, context)
                .getValue();
        return this;
    }

    BackupPolicyImpl(BackupPolicyInner innerObject, NetAppFilesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "netAppAccounts");
        this.backupPolicyName = Utils.getValueFromIdByName(innerObject.id(), "backupPolicies");
    }

    public BackupPolicy refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBackupPolicies()
                .getWithResponse(resourceGroupName, accountName, backupPolicyName, Context.NONE)
                .getValue();
        return this;
    }

    public BackupPolicy refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBackupPolicies()
                .getWithResponse(resourceGroupName, accountName, backupPolicyName, context)
                .getValue();
        return this;
    }

    public BackupPolicyImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public BackupPolicyImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public BackupPolicyImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateBody.withTags(tags);
            return this;
        }
    }

    public BackupPolicyImpl withDailyBackupsToKeep(Integer dailyBackupsToKeep) {
        if (isInCreateMode()) {
            this.innerModel().withDailyBackupsToKeep(dailyBackupsToKeep);
            return this;
        } else {
            this.updateBody.withDailyBackupsToKeep(dailyBackupsToKeep);
            return this;
        }
    }

    public BackupPolicyImpl withWeeklyBackupsToKeep(Integer weeklyBackupsToKeep) {
        if (isInCreateMode()) {
            this.innerModel().withWeeklyBackupsToKeep(weeklyBackupsToKeep);
            return this;
        } else {
            this.updateBody.withWeeklyBackupsToKeep(weeklyBackupsToKeep);
            return this;
        }
    }

    public BackupPolicyImpl withMonthlyBackupsToKeep(Integer monthlyBackupsToKeep) {
        if (isInCreateMode()) {
            this.innerModel().withMonthlyBackupsToKeep(monthlyBackupsToKeep);
            return this;
        } else {
            this.updateBody.withMonthlyBackupsToKeep(monthlyBackupsToKeep);
            return this;
        }
    }

    public BackupPolicyImpl withYearlyBackupsToKeep(Integer yearlyBackupsToKeep) {
        if (isInCreateMode()) {
            this.innerModel().withYearlyBackupsToKeep(yearlyBackupsToKeep);
            return this;
        } else {
            this.updateBody.withYearlyBackupsToKeep(yearlyBackupsToKeep);
            return this;
        }
    }

    public BackupPolicyImpl withVolumesAssigned(Integer volumesAssigned) {
        if (isInCreateMode()) {
            this.innerModel().withVolumesAssigned(volumesAssigned);
            return this;
        } else {
            this.updateBody.withVolumesAssigned(volumesAssigned);
            return this;
        }
    }

    public BackupPolicyImpl withEnabled(Boolean enabled) {
        if (isInCreateMode()) {
            this.innerModel().withEnabled(enabled);
            return this;
        } else {
            this.updateBody.withEnabled(enabled);
            return this;
        }
    }

    public BackupPolicyImpl withVolumeBackups(List<VolumeBackups> volumeBackups) {
        if (isInCreateMode()) {
            this.innerModel().withVolumeBackups(volumeBackups);
            return this;
        } else {
            this.updateBody.withVolumeBackups(volumeBackups);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
