/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_04_01.implementation;

import com.microsoft.azure.management.network.v2019_04_01.LocationAvailablePrivateEndpointType;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;

class LocationAvailablePrivateEndpointTypeImpl extends WrapperImpl<AvailablePrivateEndpointTypeInner> implements LocationAvailablePrivateEndpointType {
    private final NetworkManager manager;

    LocationAvailablePrivateEndpointTypeImpl(AvailablePrivateEndpointTypeInner inner,  NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }



    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String serviceName() {
        return this.inner().serviceName();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
