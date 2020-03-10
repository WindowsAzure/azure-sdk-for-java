/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.azurestack.v2017_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.azurestack.v2017_06_01.Products;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.azurestack.v2017_06_01.DeviceConfiguration;
import com.microsoft.azure.management.azurestack.v2017_06_01.ExtendedProduct;
import com.microsoft.azure.management.azurestack.v2017_06_01.MarketplaceProductLogUpdate;
import com.microsoft.azure.management.azurestack.v2017_06_01.ProductList;
import com.microsoft.azure.management.azurestack.v2017_06_01.Product;
import com.microsoft.azure.management.azurestack.v2017_06_01.ProductLog;

class ProductsImpl extends WrapperImpl<ProductsInner> implements Products {
    private final AzureStackManager manager;

    ProductsImpl(AzureStackManager manager) {
        super(manager.inner().products());
        this.manager = manager;
    }

    public AzureStackManager manager() {
        return this.manager;
    }

    private ProductImpl wrapModel(ProductInner inner) {
        return  new ProductImpl(inner, manager());
    }

    @Override
    public Observable<ExtendedProduct> listDetailsAsync(String resourceGroup, String registrationName, String productName) {
        ProductsInner client = this.inner();
        return client.listDetailsAsync(resourceGroup, registrationName, productName)
        .map(new Func1<ExtendedProductInner, ExtendedProduct>() {
            @Override
            public ExtendedProduct call(ExtendedProductInner inner) {
                return new ExtendedProductImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ProductList> getProductsAsync(String resourceGroup, String registrationName, DeviceConfiguration deviceConfiguration) {
        ProductsInner client = this.inner();
        return client.getProductsAsync(resourceGroup, registrationName, deviceConfiguration)
        .map(new Func1<ProductListInner, ProductList>() {
            @Override
            public ProductList call(ProductListInner inner) {
                return new ProductListImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Product> getProductAsync(String resourceGroup, String registrationName, String productName, DeviceConfiguration deviceConfiguration) {
        ProductsInner client = this.inner();
        return client.getProductAsync(resourceGroup, registrationName, productName, deviceConfiguration)
        .map(new Func1<ProductInner, Product>() {
            @Override
            public Product call(ProductInner inner) {
                return new ProductImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ProductLog> uploadLogAsync(String resourceGroup, String registrationName, String productName, MarketplaceProductLogUpdate marketplaceProductLogUpdate) {
        ProductsInner client = this.inner();
        return client.uploadLogAsync(resourceGroup, registrationName, productName, marketplaceProductLogUpdate)
        .map(new Func1<ProductLogInner, ProductLog>() {
            @Override
            public ProductLog call(ProductLogInner inner) {
                return new ProductLogImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Product> listAsync(final String resourceGroup, final String registrationName) {
        ProductsInner client = this.inner();
        return client.listAsync(resourceGroup, registrationName)
        .flatMapIterable(new Func1<Page<ProductInner>, Iterable<ProductInner>>() {
            @Override
            public Iterable<ProductInner> call(Page<ProductInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ProductInner, Product>() {
            @Override
            public Product call(ProductInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Product> getAsync(String resourceGroup, String registrationName, String productName) {
        ProductsInner client = this.inner();
        return client.getAsync(resourceGroup, registrationName, productName)
        .flatMap(new Func1<ProductInner, Observable<Product>>() {
            @Override
            public Observable<Product> call(ProductInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((Product)wrapModel(inner));
                }
            }
       });
    }

}
