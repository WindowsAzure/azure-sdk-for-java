// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.WorkloadGroupInner;

/** An immutable client-side representation of WorkloadGroup. */
public interface WorkloadGroup {
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
     * Gets the minResourcePercent property: The workload group minimum percentage resource.
     *
     * @return the minResourcePercent value.
     */
    Integer minResourcePercent();

    /**
     * Gets the maxResourcePercent property: The workload group cap percentage resource.
     *
     * @return the maxResourcePercent value.
     */
    Integer maxResourcePercent();

    /**
     * Gets the minResourcePercentPerRequest property: The workload group request minimum grant percentage.
     *
     * @return the minResourcePercentPerRequest value.
     */
    Double minResourcePercentPerRequest();

    /**
     * Gets the maxResourcePercentPerRequest property: The workload group request maximum grant percentage.
     *
     * @return the maxResourcePercentPerRequest value.
     */
    Double maxResourcePercentPerRequest();

    /**
     * Gets the importance property: The workload group importance level.
     *
     * @return the importance value.
     */
    String importance();

    /**
     * Gets the queryExecutionTimeout property: The workload group query execution timeout.
     *
     * @return the queryExecutionTimeout value.
     */
    Integer queryExecutionTimeout();

    /**
     * Gets the inner com.azure.resourcemanager.sql.generated.fluent.models.WorkloadGroupInner object.
     *
     * @return the inner object.
     */
    WorkloadGroupInner innerModel();

