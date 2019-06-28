/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01.implementation;

import com.microsoft.azure.management.apimanagement.v2019_01_01.NetworkStatusContractByLocation;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class NetworkStatusContractByLocationImpl extends WrapperImpl<NetworkStatusContractByLocationInner> implements NetworkStatusContractByLocation {
    private final ApiManagementManager manager;
    NetworkStatusContractByLocationImpl(NetworkStatusContractByLocationInner inner, ApiManagementManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public NetworkStatusContractInner networkStatus() {
        return this.inner().networkStatus();
    }

}
