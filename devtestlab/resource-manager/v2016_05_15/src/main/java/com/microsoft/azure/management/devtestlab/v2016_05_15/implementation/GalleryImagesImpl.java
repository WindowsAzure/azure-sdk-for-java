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
import com.microsoft.azure.management.devtestlab.v2016_05_15.GalleryImages;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.devtestlab.v2016_05_15.GalleryImage;

class GalleryImagesImpl extends WrapperImpl<GalleryImagesInner> implements GalleryImages {
    private final DevTestLabManager manager;

    GalleryImagesImpl(DevTestLabManager manager) {
        super(manager.inner().galleryImages());
        this.manager = manager;
    }

    public DevTestLabManager manager() {
        return this.manager;
    }

    private GalleryImageImpl wrapModel(GalleryImageInner inner) {
        return  new GalleryImageImpl(inner, manager());
    }

    @Override
    public Observable<GalleryImage> listAsync(final String resourceGroupName, final String labName) {
        GalleryImagesInner client = this.inner();
        return client.listAsync(resourceGroupName, labName)
        .flatMapIterable(new Func1<Page<GalleryImageInner>, Iterable<GalleryImageInner>>() {
            @Override
            public Iterable<GalleryImageInner> call(Page<GalleryImageInner> page) {
                return page.items();
            }
        })
        .map(new Func1<GalleryImageInner, GalleryImage>() {
            @Override
            public GalleryImage call(GalleryImageInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
