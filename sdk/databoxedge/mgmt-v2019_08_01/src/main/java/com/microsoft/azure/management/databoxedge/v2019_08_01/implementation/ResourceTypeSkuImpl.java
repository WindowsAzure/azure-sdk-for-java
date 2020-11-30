/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.databoxedge.v2019_08_01.implementation;

import com.microsoft.azure.management.databoxedge.v2019_08_01.ResourceTypeSku;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.databoxedge.v2019_08_01.SkuCost;
import com.microsoft.azure.management.databoxedge.v2019_08_01.SkuLocationInfo;
import com.microsoft.azure.management.databoxedge.v2019_08_01.SkuName;
import com.microsoft.azure.management.databoxedge.v2019_08_01.SkuRestriction;
import com.microsoft.azure.management.databoxedge.v2019_08_01.SkuTier;

class ResourceTypeSkuImpl extends WrapperImpl<ResourceTypeSkuInner> implements ResourceTypeSku {
    private final DataBoxEdgeManager manager;

    ResourceTypeSkuImpl(ResourceTypeSkuInner inner,  DataBoxEdgeManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DataBoxEdgeManager manager() {
        return this.manager;
    }



    @Override
    public List<String> apiVersions() {
        return this.inner().apiVersions();
    }

    @Override
    public List<SkuCost> costs() {
        return this.inner().costs();
    }

    @Override
    public String family() {
        return this.inner().family();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public List<SkuLocationInfo> locationInfo() {
        return this.inner().locationInfo();
    }

    @Override
    public List<String> locations() {
        return this.inner().locations();
    }

    @Override
    public SkuName name() {
        return this.inner().name();
    }

    @Override
    public String resourceType() {
        return this.inner().resourceType();
    }

    @Override
    public List<SkuRestriction> restrictions() {
        return this.inner().restrictions();
    }

    @Override
    public SkuTier tier() {
        return this.inner().tier();
    }

}
