// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated;

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
import com.azure.resourcemanager.resources.generated.fluent.ResourceManagementClient;
import com.azure.resourcemanager.resources.generated.implementation.DeploymentOperationsImpl;
import com.azure.resourcemanager.resources.generated.implementation.DeploymentsImpl;
import com.azure.resourcemanager.resources.generated.implementation.OperationsImpl;
import com.azure.resourcemanager.resources.generated.implementation.ProvidersImpl;
import com.azure.resourcemanager.resources.generated.implementation.ResourceGroupsImpl;
import com.azure.resourcemanager.resources.generated.implementation.ResourceManagementClientBuilder;
import com.azure.resourcemanager.resources.generated.implementation.ResourcesImpl;
import com.azure.resourcemanager.resources.generated.implementation.TagOperationsImpl;
import com.azure.resourcemanager.resources.generated.models.DeploymentOperations;
import com.azure.resourcemanager.resources.generated.models.Deployments;
import com.azure.resourcemanager.resources.generated.models.Operations;
import com.azure.resourcemanager.resources.generated.models.Providers;
import com.azure.resourcemanager.resources.generated.models.ResourceGroups;
import com.azure.resourcemanager.resources.generated.models.Resources;
import com.azure.resourcemanager.resources.generated.models.TagOperations;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Entry point to ResourceManager. Provides operations for working with resources and resource groups. */
public final class ResourceManager {
    private Operations operations;

    private Deployments deployments;

    private Providers providers;

    private Resources resources;

    private ResourceGroups resourceGroups;

    private TagOperations tagOperations;

    private DeploymentOperations deploymentOperations;

    private final ResourceManagementClient clientObject;

    private ResourceManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new ResourceManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of Resource service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the Resource service API instance.
     */
    public static ResourceManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Gets a Configurable instance that can be used to create ResourceManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new ResourceManager.Configurable();
    }

    /** The Configurable allowing configurations to be set. */
    public static class Configurable {
        private final ClientLogger logger = new ClientLogger(Configurable.class);

        private HttpClient httpClient;
        private HttpLogOptions httpLogOptions;
        private final List<HttpPipelinePolicy> policies = new ArrayList<>();
        private RetryPolicy retryPolicy;
        private Duration defaultPollInterval;

        /**
         * Sets the http client.
         *
         * @param httpClient the HTTP client.
         * @return the configurable object itself.
         */
        public Configurable withHttpClient(HttpClient httpClient) {
            this.httpClient = Objects.requireNonNull(httpClient);
            return this;
        }

        /**
         * Sets the logging options to the HTTP pipeline.
         *
         * @param httpLogOptions the HTTP log options.
         * @return the configurable object itself.
         */
        public Configurable withLogOptions(HttpLogOptions httpLogOptions) {
            this.httpLogOptions = Objects.requireNonNull(httpLogOptions);
            return this;
        }

        /**
         * Adds the pipeline policy to the HTTP pipeline.
         *
         * @param policy the HTTP pipeline policy.
         * @return the configurable object itself.
         */
        public Configurable withPolicy(HttpPipelinePolicy policy) {
            this.policies.add(Objects.requireNonNull(policy));
            return this;
        }

        /**
         * Sets the retry policy to the HTTP pipeline.
         *
         * @param retryPolicy the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryPolicy(RetryPolicy retryPolicy) {
            this.retryPolicy = Objects.requireNonNull(retryPolicy);
            return this;
        }

        /**
         * Sets the default poll interval, used when service does not provide .
         *
         * @param defaultPollInterval the default poll interval.
         * @return the configurable object itself.
         */
        public Configurable withDefaultPollInterval(Duration defaultPollInterval) {
            this.defaultPollInterval = Objects.requireNonNull(defaultPollInterval);
            if (this.defaultPollInterval.isNegative()) {
                throw logger.logExceptionAsError(new IllegalArgumentException("'httpPipeline' cannot be nagative"));
            }
            return this;
        }

        /**
         * Creates an instance of Resource service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the Resource service API instance.
         */
        public ResourceManager authenticate(TokenCredential credential, AzureProfile profile) {
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
                        "com.azure.resourcemanager.resources.generated",
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
            return new ResourceManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /** @return Resource collection API of Operations. */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /** @return Resource collection API of Deployments. */
    public Deployments deployments() {
        if (this.deployments == null) {
            this.deployments = new DeploymentsImpl(clientObject.getDeployments(), this);
        }
        return deployments;
    }

    /** @return Resource collection API of Providers. */
    public Providers providers() {
        if (this.providers == null) {
            this.providers = new ProvidersImpl(clientObject.getProviders(), this);
        }
        return providers;
    }

    /** @return Resource collection API of Resources. */
    public Resources resources() {
        if (this.resources == null) {
            this.resources = new ResourcesImpl(clientObject.getResources(), this);
        }
        return resources;
    }

    /** @return Resource collection API of ResourceGroups. */
    public ResourceGroups resourceGroups() {
        if (this.resourceGroups == null) {
            this.resourceGroups = new ResourceGroupsImpl(clientObject.getResourceGroups(), this);
        }
        return resourceGroups;
    }

    /** @return Resource collection API of TagOperations. */
    public TagOperations tagOperations() {
        if (this.tagOperations == null) {
            this.tagOperations = new TagOperationsImpl(clientObject.getTagOperations(), this);
        }
        return tagOperations;
    }

    /** @return Resource collection API of DeploymentOperations. */
    public DeploymentOperations deploymentOperations() {
        if (this.deploymentOperations == null) {
            this.deploymentOperations = new DeploymentOperationsImpl(clientObject.getDeploymentOperations(), this);
        }
        return deploymentOperations;
    }

    /**
     * @return Wrapped service client ResourceManagementClient providing direct access to the underlying auto-generated
     *     API implementation, based on Azure REST API.
     */
    public ResourceManagementClient serviceClient() {
        return this.clientObject;
    }
}
