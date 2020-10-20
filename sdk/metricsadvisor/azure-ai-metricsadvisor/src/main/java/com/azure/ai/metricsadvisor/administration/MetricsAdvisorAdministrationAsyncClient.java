// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.metricsadvisor.administration;

import com.azure.ai.metricsadvisor.implementation.AzureCognitiveServiceMetricsAdvisorRestAPIOpenAPIV2Impl;
import com.azure.ai.metricsadvisor.implementation.util.DataFeedTransforms;
import com.azure.ai.metricsadvisor.implementation.util.DetectionConfigurationTransforms;
import com.azure.ai.metricsadvisor.implementation.models.AnomalyDetectionConfigurationList;
import com.azure.ai.metricsadvisor.implementation.models.AnomalyDetectionConfigurationPatch;
import com.azure.ai.metricsadvisor.implementation.util.HookTransforms;
import com.azure.ai.metricsadvisor.implementation.models.AnomalyAlertingConfiguration;
import com.azure.ai.metricsadvisor.implementation.models.AnomalyAlertingConfigurationList;
import com.azure.ai.metricsadvisor.implementation.models.AnomalyAlertingConfigurationPatch;
import com.azure.ai.metricsadvisor.implementation.models.DataFeedDetailPatchFillMissingPointForAd;
import com.azure.ai.metricsadvisor.implementation.models.DataFeedDetailPatchNeedRollup;
import com.azure.ai.metricsadvisor.implementation.models.DataFeedDetailPatchRollUpMethod;
import com.azure.ai.metricsadvisor.implementation.models.DataFeedDetailPatchStatus;
import com.azure.ai.metricsadvisor.implementation.models.DataFeedDetailPatchViewMode;
import com.azure.ai.metricsadvisor.implementation.models.DataFeedDetailRollUpMethod;
import com.azure.ai.metricsadvisor.implementation.models.DataSourceType;
import com.azure.ai.metricsadvisor.implementation.models.EntityStatus;
import com.azure.ai.metricsadvisor.implementation.models.FillMissingPointType;
import com.azure.ai.metricsadvisor.implementation.models.Granularity;
import com.azure.ai.metricsadvisor.implementation.models.IngestionProgressResetOptions;
import com.azure.ai.metricsadvisor.implementation.models.IngestionStatusQueryOptions;
import com.azure.ai.metricsadvisor.implementation.models.NeedRollupEnum;
import com.azure.ai.metricsadvisor.implementation.models.ViewMode;
import com.azure.ai.metricsadvisor.implementation.util.Utility;
import com.azure.ai.metricsadvisor.implementation.util.AlertConfigurationTransforms;
import com.azure.ai.metricsadvisor.models.AnomalyAlertConfiguration;
import com.azure.ai.metricsadvisor.models.DataFeed;
import com.azure.ai.metricsadvisor.models.DataFeedGranularity;
import com.azure.ai.metricsadvisor.models.DataFeedIngestionProgress;
import com.azure.ai.metricsadvisor.models.DataFeedIngestionSettings;
import com.azure.ai.metricsadvisor.models.DataFeedIngestionStatus;
import com.azure.ai.metricsadvisor.models.DataFeedMissingDataPointFillSettings;
import com.azure.ai.metricsadvisor.models.DataFeedOptions;
import com.azure.ai.metricsadvisor.models.DataFeedRollupSettings;
import com.azure.ai.metricsadvisor.models.DataFeedSchema;
import com.azure.ai.metricsadvisor.models.DataFeedSource;
import com.azure.ai.metricsadvisor.models.Hook;
import com.azure.ai.metricsadvisor.models.ListDataFeedFilter;
import com.azure.ai.metricsadvisor.models.ListDataFeedIngestionOptions;
import com.azure.ai.metricsadvisor.models.ListDataFeedOptions;
import com.azure.ai.metricsadvisor.models.ListHookOptions;
import com.azure.ai.metricsadvisor.models.AnomalyDetectionConfiguration;
import com.azure.ai.metricsadvisor.models.MetricsAdvisorServiceVersion;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.ResponseBase;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import reactor.core.publisher.Mono;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

import static com.azure.ai.metricsadvisor.implementation.util.Utility.parseOperationId;
import static com.azure.ai.metricsadvisor.models.DataFeedGranularityType.CUSTOM;
import static com.azure.core.util.FluxUtil.monoError;
import static com.azure.core.util.FluxUtil.withContext;
import static com.azure.core.util.tracing.Tracer.AZ_TRACING_NAMESPACE_KEY;

/**
 * This class provides an asynchronous client that contains all the operations that apply to Azure Metrics Advisor.
 * <p><strong>Instantiating a asynchronous Metrics Advisor Administration Client</strong></p>
 * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.instantiation}
 *
 * @see MetricsAdvisorAdministrationClientBuilder
 */
@ServiceClient(builder = MetricsAdvisorAdministrationClientBuilder.class, isAsync = true)
public class MetricsAdvisorAdministrationAsyncClient {
    private static final String METRICS_ADVISOR_TRACING_NAMESPACE_VALUE = "Microsoft.CognitiveServices";
    private final ClientLogger logger = new ClientLogger(MetricsAdvisorAdministrationAsyncClient.class);
    private final AzureCognitiveServiceMetricsAdvisorRestAPIOpenAPIV2Impl service;

    /**
     * Create a {@link MetricsAdvisorAdministrationAsyncClient} that sends requests to the Metrics Advisor
     * service's endpoint. Each service call goes through the
     * {@link MetricsAdvisorAdministrationClientBuilder#pipeline(HttpPipeline)} http pipeline}.
     *
     * @param service The proxy service used to perform REST calls.
     * @param serviceVersion The versions of Azure Metrics Advisor supported by this client library.
     */
    MetricsAdvisorAdministrationAsyncClient(AzureCognitiveServiceMetricsAdvisorRestAPIOpenAPIV2Impl service,
        MetricsAdvisorServiceVersion serviceVersion) {
        this.service = service;
    }

