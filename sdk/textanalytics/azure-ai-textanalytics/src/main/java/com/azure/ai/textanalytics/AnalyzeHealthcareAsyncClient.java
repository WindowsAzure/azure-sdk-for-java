// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.textanalytics;

import com.azure.ai.textanalytics.implementation.HealthcareTaskResultPropertiesHelper;
import com.azure.ai.textanalytics.implementation.TextAnalyticsClientImpl;
import com.azure.ai.textanalytics.implementation.TextAnalyticsOperationResultPropertiesHelper;
import com.azure.ai.textanalytics.implementation.Utility;
import com.azure.ai.textanalytics.implementation.models.HealthcareJobState;
import com.azure.ai.textanalytics.implementation.models.HealthcareResult;
import com.azure.ai.textanalytics.implementation.models.MultiLanguageBatchInput;
import com.azure.ai.textanalytics.implementation.models.StringIndexType;
import com.azure.ai.textanalytics.models.HealthcareTaskResult;
import com.azure.ai.textanalytics.models.RecognizeHealthcareEntityOptions;
import com.azure.ai.textanalytics.models.TextAnalyticsException;
import com.azure.ai.textanalytics.models.TextAnalyticsOperationResult;
import com.azure.ai.textanalytics.models.TextDocumentInput;
import com.azure.ai.textanalytics.util.RecognizeHealthcareEntitiesResultCollection;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollResponse;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.PollingContext;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Function;

import static com.azure.ai.textanalytics.TextAnalyticsAsyncClient.COGNITIVE_TRACING_NAMESPACE_VALUE;
import static com.azure.ai.textanalytics.implementation.Utility.DEFAULT_POLL_DURATION;
import static com.azure.ai.textanalytics.implementation.Utility.inputDocumentsValidation;
import static com.azure.ai.textanalytics.implementation.Utility.parseModelId;
import static com.azure.ai.textanalytics.implementation.Utility.parseNextLink;
import static com.azure.ai.textanalytics.implementation.Utility.toJobState;
import static com.azure.ai.textanalytics.implementation.Utility.toMultiLanguageInput;
import static com.azure.ai.textanalytics.implementation.Utility.toRecognizeHealthcareEntitiesResultCollection;
import static com.azure.core.util.FluxUtil.monoError;
import static com.azure.core.util.tracing.Tracer.AZ_TRACING_NAMESPACE_KEY;

class AnalyzeHealthcareAsyncClient {
    private final ClientLogger logger = new ClientLogger(AnalyzeHealthcareAsyncClient.class);
    private final TextAnalyticsClientImpl service;

    /**
     * Create an {@link AnalyzeHealthcareAsyncClient} that sends requests to the Text Analytics services's healthcare
     * LRO endpoint.
     *
     * @param service The proxy service used to perform REST calls.
     */
    AnalyzeHealthcareAsyncClient(TextAnalyticsClientImpl service) {
        this.service = service;
    }

    PollerFlux<TextAnalyticsOperationResult, PagedFlux<HealthcareTaskResult>> beginAnalyzeHealthcare(
        Iterable<TextDocumentInput> documents, RecognizeHealthcareEntityOptions options, Context context) {
        try {
            inputDocumentsValidation(documents);
            String modelVersion = null;
            StringIndexType stringIndexType = null;
            if (options != null) {
                modelVersion = options.getModelVersion();
                if (options.getStringIndexType() != null) {
                    stringIndexType = StringIndexType.fromString(options.getStringIndexType().toString());
                }
            }
            final Boolean finalIncludeStatistics = options == null ? null : options.isIncludeStatistics();
            return new PollerFlux<>(
                DEFAULT_POLL_DURATION,
                activationOperation(service.healthWithResponseAsync(
                    new MultiLanguageBatchInput().setDocuments(toMultiLanguageInput(documents)),
                    context.addData(AZ_TRACING_NAMESPACE_KEY, COGNITIVE_TRACING_NAMESPACE_VALUE),
                    modelVersion,
                    stringIndexType)
                    .map(healthResponse -> {
                        final TextAnalyticsOperationResult textAnalyticsOperationResult =
                            new TextAnalyticsOperationResult();
                        TextAnalyticsOperationResultPropertiesHelper.setResultId(textAnalyticsOperationResult,
                            parseModelId(healthResponse.getDeserializedHeaders().getOperationLocation()));
                        return textAnalyticsOperationResult;
                    })),
                pollingOperation(jobId -> service.healthStatusWithResponseAsync(jobId, context, null, null,
                    finalIncludeStatistics)),
                (activationResponse, pollingContext) ->
                    monoError(logger, new RuntimeException("Use the `beginCancelHealthcareJob` to cancel the job")),
                fetchingOperation(resultId -> Mono.just(getHealthcareFluxPage(resultId,
                    finalIncludeStatistics == null ? false : finalIncludeStatistics, context)))
            );
        } catch (RuntimeException ex) {
            return PollerFlux.error(ex);
        }
    }

