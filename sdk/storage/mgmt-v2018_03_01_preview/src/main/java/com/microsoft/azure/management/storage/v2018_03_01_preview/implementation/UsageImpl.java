/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2018_03_01_preview.implementation;

import com.microsoft.azure.management.storage.v2018_03_01_preview.Usage;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.storage.v2018_03_01_preview.UsageName;
import com.microsoft.azure.management.storage.v2018_03_01_preview.UsageUnit;

class UsageImpl extends WrapperImpl<UsageInner> implements Usage {
    private final StorageManager manager;

    UsageImpl(UsageInner inner,  StorageManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public StorageManager manager() {
        return this.manager;
    }



    @Override
    public Integer currentValue() {
        return this.inner().currentValue();
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
