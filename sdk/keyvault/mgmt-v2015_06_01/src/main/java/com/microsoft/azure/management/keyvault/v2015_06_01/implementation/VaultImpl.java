/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2015_06_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.keyvault.v2015_06_01.Vault;
import rx.Observable;
import com.microsoft.azure.management.keyvault.v2015_06_01.VaultCreateOrUpdateParameters;
import com.microsoft.azure.management.keyvault.v2015_06_01.VaultProperties;
import rx.functions.Func1;

class VaultImpl extends GroupableResourceCoreImpl<Vault, VaultInner, VaultImpl, KeyVaultManager> implements Vault, Vault.Definition, Vault.Update {
    private VaultCreateOrUpdateParameters createOrUpdateParameter;
    VaultImpl(String name, VaultInner inner, KeyVaultManager manager) {
        super(name, inner, manager);
        this.createOrUpdateParameter = new VaultCreateOrUpdateParameters();
    }

    @Override
    public Observable<Vault> createResourceAsync() {
        VaultsInner client = this.manager().inner().vaults();
        this.createOrUpdateParameter.withLocation(inner().location());
        this.createOrUpdateParameter.withTags(inner().getTags());
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.createOrUpdateParameter)
            .map(new Func1<VaultInner, VaultInner>() {
               @Override
               public VaultInner call(VaultInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Vault> updateResourceAsync() {
        VaultsInner client = this.manager().inner().vaults();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.createOrUpdateParameter)
            .map(new Func1<VaultInner, VaultInner>() {
               @Override
               public VaultInner call(VaultInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<VaultInner> getInnerAsync() {
        VaultsInner client = this.manager().inner().vaults();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createOrUpdateParameter = new VaultCreateOrUpdateParameters();
    }

    @Override
    public VaultProperties properties() {
        return this.inner().properties();
    }

    @Override
    public VaultImpl withProperties(VaultProperties properties) {
        this.createOrUpdateParameter.withProperties(properties);
        return this;
    }

}
