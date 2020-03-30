// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.formrecognizer;

import com.azure.ai.formrecognizer.implementation.FormRecognizerClientImpl;
import com.azure.ai.formrecognizer.implementation.models.AnalyzeOperationResult;
import com.azure.ai.formrecognizer.implementation.models.AnalyzeReceiptAsyncHeaders;
import com.azure.ai.formrecognizer.implementation.models.ContentType;
import com.azure.ai.formrecognizer.implementation.models.SourcePath;
import com.azure.ai.formrecognizer.models.ExtractedReceipt;
import com.azure.ai.formrecognizer.models.FormContentType;
import com.azure.ai.formrecognizer.models.OperationResult;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.IterableStream;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollResponse;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.PollingContext;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.nio.ByteBuffer;
import java.time.Duration;
import java.util.UUID;
import java.util.function.Function;

import static com.azure.ai.formrecognizer.Transforms.toReceipt;
import static com.azure.core.util.FluxUtil.monoError;

/**
 * This class provides an asynchronous client that contains all the operations that apply to Azure Form Recognizer.
 * Operations allowed by the client are language detection, sentiment analysis, and recognition entities, PII entities,
 * and linked entities of a text input or list of test inputs.
 *
 * <p><strong>Instantiating an asynchronous Form Recognizer Client</strong></p>
 * TODO: codesnippet
 *
 * <p>View {@link FormRecognizerClientBuilder} for additional ways to construct the client.</p>
 *
 * @see FormRecognizerClientBuilder
 */
@ServiceClient(builder = FormRecognizerClientBuilder.class, isAsync = true)
public final class FormRecognizerAsyncClient {
    private final ClientLogger logger = new ClientLogger(FormRecognizerAsyncClient.class);
    private final FormRecognizerClientImpl service;
    private final FormRecognizerServiceVersion serviceVersion;

    /**
     * Create a {@code FormRecognizerAsyncClient} that sends requests to the Form Recognizer services's endpoint. Each
     * service call goes through the {@link FormRecognizerClientBuilder#pipeline(HttpPipeline)}  http pipeline}.
     *
     * @param service The proxy service used to perform REST calls.
     * @param serviceVersion The versions of Azure Form Recognizer supported by this client library.
     */
    FormRecognizerAsyncClient(FormRecognizerClientImpl service, FormRecognizerServiceVersion serviceVersion) {
        this.service = service;
        this.serviceVersion = serviceVersion;
    }

    /**
     * Gets the service version the client is using.
     *
     * @return the service version the client is using.
     */
    public FormRecognizerServiceVersion getServiceVersion() {
        return serviceVersion;
    }

    /**
     * Detects and extracts data from receipts using optical character recognition (OCR) and a prebuilt receipt trained
     * model.
     *
     * @param sourceUrl The source URL to the input document. Size of the file must be less than 20 MB.
     *
     * @return A {@link PollerFlux} that polls the extract receipt operation until it has completed, has failed, or has
     * been cancelled.
     */
    public PollerFlux<OperationResult, IterableStream<ExtractedReceipt>> beginExtractReceipt(String sourceUrl) {
        return beginExtractReceipt(sourceUrl, false, null);
    }

    /**
     * Detects and extracts data from receipts using optical character recognition (OCR) and a prebuilt receipt trained
     * model.
     *
     * @param sourceUrl The source URL to the input document. Size of the file must be less than 20 MB.
     * @param includeTextDetails Include text lines and element references in the result.
     * @param pollInterval Duration between each poll for the operation status. If none is specified, a default of
     * one second is used.
     *
     * @return A {@link PollerFlux} that polls the extract receipt operation until it has completed, has failed, or has
     * been cancelled.
     */
    public PollerFlux<OperationResult, IterableStream<ExtractedReceipt>> beginExtractReceipt(String sourceUrl,
                                                                                             boolean includeTextDetails,
                                                                                             Duration pollInterval) {
        final Duration interval = pollInterval != null ? pollInterval : Duration.ofSeconds(1);
        return new PollerFlux<OperationResult, IterableStream<ExtractedReceipt>>(interval,
            receiptAnalyzeActivationOperation(sourceUrl, includeTextDetails),
            extractReceiptPollOperation(),
            (activationResponse, context) -> Mono.error(new RuntimeException("Cancellation is not supported")),
            fetchExtractReceiptResult(includeTextDetails));
    }

