/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview.implementation;

import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingRoleDefinition;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingPermissionsProperties;

class BillingRoleDefinitionImpl extends WrapperImpl<BillingRoleDefinitionInner> implements BillingRoleDefinition {
    private final BillingManager manager;
    BillingRoleDefinitionImpl(BillingRoleDefinitionInner inner, BillingManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public BillingManager manager() {
        return this.manager;
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String roleName() {
        return this.inner().roleName();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public List<BillingPermissionsProperties> value() {
        return this.inner().value();
    }

}
