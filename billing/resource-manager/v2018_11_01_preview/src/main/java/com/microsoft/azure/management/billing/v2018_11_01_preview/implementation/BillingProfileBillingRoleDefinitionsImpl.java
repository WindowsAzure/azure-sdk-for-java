/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingProfileBillingRoleDefinitions;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingRoleDefinition;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingRoleDefinitionListResult;

class BillingProfileBillingRoleDefinitionsImpl extends WrapperImpl<BillingProfileBillingRoleDefinitionsInner> implements BillingProfileBillingRoleDefinitions {
    private final BillingManager manager;

    BillingProfileBillingRoleDefinitionsImpl(BillingManager manager) {
        super(manager.inner().billingProfileBillingRoleDefinitions());
        this.manager = manager;
    }

    public BillingManager manager() {
        return this.manager;
    }

    @Override
    public Observable<BillingRoleDefinition> getAsync(String billingAccountName, String billingProfileName, String billingRoleDefinitionName) {
        BillingProfileBillingRoleDefinitionsInner client = this.inner();
        return client.getAsync(billingAccountName, billingProfileName, billingRoleDefinitionName)
        .map(new Func1<BillingRoleDefinitionInner, BillingRoleDefinition>() {
            @Override
            public BillingRoleDefinition call(BillingRoleDefinitionInner inner) {
                return new BillingRoleDefinitionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<BillingRoleDefinitionListResult> listAsync(String billingAccountName, String billingProfileName) {
        BillingProfileBillingRoleDefinitionsInner client = this.inner();
        return client.listAsync(billingAccountName, billingProfileName)
        .map(new Func1<BillingRoleDefinitionListResultInner, BillingRoleDefinitionListResult>() {
            @Override
            public BillingRoleDefinitionListResult call(BillingRoleDefinitionListResultInner inner) {
                return new BillingRoleDefinitionListResultImpl(inner, manager());
            }
        });
    }

}
