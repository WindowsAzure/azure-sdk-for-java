/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.desktopvirtualization.v2020_11-02-preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.desktopvirtualization.v2020_11-02-preview.MsixImages;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.desktopvirtualization.v2020_11-02-preview.ExpandMsixImage;

class MsixImagesImpl extends WrapperImpl<MsixImagesInner> implements MsixImages {
    private final DesktopVirtualizationManager manager;

    MsixImagesImpl(DesktopVirtualizationManager manager) {
        super(manager.inner().msixImages());
        this.manager = manager;
    }

    public DesktopVirtualizationManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ExpandMsixImage> expandAsync(final String resourceGroupName, final String hostPoolName) {
        MsixImagesInner client = this.inner();
        return client.expandAsync(resourceGroupName, hostPoolName)
        .flatMapIterable(new Func1<Page<ExpandMsixImageInner>, Iterable<ExpandMsixImageInner>>() {
            @Override
            public Iterable<ExpandMsixImageInner> call(Page<ExpandMsixImageInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ExpandMsixImageInner, ExpandMsixImage>() {
            @Override
            public ExpandMsixImage call(ExpandMsixImageInner inner) {
                return new ExpandMsixImageImpl(inner, manager());
            }
        });
    }

}
