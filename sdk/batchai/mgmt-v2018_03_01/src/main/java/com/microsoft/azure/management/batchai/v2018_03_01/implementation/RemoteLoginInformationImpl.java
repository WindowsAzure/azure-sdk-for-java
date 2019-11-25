/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_03_01.implementation;

import com.microsoft.azure.management.batchai.v2018_03_01.RemoteLoginInformation;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class RemoteLoginInformationImpl extends WrapperImpl<RemoteLoginInformationInner> implements RemoteLoginInformation {
    private final BatchAIManager manager;
    RemoteLoginInformationImpl(RemoteLoginInformationInner inner, BatchAIManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public BatchAIManager manager() {
        return this.manager;
    }

    @Override
    public String ipAddress() {
        return this.inner().ipAddress();
    }

    @Override
    public String nodeId() {
        return this.inner().nodeId();
    }

    @Override
    public double port() {
        return this.inner().port();
    }

}
