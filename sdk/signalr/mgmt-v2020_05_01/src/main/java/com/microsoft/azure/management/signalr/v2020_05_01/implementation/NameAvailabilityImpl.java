/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr.v2020_05_01.implementation;

import com.microsoft.azure.management.signalr.v2020_05_01.NameAvailability;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class NameAvailabilityImpl extends WrapperImpl<NameAvailabilityInner> implements NameAvailability {
    private final SignalRServiceManager manager;
    NameAvailabilityImpl(NameAvailabilityInner inner, SignalRServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public SignalRServiceManager manager() {
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
