// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.formrecognizer;

import com.azure.ai.formrecognizer.implementation.FormRecognizerClientImpl;
import com.azure.ai.formrecognizer.implementation.Utility;
import com.azure.ai.formrecognizer.implementation.models.AnalyzeOperationResult;
import com.azure.ai.formrecognizer.implementation.models.ContentType;
import com.azure.ai.formrecognizer.implementation.models.OperationStatus;
import com.azure.ai.formrecognizer.implementation.models.SourcePath;
import com.azure.ai.formrecognizer.models.ErrorInformation;
import com.azure.ai.formrecognizer.models.FormContentType;
import com.azure.ai.formrecognizer.models.FormPage;
import com.azure.ai.formrecognizer.models.FormRecognizerException;
import com.azure.ai.formrecognizer.models.OperationResult;
import com.azure.ai.formrecognizer.models.RecognizeCustomFormsOptions;
import com.azure.ai.formrecognizer.models.RecognizeOptions;
import com.azure.ai.formrecognizer.models.RecognizedForm;
import com.azure.ai.formrecognizer.models.RecognizedReceipt;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollResponse;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.PollingContext;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Function;

import static com.azure.ai.formrecognizer.Transforms.toReceipt;
import static com.azure.ai.formrecognizer.Transforms.toRecognizedForm;
import static com.azure.ai.formrecognizer.Transforms.toRecognizedLayout;
import static com.azure.ai.formrecognizer.implementation.Utility.detectContentType;
import static com.azure.ai.formrecognizer.implementation.Utility.parseModelId;
import static com.azure.core.util.FluxUtil.monoError;

/**
 * This class provides an asynchronous client that contains all the operations that apply to Azure Form Recognizer.
 * Operations allowed by the client are recognizing receipt data from documents, extracting layout information and
 * analyzing custom forms for predefined data.
 *
 * <p><strong>Instantiating an asynchronous Form Recognizer Client</strong></p>
 * {@codesnippet com.azure.ai.formrecognizer.FormRecognizerAsyncClient.instantiation}
 *
 * @see FormRecognizerClientBuilder
 */
@ServiceClient(builder = FormRecognizerClientBuilder.class, isAsync = true)
public final class FormRecognizerAsyncClient {
    private final ClientLogger logger = new ClientLogger(FormRecognizerAsyncClient.class);
    private final FormRecognizerClientImpl service;
    private final FormRecognizerServiceVersion serviceVersion;

    /**
     * Create a {@link FormRecognizerAsyncClient} that sends requests to the Form Recognizer services's endpoint. Each
     * service call goes through the {@link FormRecognizerClientBuilder#pipeline(HttpPipeline)} http pipeline}.
     *
     * @param service The proxy service used to perform REST calls.
     * @param serviceVersion The versions of Azure Form Recognizer supported by this client library.
     */
    FormRecognizerAsyncClient(FormRecognizerClientImpl service, FormRecognizerServiceVersion serviceVersion) {
        this.service = service;
        this.serviceVersion = serviceVersion;
    }

