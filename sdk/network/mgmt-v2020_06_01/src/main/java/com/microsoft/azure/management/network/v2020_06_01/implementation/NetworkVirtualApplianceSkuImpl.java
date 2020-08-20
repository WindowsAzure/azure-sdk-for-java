/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2020_06_01.NetworkVirtualApplianceSku;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.network.v2020_06_01.NetworkVirtualApplianceSkuInstances;

class NetworkVirtualApplianceSkuImpl extends GroupableResourceCoreImpl<NetworkVirtualApplianceSku, NetworkVirtualApplianceSkuInner, NetworkVirtualApplianceSkuImpl, NetworkManager> implements NetworkVirtualApplianceSku {
    NetworkVirtualApplianceSkuImpl(String name, NetworkVirtualApplianceSkuInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<NetworkVirtualApplianceSku> createResourceAsync() {
        VirtualApplianceSkusInner client = this.manager().inner().virtualApplianceSkus();
        return null; // NOP createResourceAsync implementation as create is not supported
    }

    @Override
    public Observable<NetworkVirtualApplianceSku> updateResourceAsync() {
        VirtualApplianceSkusInner client = this.manager().inner().virtualApplianceSkus();
        return null; // NOP updateResourceAsync implementation as update is not supported
    }

    @Override
    protected Observable<NetworkVirtualApplianceSkuInner> getInnerAsync() {
        VirtualApplianceSkusInner client = this.manager().inner().virtualApplianceSkus();
        return null; // NOP getInnerAsync implementation as get is not supported
    }



    @Override
    public List<NetworkVirtualApplianceSkuInstances> availableScaleUnits() {
        return this.inner().availableScaleUnits();
    }

    @Override
    public List<String> availableVersions() {
        return this.inner().availableVersions();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String vendor() {
        return this.inner().vendor();
    }

}
