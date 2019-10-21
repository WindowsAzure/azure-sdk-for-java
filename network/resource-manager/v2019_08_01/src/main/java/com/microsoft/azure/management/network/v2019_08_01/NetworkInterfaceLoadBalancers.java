/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_08_01;

import rx.Observable;
import com.microsoft.azure.management.network.v2019_08_01.implementation.NetworkInterfaceLoadBalancersInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing NetworkInterfaceLoadBalancers.
 */
public interface NetworkInterfaceLoadBalancers extends HasInner<NetworkInterfaceLoadBalancersInner> {
    /**
     * List all load balancers in a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<NetworkInterfaceLoadBalancer> listAsync(final String resourceGroupName, final String networkInterfaceName);

}
