// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.management.resources.fluentcore.arm.implementation;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.util.Configuration;
import com.azure.management.resources.fluentcore.arm.AzureConfigurable;
import com.azure.management.resources.fluentcore.utils.HttpPipelineProvider;

import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * The implementation for {@link AzureConfigurable} and the base class for
 * configurable implementations.
 *
 * @param <T> the type of the configurable interface
 */
public class AzureConfigurableImpl<T extends AzureConfigurable<T>>
        implements AzureConfigurable<T> {
    private HttpClient httpClient;
    private HttpLogOptions httpLogOptions;
    private HttpLogDetailLevel httpLogDetailLevel;
    private List<HttpPipelinePolicy> policies;
    private List<String> scopes;
    private RetryPolicy retryPolicy;
    private Configuration configuration;
    private AzureEnvironment environment;

    protected AzureConfigurableImpl() {
        policies = new ArrayList<>();
        scopes = new ArrayList<>();
        retryPolicy = new RetryPolicy();
        httpLogOptions = new HttpLogOptions().setLogLevel(HttpLogDetailLevel.NONE);
        environment = AzureEnvironment.AZURE;
    }

    @Override
    public T withLogOptions(HttpLogOptions httpLogOptions) {
        Objects.requireNonNull(httpLogOptions);
        this.httpLogOptions = httpLogOptions;
        return (T) this;
    }

    @Override
    public T withLogLevel(HttpLogDetailLevel logLevel) {
        Objects.requireNonNull(logLevel);
        this.httpLogOptions = httpLogOptions.setLogLevel(logLevel);
        return (T) this;
    }

    @Override
    public T withPolicy(HttpPipelinePolicy policy) {
        Objects.requireNonNull(policy);
        policies.add(policy);
        return (T) this;
    }

    @Override
    public T withAuxiliaryCredentials(TokenCredential... tokens) {
        return null;
    }

//    @Override
//    public T withAuxiliaryCredentials(AzureTokenCredentials... tokens) {
//        if (tokens != null) {
//            if (tokens.length > 3) {
//                throw new IllegalArgumentException("Only can hold up to three auxiliary tokens.");
//            }
//            AuxiliaryCredentialsInterceptor interceptor = new AuxiliaryCredentialsInterceptor(tokens);
//            this.restClientBuilder = this.restClientBuilder.withInterceptor(interceptor);
//        }
//        return (T) this;
//    }

    @Override
    public T withUserAgent(String userAgent) {
        // TODO: pending
        return (T) this;
    }

    @Override
    public T withReadTimeout(long timeout, TimeUnit unit) {
        return null;
    }

    @Override
    public T withConnectionTimeout(long timeout, TimeUnit unit) {
        return null;
    }

    @Override
    public T useHttpClientThreadPool(boolean useHttpClientThreadPool) {
        return null;
    }

    @Override
    public T withProxy(Proxy proxy) {
        return null;
    }

    @Override
    public T withScope(String scope) {
        Objects.requireNonNull(scope);
        this.scopes.add(scope);
        return (T) this;
    }

    @Override
    public T withHttpClient(HttpClient httpClient) {
        Objects.requireNonNull(httpClient);
        this.httpClient = httpClient;
        return (T) this;
    }

    @Override
    public T withConfiguration(Configuration configuration) {
        Objects.requireNonNull(configuration);
        this.configuration = configuration;
        return (T) this;
    }

    @Override
    public T withEnvironment(AzureEnvironment environment) {
        Objects.requireNonNull(environment);
        this.environment = environment;
        return (T) this;
    }

    protected HttpPipeline buildHttpPipeline(TokenCredential credential) {
        Objects.requireNonNull(credential);
        return HttpPipelineProvider.buildHttpPipeline(this.policies,
            credential,
            this.scopes,
            this.httpLogOptions,
            this.configuration,
            this.retryPolicy,
            this.httpClient,
            this.environment);
    }
}
