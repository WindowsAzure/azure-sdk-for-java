/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2018_04_01.implementation.VirtualNetworkGatewayConnectionListEntityInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2018_04_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.SubResource;
import java.util.Map;

/**
 * Type representing VirtualNetworkGatewayConnectionListEntity.
 */
public interface VirtualNetworkGatewayConnectionListEntity extends HasInner<VirtualNetworkGatewayConnectionListEntityInner>, HasManager<NetworkManager> {
    /**
     * @return the authorizationKey value.
     */
    String authorizationKey();

    /**
     * @return the connectionStatus value.
     */
    VirtualNetworkGatewayConnectionStatus connectionStatus();

    /**
     * @return the connectionType value.
     */
    VirtualNetworkGatewayConnectionType connectionType();

    /**
     * @return the egressBytesTransferred value.
     */
    Long egressBytesTransferred();

    /**
     * @return the enableBgp value.
     */
    Boolean enableBgp();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the ingressBytesTransferred value.
     */
    Long ingressBytesTransferred();

    /**
     * @return the ipsecPolicies value.
     */
    List<IpsecPolicy> ipsecPolicies();

    /**
     * @return the localNetworkGateway2 value.
     */
    VirtualNetworkConnectionGatewayReference localNetworkGateway2();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the peer value.
     */
    SubResource peer();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * @return the routingWeight value.
     */
    Integer routingWeight();

    /**
     * @return the sharedKey value.
     */
    String sharedKey();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the tunnelConnectionStatus value.
     */
    List<TunnelConnectionHealth> tunnelConnectionStatus();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the usePolicyBasedTrafficSelectors value.
     */
    Boolean usePolicyBasedTrafficSelectors();

    /**
     * @return the virtualNetworkGateway1 value.
     */
    VirtualNetworkConnectionGatewayReference virtualNetworkGateway1();

    /**
     * @return the virtualNetworkGateway2 value.
     */
    VirtualNetworkConnectionGatewayReference virtualNetworkGateway2();

}
