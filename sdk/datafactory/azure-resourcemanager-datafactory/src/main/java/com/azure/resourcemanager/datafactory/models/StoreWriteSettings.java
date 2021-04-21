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

/** Connector write settings. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = StoreWriteSettings.class)
@JsonTypeName("StoreWriteSettings")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "SftpWriteSettings", value = SftpWriteSettings.class),
    @JsonSubTypes.Type(name = "AzureBlobStorageWriteSettings", value = AzureBlobStorageWriteSettings.class),
    @JsonSubTypes.Type(name = "AzureBlobFSWriteSettings", value = AzureBlobFSWriteSettings.class),
    @JsonSubTypes.Type(name = "AzureDataLakeStoreWriteSettings", value = AzureDataLakeStoreWriteSettings.class),
    @JsonSubTypes.Type(name = "FileServerWriteSettings", value = FileServerWriteSettings.class),
    @JsonSubTypes.Type(name = "AzureFileStorageWriteSettings", value = AzureFileStorageWriteSettings.class)
})
@Fluent
public class StoreWriteSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StoreWriteSettings.class);

    /*
     * The maximum concurrent connection count for the source data store. Type:
     * integer (or Expression with resultType integer).
     */
    @JsonProperty(value = "maxConcurrentConnections")
    private Object maxConcurrentConnections;

    /*
     * The type of copy behavior for copy sink.
     */
    @JsonProperty(value = "copyBehavior")
    private Object copyBehavior;

    /*
     * Connector write settings.
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
     * @return the StoreWriteSettings object itself.
     */
    public StoreWriteSettings withMaxConcurrentConnections(Object maxConcurrentConnections) {
        this.maxConcurrentConnections = maxConcurrentConnections;
        return this;
    }

    /**
     * Get the copyBehavior property: The type of copy behavior for copy sink.
     *
     * @return the copyBehavior value.
     */
    public Object copyBehavior() {
        return this.copyBehavior;
    }

    /**
     * Set the copyBehavior property: The type of copy behavior for copy sink.
     *
     * @param copyBehavior the copyBehavior value to set.
     * @return the StoreWriteSettings object itself.
     */
    public StoreWriteSettings withCopyBehavior(Object copyBehavior) {
        this.copyBehavior = copyBehavior;
        return this;
    }

    /**
     * Get the additionalProperties property: Connector write settings.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Connector write settings.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the StoreWriteSettings object itself.
     */
    public StoreWriteSettings withAdditionalProperties(Map<String, Object> additionalProperties) {
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
