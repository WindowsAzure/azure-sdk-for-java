// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.model;

import com.azure.cosmos.CosmosAsyncClient;
import com.azure.cosmos.CosmosAsyncContainer;
import com.azure.cosmos.CosmosAsyncDatabase;
import com.azure.cosmos.CosmosAsyncUser;
import com.azure.cosmos.CosmosClient;
import com.azure.cosmos.CosmosDatabase;
import com.azure.cosmos.CosmosStoredProcedure;
import com.azure.cosmos.CosmosTrigger;
import com.azure.cosmos.CosmosUserDefinedFunction;
import com.azure.cosmos.PartitionKey;
import com.azure.cosmos.Permission;
import com.azure.cosmos.implementation.Conflict;
import com.azure.cosmos.implementation.CosmosItemProperties;
import com.azure.cosmos.implementation.Database;
import com.azure.cosmos.implementation.Document;
import com.azure.cosmos.implementation.DocumentCollection;
import com.azure.cosmos.implementation.RequestOptions;
import com.azure.cosmos.implementation.ResourceResponse;
import com.azure.cosmos.implementation.StoredProcedure;
import com.azure.cosmos.implementation.StoredProcedureResponse;
import com.azure.cosmos.implementation.Trigger;
import com.azure.cosmos.implementation.User;
import com.azure.cosmos.implementation.UserDefinedFunction;

import java.util.List;

/**
 * This is meant to be used only internally as a bridge access to classes in
 * com.azure.cosmos.model package
 **/
public class ModelBridgeInternal {

    public static CosmosAsyncConflictResponse createCosmosAsyncConflictResponse(ResourceResponse<Conflict> response,
                                                                                CosmosAsyncContainer container) {
        return new CosmosAsyncConflictResponse(response, container);
    }

    public static CosmosAsyncContainerResponse createCosmosAsyncContainerResponse(ResourceResponse<DocumentCollection> response,
                                                                                  CosmosAsyncDatabase database) {
        return new CosmosAsyncContainerResponse(response, database);
    }

    public static CosmosAsyncDatabaseResponse createCosmosAsyncDatabaseResponse(ResourceResponse<Database> response,
                                                                                 CosmosAsyncClient client) {
        return new CosmosAsyncDatabaseResponse(response, client);
    }

    public static <T> CosmosAsyncItemResponse<T> createCosmosAsyncItemResponse(ResourceResponse<Document> response, Class<T> classType) {
        return new CosmosAsyncItemResponse<>(response, classType);
    }

    public static CosmosAsyncItemResponse createCosmosAsyncItemResponseWithObjectType(ResourceResponse<Document> response, Class classType) {
        return new CosmosAsyncItemResponse(response, classType);
    }

    public static CosmosAsyncPermissionResponse createCosmosAsyncPermissionResponse(ResourceResponse<Permission> response,
                                                                                    CosmosAsyncUser cosmosUser) {
        return new CosmosAsyncPermissionResponse(response, cosmosUser);
    }

    public static CosmosAsyncStoredProcedureResponse createCosmosAsyncStoredProcedureResponse(ResourceResponse<StoredProcedure> response,
                                                                                              CosmosAsyncContainer cosmosContainer) {
        return new CosmosAsyncStoredProcedureResponse(response, cosmosContainer);
    }

    public static CosmosAsyncStoredProcedureResponse createCosmosAsyncStoredProcedureResponse(StoredProcedureResponse response,
                                                                                              CosmosAsyncContainer cosmosContainer,
                                                                                              String storedProcedureId) {
        return new CosmosAsyncStoredProcedureResponse(response, cosmosContainer, storedProcedureId);
    }

    public static CosmosStoredProcedureProperties createCosmosStoredProcedureProperties(String jsonString) {
        return new CosmosStoredProcedureProperties(jsonString);
    }

    public static CosmosAsyncTriggerResponse createCosmosAsyncTriggerResponse(ResourceResponse<Trigger> response,
                                                                              CosmosAsyncContainer container) {
        return new CosmosAsyncTriggerResponse(response, container);
    }

    public static CosmosAsyncUserDefinedFunctionResponse createCosmosAsyncUserDefinedFunctionResponse(ResourceResponse<UserDefinedFunction> response,
                                                                                                      CosmosAsyncContainer container) {
        return new CosmosAsyncUserDefinedFunctionResponse(response, container);
    }

    public static CosmosAsyncUserResponse createCosmosAsyncUserResponse(ResourceResponse<User> response, CosmosAsyncDatabase database) {
        return new CosmosAsyncUserResponse(response, database);
    }

    public static CosmosContainerResponse createCosmosContainerResponse(CosmosAsyncContainerResponse response,
                                                                        CosmosDatabase database, CosmosClient client) {
        return new CosmosContainerResponse(response, database, client);
    }

    public static CosmosUserResponse createCosmosUserResponse(CosmosAsyncUserResponse response, CosmosDatabase database) {
        return new CosmosUserResponse(response, database);
    }

    public static <T> CosmosItemResponse<T> createCosmosItemResponse(CosmosAsyncItemResponse<T> response) {
        return new CosmosItemResponse<>(response);
    }

    public static CosmosDatabaseResponse createCosmosDatabaseResponse(CosmosAsyncDatabaseResponse response, CosmosClient client) {
        return new CosmosDatabaseResponse(response, client);
    }

