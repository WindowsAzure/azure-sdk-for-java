/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2020_03_01.implementation;

import com.microsoft.azure.management.iothub.v2020_03_01.PrivateLinkResource;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class PrivateLinkResourceImpl extends WrapperImpl<PrivateLinkResourceInner> implements PrivateLinkResource {
    private final DevicesManager manager;
    PrivateLinkResourceImpl(PrivateLinkResourceInner inner, DevicesManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DevicesManager manager() {
        return this.manager;
    }

    @Override
    public List<GroupIdInformationInner> value() {
        return this.inner().value();
    }

}
