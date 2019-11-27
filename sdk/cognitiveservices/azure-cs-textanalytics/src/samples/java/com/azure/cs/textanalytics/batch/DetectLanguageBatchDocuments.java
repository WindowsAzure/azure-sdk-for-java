// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cs.textanalytics.batch;

import com.azure.cs.textanalytics.TextAnalyticsClient;
import com.azure.cs.textanalytics.TextAnalyticsClientBuilder;
import com.azure.cs.textanalytics.models.DetectLanguageInput;
import com.azure.cs.textanalytics.models.DetectedLanguage;
import com.azure.cs.textanalytics.models.DetectedLanguageResult;
import com.azure.cs.textanalytics.models.TextBatchStatistics;
import com.azure.cs.textanalytics.models.DocumentResultCollection;
import com.azure.cs.textanalytics.models.TextAnalyticsRequestOptions;

import java.util.Arrays;
import java.util.List;

public class DetectLanguageBatchDocuments {

    public static void main(String[] args) {
        // TODO: user AAD token to do the authentication
        // Instantiate a client that will be used to call the service.
        TextAnalyticsClient client = new TextAnalyticsClientBuilder()
            .buildClient();

        // The texts that need be analysed.
        List<DetectLanguageInput> inputs = Arrays.asList(
            new DetectLanguageInput("1", "This is written in English").setCountryHint("US"),
            new DetectLanguageInput("2", "Este es un document escrito en Español.").setCountryHint("es")
        );

        final TextAnalyticsRequestOptions requestOptions = new TextAnalyticsRequestOptions().setShowStatistics(true).setModelVersion("1.0");
        final DocumentResultCollection<DetectedLanguageResult> detectedBatchResult = client.detectLanguages(inputs, requestOptions);
        System.out.printf("Model version: %s", detectedBatchResult.getModelVersion());

        final TextBatchStatistics batchStatistics = detectedBatchResult.getBatchStatistics();
        System.out.printf("A batch of document statistics, document count: %s, erroneous document count: %s, transaction count: %s, valid document count: %s",
            batchStatistics.getDocumentCount(),
            batchStatistics.getErroneousDocumentCount(),
            batchStatistics.getTransactionsCount(),
            batchStatistics.getValidDocumentCount());


        // Detecting languages for a document from a batch of documents
        detectedBatchResult.stream().forEach(result -> {
            final DetectedLanguage detectedPrimaryLanguage = result.getPrimaryLanguage();
            System.out.printf("Detected primary Language: %s, ISO 6391 Name: %s, Score: %s",
                detectedPrimaryLanguage.getName(),
                detectedPrimaryLanguage.getIso6391Name(),
                detectedPrimaryLanguage.getScore());

            result.getDetectedLanguages().forEach(detectedLanguage ->
                System.out.printf("Detected primary Language: %s, ISO 6391 Name: %s, Score: %s",
                    detectedLanguage.getName(),
                    detectedLanguage.getIso6391Name(),
                    detectedLanguage.getScore()));
        });
    }

}
