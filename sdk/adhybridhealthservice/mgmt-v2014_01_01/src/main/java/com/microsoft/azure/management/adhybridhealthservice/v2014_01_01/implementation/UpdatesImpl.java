/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.Updates;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.IPAddressAggregateSetting;

class UpdatesImpl extends WrapperImpl<UpdatesInner> implements Updates {
    private final ADHybridHealthServiceManager manager;

    UpdatesImpl(ADHybridHealthServiceManager manager) {
        super(manager.inner().updates());
        this.manager = manager;
    }

    public ADHybridHealthServiceManager manager() {
        return this.manager;
    }

    @Override
    public Observable<IPAddressAggregateSetting> iPAddressAggregateSettingsAsync(String serviceName, IPAddressAggregateSettingInner iPAddressAggregateSetting) {
        UpdatesInner client = this.inner();
        return client.iPAddressAggregateSettingsAsync(serviceName, iPAddressAggregateSetting)
        .map(new Func1<IPAddressAggregateSettingInner, IPAddressAggregateSetting>() {
            @Override
            public IPAddressAggregateSetting call(IPAddressAggregateSettingInner inner) {
                return new IPAddressAggregateSettingImpl(inner, manager());
            }
        });
    }

}
