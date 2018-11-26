/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_06_01.implementation;

import com.microsoft.azure.management.network.v2018_06_01.SecurityGroupViewResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.network.v2018_06_01.SecurityGroupNetworkInterface;

class SecurityGroupViewResultImpl extends WrapperImpl<SecurityGroupViewResultInner> implements SecurityGroupViewResult {
    private final NetworkManager manager;
    SecurityGroupViewResultImpl(SecurityGroupViewResultInner inner, NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public List<SecurityGroupNetworkInterface> networkInterfaces() {
        return this.inner().networkInterfaces();
    }

}
