/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.implementation;

import com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.OperationsList;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class OperationsListImpl extends WrapperImpl<OperationsListInner> implements OperationsList {
    private final DeploymentManagerManager manager;
    OperationsListImpl(OperationsListInner inner, DeploymentManagerManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DeploymentManagerManager manager() {
        return this.manager;
    }

    @Override
    public OperationInner value() {
        return this.inner().value();
    }

}
