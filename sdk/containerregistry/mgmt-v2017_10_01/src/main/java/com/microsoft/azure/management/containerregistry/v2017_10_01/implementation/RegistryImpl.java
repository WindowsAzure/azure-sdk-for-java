/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2017_10_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.containerregistry.v2017_10_01.Registry;
import rx.Observable;
import com.microsoft.azure.management.containerregistry.v2017_10_01.RegistryUpdateParameters;
import com.microsoft.azure.management.containerregistry.v2017_10_01.Sku;
import org.joda.time.DateTime;
import com.microsoft.azure.management.containerregistry.v2017_10_01.ProvisioningState;
import com.microsoft.azure.management.containerregistry.v2017_10_01.Status;
import com.microsoft.azure.management.containerregistry.v2017_10_01.StorageAccountProperties;
import com.microsoft.azure.management.containerregistry.v2017_10_01.NetworkRuleSet;
import rx.functions.Func1;

class RegistryImpl extends GroupableResourceCoreImpl<Registry, RegistryInner, RegistryImpl, ContainerRegistryManager> implements Registry, Registry.Definition, Registry.Update {
    private RegistryUpdateParameters updateParameter;
    RegistryImpl(String name, RegistryInner inner, ContainerRegistryManager manager) {
        super(name, inner, manager);
        this.updateParameter = new RegistryUpdateParameters();
    }

    @Override
    public Observable<Registry> createResourceAsync() {
        RegistriesInner client = this.manager().inner().registries();
        return client.createAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<RegistryInner, RegistryInner>() {
               @Override
               public RegistryInner call(RegistryInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Registry> updateResourceAsync() {
        RegistriesInner client = this.manager().inner().registries();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<RegistryInner, RegistryInner>() {
               @Override
               public RegistryInner call(RegistryInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<RegistryInner> getInnerAsync() {
        RegistriesInner client = this.manager().inner().registries();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new RegistryUpdateParameters();
    }

    @Override
    public Boolean adminUserEnabled() {
        return this.inner().adminUserEnabled();
    }

    @Override
    public DateTime creationDate() {
        return this.inner().creationDate();
    }

    @Override
    public String loginServer() {
        return this.inner().loginServer();
    }

    @Override
    public NetworkRuleSet networkRuleSet() {
        return this.inner().networkRuleSet();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public Sku sku() {
        return this.inner().sku();
    }

    @Override
    public Status status() {
        return this.inner().status();
    }

    @Override
    public StorageAccountProperties storageAccount() {
        return this.inner().storageAccount();
    }

    @Override
    public RegistryImpl withSku(Sku sku) {
        if (isInCreateMode()) {
            this.inner().withSku(sku);
        } else {
            this.updateParameter.withSku(sku);
        }
        return this;
    }

    @Override
    public RegistryImpl withAdminUserEnabled(Boolean adminUserEnabled) {
        if (isInCreateMode()) {
            this.inner().withAdminUserEnabled(adminUserEnabled);
        } else {
            this.updateParameter.withAdminUserEnabled(adminUserEnabled);
        }
        return this;
    }

    @Override
    public RegistryImpl withNetworkRuleSet(NetworkRuleSet networkRuleSet) {
        if (isInCreateMode()) {
            this.inner().withNetworkRuleSet(networkRuleSet);
        } else {
            this.updateParameter.withNetworkRuleSet(networkRuleSet);
        }
        return this;
    }

    @Override
    public RegistryImpl withStorageAccount(StorageAccountProperties storageAccount) {
        if (isInCreateMode()) {
            this.inner().withStorageAccount(storageAccount);
        } else {
            this.updateParameter.withStorageAccount(storageAccount);
        }
        return this;
    }

}
