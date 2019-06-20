/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation;

import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.ResourceSkuResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.ResourceSkuCapacity;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.ResourceSku;

class ResourceSkuResultImpl extends WrapperImpl<ResourceSkuResultInner> implements ResourceSkuResult {
    private final ApiManagementManager manager;
    ResourceSkuResultImpl(ResourceSkuResultInner inner, ApiManagementManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public ResourceSkuCapacity capacity() {
        return this.inner().capacity();
    }

    @Override
    public String resourceType() {
        return this.inner().resourceType();
    }

    @Override
    public ResourceSku sku() {
        return this.inner().sku();
    }

}
