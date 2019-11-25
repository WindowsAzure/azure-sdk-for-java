/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.ProtectionIntents;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.BackupStatus;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.FeatureSupports;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.BackupJobs;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.JobDetails;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.ExportJobsOperationResults;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.Jobs;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.BackupPolicies;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.BackupProtectedItems;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.BackupUsageSummaries;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.BackupResourceVaultConfigs;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.BackupEngines;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.ProtectionContainerRefreshOperationResults;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.ProtectableContainers;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.ProtectionContainers;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.BackupWorkloadItems;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.ProtectionContainerOperationResults;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.ProtectedItems;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.Backups;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.ProtectedItemOperationResults;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.ProtectedItemOperationStatuses;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.RecoveryPoints;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.ItemLevelRecoveryConnections;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.Restores;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.JobCancellations;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.JobOperationResults;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.BackupOperationResults;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.BackupOperationStatuses;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.ProtectionPolicies;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.ProtectionPolicyOperationResults;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.ProtectionPolicyOperationStatuses;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.BackupProtectableItems;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.BackupProtectionContainers;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.SecurityPINs;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.BackupResourceStorageConfigs;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.Operations;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure RecoveryServices resource management.
 */
public final class RecoveryServicesManager extends ManagerCore<RecoveryServicesManager, RecoveryServicesBackupClientImpl> {
    private ProtectionIntents protectionIntents;
    private BackupStatus backupStatus;
    private FeatureSupports featureSupports;
    private BackupJobs backupJobs;
    private JobDetails jobDetails;
    private ExportJobsOperationResults exportJobsOperationResults;
    private Jobs jobs;
    private BackupPolicies backupPolicies;
    private BackupProtectedItems backupProtectedItems;
    private BackupUsageSummaries backupUsageSummaries;
    private BackupResourceVaultConfigs backupResourceVaultConfigs;
    private BackupEngines backupEngines;
    private ProtectionContainerRefreshOperationResults protectionContainerRefreshOperationResults;
    private ProtectableContainers protectableContainers;
    private ProtectionContainers protectionContainers;
    private BackupWorkloadItems backupWorkloadItems;
    private ProtectionContainerOperationResults protectionContainerOperationResults;
    private ProtectedItems protectedItems;
    private Backups backups;
    private ProtectedItemOperationResults protectedItemOperationResults;
    private ProtectedItemOperationStatuses protectedItemOperationStatuses;
    private RecoveryPoints recoveryPoints;
    private ItemLevelRecoveryConnections itemLevelRecoveryConnections;
    private Restores restores;
    private JobCancellations jobCancellations;
    private JobOperationResults jobOperationResults;
    private BackupOperationResults backupOperationResults;
    private BackupOperationStatuses backupOperationStatuses;
    private ProtectionPolicies protectionPolicies;
    private ProtectionPolicyOperationResults protectionPolicyOperationResults;
    private ProtectionPolicyOperationStatuses protectionPolicyOperationStatuses;
    private BackupProtectableItems backupProtectableItems;
    private BackupProtectionContainers backupProtectionContainers;
    private SecurityPINs securityPINs;
    private BackupResourceStorageConfigs backupResourceStorageConfigs;
    private Operations operations;
    /**
    * Get a Configurable instance that can be used to create RecoveryServicesManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new RecoveryServicesManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of RecoveryServicesManager that exposes RecoveryServices resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the RecoveryServicesManager
    */
    public static RecoveryServicesManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new RecoveryServicesManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of RecoveryServicesManager that exposes RecoveryServices resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the RecoveryServicesManager
    */
    public static RecoveryServicesManager authenticate(RestClient restClient, String subscriptionId) {
        return new RecoveryServicesManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of RecoveryServicesManager that exposes RecoveryServices management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing RecoveryServices management API entry points that work across subscriptions
        */
        RecoveryServicesManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage ProtectionIntents.
     */
    public ProtectionIntents protectionIntents() {
        if (this.protectionIntents == null) {
            this.protectionIntents = new ProtectionIntentsImpl(this);
        }
        return this.protectionIntents;
    }

    /**
     * @return Entry point to manage BackupStatus.
     */
    public BackupStatus backupStatus() {
        if (this.backupStatus == null) {
            this.backupStatus = new BackupStatusImpl(this);
        }
        return this.backupStatus;
    }

    /**
     * @return Entry point to manage FeatureSupports.
     */
    public FeatureSupports featureSupports() {
        if (this.featureSupports == null) {
            this.featureSupports = new FeatureSupportsImpl(this);
        }
        return this.featureSupports;
    }

    /**
     * @return Entry point to manage BackupJobs.
     */
    public BackupJobs backupJobs() {
        if (this.backupJobs == null) {
            this.backupJobs = new BackupJobsImpl(this);
        }
        return this.backupJobs;
    }

    /**
     * @return Entry point to manage JobDetails.
     */
    public JobDetails jobDetails() {
        if (this.jobDetails == null) {
            this.jobDetails = new JobDetailsImpl(this);
        }
        return this.jobDetails;
    }

    /**
     * @return Entry point to manage ExportJobsOperationResults.
     */
    public ExportJobsOperationResults exportJobsOperationResults() {
        if (this.exportJobsOperationResults == null) {
            this.exportJobsOperationResults = new ExportJobsOperationResultsImpl(this);
        }
        return this.exportJobsOperationResults;
    }

    /**
     * @return Entry point to manage Jobs.
     */
    public Jobs jobs() {
        if (this.jobs == null) {
            this.jobs = new JobsImpl(this);
        }
        return this.jobs;
    }

    /**
     * @return Entry point to manage BackupPolicies.
     */
    public BackupPolicies backupPolicies() {
        if (this.backupPolicies == null) {
            this.backupPolicies = new BackupPoliciesImpl(this);
        }
        return this.backupPolicies;
    }

    /**
     * @return Entry point to manage BackupProtectedItems.
     */
    public BackupProtectedItems backupProtectedItems() {
        if (this.backupProtectedItems == null) {
            this.backupProtectedItems = new BackupProtectedItemsImpl(this);
        }
        return this.backupProtectedItems;
    }

    /**
     * @return Entry point to manage BackupUsageSummaries.
     */
    public BackupUsageSummaries backupUsageSummaries() {
        if (this.backupUsageSummaries == null) {
            this.backupUsageSummaries = new BackupUsageSummariesImpl(this);
        }
        return this.backupUsageSummaries;
    }

    /**
     * @return Entry point to manage BackupResourceVaultConfigs.
     */
    public BackupResourceVaultConfigs backupResourceVaultConfigs() {
        if (this.backupResourceVaultConfigs == null) {
            this.backupResourceVaultConfigs = new BackupResourceVaultConfigsImpl(this);
        }
        return this.backupResourceVaultConfigs;
    }

    /**
     * @return Entry point to manage BackupEngines.
     */
    public BackupEngines backupEngines() {
        if (this.backupEngines == null) {
            this.backupEngines = new BackupEnginesImpl(this);
        }
        return this.backupEngines;
    }

    /**
     * @return Entry point to manage ProtectionContainerRefreshOperationResults.
     */
    public ProtectionContainerRefreshOperationResults protectionContainerRefreshOperationResults() {
        if (this.protectionContainerRefreshOperationResults == null) {
            this.protectionContainerRefreshOperationResults = new ProtectionContainerRefreshOperationResultsImpl(this);
        }
        return this.protectionContainerRefreshOperationResults;
    }

    /**
     * @return Entry point to manage ProtectableContainers.
     */
    public ProtectableContainers protectableContainers() {
        if (this.protectableContainers == null) {
            this.protectableContainers = new ProtectableContainersImpl(this);
        }
        return this.protectableContainers;
    }

    /**
     * @return Entry point to manage ProtectionContainers.
     */
    public ProtectionContainers protectionContainers() {
        if (this.protectionContainers == null) {
            this.protectionContainers = new ProtectionContainersImpl(this);
        }
        return this.protectionContainers;
    }

    /**
     * @return Entry point to manage BackupWorkloadItems.
     */
    public BackupWorkloadItems backupWorkloadItems() {
        if (this.backupWorkloadItems == null) {
            this.backupWorkloadItems = new BackupWorkloadItemsImpl(this);
        }
        return this.backupWorkloadItems;
    }

    /**
     * @return Entry point to manage ProtectionContainerOperationResults.
     */
    public ProtectionContainerOperationResults protectionContainerOperationResults() {
        if (this.protectionContainerOperationResults == null) {
            this.protectionContainerOperationResults = new ProtectionContainerOperationResultsImpl(this);
        }
        return this.protectionContainerOperationResults;
    }

    /**
     * @return Entry point to manage ProtectedItems.
     */
    public ProtectedItems protectedItems() {
        if (this.protectedItems == null) {
            this.protectedItems = new ProtectedItemsImpl(this);
        }
        return this.protectedItems;
    }

    /**
     * @return Entry point to manage Backups.
     */
    public Backups backups() {
        if (this.backups == null) {
            this.backups = new BackupsImpl(this);
        }
        return this.backups;
    }

    /**
     * @return Entry point to manage ProtectedItemOperationResults.
     */
    public ProtectedItemOperationResults protectedItemOperationResults() {
        if (this.protectedItemOperationResults == null) {
            this.protectedItemOperationResults = new ProtectedItemOperationResultsImpl(this);
        }
        return this.protectedItemOperationResults;
    }

    /**
     * @return Entry point to manage ProtectedItemOperationStatuses.
     */
    public ProtectedItemOperationStatuses protectedItemOperationStatuses() {
        if (this.protectedItemOperationStatuses == null) {
            this.protectedItemOperationStatuses = new ProtectedItemOperationStatusesImpl(this);
        }
        return this.protectedItemOperationStatuses;
    }

    /**
     * @return Entry point to manage RecoveryPoints.
     */
    public RecoveryPoints recoveryPoints() {
        if (this.recoveryPoints == null) {
            this.recoveryPoints = new RecoveryPointsImpl(this);
        }
        return this.recoveryPoints;
    }

    /**
     * @return Entry point to manage ItemLevelRecoveryConnections.
     */
    public ItemLevelRecoveryConnections itemLevelRecoveryConnections() {
        if (this.itemLevelRecoveryConnections == null) {
            this.itemLevelRecoveryConnections = new ItemLevelRecoveryConnectionsImpl(this);
        }
        return this.itemLevelRecoveryConnections;
    }

    /**
     * @return Entry point to manage Restores.
     */
    public Restores restores() {
        if (this.restores == null) {
            this.restores = new RestoresImpl(this);
        }
        return this.restores;
    }

    /**
     * @return Entry point to manage JobCancellations.
     */
    public JobCancellations jobCancellations() {
        if (this.jobCancellations == null) {
            this.jobCancellations = new JobCancellationsImpl(this);
        }
        return this.jobCancellations;
    }

    /**
     * @return Entry point to manage JobOperationResults.
     */
    public JobOperationResults jobOperationResults() {
        if (this.jobOperationResults == null) {
            this.jobOperationResults = new JobOperationResultsImpl(this);
        }
        return this.jobOperationResults;
    }

    /**
     * @return Entry point to manage BackupOperationResults.
     */
    public BackupOperationResults backupOperationResults() {
        if (this.backupOperationResults == null) {
            this.backupOperationResults = new BackupOperationResultsImpl(this);
        }
        return this.backupOperationResults;
    }

    /**
     * @return Entry point to manage BackupOperationStatuses.
     */
    public BackupOperationStatuses backupOperationStatuses() {
        if (this.backupOperationStatuses == null) {
            this.backupOperationStatuses = new BackupOperationStatusesImpl(this);
        }
        return this.backupOperationStatuses;
    }

    /**
     * @return Entry point to manage ProtectionPolicies.
     */
    public ProtectionPolicies protectionPolicies() {
        if (this.protectionPolicies == null) {
            this.protectionPolicies = new ProtectionPoliciesImpl(this);
        }
        return this.protectionPolicies;
    }

    /**
     * @return Entry point to manage ProtectionPolicyOperationResults.
     */
    public ProtectionPolicyOperationResults protectionPolicyOperationResults() {
        if (this.protectionPolicyOperationResults == null) {
            this.protectionPolicyOperationResults = new ProtectionPolicyOperationResultsImpl(this);
        }
        return this.protectionPolicyOperationResults;
    }

    /**
     * @return Entry point to manage ProtectionPolicyOperationStatuses.
     */
    public ProtectionPolicyOperationStatuses protectionPolicyOperationStatuses() {
        if (this.protectionPolicyOperationStatuses == null) {
            this.protectionPolicyOperationStatuses = new ProtectionPolicyOperationStatusesImpl(this);
        }
        return this.protectionPolicyOperationStatuses;
    }

    /**
     * @return Entry point to manage BackupProtectableItems.
     */
    public BackupProtectableItems backupProtectableItems() {
        if (this.backupProtectableItems == null) {
            this.backupProtectableItems = new BackupProtectableItemsImpl(this);
        }
        return this.backupProtectableItems;
    }

    /**
     * @return Entry point to manage BackupProtectionContainers.
     */
    public BackupProtectionContainers backupProtectionContainers() {
        if (this.backupProtectionContainers == null) {
            this.backupProtectionContainers = new BackupProtectionContainersImpl(this);
        }
        return this.backupProtectionContainers;
    }

    /**
     * @return Entry point to manage SecurityPINs.
     */
    public SecurityPINs securityPINs() {
        if (this.securityPINs == null) {
            this.securityPINs = new SecurityPINsImpl(this);
        }
        return this.securityPINs;
    }

    /**
     * @return Entry point to manage BackupResourceStorageConfigs.
     */
    public BackupResourceStorageConfigs backupResourceStorageConfigs() {
        if (this.backupResourceStorageConfigs == null) {
            this.backupResourceStorageConfigs = new BackupResourceStorageConfigsImpl(this);
        }
        return this.backupResourceStorageConfigs;
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
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public RecoveryServicesManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return RecoveryServicesManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private RecoveryServicesManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new RecoveryServicesBackupClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
