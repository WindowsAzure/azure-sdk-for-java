/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storageimportexport.v2016_11_01.implementation;

import com.microsoft.azure.management.storageimportexport.v2016_11_01.Location;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class LocationImpl extends WrapperImpl<LocationInner> implements Location {
    private final StorageImportExportManager manager;
    LocationImpl(LocationInner inner, StorageImportExportManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public StorageImportExportManager manager() {
        return this.manager;
    }

    @Override
    public List<String> alternateLocations() {
        return this.inner().alternateLocations();
    }

    @Override
    public String city() {
        return this.inner().city();
    }

    @Override
    public String countryOrRegion() {
        return this.inner().countryOrRegion();
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
    public String phone() {
        return this.inner().phone();
    }

    @Override
    public String postalCode() {
        return this.inner().postalCode();
    }

    @Override
    public String recipientName() {
        return this.inner().recipientName();
    }

    @Override
    public String stateOrProvince() {
        return this.inner().stateOrProvince();
    }

    @Override
    public String streetAddress1() {
        return this.inner().streetAddress1();
    }

    @Override
    public String streetAddress2() {
        return this.inner().streetAddress2();
    }

    @Override
    public List<String> supportedCarriers() {
        return this.inner().supportedCarriers();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
