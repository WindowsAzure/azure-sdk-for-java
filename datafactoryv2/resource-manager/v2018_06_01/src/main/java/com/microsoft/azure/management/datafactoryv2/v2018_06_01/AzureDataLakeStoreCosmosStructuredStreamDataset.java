/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation.DatasetInner;

/**
 * Azure Data Lake Store Cosmos Structured Stream dataset.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureDataLakeStoreCosmosStructuredStreamFile")
@JsonFlatten
public class AzureDataLakeStoreCosmosStructuredStreamDataset extends DatasetInner {
    /**
     * Path to the folder in the Azure Data Lake Store. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.folderPath", required = true)
    private Object folderPath;

    /**
     * The name of the file in the Azure Data Lake Store. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.fileName", required = true)
    private Object fileName;

    /**
     * Flag to indicate if this dataset is been generated from Compilation
     * Activity. Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "typeProperties.generatedFromActivity")
    private Object generatedFromActivity;

    /**
     * Get path to the folder in the Azure Data Lake Store. Type: string (or Expression with resultType string).
     *
     * @return the folderPath value
     */
    public Object folderPath() {
        return this.folderPath;
    }

    /**
     * Set path to the folder in the Azure Data Lake Store. Type: string (or Expression with resultType string).
     *
     * @param folderPath the folderPath value to set
     * @return the AzureDataLakeStoreCosmosStructuredStreamDataset object itself.
     */
    public AzureDataLakeStoreCosmosStructuredStreamDataset withFolderPath(Object folderPath) {
        this.folderPath = folderPath;
        return this;
    }

    /**
     * Get the name of the file in the Azure Data Lake Store. Type: string (or Expression with resultType string).
     *
     * @return the fileName value
     */
    public Object fileName() {
        return this.fileName;
    }

    /**
     * Set the name of the file in the Azure Data Lake Store. Type: string (or Expression with resultType string).
     *
     * @param fileName the fileName value to set
     * @return the AzureDataLakeStoreCosmosStructuredStreamDataset object itself.
     */
    public AzureDataLakeStoreCosmosStructuredStreamDataset withFileName(Object fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Get flag to indicate if this dataset is been generated from Compilation Activity. Type: boolean (or Expression with resultType boolean).
     *
     * @return the generatedFromActivity value
     */
    public Object generatedFromActivity() {
        return this.generatedFromActivity;
    }

    /**
     * Set flag to indicate if this dataset is been generated from Compilation Activity. Type: boolean (or Expression with resultType boolean).
     *
     * @param generatedFromActivity the generatedFromActivity value to set
     * @return the AzureDataLakeStoreCosmosStructuredStreamDataset object itself.
     */
    public AzureDataLakeStoreCosmosStructuredStreamDataset withGeneratedFromActivity(Object generatedFromActivity) {
        this.generatedFromActivity = generatedFromActivity;
        return this;
    }

}
