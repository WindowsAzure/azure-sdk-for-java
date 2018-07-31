/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2017_10_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2017_10_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.management.network.v2017_10_01.implementation.RouteFilterRuleInner;
import com.microsoft.azure.management.network.v2017_10_01.implementation.ExpressRouteCircuitPeeringInner;
import com.microsoft.azure.management.network.v2017_10_01.implementation.RouteFilterInner;

/**
 * Type representing RouteFilter.
 */
public interface RouteFilter extends HasInner<RouteFilterInner>, Resource, GroupableResourceCore<NetworkManager, RouteFilterInner>, HasResourceGroup, Refreshable<RouteFilter>, Updatable<RouteFilter.Update>, HasManager<NetworkManager> {
    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the peerings value.
     */
    List<ExpressRouteCircuitPeering> peerings();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the rules value.
     */
    List<RouteFilterRule> rules();

    /**
     * The entirety of the RouteFilter definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of RouteFilter definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a RouteFilter definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the RouteFilter definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the routefilter definition allowing to specify Peerings.
         */
        interface WithPeerings {
            /**
             * Specifies peerings.
             * @param peerings A collection of references to express route circuit peerings
             * @return the next definition stage
             */
            WithCreate withPeerings(List<ExpressRouteCircuitPeeringInner> peerings);
        }

        /**
         * The stage of the routefilter definition allowing to specify Rules.
         */
        interface WithRules {
            /**
             * Specifies rules.
             * @param rules Collection of RouteFilterRules contained within a route filter
             * @return the next definition stage
             */
            WithCreate withRules(List<RouteFilterRuleInner> rules);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<RouteFilter>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithPeerings, DefinitionStages.WithRules {
        }
    }
    /**
     * The template for a RouteFilter update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<RouteFilter>, Resource.UpdateWithTags<Update>, UpdateStages.WithPeerings, UpdateStages.WithRules {
    }

    /**
     * Grouping of RouteFilter update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the routefilter update allowing to specify Peerings.
         */
        interface WithPeerings {
            /**
             * Specifies peerings.
             * @param peerings A collection of references to express route circuit peerings
             * @return the next update stage
             */
            Update withPeerings(List<ExpressRouteCircuitPeeringInner> peerings);
        }

        /**
         * The stage of the routefilter update allowing to specify Rules.
         */
        interface WithRules {
            /**
             * Specifies rules.
             * @param rules Collection of RouteFilterRules contained within a route filter
             * @return the next update stage
             */
            Update withRules(List<RouteFilterRuleInner> rules);
        }

    }
}
