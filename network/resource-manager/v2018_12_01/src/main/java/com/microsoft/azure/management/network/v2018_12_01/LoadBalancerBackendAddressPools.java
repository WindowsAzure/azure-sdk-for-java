/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_12_01;

import rx.Observable;
import com.microsoft.azure.management.network.v2018_12_01.implementation.LoadBalancerBackendAddressPoolsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing LoadBalancerBackendAddressPools.
 */
public interface LoadBalancerBackendAddressPools extends HasInner<LoadBalancerBackendAddressPoolsInner> {
    /**
     * Gets load balancer backend address pool.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param backendAddressPoolName The name of the backend address pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BackendAddressPool> getAsync(String resourceGroupName, String loadBalancerName, String backendAddressPoolName);

    /**
     * Gets all the load balancer backed address pools.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BackendAddressPool> listAsync(final String resourceGroupName, final String loadBalancerName);

}
