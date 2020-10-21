/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhubs.v2018_01_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.eventhubs.v2018_01_01_preview.implementation.EventHubsManager;
import com.microsoft.azure.management.eventhubs.v2018_01_01_preview.implementation.ClusterInner;

/**
 * Type representing Cluster.
 */
public interface Cluster extends HasInner<ClusterInner>, Resource, GroupableResourceCore<EventHubsManager, ClusterInner>, HasResourceGroup, Refreshable<Cluster>, Updatable<Cluster.Update>, HasManager<EventHubsManager> {
    /**
     * @return the createdAt value.
     */
    String createdAt();

    /**
     * @return the metricId value.
     */
    String metricId();

    /**
     * @return the sku value.
     */
    ClusterSku sku();

    /**
     * @return the status value.
     */
    String status();

    /**
     * @return the updatedAt value.
     */
    String updatedAt();

    /**
     * The entirety of the Cluster definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Cluster definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Cluster definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the Cluster definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the cluster definition allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku Properties of the cluster SKU
             * @return the next definition stage
             */
            WithCreate withSku(ClusterSku sku);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Cluster>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithSku {
        }
    }
    /**
     * The template for a Cluster update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Cluster>, Resource.UpdateWithTags<Update>, UpdateStages.WithSku {
    }

    /**
     * Grouping of Cluster update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the cluster update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku Properties of the cluster SKU
             * @return the next update stage
             */
            Update withSku(ClusterSku sku);
        }

    }
}
