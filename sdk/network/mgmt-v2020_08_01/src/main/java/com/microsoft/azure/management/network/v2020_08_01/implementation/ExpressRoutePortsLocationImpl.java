/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2020_08_01.ExpressRoutePortsLocation;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.network.v2020_08_01.ExpressRoutePortsLocationBandwidths;
import com.microsoft.azure.management.network.v2020_08_01.ProvisioningState;

class ExpressRoutePortsLocationImpl extends GroupableResourceCoreImpl<ExpressRoutePortsLocation, ExpressRoutePortsLocationInner, ExpressRoutePortsLocationImpl, NetworkManager> implements ExpressRoutePortsLocation {
    ExpressRoutePortsLocationImpl(String name, ExpressRoutePortsLocationInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<ExpressRoutePortsLocation> createResourceAsync() {
        ExpressRoutePortsLocationsInner client = this.manager().inner().expressRoutePortsLocations();
        return null; // NOP createResourceAsync implementation as create is not supported
    }

    @Override
    public Observable<ExpressRoutePortsLocation> updateResourceAsync() {
        ExpressRoutePortsLocationsInner client = this.manager().inner().expressRoutePortsLocations();
        return null; // NOP updateResourceAsync implementation as update is not supported
    }

    @Override
    protected Observable<ExpressRoutePortsLocationInner> getInnerAsync() {
        ExpressRoutePortsLocationsInner client = this.manager().inner().expressRoutePortsLocations();
        return null; // NOP getInnerAsync implementation as get is not supported
    }



    @Override
    public String address() {
        return this.inner().address();
    }

    @Override
    public List<ExpressRoutePortsLocationBandwidths> availableBandwidths() {
        return this.inner().availableBandwidths();
    }

    @Override
    public String contact() {
        return this.inner().contact();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

}
