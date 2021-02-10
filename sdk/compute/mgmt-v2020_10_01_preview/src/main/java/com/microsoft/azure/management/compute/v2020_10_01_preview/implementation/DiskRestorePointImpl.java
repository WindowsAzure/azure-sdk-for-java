/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview.implementation;

import com.microsoft.azure.management.compute.v2020_10_01_preview.DiskRestorePoint;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.compute.v2020_10_01_preview.Encryption;
import com.microsoft.azure.management.compute.v2020_10_01_preview.HyperVGeneration;
import com.microsoft.azure.management.compute.v2020_10_01_preview.OperatingSystemTypes;
import com.microsoft.azure.management.compute.v2020_10_01_preview.PurchasePlan;
import org.joda.time.DateTime;

class DiskRestorePointImpl extends IndexableRefreshableWrapperImpl<DiskRestorePoint, DiskRestorePointInner> implements DiskRestorePoint {
    private final ComputeManager manager;
    private String resourceGroupName;
    private String restorePointCollectionName;
    private String vmRestorePointName;
    private String diskRestorePointName;

    DiskRestorePointImpl(DiskRestorePointInner inner,  ComputeManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.restorePointCollectionName = IdParsingUtils.getValueFromIdByName(inner.id(), "restorePointCollections");
        this.vmRestorePointName = IdParsingUtils.getValueFromIdByName(inner.id(), "restorePoints");
        this.diskRestorePointName = IdParsingUtils.getValueFromIdByName(inner.id(), "diskRestorePoints");
    }

    @Override
    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<DiskRestorePointInner> getInnerAsync() {
        DiskRestorePointsInner client = this.manager().inner().diskRestorePoints();
        return client.getAsync(this.resourceGroupName, this.restorePointCollectionName, this.vmRestorePointName, this.diskRestorePointName);
    }



    @Override
    public Encryption encryption() {
        return this.inner().encryption();
    }

    @Override
    public String familyId() {
        return this.inner().familyId();
    }

    @Override
    public HyperVGeneration hyperVGeneration() {
        return this.inner().hyperVGeneration();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public OperatingSystemTypes osType() {
        return this.inner().osType();
    }

    @Override
    public PurchasePlan purchasePlan() {
        return this.inner().purchasePlan();
    }

    @Override
    public String sourceResourceId() {
        return this.inner().sourceResourceId();
    }

    @Override
    public String sourceUniqueId() {
        return this.inner().sourceUniqueId();
    }

    @Override
    public DateTime timeCreated() {
        return this.inner().timeCreated();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
