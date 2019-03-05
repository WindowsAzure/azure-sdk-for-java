/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.searchmanagementclient.v2015_02_28;

import rx.Observable;
import com.microsoft.azure.management.searchmanagementclient.v2015_02_28.implementation.QueryKeysInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing QueryKeys.
 */
public interface QueryKeys extends HasInner<QueryKeysInner> {
    /**
     * Returns the list of query API keys for the given Azure Search service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription.
     * @param serviceName The name of the Search service for which to list query keys.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ListQueryKeysResult> listAsync(String resourceGroupName, String serviceName);

}
