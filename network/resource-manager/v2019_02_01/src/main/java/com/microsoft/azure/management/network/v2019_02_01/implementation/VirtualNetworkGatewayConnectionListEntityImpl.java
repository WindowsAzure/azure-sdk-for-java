/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_02_01.implementation;

import com.microsoft.azure.management.network.v2019_02_01.VirtualNetworkGatewayConnectionListEntity;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.network.v2019_02_01.VirtualNetworkGatewayConnectionProtocol;
import com.microsoft.azure.management.network.v2019_02_01.VirtualNetworkGatewayConnectionStatus;
import com.microsoft.azure.management.network.v2019_02_01.VirtualNetworkGatewayConnectionType;
import java.util.List;
import com.microsoft.azure.management.network.v2019_02_01.IpsecPolicy;
import com.microsoft.azure.management.network.v2019_02_01.VirtualNetworkConnectionGatewayReference;
import com.microsoft.azure.SubResource;
import java.util.Map;
import com.microsoft.azure.management.network.v2019_02_01.TunnelConnectionHealth;

class VirtualNetworkGatewayConnectionListEntityImpl extends WrapperImpl<VirtualNetworkGatewayConnectionListEntityInner> implements VirtualNetworkGatewayConnectionListEntity {
    private final NetworkManager manager;

    VirtualNetworkGatewayConnectionListEntityImpl(VirtualNetworkGatewayConnectionListEntityInner inner,  NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }



    @Override
    public String authorizationKey() {
        return this.inner().authorizationKey();
    }

    @Override
    public VirtualNetworkGatewayConnectionProtocol connectionProtocol() {
        return this.inner().connectionProtocol();
    }

    @Override
    public VirtualNetworkGatewayConnectionStatus connectionStatus() {
        return this.inner().connectionStatus();
    }

    @Override
    public VirtualNetworkGatewayConnectionType connectionType() {
        return this.inner().connectionType();
    }

    @Override
    public Long egressBytesTransferred() {
        return this.inner().egressBytesTransferred();
    }

    @Override
    public Boolean enableBgp() {
        return this.inner().enableBgp();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public Boolean expressRouteGatewayBypass() {
        return this.inner().expressRouteGatewayBypass();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Long ingressBytesTransferred() {
        return this.inner().ingressBytesTransferred();
    }

    @Override
    public List<IpsecPolicy> ipsecPolicies() {
        return this.inner().ipsecPolicies();
    }

    @Override
    public VirtualNetworkConnectionGatewayReference localNetworkGateway2() {
        return this.inner().localNetworkGateway2();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public SubResource peer() {
        return this.inner().peer();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String resourceGuid() {
        return this.inner().resourceGuid();
    }

    @Override
    public Integer routingWeight() {
        return this.inner().routingWeight();
    }

    @Override
    public String sharedKey() {
        return this.inner().sharedKey();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public List<TunnelConnectionHealth> tunnelConnectionStatus() {
        return this.inner().tunnelConnectionStatus();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public Boolean usePolicyBasedTrafficSelectors() {
        return this.inner().usePolicyBasedTrafficSelectors();
    }

    @Override
    public VirtualNetworkConnectionGatewayReference virtualNetworkGateway1() {
        return this.inner().virtualNetworkGateway1();
    }

    @Override
    public VirtualNetworkConnectionGatewayReference virtualNetworkGateway2() {
        return this.inner().virtualNetworkGateway2();
    }

}
