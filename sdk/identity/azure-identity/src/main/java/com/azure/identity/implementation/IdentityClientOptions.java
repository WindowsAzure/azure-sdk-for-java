// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.identity.implementation;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.ProxyOptions;

import java.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;

/**
 * Options to configure the IdentityClient.
 */
public final class IdentityClientOptions {
    private static final String DEFAULT_AUTHORITY_HOST = "https://login.microsoftonline.com/";
    private static final int MAX_RETRY_DEFAULT_LIMIT = 3;

    private String authorityHost;
    private int maxRetry;
    private Function<Duration, Duration> retryTimeout;
    private ProxyOptions proxyOptions;
    private HttpPipeline httpPipeline;
    private ExecutorService executorService;

    /**
     * Creates an instance of IdentityClientOptions with default settings.
     */
    public IdentityClientOptions() {
        authorityHost = DEFAULT_AUTHORITY_HOST;
        maxRetry = MAX_RETRY_DEFAULT_LIMIT;
        retryTimeout = i -> Duration.ofSeconds((long) Math.pow(2, i.getSeconds() - 1));
    }

    /**
     * @return the Azure Active Directory endpoint to acquire tokens.
     */
    public String getAuthorityHost() {
        return authorityHost;
    }

    /**
     * Specifies the Azure Active Directory endpoint to acquire tokens.
     * @param authorityHost the Azure Active Directory endpoint
     * @return IdentityClientOptions
     */
    public IdentityClientOptions setAuthorityHost(String authorityHost) {
        this.authorityHost = authorityHost;
        return this;
    }

    /**
     * @return the max number of retries when an authentication request fails.
     */
    public int getMaxRetry() {
        return maxRetry;
    }

    /**
     * Specifies the max number of retries when an authentication request fails.
     * @param maxRetry the number of retries
     * @return IdentityClientOptions
     */
    public IdentityClientOptions setMaxRetry(int maxRetry) {
        this.maxRetry = maxRetry;
        return this;
    }

    /**
     * @return a Function to calculate seconds of timeout on every retried request.
     */
    public Function<Duration, Duration> getRetryTimeout() {
        return retryTimeout;
    }

    /**
     * Specifies a Function to calculate seconds of timeout on every retried request.
     * @param retryTimeout the Function that returns a timeout in seconds given the number of retry
     * @return IdentityClientOptions
     */
    public IdentityClientOptions setRetryTimeout(Function<Duration, Duration> retryTimeout) {
        this.retryTimeout = retryTimeout;
        return this;
    }

    /**
     * @return the options for proxy configuration.
     */
    public ProxyOptions getProxyOptions() {
        return proxyOptions;
    }

    /**
     * Specifies the options for proxy configuration.
     * @param proxyOptions the options for proxy configuration
     * @return IdentityClientOptions
     */
    public IdentityClientOptions setProxyOptions(ProxyOptions proxyOptions) {
        this.proxyOptions = proxyOptions;
        return this;
    }

    /**
     * @return the HttpPipeline to send all requests
     */
    public HttpPipeline getHttpPipeline() {
        return httpPipeline;
    }

    /**
     * Specifies the HttpPipeline to send all requests. This setting overrides the others.
     * @param httpPipeline the HttpPipeline to send all requests
     * @return IdentityClientOptions
     */
    public IdentityClientOptions setHttpPipeline(HttpPipeline httpPipeline) {
        this.httpPipeline = httpPipeline;
        return this;
    }


    /**
     * Specifies the executor service on which to the authentication request will run.
     *
     * @param executorService the executor service to run authentication requests on.
     * @return IdentityClientOptions
     */
    public IdentityClientOptions setExecutorService(ExecutorService executorService) {
        this.executorService = executorService;
        return this;
    }

    /**
     * @return the ExecutorService to run authentication requests on.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }
}
