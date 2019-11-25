/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.keyvault.v2016_10_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.keyvault.v2016_10_01.Vaults;
import com.microsoft.azure.management.keyvault.v2016_10_01.Vault;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.keyvault.v2016_10_01.CheckNameAvailabilityResult;
import com.microsoft.azure.management.keyvault.v2016_10_01.DeletedVault;
import com.microsoft.azure.Resource;

class VaultsImpl extends GroupableResourcesCoreImpl<Vault, VaultImpl, VaultInner, VaultsInner, KeyVaultManager>  implements Vaults {
    protected VaultsImpl(KeyVaultManager manager) {
        super(manager.inner().vaults(), manager);
    }

    @Override
    protected Observable<VaultInner> getInnerAsync(String resourceGroupName, String name) {
        VaultsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        VaultsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<Vault> listByResourceGroup(String resourceGroupName) {
        VaultsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<Vault> listByResourceGroupAsync(String resourceGroupName) {
        VaultsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<VaultInner>, Iterable<VaultInner>>() {
            @Override
            public Iterable<VaultInner> call(Page<VaultInner> page) {
                return page.items();
            }
        })
        .map(new Func1<VaultInner, Vault>() {
            @Override
            public Vault call(VaultInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<Vault> list() {
        VaultsInner client = this.inner();
        return this.wrapList(client.listBySubscription());
    }

    @Override
    public Observable<Vault> listAsync() {
        VaultsInner client = this.inner();
        return client.listBySubscriptionAsync()
        .flatMapIterable(new Func1<Page<VaultInner>, Iterable<VaultInner>>() {
            @Override
            public Iterable<VaultInner> call(Page<VaultInner> page) {
                return page.items();
            }
        })
        .map(new Func1<VaultInner, Vault>() {
            @Override
            public Vault call(VaultInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public VaultImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Observable<CheckNameAvailabilityResult> checkNameAvailabilityAsync(String name) {
        VaultsInner client = this.inner();
        return client.checkNameAvailabilityAsync(name)
        .map(new Func1<CheckNameAvailabilityResultInner, CheckNameAvailabilityResult>() {
            @Override
            public CheckNameAvailabilityResult call(CheckNameAvailabilityResultInner inner) {
                return new CheckNameAvailabilityResultImpl(inner, manager());
            }
        });
    }

    @Override
    protected VaultImpl wrapModel(VaultInner inner) {
        return  new VaultImpl(inner.name(), inner, manager());
    }

    @Override
    protected VaultImpl wrapModel(String name) {
        return new VaultImpl(name, new VaultInner(), this.manager());
    }

    private DeletedVaultImpl wrapDeletedVaultModel(DeletedVaultInner inner) {
        return  new DeletedVaultImpl(inner, manager());
    }

    private Observable<DeletedVaultInner> getDeletedVaultInnerUsingVaultsInnerAsync(String id) {
        String location = IdParsingUtils.getValueFromIdByName(id, "locations");
        String vaultName = IdParsingUtils.getValueFromIdByName(id, "deletedVaults");
        VaultsInner client = this.inner();
        return client.getDeletedAsync(vaultName, location);
    }

    @Override
    public Observable<DeletedVault> getDeletedAsync(String vaultName, String location) {
        VaultsInner client = this.inner();
        return client.getDeletedAsync(vaultName, location)
        .map(new Func1<DeletedVaultInner, DeletedVault>() {
            @Override
            public DeletedVault call(DeletedVaultInner inner) {
                return wrapDeletedVaultModel(inner);
            }
       });
    }

    @Override
    public Completable purgeDeletedAsync(String vaultName, String location) {
        VaultsInner client = this.inner();
        return client.purgeDeletedAsync(vaultName, location).toCompletable();
    }

    @Override
    public Observable<DeletedVault> listDeletedAsync() {
        VaultsInner client = this.inner();
        return client.listDeletedAsync()
        .flatMapIterable(new Func1<Page<DeletedVaultInner>, Iterable<DeletedVaultInner>>() {
            @Override
            public Iterable<DeletedVaultInner> call(Page<DeletedVaultInner> page) {
                return page.items();
            }
        })    .map(new Func1<DeletedVaultInner, DeletedVault>() {
            @Override
            public DeletedVault call(DeletedVaultInner inner) {
                return new DeletedVaultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Resource> listResourceAsync() {
        VaultsInner client = this.inner();
        return client.listResourceAsync()
        .flatMapIterable(new Func1<Page<Resource>, Iterable<Resource>>() {
            @Override
            public Iterable<Resource> call(Page<Resource> page) {
                return page.items();
            }
        });
    }

}
