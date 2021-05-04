// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.powerbidedicated.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.powerbidedicated.fluent.models.DedicatedCapacityInner;
import com.azure.resourcemanager.powerbidedicated.models.CapacityProvisioningState;
import com.azure.resourcemanager.powerbidedicated.models.CapacitySku;
import com.azure.resourcemanager.powerbidedicated.models.DedicatedCapacity;
import com.azure.resourcemanager.powerbidedicated.models.DedicatedCapacityAdministrators;
import com.azure.resourcemanager.powerbidedicated.models.DedicatedCapacityUpdateParameters;
import com.azure.resourcemanager.powerbidedicated.models.Mode;
import com.azure.resourcemanager.powerbidedicated.models.State;
import java.util.Collections;
import java.util.Map;

public final class DedicatedCapacityImpl
    implements DedicatedCapacity, DedicatedCapacity.Definition, DedicatedCapacity.Update {
    private DedicatedCapacityInner innerObject;

    private final com.azure.resourcemanager.powerbidedicated.PowerBIDedicatedManager serviceManager;

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

    public CapacitySku sku() {
        return this.innerModel().sku();
    }

    public DedicatedCapacityAdministrators administration() {
        return this.innerModel().administration();
    }

    public Mode mode() {
        return this.innerModel().mode();
    }

    public State state() {
        return this.innerModel().state();
    }

    public CapacityProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public DedicatedCapacityInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.powerbidedicated.PowerBIDedicatedManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String dedicatedCapacityName;

    private DedicatedCapacityUpdateParameters updateCapacityUpdateParameters;

    public DedicatedCapacityImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public DedicatedCapacity create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCapacities()
                .create(resourceGroupName, dedicatedCapacityName, this.innerModel(), Context.NONE);
        return this;
    }

    public DedicatedCapacity create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCapacities()
                .create(resourceGroupName, dedicatedCapacityName, this.innerModel(), context);
        return this;
    }

    DedicatedCapacityImpl(
        String name, com.azure.resourcemanager.powerbidedicated.PowerBIDedicatedManager serviceManager) {
        this.innerObject = new DedicatedCapacityInner();
        this.serviceManager = serviceManager;
        this.dedicatedCapacityName = name;
    }

    public DedicatedCapacityImpl update() {
        this.updateCapacityUpdateParameters = new DedicatedCapacityUpdateParameters();
        return this;
    }

    public DedicatedCapacity apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCapacities()
                .update(resourceGroupName, dedicatedCapacityName, updateCapacityUpdateParameters, Context.NONE);
        return this;
    }

    public DedicatedCapacity apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCapacities()
                .update(resourceGroupName, dedicatedCapacityName, updateCapacityUpdateParameters, context);
        return this;
    }

    DedicatedCapacityImpl(
        DedicatedCapacityInner innerObject,
        com.azure.resourcemanager.powerbidedicated.PowerBIDedicatedManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.dedicatedCapacityName = Utils.getValueFromIdByName(innerObject.id(), "capacities");
    }

    public DedicatedCapacity refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCapacities()
                .getByResourceGroupWithResponse(resourceGroupName, dedicatedCapacityName, Context.NONE)
                .getValue();
        return this;
    }

    public DedicatedCapacity refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCapacities()
                .getByResourceGroupWithResponse(resourceGroupName, dedicatedCapacityName, context)
                .getValue();
        return this;
    }

    public void suspend() {
        serviceManager.capacities().suspend(resourceGroupName, dedicatedCapacityName);
    }

    public void suspend(Context context) {
        serviceManager.capacities().suspend(resourceGroupName, dedicatedCapacityName, context);
    }

    public void resume() {
        serviceManager.capacities().resume(resourceGroupName, dedicatedCapacityName);
    }

    public void resume(Context context) {
        serviceManager.capacities().resume(resourceGroupName, dedicatedCapacityName, context);
    }

    public DedicatedCapacityImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public DedicatedCapacityImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public DedicatedCapacityImpl withSku(CapacitySku sku) {
        if (isInCreateMode()) {
            this.innerModel().withSku(sku);
            return this;
        } else {
            this.updateCapacityUpdateParameters.withSku(sku);
            return this;
        }
    }

    public DedicatedCapacityImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateCapacityUpdateParameters.withTags(tags);
            return this;
        }
    }

    public DedicatedCapacityImpl withAdministration(DedicatedCapacityAdministrators administration) {
        if (isInCreateMode()) {
            this.innerModel().withAdministration(administration);
            return this;
        } else {
            this.updateCapacityUpdateParameters.withAdministration(administration);
            return this;
        }
    }

    public DedicatedCapacityImpl withMode(Mode mode) {
        if (isInCreateMode()) {
            this.innerModel().withMode(mode);
            return this;
        } else {
            this.updateCapacityUpdateParameters.withMode(mode);
            return this;
        }
    }

    public DedicatedCapacityImpl withSystemData(SystemData systemData) {
        this.innerModel().withSystemData(systemData);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
