// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.BearerTokenAuthenticationPolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Configuration;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.netapp.fluent.NetAppManagementClient;
import com.azure.resourcemanager.netapp.implementation.AccountBackupsImpl;
import com.azure.resourcemanager.netapp.implementation.AccountsImpl;
import com.azure.resourcemanager.netapp.implementation.BackupPoliciesImpl;
import com.azure.resourcemanager.netapp.implementation.BackupsImpl;
import com.azure.resourcemanager.netapp.implementation.NetAppManagementClientBuilder;
import com.azure.resourcemanager.netapp.implementation.NetAppResourcesImpl;
import com.azure.resourcemanager.netapp.implementation.OperationsImpl;
import com.azure.resourcemanager.netapp.implementation.PoolsImpl;
import com.azure.resourcemanager.netapp.implementation.SnapshotPoliciesImpl;
import com.azure.resourcemanager.netapp.implementation.SnapshotsImpl;
import com.azure.resourcemanager.netapp.implementation.VaultsImpl;
import com.azure.resourcemanager.netapp.implementation.VolumesImpl;
import com.azure.resourcemanager.netapp.models.AccountBackups;
import com.azure.resourcemanager.netapp.models.Accounts;
import com.azure.resourcemanager.netapp.models.BackupPolicies;
import com.azure.resourcemanager.netapp.models.Backups;
import com.azure.resourcemanager.netapp.models.NetAppResources;
import com.azure.resourcemanager.netapp.models.Operations;
import com.azure.resourcemanager.netapp.models.Pools;
import com.azure.resourcemanager.netapp.models.SnapshotPolicies;
import com.azure.resourcemanager.netapp.models.Snapshots;
import com.azure.resourcemanager.netapp.models.Vaults;
import com.azure.resourcemanager.netapp.models.Volumes;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Entry point to NetAppManager. Microsoft NetApp Azure Resource Provider specification. */
public final class NetAppManager {
    private Operations operations;

    private NetAppResources netAppResources;

    private Accounts accounts;

    private Pools pools;

    private Volumes volumes;

    private Snapshots snapshots;

    private SnapshotPolicies snapshotPolicies;

    private AccountBackups accountBackups;

    private Backups backups;

    private BackupPolicies backupPolicies;

    private Vaults vaults;

    private final NetAppManagementClient clientObject;

