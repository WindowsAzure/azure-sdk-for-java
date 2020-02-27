/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.peering.v2020_01_01_preview.implementation;

import com.microsoft.azure.management.peering.v2020_01_01_preview.PeeringServiceCountry;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;

class PeeringServiceCountryImpl extends WrapperImpl<PeeringServiceCountryInner> implements PeeringServiceCountry {
    private final PeeringManager manager;

    PeeringServiceCountryImpl(PeeringServiceCountryInner inner,  PeeringManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public PeeringManager manager() {
        return this.manager;
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
    public String type() {
        return this.inner().type();
    }

}
