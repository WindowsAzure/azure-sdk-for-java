/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_09_01.implementation;

import com.microsoft.azure.management.containerregistry.v2018_09_01.CallbackConfig;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.Map;

class CallbackConfigImpl extends WrapperImpl<CallbackConfigInner> implements CallbackConfig {
    private final ContainerRegistryManager manager;
    CallbackConfigImpl(CallbackConfigInner inner, ContainerRegistryManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ContainerRegistryManager manager() {
        return this.manager;
    }

    @Override
    public Map<String, String> customHeaders() {
        return this.inner().customHeaders();
    }

    @Override
    public String serviceUri() {
        return this.inner().serviceUri();
    }

}
