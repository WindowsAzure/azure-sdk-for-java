/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2018_06_01.implementation;

import com.microsoft.azure.management.resources.v2018_06_01.TenantIdDescription;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class TenantIdDescriptionImpl extends WrapperImpl<TenantIdDescriptionInner> implements TenantIdDescription {
    private final ResourcesManager manager;
    TenantIdDescriptionImpl(TenantIdDescriptionInner inner, ResourcesManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ResourcesManager manager() {
        return this.manager;
    }

    @Override
    public String displayName() {
        return this.inner().displayName();
    }

    @Override
    public List<String> domains() {
        return this.inner().domains();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String tenantId() {
        return this.inner().tenantId();
    }

}
