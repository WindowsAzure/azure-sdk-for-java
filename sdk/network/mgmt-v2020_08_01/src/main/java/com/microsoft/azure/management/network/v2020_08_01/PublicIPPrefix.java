/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_08_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2020_08_01.implementation.PublicIPPrefixInner;

/**
 * Type representing PublicIPPrefix.
 */
public interface PublicIPPrefix extends HasInner<PublicIPPrefixInner>, Resource, GroupableResourceCore<NetworkManager, PublicIPPrefixInner>, HasResourceGroup, Refreshable<PublicIPPrefix>, Updatable<PublicIPPrefix.Update>, HasManager<NetworkManager> {
    /**
     * @return the customIPPrefix value.
     */
    SubResource customIPPrefix();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the extendedLocation value.
     */
    ExtendedLocation extendedLocation();

    /**
     * @return the ipPrefix value.
     */
    String ipPrefix();

    /**
     * @return the ipTags value.
     */
    List<IpTag> ipTags();

    /**
     * @return the loadBalancerFrontendIpConfiguration value.
     */
    SubResource loadBalancerFrontendIpConfiguration();

    /**
     * @return the prefixLength value.
     */
    Integer prefixLength();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the publicIPAddresses value.
     */
    List<ReferencedPublicIpAddress> publicIPAddresses();

    /**
     * @return the publicIPAddressVersion value.
     */
    IPVersion publicIPAddressVersion();

    /**
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * @return the sku value.
     */
    PublicIPPrefixSku sku();

    /**
     * @return the zones value.
     */
    List<String> zones();

    /**
     * The entirety of the PublicIPPrefix definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of PublicIPPrefix definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a PublicIPPrefix definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the PublicIPPrefix definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the publicipprefix definition allowing to specify CustomIPPrefix.
         */
        interface WithCustomIPPrefix {
            /**
             * Specifies customIPPrefix.
             * @param customIPPrefix The customIpPrefix that this prefix is associated with
             * @return the next definition stage
             */
            WithCreate withCustomIPPrefix(SubResource customIPPrefix);
        }

        /**
         * The stage of the publicipprefix definition allowing to specify ExtendedLocation.
         */
        interface WithExtendedLocation {
            /**
             * Specifies extendedLocation.
             * @param extendedLocation The extended location of the public ip address
             * @return the next definition stage
             */
            WithCreate withExtendedLocation(ExtendedLocation extendedLocation);
        }

        /**
         * The stage of the publicipprefix definition allowing to specify IpTags.
         */
        interface WithIpTags {
            /**
             * Specifies ipTags.
             * @param ipTags The list of tags associated with the public IP prefix
             * @return the next definition stage
             */
            WithCreate withIpTags(List<IpTag> ipTags);
        }

        /**
         * The stage of the publicipprefix definition allowing to specify PrefixLength.
         */
        interface WithPrefixLength {
            /**
             * Specifies prefixLength.
             * @param prefixLength The Length of the Public IP Prefix
             * @return the next definition stage
             */
            WithCreate withPrefixLength(Integer prefixLength);
        }

        /**
         * The stage of the publicipprefix definition allowing to specify PublicIPAddressVersion.
         */
        interface WithPublicIPAddressVersion {
            /**
             * Specifies publicIPAddressVersion.
             * @param publicIPAddressVersion The public IP address version. Possible values include: 'IPv4', 'IPv6'
             * @return the next definition stage
             */
            WithCreate withPublicIPAddressVersion(IPVersion publicIPAddressVersion);
        }

        /**
         * The stage of the publicipprefix definition allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku The public IP prefix SKU
             * @return the next definition stage
             */
            WithCreate withSku(PublicIPPrefixSku sku);
        }

        /**
         * The stage of the publicipprefix definition allowing to specify Zones.
         */
        interface WithZones {
            /**
             * Specifies zones.
             * @param zones A list of availability zones denoting the IP allocated for the resource needs to come from
             * @return the next definition stage
             */
            WithCreate withZones(List<String> zones);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<PublicIPPrefix>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithCustomIPPrefix, DefinitionStages.WithExtendedLocation, DefinitionStages.WithIpTags, DefinitionStages.WithPrefixLength, DefinitionStages.WithPublicIPAddressVersion, DefinitionStages.WithSku, DefinitionStages.WithZones {
        }
    }
    /**
     * The template for a PublicIPPrefix update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<PublicIPPrefix>, Resource.UpdateWithTags<Update>, UpdateStages.WithCustomIPPrefix, UpdateStages.WithExtendedLocation, UpdateStages.WithIpTags, UpdateStages.WithPrefixLength, UpdateStages.WithPublicIPAddressVersion, UpdateStages.WithSku, UpdateStages.WithZones {
    }

    /**
     * Grouping of PublicIPPrefix update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the publicipprefix update allowing to specify CustomIPPrefix.
         */
        interface WithCustomIPPrefix {
            /**
             * Specifies customIPPrefix.
             * @param customIPPrefix The customIpPrefix that this prefix is associated with
             * @return the next update stage
             */
            Update withCustomIPPrefix(SubResource customIPPrefix);
        }

        /**
         * The stage of the publicipprefix update allowing to specify ExtendedLocation.
         */
        interface WithExtendedLocation {
            /**
             * Specifies extendedLocation.
             * @param extendedLocation The extended location of the public ip address
             * @return the next update stage
             */
            Update withExtendedLocation(ExtendedLocation extendedLocation);
        }

        /**
         * The stage of the publicipprefix update allowing to specify IpTags.
         */
        interface WithIpTags {
            /**
             * Specifies ipTags.
             * @param ipTags The list of tags associated with the public IP prefix
             * @return the next update stage
             */
            Update withIpTags(List<IpTag> ipTags);
        }

        /**
         * The stage of the publicipprefix update allowing to specify PrefixLength.
         */
        interface WithPrefixLength {
            /**
             * Specifies prefixLength.
             * @param prefixLength The Length of the Public IP Prefix
             * @return the next update stage
             */
            Update withPrefixLength(Integer prefixLength);
        }

        /**
         * The stage of the publicipprefix update allowing to specify PublicIPAddressVersion.
         */
        interface WithPublicIPAddressVersion {
            /**
             * Specifies publicIPAddressVersion.
             * @param publicIPAddressVersion The public IP address version. Possible values include: 'IPv4', 'IPv6'
             * @return the next update stage
             */
            Update withPublicIPAddressVersion(IPVersion publicIPAddressVersion);
        }

        /**
         * The stage of the publicipprefix update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku The public IP prefix SKU
             * @return the next update stage
             */
            Update withSku(PublicIPPrefixSku sku);
        }

        /**
         * The stage of the publicipprefix update allowing to specify Zones.
         */
        interface WithZones {
            /**
             * Specifies zones.
             * @param zones A list of availability zones denoting the IP allocated for the resource needs to come from
             * @return the next update stage
             */
            Update withZones(List<String> zones);
        }

    }
}
