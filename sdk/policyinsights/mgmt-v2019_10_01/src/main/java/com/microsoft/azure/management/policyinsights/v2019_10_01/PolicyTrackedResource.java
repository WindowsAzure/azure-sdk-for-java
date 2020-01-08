/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights.v2019_10_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.policyinsights.v2019_10_01.implementation.PolicyInsightsManager;
import com.microsoft.azure.management.policyinsights.v2019_10_01.implementation.PolicyTrackedResourceInner;
import org.joda.time.DateTime;

/**
 * Type representing PolicyTrackedResource.
 */
public interface PolicyTrackedResource extends HasInner<PolicyTrackedResourceInner>, HasManager<PolicyInsightsManager> {
    /**
     * @return the createdBy value.
     */
    TrackedResourceModificationDetails createdBy();

    /**
     * @return the lastModifiedBy value.
     */
    TrackedResourceModificationDetails lastModifiedBy();

    /**
     * @return the lastUpdateUtc value.
     */
    DateTime lastUpdateUtc();

    /**
     * @return the policyDetails value.
     */
    PolicyDetails policyDetails();

    /**
     * @return the trackedResourceId value.
     */
    String trackedResourceId();

}