    /**
     * Recognizes form data from documents using optical character recognition (OCR) and a custom trained
     * model with or without labels.
     * <p>The service does not support cancellation of the long running operation and returns with an
     * error message indicating absence of cancellation support.</p>
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.formrecognizer.FormRecognizerAsyncClient.beginRecognizeCustomFormsFromUrl#string-string}
     *
     * @param formUrl The URL of the form to analyze.
     * @param modelId The UUID string format custom trained model Id to be used.
     *
     * @return A {@link PollerFlux} that polls the recognize custom form operation until it has completed, has failed,
     * or has been cancelled. The completed operation returns a List of {@link RecognizedForm}.
     * @throws FormRecognizerException If recognize operation fails and the {@link AnalyzeOperationResult} returned with
     * an {@link OperationStatus#FAILED}.
     * @throws NullPointerException If {@code formUrl}, {@code modelId} is {@code null}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PollerFlux<OperationResult, List<RecognizedForm>>
        beginRecognizeCustomFormsFromUrl(String formUrl, String modelId) {
        return beginRecognizeCustomFormsFromUrl(new RecognizeCustomFormsOptions(formUrl, modelId));
    }

    PollerFlux<OperationResult, List<RecognizedForm>>
        beginRecognizeCustomFormsFromUrl(RecognizeCustomFormsOptions recognizeCustomFormsOptions) {
        try {
            Objects.requireNonNull(recognizeCustomFormsOptions,
                "'recognizeCustomFormsOptions' is required and cannot be null.");
            final String modelId = recognizeCustomFormsOptions.getModelId();
            return new PollerFlux<OperationResult, List<RecognizedForm>>(
                recognizeCustomFormsOptions.getPollInterval(),
                analyzeFormActivationOperation(recognizeCustomFormsOptions.getFormUrl(), modelId,
                    recognizeCustomFormsOptions.isIncludeFieldElements()),
                createAnalyzeFormPollOperation(modelId),
                (activationResponse, context) -> Mono.error(new RuntimeException("Cancellation is not supported")),
                fetchAnalyzeFormResultOperation(modelId, recognizeCustomFormsOptions.isIncludeFieldElements()));
        } catch (RuntimeException ex) {
            return PollerFlux.error(ex);
        }
    }

    /**
     * Recognizes form data from documents using optical character recognition (OCR) and a custom trained
     * model with or without labels.
     * <p>The service does not support cancellation of the long running operation and returns with an
     * error message indicating absence of cancellation support.</p>
     *
     * Note that the {@code data} passed must be replayable if retries are enabled (the default). In other words, the
     * {@code Flux} must produce the same data each time it is subscribed to.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.formrecognizer.FormRecognizerAsyncClient.beginRecognizeCustomForms#Flux-long-string-FormContentType}
     *
     * @param form The data of the form to recognize form information from.
     * @param length The exact length of the data.
     * @param modelId The UUID string format custom trained model Id to be used.
     * @param formContentType The type of the provided form. Supported Media types including .pdf, .jpg, .png or
     * .tiff type file stream. Content-type is auto-detected and could be {@code null}.
     *
     * @return A {@link PollerFlux} that polls the recognize custom form operation until it has completed, has failed,
     * or has been cancelled. The completed operation returns a List of {@link RecognizedForm}.
     * @throws FormRecognizerException If recognize operation fails and the {@link AnalyzeOperationResult} returned with
     * an {@link OperationStatus#FAILED}.
     * @throws NullPointerException If {@code form}, {@code modelId} is {@code null}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PollerFlux<OperationResult, List<RecognizedForm>>
        beginRecognizeCustomForms(Flux<ByteBuffer> form, long length, String modelId, FormContentType formContentType) {
        return beginRecognizeCustomForms(new RecognizeCustomFormsOptions(form, length, modelId)
            .setFormContentType(formContentType));
    }

    /**
     * Recognizes form data from documents using optical character recognition (OCR) and a custom trained
     * model with or without labels.
     * <p>The service does not support cancellation of the long running operation and returns with an
     * error message indicating absence of cancellation support.</p>
     *
     * Note that the {@code data} passed must be replayable if retries are enabled (the default). In other words, the
     * {@code Flux} must produce the same data each time it is subscribed to.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.formrecognizer.FormRecognizerAsyncClient.beginRecognizeCustomForms#recognizeCustomFormsOptions}
     *
     * @param recognizeCustomFormsOptions The configurable {@code RecognizeCustomFormsOptions options} that may be
     * passed when recognizing custom form.
     *
     * @return A {@link PollerFlux} that polls the recognize custom form operation until it has completed, has failed,
     * or has been cancelled. The completed operation returns a List of {@link RecognizedForm}.
     * @throws FormRecognizerException If recognize operation fails and the {@link AnalyzeOperationResult} returned with
     * an {@link OperationStatus#FAILED}.
     * @throws NullPointerException If {@code recognizeOptions} is {@code null}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PollerFlux<OperationResult, List<RecognizedForm>>
        beginRecognizeCustomForms(RecognizeCustomFormsOptions recognizeCustomFormsOptions) {
        try {
            Objects.requireNonNull(recognizeCustomFormsOptions,
                "'recognizeCustomFormsOptions' is required and cannot be null.");
            if (recognizeCustomFormsOptions.getFormUrl() != null) {
                return beginRecognizeCustomFormsFromUrl(recognizeCustomFormsOptions);
            }
            final String modelId = recognizeCustomFormsOptions.getModelId();
            Flux<ByteBuffer> buffer = getByteBufferFlux(recognizeCustomFormsOptions.getForm(),
                recognizeCustomFormsOptions.getFormData());
            return new PollerFlux<OperationResult, List<RecognizedForm>>(
                recognizeCustomFormsOptions.getPollInterval(),
                analyzeFormStreamActivationOperation(buffer, modelId,
                    recognizeCustomFormsOptions.getLength(), recognizeCustomFormsOptions.getFormContentType(),
                    recognizeCustomFormsOptions.isIncludeFieldElements()),
                createAnalyzeFormPollOperation(modelId),
                (activationResponse, context) -> Mono.error(new RuntimeException("Cancellation is not supported")),
                fetchAnalyzeFormResultOperation(modelId, recognizeCustomFormsOptions.isIncludeFieldElements()));
        } catch (RuntimeException ex) {
            return PollerFlux.error(ex);
        }
    }

    /**
     * Recognizes content/layout data from documents using optical character recognition (OCR).
     * <p>The service does not support cancellation of the long running operation and returns with an
     * error message indicating absence of cancellation support.</p>
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.formrecognizer.FormRecognizerAsyncClient.beginRecognizeContentFromUrl#string}
     *
     * @param formUrl The URL of the form to analyze.
     *
     * @return A {@link PollerFlux} that polls the recognize content operation until it has completed, has failed, or
     * has been cancelled. The completed operation returns a List of {@link FormPage}.
     * @throws FormRecognizerException If recognize operation fails and the {@link AnalyzeOperationResult} returned with
     * an {@link OperationStatus#FAILED}.
     * @throws NullPointerException If {@code formUrl} is {@code null}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PollerFlux<OperationResult, List<FormPage>> beginRecognizeContentFromUrl(String formUrl) {
        return beginRecognizeContentFromUrl(new RecognizeOptions(formUrl));
    }

    PollerFlux<OperationResult, List<FormPage>>
        beginRecognizeContentFromUrl(RecognizeOptions recognizeOptions) {
        try {
            Objects.requireNonNull(recognizeOptions,
                "'recognizeOptions' is required and cannot be null.");
            return new PollerFlux<OperationResult, List<FormPage>>(recognizeOptions.getPollInterval(),
                contentAnalyzeActivationOperation(recognizeOptions.getFormUrl()),
                extractContentPollOperation(),
                (activationResponse, context) -> monoError(logger,
                    new RuntimeException("Cancellation is not supported")),
                fetchExtractContentResult());
        } catch (RuntimeException ex) {
            return PollerFlux.error(ex);
        }
    }

    /**
     * Recognizes content/layout data using optical character recognition (OCR).
     * <p>The service does not support cancellation of the long running operation and returns with an
     * error message indicating absence of cancellation support.</p>
     *
     * Note that the {@code data} passed must be replayable if retries are enabled (the default). In other words, the
     * {@code Flux} must produce the same data each time it is subscribed to.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.formrecognizer.FormRecognizerAsyncClient.beginRecognizeContent#Flux-long-FormContentType}
     *
     * @param form The data of the form to recognize content information from.
     * @param length The exact length of the data.
     * @param formContentType The type of the provided form. Supported Media types including .pdf, .jpg, .png or
     * .tiff type file stream. Content-type is auto-detected and could be {@code null}.
     *
     * @return A {@link PollerFlux} polls the recognize content operation until it has completed, has failed, or has
     * been cancelled. The completed operation returns a List of {@link FormPage}.
     * @throws FormRecognizerException If recognize operation fails and the {@link AnalyzeOperationResult} returned with
     * an {@link OperationStatus#FAILED}.
     * @throws NullPointerException If {@code form} is {@code null}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PollerFlux<OperationResult, List<FormPage>> beginRecognizeContent(
        Flux<ByteBuffer> form, long length, FormContentType formContentType) {
        return beginRecognizeContent(new RecognizeOptions(form, length).setFormContentType(formContentType));
    }

    /**
     * Recognizes content/layout data using optical character recognition (OCR).
     * <p>The service does not support cancellation of the long running operation and returns with an
     * error message indicating absence of cancellation support.</p>
     *
     * Note that the {@code data} passed must be replayable if retries are enabled (the default). In other words, the
     * {@code Flux} must produce the same data each time it is subscribed to.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.formrecognizer.FormRecognizerAsyncClient.beginRecognizeContent#recognizeOptions}
     *
     * @param recognizeOptions The configurable {@code RecognizeOptions options} that may be passed when recognizing
     * content on a form.
     *
     * @return A {@link PollerFlux} polls the recognize content operation until it has completed, has failed, or has
     * been cancelled. The completed operation returns a List of {@link FormPage}.
     * @throws FormRecognizerException If recognize operation fails and the {@link AnalyzeOperationResult} returned with
     * an {@link OperationStatus#FAILED}.
     * @throws NullPointerException If {@code recognizeOptions} is {@code null}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PollerFlux<OperationResult, List<FormPage>> beginRecognizeContent(RecognizeOptions recognizeOptions) {
        try {
            Objects.requireNonNull(recognizeOptions,
                "'recognizeOptions' is required and cannot be null.");
            if (recognizeOptions.getFormUrl() != null) {
                return beginRecognizeContentFromUrl(recognizeOptions);
            }
            Flux<ByteBuffer> buffer = getByteBufferFlux(recognizeOptions.getForm(), recognizeOptions.getFormData());
            return new PollerFlux<>(
                recognizeOptions.getPollInterval(),
                contentStreamActivationOperation(buffer, recognizeOptions.getLength(),
                    recognizeOptions.getFormContentType()),
                extractContentPollOperation(),
                (activationResponse, context) ->
                    monoError(logger, new RuntimeException("Cancellation is not supported")),
                fetchExtractContentResult());
        } catch (RuntimeException ex) {
            return PollerFlux.error(ex);
        }
    }

    /**
     * Recognizes receipt data using optical character recognition (OCR) and a prebuilt receipt trained
     * model.
     * <p>The service does not support cancellation of the long running operation and returns with an
     * error message indicating absence of cancellation support.</p>
     * See <a href="https://aka.ms/azsdk/python/formrecognizer/receiptfields">here</a> for fields found on a receipt.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.formrecognizer.FormRecognizerAsyncClient.beginRecognizeReceiptsFromUrl#string}
     *
     * @param receiptUrl The URL of the receipt to analyze.
     *
     * @return A {@link PollerFlux} that polls the recognize receipt operation until it has completed, has failed,
     * or has been cancelled. The completed operation returns a List of {@link RecognizedReceipt}.
     * @throws FormRecognizerException If recognize operation fails and the {@link AnalyzeOperationResult} returned with
     * an {@link OperationStatus#FAILED}.
     * @throws NullPointerException If {@code receiptUrl} is {@code null}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PollerFlux<OperationResult, List<RecognizedReceipt>>
        beginRecognizeReceiptsFromUrl(String receiptUrl) {
        return beginRecognizeReceiptsFromUrl(new RecognizeOptions(receiptUrl));
    }

    PollerFlux<OperationResult, List<RecognizedReceipt>>
        beginRecognizeReceiptsFromUrl(RecognizeOptions recognizeOptions) {
        try {
            Objects.requireNonNull(recognizeOptions,
                "'recognizeOptions' is required and cannot be null.");
            return new PollerFlux<OperationResult, List<RecognizedReceipt>>(recognizeOptions.getPollInterval(),
                receiptAnalyzeActivationOperation(recognizeOptions.getFormUrl(),
                    recognizeOptions.isIncludeFieldElements()),
                extractReceiptPollOperation(),
                (activationResponse, context) -> monoError(logger,
                    new RuntimeException("Cancellation is not supported")),
                fetchExtractReceiptResult(recognizeOptions.isIncludeFieldElements()));
        } catch (RuntimeException ex) {
            return PollerFlux.error(ex);
        }
    }

    /**
     * Recognizes receipt data using optical character recognition (OCR) and a prebuilt receipt
     * trained model.
     * <p>The service does not support cancellation of the long running operation and returns with an
     * error message indicating absence of cancellation support.</p>
     * See <a href="https://aka.ms/azsdk/python/formrecognizer/receiptfields">here</a> for fields found on a receipt.
     *
     * Note that the {@code receipt} passed must be replayable if retries are enabled (the default). In other words, the
     * {@code Flux} must produce the same data each time it is subscribed to.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.formrecognizer.FormRecognizerAsyncClient.beginRecognizeReceipts#Flux-long-FormContentType}
     *
     * @param receipt The data/stream of the document to recognize receipt information from.
     * @param length The exact length of the data.
     * @param formContentType The type of the provided form. Supported Media types including .pdf, .jpg, .png or
     * .tiff type file stream. Content-type is auto-detected and could be {@code null}.
     *
     * @return A {@link PollerFlux} that polls the recognize receipt operation until it has completed, has failed,
     * or has been cancelled. The completed operation returns a List of {@link RecognizedReceipt}.
     * @throws FormRecognizerException If recognize operation fails and the {@link AnalyzeOperationResult} returned with
     * an {@link OperationStatus#FAILED}.
     * @throws NullPointerException If {@code receipt} is {@code null}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PollerFlux<OperationResult, List<RecognizedReceipt>> beginRecognizeReceipts(
        Flux<ByteBuffer> receipt, long length, FormContentType formContentType) {
        return beginRecognizeReceipts(new RecognizeOptions(receipt, length).setFormContentType(formContentType));
    }

    /**
     * Recognizes receipt data from documents using optical character recognition (OCR)
     * and a prebuilt receipt trained model.
     * <p>The service does not support cancellation of the long running operation and returns with an
     * error message indicating absence of cancellation support.</p>
     * See <a href="https://aka.ms/azsdk/python/formrecognizer/receiptfields">here</a> for fields found on a receipt.
     *
     * Note that the {@code data} passed must be replayable if retries are enabled (the default). In other words, the
     * {@code Flux} must produce the same data each time it is subscribed to.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.ai.formrecognizer.FormRecognizerAsyncClient.beginRecognizeReceipts#recognizeOptions}
     *
     * @param recognizeOptions The configurable {@code RecognizeOptions options} that may be passed when recognizing
     * receipt data on the provided receipt document.
     *
     * @return A {@link PollerFlux} that polls the recognize receipt operation until it has completed, has failed,
     * or has been cancelled. The completed operation returns a List of {@link RecognizedReceipt}.
     * @throws FormRecognizerException If recognize operation fails and the {@link AnalyzeOperationResult} returned with
     * an {@link OperationStatus#FAILED}.
     * @throws NullPointerException If {@code recognizeOptions} is {@code null}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PollerFlux<OperationResult, List<RecognizedReceipt>>
        beginRecognizeReceipts(RecognizeOptions recognizeOptions) {
        try {
            Objects.requireNonNull(recognizeOptions,
                "'recognizeOptions' is required and cannot be null.");
            if (recognizeOptions.getFormUrl() != null) {
                return beginRecognizeReceiptsFromUrl(recognizeOptions);
            }
            Flux<ByteBuffer> buffer = getByteBufferFlux(recognizeOptions.getForm(), recognizeOptions.getFormData());
            return new PollerFlux<>(
                recognizeOptions.getPollInterval(),
                receiptStreamActivationOperation(buffer, recognizeOptions.getLength(),
                    recognizeOptions.getFormContentType(), recognizeOptions.isIncludeFieldElements()),
                extractReceiptPollOperation(),
                (activationResponse, context) -> monoError(logger,
                    new RuntimeException("Cancellation is not supported")),
                fetchExtractReceiptResult(recognizeOptions.isIncludeFieldElements()));
        } catch (RuntimeException ex) {
            return PollerFlux.error(ex);
        }
    }

    private Function<PollingContext<OperationResult>, Mono<OperationResult>> receiptAnalyzeActivationOperation(
        String receiptUrl, boolean includeFieldElements) {
        return (pollingContext) -> {
            try {
                Objects.requireNonNull(receiptUrl, "'receiptUrl' is required and cannot be null.");
                return service.analyzeReceiptAsyncWithResponseAsync(includeFieldElements,
                    new SourcePath().setSource(receiptUrl))
                    .map(response ->
                        new OperationResult(parseModelId(response.getDeserializedHeaders().getOperationLocation())))
                    .onErrorMap(Utility::mapToHttpResponseExceptionIfExist);
            } catch (RuntimeException ex) {
                return monoError(logger, ex);
            }
        };
    }

    private Function<PollingContext<OperationResult>, Mono<OperationResult>> receiptStreamActivationOperation(
        Flux<ByteBuffer> form, long length, FormContentType formContentType, boolean includeFieldElements) {
        return pollingContext -> {
            try {
                Objects.requireNonNull(form, "'form' is required and cannot be null.");
                if (formContentType != null) {
                    return service.analyzeReceiptAsyncWithResponseAsync(
                        ContentType.fromString(formContentType.toString()), form, length, includeFieldElements)
                        .map(response -> new OperationResult(
                            parseModelId(response.getDeserializedHeaders().getOperationLocation())))
                        .onErrorMap(throwable -> throwable);
                } else {
                    return detectContentType(form)
                        .flatMap(contentType ->
                            service.analyzeReceiptAsyncWithResponseAsync(contentType, form, length,
                                includeFieldElements)
                                .map(response -> new OperationResult(
                                    parseModelId(response.getDeserializedHeaders().getOperationLocation()))))
                        .onErrorMap(Utility::mapToHttpResponseExceptionIfExist);
                }
            } catch (RuntimeException ex) {
                return monoError(logger, ex);
            }
        };
    }

    private Function<PollingContext<OperationResult>, Mono<PollResponse<OperationResult>>>
        extractReceiptPollOperation() {
        return (pollingContext) -> {
            try {
                PollResponse<OperationResult> operationResultPollResponse = pollingContext.getLatestResponse();
                UUID resultUid = UUID.fromString(operationResultPollResponse.getValue().getResultId());
                return service.getAnalyzeReceiptResultWithResponseAsync(resultUid)
                    .flatMap(modelSimpleResponse -> processAnalyzeModelResponse(modelSimpleResponse,
                        operationResultPollResponse));
            } catch (HttpResponseException e) {
                logger.logExceptionAsError(e);
                return Mono.just(new PollResponse<>(LongRunningOperationStatus.FAILED, null));
            }
        };
    }

    private Function<PollingContext<OperationResult>, Mono<List<RecognizedReceipt>>>
        fetchExtractReceiptResult(boolean includeFieldElements) {
        return (pollingContext) -> {
            try {
                final UUID resultUid = UUID.fromString(pollingContext.getLatestResponse().getValue().getResultId());
                return service.getAnalyzeReceiptResultWithResponseAsync(resultUid)
                    .map(modelSimpleResponse -> {
                        throwIfAnalyzeStatusInvalid(modelSimpleResponse.getValue());
                        return toReceipt(modelSimpleResponse.getValue().getAnalyzeResult(), includeFieldElements);
                    })
                    .onErrorMap(Utility::mapToHttpResponseExceptionIfExist);
            } catch (RuntimeException ex) {
                return monoError(logger, ex);
            }
        };
    }

    private Function<PollingContext<OperationResult>, Mono<OperationResult>> contentAnalyzeActivationOperation(
        String formUrl) {
        return (pollingContext) -> {
            try {
                Objects.requireNonNull(formUrl, "'formUrl' is required and cannot be null.");
                return service.analyzeLayoutAsyncWithResponseAsync(new SourcePath().setSource(formUrl))
                    .map(response ->
                        new OperationResult(parseModelId(response.getDeserializedHeaders().getOperationLocation())))
                    .onErrorMap(Utility::mapToHttpResponseExceptionIfExist);
            } catch (RuntimeException ex) {
                return monoError(logger, ex);
            }
        };
    }

    private Function<PollingContext<OperationResult>, Mono<OperationResult>> contentStreamActivationOperation(
        Flux<ByteBuffer> form, long length, FormContentType formContentType) {
        return pollingContext -> {
            try {
                Objects.requireNonNull(form, "'form' is required and cannot be null.");
                if (formContentType != null) {
                    return service.analyzeLayoutAsyncWithResponseAsync(
                        ContentType.fromString(formContentType.toString()), form, length)
                        .map(response -> new OperationResult(parseModelId(
                            response.getDeserializedHeaders().getOperationLocation())))
                        .onErrorMap(Utility::mapToHttpResponseExceptionIfExist);
                } else {
                    return detectContentType(form)
                        .flatMap(contentType ->
                            service.analyzeLayoutAsyncWithResponseAsync(contentType, form, length)
                                .map(response -> new OperationResult(
                                    parseModelId(response.getDeserializedHeaders().getOperationLocation()))))
                        .onErrorMap(Utility::mapToHttpResponseExceptionIfExist);
                }
            } catch (RuntimeException ex) {
                return monoError(logger, ex);
            }
        };
    }

    private Function<PollingContext<OperationResult>, Mono<PollResponse<OperationResult>>>
        extractContentPollOperation() {
        return (pollingContext) -> {
            try {
                PollResponse<OperationResult> operationResultPollResponse = pollingContext.getLatestResponse();
                UUID resultUid = UUID.fromString(operationResultPollResponse.getValue().getResultId());
                return service.getAnalyzeLayoutResultWithResponseAsync(resultUid)
                    .flatMap(modelSimpleResponse -> processAnalyzeModelResponse(modelSimpleResponse,
                        operationResultPollResponse));
            } catch (HttpResponseException e) {
                logger.logExceptionAsError(e);
                return Mono.just(new PollResponse<>(LongRunningOperationStatus.FAILED, null));
            }
        };
    }

    private Function<PollingContext<OperationResult>, Mono<List<FormPage>>>
        fetchExtractContentResult() {
        return (pollingContext) -> {
            try {
                final UUID resultUid = UUID.fromString(pollingContext.getLatestResponse().getValue().getResultId());
                return service.getAnalyzeLayoutResultWithResponseAsync(resultUid)
                    .map(modelSimpleResponse -> {
                        throwIfAnalyzeStatusInvalid(modelSimpleResponse.getValue());
                        return toRecognizedLayout(modelSimpleResponse.getValue().getAnalyzeResult(), true);
                    })
                    .onErrorMap(Utility::mapToHttpResponseExceptionIfExist);
            } catch (RuntimeException ex) {
                return monoError(logger, ex);
            }
        };
    }

    private Function<PollingContext<OperationResult>, Mono<List<RecognizedForm>>>
        fetchAnalyzeFormResultOperation(String modelId, boolean includeFieldElements) {
        return (pollingContext) -> {
            try {
                Objects.requireNonNull(modelId, "'modelId' is required and cannot be null.");
                UUID resultUid = UUID.fromString(pollingContext.getLatestResponse().getValue().getResultId());
                UUID modelUid = UUID.fromString(modelId);
                return service.getAnalyzeFormResultWithResponseAsync(modelUid, resultUid)
                    .map(modelSimpleResponse -> {
                        throwIfAnalyzeStatusInvalid(modelSimpleResponse.getValue());
                        return toRecognizedForm(modelSimpleResponse.getValue().getAnalyzeResult(),
                            includeFieldElements);
                    })
                    .onErrorMap(Utility::mapToHttpResponseExceptionIfExist);
            } catch (RuntimeException ex) {
                return monoError(logger, ex);
            }
        };
    }

    /**
     * Helper method that throws a {@link FormRecognizerException} if {@link AnalyzeOperationResult#getStatus()} is
     * {@link OperationStatus#FAILED}.
     *
     * @param analyzeResponse The response returned from the service.
     */
    private void throwIfAnalyzeStatusInvalid(AnalyzeOperationResult analyzeResponse) {
        if (OperationStatus.FAILED.equals(analyzeResponse.getStatus())) {
            List<ErrorInformation> errorInformationList = analyzeResponse.getAnalyzeResult().getErrors();
            if (!CoreUtils.isNullOrEmpty(errorInformationList)) {
                throw logger.logExceptionAsError(new FormRecognizerException("Analyze operation failed",
                    errorInformationList));
            }
        }
    }

