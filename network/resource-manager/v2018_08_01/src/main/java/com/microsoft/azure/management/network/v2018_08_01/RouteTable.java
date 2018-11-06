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
import java.util.List;
import com.microsoft.azure.management.network.v2018_08_01.implementation.RouteInner;
import com.microsoft.azure.management.network.v2018_08_01.implementation.RouteTableInner;

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
    String provisioningState();

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
         * The stage of the routetable update allowing to specify DisableBgpRoutePropagation.
         */
        interface WithDisableBgpRoutePropagation {
            /**
             * Specifies disableBgpRoutePropagation.
             */
            WithCreate withDisableBgpRoutePropagation(Boolean disableBgpRoutePropagation);
        }

        /**
         * The stage of the routetable update allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             */
            WithCreate withEtag(String etag);
        }

        /**
         * The stage of the routetable update allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             */
            WithCreate withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the routetable update allowing to specify Routes.
         */
        interface WithRoutes {
            /**
             * Specifies routes.
             */
            WithCreate withRoutes(List<RouteInner> routes);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<RouteTable>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithDisableBgpRoutePropagation, DefinitionStages.WithEtag, DefinitionStages.WithProvisioningState, DefinitionStages.WithRoutes {
        }
    }
    /**
     * The template for a RouteTable update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<RouteTable>, Resource.UpdateWithTags<Update>, UpdateStages.WithDisableBgpRoutePropagation, UpdateStages.WithEtag, UpdateStages.WithProvisioningState, UpdateStages.WithRoutes {
    }

    /**
     * Grouping of RouteTable update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the routetable {0} allowing to specify DisableBgpRoutePropagation.
         */
        interface WithDisableBgpRoutePropagation {
            /**
             * Specifies disableBgpRoutePropagation.
             */
            Update withDisableBgpRoutePropagation(Boolean disableBgpRoutePropagation);
        }

        /**
         * The stage of the routetable {0} allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             */
            Update withEtag(String etag);
        }

        /**
         * The stage of the routetable {0} allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             */
            Update withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the routetable {0} allowing to specify Routes.
         */
        interface WithRoutes {
            /**
             * Specifies routes.
             */
            Update withRoutes(List<RouteInner> routes);
        }

    }
}
