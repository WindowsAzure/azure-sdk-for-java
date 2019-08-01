/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2019_07_01.implementation;

import com.microsoft.azure.management.resources.v2019_07_01.ResourceGroupExportResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.resources.v2019_07_01.ResourceManagementErrorWithDetails;

class ResourceGroupExportResultImpl extends WrapperImpl<ResourceGroupExportResultInner> implements ResourceGroupExportResult {
    private final ResourcesManager manager;
    ResourceGroupExportResultImpl(ResourceGroupExportResultInner inner, ResourcesManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ResourcesManager manager() {
        return this.manager;
    }

    @Override
    public ResourceManagementErrorWithDetails error() {
        return this.inner().error();
    }

    @Override
    public Object template() {
        return this.inner().template();
    }

}
