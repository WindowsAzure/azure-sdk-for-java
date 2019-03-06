/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation;

import java.util.Map;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.IntegrationRuntimeReference;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.ParameterSpecification;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The Azure Data Factory nested object which contains the information and
 * credential which can be used to connect with related store or compute
 * resource.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("LinkedService")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureFunction", value = AzureFunctionLinkedService.class),
    @JsonSubTypes.Type(name = "AzureDataExplorer", value = AzureDataExplorerLinkedService.class),
    @JsonSubTypes.Type(name = "GoogleAdWords", value = GoogleAdWordsLinkedService.class),
    @JsonSubTypes.Type(name = "OracleServiceCloud", value = OracleServiceCloudLinkedService.class),
    @JsonSubTypes.Type(name = "DynamicsAX", value = DynamicsAXLinkedService.class),
    @JsonSubTypes.Type(name = "Responsys", value = ResponsysLinkedService.class),
    @JsonSubTypes.Type(name = "AzureDatabricks", value = AzureDatabricksLinkedService.class),
    @JsonSubTypes.Type(name = "AzureDataLakeAnalytics", value = AzureDataLakeAnalyticsLinkedService.class),
    @JsonSubTypes.Type(name = "HDInsightOnDemand", value = HDInsightOnDemandLinkedService.class),
    @JsonSubTypes.Type(name = "SalesforceMarketingCloud", value = SalesforceMarketingCloudLinkedService.class),
    @JsonSubTypes.Type(name = "Netezza", value = NetezzaLinkedService.class),
    @JsonSubTypes.Type(name = "Vertica", value = VerticaLinkedService.class),
    @JsonSubTypes.Type(name = "Zoho", value = ZohoLinkedService.class),
    @JsonSubTypes.Type(name = "Xero", value = XeroLinkedService.class),
    @JsonSubTypes.Type(name = "Square", value = SquareLinkedService.class),
    @JsonSubTypes.Type(name = "Spark", value = SparkLinkedService.class),
    @JsonSubTypes.Type(name = "Shopify", value = ShopifyLinkedService.class),
    @JsonSubTypes.Type(name = "ServiceNow", value = ServiceNowLinkedService.class),
    @JsonSubTypes.Type(name = "QuickBooks", value = QuickBooksLinkedService.class),
    @JsonSubTypes.Type(name = "Presto", value = PrestoLinkedService.class),
    @JsonSubTypes.Type(name = "Phoenix", value = PhoenixLinkedService.class),
    @JsonSubTypes.Type(name = "Paypal", value = PaypalLinkedService.class),
    @JsonSubTypes.Type(name = "Marketo", value = MarketoLinkedService.class),
    @JsonSubTypes.Type(name = "MariaDB", value = MariaDBLinkedService.class),
    @JsonSubTypes.Type(name = "Magento", value = MagentoLinkedService.class),
    @JsonSubTypes.Type(name = "Jira", value = JiraLinkedService.class),
    @JsonSubTypes.Type(name = "Impala", value = ImpalaLinkedService.class),
    @JsonSubTypes.Type(name = "Hubspot", value = HubspotLinkedService.class),
    @JsonSubTypes.Type(name = "Hive", value = HiveLinkedService.class),
    @JsonSubTypes.Type(name = "HBase", value = HBaseLinkedService.class),
    @JsonSubTypes.Type(name = "Greenplum", value = GreenplumLinkedService.class),
    @JsonSubTypes.Type(name = "GoogleBigQuery", value = GoogleBigQueryLinkedService.class),
    @JsonSubTypes.Type(name = "Eloqua", value = EloquaLinkedService.class),
    @JsonSubTypes.Type(name = "Drill", value = DrillLinkedService.class),
    @JsonSubTypes.Type(name = "Couchbase", value = CouchbaseLinkedService.class),
    @JsonSubTypes.Type(name = "Concur", value = ConcurLinkedService.class),
    @JsonSubTypes.Type(name = "AzurePostgreSql", value = AzurePostgreSqlLinkedService.class),
    @JsonSubTypes.Type(name = "AmazonMWS", value = AmazonMWSLinkedService.class),
    @JsonSubTypes.Type(name = "SapHana", value = SapHanaLinkedService.class),
    @JsonSubTypes.Type(name = "SapBW", value = SapBWLinkedService.class),
    @JsonSubTypes.Type(name = "Sftp", value = SftpServerLinkedService.class),
    @JsonSubTypes.Type(name = "FtpServer", value = FtpServerLinkedService.class),
    @JsonSubTypes.Type(name = "HttpServer", value = HttpLinkedService.class),
    @JsonSubTypes.Type(name = "AzureSearch", value = AzureSearchLinkedService.class),
    @JsonSubTypes.Type(name = "CustomDataSource", value = CustomDataSourceLinkedService.class),
    @JsonSubTypes.Type(name = "AmazonRedshift", value = AmazonRedshiftLinkedService.class),
    @JsonSubTypes.Type(name = "AmazonS3", value = AmazonS3LinkedService.class),
    @JsonSubTypes.Type(name = "RestService", value = RestServiceLinkedService.class),
    @JsonSubTypes.Type(name = "SapOpenHub", value = SapOpenHubLinkedService.class),
    @JsonSubTypes.Type(name = "SapEcc", value = SapEccLinkedService.class),
    @JsonSubTypes.Type(name = "SapCloudForCustomer", value = SapCloudForCustomerLinkedService.class),
    @JsonSubTypes.Type(name = "Salesforce", value = SalesforceLinkedService.class),
    @JsonSubTypes.Type(name = "Office365", value = Office365LinkedService.class),
    @JsonSubTypes.Type(name = "AzureBlobFS", value = AzureBlobFSLinkedService.class),
    @JsonSubTypes.Type(name = "AzureDataLakeStore", value = AzureDataLakeStoreLinkedService.class),
    @JsonSubTypes.Type(name = "CosmosDbMongoDbApi", value = CosmosDbMongoDbApiLinkedService.class),
    @JsonSubTypes.Type(name = "MongoDbV2", value = MongoDbV2LinkedService.class),
    @JsonSubTypes.Type(name = "MongoDb", value = MongoDbLinkedService.class),
    @JsonSubTypes.Type(name = "Cassandra", value = CassandraLinkedService.class),
    @JsonSubTypes.Type(name = "Web", value = WebLinkedService.class),
    @JsonSubTypes.Type(name = "OData", value = ODataLinkedService.class),
    @JsonSubTypes.Type(name = "Hdfs", value = HdfsLinkedService.class),
    @JsonSubTypes.Type(name = "Odbc", value = OdbcLinkedService.class),
    @JsonSubTypes.Type(name = "AzureML", value = AzureMLLinkedService.class),
    @JsonSubTypes.Type(name = "Teradata", value = TeradataLinkedService.class),
    @JsonSubTypes.Type(name = "Db2", value = Db2LinkedService.class),
    @JsonSubTypes.Type(name = "Sybase", value = SybaseLinkedService.class),
    @JsonSubTypes.Type(name = "PostgreSql", value = PostgreSqlLinkedService.class),
    @JsonSubTypes.Type(name = "MySql", value = MySqlLinkedService.class),
    @JsonSubTypes.Type(name = "AzureMySql", value = AzureMySqlLinkedService.class),
    @JsonSubTypes.Type(name = "Oracle", value = OracleLinkedService.class),
    @JsonSubTypes.Type(name = "FileServer", value = FileServerLinkedService.class),
    @JsonSubTypes.Type(name = "HDInsight", value = HDInsightLinkedService.class),
    @JsonSubTypes.Type(name = "Dynamics", value = DynamicsLinkedService.class),
    @JsonSubTypes.Type(name = "CosmosDb", value = CosmosDbLinkedService.class),
    @JsonSubTypes.Type(name = "AzureKeyVault", value = AzureKeyVaultLinkedService.class),
    @JsonSubTypes.Type(name = "AzureBatch", value = AzureBatchLinkedService.class),
    @JsonSubTypes.Type(name = "AzureSqlDatabase", value = AzureSqlDatabaseLinkedService.class),
    @JsonSubTypes.Type(name = "SqlServer", value = SqlServerLinkedService.class),
    @JsonSubTypes.Type(name = "AzureSqlDW", value = AzureSqlDWLinkedService.class),
    @JsonSubTypes.Type(name = "AzureTableStorage", value = AzureTableStorageLinkedService.class),
    @JsonSubTypes.Type(name = "AzureBlobStorage", value = AzureBlobStorageLinkedService.class),
    @JsonSubTypes.Type(name = "AzureStorage", value = AzureStorageLinkedService.class)
})
public class LinkedServiceInner {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * The integration runtime reference.
     */
    @JsonProperty(value = "connectVia")
    private IntegrationRuntimeReference connectVia;

