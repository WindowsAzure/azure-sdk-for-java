// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.containers.containerregistry;

import com.azure.containers.containerregistry.implementation.authentication.ContainerRegistryCredentialsPolicy;
import com.azure.containers.containerregistry.models.ContainerRegistryServiceVersion;
import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeader;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.AddHeadersPolicy;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.ClientOptions;
import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** A builder for creating a new instance of the ContainerRegistry type. */
@ServiceClientBuilder(
    serviceClients = {
        ContainerRepositoryClient.class,
        ContainerRepositoryAsyncClient.class
    })
public final class ContainerRepositoryClientBuilder {
    private static final Map<String, String> PROPERTIES =
        CoreUtils.getProperties("azure-containers-containerregistry.properties");

    private static final String CLIENT_NAME = PROPERTIES.getOrDefault("name", "UnknownName");
    private static final String CLIENT_VERSION = PROPERTIES.getOrDefault("version", "UnknownVersion");

    private final ClientLogger logger = new ClientLogger(ContainerRepositoryClientBuilder.class);
    private final List<HttpPipelinePolicy> perCallPolicies = new ArrayList<>();
    private final List<HttpPipelinePolicy> perRetryPolicies = new ArrayList<>();
    private ClientOptions clientOptions;
    private Configuration configuration;
    private String endpoint;
    private HttpClient httpClient;
    private TokenCredential credential;
    private HttpPipeline httpPipeline;
    private HttpLogOptions httpLogOptions;
    private SerializerAdapter serializerAdapter;
    private RetryPolicy retryPolicy;
    private String repository;
    private ContainerRegistryServiceVersion version;

    /**
     * Sets Registry login URL.
     *
     * @param endpoint the endpoint value.
     * @return the ContainerRepositoryClientBuilder.
     */
    public ContainerRepositoryClientBuilder endpoint(String endpoint) {
        try {
            new URL(endpoint);
        } catch (MalformedURLException ex) {
            throw logger.logExceptionAsWarning(new IllegalArgumentException("'endpoint' must be a valid URL"));
        }

        this.endpoint = endpoint;
        return this;
    }

    /**
     * Sets repository name.
     *
     * @param repository name
     * @return the ContainerRepositoryClientBuilder.
     */
    public ContainerRepositoryClientBuilder repository(String repository) {
        this.repository = Objects.requireNonNull(repository,
            "'repository' cannot be null.");
        return this;
    }

    /**
     * Sets Registry login URL.
     *
     * @param credential the credential to use to access registry.
     * @return the ContainerRepositoryClientBuilder.
     */
    public ContainerRepositoryClientBuilder credential(TokenCredential credential) {
        this.credential = Objects.requireNonNull(credential,
            "'credential' cannot be null.");
        return this;
    }

    /**
     * Sets The HTTP httpPipeline to send requests through.
     *
     * @param httpPipeline the httpPipeline value.
     * @return the ContainerRepositoryClientBuilder.
     */
    public ContainerRepositoryClientBuilder pipeline(HttpPipeline httpPipeline) {
        if (this.httpPipeline != null && httpPipeline == null) {
            logger.verbose("HttpPipeline is being set to 'null' when it was previously configured.");
        }

        this.httpPipeline = httpPipeline;
        return this;
    }

    /**
     * Sets the service version that will be targeted by the client.
     *
     * @param version the service version to target.
     * @return the ContainerRegistryBuilder.
     */
    public ContainerRepositoryClientBuilder serviceVersion(ContainerRegistryServiceVersion version) {
        this.version = version;
        return this;
    }

    /**
     * Sets The HTTP client used to send the request.
     *
     * @param httpClient the httpClient value.
     * @return the ContainerRepositoryClientBuilder.
     */
    public ContainerRepositoryClientBuilder httpClient(HttpClient httpClient) {
        if (this.httpClient != null && httpClient == null) {
            logger.verbose("'httpClient' is being set to 'null' when it was previously configured.");
        }
        this.httpClient = httpClient;
        return this;
    }

    /**
     * Sets the client options such as application ID and custom headers to set on a request.
     *
     * @param clientOptions The {@link ClientOptions}.
     * @return The updated {@code TableClientBuilder}.
     */
    public ContainerRepositoryClientBuilder clientOptions(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        return this;
    }

