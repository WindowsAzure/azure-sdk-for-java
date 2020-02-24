// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.textanalytics.batch;

import com.azure.ai.textanalytics.TextAnalyticsClient;
import com.azure.ai.textanalytics.TextAnalyticsClientBuilder;
import com.azure.ai.textanalytics.models.ExtractKeyPhraseResult;
import com.azure.ai.textanalytics.models.TextAnalyticsPagedResponse;
import com.azure.ai.textanalytics.models.TextAnalyticsRequestOptions;
import com.azure.ai.textanalytics.models.TextAnalyticsApiKeyCredential;
import com.azure.ai.textanalytics.models.TextDocumentBatchStatistics;
import com.azure.ai.textanalytics.models.TextDocumentInput;
import com.azure.core.util.Context;

import java.util.Arrays;
import java.util.List;

/**
 * Sample demonstrates how to extract the key phrases of a batch input text.
 */
public class ExtractKeyPhrasesBatchDocuments {
    /**
     * Main method to invoke this demo about how to extract the key phrases of a batch input text.
     *
     * @param args Unused arguments to the program.
     */
    public static void main(String[] args) {
        // Instantiate a client that will be used to call the service.
        TextAnalyticsClient client = new TextAnalyticsClientBuilder()
            .apiKey(new TextAnalyticsApiKeyCredential("b2f8b7b697c348dcb0e30055d49f3d0f"))
            .endpoint("https://javatextanalyticstestresources.cognitiveservices.azure.com/")
            .buildClient();

        // The texts that need be analyzed.
        List<TextDocumentInput> inputs = Arrays.asList(
            new TextDocumentInput("1", "My cat might need to see a veterinarian.", "en"),
            new TextDocumentInput("2", "The pitot tube is used to measure airspeed.", "en")
        );

        // Request options: show statistics and model version
        final TextAnalyticsRequestOptions requestOptions = new TextAnalyticsRequestOptions().setShowStatistics(true);

        // Extracting batch key phrases
        final Iterable<TextAnalyticsPagedResponse<ExtractKeyPhraseResult>> extractedBatchResult =
            client.extractKeyPhrasesBatch(inputs, requestOptions, Context.NONE).iterableByPage();

        for (TextAnalyticsPagedResponse<ExtractKeyPhraseResult> textAnalyticsPagedResponse : extractedBatchResult) {
            System.out.printf("Model version: %s%n", textAnalyticsPagedResponse.getModelVersion());

            // Batch statistics
            final TextDocumentBatchStatistics batchStatistics = textAnalyticsPagedResponse.getStatistics();
            System.out.printf("A batch of document statistics, document count: %s, erroneous document count: %s, transaction count: %s, valid document count: %s.%n",
                batchStatistics.getDocumentCount(),
                batchStatistics.getInvalidDocumentCount(),
                batchStatistics.getTransactionCount(),
                batchStatistics.getValidDocumentCount());

            // Extracted key phrase for each of document from a batch of documents
            for (ExtractKeyPhraseResult extractKeyPhraseResult : textAnalyticsPagedResponse.getElements()) {
                System.out.printf("%nDocument ID: %s%n", extractKeyPhraseResult.getId());
                System.out.printf("Input text: %s%n", extractKeyPhraseResult.getInputText());
                // Erroneous document
                if (extractKeyPhraseResult.isError()) {
                    System.out.printf("Cannot extract key phrases. Error: %s%n", extractKeyPhraseResult.getError().getMessage());
                    continue;
                }
                // Valid document
                System.out.println("Extracted phrases:");
                for (String keyPhrases : extractKeyPhraseResult.getKeyPhrases()) {
                    System.out.printf("%s.%n", keyPhrases);
                }
            }
        }
    }
}
