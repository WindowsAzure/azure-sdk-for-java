// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos;

import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.tracing.ProcessKind;
import com.azure.cosmos.implementation.AsyncDocumentClient;
import com.azure.cosmos.implementation.HttpConstants;
import com.azure.cosmos.implementation.Offer;
import com.azure.cosmos.implementation.Paths;
import com.azure.cosmos.implementation.TracerProvider;
import com.azure.cosmos.implementation.apachecommons.lang.StringUtils;
import com.azure.cosmos.models.CosmosAsyncContainerResponse;
import com.azure.cosmos.models.CosmosAsyncDatabaseResponse;
import com.azure.cosmos.models.CosmosAsyncUserResponse;
import com.azure.cosmos.models.CosmosContainerProperties;
import com.azure.cosmos.models.CosmosContainerRequestOptions;
import com.azure.cosmos.models.CosmosDatabaseRequestOptions;
import com.azure.cosmos.models.CosmosUserProperties;
import com.azure.cosmos.models.FeedOptions;
import com.azure.cosmos.models.ModelBridgeInternal;
import com.azure.cosmos.models.SqlQuerySpec;
import com.azure.cosmos.util.CosmosPagedFlux;
import com.azure.cosmos.util.UtilBridgeInternal;
import reactor.core.Exceptions;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Signal;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

import static com.azure.core.util.FluxUtil.withContext;
import static com.azure.cosmos.implementation.Utils.setContinuationTokenAndMaxItemCount;

/**
 * Perform read and delete databases, update database throughput, and perform operations on child resources
 */
public class CosmosAsyncDatabase {
    private final CosmosAsyncClient client;
    private final String id;
    private final String link;

    CosmosAsyncDatabase(String id, CosmosAsyncClient client) {
        this.id = id;
        this.client = client;
        this.link = getParentLink() + "/" + getURIPathSegment() + "/" + getId();
    }

    /**
     * Get the id of the CosmosAsyncDatabase
     *
     * @return the id of the CosmosAsyncDatabase
     */
    public String getId() {
        return id;
    }

    /**
     * Reads a database.
     * <p>
     * After subscription the operation will be performed. The {@link Mono} upon
     * successful completion will contain a single cosmos database respone with the
     * read database. In case of failure the {@link Mono} will error.
     *
     * @return an {@link Mono} containing the single cosmos database respone with
     * the read database or an error.
     */
    public Mono<CosmosAsyncDatabaseResponse> read() {
        return read(new CosmosDatabaseRequestOptions());
    }

    /**
     * Reads a database.
     * <p>
     * After subscription the operation will be performed. The {@link Mono} upon
     * successful completion will contain a cosmos cosmos database respone with the
     * read database. In case of failure the {@link Mono} will error.
     *
     * @param options the request options.
     * @return an {@link Mono} containing the single cosmos database response with
     * the read database or an error.
     */
    public Mono<CosmosAsyncDatabaseResponse> read(CosmosDatabaseRequestOptions options) {
        if (options == null) {
            options = new CosmosDatabaseRequestOptions();
        }
        final CosmosDatabaseRequestOptions  requestOptions = options;
        return withContext(context -> read(requestOptions, context)).subscriberContext(reactorContext -> {
            Optional<String> master = reactorContext.getOrEmpty(TracerProvider.MASTER_CALL);
            if (master.isPresent()) {
                reactorContext = reactorContext.put(TracerProvider.NESTED_CALL, true);
            }
            return reactorContext.put(TracerProvider.MASTER_CALL, true);
        });
    }



    /**
     * Deletes a database.
     * <p>
     * After subscription the operation will be performed. The {@link Mono} upon
     * successful completion will contain a cosmos database response with the
     * deleted database. In case of failure the {@link Mono} will error.
     *
     * @return an {@link Mono} containing the single cosmos database response
     */
    public Mono<CosmosAsyncDatabaseResponse> delete() {
        return delete(new CosmosDatabaseRequestOptions());
    }

    /**
     * Deletes a database.
     * <p>
     * After subscription the operation will be performed. The {@link Mono} upon
     * successful completion will contain a cosmos database response with the
     * deleted database. In case of failure the {@link Mono} will error.
     *
     * @param options the request options
     * @return an {@link Mono} containing the single cosmos database response
     */
    public Mono<CosmosAsyncDatabaseResponse> delete(CosmosDatabaseRequestOptions options) {
        if (options == null) {
            options = new CosmosDatabaseRequestOptions();
        }

        final CosmosDatabaseRequestOptions requestOptions = options;
        return withContext(context -> delete(requestOptions, context)).subscriberContext(reactorContext -> {
            Optional<String> master = reactorContext.getOrEmpty(TracerProvider.MASTER_CALL);
            if (master.isPresent()) {
                reactorContext = reactorContext.put(TracerProvider.NESTED_CALL, true);
            }
            return reactorContext.put(TracerProvider.MASTER_CALL, true);
        });
    }

    /* CosmosAsyncContainer operations */

