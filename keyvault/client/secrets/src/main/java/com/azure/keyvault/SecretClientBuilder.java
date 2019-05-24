// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.keyvault;

import com.azure.core.configuration.Configuration;
import com.azure.core.configuration.ConfigurationManager;
import com.azure.core.credentials.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;

/**
 * This class provides a fluent builder API to help aid the configuration and instantiation of the {@link SecretClient secret client},
 * calling {@link SecretClientBuilder#build() build} constructs an instance of the client.
 *
 * <p> The minimal configuration options required by {@link SecretClientBuilder secretClientBuilder} to build {@link SecretClient}
 * are {@link String endpoint} and {@link TokenCredential credentials}. </p>
 * <pre>
 * SecretClient.builder()
 *   .endpoint("https://myvault.vault.azure.net/")
 *   .credentials(keyVaultCredentials)
 *   .build();
 * </pre>
 *
 * <p>The {@link HttpLogDetailLevel log detail level}, multiple custom {@link HttpLoggingPolicy policies} and custom
 * {@link HttpClient http client} can be optionally configured in the {@link SecretClientBuilder}.</p>
 * <pre>
 * SecretClient.builder()
 *   .endpoint("https://myvault.vault.azure.net/")
 *   .credentials(keyVaultCredentials)
 *   .httpLogDetailLevel(HttpLogDetailLevel.BODY_AND_HEADERS)
 *   .addPolicy(customPolicyOne)
 *   .addPolicy(customPolicyTwo)
 *   .httpClient(client)
 *   .build();
 * </pre>
 *
 * <p>Alternatively, custom {@link HttpPipeline http pipeline} with custom {@link HttpPipelinePolicy} policies and {@link String endpoint}
 * can be specified. It provides finer control over the construction of {@link SecretClient client}</p>
 * <pre>
 * SecretClient.builder()
 *   .pipeline(new HttpPipeline(customPoliciesList))
 *   .endpoint("https://myvault.vault.azure.net/")
 *   .build()
 * </pre>
 *
 * @see SecretClient
 * */
public final class SecretClientBuilder {
    private SecretAsyncClientBuilder builder;

    SecretClientBuilder() {
        builder = new SecretAsyncClientBuilder();
    }

    /**
     * Creates a {@link SecretClient} based on options set in the builder.
     * Every time {@code build()} is called, a new instance of {@link SecretClient} is created.
     *
     * <p>If {@link SecretClientBuilder#pipeline(HttpPipeline) pipeline} is set, then the {@code pipeline} and
     * {@link SecretClientBuilder#endpoint(String) serviceEndpoint} are used to create the
     * {@link SecretClientBuilder client}. All other builder settings are ignored. If {@code pipeline} is not set,
     * then {@link SecretClientBuilder#credentials(TokenCredential) key vault credentials and
     * {@link SecretClientBuilder#endpoint(String)} key vault endpoint are required to build the {@link SecretClient client}.}</p>
     *
     * @return A SecretClient with the options set from the builder.
     * @throws IllegalStateException If {@link SecretClientBuilder#credentials(TokenCredential)} or
     * {@link SecretClientBuilder#endpoint(String)} have not been set.
     */
    public SecretClient build() {
        return new SecretClient(builder.build());
    }

    /**
     * Sets the vault endpoint url to send HTTP requests to.
     *
     * @param endpoint The vault endpoint url is used as destination on Azure to send requests to.
     * @return the updated Builder object.
     * @throws IllegalStateException if {@code endpoint} is null or it cannot be parsed into a valid URL.
     */
    public SecretClientBuilder endpoint(String endpoint) {
        builder.endpoint(endpoint);
        return this;
    }

    /**
     * Sets the credentials to use when authenticating HTTP requests.
     *
     * @param credentials The credentials to use for authenticating HTTP requests.
     * @return the updated Builder object.
     * @throws NullPointerException if {@code credentials} is {@code null}.
     */
    public SecretClientBuilder credentials(TokenCredential credentials) {
        builder.credentials(credentials);
        return this;
    }

    /**
     * Sets the logging level for HTTP requests and responses.
     *
     * <p>logLevel is optional. If not provided, default value of {@link HttpLogDetailLevel#NONE} is set.</p>
     *
     * @param logLevel The amount of logging output when sending and receiving HTTP requests/responses.
     * @return the updated Builder object.
     * @throws NullPointerException if {@code logLevel} is {@code null}.
     */
    public SecretClientBuilder httpLogDetailLevel(HttpLogDetailLevel logLevel) {
        builder.httpLogDetailLevel(logLevel);
        return this;
    }

    /**
     * Adds a policy to the set of existing policies that are executed after
     * {@link SecretClient} required policies.
     *
     * @param policy The {@link HttpPipelinePolicy policy} to be added.
     * @return the updated Builder object.
     * @throws NullPointerException if {@code policy} is {@code null}.
     */
    public SecretClientBuilder addPolicy(HttpPipelinePolicy policy) {
        builder.addPolicy(policy);
        return this;
    }

    /**
     * Sets the HTTP client to use for sending and receiving requests to and from the service.
     *
     * @param client The HTTP client to use for requests.
     * @return the updated Builder object.
     * @throws NullPointerException If {@code client} is {@code null}.
     */
    public SecretClientBuilder httpClient(HttpClient client) {
        builder.httpClient(client);
        return this;
    }

    /**
     * Sets the HTTP pipeline to use for the service client.
     *
     * If {@code pipeline} is set, all other settings are ignored, aside from
     * {@link SecretClientBuilder#endpoint(String) endpoint} to build {@link SecretClient}.
     *
     * @param pipeline The HTTP pipeline to use for sending service requests and receiving responses.
     * @return the updated {@link SecretClientBuilder} object.
     */
    public SecretClientBuilder pipeline(HttpPipeline pipeline) {
        builder.pipeline(pipeline);
        return this;
    }

    /**
     * Sets the configuration store that is used during construction of the service client.
     *
     * The default configuration store is a clone of the {@link ConfigurationManager#getConfiguration() global
     * configuration store}, use {@link Configuration#NONE} to bypass using configuration settings during construction.
     *
     * @param configuration The configuration store used to
     * @return The updated SecretClientBuilder object.
     */
    public SecretClientBuilder configuration(Configuration configuration) {
        builder.configuration(configuration);
        return this;
    }
}
