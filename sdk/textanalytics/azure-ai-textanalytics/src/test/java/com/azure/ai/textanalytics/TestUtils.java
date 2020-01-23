// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.textanalytics;

import com.azure.ai.textanalytics.models.AnalyzeSentimentResult;
import com.azure.ai.textanalytics.models.DetectLanguageInput;
import com.azure.ai.textanalytics.models.DetectLanguageResult;
import com.azure.ai.textanalytics.models.DetectedLanguage;
import com.azure.ai.textanalytics.models.DocumentResultCollection;
import com.azure.ai.textanalytics.models.ExtractKeyPhraseResult;
import com.azure.ai.textanalytics.models.LinkedEntity;
import com.azure.ai.textanalytics.models.LinkedEntityMatch;
import com.azure.ai.textanalytics.models.NamedEntity;
import com.azure.ai.textanalytics.models.RecognizeEntitiesResult;
import com.azure.ai.textanalytics.models.RecognizeLinkedEntitiesResult;
import com.azure.ai.textanalytics.models.RecognizePiiEntitiesResult;
import com.azure.ai.textanalytics.models.TextDocumentBatchStatistics;
import com.azure.ai.textanalytics.models.TextDocumentInput;
import com.azure.ai.textanalytics.models.TextDocumentStatistics;
import com.azure.ai.textanalytics.models.TextSentiment;
import com.azure.ai.textanalytics.models.TextSentimentClass;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Contains helper methods for generating inputs for test methods
 */
final class TestUtils {
    private static final String DEFAULT_MODEL_VERSION = "2019-10-01";
    static final Duration TIMEOUT = Duration.ofSeconds(30);

    static final List<String> SENTIMENT_INPUTS = Arrays.asList("The hotel was dark and unclean. The restaurant had amazing gnocchi.",
        "The restaurant had amazing gnocchi. The hotel was dark and unclean.");

    static final List<String> NAMED_ENTITY_INPUTS = Arrays.asList(
        "I had a wonderful trip to Seattle last week.", "I work at Microsoft.");

    static final List<String> LINKED_ENTITY_INPUTS = Arrays.asList(
        "I had a wonderful trip to Seattle last week.",
        "I work at Microsoft.");

    static final List<String> KEY_PHRASE_INPUTS = Arrays.asList(
        "Hello world. This is some input text that I love.",
        "Bonjour tout le monde");

    static final List<String> PII_ENTITY_INPUTS = Arrays.asList(
        "Microsoft employee with ssn 859-98-0987 is using our awesome API's.",
        "Your ABA number - 111000025 - is the first 9 digits in the lower left hand corner of your personal check.");

    static final List<String> DETECT_LANGUAGE_INPUTS = Arrays.asList(
        "This is written in English", "Este es un document escrito en Español.", "~@!~:)");

    static List<DetectLanguageInput> getDetectLanguageInputs() {
        return Arrays.asList(
            new DetectLanguageInput("0", DETECT_LANGUAGE_INPUTS.get(0), "US"),
            new DetectLanguageInput("1", DETECT_LANGUAGE_INPUTS.get(1)),
            new DetectLanguageInput("2", DETECT_LANGUAGE_INPUTS.get(2), "US")
        );
    }

    static List<TextDocumentInput> getTextDocumentNamedEntityInputs() {
        return Arrays.asList(
            new TextDocumentInput("0", NAMED_ENTITY_INPUTS.get(0)),
            new TextDocumentInput("1", NAMED_ENTITY_INPUTS.get(1))
        );
    }

    static List<TextDocumentInput> getTextDocumentPiiInputs() {
        return Arrays.asList(
            new TextDocumentInput("0", TestUtils.PII_ENTITY_INPUTS.get(0)),
            new TextDocumentInput("1", TestUtils.PII_ENTITY_INPUTS.get(1))
        );
    }

