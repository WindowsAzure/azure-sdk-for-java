/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2018_04_01.implementation.VpnConnectionInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2018_04_01.implementation.NetworkManager;
import java.util.Map;
import com.microsoft.azure.SubResource;
import java.util.List;

/**
 * Type representing VpnConnection.
 */
public interface VpnConnection extends HasInner<VpnConnectionInner>, Indexable, Refreshable<VpnConnection>, Updatable<VpnConnection.Update>, HasManager<NetworkManager> {
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
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the remoteVpnSite value.
     */
    SubResource remoteVpnSite();

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
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the VpnConnection definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithVpnGateway, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of VpnConnection definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a VpnConnection definition.
         */
        interface Blank extends WithVpnGateway {
        }

        /**
         * The stage of the vpnconnection definition allowing to specify VpnGateway.
         */
        interface WithVpnGateway {
           /**
            * Specifies resourceGroupName, gatewayName.
            */
            WithCreate withExistingVpnGateway(String resourceGroupName, String gatewayName);
        }

        /**
         * The stage of the vpnconnection definition allowing to specify ConnectionStatus.
         */
        interface WithConnectionStatus {
            /**
             * Specifies connectionStatus.
             */
            WithCreate withConnectionStatus(VpnConnectionStatus connectionStatus);
        }

        /**
         * The stage of the vpnconnection definition allowing to specify EnableBgp.
         */
        interface WithEnableBgp {
            /**
             * Specifies enableBgp.
             */
            WithCreate withEnableBgp(Boolean enableBgp);
        }

        /**
         * The stage of the vpnconnection definition allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             */
            WithCreate withId(String id);
        }

        /**
         * The stage of the vpnconnection definition allowing to specify IpsecPolicies.
         */
        interface WithIpsecPolicies {
            /**
             * Specifies ipsecPolicies.
             */
            WithCreate withIpsecPolicies(List<IpsecPolicy> ipsecPolicies);
        }

        /**
         * The stage of the vpnconnection definition allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the vpnconnection definition allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             */
            WithCreate withProvisioningState(ProvisioningState provisioningState);
        }

        /**
         * The stage of the vpnconnection definition allowing to specify RemoteVpnSite.
         */
        interface WithRemoteVpnSite {
            /**
             * Specifies remoteVpnSite.
             */
            WithCreate withRemoteVpnSite(SubResource remoteVpnSite);
        }

        /**
         * The stage of the vpnconnection definition allowing to specify RoutingWeight.
         */
        interface WithRoutingWeight {
            /**
             * Specifies routingWeight.
             */
            WithCreate withRoutingWeight(Integer routingWeight);
        }

        /**
         * The stage of the vpnconnection definition allowing to specify SharedKey.
         */
        interface WithSharedKey {
            /**
             * Specifies sharedKey.
             */
            WithCreate withSharedKey(String sharedKey);
        }

        /**
         * The stage of the vpnconnection definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<VpnConnection>, DefinitionStages.WithConnectionStatus, DefinitionStages.WithEnableBgp, DefinitionStages.WithId, DefinitionStages.WithIpsecPolicies, DefinitionStages.WithLocation, DefinitionStages.WithProvisioningState, DefinitionStages.WithRemoteVpnSite, DefinitionStages.WithRoutingWeight, DefinitionStages.WithSharedKey, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a VpnConnection update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<VpnConnection>, UpdateStages.WithConnectionStatus, UpdateStages.WithEnableBgp, UpdateStages.WithId, UpdateStages.WithIpsecPolicies, UpdateStages.WithLocation, UpdateStages.WithProvisioningState, UpdateStages.WithRemoteVpnSite, UpdateStages.WithRoutingWeight, UpdateStages.WithSharedKey, UpdateStages.WithTags {
    }

    /**
     * Grouping of VpnConnection update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the vpnconnection update allowing to specify ConnectionStatus.
         */
        interface WithConnectionStatus {
            /**
             * Specifies connectionStatus.
             */
            Update withConnectionStatus(VpnConnectionStatus connectionStatus);
        }

        /**
         * The stage of the vpnconnection update allowing to specify EnableBgp.
         */
        interface WithEnableBgp {
            /**
             * Specifies enableBgp.
             */
            Update withEnableBgp(Boolean enableBgp);
        }

        /**
         * The stage of the vpnconnection update allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             */
            Update withId(String id);
        }

        /**
         * The stage of the vpnconnection update allowing to specify IpsecPolicies.
         */
        interface WithIpsecPolicies {
            /**
             * Specifies ipsecPolicies.
             */
            Update withIpsecPolicies(List<IpsecPolicy> ipsecPolicies);
        }

        /**
         * The stage of the vpnconnection update allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             */
            Update withLocation(String location);
        }

        /**
         * The stage of the vpnconnection update allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             */
            Update withProvisioningState(ProvisioningState provisioningState);
        }

        /**
         * The stage of the vpnconnection update allowing to specify RemoteVpnSite.
         */
        interface WithRemoteVpnSite {
            /**
             * Specifies remoteVpnSite.
             */
            Update withRemoteVpnSite(SubResource remoteVpnSite);
        }

        /**
         * The stage of the vpnconnection update allowing to specify RoutingWeight.
         */
        interface WithRoutingWeight {
            /**
             * Specifies routingWeight.
             */
            Update withRoutingWeight(Integer routingWeight);
        }

        /**
         * The stage of the vpnconnection update allowing to specify SharedKey.
         */
        interface WithSharedKey {
            /**
             * Specifies sharedKey.
             */
            Update withSharedKey(String sharedKey);
        }

        /**
         * The stage of the vpnconnection update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             */
            Update withTags(Map<String, String> tags);
        }

    }
}
