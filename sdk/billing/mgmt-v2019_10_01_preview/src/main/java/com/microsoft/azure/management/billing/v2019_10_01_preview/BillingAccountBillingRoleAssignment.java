/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.BillingRoleAssignmentInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.BillingManager;

/**
 * Type representing BillingAccountBillingRoleAssignment.
 */
public interface BillingAccountBillingRoleAssignment extends HasInner<BillingRoleAssignmentInner>, Indexable, Refreshable<BillingAccountBillingRoleAssignment>, HasManager<BillingManager> {
    /**
     * @return the billingRoleAssignmentName value.
     */
    String billingRoleAssignmentName();

    /**
     * @return the createdByPrincipalId value.
     */
    String createdByPrincipalId();

    /**
     * @return the createdByPrincipalTenantId value.
     */
    String createdByPrincipalTenantId();

    /**
     * @return the createdByUserEmailAddress value.
     */
    String createdByUserEmailAddress();

    /**
     * @return the createdOn value.
     */
    String createdOn();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the principalId value.
     */
    String principalId();

    /**
     * @return the principalTenantId value.
     */
    String principalTenantId();

    /**
     * @return the roleDefinitionId value.
     */
    String roleDefinitionId();

    /**
     * @return the scope value.
     */
    String scope();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the userAuthenticationType value.
     */
    String userAuthenticationType();

    /**
     * @return the userEmailAddress value.
     */
    String userEmailAddress();

}
