// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.textanalytics;

import com.azure.ai.textanalytics.implementation.TextAnalyticsClientImpl;
import com.azure.ai.textanalytics.implementation.models.DocumentError;
import com.azure.ai.textanalytics.implementation.models.DocumentKeyPhrases;
import com.azure.ai.textanalytics.implementation.models.KeyPhraseResult;
import com.azure.ai.textanalytics.implementation.models.MultiLanguageBatchInput;
import com.azure.ai.textanalytics.models.ExtractKeyPhraseResult;
import com.azure.ai.textanalytics.models.KeyPhrasesCollection;
import com.azure.ai.textanalytics.models.TextAnalyticsError;
import com.azure.ai.textanalytics.models.TextAnalyticsErrorCode;
import com.azure.ai.textanalytics.models.TextAnalyticsException;
import com.azure.ai.textanalytics.models.TextAnalyticsRequestOptions;
import com.azure.ai.textanalytics.models.TextAnalyticsResultCollection;
import com.azure.ai.textanalytics.models.TextAnalyticsWarning;
import com.azure.ai.textanalytics.models.TextDocumentInput;
import com.azure.ai.textanalytics.models.WarningCode;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.IterableStream;
import com.azure.core.util.logging.ClientLogger;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static com.azure.ai.textanalytics.TextAnalyticsAsyncClient.COGNITIVE_TRACING_NAMESPACE_VALUE;
import static com.azure.ai.textanalytics.Transforms.toBatchStatistics;
import static com.azure.ai.textanalytics.Transforms.toMultiLanguageInput;
import static com.azure.ai.textanalytics.Transforms.toTextAnalyticsError;
import static com.azure.ai.textanalytics.Transforms.toTextAnalyticsException;
import static com.azure.ai.textanalytics.Transforms.toTextDocumentStatistics;
import static com.azure.ai.textanalytics.implementation.Utility.getEmptyErrorIdHttpResponse;
import static com.azure.ai.textanalytics.implementation.Utility.inputDocumentsValidation;
import static com.azure.ai.textanalytics.implementation.Utility.mapToHttpResponseExceptionIfExist;
import static com.azure.core.util.FluxUtil.monoError;
import static com.azure.core.util.FluxUtil.withContext;
import static com.azure.core.util.tracing.Tracer.AZ_TRACING_NAMESPACE_KEY;

/**
 * Helper class for managing extract key phrase endpoint.
 */
class ExtractKeyPhraseAsyncClient {
    private final ClientLogger logger = new ClientLogger(ExtractKeyPhraseAsyncClient.class);
    private final TextAnalyticsClientImpl service;

    /**
     * Create an {@link ExtractKeyPhraseAsyncClient} that sends requests to the Text Analytics services's extract
     * keyphrase endpoint.
     *
     * @param service The proxy service used to perform REST calls.
     */
    ExtractKeyPhraseAsyncClient(TextAnalyticsClientImpl service) {
        this.service = service;
    }

