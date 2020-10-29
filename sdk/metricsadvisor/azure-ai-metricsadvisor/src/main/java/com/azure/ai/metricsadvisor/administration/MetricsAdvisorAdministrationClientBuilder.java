// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.metricsadvisor.administration;

import com.azure.ai.metricsadvisor.implementation.AzureCognitiveServiceMetricsAdvisorRestAPIOpenAPIV2Impl;
import com.azure.ai.metricsadvisor.implementation.AzureCognitiveServiceMetricsAdvisorRestAPIOpenAPIV2ImplBuilder;
import com.azure.ai.metricsadvisor.models.MetricsAdvisorKeyCredential;
import com.azure.ai.metricsadvisor.models.MetricsAdvisorServiceVersion;
import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.ContentType;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.AddHeadersPolicy;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * This class provides a fluent builder API to help instantiation of
 * {@link MetricsAdvisorAdministrationClient MetricsAdvisorAdministrationClients}
 * and {@link MetricsAdvisorAdministrationAsyncClient MetricsAdvisorAdministrationAsyncClient},
 * call {@link #buildClient()} buildClient} and {@link #buildAsyncClient() buildAsyncClient} respectively to
 * construct an instance of the desired client.
 *
 * <p>
 * The client needs the service endpoint of the Azure Metrics Advisor to access the resource service.
 * {@link #credential(MetricsAdvisorKeyCredential)} gives the builder access to credential.
 * </p>
 *
 * <p><strong>Instantiating an asynchronous Metrics Advisor Client</strong></p>
 *
 * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationAsyncClient.instantiation}
 *
 * <p><strong>Instantiating a synchronous Metrics Advisor Client</strong></p>
 *
 * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationClient.instantiation}
 *
 * <p>
 * Another way to construct the client is using a {@link HttpPipeline}. The pipeline gives the client an
 * authenticated way to communicate with the service. Set the pipeline with {@link #pipeline(HttpPipeline) this} and
 * set the service endpoint with {@link #endpoint(String) this}. Using a
 * pipeline requires additional setup but allows for finer control on how the {@link MetricsAdvisorAdministrationClient}
 * and {@link MetricsAdvisorAdministrationAsyncClient} is built.
 * </p>
 *
 * {@codesnippet com.azure.ai.metricsadvisor.administration.MetricsAdvisorAdministrationClient.pipeline.instantiation}
 *
 * @see MetricsAdvisorAdministrationAsyncClient
 * @see MetricsAdvisorAdministrationClient
 */
@ServiceClientBuilder(serviceClients = {MetricsAdvisorAdministrationAsyncClient.class,
    MetricsAdvisorAdministrationClient.class})
public final class MetricsAdvisorAdministrationClientBuilder {

    private static final String ECHO_REQUEST_ID_HEADER = "x-ms-return-client-request-id";
    private static final String CONTENT_TYPE_HEADER_VALUE = ContentType.APPLICATION_JSON;
    private static final String ACCEPT_HEADER = "Accept";
    private static final String METRICSADVISOR_PROPERTIES = "azure-ai-metricsadvisor.properties";
    private static final String NAME = "name";
    private static final String VERSION = "version";
    private static final RetryPolicy DEFAULT_RETRY_POLICY = new RetryPolicy("retry-after-ms",
        ChronoUnit.MILLIS);
    private static final String DEFAULT_SCOPE = "https://cognitiveservices.azure.com/.default";

    private final ClientLogger logger = new ClientLogger(MetricsAdvisorAdministrationClientBuilder.class);
    private final List<HttpPipelinePolicy> policies;
    private final HttpHeaders headers;
    private final String clientName;
    private final String clientVersion;

    private String endpoint;
    private MetricsAdvisorKeyCredential credential;
    private HttpClient httpClient;
    private HttpLogOptions httpLogOptions;
    private HttpPipeline httpPipeline;
    private Configuration configuration;
    private RetryPolicy retryPolicy;
    private MetricsAdvisorServiceVersion version;

    static final String OCP_APIM_SUBSCRIPTION_KEY = "Ocp-Apim-Subscription-Key";
    static final String API_KEY = "x-api-key";

    /**
     * The constructor with defaults.
     */
    public MetricsAdvisorAdministrationClientBuilder() {
        policies = new ArrayList<>();
        httpLogOptions = new HttpLogOptions();

        Map<String, String> properties = CoreUtils.getProperties(METRICSADVISOR_PROPERTIES);
        clientName = properties.getOrDefault(NAME, "UnknownName");
        clientVersion = properties.getOrDefault(VERSION, "UnknownVersion");

        headers = new HttpHeaders()
            .put(ECHO_REQUEST_ID_HEADER, "true")
            .put(ACCEPT_HEADER, CONTENT_TYPE_HEADER_VALUE);
    }

    /**
     * Creates a {@link MetricsAdvisorAdministrationClient} based on options set in the builder. Every time
     * {@code buildClient()} is called a new instance of {@link MetricsAdvisorAdministrationClient} is created.
     *
     * <p>
     * If {@link #pipeline(HttpPipeline) pipeline} is set, then the {@code pipeline} and
     * {@link #endpoint(String) endpoint} are used to create the {@link MetricsAdvisorAdministrationClient client}.
     * All other builder settings are ignored.
     * </p>
     *
     * @return A MetricsAdvisorAdministrationClient with the options set from the builder.
     * @throws NullPointerException if {@link #endpoint(String) endpoint} or
     * {@link #credential(MetricsAdvisorKeyCredential)} has not been set.
     * @throws IllegalArgumentException if {@link #endpoint(String) endpoint} cannot be parsed into a valid URL.
     */
    public MetricsAdvisorAdministrationClient buildClient() {
        return new MetricsAdvisorAdministrationClient(buildAsyncClient());
    }

    /**
     * Creates a {@link MetricsAdvisorAdministrationAsyncClient} based on options set in the builder. Every time
     * {@code buildAsyncClient()} is called a new instance of {@link MetricsAdvisorAdministrationAsyncClient} is
     * created.
     *
     * <p>
     * If {@link #pipeline(HttpPipeline) pipeline} is set, then the {@code pipeline} and
     * {@link #endpoint(String) endpoint} are used to create the {@link MetricsAdvisorAdministrationClient client}.
     * All other builder settings are ignored.
     * </p>
     *
     * @return A MetricsAdvisorAdministrationAsyncClient with the options set from the builder.
     * @throws NullPointerException if {@link #endpoint(String) endpoint} or
     * {@link #credential(MetricsAdvisorKeyCredential)} has not been set.
     * @throws IllegalArgumentException if {@link #endpoint(String) endpoint} cannot be parsed into a valid URL.
     */
    public MetricsAdvisorAdministrationAsyncClient buildAsyncClient() {
        // Endpoint cannot be null, which is required in request authentication
        Objects.requireNonNull(endpoint, "'Endpoint' is required and can not be null.");

        // Global Env configuration store
        final Configuration buildConfiguration = (configuration == null)
            ? Configuration.getGlobalConfiguration().clone() : configuration;

        // Service Version
        final MetricsAdvisorServiceVersion serviceVersion =
            version != null ? version : MetricsAdvisorServiceVersion.getLatest();

        HttpPipeline pipeline = httpPipeline;
        // Create a default Pipeline if it is not given
        if (pipeline == null) {
            pipeline = getDefaultHttpPipeline(buildConfiguration);
        }
        final AzureCognitiveServiceMetricsAdvisorRestAPIOpenAPIV2Impl advisorRestAPIOpenAPIV2 =
            new AzureCognitiveServiceMetricsAdvisorRestAPIOpenAPIV2ImplBuilder()
                .endpoint(endpoint)
                .pipeline(pipeline)
                .buildClient();

        return new MetricsAdvisorAdministrationAsyncClient(advisorRestAPIOpenAPIV2, serviceVersion);
    }

    private HttpPipeline getDefaultHttpPipeline(Configuration buildConfiguration) {
        // Closest to API goes first, closest to wire goes last.
        final List<HttpPipelinePolicy> policies = new ArrayList<>();

        policies.add(new UserAgentPolicy(httpLogOptions.getApplicationId(), clientName, clientVersion,
            buildConfiguration));
        policies.add(new RequestIdPolicy());
        policies.add(new AddHeadersPolicy(headers));

        HttpPolicyProviders.addBeforeRetryPolicies(policies);
        policies.add(retryPolicy == null ? DEFAULT_RETRY_POLICY : retryPolicy);
        policies.add(new AddDatePolicy());

        // Authentications
        if (credential.getSubscriptionKey() != null || credential.getApiKey() != null) {
            headers.put(OCP_APIM_SUBSCRIPTION_KEY, credential.getSubscriptionKey());
            headers.put(API_KEY, credential.getApiKey());
        } else {
            // Throw exception that credential cannot be null
            throw logger.logExceptionAsError(
                new IllegalArgumentException("Missing credential information while building a client."));
        }

        policies.addAll(this.policies);
        HttpPolicyProviders.addAfterRetryPolicies(policies);

        return new HttpPipelineBuilder()
            .policies(policies.toArray(new HttpPipelinePolicy[0]))
            .httpClient(httpClient)
            .build();
    }

    /**
     * Sets the service endpoint for the Azure Metrics Advisor instance.
     *
     * @param endpoint The URL of the Azure Metrics Advisor instance service requests to and receive responses from.
     *
     * @return The updated MetricsAdvisorAdministrationClientBuilder object.
     * @throws NullPointerException if {@code endpoint} is null
     * @throws IllegalArgumentException if {@code endpoint} cannot be parsed into a valid URL.
     */
    public MetricsAdvisorAdministrationClientBuilder endpoint(String endpoint) {
        Objects.requireNonNull(endpoint, "'endpoint' cannot be null.");

        try {
            new URL(endpoint);
        } catch (MalformedURLException ex) {
            throw logger.logExceptionAsWarning(new IllegalArgumentException("'endpoint' must be a valid URL.", ex));
        }

        if (endpoint.endsWith("/")) {
            this.endpoint = endpoint.substring(0, endpoint.length() - 1);
        } else {
            this.endpoint = endpoint;
        }

        return this;
    }

    /**
     * Sets the {@link MetricsAdvisorKeyCredential} to use when authenticating HTTP requests for this
     * MetricsAdvisorAdministrationClientBuilder.
     *
     * @param metricsAdvisorKeyCredential {@link MetricsAdvisorKeyCredential} API key credential
     *
     * @return The updated MetricsAdvisorAdministrationClientBuilder object.
     * @throws NullPointerException If {@code metricsAdvisorKeyCredential} is null.
     */
    public MetricsAdvisorAdministrationClientBuilder credential(
        MetricsAdvisorKeyCredential metricsAdvisorKeyCredential) {
        this.credential = Objects.requireNonNull(metricsAdvisorKeyCredential,
            "'metricsAdvisorKeyCredential' cannot be null.");
        return this;
    }

    /**
     * Sets the logging configuration for HTTP requests and responses.
     *
     * <p>If {@code logOptions} isn't provided, the default options will use {@link HttpLogDetailLevel#NONE}
     * which will prevent logging.</p>
     *
     * @param logOptions The logging configuration to use when sending and receiving HTTP requests/responses.
     *
     * @return The updated MetricsAdvisorAdministrationClientBuilder object.
     */
    public MetricsAdvisorAdministrationClientBuilder httpLogOptions(HttpLogOptions logOptions) {
        this.httpLogOptions = logOptions;
        return this;
    }

    /**
     * Adds a policy to the set of existing policies that are executed after required policies.
     *
     * @param policy The retry policy for service requests.
     *
     * @return The updated MetricsAdvisorAdministrationClientBuilder object.
     * @throws NullPointerException If {@code policy} is null.
     */
    public MetricsAdvisorAdministrationClientBuilder addPolicy(HttpPipelinePolicy policy) {
        policies.add(Objects.requireNonNull(policy, "'policy' cannot be null."));
        return this;
    }

    /**
     * Sets the HTTP client to use for sending and receiving requests to and from the service.
     *
     * @param client The HTTP client to use for requests.
     *
     * @return The updated MetricsAdvisorAdministrationClientBuilder object.
     */
    public MetricsAdvisorAdministrationClientBuilder httpClient(HttpClient client) {
        if (this.httpClient != null && client == null) {
            logger.info("HttpClient is being set to 'null' when it was previously configured.");
        }

        this.httpClient = client;
        return this;
    }

    /**
     * Sets the HTTP pipeline to use for the service client.
     * <p>
     * If {@code pipeline} is set, all other settings are ignored, aside from
     * {@link MetricsAdvisorAdministrationClientBuilder#endpoint(String) endpoint} to build
     * {@link MetricsAdvisorAdministrationAsyncClient} or {@link MetricsAdvisorAdministrationClient}.
     *
     * @param httpPipeline The HTTP pipeline to use for sending service requests and receiving responses.
     *
     * @return The updated MetricsAdvisorAdministrationClientBuilder object.
     */
    public MetricsAdvisorAdministrationClientBuilder pipeline(HttpPipeline httpPipeline) {
        if (this.httpPipeline != null && httpPipeline == null) {
            logger.info("HttpPipeline is being set to 'null' when it was previously configured.");
        }

        this.httpPipeline = httpPipeline;
        return this;
    }

    /**
     * Sets the configuration store that is used during construction of the service client.
     * <p>
     * The default configuration store is a clone of the {@link Configuration#getGlobalConfiguration() global
     * configuration store}, use {@link Configuration#NONE} to bypass using configuration settings during construction.
     *
     * @param configuration The configuration store used to.
     *
     * @return The updated MetricsAdvisorAdministrationClientBuilder object.
     */
    public MetricsAdvisorAdministrationClientBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * Sets the {@link RetryPolicy#RetryPolicy()} that is used when each request is sent.
     * <p>
     * The default retry policy will be used if not provided
     * {@link MetricsAdvisorAdministrationClientBuilder#buildAsyncClient()}
     * to build {@link MetricsAdvisorAdministrationAsyncClient} or {@link MetricsAdvisorAdministrationClient}.
     *
     * @param retryPolicy user's retry policy applied to each request.
     *
     * @return The updated MetricsAdvisorAdministrationClientBuilder object.
     */
    public MetricsAdvisorAdministrationClientBuilder retryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /**
     * Sets the {@link MetricsAdvisorServiceVersion} that is used when making API requests.
     * <p>
     * If a service version is not provided, the service version that will be used will be the latest known service
     * version based on the version of the client library being used. If no service version is specified, updating to a
     * newer version the client library will have the result of potentially moving to a newer service version.
     *
     * @param version {@link MetricsAdvisorServiceVersion} of the service to be used when making requests.
     *
     * @return The updated MetricsAdvisorAdministrationClientBuilder object.
     */
    public MetricsAdvisorAdministrationClientBuilder serviceVersion(MetricsAdvisorServiceVersion version) {
        this.version = version;
        return this;
    }
}
