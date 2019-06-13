// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file;

import com.azure.core.configuration.Configuration;
import com.azure.core.configuration.ConfigurationManager;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.implementation.http.policy.spi.HttpPolicyProviders;
import com.azure.storage.common.credentials.SASTokenCredential;
import com.azure.storage.common.credentials.SharedKeyCredential;
import com.azure.storage.common.policy.SASTokenCredentialPolicy;
import com.azure.storage.common.policy.SharedKeyCredentialPolicy;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

final class FileServiceClientBuilder {
    private final List<HttpPipelinePolicy> policies;

    private URL endpoint;
    private SASTokenCredential sasTokenCredential;
    private SharedKeyCredential sharedKeyCredential;
    private HttpClient httpClient;
    private HttpLogDetailLevel logLevel;
    private RetryPolicy retryPolicy;
    private Configuration configuration;

    FileServiceClientBuilder() {
        retryPolicy = new RetryPolicy();
        logLevel = HttpLogDetailLevel.NONE;
        policies = new ArrayList<>();
        configuration = ConfigurationManager.getConfiguration();
    }

    /**
     * @return a new instance of FileServiceClient constructed with options stored in the builder
     * @throws IllegalArgumentException If the builder doesn't have credentials
     */
    public FileServiceClient buildSync() {
        return new FileServiceClient(build());
    }

    /**
     * @return a new instance of FileServiceAsyncClient constructed with options stored in the builder
     * @throws IllegalArgumentException If the builder doesn't have credentials
     */
    public FileServiceAsyncClient buildAsync() {
        return build();
    }

    /**
     * @return a new instance of QueueServiceAsyncClient constructed with options stored in the builder
     * @throws IllegalArgumentException If the builder doesn't have credentials
     */
    private FileServiceAsyncClient build() {
        Objects.requireNonNull(endpoint);

        if (sasTokenCredential == null && sharedKeyCredential == null) {
            throw new IllegalArgumentException("Credentials are required for authorization");
        }

        // Closest to API goes first, closest to wire goes last.
        final List<HttpPipelinePolicy> policies = new ArrayList<>();

        policies.add(new UserAgentPolicy(FileConfiguration.NAME, FileConfiguration.VERSION, configuration));
        policies.add(new RequestIdPolicy());
        policies.add(new AddDatePolicy());

        if (sharedKeyCredential != null) {
            policies.add(new SharedKeyCredentialPolicy(sharedKeyCredential));
        } else {
            policies.add(new SASTokenCredentialPolicy(sasTokenCredential));
        }

        HttpPolicyProviders.addBeforeRetryPolicies(policies);

        policies.add(retryPolicy);

        policies.addAll(this.policies);
        HttpPolicyProviders.addAfterRetryPolicies(policies);
        policies.add(new HttpLoggingPolicy(logLevel));

        HttpPipeline pipeline = HttpPipeline.builder()
            .policies(policies.toArray(new HttpPipelinePolicy[0]))
            .httpClient(httpClient)
            .build();

        return new FileServiceAsyncClient(endpoint, pipeline);
    }

    /**
     * Sets the service endpoint, additionally parses it for information (SAS token)
     * @param endpoint URL of the service
     * @return the updated FileServiceClientBuilder object
     * @throws IllegalArgumentException If {@code endpoint} isn't a proper URL
     */
    public FileServiceClientBuilder endpoint(String endpoint) {
        Objects.requireNonNull(endpoint);
        try {
            URL fullURL = new URL(endpoint);
            this.endpoint = new URL(fullURL.getProtocol() + "://" + fullURL.getHost());

            // Attempt to get the SAS token from the URL passed
            SASTokenCredential credential = SASTokenCredential.fromQuery(fullURL.getQuery());
            if (credential != null) {
                this.sasTokenCredential = credential;
            }
        } catch (MalformedURLException ex) {
            throw new IllegalArgumentException("The Azure Storage Queue endpoint url is malformed.");
        }

        return this;
    }

    /**
     * Sets the credentials used to authorize requests sent to the service
     * @param credentials authorization credentials
     * @return the updated FileServiceClientBuilder object
     */
    public FileServiceClientBuilder credentials(SASTokenCredential credentials) {
        this.sasTokenCredential = credentials;
        return this;
    }

    /**
     * Sets the connection string for the service, parses it for authentication information (account name, account key)
     * @param connectionString connection string from access keys section
     * @return the updated FileServiceClientBuilder object
     */
    public FileServiceClientBuilder connectionString(String connectionString) {
        Objects.requireNonNull(connectionString);
        this.sharedKeyCredential = SharedKeyCredential.fromConnectionString(connectionString);
        return this;
    }

    /**
     * Sets the http client used to send service requests
     * @param httpClient http client to send requests
     * @return the updated FileServiceClientBuilder object
     */
    public FileServiceClientBuilder httpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    /**
     * Adds a pipeline policy to apply on each request sent
     * @param pipelinePolicy a pipeline policy
     * @return the updated FileServiceClientBuilder object
     */
    public FileServiceClientBuilder addPolicy(HttpPipelinePolicy pipelinePolicy) {
        this.policies.add(pipelinePolicy);
        return this;
    }

    /**
     * Sets the logging level for service requests
     * @param logLevel logging level
     * @return the updated FileServiceClientBuilder object
     */
    public FileServiceClientBuilder httpLogDetailLevel(HttpLogDetailLevel logLevel) {
        this.logLevel = logLevel;
        return this;
    }

    /**
     * Sets the configuration object used to retrieve environment configuration values used to build the client with
     * when they are not set in the builder, defaults to Configuration.NONE
     * @param configuration configuration store
     * @return the updated FileServiceClientBuilder object
     */
    public FileServiceClientBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }
}
