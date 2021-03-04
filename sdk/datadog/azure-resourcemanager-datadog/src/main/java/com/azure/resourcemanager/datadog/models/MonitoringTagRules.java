// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.datadog.fluent.models.MonitoringTagRulesInner;

/** An immutable client-side representation of MonitoringTagRules. */
public interface MonitoringTagRules {
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
     * Gets the properties property: Definition of the properties for a TagRules resource.
     *
     * @return the properties value.
     */
    MonitoringTagRulesProperties properties();

    /**
     * Gets the inner com.azure.resourcemanager.datadog.fluent.models.MonitoringTagRulesInner object.
     *
     * @return the inner object.
     */
    MonitoringTagRulesInner innerModel();

    /** The entirety of the MonitoringTagRules definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The MonitoringTagRules definition stages. */
    interface DefinitionStages {
        /** The first stage of the MonitoringTagRules definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the MonitoringTagRules definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, monitorName.
             *
             * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
             * @param monitorName Monitor resource name.
             * @return the next definition stage.
             */
            WithCreate withExistingMonitor(String resourceGroupName, String monitorName);
        }
        /**
         * The stage of the MonitoringTagRules definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            MonitoringTagRules create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            MonitoringTagRules create(Context context);
        }
        /** The stage of the MonitoringTagRules definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Definition of the properties for a TagRules resource..
             *
             * @param properties Definition of the properties for a TagRules resource.
             * @return the next definition stage.
             */
            WithCreate withProperties(MonitoringTagRulesProperties properties);
        }
    }
    /**
     * Begins update for the MonitoringTagRules resource.
     *
     * @return the stage of resource update.
     */
    MonitoringTagRules.Update update();

    /** The template for MonitoringTagRules update. */
    interface Update extends UpdateStages.WithProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        MonitoringTagRules apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        MonitoringTagRules apply(Context context);
    }
    /** The MonitoringTagRules update stages. */
    interface UpdateStages {
        /** The stage of the MonitoringTagRules update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Definition of the properties for a TagRules resource..
             *
             * @param properties Definition of the properties for a TagRules resource.
             * @return the next definition stage.
             */
            Update withProperties(MonitoringTagRulesProperties properties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    MonitoringTagRules refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    MonitoringTagRules refresh(Context context);
}
