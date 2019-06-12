/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2019_04_01.implementation.LoadBalancerInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2019_04_01.implementation.NetworkManager;
import java.util.List;
import java.util.Map;

/**
 * Type representing NetworkInterfaceLoadBalancer.
 */
public interface NetworkInterfaceLoadBalancer extends HasInner<LoadBalancerInner>, HasManager<NetworkManager> {
    /**
     * @return the backendAddressPools value.
     */
    List<BackendAddressPool> backendAddressPools();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the frontendIPConfigurations value.
     */
    List<FrontendIPConfiguration> frontendIPConfigurations();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the inboundNatPools value.
     */
    List<InboundNatPool> inboundNatPools();

    /**
     * @return the inboundNatRules value.
     */
    List<InboundNatRule> inboundNatRules();

    /**
     * @return the loadBalancingRules value.
     */
    List<LoadBalancingRule> loadBalancingRules();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the outboundRules value.
     */
    List<OutboundRule> outboundRules();

    /**
     * @return the probes value.
     */
    List<Probe> probes();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * @return the sku value.
     */
    LoadBalancerSku sku();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

}
