// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.ComputeManager;
import com.azure.resourcemanager.compute.generated.fluent.VirtualMachineScaleSetRollingUpgradesClient;
import com.azure.resourcemanager.compute.generated.fluent.models.RollingUpgradeStatusInfoInner;
import com.azure.resourcemanager.compute.generated.models.RollingUpgradeStatusInfo;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetRollingUpgrades;

public final class VirtualMachineScaleSetRollingUpgradesImpl implements VirtualMachineScaleSetRollingUpgrades {
    private final VirtualMachineScaleSetRollingUpgradesClient innerClient;

    private final ComputeManager serviceManager;

    public VirtualMachineScaleSetRollingUpgradesImpl(
        VirtualMachineScaleSetRollingUpgradesClient innerClient, ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void cancel(String resourceGroupName, String vmScaleSetName) {
        this.serviceClient().cancel(resourceGroupName, vmScaleSetName);
    }

    public void cancel(String resourceGroupName, String vmScaleSetName, Context context) {
        this.serviceClient().cancel(resourceGroupName, vmScaleSetName, context);
    }

    public void startOSUpgrade(String resourceGroupName, String vmScaleSetName) {
        this.serviceClient().startOSUpgrade(resourceGroupName, vmScaleSetName);
    }

    public void startOSUpgrade(String resourceGroupName, String vmScaleSetName, Context context) {
        this.serviceClient().startOSUpgrade(resourceGroupName, vmScaleSetName, context);
    }

    public void startExtensionUpgrade(String resourceGroupName, String vmScaleSetName) {
        this.serviceClient().startExtensionUpgrade(resourceGroupName, vmScaleSetName);
    }

    public void startExtensionUpgrade(String resourceGroupName, String vmScaleSetName, Context context) {
        this.serviceClient().startExtensionUpgrade(resourceGroupName, vmScaleSetName, context);
    }

    public RollingUpgradeStatusInfo getLatest(String resourceGroupName, String vmScaleSetName) {
        RollingUpgradeStatusInfoInner inner = this.serviceClient().getLatest(resourceGroupName, vmScaleSetName);
        if (inner != null) {
            return new RollingUpgradeStatusInfoImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RollingUpgradeStatusInfo> getLatestWithResponse(
        String resourceGroupName, String vmScaleSetName, Context context) {
        Response<RollingUpgradeStatusInfoInner> inner =
            this.serviceClient().getLatestWithResponse(resourceGroupName, vmScaleSetName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RollingUpgradeStatusInfoImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private VirtualMachineScaleSetRollingUpgradesClient serviceClient() {
        return this.innerClient;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }
}
