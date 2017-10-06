/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.fluentcore.arm.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.resources.fluentcore.arm.AzureConfigurable;
import com.microsoft.azure.management.resources.fluentcore.utils.ResourceManagerThrottlingPolicy;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.LogLevel;
import com.microsoft.rest.RestClient;
import com.microsoft.rest.policy.RequestPolicy;

import java.net.Proxy;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/**
 * The implementation for {@link AzureConfigurable<T>} and the base class for
 * configurable implementations.
 *
 * @param <T> the type of the configurable interface
 */
public class AzureConfigurableImpl<T extends AzureConfigurable<T>>
        implements AzureConfigurable<T> {
    protected RestClient.Builder restClientBuilder;

    protected AzureConfigurableImpl() {
        this.restClientBuilder = new RestClient.Builder()
            .withSerializerAdapter(new AzureJacksonAdapter());
    }

    @SuppressWarnings("unchecked")
    @Override
    public T withLogLevel(LogLevel level) {
        this.restClientBuilder = this.restClientBuilder.withLogLevel(level);
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T withInterceptor(RequestPolicy.Factory factory) {
        this.restClientBuilder = this.restClientBuilder.addCustomPolicy(factory);
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T withUserAgent(String userAgent) {
        this.restClientBuilder = this.restClientBuilder.withUserAgent(userAgent);
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T withReadTimeout(long timeout, TimeUnit unit) {
        this.restClientBuilder = restClientBuilder.withReadTimeout(timeout, unit);
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T withConnectionTimeout(long timeout, TimeUnit unit) {
        this.restClientBuilder = restClientBuilder.withConnectionTimeout(timeout, unit);
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T withMaxIdleConnections(int maxIdleConnections) {
        this.restClientBuilder = restClientBuilder.withMaxIdleConnections(maxIdleConnections);
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T withCallbackExecutor(Executor executor) {
        // FIXME
//        this.restClientBuilder = restClientBuilder.withCallbackExecutor(executor);
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T withProxy(Proxy proxy) {
        this.restClientBuilder = restClientBuilder.withProxy(proxy);
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T withProxyAuthenticator(Object proxyAuthenticator) {
        // FIXME
//        this.restClientBuilder = restClientBuilder.withProxyAuthenticator(proxyAuthenticator);
        return (T) this;
    }

    protected RestClient buildRestClient(AzureTokenCredentials credentials, AzureEnvironment.Endpoint endpoint) {
        RestClient client =  restClientBuilder
                .withBaseUrl(credentials.environment(), endpoint)
                .withCredentials(credentials)
                // FIXME
//                .withInterceptor(new ProviderRegistrationInterceptor(credentials))
                .addCustomPolicy(new ResourceManagerThrottlingPolicy.Factory())
                .build();
        if (client.proxy() != null) {
            credentials.withProxy(client.proxy());
        }
        return client;
    }

    protected RestClient buildRestClient(AzureTokenCredentials credentials) {
        return buildRestClient(credentials, AzureEnvironment.Endpoint.RESOURCE_MANAGER);
    }
}