    /**
     * Sets The configuration store that is used during construction of the service client.
     *
     * @param configuration the configuration value.
     * @return the ContainerRepositoryClientBuilder.
     */
    public ContainerRepositoryClientBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * Sets The logging configuration for HTTP requests and responses.
     *
     * @param httpLogOptions the httpLogOptions value.
     * @return the ContainerRepositoryClientBuilder.
     */
    public ContainerRepositoryClientBuilder httpLogOptions(HttpLogOptions httpLogOptions) {
        this.httpLogOptions = Objects.requireNonNull(httpLogOptions, "'logOptions' cannot be null.");
        return this;
    }

    /**
     * Sets The retry policy that will attempt to retry failed requests, if applicable.
     *
     * @param retryPolicy the retryPolicy value.
     * @return the ContainerRepositoryClientBuilder.
     */
    public ContainerRepositoryClientBuilder retryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /**
     * Adds a custom Http httpPipeline policy.
     *
     * @param customPolicy The custom Http httpPipeline policy to add.
     * @return the ContainerRepositoryClientBuilder.
     */
    public ContainerRepositoryClientBuilder addPolicy(HttpPipelinePolicy customPolicy) {
        Objects.requireNonNull(customPolicy, "'pipelinePolicy' cannot be null.");

        if (customPolicy.getPipelinePosition() == HttpPipelinePosition.PER_CALL) {
            perCallPolicies.add(customPolicy);
        } else {
            perRetryPolicies.add(customPolicy);
        }

        return this;
    }

    /**
     * Builds an instance of ContainerRegistryImpl with the provided parameters.
     *
     * @return an instance of ContainerRegistryImpl.
     */
    public ContainerRepositoryAsyncClient buildAsyncClient() {
        if (serializerAdapter == null) {
            this.serializerAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        }

        // Service version
        ContainerRegistryServiceVersion serviceVersion = (version != null)
            ? version
            : ContainerRegistryServiceVersion.getLatest();

        if (httpPipeline == null) {
            this.httpPipeline = createHttpPipeline();
        }

        ContainerRepositoryAsyncClient client = new ContainerRepositoryAsyncClient(repository, httpPipeline, serializerAdapter, endpoint, serviceVersion.getVersion());
        return client;
    }

    private HttpPipeline createHttpPipeline() {
        Configuration buildConfiguration =
            (configuration == null) ? Configuration.getGlobalConfiguration() : configuration;
        if (httpLogOptions == null) {
            httpLogOptions = new HttpLogOptions();
        }
        List<HttpPipelinePolicy> policies = new ArrayList<>();

        policies.add(
            new UserAgentPolicy(CoreUtils.getApplicationId(clientOptions, httpLogOptions), CLIENT_NAME, CLIENT_VERSION, buildConfiguration));
        policies.add(new RequestIdPolicy());

        List<HttpHeader> httpHeaderList = new ArrayList<>();
        if (clientOptions != null) {
            clientOptions.getHeaders().forEach(header ->
                httpHeaderList.add(new HttpHeader(header.getName(), header.getValue())));
        }
        policies.add(new AddHeadersPolicy(new HttpHeaders(httpHeaderList)));

        policies.addAll(perCallPolicies);
        HttpPolicyProviders.addBeforeRetryPolicies(policies);


        policies.add(retryPolicy == null ? new RetryPolicy() : retryPolicy);
        policies.add(new CookiePolicy());
        policies.add(new AddDatePolicy());

        policies.addAll(this.perRetryPolicies);
        HttpPolicyProviders.addAfterRetryPolicies(policies);

        policies.add(new HttpLoggingPolicy(httpLogOptions));

        if (credential != null) {
            policies.add(new ContainerRegistryCredentialsPolicy(
                credential,
                endpoint,
                new HttpPipelineBuilder()
                    .policies(policies.toArray(new HttpPipelinePolicy[0]))
                    .httpClient(httpClient)
                    .build(),
                serializerAdapter
            ));
        }

        HttpPipeline httpPipeline =
            new HttpPipelineBuilder()
                .policies(policies.toArray(new HttpPipelinePolicy[0]))
                .httpClient(httpClient)
                .build();

        return httpPipeline;
    }

    /**
     * Builds an instance of ContainerRegistryClient sync client.
     *
     * @return an instance of ContainerRegistryClient.
     */
    public ContainerRepositoryClient buildClient() {
        return new ContainerRepositoryClient(buildAsyncClient());
    }
}
