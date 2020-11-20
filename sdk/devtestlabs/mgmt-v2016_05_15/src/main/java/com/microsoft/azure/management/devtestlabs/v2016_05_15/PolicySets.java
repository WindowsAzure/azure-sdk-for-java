/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2016_05_15;

import rx.Observable;
import com.microsoft.azure.management.devtestlabs.v2016_05_15.implementation.PolicySetsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing PolicySets.
 */
public interface PolicySets extends HasInner<PolicySetsInner> {
    /**
     * Evaluates lab policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the policy set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EvaluatePoliciesResponse> evaluatePoliciesAsync(String resourceGroupName, String labName, String name);

}
