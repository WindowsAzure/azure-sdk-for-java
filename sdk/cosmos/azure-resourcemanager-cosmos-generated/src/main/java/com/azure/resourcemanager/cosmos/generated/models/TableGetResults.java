// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cosmos.generated.fluent.models.TableGetResultsInner;
import java.util.Map;

/** An immutable client-side representation of TableGetResults. */
public interface TableGetResults {
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
     * Gets the resource property: The resource property.
     *
     * @return the resource value.
     */
    TableGetPropertiesResource resource();

    /**
     * Gets the options property: Cosmos DB options resource object.
     *
     * @return the options value.
     */
    OptionsResource options();

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
     * Gets the inner com.azure.resourcemanager.cosmos.generated.fluent.models.TableGetResultsInner object.
     *
     * @return the inner object.
     */
    TableGetResultsInner innerModel();

    /** The entirety of the TableGetResults definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithResource,
            DefinitionStages.WithCreate {
    }
    /** The TableGetResults definition stages. */
    interface DefinitionStages {
        /** The first stage of the TableGetResults definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the TableGetResults definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }
        /** The stage of the TableGetResults definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, accountName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param accountName Cosmos DB database account name.
             * @return the next definition stage.
             */
            WithResource withExistingDatabaseAccount(String resourceGroupName, String accountName);
        }
        /** The stage of the TableGetResults definition allowing to specify resource. */
        interface WithResource {
            /**
             * Specifies the resource property: The standard JSON format of a Table.
             *
             * @param resource The standard JSON format of a Table.
             * @return the next definition stage.
             */
            WithCreate withResource(TableResource resource);
        }
        /**
         * The stage of the TableGetResults definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithOptions {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            TableGetResults create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            TableGetResults create(Context context);
        }
        /** The stage of the TableGetResults definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the TableGetResults definition allowing to specify options. */
        interface WithOptions {
            /**
             * Specifies the options property: A key-value pair of options to be applied for the request. This
             * corresponds to the headers sent with the request..
             *
             * @param options A key-value pair of options to be applied for the request. This corresponds to the headers
             *     sent with the request.
             * @return the next definition stage.
             */
            WithCreate withOptions(CreateUpdateOptions options);
        }
    }
    /**
     * Begins update for the TableGetResults resource.
     *
     * @return the stage of resource update.
     */
    TableGetResults.Update update();

    /** The template for TableGetResults update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithResource, UpdateStages.WithOptions {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        TableGetResults apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        TableGetResults apply(Context context);
    }
    /** The TableGetResults update stages. */
    interface UpdateStages {
        /** The stage of the TableGetResults update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the TableGetResults update allowing to specify resource. */
        interface WithResource {
            /**
             * Specifies the resource property: The standard JSON format of a Table.
             *
             * @param resource The standard JSON format of a Table.
             * @return the next definition stage.
             */
            Update withResource(TableResource resource);
        }
        /** The stage of the TableGetResults update allowing to specify options. */
        interface WithOptions {
            /**
             * Specifies the options property: A key-value pair of options to be applied for the request. This
             * corresponds to the headers sent with the request..
             *
             * @param options A key-value pair of options to be applied for the request. This corresponds to the headers
             *     sent with the request.
             * @return the next definition stage.
             */
            Update withOptions(CreateUpdateOptions options);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    TableGetResults refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    TableGetResults refresh(Context context);
}
