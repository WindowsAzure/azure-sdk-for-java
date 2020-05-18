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
 * A copy activity source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = CopySource.class)
@JsonTypeName("CopySource")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "SharePointOnlineListSource", value = SharePointOnlineListSource.class),
    @JsonSubTypes.Type(name = "SnowflakeSource", value = SnowflakeSource.class),
    @JsonSubTypes.Type(name = "HttpSource", value = HttpSource.class),
    @JsonSubTypes.Type(name = "AzureBlobFSSource", value = AzureBlobFSSource.class),
    @JsonSubTypes.Type(name = "AzureDataLakeStoreSource", value = AzureDataLakeStoreSource.class),
    @JsonSubTypes.Type(name = "Office365Source", value = Office365Source.class),
    @JsonSubTypes.Type(name = "CosmosDbMongoDbApiSource", value = CosmosDbMongoDbApiSource.class),
    @JsonSubTypes.Type(name = "MongoDbV2Source", value = MongoDbV2Source.class),
    @JsonSubTypes.Type(name = "MongoDbSource", value = MongoDbSource.class),
    @JsonSubTypes.Type(name = "WebSource", value = WebSource.class),
    @JsonSubTypes.Type(name = "OracleSource", value = OracleSource.class),
    @JsonSubTypes.Type(name = "AzureDataExplorerSource", value = AzureDataExplorerSource.class),
    @JsonSubTypes.Type(name = "HdfsSource", value = HdfsSource.class),
    @JsonSubTypes.Type(name = "FileSystemSource", value = FileSystemSource.class),
    @JsonSubTypes.Type(name = "RestSource", value = RestSource.class),
    @JsonSubTypes.Type(name = "SalesforceServiceCloudSource", value = SalesforceServiceCloudSource.class),
    @JsonSubTypes.Type(name = "ODataSource", value = ODataSource.class),
    @JsonSubTypes.Type(name = "MicrosoftAccessSource", value = MicrosoftAccessSource.class),
    @JsonSubTypes.Type(name = "RelationalSource", value = RelationalSource.class),
    @JsonSubTypes.Type(name = "CommonDataServiceForAppsSource", value = CommonDataServiceForAppsSource.class),
    @JsonSubTypes.Type(name = "DynamicsCrmSource", value = DynamicsCrmSource.class),
    @JsonSubTypes.Type(name = "DynamicsSource", value = DynamicsSource.class),
    @JsonSubTypes.Type(name = "CosmosDbSqlApiSource", value = CosmosDbSqlApiSource.class),
    @JsonSubTypes.Type(name = "DocumentDbCollectionSource", value = DocumentDbCollectionSource.class),
    @JsonSubTypes.Type(name = "BlobSource", value = BlobSource.class),
    @JsonSubTypes.Type(name = "TabularSource", value = TabularSource.class),
    @JsonSubTypes.Type(name = "BinarySource", value = BinarySource.class),
    @JsonSubTypes.Type(name = "OrcSource", value = OrcSource.class),
    @JsonSubTypes.Type(name = "JsonSource", value = JsonSource.class),
    @JsonSubTypes.Type(name = "DelimitedTextSource", value = DelimitedTextSource.class),
    @JsonSubTypes.Type(name = "ParquetSource", value = ParquetSource.class),
    @JsonSubTypes.Type(name = "AvroSource", value = AvroSource.class)
})
public class CopySource {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * Source retry count. Type: integer (or Expression with resultType
     * integer).
     */
    @JsonProperty(value = "sourceRetryCount")
    private Object sourceRetryCount;

    /**
     * Source retry wait. Type: string (or Expression with resultType string),
     * pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     */
    @JsonProperty(value = "sourceRetryWait")
    private Object sourceRetryWait;

    /**
     * The maximum concurrent connection count for the source data store. Type:
     * integer (or Expression with resultType integer).
     */
    @JsonProperty(value = "maxConcurrentConnections")
    private Object maxConcurrentConnections;

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
     * @return the CopySource object itself.
     */
    public CopySource withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get source retry count. Type: integer (or Expression with resultType integer).
     *
     * @return the sourceRetryCount value
     */
    public Object sourceRetryCount() {
        return this.sourceRetryCount;
    }

    /**
     * Set source retry count. Type: integer (or Expression with resultType integer).
     *
     * @param sourceRetryCount the sourceRetryCount value to set
     * @return the CopySource object itself.
     */
    public CopySource withSourceRetryCount(Object sourceRetryCount) {
        this.sourceRetryCount = sourceRetryCount;
        return this;
    }

    /**
     * Get source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @return the sourceRetryWait value
     */
    public Object sourceRetryWait() {
        return this.sourceRetryWait;
    }

    /**
     * Set source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @param sourceRetryWait the sourceRetryWait value to set
     * @return the CopySource object itself.
     */
    public CopySource withSourceRetryWait(Object sourceRetryWait) {
        this.sourceRetryWait = sourceRetryWait;
        return this;
    }

    /**
     * Get the maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     *
     * @return the maxConcurrentConnections value
     */
    public Object maxConcurrentConnections() {
        return this.maxConcurrentConnections;
    }

    /**
     * Set the maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     *
     * @param maxConcurrentConnections the maxConcurrentConnections value to set
     * @return the CopySource object itself.
     */
    public CopySource withMaxConcurrentConnections(Object maxConcurrentConnections) {
        this.maxConcurrentConnections = maxConcurrentConnections;
        return this;
    }

}
