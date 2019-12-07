// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cs.textanalytics;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.netty.NettyAsyncHttpClientBuilder;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.BearerTokenAuthenticationPolicy;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.test.TestBase;
import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.cs.textanalytics.models.DetectLanguageInput;
import com.azure.cs.textanalytics.models.DetectLanguageResult;
import com.azure.cs.textanalytics.models.DetectedLanguage;
import com.azure.cs.textanalytics.models.DocumentError;
import com.azure.cs.textanalytics.models.DocumentResultCollection;
import com.azure.cs.textanalytics.models.TextAnalyticsRequestOptions;
import com.azure.cs.textanalytics.models.TextBatchStatistics;
import com.azure.cs.textanalytics.models.TextDocumentStatistics;
import com.azure.identity.DefaultAzureCredentialBuilder;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public abstract class TextAnalyticsClientTestBase extends TestBase {
    private static final String TEXT_ANALYTICS_PROPERTIES = "azure-textanalytics.properties";
    private static final String NAME = "name";
    private static final String VERSION = "version";

    final Map<String, String> properties = CoreUtils.getProperties(TEXT_ANALYTICS_PROPERTIES);

    private final ClientLogger logger = new ClientLogger(TextAnalyticsClientTestBase.class);
    private final String clientName = properties.getOrDefault(NAME, "UnknownName");
    private final String clientVersion = properties.getOrDefault(VERSION, "UnknownVersion");
    private boolean showStatistics = false;

    void beforeTestSetup() {
    }

    <T> T clientSetup(Function<HttpPipeline, T> clientBuilder) {
        final String endpoint = getEndPoint();

        TokenCredential credential = null;

        if (!interceptorManager.isPlaybackMode()) {
            credential = new DefaultAzureCredentialBuilder().build();
        }

        HttpClient httpClient;
        // Closest to API goes first, closest to wire goes last.
        Configuration buildConfiguration = Configuration.getGlobalConfiguration().clone();
        TextAnalyticsServiceVersion serviceVersion = TextAnalyticsServiceVersion.getLatest();

        // Closest to API goes first, closest to wire goes last.
        final List<HttpPipelinePolicy> policies = new ArrayList<>();

        policies.add(new UserAgentPolicy(null, clientName, clientVersion, buildConfiguration));
        policies.add(new RequestIdPolicy());
        policies.add(new AddDatePolicy());

        HttpPolicyProviders.addBeforeRetryPolicies(policies);
        if (credential != null) {
            policies.add(new BearerTokenAuthenticationPolicy(credential, String.format("%s/.default", endpoint)));
        }
        policies.add(new RetryPolicy());

        HttpPolicyProviders.addAfterRetryPolicies(policies);
        policies.add(new HttpLoggingPolicy(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS)));


        if (interceptorManager.isPlaybackMode()) {
            httpClient = interceptorManager.getPlaybackClient();
            policies.add(interceptorManager.getRecordPolicy());
        } else {
            httpClient = new NettyAsyncHttpClientBuilder().wiretap(true).build();
            policies.add(interceptorManager.getRecordPolicy());
        }

        HttpPipeline pipeline = new HttpPipelineBuilder()
            .policies(policies.toArray(new HttpPipelinePolicy[0]))
            .httpClient(httpClient)
            .build();

        T client;
        client = clientBuilder.apply(pipeline);

        return Objects.requireNonNull(client);
    }

    @Test
    public abstract void detectSingleTextLanguage();

    @Test
    public abstract void detectLanguagesBatchInput();

    void detectLanguageShowStatisticsRunner(BiConsumer<List<DetectLanguageInput>,
        TextAnalyticsRequestOptions> testRunner) {
        final List<DetectLanguageInput> detectLanguageInputs = Arrays.asList(
            new DetectLanguageInput("0", "This is written in English", "US"),
            new DetectLanguageInput("1", "Este es un document escrito en Español."),
            new DetectLanguageInput("2", "~@!~:)", "US")
            // add error document => empty text
        );

        testRunner.accept(detectLanguageInputs, setTextAnalyticsRequestOptions());
    }

    static DocumentResultCollection<DetectLanguageResult> getExpectedBatchDetectedLanguages() {
        DetectedLanguage detectedLanguage1 = new DetectedLanguage().setName("English").setIso6391Name("en")
            .setScore(1.0);
        DetectedLanguage detectedLanguage2 = new DetectedLanguage().setName("Spanish").setIso6391Name("es")
            .setScore(1.0);
        DetectedLanguage detectedLanguage3 = new DetectedLanguage().setName("(Unknown)").setIso6391Name("(Unknown)")
            .setScore(0.0);
        List<DetectedLanguage> detectedLanguageList1 = new ArrayList<>(Collections.singletonList(detectedLanguage1));
        List<DetectedLanguage> detectedLanguageList2 = new ArrayList<>(Collections.singletonList(detectedLanguage2));
        List<DetectedLanguage> detectedLanguageList3 = new ArrayList<>(Collections.singletonList(detectedLanguage3));

        TextDocumentStatistics textDocumentStatistics1 = new TextDocumentStatistics().setCharacterCount(26).setTransactionCount(1);
        TextDocumentStatistics textDocumentStatistics2 = new TextDocumentStatistics().setCharacterCount(39).setTransactionCount(1);
        TextDocumentStatistics textDocumentStatistics3 = new TextDocumentStatistics().setCharacterCount(6).setTransactionCount(1);

        DetectLanguageResult detectLanguageResult1 = new DetectLanguageResult("0", textDocumentStatistics1, null, detectedLanguage1, detectedLanguageList1);
        DetectLanguageResult detectLanguageResult2 = new DetectLanguageResult("1", textDocumentStatistics2, null, detectedLanguage2, detectedLanguageList2);
        DetectLanguageResult detectLanguageResult3 = new DetectLanguageResult("2", textDocumentStatistics3, null, detectedLanguage3, detectedLanguageList3);

        TextBatchStatistics textBatchStatistics = new TextBatchStatistics().setDocumentCount(3).setErroneousDocumentCount(0).setTransactionCount(3).setValidDocumentCount(3);
        List<DetectLanguageResult> detectLanguageResultList = new ArrayList<>(Arrays.asList(detectLanguageResult1, detectLanguageResult2, detectLanguageResult3));

        return new DocumentResultCollection<>(detectLanguageResultList, "2019-10-01", textBatchStatistics);
    }

    static void detectLanguagesCountryHintRunner(BiConsumer<List<String>, String> testRunner) {
        final List<String> inputs = new ArrayList<>(Arrays.asList(
            "This is written in English", "Este es un document escrito en Español.", "~@!~:)"));

        testRunner.accept(inputs, "US");
    }

    static void detectLanguageStringInputRunner(Consumer<List<String>> testRunner) {
        final List<String> inputs = new ArrayList<>(Arrays.asList(
            "This is written in English", "Este es un document escrito en Español.", "~@!~:)"));

        testRunner.accept(inputs);
    }

    private TextAnalyticsRequestOptions setTextAnalyticsRequestOptions() {
        this.showStatistics = true;
        return new TextAnalyticsRequestOptions().setShowStatistics(true);
    }

    static void detectLanguageRunner(Consumer<List<DetectLanguageInput>> testRunner) {
        final List<DetectLanguageInput> detectLanguageInputs = Arrays.asList(
            new DetectLanguageInput("0", "This is written in English", "US"),
            new DetectLanguageInput("1", "Este es un document escrito en Español."),
            new DetectLanguageInput("2", "~@!~:)", "US")
        );

        testRunner.accept(detectLanguageInputs);
    }

    String getEndPoint() {
        return interceptorManager.isPlaybackMode()
            ? "http://localhost:8080"
            : Configuration.getGlobalConfiguration().get("AZURE_TEXT_ANALYTICS_ENDPOINT");
    }

    /**
     * Helper method to verify batch result.
     *
     * @param actualResult DocumentResultCollection<> returned by the API.
     * @param testApi the API to test.
     */
    <T> void validateBatchResult(DocumentResultCollection<T> actualResult,
                                 DocumentResultCollection<T> expectedResult, String testApi) {
        // assert batch result
        assertEquals(expectedResult.getModelVersion(), actualResult.getModelVersion());
        if (this.showStatistics) {
            validateBatchStatistics(expectedResult.getStatistics(), actualResult.getStatistics());
        }
        validateDocuments(expectedResult, actualResult, testApi);

        // TODO error model
        // DocumentError error = new DocumentError().setId("4").setError("error");
        // List<DocumentError> errors = new ArrayList<>();
        // errors.add(error);
        // validateErrorDocuments(expected.getErrors(), detectLanguageResultList);
    }

    /**
     * Helper method to verify documents returned in a batch request.
     *
     * @param expectedResult the expected result collection..
     * @param actualResult the actual result collection returned by the API.
     * @param testApi the API to test.
     */
    private <T> void validateDocuments(DocumentResultCollection<T> expectedResult,
                                       DocumentResultCollection<T> actualResult, String testApi) {
        switch (testApi) {
            case "Language":
                final List<DetectLanguageResult> expectedResultList = expectedResult.stream()
                    .filter(element -> element instanceof DetectLanguageResult)
                    .map(element -> (DetectLanguageResult) element)
                    .collect(Collectors.toList());

                final List<DetectLanguageResult> actualResultList = actualResult.stream()
                    .filter(element -> element instanceof DetectLanguageResult)
                    .map(element -> (DetectLanguageResult) element)
                    .collect(Collectors.toList());
                assertEquals(expectedResultList.size(), actualResultList.size());

                actualResultList.forEach(actualItem -> {
                    Optional<DetectLanguageResult> optionalExpectedItem = expectedResultList.stream().filter(
                        expectedEachItem -> actualItem.getId().equals(expectedEachItem.getId())).findFirst();
                    assertTrue(optionalExpectedItem.isPresent());
                    DetectLanguageResult expectedItem = optionalExpectedItem.get();
                    if (actualItem.getError() == null && this.showStatistics) {
                        validatePrimaryLanguage(expectedItem.getPrimaryLanguage(), actualItem.getPrimaryLanguage());
                        validateDocumentStatistics(expectedItem.getStatistics(), actualItem.getStatistics());
                        validateDetectedLanguages(expectedItem.getDetectedLanguages(), actualItem.getDetectedLanguages());
                    }
                });
        }
    }

    /**
     * Helper method to verify TextBatchStatistics.
     *
     * @param expectedStatistics
     * @param actualStatistics
     */
    private static void validateBatchStatistics(TextBatchStatistics expectedStatistics,
                                                TextBatchStatistics actualStatistics) {
        assertEquals(expectedStatistics.getDocumentCount(), actualStatistics.getDocumentCount());
        assertEquals(expectedStatistics.getErroneousDocumentCount(), actualStatistics.getErroneousDocumentCount());
        assertEquals(expectedStatistics.getValidDocumentCount(), actualStatistics.getValidDocumentCount());
        assertEquals(expectedStatistics.getTransactionCount(), actualStatistics.getTransactionCount());
    }

    /**
     * Helper method to verify the error-ed documents.
     *
     * @param errors
     * @param detectLanguageResultList
     */
    static void validateErrorDocuments(List<DocumentError> errors,
                                       List<DetectLanguageResult> detectLanguageResultList) {
        for (DocumentError expectedErrorDocument : errors) {
            Optional<DetectLanguageResult> optionalErrorDocument = detectLanguageResultList.stream().
                filter(document -> document.getId().equals(expectedErrorDocument.getId())).findFirst();
            assertTrue(optionalErrorDocument.isPresent());
            DetectLanguageResult actualErrorDocument = optionalErrorDocument.get();
            assertEquals(expectedErrorDocument.getId(), actualErrorDocument.getId());
            // TODO: Need to fix the error model
            assertEquals(expectedErrorDocument.getError().toString(), actualErrorDocument.getError().toString());
        }

    }

    /**
     * Helper method to verify TextDocumentStatistics.
     *
     * @param expected the expected value for TextDocumentStatistics.
     * @param actual the value returned by API.
     */
    private static void validateDocumentStatistics(TextDocumentStatistics expected, TextDocumentStatistics actual) {
        assertEquals(expected.getCharacterCount(), actual.getCharacterCount());
        assertEquals(expected.getTransactionCount(), actual.getTransactionCount());
    }

    /**
     * Helper method to validate a single detected language.
     *
     * @param expectedLanguage detectedLanguage returned by the service.
     * @param actualLanguage detectedLanguage returned by the API.
     */
    static void validatePrimaryLanguage(DetectedLanguage expectedLanguage, DetectedLanguage actualLanguage) {
        assertEquals(expectedLanguage.getIso6391Name(), actualLanguage.getIso6391Name());
        assertEquals(expectedLanguage.getName(), actualLanguage.getName());
        assertEquals(expectedLanguage.getScore(), actualLanguage.getScore());
    }

    /**
     * Helper method to validate the list of detected languages.
     *
     * @param expectedLanguageList detectedLanguages returned by the service.
     * @param actualLanguageList detectedLanguages returned by the API.
     */
    static void validateDetectedLanguages(List<DetectedLanguage> expectedLanguageList,
                                          List<DetectedLanguage> actualLanguageList) {
        for (int i = 0; i < expectedLanguageList.size(); i++) {
            DetectedLanguage expectedDetectedLanguage = expectedLanguageList.get(i);
            DetectedLanguage actualDetectedLanguage = actualLanguageList.get(i);
            validatePrimaryLanguage(expectedDetectedLanguage, actualDetectedLanguage);
        }
    }

    /**
     * Helper method to verify that a command throws an IllegalArgumentException.
     *
     * @param exceptionThrower Command that should throw the exception
     */
    static <T> void assertRunnableThrowsException(Runnable exceptionThrower, Class<T> exception) {
        try {
            exceptionThrower.run();
            fail();
        } catch (Exception ex) {
            assertEquals(exception, ex.getClass());
        }
    }
}
