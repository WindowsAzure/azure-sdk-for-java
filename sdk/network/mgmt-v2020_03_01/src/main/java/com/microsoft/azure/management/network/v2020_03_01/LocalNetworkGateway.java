/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_03_01.implementation.NetworkManager;
import com.microsoft.azure.management.network.v2020_03_01.implementation.LocalNetworkGatewayInner;

/**
 * Type representing LocalNetworkGateway.
 */
public interface LocalNetworkGateway extends HasInner<LocalNetworkGatewayInner>, Resource, GroupableResourceCore<NetworkManager, LocalNetworkGatewayInner>, HasResourceGroup, Refreshable<LocalNetworkGateway>, Updatable<LocalNetworkGateway.Update>, HasManager<NetworkManager> {
    /**
     * @return the bgpSettings value.
     */
    BgpSettings bgpSettings();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the fqdn value.
     */
    String fqdn();

    /**
     * @return the gatewayIpAddress value.
     */
    String gatewayIpAddress();

    /**
     * @return the localNetworkAddressSpace value.
     */
    AddressSpace localNetworkAddressSpace();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * The entirety of the LocalNetworkGateway definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of LocalNetworkGateway definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a LocalNetworkGateway definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the LocalNetworkGateway definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the localnetworkgateway definition allowing to specify BgpSettings.
         */
        interface WithBgpSettings {
            /**
             * Specifies bgpSettings.
             * @param bgpSettings Local network gateway's BGP speaker settings
             * @return the next definition stage
             */
            WithCreate withBgpSettings(BgpSettings bgpSettings);
        }

        /**
         * The stage of the localnetworkgateway definition allowing to specify Fqdn.
         */
        interface WithFqdn {
            /**
             * Specifies fqdn.
             * @param fqdn FQDN of local network gateway
             * @return the next definition stage
             */
            WithCreate withFqdn(String fqdn);
        }

        /**
         * The stage of the localnetworkgateway definition allowing to specify GatewayIpAddress.
         */
        interface WithGatewayIpAddress {
            /**
             * Specifies gatewayIpAddress.
             * @param gatewayIpAddress IP address of local network gateway
             * @return the next definition stage
             */
            WithCreate withGatewayIpAddress(String gatewayIpAddress);
        }

        /**
         * The stage of the localnetworkgateway definition allowing to specify LocalNetworkAddressSpace.
         */
        interface WithLocalNetworkAddressSpace {
            /**
             * Specifies localNetworkAddressSpace.
             * @param localNetworkAddressSpace Local network site address space
             * @return the next definition stage
             */
            WithCreate withLocalNetworkAddressSpace(AddressSpace localNetworkAddressSpace);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<LocalNetworkGateway>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithBgpSettings, DefinitionStages.WithFqdn, DefinitionStages.WithGatewayIpAddress, DefinitionStages.WithLocalNetworkAddressSpace {
        }
    }
    /**
     * The template for a LocalNetworkGateway update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<LocalNetworkGateway>, Resource.UpdateWithTags<Update>, UpdateStages.WithBgpSettings, UpdateStages.WithFqdn, UpdateStages.WithGatewayIpAddress, UpdateStages.WithLocalNetworkAddressSpace {
    }

    /**
     * Grouping of LocalNetworkGateway update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the localnetworkgateway update allowing to specify BgpSettings.
         */
        interface WithBgpSettings {
            /**
             * Specifies bgpSettings.
             * @param bgpSettings Local network gateway's BGP speaker settings
             * @return the next update stage
             */
            Update withBgpSettings(BgpSettings bgpSettings);
        }

        /**
         * The stage of the localnetworkgateway update allowing to specify Fqdn.
         */
        interface WithFqdn {
            /**
             * Specifies fqdn.
             * @param fqdn FQDN of local network gateway
             * @return the next update stage
             */
            Update withFqdn(String fqdn);
        }

        /**
         * The stage of the localnetworkgateway update allowing to specify GatewayIpAddress.
         */
        interface WithGatewayIpAddress {
            /**
             * Specifies gatewayIpAddress.
             * @param gatewayIpAddress IP address of local network gateway
             * @return the next update stage
             */
            Update withGatewayIpAddress(String gatewayIpAddress);
        }

        /**
         * The stage of the localnetworkgateway update allowing to specify LocalNetworkAddressSpace.
         */
        interface WithLocalNetworkAddressSpace {
            /**
             * Specifies localNetworkAddressSpace.
             * @param localNetworkAddressSpace Local network site address space
             * @return the next update stage
             */
            Update withLocalNetworkAddressSpace(AddressSpace localNetworkAddressSpace);
        }

    }
}
