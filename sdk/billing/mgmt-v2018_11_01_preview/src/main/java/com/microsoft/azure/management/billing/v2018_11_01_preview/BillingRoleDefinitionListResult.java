/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.BillingManager;
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.BillingRoleDefinitionListResultInner;
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.BillingRoleDefinitionInner;
import java.util.List;

/**
 * Type representing BillingRoleDefinitionListResult.
 */
public interface BillingRoleDefinitionListResult extends HasInner<BillingRoleDefinitionListResultInner>, HasManager<BillingManager> {
    /**
     * @return the value value.
     */
    List<BillingRoleDefinitionInner> value();

}
