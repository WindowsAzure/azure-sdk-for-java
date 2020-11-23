/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.IntegrationRuntimeMonitoringDatas;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.IntegrationRuntimeMonitoringData;

class IntegrationRuntimeMonitoringDatasImpl extends WrapperImpl<IntegrationRuntimeMonitoringDatasInner> implements IntegrationRuntimeMonitoringDatas {
    private final SynapseManager manager;

    IntegrationRuntimeMonitoringDatasImpl(SynapseManager manager) {
        super(manager.inner().integrationRuntimeMonitoringDatas());
        this.manager = manager;
    }

    public SynapseManager manager() {
        return this.manager;
    }

    @Override
    public Observable<IntegrationRuntimeMonitoringData> listAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName) {
        IntegrationRuntimeMonitoringDatasInner client = this.inner();
        return client.listAsync(resourceGroupName, workspaceName, integrationRuntimeName)
        .map(new Func1<IntegrationRuntimeMonitoringDataInner, IntegrationRuntimeMonitoringData>() {
            @Override
            public IntegrationRuntimeMonitoringData call(IntegrationRuntimeMonitoringDataInner inner) {
                return new IntegrationRuntimeMonitoringDataImpl(inner, manager());
            }
        });
    }

}
