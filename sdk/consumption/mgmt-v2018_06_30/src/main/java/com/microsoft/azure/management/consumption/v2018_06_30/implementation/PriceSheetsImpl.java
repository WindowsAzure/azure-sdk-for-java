/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.consumption.v2018_06_30.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.consumption.v2018_06_30.PriceSheets;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.consumption.v2018_06_30.PriceSheetResult;

class PriceSheetsImpl extends WrapperImpl<PriceSheetsInner> implements PriceSheets {
    private final ConsumptionManager manager;

    PriceSheetsImpl(ConsumptionManager manager) {
        super(manager.inner().priceSheets());
        this.manager = manager;
    }

    public ConsumptionManager manager() {
        return this.manager;
    }

    @Override
    public Observable<PriceSheetResult> getAsync() {
        PriceSheetsInner client = this.inner();
        return client.getAsync()
        .map(new Func1<PriceSheetResultInner, PriceSheetResult>() {
            @Override
            public PriceSheetResult call(PriceSheetResultInner inner) {
                return new PriceSheetResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<PriceSheetResult> getByBillingPeriodAsync(String billingPeriodName) {
        PriceSheetsInner client = this.inner();
        return client.getByBillingPeriodAsync(billingPeriodName)
        .map(new Func1<PriceSheetResultInner, PriceSheetResult>() {
            @Override
            public PriceSheetResult call(PriceSheetResultInner inner) {
                return new PriceSheetResultImpl(inner, manager());
            }
        });
    }

}
