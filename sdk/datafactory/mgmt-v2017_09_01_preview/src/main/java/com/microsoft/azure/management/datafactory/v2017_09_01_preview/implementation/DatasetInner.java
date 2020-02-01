/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview.implementation;

import java.util.Map;
import com.microsoft.azure.management.datafactory.v2017_09_01_preview.LinkedServiceReference;
import com.microsoft.azure.management.datafactory.v2017_09_01_preview.ParameterSpecification;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The Azure Data Factory nested object which identifies data within different
 * data stores, such as tables, files, folders, and documents.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = DatasetInner.class)
@JsonTypeName("Dataset")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ResponsysObject", value = ResponsysObjectDataset.class),
    @JsonSubTypes.Type(name = "SalesforceMarketingCloudObject", value = SalesforceMarketingCloudObjectDataset.class),
    @JsonSubTypes.Type(name = "VerticaTable", value = VerticaTableDataset.class),
    @JsonSubTypes.Type(name = "NetezzaTable", value = NetezzaTableDataset.class),
    @JsonSubTypes.Type(name = "ZohoObject", value = ZohoObjectDataset.class),
    @JsonSubTypes.Type(name = "XeroObject", value = XeroObjectDataset.class),
    @JsonSubTypes.Type(name = "SquareObject", value = SquareObjectDataset.class),
    @JsonSubTypes.Type(name = "SparkObject", value = SparkObjectDataset.class),
    @JsonSubTypes.Type(name = "ShopifyObject", value = ShopifyObjectDataset.class),
    @JsonSubTypes.Type(name = "ServiceNowObject", value = ServiceNowObjectDataset.class),
    @JsonSubTypes.Type(name = "QuickBooksObject", value = QuickBooksObjectDataset.class),
    @JsonSubTypes.Type(name = "PrestoObject", value = PrestoObjectDataset.class),
    @JsonSubTypes.Type(name = "PhoenixObject", value = PhoenixObjectDataset.class),
    @JsonSubTypes.Type(name = "PaypalObject", value = PaypalObjectDataset.class),
    @JsonSubTypes.Type(name = "MarketoObject", value = MarketoObjectDataset.class),
    @JsonSubTypes.Type(name = "MariaDBTable", value = MariaDBTableDataset.class),
    @JsonSubTypes.Type(name = "MagentoObject", value = MagentoObjectDataset.class),
    @JsonSubTypes.Type(name = "JiraObject", value = JiraObjectDataset.class),
    @JsonSubTypes.Type(name = "ImpalaObject", value = ImpalaObjectDataset.class),
    @JsonSubTypes.Type(name = "HubspotObject", value = HubspotObjectDataset.class),
    @JsonSubTypes.Type(name = "HiveObject", value = HiveObjectDataset.class),
    @JsonSubTypes.Type(name = "HBaseObject", value = HBaseObjectDataset.class),
    @JsonSubTypes.Type(name = "GreenplumTable", value = GreenplumTableDataset.class),
    @JsonSubTypes.Type(name = "GoogleBigQueryObject", value = GoogleBigQueryObjectDataset.class),
    @JsonSubTypes.Type(name = "EloquaObject", value = EloquaObjectDataset.class),
    @JsonSubTypes.Type(name = "DrillTable", value = DrillTableDataset.class),
    @JsonSubTypes.Type(name = "CouchbaseTable", value = CouchbaseTableDataset.class),
    @JsonSubTypes.Type(name = "ConcurObject", value = ConcurObjectDataset.class),
    @JsonSubTypes.Type(name = "AzurePostgreSqlTable", value = AzurePostgreSqlTableDataset.class),
    @JsonSubTypes.Type(name = "AmazonMWSObject", value = AmazonMWSObjectDataset.class),
    @JsonSubTypes.Type(name = "HttpFile", value = HttpDataset.class),
    @JsonSubTypes.Type(name = "AzureSearchIndex", value = AzureSearchIndexDataset.class),
    @JsonSubTypes.Type(name = "WebTable", value = WebTableDataset.class),
    @JsonSubTypes.Type(name = "SqlServerTable", value = SqlServerTableDataset.class),
    @JsonSubTypes.Type(name = "SapEccResource", value = SapEccResourceDataset.class),
    @JsonSubTypes.Type(name = "SapCloudForCustomerResource", value = SapCloudForCustomerResourceDataset.class),
    @JsonSubTypes.Type(name = "SalesforceObject", value = SalesforceObjectDataset.class),
    @JsonSubTypes.Type(name = "RelationalTable", value = RelationalTableDataset.class),
    @JsonSubTypes.Type(name = "AzureMySqlTable", value = AzureMySqlTableDataset.class),
    @JsonSubTypes.Type(name = "OracleTable", value = OracleTableDataset.class),
    @JsonSubTypes.Type(name = "ODataResource", value = ODataResourceDataset.class),
    @JsonSubTypes.Type(name = "MongoDbCollection", value = MongoDbCollectionDataset.class),
    @JsonSubTypes.Type(name = "FileShare", value = FileShareDataset.class),
    @JsonSubTypes.Type(name = "AzureDataLakeStoreFile", value = AzureDataLakeStoreDataset.class),
    @JsonSubTypes.Type(name = "DynamicsEntity", value = DynamicsEntityDataset.class),
    @JsonSubTypes.Type(name = "DocumentDbCollection", value = DocumentDbCollectionDataset.class),
    @JsonSubTypes.Type(name = "CustomDataset", value = CustomDataset.class),
    @JsonSubTypes.Type(name = "CassandraTable", value = CassandraTableDataset.class),
    @JsonSubTypes.Type(name = "AzureSqlDWTable", value = AzureSqlDWTableDataset.class),
    @JsonSubTypes.Type(name = "AzureSqlTable", value = AzureSqlTableDataset.class),
    @JsonSubTypes.Type(name = "AzureTable", value = AzureTableDataset.class),
    @JsonSubTypes.Type(name = "AzureBlob", value = AzureBlobDataset.class),
    @JsonSubTypes.Type(name = "AmazonS3Object", value = AmazonS3Dataset.class)
})
public class DatasetInner {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * Dataset description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Columns that define the structure of the dataset. Type: array (or
     * Expression with resultType array), itemType: DatasetDataElement.
     */
    @JsonProperty(value = "structure")
    private Object structure;

