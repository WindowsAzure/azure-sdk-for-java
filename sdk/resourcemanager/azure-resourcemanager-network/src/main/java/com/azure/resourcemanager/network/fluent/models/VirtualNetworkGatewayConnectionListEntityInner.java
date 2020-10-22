// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.IpsecPolicy;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.TrafficSelectorPolicy;
import com.azure.resourcemanager.network.models.TunnelConnectionHealth;
import com.azure.resourcemanager.network.models.VirtualNetworkConnectionGatewayReference;
import com.azure.resourcemanager.network.models.VirtualNetworkGatewayConnectionProtocol;
import com.azure.resourcemanager.network.models.VirtualNetworkGatewayConnectionStatus;
import com.azure.resourcemanager.network.models.VirtualNetworkGatewayConnectionType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A common class for general resource information. */
@JsonFlatten
@Fluent
public class VirtualNetworkGatewayConnectionListEntityInner extends Resource {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(VirtualNetworkGatewayConnectionListEntityInner.class);

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The authorizationKey.
     */
    @JsonProperty(value = "properties.authorizationKey")
    private String authorizationKey;

    /*
     * The reference to virtual network gateway resource.
     */
    @JsonProperty(value = "properties.virtualNetworkGateway1", required = true)
    private VirtualNetworkConnectionGatewayReference virtualNetworkGateway1;

    /*
     * The reference to virtual network gateway resource.
     */
    @JsonProperty(value = "properties.virtualNetworkGateway2")
    private VirtualNetworkConnectionGatewayReference virtualNetworkGateway2;

    /*
     * The reference to local network gateway resource.
     */
    @JsonProperty(value = "properties.localNetworkGateway2")
    private VirtualNetworkConnectionGatewayReference localNetworkGateway2;

    /*
     * Gateway connection type.
     */
    @JsonProperty(value = "properties.connectionType", required = true)
    private VirtualNetworkGatewayConnectionType connectionType;

    /*
     * Connection protocol used for this connection.
     */
    @JsonProperty(value = "properties.connectionProtocol")
    private VirtualNetworkGatewayConnectionProtocol connectionProtocol;

    /*
     * The routing weight.
     */
    @JsonProperty(value = "properties.routingWeight")
    private Integer routingWeight;

    /*
     * The IPSec shared key.
     */
    @JsonProperty(value = "properties.sharedKey")
    private String sharedKey;

