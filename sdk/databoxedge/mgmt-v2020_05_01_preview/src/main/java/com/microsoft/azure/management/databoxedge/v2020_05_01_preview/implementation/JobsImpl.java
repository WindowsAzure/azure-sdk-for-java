/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.databoxedge.v2020_05_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.databoxedge.v2020_05_01_preview.Jobs;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.databoxedge.v2020_05_01_preview.DataBoxEdgeDeviceJob;

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
        .flatMap(new Func1<JobInner, Observable<DataBoxEdgeDeviceJob>>() {
            @Override
            public Observable<DataBoxEdgeDeviceJob> call(JobInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((DataBoxEdgeDeviceJob)wrapModel(inner));
                }
            }
       });
    }

}
