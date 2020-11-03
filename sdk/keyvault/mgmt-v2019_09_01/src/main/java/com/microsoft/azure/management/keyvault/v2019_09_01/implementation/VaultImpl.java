/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2019_09_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.keyvault.v2019_09_01.Vault;
import rx.Observable;
import com.microsoft.azure.management.keyvault.v2019_09_01.VaultPatchParameters;
import com.microsoft.azure.management.keyvault.v2019_09_01.VaultCreateOrUpdateParameters;
import com.microsoft.azure.management.keyvault.v2019_09_01.VaultProperties;
import com.microsoft.azure.management.keyvault.v2019_09_01.VaultPatchProperties;
import rx.functions.Func1;

class VaultImpl extends GroupableResourceCoreImpl<Vault, VaultInner, VaultImpl, KeyVaultManager> implements Vault, Vault.Definition, Vault.Update {
    private VaultCreateOrUpdateParameters createParameter;
    private VaultPatchParameters updateParameter;
    VaultImpl(String name, VaultInner inner, KeyVaultManager manager) {
        super(name, inner, manager);
        this.createParameter = new VaultCreateOrUpdateParameters();
        this.updateParameter = new VaultPatchParameters();
    }

    @Override
    public Observable<Vault> createResourceAsync() {
        VaultsInner client = this.manager().inner().vaults();
        this.createParameter.withLocation(inner().location());
        this.createParameter.withTags(inner().getTags());
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.createParameter)
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
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
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
        this.createParameter = new VaultCreateOrUpdateParameters();
        this.updateParameter = new VaultPatchParameters();
    }

    @Override
    public VaultProperties properties() {
        return this.inner().properties();
    }

    @Override
    public VaultImpl withProperties(VaultProperties properties) {
        this.createParameter.withProperties(properties);
        return this;
    }

    @Override
    public VaultImpl withProperties(VaultPatchProperties properties) {
        this.updateParameter.withProperties(properties);
        return this;
    }

}
