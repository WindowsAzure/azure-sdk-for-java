// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.textanalytics.batch;

import com.azure.ai.textanalytics.TextAnalyticsClient;
import com.azure.ai.textanalytics.TextAnalyticsClientBuilder;
import com.azure.ai.textanalytics.models.DocumentResultCollection;
import com.azure.ai.textanalytics.models.LinkedEntityResult;
import com.azure.ai.textanalytics.models.TextAnalyticsRequestOptions;
import com.azure.ai.textanalytics.models.TextBatchStatistics;
import com.azure.ai.textanalytics.models.TextDocumentInput;
import com.azure.core.util.Configuration;
import com.azure.core.util.Context;

import java.util.Arrays;
import java.util.List;

public class RecognizeLinkedEntitiesBatchDocuments {

    public static void main(String[] args) {
        // Instantiate a client that will be used to call the service.
        TextAnalyticsClient client = new TextAnalyticsClientBuilder()
//            .subscriptionKey("subscription-key")
//            .endpoint("https://servicename.cognitiveservices.azure.com/")
            .subscriptionKey(Configuration.getGlobalConfiguration().get("AZURE_TEXT_ANALYTICS_SUBSCRIPTION_KEY"))
            .endpoint(Configuration.getGlobalConfiguration().get("AZURE_TEXT_ANALYTICS_ENDPOINT"))
            .buildClient();

        // The texts that need be analysed.
        List<TextDocumentInput> inputs = Arrays.asList(
            new TextDocumentInput("1", "Old Faithful is a geyser at Yellowstone Park.", "en"),
            new TextDocumentInput("2", "Mount Shasta has lenticular clouds.", "en")
        );

        final TextAnalyticsRequestOptions requestOptions = new TextAnalyticsRequestOptions().setShowStatistics(true);
        final DocumentResultCollection<LinkedEntityResult> detectedBatchResult = client.recognizeBatchLinkedEntitiesWithResponse(inputs, requestOptions, Context.NONE).getValue();
        System.out.printf("Model version: %s", detectedBatchResult.getModelVersion());

        final TextBatchStatistics batchStatistics = detectedBatchResult.getStatistics();
        System.out.printf("A batch of document statistics, document count: %s, erroneous document count: %s, transaction count: %s, valid document count: %s",
            batchStatistics.getDocumentsCount(),
            batchStatistics.getErroneousDocumentsCount(),
            batchStatistics.getTransactionsCount(),
            batchStatistics.getValidDocumentsCount());

        // Detecting language from a batch of documents
        detectedBatchResult.forEach(linkedEntityDocumentResult ->
            linkedEntityDocumentResult.getLinkedEntities().stream().forEach(linkedEntity ->
                System.out.printf("Recognized Linked NamedEntity: %s, URL: %s, Data Source: %s",
                    linkedEntity.getName(), linkedEntity.getUri(), linkedEntity.getDataSource())));
    }
}
