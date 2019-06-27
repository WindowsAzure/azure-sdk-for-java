/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storageimportexport.v2016_11_01.implementation;

import com.microsoft.azure.management.storageimportexport.v2016_11_01.Operation;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class OperationImpl extends WrapperImpl<OperationInner> implements Operation {
    private final StorageImportExportManager manager;
    OperationImpl(OperationInner inner, StorageImportExportManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public StorageImportExportManager manager() {
        return this.manager;
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String operation() {
        return this.inner().operation();
    }

    @Override
    public String provider() {
        return this.inner().provider();
    }

    @Override
    public String resource() {
        return this.inner().resource();
    }

}
