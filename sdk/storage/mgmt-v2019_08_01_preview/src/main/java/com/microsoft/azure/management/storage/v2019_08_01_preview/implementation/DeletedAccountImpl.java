/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_08_01_preview.implementation;

import com.microsoft.azure.management.storage.v2019_08_01_preview.DeletedAccount;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;

class DeletedAccountImpl extends IndexableRefreshableWrapperImpl<DeletedAccount, DeletedAccountInner> implements DeletedAccount {
    private final StorageManager manager;
    private String deletedAccountName;
    private String location;

    DeletedAccountImpl(DeletedAccountInner inner,  StorageManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.deletedAccountName = IdParsingUtils.getValueFromIdByName(inner.id(), "deletedAccounts");
        this.location = IdParsingUtils.getValueFromIdByName(inner.id(), "locations");
    }

    @Override
    public StorageManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<DeletedAccountInner> getInnerAsync() {
        DeletedAccountsInner client = this.manager().inner().deletedAccounts();
        return client.getAsync(this.deletedAccountName, this.location);
    }



    @Override
    public String creationTime() {
        return this.inner().creationTime();
    }

    @Override
    public String deletionTime() {
        return this.inner().deletionTime();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String restoreReference() {
        return this.inner().restoreReference();
    }

    @Override
    public String storageAccountResourceId() {
        return this.inner().storageAccountResourceId();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
