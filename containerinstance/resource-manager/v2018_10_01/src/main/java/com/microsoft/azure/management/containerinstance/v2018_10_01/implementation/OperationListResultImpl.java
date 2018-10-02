/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2018_10_01.implementation;

import com.microsoft.azure.management.containerinstance.v2018_10_01.OperationListResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class OperationListResultImpl extends WrapperImpl<OperationListResultInner> implements OperationListResult {
    private final ContainerInstanceManager manager;
    OperationListResultImpl(OperationListResultInner inner, ContainerInstanceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ContainerInstanceManager manager() {
        return this.manager;
    }

    @Override
    public String nextLink() {
        return this.inner().nextLink();
    }

    @Override
    public List<OperationInner> value() {
        return this.inner().value();
    }

}
