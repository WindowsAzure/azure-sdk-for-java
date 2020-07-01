/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2020_05_01.implementation;

import com.microsoft.azure.management.billing.v2020_05_01.AddressValidationStatus;
import java.util.List;
import com.microsoft.azure.management.billing.v2020_05_01.AddressDetails;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Result of the address validation.
 */
public class ValidateAddressResponseInner {
    /**
     * status of the address validation. Possible values include: 'Valid',
     * 'Invalid'.
     */
    @JsonProperty(value = "status")
    private AddressValidationStatus status;

    /**
     * The list of suggested addresses.
     */
    @JsonProperty(value = "suggestedAddresses")
    private List<AddressDetails> suggestedAddresses;

    /**
     * Validation error message.
     */
    @JsonProperty(value = "validationMessage")
    private String validationMessage;

    /**
     * Get status of the address validation. Possible values include: 'Valid', 'Invalid'.
     *
     * @return the status value
     */
    public AddressValidationStatus status() {
        return this.status;
    }

    /**
     * Set status of the address validation. Possible values include: 'Valid', 'Invalid'.
     *
     * @param status the status value to set
     * @return the ValidateAddressResponseInner object itself.
     */
    public ValidateAddressResponseInner withStatus(AddressValidationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the list of suggested addresses.
     *
     * @return the suggestedAddresses value
     */
    public List<AddressDetails> suggestedAddresses() {
        return this.suggestedAddresses;
    }

    /**
     * Set the list of suggested addresses.
     *
     * @param suggestedAddresses the suggestedAddresses value to set
     * @return the ValidateAddressResponseInner object itself.
     */
    public ValidateAddressResponseInner withSuggestedAddresses(List<AddressDetails> suggestedAddresses) {
        this.suggestedAddresses = suggestedAddresses;
        return this;
    }

    /**
     * Get validation error message.
     *
     * @return the validationMessage value
     */
    public String validationMessage() {
        return this.validationMessage;
    }

    /**
     * Set validation error message.
     *
     * @param validationMessage the validationMessage value to set
     * @return the ValidateAddressResponseInner object itself.
     */
    public ValidateAddressResponseInner withValidationMessage(String validationMessage) {
        this.validationMessage = validationMessage;
        return this;
    }

}
