/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2019_07_01_preview.implementation;

import com.microsoft.azure.management.iothub.v2019_07_01_preview.UserSubscriptionQuota;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.iothub.v2019_07_01_preview.Name;

class UserSubscriptionQuotaImpl extends WrapperImpl<UserSubscriptionQuotaInner> implements UserSubscriptionQuota {
    private final DevicesManager manager;
    UserSubscriptionQuotaImpl(UserSubscriptionQuotaInner inner, DevicesManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DevicesManager manager() {
        return this.manager;
    }

    @Override
    public Integer currentValue() {
        return this.inner().currentValue();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Integer limit() {
        return this.inner().limit();
    }

    @Override
    public Name name() {
        return this.inner().name();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String unit() {
        return this.inner().unit();
    }

}
