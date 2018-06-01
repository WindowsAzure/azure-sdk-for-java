/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * jkl
 */

package com.microsoft.azure.management.appservice.v2016_03_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.appservice.v2016_03_01.BillingMeters;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.arm.utils.PagedListConverter;
import com.microsoft.azure.management.appservice.v2016_03_01.BillingMeter;

class BillingMetersImpl extends WrapperImpl<BillingMetersInner> implements BillingMeters {
    private PagedListConverter<BillingMeterInner, BillingMeter> converter;
    private final AppServiceManager manager;

    BillingMetersImpl(AppServiceManager manager) {
        super(manager.inner().billingMeters());
        this.manager = manager;
        this.converter = new PagedListConverter<BillingMeterInner, BillingMeter>() {
            @Override
            public Observable<BillingMeter> typeConvertAsync(BillingMeterInner inner) {
                return Observable.just((BillingMeter) wrapModel(inner));
            }
        };
    }

    public AppServiceManager manager() {
        return this.manager;
    }

    private BillingMeterImpl wrapModel(BillingMeterInner inner) {
        return  new BillingMeterImpl(inner, manager());
    }

    @Override
    public PagedList<BillingMeter> list() {
        BillingMetersInner client = this.inner();
        return converter.convert(client.list());
    }

    private Observable<Page<BillingMeterInner>> listNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        BillingMetersInner client = this.inner();
        return client.listNextAsync(nextLink)
        .flatMap(new Func1<Page<BillingMeterInner>, Observable<Page<BillingMeterInner>>>() {
            @Override
            public Observable<Page<BillingMeterInner>> call(Page<BillingMeterInner> page) {
                return Observable.just(page).concatWith(listNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<BillingMeter> listAsync() {
        BillingMetersInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<Page<BillingMeterInner>, Observable<Page<BillingMeterInner>>>() {
            @Override
            public Observable<Page<BillingMeterInner>> call(Page<BillingMeterInner> page) {
                return listNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<BillingMeterInner>, Iterable<BillingMeterInner>>() {
            @Override
            public Iterable<BillingMeterInner> call(Page<BillingMeterInner> page) {
                return page.items();
            }
        })
        .map(new Func1<BillingMeterInner, BillingMeter>() {
            @Override
            public BillingMeter call(BillingMeterInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
