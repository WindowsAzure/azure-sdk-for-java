// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** The EntityRecognitionSkill model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Skills.Text.EntityRecognitionSkill")
@JsonFlatten
@Fluent
public class EntityRecognitionSkill extends SearchIndexerSkill {
    /*
     * A list of entity categories that should be extracted.
     */
    @JsonProperty(value = "categories")
    private List<EntityCategory> categories;

    /*
     * A value indicating which language code to use. Default is en.
     */
    @JsonProperty(value = "defaultLanguageCode")
    private EntityRecognitionSkillLanguage defaultLanguageCode;

    /*
     * Determines whether or not to include entities which are well known but
     * don't conform to a pre-defined type. If this configuration is not set
     * (default), set to null or set to false, entities which don't conform to
     * one of the pre-defined types will not be surfaced.
     */
    @JsonProperty(value = "includeTypelessEntities")
    private Boolean includeTypelessEntities;

    /*
     * A value between 0 and 1 that be used to only include entities whose
     * confidence score is greater than the value specified. If not set
     * (default), or if explicitly set to null, all entities will be included.
     */
    @JsonProperty(value = "minimumPrecision")
    private Double minimumPrecision;

    /** Creates an instance of EntityRecognitionSkill class. */
    @JsonCreator
    public EntityRecognitionSkill(
            @JsonProperty(value = "inputs") List<InputFieldMappingEntry> inputs,
            @JsonProperty(value = "outputs") List<OutputFieldMappingEntry> outputs) {
        super(inputs, outputs);
    }

    /**
     * Get the categories property: A list of entity categories that should be extracted.
     *
     * @return the categories value.
     */
    public List<EntityCategory> getCategories() {
        return this.categories;
    }

    /**
     * Set the categories property: A list of entity categories that should be extracted.
     *
     * @param categories the categories value to set.
     * @return the EntityRecognitionSkill object itself.
     */
    public EntityRecognitionSkill setCategories(List<EntityCategory> categories) {
        this.categories = categories;
        return this;
    }

    /**
     * Get the defaultLanguageCode property: A value indicating which language code to use. Default is en.
     *
     * @return the defaultLanguageCode value.
     */
    public EntityRecognitionSkillLanguage getDefaultLanguageCode() {
        return this.defaultLanguageCode;
    }

    /**
     * Set the defaultLanguageCode property: A value indicating which language code to use. Default is en.
     *
     * @param defaultLanguageCode the defaultLanguageCode value to set.
     * @return the EntityRecognitionSkill object itself.
     */
    public EntityRecognitionSkill setDefaultLanguageCode(EntityRecognitionSkillLanguage defaultLanguageCode) {
        this.defaultLanguageCode = defaultLanguageCode;
        return this;
    }

    /**
     * Get the includeTypelessEntities property: Determines whether or not to include entities which are well known but
     * don't conform to a pre-defined type. If this configuration is not set (default), set to null or set to false,
     * entities which don't conform to one of the pre-defined types will not be surfaced.
     *
     * @return the includeTypelessEntities value.
     */
    public Boolean isIncludeTypelessEntities() {
        return this.includeTypelessEntities;
    }

    /**
     * Set the includeTypelessEntities property: Determines whether or not to include entities which are well known but
     * don't conform to a pre-defined type. If this configuration is not set (default), set to null or set to false,
     * entities which don't conform to one of the pre-defined types will not be surfaced.
     *
     * @param includeTypelessEntities the includeTypelessEntities value to set.
     * @return the EntityRecognitionSkill object itself.
     */
    public EntityRecognitionSkill setIncludeTypelessEntities(Boolean includeTypelessEntities) {
        this.includeTypelessEntities = includeTypelessEntities;
        return this;
    }

    /**
     * Get the minimumPrecision property: A value between 0 and 1 that be used to only include entities whose confidence
     * score is greater than the value specified. If not set (default), or if explicitly set to null, all entities will
     * be included.
     *
     * @return the minimumPrecision value.
     */
    public Double getMinimumPrecision() {
        return this.minimumPrecision;
    }

    /**
     * Set the minimumPrecision property: A value between 0 and 1 that be used to only include entities whose confidence
     * score is greater than the value specified. If not set (default), or if explicitly set to null, all entities will
     * be included.
     *
     * @param minimumPrecision the minimumPrecision value to set.
     * @return the EntityRecognitionSkill object itself.
     */
    public EntityRecognitionSkill setMinimumPrecision(Double minimumPrecision) {
        this.minimumPrecision = minimumPrecision;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
