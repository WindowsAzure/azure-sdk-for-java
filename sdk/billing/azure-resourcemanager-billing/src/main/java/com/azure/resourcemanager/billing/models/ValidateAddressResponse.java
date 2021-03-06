// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.resourcemanager.billing.fluent.models.ValidateAddressResponseInner;
import java.util.List;

/** An immutable client-side representation of ValidateAddressResponse. */
public interface ValidateAddressResponse {
    /**
     * Gets the status property: status of the address validation.
     *
     * @return the status value.
     */
    AddressValidationStatus status();

    /**
     * Gets the suggestedAddresses property: The list of suggested addresses.
     *
     * @return the suggestedAddresses value.
     */
    List<AddressDetails> suggestedAddresses();

    /**
     * Gets the validationMessage property: Validation error message.
     *
     * @return the validationMessage value.
     */
    String validationMessage();

    /**
     * Gets the inner com.azure.resourcemanager.billing.fluent.models.ValidateAddressResponseInner object.
     *
     * @return the inner object.
     */
    ValidateAddressResponseInner innerModel();
}
