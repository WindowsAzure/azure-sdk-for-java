/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2016_10_01.implementation;

import com.microsoft.azure.management.keyvault.v2016_10_01.DeletedVault;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.keyvault.v2016_10_01.DeletedVaultProperties;

class DeletedVaultImpl extends IndexableRefreshableWrapperImpl<DeletedVault, DeletedVaultInner> implements DeletedVault {
    private final KeyVaultManager manager;
    private String vaultName;
    private String location;

    DeletedVaultImpl(DeletedVaultInner inner,  KeyVaultManager manager) {
        super(null, inner);
        this.manager = manager;
        this.vaultName = IdParsingUtils.getValueFromIdByName(inner.id(), "deletedVaults");
        this.location = IdParsingUtils.getValueFromIdByName(inner.id(), "locations");
    }

    @Override
    public KeyVaultManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<DeletedVaultInner> getInnerAsync() {
        VaultsInner client = this.manager().inner().vaults();
        return client.getDeletedAsync(this.vaultName, this.location);
    }



    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public DeletedVaultProperties properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