    PollerFlux<TextAnalyticsOperationResult, PagedIterable<HealthcareTaskResult>> beginAnalyzeHealthcarePagedIterable(
        Iterable<TextDocumentInput> documents, RecognizeHealthcareEntityOptions options, Context context) {
        try {
            inputDocumentsValidation(documents);
            String modelVersion = null;
            StringIndexType stringIndexType = null;
            if (options != null) {
                modelVersion = options.getModelVersion();
                if (options.getStringIndexType() != null) {
                    stringIndexType = StringIndexType.fromString(options.getStringIndexType().toString());
                }
            }
            final Boolean finalIncludeStatistics = options == null ? null : options.isIncludeStatistics();
            return new PollerFlux<>(
                DEFAULT_POLL_DURATION,
                activationOperation(service.healthWithResponseAsync(
                    new MultiLanguageBatchInput().setDocuments(toMultiLanguageInput(documents)),
                    context.addData(AZ_TRACING_NAMESPACE_KEY, COGNITIVE_TRACING_NAMESPACE_VALUE),
                    modelVersion,
                    stringIndexType)
                    .map(healthResponse -> {
                        final TextAnalyticsOperationResult textAnalyticsOperationResult =
                            new TextAnalyticsOperationResult();
                        TextAnalyticsOperationResultPropertiesHelper.setResultId(textAnalyticsOperationResult,
                            parseModelId(healthResponse.getDeserializedHeaders().getOperationLocation()));
                        return textAnalyticsOperationResult;
                    })),
                pollingOperation(jobId -> service.healthStatusWithResponseAsync(jobId, context, null, null,
                    finalIncludeStatistics)),
                (activationResponse, pollingContext) ->
                    monoError(logger, new RuntimeException("Use the `beginCancelHealthcareJob` to cancel the job")),
                fetchingOperationIterable(resultId -> Mono.just(new PagedIterable<>(getHealthcareFluxPage(resultId,
                    finalIncludeStatistics == null ? false : finalIncludeStatistics, context))))
            );
        } catch (RuntimeException ex) {
            return PollerFlux.error(ex);
        }
    }

    PagedFlux<HealthcareTaskResult> getHealthcareFluxPage(UUID jobID, boolean showStats, Context context) {
        return new PagedFlux<>(
            () -> getPage(null, jobID, showStats, context),
            continuationToken -> getPage(continuationToken, jobID, showStats, context));
    }

