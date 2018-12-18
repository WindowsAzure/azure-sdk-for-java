/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

import com.microsoft.azure.management.sql.v2014_04_01.LocationCapabilities;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v2014_04_01.CapabilityStatus;
import java.util.List;
import com.microsoft.azure.management.sql.v2014_04_01.ServerVersionCapability;

class LocationCapabilitiesImpl extends WrapperImpl<LocationCapabilitiesInner> implements LocationCapabilities {
    private final SqlManager manager;
    LocationCapabilitiesImpl(LocationCapabilitiesInner inner, SqlManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public CapabilityStatus status() {
        return this.inner().status();
    }

    @Override
    public List<ServerVersionCapability> supportedServerVersions() {
        return this.inner().supportedServerVersions();
    }

}
