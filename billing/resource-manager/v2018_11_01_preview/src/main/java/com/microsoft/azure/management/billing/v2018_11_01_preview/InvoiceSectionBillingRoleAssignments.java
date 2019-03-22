/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview;

import rx.Completable;
import rx.Observable;

/**
 * Type representing InvoiceSectionBillingRoleAssignments.
 */
public interface InvoiceSectionBillingRoleAssignments {
    /**
     * Get the role assignment for the caller on the invoice Section.
     *
     * @param billingAccountName billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @param billingRoleAssignmentName role assignment id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleAssignment> getAsync(String billingAccountName, String invoiceSectionName, String billingRoleAssignmentName);

    /**
     * Delete the role assignment on this invoice Section.
     *
     * @param billingAccountName billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @param billingRoleAssignmentName role assignment id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleAssignment> deleteAsync(String billingAccountName, String invoiceSectionName, String billingRoleAssignmentName);

    /**
     * Get the role assignments on the invoice Section.
     *
     * @param billingAccountName billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleAssignmentListResult> listAsync(String billingAccountName, String invoiceSectionName);

    /**
     * The operation to add a role assignment to a invoice Section.
     *
     * @param billingAccountName billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleAssignmentListResult> addAsync(String billingAccountName, String invoiceSectionName);

}
