/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.windowsiot.v2019_06_01.implementation;

import com.microsoft.azure.management.windowsiot.v2019_06_01.OperationEntity;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.windowsiot.v2019_06_01.OperationDisplayInfo;

class OperationEntityImpl extends WrapperImpl<OperationEntityInner> implements OperationEntity {
    private final WindowsIoTManager manager;
    OperationEntityImpl(OperationEntityInner inner, WindowsIoTManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public WindowsIoTManager manager() {
        return this.manager;
    }

    @Override
    public OperationDisplayInfo display() {
        return this.inner().display();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

}
