// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.SynapseManager;
import com.azure.resourcemanager.synapse.fluent.models.IpFirewallRuleInfoInner;
import com.azure.resourcemanager.synapse.models.IpFirewallRuleInfo;
import com.azure.resourcemanager.synapse.models.ProvisioningState;

public final class IpFirewallRuleInfoImpl
    implements IpFirewallRuleInfo, IpFirewallRuleInfo.Definition, IpFirewallRuleInfo.Update {
    private IpFirewallRuleInfoInner innerObject;

    private final SynapseManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String endIpAddress() {
        return this.innerModel().endIpAddress();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String startIpAddress() {
        return this.innerModel().startIpAddress();
    }

    public IpFirewallRuleInfoInner innerModel() {
        return this.innerObject;
    }

    private SynapseManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private String ruleName;

    public IpFirewallRuleInfoImpl withExistingWorkspace(String resourceGroupName, String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        return this;
    }

    public IpFirewallRuleInfo create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIpFirewallRules()
                .createOrUpdate(resourceGroupName, workspaceName, ruleName, this.innerModel(), Context.NONE);
        return this;
    }

    public IpFirewallRuleInfo create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIpFirewallRules()
                .createOrUpdate(resourceGroupName, workspaceName, ruleName, this.innerModel(), context);
        return this;
    }

    public IpFirewallRuleInfoImpl(String name, SynapseManager serviceManager) {
        this.innerObject = new IpFirewallRuleInfoInner();
        this.serviceManager = serviceManager;
        this.ruleName = name;
    }

    public IpFirewallRuleInfoImpl update() {
        return this;
    }

    public IpFirewallRuleInfo apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIpFirewallRules()
                .createOrUpdate(resourceGroupName, workspaceName, ruleName, this.innerModel(), Context.NONE);
        return this;
    }

    public IpFirewallRuleInfo apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIpFirewallRules()
                .createOrUpdate(resourceGroupName, workspaceName, ruleName, this.innerModel(), context);
        return this;
    }

    public IpFirewallRuleInfoImpl(IpFirewallRuleInfoInner innerObject, SynapseManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.ruleName = Utils.getValueFromIdByName(innerObject.id(), "firewallRules");
    }

    public IpFirewallRuleInfo refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIpFirewallRules()
                .getWithResponse(resourceGroupName, workspaceName, ruleName, Context.NONE)
                .getValue();
        return this;
    }

    public IpFirewallRuleInfo refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIpFirewallRules()
                .getWithResponse(resourceGroupName, workspaceName, ruleName, context)
                .getValue();
        return this;
    }

    public IpFirewallRuleInfoImpl withEndIpAddress(String endIpAddress) {
        this.innerModel().withEndIpAddress(endIpAddress);
        return this;
    }

    public IpFirewallRuleInfoImpl withStartIpAddress(String startIpAddress) {
        this.innerModel().withStartIpAddress(startIpAddress);
        return this;
    }
}
