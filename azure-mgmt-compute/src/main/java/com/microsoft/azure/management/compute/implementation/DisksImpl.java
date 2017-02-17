/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.compute.implementation;

import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.management.compute.AccessLevel;
import com.microsoft.azure.management.compute.Disk;
import com.microsoft.azure.management.compute.Disks;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.implementation.GroupableResourcesImpl;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.implementation.ListableGroupableResourcesPageImpl;
import rx.Completable;
import rx.Observable;

/**
 * The implementation for Disks.
 */
@LangDefinition
class DisksImpl
        extends ListableGroupableResourcesPageImpl<
            Disk,
            DiskImpl,
            DiskInner,
            DisksInner,
            ComputeManager>
        implements Disks {

    DisksImpl(ComputeManager computeManager) {
        super(computeManager.inner().disks(), computeManager);
    }

    @Override
    public String grantAccess(String resourceGroupName,
                              String diskName,
                              AccessLevel accessLevel,
                              int accessDuration) {
        GrantAccessDataInner grantAccessDataInner = new GrantAccessDataInner();
        grantAccessDataInner.withAccess(accessLevel)
                .withDurationInSeconds(accessDuration);
        AccessUriInner accessUriInner = this.inner().grantAccess(resourceGroupName,
                diskName, grantAccessDataInner);
        return accessUriInner.accessSAS();
    }

    @Override
    public void revokeAccess(String resourceGroupName, String diskName) {
        this.inner().revokeAccess(resourceGroupName, diskName);
    }

    @Override
    public Completable deleteByGroupAsync(String groupName, String name) {
        return this.inner().deleteAsync(groupName, name).toCompletable();
    }

    @Override
    public Disk getByGroup(String resourceGroupName, String name) {
        DiskInner inner = this.inner().get(resourceGroupName, name);
        return wrapModel(inner);
    }

    @Override
    public PagedList<Disk> listByGroup(String resourceGroupName) {
        return wrapList(this.inner().listByResourceGroup(resourceGroupName));
    }

    @Override
    public PagedList<Disk> list() {
        return wrapList(this.inner().list());
    }

    @Override
    protected DiskImpl wrapModel(String name) {
        return new DiskImpl(name, new DiskInner(), this.manager());
    }

    @Override
    protected DiskImpl wrapModel(DiskInner inner) {
        return new DiskImpl(inner.name(), inner, this.manager());
    }

    @Override
    public Disk.DefinitionStages.Blank define(String name) {
        return this.wrapModel(name);
    }

    @Override
    protected Observable<Page<DiskInner>> listAsyncPage() {
        return inner().listAsync();
    }

    @Override
    protected Observable<Page<DiskInner>> listByGroupAsyncPage(String resourceGroupName) {
        return inner().listByResourceGroupAsync(resourceGroupName);
    }
}