    /**
     * Creates a document container.
     * <p>
     * After subscription the operation will be performed. The {@link Mono} upon
     * successful completion will contain a cosmos container response with the
     * created container. In case of failure the {@link Mono} will error.
     *
     * @param containerProperties the container properties.
     * @return a {@link Mono} containing the single cosmos container response with
     * the created container or an error.
     * @throws IllegalArgumentException containerProperties cannot be null
     */
    public Mono<CosmosAsyncContainerResponse> createContainer(CosmosContainerProperties containerProperties) {
        return createContainer(containerProperties, new CosmosContainerRequestOptions());
    }

    /**
     * Creates a document container.
     * <p>
     * After subscription the operation will be performed. The {@link Mono} upon
     * successful completion will contain a cosmos container response with the
     * created container. In case of failure the {@link Mono} will error.
     *
     * @param containerProperties the container properties.
     * @param throughput the throughput for the container
     * @return a {@link Mono} containing the single cosmos container response with
     * the created container or an error.
     * @throws IllegalArgumentException thown if containerProerties are null
     */
    public Mono<CosmosAsyncContainerResponse> createContainer(
        CosmosContainerProperties containerProperties,
        int throughput) {
        if (containerProperties == null) {
            throw new IllegalArgumentException("containerProperties");
        }
        ModelBridgeInternal.validateResource(containerProperties);
        CosmosContainerRequestOptions options = new CosmosContainerRequestOptions();
        ModelBridgeInternal.setOfferThroughput(options, throughput);
        return createContainer(containerProperties, options);
    }

    /**
     * Creates a document container.
     * <p>
     * After subscription the operation will be performed. The {@link Mono} upon
     * successful completion will contain a cosmos container response with the
     * created container. In case of failure the {@link Mono} will error.
     *
     * @param containerProperties the containerProperties.
     * @param options the cosmos container request options
     * @return a {@link Mono} containing the cosmos container response with the
     * created container or an error.
     * @throws IllegalArgumentException containerProperties can not be null
     */
    public Mono<CosmosAsyncContainerResponse> createContainer(
        CosmosContainerProperties containerProperties,
        CosmosContainerRequestOptions options) {
        if (containerProperties == null) {
            throw new IllegalArgumentException("containerProperties");
        }
        ModelBridgeInternal.validateResource(containerProperties);
        if (options == null) {
            options = new CosmosContainerRequestOptions();
        }

        final  CosmosContainerRequestOptions requestOptions =  options;
        return withContext(context ->
            {
                Optional<Object> parentSpan = context.getData("user-span-name");
                if(parentSpan.isPresent()) {
                    System.out.println("here");
                }
                return createContainer(containerProperties, requestOptions, context);
            }).subscriberContext(reactorContext -> {
            Optional<String> master = reactorContext.getOrEmpty(TracerProvider.MASTER_CALL);
            if (master.isPresent()) {
                reactorContext = reactorContext.put(TracerProvider.NESTED_CALL, true);
            }
            return reactorContext.put(TracerProvider.MASTER_CALL, true);
        });
    }



    /**
     * Creates a document container.
     * <p>
     * After subscription the operation will be performed. The {@link Mono} upon
     * successful completion will contain a cosmos container response with the
     * created container. In case of failure the {@link Mono} will error.
     *
     * @param containerProperties the containerProperties.
     * @param throughput the throughput for the container
     * @param options the cosmos container request options
     * @return a {@link Mono} containing the cosmos container response with the
     * created container or an error.
     * @throws IllegalArgumentException containerProperties cannot be null
     */
    public Mono<CosmosAsyncContainerResponse> createContainer(
        CosmosContainerProperties containerProperties,
        int throughput,
        CosmosContainerRequestOptions options) {
        if (options == null) {
            options = new CosmosContainerRequestOptions();
        }
        ModelBridgeInternal.setOfferThroughput(options, throughput);
        return createContainer(containerProperties, options);
    }

    /**
     * Creates a document container.
     * <p>
     * After subscription the operation will be performed. The {@link Mono} upon
     * successful completion will contain a cosmos container response with the
     * created container. In case of failure the {@link Mono} will error.
     *
     * @param id the cosmos container id
     * @param partitionKeyPath the partition key path
     * @return a {@link Mono} containing the cosmos container response with the
     * created container or an error.
     */
    public Mono<CosmosAsyncContainerResponse> createContainer(String id, String partitionKeyPath) {
        return createContainer(new CosmosContainerProperties(id, partitionKeyPath));
    }

    /**
     * Creates a document container.
     * <p>
     * After subscription the operation will be performed. The {@link Mono} upon
     * successful completion will contain a cosmos container response with the
     * created container. In case of failure the {@link Mono} will error.
     *
     * @param id the cosmos container id
     * @param partitionKeyPath the partition key path
     * @param throughput the throughput for the container
     * @return a {@link Mono} containing the cosmos container response with the
     * created container or an error.
     */
    public Mono<CosmosAsyncContainerResponse> createContainer(String id, String partitionKeyPath, int throughput) {
        CosmosContainerRequestOptions options = new CosmosContainerRequestOptions();
        ModelBridgeInternal.setOfferThroughput(options, throughput);
        return createContainer(new CosmosContainerProperties(id, partitionKeyPath), options);
    }

