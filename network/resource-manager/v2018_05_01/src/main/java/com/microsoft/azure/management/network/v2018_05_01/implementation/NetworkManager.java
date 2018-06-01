/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_05_01.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.network.v2018_05_01.ApplicationGateways;
import com.microsoft.azure.management.network.v2018_05_01.ApplicationSecurityGroups;
import com.microsoft.azure.management.network.v2018_05_01.DdosProtectionPlans;
import com.microsoft.azure.management.network.v2018_05_01.AvailableEndpointServices;
import com.microsoft.azure.management.network.v2018_05_01.ExpressRouteCircuitAuthorizations;
import com.microsoft.azure.management.network.v2018_05_01.ExpressRouteCircuitPeerings;
import com.microsoft.azure.management.network.v2018_05_01.ExpressRouteCircuitConnections;
import com.microsoft.azure.management.network.v2018_05_01.ExpressRouteCircuits;
import com.microsoft.azure.management.network.v2018_05_01.ExpressRouteServiceProviders;
import com.microsoft.azure.management.network.v2018_05_01.ExpressRouteCrossConnections;
import com.microsoft.azure.management.network.v2018_05_01.ExpressRouteCrossConnectionPeerings;
import com.microsoft.azure.management.network.v2018_05_01.LoadBalancers;
import com.microsoft.azure.management.network.v2018_05_01.LoadBalancerBackendAddressPools;
import com.microsoft.azure.management.network.v2018_05_01.LoadBalancerFrontendIPConfigurations;
import com.microsoft.azure.management.network.v2018_05_01.InboundNatRules;
import com.microsoft.azure.management.network.v2018_05_01.LoadBalancerLoadBalancingRules;
import com.microsoft.azure.management.network.v2018_05_01.LoadBalancerNetworkInterfaces;
import com.microsoft.azure.management.network.v2018_05_01.LoadBalancerProbes;
import com.microsoft.azure.management.network.v2018_05_01.NetworkInterfaces;
import com.microsoft.azure.management.network.v2018_05_01.NetworkInterfaceIPConfigurations;
import com.microsoft.azure.management.network.v2018_05_01.NetworkInterfaceLoadBalancers;
import com.microsoft.azure.management.network.v2018_05_01.NetworkSecurityGroups;
import com.microsoft.azure.management.network.v2018_05_01.SecurityRules;
import com.microsoft.azure.management.network.v2018_05_01.DefaultSecurityRules;
import com.microsoft.azure.management.network.v2018_05_01.NetworkWatchers;
import com.microsoft.azure.management.network.v2018_05_01.PacketCaptures;
import com.microsoft.azure.management.network.v2018_05_01.ConnectionMonitors;
import com.microsoft.azure.management.network.v2018_05_01.Operations;
import com.microsoft.azure.management.network.v2018_05_01.PublicIPAddresses;
import com.microsoft.azure.management.network.v2018_05_01.RouteFilters;
import com.microsoft.azure.management.network.v2018_05_01.RouteFilterRules;
import com.microsoft.azure.management.network.v2018_05_01.RouteTables;
import com.microsoft.azure.management.network.v2018_05_01.Routes;
import com.microsoft.azure.management.network.v2018_05_01.BgpServiceCommunities;
import com.microsoft.azure.management.network.v2018_05_01.Usages;
import com.microsoft.azure.management.network.v2018_05_01.VirtualNetworks;
import com.microsoft.azure.management.network.v2018_05_01.Subnets;
import com.microsoft.azure.management.network.v2018_05_01.VirtualNetworkPeerings;
import com.microsoft.azure.management.network.v2018_05_01.VirtualNetworkGateways;
import com.microsoft.azure.management.network.v2018_05_01.VirtualNetworkGatewayConnections;
import com.microsoft.azure.management.network.v2018_05_01.LocalNetworkGateways;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure Network resource management.
 */