    public static CosmosStoredProcedureResponse createCosmosStoredProcedureResponse(CosmosAsyncStoredProcedureResponse resourceResponse,
                                                CosmosStoredProcedure storedProcedure) {
        return new CosmosStoredProcedureResponse(resourceResponse, storedProcedure);
    }

    public static CosmosUserDefinedFunctionResponse createCosmosUserDefinedFunctionResponse(CosmosAsyncUserDefinedFunctionResponse resourceResponse,
                                                    CosmosUserDefinedFunction userDefinedFunction) {
        return new CosmosUserDefinedFunctionResponse(resourceResponse, userDefinedFunction);
    }

    public static CosmosTriggerResponse createCosmosTriggerResponse(CosmosAsyncTriggerResponse asyncResponse,
                                        CosmosTrigger syncTrigger) {
        return new CosmosTriggerResponse(asyncResponse, syncTrigger);
    }

    public static List<CosmosConflictProperties> getCosmosConflictPropertiesFromV2Results(List<Conflict> results) {
        return CosmosConflictProperties.getFromV2Results(results);
    }

    public static DocumentCollection getV2Collection(CosmosContainerProperties containerProperties) {
        return containerProperties.getV2Collection();
    }

    public static List<CosmosContainerProperties> getCosmosContainerPropertiesFromV2Results(List<DocumentCollection> results) {
        return CosmosContainerProperties.getFromV2Results(results);
    }

    public static List<CosmosDatabaseProperties> getCosmosDatabasePropertiesFromV2Results(List<Database> results) {
        return CosmosDatabaseProperties.getFromV2Results(results);
    }

    public static <T> CosmosItemProperties getCosmosItemProperties(CosmosAsyncItemResponse<T> cosmosItemResponse) {
        return cosmosItemResponse.getProperties();
    }

    public static <T> CosmosItemProperties getCosmosItemProperties(CosmosItemResponse<T> cosmosItemResponse) {
        return cosmosItemResponse.getProperties();
    }

    public static Permission getV2Permissions(CosmosPermissionProperties permissionSettings) {
        return permissionSettings.getV2Permissions();
    }

    public static List<CosmosPermissionProperties> getCosmosPermissionPropertiesFromV2Results(List<Permission> results) {
        return CosmosPermissionProperties.getFromV2Results(results);
    }

    public static List<CosmosStoredProcedureProperties> getCosmosStoredProcedurePropertiesFromV2Results(List<StoredProcedure> results) {
        return CosmosStoredProcedureProperties.getFromV2Results(results);
    }

    public static List<CosmosTriggerProperties> getCosmosTriggerPropertiesFromV2Results(List<Trigger> results) {
        return CosmosTriggerProperties.getFromV2Results(results);
    }

    public static List<CosmosUserDefinedFunctionProperties> getCosmosUserDefinedFunctionPropertiesFromV2Results(List<UserDefinedFunction> results) {
        return CosmosUserDefinedFunctionProperties.getFromV2Results(results);
    }

    public static User getV2User(CosmosUserProperties cosmosUserProperties) {
        return cosmosUserProperties.getV2User();
    }

    public static List<CosmosUserProperties> getCosmosUserPropertiesFromV2Results(List<User> results) {
        return CosmosUserProperties.getFromV2Results(results);
    }

    public static RequestOptions toRequestOptions(CosmosConflictRequestOptions cosmosConflictRequestOptions) {
        return cosmosConflictRequestOptions.toRequestOptions();
    }

    public static RequestOptions toRequestOptions(CosmosContainerRequestOptions cosmosContainerRequestOptions) {
        return cosmosContainerRequestOptions.toRequestOptions();
    }

    public static CosmosContainerRequestOptions setOfferThroughput(CosmosContainerRequestOptions cosmosContainerRequestOptions,
                                                                   Integer offerThroughput) {
        return cosmosContainerRequestOptions.setOfferThroughput(offerThroughput);
    }

    public static RequestOptions toRequestOptions(CosmosDatabaseRequestOptions cosmosDatabaseRequestOptions) {
        return cosmosDatabaseRequestOptions.toRequestOptions();
    }

    public static CosmosDatabaseRequestOptions setOfferThroughput(CosmosDatabaseRequestOptions cosmosDatabaseRequestOptions,
                                                                   Integer offerThroughput) {
        return cosmosDatabaseRequestOptions.setOfferThroughput(offerThroughput);
    }

    public static CosmosItemRequestOptions setPartitionKey(CosmosItemRequestOptions cosmosItemRequestOptions,
                                                           PartitionKey partitionKey) {
        return cosmosItemRequestOptions.setPartitionKey(partitionKey);
    }

    public static RequestOptions toRequestOptions(CosmosItemRequestOptions cosmosItemRequestOptions) {
        return cosmosItemRequestOptions.toRequestOptions();
    }

    public static CosmosItemRequestOptions createCosmosItemRequestOptions(PartitionKey partitionKey) {
        return new CosmosItemRequestOptions(partitionKey);
    }

    public static RequestOptions toRequestOptions(CosmosPermissionRequestOptions cosmosPermissionRequestOptions) {
        return cosmosPermissionRequestOptions.toRequestOptions();
    }

    public static RequestOptions toRequestOptions(CosmosStoredProcedureRequestOptions cosmosStoredProcedureRequestOptions) {
        return cosmosStoredProcedureRequestOptions.toRequestOptions();
    }
}
