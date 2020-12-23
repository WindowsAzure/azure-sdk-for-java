/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_12_01.implementation;

import com.microsoft.azure.management.containerservice.v2020_12_01.PrivateEndpointConnectionListResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class PrivateEndpointConnectionListResultImpl extends WrapperImpl<PrivateEndpointConnectionListResultInner> implements PrivateEndpointConnectionListResult {
    private final ContainerServiceManager manager;
    PrivateEndpointConnectionListResultImpl(PrivateEndpointConnectionListResultInner inner, ContainerServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ContainerServiceManager manager() {
        return this.manager;
    }

    @Override
    public List<PrivateEndpointConnectionInner> value() {
        return this.inner().value();
    }

}
