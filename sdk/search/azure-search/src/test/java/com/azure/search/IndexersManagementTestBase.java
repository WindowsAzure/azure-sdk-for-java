// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.search;

import com.azure.search.models.FieldMapping;
import com.azure.search.models.Indexer;
import com.azure.search.models.IndexingParameters;
import com.azure.search.models.IndexingSchedule;
import com.azure.search.models.InputFieldMappingEntry;
import com.azure.search.models.OcrSkill;
import com.azure.search.models.OutputFieldMappingEntry;
import com.azure.search.models.Skill;
import com.azure.search.models.Skillset;
import org.junit.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import static org.unitils.reflectionassert.ReflectionAssert.assertReflectionEquals;
import static org.unitils.reflectionassert.ReflectionComparatorMode.IGNORE_DEFAULTS;

public abstract class IndexersManagementTestBase extends SearchServiceTestBase {
    @Test
    public abstract void createIndexerReturnsCorrectDefinition();

    @Test
    public abstract void canCreateAndListIndexers();

    @Test
    public abstract void canCreateAndListIndexerNames();

    @Test
    public abstract void createIndexerFailsWithUsefulMessageOnUserError();

    @Test
    public abstract void canResetIndexerAndGetIndexerStatus();

    @Test
    public abstract void canRunIndexer();

    @Test
    public abstract void canUpdateIndexer();

    @Test
    public abstract void canUpdateIndexerFieldMapping();

    @Test
    public abstract void canCreateIndexerWithFieldMapping();

    @Test
    public abstract void canUpdateIndexerDisabled();

    @Test
    public abstract void canUpdateIndexerSchedule();

    @Test
    public abstract void canCreateIndexerWithSchedule();

    @Test
    public abstract void canUpdateIndexerBatchSizeMaxFailedItems();

    @Test
    public abstract void canCreateIndexerWithBatchSizeMaxFailedItems();

    // This test currently does not pass on our Dogfood account, as the
    // Storage resource provider is not returning an answer.
    @Test
    public abstract void canUpdateIndexerBlobParams();

    // This test currently does not pass on our Dogfood account, as the
    // Storage resource provider is not returning an answer.
    @Test
    public abstract void canCreateIndexerWithBlobParams();

    @Test
    public abstract void canUpdateIndexerSkillset();

    @Test
    public abstract void canCreateIndexerWithSkillset();

    /**
     * Create a new valid skillset object
     * @return the newly created skillset object
     */
    Skillset createSkillsetObject() {
        List<InputFieldMappingEntry> inputs = Arrays.asList(
            new InputFieldMappingEntry()
                .setName("url")
                .setSource("/document/url"),
            new InputFieldMappingEntry()
                .setName("queryString")
                .setSource("/document/queryString")
        );

        List<OutputFieldMappingEntry> outputs = Collections.singletonList(
            new OutputFieldMappingEntry()
                .setName("text")
                .setTargetName("mytext")
        );

        List<Skill> skills = Collections.singletonList(
            new OcrSkill()
                .setShouldDetectOrientation(true)
                .setName("myocr")
                .setDescription("Tested OCR skill")
                .setContext("/document")
                .setInputs(inputs)
                .setOutputs(outputs)
        );
        return new Skillset()
            .setName("ocr-skillset")
            .setDescription("Skillset for testing default configuration")
            .setSkills(skills);
    }

    @Test
    public abstract void deleteIndexerIsIdempotent();

    @Test
    public abstract void canCreateAndGetIndexer();

    @Test
    public abstract void getIndexerThrowsOnNotFound();

    @Test
    public abstract void createOrUpdateIndexerIfNotExistsFailsOnExistingResource();

    @Test
    public abstract void createOrUpdateIndexerIfNotExistsSucceedsOnNoResource();

    @Test
    public abstract void createOrUpdateIndexerWithResponseIfNotExistsSucceedsOnNoResource();

    @Test
    public abstract void deleteIndexerIfExistsWorksOnlyWhenResourceExists();

    @Test
    public abstract void deleteIndexerIfNotChangedWorksOnlyOnCurrentResource() throws NoSuchFieldException, IllegalAccessException;

