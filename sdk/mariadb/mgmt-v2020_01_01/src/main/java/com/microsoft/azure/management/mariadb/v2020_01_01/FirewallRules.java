/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mariadb.v2020_01_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.mariadb.v2020_01_01.implementation.FirewallRulesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing FirewallRules.
 */
public interface FirewallRules extends SupportsCreating<FirewallRule.DefinitionStages.Blank>, HasInner<FirewallRulesInner> {
    /**
     * Gets information about a server firewall rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param firewallRuleName The name of the server firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<FirewallRule> getAsync(String resourceGroupName, String serverName, String firewallRuleName);

    /**
     * List all the firewall rules in a given server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<FirewallRule> listByServerAsync(String resourceGroupName, String serverName);

    /**
     * Deletes a server firewall rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param firewallRuleName The name of the server firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String serverName, String firewallRuleName);

}
