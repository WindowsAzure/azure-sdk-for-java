/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mysql.v2020_01_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.mysql.v2020_01_01.implementation.VirtualNetworkRulesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing VirtualNetworkRules.
 */
public interface VirtualNetworkRules extends SupportsCreating<VirtualNetworkRule.DefinitionStages.Blank>, HasInner<VirtualNetworkRulesInner> {
    /**
     * Gets a virtual network rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param virtualNetworkRuleName The name of the virtual network rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualNetworkRule> getAsync(String resourceGroupName, String serverName, String virtualNetworkRuleName);

    /**
     * Gets a list of virtual network rules in a server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualNetworkRule> listByServerAsync(final String resourceGroupName, final String serverName);

    /**
     * Deletes the virtual network rule with the given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param virtualNetworkRuleName The name of the virtual network rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String serverName, String virtualNetworkRuleName);

}