    /**
     * Detects and extracts data from receipts data using optical character recognition (OCR) and a prebuilt receipt
     * trained model.
     *
     * @param data The data of the document to be extract receipt information from.
     * @param length The exact length of the data. Size of the file must be less than 20 MB.
     * @param includeTextDetails Include text lines and element references in the result.
     * @param formContentType Supported Media types.
     * @param pollInterval Duration between each poll for the operation status. If none is specified, a default of
     * one second is used.
     *
     * @return A {@link PollerFlux} that polls the extract receipt operation until it has completed, has failed, or has
     * been cancelled.
     */
    public PollerFlux<OperationResult, IterableStream<ExtractedReceipt>> beginExtractReceipt(
        Flux<ByteBuffer> data, long length, boolean includeTextDetails, FormContentType formContentType,
        Duration pollInterval) {
        final Duration interval = pollInterval != null ? pollInterval : Duration.ofSeconds(1);
        return new PollerFlux<OperationResult, IterableStream<ExtractedReceipt>>(interval,
            receiptStreamActivationOperation(data, length, formContentType, includeTextDetails),
            extractReceiptPollOperation(),
            (activationResponse, context) -> Mono.error(new RuntimeException("Cancellation is not supported")),
            fetchExtractReceiptResult(includeTextDetails));
    }

    private Function<PollingContext<OperationResult>, Mono<OperationResult>> receiptAnalyzeActivationOperation(
        String sourceUrl, boolean includeTextDetails) {
        return (pollingContext) -> {
            try {
                return service.analyzeReceiptAsyncWithResponseAsync(includeTextDetails,
                    new SourcePath().setSource(sourceUrl))
                    .map(response -> {
                        final AnalyzeReceiptAsyncHeaders headers = response.getDeserializedHeaders();
                        return new OperationResult(parseModelId(headers.getOperationLocation()));
                    });
            } catch (RuntimeException ex) {
                return monoError(logger, ex);
            }
        };
    }

    private Function<PollingContext<OperationResult>, Mono<OperationResult>> receiptStreamActivationOperation(
        Flux<ByteBuffer> buffer, long length, FormContentType formContentType, boolean includeTextDetails) {
        return (pollingContext) -> {
            try {
                return service.analyzeReceiptAsyncWithResponseAsync(includeTextDetails,
                    ContentType.fromString(formContentType.toString()), buffer, length)
                    .map(response -> {
                        final AnalyzeReceiptAsyncHeaders headers = response.getDeserializedHeaders();
                        return new OperationResult(parseModelId(headers.getOperationLocation()));
                    });
            } catch (RuntimeException ex) {
                return monoError(logger, ex);
            }
        };
    }

    private Function<PollingContext<OperationResult>, Mono<PollResponse<OperationResult>>>
        extractReceiptPollOperation() {
        return (pollingContext) -> {
            PollResponse<OperationResult> operationResultPollResponse = pollingContext.getLatestResponse();
            String modelId = operationResultPollResponse.getValue().getResultId();
            try {
                UUID resultUid = UUID.fromString(modelId);
                return service.getAnalyzeReceiptResultWithResponseAsync(resultUid)
                    .flatMap(modelSimpleResponse -> processAnalyzeModelResponse(modelSimpleResponse,
                        operationResultPollResponse));
            } catch (HttpResponseException e) {
                logger.logExceptionAsError(e);
                return Mono.just(new PollResponse<>(LongRunningOperationStatus.FAILED, null));
            }
        };
    }

    private Function<PollingContext<OperationResult>, Mono<IterableStream<ExtractedReceipt>>>
        fetchExtractReceiptResult(boolean includeTextDetails) {
        return (pollingContext) -> {
            final UUID resultUid = UUID.fromString(pollingContext.getLatestResponse().getValue().getResultId());
            return service.getAnalyzeReceiptResultWithResponseAsync(resultUid)
                .map(modelSimpleResponse -> toReceipt(modelSimpleResponse.getValue().getAnalyzeResult(),
                    includeTextDetails));
        };
    }

    private Mono<PollResponse<OperationResult>> processAnalyzeModelResponse(
        SimpleResponse<AnalyzeOperationResult> analyzeOperationResultSimpleResponse,
        PollResponse<OperationResult> operationResultPollResponse) {
        LongRunningOperationStatus status = null;
        switch (analyzeOperationResultSimpleResponse.getValue().getStatus()) {
            case RUNNING:
                status = LongRunningOperationStatus.IN_PROGRESS;
                break;
            case SUCCEEDED:
                status = LongRunningOperationStatus.SUCCESSFULLY_COMPLETED;
                break;
            case FAILED:
                status = LongRunningOperationStatus.FAILED;
                break;
            default:
                status = LongRunningOperationStatus.fromString(
                    analyzeOperationResultSimpleResponse.getValue().getStatus().toString(), true);
                break;
        }
        return Mono.just(new PollResponse<>(status, operationResultPollResponse.getValue()));
    }

    /**
     * Extracts the result ID from the URL.
     *
     * @param operationLocation The URL specified in the 'Operation-Location' response header containing the
     * resultId used to track the progress and obtain the result of the analyze operation.
     *
     * @return The resultId used to track the progress.
     */
    private String parseModelId(String operationLocation) {
        if (!CoreUtils.isNullOrEmpty(operationLocation)) {
            return operationLocation.substring(operationLocation.lastIndexOf('/') + 1);
        }
        throw logger.logExceptionAsError(new RuntimeException("Failed to parse operation header for result Id."));
    }
}
