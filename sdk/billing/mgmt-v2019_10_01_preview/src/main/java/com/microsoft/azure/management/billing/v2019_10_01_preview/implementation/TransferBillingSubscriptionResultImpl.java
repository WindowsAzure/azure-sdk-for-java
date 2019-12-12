/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview.implementation;

import com.microsoft.azure.management.billing.v2019_10_01_preview.TransferBillingSubscriptionResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class TransferBillingSubscriptionResultImpl extends WrapperImpl<TransferBillingSubscriptionResultInner> implements TransferBillingSubscriptionResult {
    private final BillingManager manager;
    TransferBillingSubscriptionResultImpl(TransferBillingSubscriptionResultInner inner, BillingManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public BillingManager manager() {
        return this.manager;
    }

    @Override
    public String billingSubscriptionName() {
        return this.inner().billingSubscriptionName();
    }

}
