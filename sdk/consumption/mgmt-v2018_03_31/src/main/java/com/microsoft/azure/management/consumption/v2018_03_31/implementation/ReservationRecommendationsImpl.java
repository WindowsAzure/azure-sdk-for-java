/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.consumption.v2018_03_31.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.consumption.v2018_03_31.ReservationRecommendations;
import com.microsoft.azure.management.consumption.v2018_03_31.ReservationRecommendationsModel;
import rx.Observable;
import rx.Completable;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;

class ReservationRecommendationsImpl extends GroupableResourcesCoreImpl<ReservationRecommendationsModel, ReservationRecommendationsModelImpl, ReservationRecommendationsModelInner, ReservationRecommendationsInner, ConsumptionManager>  implements ReservationRecommendations {
    protected ReservationRecommendationsImpl(ConsumptionManager manager) {
        super(manager.inner().reservationRecommendations(), manager);
    }

    @Override
    protected Observable<ReservationRecommendationsModelInner> getInnerAsync(String resourceGroupName, String name) {
        return null; // NOP Retrieve by resource group not supported
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        ReservationRecommendationsInner client = this.inner();
        return Completable.error(new Throwable("Delete by RG not supported for this resource")); // NOP Delete by RG not supported
    }

    @Override
    public PagedList<ReservationRecommendationsModel> list() {
        ReservationRecommendationsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<ReservationRecommendationsModel> listAsync() {
        ReservationRecommendationsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ReservationRecommendationsModelInner>, Iterable<ReservationRecommendationsModelInner>>() {
            @Override
            public Iterable<ReservationRecommendationsModelInner> call(Page<ReservationRecommendationsModelInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ReservationRecommendationsModelInner, ReservationRecommendationsModel>() {
            @Override
            public ReservationRecommendationsModel call(ReservationRecommendationsModelInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    protected ReservationRecommendationsModelImpl wrapModel(ReservationRecommendationsModelInner inner) {
        return  new ReservationRecommendationsModelImpl(inner.name(), inner, manager());
    }

    @Override
    protected ReservationRecommendationsModelImpl wrapModel(String name) {
        return null; // Model is not creatable
    }

}
