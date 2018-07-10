/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.mediaservices.v2018_06_01_preview.implementation.TransformInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.mediaservices.v2018_06_01_preview.implementation.MediaManager;
import org.joda.time.DateTime;
import java.util.List;

/**
 * Type representing Transform.
 */
public interface Transform extends HasInner<TransformInner>, Indexable, Refreshable<Transform>, Updatable<Transform.Update>, HasManager<MediaManager> {
    /**
     * @return the created value.
     */
    DateTime created();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the lastModified value.
     */
    DateTime lastModified();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the outputs value.
     */
    List<TransformOutput> outputs();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the Transform definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithMediaservice, DefinitionStages.WithOutputs, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Transform definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Transform definition.
         */
        interface Blank extends WithMediaservice {
        }

        /**
         * The stage of the transform definition allowing to specify Mediaservice.
         */
        interface WithMediaservice {
           /**
            * Specifies resourceGroupName, accountName.
            */
            WithOutputs withExistingMediaservice(String resourceGroupName, String accountName);
        }

        /**
         * The stage of the transform definition allowing to specify Outputs.
         */
        interface WithOutputs {
           /**
            * Specifies outputs.
            */
            WithCreate withOutputs(List<TransformOutput> outputs);
        }

        /**
         * The stage of the transform definition allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Transform>, DefinitionStages.WithDescription {
        }
    }
    /**
     * The template for a Transform update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Transform>, UpdateStages.WithDescription {
    }

    /**
     * Grouping of Transform update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the transform update allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             */
            Update withDescription(String description);
        }

    }
}
