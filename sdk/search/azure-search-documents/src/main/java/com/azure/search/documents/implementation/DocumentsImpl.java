// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.serializer.CollectionFormat;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.search.documents.implementation.models.SearchDocumentsResult;
import com.azure.search.documents.implementation.models.SuggestDocumentsResult;
import com.azure.search.documents.models.AutocompleteMode;
import com.azure.search.documents.models.AutocompleteOptions;
import com.azure.search.documents.models.AutocompleteRequest;
import com.azure.search.documents.models.AutocompleteResult;
import com.azure.search.documents.models.IndexBatchBase;
import com.azure.search.documents.models.IndexDocumentsResult;
import com.azure.search.documents.models.QueryType;
import com.azure.search.documents.models.RequestOptions;
import com.azure.search.documents.models.ScoringParameter;
import com.azure.search.documents.models.SearchErrorException;
import com.azure.search.documents.models.SearchMode;
import com.azure.search.documents.models.SearchOptions;
import com.azure.search.documents.models.SearchRequest;
import com.azure.search.documents.models.SuggestOptions;
import com.azure.search.documents.models.SuggestRequest;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * Documents.
 */
public final class DocumentsImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private DocumentsService service;

    /**
     * The service client containing this operation class.
     */
    private SearchIndexRestClientImpl client;

    /**
     * Initializes an instance of DocumentsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     * @param serializer the serializer to be used for service client requests.
     */
    public DocumentsImpl(SearchIndexRestClientImpl client, SerializerAdapter serializer) {
        this.service = RestProxy.create(DocumentsService.class, client.getHttpPipeline(), serializer);
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * SearchIndexRestClientDocuments to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{endpoint}/indexes('{indexName}')")
    @ServiceInterface(name = "SearchIndexRestClientDocuments")
    private interface DocumentsService {
        @Get("docs/$count")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<SimpleResponse<Long>> count(@HostParam("endpoint") String endpoint, @HostParam("indexName") String indexName, @HeaderParam("accept") String accept, @QueryParam("api-version") String apiVersion, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, Context context);

        @Get("docs")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<SimpleResponse<SearchDocumentsResult>> searchGet(@HostParam("endpoint") String endpoint, @HostParam("indexName") String indexName, @HeaderParam("accept") String accept, @QueryParam("search") String searchText, @QueryParam("api-version") String apiVersion, @QueryParam("$count") Boolean includeTotalResultCount, @QueryParam("facet") String facets, @QueryParam("$filter") String filter, @QueryParam("highlight") String highlightFields, @QueryParam("highlightPostTag") String highlightPostTag, @QueryParam("highlightPreTag") String highlightPreTag, @QueryParam("minimumCoverage") Double minimumCoverage, @QueryParam("$orderby") String orderBy, @QueryParam("queryType") QueryType queryType, @QueryParam("scoringParameter") String scoringParameters, @QueryParam("scoringProfile") String scoringProfile, @QueryParam("searchFields") String searchFields, @QueryParam("searchMode") SearchMode searchMode, @QueryParam("$select") String select, @QueryParam("$skip") Integer skip, @QueryParam("$top") Integer top, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, Context context);

        @Post("docs/search.post.search")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<SimpleResponse<SearchDocumentsResult>> searchPost(@HostParam("endpoint") String endpoint, @HostParam("indexName") String indexName, @HeaderParam("accept") String accept, @BodyParam("application/json; charset=utf-8") SearchRequest searchRequest, @QueryParam("api-version") String apiVersion, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, Context context);

        @Get("docs('{key}')")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<SimpleResponse<Map<? extends String, Object>>> get(@PathParam("key") String key, @HostParam("endpoint") String endpoint, @HostParam("indexName") String indexName, @HeaderParam("accept") String accept, @QueryParam("$select") String selectedFields, @QueryParam("api-version") String apiVersion, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, Context context);

        @Get("docs/search.suggest")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<SimpleResponse<SuggestDocumentsResult>> suggestGet(@HostParam("endpoint") String endpoint, @HostParam("indexName") String indexName, @HeaderParam("accept") String accept, @QueryParam("search") String searchText, @QueryParam("suggesterName") String suggesterName, @QueryParam("api-version") String apiVersion, @QueryParam("$filter") String filter, @QueryParam("fuzzy") Boolean useFuzzyMatching, @QueryParam("highlightPostTag") String highlightPostTag, @QueryParam("highlightPreTag") String highlightPreTag, @QueryParam("minimumCoverage") Double minimumCoverage, @QueryParam("$orderby") String orderBy, @QueryParam("searchFields") String searchFields, @QueryParam("$select") String select, @QueryParam("$top") Integer top, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, Context context);

        @Post("docs/search.post.suggest")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<SimpleResponse<SuggestDocumentsResult>> suggestPost(@HostParam("endpoint") String endpoint, @HostParam("indexName") String indexName, @HeaderParam("accept") String accept, @BodyParam("application/json; charset=utf-8") SuggestRequest suggestRequest, @QueryParam("api-version") String apiVersion, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, Context context);

        @Post("docs/search.index")
        @ExpectedResponses({200, 207})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        <T> Mono<SimpleResponse<IndexDocumentsResult>> index(@HostParam("endpoint") String endpoint, @HostParam("indexName") String indexName, @HeaderParam("accept") String accept, @BodyParam("application/json; charset=utf-8") IndexBatchBase<T> batch, @QueryParam("api-version") String apiVersion, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, Context context);

        @Get("docs/search.autocomplete")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<SimpleResponse<AutocompleteResult>> autocompleteGet(@HostParam("endpoint") String endpoint, @HostParam("indexName") String indexName, @HeaderParam("accept") String accept, @QueryParam("api-version") String apiVersion, @QueryParam("search") String searchText, @QueryParam("suggesterName") String suggesterName, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, @QueryParam("autocompleteMode") AutocompleteMode autocompleteMode, @QueryParam("$filter") String filter, @QueryParam("fuzzy") Boolean useFuzzyMatching, @QueryParam("highlightPostTag") String highlightPostTag, @QueryParam("highlightPreTag") String highlightPreTag, @QueryParam("minimumCoverage") Double minimumCoverage, @QueryParam("searchFields") String searchFields, @QueryParam("$top") Integer top, Context context);

        @Post("docs/search.post.autocomplete")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(SearchErrorException.class)
        Mono<SimpleResponse<AutocompleteResult>> autocompletePost(@HostParam("endpoint") String endpoint, @HostParam("indexName") String indexName, @HeaderParam("accept") String accept, @QueryParam("api-version") String apiVersion, @BodyParam("application/json; charset=utf-8") AutocompleteRequest autocompleteRequest, @HeaderParam("x-ms-client-request-id") UUID xMsClientRequestId, Context context);
    }

    /**
     * Queries the number of documents in the index.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Long>> countWithRestResponseAsync(Context context) {
		final String accept = "application/json;odata.metadata=none";

        final UUID xMsClientRequestId = null;
        return service.count(this.client.getEndpoint(), this.client.getIndexName(), accept, this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * Queries the number of documents in the index.
     *
     * @param requestOptions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Long>> countWithRestResponseAsync(RequestOptions requestOptions, Context context) {
		final String accept = "application/json;odata.metadata=none";

        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        return service.count(this.client.getEndpoint(), this.client.getIndexName(), accept, this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * Searches for documents in the index.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SearchDocumentsResult>> searchGetWithRestResponseAsync(Context context) {
		final String accept = "application/json;odata.metadata=none";

        final String searchText = null;
        final Boolean includeTotalResultCount = null;
        final String filter = null;
        final String highlightPostTag = null;
        final String highlightPreTag = null;
        final Double minimumCoverage = null;
        final QueryType queryType = null;
        final String scoringProfile = null;
        final SearchMode searchMode = null;
        final Integer skip = null;
        final Integer top = null;
        final UUID xMsClientRequestId = null;
        String facetsConverted = null;
        String highlightFieldsConverted = null;
        String orderByConverted = null;
        String scoringParametersConverted = null;
        String searchFieldsConverted = null;
        String selectConverted = null;
        return service.searchGet(this.client.getEndpoint(), this.client.getIndexName(), accept, searchText, this.client.getApiVersion(), includeTotalResultCount, facetsConverted, filter, highlightFieldsConverted, highlightPostTag, highlightPreTag, minimumCoverage, orderByConverted, queryType, scoringParametersConverted, scoringProfile, searchFieldsConverted, searchMode, selectConverted, skip, top, xMsClientRequestId, context);
    }

    /**
     * Searches for documents in the index.
     *
     * @param searchText A full-text search query expression; Use "*" or omit this parameter to match all documents.
     * @param searchOptions Additional parameters for the operation.
     * @param requestOptions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SearchDocumentsResult>> searchGetWithRestResponseAsync(String searchText, SearchOptions searchOptions, RequestOptions requestOptions, Context context) {
		final String accept = "application/json;odata.metadata=none";

        Boolean includeTotalResultCount = null;
        if (searchOptions != null) {
            includeTotalResultCount = searchOptions.isIncludeTotalResultCount();
        }
        List<String> facets = null;
        if (searchOptions != null) {
            facets = searchOptions.getFacets();
        }
        String filter = null;
        if (searchOptions != null) {
            filter = searchOptions.getFilter();
        }
        List<String> highlightFields = null;
        if (searchOptions != null) {
            highlightFields = searchOptions.getHighlightFields();
        }
        String highlightPostTag = null;
        if (searchOptions != null) {
            highlightPostTag = searchOptions.getHighlightPostTag();
        }
        String highlightPreTag = null;
        if (searchOptions != null) {
            highlightPreTag = searchOptions.getHighlightPreTag();
        }
        Double minimumCoverage = null;
        if (searchOptions != null) {
            minimumCoverage = searchOptions.getMinimumCoverage();
        }
        List<String> orderBy = null;
        if (searchOptions != null) {
            orderBy = searchOptions.getOrderBy();
        }
        QueryType queryType = null;
        if (searchOptions != null) {
            queryType = searchOptions.getQueryType();
        }
        List<ScoringParameter> scoringParameters = null;
        if (searchOptions != null) {
            scoringParameters = searchOptions.getScoringParameters();
        }
        String scoringProfile = null;
        if (searchOptions != null) {
            scoringProfile = searchOptions.getScoringProfile();
        }
        List<String> searchFields = null;
        if (searchOptions != null) {
            searchFields = searchOptions.getSearchFields();
        }
        SearchMode searchMode = null;
        if (searchOptions != null) {
            searchMode = searchOptions.getSearchMode();
        }
        List<String> select = null;
        if (searchOptions != null) {
            select = searchOptions.getSelect();
        }
        Integer skip = null;
        if (searchOptions != null) {
            skip = searchOptions.getSkip();
        }
        Integer top = null;
        if (searchOptions != null) {
            top = searchOptions.getTop();
        }
        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        String facetsConverted = JacksonAdapter.createDefaultSerializerAdapter().serializeList(facets, CollectionFormat.MULTI);
        String highlightFieldsConverted = JacksonAdapter.createDefaultSerializerAdapter().serializeList(highlightFields, CollectionFormat.CSV);
        String orderByConverted = JacksonAdapter.createDefaultSerializerAdapter().serializeList(orderBy, CollectionFormat.CSV);
        String scoringParametersConverted = JacksonAdapter.createDefaultSerializerAdapter().serializeList(scoringParameters, CollectionFormat.MULTI);
        String searchFieldsConverted = JacksonAdapter.createDefaultSerializerAdapter().serializeList(searchFields, CollectionFormat.CSV);
        String selectConverted = JacksonAdapter.createDefaultSerializerAdapter().serializeList(select, CollectionFormat.CSV);
        return service.searchGet(this.client.getEndpoint(), this.client.getIndexName(), accept, searchText, this.client.getApiVersion(), includeTotalResultCount, facetsConverted, filter, highlightFieldsConverted, highlightPostTag, highlightPreTag, minimumCoverage, orderByConverted, queryType, scoringParametersConverted, scoringProfile, searchFieldsConverted, searchMode, selectConverted, skip, top, xMsClientRequestId, context);
    }

    /**
     * Searches for documents in the index.
     *
     * @param searchRequest The definition of the Search request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SearchDocumentsResult>> searchPostWithRestResponseAsync(SearchRequest searchRequest, Context context) {
		final String accept = "application/json;odata.metadata=none";

        final UUID xMsClientRequestId = null;
        return service.searchPost(this.client.getEndpoint(), this.client.getIndexName(), accept, searchRequest, this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * Searches for documents in the index.
     *
     * @param searchRequest The definition of the Search request.
     * @param requestOptions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SearchDocumentsResult>> searchPostWithRestResponseAsync(SearchRequest searchRequest, RequestOptions requestOptions, Context context) {
		final String accept = "application/json;odata.metadata=none";

        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        return service.searchPost(this.client.getEndpoint(), this.client.getIndexName(), accept, searchRequest, this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * Retrieves a document from the index.
     *
     * @param key The key of the document to retrieve.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Map<? extends String, Object>>> getWithRestResponseAsync(String key, Context context) {
		final String accept = "application/json;odata.metadata=none";

        final UUID xMsClientRequestId = null;
        String selectedFieldsConverted = null;
        return service.get(key, this.client.getEndpoint(), this.client.getIndexName(), accept, selectedFieldsConverted, this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * Retrieves a document from the index.
     *
     * @param key The key of the document to retrieve.
     * @param selectedFields List of field names to retrieve for the document; Any field not retrieved will be missing from the returned document.
     * @param requestOptions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Map<? extends String, Object>>> getWithRestResponseAsync(String key, List<String> selectedFields, RequestOptions requestOptions, Context context) {
		final String accept = "application/json;odata.metadata=none";

        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        String selectedFieldsConverted = JacksonAdapter.createDefaultSerializerAdapter().serializeList(selectedFields, CollectionFormat.CSV);
        return service.get(key, this.client.getEndpoint(), this.client.getIndexName(), accept, selectedFieldsConverted, this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * Suggests documents in the index that match the given partial query text.
     *
     * @param searchText The search text to use to suggest documents. Must be at least 1 character, and no more than 100 characters.
     * @param suggesterName The name of the suggester as specified in the suggesters collection that's part of the index definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SuggestDocumentsResult>> suggestGetWithRestResponseAsync(String searchText, String suggesterName, Context context) {
		final String accept = "application/json;odata.metadata=none";

        final String filter = null;
        final Boolean useFuzzyMatching = null;
        final String highlightPostTag = null;
        final String highlightPreTag = null;
        final Double minimumCoverage = null;
        final Integer top = null;
        final UUID xMsClientRequestId = null;
        String orderByConverted = null;
        String searchFieldsConverted = null;
        String selectConverted = null;
        return service.suggestGet(this.client.getEndpoint(), this.client.getIndexName(), accept, searchText, suggesterName, this.client.getApiVersion(), filter, useFuzzyMatching, highlightPostTag, highlightPreTag, minimumCoverage, orderByConverted, searchFieldsConverted, selectConverted, top, xMsClientRequestId, context);
    }

    /**
     * Suggests documents in the index that match the given partial query text.
     *
     * @param searchText The search text to use to suggest documents. Must be at least 1 character, and no more than 100 characters.
     * @param suggesterName The name of the suggester as specified in the suggesters collection that's part of the index definition.
     * @param suggestOptions Additional parameters for the operation.
     * @param requestOptions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SuggestDocumentsResult>> suggestGetWithRestResponseAsync(String searchText, String suggesterName, SuggestOptions suggestOptions, RequestOptions requestOptions, Context context) {
		final String accept = "application/json;odata.metadata=none";

        String filter = null;
        if (suggestOptions != null) {
            filter = suggestOptions.getFilter();
        }
        Boolean useFuzzyMatching = null;
        if (suggestOptions != null) {
            useFuzzyMatching = suggestOptions.useFuzzyMatching();
        }
        String highlightPostTag = null;
        if (suggestOptions != null) {
            highlightPostTag = suggestOptions.getHighlightPostTag();
        }
        String highlightPreTag = null;
        if (suggestOptions != null) {
            highlightPreTag = suggestOptions.getHighlightPreTag();
        }
        Double minimumCoverage = null;
        if (suggestOptions != null) {
            minimumCoverage = suggestOptions.getMinimumCoverage();
        }
        List<String> orderBy = null;
        if (suggestOptions != null) {
            orderBy = suggestOptions.getOrderBy();
        }
        List<String> searchFields = null;
        if (suggestOptions != null) {
            searchFields = suggestOptions.getSearchFields();
        }
        List<String> select = null;
        if (suggestOptions != null) {
            select = suggestOptions.getSelect();
        }
        Integer top = null;
        if (suggestOptions != null) {
            top = suggestOptions.getTop();
        }
        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        String orderByConverted = JacksonAdapter.createDefaultSerializerAdapter().serializeList(orderBy, CollectionFormat.CSV);
        String searchFieldsConverted = JacksonAdapter.createDefaultSerializerAdapter().serializeList(searchFields, CollectionFormat.CSV);
        String selectConverted = JacksonAdapter.createDefaultSerializerAdapter().serializeList(select, CollectionFormat.CSV);
        return service.suggestGet(this.client.getEndpoint(), this.client.getIndexName(), accept, searchText, suggesterName, this.client.getApiVersion(), filter, useFuzzyMatching, highlightPostTag, highlightPreTag, minimumCoverage, orderByConverted, searchFieldsConverted, selectConverted, top, xMsClientRequestId, context);
    }

    /**
     * Suggests documents in the index that match the given partial query text.
     *
     * @param suggestRequest The Suggest request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SuggestDocumentsResult>> suggestPostWithRestResponseAsync(SuggestRequest suggestRequest, Context context) {
		final String accept = "application/json;odata.metadata=none";

        final UUID xMsClientRequestId = null;
        return service.suggestPost(this.client.getEndpoint(), this.client.getIndexName(), accept, suggestRequest, this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * Suggests documents in the index that match the given partial query text.
     *
     * @param suggestRequest The Suggest request.
     * @param requestOptions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SuggestDocumentsResult>> suggestPostWithRestResponseAsync(SuggestRequest suggestRequest, RequestOptions requestOptions, Context context) {
		final String accept = "application/json;odata.metadata=none";

        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        return service.suggestPost(this.client.getEndpoint(), this.client.getIndexName(), accept, suggestRequest, this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * Sends a batch of document write actions to the index.
     *
     * @param batch The batch of index actions.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public <T> Mono<SimpleResponse<IndexDocumentsResult>> indexWithRestResponseAsync(IndexBatchBase<T> batch, Context context) {
		final String accept = "application/json;odata.metadata=none";

        final UUID xMsClientRequestId = null;
        return service.index(this.client.getEndpoint(), this.client.getIndexName(), accept, batch, this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * Sends a batch of document write actions to the index.
     *
     * @param batch The batch of index actions.
     * @param requestOptions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public <T> Mono<SimpleResponse<IndexDocumentsResult>> indexWithRestResponseAsync(IndexBatchBase<T> batch, RequestOptions requestOptions, Context context) {
		final String accept = "application/json;odata.metadata=none";

        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        return service.index(this.client.getEndpoint(), this.client.getIndexName(), accept, batch, this.client.getApiVersion(), xMsClientRequestId, context);
    }

    /**
     * Autocompletes incomplete query terms based on input text and matching terms in the index.
     *
     * @param searchText The incomplete term which should be auto-completed.
     * @param suggesterName The name of the suggester as specified in the suggesters collection that's part of the index definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<AutocompleteResult>> autocompleteGetWithRestResponseAsync(String searchText, String suggesterName, Context context) {
		final String accept = "application/json;odata.metadata=none";

        final UUID xMsClientRequestId = null;
        final AutocompleteMode autocompleteMode = null;
        final String filter = null;
        final Boolean useFuzzyMatching = null;
        final String highlightPostTag = null;
        final String highlightPreTag = null;
        final Double minimumCoverage = null;
        final Integer top = null;
        String searchFieldsConverted = null;
        return service.autocompleteGet(this.client.getEndpoint(), this.client.getIndexName(), accept, this.client.getApiVersion(), searchText, suggesterName, xMsClientRequestId, autocompleteMode, filter, useFuzzyMatching, highlightPostTag, highlightPreTag, minimumCoverage, searchFieldsConverted, top, context);
    }

    /**
     * Autocompletes incomplete query terms based on input text and matching terms in the index.
     *
     * @param searchText The incomplete term which should be auto-completed.
     * @param suggesterName The name of the suggester as specified in the suggesters collection that's part of the index definition.
     * @param requestOptions Additional parameters for the operation.
     * @param autocompleteOptions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<AutocompleteResult>> autocompleteGetWithRestResponseAsync(String searchText, String suggesterName, RequestOptions requestOptions, AutocompleteOptions autocompleteOptions, Context context) {
		final String accept = "application/json;odata.metadata=none";

        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        AutocompleteMode autocompleteMode = null;
        if (autocompleteOptions != null) {
            autocompleteMode = autocompleteOptions.getAutocompleteMode();
        }
        String filter = null;
        if (autocompleteOptions != null) {
            filter = autocompleteOptions.getFilter();
        }
        Boolean useFuzzyMatching = null;
        if (autocompleteOptions != null) {
            useFuzzyMatching = autocompleteOptions.useFuzzyMatching();
        }
        String highlightPostTag = null;
        if (autocompleteOptions != null) {
            highlightPostTag = autocompleteOptions.getHighlightPostTag();
        }
        String highlightPreTag = null;
        if (autocompleteOptions != null) {
            highlightPreTag = autocompleteOptions.getHighlightPreTag();
        }
        Double minimumCoverage = null;
        if (autocompleteOptions != null) {
            minimumCoverage = autocompleteOptions.getMinimumCoverage();
        }
        List<String> searchFields = null;
        if (autocompleteOptions != null) {
            searchFields = autocompleteOptions.getSearchFields();
        }
        Integer top = null;
        if (autocompleteOptions != null) {
            top = autocompleteOptions.getTop();
        }
        String searchFieldsConverted = JacksonAdapter.createDefaultSerializerAdapter().serializeList(searchFields, CollectionFormat.CSV);
        return service.autocompleteGet(this.client.getEndpoint(), this.client.getIndexName(), accept, this.client.getApiVersion(), searchText, suggesterName, xMsClientRequestId, autocompleteMode, filter, useFuzzyMatching, highlightPostTag, highlightPreTag, minimumCoverage, searchFieldsConverted, top, context);
    }

    /**
     * Autocompletes incomplete query terms based on input text and matching terms in the index.
     *
     * @param autocompleteRequest The definition of the Autocomplete request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<AutocompleteResult>> autocompletePostWithRestResponseAsync(AutocompleteRequest autocompleteRequest, Context context) {
		final String accept = "application/json;odata.metadata=none";

        final UUID xMsClientRequestId = null;
        return service.autocompletePost(this.client.getEndpoint(), this.client.getIndexName(), accept, this.client.getApiVersion(), autocompleteRequest, xMsClientRequestId, context);
    }

    /**
     * Autocompletes incomplete query terms based on input text and matching terms in the index.
     *
     * @param autocompleteRequest The definition of the Autocomplete request.
     * @param requestOptions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<AutocompleteResult>> autocompletePostWithRestResponseAsync(AutocompleteRequest autocompleteRequest, RequestOptions requestOptions, Context context) {
		final String accept = "application/json;odata.metadata=none";

        UUID xMsClientRequestId = null;
        if (requestOptions != null) {
            xMsClientRequestId = requestOptions.getXMsClientRequestId();
        }
        return service.autocompletePost(this.client.getEndpoint(), this.client.getIndexName(), accept, this.client.getApiVersion(), autocompleteRequest, xMsClientRequestId, context);
    }
}
