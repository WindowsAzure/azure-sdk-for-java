// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.search;

import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.search.models.AccessCondition;
import com.azure.search.models.DefaultCognitiveServices;
import com.azure.search.models.EntityCategory;
import com.azure.search.models.InputFieldMappingEntry;
import com.azure.search.models.KeyPhraseExtractionSkill;
import com.azure.search.models.KeyPhraseExtractionSkillLanguage;
import com.azure.search.models.OcrSkillLanguage;
import com.azure.search.models.OutputFieldMappingEntry;
import com.azure.search.models.RequestOptions;
import com.azure.search.models.SentimentSkillLanguage;
import com.azure.search.models.Skillset;
import com.azure.search.models.SplitSkillLanguage;
import com.azure.search.models.TextExtractionAlgorithm;
import com.azure.search.models.TextSplitMode;
import com.azure.search.test.AccessConditionTests;
import com.azure.search.test.AccessOptions;
import io.netty.handler.codec.http.HttpResponseStatus;
import org.junit.Assert;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class SkillsetManagementSyncTests extends SkillsetManagementTestBase {
    private SearchServiceClient client;

    protected static final String OCR_SKILLSET_NAME = "ocr-skillset";

    // commonly used lambda definitions
    private BiFunction<Skillset,
        AccessOptions,
        Skillset> createOrUpdateFunc =
            (Skillset skillset, AccessOptions ac) ->
                createSkillset(skillset, ac.getAccessCondition(), ac.getRequestOptions());

    private BiFunction<Skillset,
        AccessOptions,
        Skillset> createOrUpdateWithResponseFunc =
            (Skillset skillset, AccessOptions ac) ->
                createSkillsetWithResponse(skillset, ac.getAccessCondition(), ac.getRequestOptions());

    private Supplier<Skillset> newSkillsetFunc =
        () -> createSkillsetWithOcrDefaultSettings(OCR_SKILLSET_NAME, false);

    private Function<Skillset, Skillset> changeSkillsetFunc =
        (Skillset skillset) -> mutateSkillsInSkillset(skillset);

    private BiConsumer<String, AccessOptions> deleteSkillsetFunc =
        (String name, AccessOptions ac) ->
            deleteSkillset(name, ac.getAccessCondition(), ac.getRequestOptions());

    private void deleteSkillset(String skillsetName,
                                      AccessCondition accessCondition,
                                      RequestOptions requestOptions) {
        client.deleteSkillset(skillsetName,
            accessCondition,
            requestOptions);
    }

    private Skillset createSkillset(Skillset skillset,
                                    AccessCondition accessCondition,
                                    RequestOptions requestOptions) {
        return client.createOrUpdateSkillset(skillset, accessCondition, requestOptions);
    }

    private Skillset createSkillsetWithResponse(Skillset skillset,
                                                AccessCondition accessCondition,
                                                RequestOptions requestOptions) {
        return client.createOrUpdateSkillsetWithResponse(skillset, accessCondition, requestOptions, Context.NONE)
            .getValue();
    }

    @Override
    protected void beforeTest() {
        super.beforeTest();
        client = getSearchServiceClientBuilder().buildClient();
    }

    @Override
    public void createSkillsetReturnsCorrectDefinitionImageAnalysisKeyPhrase() {
        Skillset expectedSkillset = createTestSkillsetImageAnalysisKeyPhrase();
        Skillset actualSkillset = client.createSkillset(expectedSkillset);
        assertSkillsetsEqual(expectedSkillset, actualSkillset);

        actualSkillset = client.createSkillset(expectedSkillset.setName("image-analysis-key-phrase-skillset1"),
            generateRequestOptions());
        assertSkillsetsEqual(expectedSkillset, actualSkillset);

        Response<Skillset> skillsetResponse = client.createSkillsetWithResponse(expectedSkillset
            .setName("image-analysis-key-phrase-skillset2"), generateRequestOptions(), Context.NONE);
        assertSkillsetsEqual(expectedSkillset, skillsetResponse.getValue());
    }

    @Override
    public void createSkillsetReturnsCorrectDefinitionLanguageDetection() {
        Skillset expectedSkillset = createTestSkillsetLanguageDetection();
        Skillset actualSkillset = client.createSkillset(expectedSkillset);

        assertSkillsetsEqual(expectedSkillset, actualSkillset);
    }

    @Override
    public void createSkillsetReturnsCorrectDefinitionMergeText() {
        Skillset expectedSkillset = createTestSkillsetMergeText();
        Skillset actualSkillset = client.createSkillset(expectedSkillset);

        assertSkillsetsEqual(expectedSkillset, actualSkillset);
    }

    @Override
    public void createSkillsetReturnsCorrectDefinitionOcrEntity() {
        Skillset expectedSkillset = createTestSkillsetOcrEntity(null, null);
        Skillset actualSkillset = client.createSkillset(expectedSkillset);
        assertSkillsetsEqual(expectedSkillset, actualSkillset);

        List<EntityCategory> entityCategories = Arrays.asList(
            EntityCategory.LOCATION, EntityCategory.ORGANIZATION, EntityCategory.PERSON);

        expectedSkillset = createTestSkillsetOcrEntity(TextExtractionAlgorithm.PRINTED, entityCategories)
            .setName("testskillset1");
        actualSkillset = client.createSkillset(expectedSkillset);
        assertSkillsetsEqual(expectedSkillset, actualSkillset);
    }

    @Override
    public void createSkillsetReturnsCorrectDefinitionOcrHandwritingSentiment() {
        Skillset expectedSkillset = createTestSkillsetOcrSentiment(OcrSkillLanguage.PT,
            SentimentSkillLanguage.PT_PT, TextExtractionAlgorithm.PRINTED);
        Skillset actualSkillset = client.createSkillset(expectedSkillset);
        assertSkillsetsEqual(expectedSkillset, actualSkillset);

        expectedSkillset = createTestSkillsetOcrSentiment(OcrSkillLanguage.FI,
            SentimentSkillLanguage.FI, TextExtractionAlgorithm.PRINTED).setName("testskillset1");
        actualSkillset = client.createSkillset(expectedSkillset);
        assertSkillsetsEqual(expectedSkillset, actualSkillset);

        expectedSkillset = createTestSkillsetOcrSentiment(OcrSkillLanguage.EN,
            SentimentSkillLanguage.EN, TextExtractionAlgorithm.HANDWRITTEN).setName("testskillset2");
        actualSkillset = client.createSkillset(expectedSkillset);
        assertSkillsetsEqual(expectedSkillset, actualSkillset);
    }

    @Override
    public void createSkillsetReturnsCorrectDefinitionOcrKeyPhrase() {
        Skillset expectedSkillset = createTestSkillsetOcrKeyPhrase(OcrSkillLanguage.EN,
            KeyPhraseExtractionSkillLanguage.EN);
        Skillset actualSkillset = client.createSkillset(expectedSkillset);
        assertSkillsetsEqual(expectedSkillset, actualSkillset);

        expectedSkillset = createTestSkillsetOcrKeyPhrase(OcrSkillLanguage.FR, KeyPhraseExtractionSkillLanguage.FR)
            .setName("testskillset1");
        actualSkillset = client.createSkillset(expectedSkillset);
        assertSkillsetsEqual(expectedSkillset, actualSkillset);

        expectedSkillset = createTestSkillsetOcrKeyPhrase(OcrSkillLanguage.ES, KeyPhraseExtractionSkillLanguage.ES)
            .setName("testskillset2");
        actualSkillset = client.createSkillset(expectedSkillset);
        assertSkillsetsEqual(expectedSkillset, actualSkillset);
    }

    @Override
    public void createSkillsetReturnsCorrectDefinitionOcrShaper() {
        Skillset expectedSkillset = createTestSkillsetOcrShaper();
        Skillset actualSkillset = client.createSkillset(expectedSkillset);

        assertSkillsetsEqual(expectedSkillset, actualSkillset);
    }

    @Override
    public void createSkillsetReturnsCorrectDefinitionOcrSplitText() {
        Skillset expectedSkillset = createTestSkillsetOcrSplitText(OcrSkillLanguage.EN,
            SplitSkillLanguage.EN, TextSplitMode.PAGES);
        Skillset actualSkillset = client.createSkillset(expectedSkillset);
        assertSkillsetsEqual(expectedSkillset, actualSkillset);


        expectedSkillset = createTestSkillsetOcrSplitText(OcrSkillLanguage.FR,
            SplitSkillLanguage.FR, TextSplitMode.PAGES).setName("testskillset1");
        actualSkillset = client.createSkillset(expectedSkillset);
        assertSkillsetsEqual(expectedSkillset, actualSkillset);

        expectedSkillset = createTestSkillsetOcrSplitText(OcrSkillLanguage.FI,
            SplitSkillLanguage.FI, TextSplitMode.SENTENCES).setName("testskillset2");
        actualSkillset = client.createSkillset(expectedSkillset);
        assertSkillsetsEqual(expectedSkillset, actualSkillset);
        client.deleteSkillset(expectedSkillset.getName());

        expectedSkillset = createTestSkillsetOcrSplitText(OcrSkillLanguage.DA,
            SplitSkillLanguage.DA, TextSplitMode.SENTENCES).setName("testskillset3");
        actualSkillset = client.createSkillset(expectedSkillset);
        assertSkillsetsEqual(expectedSkillset, actualSkillset);
    }

    @Override
    public void createSkillsetReturnsCorrectDefinitionWithCognitiveServicesDefault() {
        Skillset expectedSkillset = createSkillsetWithCognitiveServicesKey();

        Skillset actualSkillset = client.createSkillset(expectedSkillset);

        assertSkillsetsEqual(expectedSkillset, actualSkillset);
    }

    @Override
    public void createSkillsetReturnsCorrectDefinitionWithOcrDefaultSettings() {
        Skillset expectedSkillset = createSkillsetWithOcrDefaultSettings(OCR_SKILLSET_NAME, false);
        Skillset actualSkillset = client.createSkillset(expectedSkillset);

        assertSkillsetsEqual(expectedSkillset, actualSkillset);
    }

    @Override
    public void createSkillsetReturnsCorrectDefinitionWithImageAnalysisDefaultSettings() {
        Skillset expectedSkillset = createSkillsetWithImageAnalysisDefaultSettings();
        Skillset actualSkillset = client.createSkillset(expectedSkillset);

        assertSkillsetsEqual(expectedSkillset, actualSkillset);
    }

    @Override
    public void createSkillsetReturnsCorrectDefinitionWithKeyPhraseExtractionDefaultSettings() {
        Skillset expectedSkillset = createSkillsetWithKeyPhraseExtractionDefaultSettings();
        Skillset actualSkillset = client.createSkillset(expectedSkillset);

        assertSkillsetsEqual(expectedSkillset, actualSkillset);
    }

    @Override
    public void createSkillsetReturnsCorrectDefinitionWithMergeDefaultSettings() {
        Skillset expectedSkillset = createSkillsetWithMergeDefaultSettings();
        Skillset actualSkillset = client.createSkillset(expectedSkillset);

        assertSkillsetsEqual(expectedSkillset, actualSkillset);
    }

    @Override
    public void createSkillsetReturnsCorrectDefinitionWithEntityRecognitionDefaultSettings() {
        Skillset expectedSkillset = createSkillsetWithEntityRecognitionDefaultSettings();
        Skillset actualSkillset = client.createSkillset(expectedSkillset);

        assertSkillsetsEqual(expectedSkillset, actualSkillset);
    }

    @Override
    public void getOcrSkillsetReturnsCorrectDefinition() {
        Skillset expected = createSkillsetWithOcrDefaultSettings(OCR_SKILLSET_NAME, false);
        client.createSkillset(expected);

        Skillset actual = client.getSkillset(expected.getName());
        assertSkillsetsEqual(expected, actual);

        actual = client.getSkillset(expected.getName(), generateRequestOptions());
        assertSkillsetsEqual(expected, actual);

        actual = client.getSkillsetWithResponse(expected.getName(), generateRequestOptions(), Context.NONE).getValue();
        assertSkillsetsEqual(expected, actual);
    }

    @Override
    public void getOcrSkillsetWithShouldDetectOrientationReturnsCorrectDefinition() {
        Skillset expected = createSkillsetWithOcrDefaultSettings(OCR_SKILLSET_NAME, true);

        client.createSkillset(expected);

        Skillset actual = client.getSkillset(expected.getName());

        assertSkillsetsEqual(expected, actual);
    }

    @Override
    public void createSkillsetReturnsCorrectDefinitionWithSentimentDefaultSettings() {
        Skillset expectedSkillset = createSkillsetWithSentimentDefaultSettings();
        Skillset actualSkillset = client.createSkillset(expectedSkillset);

        assertSkillsetsEqual(expectedSkillset, actualSkillset);
    }

    @Override
    public void createSkillsetReturnsCorrectDefinitionWithSplitDefaultSettings() {
        Skillset expectedSkillset = createSkillsetWithSplitDefaultSettings();
        Skillset actualSkillset = client.createSkillset(expectedSkillset);

        assertSkillsetsEqual(expectedSkillset, actualSkillset);
    }

    @Override
    public void createCustomSkillsetReturnsCorrectDefinition() {
        Skillset expected = createSkillsetWithCustomSkills();
        Skillset actual = client.createSkillset(expected);

        assertSkillsetsEqual(expected, actual);
    }

    @Override
    public void getSkillsetThrowsOnNotFound() {
        try {
            String skillsetName = "thisdoesnotexist";
            client.getSkillset(skillsetName);

            Assert.fail("Expected an exception to be thrown");
        } catch (Exception ex) {
            Assert.assertEquals(HttpResponseException.class, ex.getClass());
            Assert.assertEquals(HttpResponseStatus.NOT_FOUND.code(),
                ((HttpResponseException) ex).getResponse().getStatusCode());
        }
    }

    @Override
    public void canCreateAndListSkillsets() {
        Skillset skillset1 = createSkillsetWithCognitiveServicesKey();
        Skillset skillset2 = createSkillsetWithEntityRecognitionDefaultSettings();

        client.createSkillset(skillset1);
        client.createSkillset(skillset2);

        PagedIterable<Skillset> actual = client.listSkillsets();
        List<Skillset> result = actual.stream().collect(Collectors.toList());

        Assert.assertEquals(2, result.size());
        Assert.assertEquals(skillset1.getName(), result.get(0).getName());
        Assert.assertEquals(skillset2.getName(), result.get(1).getName());

        actual = client.listSkillsets("name", generateRequestOptions());
        result = actual.stream().collect(Collectors.toList());

        Assert.assertEquals(2, result.size());
        Assert.assertEquals(skillset1.getName(), result.get(0).getName());
        Assert.assertEquals(skillset2.getName(), result.get(1).getName());

        PagedResponse<Skillset> listResponse = client.listSkillsetsWithResponse("name", generateRequestOptions(), Context.NONE);
        result = listResponse.getValue().stream().collect(Collectors.toList());

        Assert.assertEquals(2, result.size());
        Assert.assertEquals(skillset1.getName(), result.get(0).getName());
        Assert.assertEquals(skillset2.getName(), result.get(1).getName());
    }

    @Override
    public void canListSkillsetsWithSelectedField() {
        Skillset skillset1 = createSkillsetWithCognitiveServicesKey();
        Skillset skillset2 = createSkillsetWithEntityRecognitionDefaultSettings();

        client.createSkillset(skillset1);
        client.createSkillset(skillset2);

        PagedIterable<Skillset> selectedFieldListResponse = client.listSkillsets("name", generateRequestOptions());
        List<Skillset> result = selectedFieldListResponse.stream().collect(Collectors.toList());

        result.forEach(res -> {
            Assert.assertNotNull(res.getName());
            Assert.assertNull(res.getCognitiveServices());
            Assert.assertNull(res.getDescription());
            Assert.assertNull(res.getSkills());
            Assert.assertNull(res.getETag());
        });

        Assert.assertEquals(2, result.size());
        Assert.assertEquals(result.get(0).getName(), skillset1.getName());
        Assert.assertEquals(result.get(1).getName(), skillset2.getName());
    }

    @Override
    public void deleteSkillsetIsIdempotent() {
        Skillset skillset = createSkillsetWithOcrDefaultSettings(OCR_SKILLSET_NAME, false);

        Response<Void> deleteResponse = client.deleteSkillsetWithResponse(skillset.getName(), new AccessCondition(),
            generateRequestOptions(), Context.NONE);
        Assert.assertEquals(HttpResponseStatus.NOT_FOUND.code(), deleteResponse.getStatusCode());

        client.createSkillset(skillset);

        // Delete the same skillset twice
        deleteResponse = client.deleteSkillsetWithResponse(skillset.getName(), new AccessCondition(),
            generateRequestOptions(), Context.NONE);
        Assert.assertEquals(HttpResponseStatus.NO_CONTENT.code(), deleteResponse.getStatusCode());

        deleteResponse = client.deleteSkillsetWithResponse(skillset.getName(), new AccessCondition(),
            generateRequestOptions(), Context.NONE);
        Assert.assertEquals(HttpResponseStatus.NOT_FOUND.code(), deleteResponse.getStatusCode());
    }

    @Override
    public void canCreateAndDeleteSkillset() {
        Skillset expected = createSkillsetWithOcrDefaultSettings(OCR_SKILLSET_NAME, false);
        client.createSkillset(expected);
        client.deleteSkillset(expected.getName());

        Assert.assertFalse(client.skillsetExists(expected.getName()));
    }

    @Override
    public void createOrUpdateCreatesWhenSkillsetDoesNotExist() {
        Skillset expected = createTestOcrSkillSet(1, TextExtractionAlgorithm.PRINTED, false);

        Skillset actual = client.createOrUpdateSkillset(expected);
        assertSkillsetsEqual(expected, actual);

        actual = client.createOrUpdateSkillset(expected.setName("testskillset1"), new AccessCondition(), generateRequestOptions());
        assertSkillsetsEqual(expected, actual);

        Response<Skillset> createOrUpdateResponse = client.createOrUpdateSkillsetWithResponse(expected.setName("testskillset2"),
                new AccessCondition(), generateRequestOptions(), Context.NONE);
        Assert.assertEquals(HttpResponseStatus.CREATED.code(), createOrUpdateResponse.getStatusCode());
    }

    @Override
    public void createOrUpdateUpdatesWhenSkillsetExists() {
        Skillset skillset = createTestOcrSkillSet(1, TextExtractionAlgorithm.HANDWRITTEN, false);

        Response<Skillset> createOrUpdateResponse = client.createOrUpdateSkillsetWithResponse(skillset,
            new AccessCondition(), generateRequestOptions(), Context.NONE);
        Assert.assertEquals(HttpResponseStatus.CREATED.code(), createOrUpdateResponse.getStatusCode());

        skillset = createTestOcrSkillSet(2, TextExtractionAlgorithm.PRINTED, false);
        createOrUpdateResponse = client.createOrUpdateSkillsetWithResponse(skillset, new AccessCondition(),
            generateRequestOptions(), Context.NONE);
        Assert.assertEquals(HttpResponseStatus.OK.code(), createOrUpdateResponse.getStatusCode());
    }

    @Override
    public void existsReturnsFalseForNonExistingSkillset() {
        Assert.assertFalse(client.skillsetExists("nonexistent"));
    }

    @Override
    public void existsReturnsTrueForExistingSkillset() {
        Skillset skillset = createSkillsetWithOcrDefaultSettings(OCR_SKILLSET_NAME, false);

        client.createSkillset(skillset);

        Assert.assertTrue(client.skillsetExists(skillset.getName()));
        Assert.assertTrue(client.skillsetExists(skillset.getName(), generateRequestOptions()));
        Assert.assertTrue(client.skillsetExistsWithResponse(skillset.getName(), generateRequestOptions(), Context.NONE).getValue());
    }

    @Override
    public void createOrUpdateUpdatesSkills() {
        Skillset skillset = createSkillsetWithOcrDefaultSettings(OCR_SKILLSET_NAME, false);

        Skillset createdSkillset = client.createSkillset(skillset);

        // update skills
        createdSkillset.setSkills(Collections.singletonList(
            new KeyPhraseExtractionSkill()
                .setDefaultLanguageCode(KeyPhraseExtractionSkillLanguage.EN)
                .setName("mykeyphrases")
                .setDescription("Tested Key Phrase skill")
                .setContext(CONTEXT_VALUE)
                .setInputs(Collections.singletonList(
                    new InputFieldMappingEntry()
                        .setName("text")
                        .setSource("/document/mytext")))
                .setOutputs(Collections.singletonList(
                    new OutputFieldMappingEntry()
                        .setName("keyPhrases")
                        .setTargetName("myKeyPhrases")))));

        assertSkillsetsEqual(createdSkillset, client.createOrUpdateSkillset(createdSkillset));
    }

    @Override
    public void createOrUpdateUpdatesCognitiveService() {
        Skillset skillset = createSkillsetWithOcrDefaultSettings(OCR_SKILLSET_NAME, false);

        Skillset createdSkillset = client.createSkillset(skillset);

        // update skills
        createdSkillset.setCognitiveServices(new DefaultCognitiveServices().setDescription("description"));

        assertSkillsetsEqual(createdSkillset, client.createOrUpdateSkillset(createdSkillset));
    }

    @Override
    public void createSkillsetReturnsCorrectDefinitionShaperWithNestedInputs() {
        Skillset expected = createSkillsetWithSharperSkillWithNestedInputs();
        Skillset actual = client.createSkillset(expected);

        assertSkillsetsEqual(expected, actual);
    }

    @Override
    public void createSkillsetThrowsExceptionWithNonShaperSkillWithNestedInputs() {
        Skillset skillset = createSkillsetWithNonSharperSkillWithNestedInputs();

        assertException(
            () -> client.createSkillset(skillset),
            HttpResponseException.class,
            "Skill '#1' is not allowed to have recursively defined inputs");
    }

    @Override
    public void createSkillsetReturnsCorrectDefinitionConditional() {
        Skillset expected = createTestSkillsetConditional();
        Skillset actual = client.createSkillset(expected);

        assertSkillsetsEqual(expected, actual);
    }

    @Override
    public void createOrUpdateSkillsetIfNotExistsFailsOnExistingResource() {
        AccessConditionTests act = new AccessConditionTests();

        act.createOrUpdateIfNotExistsFailsOnExistingResource(
            createOrUpdateFunc,
            newSkillsetFunc,
            changeSkillsetFunc);
    }

    @Override
    public void createOrUpdateSkillsetIfNotExistsSucceedsOnNoResource() {
        AccessConditionTests act = new AccessConditionTests();

        act.createOrUpdateIfNotExistsSucceedsOnNoResource(
            createOrUpdateFunc,
            newSkillsetFunc);
    }

    @Override
    public void createOrUpdateSkillsetWithResponseIfNotExistsSucceedsOnNoResource() {
        AccessConditionTests act = new AccessConditionTests();

        act.createOrUpdateIfNotExistsSucceedsOnNoResource(
            createOrUpdateWithResponseFunc,
            newSkillsetFunc);
    }

    @Override
    public void createOrUpdateSkillsetIfExistsSucceedsOnExistingResource()
        throws NoSuchFieldException, IllegalAccessException {
        AccessConditionTests act = new AccessConditionTests();
        act.updateIfExistsSucceedsOnExistingResource(
            newSkillsetFunc,
            createOrUpdateFunc,
            changeSkillsetFunc);
    }

    @Override
    public void createOrUpdateSkillsetIfExistsFailsOnNoResource()
        throws NoSuchFieldException, IllegalAccessException {
        AccessConditionTests act = new AccessConditionTests();
        act.updateIfExistsFailsOnNoResource(
            newSkillsetFunc,
            createOrUpdateFunc);
    }

    @Override
    public void createOrUpdateSkillsetIfNotChangedSucceedsWhenResourceUnchanged()
        throws NoSuchFieldException, IllegalAccessException {
        AccessConditionTests act = new AccessConditionTests();
        act.updateIfNotChangedSucceedsWhenResourceUnchanged(
            newSkillsetFunc,
            createOrUpdateFunc,
            changeSkillsetFunc);
    }

    @Override
    public void createOrUpdateSkillsetIfNotChangedFailsWhenResourceChanged()
        throws NoSuchFieldException, IllegalAccessException {
        AccessConditionTests act = new AccessConditionTests();
        act.updateIfNotChangedFailsWhenResourceChanged(
            newSkillsetFunc,
            createOrUpdateFunc,
            changeSkillsetFunc);
    }

    @Override
    public void deleteSkillsetIfNotChangedWorksOnlyOnCurrentResource()
        throws NoSuchFieldException, IllegalAccessException {
        AccessConditionTests act = new AccessConditionTests();

        act.deleteIfNotChangedWorksOnlyOnCurrentResource(
            deleteSkillsetFunc,
            newSkillsetFunc,
            createOrUpdateFunc,
            OCR_SKILLSET_NAME);
    }

    @Override
    public void deleteSkillsetIfExistsWorksOnlyWhenResourceExists() {
        AccessConditionTests act = new AccessConditionTests();

        act.deleteIfExistsWorksOnlyWhenResourceExists(
            deleteSkillsetFunc,
            createOrUpdateFunc,
            newSkillsetFunc,
            OCR_SKILLSET_NAME);
    }
}
