/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_12_01;

import rx.Observable;
import com.microsoft.azure.management.network.v2018_12_01.implementation.NetworkInterfaceIPConfigurationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing NetworkInterfaceIPConfigurations.
 */
public interface NetworkInterfaceIPConfigurations extends HasInner<NetworkInterfaceIPConfigurationsInner> {
    /**
     * Gets the specified network interface ip configuration.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param ipConfigurationName The name of the ip configuration name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<NetworkInterfaceNetworkInterfaceIPConfiguration> getAsync(String resourceGroupName, String networkInterfaceName, String ipConfigurationName);

    /**
     * Get all ip configurations in a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<NetworkInterfaceNetworkInterfaceIPConfiguration> listAsync(final String resourceGroupName, final String networkInterfaceName);

}
