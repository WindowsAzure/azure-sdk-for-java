/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Dataset location.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = DatasetLocation.class)
@JsonTypeName("DatasetLocation")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "HdfsLocation", value = HdfsLocation.class),
    @JsonSubTypes.Type(name = "HttpServerLocation", value = HttpServerLocation.class),
    @JsonSubTypes.Type(name = "SftpLocation", value = SftpLocation.class),
    @JsonSubTypes.Type(name = "FtpServerLocation", value = FtpServerLocation.class),
    @JsonSubTypes.Type(name = "GoogleCloudStorageLocation", value = GoogleCloudStorageLocation.class),
    @JsonSubTypes.Type(name = "AzureFileStorageLocation", value = AzureFileStorageLocation.class),
    @JsonSubTypes.Type(name = "FileServerLocation", value = FileServerLocation.class),
    @JsonSubTypes.Type(name = "AmazonS3Location", value = AmazonS3Location.class),
    @JsonSubTypes.Type(name = "AzureDataLakeStoreLocation", value = AzureDataLakeStoreLocation.class),
    @JsonSubTypes.Type(name = "AzureBlobFSLocation", value = AzureBlobFSLocation.class),
    @JsonSubTypes.Type(name = "AzureBlobStorageLocation", value = AzureBlobStorageLocation.class)
})
public class DatasetLocation {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * Specify the folder path of dataset. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "folderPath")
    private Object folderPath;

    /**
     * Specify the file name of dataset. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "fileName")
    private Object fileName;

    /**
     * Get unmatched properties from the message are deserialized this collection.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set unmatched properties from the message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the DatasetLocation object itself.
     */
    public DatasetLocation withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get specify the folder path of dataset. Type: string (or Expression with resultType string).
     *
     * @return the folderPath value
     */
    public Object folderPath() {
        return this.folderPath;
    }

    /**
     * Set specify the folder path of dataset. Type: string (or Expression with resultType string).
     *
     * @param folderPath the folderPath value to set
     * @return the DatasetLocation object itself.
     */
    public DatasetLocation withFolderPath(Object folderPath) {
        this.folderPath = folderPath;
        return this;
    }

    /**
     * Get specify the file name of dataset. Type: string (or Expression with resultType string).
     *
     * @return the fileName value
     */
    public Object fileName() {
        return this.fileName;
    }

    /**
     * Set specify the file name of dataset. Type: string (or Expression with resultType string).
     *
     * @param fileName the fileName value to set
     * @return the DatasetLocation object itself.
     */
    public DatasetLocation withFileName(Object fileName) {
        this.fileName = fileName;
        return this;
    }

}