    /**
     * Creates a document container if it does not exist on the service.
     * <p>
     * After subscription the operation will be performed. The {@link Mono} upon
     * successful completion will contain a cosmos container response with the
     * created or existing container. In case of failure the {@link Mono} will
     * error.
     *
     * @param containerProperties the container properties
     * @return a {@link Mono} containing the cosmos container response with the
     * created or existing container or an error.
     */
    public Mono<CosmosAsyncContainerResponse> createContainerIfNotExists(
        CosmosContainerProperties containerProperties) {
        CosmosAsyncContainer container = getContainer(containerProperties.getId());
        return createContainerIfNotExistsInternal(containerProperties, container, null);
    }

    /**
     * Creates a document container if it does not exist on the service.
     * <p>
     * After subscription the operation will be performed. The {@link Mono} upon
     * successful completion will contain a cosmos container response with the
     * created or existing container. In case of failure the {@link Mono} will
     * error.
     *
     * @param containerProperties the container properties
     * @param throughput the throughput for the container
     * @return a {@link Mono} containing the cosmos container response with the
     * created or existing container or an error.
     */
    public Mono<CosmosAsyncContainerResponse> createContainerIfNotExists(
        CosmosContainerProperties containerProperties,
        int throughput) {
        CosmosContainerRequestOptions options = new CosmosContainerRequestOptions();
        ModelBridgeInternal.setOfferThroughput(options, throughput);
        CosmosAsyncContainer container = getContainer(containerProperties.getId());
        return createContainerIfNotExistsInternal(containerProperties, container, options);
    }

    /**
     * Creates a document container if it does not exist on the service.
     * <p>
     * After subscription the operation will be performed. The {@link Mono} upon
     * successful completion will contain a cosmos container response with the
     * created container. In case of failure the {@link Mono} will error.
     *
     * @param id the cosmos container id
     * @param partitionKeyPath the partition key path
     * @return a {@link Mono} containing the cosmos container response with the
     * created container or an error.
     */
    public Mono<CosmosAsyncContainerResponse> createContainerIfNotExists(String id, String partitionKeyPath) {
        CosmosAsyncContainer container = getContainer(id);
        return createContainerIfNotExistsInternal(new CosmosContainerProperties(id, partitionKeyPath),
                                                  container,
                                                  null);
    }

    /**
     * Creates a document container if it does not exist on the service.
     * <p>
     * After subscription the operation will be performed. The {@link Mono} upon
     * successful completion will contain a cosmos container response with the
     * created container. In case of failure the {@link Mono} will error.
     *
     * @param id the cosmos container id
     * @param partitionKeyPath the partition key path
     * @param throughput the throughput for the container
     * @return a {@link Mono} containing the cosmos container response with the
     * created container or an error.
     */
    public Mono<CosmosAsyncContainerResponse> createContainerIfNotExists(
        String id, String partitionKeyPath,
        int throughput) {
        CosmosContainerRequestOptions options = new CosmosContainerRequestOptions();
        ModelBridgeInternal.setOfferThroughput(options, throughput);
        CosmosAsyncContainer container = getContainer(id);
        return createContainerIfNotExistsInternal(new CosmosContainerProperties(id, partitionKeyPath), container,
                                                  options);
    }

    private Mono<CosmosAsyncContainerResponse> createContainerIfNotExistsInternal(
        CosmosContainerProperties containerProperties, CosmosAsyncContainer container,
        CosmosContainerRequestOptions options) {
        return withContext(context -> createContainerIfNotExistsInternal(containerProperties, container, options, context)).subscriberContext(reactorContext -> {
            Optional<String> master = reactorContext.getOrEmpty(TracerProvider.MASTER_CALL);
            if (master.isPresent()) {
                reactorContext = reactorContext.put(TracerProvider.NESTED_CALL, true);
            }
            return reactorContext.put(TracerProvider.MASTER_CALL, true);
        });
    }

    /**
     * Reads all cosmos containers.
     * <p>
     * After subscription the operation will be performed. The {@link CosmosPagedFlux} will
     * contain one or several feed response of the read containers. In case of
     * failure the {@link CosmosPagedFlux} will error.
     *
     * @param options {@link FeedOptions}
     * @return a {@link CosmosPagedFlux} containing one or several feed response pages of read
     * containers or an error.
     */
    public CosmosPagedFlux<CosmosContainerProperties> readAllContainers(FeedOptions options) {
        return UtilBridgeInternal.createCosmosPagedFlux(pagedFluxOptions -> {
            String spanName = "readAllContainers." + this.getId();
            pagedFluxOptions.setTracerInformation(this.getClient().getTracerProvider(), spanName,
                this.getClient().getServiceEndpoint());
            setContinuationTokenAndMaxItemCount(pagedFluxOptions, options);
            return getDocClientWrapper().readCollections(getLink(), options)
                       .map(response -> BridgeInternal.createFeedResponse(
                           ModelBridgeInternal.getCosmosContainerPropertiesFromV2Results(response.getResults()),
                           response.getResponseHeaders()));
        });
    }

