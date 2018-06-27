/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2017_06_01_preview.implementation;

import com.microsoft.azure.management.containerregistry.v2017_06_01_preview.RegistryNameStatus;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class RegistryNameStatusImpl extends WrapperImpl<RegistryNameStatusInner> implements RegistryNameStatus {
    private final ContainerRegistryManager manager;
    RegistryNameStatusImpl(RegistryNameStatusInner inner, ContainerRegistryManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ContainerRegistryManager manager() {
        return this.manager;
    }

    @Override
    public String message() {
        return this.inner().message();
    }

    @Override
    public Boolean nameAvailable() {
        return this.inner().nameAvailable();
    }

    @Override
    public String reason() {
        return this.inner().reason();
    }

}