    /** The entirety of the WorkloadGroup definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The WorkloadGroup definition stages. */
    interface DefinitionStages {
        /** The first stage of the WorkloadGroup definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the WorkloadGroup definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, serverName, databaseName.
             *
             * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this
             *     value from the Azure Resource Manager API or the portal.
             * @param serverName The name of the server.
             * @param databaseName The name of the database.
             * @return the next definition stage.
             */
            WithCreate withExistingDatabase(String resourceGroupName, String serverName, String databaseName);
        }
        /**
         * The stage of the WorkloadGroup definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithMinResourcePercent,
                DefinitionStages.WithMaxResourcePercent,
                DefinitionStages.WithMinResourcePercentPerRequest,
                DefinitionStages.WithMaxResourcePercentPerRequest,
                DefinitionStages.WithImportance,
                DefinitionStages.WithQueryExecutionTimeout {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            WorkloadGroup create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            WorkloadGroup create(Context context);
        }
        /** The stage of the WorkloadGroup definition allowing to specify minResourcePercent. */
        interface WithMinResourcePercent {
            /**
             * Specifies the minResourcePercent property: The workload group minimum percentage resource..
             *
             * @param minResourcePercent The workload group minimum percentage resource.
             * @return the next definition stage.
             */
            WithCreate withMinResourcePercent(Integer minResourcePercent);
        }
        /** The stage of the WorkloadGroup definition allowing to specify maxResourcePercent. */
        interface WithMaxResourcePercent {
            /**
             * Specifies the maxResourcePercent property: The workload group cap percentage resource..
             *
             * @param maxResourcePercent The workload group cap percentage resource.
             * @return the next definition stage.
             */
            WithCreate withMaxResourcePercent(Integer maxResourcePercent);
        }
        /** The stage of the WorkloadGroup definition allowing to specify minResourcePercentPerRequest. */
        interface WithMinResourcePercentPerRequest {
            /**
             * Specifies the minResourcePercentPerRequest property: The workload group request minimum grant
             * percentage..
             *
             * @param minResourcePercentPerRequest The workload group request minimum grant percentage.
             * @return the next definition stage.
             */
            WithCreate withMinResourcePercentPerRequest(Double minResourcePercentPerRequest);
        }
        /** The stage of the WorkloadGroup definition allowing to specify maxResourcePercentPerRequest. */
        interface WithMaxResourcePercentPerRequest {
            /**
             * Specifies the maxResourcePercentPerRequest property: The workload group request maximum grant
             * percentage..
             *
             * @param maxResourcePercentPerRequest The workload group request maximum grant percentage.
             * @return the next definition stage.
             */
            WithCreate withMaxResourcePercentPerRequest(Double maxResourcePercentPerRequest);
        }
        /** The stage of the WorkloadGroup definition allowing to specify importance. */
        interface WithImportance {
            /**
             * Specifies the importance property: The workload group importance level..
             *
             * @param importance The workload group importance level.
             * @return the next definition stage.
             */
            WithCreate withImportance(String importance);
        }
        /** The stage of the WorkloadGroup definition allowing to specify queryExecutionTimeout. */
        interface WithQueryExecutionTimeout {
            /**
             * Specifies the queryExecutionTimeout property: The workload group query execution timeout..
             *
             * @param queryExecutionTimeout The workload group query execution timeout.
             * @return the next definition stage.
             */
            WithCreate withQueryExecutionTimeout(Integer queryExecutionTimeout);
        }
    }
    /**
     * Begins update for the WorkloadGroup resource.
     *
     * @return the stage of resource update.
     */
    WorkloadGroup.Update update();

    /** The template for WorkloadGroup update. */
    interface Update
        extends UpdateStages.WithMinResourcePercent,
            UpdateStages.WithMaxResourcePercent,
            UpdateStages.WithMinResourcePercentPerRequest,
            UpdateStages.WithMaxResourcePercentPerRequest,
            UpdateStages.WithImportance,
            UpdateStages.WithQueryExecutionTimeout {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        WorkloadGroup apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        WorkloadGroup apply(Context context);
    }
    /** The WorkloadGroup update stages. */
    interface UpdateStages {
        /** The stage of the WorkloadGroup update allowing to specify minResourcePercent. */
        interface WithMinResourcePercent {
            /**
             * Specifies the minResourcePercent property: The workload group minimum percentage resource..
             *
             * @param minResourcePercent The workload group minimum percentage resource.
             * @return the next definition stage.
             */
            Update withMinResourcePercent(Integer minResourcePercent);
        }
        /** The stage of the WorkloadGroup update allowing to specify maxResourcePercent. */
        interface WithMaxResourcePercent {
            /**
             * Specifies the maxResourcePercent property: The workload group cap percentage resource..
             *
             * @param maxResourcePercent The workload group cap percentage resource.
             * @return the next definition stage.
             */
            Update withMaxResourcePercent(Integer maxResourcePercent);
        }
        /** The stage of the WorkloadGroup update allowing to specify minResourcePercentPerRequest. */
        interface WithMinResourcePercentPerRequest {
            /**
             * Specifies the minResourcePercentPerRequest property: The workload group request minimum grant
             * percentage..
             *
             * @param minResourcePercentPerRequest The workload group request minimum grant percentage.
             * @return the next definition stage.
             */
            Update withMinResourcePercentPerRequest(Double minResourcePercentPerRequest);
        }
        /** The stage of the WorkloadGroup update allowing to specify maxResourcePercentPerRequest. */
        interface WithMaxResourcePercentPerRequest {
            /**
             * Specifies the maxResourcePercentPerRequest property: The workload group request maximum grant
             * percentage..
             *
             * @param maxResourcePercentPerRequest The workload group request maximum grant percentage.
             * @return the next definition stage.
             */
            Update withMaxResourcePercentPerRequest(Double maxResourcePercentPerRequest);
        }
        /** The stage of the WorkloadGroup update allowing to specify importance. */
        interface WithImportance {
            /**
             * Specifies the importance property: The workload group importance level..
             *
             * @param importance The workload group importance level.
             * @return the next definition stage.
             */
            Update withImportance(String importance);
        }
        /** The stage of the WorkloadGroup update allowing to specify queryExecutionTimeout. */
        interface WithQueryExecutionTimeout {
            /**
             * Specifies the queryExecutionTimeout property: The workload group query execution timeout..
             *
             * @param queryExecutionTimeout The workload group query execution timeout.
             * @return the next definition stage.
             */
            Update withQueryExecutionTimeout(Integer queryExecutionTimeout);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    WorkloadGroup refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    WorkloadGroup refresh(Context context);
}
