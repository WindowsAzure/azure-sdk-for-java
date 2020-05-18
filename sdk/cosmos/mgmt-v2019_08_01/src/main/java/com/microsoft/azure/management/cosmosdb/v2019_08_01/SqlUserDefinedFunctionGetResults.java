/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2019_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.implementation.SqlUserDefinedFunctionGetResultsInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.implementation.CosmosDBManager;
import java.util.Map;

/**
 * Type representing SqlUserDefinedFunctionGetResults.
 */
public interface SqlUserDefinedFunctionGetResults extends HasInner<SqlUserDefinedFunctionGetResultsInner>, Indexable, Refreshable<SqlUserDefinedFunctionGetResults>, Updatable<SqlUserDefinedFunctionGetResults.Update>, HasManager<CosmosDBManager> {
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
     * @return the resource value.
     */
    SqlUserDefinedFunctionGetPropertiesResource resource();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the SqlUserDefinedFunctionGetResults definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithContainer, DefinitionStages.WithLocation, DefinitionStages.WithOptions, DefinitionStages.WithResource, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of SqlUserDefinedFunctionGetResults definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a SqlUserDefinedFunctionGetResults definition.
         */
        interface Blank extends WithContainer {
        }

        /**
         * The stage of the sqluserdefinedfunctiongetresults definition allowing to specify Container.
         */
        interface WithContainer {
           /**
            * Specifies resourceGroupName, accountName, databaseName, containerName.
            * @param resourceGroupName Name of an Azure resource group
            * @param accountName Cosmos DB database account name
            * @param databaseName Cosmos DB database name
            * @param containerName Cosmos DB container name
            * @return the next definition stage
            */
            WithLocation withExistingContainer(String resourceGroupName, String accountName, String databaseName, String containerName);
        }

        /**
         * The stage of the sqluserdefinedfunctiongetresults definition allowing to specify Location.
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
         * The stage of the sqluserdefinedfunctiongetresults definition allowing to specify Options.
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
         * The stage of the sqluserdefinedfunctiongetresults definition allowing to specify Resource.
         */
        interface WithResource {
           /**
            * Specifies resource.
            * @param resource The standard JSON format of a userDefinedFunction
            * @return the next definition stage
            */
            WithCreate withResource(SqlUserDefinedFunctionResource resource);
        }

        /**
         * The stage of the sqluserdefinedfunctiongetresults definition allowing to specify Tags.
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
        interface WithCreate extends Creatable<SqlUserDefinedFunctionGetResults>, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a SqlUserDefinedFunctionGetResults update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<SqlUserDefinedFunctionGetResults>, UpdateStages.WithTags {
    }

    /**
     * Grouping of SqlUserDefinedFunctionGetResults update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the sqluserdefinedfunctiongetresults update allowing to specify Tags.
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
