// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Activity to get metadata of dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("GetMetadata")
@JsonFlatten
@Fluent
public class GetMetadataActivity extends ExecutionActivity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GetMetadataActivity.class);

    /*
     * GetMetadata activity dataset reference.
     */
    @JsonProperty(value = "typeProperties.dataset", required = true)
    private DatasetReference dataset;

    /*
     * Fields of metadata to get from dataset.
     */
    @JsonProperty(value = "typeProperties.fieldList")
    private List<Object> fieldList;

    /*
     * GetMetadata activity store settings.
     */
    @JsonProperty(value = "typeProperties.storeSettings")
    private StoreReadSettings storeSettings;

    /*
     * GetMetadata activity format settings.
     */
    @JsonProperty(value = "typeProperties.formatSettings")
    private FormatReadSettings formatSettings;

    /**
     * Get the dataset property: GetMetadata activity dataset reference.
     *
     * @return the dataset value.
     */
    public DatasetReference dataset() {
        return this.dataset;
    }

    /**
     * Set the dataset property: GetMetadata activity dataset reference.
     *
     * @param dataset the dataset value to set.
     * @return the GetMetadataActivity object itself.
     */
    public GetMetadataActivity withDataset(DatasetReference dataset) {
        this.dataset = dataset;
        return this;
    }

    /**
     * Get the fieldList property: Fields of metadata to get from dataset.
     *
     * @return the fieldList value.
     */
    public List<Object> fieldList() {
        return this.fieldList;
    }

    /**
     * Set the fieldList property: Fields of metadata to get from dataset.
     *
     * @param fieldList the fieldList value to set.
     * @return the GetMetadataActivity object itself.
     */
    public GetMetadataActivity withFieldList(List<Object> fieldList) {
        this.fieldList = fieldList;
        return this;
    }

    /**
     * Get the storeSettings property: GetMetadata activity store settings.
     *
     * @return the storeSettings value.
     */
    public StoreReadSettings storeSettings() {
        return this.storeSettings;
    }

    /**
     * Set the storeSettings property: GetMetadata activity store settings.
     *
     * @param storeSettings the storeSettings value to set.
     * @return the GetMetadataActivity object itself.
     */
    public GetMetadataActivity withStoreSettings(StoreReadSettings storeSettings) {
        this.storeSettings = storeSettings;
        return this;
    }

    /**
     * Get the formatSettings property: GetMetadata activity format settings.
     *
     * @return the formatSettings value.
     */
    public FormatReadSettings formatSettings() {
        return this.formatSettings;
    }

    /**
     * Set the formatSettings property: GetMetadata activity format settings.
     *
     * @param formatSettings the formatSettings value to set.
     * @return the GetMetadataActivity object itself.
     */
    public GetMetadataActivity withFormatSettings(FormatReadSettings formatSettings) {
        this.formatSettings = formatSettings;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GetMetadataActivity withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GetMetadataActivity withPolicy(ActivityPolicy policy) {
        super.withPolicy(policy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GetMetadataActivity withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GetMetadataActivity withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GetMetadataActivity withDependsOn(List<ActivityDependency> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GetMetadataActivity withUserProperties(List<UserProperty> userProperties) {
        super.withUserProperties(userProperties);
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
        if (dataset() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property dataset in model GetMetadataActivity"));
        } else {
            dataset().validate();
        }
        if (storeSettings() != null) {
            storeSettings().validate();
        }
        if (formatSettings() != null) {
            formatSettings().validate();
        }
    }
}
