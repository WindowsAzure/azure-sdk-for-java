/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview.implementation;

import com.microsoft.azure.management.billing.v2018_11_01_preview.ValidateProductTransferEligibilityError;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Result of the product transfer eligibility validation.
 */
public class ValidateProductTransferEligibilityResultInner {
    /**
     * Specifies whether the transfer is eligible or not.
     */
    @JsonProperty(value = "isTransferEligible", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isTransferEligible;

    /**
     * Validation error details.
     */
    @JsonProperty(value = "errorDetails")
    private ValidateProductTransferEligibilityError errorDetails;

    /**
     * Get specifies whether the transfer is eligible or not.
     *
     * @return the isTransferEligible value
     */
    public Boolean isTransferEligible() {
        return this.isTransferEligible;
    }

    /**
     * Get validation error details.
     *
     * @return the errorDetails value
     */
    public ValidateProductTransferEligibilityError errorDetails() {
        return this.errorDetails;
    }

    /**
     * Set validation error details.
     *
     * @param errorDetails the errorDetails value to set
     * @return the ValidateProductTransferEligibilityResultInner object itself.
     */
    public ValidateProductTransferEligibilityResultInner withErrorDetails(ValidateProductTransferEligibilityError errorDetails) {
        this.errorDetails = errorDetails;
        return this;
    }

}