public final class NetworkManager extends ManagerCore<NetworkManager, NetworkManagementClientImpl> {
    private ApplicationGateways applicationGateways;
    private ApplicationSecurityGroups applicationSecurityGroups;
    private DdosProtectionPlans ddosProtectionPlans;
    private AvailableEndpointServices availableEndpointServices;
    private ExpressRouteCircuitAuthorizations expressRouteCircuitAuthorizations;
    private ExpressRouteCircuitPeerings expressRouteCircuitPeerings;
    private ExpressRouteCircuitConnections expressRouteCircuitConnections;
    private ExpressRouteCircuits expressRouteCircuits;
    private ExpressRouteServiceProviders expressRouteServiceProviders;
    private ExpressRouteCrossConnections expressRouteCrossConnections;
    private ExpressRouteCrossConnectionPeerings expressRouteCrossConnectionPeerings;
    private LoadBalancers loadBalancers;
    private LoadBalancerBackendAddressPools loadBalancerBackendAddressPools;
    private LoadBalancerFrontendIPConfigurations loadBalancerFrontendIPConfigurations;
    private InboundNatRules inboundNatRules;
    private LoadBalancerLoadBalancingRules loadBalancerLoadBalancingRules;
    private LoadBalancerNetworkInterfaces loadBalancerNetworkInterfaces;
    private LoadBalancerProbes loadBalancerProbes;
    private NetworkInterfaces networkInterfaces;
    private NetworkInterfaceIPConfigurations networkInterfaceIPConfigurations;
    private NetworkInterfaceLoadBalancers networkInterfaceLoadBalancers;
    private NetworkSecurityGroups networkSecurityGroups;
    private SecurityRules securityRules;
    private DefaultSecurityRules defaultSecurityRules;
    private NetworkWatchers networkWatchers;
    private PacketCaptures packetCaptures;
    private ConnectionMonitors connectionMonitors;
    private Operations operations;
    private PublicIPAddresses publicIPAddresses;
    private RouteFilters routeFilters;
    private RouteFilterRules routeFilterRules;
    private RouteTables routeTables;
    private Routes routes;
    private BgpServiceCommunities bgpServiceCommunities;
    private Usages usages;
    private VirtualNetworks virtualNetworks;
    private Subnets subnets;
    private VirtualNetworkPeerings virtualNetworkPeerings;
    private VirtualNetworkGateways virtualNetworkGateways;
    private VirtualNetworkGatewayConnections virtualNetworkGatewayConnections;
    private LocalNetworkGateways localNetworkGateways;
    /**
    * Get a Configurable instance that can be used to create NetworkManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new NetworkManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of NetworkManager that exposes Network resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the NetworkManager
    */
    public static NetworkManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new NetworkManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of NetworkManager that exposes Network resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the NetworkManager
    */
    public static NetworkManager authenticate(RestClient restClient, String subscriptionId) {
        return new NetworkManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of NetworkManager that exposes Network management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing Network management API entry points that work across subscriptions
        */
        NetworkManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage ApplicationGateways.
     */
    public ApplicationGateways applicationGateways() {
        if (this.applicationGateways == null) {
            this.applicationGateways = new ApplicationGatewaysImpl(this);
        }
        return this.applicationGateways;
    }

    /**
     * @return Entry point to manage ApplicationSecurityGroups.
     */
    public ApplicationSecurityGroups applicationSecurityGroups() {
        if (this.applicationSecurityGroups == null) {
            this.applicationSecurityGroups = new ApplicationSecurityGroupsImpl(this);
        }
        return this.applicationSecurityGroups;
    }

    /**
     * @return Entry point to manage DdosProtectionPlans.
     */
    public DdosProtectionPlans ddosProtectionPlans() {
        if (this.ddosProtectionPlans == null) {
            this.ddosProtectionPlans = new DdosProtectionPlansImpl(this);
        }
        return this.ddosProtectionPlans;
    }

    /**
     * @return Entry point to manage AvailableEndpointServices.
     */
    public AvailableEndpointServices availableEndpointServices() {
        if (this.availableEndpointServices == null) {
            this.availableEndpointServices = new AvailableEndpointServicesImpl(this);
        }
        return this.availableEndpointServices;
    }

    /**
     * @return Entry point to manage ExpressRouteCircuitAuthorizations.
     */
    public ExpressRouteCircuitAuthorizations expressRouteCircuitAuthorizations() {
        if (this.expressRouteCircuitAuthorizations == null) {
            this.expressRouteCircuitAuthorizations = new ExpressRouteCircuitAuthorizationsImpl(this);
        }
        return this.expressRouteCircuitAuthorizations;
    }

    /**
     * @return Entry point to manage ExpressRouteCircuitPeerings.
     */
    public ExpressRouteCircuitPeerings expressRouteCircuitPeerings() {
        if (this.expressRouteCircuitPeerings == null) {
            this.expressRouteCircuitPeerings = new ExpressRouteCircuitPeeringsImpl(this);
        }
        return this.expressRouteCircuitPeerings;
    }

    /**
     * @return Entry point to manage ExpressRouteCircuitConnections.
     */
    public ExpressRouteCircuitConnections expressRouteCircuitConnections() {
        if (this.expressRouteCircuitConnections == null) {
            this.expressRouteCircuitConnections = new ExpressRouteCircuitConnectionsImpl(this);
        }
        return this.expressRouteCircuitConnections;
    }

    /**
     * @return Entry point to manage ExpressRouteCircuits.
     */
    public ExpressRouteCircuits expressRouteCircuits() {
        if (this.expressRouteCircuits == null) {
            this.expressRouteCircuits = new ExpressRouteCircuitsImpl(this);
        }
        return this.expressRouteCircuits;
    }

    /**
     * @return Entry point to manage ExpressRouteServiceProviders.
     */
    public ExpressRouteServiceProviders expressRouteServiceProviders() {
        if (this.expressRouteServiceProviders == null) {
            this.expressRouteServiceProviders = new ExpressRouteServiceProvidersImpl(this);
        }
        return this.expressRouteServiceProviders;
    }

    /**
     * @return Entry point to manage ExpressRouteCrossConnections.
     */
    public ExpressRouteCrossConnections expressRouteCrossConnections() {
        if (this.expressRouteCrossConnections == null) {
            this.expressRouteCrossConnections = new ExpressRouteCrossConnectionsImpl(this);
        }
        return this.expressRouteCrossConnections;
    }

    /**
     * @return Entry point to manage ExpressRouteCrossConnectionPeerings.
     */
    public ExpressRouteCrossConnectionPeerings expressRouteCrossConnectionPeerings() {
        if (this.expressRouteCrossConnectionPeerings == null) {
            this.expressRouteCrossConnectionPeerings = new ExpressRouteCrossConnectionPeeringsImpl(this);
        }
        return this.expressRouteCrossConnectionPeerings;
    }

    /**
     * @return Entry point to manage LoadBalancers.
     */
    public LoadBalancers loadBalancers() {
        if (this.loadBalancers == null) {
            this.loadBalancers = new LoadBalancersImpl(this);
        }
        return this.loadBalancers;
    }

    /**
     * @return Entry point to manage LoadBalancerBackendAddressPools.
     */
    public LoadBalancerBackendAddressPools loadBalancerBackendAddressPools() {
        if (this.loadBalancerBackendAddressPools == null) {
            this.loadBalancerBackendAddressPools = new LoadBalancerBackendAddressPoolsImpl(this);
        }
        return this.loadBalancerBackendAddressPools;
    }

    /**
     * @return Entry point to manage LoadBalancerFrontendIPConfigurations.
     */
    public LoadBalancerFrontendIPConfigurations loadBalancerFrontendIPConfigurations() {
        if (this.loadBalancerFrontendIPConfigurations == null) {
            this.loadBalancerFrontendIPConfigurations = new LoadBalancerFrontendIPConfigurationsImpl(this);
        }
        return this.loadBalancerFrontendIPConfigurations;
    }

    /**
     * @return Entry point to manage InboundNatRules.
     */
    public InboundNatRules inboundNatRules() {
        if (this.inboundNatRules == null) {
            this.inboundNatRules = new InboundNatRulesImpl(this);
        }
        return this.inboundNatRules;
    }

    /**
     * @return Entry point to manage LoadBalancerLoadBalancingRules.
     */
    public LoadBalancerLoadBalancingRules loadBalancerLoadBalancingRules() {
        if (this.loadBalancerLoadBalancingRules == null) {
            this.loadBalancerLoadBalancingRules = new LoadBalancerLoadBalancingRulesImpl(this);
        }
        return this.loadBalancerLoadBalancingRules;
    }

    /**
     * @return Entry point to manage LoadBalancerNetworkInterfaces.
     */
    public LoadBalancerNetworkInterfaces loadBalancerNetworkInterfaces() {
        if (this.loadBalancerNetworkInterfaces == null) {
            this.loadBalancerNetworkInterfaces = new LoadBalancerNetworkInterfacesImpl(this);
        }
        return this.loadBalancerNetworkInterfaces;
    }

    /**
     * @return Entry point to manage LoadBalancerProbes.
     */
    public LoadBalancerProbes loadBalancerProbes() {
        if (this.loadBalancerProbes == null) {
            this.loadBalancerProbes = new LoadBalancerProbesImpl(this);
        }
        return this.loadBalancerProbes;
    }

    /**
     * @return Entry point to manage NetworkInterfaces.
     */
    public NetworkInterfaces networkInterfaces() {
        if (this.networkInterfaces == null) {
            this.networkInterfaces = new NetworkInterfacesImpl(this);
        }
        return this.networkInterfaces;
    }

    /**
     * @return Entry point to manage NetworkInterfaceIPConfigurations.
     */
    public NetworkInterfaceIPConfigurations networkInterfaceIPConfigurations() {
        if (this.networkInterfaceIPConfigurations == null) {
            this.networkInterfaceIPConfigurations = new NetworkInterfaceIPConfigurationsImpl(this);
        }
        return this.networkInterfaceIPConfigurations;
    }

    /**
     * @return Entry point to manage NetworkInterfaceLoadBalancers.
     */
    public NetworkInterfaceLoadBalancers networkInterfaceLoadBalancers() {
        if (this.networkInterfaceLoadBalancers == null) {
            this.networkInterfaceLoadBalancers = new NetworkInterfaceLoadBalancersImpl(this);
        }
        return this.networkInterfaceLoadBalancers;
    }

    /**
     * @return Entry point to manage NetworkSecurityGroups.
     */
    public NetworkSecurityGroups networkSecurityGroups() {
        if (this.networkSecurityGroups == null) {
            this.networkSecurityGroups = new NetworkSecurityGroupsImpl(this);
        }
        return this.networkSecurityGroups;
    }

    /**
     * @return Entry point to manage SecurityRules.
     */
    public SecurityRules securityRules() {
        if (this.securityRules == null) {
            this.securityRules = new SecurityRulesImpl(this);
        }
        return this.securityRules;
    }

    /**
     * @return Entry point to manage DefaultSecurityRules.
     */
    public DefaultSecurityRules defaultSecurityRules() {
        if (this.defaultSecurityRules == null) {
            this.defaultSecurityRules = new DefaultSecurityRulesImpl(this);
        }
        return this.defaultSecurityRules;
    }

    /**
     * @return Entry point to manage NetworkWatchers.
     */
    public NetworkWatchers networkWatchers() {
        if (this.networkWatchers == null) {
            this.networkWatchers = new NetworkWatchersImpl(this);
        }
        return this.networkWatchers;
    }

    /**
     * @return Entry point to manage PacketCaptures.
     */
    public PacketCaptures packetCaptures() {
        if (this.packetCaptures == null) {
            this.packetCaptures = new PacketCapturesImpl(this);
        }
        return this.packetCaptures;
    }

    /**
     * @return Entry point to manage ConnectionMonitors.
     */
    public ConnectionMonitors connectionMonitors() {
        if (this.connectionMonitors == null) {
            this.connectionMonitors = new ConnectionMonitorsImpl(this);
        }
        return this.connectionMonitors;
    }

    /**
     * @return Entry point to manage Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(this);
        }
        return this.operations;
    }

    /**
     * @return Entry point to manage PublicIPAddresses.
     */
    public PublicIPAddresses publicIPAddresses() {
        if (this.publicIPAddresses == null) {
            this.publicIPAddresses = new PublicIPAddressesImpl(this);
        }
        return this.publicIPAddresses;
    }

    /**
     * @return Entry point to manage RouteFilters.
     */
    public RouteFilters routeFilters() {
        if (this.routeFilters == null) {
            this.routeFilters = new RouteFiltersImpl(this);
        }
        return this.routeFilters;
    }

    /**
     * @return Entry point to manage RouteFilterRules.
     */
    public RouteFilterRules routeFilterRules() {
        if (this.routeFilterRules == null) {
            this.routeFilterRules = new RouteFilterRulesImpl(this);
        }
        return this.routeFilterRules;
    }

    /**
     * @return Entry point to manage RouteTables.
     */
    public RouteTables routeTables() {
        if (this.routeTables == null) {
            this.routeTables = new RouteTablesImpl(this);
        }
        return this.routeTables;
    }

    /**
     * @return Entry point to manage Routes.
     */
    public Routes routes() {
        if (this.routes == null) {
            this.routes = new RoutesImpl(this);
        }
        return this.routes;
    }

    /**
     * @return Entry point to manage BgpServiceCommunities.
     */
    public BgpServiceCommunities bgpServiceCommunities() {
        if (this.bgpServiceCommunities == null) {
            this.bgpServiceCommunities = new BgpServiceCommunitiesImpl(this);
        }
        return this.bgpServiceCommunities;
    }

    /**
     * @return Entry point to manage Usages.
     */
    public Usages usages() {
        if (this.usages == null) {
            this.usages = new UsagesImpl(this);
        }
        return this.usages;
    }

    /**
     * @return Entry point to manage VirtualNetworks.
     */
    public VirtualNetworks virtualNetworks() {
        if (this.virtualNetworks == null) {
            this.virtualNetworks = new VirtualNetworksImpl(this);
        }
        return this.virtualNetworks;
    }

    /**
     * @return Entry point to manage Subnets.
     */
    public Subnets subnets() {
        if (this.subnets == null) {
            this.subnets = new SubnetsImpl(this);
        }
        return this.subnets;
    }

    /**
     * @return Entry point to manage VirtualNetworkPeerings.
     */
    public VirtualNetworkPeerings virtualNetworkPeerings() {
        if (this.virtualNetworkPeerings == null) {
            this.virtualNetworkPeerings = new VirtualNetworkPeeringsImpl(this);
        }
        return this.virtualNetworkPeerings;
    }

    /**
     * @return Entry point to manage VirtualNetworkGateways.
     */
    public VirtualNetworkGateways virtualNetworkGateways() {
        if (this.virtualNetworkGateways == null) {
            this.virtualNetworkGateways = new VirtualNetworkGatewaysImpl(this);
        }
        return this.virtualNetworkGateways;
    }

    /**
     * @return Entry point to manage VirtualNetworkGatewayConnections.
     */
    public VirtualNetworkGatewayConnections virtualNetworkGatewayConnections() {
        if (this.virtualNetworkGatewayConnections == null) {
            this.virtualNetworkGatewayConnections = new VirtualNetworkGatewayConnectionsImpl(this);
        }
        return this.virtualNetworkGatewayConnections;
    }

    /**
     * @return Entry point to manage LocalNetworkGateways.
     */
    public LocalNetworkGateways localNetworkGateways() {
        if (this.localNetworkGateways == null) {
            this.localNetworkGateways = new LocalNetworkGatewaysImpl(this);
        }
        return this.localNetworkGateways;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public NetworkManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return NetworkManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private NetworkManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new NetworkManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
