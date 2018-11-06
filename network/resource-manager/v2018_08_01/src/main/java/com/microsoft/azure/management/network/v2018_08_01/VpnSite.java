/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2018_08_01.implementation.NetworkManager;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2018_08_01.implementation.VpnSiteInner;

/**
 * Type representing VpnSite.
 */
public interface VpnSite extends HasInner<VpnSiteInner>, Resource, GroupableResourceCore<NetworkManager, VpnSiteInner>, HasResourceGroup, Refreshable<VpnSite>, Updatable<VpnSite.Update>, HasManager<NetworkManager> {
    /**
     * @return the addressSpace value.
     */
    AddressSpace addressSpace();

    /**
     * @return the bgpProperties value.
     */
    BgpSettings bgpProperties();

    /**
     * @return the deviceProperties value.
     */
    DeviceProperties deviceProperties();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the ipAddress value.
     */
    String ipAddress();

    /**
     * @return the isSecuritySite value.
     */
    Boolean isSecuritySite();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the siteKey value.
     */
    String siteKey();

    /**
     * @return the virtualWan value.
     */
    SubResource virtualWan();

    /**
     * The entirety of the VpnSite definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of VpnSite definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a VpnSite definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the VpnSite definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the vpnsite update allowing to specify AddressSpace.
         */
        interface WithAddressSpace {
            /**
             * Specifies addressSpace.
             */
            WithCreate withAddressSpace(AddressSpace addressSpace);
        }

        /**
         * The stage of the vpnsite update allowing to specify BgpProperties.
         */
        interface WithBgpProperties {
            /**
             * Specifies bgpProperties.
             */
            WithCreate withBgpProperties(BgpSettings bgpProperties);
        }

        /**
         * The stage of the vpnsite update allowing to specify DeviceProperties.
         */
        interface WithDeviceProperties {
            /**
             * Specifies deviceProperties.
             */
            WithCreate withDeviceProperties(DeviceProperties deviceProperties);
        }

        /**
         * The stage of the vpnsite update allowing to specify IpAddress.
         */
        interface WithIpAddress {
            /**
             * Specifies ipAddress.
             */
            WithCreate withIpAddress(String ipAddress);
        }

        /**
         * The stage of the vpnsite update allowing to specify IsSecuritySite.
         */
        interface WithIsSecuritySite {
            /**
             * Specifies isSecuritySite.
             */
            WithCreate withIsSecuritySite(Boolean isSecuritySite);
        }

        /**
         * The stage of the vpnsite update allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             */
            WithCreate withProvisioningState(ProvisioningState provisioningState);
        }

        /**
         * The stage of the vpnsite update allowing to specify SiteKey.
         */
        interface WithSiteKey {
            /**
             * Specifies siteKey.
             */
            WithCreate withSiteKey(String siteKey);
        }

        /**
         * The stage of the vpnsite update allowing to specify VirtualWan.
         */
        interface WithVirtualWan {
            /**
             * Specifies virtualWan.
             */
            WithCreate withVirtualWan(SubResource virtualWan);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<VpnSite>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithAddressSpace, DefinitionStages.WithBgpProperties, DefinitionStages.WithDeviceProperties, DefinitionStages.WithIpAddress, DefinitionStages.WithIsSecuritySite, DefinitionStages.WithProvisioningState, DefinitionStages.WithSiteKey, DefinitionStages.WithVirtualWan {
        }
    }
    /**
     * The template for a VpnSite update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<VpnSite>, Resource.UpdateWithTags<Update>, UpdateStages.WithAddressSpace, UpdateStages.WithBgpProperties, UpdateStages.WithDeviceProperties, UpdateStages.WithIpAddress, UpdateStages.WithIsSecuritySite, UpdateStages.WithProvisioningState, UpdateStages.WithSiteKey, UpdateStages.WithVirtualWan {
    }

    /**
     * Grouping of VpnSite update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the vpnsite {0} allowing to specify AddressSpace.
         */
        interface WithAddressSpace {
            /**
             * Specifies addressSpace.
             */
            Update withAddressSpace(AddressSpace addressSpace);
        }

        /**
         * The stage of the vpnsite {0} allowing to specify BgpProperties.
         */
        interface WithBgpProperties {
            /**
             * Specifies bgpProperties.
             */
            Update withBgpProperties(BgpSettings bgpProperties);
        }

        /**
         * The stage of the vpnsite {0} allowing to specify DeviceProperties.
         */
        interface WithDeviceProperties {
            /**
             * Specifies deviceProperties.
             */
            Update withDeviceProperties(DeviceProperties deviceProperties);
        }

        /**
         * The stage of the vpnsite {0} allowing to specify IpAddress.
         */
        interface WithIpAddress {
            /**
             * Specifies ipAddress.
             */
            Update withIpAddress(String ipAddress);
        }

        /**
         * The stage of the vpnsite {0} allowing to specify IsSecuritySite.
         */
        interface WithIsSecuritySite {
            /**
             * Specifies isSecuritySite.
             */
            Update withIsSecuritySite(Boolean isSecuritySite);
        }

        /**
         * The stage of the vpnsite {0} allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             */
            Update withProvisioningState(ProvisioningState provisioningState);
        }

        /**
         * The stage of the vpnsite {0} allowing to specify SiteKey.
         */
        interface WithSiteKey {
            /**
             * Specifies siteKey.
             */
            Update withSiteKey(String siteKey);
        }

        /**
         * The stage of the vpnsite {0} allowing to specify VirtualWan.
         */
        interface WithVirtualWan {
            /**
             * Specifies virtualWan.
             */
            Update withVirtualWan(SubResource virtualWan);
        }

    }
}
