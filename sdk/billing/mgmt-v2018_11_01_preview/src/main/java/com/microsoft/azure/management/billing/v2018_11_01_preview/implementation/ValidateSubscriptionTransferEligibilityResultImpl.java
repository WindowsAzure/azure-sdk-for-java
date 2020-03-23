/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview.implementation;

import com.microsoft.azure.management.billing.v2018_11_01_preview.ValidateSubscriptionTransferEligibilityResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.billing.v2018_11_01_preview.ValidateSubscriptionTransferEligibilityError;

class ValidateSubscriptionTransferEligibilityResultImpl extends WrapperImpl<ValidateSubscriptionTransferEligibilityResultInner> implements ValidateSubscriptionTransferEligibilityResult {
    private final BillingManager manager;
    ValidateSubscriptionTransferEligibilityResultImpl(ValidateSubscriptionTransferEligibilityResultInner inner, BillingManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public BillingManager manager() {
        return this.manager;
    }

    @Override
    public ValidateSubscriptionTransferEligibilityError errorDetails() {
        return this.inner().errorDetails();
    }

    @Override
    public Boolean isTransferEligible() {
        return this.inner().isTransferEligible();
    }

}
