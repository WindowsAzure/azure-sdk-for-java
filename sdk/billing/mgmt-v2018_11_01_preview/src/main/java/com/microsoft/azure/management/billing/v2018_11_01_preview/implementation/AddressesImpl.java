/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.billing.v2018_11_01_preview.Addresses;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.billing.v2018_11_01_preview.ValidateAddressResponse;

class AddressesImpl extends WrapperImpl<AddressesInner> implements Addresses {
    private final BillingManager manager;

    AddressesImpl(BillingManager manager) {
        super(manager.inner().addresses());
        this.manager = manager;
    }

    public BillingManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ValidateAddressResponse> validateAsync(AddressInner address) {
        AddressesInner client = this.inner();
        return client.validateAsync(address)
        .map(new Func1<ValidateAddressResponseInner, ValidateAddressResponse>() {
            @Override
            public ValidateAddressResponse call(ValidateAddressResponseInner inner) {
                return new ValidateAddressResponseImpl(inner, manager());
            }
        });
    }

}
