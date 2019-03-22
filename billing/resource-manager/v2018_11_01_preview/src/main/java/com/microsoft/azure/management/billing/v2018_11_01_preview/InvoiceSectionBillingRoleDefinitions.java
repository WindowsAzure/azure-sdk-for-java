/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview;

import rx.Observable;
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.InvoiceSectionBillingRoleDefinitionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing InvoiceSectionBillingRoleDefinitions.
 */
public interface InvoiceSectionBillingRoleDefinitions extends HasInner<InvoiceSectionBillingRoleDefinitionsInner> {
    /**
     * Gets the role definition for a role.
     *
     * @param billingAccountName billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @param billingRoleDefinitionName role definition id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleDefinition> getAsync(String billingAccountName, String invoiceSectionName, String billingRoleDefinitionName);

    /**
     * Lists the role definition for a invoice Section.
     *
     * @param billingAccountName billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleDefinitionListResult> listAsync(String billingAccountName, String invoiceSectionName);

}
