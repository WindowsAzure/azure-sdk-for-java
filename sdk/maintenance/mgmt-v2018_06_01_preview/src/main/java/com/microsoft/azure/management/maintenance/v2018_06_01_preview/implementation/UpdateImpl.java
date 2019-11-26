/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.maintenance.v2018_06_01_preview.implementation;

import com.microsoft.azure.management.maintenance.v2018_06_01_preview.Update;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.maintenance.v2018_06_01_preview.ImpactType;
import com.microsoft.azure.management.maintenance.v2018_06_01_preview.MaintenanceScope;
import org.joda.time.DateTime;
import com.microsoft.azure.management.maintenance.v2018_06_01_preview.UpdateStatus;

class UpdateImpl extends WrapperImpl<UpdateInner> implements Update {
    private final MaintenanceManager manager;
    UpdateImpl(UpdateInner inner, MaintenanceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public MaintenanceManager manager() {
        return this.manager;
    }

    @Override
    public Integer impactDurationInSec() {
        return this.inner().impactDurationInSec();
    }

    @Override
    public ImpactType impactType() {
        return this.inner().impactType();
    }

    @Override
    public MaintenanceScope maintenanceScope() {
        return this.inner().maintenanceScope();
    }

    @Override
    public DateTime notBefore() {
        return this.inner().notBefore();
    }

    @Override
    public String resourceId() {
        return this.inner().resourceId();
    }

    @Override
    public UpdateStatus status() {
        return this.inner().status();
    }

}
