/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.mysql.v2020_01_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.mysql.v2020_01_01.WaitStatistics;
import com.microsoft.azure.management.mysql.v2020_01_01.WaitStatisticsInput;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.mysql.v2020_01_01.WaitStatistic;

class WaitStatisticsImpl extends WrapperImpl<WaitStatisticsInner> implements WaitStatistics {
    private final MySQLManager manager;

    WaitStatisticsImpl(MySQLManager manager) {
        super(manager.inner().waitStatistics());
        this.manager = manager;
    }

    public MySQLManager manager() {
        return this.manager;
    }

    private WaitStatisticImpl wrapModel(WaitStatisticInner inner) {
        return  new WaitStatisticImpl(inner, manager());
    }

    @Override
    public Observable<WaitStatistic> listByServerAsync(final String resourceGroupName, final String serverName, final WaitStatisticsInput parameters) {
        WaitStatisticsInner client = this.inner();
        return client.listByServerAsync(resourceGroupName, serverName, parameters)
        .flatMapIterable(new Func1<Page<WaitStatisticInner>, Iterable<WaitStatisticInner>>() {
            @Override
            public Iterable<WaitStatisticInner> call(Page<WaitStatisticInner> page) {
                return page.items();
            }
        })
        .map(new Func1<WaitStatisticInner, WaitStatistic>() {
            @Override
            public WaitStatistic call(WaitStatisticInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<WaitStatistic> getAsync(String resourceGroupName, String serverName, String waitStatisticsId) {
        WaitStatisticsInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName, waitStatisticsId)
        .flatMap(new Func1<WaitStatisticInner, Observable<WaitStatistic>>() {
            @Override
            public Observable<WaitStatistic> call(WaitStatisticInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((WaitStatistic)wrapModel(inner));
                }
            }
       });
    }

}
