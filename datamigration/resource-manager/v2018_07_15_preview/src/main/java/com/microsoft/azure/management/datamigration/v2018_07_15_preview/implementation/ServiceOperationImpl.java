/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview.implementation;

import com.microsoft.azure.management.datamigration.v2018_07_15_preview.ServiceOperation;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.datamigration.v2018_07_15_preview.ServiceOperationDisplay;

class ServiceOperationImpl extends WrapperImpl<ServiceOperationInner> implements ServiceOperation {
    private final DataMigrationManager manager;
    ServiceOperationImpl(ServiceOperationInner inner, DataMigrationManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DataMigrationManager manager() {
        return this.manager;
    }

    @Override
    public ServiceOperationDisplay display() {
        return this.inner().display();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

}
