/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.BigDataPools;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.Operations;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.IpFirewallRules;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPools;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolMetadataSyncConfigs;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolOperationResults;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolGeoBackupPolicies;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolDataWarehouseUserActivities;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolRestorePoints;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolReplicationLinks;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolTransparentDataEncryptions;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolBlobAuditingPolicies;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolOperations;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolUsages;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolSensitivityLabels;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolSchemas;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolTables;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolTableColumns;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolConnectionPolicies;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolVulnerabilityAssessments;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolVulnerabilityAssessmentScans;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolSecurityAlertPolicies;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolVulnerabilityAssessmentRuleBaselines;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.ExtendedSqlPoolBlobAuditingPolicies;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.DataMaskingPolicies;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.DataMaskingRules;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolColumns;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.Workspaces;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.WorkspaceAadAdmins;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.WorkspaceManagedIdentitySqlControlSettings;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.RestorableDroppedSqlPools;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.IntegrationRuntimes;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.IntegrationRuntimeNodeIpAddressOperations;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.IntegrationRuntimeObjectMetadatas;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.IntegrationRuntimeNodes;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.IntegrationRuntimeCredentials;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.IntegrationRuntimeConnectionInfos;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.IntegrationRuntimeAuthKeysOperations;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.IntegrationRuntimeMonitoringDatas;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.IntegrationRuntimeStatusOperations;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.PrivateLinkResources;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.PrivateEndpointConnections;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.PrivateLinkHubs;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure Synapse resource management.
 */
