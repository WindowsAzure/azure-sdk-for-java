/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2019_02_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2019_02_01.implementation.PublicIPPrefixInner;

/**
 * Type representing PublicIPPrefix.
 */
public interface PublicIPPrefix extends HasInner<PublicIPPrefixInner>, Resource, GroupableResourceCore<NetworkManager, PublicIPPrefixInner>, HasResourceGroup, Refreshable<PublicIPPrefix>, Updatable<PublicIPPrefix.Update>, HasManager<NetworkManager> {
    /**
     * @return the etag value.
     */
    String etag();

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
    String provisioningState();

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
         * The stage of the publicipprefix definition allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             * @param etag A unique read-only string that changes whenever the resource is updated
             * @return the next definition stage
             */
            WithCreate withEtag(String etag);
        }

        /**
         * The stage of the publicipprefix definition allowing to specify IpPrefix.
         */
        interface WithIpPrefix {
            /**
             * Specifies ipPrefix.
             * @param ipPrefix The allocated Prefix
             * @return the next definition stage
             */
            WithCreate withIpPrefix(String ipPrefix);
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
         * The stage of the publicipprefix definition allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState The provisioning state of the Public IP prefix resource. Possible values are: 'Updating', 'Deleting', and 'Failed'
             * @return the next definition stage
             */
            WithCreate withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the publicipprefix definition allowing to specify PublicIPAddresses.
         */
        interface WithPublicIPAddresses {
            /**
             * Specifies publicIPAddresses.
             * @param publicIPAddresses The list of all referenced PublicIPAddresses
             * @return the next definition stage
             */
            WithCreate withPublicIPAddresses(List<ReferencedPublicIpAddress> publicIPAddresses);
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
         * The stage of the publicipprefix definition allowing to specify ResourceGuid.
         */
        interface WithResourceGuid {
            /**
             * Specifies resourceGuid.
             * @param resourceGuid The resource GUID property of the public IP prefix resource
             * @return the next definition stage
             */
            WithCreate withResourceGuid(String resourceGuid);
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
        interface WithCreate extends Creatable<PublicIPPrefix>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithEtag, DefinitionStages.WithIpPrefix, DefinitionStages.WithIpTags, DefinitionStages.WithPrefixLength, DefinitionStages.WithProvisioningState, DefinitionStages.WithPublicIPAddresses, DefinitionStages.WithPublicIPAddressVersion, DefinitionStages.WithResourceGuid, DefinitionStages.WithSku, DefinitionStages.WithZones {
        }
    }
    /**
     * The template for a PublicIPPrefix update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<PublicIPPrefix>, Resource.UpdateWithTags<Update>, UpdateStages.WithEtag, UpdateStages.WithIpPrefix, UpdateStages.WithIpTags, UpdateStages.WithPrefixLength, UpdateStages.WithProvisioningState, UpdateStages.WithPublicIPAddresses, UpdateStages.WithPublicIPAddressVersion, UpdateStages.WithResourceGuid, UpdateStages.WithSku, UpdateStages.WithZones {
    }

    /**
     * Grouping of PublicIPPrefix update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the publicipprefix update allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             * @param etag A unique read-only string that changes whenever the resource is updated
             * @return the next update stage
             */
            Update withEtag(String etag);
        }

        /**
         * The stage of the publicipprefix update allowing to specify IpPrefix.
         */
        interface WithIpPrefix {
            /**
             * Specifies ipPrefix.
             * @param ipPrefix The allocated Prefix
             * @return the next update stage
             */
            Update withIpPrefix(String ipPrefix);
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
         * The stage of the publicipprefix update allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState The provisioning state of the Public IP prefix resource. Possible values are: 'Updating', 'Deleting', and 'Failed'
             * @return the next update stage
             */
            Update withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the publicipprefix update allowing to specify PublicIPAddresses.
         */
        interface WithPublicIPAddresses {
            /**
             * Specifies publicIPAddresses.
             * @param publicIPAddresses The list of all referenced PublicIPAddresses
             * @return the next update stage
             */
            Update withPublicIPAddresses(List<ReferencedPublicIpAddress> publicIPAddresses);
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
         * The stage of the publicipprefix update allowing to specify ResourceGuid.
         */
        interface WithResourceGuid {
            /**
             * Specifies resourceGuid.
             * @param resourceGuid The resource GUID property of the public IP prefix resource
             * @return the next update stage
             */
            Update withResourceGuid(String resourceGuid);
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
