/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.searchmanagementclient.v2015_08_19.implementation;

import com.microsoft.azure.management.searchmanagementclient.v2015_08_19.CheckNameAvailabilityOutput;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.searchmanagementclient.v2015_08_19.UnavailableNameReason;

class CheckNameAvailabilityOutputImpl extends WrapperImpl<CheckNameAvailabilityOutputInner> implements CheckNameAvailabilityOutput {
    private final SearchManager manager;
    CheckNameAvailabilityOutputImpl(CheckNameAvailabilityOutputInner inner, SearchManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public SearchManager manager() {
        return this.manager;
    }

    @Override
    public Boolean isNameAvailable() {
        return this.inner().isNameAvailable();
    }

    @Override
    public String message() {
        return this.inner().message();
    }

    @Override
    public UnavailableNameReason reason() {
        return this.inner().reason();
    }

}
