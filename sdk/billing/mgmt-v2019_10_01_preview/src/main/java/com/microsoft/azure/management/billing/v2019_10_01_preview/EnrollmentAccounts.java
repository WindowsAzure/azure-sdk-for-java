/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import rx.Observable;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.EnrollmentAccountsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing EnrollmentAccounts.
 */
public interface EnrollmentAccounts extends HasInner<EnrollmentAccountsInner> {
    /**
     * Lists all Enrollment Accounts for a user which he has access to.
     *
     * @param billingAccountName billing Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EnrollmentAccountListResult> listByBillingAccountNameAsync(String billingAccountName);

    /**
     * Get the enrollment account by id.
     *
     * @param billingAccountName billing Account Id.
     * @param enrollmentAccountName Enrollment Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EnrollmentAccount> getByEnrollmentAccountIdAsync(String billingAccountName, String enrollmentAccountName);

}
