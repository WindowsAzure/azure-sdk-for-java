/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.consumption.v2018_08_31.implementation;

import com.microsoft.azure.management.consumption.v2018_08_31.Forecast;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import java.math.BigDecimal;
import com.microsoft.azure.management.consumption.v2018_08_31.ChargeType;
import java.util.List;
import com.microsoft.azure.management.consumption.v2018_08_31.ForecastPropertiesConfidenceLevelsItem;
import com.microsoft.azure.management.consumption.v2018_08_31.Grain;
import java.util.Map;

class ForecastImpl extends WrapperImpl<ForecastInner> implements Forecast {
    private final ConsumptionManager manager;

    ForecastImpl(ForecastInner inner,  ConsumptionManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ConsumptionManager manager() {
        return this.manager;
    }



    @Override
    public BigDecimal charge() {
        return this.inner().charge();
    }

    @Override
    public ChargeType chargeType() {
        return this.inner().chargeType();
    }

    @Override
    public List<ForecastPropertiesConfidenceLevelsItem> confidenceLevels() {
        return this.inner().confidenceLevels();
    }

    @Override
    public String currency() {
        return this.inner().currency();
    }

    @Override
    public Grain grain() {
        return this.inner().grain();
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
    public Map<String, String> tags() {
        return this.inner().tags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String usageDate() {
        return this.inner().usageDate();
    }

}