    private Function<PollingContext<OperationResult>, Mono<PollResponse<OperationResult>>>
        createAnalyzeFormPollOperation(String modelId) {
        return (pollingContext) -> {
            try {
                PollResponse<OperationResult> operationResultPollResponse = pollingContext.getLatestResponse();
                Objects.requireNonNull(modelId, "'modelId' is required and cannot be null.");
                UUID resultUid = UUID.fromString(operationResultPollResponse.getValue().getResultId());
                UUID modelUid = UUID.fromString(modelId);
                return service.getAnalyzeFormResultWithResponseAsync(modelUid, resultUid)
                    .flatMap(modelSimpleResponse -> processAnalyzeModelResponse(modelSimpleResponse,
                        operationResultPollResponse))
                    .onErrorMap(Utility::mapToHttpResponseExceptionIfExist);
            } catch (HttpResponseException e) {
                logger.logExceptionAsError(e);
                return Mono.just(new PollResponse<>(LongRunningOperationStatus.FAILED, null));
            }
        };
    }

    private Function<PollingContext<OperationResult>, Mono<OperationResult>> analyzeFormActivationOperation(
        String formUrl, String modelId, boolean includeFieldElements) {
        return (pollingContext) -> {
            try {
                Objects.requireNonNull(formUrl, "'formUrl' is required and cannot be null.");
                Objects.requireNonNull(modelId, "'modelId' is required and cannot be null.");
                return service.analyzeWithCustomModelWithResponseAsync(UUID.fromString(modelId), includeFieldElements,
                    new SourcePath().setSource(formUrl))
                    .map(response ->
                        new OperationResult(parseModelId(response.getDeserializedHeaders().getOperationLocation())))
                    .onErrorMap(Utility::mapToHttpResponseExceptionIfExist);
            } catch (RuntimeException ex) {
                return monoError(logger, ex);
            }
        };
    }

