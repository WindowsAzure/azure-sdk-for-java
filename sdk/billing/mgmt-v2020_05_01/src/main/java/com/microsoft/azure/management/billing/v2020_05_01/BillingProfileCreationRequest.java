/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2020_05_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The request parameters for creating a new billing profile.
 */
public class BillingProfileCreationRequest {
    /**
     * The name of the billing profile.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * The purchase order name that will appear on the invoices generated for
     * the billing profile.
     */
    @JsonProperty(value = "poNumber")
    private String poNumber;

    /**
     * The address of the individual or organization that is responsible for
     * the billing profile.
     */
    @JsonProperty(value = "billTo")
    private AddressDetails billTo;

    /**
     * Flag controlling whether the invoices for the billing profile are sent
     * through email.
     */
    @JsonProperty(value = "invoiceEmailOptIn")
    private Boolean invoiceEmailOptIn;

    /**
     * Enabled azure plans for the billing profile.
     */
    @JsonProperty(value = "enabledAzurePlans")
    private List<AzurePlan> enabledAzurePlans;

    /**
     * Get the name of the billing profile.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the name of the billing profile.
     *
     * @param displayName the displayName value to set
     * @return the BillingProfileCreationRequest object itself.
     */
    public BillingProfileCreationRequest withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the purchase order name that will appear on the invoices generated for the billing profile.
     *
     * @return the poNumber value
     */
    public String poNumber() {
        return this.poNumber;
    }

    /**
     * Set the purchase order name that will appear on the invoices generated for the billing profile.
     *
     * @param poNumber the poNumber value to set
     * @return the BillingProfileCreationRequest object itself.
     */
    public BillingProfileCreationRequest withPoNumber(String poNumber) {
        this.poNumber = poNumber;
        return this;
    }

    /**
     * Get the address of the individual or organization that is responsible for the billing profile.
     *
     * @return the billTo value
     */
    public AddressDetails billTo() {
        return this.billTo;
    }

    /**
     * Set the address of the individual or organization that is responsible for the billing profile.
     *
     * @param billTo the billTo value to set
     * @return the BillingProfileCreationRequest object itself.
     */
    public BillingProfileCreationRequest withBillTo(AddressDetails billTo) {
        this.billTo = billTo;
        return this;
    }

    /**
     * Get flag controlling whether the invoices for the billing profile are sent through email.
     *
     * @return the invoiceEmailOptIn value
     */
    public Boolean invoiceEmailOptIn() {
        return this.invoiceEmailOptIn;
    }

    /**
     * Set flag controlling whether the invoices for the billing profile are sent through email.
     *
     * @param invoiceEmailOptIn the invoiceEmailOptIn value to set
     * @return the BillingProfileCreationRequest object itself.
     */
    public BillingProfileCreationRequest withInvoiceEmailOptIn(Boolean invoiceEmailOptIn) {
        this.invoiceEmailOptIn = invoiceEmailOptIn;
        return this;
    }

    /**
     * Get enabled azure plans for the billing profile.
     *
     * @return the enabledAzurePlans value
     */
    public List<AzurePlan> enabledAzurePlans() {
        return this.enabledAzurePlans;
    }

    /**
     * Set enabled azure plans for the billing profile.
     *
     * @param enabledAzurePlans the enabledAzurePlans value to set
     * @return the BillingProfileCreationRequest object itself.
     */
    public BillingProfileCreationRequest withEnabledAzurePlans(List<AzurePlan> enabledAzurePlans) {
        this.enabledAzurePlans = enabledAzurePlans;
        return this;
    }

}