    Mono<PagedResponse<HealthcareTaskResult>> getPage(String continuationToken, UUID jobID,
        boolean showStats, Context context) {
        try {
            if (continuationToken != null) {
                final Map<String, Integer> continuationTokenMap = parseNextLink(continuationToken);
                final Integer topValue = continuationTokenMap.getOrDefault("$top", null);
                final Integer skipValue = continuationTokenMap.getOrDefault("$skip", null);
                return service.healthStatusWithResponseAsync(jobID, context, topValue, skipValue, showStats)
                    .map(this::toTextAnalyticsPagedResponse)
                    .onErrorMap(Utility::mapToHttpResponseExceptionIfExist);
            } else {
                return service.healthStatusWithResponseAsync(jobID, context, null, null, showStats)
                    .map(this::toTextAnalyticsPagedResponse)
                    .onErrorMap(Utility::mapToHttpResponseExceptionIfExist);
            }
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    private PagedResponse<HealthcareTaskResult> toTextAnalyticsPagedResponse(
        Response<HealthcareJobState> response) {
        final HealthcareJobState healthcareJobState = response.getValue();
        final HealthcareResult healthcareResult = healthcareJobState.getResults();
        final RecognizeHealthcareEntitiesResultCollection recognizeHealthcareEntitiesResults
            = toRecognizeHealthcareEntitiesResultCollection(healthcareResult);

        final HealthcareTaskResult healthcareTaskResult = new HealthcareTaskResult(
            // TODO: change back to UUID after service support it.
            healthcareJobState.getJobId().toString(),
            healthcareJobState.getCreatedDateTime(),
            healthcareJobState.getLastUpdateDateTime(),
            toJobState(healthcareJobState.getStatus()),
            healthcareJobState.getDisplayName(),
            healthcareJobState.getExpirationDateTime());
        HealthcareTaskResultPropertiesHelper.setResult(healthcareTaskResult, recognizeHealthcareEntitiesResults);

        return new PagedResponseBase<Void, HealthcareTaskResult>(
            response.getRequest(),
            response.getStatusCode(),
            response.getHeaders(),
            Arrays.asList(healthcareTaskResult),
            healthcareJobState.getNextLink(),
            null);
    }

    PollerFlux<TextAnalyticsOperationResult, Void> beginCancelAnalyzeHealthcare(UUID jobId, Context context) {
        try {
            Objects.requireNonNull(jobId, "'jobId' is required and cannot be null.");
            return new PollerFlux<>(
                DEFAULT_POLL_DURATION,
                activationOperation(service.cancelHealthJobWithResponseAsync(jobId,
                    context.addData(AZ_TRACING_NAMESPACE_KEY, COGNITIVE_TRACING_NAMESPACE_VALUE))
                    .map(healthResponse -> {
                        final TextAnalyticsOperationResult textAnalyticsOperationResult =
                            new TextAnalyticsOperationResult();
                        TextAnalyticsOperationResultPropertiesHelper.setResultId(textAnalyticsOperationResult,
                            parseModelId(healthResponse.getDeserializedHeaders().getOperationLocation()));
                        return textAnalyticsOperationResult;
                    })),
                pollingOperation(resultId ->
                    service.healthStatusWithResponseAsync(resultId, context, null, null, null)),
                (activationResponse, pollingContext) -> monoError(logger,
                    new RuntimeException("Cancellation of healthcare task cancellation is not supported.")),
                (resultId) -> {
                    monoError(logger, new RuntimeException("Fetching of healthcare task result is not supported."));
                    return null;
                }
            );
        } catch (RuntimeException ex) {
            return PollerFlux.error(ex);
        }
    }

    // Activation operation
    private Function<PollingContext<TextAnalyticsOperationResult>, Mono<TextAnalyticsOperationResult>>
        activationOperation(Mono<TextAnalyticsOperationResult> operationResult) {
        return pollingContext -> {
            try {
                return operationResult.onErrorMap(Utility::mapToHttpResponseExceptionIfExist);
            } catch (RuntimeException ex) {
                return monoError(logger, ex);
            }
        };
    }

    // Polling operation
    private Function<PollingContext<TextAnalyticsOperationResult>, Mono<PollResponse<TextAnalyticsOperationResult>>>
        pollingOperation(Function<UUID, Mono<SimpleResponse<HealthcareJobState>>> pollingFunction) {
        return pollingContext -> {
            try {
                final PollResponse<TextAnalyticsOperationResult> operationResultPollResponse =
                    pollingContext.getLatestResponse();
                final UUID resultUuid = UUID.fromString(operationResultPollResponse.getValue().getResultId());
                return pollingFunction.apply(resultUuid)
                    .flatMap(modelResponse -> processAnalyzeModelResponse(modelResponse, operationResultPollResponse))
                    .onErrorMap(Utility::mapToHttpResponseExceptionIfExist);
            } catch (RuntimeException ex) {
                return monoError(logger, ex);
            }
        };
    }

    // Fetching operation
    private Function<PollingContext<TextAnalyticsOperationResult>, Mono<PagedFlux<HealthcareTaskResult>>>
        fetchingOperation(Function<UUID, Mono<PagedFlux<HealthcareTaskResult>>> fetchingFunction) {
        return pollingContext -> {
            try {
                final UUID resultUuid = UUID.fromString(pollingContext.getLatestResponse().getValue().getResultId());
                return fetchingFunction.apply(resultUuid);
            } catch (RuntimeException ex) {
                return monoError(logger, ex);
            }
        };
    }

    // Fetching iterable operation
    private Function<PollingContext<TextAnalyticsOperationResult>, Mono<PagedIterable<HealthcareTaskResult>>>
        fetchingOperationIterable(
        Function<UUID, Mono<PagedIterable<HealthcareTaskResult>>> fetchingFunction) {
        return pollingContext -> {
            try {
                final UUID resultUuid = UUID.fromString(pollingContext.getLatestResponse().getValue().getResultId());
                return fetchingFunction.apply(resultUuid);
            } catch (RuntimeException ex) {
                return monoError(logger, ex);
            }
        };
    }

    private Mono<PollResponse<TextAnalyticsOperationResult>> processAnalyzeModelResponse(
        Response<HealthcareJobState> analyzeOperationResultResponse,
        PollResponse<TextAnalyticsOperationResult> operationResultPollResponse) {
        LongRunningOperationStatus status;
        switch (analyzeOperationResultResponse.getValue().getStatus()) {
            case CANCELLING:
                logger.info("LongRunningOperation-Cancelling");
                status = LongRunningOperationStatus.IN_PROGRESS;
                break;
            case NOTSTARTED:
            case RUNNING:
                status = LongRunningOperationStatus.IN_PROGRESS;
                break;
            case SUCCEEDED:
                status = LongRunningOperationStatus.SUCCESSFULLY_COMPLETED;
                break;
            case FAILED:
                // TODO: wait for a swagger change, which will include a list of errors reported in HealthcareJobState.
                throw logger.logExceptionAsError(new TextAnalyticsException("Analyze operation failed", null, null));
                //analyzeOperationResultResponse.get.getValue()..getResults()
                //    .map(documentError -> new TextAnalyticsException(
                //        documentError.getError().getMessage(),
                //                 TextAnalyticsErrorCode.fromString(documentError.getError().getCode().toString()),
                //                 documentError.getError().getTarget()))
                //    .collect(Collectors.toList())),
                //null);
                //);
            case CANCELLED:
                logger.info("LongRunningOperation-Cancelled");
                status = LongRunningOperationStatus.USER_CANCELLED;
                break;
            default:
                status = LongRunningOperationStatus.fromString(
                    analyzeOperationResultResponse.getValue().getStatus().toString(), true);
                break;
        }
        return Mono.just(new PollResponse<>(status, operationResultPollResponse.getValue()));
    }
}
