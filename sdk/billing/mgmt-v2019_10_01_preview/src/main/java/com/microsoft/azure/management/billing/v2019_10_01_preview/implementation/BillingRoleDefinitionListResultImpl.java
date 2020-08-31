/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview.implementation;

import com.microsoft.azure.management.billing.v2019_10_01_preview.BillingRoleDefinitionListResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class BillingRoleDefinitionListResultImpl extends WrapperImpl<BillingRoleDefinitionListResultInner> implements BillingRoleDefinitionListResult {
    private final BillingManager manager;
    BillingRoleDefinitionListResultImpl(BillingRoleDefinitionListResultInner inner, BillingManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public BillingManager manager() {
        return this.manager;
    }

    @Override
    public String nextLink() {
        return this.inner().nextLink();
    }

    @Override
    public List<BillingRoleDefinitionInner> value() {
        return this.inner().value();
    }

}
