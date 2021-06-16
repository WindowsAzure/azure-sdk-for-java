// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.Map;

/** Connector read setting. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = StoreReadSettings.class)
@JsonTypeName("StoreReadSettings")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureBlobStorageReadSettings", value = AzureBlobStorageReadSettings.class),
    @JsonSubTypes.Type(name = "AzureBlobFSReadSettings", value = AzureBlobFSReadSettings.class),
    @JsonSubTypes.Type(name = "AzureDataLakeStoreReadSettings", value = AzureDataLakeStoreReadSettings.class),
    @JsonSubTypes.Type(name = "AmazonS3ReadSettings", value = AmazonS3ReadSettings.class),
    @JsonSubTypes.Type(name = "FileServerReadSettings", value = FileServerReadSettings.class),
    @JsonSubTypes.Type(name = "AzureFileStorageReadSettings", value = AzureFileStorageReadSettings.class),
    @JsonSubTypes.Type(name = "AmazonS3CompatibleReadSettings", value = AmazonS3CompatibleReadSettings.class),
    @JsonSubTypes.Type(name = "OracleCloudStorageReadSettings", value = OracleCloudStorageReadSettings.class),
    @JsonSubTypes.Type(name = "GoogleCloudStorageReadSettings", value = GoogleCloudStorageReadSettings.class),
    @JsonSubTypes.Type(name = "FtpReadSettings", value = FtpReadSettings.class),
    @JsonSubTypes.Type(name = "SftpReadSettings", value = SftpReadSettings.class),
    @JsonSubTypes.Type(name = "HttpReadSettings", value = HttpReadSettings.class),
    @JsonSubTypes.Type(name = "HdfsReadSettings", value = HdfsReadSettings.class)
})
@Fluent
public class StoreReadSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StoreReadSettings.class);

    /*
     * The maximum concurrent connection count for the source data store. Type:
     * integer (or Expression with resultType integer).
     */
    @JsonProperty(value = "maxConcurrentConnections")
    private Object maxConcurrentConnections;

    /*
     * If true, disable data store metrics collection. Default is false. Type:
     * boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "disableMetricsCollection")
    private Object disableMetricsCollection;

    /*
     * Connector read setting.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the maxConcurrentConnections property: The maximum concurrent connection count for the source data store.
     * Type: integer (or Expression with resultType integer).
     *
     * @return the maxConcurrentConnections value.
     */
    public Object maxConcurrentConnections() {
        return this.maxConcurrentConnections;
    }

    /**
     * Set the maxConcurrentConnections property: The maximum concurrent connection count for the source data store.
     * Type: integer (or Expression with resultType integer).
     *
     * @param maxConcurrentConnections the maxConcurrentConnections value to set.
     * @return the StoreReadSettings object itself.
     */
    public StoreReadSettings withMaxConcurrentConnections(Object maxConcurrentConnections) {
        this.maxConcurrentConnections = maxConcurrentConnections;
        return this;
    }

    /**
     * Get the disableMetricsCollection property: If true, disable data store metrics collection. Default is false.
     * Type: boolean (or Expression with resultType boolean).
     *
     * @return the disableMetricsCollection value.
     */
    public Object disableMetricsCollection() {
        return this.disableMetricsCollection;
    }

    /**
     * Set the disableMetricsCollection property: If true, disable data store metrics collection. Default is false.
     * Type: boolean (or Expression with resultType boolean).
     *
     * @param disableMetricsCollection the disableMetricsCollection value to set.
     * @return the StoreReadSettings object itself.
     */
    public StoreReadSettings withDisableMetricsCollection(Object disableMetricsCollection) {
        this.disableMetricsCollection = disableMetricsCollection;
        return this;
    }

    /**
     * Get the additionalProperties property: Connector read setting.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Connector read setting.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the StoreReadSettings object itself.
     */
    public StoreReadSettings withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
