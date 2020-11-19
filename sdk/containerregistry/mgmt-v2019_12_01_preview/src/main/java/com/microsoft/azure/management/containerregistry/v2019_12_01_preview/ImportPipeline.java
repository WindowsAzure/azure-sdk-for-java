/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_12_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.implementation.ImportPipelineInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.implementation.ContainerRegistryManager;
import java.util.List;

/**
 * Type representing ImportPipeline.
 */
public interface ImportPipeline extends HasInner<ImportPipelineInner>, Indexable, Refreshable<ImportPipeline>, Updatable<ImportPipeline.Update>, HasManager<ContainerRegistryManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the identity value.
     */
    IdentityProperties identity();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the options value.
     */
    List<PipelineOptions> options();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the source value.
     */
    ImportPipelineSourceProperties source();

    /**
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * @return the trigger value.
     */
    PipelineTriggerProperties trigger();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the ImportPipeline definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithRegistry, DefinitionStages.WithSource, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ImportPipeline definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ImportPipeline definition.
         */
        interface Blank extends WithRegistry {
        }

        /**
         * The stage of the importpipeline definition allowing to specify Registry.
         */
        interface WithRegistry {
           /**
            * Specifies resourceGroupName, registryName.
            * @param resourceGroupName The name of the resource group to which the container registry belongs
            * @param registryName The name of the container registry
            * @return the next definition stage
            */
            WithSource withExistingRegistry(String resourceGroupName, String registryName);
        }

        /**
         * The stage of the importpipeline definition allowing to specify Source.
         */
        interface WithSource {
           /**
            * Specifies source.
            * @param source The source properties of the import pipeline
            * @return the next definition stage
            */
            WithCreate withSource(ImportPipelineSourceProperties source);
        }

        /**
         * The stage of the importpipeline definition allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity The identity of the import pipeline
             * @return the next definition stage
             */
            WithCreate withIdentity(IdentityProperties identity);
        }

        /**
         * The stage of the importpipeline definition allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location The location of the import pipeline
             * @return the next definition stage
             */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the importpipeline definition allowing to specify Options.
         */
        interface WithOptions {
            /**
             * Specifies options.
             * @param options The list of all options configured for the pipeline
             * @return the next definition stage
             */
            WithCreate withOptions(List<PipelineOptions> options);
        }

        /**
         * The stage of the importpipeline definition allowing to specify Trigger.
         */
        interface WithTrigger {
            /**
             * Specifies trigger.
             * @param trigger The properties that describe the trigger of the import pipeline
             * @return the next definition stage
             */
            WithCreate withTrigger(PipelineTriggerProperties trigger);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ImportPipeline>, DefinitionStages.WithIdentity, DefinitionStages.WithLocation, DefinitionStages.WithOptions, DefinitionStages.WithTrigger {
        }
    }
    /**
     * The template for a ImportPipeline update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ImportPipeline>, UpdateStages.WithIdentity, UpdateStages.WithLocation, UpdateStages.WithOptions, UpdateStages.WithTrigger {
    }

    /**
     * Grouping of ImportPipeline update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the importpipeline update allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity The identity of the import pipeline
             * @return the next update stage
             */
            Update withIdentity(IdentityProperties identity);
        }

        /**
         * The stage of the importpipeline update allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location The location of the import pipeline
             * @return the next update stage
             */
            Update withLocation(String location);
        }

        /**
         * The stage of the importpipeline update allowing to specify Options.
         */
        interface WithOptions {
            /**
             * Specifies options.
             * @param options The list of all options configured for the pipeline
             * @return the next update stage
             */
            Update withOptions(List<PipelineOptions> options);
        }

        /**
         * The stage of the importpipeline update allowing to specify Trigger.
         */
        interface WithTrigger {
            /**
             * Specifies trigger.
             * @param trigger The properties that describe the trigger of the import pipeline
             * @return the next update stage
             */
            Update withTrigger(PipelineTriggerProperties trigger);
        }

    }
}
