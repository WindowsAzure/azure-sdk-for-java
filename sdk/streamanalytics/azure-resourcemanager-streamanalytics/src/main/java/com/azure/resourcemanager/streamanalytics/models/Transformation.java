// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.streamanalytics.fluent.models.TransformationInner;

/** An immutable client-side representation of Transformation. */
public interface Transformation {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the streamingUnits property: Specifies the number of streaming units that the streaming job uses.
     *
     * @return the streamingUnits value.
     */
    Integer streamingUnits();

    /**
     * Gets the query property: Specifies the query that will be run in the streaming job. You can learn more about the
     * Stream Analytics Query Language (SAQL) here: https://msdn.microsoft.com/library/azure/dn834998 . Required on PUT
     * (CreateOrReplace) requests.
     *
     * @return the query value.
     */
    String query();

    /**
     * Gets the etag property: The current entity tag for the transformation. This is an opaque string. You can use it
     * to detect whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match
     * headers for write operations for optimistic concurrency.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the name property: Resource name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: Resource type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the inner com.azure.resourcemanager.streamanalytics.fluent.models.TransformationInner object.
     *
     * @return the inner object.
     */
    TransformationInner innerModel();

    /** The entirety of the Transformation definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The Transformation definition stages. */
    interface DefinitionStages {
        /** The first stage of the Transformation definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the Transformation definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, jobName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param jobName The name of the streaming job.
             * @return the next definition stage.
             */
            WithCreate withExistingStreamingjob(String resourceGroupName, String jobName);
        }
        /**
         * The stage of the Transformation definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithStreamingUnits,
                DefinitionStages.WithQuery,
                DefinitionStages.WithName,
                DefinitionStages.WithIfMatch,
                DefinitionStages.WithIfNoneMatch {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Transformation create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Transformation create(Context context);
        }
        /** The stage of the Transformation definition allowing to specify streamingUnits. */
        interface WithStreamingUnits {
            /**
             * Specifies the streamingUnits property: Specifies the number of streaming units that the streaming job
             * uses..
             *
             * @param streamingUnits Specifies the number of streaming units that the streaming job uses.
             * @return the next definition stage.
             */
            WithCreate withStreamingUnits(Integer streamingUnits);
        }
        /** The stage of the Transformation definition allowing to specify query. */
        interface WithQuery {
            /**
             * Specifies the query property: Specifies the query that will be run in the streaming job. You can learn
             * more about the Stream Analytics Query Language (SAQL) here:
             * https://msdn.microsoft.com/library/azure/dn834998 . Required on PUT (CreateOrReplace) requests..
             *
             * @param query Specifies the query that will be run in the streaming job. You can learn more about the
             *     Stream Analytics Query Language (SAQL) here: https://msdn.microsoft.com/library/azure/dn834998 .
             *     Required on PUT (CreateOrReplace) requests.
             * @return the next definition stage.
             */
            WithCreate withQuery(String query);
        }
        /** The stage of the Transformation definition allowing to specify name. */
        interface WithName {
            /**
             * Specifies the name property: Resource name.
             *
             * @param name Resource name.
             * @return the next definition stage.
             */
            WithCreate withName(String name);
        }
        /** The stage of the Transformation definition allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: The ETag of the transformation. Omit this value to always overwrite the
             * current transformation. Specify the last-seen ETag value to prevent accidentally overwriting concurrent
             * changes..
             *
             * @param ifMatch The ETag of the transformation. Omit this value to always overwrite the current
             *     transformation. Specify the last-seen ETag value to prevent accidentally overwriting concurrent
             *     changes.
             * @return the next definition stage.
             */
            WithCreate withIfMatch(String ifMatch);
        }
        /** The stage of the Transformation definition allowing to specify ifNoneMatch. */
        interface WithIfNoneMatch {
            /**
             * Specifies the ifNoneMatch property: Set to '*' to allow a new transformation to be created, but to
             * prevent updating an existing transformation. Other values will result in a 412 Pre-condition Failed
             * response..
             *
             * @param ifNoneMatch Set to '*' to allow a new transformation to be created, but to prevent updating an
             *     existing transformation. Other values will result in a 412 Pre-condition Failed response.
             * @return the next definition stage.
             */
            WithCreate withIfNoneMatch(String ifNoneMatch);
        }
    }
    /**
     * Begins update for the Transformation resource.
     *
     * @return the stage of resource update.
     */
    Transformation.Update update();

    /** The template for Transformation update. */
    interface Update
        extends UpdateStages.WithStreamingUnits,
            UpdateStages.WithQuery,
            UpdateStages.WithName,
            UpdateStages.WithifMatch {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Transformation apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Transformation apply(Context context);
    }
    /** The Transformation update stages. */
    interface UpdateStages {
        /** The stage of the Transformation update allowing to specify streamingUnits. */
        interface WithStreamingUnits {
            /**
             * Specifies the streamingUnits property: Specifies the number of streaming units that the streaming job
             * uses..
             *
             * @param streamingUnits Specifies the number of streaming units that the streaming job uses.
             * @return the next definition stage.
             */
            Update withStreamingUnits(Integer streamingUnits);
        }
        /** The stage of the Transformation update allowing to specify query. */
        interface WithQuery {
            /**
             * Specifies the query property: Specifies the query that will be run in the streaming job. You can learn
             * more about the Stream Analytics Query Language (SAQL) here:
             * https://msdn.microsoft.com/library/azure/dn834998 . Required on PUT (CreateOrReplace) requests..
             *
             * @param query Specifies the query that will be run in the streaming job. You can learn more about the
             *     Stream Analytics Query Language (SAQL) here: https://msdn.microsoft.com/library/azure/dn834998 .
             *     Required on PUT (CreateOrReplace) requests.
             * @return the next definition stage.
             */
            Update withQuery(String query);
        }
        /** The stage of the Transformation update allowing to specify name. */
        interface WithName {
            /**
             * Specifies the name property: Resource name.
             *
             * @param name Resource name.
             * @return the next definition stage.
             */
            Update withName(String name);
        }
        /** The stage of the Transformation update allowing to specify ifMatch. */
        interface WithifMatch {
            /**
             * Specifies the ifMatch property: The ETag of the transformation. Omit this value to always overwrite the
             * current transformation. Specify the last-seen ETag value to prevent accidentally overwriting concurrent
             * changes..
             *
             * @param ifMatch The ETag of the transformation. Omit this value to always overwrite the current
             *     transformation. Specify the last-seen ETag value to prevent accidentally overwriting concurrent
             *     changes.
             * @return the next definition stage.
             */
            Update ifMatch(String ifMatch);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Transformation refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Transformation refresh(Context context);
}
