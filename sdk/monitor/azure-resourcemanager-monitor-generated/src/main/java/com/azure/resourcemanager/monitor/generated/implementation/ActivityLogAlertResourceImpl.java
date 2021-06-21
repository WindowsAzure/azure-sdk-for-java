// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.generated.fluent.models.ActivityLogAlertResourceInner;
import com.azure.resourcemanager.monitor.generated.models.ActivityLogAlertActionList;
import com.azure.resourcemanager.monitor.generated.models.ActivityLogAlertAllOfCondition;
import com.azure.resourcemanager.monitor.generated.models.ActivityLogAlertPatchBody;
import com.azure.resourcemanager.monitor.generated.models.ActivityLogAlertResource;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ActivityLogAlertResourceImpl
    implements ActivityLogAlertResource, ActivityLogAlertResource.Definition, ActivityLogAlertResource.Update {
    private ActivityLogAlertResourceInner innerObject;

    private final com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager;

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

    public List<String> scopes() {
        List<String> inner = this.innerModel().scopes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean enabled() {
        return this.innerModel().enabled();
    }

    public ActivityLogAlertAllOfCondition condition() {
        return this.innerModel().condition();
    }

    public ActivityLogAlertActionList actions() {
        return this.innerModel().actions();
    }

    public String description() {
        return this.innerModel().description();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public ActivityLogAlertResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.monitor.generated.MonitorManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String activityLogAlertName;

    private ActivityLogAlertPatchBody updateActivityLogAlertPatch;

    public ActivityLogAlertResourceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public ActivityLogAlertResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getActivityLogAlerts()
                .createOrUpdateWithResponse(resourceGroupName, activityLogAlertName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ActivityLogAlertResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getActivityLogAlerts()
                .createOrUpdateWithResponse(resourceGroupName, activityLogAlertName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ActivityLogAlertResourceImpl(
        String name, com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager) {
        this.innerObject = new ActivityLogAlertResourceInner();
        this.serviceManager = serviceManager;
        this.activityLogAlertName = name;
    }

    public ActivityLogAlertResourceImpl update() {
        this.updateActivityLogAlertPatch = new ActivityLogAlertPatchBody();
        return this;
    }

    public ActivityLogAlertResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getActivityLogAlerts()
                .updateWithResponse(resourceGroupName, activityLogAlertName, updateActivityLogAlertPatch, Context.NONE)
                .getValue();
        return this;
    }

    public ActivityLogAlertResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getActivityLogAlerts()
                .updateWithResponse(resourceGroupName, activityLogAlertName, updateActivityLogAlertPatch, context)
                .getValue();
        return this;
    }

    ActivityLogAlertResourceImpl(
        ActivityLogAlertResourceInner innerObject,
        com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.activityLogAlertName = Utils.getValueFromIdByName(innerObject.id(), "activityLogAlerts");
    }

    public ActivityLogAlertResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getActivityLogAlerts()
                .getByResourceGroupWithResponse(resourceGroupName, activityLogAlertName, Context.NONE)
                .getValue();
        return this;
    }

    public ActivityLogAlertResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getActivityLogAlerts()
                .getByResourceGroupWithResponse(resourceGroupName, activityLogAlertName, context)
                .getValue();
        return this;
    }

    public ActivityLogAlertResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ActivityLogAlertResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ActivityLogAlertResourceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateActivityLogAlertPatch.withTags(tags);
            return this;
        }
    }

    public ActivityLogAlertResourceImpl withScopes(List<String> scopes) {
        this.innerModel().withScopes(scopes);
        return this;
    }

    public ActivityLogAlertResourceImpl withEnabled(Boolean enabled) {
        if (isInCreateMode()) {
            this.innerModel().withEnabled(enabled);
            return this;
        } else {
            this.updateActivityLogAlertPatch.withEnabled(enabled);
            return this;
        }
    }

    public ActivityLogAlertResourceImpl withCondition(ActivityLogAlertAllOfCondition condition) {
        this.innerModel().withCondition(condition);
        return this;
    }

    public ActivityLogAlertResourceImpl withActions(ActivityLogAlertActionList actions) {
        this.innerModel().withActions(actions);
        return this;
    }

    public ActivityLogAlertResourceImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