    /**
     * Create a new data feed.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.createDataFeed#String-DataFeedSource-DataFeedGranularity-DataFeedSchema-DataFeedIngestionSettings-DataFeedOptions}
     *
     * @param dataFeedName the name of the data feed.
     * @param dataFeedSource the source of the data feed.
     * @param dataFeedGranularity the granularity details of the data feed.
     * @param dataFeedSchema the schema detail properties of the data feed.
     * @param dataFeedIngestionSettings the data feed ingestion properties.
     * @param dataFeedOptions the additional options to configure the data feed.
     *
     * @return A {@link Mono} containing the created data feed.
     * @throws NullPointerException If {@code dataFeedName}, {@code dataFeedSource}, {@code metrics},
     * {@code granularityType} or {@code ingestionStartTime} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DataFeed> createDataFeed(String dataFeedName,
        DataFeedSource dataFeedSource,
        DataFeedGranularity dataFeedGranularity,
        DataFeedSchema dataFeedSchema,
        DataFeedIngestionSettings dataFeedIngestionSettings,
        DataFeedOptions dataFeedOptions) {
        return createDataFeedWithResponse(dataFeedName, dataFeedSource, dataFeedGranularity, dataFeedSchema,
            dataFeedIngestionSettings, dataFeedOptions).flatMap(FluxUtil::toMono);
    }

    /**
     * Create a new data feed with REST response.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.createDataFeedWithResponse#String-DataFeedSource-DataFeedGranularity-DataFeedSchema-DataFeedIngestionSettings-DataFeedOptions}
     *
     * @param dataFeedName the name of the data feed.
     * @param dataFeedSource the source of the data feed.
     * @param dataFeedGranularity the granularity details of the data feed.
     * @param dataFeedSchema the schema detail properties of the data feed.
     * @param dataFeedIngestionSettings the data feed ingestion properties.
     * @param dataFeedOptions the additional options to configure the data feed.
     *
     * @return A {@link Response} of a {@link Mono} containing the created {@link DataFeed data feed}.
     * @throws NullPointerException If {@code dataFeedName}, {@code dataFeedSource}, {@code metrics},
     * {@code granularityType} or {@code ingestionStartTime} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DataFeed>> createDataFeedWithResponse(String dataFeedName,
        DataFeedSource dataFeedSource,
        DataFeedGranularity dataFeedGranularity,
        DataFeedSchema dataFeedSchema,
        DataFeedIngestionSettings dataFeedIngestionSettings,
        DataFeedOptions dataFeedOptions) {
        try {
            return withContext(context -> createDataFeedWithResponse(dataFeedName, dataFeedSource,
                dataFeedGranularity, dataFeedSchema,
                dataFeedIngestionSettings, dataFeedOptions, context));
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    Mono<Response<DataFeed>> createDataFeedWithResponse(String dataFeedName,
        DataFeedSource dataFeedSource,
        DataFeedGranularity dataFeedGranularity,
        DataFeedSchema dataFeedSchema,
        DataFeedIngestionSettings dataFeedIngestionSettings,
        DataFeedOptions dataFeedOptions, Context context) {
        Objects.requireNonNull(dataFeedSource, "'dataFeedSource' cannot be null or empty.");
        Objects.requireNonNull(dataFeedName, "'dataFeedName' cannot be null or empty.");

        if (dataFeedSchema == null) {
            throw logger.logExceptionAsError(
                new NullPointerException("'dataFeedSchema.metrics' cannot be null or empty."));
        } else {
            Objects.requireNonNull(dataFeedSchema.getMetrics(),
                "'dataFeedSchema.metrics' cannot be null or empty.");
        }

        if (dataFeedGranularity == null) {
            throw logger.logExceptionAsError(
                new NullPointerException("'dataFeedGranularity.granularityType' cannot be null or empty."));

        } else {
            Objects.requireNonNull(dataFeedGranularity.getGranularityType(),
                "'dataFeedGranularity.granularityType' is required.");
            if (CUSTOM.equals(dataFeedGranularity.getGranularityType())) {
                Objects.requireNonNull(dataFeedGranularity.getCustomGranularityValue(),
                    "'dataFeedGranularity.customGranularityValue' is required when granularity type is CUSTOM");
            }
        }

        if (dataFeedIngestionSettings == null) {
            throw logger.logExceptionAsError(
                new NullPointerException("'dataFeedIngestionSettings.ingestionStartTime' cannot be null or empty."));
        } else {
            Objects.requireNonNull(dataFeedIngestionSettings.getIngestionStartTime(),
                "'dataFeedIngestionSettings.ingestionStartTime' cannot be null or empty.");
        }

        final DataFeedOptions finalDataFeedOptions = dataFeedOptions == null ? new DataFeedOptions() : dataFeedOptions;
        final DataFeedRollupSettings dataFeedRollupSettings = finalDataFeedOptions.getRollupSettings() == null
            ? new DataFeedRollupSettings() : finalDataFeedOptions.getRollupSettings();
        final DataFeedMissingDataPointFillSettings dataFeedMissingDataPointFillSettings =
            finalDataFeedOptions.getMissingDataPointFillSettings() == null
                ? new DataFeedMissingDataPointFillSettings() : finalDataFeedOptions.getMissingDataPointFillSettings();
        final Context withTracing = context.addData(AZ_TRACING_NAMESPACE_KEY, METRICS_ADVISOR_TRACING_NAMESPACE_VALUE);

        return service.createDataFeedWithResponseAsync(DataFeedTransforms.toDataFeedDetailSource(dataFeedSource)
            .setDataFeedName(dataFeedName)
            .setDataFeedDescription(finalDataFeedOptions.getDescription())
            .setGranularityName(Granularity.fromString(dataFeedGranularity.getGranularityType() == null
                ? null : dataFeedGranularity.getGranularityType().toString()))
            .setGranularityAmount(dataFeedGranularity.getCustomGranularityValue())
            .setDimension(dataFeedSchema.getDimensions())
            .setMetrics(dataFeedSchema.getMetrics())
            .setTimestampColumn(dataFeedSchema.getTimestampColumn())
            .setDataStartFrom(dataFeedIngestionSettings.getIngestionStartTime())
            .setStartOffsetInSeconds(dataFeedIngestionSettings.getIngestionStartOffset() == null
                ? null : dataFeedIngestionSettings.getIngestionStartOffset().getSeconds())
            .setMaxConcurrency(dataFeedIngestionSettings.getDataSourceRequestConcurrency())
            .setStopRetryAfterInSeconds(dataFeedIngestionSettings.getStopRetryAfter() == null
                ? null : dataFeedIngestionSettings.getStopRetryAfter().getSeconds())
            .setMinRetryIntervalInSeconds(dataFeedIngestionSettings.getIngestionRetryDelay() == null
                ? null : dataFeedIngestionSettings.getIngestionRetryDelay().getSeconds())
            .setRollUpColumns(dataFeedRollupSettings.getAutoRollupGroupByColumnNames())
            .setRollUpMethod(DataFeedDetailRollUpMethod.fromString(dataFeedRollupSettings
                .getDataFeedAutoRollUpMethod() == null
                ? null : dataFeedRollupSettings.getDataFeedAutoRollUpMethod().toString()))
            .setNeedRollup(NeedRollupEnum.fromString(dataFeedRollupSettings.getRollupType() == null
                ? null : dataFeedRollupSettings.getRollupType().toString()))
            .setAllUpIdentification(dataFeedRollupSettings.getRollupIdentificationValue())
            .setFillMissingPointType(FillMissingPointType.fromString(
                dataFeedMissingDataPointFillSettings.getFillType() == null
                    ? null : dataFeedMissingDataPointFillSettings.getFillType().toString()))
            .setFillMissingPointValue(dataFeedMissingDataPointFillSettings.getCustomFillValue())
            .setViewMode(ViewMode.fromString(finalDataFeedOptions.getAccessMode() == null
                ? null : finalDataFeedOptions.getAccessMode().toString()))
            .setViewers(finalDataFeedOptions.getViewerEmails())
            .setAdmins(finalDataFeedOptions.getAdminEmails())
            .setActionLinkTemplate(finalDataFeedOptions.getActionLinkTemplate()), withTracing)
            .flatMap(createDataFeedResponse -> {
                final String dataFeedId =
                    parseOperationId(createDataFeedResponse.getDeserializedHeaders().getLocation());
                return getDataFeedWithResponse(dataFeedId);
            });
    }

    /**
     * Get a data feed by its id.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.getDataFeed#String}
     *
     * @param dataFeedId The data feed unique id.
     *
     * @return The data feed for the provided id.
     * @throws IllegalArgumentException If {@code dataFeedId} does not conform to the UUID format specification.
     * @throws NullPointerException thrown if the {@code dataFeedId} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DataFeed> getDataFeed(String dataFeedId) {
        return getDataFeedWithResponse(dataFeedId).flatMap(FluxUtil::toMono);
    }

    /**
     * Get a data feed by its id with REST response.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.getDataFeedWithResponse#String}
     *
     * @param dataFeedId The data feed unique id.
     *
     * @return The data feed for the provided id.
     * @throws IllegalArgumentException If {@code dataFeedId} does not conform to the UUID format specification.
     * @throws NullPointerException thrown if the {@code dataFeedId} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DataFeed>> getDataFeedWithResponse(String dataFeedId) {
        try {
            return withContext(context -> getDataFeedWithResponse(dataFeedId, context));
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    Mono<Response<DataFeed>> getDataFeedWithResponse(String dataFeedId, Context context) {
        Objects.requireNonNull(dataFeedId, "'dataFeedId' cannot be null.");

        return service.getDataFeedByIdWithResponseAsync(UUID.fromString(dataFeedId), context)
            .map(response -> new SimpleResponse<>(response, DataFeedTransforms.fromInner(response.getValue())));
    }

    /**
     * Update an existing data feed.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.updateDataFeed#DataFeed}
     *
     * @param dataFeed the data feed that needs to be updated.
     *
     * @return the updated data feed.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DataFeed> updateDataFeed(DataFeed dataFeed) {
        return updateDataFeedWithResponse(dataFeed).flatMap(FluxUtil::toMono);
    }

    /**
     * Update an existing data feed with REST response.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.updateDataFeedWithResponse#DataFeed}
     *
     * @param dataFeed the data feed that needs to be updated.
     *
     * @return the {@link Response} of a {@link Mono} containing the updated {@link DataFeed data feed}.
     **/
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DataFeed>> updateDataFeedWithResponse(DataFeed dataFeed) {
        try {
            return withContext(context -> updateDataFeedWithResponse(dataFeed, context));
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    Mono<Response<DataFeed>> updateDataFeedWithResponse(DataFeed dataFeed, Context context) {

        final DataFeedIngestionSettings dataFeedIngestionSettings = dataFeed.getIngestionSettings();
        final DataFeedOptions dataFeedOptions = dataFeed.getOptions() == null
            ? new DataFeedOptions() : dataFeed.getOptions();
        final DataFeedRollupSettings dataFeedRollupSettings = dataFeedOptions.getRollupSettings() == null
            ? new DataFeedRollupSettings() : dataFeedOptions.getRollupSettings();
        final DataFeedMissingDataPointFillSettings dataFeedMissingDataPointFillSettings =
            dataFeedOptions.getMissingDataPointFillSettings() == null
                ? new DataFeedMissingDataPointFillSettings() : dataFeedOptions.getMissingDataPointFillSettings();
        final Context withTracing = context.addData(AZ_TRACING_NAMESPACE_KEY, METRICS_ADVISOR_TRACING_NAMESPACE_VALUE);

        return service.updateDataFeedWithResponseAsync(UUID.fromString(dataFeed.getId()),
            DataFeedTransforms.toInnerForUpdate(dataFeed.getSource())
                .setDataFeedName(dataFeed.getName())
                .setDataFeedDescription(dataFeedOptions.getDescription())
                .setTimestampColumn(dataFeed.getSchema() == null
                    ? null : dataFeed.getSchema().getTimestampColumn())
                .setDataStartFrom(dataFeed.getIngestionSettings().getIngestionStartTime())
                .setStartOffsetInSeconds(dataFeedIngestionSettings.getIngestionStartOffset() == null
                    ? null : dataFeedIngestionSettings.getIngestionStartOffset().getSeconds())
                .setMaxConcurrency(dataFeedIngestionSettings.getDataSourceRequestConcurrency())
                .setStopRetryAfterInSeconds(dataFeedIngestionSettings.getStopRetryAfter() == null
                    ? null : dataFeedIngestionSettings.getStopRetryAfter().getSeconds())
                .setMinRetryIntervalInSeconds(dataFeedIngestionSettings.getIngestionRetryDelay() == null
                    ? null : dataFeedIngestionSettings.getIngestionRetryDelay().getSeconds())
                .setNeedRollup(DataFeedDetailPatchNeedRollup.fromString(
                    dataFeedRollupSettings.getRollupType().toString()))
                .setRollUpColumns(dataFeedRollupSettings.getAutoRollupGroupByColumnNames())
                .setRollUpMethod(DataFeedDetailPatchRollUpMethod.fromString(
                    dataFeedRollupSettings.getDataFeedAutoRollUpMethod() == null
                        ? null : dataFeedRollupSettings.getDataFeedAutoRollUpMethod().toString()))
                .setAllUpIdentification(dataFeedRollupSettings.getRollupIdentificationValue())
                .setFillMissingPointForAd(DataFeedDetailPatchFillMissingPointForAd.fromString(
                    dataFeedMissingDataPointFillSettings.getFillType().toString()))
                .setFillMissingPointForAdValue(dataFeedMissingDataPointFillSettings.getCustomFillValue())
                .setViewMode(DataFeedDetailPatchViewMode.fromString(dataFeedOptions.getAccessMode() == null
                    ? null : dataFeedOptions.getAccessMode().toString()))
                .setViewers(dataFeedOptions.getViewerEmails())
                .setAdmins(dataFeedOptions.getAdminEmails())
                .setStatus(DataFeedDetailPatchStatus.fromString(dataFeed.getStatus().toString()))
                .setActionLinkTemplate(dataFeedOptions.getActionLinkTemplate()), withTracing)
            .flatMap(updatedDataFeedResponse -> getDataFeedWithResponse(dataFeed.getId()));
    }

    /**
     * Delete a data feed.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.deleteDataFeed#String}
     *
     * @param dataFeedId The data feed unique id.
     *
     * @return An empty Mono.
     * @throws IllegalArgumentException If {@code dataFeedId} does not conform to the UUID format specification.
     * @throws NullPointerException thrown if the {@code dataFeedId} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteDataFeed(String dataFeedId) {
        return deleteDataFeedWithResponse(dataFeedId).flatMap(FluxUtil::toMono);
    }

    /**
     * Delete a data feed with REST response.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.deleteDataFeedWithResponse#String}
     *
     * @param dataFeedId The data feed unique id.
     *
     * @return A response containing status code and headers returned after the operation.
     * @throws IllegalArgumentException If {@code dataFeedId} does not conform to the UUID format specification.
     * @throws NullPointerException thrown if the {@code dataFeedId} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteDataFeedWithResponse(String dataFeedId) {
        try {
            return withContext(context -> deleteDataFeedWithResponse(dataFeedId, context));
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    Mono<Response<Void>> deleteDataFeedWithResponse(String dataFeedId, Context context) {
        Objects.requireNonNull(dataFeedId, "'dataFeedId' cannot be null.");
        return service.deleteDataFeedWithResponseAsync(UUID.fromString(dataFeedId), context)
            .map(response -> new SimpleResponse<>(response, null));
    }

    /**
     * List information of all data feeds on the metrics advisor account.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.listDataFeeds}
     *
     * @return A {@link PagedFlux} containing information of all the {@link DataFeed data feeds} in the account.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<DataFeed> listDataFeeds() {
        return listDataFeeds(new ListDataFeedOptions());
    }

    /**
     * List information of all data feeds on the metrics advisor account.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.listDataFeeds#ListDataFeedOptions}
     *
     * @param options The configurable {@link ListDataFeedOptions options} to pass for filtering the output result.
     *
     * @return A {@link PagedFlux} containing information of all the {@link DataFeed data feeds} in the account.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<DataFeed> listDataFeeds(ListDataFeedOptions options) {
        try {
            return new PagedFlux<>(() ->
                withContext(context ->
                    listDataFeedsSinglePageAsync(options, context)),
                continuationToken ->
                    withContext(context -> listDataFeedsNextPageAsync(continuationToken, context)));
        } catch (RuntimeException ex) {
            return new PagedFlux<>(() -> monoError(logger, ex));
        }
    }

    PagedFlux<DataFeed> listDataFeeds(ListDataFeedOptions options, Context context) {
        return new PagedFlux<>(() ->
            listDataFeedsSinglePageAsync(options, context),
            continuationToken ->
                listDataFeedsNextPageAsync(continuationToken, context));
    }

    private Mono<PagedResponse<DataFeed>> listDataFeedsSinglePageAsync(ListDataFeedOptions options, Context context) {

        options = options != null ? options : new ListDataFeedOptions();
        final ListDataFeedFilter dataFeedFilter =
            options.getListDataFeedFilter() != null ? options.getListDataFeedFilter() : new ListDataFeedFilter();
        final Context withTracing = context.addData(AZ_TRACING_NAMESPACE_KEY, METRICS_ADVISOR_TRACING_NAMESPACE_VALUE);

        return service.listDataFeedsSinglePageAsync(dataFeedFilter.getName(),
            dataFeedFilter.getSourceType() != null
                ? DataSourceType.fromString(dataFeedFilter.getSourceType().toString()) : null,
            dataFeedFilter.getGranularityType() != null
                ? Granularity.fromString(dataFeedFilter.getGranularityType().toString()) : null,
            dataFeedFilter.getStatus() != null
                ? EntityStatus.fromString(dataFeedFilter.getStatus().toString()) : null,
            dataFeedFilter.getCreator(),
            options.getSkip(), options.getTop(), withTracing)
            .doOnRequest(ignoredValue -> logger.info("Listing information for all data feeds"))
            .doOnSuccess(response -> logger.info("Listed data feeds {}", response))
            .doOnError(error -> logger.warning("Failed to list all data feeds information - {}", error))
            .map(res -> new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                res.getValue().stream().map(DataFeedTransforms::fromInner).collect(Collectors.toList()),
                res.getContinuationToken(),
                null));
    }

    private Mono<PagedResponse<DataFeed>> listDataFeedsNextPageAsync(String nextPageLink, Context context) {

        if (CoreUtils.isNullOrEmpty(nextPageLink)) {
            return Mono.empty();
        }
        return service.listDataFeedsNextSinglePageAsync(nextPageLink, context)
            .doOnSubscribe(ignoredValue -> logger.info("Retrieving the next listing page - Page {}", nextPageLink))
            .doOnSuccess(response -> logger.info("Retrieved the next listing page - Page {}", nextPageLink))
            .doOnError(error -> logger.warning("Failed to retrieve the next listing page - Page {}", nextPageLink,
                error))
            .map(res -> new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                res.getValue().stream().map(DataFeedTransforms::fromInner).collect(Collectors.toList()),
                res.getContinuationToken(),
                null));
    }

    /**
     * Fetch the ingestion status of a data feed.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.listDataFeedIngestionStatus#String-ListDataFeedIngestionOptions}
     *
     * @param dataFeedId The data feed id.
     * @param options The additional parameters.
     *
     * @return The ingestion statuses.
     * @throws IllegalArgumentException If {@code dataFeedId} does not conform to the UUID format specification.
     * @throws NullPointerException If {@code dataFeedId}, {@code options}, {@code options.startTime},
     * {@code options.endTime}  is null.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<DataFeedIngestionStatus> listDataFeedIngestionStatus(
        String dataFeedId,
        ListDataFeedIngestionOptions options) {
        try {
            return new PagedFlux<>(() ->
                withContext(context ->
                    listDataFeedIngestionStatusSinglePageAsync(dataFeedId, options, context)),
                continuationToken ->
                    withContext(context -> listDataFeedIngestionStatusNextPageAsync(continuationToken,
                        options,
                        context)));
        } catch (RuntimeException ex) {
            return new PagedFlux<>(() -> FluxUtil.monoError(logger, ex));
        }
    }

    PagedFlux<DataFeedIngestionStatus> listDataFeedIngestionStatus(
        String dataFeedId,
        ListDataFeedIngestionOptions options, Context context) {
        return new PagedFlux<>(() ->
            listDataFeedIngestionStatusSinglePageAsync(dataFeedId, options, context),
            continuationToken ->
                listDataFeedIngestionStatusNextPageAsync(continuationToken,
                    options,
                    context));
    }

    private Mono<PagedResponse<DataFeedIngestionStatus>> listDataFeedIngestionStatusSinglePageAsync(
        String dataFeedId,
        ListDataFeedIngestionOptions options, Context context) {
        Objects.requireNonNull(dataFeedId, "'dataFeedId' is required.");
        Objects.requireNonNull(options, "'options' is required.");
        Objects.requireNonNull(options.getStartTime(), "'options.startTime' is required.");
        Objects.requireNonNull(options.getEndTime(), "'options.endTime' is required.");

        IngestionStatusQueryOptions queryOptions = new IngestionStatusQueryOptions()
            .setStartTime(options.getStartTime())
            .setEndTime(options.getEndTime());

        return service.getDataFeedIngestionStatusSinglePageAsync(
            UUID.fromString(dataFeedId),
            queryOptions,
            options.getSkip(),
            options.getTop(),
            context.addData(AZ_TRACING_NAMESPACE_KEY, METRICS_ADVISOR_TRACING_NAMESPACE_VALUE))
            .doOnRequest(ignoredValue -> logger.info("Listing ingestion status for data feed"))
            .doOnSuccess(response -> logger.info("Listed ingestion status {}", response))
            .doOnError(error -> logger.warning("Failed to ingestion status for data feed", error));
    }

    private Mono<PagedResponse<DataFeedIngestionStatus>> listDataFeedIngestionStatusNextPageAsync(
        String nextPageLink,
        ListDataFeedIngestionOptions options,
        Context context) {
        if (CoreUtils.isNullOrEmpty(nextPageLink)) {
            return Mono.empty();
        }

        IngestionStatusQueryOptions queryOptions = new IngestionStatusQueryOptions()
            .setStartTime(options.getStartTime())
            .setEndTime(options.getEndTime());

        return service.getDataFeedIngestionStatusNextSinglePageAsync(nextPageLink,
            queryOptions,
            context.addData(AZ_TRACING_NAMESPACE_KEY, METRICS_ADVISOR_TRACING_NAMESPACE_VALUE))
            .doOnSubscribe(ignoredValue -> logger.info("Retrieving the next listing page - Page {}", nextPageLink))
            .doOnSuccess(response -> logger.info("Retrieved the next listing page - Page {} {}",
                nextPageLink, response))
            .doOnError(error -> logger.warning("Failed to retrieve the next listing page - Page {}", nextPageLink,
                error));
    }

    /**
     * Refresh data ingestion for a period.
     * <p>
     * The data in the data source for the given period will be reingested
     * and any ingested data for the same period will be overwritten.
     * </p>
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.refreshDataFeedIngestion#String-OffsetDateTime-OffsetDateTime}
     *
     * @param dataFeedId The data feed id.
     * @param startTime The start point of the period.
     * @param endTime The end point of of the period.
     *
     * @return A {@link Mono} indicating ingestion reset success or failure.
     * @throws IllegalArgumentException If {@code dataFeedId} does not conform to the UUID format specification.
     * @throws NullPointerException If {@code dataFeedId}, {@code startTime}, {@code endTime}  is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> refreshDataFeedIngestion(
        String dataFeedId,
        OffsetDateTime startTime,
        OffsetDateTime endTime) {
        return refreshDataFeedIngestionWithResponse(dataFeedId,
            startTime,
            endTime).then();
    }

    /**
     * Refresh data ingestion for a period.
     * <p>
     * The data in the data source for the given period will be reingested
     * and any ingested data for the same period will be overwritten.
     * </p>
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.refreshDataFeedIngestionWithResponse#String-OffsetDateTime-OffsetDateTime}
     *
     * @param dataFeedId The data feed id.
     * @param startTime The start point of the period.
     * @param endTime The end point of of the period.
     *
     * @return A {@link Response} of a {@link Mono} with result of reset request.
     * @throws IllegalArgumentException If {@code dataFeedId} does not conform to the UUID format specification.
     * @throws NullPointerException If {@code dataFeedId}, {@code startTime}, {@code endTime}  is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> refreshDataFeedIngestionWithResponse(
        String dataFeedId,
        OffsetDateTime startTime,
        OffsetDateTime endTime) {
        try {
            return withContext(context -> refreshDataFeedIngestionWithResponse(dataFeedId,
                startTime,
                endTime, context));
        } catch (RuntimeException e) {
            return FluxUtil.monoError(logger, e);
        }
    }

    Mono<Response<Void>> refreshDataFeedIngestionWithResponse(
        String dataFeedId,
        OffsetDateTime startTime,
        OffsetDateTime endTime, Context context) {
        Objects.requireNonNull(dataFeedId, "'dataFeedId' is required.");
        Objects.requireNonNull(startTime, "'startTime' is required.");
        Objects.requireNonNull(endTime, "'endTime' is required.");

        return service.resetDataFeedIngestionStatusWithResponseAsync(UUID.fromString(dataFeedId),
            new IngestionProgressResetOptions()
                .setStartTime(startTime)
                .setEndTime(endTime),
            context.addData(AZ_TRACING_NAMESPACE_KEY, METRICS_ADVISOR_TRACING_NAMESPACE_VALUE))
            .doOnRequest(ignoredValue -> logger.info("Resetting ingestion status for the data feed"))
            .doOnSuccess(response -> logger.info("Ingestion status got reset {}", response))
            .doOnError(error -> logger.warning("Failed to reset ingestion status for the data feed", error));
    }

    /**
     * Retrieve the ingestion progress of a data feed.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.getDataFeedIngestionProgress#String}
     *
     * @param dataFeedId The data feed id.
     *
     * @return A {@link Mono} containing {@link DataFeedIngestionProgress} of the data feed.
     * @throws IllegalArgumentException If {@code dataFeedId} does not conform to the UUID format specification.
     * @throws NullPointerException thrown if the {@code dataFeedId} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DataFeedIngestionProgress> getDataFeedIngestionProgress(String dataFeedId) {
        return getDataFeedIngestionProgressWithResponse(dataFeedId, Context.NONE)
            .map(Response::getValue);
    }

    /**
     * Retrieve the ingestion progress of a data feed.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.getDataFeedIngestionProgressWithResponse#String}
     *
     * @param dataFeedId The data feed id.
     *
     * @return A {@link Response} of a {@link Mono} containing {@link DataFeedIngestionProgress} of the data feed.
     * @throws IllegalArgumentException If {@code dataFeedId} does not conform to the UUID format specification.
     * @throws NullPointerException thrown if the {@code dataFeedId} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DataFeedIngestionProgress>> getDataFeedIngestionProgressWithResponse(String dataFeedId) {
        try {
            return withContext(context -> getDataFeedIngestionProgressWithResponse(dataFeedId, context));
        } catch (RuntimeException e) {
            return FluxUtil.monoError(logger, e);
        }
    }

    Mono<Response<DataFeedIngestionProgress>> getDataFeedIngestionProgressWithResponse(String dataFeedId,
        Context context) {
        Objects.requireNonNull(dataFeedId, "'dataFeedId' is required.");
        return service.getIngestionProgressWithResponseAsync(UUID.fromString(dataFeedId),
            context.addData(AZ_TRACING_NAMESPACE_KEY, METRICS_ADVISOR_TRACING_NAMESPACE_VALUE))
            .doOnRequest(ignoredValue -> logger.info("Retrieving ingestion progress for metric"))
            .doOnSuccess(response -> logger.info("Retrieved ingestion progress {}", response))
            .doOnError(error -> logger.warning("Failed to retrieve ingestion progress for metric", error));
    }

    /**
     * Create a configuration to detect anomalies in the time series of a metric.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.createMetricAnomalyDetectionConfiguration#String-AnomalyDetectionConfiguration}
     *
     * @param metricId The metric id to associate the configuration with.
     * @param detectionConfiguration The anomaly detection configuration.
     * @return A {@link Mono} containing the created {@link AnomalyDetectionConfiguration}.
     * @throws IllegalArgumentException If {@code metricId} does not conform to the UUID
     *     format specification, or {@code detectionConfiguration.name} is not set.
     * @throws NullPointerException thrown if the {@code metricId} is null
     *   or {@code detectionConfiguration} is null
     *   or {@code detectionConfiguration.wholeSeriesCondition} is null
     *   or {@code seriesKey} is missing for any {@code MetricSingleSeriesDetectionCondition} in the configuration
     *   or {@code seriesGroupKey} is missing for any {@code MetricSeriesGroupDetectionCondition} in the configuration
     *   or {@code crossConditionsOperator} is missing when multiple nested conditions are set in a
     *      {@code MetricSingleSeriesDetectionCondition} or {@code MetricSeriesGroupDetectionCondition}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AnomalyDetectionConfiguration> createMetricAnomalyDetectionConfiguration(
        String metricId,
        AnomalyDetectionConfiguration detectionConfiguration) {
        return createMetricAnomalyDetectionConfigurationWithResponse(metricId, detectionConfiguration)
            .map(Response::getValue);
    }

    /**
     * Create a configuration to detect anomalies in the time series of a metric.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.createMetricAnomalyDetectionConfigurationWithResponse#String-AnomalyDetectionConfiguration}
     *
     * @param metricId The metric id to associate the configuration with.
     * @param detectionConfiguration The anomaly detection configuration.
     * @return A {@link Response} of a {@link Mono} containing the created {@link AnomalyDetectionConfiguration}.
     * @throws IllegalArgumentException If {@code metricId} does not conform to the UUID
     *     format specification, or {@code detectionConfiguration.name} is not set.
     * @throws NullPointerException thrown if the {@code metricId} is null
     *   or {@code detectionConfiguration} is null
     *   or {@code detectionConfiguration.wholeSeriesCondition} is null
     *   or {@code seriesKey} is missing for any {@code MetricSingleSeriesDetectionCondition} in the configuration
     *   or {@code seriesGroupKey} is missing for any {@code MetricSeriesGroupDetectionCondition} in the configuration
     *   or {@code crossConditionsOperator} is missing when multiple nested conditions are set in a
     *      {@code MetricSingleSeriesDetectionCondition} or {@code MetricSeriesGroupDetectionCondition}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<AnomalyDetectionConfiguration>> createMetricAnomalyDetectionConfigurationWithResponse(
        String metricId,
        AnomalyDetectionConfiguration detectionConfiguration) {
        try {
            return withContext(context -> createMetricAnomalyDetectionConfigurationWithResponse(metricId,
                detectionConfiguration,
                context));
        } catch (RuntimeException e) {
            return FluxUtil.monoError(logger, e);
        }
    }

    Mono<Response<AnomalyDetectionConfiguration>> createMetricAnomalyDetectionConfigurationWithResponse(
        String metricId,
        AnomalyDetectionConfiguration detectionConfiguration,
        Context context) {
        Objects.requireNonNull(metricId, "metricId is required");
        Objects.requireNonNull(detectionConfiguration, "detectionConfiguration is required");

        final com.azure.ai.metricsadvisor.implementation.models.AnomalyDetectionConfiguration
            innerDetectionConfiguration = DetectionConfigurationTransforms.toInnerForCreate(logger,
            metricId,
            detectionConfiguration);
        return service.createAnomalyDetectionConfigurationWithResponseAsync(innerDetectionConfiguration,
            context.addData(AZ_TRACING_NAMESPACE_KEY, METRICS_ADVISOR_TRACING_NAMESPACE_VALUE))
            .doOnSubscribe(ignoredValue -> logger.info("Creating AnomalyDetectionConfiguration"))
            .doOnSuccess(response -> logger.info("Created AnomalyDetectionConfiguration"))
            .doOnError(error -> logger.warning("Failed to create AnomalyDetectionConfiguration", error))
            .flatMap(response -> {
                final String configurationId
                    = Utility.parseOperationId(response.getDeserializedHeaders().getLocation());
                return getMetricAnomalyDetectionConfigurationWithResponse(configurationId, context)
                    .map(configurationResponse -> new ResponseBase<Void, AnomalyDetectionConfiguration>(
                        response.getRequest(),
                        response.getStatusCode(),
                        response.getHeaders(),
                        configurationResponse.getValue(),
                        null));
            });
    }

    /**
     * Get the anomaly detection configuration by its id.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.getMetricAnomalyDetectionConfiguration#String}
     *
     * @param detectionConfigurationId The anomaly detection configuration id.
     * @return A {@link Mono} containing the {@link AnomalyDetectionConfiguration} for the provided id.
     * @throws IllegalArgumentException If {@code detectionConfigurationId} does not conform to the UUID
     *     format specification.
     * @throws NullPointerException thrown if the {@code detectionConfigurationId} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AnomalyDetectionConfiguration> getMetricAnomalyDetectionConfiguration(
        String detectionConfigurationId) {
        return getMetricAnomalyDetectionConfigurationWithResponse(detectionConfigurationId)
            .map(Response::getValue);
    }

    /**
     * Get the anomaly detection configuration by its id.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.getMetricAnomalyDetectionConfigurationWithResponse#String}
     *
     * @param detectionConfigurationId The anomaly detection configuration id.
     * @return A {@link Response} of a {@link Mono} containing the {@link AnomalyDetectionConfiguration}
     *     for the provided id.
     * @throws IllegalArgumentException If {@code detectionConfigurationId} does not conform to the UUID
     *     format specification.
     * @throws NullPointerException thrown if the {@code detectionConfigurationId} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<AnomalyDetectionConfiguration>> getMetricAnomalyDetectionConfigurationWithResponse(
        String detectionConfigurationId) {
        try {
            return withContext(context -> getMetricAnomalyDetectionConfigurationWithResponse(detectionConfigurationId,
                context));
        } catch (RuntimeException e) {
            return FluxUtil.monoError(logger, e);
        }
    }

    Mono<Response<AnomalyDetectionConfiguration>> getMetricAnomalyDetectionConfigurationWithResponse(
        String detectionConfigurationId, Context context) {
        Objects.requireNonNull(detectionConfigurationId, "detectionConfigurationId is required.");

        return service.getAnomalyDetectionConfigurationWithResponseAsync(UUID.fromString(detectionConfigurationId),
            context.addData(AZ_TRACING_NAMESPACE_KEY, METRICS_ADVISOR_TRACING_NAMESPACE_VALUE))
            .doOnSubscribe(ignoredValue -> logger.info("Retrieving AnomalyDetectionConfiguration - {}",
                detectionConfigurationId))
            .doOnSuccess(response -> logger.info("Retrieved AnomalyDetectionConfiguration - {}", response))
            .doOnError(error -> logger.warning("Failed to retrieve AnomalyDetectionConfiguration - {}",
                detectionConfigurationId, error))
            .map(response -> {
                AnomalyDetectionConfiguration configuration
                    = DetectionConfigurationTransforms.fromInner(response.getValue());
                return new ResponseBase<Void, AnomalyDetectionConfiguration>(response.getRequest(),
                    response.getStatusCode(),
                    response.getHeaders(),
                    configuration,
                    null);
            });
    }

    /**
     * Update a configuration to detect anomalies in the time series of a metric.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.updateMetricAnomalyDetectionConfiguration#AnomalyDetectionConfiguration}
     *
     * @param detectionConfiguration The anomaly detection configuration.
     * @return A {@link Mono} containing the updated {@link AnomalyDetectionConfiguration}.
     * @throws NullPointerException thrown if the {@code detectionConfiguration} is null
     *   or {@code detectionConfiguration.id} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AnomalyDetectionConfiguration> updateMetricAnomalyDetectionConfiguration(
        AnomalyDetectionConfiguration detectionConfiguration) {
        return updateMetricAnomalyDetectionConfigurationWithResponse(detectionConfiguration)
            .map(Response::getValue);
    }

    /**
     * Update a configuration to detect anomalies in the time series of a metric.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.updateMetricAnomalyDetectionConfigurationWithResponse#AnomalyDetectionConfiguration}
     *
     * @param detectionConfiguration The anomaly detection configuration.
     * @return A {@link Response} of a {@link Mono} containing the updated {@link AnomalyDetectionConfiguration}.
     * @throws NullPointerException thrown if the {@code detectionConfiguration} is null
     *   or {@code detectionConfiguration.id} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<AnomalyDetectionConfiguration>> updateMetricAnomalyDetectionConfigurationWithResponse(
        AnomalyDetectionConfiguration detectionConfiguration) {
        try {
            return withContext(context -> updateMetricAnomalyDetectionConfigurationWithResponse(detectionConfiguration,
                context));
        } catch (RuntimeException e) {
            return FluxUtil.monoError(logger, e);
        }
    }

    Mono<Response<AnomalyDetectionConfiguration>> updateMetricAnomalyDetectionConfigurationWithResponse(
        AnomalyDetectionConfiguration detectionConfiguration,
        Context context) {
        Objects.requireNonNull(detectionConfiguration, "detectionConfiguration is required");
        Objects.requireNonNull(detectionConfiguration.getId(), "detectionConfiguration.id is required");

        final AnomalyDetectionConfigurationPatch innerDetectionConfigurationPatch
            = DetectionConfigurationTransforms.toInnerForUpdate(logger, detectionConfiguration);
        return service.updateAnomalyDetectionConfigurationWithResponseAsync(
            UUID.fromString(detectionConfiguration.getId()),
            innerDetectionConfigurationPatch,
            context.addData(AZ_TRACING_NAMESPACE_KEY, METRICS_ADVISOR_TRACING_NAMESPACE_VALUE))
            .doOnSubscribe(ignoredValue -> logger.info("Updating AnomalyDetectionConfiguration"))
            .doOnSuccess(response -> logger.info("Updated AnomalyDetectionConfiguration"))
            .doOnError(error -> logger.warning("Failed to update AnomalyDetectionConfiguration", error))
            .flatMap(response -> {
                return getMetricAnomalyDetectionConfigurationWithResponse(detectionConfiguration.getId(), context)
                    .map(configurationResponse -> new ResponseBase<Void, AnomalyDetectionConfiguration>(
                        response.getRequest(),
                        response.getStatusCode(),
                        response.getHeaders(),
                        configurationResponse.getValue(),
                        null));
            });
    }

    /**
     * Delete a metric anomaly detection configuration.
     *
     * @param detectionConfigurationId The metric anomaly detection configuration unique id.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.deleteMetricAnomalyDetectionConfiguration#String}
     *
     * @return An empty Mono.
     * @throws NullPointerException thrown if the {@code detectionConfigurationId} is null.
     * @throws IllegalArgumentException If {@code detectionConfigurationId} does not conform to the UUID
     *     format specification.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteMetricAnomalyDetectionConfiguration(String detectionConfigurationId) {
        return deleteMetricAnomalyDetectionConfigurationWithResponse(detectionConfigurationId).then();
    }

    /**
     * Delete a metric anomaly detection configuration.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.deleteMetricAnomalyDetectionConfigurationWithResponse#String}
     *
     * @param detectionConfigurationId The metric anomaly detection configuration unique id.
     *
     * @return A {@link Response} of a {@link Mono}.
     * @throws NullPointerException thrown if the {@code detectionConfigurationId} is null.
     * @throws IllegalArgumentException If {@code detectionConfigurationId} does not conform to the UUID
     *     format specification.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteMetricAnomalyDetectionConfigurationWithResponse(
        String detectionConfigurationId) {
        try {
            return withContext(context -> deleteMetricAnomalyDetectionConfigurationWithResponse(
                detectionConfigurationId,
                context));
        } catch (RuntimeException e) {
            return FluxUtil.monoError(logger, e);
        }
    }

    Mono<Response<Void>> deleteMetricAnomalyDetectionConfigurationWithResponse(String detectionConfigurationId,
                                                                               Context context) {
        Objects.requireNonNull(detectionConfigurationId, "detectionConfigurationId is required.");
        return service.deleteHookWithResponseAsync(UUID.fromString(detectionConfigurationId),
            context.addData(AZ_TRACING_NAMESPACE_KEY, METRICS_ADVISOR_TRACING_NAMESPACE_VALUE))
            .doOnRequest(ignoredValue -> logger.info("Deleting MetricAnomalyDetectionConfiguration"))
            .doOnSuccess(response -> logger.info("Deleted MetricAnomalyDetectionConfiguration"))
            .doOnError(error -> logger.warning("Failed to delete MetricAnomalyDetectionConfiguration", error));
    }

    /**
     * Given a metric id, retrieve all anomaly detection configurations applied to it.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.listMetricAnomalyDetectionConfigurations#String}
     *
     * @param metricId The metric id.
     * @return The anomaly detection configurations.
     * @throws NullPointerException thrown if the {@code metricId} is null.
     * @throws IllegalArgumentException If {@code metricId} does not conform to the UUID format specification.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<AnomalyDetectionConfiguration> listMetricAnomalyDetectionConfigurations(String metricId) {
        try {
            return new PagedFlux<>(() -> withContext(context -> listMetricAnomalyDetectionConfigurationsInternal(
                metricId, context)),
                null);
        } catch (RuntimeException ex) {
            return new PagedFlux<>(() -> monoError(logger, ex));
        }
    }

    PagedFlux<AnomalyDetectionConfiguration> listMetricAnomalyDetectionConfigurations(String metricId,
                                                                                      Context context) {
        return new PagedFlux<>(() -> listMetricAnomalyDetectionConfigurationsInternal(metricId, context),
            null);
    }

    private Mono<PagedResponse<AnomalyDetectionConfiguration>> listMetricAnomalyDetectionConfigurationsInternal(
        String metricId,
        Context context) {
        Objects.requireNonNull(metricId, "metricId is required");
        return service.getAnomalyDetectionConfigurationsByMetricWithResponseAsync(
            UUID.fromString(metricId),
            context.addData(AZ_TRACING_NAMESPACE_KEY, METRICS_ADVISOR_TRACING_NAMESPACE_VALUE))
            .doOnRequest(ignoredValue -> logger.info("Listing all MetricAnomalyDetectionConfiguration for a metric"))
            .doOnSuccess(response -> logger.info("Listed all MetricAnomalyDetectionConfiguration for a metric"))
            .doOnError(error -> logger.warning(
                "Failed to list MetricAnomalyDetectionConfiguration for a metric",
                error))
            .map(response -> {
                final AnomalyDetectionConfigurationList innerConfigurationList = response.getValue();
                List<AnomalyDetectionConfiguration> configurationList;
                if (innerConfigurationList != null && innerConfigurationList.getValue() != null) {
                    configurationList = innerConfigurationList.getValue()
                        .stream()
                        .map(innerConfiguration -> DetectionConfigurationTransforms.fromInner(innerConfiguration))
                        .collect(Collectors.toList());
                } else {
                    configurationList = new ArrayList<>();
                }

                return new PagedResponseBase<Void, AnomalyDetectionConfiguration>(
                    response.getRequest(),
                    response.getStatusCode(),
                    response.getHeaders(),
                    configurationList,
                    null,
                    null);
            });

    }

    /**
     * Creates a hook that receives anomaly incident alerts.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.createHook#Hook}
     *
     * @param hook The hook.
     *
     * @return A {@link Mono} containing the created {@link Hook}.
     * @throws NullPointerException If {@code hook}, {@code hook.name}, {@code hook.endpoint} (for web hook) is null.
     * @throws IllegalArgumentException If at least one email not present for email hook.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Hook> createHook(Hook hook) {
        return createHookWithResponse(hook)
            .map(Response::getValue);
    }

    /**
     * Creates a hook that receives anomaly incident alerts.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.createHookWithResponse#Hook}
     *
     * @param hook The hook.
     *
     * @return A {@link Response} of a {@link Mono} containing the created {@link Hook}.
     * @throws NullPointerException If {@code hook}, {@code hook.name}, {@code hook.endpoint} (for web hook) is null.
     * @throws IllegalArgumentException If at least one email not present for email hook.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Hook>> createHookWithResponse(Hook hook) {
        try {
            return withContext(context -> createHookWithResponse(hook, context));
        } catch (RuntimeException e) {
            return FluxUtil.monoError(logger, e);
        }
    }

    Mono<Response<Hook>> createHookWithResponse(Hook hook, Context context) {
        Objects.requireNonNull(hook, "'hook' cannot be null.");
        return service.createHookWithResponseAsync(HookTransforms.toInnerForCreate(logger, hook),
            context.addData(AZ_TRACING_NAMESPACE_KEY, METRICS_ADVISOR_TRACING_NAMESPACE_VALUE))
            .doOnRequest(ignoredValue -> logger.info("Creating Hook"))
            .doOnSuccess(response -> logger.info("Created Hook {}", response))
            .doOnError(error -> logger.warning("Failed to create hook", error))
            .flatMap(response -> {
                final String hookUri = response.getDeserializedHeaders().getLocation();
                final String hookId = parseOperationId(hookUri);
                return getHookWithResponse(hookId, context)
                    .map(hookResponse -> new ResponseBase<Void, Hook>(response.getRequest(),
                        response.getStatusCode(),
                        response.getHeaders(),
                        hookResponse.getValue(),
                        null));
            });
    }

    /**
     * Get a hook by its id.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.getHook#String}
     *
     * @param hookId The hook unique id.
     *
     * @return A {@link Mono} containing the {@link Hook} for the provided id.
     * @throws IllegalArgumentException If {@code hookId} does not conform to the UUID format specification.
     * @throws NullPointerException thrown if the {@code hookId} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Hook> getHook(String hookId) {
        return getHookWithResponse(hookId).map(Response::getValue);
    }

    /**
     * Get a hook by its id.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.getHookWithResponse#String}
     *
     * @param hookId The hook unique id.
     *
     * @return A {@link Response} of a {@link Mono} containing the {@link Hook} for the provided id.
     * @throws IllegalArgumentException If {@code hookId} does not conform to the UUID format specification.
     * @throws NullPointerException thrown if the {@code hookId} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Hook>> getHookWithResponse(String hookId) {
        try {
            return withContext(context -> getHookWithResponse(hookId, context));
        } catch (RuntimeException e) {
            return FluxUtil.monoError(logger, e);
        }
    }

    Mono<Response<Hook>> getHookWithResponse(String hookId, Context context) {
        Objects.requireNonNull(hookId, "hookId is required.");
        return service.getHookWithResponseAsync(UUID.fromString(hookId),
            context.addData(AZ_TRACING_NAMESPACE_KEY, METRICS_ADVISOR_TRACING_NAMESPACE_VALUE))
            .doOnRequest(ignoredValue -> logger.info("Retrieving Hook"))
            .doOnSuccess(response -> logger.info("Retrieved Hook {}", response))
            .doOnError(error -> logger.warning("Failed to retrieve hook", error))
            .map(innerResponse -> new ResponseBase<Void, Hook>(innerResponse.getRequest(),
                innerResponse.getStatusCode(),
                innerResponse.getHeaders(),
                HookTransforms.fromInner(logger, innerResponse.getValue()),
                null));
    }

    /**
     * Update an existing hook.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.updateHook#Hook}
     *
     * @param hook The hook to update.
     *
     * @return A {@link Mono} containing the updated {@link Hook}.
     * @throws NullPointerException If {@code hook.id} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Hook> updateHook(Hook hook) {
        return updateHookWithResponse(hook).map(Response::getValue);
    }

    /**
     * Update an existing hook.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.updateHookWithResponse#Hook}
     *
     * @param hook The hook to update.
     *
     * @return A {@link Response} of a {@link Mono} containing the updated {@link Hook}.
     * @throws NullPointerException If {@code hook.id} is null.
     * @throws IllegalArgumentException If {@code hook.Id} does not conform to the UUID format specification.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Hook>> updateHookWithResponse(Hook hook) {
        try {
            return withContext(context -> updateHookWithResponse(hook, context));
        } catch (RuntimeException e) {
            return FluxUtil.monoError(logger, e);
        }
    }

    Mono<Response<Hook>> updateHookWithResponse(Hook hook, Context context) {
        Objects.requireNonNull(hook, "'hook' cannot be null.");
        Objects.requireNonNull(hook.getId(), "'hook.id' cannot be null.");
        return service.updateHookWithResponseAsync(UUID.fromString(hook.getId()),
            HookTransforms.toInnerForUpdate(logger, hook),
            context.addData(AZ_TRACING_NAMESPACE_KEY, METRICS_ADVISOR_TRACING_NAMESPACE_VALUE))
            .doOnRequest(ignoredValue -> logger.info("Updating Hook"))
            .doOnSuccess(response -> logger.info("Updated Hook {}", response))
            .doOnError(error -> logger.warning("Failed to update hook", error))
            .flatMap(response -> getHookWithResponse(hook.getId(), context)
                .map(hookResponse -> new ResponseBase<Void, Hook>(response.getRequest(),
                    response.getStatusCode(),
                    response.getHeaders(),
                    hookResponse.getValue(),
                    null)));
    }

    /**
     * Delete a hook.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.deleteHook#String}
     *
     * @param hookId The hook unique id.
     *
     * @return An empty Mono.
     * @throws NullPointerException thrown if the {@code hookId} is null.
     * @throws IllegalArgumentException If {@code hookId} does not conform to the UUID format specification.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteHook(String hookId) {
        return deleteHookWithResponse(hookId).then();
    }

    /**
     * Delete a hook.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.deleteHookWithResponse#String}
     *
     * @param hookId The hook unique id.
     *
     * @return A {@link Response} of a {@link Mono}.
     * @throws NullPointerException thrown if the {@code hookId} is null.
     * @throws IllegalArgumentException If {@code hookId} does not conform to the UUID format specification.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteHookWithResponse(String hookId) {
        try {
            return withContext(context -> deleteHookWithResponse(hookId, context));
        } catch (RuntimeException e) {
            return FluxUtil.monoError(logger, e);
        }
    }

    Mono<Response<Void>> deleteHookWithResponse(String hookId, Context context) {
        Objects.requireNonNull(hookId, "hookId is required.");
        return service.deleteHookWithResponseAsync(UUID.fromString(hookId), context)
            .doOnRequest(ignoredValue -> logger.info("Deleting Hook"))
            .doOnSuccess(response -> logger.info("Deleted Hook"))
            .doOnError(error -> logger.warning("Failed to delete hook", error));
    }

    /**
     * List information of hooks on the metrics advisor account.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.listHooks}
     *
     * @return A {@link PagedFlux} containing information of all the {@link Hook} in the account.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<Hook> listHooks() {
        return listHooks(new ListHookOptions());
    }

    /**
     * List information of hooks.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.listHooks#ListHookOptions}
     *
     * @param options The additional parameters
     *
     * @return A {@link PagedFlux} containing information of the {@link Hook} resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<Hook> listHooks(ListHookOptions options) {
        try {
            return new PagedFlux<>(() ->
                withContext(context ->
                    listHooksSinglePageAsync(options, context)),
                continuationToken ->
                    withContext(context -> listHooksNextPageAsync(continuationToken,
                        context)));
        } catch (RuntimeException ex) {
            return new PagedFlux<>(() -> FluxUtil.monoError(logger, ex));
        }
    }

    PagedFlux<Hook> listHooks(ListHookOptions options, Context context) {
        return new PagedFlux<>(() ->
            listHooksSinglePageAsync(options, context),
            continuationToken ->
                listHooksNextPageAsync(continuationToken, context));
    }

    private Mono<PagedResponse<Hook>> listHooksSinglePageAsync(ListHookOptions options, Context context) {
        return service.listHooksSinglePageAsync(
            options != null ? options.getHookNameFilter() : null,
            options != null ? options.getSkip() : null,
            options != null ? options.getTop() : null,
            context.addData(AZ_TRACING_NAMESPACE_KEY, METRICS_ADVISOR_TRACING_NAMESPACE_VALUE))
            .doOnRequest(ignoredValue -> logger.info("Listing hooks"))
            .doOnSuccess(response -> logger.info("Listed hooks {}", response))
            .doOnError(error -> logger.warning("Failed to list the hooks", error))
            .map(response -> HookTransforms.fromInnerPagedResponse(logger, response));
    }

    private Mono<PagedResponse<Hook>> listHooksNextPageAsync(String nextPageLink, Context context) {
        if (CoreUtils.isNullOrEmpty(nextPageLink)) {
            return Mono.empty();
        }
        return service.listHooksNextSinglePageAsync(nextPageLink,
            context.addData(AZ_TRACING_NAMESPACE_KEY, METRICS_ADVISOR_TRACING_NAMESPACE_VALUE))
            .doOnSubscribe(ignoredValue -> logger.info("Retrieving the next listing page - Page {}", nextPageLink))
            .doOnSuccess(response -> logger.info("Retrieved the next listing page - Page {} {}",
                nextPageLink,
                response))
            .doOnError(error -> logger.warning("Failed to retrieve the next listing page - Page {}", nextPageLink,
                error))
            .map(response -> HookTransforms.fromInnerPagedResponse(logger, response));
    }

    /**
     * Create a configuration to trigger alert when anomalies are detected.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.createAnomalyAlertConfiguration#AnomalyAlertConfiguration}
     *
     * @param alertConfiguration The anomaly alerting configuration.
     *
     * @return A {@link Mono} containing the created {@link AnomalyAlertConfiguration}.
     * @throws NullPointerException thrown if the {@code alertConfiguration} or
     * {@code alertConfiguration.metricAnomalyAlertConfigurations} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AnomalyAlertConfiguration> createAnomalyAlertConfiguration(
        AnomalyAlertConfiguration alertConfiguration) {
        return createAnomalyAlertConfigurationWithResponse(alertConfiguration).flatMap(FluxUtil::toMono);
    }

    /**
     * Create a configuration to trigger alert when anomalies are detected.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.createAnomalyAlertConfigurationWithResponse#AnomalyAlertConfiguration}
     *
     * @param alertConfiguration The anomaly alerting configuration.
     *
     * @return A {@link Response} of a {@link Mono} containing the created {@link AnomalyAlertConfiguration}.
     * @throws NullPointerException thrown if the {@code alertConfiguration} or
     * {@code alertConfiguration.metricAnomalyAlertConfigurations} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<AnomalyAlertConfiguration>> createAnomalyAlertConfigurationWithResponse(
        AnomalyAlertConfiguration alertConfiguration) {
        try {
            return withContext(context -> createAnomalyAlertConfigurationWithResponse(alertConfiguration, context));
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    Mono<Response<AnomalyAlertConfiguration>> createAnomalyAlertConfigurationWithResponse(
        AnomalyAlertConfiguration alertConfiguration, Context context) {
        Objects.requireNonNull(alertConfiguration, "'alertConfiguration' is required.");
        if (CoreUtils.isNullOrEmpty(alertConfiguration.getMetricAlertConfigurations())) {
            Objects.requireNonNull("'alertConfiguration.metricAnomalyAlertConfigurations' is required");
        }
        if (alertConfiguration.getCrossMetricsOperator() == null
            && alertConfiguration.getMetricAlertConfigurations().size() > 1) {
            throw logger.logExceptionAsError(new IllegalArgumentException("crossMetricsOperator is required"
                + " when there are more than one metric level alert configuration."));
        }

        final Context withTracing = context.addData(AZ_TRACING_NAMESPACE_KEY, METRICS_ADVISOR_TRACING_NAMESPACE_VALUE);
        final AnomalyAlertingConfiguration innerAlertConfiguration
            = AlertConfigurationTransforms.toInnerForCreate(alertConfiguration);

        return service.createAnomalyAlertingConfigurationWithResponseAsync(innerAlertConfiguration, withTracing)
            .doOnSubscribe(ignoredValue -> logger.info("Creating AnomalyAlertConfiguration - {}",
                innerAlertConfiguration))
            .doOnSuccess(response -> logger.info("Created AnomalyAlertConfiguration - {}", response))
            .doOnError(error -> logger.warning("Failed to create AnomalyAlertConfiguration - {}",
                innerAlertConfiguration, error))
            .flatMap(response -> {
                final String configurationId = parseOperationId(response.getDeserializedHeaders().getLocation());
                return getAnomalyAlertConfigurationWithResponse(configurationId, context)
                    .map(getResponse -> new ResponseBase<Void, AnomalyAlertConfiguration>(response.getRequest(),
                        response.getStatusCode(),
                        response.getHeaders(),
                        getResponse.getValue(),
                        null));
            });
    }

    /**
     * Get the anomaly alert configuration identified by {@code alertConfigurationId}.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.getAnomalyAlertConfiguration#String}
     *
     * @param alertConfigurationId The anomaly alert configuration id.
     *
     * @return A {@link Mono} containing the {@link AnomalyAlertConfiguration} identified by the given id.
     * @throws IllegalArgumentException If {@code alertConfigurationId} does not conform to the
     * UUID format specification.
     * @throws NullPointerException thrown if the {@code alertConfigurationId} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AnomalyAlertConfiguration> getAnomalyAlertConfiguration(
        String alertConfigurationId) {
        return getAnomalyAlertConfigurationWithResponse(alertConfigurationId).flatMap(FluxUtil::toMono);
    }

    /**
     * Get the anomaly alert configuration identified by {@code alertConfigurationId}.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.getAnomalyAlertConfigurationWithResponse#String}
     *
     * @param alertConfigurationId The anomaly alert configuration id.
     *
     * @return A {@link Response response} of a {@link Mono}
     * containing the {@link AnomalyAlertConfiguration} identified by the given id.
     * @throws IllegalArgumentException If {@code alertConfigurationId} does not conform to the
     * UUID format specification.
     * @throws NullPointerException thrown if the {@code alertConfigurationId} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<AnomalyAlertConfiguration>> getAnomalyAlertConfigurationWithResponse(
        String alertConfigurationId) {
        try {
            return withContext(context -> getAnomalyAlertConfigurationWithResponse(alertConfigurationId, context));
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    Mono<Response<AnomalyAlertConfiguration>> getAnomalyAlertConfigurationWithResponse(
        String alertConfigurationId, Context context) {
        Objects.requireNonNull(alertConfigurationId, "'alertConfigurationId' is required.");
        final Context withTracing = context.addData(AZ_TRACING_NAMESPACE_KEY, METRICS_ADVISOR_TRACING_NAMESPACE_VALUE);

        return service.getAnomalyAlertingConfigurationWithResponseAsync(UUID.fromString(alertConfigurationId),
            withTracing)
            .doOnSubscribe(ignoredValue -> logger.info("Retrieving AnomalyDetectionConfiguration - {}",
                alertConfigurationId))
            .doOnSuccess(response -> logger.info("Retrieved AnomalyDetectionConfiguration - {}", response))
            .doOnError(error -> logger.warning("Failed to retrieve AnomalyDetectionConfiguration - {}",
                alertConfigurationId, error))
            .map(response -> new ResponseBase<Void, AnomalyAlertConfiguration>(response.getRequest(),
                response.getStatusCode(),
                response.getHeaders(), AlertConfigurationTransforms.fromInner(response.getValue()), null));
    }

    /**
     * Update anomaly alert configuration.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.updateAnomalyAlertConfiguration#AnomalyAlertConfiguration}
     *
     * @param alertConfiguration The anomaly alert configuration to update.
     *
     * @return A {@link Mono} containing the {@link AnomalyAlertConfiguration} that was updated.
     * @throws NullPointerException thrown if {@code alertConfiguration} or
     * {@code alertConfiguration.metricAnomalyAlertConfigurations} is null or empty.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AnomalyAlertConfiguration> updateAnomalyAlertConfiguration(
        AnomalyAlertConfiguration alertConfiguration) {
        return updateAnomalyAlertConfigurationWithResponse(alertConfiguration).flatMap(FluxUtil::toMono);
    }

    /**
     * Update anomaly alert configuration.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.updateAnomalyAlertConfigurationWithResponse#AnomalyAlertConfiguration}
     *
     * @param alertConfiguration The anomaly alert configuration to update.
     *
     * @return A {@link Response} of a {@link Mono} containing the {@link AnomalyAlertConfiguration} that was updated.
     * @throws NullPointerException thrown if {@code alertConfiguration} or
     * {@code alertConfiguration.metricAnomalyAlertConfigurations} is null or empty.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<AnomalyAlertConfiguration>> updateAnomalyAlertConfigurationWithResponse(
        AnomalyAlertConfiguration alertConfiguration) {
        try {
            return withContext(context -> updateAnomalyAlertConfigurationWithResponse(alertConfiguration, context));
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    Mono<Response<AnomalyAlertConfiguration>> updateAnomalyAlertConfigurationWithResponse(
        AnomalyAlertConfiguration alertConfiguration, Context context) {
        Objects.requireNonNull(alertConfiguration, "'alertConfiguration' is required");
        if (CoreUtils.isNullOrEmpty(alertConfiguration.getMetricAlertConfigurations())) {
            throw logger.logExceptionAsError(new NullPointerException(
                "'alertConfiguration.metricAnomalyAlertConfigurations' is required and cannot be empty"));
        }
        final AnomalyAlertingConfigurationPatch innerAlertConfiguration
            = AlertConfigurationTransforms.toInnerForUpdate(alertConfiguration);
        final Context withTracing = context.addData(AZ_TRACING_NAMESPACE_KEY, METRICS_ADVISOR_TRACING_NAMESPACE_VALUE);

        return service.updateAnomalyAlertingConfigurationWithResponseAsync(
            UUID.fromString(alertConfiguration.getId()),
            innerAlertConfiguration,
            withTracing)
            .doOnSubscribe(ignoredValue -> logger.info("Updating AnomalyAlertConfiguration - {}",
                innerAlertConfiguration))
            .doOnSuccess(response -> logger.info("Updated AnomalyAlertConfiguration - {}", response))
            .doOnError(error -> logger.warning("Failed to update AnomalyAlertConfiguration - {}",
                innerAlertConfiguration, error))
            .flatMap(response -> getAnomalyAlertConfigurationWithResponse(alertConfiguration.getId(), context)
                .map(getResponse -> new ResponseBase<Void, AnomalyAlertConfiguration>(response.getRequest(),
                    response.getStatusCode(),
                    response.getHeaders(),
                    getResponse.getValue(),
                    null)));
    }

    /**
     * Deletes the anomaly alert configuration identified by {@code alertConfigurationId}.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.deleteAnomalyAlertConfiguration#String}
     *
     * @param alertConfigurationId The anomaly alert configuration id.
     *
     * @return An empty Mono.
     * @throws IllegalArgumentException If {@code alertConfigurationId} does not conform to the
     * UUID format specification.
     * @throws NullPointerException thrown if the {@code alertConfigurationId} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAnomalyAlertConfiguration(String alertConfigurationId) {
        return deleteAnomalyAlertConfigurationWithResponse(alertConfigurationId).flatMap(FluxUtil::toMono);
    }

    /**
     * Deletes the anomaly alert configuration identified by {@code alertConfigurationId}.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.deleteAnomalyAlertConfigurationWithResponse#String}
     *
     * @param alertConfigurationId The anomaly alert configuration id.
     *
     * @return A response containing status code and headers returned after the operation.
     * @throws IllegalArgumentException If {@code alertConfigurationId} does not conform to the
     * UUID format specification.
     * @throws NullPointerException thrown if the {@code alertConfigurationId} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteAnomalyAlertConfigurationWithResponse(String alertConfigurationId) {
        try {
            return withContext(context -> deleteAnomalyAlertConfigurationWithResponse(alertConfigurationId, context));
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    Mono<Response<Void>> deleteAnomalyAlertConfigurationWithResponse(String alertConfigurationId, Context context) {
        Objects.requireNonNull(alertConfigurationId, "'alertConfigurationId' is required.");
        final Context withTracing = context.addData(AZ_TRACING_NAMESPACE_KEY, METRICS_ADVISOR_TRACING_NAMESPACE_VALUE);

        return service.deleteAnomalyAlertingConfigurationWithResponseAsync(UUID.fromString(alertConfigurationId),
            withTracing)
            .doOnSubscribe(ignoredValue -> logger.info("Deleting AnomalyAlertConfiguration - {}", alertConfigurationId))
            .doOnSuccess(response -> logger.info("Deleted AnomalyAlertConfiguration - {}", response))
            .doOnError(error -> logger.warning("Failed to delete AnomalyAlertConfiguration - {}",
                alertConfigurationId, error));
    }

    /**
     * Fetch the anomaly alert configurations associated with a detection configuration.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.listAnomalyAlertConfigurations#String}
     *
     * @param detectionConfigurationId The id of the detection configuration.
     *
     * @return A {@link PagedFlux} containing information of all the
     * {@link AnomalyAlertConfiguration anomaly alert configurations} for the specified detection configuration.
     * @throws NullPointerException thrown if the {@code detectionConfigurationId} is null.
     * @throws IllegalArgumentException If {@code detectionConfigurationId} does not conform to the
     * UUID format specification.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<AnomalyAlertConfiguration> listAnomalyAlertConfigurations(
        String detectionConfigurationId) {
        try {
            return new PagedFlux<>(() ->
                withContext(context -> listAnomalyAlertConfigurationsInternal(detectionConfigurationId, context)),
                null);
        } catch (RuntimeException ex) {
            return new PagedFlux<>(() -> monoError(logger, ex));
        }
    }

    PagedFlux<AnomalyAlertConfiguration> listAnomalyAlertConfigurations(
        String detectionConfigurationId, Context context) {
        return new PagedFlux<>(() -> listAnomalyAlertConfigurationsInternal(detectionConfigurationId, context), null);
    }

    private Mono<PagedResponse<AnomalyAlertConfiguration>> listAnomalyAlertConfigurationsInternal(
        String detectionConfigurationId, Context context) {
        Objects.requireNonNull(detectionConfigurationId, "'detectionConfigurationId' is required.");
        final Context withTracing = context.addData(AZ_TRACING_NAMESPACE_KEY, METRICS_ADVISOR_TRACING_NAMESPACE_VALUE);

        return service.getAnomalyAlertingConfigurationsByAnomalyDetectionConfigurationWithResponseAsync(
            UUID.fromString(detectionConfigurationId), withTracing)
            .map(response -> {
                List<AnomalyAlertConfiguration> configurationList;
                final AnomalyAlertingConfigurationList innerConfigurationList = response.getValue();
                if (innerConfigurationList == null || innerConfigurationList.getValue().isEmpty()) {
                    configurationList = new ArrayList<>();
                } else {
                    configurationList = innerConfigurationList.getValue()
                        .stream()
                        .map(AlertConfigurationTransforms::fromInner)
                        .collect(Collectors.toList());
                }
                return new PagedResponseBase<Void, AnomalyAlertConfiguration>(response.getRequest(),
                    response.getStatusCode(),
                    response.getHeaders(),
                    configurationList,
                    null, null);
            });
    }
}
