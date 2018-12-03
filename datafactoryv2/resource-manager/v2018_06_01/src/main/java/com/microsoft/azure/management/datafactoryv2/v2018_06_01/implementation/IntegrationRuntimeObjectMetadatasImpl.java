/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.IntegrationRuntimeObjectMetadatas;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.SsisObjectMetadataListResponse;

class IntegrationRuntimeObjectMetadatasImpl extends WrapperImpl<IntegrationRuntimeObjectMetadatasInner> implements IntegrationRuntimeObjectMetadatas {
    private final DataFactoryManager manager;

    IntegrationRuntimeObjectMetadatasImpl(DataFactoryManager manager) {
        super(manager.inner().integrationRuntimeObjectMetadatas());
        this.manager = manager;
    }

    public DataFactoryManager manager() {
        return this.manager;
    }

    @Override
    public Completable refreshAsync(String resourceGroupName, String factoryName, String integrationRuntimeName) {
        IntegrationRuntimeObjectMetadatasInner client = this.inner();
        return client.refreshAsync(resourceGroupName, factoryName, integrationRuntimeName).toCompletable();
    }

    @Override
    public Observable<SsisObjectMetadataListResponse> getAsync(String resourceGroupName, String factoryName, String integrationRuntimeName) {
        IntegrationRuntimeObjectMetadatasInner client = this.inner();
        return client.getAsync(resourceGroupName, factoryName, integrationRuntimeName)
        .map(new Func1<SsisObjectMetadataListResponseInner, SsisObjectMetadataListResponse>() {
            @Override
            public SsisObjectMetadataListResponse call(SsisObjectMetadataListResponseInner inner) {
                return new SsisObjectMetadataListResponseImpl(inner, manager());
            }
        });
    }

}
