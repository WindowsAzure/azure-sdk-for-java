/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2020_11_01.implementation;

import com.microsoft.azure.management.containerinstance.v2020_11_01.CachedImages;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;

class CachedImagesImpl extends WrapperImpl<CachedImagesInner> implements CachedImages {
    private final ContainerInstanceManager manager;

    CachedImagesImpl(CachedImagesInner inner,  ContainerInstanceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ContainerInstanceManager manager() {
        return this.manager;
    }



    @Override
    public String image() {
        return this.inner().image();
    }

    @Override
    public String osType() {
        return this.inner().osType();
    }

}
