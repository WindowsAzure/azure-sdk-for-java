/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.Favorites;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.ApplicationInsightsComponentFavorite;

class FavoritesImpl extends WrapperImpl<FavoritesInner> implements Favorites {
    private final InsightsManager manager;

    FavoritesImpl(InsightsManager manager) {
        super(manager.inner().favorites());
        this.manager = manager;
    }

    public InsightsManager manager() {
        return this.manager;
    }

    @Override
    public ApplicationInsightsComponentFavoriteImpl define(String name) {
        return wrapModel(name);
    }

    private ApplicationInsightsComponentFavoriteImpl wrapModel(ApplicationInsightsComponentFavoriteInner inner) {
        return  new ApplicationInsightsComponentFavoriteImpl(inner, manager());
    }

    private ApplicationInsightsComponentFavoriteImpl wrapModel(String name) {
        return new ApplicationInsightsComponentFavoriteImpl(name, this.manager());
    }

    @Override
    public Observable<ApplicationInsightsComponentFavorite> listAsync(String resourceGroupName, String resourceName) {
        FavoritesInner client = this.inner();
        return client.listAsync(resourceGroupName, resourceName)
        .flatMap(new Func1<List<ApplicationInsightsComponentFavoriteInner>, Observable<ApplicationInsightsComponentFavoriteInner>>() {
            @Override
            public Observable<ApplicationInsightsComponentFavoriteInner> call(List<ApplicationInsightsComponentFavoriteInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<ApplicationInsightsComponentFavoriteInner, ApplicationInsightsComponentFavorite>() {
            @Override
            public ApplicationInsightsComponentFavorite call(ApplicationInsightsComponentFavoriteInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ApplicationInsightsComponentFavorite> getAsync(String resourceGroupName, String resourceName, String favoriteId) {
        FavoritesInner client = this.inner();
        return client.getAsync(resourceGroupName, resourceName, favoriteId)
        .map(new Func1<ApplicationInsightsComponentFavoriteInner, ApplicationInsightsComponentFavorite>() {
            @Override
            public ApplicationInsightsComponentFavorite call(ApplicationInsightsComponentFavoriteInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String resourceName, String favoriteId) {
        FavoritesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, resourceName, favoriteId).toCompletable();
    }

}
