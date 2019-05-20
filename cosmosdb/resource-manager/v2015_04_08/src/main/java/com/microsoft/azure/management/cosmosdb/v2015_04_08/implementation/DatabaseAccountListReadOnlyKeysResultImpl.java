/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2015_04_08.implementation;

import com.microsoft.azure.management.cosmosdb.v2015_04_08.DatabaseAccountListReadOnlyKeysResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class DatabaseAccountListReadOnlyKeysResultImpl extends WrapperImpl<DatabaseAccountListReadOnlyKeysResultInner> implements DatabaseAccountListReadOnlyKeysResult {
    private final CosmosDBManager manager;
    DatabaseAccountListReadOnlyKeysResultImpl(DatabaseAccountListReadOnlyKeysResultInner inner, CosmosDBManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CosmosDBManager manager() {
        return this.manager;
    }

    @Override
    public String primaryReadonlyMasterKey() {
        return this.inner().primaryReadonlyMasterKey();
    }

    @Override
    public String secondaryReadonlyMasterKey() {
        return this.inner().secondaryReadonlyMasterKey();
    }

}
