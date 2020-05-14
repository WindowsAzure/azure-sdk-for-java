/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.consumption.v2018_10_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.consumption.v2018_10_01.Charges;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.consumption.v2018_10_01.ChargesListResult;
import com.microsoft.azure.management.consumption.v2018_10_01.ChargeSummary;

class ChargesImpl extends WrapperImpl<ChargesInner> implements Charges {
    private final ConsumptionManager manager;

    ChargesImpl(ConsumptionManager manager) {
        super(manager.inner().charges());
        this.manager = manager;
    }

    public ConsumptionManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ChargesListResult> listByEnrollmentAccountAsync(String billingAccountId, String enrollmentAccountId) {
        ChargesInner client = this.inner();
        return client.listByEnrollmentAccountAsync(billingAccountId, enrollmentAccountId)
        .map(new Func1<ChargesListResultInner, ChargesListResult>() {
            @Override
            public ChargesListResult call(ChargesListResultInner inner) {
                return new ChargesListResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ChargeSummary> listForBillingPeriodByEnrollmentAccountAsync(String billingAccountId, String enrollmentAccountId, String billingPeriodName) {
        ChargesInner client = this.inner();
        return client.listForBillingPeriodByEnrollmentAccountAsync(billingAccountId, enrollmentAccountId, billingPeriodName)
        .map(new Func1<ChargeSummaryInner, ChargeSummary>() {
            @Override
            public ChargeSummary call(ChargeSummaryInner inner) {
                return new ChargeSummaryImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ChargesListResult> listByDepartmentAsync(String billingAccountId, String departmentId) {
        ChargesInner client = this.inner();
        return client.listByDepartmentAsync(billingAccountId, departmentId)
        .map(new Func1<ChargesListResultInner, ChargesListResult>() {
            @Override
            public ChargesListResult call(ChargesListResultInner inner) {
                return new ChargesListResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ChargeSummary> listForBillingPeriodByDepartmentAsync(String billingAccountId, String departmentId, String billingPeriodName) {
        ChargesInner client = this.inner();
        return client.listForBillingPeriodByDepartmentAsync(billingAccountId, departmentId, billingPeriodName)
        .map(new Func1<ChargeSummaryInner, ChargeSummary>() {
            @Override
            public ChargeSummary call(ChargeSummaryInner inner) {
                return new ChargeSummaryImpl(inner, manager());
            }
        });
    }

}