    static List<TextDocumentInput> getTextDocumentLinkedEntityInputs() {
        return Arrays.asList(
            new TextDocumentInput("0", TestUtils.LINKED_ENTITY_INPUTS.get(0)),
            new TextDocumentInput("1", TestUtils.LINKED_ENTITY_INPUTS.get(1))
        );
    }


    static List<TextDocumentInput> getTextDocumentKeyPhraseInputs() {
        return Arrays.asList(
            new TextDocumentInput("0", KEY_PHRASE_INPUTS.get(0)),
            new TextDocumentInput("1", KEY_PHRASE_INPUTS.get(1))
        );
    }

    static List<TextDocumentInput> getTextDocumentSentimentInputs() {
        return Arrays.asList(
            new TextDocumentInput("0", TestUtils.SENTIMENT_INPUTS.get(0)),
            new TextDocumentInput("1", TestUtils.SENTIMENT_INPUTS.get(1))
        );
    }

    /**
     * Helper method to get the expected Batch Detected Languages
     */
    static DocumentResultCollection<DetectLanguageResult> getExpectedBatchDetectedLanguages() {
        DetectedLanguage detectedLanguage1 = new DetectedLanguage("English", "en", 1.0);
        DetectedLanguage detectedLanguage2 = new DetectedLanguage("Spanish", "es", 1.0);
        DetectedLanguage detectedLanguage3 = new DetectedLanguage("(Unknown)", "(Unknown)", 0.0);
        List<DetectedLanguage> detectedLanguageList1 = Collections.singletonList(detectedLanguage1);
        List<DetectedLanguage> detectedLanguageList2 = Collections.singletonList(detectedLanguage2);
        List<DetectedLanguage> detectedLanguageList3 = Collections.singletonList(detectedLanguage3);

        TextDocumentStatistics textDocumentStatistics1 = new TextDocumentStatistics(26, 1);
        TextDocumentStatistics textDocumentStatistics2 = new TextDocumentStatistics(39, 1);
        TextDocumentStatistics textDocumentStatistics3 = new TextDocumentStatistics(6, 1);

        DetectLanguageResult detectLanguageResult1 = new DetectLanguageResult("0", textDocumentStatistics1, null, detectedLanguage1, detectedLanguageList1);
        DetectLanguageResult detectLanguageResult2 = new DetectLanguageResult("1", textDocumentStatistics2, null, detectedLanguage2, detectedLanguageList2);
        DetectLanguageResult detectLanguageResult3 = new DetectLanguageResult("2", textDocumentStatistics3, null, detectedLanguage3, detectedLanguageList3);

        TextDocumentBatchStatistics textDocumentBatchStatistics = new TextDocumentBatchStatistics(3, 3, 0, 3);
        List<DetectLanguageResult> detectLanguageResultList = Arrays.asList(detectLanguageResult1, detectLanguageResult2, detectLanguageResult3);

        return new DocumentResultCollection<>(detectLanguageResultList, DEFAULT_MODEL_VERSION, textDocumentBatchStatistics);
    }

    /**
     * Helper method to get the expected Batch Named Entities
     */
    static DocumentResultCollection<RecognizeEntitiesResult> getExpectedBatchNamedEntities() {
        NamedEntity namedEntity1 = new NamedEntity("Seattle", "Location", null, 26, 7, 0.80624294281005859);
        NamedEntity namedEntity2 = new NamedEntity("last week", "DateTime", "DateRange", 34, 9, 0.8);
        NamedEntity namedEntity3 = new NamedEntity("Microsoft", "Organization", null, 10, 9, 0.99983596801757812);

        List<NamedEntity> namedEntityList1 = Arrays.asList(namedEntity1, namedEntity2);
        List<NamedEntity> namedEntityList2 = Collections.singletonList(namedEntity3);

        TextDocumentStatistics textDocumentStatistics1 = new TextDocumentStatistics(44, 1);
        TextDocumentStatistics textDocumentStatistics2 = new TextDocumentStatistics(20, 1);

        RecognizeEntitiesResult recognizeEntitiesResult1 = new RecognizeEntitiesResult("0", textDocumentStatistics1, null, namedEntityList1);
        RecognizeEntitiesResult recognizeEntitiesResult2 = new RecognizeEntitiesResult("1", textDocumentStatistics2, null, namedEntityList2);

        TextDocumentBatchStatistics textDocumentBatchStatistics = new TextDocumentBatchStatistics(2, 2, 0, 2);
        List<RecognizeEntitiesResult> recognizeEntitiesResultList = Arrays.asList(recognizeEntitiesResult1, recognizeEntitiesResult2);

        return new DocumentResultCollection<>(recognizeEntitiesResultList, DEFAULT_MODEL_VERSION, textDocumentBatchStatistics);
    }

