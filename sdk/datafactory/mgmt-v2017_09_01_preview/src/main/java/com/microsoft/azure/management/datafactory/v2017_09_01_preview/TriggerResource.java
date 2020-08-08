/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.datafactory.v2017_09_01_preview.implementation.TriggerResourceInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.datafactory.v2017_09_01_preview.implementation.DataFactoryManager;
import com.microsoft.azure.management.datafactory.v2017_09_01_preview.implementation.TriggerInner;
import java.util.Map;

/**
 * Type representing TriggerResource.
 */
public interface TriggerResource extends HasInner<TriggerResourceInner>, Indexable, Refreshable<TriggerResource>, Updatable<TriggerResource.Update>, HasManager<DataFactoryManager> {
    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    TriggerInner properties();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the TriggerResource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithFactory, DefinitionStages.WithIfMatch, DefinitionStages.WithProperties, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of TriggerResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a TriggerResource definition.
         */
        interface Blank extends WithFactory {
        }

        /**
         * The stage of the triggerresource definition allowing to specify Factory.
         */
        interface WithFactory {
           /**
            * Specifies resourceGroupName, factoryName.
            * @param resourceGroupName The resource group name
            * @param factoryName The factory name
            * @return the next definition stage
            */
            WithIfMatch withExistingFactory(String resourceGroupName, String factoryName);
        }

        /**
         * The stage of the triggerresource definition allowing to specify IfMatch.
         */
        interface WithIfMatch {
           /**
            * Specifies ifMatch.
            * @param ifMatch ETag of the trigger entity.  Should only be specified for update, for which it should match existing entity or can be * for unconditional update
            * @return the next definition stage
            */
            WithProperties withIfMatch(String ifMatch);
        }

        /**
         * The stage of the triggerresource definition allowing to specify Properties.
         */
        interface WithProperties {
           /**
            * Specifies properties.
            * @param properties Properties of the trigger
            * @return the next definition stage
            */
            WithCreate withProperties(TriggerInner properties);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<TriggerResource> {
        }
    }
    /**
     * The template for a TriggerResource update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<TriggerResource>, UpdateStages.WithIfMatch, UpdateStages.WithProperties {
    }

    /**
     * Grouping of TriggerResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the triggerresource update allowing to specify IfMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies ifMatch.
             * @param ifMatch ETag of the trigger entity.  Should only be specified for update, for which it should match existing entity or can be * for unconditional update
             * @return the next update stage
             */
            Update withIfMatch(String ifMatch);
        }

        /**
         * The stage of the triggerresource update allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties Properties of the trigger
             * @return the next update stage
             */
            Update withProperties(TriggerInner properties);
        }

    }
}
