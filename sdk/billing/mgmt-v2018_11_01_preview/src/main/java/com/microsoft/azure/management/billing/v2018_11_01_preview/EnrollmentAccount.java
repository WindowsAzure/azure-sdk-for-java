/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.EnrollmentAccountInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.BillingManager;
import org.joda.time.DateTime;

/**
 * Type representing EnrollmentAccount.
 */
public interface EnrollmentAccount extends HasInner<EnrollmentAccountInner>, Indexable, Refreshable<EnrollmentAccount>, HasManager<BillingManager> {
    /**
     * @return the accountName value.
     */
    String accountName();

    /**
     * @return the accountOwner value.
     */
    String accountOwner();

    /**
     * @return the costCenter value.
     */
    String costCenter();

    /**
     * @return the department value.
     */
    Department department();

    /**
     * @return the endDate value.
     */
    DateTime endDate();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the startDate value.
     */
    DateTime startDate();

    /**
     * @return the status value.
     */
    String status();

    /**
     * @return the type value.
     */
    String type();

}
