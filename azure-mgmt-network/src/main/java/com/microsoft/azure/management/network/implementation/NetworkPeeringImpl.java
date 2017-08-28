/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.network.implementation;

import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.management.network.Network;
import com.microsoft.azure.management.network.NetworkPeering;
import com.microsoft.azure.management.network.NetworkPeering.DefinitionStages.WithCreate;
import com.microsoft.azure.management.network.VirtualNetworkPeeringState;
import com.microsoft.azure.management.resources.fluentcore.arm.ResourceUtils;
import com.microsoft.azure.management.resources.fluentcore.arm.models.IndependentChild;
import com.microsoft.azure.management.resources.fluentcore.arm.models.implementation.IndependentChildImpl;
import com.microsoft.azure.management.resources.fluentcore.model.Indexable;
import com.microsoft.azure.management.resources.fluentcore.utils.SdkContext;
import com.microsoft.azure.management.resources.fluentcore.utils.Utils;

import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

/**
 *  Implementation for network peering.
 */
@LangDefinition
class NetworkPeeringImpl
    extends IndependentChildImpl<
        NetworkPeering,
        Network,
        VirtualNetworkPeeringInner,
        NetworkPeeringImpl,
        NetworkManager>
    implements
        NetworkPeering,
        NetworkPeering.Definition,
        NetworkPeering.Update,
        IndependentChild.DefinitionStages.WithParentResource<NetworkPeering, Network> {

    private NetworkImpl parent;
    private Network remoteNetwork;
    private Boolean remoteAccess;                   // Controls the allowAccess setting on the remote peering (null means no change)
    private Boolean remoteForwarding;               // Controls the trafficForwarding setting on the remote peering (null means no change)
    private Boolean startGatewayUseByRemoteNetwork; // Controls the UseGateway setting on the remote network (null means no change)
    private Boolean allowGatewayUseOnRemoteNetwork; // Controls the AllowGatewayTransit setting on the remote network (null means no change)

    NetworkPeeringImpl(VirtualNetworkPeeringInner inner, NetworkImpl parent) {
        super(inner.name(), inner, parent.manager());
        this.parent = parent;
        this.remoteAccess = null;
        this.remoteForwarding = null;
    }

    // Getters

    @Override
    public VirtualNetworkPeeringState state() {
        return this.inner().peeringState();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String networkId() {
        return this.parent.id();
    }

    @Override
    public String remoteNetworkId() {
        return (this.inner().remoteVirtualNetwork() != null) ? this.inner().remoteVirtualNetwork().id() : null;
    }

    @Override
    public boolean isTrafficForwardingFromRemoteNetworkAllowed() {
        return Utils.toPrimitiveBoolean(this.inner().allowForwardedTraffic());
    }

    @Override
    public boolean isAccessFromRemoteNetworkAllowed() {
        return Utils.toPrimitiveBoolean(this.inner().allowVirtualNetworkAccess());
    }

    // Fluent setters

    @Override
    public NetworkPeeringImpl withoutAccessFromRemoteNetwork() {
        this.inner().withAllowVirtualNetworkAccess(false);
        return this;
    }

    @Override
    public NetworkPeeringImpl withAccessFromRemoteNetwork() {
        this.inner().withAllowVirtualNetworkAccess(true);
        return this;
    }

    @Override
    public NetworkPeeringImpl withAccessBetweenBothNetworks() {
        return this.withAccessFromRemoteNetwork().withAccessToRemoteNetwork();
    }

    @Override
    public NetworkPeeringImpl withoutAccessFromEitherNetwork() {
        return this.withoutAccessFromRemoteNetwork().withoutAccessToRemoteNetwork();
    }

    @Override
    public NetworkPeeringImpl withRemoteNetwork(String resourceId) {
        SubResource networkRef = new SubResource().withId(resourceId);
        this.inner().withRemoteVirtualNetwork(networkRef);
        return this;
    }

    @Override
    public NetworkPeeringImpl withRemoteNetwork(Network network) {
        if (network != null) {
            this.remoteNetwork = network;
            return this.withRemoteNetwork(network.id());
        }
        return this;
    }

    @Override
    public NetworkPeeringImpl withTrafficForwardingFromRemoteNetwork() {
        this.inner().withAllowForwardedTraffic(true);
        return this;
    }

    @Override
    public NetworkPeeringImpl withoutTrafficForwardingFromRemoteNetwork() {
        this.inner().withAllowForwardedTraffic(false);
        return this;
    }

    @Override
    public NetworkPeeringImpl withoutTrafficForwardingFromEitherNetwork() {
        return this.withoutTrafficForwardingFromRemoteNetwork().withoutTrafficForwardingToRemoteNetwork();
    }

    @Override
    public NetworkPeeringImpl withTrafficForwardingToRemoteNetwork() {
        this.remoteForwarding = true;
        return this;
    }

    @Override
    public NetworkPeeringImpl withoutTrafficForwardingToRemoteNetwork() {
        this.remoteForwarding = false;
        return this;
    }

    @Override
    public NetworkPeeringImpl withTrafficForwardingBetweenBothNetworks() {
        return this.withTrafficForwardingFromRemoteNetwork().withTrafficForwardingToRemoteNetwork();
    }

    @Override
    public NetworkPeeringImpl withoutAccessToRemoteNetwork() {
        this.remoteAccess = false;
        return this;
    }

    @Override
    public NetworkPeeringImpl withAccessToRemoteNetwork() {
        this.remoteAccess = true;
        return this;
    }

    @Override
    public NetworkPeeringImpl withGatewayUseByRemoteNetworkAllowed() {
        this.inner()
            .withAllowGatewayTransit(true)
            .withUseRemoteGateways(false);
        this.startGatewayUseByRemoteNetwork = null;
        this.allowGatewayUseOnRemoteNetwork = false;
        return this;
    }

    @Override
    public NetworkPeeringImpl withGatewayUseByRemoteNetworkStarted() {
        this.startGatewayUseByRemoteNetwork = true;
        this.allowGatewayUseOnRemoteNetwork = false;
        return this.withGatewayUseByRemoteNetworkAllowed();
    }

    @Override
    public NetworkPeeringImpl withGatewayUseOnRemoteNetworkStarted() {
        this.inner()
            .withAllowGatewayTransit(false)
            .withUseRemoteGateways(true);
        this.startGatewayUseByRemoteNetwork = false;
        this.allowGatewayUseOnRemoteNetwork = true;
        return this;
    }

    @Override
    public NetworkPeeringImpl withGatewayUseDisabled() {
        this.inner()
            .withAllowGatewayTransit(false)
            .withUseRemoteGateways(false);
        this.startGatewayUseByRemoteNetwork = false;
        this.allowGatewayUseOnRemoteNetwork = false;
        return this;
    }

    // Actions

    @Override
    protected Observable<NetworkPeering> createChildResourceAsync() {
        final NetworkPeeringImpl localPeering = this;
        return this.manager().inner().virtualNetworkPeerings()
                .createOrUpdateAsync(this.parent.resourceGroupName(), ResourceUtils.nameFromResourceId(this.networkId()), this.name(), this.inner())
                // After successful creation, update the inner
                .doOnNext(new Action1<VirtualNetworkPeeringInner>() {
                    @Override
                    public void call(VirtualNetworkPeeringInner inner) {
                        if (inner != null) {
                            setInner(inner);
                        }
                    }
                })
                // Then get the remote network to update it if needed and in the same subscription
                .flatMap(new Func1<VirtualNetworkPeeringInner, Observable<Network>>() {
                    @Override
                    public Observable<Network> call(VirtualNetworkPeeringInner inner) {
                        SubResource networkRef = inner.remoteVirtualNetwork();
                        if (ResourceUtils.subscriptionFromResourceId(networkRef.id()).equalsIgnoreCase(ResourceUtils.subscriptionFromResourceId(inner.id()))) {
                            // Update the remote network only if it is in the same subscription
                            return localPeering.manager().networks().getByIdAsync(networkRef.id());
                        } else {
                            // Otherwise, skip this
                            return Observable.just(null);
                        }
                    }
                })
                // Then update the existing remote network if needed
                .flatMap(new Func1<Network, Observable<Indexable>>() {
                    @Override
                    public Observable<Indexable> call(final Network remoteNetwork) {
                        if (remoteNetwork == null) {
                            // If no remote network to update, then skip this
                            return Observable.just(null);
                        }
                        // Check if any peering is already pointing at this network
                        return remoteNetwork.peerings().listAsync().firstOrDefault(null, new Func1<NetworkPeering, Boolean>() {
                            @Override
                            public Boolean call(NetworkPeering remotePeering) {
                                return (remotePeering != null && remotePeering.remoteNetworkId() != null && remotePeering.remoteNetworkId().equalsIgnoreCase(localPeering.parent.id()));
                            }
                        // If no existing matching peering found, then create a matching peering on the remote network
                        }).flatMap(new Func1<NetworkPeering, Observable<Indexable>>() {
                            @Override
                            public Observable<Indexable> call(NetworkPeering remotePeering) {
                                if (remotePeering != null) {
                                    // Matching peering exists, so update as needed
                                    Update remotePeeringUpdate = remotePeering.update();
                                    boolean isUpdateNeeded = false;

                                    // Check if traffic forwarding needs to be updated on the remote peering
                                    if (localPeering.remoteForwarding == null) {
                                        // No traffic forwarding change, so ignore
                                    } else if (localPeering.remoteForwarding.booleanValue() && !remotePeering.isTrafficForwardingFromRemoteNetworkAllowed()) {
                                        isUpdateNeeded = true;
                                        remotePeeringUpdate = remotePeeringUpdate.withTrafficForwardingFromRemoteNetwork();
                                    } else if (!localPeering.remoteForwarding.booleanValue() && remotePeering.isTrafficForwardingFromRemoteNetworkAllowed()) {
                                        isUpdateNeeded = true;
                                        remotePeeringUpdate = remotePeeringUpdate.withoutTrafficForwardingFromRemoteNetwork();
                                    }

                                    // Check if network access needs to be updated on the remote peering
                                    if (localPeering.remoteAccess == null) {
                                        // No access change, so ignore
                                    } else if (localPeering.remoteAccess.booleanValue() && !remotePeering.isAccessFromRemoteNetworkAllowed()) {
                                        isUpdateNeeded = true;
                                        remotePeeringUpdate = remotePeeringUpdate.withAccessFromRemoteNetwork();
                                    } else if (!localPeering.remoteAccess.booleanValue() && remotePeering.isAccessFromRemoteNetworkAllowed()) {
                                        isUpdateNeeded = true;
                                        remotePeeringUpdate = remotePeeringUpdate.withoutAccessFromRemoteNetwork();
                                    }

                                    // TODO: Update gateway

                                    if (isUpdateNeeded) {
                                        localPeering.remoteForwarding = null;
                                        localPeering.remoteAccess = null;
                                        return remotePeeringUpdate.applyAsync().last().cast(Indexable.class);
                                    } else {
                                        return Observable.just((Indexable) localPeering);
                                    }

                                } else {
                                    // No matching remote peering, so create one on the remote network
                                    String peeringName = SdkContext.randomResourceName("peer", 15);

                                    WithCreate remotePeeringDefinition = remoteNetwork.peerings().define(peeringName)
                                            .withRemoteNetwork(localPeering.parent.id());

                                    // Process remote network's UseRemoteGateways setting
                                    if (localPeering.startGatewayUseByRemoteNetwork == null) {
                                        // Do nothing
                                    } else if (localPeering.startGatewayUseByRemoteNetwork.booleanValue()) {
                                        // Start gateway use on this network by the remote network
                                        remotePeeringDefinition.withGatewayUseOnRemoteNetworkStarted();
                                    }

                                    // Process remote network's AllowGatewayTransit setting
                                    if (localPeering.allowGatewayUseOnRemoteNetwork == null) {
                                        // Do nothing
                                    } else if (localPeering.allowGatewayUseOnRemoteNetwork.booleanValue()) {
                                        // Allow gateway use on remote network
                                        remotePeeringDefinition.withGatewayUseByRemoteNetworkAllowed();
                                    }

                                    if (localPeering.remoteAccess != null && !localPeering.remoteAccess) {
                                        remotePeeringDefinition.withoutAccessFromRemoteNetwork(); // Assumes by default access is on for new peerings
                                    }

                                    if (localPeering.remoteForwarding != null && localPeering.remoteForwarding.booleanValue()) {
                                        remotePeeringDefinition.withTrafficForwardingFromRemoteNetwork(); // Assumes by default forwarding is off for new peerings
                                    }

                                    localPeering.remoteAccess = null;
                                    localPeering.remoteForwarding = null;
                                    localPeering.startGatewayUseByRemoteNetwork = null;
                                    localPeering.allowGatewayUseOnRemoteNetwork = null;
                                    return remotePeeringDefinition
                                        .createAsync()
                                        .last();
                                }
                            }
                        });
                    }
                })
                // Then refresh the parent local network, if available
                .flatMap(new Func1<Indexable, Observable<Network>>() {
                    @Override
                    public Observable<Network> call(Indexable remotePeering) {
                        return (localPeering.parent != null) ? localPeering.parent.refreshAsync() : Observable.just((Network) null);
                    }
                })
                // Then refresh the remote network, if available and in the same subscription
                .flatMap(new Func1<Network, Observable<Network>>() {
                    @Override
                    public Observable<Network> call(Network t) {
                        if (localPeering.remoteNetwork == null) {
                            return Observable.just(null);
                        } else if (!ResourceUtils.subscriptionFromResourceId(localPeering.remoteNetworkId()).equalsIgnoreCase(ResourceUtils.subscriptionFromResourceId(localPeering.id()))) {
                            return Observable.just(null);
                        } else {
                            return localPeering.remoteNetwork.refreshAsync();
                        }
                    }
                })
                // Then return the created local peering
                .map(new Func1<Network, NetworkPeering>() {
                    @Override
                    public NetworkPeering call(Network n) {
                        return localPeering;
                    }
                });
    }

    @Override
    protected Observable<VirtualNetworkPeeringInner> getInnerAsync() {
        this.remoteNetwork = null;
        return this.manager().inner().virtualNetworkPeerings().getAsync(
                this.resourceGroupName(),
                ResourceUtils.nameFromResourceId(this.networkId()), this.inner().name());
    }

    @Override
    public Network getRemoteNetwork() {
        if (this.remoteNetwork != null) {
            return this.remoteNetwork;
        } else if (ResourceUtils.subscriptionFromResourceId(this.remoteNetworkId()).equalsIgnoreCase(ResourceUtils.subscriptionFromResourceId(this.id()))) {
            // Fetch the remote network if within the same subscription
            this.remoteNetwork = this.manager().networks().getById(this.remoteNetworkId());
            return this.remoteNetwork;
        } else {
            // Otherwise bail out
            this.remoteNetwork = null;
            return this.remoteNetwork;
        }
    }

    @Override
    public NetworkPeering getRemotePeering() {
        Network network = this.getRemoteNetwork();
        return (network != null) ? network.peerings().associatedWithRemoteNetwork(this.networkId()) : null;
    }

    @Override
    public GatewayUse gatewayUse() {
        if (Utils.toPrimitiveBoolean(this.inner().allowGatewayTransit())) {
            return GatewayUse.BY_REMOTE_NETWORK;
        } else if (Utils.toPrimitiveBoolean(this.inner().useRemoteGateways())) {
            return GatewayUse.ON_REMOTE_NETWORK;
        } else {
            return GatewayUse.NONE;
        }
    }
}
