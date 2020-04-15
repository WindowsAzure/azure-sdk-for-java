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
import java.util.List;
import com.microsoft.azure.management.network.v2020_03_01.implementation.BastionHostInner;

/**
 * Type representing BastionHost.
 */
public interface BastionHost extends HasInner<BastionHostInner>, Resource, GroupableResourceCore<NetworkManager, BastionHostInner>, HasResourceGroup, Refreshable<BastionHost>, Updatable<BastionHost.Update>, HasManager<NetworkManager> {
    /**
     * @return the dnsName value.
     */
    String dnsName();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the ipConfigurations value.
     */
    List<BastionHostIPConfiguration> ipConfigurations();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * The entirety of the BastionHost definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of BastionHost definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a BastionHost definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the BastionHost definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the bastionhost definition allowing to specify DnsName.
         */
        interface WithDnsName {
            /**
             * Specifies dnsName.
             * @param dnsName FQDN for the endpoint on which bastion host is accessible
             * @return the next definition stage
             */
            WithCreate withDnsName(String dnsName);
        }

        /**
         * The stage of the bastionhost definition allowing to specify IpConfigurations.
         */
        interface WithIpConfigurations {
            /**
             * Specifies ipConfigurations.
             * @param ipConfigurations IP configuration of the Bastion Host resource
             * @return the next definition stage
             */
            WithCreate withIpConfigurations(List<BastionHostIPConfiguration> ipConfigurations);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<BastionHost>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithDnsName, DefinitionStages.WithIpConfigurations {
        }
    }
    /**
     * The template for a BastionHost update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<BastionHost>, Resource.UpdateWithTags<Update>, UpdateStages.WithDnsName, UpdateStages.WithIpConfigurations {
    }

    /**
     * Grouping of BastionHost update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the bastionhost update allowing to specify DnsName.
         */
        interface WithDnsName {
            /**
             * Specifies dnsName.
             * @param dnsName FQDN for the endpoint on which bastion host is accessible
             * @return the next update stage
             */
            Update withDnsName(String dnsName);
        }

        /**
         * The stage of the bastionhost update allowing to specify IpConfigurations.
         */
        interface WithIpConfigurations {
            /**
             * Specifies ipConfigurations.
             * @param ipConfigurations IP configuration of the Bastion Host resource
             * @return the next update stage
             */
            Update withIpConfigurations(List<BastionHostIPConfiguration> ipConfigurations);
        }

    }
}
