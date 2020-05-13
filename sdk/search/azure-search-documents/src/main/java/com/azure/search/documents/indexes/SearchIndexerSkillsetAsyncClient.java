// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.SearchServiceVersion;
import com.azure.search.documents.indexes.implementation.SearchServiceRestClientBuilder;
import com.azure.search.documents.indexes.implementation.SkillsetsImpl;
import com.azure.search.documents.indexes.models.RequestOptions;
import com.azure.search.documents.indexes.models.SearchIndexerSkillset;
import reactor.core.publisher.Mono;

import java.util.Objects;
import java.util.function.Function;

import static com.azure.core.util.FluxUtil.monoError;
import static com.azure.core.util.FluxUtil.pagedFluxError;
import static com.azure.core.util.FluxUtil.withContext;

/**
 * Asynchronous Client to manage and query skillset, as well as manage other resources,
 * on a Cognitive Search service.
 */
public class SearchIndexerSkillsetAsyncClient {
    /**
     * The logger to be used
     */
    private final ClientLogger logger = new ClientLogger(SearchIndexerSkillsetAsyncClient.class);

    /**
     * The underlying AutoRest client used to interact with the Search service
     */
    private final SkillsetsImpl restClient;

    SearchIndexerSkillsetAsyncClient(String endpoint, SearchServiceVersion serviceVersion, HttpPipeline httpPipeline) {
        this.restClient = new SearchServiceRestClientBuilder()
            .endpoint(endpoint)
            .apiVersion(serviceVersion.getVersion())
            .pipeline(httpPipeline)
            .build().skillsets();
    }

    /**
     * Creates a new skillset in an Azure Cognitive Search service.
     *
     * @param skillset definition of the skillset containing one or more cognitive skills
     * @return the created Skillset.
     */
    public Mono<SearchIndexerSkillset> create(SearchIndexerSkillset skillset) {
        return createWithResponse(skillset, null).map(Response::getValue);
    }

    /**
     * Creates a new skillset in an Azure Cognitive Search service.
     *
     * @param skillset definition of the skillset containing one or more cognitive skills
     * @param requestOptions additional parameters for the operation. Contains the tracking ID sent with the request to
     * help with debugging
     * @return a response containing the created Skillset.
     */
    public Mono<Response<SearchIndexerSkillset>> createWithResponse(SearchIndexerSkillset skillset,
        RequestOptions requestOptions) {
        return withContext(context -> createWithResponse(skillset, requestOptions, context));
    }

