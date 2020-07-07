/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2018_06_30.implementation;

import com.microsoft.azure.management.consumption.v2018_06_30.PriceSheetResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.consumption.v2018_06_30.PriceSheetProperties;
import java.util.Map;

class PriceSheetResultImpl extends WrapperImpl<PriceSheetResultInner> implements PriceSheetResult {
    private final ConsumptionManager manager;
    PriceSheetResultImpl(PriceSheetResultInner inner, ConsumptionManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ConsumptionManager manager() {
        return this.manager;
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String nextLink() {
        return this.inner().nextLink();
    }

    @Override
    public List<PriceSheetProperties> pricesheets() {
        return this.inner().pricesheets();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().tags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
