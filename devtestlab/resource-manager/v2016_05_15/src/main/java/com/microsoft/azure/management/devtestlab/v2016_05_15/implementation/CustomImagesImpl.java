/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.devtestlab.v2016_05_15.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.devtestlab.v2016_05_15.CustomImages;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.devtestlab.v2016_05_15.CustomImage;

class CustomImagesImpl extends WrapperImpl<CustomImagesInner> implements CustomImages {
    private final DevTestLabManager manager;

    CustomImagesImpl(DevTestLabManager manager) {
        super(manager.inner().customImages());
        this.manager = manager;
    }

    public DevTestLabManager manager() {
        return this.manager;
    }

    @Override
    public CustomImageImpl define(String name) {
        return wrapModel(name);
    }

    private CustomImageImpl wrapModel(CustomImageInner inner) {
        return  new CustomImageImpl(inner, manager());
    }

    private CustomImageImpl wrapModel(String name) {
        return new CustomImageImpl(name, this.manager());
    }

    @Override
    public Observable<CustomImage> listAsync(final String resourceGroupName, final String labName) {
        CustomImagesInner client = this.inner();
        return client.listAsync(resourceGroupName, labName)
        .flatMapIterable(new Func1<Page<CustomImageInner>, Iterable<CustomImageInner>>() {
            @Override
            public Iterable<CustomImageInner> call(Page<CustomImageInner> page) {
                return page.items();
            }
        })
        .map(new Func1<CustomImageInner, CustomImage>() {
            @Override
            public CustomImage call(CustomImageInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<CustomImage> getAsync(String resourceGroupName, String labName, String name) {
        CustomImagesInner client = this.inner();
        return client.getAsync(resourceGroupName, labName, name)
        .map(new Func1<CustomImageInner, CustomImage>() {
            @Override
            public CustomImage call(CustomImageInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String labName, String name) {
        CustomImagesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, labName, name).toCompletable();
    }

}
