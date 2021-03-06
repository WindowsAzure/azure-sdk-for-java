// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.implementation;

import com.azure.resourcemanager.billing.fluent.models.ValidateSubscriptionTransferEligibilityResultInner;
import com.azure.resourcemanager.billing.models.ValidateSubscriptionTransferEligibilityError;
import com.azure.resourcemanager.billing.models.ValidateSubscriptionTransferEligibilityResult;

public final class ValidateSubscriptionTransferEligibilityResultImpl
    implements ValidateSubscriptionTransferEligibilityResult {
    private ValidateSubscriptionTransferEligibilityResultInner innerObject;

    private final com.azure.resourcemanager.billing.BillingManager serviceManager;

    ValidateSubscriptionTransferEligibilityResultImpl(
        ValidateSubscriptionTransferEligibilityResultInner innerObject,
        com.azure.resourcemanager.billing.BillingManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Boolean isMoveEligible() {
        return this.innerModel().isMoveEligible();
    }

    public ValidateSubscriptionTransferEligibilityError errorDetails() {
        return this.innerModel().errorDetails();
    }

    public ValidateSubscriptionTransferEligibilityResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.billing.BillingManager manager() {
        return this.serviceManager;
    }
}
