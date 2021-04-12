// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.automation.fluent.models.AutomationAccountInner;
import com.azure.resourcemanager.automation.models.AutomationAccount;
import com.azure.resourcemanager.automation.models.AutomationAccountCreateOrUpdateParameters;
import com.azure.resourcemanager.automation.models.AutomationAccountState;
import com.azure.resourcemanager.automation.models.AutomationAccountUpdateParameters;
import com.azure.resourcemanager.automation.models.Sku;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class AutomationAccountImpl
    implements AutomationAccount, AutomationAccount.Definition, AutomationAccount.Update {
    private AutomationAccountInner innerObject;

    private final com.azure.resourcemanager.automation.AutomationManager serviceManager;

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

    public String etag() {
        return this.innerModel().etag();
    }

    public Sku sku() {
        return this.innerModel().sku();
    }

    public String lastModifiedBy() {
        return this.innerModel().lastModifiedBy();
    }

    public AutomationAccountState state() {
        return this.innerModel().state();
    }

    public OffsetDateTime creationTime() {
        return this.innerModel().creationTime();
    }

    public OffsetDateTime lastModifiedTime() {
        return this.innerModel().lastModifiedTime();
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

    public AutomationAccountInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.automation.AutomationManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String automationAccountName;

    private AutomationAccountCreateOrUpdateParameters createParameters;

    private AutomationAccountUpdateParameters updateParameters;

    public AutomationAccountImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public AutomationAccount create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAutomationAccounts()
                .createOrUpdateWithResponse(resourceGroupName, automationAccountName, createParameters, Context.NONE)
                .getValue();
        return this;
    }

    public AutomationAccount create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAutomationAccounts()
                .createOrUpdateWithResponse(resourceGroupName, automationAccountName, createParameters, context)
                .getValue();
        return this;
    }

    AutomationAccountImpl(String name, com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerObject = new AutomationAccountInner();
        this.serviceManager = serviceManager;
        this.automationAccountName = name;
        this.createParameters = new AutomationAccountCreateOrUpdateParameters();
    }

    public AutomationAccountImpl update() {
        this.updateParameters = new AutomationAccountUpdateParameters();
        return this;
    }

    public AutomationAccount apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAutomationAccounts()
                .updateWithResponse(resourceGroupName, automationAccountName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public AutomationAccount apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAutomationAccounts()
                .updateWithResponse(resourceGroupName, automationAccountName, updateParameters, context)
                .getValue();
        return this;
    }

    AutomationAccountImpl(
        AutomationAccountInner innerObject, com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.automationAccountName = Utils.getValueFromIdByName(innerObject.id(), "automationAccounts");
    }

    public AutomationAccount refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAutomationAccounts()
                .getByResourceGroupWithResponse(resourceGroupName, automationAccountName, Context.NONE)
                .getValue();
        return this;
    }

    public AutomationAccount refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAutomationAccounts()
                .getByResourceGroupWithResponse(resourceGroupName, automationAccountName, context)
                .getValue();
        return this;
    }

    public AutomationAccountImpl withRegion(Region location) {
        this.createParameters.withLocation(location.toString());
        return this;
    }

    public AutomationAccountImpl withRegion(String location) {
        this.createParameters.withLocation(location);
        return this;
    }

    public AutomationAccountImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.createParameters.withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public AutomationAccountImpl withName(String name) {
        if (isInCreateMode()) {
            this.createParameters.withName(name);
            return this;
        } else {
            this.updateParameters.withName(name);
            return this;
        }
    }

    public AutomationAccountImpl withSku(Sku sku) {
        if (isInCreateMode()) {
            this.createParameters.withSku(sku);
            return this;
        } else {
            this.updateParameters.withSku(sku);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
