// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox;

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
import com.azure.resourcemanager.databox.fluent.DataBoxManagementClient;
import com.azure.resourcemanager.databox.implementation.DataBoxManagementClientBuilder;
import com.azure.resourcemanager.databox.implementation.JobsImpl;
import com.azure.resourcemanager.databox.implementation.OperationsImpl;
import com.azure.resourcemanager.databox.implementation.ServicesImpl;
import com.azure.resourcemanager.databox.models.Jobs;
import com.azure.resourcemanager.databox.models.Operations;
import com.azure.resourcemanager.databox.models.Services;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Entry point to DataBoxManager. */
public final class DataBoxManager {
    private Operations operations;

    private Jobs jobs;

    private Services services;

    private final DataBoxManagementClient clientObject;

    private DataBoxManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new DataBoxManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of DataBox service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the DataBox service API instance.
     */
    public static DataBoxManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Gets a Configurable instance that can be used to create DataBoxManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new DataBoxManager.Configurable();
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
         * Creates an instance of DataBox service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the DataBox service API instance.
         */
        public DataBoxManager authenticate(TokenCredential credential, AzureProfile profile) {
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
                        "com.azure.resourcemanager.databox",
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
            return new DataBoxManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /** @return Resource collection API of Operations. */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /** @return Resource collection API of Jobs. */
    public Jobs jobs() {
        if (this.jobs == null) {
            this.jobs = new JobsImpl(clientObject.getJobs(), this);
        }
        return jobs;
    }

    /** @return Resource collection API of Services. */
    public Services services() {
        if (this.services == null) {
            this.services = new ServicesImpl(clientObject.getServices(), this);
        }
        return services;
    }

    /**
     * @return Wrapped service client DataBoxManagementClient providing direct access to the underlying auto-generated
     *     API implementation, based on Azure REST API.
     */
    public DataBoxManagementClient serviceClient() {
        return this.clientObject;
    }
}
