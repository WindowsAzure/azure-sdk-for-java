// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.identity;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.ProxyOptions;
import com.azure.identity.implementation.IdentityClientOptions;

import java.time.Duration;
import java.util.function.Function;

/**
 * The base class for all the credential builders.
 * @param <T> the type of the credential builder
 */
public abstract class CredentialBuilderBase<T extends CredentialBuilderBase<T>> {
    IdentityClientOptions identityClientOptions;

    CredentialBuilderBase() {
        this.identityClientOptions = new IdentityClientOptions();
    }

    /**
     * Specifies the max number of retries when an authentication request fails.
     *
     * @param maxRetry the number of retries
     * @return itself
     */
    @SuppressWarnings("unchecked")
    public T maxRetry(int maxRetry) {
        this.identityClientOptions.setMaxRetry(maxRetry);
        return (T) this;
    }

    /**
     * Specifies a Function to calculate seconds of timeout on every retried request.
     *
     * @param retryTimeout the Function that returns a timeout in seconds given the number of retry
     * @return itself
     */
    @SuppressWarnings("unchecked")
    public T retryTimeout(Function<Duration, Duration> retryTimeout) {
        this.identityClientOptions.setRetryTimeout(retryTimeout);
        return (T) this;
    }

    /**
     * Specifies he options for proxy configuration.
     *
     * @param proxyOptions the options for proxy configuration
     * @return itself
     */
    @SuppressWarnings("unchecked")
    public T proxyOptions(ProxyOptions proxyOptions) {
        this.identityClientOptions.setProxyOptions(proxyOptions);
        return (T) this;
    }

    /**
     * Specifies the HttpPipeline to send all requests. This setting overrides the others.
     *
     * @param httpPipeline the HttpPipeline to send all requests
     * @return itself
     */
    @SuppressWarnings("unchecked")
    public T httpPipeline(HttpPipeline httpPipeline) {
        this.identityClientOptions.setHttpPipeline(httpPipeline);
        return (T) this;
    }

    /**
     * Sets how long before the actual token expiry to refresh the token. The
     * token will be considered expired at and after the time of (actual
     * expiry - token refresh offset). The default offset is 2 minutes.
     *
     * This is useful when network is congested and a request containing the
     * token takes longer than normal to get to the server.
     *
     * @param tokenRefreshOffset the duration before the actual expiry of a token to refresh it
     */
    @SuppressWarnings("unchecked")
    public T tokenRefreshOffset(Duration tokenRefreshOffset) {
        this.identityClientOptions.setTokenRefreshOffset(tokenRefreshOffset);
        return (T) this;
    }
}
