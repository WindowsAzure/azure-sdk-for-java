/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2019_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.implementation.TableGetResultsInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.implementation.CosmosDBManager;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.implementation.TableResourceInner;
import java.util.Map;

/**
 * Type representing TableGetResults.
 */
public interface TableGetResults extends HasInner<TableGetResultsInner>, Indexable, Refreshable<TableGetResults>, Updatable<TableGetResults.Update>, HasManager<CosmosDBManager> {
    /**
     * @return the _etag value.
     */
    String _etag();

    /**
     * @return the _rid value.
     */
    String _rid();

    /**
     * @return the _ts value.
     */
    Object _ts();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the tableGetResultsId value.
     */
    String tableGetResultsId();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the TableGetResults definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithDatabaseAccount, DefinitionStages.WithLocation, DefinitionStages.WithOptions, DefinitionStages.WithResource, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of TableGetResults definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a TableGetResults definition.
         */
        interface Blank extends WithDatabaseAccount {
        }

        /**
         * The stage of the tablegetresults definition allowing to specify DatabaseAccount.
         */
        interface WithDatabaseAccount {
           /**
            * Specifies resourceGroupName, accountName.
            * @param resourceGroupName Name of an Azure resource group
            * @param accountName Cosmos DB database account name
            * @return the next definition stage
            */
            WithLocation withExistingDatabaseAccount(String resourceGroupName, String accountName);
        }

        /**
         * The stage of the tablegetresults definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            * @param location the location parameter value
            * @return the next definition stage
            */
            WithOptions withLocation(String location);
        }

        /**
         * The stage of the tablegetresults definition allowing to specify Options.
         */
        interface WithOptions {
           /**
            * Specifies options.
            * @param options A key-value pair of options to be applied for the request. This corresponds to the headers sent with the request
            * @return the next definition stage
            */
            WithResource withOptions(Map<String, String> options);
        }

        /**
         * The stage of the tablegetresults definition allowing to specify Resource.
         */
        interface WithResource {
           /**
            * Specifies resource.
            * @param resource The standard JSON format of a Table
            * @return the next definition stage
            */
            WithCreate withResource(TableResourceInner resource);
        }

        /**
         * The stage of the tablegetresults definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags the tags parameter value
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<TableGetResults>, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a TableGetResults update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<TableGetResults>, UpdateStages.WithTags {
    }

    /**
     * Grouping of TableGetResults update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the tablegetresults update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags the tags parameter value
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

    }
}