    /**
     * Linked service description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Parameters for linked service.
     */
    @JsonProperty(value = "parameters")
    private Map<String, ParameterSpecification> parameters;

    /**
     * List of tags that can be used for describing the linked service.
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
     * @return the LinkedServiceInner object itself.
     */
    public LinkedServiceInner withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get the integration runtime reference.
     *
     * @return the connectVia value
     */
    public IntegrationRuntimeReference connectVia() {
        return this.connectVia;
    }

    /**
     * Set the integration runtime reference.
     *
     * @param connectVia the connectVia value to set
     * @return the LinkedServiceInner object itself.
     */
    public LinkedServiceInner withConnectVia(IntegrationRuntimeReference connectVia) {
        this.connectVia = connectVia;
        return this;
    }

    /**
     * Get linked service description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set linked service description.
     *
     * @param description the description value to set
     * @return the LinkedServiceInner object itself.
     */
    public LinkedServiceInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get parameters for linked service.
     *
     * @return the parameters value
     */
    public Map<String, ParameterSpecification> parameters() {
        return this.parameters;
    }

    /**
     * Set parameters for linked service.
     *
     * @param parameters the parameters value to set
     * @return the LinkedServiceInner object itself.
     */
    public LinkedServiceInner withParameters(Map<String, ParameterSpecification> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get list of tags that can be used for describing the linked service.
     *
     * @return the annotations value
     */
    public List<Object> annotations() {
        return this.annotations;
    }

    /**
     * Set list of tags that can be used for describing the linked service.
     *
     * @param annotations the annotations value to set
     * @return the LinkedServiceInner object itself.
     */
    public LinkedServiceInner withAnnotations(List<Object> annotations) {
        this.annotations = annotations;
        return this;
    }

}
