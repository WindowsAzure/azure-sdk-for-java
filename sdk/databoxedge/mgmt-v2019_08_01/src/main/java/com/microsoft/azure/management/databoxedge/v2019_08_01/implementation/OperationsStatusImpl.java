/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.databoxedge.v2019_08_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.databoxedge.v2019_08_01.OperationsStatus;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.databoxedge.v2019_08_01.DataBoxEdgeDeviceJobModel;

class OperationsStatusImpl extends WrapperImpl<OperationsStatusInner> implements OperationsStatus {
    private final DataBoxEdgeManager manager;

    OperationsStatusImpl(DataBoxEdgeManager manager) {
        super(manager.inner().operationsStatus());
        this.manager = manager;
    }

    public DataBoxEdgeManager manager() {
        return this.manager;
    }

    private DataBoxEdgeDeviceJobModelImpl wrapModel(JobInner inner) {
        return  new DataBoxEdgeDeviceJobModelImpl(inner, manager());
    }

    @Override
    public Observable<DataBoxEdgeDeviceJobModel> getAsync(String deviceName, String name, String resourceGroupName) {
        OperationsStatusInner client = this.inner();
        return client.getAsync(deviceName, name, resourceGroupName)
        .flatMap(new Func1<JobInner, Observable<DataBoxEdgeDeviceJobModel>>() {
            @Override
            public Observable<DataBoxEdgeDeviceJobModel> call(JobInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((DataBoxEdgeDeviceJobModel)wrapModel(inner));
                }
            }
       });
    }

}
