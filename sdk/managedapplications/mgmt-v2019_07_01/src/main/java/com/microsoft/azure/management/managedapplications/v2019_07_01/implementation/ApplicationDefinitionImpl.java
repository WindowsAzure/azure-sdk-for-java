/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managedapplications.v2019_07_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.managedapplications.v2019_07_01.ApplicationDefinition;
import rx.Observable;
import com.microsoft.azure.management.managedapplications.v2019_07_01.Sku;
import com.microsoft.azure.management.managedapplications.v2019_07_01.ApplicationLockLevel;
import java.util.List;
import com.microsoft.azure.management.managedapplications.v2019_07_01.ApplicationAuthorization;
import com.microsoft.azure.management.managedapplications.v2019_07_01.ApplicationDefinitionArtifact;
import com.microsoft.azure.management.managedapplications.v2019_07_01.ApplicationNotificationPolicy;
import com.microsoft.azure.management.managedapplications.v2019_07_01.ApplicationPackageLockingPolicyDefinition;
import com.microsoft.azure.management.managedapplications.v2019_07_01.ApplicationDeploymentPolicy;
import com.microsoft.azure.management.managedapplications.v2019_07_01.ApplicationManagementPolicy;
import com.microsoft.azure.management.managedapplications.v2019_07_01.ApplicationPolicy;

class ApplicationDefinitionImpl extends GroupableResourceCoreImpl<ApplicationDefinition, ApplicationDefinitionInner, ApplicationDefinitionImpl, ManagedApplicationsManager> implements ApplicationDefinition, ApplicationDefinition.Definition, ApplicationDefinition.Update {
    ApplicationDefinitionImpl(String name, ApplicationDefinitionInner inner, ManagedApplicationsManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<ApplicationDefinition> createResourceAsync() {
        ApplicationDefinitionsInner client = this.manager().inner().applicationDefinitions();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ApplicationDefinition> updateResourceAsync() {
        ApplicationDefinitionsInner client = this.manager().inner().applicationDefinitions();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ApplicationDefinitionInner> getInnerAsync() {
        ApplicationDefinitionsInner client = this.manager().inner().applicationDefinitions();
        return client.getAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public List<ApplicationDefinitionArtifact> artifacts() {
        return this.inner().artifacts();
    }

    @Override
    public List<ApplicationAuthorization> authorizations() {
        return this.inner().authorizations();
    }

    @Override
    public Object createUiDefinition() {
        return this.inner().createUiDefinition();
    }

    @Override
    public ApplicationDeploymentPolicy deploymentPolicy() {
        return this.inner().deploymentPolicy();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String displayName() {
        return this.inner().displayName();
    }

    @Override
    public Boolean isEnabled() {
        return this.inner().isEnabled();
    }

    @Override
    public ApplicationPackageLockingPolicyDefinition lockingPolicy() {
        return this.inner().lockingPolicy();
    }

    @Override
    public ApplicationLockLevel lockLevel() {
        return this.inner().lockLevel();
    }

    @Override
    public Object mainTemplate() {
        return this.inner().mainTemplate();
    }

    @Override
    public String managedBy() {
        return this.inner().managedBy();
    }

    @Override
    public ApplicationManagementPolicy managementPolicy() {
        return this.inner().managementPolicy();
    }

    @Override
    public ApplicationNotificationPolicy notificationPolicy() {
        return this.inner().notificationPolicy();
    }

    @Override
    public String packageFileUri() {
        return this.inner().packageFileUri();
    }

    @Override
    public List<ApplicationPolicy> policies() {
        return this.inner().policies();
    }

    @Override
    public Sku sku() {
        return this.inner().sku();
    }

    @Override
    public ApplicationDefinitionImpl withLockLevel(ApplicationLockLevel lockLevel) {
        this.inner().withLockLevel(lockLevel);
        return this;
    }

    @Override
    public ApplicationDefinitionImpl withArtifacts(List<ApplicationDefinitionArtifact> artifacts) {
        this.inner().withArtifacts(artifacts);
        return this;
    }

    @Override
    public ApplicationDefinitionImpl withAuthorizations(List<ApplicationAuthorization> authorizations) {
        this.inner().withAuthorizations(authorizations);
        return this;
    }

    @Override
    public ApplicationDefinitionImpl withCreateUiDefinition(Object createUiDefinition) {
        this.inner().withCreateUiDefinition(createUiDefinition);
        return this;
    }

    @Override
    public ApplicationDefinitionImpl withDeploymentPolicy(ApplicationDeploymentPolicy deploymentPolicy) {
        this.inner().withDeploymentPolicy(deploymentPolicy);
        return this;
    }

    @Override
    public ApplicationDefinitionImpl withDescription(String description) {
        this.inner().withDescription(description);
        return this;
    }

    @Override
    public ApplicationDefinitionImpl withDisplayName(String displayName) {
        this.inner().withDisplayName(displayName);
        return this;
    }

    @Override
    public ApplicationDefinitionImpl withIsEnabled(Boolean isEnabled) {
        this.inner().withIsEnabled(isEnabled);
        return this;
    }

    @Override
    public ApplicationDefinitionImpl withLockingPolicy(ApplicationPackageLockingPolicyDefinition lockingPolicy) {
        this.inner().withLockingPolicy(lockingPolicy);
        return this;
    }

    @Override
    public ApplicationDefinitionImpl withMainTemplate(Object mainTemplate) {
        this.inner().withMainTemplate(mainTemplate);
        return this;
    }

    @Override
    public ApplicationDefinitionImpl withManagedBy(String managedBy) {
        this.inner().withManagedBy(managedBy);
        return this;
    }

    @Override
    public ApplicationDefinitionImpl withManagementPolicy(ApplicationManagementPolicy managementPolicy) {
        this.inner().withManagementPolicy(managementPolicy);
        return this;
    }

    @Override
    public ApplicationDefinitionImpl withNotificationPolicy(ApplicationNotificationPolicy notificationPolicy) {
        this.inner().withNotificationPolicy(notificationPolicy);
        return this;
    }

    @Override
    public ApplicationDefinitionImpl withPackageFileUri(String packageFileUri) {
        this.inner().withPackageFileUri(packageFileUri);
        return this;
    }

    @Override
    public ApplicationDefinitionImpl withPolicies(List<ApplicationPolicy> policies) {
        this.inner().withPolicies(policies);
        return this;
    }

    @Override
    public ApplicationDefinitionImpl withSku(Sku sku) {
        this.inner().withSku(sku);
        return this;
    }

}