    /**
     * Reads all cosmos containers.
     * <p>
     * After subscription the operation will be performed. The {@link CosmosPagedFlux} will
     * contain one or several feed response of the read containers. In case of
     * failure the {@link CosmosPagedFlux} will error.
     *
     * @return a {@link CosmosPagedFlux} containing one or several feed response pages of read
     * containers or an error.
     */
    public CosmosPagedFlux<CosmosContainerProperties> readAllContainers() {
        return readAllContainers(new FeedOptions());
    }

    /**
     * Query for cosmos containers in a cosmos database.
     * <p>
     * After subscription the operation will be performed. The {@link CosmosPagedFlux} will
     * contain one or several feed response of the obtained containers. In case of
     * failure the {@link CosmosPagedFlux} will error.
     *
     * @param query the query
     * @return a {@link CosmosPagedFlux} containing one or several feed response pages of the
     * obtained containers or an error.
     */
    public CosmosPagedFlux<CosmosContainerProperties> queryContainers(String query) {
        return queryContainers(new SqlQuerySpec(query));
    }

    /**
     * Query for cosmos containers in a cosmos database.
     * <p>
     * After subscription the operation will be performed. The {@link CosmosPagedFlux} will
     * contain one or several feed response of the obtained containers. In case of
     * failure the {@link CosmosPagedFlux} will error.
     *
     * @param query the query.
     * @param options the feed options.
     * @return a {@link CosmosPagedFlux} containing one or several feed response pages of the
     * obtained containers or an error.
     */
    public CosmosPagedFlux<CosmosContainerProperties> queryContainers(String query, FeedOptions options) {
        return queryContainers(new SqlQuerySpec(query), options);
    }

    /**
     * Query for cosmos containers in a cosmos database.
     * <p>
     * After subscription the operation will be performed. The {@link CosmosPagedFlux} will
     * contain one or several feed response of the obtained containers. In case of
     * failure the {@link CosmosPagedFlux} will error.
     *
     * @param querySpec the SQL query specification.
     * @return a {@link CosmosPagedFlux} containing one or several feed response pages of the
     * obtained containers or an error.
     */
    public CosmosPagedFlux<CosmosContainerProperties> queryContainers(SqlQuerySpec querySpec) {
        return queryContainers(querySpec, new FeedOptions());
    }

    /**
     * Query for cosmos containers in a cosmos database.
     * <p>
     * After subscription the operation will be performed. The {@link CosmosPagedFlux} will
     * contain one or several feed response of the obtained containers. In case of
     * failure the {@link CosmosPagedFlux} will error.
     *
     * @param querySpec the SQL query specification.
     * @param options the feed options.
     * @return a {@link CosmosPagedFlux} containing one or several feed response pages of the
     * obtained containers or an error.
     */
    public CosmosPagedFlux<CosmosContainerProperties> queryContainers(SqlQuerySpec querySpec, FeedOptions options) {
        return UtilBridgeInternal.createCosmosPagedFlux(pagedFluxOptions -> {
            String spanName = "queryContainers." + this.getId() + "." + querySpec.getQueryText();
            pagedFluxOptions.setTracerInformation(this.getClient().getTracerProvider(), spanName,
                this.getClient().getServiceEndpoint());
            setContinuationTokenAndMaxItemCount(pagedFluxOptions, options);
            return getDocClientWrapper().queryCollections(getLink(), querySpec, options)
                       .map(response -> BridgeInternal.createFeedResponse(
                           ModelBridgeInternal.getCosmosContainerPropertiesFromV2Results(response.getResults()),
                           response.getResponseHeaders()));
        });
    }

    /**
     * Gets a CosmosAsyncContainer object without making a service call
     *
     * @param id id of the container
     * @return Cosmos Container
     */
    public CosmosAsyncContainer getContainer(String id) {
        return new CosmosAsyncContainer(id, this);
    }

    /** User operations **/

    /**
     * Creates a user After subscription the operation will be performed. The
     * {@link Mono} upon successful completion will contain a single resource
     * response with the created user. In case of failure the {@link Mono} will
     * error.
     *
     * @param userProperties the cosmos user properties
     * @return an {@link Mono} containing the single resource response with the
     * created cosmos user or an error.
     */
    public Mono<CosmosAsyncUserResponse> createUser(CosmosUserProperties userProperties) {
        return getDocClientWrapper().createUser(this.getLink(), ModelBridgeInternal.getV2User(userProperties), null)
                   .map(response -> ModelBridgeInternal.createCosmosAsyncUserResponse(response, this)).single();
    }


    /**
     * Upsert a user. Upsert will create a new user if it doesn't exist, or replace
     * the existing one if it does. After subscription the operation will be
     * performed. The {@link Mono} upon successful completion will contain a single
     * resource response with the created user. In case of failure the {@link Mono}
     * will error.
     *
     * @param userProperties the cosmos user properties
     * @return an {@link Mono} containing the single resource response with the
     * upserted user or an error.
     */
    public Mono<CosmosAsyncUserResponse> upsertUser(CosmosUserProperties userProperties) {
        return getDocClientWrapper().upsertUser(this.getLink(), ModelBridgeInternal.getV2User(userProperties), null)
                   .map(response -> ModelBridgeInternal.createCosmosAsyncUserResponse(response, this)).single();
    }

