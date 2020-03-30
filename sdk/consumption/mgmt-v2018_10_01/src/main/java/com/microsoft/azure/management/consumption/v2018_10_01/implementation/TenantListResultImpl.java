/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2018_10_01.implementation;

import com.microsoft.azure.management.consumption.v2018_10_01.TenantListResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class TenantListResultImpl extends WrapperImpl<TenantListResultInner> implements TenantListResult {
    private final ConsumptionManager manager;
    TenantListResultImpl(TenantListResultInner inner, ConsumptionManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ConsumptionManager manager() {
        return this.manager;
    }

    @Override
    public String nextLink() {
        return this.inner().nextLink();
    }

    @Override
    public List<TenantInner> value() {
        return this.inner().value();
    }

}
