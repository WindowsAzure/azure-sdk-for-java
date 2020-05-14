/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.logic.v2019_05_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.logic.v2019_05_01.IntegrationServiceEnvironmentNetworkHealths;
import rx.functions.Func1;
import rx.Observable;

class IntegrationServiceEnvironmentNetworkHealthsImpl extends WrapperImpl<IntegrationServiceEnvironmentNetworkHealthsInner> implements IntegrationServiceEnvironmentNetworkHealths {
    private final LogicManager manager;

    IntegrationServiceEnvironmentNetworkHealthsImpl(LogicManager manager) {
        super(manager.inner().integrationServiceEnvironmentNetworkHealths());
        this.manager = manager;
    }

    public LogicManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Map<String, IntegrationServiceEnvironmentSubnetNetworkHealthInner>> getAsync(String resourceGroup, String integrationServiceEnvironmentName) {
        IntegrationServiceEnvironmentNetworkHealthsInner client = this.inner();
        return client.getAsync(resourceGroup, integrationServiceEnvironmentName)
    ;}

}
