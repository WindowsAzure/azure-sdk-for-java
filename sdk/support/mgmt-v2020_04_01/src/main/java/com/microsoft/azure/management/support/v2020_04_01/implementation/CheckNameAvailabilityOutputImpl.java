/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.support.v2020_04_01.implementation;

import com.microsoft.azure.management.support.v2020_04_01.CheckNameAvailabilityOutput;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class CheckNameAvailabilityOutputImpl extends WrapperImpl<CheckNameAvailabilityOutputInner> implements CheckNameAvailabilityOutput {
    private final SupportManager manager;
    CheckNameAvailabilityOutputImpl(CheckNameAvailabilityOutputInner inner, SupportManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public SupportManager manager() {
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
