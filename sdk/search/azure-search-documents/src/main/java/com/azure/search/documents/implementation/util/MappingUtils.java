// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.implementation.util;

import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.search.documents.implementation.converters.AnalyzedTokenInfoConverter;
import com.azure.search.documents.implementation.converters.AutocompleteResultConverter;
import com.azure.search.documents.implementation.converters.GetIndexStatisticsResultConverter;
import com.azure.search.documents.implementation.converters.IndexDocumentsResultConverter;
import com.azure.search.documents.implementation.converters.SearchIndexConverter;
import com.azure.search.documents.implementation.converters.SearchIndexerConverter;
import com.azure.search.documents.implementation.converters.SearchIndexerDataSourceConverter;
import com.azure.search.documents.implementation.converters.SearchIndexerSkillsetConverter;
import com.azure.search.documents.implementation.converters.SearchIndexerStatusConverter;
import com.azure.search.documents.implementation.converters.ServiceStatisticsConverter;
import com.azure.search.documents.implementation.converters.SynonymMapConverter;
import com.azure.search.documents.indexes.implementation.models.AnalyzeResult;
import com.azure.search.documents.implementation.models.AutocompleteResult;
import com.azure.search.documents.implementation.models.IndexDocumentsResult;
import com.azure.search.documents.indexes.implementation.models.ListDataSourcesResult;
import com.azure.search.documents.indexes.implementation.models.ListIndexersResult;
import com.azure.search.documents.indexes.implementation.models.ListIndexesResult;
import com.azure.search.documents.indexes.implementation.models.ListSkillsetsResult;
import com.azure.search.documents.indexes.implementation.models.ListSynonymMapsResult;
import com.azure.search.documents.indexes.implementation.models.SearchErrorException;
import com.azure.search.documents.indexes.models.AnalyzedTokenInfo;
import com.azure.search.documents.indexes.models.GetIndexStatisticsResult;
import com.azure.search.documents.indexes.models.SearchIndex;
import com.azure.search.documents.indexes.models.SearchIndexer;
import com.azure.search.documents.indexes.models.SearchIndexerDataSourceConnection;
import com.azure.search.documents.indexes.models.SearchIndexerSkillset;
import com.azure.search.documents.indexes.models.SearchIndexerStatus;
import com.azure.search.documents.indexes.models.ServiceStatistics;
import com.azure.search.documents.indexes.models.SynonymMap;
import com.azure.search.documents.util.AutocompletePagedResponse;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class MappingUtils {

    public static Response<SearchIndexerDataSourceConnection> mappingExternalDataSource(
        Response<com.azure.search.documents.indexes.implementation.models.SearchIndexerDataSource> dataSourceResponse) {
        return new SimpleResponse<>(dataSourceResponse,
            SearchIndexerDataSourceConverter.map(dataSourceResponse.getValue()));
    }

    public static PagedResponse<SearchIndexerDataSourceConnection> mappingPagingDataSource(
        Response<ListDataSourcesResult> dataSourceResponse) {
        List<SearchIndexerDataSourceConnection> dataSourceMaps = dataSourceResponse.getValue().getDataSources().stream()
            .map(SearchIndexerDataSourceConverter::map).collect(toList());
        return new PagedResponseBase<HttpHeaders, SearchIndexerDataSourceConnection>(
            dataSourceResponse.getRequest(), dataSourceResponse.getStatusCode(), dataSourceResponse.getHeaders(),
            dataSourceMaps, null, null);
    }

    public static PagedResponse<String> mappingPagingDataSourceNames(
        Response<ListDataSourcesResult> dataSourceResponse) {
        List<String> dataSourceNames = dataSourceResponse.getValue().getDataSources().stream()
            .map(SearchIndexerDataSourceConverter::map)
            .map(SearchIndexerDataSourceConnection::getName).collect(toList());
        return new PagedResponseBase<HttpHeaders, String>(
            dataSourceResponse.getRequest(), dataSourceResponse.getStatusCode(), dataSourceResponse.getHeaders(),
            dataSourceNames, null, null);
    }

    public static PagedResponse<SearchIndex> mappingPagingSearchIndex(
        Response<ListIndexesResult> searchIndexResponse) {
        List<SearchIndex> searchIndices = searchIndexResponse.getValue().getIndexes().stream()
            .map(SearchIndexConverter::map).collect(toList());
        return new PagedResponseBase<HttpHeaders, SearchIndex>(
            searchIndexResponse.getRequest(), searchIndexResponse.getStatusCode(), searchIndexResponse.getHeaders(),
            searchIndices, null, null);
    }

    public static PagedResponse<String> mappingPagingSearchIndexNames(Response<ListIndexesResult>
        searchIndexResponse) {
        List<String> searchIndexNames = searchIndexResponse.getValue().getIndexes().stream()
            .map(SearchIndexConverter::map).map(SearchIndex::getName).collect(toList());
        return new PagedResponseBase<HttpHeaders, String>(
            searchIndexResponse.getRequest(), searchIndexResponse.getStatusCode(), searchIndexResponse.getHeaders(),
            searchIndexNames, null, null);
    }

    public static Response<SearchIndex> mappingExternalSearchIndex(
        Response<com.azure.search.documents.indexes.implementation.models.SearchIndex> indexResponse) {
        return new SimpleResponse<>(indexResponse, SearchIndexConverter.map(indexResponse.getValue()));
    }

    public static PagedResponse<SearchIndexer> mappingPagingSearchIndexer(
        Response<ListIndexersResult> searchIndexerResponse) {
        List<SearchIndexer> searchIndexers = searchIndexerResponse.getValue().getIndexers().stream()
            .map(SearchIndexerConverter::map).collect(toList());
        return new PagedResponseBase<HttpHeaders, SearchIndexer>(
            searchIndexerResponse.getRequest(), searchIndexerResponse.getStatusCode(),
            searchIndexerResponse.getHeaders(), searchIndexers, null, null);
    }

    public static PagedResponse<String> mappingPagingSearchIndexerNames(
        Response<ListIndexersResult> searchIndexerResponse) {
        List<String> searchIndexerNames = searchIndexerResponse.getValue().getIndexers().stream()
            .map(SearchIndexerConverter::map).map(SearchIndexer::getName).collect(toList());
        return new PagedResponseBase<HttpHeaders, String>(
            searchIndexerResponse.getRequest(), searchIndexerResponse.getStatusCode(),
            searchIndexerResponse.getHeaders(), searchIndexerNames, null, null);
    }

    public static Response<SearchIndexer> mappingExternalSearchIndexer(
        Response<com.azure.search.documents.indexes.implementation.models.SearchIndexer> indexerResponse) {
        return new SimpleResponse<>(indexerResponse, SearchIndexerConverter.map(indexerResponse.getValue()));
    }

    public static Response<SearchIndexerSkillset> mappingExternalSkillset(
        Response<com.azure.search.documents.indexes.implementation.models.SearchIndexerSkillset> skillsetResponse) {
        return new SimpleResponse<>(skillsetResponse,
            SearchIndexerSkillsetConverter.map(skillsetResponse.getValue()));
    }

    public static PagedResponse<SearchIndexerSkillset> mappingPagingSkillset(
        Response<ListSkillsetsResult> skillsetResponse) {
        List<SearchIndexerSkillset> skillsets = skillsetResponse.getValue().getSkillsets().stream()
            .map(SearchIndexerSkillsetConverter::map).collect(toList());
        return new PagedResponseBase<HttpHeaders, SearchIndexerSkillset>(
            skillsetResponse.getRequest(), skillsetResponse.getStatusCode(), skillsetResponse.getHeaders(),
            skillsets, null, null);
    }

    public static PagedResponse<String> mappingPagingSkillsetNames(
        Response<ListSkillsetsResult> skillsetResponse) {
        List<String> skillsetNames = skillsetResponse.getValue().getSkillsets().stream()
            .map(SearchIndexerSkillsetConverter::map).map(SearchIndexerSkillset::getName).collect(toList());
        return new PagedResponseBase<HttpHeaders, String>(
            skillsetResponse.getRequest(), skillsetResponse.getStatusCode(), skillsetResponse.getHeaders(),
            skillsetNames, null, null);
    }

    public static Response<SynonymMap> mappingExternalSynonymMap(
        Response<com.azure.search.documents.indexes.implementation.models.SynonymMap> synonymMapResponse) {
        return new SimpleResponse<>(synonymMapResponse, SynonymMapConverter.map(synonymMapResponse.getValue()));
    }

    public static PagedResponse<SynonymMap> mappingPagingSynonymMap(
        Response<ListSynonymMapsResult> synonymMapResponse) {
        List<SynonymMap> synonymMaps = synonymMapResponse.getValue().getSynonymMaps().stream()
            .map(SynonymMapConverter::map).collect(toList());
        return new PagedResponseBase<HttpHeaders, SynonymMap>(
            synonymMapResponse.getRequest(), synonymMapResponse.getStatusCode(), synonymMapResponse.getHeaders(),
            synonymMaps, null, null);
    }

    public static PagedResponse<String> mappingPagingSynonymMapNames(
        Response<ListSynonymMapsResult> synonymMapsResponse) {
        List<String> synonymMapNames = synonymMapsResponse.getValue().getSynonymMaps().stream()
            .map(SynonymMapConverter::map).map(SynonymMap::getName).collect(toList());
        return new PagedResponseBase<HttpHeaders, String>(
            synonymMapsResponse.getRequest(), synonymMapsResponse.getStatusCode(), synonymMapsResponse.getHeaders(),
            synonymMapNames, null, null);
    }

    public static Response<ServiceStatistics> mappingExternalServiceStatistics(
        Response<com.azure.search.documents.indexes.implementation.models.ServiceStatistics> statisticsResponse) {
        return new SimpleResponse<>(statisticsResponse,
            ServiceStatisticsConverter.map(statisticsResponse.getValue()));
    }

    public static PagedResponse<AnalyzedTokenInfo> mappingTokenInfo(
        Response<AnalyzeResult> resultResponse) {
        List<AnalyzedTokenInfo> tokenInfos = resultResponse.getValue().getTokens().stream()
            .map(AnalyzedTokenInfoConverter::map).collect(toList());
        return new PagedResponseBase<HttpHeaders, AnalyzedTokenInfo>(
            resultResponse.getRequest(),
            resultResponse.getStatusCode(),
            resultResponse.getHeaders(), tokenInfos,
            null,
            null
        );
    }

    public static Response<SearchIndexerStatus> mappingIndexerStatus(
        Response<com.azure.search.documents.indexes.implementation.models.SearchIndexerStatus> indexerStatusResponse) {
        return new SimpleResponse<>(indexerStatusResponse, SearchIndexerStatusConverter.map(
            indexerStatusResponse.getValue()));
    }

    public static Response<GetIndexStatisticsResult> mappingGetIndexStatistics(
        Response<com.azure.search.documents.indexes.implementation.models.GetIndexStatisticsResult>
            indexStatisticsResponse) {
        return new SimpleResponse<>(indexStatisticsResponse.getRequest(), indexStatisticsResponse.getStatusCode(),
            indexStatisticsResponse.getHeaders(),
            GetIndexStatisticsResultConverter.map(indexStatisticsResponse.getValue()));
    }

    public static AutocompletePagedResponse mappingAutocompleteResponse(
        Response<AutocompleteResult> autocompleteResultResponse) {
        return new AutocompletePagedResponse(new SimpleResponse<>(autocompleteResultResponse,
            AutocompleteResultConverter.map(autocompleteResultResponse.getValue())));
    }

    public static Response<com.azure.search.documents.models.IndexDocumentsResult> mappingIndexDocumentResultResponse(
        Response<IndexDocumentsResult> indexDocumentResponse) {
        return new SimpleResponse<>(indexDocumentResponse,
            IndexDocumentsResultConverter.map(indexDocumentResponse.getValue()));
    }

    public static Throwable exceptionMapper(Throwable throwable) {
        if (throwable instanceof SearchErrorException) {
            SearchErrorException exception = (SearchErrorException) throwable;
            return new HttpResponseException(exception.getMessage(), exception.getResponse());
        }

        if (throwable instanceof com.azure.search.documents.implementation.models.SearchErrorException) {
            com.azure.search.documents.implementation.models.SearchErrorException exception =
                (com.azure.search.documents.implementation.models.SearchErrorException) throwable;
            return new HttpResponseException(exception.getMessage(), exception.getResponse());
        }

        return throwable;
    }
}