    /*
     * Virtual Network Gateway connection status.
     */
    @JsonProperty(value = "properties.connectionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private VirtualNetworkGatewayConnectionStatus connectionStatus;

    /*
     * Collection of all tunnels' connection health status.
     */
    @JsonProperty(value = "properties.tunnelConnectionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private List<TunnelConnectionHealth> tunnelConnectionStatus;

    /*
     * The egress bytes transferred in this connection.
     */
    @JsonProperty(value = "properties.egressBytesTransferred", access = JsonProperty.Access.WRITE_ONLY)
    private Long egressBytesTransferred;

    /*
     * The ingress bytes transferred in this connection.
     */
    @JsonProperty(value = "properties.ingressBytesTransferred", access = JsonProperty.Access.WRITE_ONLY)
    private Long ingressBytesTransferred;

    /*
     * The reference to peerings resource.
     */
    @JsonProperty(value = "properties.peer")
    private SubResource peer;

    /*
     * EnableBgp flag.
     */
    @JsonProperty(value = "properties.enableBgp")
    private Boolean enableBgp;

    /*
     * Enable policy-based traffic selectors.
     */
    @JsonProperty(value = "properties.usePolicyBasedTrafficSelectors")
    private Boolean usePolicyBasedTrafficSelectors;

    /*
     * The IPSec Policies to be considered by this connection.
     */
    @JsonProperty(value = "properties.ipsecPolicies")
    private List<IpsecPolicy> ipsecPolicies;

    /*
     * The Traffic Selector Policies to be considered by this connection.
     */
    @JsonProperty(value = "properties.trafficSelectorPolicies")
    private List<TrafficSelectorPolicy> trafficSelectorPolicies;

    /*
     * The resource GUID property of the virtual network gateway connection
     * resource.
     */
    @JsonProperty(value = "properties.resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /*
     * The provisioning state of the virtual network gateway connection
     * resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Bypass ExpressRoute Gateway for data forwarding.
     */
    @JsonProperty(value = "properties.expressRouteGatewayBypass")
    private Boolean expressRouteGatewayBypass;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the authorizationKey property: The authorizationKey.
     *
     * @return the authorizationKey value.
     */
    public String authorizationKey() {
        return this.authorizationKey;
    }

    /**
     * Set the authorizationKey property: The authorizationKey.
     *
     * @param authorizationKey the authorizationKey value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withAuthorizationKey(String authorizationKey) {
        this.authorizationKey = authorizationKey;
        return this;
    }

    /**
     * Get the virtualNetworkGateway1 property: The reference to virtual network gateway resource.
     *
     * @return the virtualNetworkGateway1 value.
     */
    public VirtualNetworkConnectionGatewayReference virtualNetworkGateway1() {
        return this.virtualNetworkGateway1;
    }

    /**
     * Set the virtualNetworkGateway1 property: The reference to virtual network gateway resource.
     *
     * @param virtualNetworkGateway1 the virtualNetworkGateway1 value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withVirtualNetworkGateway1(
        VirtualNetworkConnectionGatewayReference virtualNetworkGateway1) {
        this.virtualNetworkGateway1 = virtualNetworkGateway1;
        return this;
    }

    /**
     * Get the virtualNetworkGateway2 property: The reference to virtual network gateway resource.
     *
     * @return the virtualNetworkGateway2 value.
     */
    public VirtualNetworkConnectionGatewayReference virtualNetworkGateway2() {
        return this.virtualNetworkGateway2;
    }

    /**
     * Set the virtualNetworkGateway2 property: The reference to virtual network gateway resource.
     *
     * @param virtualNetworkGateway2 the virtualNetworkGateway2 value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withVirtualNetworkGateway2(
        VirtualNetworkConnectionGatewayReference virtualNetworkGateway2) {
        this.virtualNetworkGateway2 = virtualNetworkGateway2;
        return this;
    }

    /**
     * Get the localNetworkGateway2 property: The reference to local network gateway resource.
     *
     * @return the localNetworkGateway2 value.
     */
    public VirtualNetworkConnectionGatewayReference localNetworkGateway2() {
        return this.localNetworkGateway2;
    }

    /**
     * Set the localNetworkGateway2 property: The reference to local network gateway resource.
     *
     * @param localNetworkGateway2 the localNetworkGateway2 value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withLocalNetworkGateway2(
        VirtualNetworkConnectionGatewayReference localNetworkGateway2) {
        this.localNetworkGateway2 = localNetworkGateway2;
        return this;
    }

    /**
     * Get the connectionType property: Gateway connection type.
     *
     * @return the connectionType value.
     */
    public VirtualNetworkGatewayConnectionType connectionType() {
        return this.connectionType;
    }

    /**
     * Set the connectionType property: Gateway connection type.
     *
     * @param connectionType the connectionType value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withConnectionType(
        VirtualNetworkGatewayConnectionType connectionType) {
        this.connectionType = connectionType;
        return this;
    }

    /**
     * Get the connectionProtocol property: Connection protocol used for this connection.
     *
     * @return the connectionProtocol value.
     */
    public VirtualNetworkGatewayConnectionProtocol connectionProtocol() {
        return this.connectionProtocol;
    }

    /**
     * Set the connectionProtocol property: Connection protocol used for this connection.
     *
     * @param connectionProtocol the connectionProtocol value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withConnectionProtocol(
        VirtualNetworkGatewayConnectionProtocol connectionProtocol) {
        this.connectionProtocol = connectionProtocol;
        return this;
    }

    /**
     * Get the routingWeight property: The routing weight.
     *
     * @return the routingWeight value.
     */
    public Integer routingWeight() {
        return this.routingWeight;
    }

    /**
     * Set the routingWeight property: The routing weight.
     *
     * @param routingWeight the routingWeight value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withRoutingWeight(Integer routingWeight) {
        this.routingWeight = routingWeight;
        return this;
    }

    /**
     * Get the sharedKey property: The IPSec shared key.
     *
     * @return the sharedKey value.
     */
    public String sharedKey() {
        return this.sharedKey;
    }

    /**
     * Set the sharedKey property: The IPSec shared key.
     *
     * @param sharedKey the sharedKey value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
        return this;
    }

    /**
     * Get the connectionStatus property: Virtual Network Gateway connection status.
     *
     * @return the connectionStatus value.
     */
    public VirtualNetworkGatewayConnectionStatus connectionStatus() {
        return this.connectionStatus;
    }

    /**
     * Get the tunnelConnectionStatus property: Collection of all tunnels' connection health status.
     *
     * @return the tunnelConnectionStatus value.
     */
    public List<TunnelConnectionHealth> tunnelConnectionStatus() {
        return this.tunnelConnectionStatus;
    }

    /**
     * Get the egressBytesTransferred property: The egress bytes transferred in this connection.
     *
     * @return the egressBytesTransferred value.
     */
    public Long egressBytesTransferred() {
        return this.egressBytesTransferred;
    }

    /**
     * Get the ingressBytesTransferred property: The ingress bytes transferred in this connection.
     *
     * @return the ingressBytesTransferred value.
     */
    public Long ingressBytesTransferred() {
        return this.ingressBytesTransferred;
    }

    /**
     * Get the peer property: The reference to peerings resource.
     *
     * @return the peer value.
     */
    public SubResource peer() {
        return this.peer;
    }

    /**
     * Set the peer property: The reference to peerings resource.
     *
     * @param peer the peer value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withPeer(SubResource peer) {
        this.peer = peer;
        return this;
    }

    /**
     * Get the enableBgp property: EnableBgp flag.
     *
     * @return the enableBgp value.
     */
    public Boolean enableBgp() {
        return this.enableBgp;
    }

    /**
     * Set the enableBgp property: EnableBgp flag.
     *
     * @param enableBgp the enableBgp value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withEnableBgp(Boolean enableBgp) {
        this.enableBgp = enableBgp;
        return this;
    }

    /**
     * Get the usePolicyBasedTrafficSelectors property: Enable policy-based traffic selectors.
     *
     * @return the usePolicyBasedTrafficSelectors value.
     */
    public Boolean usePolicyBasedTrafficSelectors() {
        return this.usePolicyBasedTrafficSelectors;
    }

    /**
     * Set the usePolicyBasedTrafficSelectors property: Enable policy-based traffic selectors.
     *
     * @param usePolicyBasedTrafficSelectors the usePolicyBasedTrafficSelectors value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withUsePolicyBasedTrafficSelectors(
        Boolean usePolicyBasedTrafficSelectors) {
        this.usePolicyBasedTrafficSelectors = usePolicyBasedTrafficSelectors;
        return this;
    }

    /**
     * Get the ipsecPolicies property: The IPSec Policies to be considered by this connection.
     *
     * @return the ipsecPolicies value.
     */
    public List<IpsecPolicy> ipsecPolicies() {
        return this.ipsecPolicies;
    }

    /**
     * Set the ipsecPolicies property: The IPSec Policies to be considered by this connection.
     *
     * @param ipsecPolicies the ipsecPolicies value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withIpsecPolicies(List<IpsecPolicy> ipsecPolicies) {
        this.ipsecPolicies = ipsecPolicies;
        return this;
    }

    /**
     * Get the trafficSelectorPolicies property: The Traffic Selector Policies to be considered by this connection.
     *
     * @return the trafficSelectorPolicies value.
     */
    public List<TrafficSelectorPolicy> trafficSelectorPolicies() {
        return this.trafficSelectorPolicies;
    }

    /**
     * Set the trafficSelectorPolicies property: The Traffic Selector Policies to be considered by this connection.
     *
     * @param trafficSelectorPolicies the trafficSelectorPolicies value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withTrafficSelectorPolicies(
        List<TrafficSelectorPolicy> trafficSelectorPolicies) {
        this.trafficSelectorPolicies = trafficSelectorPolicies;
        return this;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the virtual network gateway connection resource.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioningState property: The provisioning state of the virtual network gateway connection resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the expressRouteGatewayBypass property: Bypass ExpressRoute Gateway for data forwarding.
     *
     * @return the expressRouteGatewayBypass value.
     */
    public Boolean expressRouteGatewayBypass() {
        return this.expressRouteGatewayBypass;
    }

    /**
     * Set the expressRouteGatewayBypass property: Bypass ExpressRoute Gateway for data forwarding.
     *
     * @param expressRouteGatewayBypass the expressRouteGatewayBypass value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withExpressRouteGatewayBypass(
        Boolean expressRouteGatewayBypass) {
        this.expressRouteGatewayBypass = expressRouteGatewayBypass;
        return this;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (virtualNetworkGateway1() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property virtualNetworkGateway1 in model"
                            + " VirtualNetworkGatewayConnectionListEntityInner"));
        } else {
            virtualNetworkGateway1().validate();
        }
        if (virtualNetworkGateway2() != null) {
            virtualNetworkGateway2().validate();
        }
        if (localNetworkGateway2() != null) {
            localNetworkGateway2().validate();
        }
        if (connectionType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property connectionType in model"
                            + " VirtualNetworkGatewayConnectionListEntityInner"));
        }
        if (tunnelConnectionStatus() != null) {
            tunnelConnectionStatus().forEach(e -> e.validate());
        }
        if (ipsecPolicies() != null) {
            ipsecPolicies().forEach(e -> e.validate());
        }
        if (trafficSelectorPolicies() != null) {
            trafficSelectorPolicies().forEach(e -> e.validate());
        }
    }
}
