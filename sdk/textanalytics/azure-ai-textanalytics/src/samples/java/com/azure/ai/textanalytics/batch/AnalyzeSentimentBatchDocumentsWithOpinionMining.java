// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.textanalytics.batch;

import com.azure.ai.textanalytics.TextAnalyticsClient;
import com.azure.ai.textanalytics.TextAnalyticsClientBuilder;
import com.azure.ai.textanalytics.models.AnalyzeSentimentOptions;
import com.azure.ai.textanalytics.models.AspectSentiment;
import com.azure.ai.textanalytics.models.DocumentSentiment;
import com.azure.ai.textanalytics.models.OpinionSentiment;
import com.azure.ai.textanalytics.models.SentimentConfidenceScores;
import com.azure.ai.textanalytics.models.TextDocumentBatchStatistics;
import com.azure.ai.textanalytics.models.TextDocumentInput;
import com.azure.ai.textanalytics.util.AnalyzeSentimentResultCollection;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Sample demonstrates how to analyze the sentiments of {@link TextDocumentInput} documents with opinion mining.
 */
public class AnalyzeSentimentBatchDocumentsWithOpinionMining {
    /**
     * Main method to invoke this demo about how to analyze the sentiments of {@link TextDocumentInput} documents.
     *
     * @param args Unused arguments to the program.
     */
    public static void main(String[] args) {
        // Instantiate a client that will be used to call the service.
        TextAnalyticsClient client = new TextAnalyticsClientBuilder()
            .credential(new AzureKeyCredential("{key}"))
            .endpoint("{endpoint}")
            .buildClient();

        // The texts that need be analyzed.
        List<TextDocumentInput> documents = Arrays.asList(
            new TextDocumentInput("A", "Great atmosphere. Close to plenty of restaurants, hotels, and transit! Staff are friendly and helpful.").setLanguage("en"),
            new TextDocumentInput("B", "Bad atmosphere. Not close to plenty of restaurants, hotels, and transit! Staff are not friendly and helpful.").setLanguage("en")
        );

        AnalyzeSentimentOptions options = new AnalyzeSentimentOptions()
            .setIncludeOpinionMining(true).setIncludeStatistics(true).setModelVersion("latest");

        // Analyzing sentiment for each document in a batch of documents
        Response<AnalyzeSentimentResultCollection> sentimentBatchResultResponse =
            client.analyzeSentimentBatchWithResponse(documents, options, Context.NONE);

        // Response's status code
        System.out.printf("Status code of request response: %d%n", sentimentBatchResultResponse.getStatusCode());
        AnalyzeSentimentResultCollection sentimentBatchResultCollection = sentimentBatchResultResponse.getValue();

        // Model version
        System.out.printf("Results of Azure Text Analytics \"Sentiment Analysis\" Model, version: %s%n", sentimentBatchResultCollection.getModelVersion());

        // Batch statistics
        TextDocumentBatchStatistics batchStatistics = sentimentBatchResultCollection.getStatistics();
        System.out.printf("Documents statistics: document count = %s, erroneous document count = %s, transaction count = %s, valid document count = %s.%n",
            batchStatistics.getDocumentCount(), batchStatistics.getInvalidDocumentCount(), batchStatistics.getTransactionCount(), batchStatistics.getValidDocumentCount());

        // Analyzed sentiment for each document in a batch of documents
        AtomicInteger counter = new AtomicInteger();
        sentimentBatchResultCollection.forEach(analyzeSentimentResult -> {
            System.out.printf("%n%s%n", documents.get(counter.getAndIncrement()));
            if (analyzeSentimentResult.isError()) {
                // Erroneous document
                System.out.printf("Cannot analyze sentiment. Error: %s%n", analyzeSentimentResult.getError().getMessage());
            } else {
                // Valid document
                DocumentSentiment documentSentiment = analyzeSentimentResult.getDocumentSentiment();
                SentimentConfidenceScores scores = documentSentiment.getConfidenceScores();
                System.out.printf("Analyzed document sentiment: %s, positive score: %f, neutral score: %f, negative score: %f.%n",
                    documentSentiment.getSentiment(), scores.getPositive(), scores.getNeutral(), scores.getNegative());
                documentSentiment.getSentences().forEach(sentenceSentiment -> {
                    SentimentConfidenceScores sentenceScores = sentenceSentiment.getConfidenceScores();
                    System.out.printf("\tSentence sentiment: %s, positive score: %f, neutral score: %f, negative score: %f.%n",
                        sentenceSentiment.getSentiment(), sentenceScores.getPositive(), sentenceScores.getNeutral(), sentenceScores.getNegative());
                    sentenceSentiment.getMinedOpinions().forEach(minedOpinions -> {
                        AspectSentiment aspectSentiment = minedOpinions.getAspect();
                        System.out.printf("\t\tAspect sentiment: %s, aspect text: %s%n", aspectSentiment.getSentiment(),
                            aspectSentiment.getText());
                        for (OpinionSentiment opinionSentiment : minedOpinions.getOpinions()) {
                            System.out.printf("\t\t\t'%s' opinion sentiment because of \"%s\". Is the aspect negated: %s.%n",
                                opinionSentiment.getSentiment(), opinionSentiment.getText(), opinionSentiment.isNegated());
                        }
                    });
                });
            }
        });
    }
}
