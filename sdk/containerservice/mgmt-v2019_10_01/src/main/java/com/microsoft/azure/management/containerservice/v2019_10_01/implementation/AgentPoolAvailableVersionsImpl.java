/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2019_10_01.implementation;

import com.microsoft.azure.management.containerservice.v2019_10_01.AgentPoolAvailableVersions;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.containerservice.v2019_10_01.AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem;

class AgentPoolAvailableVersionsImpl extends WrapperImpl<AgentPoolAvailableVersionsInner> implements AgentPoolAvailableVersions {
    private final ContainerServiceManager manager;
    AgentPoolAvailableVersionsImpl(AgentPoolAvailableVersionsInner inner, ContainerServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ContainerServiceManager manager() {
        return this.manager;
    }

    @Override
    public List<AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem> agentPoolVersions() {
        return this.inner().agentPoolVersions();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
