// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The SearchIndexer model. */
@Fluent
public final class SearchIndexer {
    /*
     * The name of the indexer.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The description of the indexer.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The name of the datasource from which this indexer reads data.
     */
    @JsonProperty(value = "dataSourceName")
    private String dataSourceName;

    /*
     * The name of the skillset executing with this indexer.
     */
    @JsonProperty(value = "skillsetName")
    private String skillsetName;

    /*
     * The name of the index to which this indexer writes data.
     */
    @JsonProperty(value = "targetIndexName")
    private String targetIndexName;

    /*
     * The schedule for this indexer.
     */
    @JsonProperty(value = "schedule")
    private IndexingSchedule schedule;

    /*
     * Parameters for indexer execution.
     */
    @JsonProperty(value = "parameters")
    private IndexingParameters parameters;

    /*
     * Defines mappings between fields in the data source and corresponding
     * target fields in the index.
     */
    @JsonProperty(value = "fieldMappings")
    private List<FieldMapping> fieldMappings;

    /*
     * Output field mappings are applied after enrichment and immediately
     * before indexing.
     */
    @JsonProperty(value = "outputFieldMappings")
    private List<FieldMapping> outputFieldMappings;

    /*
     * A value indicating whether the indexer is disabled. Default is false.
     */
    @JsonProperty(value = "disabled")
    private Boolean isDisabled;

    /*
     * The ETag of the indexer.
     */
    @JsonProperty(value = "@odata.etag")
    private String eTag;

    /**
     * Get the name property: The name of the indexer.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the indexer.
     *
     * @param name the name value to set.
     * @return the SearchIndexer object itself.
     */
    public SearchIndexer setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: The description of the indexer.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The description of the indexer.
     *
     * @param description the description value to set.
     * @return the SearchIndexer object itself.
     */
    public SearchIndexer setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the dataSourceName property: The name of the datasource from which this indexer reads data.
     *
     * @return the dataSourceName value.
     */
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    /**
     * Set the dataSourceName property: The name of the datasource from which this indexer reads data.
     *
     * @param dataSourceName the dataSourceName value to set.
     * @return the SearchIndexer object itself.
     */
    public SearchIndexer setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }

    /**
     * Get the skillsetName property: The name of the skillset executing with this indexer.
     *
     * @return the skillsetName value.
     */
    public String getSkillsetName() {
        return this.skillsetName;
    }

    /**
     * Set the skillsetName property: The name of the skillset executing with this indexer.
     *
     * @param skillsetName the skillsetName value to set.
     * @return the SearchIndexer object itself.
     */
    public SearchIndexer setSkillsetName(String skillsetName) {
        this.skillsetName = skillsetName;
        return this;
    }

    /**
     * Get the targetIndexName property: The name of the index to which this indexer writes data.
     *
     * @return the targetIndexName value.
     */
    public String getTargetIndexName() {
        return this.targetIndexName;
    }

    /**
     * Set the targetIndexName property: The name of the index to which this indexer writes data.
     *
     * @param targetIndexName the targetIndexName value to set.
     * @return the SearchIndexer object itself.
     */
    public SearchIndexer setTargetIndexName(String targetIndexName) {
        this.targetIndexName = targetIndexName;
        return this;
    }

    /**
     * Get the schedule property: The schedule for this indexer.
     *
     * @return the schedule value.
     */
    public IndexingSchedule getSchedule() {
        return this.schedule;
    }

    /**
     * Set the schedule property: The schedule for this indexer.
     *
     * @param schedule the schedule value to set.
     * @return the SearchIndexer object itself.
     */
    public SearchIndexer setSchedule(IndexingSchedule schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * Get the parameters property: Parameters for indexer execution.
     *
     * @return the parameters value.
     */
    public IndexingParameters getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Parameters for indexer execution.
     *
     * @param parameters the parameters value to set.
     * @return the SearchIndexer object itself.
     */
    public SearchIndexer setParameters(IndexingParameters parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the fieldMappings property: Defines mappings between fields in the data source and corresponding target
     * fields in the index.
     *
     * @return the fieldMappings value.
     */
    public List<FieldMapping> getFieldMappings() {
        return this.fieldMappings;
    }

    /**
     * Set the fieldMappings property: Defines mappings between fields in the data source and corresponding target
     * fields in the index.
     *
     * @param fieldMappings the fieldMappings value to set.
     * @return the SearchIndexer object itself.
     */
    public SearchIndexer setFieldMappings(List<FieldMapping> fieldMappings) {
        this.fieldMappings = fieldMappings;
        return this;
    }

    /**
     * Get the outputFieldMappings property: Output field mappings are applied after enrichment and immediately before
     * indexing.
     *
     * @return the outputFieldMappings value.
     */
    public List<FieldMapping> getOutputFieldMappings() {
        return this.outputFieldMappings;
    }

    /**
     * Set the outputFieldMappings property: Output field mappings are applied after enrichment and immediately before
     * indexing.
     *
     * @param outputFieldMappings the outputFieldMappings value to set.
     * @return the SearchIndexer object itself.
     */
    public SearchIndexer setOutputFieldMappings(List<FieldMapping> outputFieldMappings) {
        this.outputFieldMappings = outputFieldMappings;
        return this;
    }

    /**
     * Get the isDisabled property: A value indicating whether the indexer is disabled. Default is false.
     *
     * @return the isDisabled value.
     */
    public Boolean isDisabled() {
        return this.isDisabled;
    }

    /**
     * Set the isDisabled property: A value indicating whether the indexer is disabled. Default is false.
     *
     * @param isDisabled the isDisabled value to set.
     * @return the SearchIndexer object itself.
     */
    public SearchIndexer setIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
        return this;
    }

    /**
     * Get the eTag property: The ETag of the indexer.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag of the indexer.
     *
     * @param eTag the eTag value to set.
     * @return the SearchIndexer object itself.
     */
    public SearchIndexer setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getSchedule() != null) {
            getSchedule().validate();
        }
        if (getParameters() != null) {
            getParameters().validate();
        }
        if (getFieldMappings() != null) {
            getFieldMappings().forEach(e -> e.validate());
        }
        if (getOutputFieldMappings() != null) {
            getOutputFieldMappings().forEach(e -> e.validate());
        }
    }
}
