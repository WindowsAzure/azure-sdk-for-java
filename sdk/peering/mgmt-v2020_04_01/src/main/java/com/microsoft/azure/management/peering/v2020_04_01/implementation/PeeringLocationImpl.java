/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.v2020_04_01.implementation;

import com.microsoft.azure.management.peering.v2020_04_01.PeeringLocation;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.peering.v2020_04_01.PeeringLocationPropertiesDirect;
import com.microsoft.azure.management.peering.v2020_04_01.PeeringLocationPropertiesExchange;
import com.microsoft.azure.management.peering.v2020_04_01.Kind;

class PeeringLocationImpl extends WrapperImpl<PeeringLocationInner> implements PeeringLocation {
    private final PeeringManager manager;
    PeeringLocationImpl(PeeringLocationInner inner, PeeringManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public PeeringManager manager() {
        return this.manager;
    }

    @Override
    public String azureRegion() {
        return this.inner().azureRegion();
    }

    @Override
    public String country() {
        return this.inner().country();
    }

    @Override
    public PeeringLocationPropertiesDirect direct() {
        return this.inner().direct();
    }

    @Override
    public PeeringLocationPropertiesExchange exchange() {
        return this.inner().exchange();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Kind kind() {
        return this.inner().kind();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String peeringLocation() {
        return this.inner().peeringLocation();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
