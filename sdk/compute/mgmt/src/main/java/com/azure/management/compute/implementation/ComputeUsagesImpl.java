// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.management.compute.implementation;

import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.management.compute.models.ComputeUsage;
import com.azure.management.compute.models.ComputeUsages;
import com.azure.management.compute.ComputeManagementClient;
import com.azure.management.compute.fluent.inner.UsageInner;
import com.azure.management.resources.fluentcore.arm.Region;
import com.azure.management.resources.fluentcore.arm.collection.implementation.ReadableWrappersImpl;

/** The implementation of {@link ComputeUsages}. */
public class ComputeUsagesImpl extends ReadableWrappersImpl<ComputeUsage, ComputeUsageImpl, UsageInner>
    implements ComputeUsages {
    private final ComputeManagementClient client;

    public ComputeUsagesImpl(ComputeManagementClient client) {
        this.client = client;
    }

    @Override
    public PagedIterable<ComputeUsage> listByRegion(Region region) {
        return listByRegion(region.name());
    }

    @Override
    public PagedIterable<ComputeUsage> listByRegion(String regionName) {
        return wrapList(client.getUsages().list(regionName));
    }

    @Override
    public PagedFlux<ComputeUsage> listByRegionAsync(Region region) {
        return listByRegionAsync(region.name());
    }

    @Override
    public PagedFlux<ComputeUsage> listByRegionAsync(String regionName) {
        return wrapPageAsync(client.getUsages().listAsync(regionName));
    }

    @Override
    protected ComputeUsageImpl wrapModel(UsageInner usageInner) {
        if (usageInner == null) {
            return null;
        }
        return new ComputeUsageImpl(usageInner);
    }
}
