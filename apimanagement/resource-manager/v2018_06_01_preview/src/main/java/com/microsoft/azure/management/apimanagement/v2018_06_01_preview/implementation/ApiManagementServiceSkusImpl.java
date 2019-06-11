/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.ApiManagementServiceSkus;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.ResourceSkuResult;

class ApiManagementServiceSkusImpl extends WrapperImpl<ApiManagementServiceSkusInner> implements ApiManagementServiceSkus {
    private final ApiManagementManager manager;

    ApiManagementServiceSkusImpl(ApiManagementManager manager) {
        super(manager.inner().apiManagementServiceSkus());
        this.manager = manager;
    }

    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ResourceSkuResult> listAvailableServiceSkusAsync(final String resourceGroupName, final String serviceName) {
        ApiManagementServiceSkusInner client = this.inner();
        return client.listAvailableServiceSkusAsync(resourceGroupName, serviceName)
        .flatMapIterable(new Func1<Page<ResourceSkuResultInner>, Iterable<ResourceSkuResultInner>>() {
            @Override
            public Iterable<ResourceSkuResultInner> call(Page<ResourceSkuResultInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ResourceSkuResultInner, ResourceSkuResult>() {
            @Override
            public ResourceSkuResult call(ResourceSkuResultInner inner) {
                return new ResourceSkuResultImpl(inner, manager());
            }
        });
    }

}
