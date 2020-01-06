/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2019_11_01.implementation;

import com.microsoft.azure.management.containerservice.v2019_11_01.AgentPoolUpgradeProfile;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.containerservice.v2019_11_01.OSType;
import java.util.List;
import com.microsoft.azure.management.containerservice.v2019_11_01.AgentPoolUpgradeProfilePropertiesUpgradesItem;

class AgentPoolUpgradeProfileImpl extends WrapperImpl<AgentPoolUpgradeProfileInner> implements AgentPoolUpgradeProfile {
    private final ContainerServiceManager manager;
    AgentPoolUpgradeProfileImpl(AgentPoolUpgradeProfileInner inner, ContainerServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ContainerServiceManager manager() {
        return this.manager;
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String kubernetesVersion() {
        return this.inner().kubernetesVersion();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public OSType osType() {
        return this.inner().osType();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public List<AgentPoolUpgradeProfilePropertiesUpgradesItem> upgrades() {
        return this.inner().upgrades();
    }

}
