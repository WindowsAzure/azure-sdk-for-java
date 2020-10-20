/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_07_01.implementation;

import com.microsoft.azure.management.compute.v2019_07_01.RecoveryWalkResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class RecoveryWalkResponseImpl extends WrapperImpl<RecoveryWalkResponseInner> implements RecoveryWalkResponse {
    private final ComputeManager manager;
    RecoveryWalkResponseImpl(RecoveryWalkResponseInner inner, ComputeManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public Integer nextPlatformUpdateDomain() {
        return this.inner().nextPlatformUpdateDomain();
    }

    @Override
    public Boolean walkPerformed() {
        return this.inner().walkPerformed();
    }

}