    /**
     * Reads all cosmos users in a database.
     * <p>
     * After subscription the operation will be performed. The {@link CosmosPagedFlux} will
     * contain one or several feed response of the read cosmos users. In case of
     * failure the {@link CosmosPagedFlux} will error.
     *
     * @return a {@link CosmosPagedFlux} containing one or several feed response pages of the
     * read cosmos users or an error.
     */
    public CosmosPagedFlux<CosmosUserProperties> readAllUsers() {
        return readAllUsers(new FeedOptions());
    }

    /**
     * Reads all cosmos users in a database.
     * <p>
     * After subscription the operation will be performed. The {@link CosmosPagedFlux} will
     * contain one or several feed response of the read cosmos users. In case of
     * failure the {@link CosmosPagedFlux} will error.
     *
     * @param options the feed options.
     * @return a {@link CosmosPagedFlux} containing one or several feed response pages of the
     * read cosmos users or an error.
     */
    public CosmosPagedFlux<CosmosUserProperties> readAllUsers(FeedOptions options) {
        return UtilBridgeInternal.createCosmosPagedFlux(pagedFluxOptions -> {
            String spanName = "readAllUsers." + this.getId();
            pagedFluxOptions.setTracerInformation(this.getClient().getTracerProvider(), spanName,
                this.getClient().getServiceEndpoint());
            setContinuationTokenAndMaxItemCount(pagedFluxOptions, options);
            return getDocClientWrapper().readUsers(getLink(), options)
                       .map(response -> BridgeInternal.createFeedResponse(
                           ModelBridgeInternal.getCosmosUserPropertiesFromV2Results(response.getResults()), response
                                                                                             .getResponseHeaders()));
        });
    }

    /**
     * Query for cosmos users in a database.
     * <p>
     * After subscription the operation will be performed. The {@link CosmosPagedFlux} will
     * contain one or several feed response of the obtained users. In case of
     * failure the {@link CosmosPagedFlux} will error.
     *
     * @param query query as string
     * @return a {@link CosmosPagedFlux} containing one or several feed response pages of the
     * obtained users or an error.
     */
    public CosmosPagedFlux<CosmosUserProperties> queryUsers(String query) {
        return queryUsers(query, new FeedOptions());
    }

    /**
     * Query for cosmos users in a database.
     * <p>
     * After subscription the operation will be performed. The {@link CosmosPagedFlux} will
     * contain one or several feed response of the obtained users. In case of
     * failure the {@link CosmosPagedFlux} will error.
     *
     * @param query query as string
     * @param options the feed options
     * @return a {@link CosmosPagedFlux} containing one or several feed response pages of the
     * obtained users or an error.
     */
    public CosmosPagedFlux<CosmosUserProperties> queryUsers(String query, FeedOptions options) {
        return queryUsers(new SqlQuerySpec(query), options);
    }

    /**
     * Query for cosmos users in a database.
     * <p>
     * After subscription the operation will be performed. The {@link CosmosPagedFlux} will
     * contain one or several feed response of the obtained users. In case of
     * failure the {@link CosmosPagedFlux} will error.
     *
     * @param querySpec the SQL query specification.
     * @return a {@link CosmosPagedFlux} containing one or several feed response pages of the
     * obtained users or an error.
     */
    public CosmosPagedFlux<CosmosUserProperties> queryUsers(SqlQuerySpec querySpec) {
        return queryUsers(querySpec, new FeedOptions());
    }

    /**
     * Query for cosmos users in a database.
     * <p>
     * After subscription the operation will be performed. The {@link CosmosPagedFlux} will
     * contain one or several feed response of the obtained users. In case of
     * failure the {@link CosmosPagedFlux} will error.
     *
     * @param querySpec the SQL query specification.
     * @param options the feed options.
     * @return a {@link CosmosPagedFlux} containing one or several feed response pages of the
     * obtained users or an error.
     */
    public CosmosPagedFlux<CosmosUserProperties> queryUsers(SqlQuerySpec querySpec, FeedOptions options) {
        return UtilBridgeInternal.createCosmosPagedFlux(pagedFluxOptions -> {
            String spanName = "queryUsers." + this.getId() + "." + querySpec.getQueryText();
            pagedFluxOptions.setTracerInformation(this.getClient().getTracerProvider(), spanName,
                this.getClient().getServiceEndpoint());
            setContinuationTokenAndMaxItemCount(pagedFluxOptions, options);
            return getDocClientWrapper().queryUsers(getLink(), querySpec, options)
                       .map(response -> BridgeInternal.createFeedResponseWithQueryMetrics(
                           ModelBridgeInternal.getCosmosUserPropertiesFromV2Results(response.getResults()), response.getResponseHeaders(),
                           ModelBridgeInternal.queryMetrics(response)));
        });
    }

    /**
     * Gets user.
     *
     * @param id the id
     * @return the user
     */
    public CosmosAsyncUser getUser(String id) {
        return new CosmosAsyncUser(id, this);
    }

