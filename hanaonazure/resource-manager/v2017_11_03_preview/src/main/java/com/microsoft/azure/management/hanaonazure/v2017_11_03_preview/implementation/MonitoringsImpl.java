/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.hanaonazure.v2017_11_03_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.hanaonazure.v2017_11_03_preview.Monitorings;
import rx.Completable;

class MonitoringsImpl extends WrapperImpl<MonitoringsInner> implements Monitorings {
    private final HanaOnAzureManager manager;

    MonitoringsImpl(HanaOnAzureManager manager) {
        super(manager.inner().monitorings());
        this.manager = manager;
    }

    public HanaOnAzureManager manager() {
        return this.manager;
    }

    @Override
    public Completable hanaInstancesMethodAsync(String resourceGroupName, String hanaInstanceName) {
        MonitoringsInner client = this.inner();
        return client.hanaInstancesMethodAsync(resourceGroupName, hanaInstanceName).toCompletable();
    }

}
