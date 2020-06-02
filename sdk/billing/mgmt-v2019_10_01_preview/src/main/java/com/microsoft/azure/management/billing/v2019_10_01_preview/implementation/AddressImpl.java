/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.billing.v2019_10_01_preview.Address;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.billing.v2019_10_01_preview.ValidateAddressResponse;
import com.microsoft.azure.management.billing.v2019_10_01_preview.AddressDetails;

class AddressImpl extends WrapperImpl<AddressInner> implements Address {
    private final BillingManager manager;

    AddressImpl(BillingManager manager) {
        super(manager.inner().address());
        this.manager = manager;
    }

    public BillingManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ValidateAddressResponse> validateAsync(AddressDetails address) {
        AddressInner client = this.inner();
        return client.validateAsync(address)
        .map(new Func1<ValidateAddressResponseInner, ValidateAddressResponse>() {
            @Override
            public ValidateAddressResponse call(ValidateAddressResponseInner inner) {
                return new ValidateAddressResponseImpl(inner, manager());
            }
        });
    }

}
