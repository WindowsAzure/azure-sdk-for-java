/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.apimanagement.v2019_01_01.ProductApis;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.apimanagement.v2019_01_01.ProductApiContract;

class ProductApisImpl extends WrapperImpl<ProductApisInner> implements ProductApis {
    private final ApiManagementManager manager;

    ProductApisImpl(ApiManagementManager manager) {
        super(manager.inner().productApis());
        this.manager = manager;
    }

    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public ProductApiContractImpl define(String name) {
        return wrapModel(name);
    }

    private ProductApiContractImpl wrapModel(ApiContractInner inner) {
        return  new ProductApiContractImpl(inner, manager());
    }

    private ProductApiContractImpl wrapModel(String name) {
        return new ProductApiContractImpl(name, this.manager());
    }

    @Override
    public Completable checkEntityExistsAsync(String resourceGroupName, String serviceName, String productId, String apiId) {
        ProductApisInner client = this.inner();
        return client.checkEntityExistsAsync(resourceGroupName, serviceName, productId, apiId).toCompletable();
    }

    @Override
    public Observable<ProductApiContract> listByProductAsync(final String resourceGroupName, final String serviceName, final String productId) {
        ProductApisInner client = this.inner();
        return client.listByProductAsync(resourceGroupName, serviceName, productId)
        .flatMapIterable(new Func1<Page<ApiContractInner>, Iterable<ApiContractInner>>() {
            @Override
            public Iterable<ApiContractInner> call(Page<ApiContractInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ApiContractInner, ProductApiContract>() {
            @Override
            public ProductApiContract call(ApiContractInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serviceName, String productId, String apiId) {
        ProductApisInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serviceName, productId, apiId).toCompletable();
    }

}
