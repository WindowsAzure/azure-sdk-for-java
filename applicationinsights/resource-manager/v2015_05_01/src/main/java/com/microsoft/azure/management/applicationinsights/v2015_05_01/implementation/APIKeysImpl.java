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
import com.microsoft.azure.management.applicationinsights.v2015_05_01.APIKeys;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.ApplicationInsightsComponentAPIKey;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.APIKeyRequest;

class APIKeysImpl extends WrapperImpl<APIKeysInner> implements APIKeys {
    private final InsightsManager manager;

    APIKeysImpl(InsightsManager manager) {
        super(manager.inner().aPIKeys());
        this.manager = manager;
    }

    public InsightsManager manager() {
        return this.manager;
    }

    private ApplicationInsightsComponentAPIKeyImpl wrapModel(ApplicationInsightsComponentAPIKeyInner inner) {
        return  new ApplicationInsightsComponentAPIKeyImpl(inner, manager());
    }

    @Override
    public Observable<ApplicationInsightsComponentAPIKey> listAsync(String resourceGroupName, String resourceName) {
        APIKeysInner client = this.inner();
        return client.listAsync(resourceGroupName, resourceName)
        .flatMap(new Func1<List<ApplicationInsightsComponentAPIKeyInner>, Observable<ApplicationInsightsComponentAPIKeyInner>>() {
            @Override
            public Observable<ApplicationInsightsComponentAPIKeyInner> call(List<ApplicationInsightsComponentAPIKeyInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<ApplicationInsightsComponentAPIKeyInner, ApplicationInsightsComponentAPIKey>() {
            @Override
            public ApplicationInsightsComponentAPIKey call(ApplicationInsightsComponentAPIKeyInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ApplicationInsightsComponentAPIKey> getAsync(String resourceGroupName, String resourceName, String keyId) {
        APIKeysInner client = this.inner();
        return client.getAsync(resourceGroupName, resourceName, keyId)
        .map(new Func1<ApplicationInsightsComponentAPIKeyInner, ApplicationInsightsComponentAPIKey>() {
            @Override
            public ApplicationInsightsComponentAPIKey call(ApplicationInsightsComponentAPIKeyInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String resourceName, String keyId) {
        APIKeysInner client = this.inner();
        return client.deleteAsync(resourceGroupName, resourceName, keyId).toCompletable();
    }

    @Override
    public Observable<ApplicationInsightsComponentAPIKey> createAsync(String resourceGroupName, String resourceName, APIKeyRequest aPIKeyProperties) {
        APIKeysInner client = this.inner();
        return client.createAsync(resourceGroupName, resourceName, aPIKeyProperties)
        .map(new Func1<ApplicationInsightsComponentAPIKeyInner, ApplicationInsightsComponentAPIKey>() {
            @Override
            public ApplicationInsightsComponentAPIKey call(ApplicationInsightsComponentAPIKeyInner inner) {
                return new ApplicationInsightsComponentAPIKeyImpl(inner, manager());
            }
        });
    }

}
