/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.postgresql.v2017_12_01_preview.implementation;

import com.microsoft.azure.management.postgresql.v2017_12_01_preview.NameAvailability;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class NameAvailabilityImpl extends WrapperImpl<NameAvailabilityInner> implements NameAvailability {
    private final PostgreSQLManager manager;
    NameAvailabilityImpl(NameAvailabilityInner inner, PostgreSQLManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public PostgreSQLManager manager() {
        return this.manager;
    }

    @Override
    public String message() {
        return this.inner().message();
    }

    @Override
    public Boolean nameAvailable() {
        return this.inner().nameAvailable();
    }

    @Override
    public String reason() {
        return this.inner().reason();
    }

}
