/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.ResourcePoolByPCs;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.PrivateCloudLocationResourcePoolModel;

class ResourcePoolByPCsImpl extends WrapperImpl<ResourcePoolByPCsInner> implements ResourcePoolByPCs {
    private final VMwareCloudSimpleManager manager;

    ResourcePoolByPCsImpl(VMwareCloudSimpleManager manager) {
        super(manager.inner().resourcePoolByPCs());
        this.manager = manager;
    }

    public VMwareCloudSimpleManager manager() {
        return this.manager;
    }

    private PrivateCloudLocationResourcePoolModelImpl wrapModel(ResourcePoolInner inner) {
        return  new PrivateCloudLocationResourcePoolModelImpl(inner, manager());
    }

    @Override
    public Observable<PrivateCloudLocationResourcePoolModel> getAsync(String pcName, String resourcePoolName) {
        ResourcePoolByPCsInner client = this.inner();
        return client.getAsync(pcName, resourcePoolName)
        .map(new Func1<ResourcePoolInner, PrivateCloudLocationResourcePoolModel>() {
            @Override
            public PrivateCloudLocationResourcePoolModel call(ResourcePoolInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
