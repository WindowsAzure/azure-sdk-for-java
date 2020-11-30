// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.Map;

/** Dataset location. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = DatasetLocation.class)
@JsonTypeName("DatasetLocation")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureBlobStorageLocation", value = AzureBlobStorageLocation.class),
    @JsonSubTypes.Type(name = "AzureBlobFSLocation", value = AzureBlobFSLocation.class),
    @JsonSubTypes.Type(name = "AzureDataLakeStoreLocation", value = AzureDataLakeStoreLocation.class),
    @JsonSubTypes.Type(name = "AmazonS3Location", value = AmazonS3Location.class),
    @JsonSubTypes.Type(name = "FileServerLocation", value = FileServerLocation.class),
    @JsonSubTypes.Type(name = "AzureFileStorageLocation", value = AzureFileStorageLocation.class),
    @JsonSubTypes.Type(name = "GoogleCloudStorageLocation", value = GoogleCloudStorageLocation.class),
    @JsonSubTypes.Type(name = "FtpServerLocation", value = FtpServerLocation.class),
    @JsonSubTypes.Type(name = "SftpLocation", value = SftpLocation.class),
    @JsonSubTypes.Type(name = "HttpServerLocation", value = HttpServerLocation.class),
    @JsonSubTypes.Type(name = "HdfsLocation", value = HdfsLocation.class)
})
@Fluent
public class DatasetLocation {
    /*
     * Specify the folder path of dataset. Type: string (or Expression with
     * resultType string)
     */
    @JsonProperty(value = "folderPath")
    private Object folderPath;

    /*
     * Specify the file name of dataset. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "fileName")
    private Object fileName;

    /*
     * Dataset location.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the folderPath property: Specify the folder path of dataset. Type: string (or Expression with resultType
     * string).
     *
     * @return the folderPath value.
     */
    public Object getFolderPath() {
        return this.folderPath;
    }

    /**
     * Set the folderPath property: Specify the folder path of dataset. Type: string (or Expression with resultType
     * string).
     *
     * @param folderPath the folderPath value to set.
     * @return the DatasetLocation object itself.
     */
    public DatasetLocation setFolderPath(Object folderPath) {
        this.folderPath = folderPath;
        return this;
    }

    /**
     * Get the fileName property: Specify the file name of dataset. Type: string (or Expression with resultType string).
     *
     * @return the fileName value.
     */
    public Object getFileName() {
        return this.fileName;
    }

    /**
     * Set the fileName property: Specify the file name of dataset. Type: string (or Expression with resultType string).
     *
     * @param fileName the fileName value to set.
     * @return the DatasetLocation object itself.
     */
    public DatasetLocation setFileName(Object fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Get the additionalProperties property: Dataset location.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Dataset location.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the DatasetLocation object itself.
     */
    public DatasetLocation setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}
