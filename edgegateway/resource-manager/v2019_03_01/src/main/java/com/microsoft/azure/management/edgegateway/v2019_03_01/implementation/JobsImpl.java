/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.edgegateway.v2019_03_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.edgegateway.v2019_03_01.Jobs;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.edgegateway.v2019_03_01.DataBoxEdgeDeviceJob;

class JobsImpl extends WrapperImpl<JobsInner> implements Jobs {
    private final DataBoxEdgeManager manager;

    JobsImpl(DataBoxEdgeManager manager) {
        super(manager.inner().jobs());
        this.manager = manager;
    }

    public DataBoxEdgeManager manager() {
        return this.manager;
    }

    private DataBoxEdgeDeviceJobImpl wrapModel(JobInner inner) {
        return  new DataBoxEdgeDeviceJobImpl(inner, manager());
    }

    @Override
    public Observable<DataBoxEdgeDeviceJob> getAsync(String deviceName, String name, String resourceGroupName) {
        JobsInner client = this.inner();
        return client.getAsync(deviceName, name, resourceGroupName)
        .map(new Func1<JobInner, DataBoxEdgeDeviceJob>() {
            @Override
            public DataBoxEdgeDeviceJob call(JobInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
