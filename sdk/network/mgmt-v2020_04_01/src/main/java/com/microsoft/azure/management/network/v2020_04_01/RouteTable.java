/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_04_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.management.network.v2020_04_01.implementation.RouteInner;
import com.microsoft.azure.management.network.v2020_04_01.implementation.RouteTableInner;

/**
 * Type representing RouteTable.
 */
public interface RouteTable extends HasInner<RouteTableInner>, Resource, GroupableResourceCore<NetworkManager, RouteTableInner>, HasResourceGroup, Refreshable<RouteTable>, Updatable<RouteTable.Update>, HasManager<NetworkManager> {
    /**
     * @return the disableBgpRoutePropagation value.
     */
    Boolean disableBgpRoutePropagation();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the routes value.
     */
    List<Route> routes();

    /**
     * @return the subnets value.
     */
    List<Subnet> subnets();

    /**
     * The entirety of the RouteTable definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of RouteTable definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a RouteTable definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the RouteTable definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the routetable definition allowing to specify DisableBgpRoutePropagation.
         */
        interface WithDisableBgpRoutePropagation {
            /**
             * Specifies disableBgpRoutePropagation.
             * @param disableBgpRoutePropagation Whether to disable the routes learned by BGP on that route table. True means disable
             * @return the next definition stage
             */
            WithCreate withDisableBgpRoutePropagation(Boolean disableBgpRoutePropagation);
        }

        /**
         * The stage of the routetable definition allowing to specify Routes.
         */
        interface WithRoutes {
            /**
             * Specifies routes.
             * @param routes Collection of routes contained within a route table
             * @return the next definition stage
             */
            WithCreate withRoutes(List<RouteInner> routes);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<RouteTable>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithDisableBgpRoutePropagation, DefinitionStages.WithRoutes {
        }
    }
    /**
     * The template for a RouteTable update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<RouteTable>, Resource.UpdateWithTags<Update>, UpdateStages.WithDisableBgpRoutePropagation, UpdateStages.WithRoutes {
    }

    /**
     * Grouping of RouteTable update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the routetable update allowing to specify DisableBgpRoutePropagation.
         */
        interface WithDisableBgpRoutePropagation {
            /**
             * Specifies disableBgpRoutePropagation.
             * @param disableBgpRoutePropagation Whether to disable the routes learned by BGP on that route table. True means disable
             * @return the next update stage
             */
            Update withDisableBgpRoutePropagation(Boolean disableBgpRoutePropagation);
        }

        /**
         * The stage of the routetable update allowing to specify Routes.
         */
        interface WithRoutes {
            /**
             * Specifies routes.
             * @param routes Collection of routes contained within a route table
             * @return the next update stage
             */
            Update withRoutes(List<RouteInner> routes);
        }

    }
}
