// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.frontdoor.fluent.models.ManagedRuleSetDefinitionInner;

/** An instance of this class provides access to all the operations defined in ManagedRuleSetsClient. */
public interface ManagedRuleSetsClient {
    /**
     * Lists all available managed rule sets.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of managed rule set definitions available for use in a policy.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ManagedRuleSetDefinitionInner> list();

    /**
     * Lists all available managed rule sets.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of managed rule set definitions available for use in a policy.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ManagedRuleSetDefinitionInner> list(Context context);
}
