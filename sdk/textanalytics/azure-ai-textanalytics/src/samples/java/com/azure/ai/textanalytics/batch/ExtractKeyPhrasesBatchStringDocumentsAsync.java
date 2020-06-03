// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.textanalytics.batch;

import com.azure.ai.textanalytics.TextAnalyticsAsyncClient;
import com.azure.ai.textanalytics.TextAnalyticsClientBuilder;
import com.azure.ai.textanalytics.models.ExtractKeyPhraseResult;
import com.azure.ai.textanalytics.models.TextAnalyticsRequestOptions;
import com.azure.ai.textanalytics.models.TextDocumentBatchStatistics;
import com.azure.core.credential.AzureKeyCredential;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Sample demonstrates how to asynchronously extract the key phrases of {@code String} documents.
 */
public class ExtractKeyPhrasesBatchStringDocumentsAsync {
    /**
     * Main method to invoke this demo about how to extract the key phrases of {@code String} documents.
     *
     * @param args Unused arguments to the program.
     */
    public static void main(String[] args) {
        // Instantiate a client that will be used to call the service.
        TextAnalyticsAsyncClient client = new TextAnalyticsClientBuilder()
            .credential(new AzureKeyCredential("{key}"))
            .endpoint("{endpoint}")
            .buildAsyncClient();

        // The texts that need be analyzed.
        List<String> documents = Arrays.asList(
            "My cat might need to see a veterinarian.",
            "The pitot tube is used to measure airspeed."
        );

        // Request options: show statistics and model version
        TextAnalyticsRequestOptions requestOptions = new TextAnalyticsRequestOptions().setIncludeStatistics(true).setModelVersion("latest");

        // Extracting key phrases for each document in a batch of documents
        AtomicInteger counter = new AtomicInteger();
        client.extractKeyPhrasesBatch(documents, "en", requestOptions).subscribe(
            keyPhrasesBatchResultCollection -> {
                // Model version
                System.out.printf("Results of Azure Text Analytics \"Key Phrases Extraction\" Model, version: %s%n", keyPhrasesBatchResultCollection.getModelVersion());

                // Batch statistics
                TextDocumentBatchStatistics batchStatistics = keyPhrasesBatchResultCollection.getStatistics();
                System.out.printf("Documents statistics: document count = %s, erroneous document count = %s, transaction count = %s, valid document count = %s.%n",
                    batchStatistics.getDocumentCount(), batchStatistics.getInvalidDocumentCount(), batchStatistics.getTransactionCount(), batchStatistics.getValidDocumentCount());

                // Extracted key phrases for each document in a batch of documents
                for (ExtractKeyPhraseResult extractKeyPhraseResult : keyPhrasesBatchResultCollection) {
                    System.out.printf("%nText = %s%n", documents.get(counter.getAndIncrement()));
                    if (extractKeyPhraseResult.isError()) {
                        // Erroneous document
                        System.out.printf("Cannot extract key phrases. Error: %s%n", extractKeyPhraseResult.getError().getMessage());
                    } else {
                        // Valid document
                        System.out.println("Extracted phrases:");
                        extractKeyPhraseResult.getKeyPhrases().forEach(keyPhrases -> System.out.printf("\t%s.%n", keyPhrases));
                    }
                }
            },
            error -> System.err.println("There was an error extracting key phrases of the documents." + error),
            () -> System.out.println("Batch of key phrases extracted."));

        // The .subscribe() creation and assignment is not a blocking call. For the purpose of this example, we sleep
        // the thread so the program does not end before the send operation is complete. Using .block() instead of
        // .subscribe() will turn this into a synchronous call.
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException ignored) {
        }
    }
}
