/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.mysql.v2017_12_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.mysql.v2017_12_01_preview.CheckNameAvailabilitys;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.mysql.v2017_12_01_preview.NameAvailability;
import com.microsoft.azure.management.mysql.v2017_12_01_preview.NameAvailabilityRequest;

class CheckNameAvailabilitysImpl extends WrapperImpl<CheckNameAvailabilitysInner> implements CheckNameAvailabilitys {
    private final DBforMySQLManager manager;

    CheckNameAvailabilitysImpl(DBforMySQLManager manager) {
        super(manager.inner().checkNameAvailabilitys());
        this.manager = manager;
    }

    public DBforMySQLManager manager() {
        return this.manager;
    }

    @Override
    public Observable<NameAvailability> executeAsync(NameAvailabilityRequest nameAvailabilityRequest) {
        CheckNameAvailabilitysInner client = this.inner();
        return client.executeAsync(nameAvailabilityRequest)
        .map(new Func1<NameAvailabilityInner, NameAvailability>() {
            @Override
            public NameAvailability call(NameAvailabilityInner inner) {
                return new NameAvailabilityImpl(inner, manager());
            }
        });
    }

}