    private NetAppManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new NetAppManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of NetApp service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the NetApp service API instance.
     */
    public static NetAppManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Gets a Configurable instance that can be used to create NetAppManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new NetAppManager.Configurable();
    }

    /** The Configurable allowing configurations to be set. */
    public static final class Configurable {
        private final ClientLogger logger = new ClientLogger(Configurable.class);

        private HttpClient httpClient;
        private HttpLogOptions httpLogOptions;
        private final List<HttpPipelinePolicy> policies = new ArrayList<>();
        private RetryPolicy retryPolicy;
        private Duration defaultPollInterval;

        private Configurable() {
        }

        /**
         * Sets the http client.
         *
         * @param httpClient the HTTP client.
         * @return the configurable object itself.
         */
        public Configurable withHttpClient(HttpClient httpClient) {
            this.httpClient = Objects.requireNonNull(httpClient, "'httpClient' cannot be null.");
            return this;
        }

        /**
         * Sets the logging options to the HTTP pipeline.
         *
         * @param httpLogOptions the HTTP log options.
         * @return the configurable object itself.
         */
        public Configurable withLogOptions(HttpLogOptions httpLogOptions) {
            this.httpLogOptions = Objects.requireNonNull(httpLogOptions, "'httpLogOptions' cannot be null.");
            return this;
        }

        /**
         * Adds the pipeline policy to the HTTP pipeline.
         *
         * @param policy the HTTP pipeline policy.
         * @return the configurable object itself.
         */
        public Configurable withPolicy(HttpPipelinePolicy policy) {
            this.policies.add(Objects.requireNonNull(policy, "'policy' cannot be null."));
            return this;
        }

        /**
         * Sets the retry policy to the HTTP pipeline.
         *
         * @param retryPolicy the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryPolicy(RetryPolicy retryPolicy) {
            this.retryPolicy = Objects.requireNonNull(retryPolicy, "'retryPolicy' cannot be null.");
            return this;
        }

        /**
         * Sets the default poll interval, used when service does not provide "Retry-After" header.
         *
         * @param defaultPollInterval the default poll interval.
         * @return the configurable object itself.
         */
        public Configurable withDefaultPollInterval(Duration defaultPollInterval) {
            this.defaultPollInterval = Objects.requireNonNull(defaultPollInterval, "'retryPolicy' cannot be null.");
            if (this.defaultPollInterval.isNegative()) {
                throw logger.logExceptionAsError(new IllegalArgumentException("'httpPipeline' cannot be negative"));
            }
            return this;
        }

        /**
         * Creates an instance of NetApp service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the NetApp service API instance.
         */
        public NetAppManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            if (retryPolicy == null) {
                retryPolicy = new RetryPolicy("Retry-After", ChronoUnit.SECONDS);
            }
            List<HttpPipelinePolicy> policies = new ArrayList<>();
            policies
                .add(
                    new UserAgentPolicy(
                        null,
                        "com.azure.resourcemanager.netapp",
                        "1.0.0-beta.1",
                        Configuration.getGlobalConfiguration()));
            policies.add(new RequestIdPolicy());
            HttpPolicyProviders.addBeforeRetryPolicies(policies);
            policies.add(retryPolicy);
            policies.add(new AddDatePolicy());
            policies
                .add(
                    new BearerTokenAuthenticationPolicy(
                        credential, profile.getEnvironment().getManagementEndpoint() + "/.default"));
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                    .httpClient(httpClient)
                    .policies(policies.toArray(new HttpPipelinePolicy[0]))
                    .build();
            return new NetAppManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /** @return Resource collection API of Operations. */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /** @return Resource collection API of NetAppResources. */
    public NetAppResources netAppResources() {
        if (this.netAppResources == null) {
            this.netAppResources = new NetAppResourcesImpl(clientObject.getNetAppResources(), this);
        }
        return netAppResources;
    }

    /** @return Resource collection API of Accounts. */
    public Accounts accounts() {
        if (this.accounts == null) {
            this.accounts = new AccountsImpl(clientObject.getAccounts(), this);
        }
        return accounts;
    }

    /** @return Resource collection API of Pools. */
    public Pools pools() {
        if (this.pools == null) {
            this.pools = new PoolsImpl(clientObject.getPools(), this);
        }
        return pools;
    }

    /** @return Resource collection API of Volumes. */
    public Volumes volumes() {
        if (this.volumes == null) {
            this.volumes = new VolumesImpl(clientObject.getVolumes(), this);
        }
        return volumes;
    }

    /** @return Resource collection API of Snapshots. */
    public Snapshots snapshots() {
        if (this.snapshots == null) {
            this.snapshots = new SnapshotsImpl(clientObject.getSnapshots(), this);
        }
        return snapshots;
    }

    /** @return Resource collection API of SnapshotPolicies. */
    public SnapshotPolicies snapshotPolicies() {
        if (this.snapshotPolicies == null) {
            this.snapshotPolicies = new SnapshotPoliciesImpl(clientObject.getSnapshotPolicies(), this);
        }
        return snapshotPolicies;
    }

    /** @return Resource collection API of AccountBackups. */
    public AccountBackups accountBackups() {
        if (this.accountBackups == null) {
            this.accountBackups = new AccountBackupsImpl(clientObject.getAccountBackups(), this);
        }
        return accountBackups;
    }

    /** @return Resource collection API of Backups. */
    public Backups backups() {
        if (this.backups == null) {
            this.backups = new BackupsImpl(clientObject.getBackups(), this);
        }
        return backups;
    }

    /** @return Resource collection API of BackupPolicies. */
    public BackupPolicies backupPolicies() {
        if (this.backupPolicies == null) {
            this.backupPolicies = new BackupPoliciesImpl(clientObject.getBackupPolicies(), this);
        }
        return backupPolicies;
    }

    /** @return Resource collection API of Vaults. */
    public Vaults vaults() {
        if (this.vaults == null) {
            this.vaults = new VaultsImpl(clientObject.getVaults(), this);
        }
        return vaults;
    }

    /**
     * @return Wrapped service client NetAppManagementClient providing direct access to the underlying auto-generated
     *     API implementation, based on Azure REST API.
     */
    public NetAppManagementClient serviceClient() {
        return this.clientObject;
    }
}
