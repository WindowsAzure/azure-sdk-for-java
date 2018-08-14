/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation.PipelineResourceInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation.DataFactoryManager;
import java.util.Map;
import java.util.List;

/**
 * Type representing PipelineResource.
 */
public interface PipelineResource extends HasInner<PipelineResourceInner>, Indexable, Refreshable<PipelineResource>, Updatable<PipelineResource.Update>, HasManager<DataFactoryManager> {
    /**
     * @return the activities value.
     */
    List<Activity> activities();

    /**
     * @return the additionalProperties value.
     */
    Map<String, Object> additionalProperties();

    /**
     * @return the annotations value.
     */
    List<Object> annotations();

    /**
     * @return the concurrency value.
     */
    Integer concurrency();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the folder value.
     */
    PipelineFolder folder();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the parameters value.
     */
    Map<String, ParameterSpecification> parameters();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the PipelineResource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithFactory, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of PipelineResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a PipelineResource definition.
         */
        interface Blank extends WithFactory {
        }

        /**
         * The stage of the pipelineresource definition allowing to specify Factory.
         */
        interface WithFactory {
           /**
            * Specifies resourceGroupName, factoryName.
            */
            WithCreate withExistingFactory(String resourceGroupName, String factoryName);
        }

        /**
         * The stage of the pipelineresource definition allowing to specify Activities.
         */
        interface WithActivities {
            /**
             * Specifies activities.
             */
            WithCreate withActivities(List<Activity> activities);
        }

        /**
         * The stage of the pipelineresource definition allowing to specify AdditionalProperties.
         */
        interface WithAdditionalProperties {
            /**
             * Specifies additionalProperties.
             */
            WithCreate withAdditionalProperties(Map<String, Object> additionalProperties);
        }

        /**
         * The stage of the pipelineresource definition allowing to specify Annotations.
         */
        interface WithAnnotations {
            /**
             * Specifies annotations.
             */
            WithCreate withAnnotations(List<Object> annotations);
        }

        /**
         * The stage of the pipelineresource definition allowing to specify Concurrency.
         */
        interface WithConcurrency {
            /**
             * Specifies concurrency.
             */
            WithCreate withConcurrency(Integer concurrency);
        }

        /**
         * The stage of the pipelineresource definition allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the pipelineresource definition allowing to specify Folder.
         */
        interface WithFolder {
            /**
             * Specifies folder.
             */
            WithCreate withFolder(PipelineFolder folder);
        }

        /**
         * The stage of the pipelineresource definition allowing to specify Parameters.
         */
        interface WithParameters {
            /**
             * Specifies parameters.
             */
            WithCreate withParameters(Map<String, ParameterSpecification> parameters);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<PipelineResource>, DefinitionStages.WithActivities, DefinitionStages.WithAdditionalProperties, DefinitionStages.WithAnnotations, DefinitionStages.WithConcurrency, DefinitionStages.WithDescription, DefinitionStages.WithFolder, DefinitionStages.WithParameters {
        }
    }
    /**
     * The template for a PipelineResource update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<PipelineResource>, UpdateStages.WithActivities, UpdateStages.WithAdditionalProperties, UpdateStages.WithAnnotations, UpdateStages.WithConcurrency, UpdateStages.WithDescription, UpdateStages.WithFolder, UpdateStages.WithParameters {
    }

    /**
     * Grouping of PipelineResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the pipelineresource update allowing to specify Activities.
         */
        interface WithActivities {
            /**
             * Specifies activities.
             */
            Update withActivities(List<Activity> activities);
        }

        /**
         * The stage of the pipelineresource update allowing to specify AdditionalProperties.
         */
        interface WithAdditionalProperties {
            /**
             * Specifies additionalProperties.
             */
            Update withAdditionalProperties(Map<String, Object> additionalProperties);
        }

        /**
         * The stage of the pipelineresource update allowing to specify Annotations.
         */
        interface WithAnnotations {
            /**
             * Specifies annotations.
             */
            Update withAnnotations(List<Object> annotations);
        }

        /**
         * The stage of the pipelineresource update allowing to specify Concurrency.
         */
        interface WithConcurrency {
            /**
             * Specifies concurrency.
             */
            Update withConcurrency(Integer concurrency);
        }

        /**
         * The stage of the pipelineresource update allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the pipelineresource update allowing to specify Folder.
         */
        interface WithFolder {
            /**
             * Specifies folder.
             */
            Update withFolder(PipelineFolder folder);
        }

        /**
         * The stage of the pipelineresource update allowing to specify Parameters.
         */
        interface WithParameters {
            /**
             * Specifies parameters.
             */
            Update withParameters(Map<String, ParameterSpecification> parameters);
        }

    }
}