    /**
     * Linked service reference.
     */
    @JsonProperty(value = "linkedServiceName", required = true)
    private LinkedServiceReference linkedServiceName;

    /**
     * Parameters for dataset.
     */
    @JsonProperty(value = "parameters")
    private Map<String, ParameterSpecification> parameters;

    /**
     * List of tags that can be used for describing the Dataset.
     */
    @JsonProperty(value = "annotations")
    private List<Object> annotations;

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
     * @return the DatasetInner object itself.
     */
    public DatasetInner withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get dataset description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set dataset description.
     *
     * @param description the description value to set
     * @return the DatasetInner object itself.
     */
    public DatasetInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get columns that define the structure of the dataset. Type: array (or Expression with resultType array), itemType: DatasetDataElement.
     *
     * @return the structure value
     */
    public Object structure() {
        return this.structure;
    }

    /**
     * Set columns that define the structure of the dataset. Type: array (or Expression with resultType array), itemType: DatasetDataElement.
     *
     * @param structure the structure value to set
     * @return the DatasetInner object itself.
     */
    public DatasetInner withStructure(Object structure) {
        this.structure = structure;
        return this;
    }

    /**
     * Get linked service reference.
     *
     * @return the linkedServiceName value
     */
    public LinkedServiceReference linkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * Set linked service reference.
     *
     * @param linkedServiceName the linkedServiceName value to set
     * @return the DatasetInner object itself.
     */
    public DatasetInner withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        this.linkedServiceName = linkedServiceName;
        return this;
    }

    /**
     * Get parameters for dataset.
     *
     * @return the parameters value
     */
    public Map<String, ParameterSpecification> parameters() {
        return this.parameters;
    }

    /**
     * Set parameters for dataset.
     *
     * @param parameters the parameters value to set
     * @return the DatasetInner object itself.
     */
    public DatasetInner withParameters(Map<String, ParameterSpecification> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get list of tags that can be used for describing the Dataset.
     *
     * @return the annotations value
     */
    public List<Object> annotations() {
        return this.annotations;
    }

    /**
     * Set list of tags that can be used for describing the Dataset.
     *
     * @param annotations the annotations value to set
     * @return the DatasetInner object itself.
     */
    public DatasetInner withAnnotations(List<Object> annotations) {
        this.annotations = annotations;
        return this;
    }

}
