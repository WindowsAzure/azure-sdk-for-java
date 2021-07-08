// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.delegatednetwork.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.delegatednetwork.fluent.models.OrchestratorInner;
import java.util.Map;

/** An immutable client-side representation of Orchestrator. */
public interface Orchestrator {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the kind property: The kind of workbook. Choices are user and shared.
     *
     * @return the kind value.
     */
    OrchestratorKind kind();

    /**
     * Gets the identity property: The identity of the orchestrator.
     *
     * @return the identity value.
     */
    OrchestratorIdentity identity();

    /**
     * Gets the properties property: Properties of the provision operation request.
     *
     * @return the properties value.
     */
    OrchestratorResourceProperties properties();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.delegatednetwork.fluent.models.OrchestratorInner object.
     *
     * @return the inner object.
     */
    OrchestratorInner innerModel();

    /** The entirety of the Orchestrator definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithKind,
            DefinitionStages.WithCreate {
    }
    /** The Orchestrator definition stages. */
    interface DefinitionStages {
        /** The first stage of the Orchestrator definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the Orchestrator definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the Orchestrator definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithKind withExistingResourceGroup(String resourceGroupName);
        }
        /** The stage of the Orchestrator definition allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: The kind of workbook. Choices are user and shared..
             *
             * @param kind The kind of workbook. Choices are user and shared.
             * @return the next definition stage.
             */
            WithCreate withKind(OrchestratorKind kind);
        }
        /**
         * The stage of the Orchestrator definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags, DefinitionStages.WithIdentity, DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Orchestrator create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Orchestrator create(Context context);
        }
        /** The stage of the Orchestrator definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the Orchestrator definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of the orchestrator.
             *
             * @param identity The identity of the orchestrator.
             * @return the next definition stage.
             */
            WithCreate withIdentity(OrchestratorIdentity identity);
        }
        /** The stage of the Orchestrator definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Properties of the provision operation request..
             *
             * @param properties Properties of the provision operation request.
             * @return the next definition stage.
             */
            WithCreate withProperties(OrchestratorResourceProperties properties);
        }
    }
    /**
     * Begins update for the Orchestrator resource.
     *
     * @return the stage of resource update.
     */
    Orchestrator.Update update();

    /** The template for Orchestrator update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Orchestrator apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Orchestrator apply(Context context);
    }
    /** The Orchestrator update stages. */
    interface UpdateStages {
        /** The stage of the Orchestrator update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: The resource tags..
             *
             * @param tags The resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Orchestrator refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Orchestrator refresh(Context context);
}
