// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.hdinsight.fluent.models.ApplicationInner;
import java.util.Map;

/** An immutable client-side representation of Application. */
public interface Application {
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
     * Gets the etag property: The ETag for the application.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the tags property: The tags for the application.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the properties property: The properties of the application.
     *
     * @return the properties value.
     */
    ApplicationProperties properties();

    /**
     * Gets the inner com.azure.resourcemanager.hdinsight.fluent.models.ApplicationInner object.
     *
     * @return the inner object.
     */
    ApplicationInner innerModel();

    /** The entirety of the Application definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The Application definition stages. */
    interface DefinitionStages {
        /** The first stage of the Application definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the Application definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, clusterName.
             *
             * @param resourceGroupName The name of the resource group.
             * @param clusterName The name of the cluster.
             * @return the next definition stage.
             */
            WithCreate withExistingCluster(String resourceGroupName, String clusterName);
        }
        /**
         * The stage of the Application definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags, DefinitionStages.WithEtag, DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Application create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Application create(Context context);
        }
        /** The stage of the Application definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: The tags for the application..
             *
             * @param tags The tags for the application.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the Application definition allowing to specify etag. */
        interface WithEtag {
            /**
             * Specifies the etag property: The ETag for the application.
             *
             * @param etag The ETag for the application.
             * @return the next definition stage.
             */
            WithCreate withEtag(String etag);
        }
        /** The stage of the Application definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: The properties of the application..
             *
             * @param properties The properties of the application.
             * @return the next definition stage.
             */
            WithCreate withProperties(ApplicationProperties properties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Application refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Application refresh(Context context);
}