    /**
     * Helper function for calling service with max overloaded parameters that returns a {@link KeyPhrasesCollection}.
     *
     * @param document A document.
     * @param language The language code.
     *
     * @return The {@link Mono} of {@link KeyPhrasesCollection} extracted key phrases strings.
     */
    Mono<KeyPhrasesCollection> extractKeyPhrasesSingleText(String document, String language) {
        try {
            Objects.requireNonNull(document, "'document' cannot be null.");
            final TextDocumentInput textDocumentInput = new TextDocumentInput("0", document);
            textDocumentInput.setLanguage(language);
            return extractKeyPhrasesWithResponse(Collections.singletonList(textDocumentInput), null)
                    .map(keyPhraseResultCollection -> {
                        for (ExtractKeyPhraseResult keyPhraseResult : keyPhraseResultCollection.getValue()) {
                            if (keyPhraseResult.isError()) {
                                throw logger.logExceptionAsError(toTextAnalyticsException(keyPhraseResult.getError()));
                            }
                            return new KeyPhrasesCollection(keyPhraseResult.getKeyPhrases(),
                                keyPhraseResult.getKeyPhrases().getWarnings());
                        }
                        // this step should never be executed, if executed, we get an empty collection above.
                        throw logger.logExceptionAsError(
                            new TextAnalyticsException("None key Phrases extracted.",
                                TextAnalyticsErrorCode.fromString("NoneKeyPhrasesExtracted").toString(), null));
                    });
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Helper function for calling service with max overloaded parameters with {@link Response}.
     *
     * @param documents A list of documents to extract key phrases for.
     * @param options The {@link TextAnalyticsRequestOptions} request options.
     *
     * @return A mono {@link Response} that contains {@link TextAnalyticsResultCollection} of
     *  {@link ExtractKeyPhraseResult}.
     */
    Mono<Response<TextAnalyticsResultCollection<ExtractKeyPhraseResult>>> extractKeyPhrasesWithResponse(
        Iterable<TextDocumentInput> documents, TextAnalyticsRequestOptions options) {
        try {
            inputDocumentsValidation(documents);
            return withContext(context -> getExtractedKeyPhrasesResponse(documents, options, context));
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Helper function for calling service with max overloaded parameters that returns a {@link Response}
     * which contains {@link TextAnalyticsResultCollection} of {@link ExtractKeyPhraseResult}.
     *
     * @param documents A list of documents to extract key phrases for.
     * @param options The {@link TextAnalyticsRequestOptions} request options.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     *
     * @return A mono {@link Response} which contains {@link TextAnalyticsResultCollection} of
     *  {@link ExtractKeyPhraseResult}.
     */
    Mono<Response<TextAnalyticsResultCollection<ExtractKeyPhraseResult>>> extractKeyPhrasesBatchWithContext(
        Iterable<TextDocumentInput> documents, TextAnalyticsRequestOptions options, Context context) {
        try {
            inputDocumentsValidation(documents);
            return getExtractedKeyPhrasesResponse(documents, options, context);
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Helper method to convert the service response of {@link KeyPhraseResult} to {@link Response}
     * which contains {@link TextAnalyticsResultCollection} of {@link ExtractKeyPhraseResult}.
     *
     * @param response the {@link SimpleResponse} returned by the service.
     *
     * @return A {@link Response} which contains {@link TextAnalyticsResultCollection} of
     *  {@link ExtractKeyPhraseResult}.
     */
    private Response<TextAnalyticsResultCollection<ExtractKeyPhraseResult>> toTextAnalyticsResultCollectionResponse(
        final SimpleResponse<KeyPhraseResult> response) {
        final KeyPhraseResult keyPhraseResult = response.getValue();
        // List of documents results
        final List<ExtractKeyPhraseResult> keyPhraseResultList = new ArrayList<>();
        for (DocumentKeyPhrases documentKeyPhrases : keyPhraseResult.getDocuments()) {
            final String documentId = documentKeyPhrases.getId();
            keyPhraseResultList.add(new ExtractKeyPhraseResult(
                documentId,
                documentKeyPhrases.getStatistics() == null ? null
                    : toTextDocumentStatistics(documentKeyPhrases.getStatistics()), null,
                new KeyPhrasesCollection(
                    new IterableStream<>(documentKeyPhrases.getKeyPhrases()),
                    new IterableStream<>(documentKeyPhrases.getWarnings().stream().map(warning ->
                        new TextAnalyticsWarning(WarningCode.fromString(warning.getCode().toString()),
                            warning.getMessage()))
                        .collect(Collectors.toList())))));
        }
        // Document errors
        for (DocumentError documentError : keyPhraseResult.getErrors()) {
            /*
             *  TODO: Remove this after service update to throw exception.
             *  Currently, service sets max limit of document size to 5, if the input documents size > 5, it will
             *  have an id = "", empty id. In the future, they will remove this and throw HttpResponseException.
             */
            if (documentError.getId().isEmpty()) {
                throw logger.logExceptionAsError(
                    new HttpResponseException(documentError.getError().getInnererror().getMessage(),
                    getEmptyErrorIdHttpResponse(response), documentError.getError().getInnererror().getCode()));
            }

            final TextAnalyticsError error = toTextAnalyticsError(documentError.getError());
            final String documentId = documentError.getId();
            keyPhraseResultList.add(new ExtractKeyPhraseResult(
                documentId, null, error, null));
        }

        return new SimpleResponse<>(response,
            new TextAnalyticsResultCollection<>(keyPhraseResultList, keyPhraseResult.getModelVersion(),
                keyPhraseResult.getStatistics() == null ? null
                    : toBatchStatistics(keyPhraseResult.getStatistics())));
    }

    /**
     * Call the service with REST response, convert to a {@link Mono} of {@link Response} which contains
     * {@link TextAnalyticsResultCollection} of {@link ExtractKeyPhraseResult} from a {@link SimpleResponse}
     * of {@link KeyPhraseResult}.
     *
     * @param documents A list of documents to extract key phrases for.
     * @param options The {@link TextAnalyticsRequestOptions} request options.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     *
     * @return A mono {@link Response} that contains {@link TextAnalyticsResultCollection} of
     *  {@link ExtractKeyPhraseResult}.
     */
    private Mono<Response<TextAnalyticsResultCollection<ExtractKeyPhraseResult>>> getExtractedKeyPhrasesResponse(
        Iterable<TextDocumentInput> documents, TextAnalyticsRequestOptions options, Context context) {
        return service.keyPhrasesWithResponseAsync(
            new MultiLanguageBatchInput().setDocuments(toMultiLanguageInput(documents)),
            context.addData(AZ_TRACING_NAMESPACE_KEY, COGNITIVE_TRACING_NAMESPACE_VALUE),
            options == null ? null : options.getModelVersion(),
            options == null ? null : options.isIncludeStatistics())
            .doOnSubscribe(ignoredValue -> logger.info("A batch of document - {}", documents.toString()))
            .doOnSuccess(response -> logger.info("A batch of key phrases output - {}", response.getValue()))
            .doOnError(error -> logger.warning("Failed to extract key phrases - {}", error))
            .map(this::toTextAnalyticsResultCollectionResponse)
            .onErrorMap(throwable -> mapToHttpResponseExceptionIfExist(throwable));
    }
}
