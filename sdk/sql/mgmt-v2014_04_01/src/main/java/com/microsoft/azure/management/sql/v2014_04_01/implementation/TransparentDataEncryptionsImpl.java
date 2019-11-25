/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v2014_04_01.TransparentDataEncryptions;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.sql.v2014_04_01.TransparentDataEncryption;

class TransparentDataEncryptionsImpl extends WrapperImpl<TransparentDataEncryptionsInner> implements TransparentDataEncryptions {
    private final SqlManager manager;

    TransparentDataEncryptionsImpl(SqlManager manager) {
        super(manager.inner().transparentDataEncryptions());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public Observable<TransparentDataEncryption> createOrUpdateAsync(String resourceGroupName, String serverName, String databaseName) {
        TransparentDataEncryptionsInner client = this.inner();
        return client.createOrUpdateAsync(resourceGroupName, serverName, databaseName)
        .map(new Func1<TransparentDataEncryptionInner, TransparentDataEncryption>() {
            @Override
            public TransparentDataEncryption call(TransparentDataEncryptionInner inner) {
                return new TransparentDataEncryptionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<TransparentDataEncryption> getAsync(String resourceGroupName, String serverName, String databaseName) {
        TransparentDataEncryptionsInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName, databaseName)
        .map(new Func1<TransparentDataEncryptionInner, TransparentDataEncryption>() {
            @Override
            public TransparentDataEncryption call(TransparentDataEncryptionInner inner) {
                return new TransparentDataEncryptionImpl(inner, manager());
            }
        });
    }

}
