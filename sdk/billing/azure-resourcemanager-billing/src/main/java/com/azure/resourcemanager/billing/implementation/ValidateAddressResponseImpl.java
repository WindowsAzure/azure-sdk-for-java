// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.implementation;

import com.azure.resourcemanager.billing.fluent.models.ValidateAddressResponseInner;
import com.azure.resourcemanager.billing.models.AddressDetails;
import com.azure.resourcemanager.billing.models.AddressValidationStatus;
import com.azure.resourcemanager.billing.models.ValidateAddressResponse;
import java.util.Collections;
import java.util.List;

public final class ValidateAddressResponseImpl implements ValidateAddressResponse {
    private ValidateAddressResponseInner innerObject;

    private final com.azure.resourcemanager.billing.BillingManager serviceManager;

    ValidateAddressResponseImpl(
        ValidateAddressResponseInner innerObject, com.azure.resourcemanager.billing.BillingManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public AddressValidationStatus status() {
        return this.innerModel().status();
    }

    public List<AddressDetails> suggestedAddresses() {
        List<AddressDetails> inner = this.innerModel().suggestedAddresses();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String validationMessage() {
        return this.innerModel().validationMessage();
    }

    public ValidateAddressResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.billing.BillingManager manager() {
        return this.serviceManager;
    }
}
