/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights.v2018_04_04;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.policyinsights.v2018_04_04.implementation.PolicyInsightsManager;
import com.microsoft.azure.management.policyinsights.v2018_04_04.implementation.PolicyStatesQueryResultsInner;
import com.microsoft.azure.management.policyinsights.v2018_04_04.implementation.PolicyStateInner;
import java.util.List;

/**
 * Type representing PolicyStatesQueryResults.
 */
public interface PolicyStatesQueryResults extends HasInner<PolicyStatesQueryResultsInner>, HasManager<PolicyInsightsManager> {
    /**
     * @return the odatacontext value.
     */
    String odatacontext();

    /**
     * @return the odatacount value.
     */
    Integer odatacount();

    /**
     * @return the value value.
     */
    List<PolicyStateInner> value();

}