    private Function<PollingContext<OperationResult>, Mono<OperationResult>> analyzeFormStreamActivationOperation(
        Flux<ByteBuffer> form, String modelId, long length, FormContentType formContentType,
        boolean includeFieldElements) {

        return pollingContext -> {
            try {
                Objects.requireNonNull(form, "'form' is required and cannot be null.");
                Objects.requireNonNull(modelId, "'modelId' is required and cannot be null.");
                if (formContentType != null) {
                    return service.analyzeWithCustomModelWithResponseAsync(UUID.fromString(modelId),
                        ContentType.fromString(formContentType.toString()), form, length, includeFieldElements)
                        .map(response -> new OperationResult(parseModelId(
                            response.getDeserializedHeaders().getOperationLocation())))
                        .onErrorMap(Utility::mapToHttpResponseExceptionIfExist);
                } else {
                    return detectContentType(form)
                        .flatMap(contentType ->
                            service.analyzeWithCustomModelWithResponseAsync(UUID.fromString(modelId), contentType, form,
                                length, includeFieldElements)
                                .map(response -> new OperationResult(
                                    parseModelId(response.getDeserializedHeaders().getOperationLocation()))))
                        .onErrorMap(Utility::mapToHttpResponseExceptionIfExist);
                }
            } catch (RuntimeException ex) {
                return monoError(logger, ex);
            }
        };
    }

    private static Mono<PollResponse<OperationResult>> processAnalyzeModelResponse(
        SimpleResponse<AnalyzeOperationResult> analyzeOperationResultSimpleResponse,
        PollResponse<OperationResult> operationResultPollResponse) {
        LongRunningOperationStatus status;
        switch (analyzeOperationResultSimpleResponse.getValue().getStatus()) {
            case NOT_STARTED:
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

    private static Flux<ByteBuffer> getByteBufferFlux(InputStream form, Flux<ByteBuffer> formData) {
        Flux<ByteBuffer> buffer;
        if (form != null) {
            buffer = Utility.toFluxByteBuffer(form);
        } else {
            buffer = formData;
        }
        return buffer;
    }
}
