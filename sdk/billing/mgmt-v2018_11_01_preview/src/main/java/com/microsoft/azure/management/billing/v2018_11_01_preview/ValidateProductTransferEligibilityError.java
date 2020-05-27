/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error details of the product transfer eligibility validation.
 */
public class ValidateProductTransferEligibilityError {
    /**
     * Error code for the product transfer validation. Possible values include:
     * 'InvalidSource', 'ProductNotActive', 'InsufficientPermissionOnSource',
     * 'InsufficientPermissionOnDestination',
     * 'DestinationBillingProfilePastDue', 'ProductTypeNotSupported',
     * 'CrossBillingAccountNotAllowed', 'NotAvailableForDestinationMarket',
     * 'OneTimePurchaseProductTransferNotAllowed'.
     */
    @JsonProperty(value = "code")
    private ProductTransferValidationErrorCode code;

    /**
     * The error message.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Detailed error message explaining the error.
     */
    @JsonProperty(value = "details")
    private String details;

    /**
     * Get error code for the product transfer validation. Possible values include: 'InvalidSource', 'ProductNotActive', 'InsufficientPermissionOnSource', 'InsufficientPermissionOnDestination', 'DestinationBillingProfilePastDue', 'ProductTypeNotSupported', 'CrossBillingAccountNotAllowed', 'NotAvailableForDestinationMarket', 'OneTimePurchaseProductTransferNotAllowed'.
     *
     * @return the code value
     */
    public ProductTransferValidationErrorCode code() {
        return this.code;
    }

    /**
     * Set error code for the product transfer validation. Possible values include: 'InvalidSource', 'ProductNotActive', 'InsufficientPermissionOnSource', 'InsufficientPermissionOnDestination', 'DestinationBillingProfilePastDue', 'ProductTypeNotSupported', 'CrossBillingAccountNotAllowed', 'NotAvailableForDestinationMarket', 'OneTimePurchaseProductTransferNotAllowed'.
     *
     * @param code the code value to set
     * @return the ValidateProductTransferEligibilityError object itself.
     */
    public ValidateProductTransferEligibilityError withCode(ProductTransferValidationErrorCode code) {
        this.code = code;
        return this;
    }

    /**
     * Get the error message.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the error message.
     *
     * @param message the message value to set
     * @return the ValidateProductTransferEligibilityError object itself.
     */
    public ValidateProductTransferEligibilityError withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get detailed error message explaining the error.
     *
     * @return the details value
     */
    public String details() {
        return this.details;
    }

    /**
     * Set detailed error message explaining the error.
     *
     * @param details the details value to set
     * @return the ValidateProductTransferEligibilityError object itself.
     */
    public ValidateProductTransferEligibilityError withDetails(String details) {
        this.details = details;
        return this;
    }

}
