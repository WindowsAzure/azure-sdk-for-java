/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.billing.v2018_11_01_preview.Amount;
import java.util.List;
import com.microsoft.azure.management.billing.v2018_11_01_preview.DownloadProperties;
import com.microsoft.azure.management.billing.v2018_11_01_preview.PaymentProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * An invoice resource.
 */
@JsonFlatten
public class InvoiceSummaryInner extends ProxyResource {
    /**
     * The due date for invoice.
     */
    @JsonProperty(value = "properties.dueDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime dueDate;

    /**
     * The date when invoice was created.
     */
    @JsonProperty(value = "properties.invoiceDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime invoiceDate;

    /**
     * Invoice status. Possible values include: 'PastDue', 'Due', 'Paid',
     * 'Void'.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /**
     * Amount due.
     */
    @JsonProperty(value = "properties.amountDue", access = JsonProperty.Access.WRITE_ONLY)
    private Amount amountDue;

    /**
     * Amount billed.
     */
    @JsonProperty(value = "properties.billedAmount", access = JsonProperty.Access.WRITE_ONLY)
    private Amount billedAmount;

    /**
     * The start date of the billing period.
     */
    @JsonProperty(value = "properties.invoicePeriodStartDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime invoicePeriodStartDate;

    /**
     * The end date of the billing period.
     */
    @JsonProperty(value = "properties.invoicePeriodEndDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime invoicePeriodEndDate;

    /**
     * The billing profile id this invoice belongs to.
     */
    @JsonProperty(value = "properties.billingProfileId", access = JsonProperty.Access.WRITE_ONLY)
    private String billingProfileId;

    /**
     * The profile name this invoice belongs to.
     */
    @JsonProperty(value = "properties.billingProfileName", access = JsonProperty.Access.WRITE_ONLY)
    private String billingProfileName;

    /**
     * The purchase identifier for the invoice.
     */
    @JsonProperty(value = "properties.purchaseOrderNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String purchaseOrderNumber;

    /**
     * List of document urls available to download including invoice and tax
     * documents.
     */
    @JsonProperty(value = "properties.documentUrls", access = JsonProperty.Access.WRITE_ONLY)
    private List<DownloadProperties> documentUrls;

    /**
     * List of payments.
     */
    @JsonProperty(value = "properties.payments", access = JsonProperty.Access.WRITE_ONLY)
    private List<PaymentProperties> payments;

    /**
     * Get the due date for invoice.
     *
     * @return the dueDate value
     */
    public DateTime dueDate() {
        return this.dueDate;
    }

    /**
     * Get the date when invoice was created.
     *
     * @return the invoiceDate value
     */
    public DateTime invoiceDate() {
        return this.invoiceDate;
    }

    /**
     * Get invoice status. Possible values include: 'PastDue', 'Due', 'Paid', 'Void'.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Get amount due.
     *
     * @return the amountDue value
     */
    public Amount amountDue() {
        return this.amountDue;
    }

    /**
     * Get amount billed.
     *
     * @return the billedAmount value
     */
    public Amount billedAmount() {
        return this.billedAmount;
    }

    /**
     * Get the start date of the billing period.
     *
     * @return the invoicePeriodStartDate value
     */
    public DateTime invoicePeriodStartDate() {
        return this.invoicePeriodStartDate;
    }

    /**
     * Get the end date of the billing period.
     *
     * @return the invoicePeriodEndDate value
     */
    public DateTime invoicePeriodEndDate() {
        return this.invoicePeriodEndDate;
    }

    /**
     * Get the billing profile id this invoice belongs to.
     *
     * @return the billingProfileId value
     */
    public String billingProfileId() {
        return this.billingProfileId;
    }

    /**
     * Get the profile name this invoice belongs to.
     *
     * @return the billingProfileName value
     */
    public String billingProfileName() {
        return this.billingProfileName;
    }

    /**
     * Get the purchase identifier for the invoice.
     *
     * @return the purchaseOrderNumber value
     */
    public String purchaseOrderNumber() {
        return this.purchaseOrderNumber;
    }

    /**
     * Get list of document urls available to download including invoice and tax documents.
     *
     * @return the documentUrls value
     */
    public List<DownloadProperties> documentUrls() {
        return this.documentUrls;
    }

    /**
     * Get list of payments.
     *
     * @return the payments value
     */
    public List<PaymentProperties> payments() {
        return this.payments;
    }

}
