// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.data.appconfiguration;

import com.azure.core.implementation.annotation.ServiceClientBuilder;
import com.azure.data.appconfiguration.credentials.ConfigurationClientCredentials;
import com.azure.data.appconfiguration.models.ConfigurationSetting;
import com.azure.data.appconfiguration.policy.ConfigurationCredentialsPolicy;
import com.azure.core.util.configuration.Configuration;
import com.azure.core.util.configuration.ConfigurationManager;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.AddHeadersPolicy;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.implementation.http.policy.spi.HttpPolicyProviders;
import com.azure.core.implementation.util.ImplUtils;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * This class provides a fluent builder API to help aid the configuration and instantiation of the {@link ConfigurationAsyncClient} and {@link ConfigurationClient},
 * by calling {@link ConfigurationClientBuilder#buildAsyncClient() buildAsyncClient} and {@link ConfigurationClientBuilder#buildClient() buildClient} respectively
 * to construct an instance of the desired client.
 *
 * <p>The client needs the service endpoint of the Azure App Configuration store and access credentials.
 * {@link ConfigurationClientCredentials} gives the builder the service endpoint and access credentials it requires to
 * construct a client, set the ConfigurationClientCredentials with {@link ConfigurationClientBuilder#credentials(ConfigurationClientCredentials) this}.</p>
 *
 * <p><strong>Instantiating an asynchronous Configuration Client</strong></p>
 *
 * {@codesnippet com.azure.data.applicationconfig.async.configurationclient.instantiation}
 *
 * <p><strong>Instantiating a synchronous Configuration Client</strong></p>
 *
 * {@codesnippet com.azure.data.applicationconfig.configurationclient.instantiation}
 *
 * <p>Another way to construct the client is using a {@link HttpPipeline}. The pipeline gives the client an authenticated
 * way to communicate with the service but it doesn't contain the service endpoint. Set the pipeline with
 * {@link ConfigurationClientBuilder#pipeline(HttpPipeline) this}, additionally set the service endpoint with
 * {@link ConfigurationClientBuilder#serviceEndpoint(String) this}. Using a pipeline requires additional setup but
 * allows for finer control on how the {@link ConfigurationAsyncClient} and {@link ConfigurationClient} it built.</p>
 *
 * {@codesnippet com.azure.data.applicationconfig.configurationclient.pipeline.instantiation}
 *
 * @see ConfigurationAsyncClient
 * @see ConfigurationClient
 * @see ConfigurationClientCredentials
 */
@ServiceClientBuilder(serviceClients = ConfigurationClient.class)
public final class ConfigurationClientBuilder {
    // This header tells the server to return the request id in the HTTP response. Useful for correlation with what
    // request was sent.
    private static final String ECHO_REQUEST_ID_HEADER = "x-ms-return-client-request-id";
    private static final String CONTENT_TYPE_HEADER = "Content-Type";
    private static final String CONTENT_TYPE_HEADER_VALUE = "application/json";
    private static final String ACCEPT_HEADER = "Accept";
    private static final String ACCEPT_HEADER_VALUE = "application/vnd.microsoft.azconfig.kv+json";

    private final List<HttpPipelinePolicy> policies;
    private final HttpHeaders headers;

    private ConfigurationClientCredentials credentials;
    private URL serviceEndpoint;
    private HttpClient httpClient;
    private HttpLogDetailLevel httpLogDetailLevel;
    private HttpPipeline pipeline;
    private RetryPolicy retryPolicy;
    private Configuration configuration;

    /**
     * The constructor with defaults.
     */
    public ConfigurationClientBuilder() {
        retryPolicy = new RetryPolicy();
        httpLogDetailLevel = HttpLogDetailLevel.NONE;
        policies = new ArrayList<>();

        headers = new HttpHeaders()
            .put(ECHO_REQUEST_ID_HEADER, "true")
            .put(CONTENT_TYPE_HEADER, CONTENT_TYPE_HEADER_VALUE)
            .put(ACCEPT_HEADER, ACCEPT_HEADER_VALUE);
    }
    /**
     * Creates a {@link ConfigurationClient} based on options set in the Builder. Every time {@code buildClient()} is
     * called, a new instance of {@link ConfigurationClient} is created.
     *
     * <p>
     * If {@link ConfigurationClientBuilder#pipeline(HttpPipeline) pipeline} is set, then the {@code pipeline} and
     * {@link ConfigurationClientBuilder#serviceEndpoint(String) serviceEndpoint} are used to create the
     * {@link ConfigurationClient client}. All other builder settings are ignored.</p>
     *
     * @return A ConfigurationClient with the options set from the builder.
     * @throws NullPointerException If {@code serviceEndpoint} has not been set. This setting is automatically set when
     * {@link ConfigurationClientBuilder#credentials(ConfigurationClientCredentials) credentials} are set through
     * the builder. Or can be set explicitly by calling {@link ConfigurationClientBuilder#serviceEndpoint(String)}.
     * @throws IllegalStateException If {@link ConfigurationClientBuilder#credentials(ConfigurationClientCredentials)}
     * has not been set.
     */
    public ConfigurationClient buildClient() {
        return new ConfigurationClient(buildAsyncClient());
    }

    /**
     * Creates a {@link ConfigurationAsyncClient} based on options set in the Builder. Every time {@code buildAsyncClient()} is
     * called, a new instance of {@link ConfigurationAsyncClient} is created.
     *
     * <p>
     * If {@link ConfigurationClientBuilder#pipeline(HttpPipeline) pipeline} is set, then the {@code pipeline} and
     * {@link ConfigurationClientBuilder#serviceEndpoint(String) serviceEndpoint} are used to create the
     * {@link ConfigurationAsyncClient client}. All other builder settings are ignored.
     * </p>
     *
     * @return A ConfigurationAsyncClient with the options set from the builder.
     * @throws NullPointerException If {@code serviceEndpoint} has not been set. This setting is automatically set when
     * {@link ConfigurationClientBuilder#credentials(ConfigurationClientCredentials) credentials} are set through
     * the builder. Or can be set explicitly by calling {@link ConfigurationClientBuilder#serviceEndpoint(String)}.
     * @throws IllegalStateException If {@link ConfigurationClientBuilder#credentials(ConfigurationClientCredentials)}
     * has not been set.
     */
    public ConfigurationAsyncClient buildAsyncClient() {
        Configuration buildConfiguration = (configuration == null) ? ConfigurationManager.getConfiguration().clone() : configuration;
        ConfigurationClientCredentials configurationCredentials = getConfigurationCredentials(buildConfiguration);
        URL buildServiceEndpoint = getBuildServiceEndpoint(configurationCredentials);

        Objects.requireNonNull(buildServiceEndpoint);

        if (pipeline != null) {
            return new ConfigurationAsyncClient(buildServiceEndpoint, pipeline);
        }

        ConfigurationClientCredentials buildCredentials = (credentials == null) ? configurationCredentials : credentials;
        if (buildCredentials == null) {
            throw new IllegalStateException("'credentials' is required.");
        }

        // Closest to API goes first, closest to wire goes last.
        final List<HttpPipelinePolicy> policies = new ArrayList<>();

        policies.add(new UserAgentPolicy(AzureConfiguration.NAME, AzureConfiguration.VERSION, buildConfiguration));
        policies.add(new RequestIdPolicy());
        policies.add(new AddHeadersPolicy(headers));
        policies.add(new AddDatePolicy());
        policies.add(new ConfigurationCredentialsPolicy(buildCredentials));
        HttpPolicyProviders.addBeforeRetryPolicies(policies);

        policies.add(retryPolicy);

        policies.addAll(this.policies);
        HttpPolicyProviders.addAfterRetryPolicies(policies);
        policies.add(new HttpLoggingPolicy(httpLogDetailLevel));

        HttpPipeline pipeline = HttpPipeline.builder()
            .policies(policies.toArray(new HttpPipelinePolicy[0]))
            .httpClient(httpClient)
            .build();

        return new ConfigurationAsyncClient(buildServiceEndpoint, pipeline);
    }

    /**
     * Sets the service endpoint for the Azure App Configuration instance.
     *
     * @param serviceEndpoint The URL of the Azure App Configuration instance to send {@link ConfigurationSetting}
     * service requests to and receive responses from.
     * @return The updated ConfigurationClientBuilder object.
     * @throws MalformedURLException if {@code serviceEndpoint} is null or it cannot be parsed into a valid URL.
     */
    public ConfigurationClientBuilder serviceEndpoint(String serviceEndpoint) throws MalformedURLException {
        this.serviceEndpoint = new URL(serviceEndpoint);
        return this;
    }

    /**
     * Sets the credentials to use when authenticating HTTP requests. Also, sets the
     * {@link ConfigurationClientBuilder#serviceEndpoint(String) serviceEndpoint} for this ConfigurationClientBuilder.
     *
     * @param credentials The credentials to use for authenticating HTTP requests.
     * @return The updated ConfigurationClientBuilder object.
     * @throws NullPointerException If {@code credentials} is {@code null}.
     */
    public ConfigurationClientBuilder credentials(ConfigurationClientCredentials credentials) {
        Objects.requireNonNull(credentials);
        this.credentials = credentials;
        this.serviceEndpoint = credentials.baseUri();
        return this;
    }

    /**
     * Sets the logging level for HTTP requests and responses.
     *
     * @param logLevel The amount of logging output when sending and receiving HTTP requests/responses.
     * @return The updated ConfigurationClientBuilder object.
     */
    public ConfigurationClientBuilder httpLogDetailLevel(HttpLogDetailLevel logLevel) {
        httpLogDetailLevel = logLevel;
        return this;
    }

    /**
     * Adds a policy to the set of existing policies that are executed after required policies.
     *
     * @param policy The retry policy for service requests.
     * @return The updated ConfigurationClientBuilder object.
     * @throws NullPointerException If {@code policy} is {@code null}.
     */
    public ConfigurationClientBuilder addPolicy(HttpPipelinePolicy policy) {
        Objects.requireNonNull(policy);
        policies.add(policy);
        return this;
    }

    /**
     * Sets the HTTP client to use for sending and receiving requests to and from the service.
     *
     * @param client The HTTP client to use for requests.
     * @return The updated ConfigurationClientBuilder object.
     * @throws NullPointerException If {@code client} is {@code null}.
     */
    public ConfigurationClientBuilder httpClient(HttpClient client) {
        Objects.requireNonNull(client);
        this.httpClient = client;
        return this;
    }

    /**
     * Sets the HTTP pipeline to use for the service client.
     *
     * If {@code pipeline} is set, all other settings are ignored, aside from
     * {@link ConfigurationClientBuilder#serviceEndpoint(String) serviceEndpoint} to build {@link ConfigurationAsyncClient} or {@link ConfigurationClient}.
     *
     * @param pipeline The HTTP pipeline to use for sending service requests and receiving responses.
     * @return The updated ConfigurationClientBuilder object.
     */
    public ConfigurationClientBuilder pipeline(HttpPipeline pipeline) {
        Objects.requireNonNull(pipeline);
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Sets the configuration store that is used during construction of the service client.
     *
     * The default configuration store is a clone of the {@link ConfigurationManager#getConfiguration() global
     * configuration store}, use {@link Configuration#NONE} to bypass using configuration settings during construction.
     *
     * @param configuration The configuration store used to
     * @return The updated ConfigurationClientBuilder object.
     */
    public ConfigurationClientBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    private ConfigurationClientCredentials getConfigurationCredentials(Configuration configuration) {
        String connectionString = configuration.get("AZURE_APPCONFIG_CONNECTION_STRING");
        if (ImplUtils.isNullOrEmpty(connectionString)) {
            return credentials;
        }

        try {
            return new ConfigurationClientCredentials(connectionString);
        } catch (InvalidKeyException | NoSuchAlgorithmException ex) {
            return null;
        }
    }

    private URL getBuildServiceEndpoint(ConfigurationClientCredentials buildCredentials) {
        if (serviceEndpoint != null) {
            return serviceEndpoint;
        } else if (buildCredentials != null) {
            return buildCredentials.baseUri();
        } else {
            return null;
        }
    }
}

