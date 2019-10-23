/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2019_09_01.implementation.VpnSiteLinkConnectionInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2019_09_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.SubResource;

/**
 * Type representing VpnConnectionVpnGatewayVpnSiteLinkConnectionModel.
 */
public interface VpnConnectionVpnGatewayVpnSiteLinkConnectionModel extends HasInner<VpnSiteLinkConnectionInner>, HasManager<NetworkManager> {
    /**
     * @return the connectionBandwidth value.
     */
    Integer connectionBandwidth();

    /**
     * @return the connectionStatus value.
     */
    VpnConnectionStatus connectionStatus();

    /**
     * @return the egressBytesTransferred value.
     */
    Long egressBytesTransferred();

    /**
     * @return the enableBgp value.
     */
    Boolean enableBgp();

    /**
     * @return the enableRateLimiting value.
     */
    Boolean enableRateLimiting();

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
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the routingWeight value.
     */
    Integer routingWeight();

    /**
     * @return the sharedKey value.
     */
    String sharedKey();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the useLocalAzureIpAddress value.
     */
    Boolean useLocalAzureIpAddress();

    /**
     * @return the usePolicyBasedTrafficSelectors value.
     */
    Boolean usePolicyBasedTrafficSelectors();

    /**
     * @return the vpnConnectionProtocolType value.
     */
    VirtualNetworkGatewayConnectionProtocol vpnConnectionProtocolType();

    /**
     * @return the vpnSiteLink value.
     */
    SubResource vpnSiteLink();

}
