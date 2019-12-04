/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.maintenance.v2018_06_01_preview.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.maintenance.v2018_06_01_preview.MaintenanceConfiguration;
import rx.Observable;
import java.util.Map;
import com.microsoft.azure.management.maintenance.v2018_06_01_preview.MaintenanceScope;

class MaintenanceConfigurationImpl extends GroupableResourceCoreImpl<MaintenanceConfiguration, MaintenanceConfigurationInner, MaintenanceConfigurationImpl, MaintenanceManager> implements MaintenanceConfiguration, MaintenanceConfiguration.Definition, MaintenanceConfiguration.Update {
    MaintenanceConfigurationImpl(String name, MaintenanceConfigurationInner inner, MaintenanceManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<MaintenanceConfiguration> createResourceAsync() {
        MaintenanceConfigurationsInner client = this.manager().inner().maintenanceConfigurations();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<MaintenanceConfiguration> updateResourceAsync() {
        MaintenanceConfigurationsInner client = this.manager().inner().maintenanceConfigurations();
        return client.updateMethodAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<MaintenanceConfigurationInner> getInnerAsync() {
        MaintenanceConfigurationsInner client = this.manager().inner().maintenanceConfigurations();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public Map<String, String> extensionProperties() {
        return this.inner().extensionProperties();
    }

    @Override
    public MaintenanceScope maintenanceScope() {
        return this.inner().maintenanceScope();
    }

    @Override
    public String namespace() {
        return this.inner().namespace();
    }

    @Override
    public MaintenanceConfigurationImpl withExtensionProperties(Map<String, String> extensionProperties) {
        this.inner().withExtensionProperties(extensionProperties);
        return this;
    }

    @Override
    public MaintenanceConfigurationImpl withMaintenanceScope(MaintenanceScope maintenanceScope) {
        this.inner().withMaintenanceScope(maintenanceScope);
        return this;
    }

    @Override
    public MaintenanceConfigurationImpl withNamespace(String namespace) {
        this.inner().withNamespace(namespace);
        return this;
    }

}
