/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datadog.v2020_02_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.datadog.v2020_02_01_preview.implementation.DatadogManager;
import com.microsoft.azure.management.datadog.v2020_02_01_preview.implementation.DatadogMonitorResourceInner;

/**
 * Type representing DatadogMonitorResource.
 */
public interface DatadogMonitorResource extends HasInner<DatadogMonitorResourceInner>, Resource, GroupableResourceCore<DatadogManager, DatadogMonitorResourceInner>, HasResourceGroup, Refreshable<DatadogMonitorResource>, Updatable<DatadogMonitorResource.Update>, HasManager<DatadogManager> {
    /**
     * @return the identity value.
     */
    IdentityProperties identity();

    /**
     * @return the properties value.
     */
    MonitorProperties properties();

    /**
     * @return the sku value.
     */
    ResourceSku sku();

    /**
     * The entirety of the DatadogMonitorResource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of DatadogMonitorResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a DatadogMonitorResource definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the DatadogMonitorResource definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the datadogmonitorresource definition allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity the identity parameter value
             * @return the next definition stage
             */
            WithCreate withIdentity(IdentityProperties identity);
        }

        /**
         * The stage of the datadogmonitorresource definition allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties the properties parameter value
             * @return the next definition stage
             */
            WithCreate withProperties(MonitorProperties properties);
        }

        /**
         * The stage of the datadogmonitorresource definition allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku the sku parameter value
             * @return the next definition stage
             */
            WithCreate withSku(ResourceSku sku);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<DatadogMonitorResource>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithIdentity, DefinitionStages.WithProperties, DefinitionStages.WithSku {
        }
    }
    /**
     * The template for a DatadogMonitorResource update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<DatadogMonitorResource>, Resource.UpdateWithTags<Update>, UpdateStages.WithProperties {
    }

    /**
     * Grouping of DatadogMonitorResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the datadogmonitorresource update allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties the properties parameter value
             * @return the next update stage
             */
            Update withProperties(MonitorUpdateProperties properties);
        }

    }
}
