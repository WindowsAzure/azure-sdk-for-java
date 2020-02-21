/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.postgresql.v2017_12_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Observable;
import com.microsoft.azure.management.postgresql.v2017_12_01.implementation.ServerSecurityAlertPoliciesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ServerSecurityAlertPolicies.
 */
public interface ServerSecurityAlertPolicies extends SupportsCreating<ServerSecurityAlertPolicy.DefinitionStages.Blank>, HasInner<ServerSecurityAlertPoliciesInner> {
    /**
     * Get a server's security alert policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ServerSecurityAlertPolicy> getAsync(String resourceGroupName, String serverName);

}
