// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.automation.fluent.models.SourceControlInner;
import com.azure.resourcemanager.automation.models.SourceControl;
import com.azure.resourcemanager.automation.models.SourceControlCreateOrUpdateParameters;
import com.azure.resourcemanager.automation.models.SourceControlSecurityTokenProperties;
import com.azure.resourcemanager.automation.models.SourceControlUpdateParameters;
import com.azure.resourcemanager.automation.models.SourceType;
import java.time.OffsetDateTime;

public final class SourceControlImpl implements SourceControl, SourceControl.Definition, SourceControl.Update {
    private SourceControlInner innerObject;

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

    public String repoUrl() {
        return this.innerModel().repoUrl();
    }

    public String branch() {
        return this.innerModel().branch();
    }

    public String folderPath() {
        return this.innerModel().folderPath();
    }

    public Boolean autoSync() {
        return this.innerModel().autoSync();
    }

    public Boolean publishRunbook() {
        return this.innerModel().publishRunbook();
    }

    public SourceType sourceType() {
        return this.innerModel().sourceType();
    }

    public String description() {
        return this.innerModel().description();
    }

    public OffsetDateTime creationTime() {
        return this.innerModel().creationTime();
    }

    public OffsetDateTime lastModifiedTime() {
        return this.innerModel().lastModifiedTime();
    }

    public SourceControlInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.automation.AutomationManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String automationAccountName;

    private String sourceControlName;

    private SourceControlCreateOrUpdateParameters createParameters;

    private SourceControlUpdateParameters updateParameters;

    public SourceControlImpl withExistingAutomationAccount(String resourceGroupName, String automationAccountName) {
        this.resourceGroupName = resourceGroupName;
        this.automationAccountName = automationAccountName;
        return this;
    }

    public SourceControl create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSourceControls()
                .createOrUpdateWithResponse(
                    resourceGroupName, automationAccountName, sourceControlName, createParameters, Context.NONE)
                .getValue();
        return this;
    }

    public SourceControl create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSourceControls()
                .createOrUpdateWithResponse(
                    resourceGroupName, automationAccountName, sourceControlName, createParameters, context)
                .getValue();
        return this;
    }

    SourceControlImpl(String name, com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerObject = new SourceControlInner();
        this.serviceManager = serviceManager;
        this.sourceControlName = name;
        this.createParameters = new SourceControlCreateOrUpdateParameters();
    }

    public SourceControlImpl update() {
        this.updateParameters = new SourceControlUpdateParameters();
        return this;
    }

    public SourceControl apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSourceControls()
                .updateWithResponse(
                    resourceGroupName, automationAccountName, sourceControlName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public SourceControl apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSourceControls()
                .updateWithResponse(
                    resourceGroupName, automationAccountName, sourceControlName, updateParameters, context)
                .getValue();
        return this;
    }

    SourceControlImpl(
        SourceControlInner innerObject, com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.automationAccountName = Utils.getValueFromIdByName(innerObject.id(), "automationAccounts");
        this.sourceControlName = Utils.getValueFromIdByName(innerObject.id(), "sourceControls");
    }

    public SourceControl refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSourceControls()
                .getWithResponse(resourceGroupName, automationAccountName, sourceControlName, Context.NONE)
                .getValue();
        return this;
    }

    public SourceControl refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSourceControls()
                .getWithResponse(resourceGroupName, automationAccountName, sourceControlName, context)
                .getValue();
        return this;
    }

    public SourceControlImpl withRepoUrl(String repoUrl) {
        this.createParameters.withRepoUrl(repoUrl);
        return this;
    }

    public SourceControlImpl withBranch(String branch) {
        if (isInCreateMode()) {
            this.createParameters.withBranch(branch);
            return this;
        } else {
            this.updateParameters.withBranch(branch);
            return this;
        }
    }

    public SourceControlImpl withFolderPath(String folderPath) {
        if (isInCreateMode()) {
            this.createParameters.withFolderPath(folderPath);
            return this;
        } else {
            this.updateParameters.withFolderPath(folderPath);
            return this;
        }
    }

    public SourceControlImpl withAutoSync(Boolean autoSync) {
        if (isInCreateMode()) {
            this.createParameters.withAutoSync(autoSync);
            return this;
        } else {
            this.updateParameters.withAutoSync(autoSync);
            return this;
        }
    }

    public SourceControlImpl withPublishRunbook(Boolean publishRunbook) {
        if (isInCreateMode()) {
            this.createParameters.withPublishRunbook(publishRunbook);
            return this;
        } else {
            this.updateParameters.withPublishRunbook(publishRunbook);
            return this;
        }
    }

    public SourceControlImpl withSourceType(SourceType sourceType) {
        this.createParameters.withSourceType(sourceType);
        return this;
    }

    public SourceControlImpl withSecurityToken(SourceControlSecurityTokenProperties securityToken) {
        if (isInCreateMode()) {
            this.createParameters.withSecurityToken(securityToken);
            return this;
        } else {
            this.updateParameters.withSecurityToken(securityToken);
            return this;
        }
    }

    public SourceControlImpl withDescription(String description) {
        if (isInCreateMode()) {
            this.createParameters.withDescription(description);
            return this;
        } else {
            this.updateParameters.withDescription(description);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
