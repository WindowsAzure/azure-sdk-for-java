/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.storage.v2019_08_01_preview.implementation;

import com.microsoft.azure.management.storage.v2019_08_01_preview.SkuInformation;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.storage.v2019_08_01_preview.SKUCapability;
import com.microsoft.azure.management.storage.v2019_08_01_preview.Kind;
import com.microsoft.azure.management.storage.v2019_08_01_preview.SkuName;
import com.microsoft.azure.management.storage.v2019_08_01_preview.Restriction;
import com.microsoft.azure.management.storage.v2019_08_01_preview.SkuTier;

class SkuInformationImpl extends WrapperImpl<SkuInformationInner> implements SkuInformation {
    private final StorageManager manager;

    SkuInformationImpl(SkuInformationInner inner,  StorageManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public StorageManager manager() {
        return this.manager;
    }



    @Override
    public List<SKUCapability> capabilities() {
        return this.inner().capabilities();
    }

    @Override
    public Kind kind() {
        return this.inner().kind();
    }

    @Override
    public List<String> locations() {
        return this.inner().locations();
    }

    @Override
    public SkuName name() {
        return this.inner().name();
    }

    @Override
    public String resourceType() {
        return this.inner().resourceType();
    }

    @Override
    public List<Restriction> restrictions() {
        return this.inner().restrictions();
    }

    @Override
    public SkuTier tier() {
        return this.inner().tier();
    }

}