    Mono<Response<SearchIndexerSkillset>> createWithResponse(SearchIndexerSkillset skillset,
        RequestOptions requestOptions,
        Context context) {
        Objects.requireNonNull(skillset, "'Skillset' cannot be null.");
        try {
            return restClient
                .createWithRestResponseAsync(skillset, requestOptions, context)
                .map(Function.identity());
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Retrieves a skillset definition.
     *
     * @param skillsetName the name of the skillset to retrieve
     * @return the Skillset.
     */
    public Mono<SearchIndexerSkillset> getSkillset(String skillsetName) {
        return getSkillsetWithResponse(skillsetName, null).map(Response::getValue);
    }

    /**
     * Retrieves a skillset definition.
     *
     * @param skillsetName the name of the skillset to retrieve
     * @param requestOptions additional parameters for the operation. Contains the tracking ID sent with the request to
     * help with debugging
     * @return a response containing the Skillset.
     */
    public Mono<Response<SearchIndexerSkillset>> getSkillsetWithResponse(String skillsetName,
        RequestOptions requestOptions) {
        return withContext(context -> getSkillsetWithResponse(skillsetName, requestOptions, context));
    }

    Mono<Response<SearchIndexerSkillset>> getSkillsetWithResponse(String skillsetName, RequestOptions requestOptions,
        Context context) {
        try {
            return this.restClient
                .getWithRestResponseAsync(skillsetName, requestOptions, context)
                .map(result -> result);
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Lists all skillsets available for an Azure Cognitive Search service.
     *
     * @return a reactive response emitting the list of skillsets.
     */
    public PagedFlux<SearchIndexerSkillset> listSkillsets() {
        return listSkillsets(null);
    }

    /**
     * Lists all skillsets available for an Azure Cognitive Search service.
     *
     * @param requestOptions additional parameters for the operation. Contains the tracking ID sent with the request to
     * help with debugging
     * @return a reactive response emitting the list of skillsets.
     */
    public PagedFlux<SearchIndexerSkillset> listSkillsets(RequestOptions requestOptions) {
        try {
            return new PagedFlux<>(() ->
                withContext(context -> listSkillsetsWithResponse(null, requestOptions, context)));
        } catch (RuntimeException ex) {
            return pagedFluxError(logger, ex);
        }
    }

    PagedFlux<SearchIndexerSkillset> listSkillsets(String select, RequestOptions requestOptions, Context context) {
        try {
            return new PagedFlux<>(() -> listSkillsetsWithResponse(select, requestOptions, context));
        } catch (RuntimeException ex) {
            return pagedFluxError(logger, ex);
        }
    }

    private Mono<PagedResponse<SearchIndexerSkillset>> listSkillsetsWithResponse(String select,
        RequestOptions requestOptions,
        Context context) {
        return this.restClient
            .listWithRestResponseAsync(select, requestOptions, context)
            .map(response -> new PagedResponseBase<>(
                response.getRequest(),
                response.getStatusCode(),
                response.getHeaders(),
                response.getValue().getSkillsets(),
                null,
                null));
    }

    /**
     * Creates a new Azure Cognitive Search skillset or updates a skillset if it already exists.
     *
     * @param skillset the definition of the skillset to create or update
     * @return the skillset that was created or updated.
     */
    public Mono<SearchIndexerSkillset> createOrUpdate(SearchIndexerSkillset skillset) {
        return createOrUpdateWithResponse(skillset, false, null).map(Response::getValue);
    }

    /**
     * Creates a new Azure Cognitive Search skillset or updates a skillset if it already exists.
     *
     * @param skillset the definition of the skillset to create or update
     * @param onlyIfUnchanged {@code true} to update if the {@code skillset} is the same as the current service value.
     * {@code false} to always update existing value.
     * @param requestOptions additional parameters for the operation. Contains the tracking ID sent with the request to
     * help with debugging
     * @return a response containing the skillset that was created or updated.
     */
    public Mono<Response<SearchIndexerSkillset>> createOrUpdateWithResponse(SearchIndexerSkillset skillset,
        boolean onlyIfUnchanged, RequestOptions requestOptions) {
        return withContext(context ->
            createOrUpdateWithResponse(skillset, onlyIfUnchanged, requestOptions, context));
    }

    Mono<Response<SearchIndexerSkillset>> createOrUpdateWithResponse(SearchIndexerSkillset skillset,
        boolean onlyIfUnchanged, RequestOptions requestOptions, Context context) {
        Objects.requireNonNull(skillset, "'Skillset' cannot be null.");
        String ifMatch = onlyIfUnchanged ? skillset.getETag() : null;
        try {
            return restClient
                .createOrUpdateWithRestResponseAsync(skillset.getName(), skillset, ifMatch, null, requestOptions,
                    context)
                .map(Function.identity());
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Deletes a cognitive skillset in an Azure Cognitive Search service.
     *
     * @param skillsetName the name of the skillset to delete
     * @return a response signalling completion.
     */
    public Mono<Void> delete(String skillsetName) {
        return withContext(context -> deleteWithResponse(skillsetName, null, null, context)
            .flatMap(FluxUtil::toMono));
    }

    /**
     * Deletes a cognitive skillset in an Azure Cognitive Search service.
     *
     * @param skillset the {@link SearchIndexerSkillset} to delete.
     * @param onlyIfUnchanged {@code true} to delete if the {@code skillset} is the same as the current service value.
     * {@code false} to always delete existing value.
     * @param requestOptions additional parameters for the operation. Contains the tracking ID sent with the request to
     * help with debugging
     * @return a response signalling completion.
     */
    public Mono<Response<Void>> deleteWithResponse(SearchIndexerSkillset skillset, boolean onlyIfUnchanged,
        RequestOptions requestOptions) {
        Objects.requireNonNull(skillset, "'Skillset' cannot be null.");
        String etag = onlyIfUnchanged ? skillset.getETag() : null;
        return withContext(context ->
            deleteWithResponse(skillset.getName(), etag, requestOptions, context));
    }

    Mono<Response<Void>> deleteWithResponse(String skillsetName, String etag, RequestOptions requestOptions,
        Context context) {
        try {
            return restClient
                .deleteWithRestResponseAsync(skillsetName, etag, null, requestOptions, context)
                .map(Function.identity());
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * List all SearchIndexerSkillset names from an Azure Cognitive Search service.
     *
     * @return a list of SearchIndexerSkillset names.
     */
    public PagedFlux<SearchIndexerSkillset> listSkillsetNames() {
        return listSkillsetNames(null);
    }

    /**
     * List all SearchIndexerSkillset names from an Azure Cognitive Search service.
     *
     * @param requestOptions Additional parameters for the operation. Contains the tracking ID sent with the request to
     * help with debugging.
     * @return a list of SearchIndexerSkillset names
     */
    public PagedFlux<SearchIndexerSkillset> listSkillsetNames(RequestOptions requestOptions) {
        try {
            return new PagedFlux<>(() ->
                withContext(context -> this.listSkillsetsWithResponse("name", requestOptions, context)));
        } catch (RuntimeException ex) {
            return pagedFluxError(logger, ex);
        }
    }

    PagedFlux<SearchIndexerSkillset> listSkillsetNames(RequestOptions requestOptions,
        Context context) {
        try {
            return new PagedFlux<>(() -> this.listSkillsetsWithResponse("name", requestOptions, context));
        } catch (RuntimeException ex) {
            return pagedFluxError(logger, ex);
        }
    }

}