    /**
     * Gets the throughput of the database
     *
     * @return a {@link Mono} containing throughput or an error.
     */
    public Mono<Integer> readProvisionedThroughput() {
        return withContext(context -> readProvisionedThroughput(context)).subscriberContext(reactorContext -> {
            Optional<String> master = reactorContext.getOrEmpty(TracerProvider.MASTER_CALL);
            if (master.isPresent()) {
                reactorContext = reactorContext.put(TracerProvider.NESTED_CALL, true);
            }
            return reactorContext.put(TracerProvider.MASTER_CALL, true);
        });
    }

    /**
     * Sets throughput provisioned for a container in measurement of
     * Requests-per-Unit in the Azure Cosmos service.
     *
     * @param requestUnitsPerSecond the cosmos container throughput, expressed in
     * Request Units per second
     * @return a {@link Mono} containing throughput or an error.
     */
    public Mono<Integer> replaceProvisionedThroughput(int requestUnitsPerSecond) {
        return withContext(context -> replaceProvisionedThroughput(requestUnitsPerSecond, context)).subscriberContext(reactorContext -> {
            Optional<String> master = reactorContext.getOrEmpty(TracerProvider.MASTER_CALL);
            if (master.isPresent()) {
                reactorContext = reactorContext.put(TracerProvider.NESTED_CALL, true);
            }
            return reactorContext.put(TracerProvider.MASTER_CALL, true);
        });
    }

    CosmosAsyncClient getClient() {
        return client;
    }

    AsyncDocumentClient getDocClientWrapper() {
        return client.getDocClientWrapper();
    }

    String getURIPathSegment() {
        return Paths.DATABASES_PATH_SEGMENT;
    }

    String getParentLink() {
        return StringUtils.EMPTY;
    }

    String getLink() {
        return this.link;
    }

    private Mono<CosmosAsyncContainerResponse> createContainerIfNotExistsInternal(
        CosmosContainerProperties containerProperties,
        CosmosAsyncContainer container,
        CosmosContainerRequestOptions options,
        Context context) {
        final boolean isTracingEnabled = client.getTracerProvider().isEnabled();
        final AtomicReference<Context> parentContext = isTracingEnabled
            ? new AtomicReference<>(Context.NONE)
            : null;
        String spanName = "createContainerIfNotExistsInternal." + containerProperties.getId();
        Map<String, String> tracingAttributes = new HashMap<String, String>() {{
            put(TracerProvider.DB_TYPE, TracerProvider.DB_TYPE_VALUE);
            put(TracerProvider.DB_INSTANCE, getId());
            put(TracerProvider.DB_URL, client.getServiceEndpoint());
            put(TracerProvider.DB_STATEMENT, spanName);
        }};

        return container.read(options).onErrorResume(exception -> {
            final Throwable unwrappedException = Exceptions.unwrap(exception);
            if (unwrappedException instanceof CosmosClientException) {
                final CosmosClientException cosmosClientException = (CosmosClientException) unwrappedException;
                if (cosmosClientException.getStatusCode() == HttpConstants.StatusCodes.NOTFOUND) {
                    return createContainer(containerProperties, options);
                }
            }
            return Mono.error(unwrappedException);
        }).doOnSubscribe(ignoredValue -> {
            if (isTracingEnabled) {
                reactor.util.context.Context reactorContext = FluxUtil.toReactorContext(context);
                Objects.requireNonNull(reactorContext.hasKey(TracerProvider.MASTER_CALL));
                Optional<Object> callerFunc = reactorContext.getOrEmpty(TracerProvider.NESTED_CALL);
                if (!callerFunc.isPresent()) {
                    parentContext.set(client.getTracerProvider().startSpan(spanName,
                        context.addData(TracerProvider.ATTRIBUTE_MAP, tracingAttributes), ProcessKind.DATABASE));
                }
            }
        }).doOnSuccess(response -> {
            if (isTracingEnabled) {
                client.getTracerProvider().endSpan(parentContext.get(), Signal.complete(), response.getStatusCode());
            }
        }).doOnError(throwable -> {
            if (isTracingEnabled) {
                client.getTracerProvider().endSpan(parentContext.get(), Signal.error(throwable), 0);
            }
        });
    }

    private Mono<CosmosAsyncContainerResponse> createContainer(
        CosmosContainerProperties containerProperties,
        CosmosContainerRequestOptions options,
        Context context) {
        final boolean isTracingEnabled = client.getTracerProvider().isEnabled();
        final AtomicReference<Context> parentContext = isTracingEnabled
            ? new AtomicReference<>(Context.NONE)
            : null;
        String spanName = "createContainer." + containerProperties.getId();
        Map<String, String> tracingAttributes = new HashMap<String, String>() {{
            put(TracerProvider.DB_TYPE, TracerProvider.DB_TYPE_VALUE);
            put(TracerProvider.DB_INSTANCE, getId());
            put(TracerProvider.DB_URL, client.getServiceEndpoint());
            put(TracerProvider.DB_STATEMENT, spanName);
        }};

        return getDocClientWrapper()
            .createCollection(this.getLink(), ModelBridgeInternal.getV2Collection(containerProperties),
                ModelBridgeInternal.toRequestOptions(options))
            .doOnSubscribe(ignoredValue -> {
                if (isTracingEnabled) {
                    reactor.util.context.Context reactorContext = FluxUtil.toReactorContext(context);
                    Objects.requireNonNull(reactorContext.hasKey(TracerProvider.MASTER_CALL));
                    Optional<Object> callerFunc = reactorContext.getOrEmpty(TracerProvider.NESTED_CALL);
                    if (!callerFunc.isPresent()) {
                        parentContext.set(client.getTracerProvider().startSpan(spanName,
                            context.addData(TracerProvider.ATTRIBUTE_MAP, tracingAttributes), ProcessKind.DATABASE));
                    }
                }
            }).map(response -> ModelBridgeInternal.createCosmosAsyncContainerResponse(response, this)).single()
            .doOnSuccess(response -> {
                if (isTracingEnabled) {
                    client.getTracerProvider().endSpan(parentContext.get(), Signal.complete(),
                        response.getStatusCode());
                }
            }).doOnError(throwable -> {
                if (isTracingEnabled) {
                    client.getTracerProvider().endSpan(parentContext.get(), Signal.error(throwable), 0);
                }
            });
    }

