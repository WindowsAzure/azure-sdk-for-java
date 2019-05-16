/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakestore.v2016_11_01.implementation;

import com.microsoft.azure.management.datalakestore.v2016_11_01.Usage;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.datalakestore.v2016_11_01.UsageName;
import com.microsoft.azure.management.datalakestore.v2016_11_01.UsageUnit;

class UsageImpl extends WrapperImpl<UsageInner> implements Usage {
    private final DataLakeStoreManager manager;

    UsageImpl(UsageInner inner,  DataLakeStoreManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DataLakeStoreManager manager() {
        return this.manager;
    }



    @Override
    public Integer currentValue() {
        return this.inner().currentValue();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Integer limit() {
        return this.inner().limit();
    }

    @Override
    public UsageName name() {
        return this.inner().name();
    }

    @Override
    public UsageUnit unit() {
        return this.inner().unit();
    }

}
