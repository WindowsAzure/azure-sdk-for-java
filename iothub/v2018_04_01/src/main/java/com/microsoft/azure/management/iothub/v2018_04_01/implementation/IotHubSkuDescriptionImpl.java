/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_04_01.implementation;

import com.microsoft.azure.management.iothub.v2018_04_01.IotHubSkuDescription;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.iothub.v2018_04_01.IotHubCapacity;
import com.microsoft.azure.management.iothub.v2018_04_01.IotHubSkuInfo;

class IotHubSkuDescriptionImpl extends WrapperImpl<IotHubSkuDescriptionInner> implements IotHubSkuDescription {
    private final IoTHubManager manager;

    IotHubSkuDescriptionImpl(IotHubSkuDescriptionInner inner,  IoTHubManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public IoTHubManager manager() {
        return this.manager;
    }



    @Override
    public IotHubCapacity capacity() {
        return this.inner().capacity();
    }

    @Override
    public String resourceType() {
        return this.inner().resourceType();
    }

    @Override
    public IotHubSkuInfo sku() {
        return this.inner().sku();
    }

}
