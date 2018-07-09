/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.trafficmanager.v2017_05_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.trafficmanager.v2017_05_01.Endpoints;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.trafficmanager.v2017_05_01.Endpoint;
import com.microsoft.azure.management.trafficmanager.v2017_05_01.DeleteOperationResult;

class EndpointsImpl extends WrapperImpl<EndpointsInner> implements Endpoints {
    private final NetworkManager manager;

    EndpointsImpl(NetworkManager manager) {
        super(manager.inner().endpoints());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Endpoint> updateAsync(String resourceGroupName, String profileName, String endpointType, String endpointName, EndpointInner parameters) {
        EndpointsInner client = this.inner();
        return client.updateAsync(resourceGroupName, profileName, endpointType, endpointName, parameters)
        .map(new Func1<EndpointInner, Endpoint>() {
            @Override
            public Endpoint call(EndpointInner inner) {
                return new EndpointImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Endpoint> getAsync(String resourceGroupName, String profileName, String endpointType, String endpointName) {
        EndpointsInner client = this.inner();
        return client.getAsync(resourceGroupName, profileName, endpointType, endpointName)
        .map(new Func1<EndpointInner, Endpoint>() {
            @Override
            public Endpoint call(EndpointInner inner) {
                return new EndpointImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Endpoint> createOrUpdateAsync(String resourceGroupName, String profileName, String endpointType, String endpointName, EndpointInner parameters) {
        EndpointsInner client = this.inner();
        return client.createOrUpdateAsync(resourceGroupName, profileName, endpointType, endpointName, parameters)
        .map(new Func1<EndpointInner, Endpoint>() {
            @Override
            public Endpoint call(EndpointInner inner) {
                return new EndpointImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DeleteOperationResult> deleteAsync(String resourceGroupName, String profileName, String endpointType, String endpointName) {
        EndpointsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, profileName, endpointType, endpointName)
        .map(new Func1<DeleteOperationResultInner, DeleteOperationResult>() {
            @Override
            public DeleteOperationResult call(DeleteOperationResultInner inner) {
                return new DeleteOperationResultImpl(inner, manager());
            }
        });
    }

}
