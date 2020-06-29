/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_05_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.management.network.v2020_05_01.implementation.ExpressRouteGatewayInner;

/**
 * Type representing ExpressRouteGateway.
 */
public interface ExpressRouteGateway extends HasInner<ExpressRouteGatewayInner>, Resource, GroupableResourceCore<NetworkManager, ExpressRouteGatewayInner>, HasResourceGroup, Refreshable<ExpressRouteGateway>, Updatable<ExpressRouteGateway.Update>, HasManager<NetworkManager> {
    /**
     * @return the autoScaleConfiguration value.
     */
    ExpressRouteGatewayPropertiesAutoScaleConfiguration autoScaleConfiguration();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the expressRouteConnections value.
     */
    List<ExpressRouteConnection> expressRouteConnections();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the virtualHub value.
     */
    VirtualHubId virtualHub();

    /**
     * The entirety of the ExpressRouteGateway definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithVirtualHub, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ExpressRouteGateway definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ExpressRouteGateway definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the ExpressRouteGateway definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithVirtualHub> {
        }

        /**
         * The stage of the expressroutegateway definition allowing to specify VirtualHub.
         */
        interface WithVirtualHub {
           /**
            * Specifies virtualHub.
            * @param virtualHub The Virtual Hub where the ExpressRoute gateway is or will be deployed
            * @return the next definition stage
*/
            WithCreate withVirtualHub(VirtualHubId virtualHub);
        }

        /**
         * The stage of the expressroutegateway definition allowing to specify AutoScaleConfiguration.
         */
        interface WithAutoScaleConfiguration {
            /**
             * Specifies autoScaleConfiguration.
             * @param autoScaleConfiguration Configuration for auto scaling
             * @return the next definition stage
             */
            WithCreate withAutoScaleConfiguration(ExpressRouteGatewayPropertiesAutoScaleConfiguration autoScaleConfiguration);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ExpressRouteGateway>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithAutoScaleConfiguration {
        }
    }
    /**
     * The template for a ExpressRouteGateway update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ExpressRouteGateway>, Resource.UpdateWithTags<Update>, UpdateStages.WithAutoScaleConfiguration {
    }

    /**
     * Grouping of ExpressRouteGateway update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the expressroutegateway update allowing to specify AutoScaleConfiguration.
         */
        interface WithAutoScaleConfiguration {
            /**
             * Specifies autoScaleConfiguration.
             * @param autoScaleConfiguration Configuration for auto scaling
             * @return the next update stage
             */
            Update withAutoScaleConfiguration(ExpressRouteGatewayPropertiesAutoScaleConfiguration autoScaleConfiguration);
        }

    }
}
