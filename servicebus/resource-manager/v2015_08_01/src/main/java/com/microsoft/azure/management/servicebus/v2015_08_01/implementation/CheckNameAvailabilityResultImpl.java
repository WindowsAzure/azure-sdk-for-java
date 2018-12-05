/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2015_08_01.implementation;

import com.microsoft.azure.management.servicebus.v2015_08_01.CheckNameAvailabilityResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.servicebus.v2015_08_01.UnavailableReason;

class CheckNameAvailabilityResultImpl extends WrapperImpl<CheckNameAvailabilityResultInner> implements CheckNameAvailabilityResult {
    private final ServiceBusManager manager;
    CheckNameAvailabilityResultImpl(CheckNameAvailabilityResultInner inner, ServiceBusManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ServiceBusManager manager() {
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
    public UnavailableReason reason() {
        return this.inner().reason();
    }

}
