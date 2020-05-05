// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos;

import com.azure.core.util.Context;
import com.azure.cosmos.implementation.Paths;
import com.azure.cosmos.implementation.TracerProvider;
import com.azure.cosmos.models.CosmosAsyncPermissionResponse;
import com.azure.cosmos.models.CosmosPermissionProperties;
import com.azure.cosmos.models.CosmosPermissionRequestOptions;
import com.azure.cosmos.models.ModelBridgeInternal;
import reactor.core.publisher.Mono;

import static com.azure.core.util.FluxUtil.withContext;

/**
 *  Has methods to operate on a per-User Permission to access a specific resource
 */
public class CosmosAsyncPermission {

    private final CosmosAsyncUser cosmosUser;
    private String id;

    CosmosAsyncPermission(String id, CosmosAsyncUser user) {
        this.id = id;
        this.cosmosUser = user;
    }

    /**
     * Get the id of the {@link CosmosAsyncPermission}
     *
     * @return the id of the {@link CosmosAsyncPermission}
     */
    public String id() {
        return id;
    }

    /**
     * Set the id of the {@link CosmosAsyncPermission}
     *
     * @param id the id of the {@link CosmosAsyncPermission}
     * @return the same {@link CosmosAsyncPermission} that had the id set
     */
    CosmosAsyncPermission id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Reads a permission.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response with the read permission.
     * In case of failure the {@link Mono} will error.
     *
     * @param options the request options.
     * @return an {@link Mono} containing the single resource response with the read permission or an error.
     */
    public Mono<CosmosAsyncPermissionResponse> read(CosmosPermissionRequestOptions options) {
        if (options == null) {
            options = new CosmosPermissionRequestOptions();
        }

        final CosmosPermissionRequestOptions requestOptions = options;
        return TracerProvider.cosmosWithContext(withContext(context -> readInternal(requestOptions, context)),
            cosmosUser.getDatabase().getClient().getTracerProvider());
    }

    /**
     * Replaces a permission.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response with the replaced permission.
     * In case of failure the {@link Mono} will error.
     *
     * @param permissionSettings the permission properties to use.
     * @param options the request options.
     * @return an {@link Mono} containing the single resource response with the replaced permission or an error.
     */
    public Mono<CosmosAsyncPermissionResponse> replace(CosmosPermissionProperties permissionSettings,
                                                       CosmosPermissionRequestOptions options) {
        if (options == null) {
            options = new CosmosPermissionRequestOptions();
        }

        final CosmosPermissionRequestOptions requestOptions = options;
        return TracerProvider.cosmosWithContext(withContext(context -> replaceInternal(permissionSettings,
            requestOptions, context)),
            cosmosUser.getDatabase().getClient().getTracerProvider());
    }

    /**
     * Deletes a permission.
     * <p>
     * After subscription the operation will be performed.
     * The {@link Mono} upon successful completion will contain a single resource response for the deleted permission.
     * In case of failure the {@link Mono} will error.
     *
     * @param options the request options.
     * @return an {@link Mono} containing the single resource response for the deleted permission or an error.
     */
    public Mono<CosmosAsyncPermissionResponse> delete(CosmosPermissionRequestOptions options) {
        if (options == null) {
            options = new CosmosPermissionRequestOptions();
        }

        final CosmosPermissionRequestOptions requestOptions = options;
        return TracerProvider.cosmosWithContext(withContext(context -> deleteInternal(requestOptions, context)),
            cosmosUser.getDatabase().getClient().getTracerProvider());
    }

    String getURIPathSegment() {
        return Paths.PERMISSIONS_PATH_SEGMENT;
    }

    String getParentLink() {
        return cosmosUser.getLink();
    }

    String getLink() {
        StringBuilder builder = new StringBuilder();
        builder.append(getParentLink());
        builder.append("/");
        builder.append(getURIPathSegment());
        builder.append("/");
        builder.append(id());
        return builder.toString();
    }

    private Mono<CosmosAsyncPermissionResponse> readInternal(CosmosPermissionRequestOptions options, Context context) {

        String spanName = "readPermission." + cosmosUser.getId();
        Mono<CosmosAsyncPermissionResponse> responseMono = cosmosUser.getDatabase()
            .getDocClientWrapper()
            .readPermission(getLink(), ModelBridgeInternal.toRequestOptions(options))
            .map(response -> ModelBridgeInternal.createCosmosAsyncPermissionResponse(response, cosmosUser))
            .single();
        return cosmosUser.getDatabase().getClient().getTracerProvider().traceEnabledCosmosResponsePublisher(responseMono, context,
            spanName, cosmosUser.getDatabase().getId(), cosmosUser.getDatabase().getClient().getServiceEndpoint());
    }

    private Mono<CosmosAsyncPermissionResponse> replaceInternal(CosmosPermissionProperties permissionSettings,
                                                                CosmosPermissionRequestOptions options,
                                                                Context context) {

        String spanName = "replacePermission." + cosmosUser.getId();
        Mono<CosmosAsyncPermissionResponse> responseMono = cosmosUser.getDatabase()
            .getDocClientWrapper()
            .replacePermission(ModelBridgeInternal.getV2Permissions(permissionSettings),
                ModelBridgeInternal.toRequestOptions(options))
            .map(response -> ModelBridgeInternal.createCosmosAsyncPermissionResponse(response, cosmosUser))
            .single();
        return cosmosUser.getDatabase().getClient().getTracerProvider().traceEnabledCosmosResponsePublisher(responseMono, context,
            spanName, cosmosUser.getDatabase().getId(), cosmosUser.getDatabase().getClient().getServiceEndpoint());
    }

    private Mono<CosmosAsyncPermissionResponse> deleteInternal(CosmosPermissionRequestOptions options,
                                                               Context context) {

        String spanName = "deletePermission." + cosmosUser.getId();
        Mono<CosmosAsyncPermissionResponse> responseMono = cosmosUser.getDatabase()
            .getDocClientWrapper()
            .deletePermission(getLink(), ModelBridgeInternal.toRequestOptions(options))
            .map(response -> ModelBridgeInternal.createCosmosAsyncPermissionResponse(response, cosmosUser))
            .single();
        return cosmosUser.getDatabase().getClient().getTracerProvider().traceEnabledCosmosResponsePublisher(responseMono, context,
            spanName, cosmosUser.getDatabase().getId(), cosmosUser.getDatabase().getClient().getServiceEndpoint());
    }
}