    /**
     * Helper method to get the expected Batch PII Entities
     */
    static DocumentResultCollection<RecognizePiiEntitiesResult> getExpectedBatchPiiEntities() {
        NamedEntity namedEntity1 = new NamedEntity("859-98-0987", "U.S. Social Security Number (SSN)", "", 28, 11, 0.65);
        NamedEntity namedEntity2 = new NamedEntity("111000025", "ABA Routing Number", "", 18, 9, 0.75);

        List<NamedEntity> namedEntityList1 = Collections.singletonList(namedEntity1);
        List<NamedEntity> namedEntityList2 = Collections.singletonList(namedEntity2);

        TextDocumentStatistics textDocumentStatistics1 = new TextDocumentStatistics(67, 1);
        TextDocumentStatistics textDocumentStatistics2 = new TextDocumentStatistics(105, 1);

        RecognizePiiEntitiesResult recognizeEntitiesResult1 = new RecognizePiiEntitiesResult("0", textDocumentStatistics1, null, namedEntityList1);
        RecognizePiiEntitiesResult recognizeEntitiesResult2 = new RecognizePiiEntitiesResult("1", textDocumentStatistics2, null, namedEntityList2);

        TextDocumentBatchStatistics textDocumentBatchStatistics = new TextDocumentBatchStatistics(2, 2, 0, 2);
        List<RecognizePiiEntitiesResult> recognizeEntitiesResultList = Arrays.asList(recognizeEntitiesResult1, recognizeEntitiesResult2);

        return new DocumentResultCollection<>(recognizeEntitiesResultList, DEFAULT_MODEL_VERSION, textDocumentBatchStatistics);
    }

    /**
     * Helper method to get the expected Batch Linked Entities
     */
    static DocumentResultCollection<RecognizeLinkedEntitiesResult> getExpectedBatchLinkedEntities() {
        LinkedEntityMatch linkedEntityMatch1 = new LinkedEntityMatch("Seattle", 0.11472424095537814, 7, 26);
        LinkedEntityMatch linkedEntityMatch2 = new LinkedEntityMatch("Microsoft", 0.18693659716732069, 9, 10);

        LinkedEntity linkedEntity1 = new LinkedEntity(
            "Seattle", Collections.singletonList(linkedEntityMatch1),
            "en", "Seattle", "https://en.wikipedia.org/wiki/Seattle",
            "Wikipedia");

        LinkedEntity linkedEntity2 = new LinkedEntity(
            "Microsoft", Collections.singletonList(linkedEntityMatch2),
            "en", "Microsoft", "https://en.wikipedia.org/wiki/Microsoft",
            "Wikipedia");

        List<LinkedEntity> linkedEntityList1 = Collections.singletonList(linkedEntity1);
        List<LinkedEntity> linkedEntityList2 = Collections.singletonList(linkedEntity2);

        TextDocumentStatistics textDocumentStatistics1 = new TextDocumentStatistics(44, 1);
        TextDocumentStatistics textDocumentStatistics2 = new TextDocumentStatistics(20, 1);

        RecognizeLinkedEntitiesResult recognizeLinkedEntitiesResult1 = new RecognizeLinkedEntitiesResult("0", textDocumentStatistics1, null, linkedEntityList1);
        RecognizeLinkedEntitiesResult recognizeLinkedEntitiesResult2 = new RecognizeLinkedEntitiesResult("1", textDocumentStatistics2, null, linkedEntityList2);

        TextDocumentBatchStatistics textDocumentBatchStatistics = new TextDocumentBatchStatistics(2, 2, 0, 2);
        List<RecognizeLinkedEntitiesResult> recognizeLinkedEntitiesResultList = Arrays.asList(recognizeLinkedEntitiesResult1, recognizeLinkedEntitiesResult2);

        return new DocumentResultCollection<>(recognizeLinkedEntitiesResultList, DEFAULT_MODEL_VERSION, textDocumentBatchStatistics);
    }

