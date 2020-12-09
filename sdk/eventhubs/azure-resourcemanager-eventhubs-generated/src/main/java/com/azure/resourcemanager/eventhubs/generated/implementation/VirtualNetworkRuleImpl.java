// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.eventhubs.generated.EventHubsManager;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.VirtualNetworkRuleInner;
import com.azure.resourcemanager.eventhubs.generated.models.VirtualNetworkRule;

public final class VirtualNetworkRuleImpl
    implements VirtualNetworkRule, VirtualNetworkRule.Definition, VirtualNetworkRule.Update {
    private VirtualNetworkRuleInner innerObject;

    private final EventHubsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String virtualNetworkSubnetId() {
        return this.innerModel().virtualNetworkSubnetId();
    }

    public VirtualNetworkRuleInner innerModel() {
        return this.innerObject;
    }

    private EventHubsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String namespaceName;

    private String virtualNetworkRuleName;

    public VirtualNetworkRuleImpl withExistingNamespace(String resourceGroupName, String namespaceName) {
        this.resourceGroupName = resourceGroupName;
        this.namespaceName = namespaceName;
        return this;
    }

    public VirtualNetworkRule create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamespaces()
                .createOrUpdateVirtualNetworkRuleWithResponse(
                    resourceGroupName, namespaceName, virtualNetworkRuleName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public VirtualNetworkRule create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamespaces()
                .createOrUpdateVirtualNetworkRuleWithResponse(
                    resourceGroupName, namespaceName, virtualNetworkRuleName, this.innerModel(), context)
                .getValue();
        return this;
    }

    public VirtualNetworkRuleImpl(String name, EventHubsManager serviceManager) {
        this.innerObject = new VirtualNetworkRuleInner();
        this.serviceManager = serviceManager;
        this.virtualNetworkRuleName = name;
    }

    public VirtualNetworkRuleImpl update() {
        return this;
    }

    public VirtualNetworkRule apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamespaces()
                .createOrUpdateVirtualNetworkRuleWithResponse(
                    resourceGroupName, namespaceName, virtualNetworkRuleName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public VirtualNetworkRule apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamespaces()
                .createOrUpdateVirtualNetworkRuleWithResponse(
                    resourceGroupName, namespaceName, virtualNetworkRuleName, this.innerModel(), context)
                .getValue();
        return this;
    }

    public VirtualNetworkRuleImpl(VirtualNetworkRuleInner innerObject, EventHubsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.namespaceName = Utils.getValueFromIdByName(innerObject.id(), "namespaces");
        this.virtualNetworkRuleName = Utils.getValueFromIdByName(innerObject.id(), "virtualnetworkrules");
    }

    public VirtualNetworkRule refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamespaces()
                .getVirtualNetworkRuleWithResponse(
                    resourceGroupName, namespaceName, virtualNetworkRuleName, Context.NONE)
                .getValue();
        return this;
    }

    public VirtualNetworkRule refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamespaces()
                .getVirtualNetworkRuleWithResponse(resourceGroupName, namespaceName, virtualNetworkRuleName, context)
                .getValue();
        return this;
    }

    public VirtualNetworkRuleImpl withVirtualNetworkSubnetId(String virtualNetworkSubnetId) {
        this.innerModel().withVirtualNetworkSubnetId(virtualNetworkSubnetId);
        return this;
    }
}