    private Mono<CosmosAsyncDatabaseResponse> read(CosmosDatabaseRequestOptions options, Context context) {
        final boolean isTracingEnabled = client.getTracerProvider().isEnabled();
        final AtomicReference<Context> parentContext = isTracingEnabled
            ? new AtomicReference<>(Context.NONE)
            : null;
        String spanName = "readDatabase." + this.getId();
        Map<String, String> tracingAttributes = new HashMap<String, String>() {{
            put(TracerProvider.DB_TYPE, TracerProvider.DB_TYPE_VALUE);
            put(TracerProvider.DB_INSTANCE, getId());
            put(TracerProvider.DB_URL, client.getServiceEndpoint());
            put(TracerProvider.DB_STATEMENT, spanName);
        }};

        return getDocClientWrapper().readDatabase(getLink(), ModelBridgeInternal.toRequestOptions(options)).doOnSubscribe(ignoredValue -> {
            if (isTracingEnabled) {
                reactor.util.context.Context reactorContext = FluxUtil.toReactorContext(context);
                Objects.requireNonNull(reactorContext.hasKey(TracerProvider.MASTER_CALL));
                Optional<Object> callerFunc = reactorContext.getOrEmpty(TracerProvider.NESTED_CALL);
                if (!callerFunc.isPresent()) {
                    parentContext.set(client.getTracerProvider().startSpan(spanName,
                        context.addData(TracerProvider.ATTRIBUTE_MAP, tracingAttributes), ProcessKind.DATABASE));
                }
            }
        }).doOnSuccess(response -> {
            if (isTracingEnabled) {
                client.getTracerProvider().endSpan(parentContext.get(), Signal.complete(), response.getStatusCode());
            }
        }).doOnError(throwable -> {
            if (isTracingEnabled) {
                client.getTracerProvider().endSpan(parentContext.get(), Signal.error(throwable), 0);
            }
        }).map(response -> ModelBridgeInternal.createCosmosAsyncDatabaseResponse(response, getClient())).single();
    }

    private Mono<CosmosAsyncDatabaseResponse> delete(CosmosDatabaseRequestOptions options, Context context) {
        final boolean isTracingEnabled = client.getTracerProvider().isEnabled();
        final AtomicReference<Context> parentContext = isTracingEnabled
            ? new AtomicReference<>(Context.NONE)
            : null;
        String spanName = "deleteDatabase." + this.getId();
        Map<String, String> tracingAttributes = new HashMap<String, String>() {{
            put(TracerProvider.DB_TYPE, TracerProvider.DB_TYPE_VALUE);
            put(TracerProvider.DB_INSTANCE, getId());
            put(TracerProvider.DB_URL, client.getServiceEndpoint());
            put(TracerProvider.DB_STATEMENT, spanName);
        }};

        return getDocClientWrapper().deleteDatabase(getLink(), ModelBridgeInternal.toRequestOptions(options)).doOnSubscribe(ignoredValue -> {
            if (isTracingEnabled) {
                reactor.util.context.Context reactorContext = FluxUtil.toReactorContext(context);
                Objects.requireNonNull(reactorContext.hasKey(TracerProvider.MASTER_CALL));
                Optional<Object> callerFunc = reactorContext.getOrEmpty(TracerProvider.NESTED_CALL);
                if (!callerFunc.isPresent()) {
                    parentContext.set(client.getTracerProvider().startSpan(spanName,
                        context.addData(TracerProvider.ATTRIBUTE_MAP, tracingAttributes), ProcessKind.DATABASE));
                }
            }
        }).map(response -> ModelBridgeInternal.createCosmosAsyncDatabaseResponse(response, getClient())).single()
            .doOnSuccess(response -> {
                if (isTracingEnabled) {
                    client.getTracerProvider().endSpan(parentContext.get(), Signal.complete(),
                        response.getStatusCode());
                }
            }).doOnError(throwable -> {
                if (isTracingEnabled) {
                    client.getTracerProvider().endSpan(parentContext.get(), Signal.error(throwable), 0);
                }
            });
    }

