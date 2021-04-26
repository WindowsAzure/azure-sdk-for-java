// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.labservices.fluent.models.LabInner;
import com.azure.resourcemanager.labservices.models.AddUsersPayload;
import com.azure.resourcemanager.labservices.models.Lab;
import com.azure.resourcemanager.labservices.models.LabFragment;
import com.azure.resourcemanager.labservices.models.LabUserAccessMode;
import com.azure.resourcemanager.labservices.models.LatestOperationResult;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class LabImpl implements Lab, Lab.Definition, Lab.Update {
    private LabInner innerObject;

    private final com.azure.resourcemanager.labservices.ManagedLabsManager serviceManager;

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

    public Integer maxUsersInLab() {
        return this.innerModel().maxUsersInLab();
    }

    public Integer userQuota() {
        return this.innerModel().userQuota();
    }

    public String invitationCode() {
        return this.innerModel().invitationCode();
    }

    public String createdByObjectId() {
        return this.innerModel().createdByObjectId();
    }

    public Duration usageQuota() {
        return this.innerModel().usageQuota();
    }

    public LabUserAccessMode userAccessMode() {
        return this.innerModel().userAccessMode();
    }

    public String createdByUserPrincipalName() {
        return this.innerModel().createdByUserPrincipalName();
    }

    public OffsetDateTime createdDate() {
        return this.innerModel().createdDate();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String uniqueIdentifier() {
        return this.innerModel().uniqueIdentifier();
    }

    public LatestOperationResult latestOperationResult() {
        return this.innerModel().latestOperationResult();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public LabInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.labservices.ManagedLabsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String labAccountName;

    private String labName;

    private LabFragment updateLab;

    public LabImpl withExistingLabaccount(String resourceGroupName, String labAccountName) {
        this.resourceGroupName = resourceGroupName;
        this.labAccountName = labAccountName;
        return this;
    }

    public Lab create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLabs()
                .createOrUpdateWithResponse(resourceGroupName, labAccountName, labName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public Lab create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLabs()
                .createOrUpdateWithResponse(resourceGroupName, labAccountName, labName, this.innerModel(), context)
                .getValue();
        return this;
    }

    LabImpl(String name, com.azure.resourcemanager.labservices.ManagedLabsManager serviceManager) {
        this.innerObject = new LabInner();
        this.serviceManager = serviceManager;
        this.labName = name;
    }

    public LabImpl update() {
        this.updateLab = new LabFragment();
        return this;
    }

    public Lab apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLabs()
                .updateWithResponse(resourceGroupName, labAccountName, labName, updateLab, Context.NONE)
                .getValue();
        return this;
    }

    public Lab apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLabs()
                .updateWithResponse(resourceGroupName, labAccountName, labName, updateLab, context)
                .getValue();
        return this;
    }

    LabImpl(LabInner innerObject, com.azure.resourcemanager.labservices.ManagedLabsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.labAccountName = Utils.getValueFromIdByName(innerObject.id(), "labaccounts");
        this.labName = Utils.getValueFromIdByName(innerObject.id(), "labs");
    }

    public Lab refresh() {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLabs()
                .getWithResponse(resourceGroupName, labAccountName, labName, localExpand, Context.NONE)
                .getValue();
        return this;
    }

    public Lab refresh(Context context) {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLabs()
                .getWithResponse(resourceGroupName, labAccountName, labName, localExpand, context)
                .getValue();
        return this;
    }

    public void addUsers(AddUsersPayload addUsersPayload) {
        serviceManager.labs().addUsers(resourceGroupName, labAccountName, labName, addUsersPayload);
    }

    public Response<Void> addUsersWithResponse(AddUsersPayload addUsersPayload, Context context) {
        return serviceManager
            .labs()
            .addUsersWithResponse(resourceGroupName, labAccountName, labName, addUsersPayload, context);
    }

    public void register() {
        serviceManager.labs().register(resourceGroupName, labAccountName, labName);
    }

    public Response<Void> registerWithResponse(Context context) {
        return serviceManager.labs().registerWithResponse(resourceGroupName, labAccountName, labName, context);
    }

    public LabImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public LabImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public LabImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateLab.withTags(tags);
            return this;
        }
    }

    public LabImpl withMaxUsersInLab(Integer maxUsersInLab) {
        if (isInCreateMode()) {
            this.innerModel().withMaxUsersInLab(maxUsersInLab);
            return this;
        } else {
            this.updateLab.withMaxUsersInLab(maxUsersInLab);
            return this;
        }
    }

    public LabImpl withUsageQuota(Duration usageQuota) {
        if (isInCreateMode()) {
            this.innerModel().withUsageQuota(usageQuota);
            return this;
        } else {
            this.updateLab.withUsageQuota(usageQuota);
            return this;
        }
    }

    public LabImpl withUserAccessMode(LabUserAccessMode userAccessMode) {
        if (isInCreateMode()) {
            this.innerModel().withUserAccessMode(userAccessMode);
            return this;
        } else {
            this.updateLab.withUserAccessMode(userAccessMode);
            return this;
        }
    }

    public LabImpl withProvisioningState(String provisioningState) {
        if (isInCreateMode()) {
            this.innerModel().withProvisioningState(provisioningState);
            return this;
        } else {
            this.updateLab.withProvisioningState(provisioningState);
            return this;
        }
    }

    public LabImpl withUniqueIdentifier(String uniqueIdentifier) {
        if (isInCreateMode()) {
            this.innerModel().withUniqueIdentifier(uniqueIdentifier);
            return this;
        } else {
            this.updateLab.withUniqueIdentifier(uniqueIdentifier);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
