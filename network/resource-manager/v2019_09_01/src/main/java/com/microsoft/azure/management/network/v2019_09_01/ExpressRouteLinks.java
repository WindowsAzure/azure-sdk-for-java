/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01;

import rx.Observable;
import com.microsoft.azure.management.network.v2019_09_01.implementation.ExpressRouteLinksInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ExpressRouteLinks.
 */
public interface ExpressRouteLinks extends HasInner<ExpressRouteLinksInner> {
    /**
     * Retrieves the specified ExpressRouteLink resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the ExpressRoutePort resource.
     * @param linkName The name of the ExpressRouteLink resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ExpressRouteLink> getAsync(String resourceGroupName, String expressRoutePortName, String linkName);

    /**
     * Retrieve the ExpressRouteLink sub-resources of the specified ExpressRoutePort resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the ExpressRoutePort resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ExpressRouteLink> listAsync(final String resourceGroupName, final String expressRoutePortName);

}
