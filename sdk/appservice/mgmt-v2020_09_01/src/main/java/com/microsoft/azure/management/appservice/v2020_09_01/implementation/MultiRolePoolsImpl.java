/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01.implementation;

import com.microsoft.azure.management.appservice.v2020_09_01.MultiRolePools;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.appservice.v2020_09_01.ComputeModeOptions;
import java.util.List;
import com.microsoft.azure.management.appservice.v2020_09_01.SkuDescription;
import com.microsoft.azure.management.appservice.v2020_09_01.SystemData;

class MultiRolePoolsImpl extends WrapperImpl<WorkerPoolResourceInner> implements MultiRolePools {
    private final AppServiceManager manager;

    MultiRolePoolsImpl(WorkerPoolResourceInner inner,  AppServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }



    @Override
    public ComputeModeOptions computeMode() {
        return this.inner().computeMode();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public List<String> instanceNames() {
        return this.inner().instanceNames();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public SkuDescription sku() {
        return this.inner().sku();
    }

    @Override
    public SystemData systemData() {
        return this.inner().systemData();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public Integer workerCount() {
        return this.inner().workerCount();
    }

    @Override
    public String workerSize() {
        return this.inner().workerSize();
    }

    @Override
    public Integer workerSizeId() {
        return this.inner().workerSizeId();
    }

}