    @Test
    public abstract void updateIndexerIfExistsFailsOnNoResource() throws NoSuchFieldException, IllegalAccessException;

    @Test
    public abstract void updateIndexerIfExistsSucceedsOnExistingResource() throws NoSuchFieldException, IllegalAccessException;

    @Test
    public abstract void updateIndexerIfNotChangedFailsWhenResourceChanged() throws NoSuchFieldException, IllegalAccessException;

    @Test
    public abstract void updateIndexerIfNotChangedSucceedsWhenResourceUnchanged() throws NoSuchFieldException, IllegalAccessException;

    @Test
    public abstract void existsReturnsTrueForExistingIndexer();

    @Test
    public abstract void existsReturnsFalseForNonExistingIndexer();

    void assertIndexersEqual(Indexer expected, Indexer actual) {
        expected.setETag("none");
        actual.setETag("none");

        // we ignore defaults as when properties are not set they are returned from the service with
        // default values
        assertReflectionEquals(expected, actual, IGNORE_DEFAULTS);
    }

    Indexer createTestIndexer(String indexerName) {
        return new Indexer()
            .setName(indexerName)
            .setTargetIndexName("indexforindexers")
            .setSchedule(new IndexingSchedule().setInterval(Duration.ofDays(1)));
    }

    /**
     * Create a new indexer and change its description property
     *
     * @return the created indexer
     */
    Indexer createIndexerWithDifferentDescription() {
        // create a new indexer object
        Indexer indexer = createTestIndexer("indexer");

        // modify it
        indexer.setDescription("somethingdifferent");

        return indexer;
    }

    /**
     * Create a new indexer and change its field mappings property
     *
     * @return the created indexer
     */
    Indexer createIndexerWithDifferentFieldMapping() {
        // create a new indexer object
        Indexer indexer = createTestIndexer("indexer");

        // Create field mappings
        List<FieldMapping> fieldMappings = Collections.singletonList(new FieldMapping()
            .setSourceFieldName("state_alpha")
            .setTargetFieldName("state"));

        // modify the indexer
        indexer.setFieldMappings(fieldMappings);

        return indexer;
    }

    /**
     * Create a new indexer and set the Disabled property to true
     *
     * @return the created indexer
     */
    Indexer createDisabledIndexer() {
        // create a new indexer object
        Indexer indexer = createTestIndexer("indexer");

        // modify it
        indexer.setIsDisabled(false);

        return indexer;
    }

    /**
     * Create a new indexer and change its schedule property
     *
     * @return the created indexer
     */
    Indexer createIndexerWithDifferentSchedule() {
        // create a new indexer object
        Indexer indexer = createTestIndexer("indexer");

        IndexingSchedule is = new IndexingSchedule()
            .setInterval(Duration.ofMinutes(10));

        // modify the indexer
        indexer.setSchedule(is);

        return indexer;
    }

    /**
     * Create a new indexer and change its skillset
     *
     * @return the created indexer
     */
    Indexer createIndexerWithDifferentSkillset(String skillsetName) {
        // create a new indexer object
        return createTestIndexer("indexer")
            .setSkillsetName(skillsetName);
    }

    /**
     * Create a new indexer and change its indexing parameters
     *
     * @return the created indexer
     */
    Indexer createIndexerWithDifferentIndexingParameters(Indexer indexer) {
        // create a new indexer object
        IndexingParameters ip = new IndexingParameters()
            .setMaxFailedItems(121)
            .setMaxFailedItemsPerBatch(11)
            .setBatchSize(20);

        // modify the indexer
        indexer.setParameters(ip);

        return indexer;
    }

    protected Indexer createIndexerWithStorageConfig() {
        // create an indexer object
        Indexer updatedExpected =
            createTestIndexer("indexer");

        // just adding some(valid) config values for blobs
        HashMap<String, Object> config = new HashMap<>();
        config.put("indexedFileNameExtensions", ".pdf,.docx");
        config.put("excludedFileNameExtensions", ".xlsx");
        config.put("dataToExtract", "storageMetadata");
        config.put("failOnUnsupportedContentType", false);

        IndexingParameters ip = new IndexingParameters()
            .setConfiguration(config);

        // modify it
        updatedExpected.setParameters(ip);

        return updatedExpected;
    }
}
