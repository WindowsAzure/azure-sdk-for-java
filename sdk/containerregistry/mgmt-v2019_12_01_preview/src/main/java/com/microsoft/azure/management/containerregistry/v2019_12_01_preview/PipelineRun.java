/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_12_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.implementation.PipelineRunInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.implementation.ContainerRegistryManager;

/**
 * Type representing PipelineRun.
 */
public interface PipelineRun extends HasInner<PipelineRunInner>, Indexable, Refreshable<PipelineRun>, Updatable<PipelineRun.Update>, HasManager<ContainerRegistryManager> {
    /**
     * @return the forceUpdateTag value.
     */
    String forceUpdateTag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the request value.
     */
    PipelineRunRequest request();

    /**
     * @return the response value.
     */
    PipelineRunResponse response();

    /**
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the PipelineRun definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithRegistry, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of PipelineRun definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a PipelineRun definition.
         */
        interface Blank extends WithRegistry {
        }

        /**
         * The stage of the pipelinerun definition allowing to specify Registry.
         */
        interface WithRegistry {
           /**
            * Specifies resourceGroupName, registryName.
            * @param resourceGroupName The name of the resource group to which the container registry belongs
            * @param registryName The name of the container registry
            * @return the next definition stage
            */
            WithCreate withExistingRegistry(String resourceGroupName, String registryName);
        }

        /**
         * The stage of the pipelinerun definition allowing to specify ForceUpdateTag.
         */
        interface WithForceUpdateTag {
            /**
             * Specifies forceUpdateTag.
             * @param forceUpdateTag How the pipeline run should be forced to recreate even if the pipeline run configuration has not changed
             * @return the next definition stage
             */
            WithCreate withForceUpdateTag(String forceUpdateTag);
        }

        /**
         * The stage of the pipelinerun definition allowing to specify Request.
         */
        interface WithRequest {
            /**
             * Specifies request.
             * @param request The request parameters for a pipeline run
             * @return the next definition stage
             */
            WithCreate withRequest(PipelineRunRequest request);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<PipelineRun>, DefinitionStages.WithForceUpdateTag, DefinitionStages.WithRequest {
        }
    }
    /**
     * The template for a PipelineRun update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<PipelineRun>, UpdateStages.WithForceUpdateTag, UpdateStages.WithRequest {
    }

    /**
     * Grouping of PipelineRun update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the pipelinerun update allowing to specify ForceUpdateTag.
         */
        interface WithForceUpdateTag {
            /**
             * Specifies forceUpdateTag.
             * @param forceUpdateTag How the pipeline run should be forced to recreate even if the pipeline run configuration has not changed
             * @return the next update stage
             */
            Update withForceUpdateTag(String forceUpdateTag);
        }

        /**
         * The stage of the pipelinerun update allowing to specify Request.
         */
        interface WithRequest {
            /**
             * Specifies request.
             * @param request The request parameters for a pipeline run
             * @return the next update stage
             */
            Update withRequest(PipelineRunRequest request);
        }

    }
}
