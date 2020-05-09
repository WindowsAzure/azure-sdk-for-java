/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.network.v2020_04_01.implementation.RouteFilterRulesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing RouteFilterRules.
 */
public interface RouteFilterRules extends SupportsCreating<RouteFilterRule.DefinitionStages.Blank>, HasInner<RouteFilterRulesInner> {
    /**
     * Gets the specified rule from a route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RouteFilterRule> getAsync(String resourceGroupName, String routeFilterName, String ruleName);

    /**
     * Gets all RouteFilterRules in a route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RouteFilterRule> listByRouteFilterAsync(final String resourceGroupName, final String routeFilterName);

    /**
     * Deletes the specified rule from a route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String routeFilterName, String ruleName);

}
