/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2019_07_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.management.network.v2019_07_01.implementation.NetworkProfileInner;

/**
 * Type representing NetworkProfile.
 */
public interface NetworkProfile extends HasInner<NetworkProfileInner>, Resource, GroupableResourceCore<NetworkManager, NetworkProfileInner>, HasResourceGroup, Refreshable<NetworkProfile>, Updatable<NetworkProfile.Update>, HasManager<NetworkManager> {
    /**
     * @return the containerNetworkInterfaceConfigurations value.
     */
    List<ContainerNetworkInterfaceConfiguration> containerNetworkInterfaceConfigurations();

    /**
     * @return the containerNetworkInterfaces value.
     */
    List<ContainerNetworkInterface> containerNetworkInterfaces();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * The entirety of the NetworkProfile definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of NetworkProfile definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a NetworkProfile definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the NetworkProfile definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the networkprofile definition allowing to specify ContainerNetworkInterfaceConfigurations.
         */
        interface WithContainerNetworkInterfaceConfigurations {
            /**
             * Specifies containerNetworkInterfaceConfigurations.
             * @param containerNetworkInterfaceConfigurations List of chid container network interface configurations
             * @return the next definition stage
             */
            WithCreate withContainerNetworkInterfaceConfigurations(List<ContainerNetworkInterfaceConfiguration> containerNetworkInterfaceConfigurations);
        }

        /**
         * The stage of the networkprofile definition allowing to specify ContainerNetworkInterfaces.
         */
        interface WithContainerNetworkInterfaces {
            /**
             * Specifies containerNetworkInterfaces.
             * @param containerNetworkInterfaces List of child container network interfaces
             * @return the next definition stage
             */
            WithCreate withContainerNetworkInterfaces(List<ContainerNetworkInterface> containerNetworkInterfaces);
        }

        /**
         * The stage of the networkprofile definition allowing to specify Etag.
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
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<NetworkProfile>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithContainerNetworkInterfaceConfigurations, DefinitionStages.WithContainerNetworkInterfaces, DefinitionStages.WithEtag {
        }
    }
    /**
     * The template for a NetworkProfile update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<NetworkProfile>, Resource.UpdateWithTags<Update>, UpdateStages.WithContainerNetworkInterfaceConfigurations, UpdateStages.WithContainerNetworkInterfaces, UpdateStages.WithEtag {
    }

    /**
     * Grouping of NetworkProfile update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the networkprofile update allowing to specify ContainerNetworkInterfaceConfigurations.
         */
        interface WithContainerNetworkInterfaceConfigurations {
            /**
             * Specifies containerNetworkInterfaceConfigurations.
             * @param containerNetworkInterfaceConfigurations List of chid container network interface configurations
             * @return the next update stage
             */
            Update withContainerNetworkInterfaceConfigurations(List<ContainerNetworkInterfaceConfiguration> containerNetworkInterfaceConfigurations);
        }

        /**
         * The stage of the networkprofile update allowing to specify ContainerNetworkInterfaces.
         */
        interface WithContainerNetworkInterfaces {
            /**
             * Specifies containerNetworkInterfaces.
             * @param containerNetworkInterfaces List of child container network interfaces
             * @return the next update stage
             */
            Update withContainerNetworkInterfaces(List<ContainerNetworkInterface> containerNetworkInterfaces);
        }

        /**
         * The stage of the networkprofile update allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             * @param etag A unique read-only string that changes whenever the resource is updated
             * @return the next update stage
             */
            Update withEtag(String etag);
        }

    }
}
