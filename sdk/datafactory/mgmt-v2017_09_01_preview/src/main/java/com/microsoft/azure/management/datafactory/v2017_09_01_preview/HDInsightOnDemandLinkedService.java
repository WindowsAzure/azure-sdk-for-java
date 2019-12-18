/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactory.v2017_09_01_preview.implementation.LinkedServiceInner;

/**
 * HDInsight ondemand linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = HDInsightOnDemandLinkedService.class)
@JsonTypeName("HDInsightOnDemand")
@JsonFlatten
public class HDInsightOnDemandLinkedService extends LinkedServiceInner {
    /**
     * Number of worker/data nodes in the cluster. Suggestion value: 4. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.clusterSize", required = true)
    private Object clusterSize;

    /**
     * The allowed idle time for the on-demand HDInsight cluster. Specifies how
     * long the on-demand HDInsight cluster stays alive after completion of an
     * activity run if there are no other active jobs in the cluster. The
     * minimum value is 5 mins. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.timeToLive", required = true)
    private Object timeToLive;

    /**
     * Version of the HDInsight cluster.  Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.version", required = true)
    private Object version;

    /**
     * Azure Storage linked service to be used by the on-demand cluster for
     * storing and processing data.
     */
    @JsonProperty(value = "typeProperties.linkedServiceName", required = true)
    private LinkedServiceReference linkedServiceName;

    /**
     * The customer’s subscription to host the cluster. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.hostSubscriptionId", required = true)
    private Object hostSubscriptionId;

    /**
     * The service principal id for the hostSubscriptionId. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.servicePrincipalId")
    private Object servicePrincipalId;

    /**
     * The key for the service principal id.
     */
    @JsonProperty(value = "typeProperties.servicePrincipalKey")
    private SecretBase servicePrincipalKey;

    /**
     * The Tenant id/name to which the service principal belongs. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.tenant", required = true)
    private Object tenant;

    /**
     * The resource group where the cluster belongs. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.clusterResourceGroup", required = true)
    private Object clusterResourceGroup;

    /**
     * The prefix of cluster name, postfix will be distinct with timestamp.
     * Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.clusterNamePrefix")
    private Object clusterNamePrefix;

    /**
     * The username to access the cluster. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.clusterUserName")
    private Object clusterUserName;

    /**
     * The password to access the cluster.
     */
    @JsonProperty(value = "typeProperties.clusterPassword")
    private SecretBase clusterPassword;

    /**
     * The username to SSH remotely connect to cluster’s node (for Linux).
     * Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.clusterSshUserName")
    private Object clusterSshUserName;

    /**
     * The password to SSH remotely connect cluster’s node (for Linux).
     */
    @JsonProperty(value = "typeProperties.clusterSshPassword")
    private SecretBase clusterSshPassword;

    /**
     * Specifies additional storage accounts for the HDInsight linked service
     * so that the Data Factory service can register them on your behalf.
     */
    @JsonProperty(value = "typeProperties.additionalLinkedServiceNames")
    private List<LinkedServiceReference> additionalLinkedServiceNames;

    /**
     * The name of Azure SQL linked service that point to the HCatalog
     * database. The on-demand HDInsight cluster is created by using the Azure
     * SQL database as the metastore.
     */
    @JsonProperty(value = "typeProperties.hcatalogLinkedServiceName")
    private LinkedServiceReference hcatalogLinkedServiceName;

    /**
     * The cluster type. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.clusterType")
    private Object clusterType;

    /**
     * The version of spark if the cluster type is 'spark'. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.sparkVersion")
    private Object sparkVersion;

    /**
     * Specifies the core configuration parameters (as in core-site.xml) for
     * the HDInsight cluster to be created.
     */
    @JsonProperty(value = "typeProperties.coreConfiguration")
    private Object coreConfiguration;

    /**
     * Specifies the HBase configuration parameters (hbase-site.xml) for the
     * HDInsight cluster.
     */
    @JsonProperty(value = "typeProperties.hBaseConfiguration")
    private Object hBaseConfiguration;

    /**
     * Specifies the HDFS configuration parameters (hdfs-site.xml) for the
     * HDInsight cluster.
     */
    @JsonProperty(value = "typeProperties.hdfsConfiguration")
    private Object hdfsConfiguration;

    /**
     * Specifies the hive configuration parameters (hive-site.xml) for the
     * HDInsight cluster.
     */
    @JsonProperty(value = "typeProperties.hiveConfiguration")
    private Object hiveConfiguration;

    /**
     * Specifies the MapReduce configuration parameters (mapred-site.xml) for
     * the HDInsight cluster.
     */
    @JsonProperty(value = "typeProperties.mapReduceConfiguration")
    private Object mapReduceConfiguration;

    /**
     * Specifies the Oozie configuration parameters (oozie-site.xml) for the
     * HDInsight cluster.
     */
    @JsonProperty(value = "typeProperties.oozieConfiguration")
    private Object oozieConfiguration;

    /**
     * Specifies the Storm configuration parameters (storm-site.xml) for the
     * HDInsight cluster.
     */
    @JsonProperty(value = "typeProperties.stormConfiguration")
    private Object stormConfiguration;

    /**
     * Specifies the Yarn configuration parameters (yarn-site.xml) for the
     * HDInsight cluster.
     */
    @JsonProperty(value = "typeProperties.yarnConfiguration")
    private Object yarnConfiguration;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Specifies the size of the head node for the HDInsight cluster.
     */
    @JsonProperty(value = "typeProperties.headNodeSize")
    private Object headNodeSize;

    /**
     * Specifies the size of the data node for the HDInsight cluster.
     */
    @JsonProperty(value = "typeProperties.dataNodeSize")
    private Object dataNodeSize;

    /**
     * Specifies the size of the Zoo Keeper node for the HDInsight cluster.
     */
    @JsonProperty(value = "typeProperties.zookeeperNodeSize")
    private Object zookeeperNodeSize;

    /**
     * Get number of worker/data nodes in the cluster. Suggestion value: 4. Type: string (or Expression with resultType string).
     *
     * @return the clusterSize value
     */
    public Object clusterSize() {
        return this.clusterSize;
    }

    /**
     * Set number of worker/data nodes in the cluster. Suggestion value: 4. Type: string (or Expression with resultType string).
     *
     * @param clusterSize the clusterSize value to set
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService withClusterSize(Object clusterSize) {
        this.clusterSize = clusterSize;
        return this;
    }

    /**
     * Get the allowed idle time for the on-demand HDInsight cluster. Specifies how long the on-demand HDInsight cluster stays alive after completion of an activity run if there are no other active jobs in the cluster. The minimum value is 5 mins. Type: string (or Expression with resultType string).
     *
     * @return the timeToLive value
     */
    public Object timeToLive() {
        return this.timeToLive;
    }

    /**
     * Set the allowed idle time for the on-demand HDInsight cluster. Specifies how long the on-demand HDInsight cluster stays alive after completion of an activity run if there are no other active jobs in the cluster. The minimum value is 5 mins. Type: string (or Expression with resultType string).
     *
     * @param timeToLive the timeToLive value to set
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService withTimeToLive(Object timeToLive) {
        this.timeToLive = timeToLive;
        return this;
    }

    /**
     * Get version of the HDInsight cluster.  Type: string (or Expression with resultType string).
     *
     * @return the version value
     */
    public Object version() {
        return this.version;
    }

    /**
     * Set version of the HDInsight cluster.  Type: string (or Expression with resultType string).
     *
     * @param version the version value to set
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService withVersion(Object version) {
        this.version = version;
        return this;
    }

    /**
     * Get azure Storage linked service to be used by the on-demand cluster for storing and processing data.
     *
     * @return the linkedServiceName value
     */
    public LinkedServiceReference linkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * Set azure Storage linked service to be used by the on-demand cluster for storing and processing data.
     *
     * @param linkedServiceName the linkedServiceName value to set
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        this.linkedServiceName = linkedServiceName;
        return this;
    }

    /**
     * Get the customer’s subscription to host the cluster. Type: string (or Expression with resultType string).
     *
     * @return the hostSubscriptionId value
     */
    public Object hostSubscriptionId() {
        return this.hostSubscriptionId;
    }

    /**
     * Set the customer’s subscription to host the cluster. Type: string (or Expression with resultType string).
     *
     * @param hostSubscriptionId the hostSubscriptionId value to set
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService withHostSubscriptionId(Object hostSubscriptionId) {
        this.hostSubscriptionId = hostSubscriptionId;
        return this;
    }

    /**
     * Get the service principal id for the hostSubscriptionId. Type: string (or Expression with resultType string).
     *
     * @return the servicePrincipalId value
     */
    public Object servicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the service principal id for the hostSubscriptionId. Type: string (or Expression with resultType string).
     *
     * @param servicePrincipalId the servicePrincipalId value to set
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService withServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the key for the service principal id.
     *
     * @return the servicePrincipalKey value
     */
    public SecretBase servicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set the key for the service principal id.
     *
     * @param servicePrincipalKey the servicePrincipalKey value to set
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService withServicePrincipalKey(SecretBase servicePrincipalKey) {
        this.servicePrincipalKey = servicePrincipalKey;
        return this;
    }

    /**
     * Get the Tenant id/name to which the service principal belongs. Type: string (or Expression with resultType string).
     *
     * @return the tenant value
     */
    public Object tenant() {
        return this.tenant;
    }

    /**
     * Set the Tenant id/name to which the service principal belongs. Type: string (or Expression with resultType string).
     *
     * @param tenant the tenant value to set
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService withTenant(Object tenant) {
        this.tenant = tenant;
        return this;
    }

    /**
     * Get the resource group where the cluster belongs. Type: string (or Expression with resultType string).
     *
     * @return the clusterResourceGroup value
     */
    public Object clusterResourceGroup() {
        return this.clusterResourceGroup;
    }

    /**
     * Set the resource group where the cluster belongs. Type: string (or Expression with resultType string).
     *
     * @param clusterResourceGroup the clusterResourceGroup value to set
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService withClusterResourceGroup(Object clusterResourceGroup) {
        this.clusterResourceGroup = clusterResourceGroup;
        return this;
    }

    /**
     * Get the prefix of cluster name, postfix will be distinct with timestamp. Type: string (or Expression with resultType string).
     *
     * @return the clusterNamePrefix value
     */
    public Object clusterNamePrefix() {
        return this.clusterNamePrefix;
    }

    /**
     * Set the prefix of cluster name, postfix will be distinct with timestamp. Type: string (or Expression with resultType string).
     *
     * @param clusterNamePrefix the clusterNamePrefix value to set
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService withClusterNamePrefix(Object clusterNamePrefix) {
        this.clusterNamePrefix = clusterNamePrefix;
        return this;
    }

    /**
     * Get the username to access the cluster. Type: string (or Expression with resultType string).
     *
     * @return the clusterUserName value
     */
    public Object clusterUserName() {
        return this.clusterUserName;
    }

    /**
     * Set the username to access the cluster. Type: string (or Expression with resultType string).
     *
     * @param clusterUserName the clusterUserName value to set
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService withClusterUserName(Object clusterUserName) {
        this.clusterUserName = clusterUserName;
        return this;
    }

    /**
     * Get the password to access the cluster.
     *
     * @return the clusterPassword value
     */
    public SecretBase clusterPassword() {
        return this.clusterPassword;
    }

    /**
     * Set the password to access the cluster.
     *
     * @param clusterPassword the clusterPassword value to set
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService withClusterPassword(SecretBase clusterPassword) {
        this.clusterPassword = clusterPassword;
        return this;
    }

    /**
     * Get the username to SSH remotely connect to cluster’s node (for Linux). Type: string (or Expression with resultType string).
     *
     * @return the clusterSshUserName value
     */
    public Object clusterSshUserName() {
        return this.clusterSshUserName;
    }

    /**
     * Set the username to SSH remotely connect to cluster’s node (for Linux). Type: string (or Expression with resultType string).
     *
     * @param clusterSshUserName the clusterSshUserName value to set
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService withClusterSshUserName(Object clusterSshUserName) {
        this.clusterSshUserName = clusterSshUserName;
        return this;
    }

    /**
     * Get the password to SSH remotely connect cluster’s node (for Linux).
     *
     * @return the clusterSshPassword value
     */
    public SecretBase clusterSshPassword() {
        return this.clusterSshPassword;
    }

    /**
     * Set the password to SSH remotely connect cluster’s node (for Linux).
     *
     * @param clusterSshPassword the clusterSshPassword value to set
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService withClusterSshPassword(SecretBase clusterSshPassword) {
        this.clusterSshPassword = clusterSshPassword;
        return this;
    }

    /**
     * Get specifies additional storage accounts for the HDInsight linked service so that the Data Factory service can register them on your behalf.
     *
     * @return the additionalLinkedServiceNames value
     */
    public List<LinkedServiceReference> additionalLinkedServiceNames() {
        return this.additionalLinkedServiceNames;
    }

    /**
     * Set specifies additional storage accounts for the HDInsight linked service so that the Data Factory service can register them on your behalf.
     *
     * @param additionalLinkedServiceNames the additionalLinkedServiceNames value to set
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService withAdditionalLinkedServiceNames(List<LinkedServiceReference> additionalLinkedServiceNames) {
        this.additionalLinkedServiceNames = additionalLinkedServiceNames;
        return this;
    }

    /**
     * Get the name of Azure SQL linked service that point to the HCatalog database. The on-demand HDInsight cluster is created by using the Azure SQL database as the metastore.
     *
     * @return the hcatalogLinkedServiceName value
     */
    public LinkedServiceReference hcatalogLinkedServiceName() {
        return this.hcatalogLinkedServiceName;
    }

    /**
     * Set the name of Azure SQL linked service that point to the HCatalog database. The on-demand HDInsight cluster is created by using the Azure SQL database as the metastore.
     *
     * @param hcatalogLinkedServiceName the hcatalogLinkedServiceName value to set
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService withHcatalogLinkedServiceName(LinkedServiceReference hcatalogLinkedServiceName) {
        this.hcatalogLinkedServiceName = hcatalogLinkedServiceName;
        return this;
    }

    /**
     * Get the cluster type. Type: string (or Expression with resultType string).
     *
     * @return the clusterType value
     */
    public Object clusterType() {
        return this.clusterType;
    }

    /**
     * Set the cluster type. Type: string (or Expression with resultType string).
     *
     * @param clusterType the clusterType value to set
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService withClusterType(Object clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * Get the version of spark if the cluster type is 'spark'. Type: string (or Expression with resultType string).
     *
     * @return the sparkVersion value
     */
    public Object sparkVersion() {
        return this.sparkVersion;
    }

    /**
     * Set the version of spark if the cluster type is 'spark'. Type: string (or Expression with resultType string).
     *
     * @param sparkVersion the sparkVersion value to set
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService withSparkVersion(Object sparkVersion) {
        this.sparkVersion = sparkVersion;
        return this;
    }

    /**
     * Get specifies the core configuration parameters (as in core-site.xml) for the HDInsight cluster to be created.
     *
     * @return the coreConfiguration value
     */
    public Object coreConfiguration() {
        return this.coreConfiguration;
    }

    /**
     * Set specifies the core configuration parameters (as in core-site.xml) for the HDInsight cluster to be created.
     *
     * @param coreConfiguration the coreConfiguration value to set
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService withCoreConfiguration(Object coreConfiguration) {
        this.coreConfiguration = coreConfiguration;
        return this;
    }

    /**
     * Get specifies the HBase configuration parameters (hbase-site.xml) for the HDInsight cluster.
     *
     * @return the hBaseConfiguration value
     */
    public Object hBaseConfiguration() {
        return this.hBaseConfiguration;
    }

    /**
     * Set specifies the HBase configuration parameters (hbase-site.xml) for the HDInsight cluster.
     *
     * @param hBaseConfiguration the hBaseConfiguration value to set
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService withHBaseConfiguration(Object hBaseConfiguration) {
        this.hBaseConfiguration = hBaseConfiguration;
        return this;
    }

    /**
     * Get specifies the HDFS configuration parameters (hdfs-site.xml) for the HDInsight cluster.
     *
     * @return the hdfsConfiguration value
     */
    public Object hdfsConfiguration() {
        return this.hdfsConfiguration;
    }

    /**
     * Set specifies the HDFS configuration parameters (hdfs-site.xml) for the HDInsight cluster.
     *
     * @param hdfsConfiguration the hdfsConfiguration value to set
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService withHdfsConfiguration(Object hdfsConfiguration) {
        this.hdfsConfiguration = hdfsConfiguration;
        return this;
    }

    /**
     * Get specifies the hive configuration parameters (hive-site.xml) for the HDInsight cluster.
     *
     * @return the hiveConfiguration value
     */
    public Object hiveConfiguration() {
        return this.hiveConfiguration;
    }

    /**
     * Set specifies the hive configuration parameters (hive-site.xml) for the HDInsight cluster.
     *
     * @param hiveConfiguration the hiveConfiguration value to set
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService withHiveConfiguration(Object hiveConfiguration) {
        this.hiveConfiguration = hiveConfiguration;
        return this;
    }

    /**
     * Get specifies the MapReduce configuration parameters (mapred-site.xml) for the HDInsight cluster.
     *
     * @return the mapReduceConfiguration value
     */
    public Object mapReduceConfiguration() {
        return this.mapReduceConfiguration;
    }

    /**
     * Set specifies the MapReduce configuration parameters (mapred-site.xml) for the HDInsight cluster.
     *
     * @param mapReduceConfiguration the mapReduceConfiguration value to set
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService withMapReduceConfiguration(Object mapReduceConfiguration) {
        this.mapReduceConfiguration = mapReduceConfiguration;
        return this;
    }

    /**
     * Get specifies the Oozie configuration parameters (oozie-site.xml) for the HDInsight cluster.
     *
     * @return the oozieConfiguration value
     */
    public Object oozieConfiguration() {
        return this.oozieConfiguration;
    }

    /**
     * Set specifies the Oozie configuration parameters (oozie-site.xml) for the HDInsight cluster.
     *
     * @param oozieConfiguration the oozieConfiguration value to set
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService withOozieConfiguration(Object oozieConfiguration) {
        this.oozieConfiguration = oozieConfiguration;
        return this;
    }

    /**
     * Get specifies the Storm configuration parameters (storm-site.xml) for the HDInsight cluster.
     *
     * @return the stormConfiguration value
     */
    public Object stormConfiguration() {
        return this.stormConfiguration;
    }

    /**
     * Set specifies the Storm configuration parameters (storm-site.xml) for the HDInsight cluster.
     *
     * @param stormConfiguration the stormConfiguration value to set
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService withStormConfiguration(Object stormConfiguration) {
        this.stormConfiguration = stormConfiguration;
        return this;
    }

    /**
     * Get specifies the Yarn configuration parameters (yarn-site.xml) for the HDInsight cluster.
     *
     * @return the yarnConfiguration value
     */
    public Object yarnConfiguration() {
        return this.yarnConfiguration;
    }

    /**
     * Set specifies the Yarn configuration parameters (yarn-site.xml) for the HDInsight cluster.
     *
     * @param yarnConfiguration the yarnConfiguration value to set
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService withYarnConfiguration(Object yarnConfiguration) {
        this.yarnConfiguration = yarnConfiguration;
        return this;
    }

    /**
     * Get the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Get specifies the size of the head node for the HDInsight cluster.
     *
     * @return the headNodeSize value
     */
    public Object headNodeSize() {
        return this.headNodeSize;
    }

    /**
     * Set specifies the size of the head node for the HDInsight cluster.
     *
     * @param headNodeSize the headNodeSize value to set
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService withHeadNodeSize(Object headNodeSize) {
        this.headNodeSize = headNodeSize;
        return this;
    }

    /**
     * Get specifies the size of the data node for the HDInsight cluster.
     *
     * @return the dataNodeSize value
     */
    public Object dataNodeSize() {
        return this.dataNodeSize;
    }

    /**
     * Set specifies the size of the data node for the HDInsight cluster.
     *
     * @param dataNodeSize the dataNodeSize value to set
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService withDataNodeSize(Object dataNodeSize) {
        this.dataNodeSize = dataNodeSize;
        return this;
    }

    /**
     * Get specifies the size of the Zoo Keeper node for the HDInsight cluster.
     *
     * @return the zookeeperNodeSize value
     */
    public Object zookeeperNodeSize() {
        return this.zookeeperNodeSize;
    }

    /**
     * Set specifies the size of the Zoo Keeper node for the HDInsight cluster.
     *
     * @param zookeeperNodeSize the zookeeperNodeSize value to set
     * @return the HDInsightOnDemandLinkedService object itself.
     */
    public HDInsightOnDemandLinkedService withZookeeperNodeSize(Object zookeeperNodeSize) {
        this.zookeeperNodeSize = zookeeperNodeSize;
        return this;
    }

}