    /**
     * Helper method to get the expected Batch Key Phrases
     */
    static DocumentResultCollection<ExtractKeyPhraseResult> getExpectedBatchKeyPhrases() {
        List<String> keyPhrasesList1 = Arrays.asList("input text", "world");

        TextDocumentStatistics textDocumentStatistics1 = new TextDocumentStatistics(49, 1);
        TextDocumentStatistics textDocumentStatistics2 = new TextDocumentStatistics(21, 1);

        ExtractKeyPhraseResult extractKeyPhraseResult1 = new ExtractKeyPhraseResult("0", textDocumentStatistics1, null, keyPhrasesList1);
        ExtractKeyPhraseResult extractKeyPhraseResult2 = new ExtractKeyPhraseResult("1", textDocumentStatistics2, null, Collections.singletonList("monde"));

        TextDocumentBatchStatistics textDocumentBatchStatistics = new TextDocumentBatchStatistics(2, 2, 0, 2);
        List<ExtractKeyPhraseResult> extractKeyPhraseResultList = Arrays.asList(extractKeyPhraseResult1, extractKeyPhraseResult2);

        return new DocumentResultCollection<>(extractKeyPhraseResultList, DEFAULT_MODEL_VERSION, textDocumentBatchStatistics);
    }

    /**
     * Helper method to get the expected Batch Text Sentiments
     */
    static DocumentResultCollection<AnalyzeSentimentResult> getExpectedBatchTextSentiment() {
        final TextDocumentStatistics textDocumentStatistics1 = new TextDocumentStatistics(67, 1);
        final TextDocumentStatistics textDocumentStatistics2 = new TextDocumentStatistics(67, 1);

        final TextSentiment expectedDocumentSentiment = new TextSentiment(TextSentimentClass.MIXED,
            0.1, 0.5, 0.4, 66, 0);

        final AnalyzeSentimentResult analyzeSentimentResult1 = new AnalyzeSentimentResult("0", textDocumentStatistics1,
            null,
            expectedDocumentSentiment,
            Arrays.asList(
                new TextSentiment(TextSentimentClass.NEGATIVE, 0.99, 0.005, 0.005, 31, 0),
                new TextSentiment(TextSentimentClass.POSITIVE, 0.005, 0.005, 0.99, 35, 32)
            ));

        final AnalyzeSentimentResult analyzeSentimentResult2 = new AnalyzeSentimentResult("1", textDocumentStatistics2,
            null,
            expectedDocumentSentiment,
            Arrays.asList(
                new TextSentiment(TextSentimentClass.POSITIVE, 0.005, 0.005, 0.99, 35, 0),
                new TextSentiment(TextSentimentClass.NEGATIVE, 0.99, 0.005, 0.005, 31, 36)
            ));

        return new DocumentResultCollection<>(Arrays.asList(analyzeSentimentResult1, analyzeSentimentResult2),
            DEFAULT_MODEL_VERSION,
            new TextDocumentBatchStatistics(2, 2, 0, 2));
    }

    private TestUtils() {
    }
}
