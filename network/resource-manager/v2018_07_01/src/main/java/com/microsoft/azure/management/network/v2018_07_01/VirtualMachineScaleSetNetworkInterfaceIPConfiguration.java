/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2018_07_01.implementation.NetworkInterfaceIPConfigurationInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2018_07_01.implementation.NetworkManager;
import java.util.List;

/**
 * Type representing VirtualMachineScaleSetNetworkInterfaceIPConfiguration.
 */
public interface VirtualMachineScaleSetNetworkInterfaceIPConfiguration extends HasInner<NetworkInterfaceIPConfigurationInner>, Indexable, Refreshable<VirtualMachineScaleSetNetworkInterfaceIPConfiguration>, HasManager<NetworkManager> {
    /**
     * @return the applicationGatewayBackendAddressPools value.
     */
    List<ApplicationGatewayBackendAddressPool> applicationGatewayBackendAddressPools();

    /**
     * @return the applicationSecurityGroups value.
     */
    List<ApplicationSecurityGroup> applicationSecurityGroups();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the loadBalancerBackendAddressPools value.
     */
    List<BackendAddressPool> loadBalancerBackendAddressPools();

    /**
     * @return the loadBalancerInboundNatRules value.
     */
    List<InboundNatRule> loadBalancerInboundNatRules();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the primary value.
     */
    Boolean primary();

    /**
     * @return the privateIPAddress value.
     */
    String privateIPAddress();

    /**
     * @return the privateIPAddressVersion value.
     */
    IPVersion privateIPAddressVersion();

    /**
     * @return the privateIPAllocationMethod value.
     */
    IPAllocationMethod privateIPAllocationMethod();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the publicIPAddress value.
     */
    PublicIPAddress publicIPAddress();

    /**
     * @return the subnet value.
     */
    Subnet subnet();

}