public final class SynapseManager extends ManagerCore<SynapseManager, SynapseManagementClientImpl> {
    private BigDataPools bigDataPools;
    private Operations operations;
    private IpFirewallRules ipFirewallRules;
    private SqlPools sqlPools;
    private SqlPoolMetadataSyncConfigs sqlPoolMetadataSyncConfigs;
    private SqlPoolOperationResults sqlPoolOperationResults;
    private SqlPoolGeoBackupPolicies sqlPoolGeoBackupPolicies;
    private SqlPoolDataWarehouseUserActivities sqlPoolDataWarehouseUserActivities;
    private SqlPoolRestorePoints sqlPoolRestorePoints;
    private SqlPoolReplicationLinks sqlPoolReplicationLinks;
    private SqlPoolTransparentDataEncryptions sqlPoolTransparentDataEncryptions;
    private SqlPoolBlobAuditingPolicies sqlPoolBlobAuditingPolicies;
    private SqlPoolOperations sqlPoolOperations;
    private SqlPoolUsages sqlPoolUsages;
    private SqlPoolSensitivityLabels sqlPoolSensitivityLabels;
    private SqlPoolSchemas sqlPoolSchemas;
    private SqlPoolTables sqlPoolTables;
    private SqlPoolTableColumns sqlPoolTableColumns;
    private SqlPoolConnectionPolicies sqlPoolConnectionPolicies;
    private SqlPoolVulnerabilityAssessments sqlPoolVulnerabilityAssessments;
    private SqlPoolVulnerabilityAssessmentScans sqlPoolVulnerabilityAssessmentScans;
    private SqlPoolSecurityAlertPolicies sqlPoolSecurityAlertPolicies;
    private SqlPoolVulnerabilityAssessmentRuleBaselines sqlPoolVulnerabilityAssessmentRuleBaselines;
    private ExtendedSqlPoolBlobAuditingPolicies extendedSqlPoolBlobAuditingPolicies;
    private DataMaskingPolicies dataMaskingPolicies;
    private DataMaskingRules dataMaskingRules;
    private SqlPoolColumns sqlPoolColumns;
    private Workspaces workspaces;
    private WorkspaceAadAdmins workspaceAadAdmins;
    private WorkspaceManagedIdentitySqlControlSettings workspaceManagedIdentitySqlControlSettings;
    private RestorableDroppedSqlPools restorableDroppedSqlPools;
    private IntegrationRuntimes integrationRuntimes;
    private IntegrationRuntimeNodeIpAddressOperations integrationRuntimeNodeIpAddressOperations;
    private IntegrationRuntimeObjectMetadatas integrationRuntimeObjectMetadatas;
    private IntegrationRuntimeNodes integrationRuntimeNodes;
    private IntegrationRuntimeCredentials integrationRuntimeCredentials;
    private IntegrationRuntimeConnectionInfos integrationRuntimeConnectionInfos;
    private IntegrationRuntimeAuthKeysOperations integrationRuntimeAuthKeysOperations;
    private IntegrationRuntimeMonitoringDatas integrationRuntimeMonitoringDatas;
    private IntegrationRuntimeStatusOperations integrationRuntimeStatusOperations;
    private PrivateLinkResources privateLinkResources;
    private PrivateEndpointConnections privateEndpointConnections;
    private PrivateLinkHubs privateLinkHubs;
    /**
    * Get a Configurable instance that can be used to create SynapseManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new SynapseManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of SynapseManager that exposes Synapse resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the SynapseManager
    */
    public static SynapseManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new SynapseManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of SynapseManager that exposes Synapse resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the SynapseManager
    */
    public static SynapseManager authenticate(RestClient restClient, String subscriptionId) {
        return new SynapseManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of SynapseManager that exposes Synapse management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing Synapse management API entry points that work across subscriptions
        */
        SynapseManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage BigDataPools.
     */
    public BigDataPools bigDataPools() {
        if (this.bigDataPools == null) {
            this.bigDataPools = new BigDataPoolsImpl(this);
        }
        return this.bigDataPools;
    }

    /**
     * @return Entry point to manage Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(this);
        }
        return this.operations;
    }

    /**
     * @return Entry point to manage IpFirewallRules.
     */
    public IpFirewallRules ipFirewallRules() {
        if (this.ipFirewallRules == null) {
            this.ipFirewallRules = new IpFirewallRulesImpl(this);
        }
        return this.ipFirewallRules;
    }

    /**
     * @return Entry point to manage SqlPools.
     */
    public SqlPools sqlPools() {
        if (this.sqlPools == null) {
            this.sqlPools = new SqlPoolsImpl(this);
        }
        return this.sqlPools;
    }

    /**
     * @return Entry point to manage SqlPoolMetadataSyncConfigs.
     */
    public SqlPoolMetadataSyncConfigs sqlPoolMetadataSyncConfigs() {
        if (this.sqlPoolMetadataSyncConfigs == null) {
            this.sqlPoolMetadataSyncConfigs = new SqlPoolMetadataSyncConfigsImpl(this);
        }
        return this.sqlPoolMetadataSyncConfigs;
    }

    /**
     * @return Entry point to manage SqlPoolOperationResults.
     */
    public SqlPoolOperationResults sqlPoolOperationResults() {
        if (this.sqlPoolOperationResults == null) {
            this.sqlPoolOperationResults = new SqlPoolOperationResultsImpl(this);
        }
        return this.sqlPoolOperationResults;
    }

    /**
     * @return Entry point to manage SqlPoolGeoBackupPolicies.
     */
    public SqlPoolGeoBackupPolicies sqlPoolGeoBackupPolicies() {
        if (this.sqlPoolGeoBackupPolicies == null) {
            this.sqlPoolGeoBackupPolicies = new SqlPoolGeoBackupPoliciesImpl(this);
        }
        return this.sqlPoolGeoBackupPolicies;
    }

    /**
     * @return Entry point to manage SqlPoolDataWarehouseUserActivities.
     */
    public SqlPoolDataWarehouseUserActivities sqlPoolDataWarehouseUserActivities() {
        if (this.sqlPoolDataWarehouseUserActivities == null) {
            this.sqlPoolDataWarehouseUserActivities = new SqlPoolDataWarehouseUserActivitiesImpl(this);
        }
        return this.sqlPoolDataWarehouseUserActivities;
    }

    /**
     * @return Entry point to manage SqlPoolRestorePoints.
     */
    public SqlPoolRestorePoints sqlPoolRestorePoints() {
        if (this.sqlPoolRestorePoints == null) {
            this.sqlPoolRestorePoints = new SqlPoolRestorePointsImpl(this);
        }
        return this.sqlPoolRestorePoints;
    }

    /**
     * @return Entry point to manage SqlPoolReplicationLinks.
     */
    public SqlPoolReplicationLinks sqlPoolReplicationLinks() {
        if (this.sqlPoolReplicationLinks == null) {
            this.sqlPoolReplicationLinks = new SqlPoolReplicationLinksImpl(this);
        }
        return this.sqlPoolReplicationLinks;
    }

    /**
     * @return Entry point to manage SqlPoolTransparentDataEncryptions.
     */
    public SqlPoolTransparentDataEncryptions sqlPoolTransparentDataEncryptions() {
        if (this.sqlPoolTransparentDataEncryptions == null) {
            this.sqlPoolTransparentDataEncryptions = new SqlPoolTransparentDataEncryptionsImpl(this);
        }
        return this.sqlPoolTransparentDataEncryptions;
    }

    /**
     * @return Entry point to manage SqlPoolBlobAuditingPolicies.
     */
    public SqlPoolBlobAuditingPolicies sqlPoolBlobAuditingPolicies() {
        if (this.sqlPoolBlobAuditingPolicies == null) {
            this.sqlPoolBlobAuditingPolicies = new SqlPoolBlobAuditingPoliciesImpl(this);
        }
        return this.sqlPoolBlobAuditingPolicies;
    }

    /**
     * @return Entry point to manage SqlPoolOperations.
     */
    public SqlPoolOperations sqlPoolOperations() {
        if (this.sqlPoolOperations == null) {
            this.sqlPoolOperations = new SqlPoolOperationsImpl(this);
        }
        return this.sqlPoolOperations;
    }

    /**
     * @return Entry point to manage SqlPoolUsages.
     */
    public SqlPoolUsages sqlPoolUsages() {
        if (this.sqlPoolUsages == null) {
            this.sqlPoolUsages = new SqlPoolUsagesImpl(this);
        }
        return this.sqlPoolUsages;
    }

    /**
     * @return Entry point to manage SqlPoolSensitivityLabels.
     */
    public SqlPoolSensitivityLabels sqlPoolSensitivityLabels() {
        if (this.sqlPoolSensitivityLabels == null) {
            this.sqlPoolSensitivityLabels = new SqlPoolSensitivityLabelsImpl(this);
        }
        return this.sqlPoolSensitivityLabels;
    }

    /**
     * @return Entry point to manage SqlPoolSchemas.
     */
    public SqlPoolSchemas sqlPoolSchemas() {
        if (this.sqlPoolSchemas == null) {
            this.sqlPoolSchemas = new SqlPoolSchemasImpl(this);
        }
        return this.sqlPoolSchemas;
    }

    /**
     * @return Entry point to manage SqlPoolTables.
     */
    public SqlPoolTables sqlPoolTables() {
        if (this.sqlPoolTables == null) {
            this.sqlPoolTables = new SqlPoolTablesImpl(this);
        }
        return this.sqlPoolTables;
    }

    /**
     * @return Entry point to manage SqlPoolTableColumns.
     */
    public SqlPoolTableColumns sqlPoolTableColumns() {
        if (this.sqlPoolTableColumns == null) {
            this.sqlPoolTableColumns = new SqlPoolTableColumnsImpl(this);
        }
        return this.sqlPoolTableColumns;
    }

    /**
     * @return Entry point to manage SqlPoolConnectionPolicies.
     */
    public SqlPoolConnectionPolicies sqlPoolConnectionPolicies() {
        if (this.sqlPoolConnectionPolicies == null) {
            this.sqlPoolConnectionPolicies = new SqlPoolConnectionPoliciesImpl(this);
        }
        return this.sqlPoolConnectionPolicies;
    }

    /**
     * @return Entry point to manage SqlPoolVulnerabilityAssessments.
     */
    public SqlPoolVulnerabilityAssessments sqlPoolVulnerabilityAssessments() {
        if (this.sqlPoolVulnerabilityAssessments == null) {
            this.sqlPoolVulnerabilityAssessments = new SqlPoolVulnerabilityAssessmentsImpl(this);
        }
        return this.sqlPoolVulnerabilityAssessments;
    }

    /**
     * @return Entry point to manage SqlPoolVulnerabilityAssessmentScans.
     */
    public SqlPoolVulnerabilityAssessmentScans sqlPoolVulnerabilityAssessmentScans() {
        if (this.sqlPoolVulnerabilityAssessmentScans == null) {
            this.sqlPoolVulnerabilityAssessmentScans = new SqlPoolVulnerabilityAssessmentScansImpl(this);
        }
        return this.sqlPoolVulnerabilityAssessmentScans;
    }

    /**
     * @return Entry point to manage SqlPoolSecurityAlertPolicies.
     */
    public SqlPoolSecurityAlertPolicies sqlPoolSecurityAlertPolicies() {
        if (this.sqlPoolSecurityAlertPolicies == null) {
            this.sqlPoolSecurityAlertPolicies = new SqlPoolSecurityAlertPoliciesImpl(this);
        }
        return this.sqlPoolSecurityAlertPolicies;
    }

    /**
     * @return Entry point to manage SqlPoolVulnerabilityAssessmentRuleBaselines.
     */
    public SqlPoolVulnerabilityAssessmentRuleBaselines sqlPoolVulnerabilityAssessmentRuleBaselines() {
        if (this.sqlPoolVulnerabilityAssessmentRuleBaselines == null) {
            this.sqlPoolVulnerabilityAssessmentRuleBaselines = new SqlPoolVulnerabilityAssessmentRuleBaselinesImpl(this);
        }
        return this.sqlPoolVulnerabilityAssessmentRuleBaselines;
    }

    /**
     * @return Entry point to manage ExtendedSqlPoolBlobAuditingPolicies.
     */
    public ExtendedSqlPoolBlobAuditingPolicies extendedSqlPoolBlobAuditingPolicies() {
        if (this.extendedSqlPoolBlobAuditingPolicies == null) {
            this.extendedSqlPoolBlobAuditingPolicies = new ExtendedSqlPoolBlobAuditingPoliciesImpl(this);
        }
        return this.extendedSqlPoolBlobAuditingPolicies;
    }

    /**
     * @return Entry point to manage DataMaskingPolicies.
     */
    public DataMaskingPolicies dataMaskingPolicies() {
        if (this.dataMaskingPolicies == null) {
            this.dataMaskingPolicies = new DataMaskingPoliciesImpl(this);
        }
        return this.dataMaskingPolicies;
    }

    /**
     * @return Entry point to manage DataMaskingRules.
     */
    public DataMaskingRules dataMaskingRules() {
        if (this.dataMaskingRules == null) {
            this.dataMaskingRules = new DataMaskingRulesImpl(this);
        }
        return this.dataMaskingRules;
    }

    /**
     * @return Entry point to manage SqlPoolColumns.
     */
    public SqlPoolColumns sqlPoolColumns() {
        if (this.sqlPoolColumns == null) {
            this.sqlPoolColumns = new SqlPoolColumnsImpl(this);
        }
        return this.sqlPoolColumns;
    }

    /**
     * @return Entry point to manage Workspaces.
     */
    public Workspaces workspaces() {
        if (this.workspaces == null) {
            this.workspaces = new WorkspacesImpl(this);
        }
        return this.workspaces;
    }

    /**
     * @return Entry point to manage WorkspaceAadAdmins.
     */
    public WorkspaceAadAdmins workspaceAadAdmins() {
        if (this.workspaceAadAdmins == null) {
            this.workspaceAadAdmins = new WorkspaceAadAdminsImpl(this);
        }
        return this.workspaceAadAdmins;
    }

    /**
     * @return Entry point to manage WorkspaceManagedIdentitySqlControlSettings.
     */
    public WorkspaceManagedIdentitySqlControlSettings workspaceManagedIdentitySqlControlSettings() {
        if (this.workspaceManagedIdentitySqlControlSettings == null) {
            this.workspaceManagedIdentitySqlControlSettings = new WorkspaceManagedIdentitySqlControlSettingsImpl(this);
        }
        return this.workspaceManagedIdentitySqlControlSettings;
    }

    /**
     * @return Entry point to manage RestorableDroppedSqlPools.
     */
    public RestorableDroppedSqlPools restorableDroppedSqlPools() {
        if (this.restorableDroppedSqlPools == null) {
            this.restorableDroppedSqlPools = new RestorableDroppedSqlPoolsImpl(this);
        }
        return this.restorableDroppedSqlPools;
    }

    /**
     * @return Entry point to manage IntegrationRuntimes.
     */
    public IntegrationRuntimes integrationRuntimes() {
        if (this.integrationRuntimes == null) {
            this.integrationRuntimes = new IntegrationRuntimesImpl(this);
        }
        return this.integrationRuntimes;
    }

    /**
     * @return Entry point to manage IntegrationRuntimeNodeIpAddressOperations.
     */
    public IntegrationRuntimeNodeIpAddressOperations integrationRuntimeNodeIpAddressOperations() {
        if (this.integrationRuntimeNodeIpAddressOperations == null) {
            this.integrationRuntimeNodeIpAddressOperations = new IntegrationRuntimeNodeIpAddressOperationsImpl(this);
        }
        return this.integrationRuntimeNodeIpAddressOperations;
    }

    /**
     * @return Entry point to manage IntegrationRuntimeObjectMetadatas.
     */
    public IntegrationRuntimeObjectMetadatas integrationRuntimeObjectMetadatas() {
        if (this.integrationRuntimeObjectMetadatas == null) {
            this.integrationRuntimeObjectMetadatas = new IntegrationRuntimeObjectMetadatasImpl(this);
        }
        return this.integrationRuntimeObjectMetadatas;
    }

    /**
     * @return Entry point to manage IntegrationRuntimeNodes.
     */
    public IntegrationRuntimeNodes integrationRuntimeNodes() {
        if (this.integrationRuntimeNodes == null) {
            this.integrationRuntimeNodes = new IntegrationRuntimeNodesImpl(this);
        }
        return this.integrationRuntimeNodes;
    }

    /**
     * @return Entry point to manage IntegrationRuntimeCredentials.
     */
    public IntegrationRuntimeCredentials integrationRuntimeCredentials() {
        if (this.integrationRuntimeCredentials == null) {
            this.integrationRuntimeCredentials = new IntegrationRuntimeCredentialsImpl(this);
        }
        return this.integrationRuntimeCredentials;
    }

    /**
     * @return Entry point to manage IntegrationRuntimeConnectionInfos.
     */
    public IntegrationRuntimeConnectionInfos integrationRuntimeConnectionInfos() {
        if (this.integrationRuntimeConnectionInfos == null) {
            this.integrationRuntimeConnectionInfos = new IntegrationRuntimeConnectionInfosImpl(this);
        }
        return this.integrationRuntimeConnectionInfos;
    }

    /**
     * @return Entry point to manage IntegrationRuntimeAuthKeysOperations.
     */
    public IntegrationRuntimeAuthKeysOperations integrationRuntimeAuthKeysOperations() {
        if (this.integrationRuntimeAuthKeysOperations == null) {
            this.integrationRuntimeAuthKeysOperations = new IntegrationRuntimeAuthKeysOperationsImpl(this);
        }
        return this.integrationRuntimeAuthKeysOperations;
    }

    /**
     * @return Entry point to manage IntegrationRuntimeMonitoringDatas.
     */
    public IntegrationRuntimeMonitoringDatas integrationRuntimeMonitoringDatas() {
        if (this.integrationRuntimeMonitoringDatas == null) {
            this.integrationRuntimeMonitoringDatas = new IntegrationRuntimeMonitoringDatasImpl(this);
        }
        return this.integrationRuntimeMonitoringDatas;
    }

    /**
     * @return Entry point to manage IntegrationRuntimeStatusOperations.
     */
    public IntegrationRuntimeStatusOperations integrationRuntimeStatusOperations() {
        if (this.integrationRuntimeStatusOperations == null) {
            this.integrationRuntimeStatusOperations = new IntegrationRuntimeStatusOperationsImpl(this);
        }
        return this.integrationRuntimeStatusOperations;
    }

    /**
     * @return Entry point to manage PrivateLinkResources.
     */
    public PrivateLinkResources privateLinkResources() {
        if (this.privateLinkResources == null) {
            this.privateLinkResources = new PrivateLinkResourcesImpl(this);
        }
        return this.privateLinkResources;
    }

    /**
     * @return Entry point to manage PrivateEndpointConnections.
     */
    public PrivateEndpointConnections privateEndpointConnections() {
        if (this.privateEndpointConnections == null) {
            this.privateEndpointConnections = new PrivateEndpointConnectionsImpl(this);
        }
        return this.privateEndpointConnections;
    }

    /**
     * @return Entry point to manage PrivateLinkHubs.
     */
    public PrivateLinkHubs privateLinkHubs() {
        if (this.privateLinkHubs == null) {
            this.privateLinkHubs = new PrivateLinkHubsImpl(this);
        }
        return this.privateLinkHubs;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public SynapseManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return SynapseManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private SynapseManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new SynapseManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