    private Mono<Integer> replaceProvisionedThroughput(int requestUnitsPerSecond, Context context) {
        final boolean isTracingEnabled = this.client.getTracerProvider().isEnabled();
        final AtomicReference<Context> parentContext = isTracingEnabled
            ? new AtomicReference<>(Context.NONE)
            : null;
        String spanName = "replaceOffer." + this.getId();
        Map<String, String> tracingAttributes = new HashMap<String, String>() {{
            put(TracerProvider.DB_TYPE, TracerProvider.DB_TYPE_VALUE);
            put(TracerProvider.DB_INSTANCE, getId());
            put(TracerProvider.DB_URL, client.getServiceEndpoint());
            put(TracerProvider.DB_STATEMENT, spanName);
        }};

        return this.read()
            .flatMap(cosmosDatabaseResponse -> this.getDocClientWrapper()
                .queryOffers("select * from c where c.offerResourceId = '"
                    + cosmosDatabaseResponse.getProperties()
                    .getResourceId()
                    + "'", new FeedOptions())
                .single()
                .flatMap(offerFeedResponse -> {
                    if (offerFeedResponse.getResults().isEmpty()) {
                        return Mono.error(BridgeInternal
                            .createCosmosClientException(
                                HttpConstants.StatusCodes.BADREQUEST,
                                "No offers found for the resource"));
                    }
                    Offer offer = offerFeedResponse.getResults().get(0);
                    offer.setThroughput(requestUnitsPerSecond);
                    return this.getDocClientWrapper().replaceOffer(offer)
                        .single();
                }).map(offerResourceResponse -> offerResourceResponse
                    .getResource()
                    .getThroughput()))
            .doOnSubscribe(ignoredValue -> {
                if (isTracingEnabled) {
                    reactor.util.context.Context reactorContext = FluxUtil.toReactorContext(context);
                    Objects.requireNonNull(reactorContext.hasKey(TracerProvider.MASTER_CALL));
                    Optional<Object> callerFunc = reactorContext.getOrEmpty(TracerProvider.NESTED_CALL);
                    if (!callerFunc.isPresent()) {
                        parentContext.set(this.client.getTracerProvider().startSpan(spanName,
                            context.addData(TracerProvider.ATTRIBUTE_MAP, tracingAttributes), ProcessKind.DATABASE));
                    }
                }
            }).doOnSuccess(response -> {
                if (isTracingEnabled) {
                    this.client.getTracerProvider().endSpan(parentContext.get(), Signal.complete(),
                        200);
                }
            }).doOnError(throwable -> {
                if (isTracingEnabled) {
                    this.client.getTracerProvider().endSpan(parentContext.get(), Signal.error(throwable), 0);
                }
            });
    }

    private Mono<Integer> readProvisionedThroughput(Context context) {
        final boolean isTracingEnabled = this.client.getTracerProvider().isEnabled();
        final AtomicReference<Context> parentContext = isTracingEnabled
            ? new AtomicReference<>(Context.NONE)
            : null;
        String spanName = "readProvisionedThroughput." + this.getId();
        Map<String, String> tracingAttributes = new HashMap<String, String>() {{
            put(TracerProvider.DB_TYPE, TracerProvider.DB_TYPE_VALUE);
            put(TracerProvider.DB_INSTANCE, getId());
            put(TracerProvider.DB_URL, client.getServiceEndpoint());
            put(TracerProvider.DB_STATEMENT, spanName);
        }};

        return this.read()
            .flatMap(cosmosDatabaseResponse -> getDocClientWrapper()
                .queryOffers("select * from c where c.offerResourceId = '"
                        + cosmosDatabaseResponse
                        .getProperties()
                        .getResourceId() + "'",
                    new FeedOptions())
                .single()
                .flatMap(offerFeedResponse -> {
                    if (offerFeedResponse.getResults().isEmpty()) {
                        return Mono.error(BridgeInternal
                            .createCosmosClientException(
                                HttpConstants.StatusCodes.BADREQUEST,
                                "No offers found for the resource"));
                    }
                    return getDocClientWrapper()
                        .readOffer(offerFeedResponse.getResults()
                            .get(0)
                            .getSelfLink())
                        .single();
                }).map(cosmosContainerResponse1 -> cosmosContainerResponse1
                    .getResource()
                    .getThroughput())).doOnSubscribe(ignoredValue -> {
                if (isTracingEnabled) {
                    reactor.util.context.Context reactorContext = FluxUtil.toReactorContext(context);
                    Objects.requireNonNull(reactorContext.hasKey(TracerProvider.MASTER_CALL));
                    Optional<Object> callerFunc = reactorContext.getOrEmpty(TracerProvider.NESTED_CALL);
                    if (!callerFunc.isPresent()) {
                        parentContext.set(this.client.getTracerProvider().startSpan(spanName,
                            context.addData(TracerProvider.ATTRIBUTE_MAP, tracingAttributes),
                            ProcessKind.DATABASE));
                    }
                }
            }).doOnSuccess(response -> {
                if (isTracingEnabled) {
                    this.client.getTracerProvider().endSpan(parentContext.get(), Signal.complete(),
                        200);
                }
            }).doOnError(throwable -> {
                if (isTracingEnabled) {
                    this.client.getTracerProvider().endSpan(parentContext.get(), Signal.error(throwable), 0);
                }
            });
    }
}
