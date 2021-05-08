// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.datalakeanalytics.fluent.models.FirewallRuleInner;
import com.azure.resourcemanager.datalakeanalytics.models.CreateOrUpdateFirewallRuleParameters;
import com.azure.resourcemanager.datalakeanalytics.models.FirewallRule;
import com.azure.resourcemanager.datalakeanalytics.models.UpdateFirewallRuleParameters;

public final class FirewallRuleImpl implements FirewallRule, FirewallRule.Definition, FirewallRule.Update {
    private FirewallRuleInner innerObject;

    private final com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String startIpAddress() {
        return this.innerModel().startIpAddress();
    }

    public String endIpAddress() {
        return this.innerModel().endIpAddress();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public FirewallRuleInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String firewallRuleName;

    private CreateOrUpdateFirewallRuleParameters createParameters;

    private UpdateFirewallRuleParameters updateParameters;

    public FirewallRuleImpl withExistingAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public FirewallRule create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFirewallRules()
                .createOrUpdateWithResponse(
                    resourceGroupName, accountName, firewallRuleName, createParameters, Context.NONE)
                .getValue();
        return this;
    }

    public FirewallRule create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFirewallRules()
                .createOrUpdateWithResponse(resourceGroupName, accountName, firewallRuleName, createParameters, context)
                .getValue();
        return this;
    }

    FirewallRuleImpl(String name, com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager serviceManager) {
        this.innerObject = new FirewallRuleInner();
        this.serviceManager = serviceManager;
        this.firewallRuleName = name;
        this.createParameters = new CreateOrUpdateFirewallRuleParameters();
    }

    public FirewallRuleImpl update() {
        this.updateParameters = new UpdateFirewallRuleParameters();
        return this;
    }

    public FirewallRule apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFirewallRules()
                .updateWithResponse(resourceGroupName, accountName, firewallRuleName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public FirewallRule apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFirewallRules()
                .updateWithResponse(resourceGroupName, accountName, firewallRuleName, updateParameters, context)
                .getValue();
        return this;
    }

    FirewallRuleImpl(
        FirewallRuleInner innerObject,
        com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "accounts");
        this.firewallRuleName = Utils.getValueFromIdByName(innerObject.id(), "firewallRules");
    }

    public FirewallRule refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFirewallRules()
                .getWithResponse(resourceGroupName, accountName, firewallRuleName, Context.NONE)
                .getValue();
        return this;
    }

    public FirewallRule refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFirewallRules()
                .getWithResponse(resourceGroupName, accountName, firewallRuleName, context)
                .getValue();
        return this;
    }

    public FirewallRuleImpl withStartIpAddress(String startIpAddress) {
        if (isInCreateMode()) {
            this.createParameters.withStartIpAddress(startIpAddress);
            return this;
        } else {
            this.updateParameters.withStartIpAddress(startIpAddress);
            return this;
        }
    }

    public FirewallRuleImpl withEndIpAddress(String endIpAddress) {
        if (isInCreateMode()) {
            this.createParameters.withEndIpAddress(endIpAddress);
            return this;
        } else {
            this.updateParameters.withEndIpAddress(endIpAddress);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
