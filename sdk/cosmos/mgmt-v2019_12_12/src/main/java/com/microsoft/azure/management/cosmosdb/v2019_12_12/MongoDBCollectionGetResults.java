/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2019_12_12;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.cosmosdb.v2019_12_12.implementation.MongoDBCollectionGetResultsInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.cosmosdb.v2019_12_12.implementation.CosmosDBManager;
import java.util.Map;

/**
 * Type representing MongoDBCollectionGetResults.
 */
public interface MongoDBCollectionGetResults extends HasInner<MongoDBCollectionGetResultsInner>, Indexable, Refreshable<MongoDBCollectionGetResults>, Updatable<MongoDBCollectionGetResults.Update>, HasManager<CosmosDBManager> {
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
    MongoDBCollectionGetPropertiesResource resource();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the MongoDBCollectionGetResults definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithMongodbDatabasis, DefinitionStages.WithLocation, DefinitionStages.WithOptions, DefinitionStages.WithResource, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of MongoDBCollectionGetResults definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a MongoDBCollectionGetResults definition.
         */
        interface Blank extends WithMongodbDatabasis {
        }

        /**
         * The stage of the mongodbcollectiongetresults definition allowing to specify MongodbDatabasis.
         */
        interface WithMongodbDatabasis {
           /**
            * Specifies resourceGroupName, accountName, databaseName.
            * @param resourceGroupName Name of an Azure resource group
            * @param accountName Cosmos DB database account name
            * @param databaseName Cosmos DB database name
            * @return the next definition stage
            */
            WithLocation withExistingMongodbDatabasis(String resourceGroupName, String accountName, String databaseName);
        }

        /**
         * The stage of the mongodbcollectiongetresults definition allowing to specify Location.
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
         * The stage of the mongodbcollectiongetresults definition allowing to specify Options.
         */
        interface WithOptions {
           /**
            * Specifies options.
            * @param options A key-value pair of options to be applied for the request. This corresponds to the headers sent with the request
            * @return the next definition stage
            */
            WithResource withOptions(CreateUpdateOptions options);
        }

        /**
         * The stage of the mongodbcollectiongetresults definition allowing to specify Resource.
         */
        interface WithResource {
           /**
            * Specifies resource.
            * @param resource The standard JSON format of a MongoDB collection
            * @return the next definition stage
            */
            WithCreate withResource(MongoDBCollectionResource resource);
        }

        /**
         * The stage of the mongodbcollectiongetresults definition allowing to specify Tags.
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
        interface WithCreate extends Creatable<MongoDBCollectionGetResults>, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a MongoDBCollectionGetResults update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<MongoDBCollectionGetResults>, UpdateStages.WithTags {
    }

    /**
     * Grouping of MongoDBCollectionGetResults update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the mongodbcollectiongetresults update allowing to specify Tags.
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
