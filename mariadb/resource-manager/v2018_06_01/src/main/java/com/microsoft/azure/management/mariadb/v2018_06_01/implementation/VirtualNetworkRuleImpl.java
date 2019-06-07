/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mariadb.v2018_06_01.implementation;

import com.microsoft.azure.management.mariadb.v2018_06_01.VirtualNetworkRule;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.mariadb.v2018_06_01.VirtualNetworkRuleState;

class VirtualNetworkRuleImpl extends CreatableUpdatableImpl<VirtualNetworkRule, VirtualNetworkRuleInner, VirtualNetworkRuleImpl> implements VirtualNetworkRule, VirtualNetworkRule.Definition, VirtualNetworkRule.Update {
    private final MariaDBManager manager;
    private String resourceGroupName;
    private String serverName;
    private String virtualNetworkRuleName;

    VirtualNetworkRuleImpl(String name, MariaDBManager manager) {
        super(name, new VirtualNetworkRuleInner());
        this.manager = manager;
        // Set resource name
        this.virtualNetworkRuleName = name;
        //
    }

    VirtualNetworkRuleImpl(VirtualNetworkRuleInner inner, MariaDBManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.virtualNetworkRuleName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serverName = IdParsingUtils.getValueFromIdByName(inner.id(), "servers");
        this.virtualNetworkRuleName = IdParsingUtils.getValueFromIdByName(inner.id(), "virtualNetworkRules");
        //
    }

    @Override
    public MariaDBManager manager() {
        return this.manager;
    }

    @Override
    public Observable<VirtualNetworkRule> createResourceAsync() {
        VirtualNetworkRulesInner client = this.manager().inner().virtualNetworkRules();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.virtualNetworkRuleName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<VirtualNetworkRule> updateResourceAsync() {
        VirtualNetworkRulesInner client = this.manager().inner().virtualNetworkRules();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.virtualNetworkRuleName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<VirtualNetworkRuleInner> getInnerAsync() {
        VirtualNetworkRulesInner client = this.manager().inner().virtualNetworkRules();
        return client.getAsync(this.resourceGroupName, this.serverName, this.virtualNetworkRuleName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Boolean ignoreMissingVnetServiceEndpoint() {
        return this.inner().ignoreMissingVnetServiceEndpoint();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public VirtualNetworkRuleState state() {
        return this.inner().state();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String virtualNetworkSubnetId() {
        return this.inner().virtualNetworkSubnetId();
    }

    @Override
    public VirtualNetworkRuleImpl withExistingServer(String resourceGroupName, String serverName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        return this;
    }

    @Override
    public VirtualNetworkRuleImpl withVirtualNetworkSubnetId(String virtualNetworkSubnetId) {
        this.inner().withVirtualNetworkSubnetId(virtualNetworkSubnetId);
        return this;
    }

    @Override
    public VirtualNetworkRuleImpl withIgnoreMissingVnetServiceEndpoint(Boolean ignoreMissingVnetServiceEndpoint) {
        this.inner().withIgnoreMissingVnetServiceEndpoint(ignoreMissingVnetServiceEndpoint);
        return this;
    }

}
