/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mariadb.v2018_06_01;

import rx.Observable;
import com.microsoft.azure.management.mariadb.v2018_06_01.implementation.QueryTextsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing QueryTexts.
 */
public interface QueryTexts extends HasInner<QueryTextsInner> {
    /**
     * Retrieve the Query-Store query texts for the queryId.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param queryId The Query-Store query identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<QueryText> getAsync(String resourceGroupName, String serverName, String queryId);

    /**
     * Retrieve the Query-Store query texts for specified queryIds.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param queryIds The query identifiers
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<QueryText> listByServerAsync(final String resourceGroupName, final String serverName, final List<String> queryIds);

}
