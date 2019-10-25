/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2019_09_01.implementation.NetworkManager;
import com.microsoft.azure.SubResource;
import java.util.List;
import com.microsoft.azure.management.network.v2019_09_01.implementation.P2SVpnGatewayInner;

/**
 * Type representing P2SVpnGateway.
 */
public interface P2SVpnGateway extends HasInner<P2SVpnGatewayInner>, Resource, GroupableResourceCore<NetworkManager, P2SVpnGatewayInner>, HasResourceGroup, Refreshable<P2SVpnGateway>, Updatable<P2SVpnGateway.Update>, HasManager<NetworkManager> {
    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the p2SConnectionConfigurations value.
     */
    List<P2SConnectionConfiguration> p2SConnectionConfigurations();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the virtualHub value.
     */
    SubResource virtualHub();

    /**
     * @return the vpnClientConnectionHealth value.
     */
    VpnClientConnectionHealth vpnClientConnectionHealth();

    /**
     * @return the vpnGatewayScaleUnit value.
     */
    Integer vpnGatewayScaleUnit();

    /**
     * @return the vpnServerConfiguration value.
     */
    SubResource vpnServerConfiguration();

    /**
     * The entirety of the P2SVpnGateway definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of P2SVpnGateway definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a P2SVpnGateway definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the P2SVpnGateway definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the p2svpngateway definition allowing to specify P2SConnectionConfigurations.
         */
        interface WithP2SConnectionConfigurations {
            /**
             * Specifies p2SConnectionConfigurations.
             * @param p2SConnectionConfigurations List of all p2s connection configurations of the gateway
             * @return the next definition stage
             */
            WithCreate withP2SConnectionConfigurations(List<P2SConnectionConfiguration> p2SConnectionConfigurations);
        }

        /**
         * The stage of the p2svpngateway definition allowing to specify VirtualHub.
         */
        interface WithVirtualHub {
            /**
             * Specifies virtualHub.
             * @param virtualHub The VirtualHub to which the gateway belongs
             * @return the next definition stage
             */
            WithCreate withVirtualHub(SubResource virtualHub);
        }

        /**
         * The stage of the p2svpngateway definition allowing to specify VpnGatewayScaleUnit.
         */
        interface WithVpnGatewayScaleUnit {
            /**
             * Specifies vpnGatewayScaleUnit.
             * @param vpnGatewayScaleUnit The scale unit for this p2s vpn gateway
             * @return the next definition stage
             */
            WithCreate withVpnGatewayScaleUnit(Integer vpnGatewayScaleUnit);
        }

        /**
         * The stage of the p2svpngateway definition allowing to specify VpnServerConfiguration.
         */
        interface WithVpnServerConfiguration {
            /**
             * Specifies vpnServerConfiguration.
             * @param vpnServerConfiguration The VpnServerConfiguration to which the p2sVpnGateway is attached to
             * @return the next definition stage
             */
            WithCreate withVpnServerConfiguration(SubResource vpnServerConfiguration);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<P2SVpnGateway>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithP2SConnectionConfigurations, DefinitionStages.WithVirtualHub, DefinitionStages.WithVpnGatewayScaleUnit, DefinitionStages.WithVpnServerConfiguration {
        }
    }
    /**
     * The template for a P2SVpnGateway update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<P2SVpnGateway>, Resource.UpdateWithTags<Update>, UpdateStages.WithP2SConnectionConfigurations, UpdateStages.WithVirtualHub, UpdateStages.WithVpnGatewayScaleUnit, UpdateStages.WithVpnServerConfiguration {
    }

    /**
     * Grouping of P2SVpnGateway update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the p2svpngateway update allowing to specify P2SConnectionConfigurations.
         */
        interface WithP2SConnectionConfigurations {
            /**
             * Specifies p2SConnectionConfigurations.
             * @param p2SConnectionConfigurations List of all p2s connection configurations of the gateway
             * @return the next update stage
             */
            Update withP2SConnectionConfigurations(List<P2SConnectionConfiguration> p2SConnectionConfigurations);
        }

        /**
         * The stage of the p2svpngateway update allowing to specify VirtualHub.
         */
        interface WithVirtualHub {
            /**
             * Specifies virtualHub.
             * @param virtualHub The VirtualHub to which the gateway belongs
             * @return the next update stage
             */
            Update withVirtualHub(SubResource virtualHub);
        }

        /**
         * The stage of the p2svpngateway update allowing to specify VpnGatewayScaleUnit.
         */
        interface WithVpnGatewayScaleUnit {
            /**
             * Specifies vpnGatewayScaleUnit.
             * @param vpnGatewayScaleUnit The scale unit for this p2s vpn gateway
             * @return the next update stage
             */
            Update withVpnGatewayScaleUnit(Integer vpnGatewayScaleUnit);
        }

        /**
         * The stage of the p2svpngateway update allowing to specify VpnServerConfiguration.
         */
        interface WithVpnServerConfiguration {
            /**
             * Specifies vpnServerConfiguration.
             * @param vpnServerConfiguration The VpnServerConfiguration to which the p2sVpnGateway is attached to
             * @return the next update stage
             */
            Update withVpnServerConfiguration(SubResource vpnServerConfiguration);
        }

    }
}
