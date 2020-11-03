/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.frontdoor.v2020_05_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.frontdoor.v2020_05_01.FrontDoorNameAvailabilitys;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.frontdoor.v2020_05_01.CheckNameAvailabilityOutput;
import com.microsoft.azure.management.frontdoor.v2020_05_01.CheckNameAvailabilityInput;

class FrontDoorNameAvailabilitysImpl extends WrapperImpl<FrontDoorNameAvailabilitysInner> implements FrontDoorNameAvailabilitys {
    private final NetworkManager manager;

    FrontDoorNameAvailabilitysImpl(NetworkManager manager) {
        super(manager.inner().frontDoorNameAvailabilitys());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Observable<CheckNameAvailabilityOutput> checkAsync(CheckNameAvailabilityInput checkFrontDoorNameAvailabilityInput) {
        FrontDoorNameAvailabilitysInner client = this.inner();
        return client.checkAsync(checkFrontDoorNameAvailabilityInput)
        .map(new Func1<CheckNameAvailabilityOutputInner, CheckNameAvailabilityOutput>() {
            @Override
            public CheckNameAvailabilityOutput call(CheckNameAvailabilityOutputInner inner) {
                return new CheckNameAvailabilityOutputImpl(inner, manager());
            }
        });
    }

}
